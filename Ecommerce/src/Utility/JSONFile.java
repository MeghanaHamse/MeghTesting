package Utility;


	import java.io.File;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONFile {

    public static String getData(String key) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        JsonNode data = mapper.readTree(
                new File("C:\\Users\\MEGHANR\\prodg\\Prodg\\s3\\s4\\s5\\Ecommerce\\src\\TestData\\testdata.json"));

        return data.get(key).asText();
    }
}