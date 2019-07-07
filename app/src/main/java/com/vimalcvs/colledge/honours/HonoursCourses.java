package com.vimalcvs.colledge.honours;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.vimalcvs.colledge.R;
import com.vimalcvs.colledge.honours.bachelorofcommercehons.BachelorOfCommerce_Hons;
import com.vimalcvs.colledge.honours.bahbusneisseconomic.BAbusneisseConomic_Hons;
import com.vimalcvs.colledge.honours.baheconomic.BAEconomic_Hons;
import com.vimalcvs.colledge.honours.bahenglish.BAEnglish_Hons;
import com.vimalcvs.colledge.honours.bahhistory.BAHistory_Hons;
import com.vimalcvs.colledge.honours.bahindi.BAHindi;
import com.vimalcvs.colledge.honours.bschcomputerscience.ComputerScience;
import com.vimalcvs.colledge.helper.MyListAdapter;

import io.supercharge.shimmerlayout.ShimmerLayout;

/*
    *
     Created by VimalCVS on 22/08/18.
    *
 */

public class HonoursCourses extends AppCompatActivity {
    ListView list;
    String[] maintitle = {
            "B.A - English",
            "B.A - Economics",
            "B.A - History's",
            "B.A - Hindi",
            "B.A - Business Economics",
            "B.Sc - Computer Science",
            "Bachelor of Commerce"
    };
    String[] subtitle = {
            "Honours",
            "Honours",
            "Honours",
            "Honours",
            "Honours",
            "Honours",
            "Honours",
    };
    Integer[] imgid = {
            R.drawable.ic_english,
            R.drawable.ic_economics,
            R.drawable.ic_history,
            R.drawable.ic_hindi,
            R.drawable.ic_business_economics,
            R.drawable.ic_cs,
            R.drawable.ic_commerce,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);


        MyListAdapter adapter = new MyListAdapter(this, maintitle, subtitle, imgid);
        list = findViewById(R.id.activtiy_listview);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    Intent i = new Intent(HonoursCourses.this, BAEnglish_Hons.class);
                    startActivity(i);
                    overridePendingTransition(R.anim.right_in, R.anim.left_out);
                }
                if (position == 1) {
                    Intent myIntent = new Intent(HonoursCourses.this, BAEconomic_Hons.class);
                    startActivity(myIntent);
                    overridePendingTransition(R.anim.right_in, R.anim.left_out);
                }
                if (position == 2) {

                    Intent i = new Intent(HonoursCourses.this, BAHistory_Hons.class);
                    startActivity(i);
                    overridePendingTransition(R.anim.right_in, R.anim.left_out);
                }
                if (position == 3) {
                    Intent i = new Intent(HonoursCourses.this, BAHindi.class);
                    startActivity(i);
                    overridePendingTransition(R.anim.right_in, R.anim.left_out);
                }
                if (position == 4) {
                    Intent i = new Intent(HonoursCourses.this, BAbusneisseConomic_Hons.class);
                    startActivity(i);
                    overridePendingTransition(R.anim.right_in, R.anim.left_out);
                }
                if (position == 5) {
                    Intent i = new Intent(HonoursCourses.this, ComputerScience.class);
                    startActivity(i);
                    overridePendingTransition(R.anim.right_in, R.anim.left_out);
                }
                if (position == 6) {
                    Intent i = new Intent(HonoursCourses.this, BachelorOfCommerce_Hons.class);
                    startActivity(i);
                    overridePendingTransition(R.anim.right_in, R.anim.left_out);

                }
            }

        });
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
    }
}
