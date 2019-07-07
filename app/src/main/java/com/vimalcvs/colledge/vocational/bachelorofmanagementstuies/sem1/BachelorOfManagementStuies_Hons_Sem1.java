package com.vimalcvs.colledge.vocational.bachelorofmanagementstuies.sem1;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
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

/**
 * Created by VimalCVS on 22/08/18.
 */
public class BachelorOfManagementStuies_Hons_Sem1 extends AppCompatActivity {
    ExpandableListView expandableListView;
    ExpandableListAdapter expandableListAdapter;
    List<String> expandableListTitle;
    HashMap<String, List<String>> expandableListDetail;
    DownloadManager downloadManager1,downloadManager2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.expandablelistview);
        expandableListView = (ExpandableListView) findViewById(R.id.expandableListView);
        expandableListDetail = BachelorOfManagementStuies_Hons_Sem1.ExpandableListDataPump.getData();
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
                                downloadManager1 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri = Uri.parse("http://smartandroidcourse.com/sacfiles/sac/sacicon.png");
                                DownloadManager.Request request = new DownloadManager.Request(uri);
                                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference = downloadManager1.enqueue(request);
                                break;
                            case 1:
                                downloadManager2 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uril = Uri.parse("http://smartandroidcourse.com/sacfiles/sac/sacicon.png");
                                DownloadManager.Request request1 = new DownloadManager.Request(uril);
                                request1.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference1 = downloadManager2.enqueue(request1);
                                break;
                        }
                    case 1:
                        switch (childPosition) {
                            case 0:
                                downloadManager1 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri = Uri.parse("http://smartandroidcourse.com/sacfiles/sac/sacicon.png");
                                DownloadManager.Request request = new DownloadManager.Request(uri);
                                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference = downloadManager1.enqueue(request);
                                break;
                            case 1:
                                downloadManager2 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uril = Uri.parse("http://smartandroidcourse.com/sacfiles/sac/sacicon.png");
                                DownloadManager.Request request1 = new DownloadManager.Request(uril);
                                request1.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference1 = downloadManager2.enqueue(request1);
                                break;
                        }
                    case 2:
                        switch (childPosition) {
                            case 0:
                                downloadManager1 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri = Uri.parse("http://smartandroidcourse.com/sacfiles/sac/sacicon.png");
                                DownloadManager.Request request = new DownloadManager.Request(uri);
                                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference = downloadManager1.enqueue(request);
                                break;
                            case 1:
                                downloadManager2 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uril = Uri.parse("http://smartandroidcourse.com/sacfiles/sac/sacicon.png");
                                DownloadManager.Request request1 = new DownloadManager.Request(uril);
                                request1.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference1 = downloadManager2.enqueue(request1);
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
