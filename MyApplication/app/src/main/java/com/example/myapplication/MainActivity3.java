package com.example.android_num_10_tw_receiptlottery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MaindActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Cpage();
    }
    public void bt11(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void bt10(View v){
        finish();
    }
    private void Cpage(){
        int number;
        Bundle bundle = this.getIntent().getExtras();
        if (bundle != null){
            number = Integer.parseInt(bundle.getString("winNum"));
            TextView textView = (TextView)findViewById(R.id.tv9);
            if (number == 000){
                textView.setText("2000元");
            }
            else if (number == 001){
                textView.setText("1000元");
            }
            else if (number == 002){
                textView.setText("500元");
            }
            else if (number == 003){
                textView.setText("200元");
            }
            else if (number == 004){
                textView.setText("100元");
            }
            else if (number == 100){
                textView.setText("2000元");
            }
            else if (number == 101){
                textView.setText("1000元");
            }
            else if (number == 102){
                textView.setText("500元");
            }
            else if (number == 103){
                textView.setText("200元");
            }
            else if (number == 104){
                textView.setText("100元");
            }
            else if (number == 200){
                textView.setText("2000元");
            }
            else if (number == 201){
                textView.setText("1000元");
            }
            else if (number == 202){
                textView.setText("200元");
            }
            else if (number == 203){
                textView.setText("200元");
            }
            else if (number == 204){
                textView.setText("10元");
            }
            else if (number == 300){
                textView.setText("2000元");
            }
            else if (number == 301){
                textView.setText("1000元");
            }
            else if (number == 302){
                textView.setText("500元");
            }
            else if (number == 303){
                textView.setText("200元");
            }
            else if (number == 304){
                textView.setText("100元");
            }
            else if (number == 400){
                textView.setText("2000元");
            }
            else if (number== 401){
                textView.setText("1000元");
            }
            else if (number == 402){
                textView.setText("500元");
            }
            else if (number == 403){
                textView.setText("200元");
            }
            else if (number == 404){
                textView.setText("100元");
            }
            else if (number == 500){
                textView.setText("2000元");
            }
            else if (number == 501){
                textView.setText("1000元");
            }
            else if (number == 502){
                textView.setText("500元");
            }
            else if (number == 503){
                textView.setText("200元");
            }
            else if (number == 504){
                textView.setText("100元");
            }
            else
                textView.setText("再接再厲!");
        }
    }
}