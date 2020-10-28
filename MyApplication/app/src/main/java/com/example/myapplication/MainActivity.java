package com.example.android_tv3_10_tw_receiptlottery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt1 = (Button)findViewById(R.id.bt1);
        bt1.setOnClickListener(bt1_click);

        Button bt2 = (Button)findViewById(R.id.bt2);
        bt2.setOnClickListener(bt2_click);

        Button bt3 = (Button)findViewById(R.id.bt3);
        bt3.setOnClickListener(bt3_click);

        Button bt4 = (Button)findViewById(R.id.bt4);
        bt4.setOnClickListener(bt4_click);

        Button bt5 = (Button)findViewById(R.id.bt5);
        bt5.setOnClickListener(bt5_click);

        Button bt6 = (Button)findViewById(R.id.bt6);
        bt6.setOnClickListener(bt6_click);
    }
    private View.OnClickListener bt1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            TextView text = (TextView)findViewById(R.id.tv2);
            TextView tv3= (TextView)findViewById(R.id.tv3);
            text.setText("2018 1,2月發票");
            tv3.setText("1");
        }
    };
    private View.OnClickListener bt2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView text_2 = (TextView)findViewById(R.id.tv2);
            TextView tv3 = (TextView)findViewById(R.id.tv3);
            text_2.setText("2018 3,4月發票");
            tv3.setText("2");
        }
    };
    private View.OnClickListener bt3 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView text_3 = (TextView)findViewById(R.id.tv2);
            TextView tv3 = (TextView)findViewById(R.id.tv3);
            text_3.setText("2018 5,6月發票");
            tv3.setText("3");
        }
    };
    private View.OnClickListener bt4 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView text_4 = (TextView)findViewById(R.id.tv2);
            TextView tv3 = (TextView)findViewById(R.id.tv3);
            text_4.setText("2018 7,8月發票");
            tv3.setText("4");
        }
    };
    private View.OnClickListener bt5 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView text_5 = (TextView)findViewById(R.id.tv2);
            TextView tv3 = (TextView)findViewById(R.id.tv3);
            text_5.setText("2018 9,10月發票");
            tv3.setText("5");
        }
    };
    private View.OnClickListener bt6 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView text_6 = (TextView)findViewById(R.id.tv2);
            TextView tv3= (TextView)findViewById(R.id.tv3);
            text_6.setText("2018 11,12月發票");
            tv3.setText("6");
        }
    };
    public void bt7(View v){
        TextView button = (TextView)findViewById(R.id.tv2);
        TextView tv3 = (TextView)findViewById(R.id.tv3);
        Intent intent = new Intent(this, MainActivity2.class);
        Bundle bundle = new Bundle();
        bundle.putString("mouth", button.getText().toString());
        bundle.putString("numberMouth", tv3.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);
    }
}