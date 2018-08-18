package pl.sdacademy.weather;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sdacademy.weather.model.Weather;

import java.io.IOException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        URL url = new URL("https://danepubliczne.imgw.pl/api/data/synop");

        Weather[] weathers = mapper.readValue(url, Weather[].class);


        for(Weather w:  weathers){
            System.out.println(w.getStacja());
        }
    }
}
