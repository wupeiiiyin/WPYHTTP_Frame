package com.example.administrator.demoapi32test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.demoapi32test.http.IDataListen;
import com.example.administrator.demoapi32test.http.JettNet;

import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity implements IDataListen<newsListBean> {
    //    String url = "http://rnssapi.risfond.com/SuccessfulCase/SuccessArticleStatistics";
    String url = "http://192.168.30.7:801/course/list";
    private Button textView;
    private TextView textView2;
    private EditText editText;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    public void onclick(View view) {
        HashMap<String, String> map = new HashMap<>();
        map.put("pageindex", "1");
        map.put("keyword", "");
        map.put("staffid", "2");
        Log.e("TAG", "onclick: " + System.currentTimeMillis());
        JettNet.sendJsonRequest(url, map, newsListBean.class, this);
    }

    @Override
    public void onSuccess(newsListBean newsListBean) {
        Log.e("TAG", "onclick: " + System.currentTimeMillis());
        if (newsListBean.isStatus()) {
            Log.e("TAG", "onSuccess: " + newsListBean.getData().toString());
            Toast.makeText(MainActivity.this, newsListBean.getTotal() + "", Toast.LENGTH_SHORT).show();
            List<com.example.administrator.demoapi32test.newsListBean.DataBean> data = newsListBean.getData();
            textView2.setText(data.get(0).getCourseBanner());
        } else {
//            onFailure();
        }
    }

    @Override
    public void onFailure() {

    }

    private void initView() {
        textView = (Button) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);
        editText = (EditText) findViewById(R.id.editText);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
    }

//    @Override
//    public void onClick(View v) {
//        switch (v.getId()) {
//            case R.id.textView:
//                break;
//        }
//    }

    private void submit() {
        // validate
        String editTextString = editText.getText().toString().trim();
        if (TextUtils.isEmpty(editTextString)) {
            Toast.makeText(this, "editTextString不能为空", Toast.LENGTH_SHORT).show();
            return;
        }

        // TODO validate success, do something


    }
}
