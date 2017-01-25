package patientRest;

import org.json.JSONArray;
import org.json.JSONObject;
import org.restlet.resource.ClientResource;

public class PatientClient {


     
     
     // Methode aanmaken voor het registreren van patienten
     public void patientRegistreren(String voornaam,String achternaam, int UI,String geboorteDatum, String verpleegkundige,String diagnose){
    	
    	 try {
         	// Post a new record
         	JSONObject json = new JSONObject();
     		json.put("lastname", achternaam);
     		json.put("firstname", voornaam);
     		json.put("uur interventie", UI);
     		json.put("geboorteDatum", geboorteDatum);
     		json.put("naamVerpleegkundige", verpleegkundige);
     		json.put("diagnose", diagnose);
     		PatientResource.post(json.toString());
     		

         	
         	// Write the response entity on the console
         	PatientResource.get().write(System.out);
         	System.out.println();
         	// Process the resource
             JSONObject obj1 = new JSONObject(PatientResource.get(String.class));
             JSONArray array1 = obj1.getJSONArray("result");
            
             for(int i = 0; i < array1.length(); i++) {
                 JSONObject obj2 = array1.getJSONObject(i);
                 System.out.println(obj2.toString());
              }
         }
         catch (Exception e) {
             System.out.println("In main : " + e.getMessage() +"\nEr is een fout opgetreden bij het registreren van een patient!");
         }
    	 
     }

     public static void main(String[] args) {
    	 patientRegistreren("John","Doe", 20,"01/01/1990", "Docter Vanpuynbroek","Schedelfractuur");
    	 patientRegistreren("John","Doe", 20,"01/01/1990", "Docter Vanpuynbroek","Schedelfractuur");

        }
}

