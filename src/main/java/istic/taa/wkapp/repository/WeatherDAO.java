package istic.taa.wkapp.repository;

import com.istic.master.taa.taa.project.exceptions.WeatherRequestException;
import istic.taa.wkapp.model.Weather;
import istic.taa.wkapp.services.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class WeatherDAO{

    @Autowired
    private RestService restService;

    public WeatherDAO(){
    }

    public Weather requestWeatherForCity(String cityName) throws WeatherRequestException {
        try {
            return restService.getWeatherForCity(cityName);
        }catch(Exception e){
            throw new WeatherRequestException(e.getMessage());
        }
    }

}
