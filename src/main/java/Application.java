import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileReader;

public class Application {

    private static final ObjectMapper MAPPER = new ObjectMapper();

    public static void main(String[] args) throws Exception {
        Hero hero = MAPPER.readValue(
                new FileReader("Object.json"),
                new TypeReference<>(){});

        System.out.println(hero);
    }
}