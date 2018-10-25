package com.example.administrator.demoapi32test.http;

import android.widget.Toast;

import com.alibaba.fastjson.JSON;
import com.example.administrator.demoapi32test.Respance;

import java.io.UnsupportedEncodingException;

public class HttpTask<T> implements Runnable {
    private IHttpService httpService;
    private IHttpListent iHttpListent;

    public HttpTask(String url, T requestInfo, IHttpService httpService, IHttpListent iHttpListent) {
        this.httpService = httpService;
        this.iHttpListent = iHttpListent;
        httpService.setUrl(url);
        httpService.setHttpCallback(iHttpListent);
        //需要把请求参数装换成json字符串
        String requestContent = JSON.toJSONString(requestInfo);
        try {
            System.out.println("请求地址：" + url);
            System.out.println("请求参数：" + requestContent);
            httpService.setRequestData(requestContent.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        httpService.execute();
    }
}
