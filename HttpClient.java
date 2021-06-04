package com.example.kontrol;

public interface HttpClient {

    DefaultHttpClient.HttpResponse execute(DefaultHttpClient.HttpPost httppost);
}
