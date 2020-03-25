package istic.taa.wkapp.services;

import istic.taa.wkapp.model.Weather;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestService {

    private final RestTemplate restTemplate;

    public RestService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public Weather getWeatherForCity(String cityName) {
        String url = "https://samples.openweathermap.org/data/2.5/forecast?q=" + cityName + ",fr&appid=b6907d289e10d714a6e88b30761fae22";
        return this.restTemplate.getForObject(url, Weather.class); // TODO : Change this shit. It return a list, not a single object
    }
}