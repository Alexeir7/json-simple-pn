/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json_simple_pn;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author alexe
 */
public class Json_simple_pn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String sjason = "{ \"grupo\":\"json simple\", \"numeros\":[10,20,30,40,50], \"subobjeto\":{\"elemento1\": \"texto1\", \"elemento2\": \"texto2\" }}";
        JSONParser parser = new JSONParser();
        try {
            JSONObject job = (JSONObject) parser.parse(sjason);
            System.out.println(job.get("grupo"));
            
            JSONArray jarr = (JSONArray) job.get("numeros");
            
            JSONObject jon = (JSONObject) job.get("subobjeto");
            
            System.out.println(jarr.get(2));
            System.out.println(jon.get("elemento2"));
            
        } catch (ParseException ex) {
            Logger.getLogger(Json_simple_pn.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        

    }

}
