package com.vimalcvs.colledge.vocational.bavsmarketingmanegmentandrb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

import com.smarteist.autoimageslider.SliderLayout;
import com.smarteist.autoimageslider.SliderView;
import com.vimalcvs.colledge.R;
import com.vimalcvs.colledge.vocational.bavsmarketingmanegmentandrb.sem1.BA_V_Marketing_Management_and_rb_SEM1;
import com.vimalcvs.colledge.vocational.bavsmarketingmanegmentandrb.sem2.BA_V_Marketing_Management_and_rb_SEM2;
import com.vimalcvs.colledge.vocational.bavsmarketingmanegmentandrb.sem3.BA_V_Marketing_Management_and_rb_SEM3;
import com.vimalcvs.colledge.vocational.bavsmarketingmanegmentandrb.sem4.BA_V_Marketing_Management_and_rb_SEM4;
import com.vimalcvs.colledge.vocational.bavsmarketingmanegmentandrb.sem5.BA_V_Marketing_Management_and_rb_SEM5;
import com.vimalcvs.colledge.vocational.bavsmarketingmanegmentandrb.sem6.BA_V_Marketing_Management_and_rb_SEM6;

/**
 * Created by VimalCVS on 22/08/18.
 */

public class BA_V_Marketing_Management_and_rb extends AppCompatActivity {
    SliderLayout sliderLayout;
    public CardView cardView1, cardView2, cardView3, cardView4, cardView5 ,cardView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester_ui);


        cardView1 = findViewById(R.id.Semester1);
        cardView2 = findViewById(R.id.Semester2);
        cardView3 = findViewById(R.id.Semester3);
        cardView4 = findViewById(R.id.Semester4);
        cardView5 = findViewById(R.id.Semester5);
        cardView6 = findViewById(R.id.Semester6);


        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(BA_V_Marketing_Management_and_rb.this,BA_V_Marketing_Management_and_rb_SEM1.class);
                startActivity(myIntent);
                overridePendingTransition(R.anim.right_in, R.anim.left_out);
            }
        });

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(BA_V_Marketing_Management_and_rb.this, BA_V_Marketing_Management_and_rb_SEM2.class);
                startActivity(myIntent);
                overridePendingTransition(R.anim.right_in, R.anim.left_out);
            }
        });

        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(BA_V_Marketing_Management_and_rb.this, BA_V_Marketing_Management_and_rb_SEM3.class);
                startActivity(myIntent);
                overridePendingTransition(R.anim.right_in, R.anim.left_out);
            }
        });
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(BA_V_Marketing_Management_and_rb.this,  BA_V_Marketing_Management_and_rb_SEM4.class);
                startActivity(myIntent);
                overridePendingTransition(R.anim.right_in, R.anim.left_out);

            }
        });
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(BA_V_Marketing_Management_and_rb.this, BA_V_Marketing_Management_and_rb_SEM5.class);
                startActivity(myIntent);
                overridePendingTransition(R.anim.right_in, R.anim.left_out);
            }
        });

        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(BA_V_Marketing_Management_and_rb.this, BA_V_Marketing_Management_and_rb_SEM6.class);
                startActivity(myIntent);
                overridePendingTransition(R.anim.right_in, R.anim.left_out);
            }
        });

        sliderLayout = findViewById(R.id.imageSlider);
        sliderLayout.setIndicatorAnimation(SliderLayout.Animations.FILL); //set indicator animation by using SliderLayout.Animations. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderLayout.setScrollTimeInSec(1); //set scroll delay in seconds :

        setSliderViews();
    }

    private void setSliderViews() {

        for (int i = 0; i <= 3; i++) {

            SliderView sliderView = new SliderView(this);

            switch (i) {
                case 0:
                    sliderView.setImageUrl("https://images.pexels.com/photos/547114/pexels-photo-547114.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260");
                    break;
                case 1:
                    sliderView.setImageUrl("https://images.pexels.com/photos/218983/pexels-photo-218983.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260");
                    break;
                case 2:
                    sliderView.setImageUrl("https://images.pexels.com/photos/747964/pexels-photo-747964.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260");
                    break;
                case 3:
                    sliderView.setImageUrl("https://images.pexels.com/photos/929778/pexels-photo-929778.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260");
                    break;
            }
            //at last add this view in your layout :
            sliderLayout.addSliderView(sliderView);
        }
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
    }
}
