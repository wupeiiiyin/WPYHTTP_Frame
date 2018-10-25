package com.example.administrator.demoapi32test.http;

public class JettNet {
    public static <T, M> void sendJsonRequest(String url, T requestInfo, Class<M> respance, IDataListen<M> dataListener){
        IHttpService HttpService = new JsonHttpService();
        IHttpListent httpListent = new JsonHttpListener<>(respance, dataListener);
        HttpTask httpTask = new HttpTask(url, requestInfo, HttpService, httpListent);
        ThreadPoolManager.getInstance().execute(httpTask);
    }
}
