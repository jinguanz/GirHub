import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.util.Iterator;

import net.sf.json.JSONSerializer;

import org.json.JSONArray;
import org.json.JSONObject;






public class JsonParse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Class clazz = new Class();
		// TODO Auto-generated method stub
		InputStream is = 
                JsonParsing.class.getResourceAsStream( "sample-json.txt");
        String jsonTxt = IOUtils.toString( is );
        
        JSONObject json = (JSONObject) JSONSerializer.toJSON( jsonTxt );        
        double coolness = json.getDouble( "coolness" );
        int altitude = json.getInt( "altitude" );
        JSONObject pilot = json.getJSONObject("pilot");
        String firstName = pilot.getString("firstName");
        String lastName = pilot.getString("lastName");
        
        System.out.println( "Coolness: " + coolness );
        System.out.println( "Altitude: " + altitude );
        System.out.println( "Pilot: " + lastName );
		

	}
	
	public void parseJSON(){
		String json="{\"j\":\"5\",\"0\":\"N\"}";
		JSONObject jObject = new JSONObject(json);
		//jObject
		
	}

}
