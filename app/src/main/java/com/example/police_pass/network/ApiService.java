package com.example.police_pass.network;

import com.example.police_pass.network.response.ApiResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * @author YangZhaoxin.
 * @since 2019/5/1 22:34.
 * email yangzhaoxin@hrsoft.net.
 */

public interface ApiService {

    @GET("/token")
    Call<ApiResponse<String>> checkToken();
}
