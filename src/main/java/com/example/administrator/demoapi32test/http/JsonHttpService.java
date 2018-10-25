package com.example.administrator.demoapi32test.http;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import okhttp3.OkHttpClient;

public class JsonHttpService implements IHttpService {
    private String url;
    private byte[] requestDatas;
    private IHttpListent httpListent;
    private HttpURLConnection urlConnection;

    @Override
    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public void setRequestData(byte[] requestData) {
        this.requestDatas = requestData;
    }

    @Override
    public void setHttpCallback(IHttpListent iHttpListent) {
        this.httpListent = iHttpListent;
    }

    /**
     * 进行网络访问
     */
    @Override
    public void execute() {
        httpUrlconnPost();
    }

    public void httpUrlconnPost() {
        try {
            URL url = null;
            url = new URL(this.url);
            urlConnection = (HttpURLConnection) url.openConnection();//打开Http连接
            urlConnection.setConnectTimeout(6000);//连接的超时时间
            urlConnection.setUseCaches(false);//不使用缓存
            urlConnection.setInstanceFollowRedirects(true);//是成员函数，仅作用与当前
            urlConnection.setReadTimeout(3000);//响应的超时时间
            urlConnection.setDoInput(true);//设置这个连接是否可以写入这个数据
            urlConnection.setDoOutput(true);//设置这个连接是否可以输出数据
            urlConnection.setRequestMethod("POST");//设置请求的方式
            urlConnection.setRequestProperty("Content-Type", "application/json");
            urlConnection.setRequestProperty("Token", "VZwReW4JXESMss2bGxCN9CrQ");
            urlConnection.connect();//连接
            OutputStream outputStream = urlConnection.getOutputStream();
            BufferedOutputStream bos = new BufferedOutputStream(outputStream);
            if (requestDatas != null) {
                bos.write(requestDatas);
            }
            bos.flush();//刷新缓冲区，发送数据
            outputStream.close();
            bos.close();
            //字符流写入数据
            if (urlConnection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                InputStream inputStream = urlConnection.getInputStream();
                httpListent.onSuccess(inputStream);

            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
            httpListent.onFailure();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            urlConnection.disconnect();//使用完关闭TCP连接，释放资源
        }
    }
}
