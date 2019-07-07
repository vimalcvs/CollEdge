package com.vimalcvs.colledge.questionpaper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.vimalcvs.colledge.R;

public class H_Hindi_Que extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
    }
}
