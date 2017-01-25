package patientRest;

import org.json.JSONArray;
import org.json.JSONObject;
import org.restlet.resource.ClientResource;

public class PatientClient {

    // http://hc.apache.org/
     public static void main(String[] args) {
           
             try {
            	// Post a new record
            	JSONObject json = new JSONObject();
        		json.put("lastname", "Doe");
        		json.put("firstname", "John");
        		json.put("uur interventie", 20);
        		json.put("geboorteDatum", "01/01/1990");
        		json.put("naamVerpleegkundige", "Dctr. Vanpuynbroek");
        		json.put("diagnose", "Schedelbreuk");
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
                System.out.println("In main : " + e.getMessage());
            }
        }
    }
