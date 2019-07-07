package com.vimalcvs.colledge;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.vimalcvs.colledge.honours.bachelorofcommercehons.BachelorOfCommerce_Hons;
import com.vimalcvs.colledge.honours.bahbusneisseconomic.BAbusneisseConomic_Hons;
import com.vimalcvs.colledge.honours.baheconomic.BAEconomic_Hons;
import com.vimalcvs.colledge.honours.bahenglish.BAEnglish_Hons;
import com.vimalcvs.colledge.honours.bahhistory.BAHistory_Hons;
import com.vimalcvs.colledge.honours.bahindi.BAHindi;
import com.vimalcvs.colledge.honours.bschcomputerscience.ComputerScience;
import com.vimalcvs.colledge.helper.MyListAdapter;
import com.vimalcvs.colledge.vocational.bachelorofmanagementstuies.BachelorOfManagementStuies_Hons;
import com.vimalcvs.colledge.vocational.bavmaterialsmanagement.BA_V_Materials_Management;
import com.vimalcvs.colledge.vocational.bavshumanresoursmanegment.BA_V_Human_Resours_Management;
import com.vimalcvs.colledge.vocational.bavsmangementandmarkrtingofinsurance.BA_V_Management_Marketing_of_insurance;
import com.vimalcvs.colledge.vocational.bavsmarketingmanegmentandrb.BA_V_Marketing_Management_and_rb;
import com.vimalcvs.colledge.vocational.bavsofficemangmentandsecretarialpractice.BA_V_Office_Management;
import com.vimalcvs.colledge.vocational.bavssmallandmediumenterprises.BA_V_Small_and_medium_Enterprises;
import com.vimalcvs.colledge.vocational.bavstourism.BA_V_Tourism;

import io.supercharge.shimmerlayout.ShimmerLayout;

/**
 * Created by VimalCVS on 22/08/18.
 */
public class Syllabus extends AppCompatActivity {

    ListView list;
    String[] maintitle = {
            "B.A - English",
            "B.A - Economics",
            "B.A - History's",
            "B.A - Hindi",
            "B.A - Business Economics",
            "B.Sc - Computer Science",
            "Bachelor of Commerce",
            "B.A - Tourism Management",
            "B.A - Materials Management",
            "B.A - Human Resource Management",
            "B.A - Small and Medium Enterprises",
            "B.A - Management and Marketing of Insurance",
            "B.A - Office Management and Secretarial Practice",
            "B.A - Marketing Management and Retail Business",
            "Bachelor of Management Studies"
    };
    String[] subtitle = {
            "Honours",
            "Honours",
            "Honours",
            "Honours",
            "Honours",
            "Honours",
            "Honours",
            "Vocational",
            "Vocational",
            "Vocational",
            "Vocational",
            "Vocational",
            "Vocational",
            "Vocational",
            "Vocational",
    };
    Integer[] imgid = {
            R.drawable.ic_english,
            R.drawable.ic_economics,
            R.drawable.ic_history,
            R.drawable.ic_hindi,
            R.drawable.ic_business_economics,
            R.drawable.ic_cs,
            R.drawable.ic_commerce,
            R.drawable.ic_tourism,
            R.drawable.ic_materials_management,
            R.drawable.ic_human_resource,
            R.drawable.ic_small_and_medium_enterprises,
            R.drawable.ic_management_and_marketing_insurance,
            R.drawable.ic_office_management,
            R.drawable.ic_marketing_management_retail_business,
            R.drawable.ic_bachelor,

    };
    DownloadManager downloadManager;
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
                    downloadManager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                    Uri uri = Uri.parse("http://smartandroidcourse.com/sacfiles/sac/sacicon.png");
                    DownloadManager.Request request = new DownloadManager.Request(uri);
                    request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                    Long reference = downloadManager.enqueue(request);
                }
                if (position == 1) {
                    Intent myIntent = new Intent(Syllabus.this, BAEconomic_Hons.class);
                    startActivity(myIntent);
                    overridePendingTransition(R.anim.right_in, R.anim.left_out);
                }
                if (position == 2) {

                    Intent i = new Intent(Syllabus.this, BAHistory_Hons.class);
                    startActivity(i);
                    overridePendingTransition(R.anim.right_in, R.anim.left_out);
                }
                if (position == 3) {
                    Intent i = new Intent(Syllabus.this, BAHindi.class);
                    startActivity(i);
                    overridePendingTransition(R.anim.right_in, R.anim.left_out);
                }
                if (position == 4) {
                    Intent i = new Intent(Syllabus.this, BAbusneisseConomic_Hons.class);
                    startActivity(i);
                    overridePendingTransition(R.anim.right_in, R.anim.left_out);
                }
                if (position == 5) {
                    Intent i = new Intent(Syllabus.this, ComputerScience.class);
                    startActivity(i);
                    overridePendingTransition(R.anim.right_in, R.anim.left_out);
                }
                if (position == 6) {
                    Intent i = new Intent(Syllabus.this, BachelorOfCommerce_Hons.class);
                    startActivity(i);
                    overridePendingTransition(R.anim.right_in, R.anim.left_out);

                }
                if (position == 7) {

                    Intent i = new Intent(Syllabus.this, BA_V_Tourism.class);
                    startActivity(i);
                    overridePendingTransition(R.anim.right_in, R.anim.left_out);

                }
                if (position == 8) {

                    Intent i = new Intent(Syllabus.this, BA_V_Materials_Management.class);
                    startActivity(i);
                    overridePendingTransition(R.anim.right_in, R.anim.left_out);
                }
                if (position == 9) {

                    Intent i = new Intent(Syllabus.this, BA_V_Human_Resours_Management.class);
                    startActivity(i);
                    overridePendingTransition(R.anim.right_in, R.anim.left_out);
                }
                if (position == 10) {

                    Intent i = new Intent(Syllabus.this, BA_V_Small_and_medium_Enterprises.class);
                    startActivity(i);
                    overridePendingTransition(R.anim.right_in, R.anim.left_out);


                }
                if (position == 11) {

                    Intent i = new Intent(Syllabus.this, BA_V_Management_Marketing_of_insurance.class);
                    startActivity(i);
                    overridePendingTransition(R.anim.right_in, R.anim.left_out);
                }

                if (position == 12) {

                    Intent i = new Intent(Syllabus.this, BA_V_Office_Management.class);
                    startActivity(i);
                    overridePendingTransition(R.anim.right_in, R.anim.left_out);
                }

                if (position == 13) {

                    Intent i = new Intent(Syllabus.this, BA_V_Marketing_Management_and_rb.class);
                    startActivity(i);
                    overridePendingTransition(R.anim.right_in, R.anim.left_out);

                }
                if (position == 14) {
                    Intent i = new Intent(Syllabus.this, BachelorOfManagementStuies_Hons.class);
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
