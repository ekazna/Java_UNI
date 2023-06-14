package com.example.demo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Класс для соединения с сервером
 */
public class Connections {

    /**
     * Метод (POST) отправляет строку серверу
     * @param myString строка (json)
     * @throws ClientProtocolException ошибка в протоколе http
     * @throws IOException
     */
    public void sendNewTrainToServer(String myString) throws ClientProtocolException, IOException{
        HttpClient httpclient = HttpClients.createDefault();
        HttpPost httppost = new HttpPost("http://localhost:9999//terminal//trains//add//");

    
        StringEntity stringEntity = new StringEntity(myString,"UTF-8");
        httppost.setHeader("Content-type", "application/json");
        httppost.setEntity(stringEntity);
        httpclient.execute(httppost);


    }

    /**
     * Метод (GET) обращается к серверу,
     * получает от него строку Json и
     * делает из нее список объектов-поездов
     * @return список объектов-поездов {@link Train}
     * @throws ClientProtocolException ошибка в протоколе http
     * @throws IOException
     */
    public List<Train> getAllTrainsFromServer() throws ClientProtocolException, IOException{
        HttpClient httpclient = HttpClients.createDefault();
        HttpGet httpget = new HttpGet("http://localhost:9999//terminal//trains");
        HttpEntity httpEntity = httpclient.execute(httpget).getEntity();
        String responseString = EntityUtils.toString(httpEntity, "UTF-8");

        
        ObjectMapper mapper = new ObjectMapper(null);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        List<Train> trains = mapper.readValue(responseString, new TypeReference<List<Train>>() {});
        return trains;
        
    
    }


    /**
     * Метод (GET) обращается к серверу,
     * получает от него строку Json и
     * делает из нее список объектов-рейсов
     * @return список объектов-рейсов {@link TripToShow}
     * @throws ClientProtocolException ошибка в протоколе http
     * @throws IOException
     */
    public List<TripToShow> getAllTripsFromServer() throws ClientProtocolException, IOException{
        HttpClient httpclient = HttpClients.createDefault();
        HttpGet httpget = new HttpGet("http://localhost:9999//terminal//trips");
        HttpEntity httpEntity = httpclient.execute(httpget).getEntity();
        String responseString = EntityUtils.toString(httpEntity, "UTF-8");


        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        List<Trip> trips = mapper.readValue(responseString, new TypeReference<List<Trip>>(){});
        
        List<TripToShow> tripsToShow = new ArrayList<>();
        for (Trip trip : trips) {
            tripsToShow.add(new TripToShow(trip));
        }
        return tripsToShow;
        
    
    }
    
}