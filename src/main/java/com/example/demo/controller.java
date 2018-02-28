package com.example.demo;
import Services.*;
import org.hibernate.validator.internal.util.Contracts;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Array;

@RestController
public class controller {
    @RequestMapping(value = "/getCountries",method = RequestMethod.GET)
    public Countries[] GetCountries()
    {
        final String uri ="https://apifootball.com/api/?action=get_countries&APIkey=b8b3e43651293f5b7961ed1e1d472305bcf71d1c01f135476ea5d82e8f47887f";
        RestTemplate restTemplate = new RestTemplate();
        Countries[] con = restTemplate.getForObject(uri,Countries[].class);
        return con;
    }

    @RequestMapping(value = "/match/{Team1}/{Team2}",method = RequestMethod.GET)
    public matches[] GetMatches(@PathVariable  ("Team1") String Team1 , @PathVariable ("Team2")String Team2)
    {
        final String uri ="https://apifootball.com/api/?action=get_H2H&firstTeam="+Team1+"&secondTeam="+Team2+"&APIkey=b8b3e43651293f5b7961ed1e1d472305bcf71d1c01f135476ea5d82e8f47887f";
        RestTemplate restTemplate = new RestTemplate();
        kber con = restTemplate.getForObject(uri,kber.class);
        return con.getFirstTeam_VS_secondTeam();
    }
    @RequestMapping(value = "/Standing/{ID}",method = RequestMethod.GET)
    public stand[] GetStandings(@PathVariable  ("ID") String id )
    {
        final String uri ="https://apifootball.com/api/?action=get_standings&league_id="+id+"&APIkey=b8b3e43651293f5b7961ed1e1d472305bcf71d1c01f135476ea5d82e8f47887f";
        RestTemplate restTemplate = new RestTemplate();
        stand[] con = restTemplate.getForObject(uri,stand[].class);
        return con;
    }
    @RequestMapping(value = "/Events/{from}/{to}/{league_id}",method = RequestMethod.GET)
    public Event[] GetEvents(@PathVariable  ("from") String from,@PathVariable  ("to") String to ,
                             @PathVariable  ("league_id") String league_id )
    {
        final String uri ="https://apifootball.com/api/?action=get_events&from="+from +" &to="+to+"&league_id="+league_id+"&APIkey=b8b3e43651293f5b7961ed1e1d472305bcf71d1c01f135476ea5d82e8f47887f";
        RestTemplate restTemplate = new RestTemplate();
        Event[] con = restTemplate.getForObject(uri,Event[].class);
        return con;
    }

    @RequestMapping(value = "/league/{id}",method = RequestMethod.GET)
    public league[] Getleagues(@PathVariable  ("id") String id)
    {
        final String uri ="https://apifootball.com/api/?action=get_leagues&country_id="+id+"&APIkey=b8b3e43651293f5b7961ed1e1d472305bcf71d1c01f135476ea5d82e8f47887f";
        RestTemplate restTemplate = new RestTemplate();
        league[] con = restTemplate.getForObject(uri,league[].class);
        return con;
    }








}
