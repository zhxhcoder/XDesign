package com.zhxh.android.xdesign;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.zhxh.xdesignlib.ViewUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv1 = findViewById(R.id.tv1);
        TextView tv2 = findViewById(R.id.tv2);
        TextView tv3 = findViewById(R.id.tv3);

        tv1.setTextColor(ViewUtil.parseColor("#0000CD"));
        tv2.setTextColor(ViewUtil.parseColor("#500000CD"));
        tv3.setTextColor(ViewUtil.parseColor("#FFD700"));

    }
}
