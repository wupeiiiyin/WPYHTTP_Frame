package com.example.administrator.demoapi32test.http;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;

import com.alibaba.fastjson.JSON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class JsonHttpListener<M> implements IHttpListent {
    //调用者转入的数据，用来收结果
    Class<M> respanceClass;
    IDataListen dataListen;
    //用于线程切换
    Handler handler = new Handler(Looper.getMainLooper());

    public JsonHttpListener(Class<M> respanceClass, IDataListen dataListener) {
        this.respanceClass = respanceClass;
        this.dataListen = dataListener;
    }

    @Override
    public void onSuccess(InputStream inputStream) {
        //已经得到网络响应的数据了
        //1.把String装换成用户需要的数据类型
        String content = getContent(inputStream);
        System.out.println("HttpContent: " + content);
        final M respance = JSON.parseObject(content, respanceClass);

        //2.把结果交给调用者
        handler.post(new Runnable() {
            @Override
            public void run() {
                dataListen.onSuccess(respance);
            }
        });
    }


    @Override
    public void onFailure() {
        //2.把结果交给调用者
//        handler.post(new Runnable() {
//            @Override
//            public void run() {
//                dataListen.onSuccess(respance);
//            }
//        });
    }

    private String getContent(InputStream inputStream) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuffer sb = new StringBuffer();
            String line = null;
            try {
                while ((line = reader.readLine()) != null) {
                    sb.append(line + "\n");
                }
            } catch (IOException e) {
                System.out.println("Error=" + e.toString());
            } finally {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    System.out.println("Error=" + e.toString());
                }
            }
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
