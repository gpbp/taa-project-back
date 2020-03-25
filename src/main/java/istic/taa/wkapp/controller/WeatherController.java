package istic.taa.wkapp.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import istic.taa.wkapp.model.Weather;
import istic.taa.wkapp.repository.WeatherDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityNotFoundException;
import javax.persistence.EntityTransaction;

@RestController
public class WeatherController {

}
