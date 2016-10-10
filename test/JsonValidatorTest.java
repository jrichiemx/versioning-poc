import com.fasterxml.jackson.annotation.JsonValue;
import org.junit.Test;
import play.api.libs.json.JsValue;
import play.api.libs.json.Json;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertTrue;

/**
 * Created by jrichiemx on 10/10/16.
 */
public class JsonValidatorTest {

    @Test
    public void test_schema_file() throws IOException {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("shchema.json").getFile());
        JsValue json = Json.parse(classLoader.getResource("shchema.json").openStream());
        System.out.println(json.toString());

        assertTrue( true);

    }
}
