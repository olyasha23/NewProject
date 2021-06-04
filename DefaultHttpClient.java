package com.example.kontrol;

public class DefaultHttpClient {
    HttpClient httpclient = (HttpClient) new DefaultHttpClient();
    HttpPost httppost = new HttpPost("http://192.168.43.148:8080");
    HttpResponse response = httpclient.execute(httppost);
    class HttpPost {
        public HttpPost(Object s) {
        }
    }
    class HttpResponse {
    }
}
