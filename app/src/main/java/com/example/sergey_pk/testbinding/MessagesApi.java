package com.example.sergey_pk.testbinding;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Single;
import retrofit2.http.GET;

public interface MessagesApi {
    @GET("messages1.json")
    Single<List<Messange>>getMessanges();
}
