package studentplanner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author natha
 */
public class LoginController {
    private static final String LOGIN_FILE = "users.txt";
    
    public static boolean checkCredentials(String username, String password){
        try (BufferedReader br = new BufferedReader(new FileReader(LOGIN_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] lineSplit = line.split(";");
                String u = lineSplit[0];
                String p = lineSplit[1];
                if (username.equals(u)){
                    if (password.equals(p)){
                        return true;
                    }
                }
            }
            return false;
        }
        catch(IOException e){
            return false;
        }
    }  
}
