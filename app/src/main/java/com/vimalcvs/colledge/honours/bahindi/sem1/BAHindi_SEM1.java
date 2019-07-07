package com.vimalcvs.colledge.honours.bahindi.sem1;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import com.vimalcvs.colledge.helper.CustomExpandableListAdapter;
import com.vimalcvs.colledge.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/** * Created by VimalCVS on 22/08/18. */

public class BAHindi_SEM1 extends AppCompatActivity {
    ExpandableListView expandableListView;
    ExpandableListAdapter expandableListAdapter;
    List<String> expandableListTitle;
    HashMap<String, List<String>> expandableListDetail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.expandablelistview);

        expandableListView = (ExpandableListView) findViewById(R.id.expandableListView);
        expandableListDetail =  BAHindi_SEM1.ExpandableListDataPump.getData();
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

                            case 1:

                                break;
                            case 2:

                                break;
                            case 3:

                                break;
                            case 4:

                                break;
                            case 5:

                                break;
                        }
                    case 1:
                        switch (childPosition) {
                            case 0:
                                DownloadManager downloadManager3;
                                downloadManager3 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri1 = Uri.parse("http://smartandroidcourse.com/sacfiles/sac/sacicon.png");
                                DownloadManager.Request request = new DownloadManager.Request(uri1);
                                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference1 = downloadManager3.enqueue(request);
                                break;
                            case 1:
                                DownloadManager downloadManager4;
                                downloadManager4 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri2 = Uri.parse("http://smartandroidcourse.com/sacfiles/sac/sacicon.png");
                                DownloadManager.Request request2 = new DownloadManager.Request(uri2);
                                request2.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference2 = downloadManager4.enqueue(request2);
                                break;
                        }
                    case 2:
                        switch (childPosition) {
                            case 0:
                                DownloadManager downloadManager5;
                                downloadManager5 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri1 = Uri.parse("http://smartandroidcourse.com/sacfiles/sac/sacicon.png");
                                DownloadManager.Request request1 = new DownloadManager.Request(uri1);
                                request1.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference1 = downloadManager5.enqueue(request1);
                                break;
                            case 1:
                                DownloadManager downloadManager6;
                                downloadManager6 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri2 = Uri.parse("http://smartandroidcourse.com/sacfiles/sac/sacicon.png");
                                DownloadManager.Request request2 = new DownloadManager.Request(uri2);
                                request2.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference2 = downloadManager6.enqueue(request2);
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
			expandableListString.add("Notes");
            expandableListString.add("Question Paper");

            List<String> othername = new ArrayList<String>();
            expandableListString.add("Notes");
            expandableListString.add("Notes");
            expandableListString.add("Question Paper");
            expandableListString.add("Question Paper");
            expandableListString.add("Question Paper");


            expandableListDetail.put("1", expandableListString);
            expandableListDetail.put("2", othername);
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
