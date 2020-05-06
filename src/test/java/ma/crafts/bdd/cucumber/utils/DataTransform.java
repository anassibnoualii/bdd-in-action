package ma.crafts.bdd.cucumber.utils;

import com.fasterxml.classmate.GenericType;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DataTransform {
    static ObjectMapper mapper = new ObjectMapper();

    public static String objectToJson(GenericType genericType) {
        String json = "";
        try {
            json = mapper.writeValueAsString(genericType);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return json;
    }
    public static String objectToJson(Object object) {
        String json = "";
        try {
            json = mapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return json;
    }

    public static <T> T objectToClass(Object object, Class<T> targetClass) {
        return  mapper.convertValue(object, targetClass);
    }

}
