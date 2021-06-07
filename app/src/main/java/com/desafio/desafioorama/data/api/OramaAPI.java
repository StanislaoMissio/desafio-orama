package com.desafio.desafioorama.data.api;

import com.desafio.desafioorama.data.response.OramaResponse;

import retrofit2.http.GET;
import rx.Observable;

public interface OramaAPI {

    @GET("json/fund_detail_full.json")
    Observable<OramaResponse> getFundsList();

}
