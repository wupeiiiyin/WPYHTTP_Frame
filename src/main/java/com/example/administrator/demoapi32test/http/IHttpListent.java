package com.example.administrator.demoapi32test.http;

import java.io.InputStream;

public interface IHttpListent {
    void onSuccess(InputStream inputStream);
    void onFailure();
}
