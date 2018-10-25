package com.example.administrator.demoapi32test.http;

public interface IDataListen<M> {
    void onSuccess(M m);

    void onFailure();
}
