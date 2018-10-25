package com.example.administrator.demoapi32test.http;

public interface IHttpService {
    void setUrl(String url);

    void setRequestData(byte[] requestData);

    void execute();

    void setHttpCallback(IHttpListent iHttpListent);
}
