package patientRest;

import java.util.ArrayList;

import org.json.JSONObject;
import org.json.JSONArray;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;


public class PatientResource extends ServerResource {

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
		int grade = newPatient.getInt("grade");

	}
}