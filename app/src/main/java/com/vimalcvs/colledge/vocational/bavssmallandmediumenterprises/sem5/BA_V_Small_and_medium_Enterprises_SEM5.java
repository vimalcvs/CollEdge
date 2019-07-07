package com.vimalcvs.colledge.vocational.bavssmallandmediumenterprises.sem5;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import com.vimalcvs.colledge.helper.CustomExpandableListAdapter;
import com.vimalcvs.colledge.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/** * Created by VimalCVS on 22/08/18. */

public class BA_V_Small_and_medium_Enterprises_SEM5 extends AppCompatActivity {
    ExpandableListView expandableListView;
    ExpandableListAdapter expandableListAdapter;
    List<String> expandableListTitle;
    HashMap<String, List<String>> expandableListDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.expandablelistview);
        expandableListView = (ExpandableListView) findViewById(R.id.expandableListView);
        expandableListDetail = BA_V_Small_and_medium_Enterprises_SEM5.ExpandableListDataPump.getData();
        expandableListTitle = new ArrayList<String>(expandableListDetail.keySet());
        expandableListAdapter = new CustomExpandableListAdapter(this, expandableListTitle, expandableListDetail);
        expandableListView.setAdapter(expandableListAdapter);

        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                switch (groupPosition) {
                    case 0:
                        switch (childPosition) {
                            case 0:

                                break;
                            case 1:

                                break;
                        }
                    case 1:
                        switch (childPosition) {
                            case 0:

                                break;
                            case 1:

                                break;
                        }
                    case 2:
                        switch (childPosition) {
                            case 0:

                                break;
                            case 1:
                                break;
                        }

                        break;
                }
                return true;
            }

        });
    }

    public static class ExpandableListDataPump {
        public static HashMap<String, List<String>> getData() { HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

            List<String> expandableListString = new ArrayList<String>();
            expandableListString.add("Notes");
            expandableListString.add("Question Paper");


            expandableListDetail.put("1", expandableListString);
            expandableListDetail.put("2", expandableListString);
            expandableListDetail.put("3",expandableListString);
            return expandableListDetail;
        }
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
    }

}
