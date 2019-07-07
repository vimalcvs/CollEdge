package com.vimalcvs.colledge.questionpaper;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.widget.Toast;

import com.vimalcvs.colledge.R;
import java.util.ArrayList;
import java.util.List;
import com.vimalcvs.tablibrary.BottomBarHolderActivity;
import com.vimalcvs.tablibrary.NavigationPage;

public class QuestionPaper extends BottomBarHolderActivity implements HonoursFragment.OnFragmentInteractionListener, VocationalFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        NavigationPage page1 = new NavigationPage("Honours", ContextCompat.getDrawable(this, R.drawable.ic_honours), HonoursFragment.newInstance());
        NavigationPage page2 = new NavigationPage("Vocational", ContextCompat.getDrawable(this, R.drawable.ic_graduation_hat), VocationalFragment.newInstance());

        List<NavigationPage> navigationPages = new ArrayList<>();
        navigationPages.add(page1);
        navigationPages.add(page2);
        super.setupBottomBarHolderActivity(navigationPages);

    }

    @Override
    public void onClicked() {
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
    }
}