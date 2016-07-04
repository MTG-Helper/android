package com.ingsoft.magic_assistant.services;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;


public class StatsServiceInstance {

    public static StatsService createStatsService() {

        String BASE_URL = "http://10.0.3.2:9000/";
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        StatsService dueloService;
        dueloService = retrofit.create(StatsService.class);
        return  dueloService;

    }

}