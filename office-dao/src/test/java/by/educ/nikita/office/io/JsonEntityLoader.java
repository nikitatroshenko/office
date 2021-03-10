package by.educ.nikita.office.io;

import com.google.gson.Gson;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class JsonEntityLoader {

    public static <T> T loadEntity(String path, Class<T> clazz) {
        String json = getJson(path);
        return new Gson().fromJson(json, clazz);
    }

    private static String getJson(String path) {
        try {
            return IOUtils.resourceToString(path, StandardCharsets.UTF_8, JsonEntityLoader.class.getClassLoader());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
