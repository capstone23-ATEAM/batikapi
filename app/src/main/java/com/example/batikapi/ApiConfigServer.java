package com.example.batikapi;

public class ApiConfigServer {
        public static final String URL_API = "http://batikita.herokuapp.com/";

        public static ApiService getApiService(){
            return RetrofitApi.getClient(URL_API).create(ApiService.class);
        }
}

