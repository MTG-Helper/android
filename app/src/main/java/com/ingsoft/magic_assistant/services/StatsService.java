package com.ingsoft.magic_assistant.services;
import com.ingsoft.magic_assistant.data.StatsData;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by luciano on 03/07/16.
 */
public interface StatsService {

    @GET("/stats")
    public Call<StatsData> getStats();

}