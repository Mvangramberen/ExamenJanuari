package patientRest;

import org.json.JSONObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

import org.json.JSONArray;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;


public class PatientResource extends ServerResource {

	
	// Get methode definieren om de lijst met personen terug te halen uit json bestanden
	@Get
	public String allPatients() {
				
		JSONObject json = new JSONObject();
		json.put("operation", "selectAll");
		JSONArray jsonArray = new JSONArray();
		
		json.put("result", jsonArray);

		return json.toString();
	}
	
	@Post("txt")
	public void newPatient(String json) {
		
		JSONObject newPatient = new JSONObject(json);
		String lastName = newPatient.getString("lastname");
		String firstName = newPatient.getString("firstname");
		String interventieDate = newPatient.getString("uur interventie");
		String geboorteDatum = newPatient.getString("geboorteDatum");
		String naamVerpleegkundige = newPatient.getString("naamVerpleegkundige");
		String diagnose = newPatient.getString("diagnose");

		// Nieuwe patient krijgt lastname, firstname, 
		newPatient.append("lastName",lastName);
		newPatient.append("firstName",firstName);
		newPatient.append("uur interventie",interventieDate);
		newPatient.append("geboorteDatum",geboorteDatum);
		newPatient.append("naamVerpleegkundige",naamVerpleegkundige);
		newPatient.append("diagnose",diagnose);
		
		
		  try {  

	            // Schrijven van de JSON file
	            File file=new File("JsonFile.json");  
	            file.createNewFile();  
	            
	            // Nieuwe filewriter aanmaken. 
	            FileWriter fileWriter = new FileWriter(file);  

	            // FileWriter gebruiken om waardes van nieuwe patient in json op te slaan. 
	            fileWriter.write(newPatient.getString("lastname"));  
	            fileWriter.write(newPatient.getString("firstname"));
	            fileWriter.write(newPatient.getString("uur interventie"));
	            fileWriter.write(newPatient.getString("geboorteDatum"));  
	            fileWriter.write(newPatient.getString("naamVerpleegkundige"));
	            fileWriter.write(newPatient.getString("diagnose"));
	            fileWriter.flush();  
	            fileWriter.close();  

	        } catch (IOException e) {  
	            e.printStackTrace();  
	        }  
	}
}