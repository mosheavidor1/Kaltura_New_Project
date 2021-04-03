import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Register_Response_Print
{

    public static Object print_Response() {

        JSONParser jsonParser = new JSONParser();

        try {FileReader reader = new FileReader(Constans_Page.Register_Response_Json);


            Object obj = jsonParser.parse(reader);




            System.out.println("Post Register Response"+obj);
            return obj;




        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return true;
    }


    }
