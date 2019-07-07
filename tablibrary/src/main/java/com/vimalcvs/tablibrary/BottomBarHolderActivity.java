package com.vimalcvs.tablibrary;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

/**
 * Helper class to handle bottom navigation UI and click events
 *
 * Created by VIMALCVS on 13-Apr-18.
 */

public class BottomBarHolderActivity extends AppCompatActivity implements BottomNavigationBar.BottomNavigationMenuClickListener {

    // helper class for handling UI and click events of tablibrary
    private BottomNavigationBar mBottomNav;

    // list of Navigation pages to be shown
    private List<NavigationPage> mNavigationPageList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_bar_holder);
    }

    /**
     * initializes the BottomBarHolderActivity with sent list of Navigation pages
     * @param pages
     */
    public void setupBottomBarHolderActivity(List<NavigationPage> pages) {

        // throw error if pages does not have 4 elements
        if (pages.size() != 2) {
            throw new RuntimeException("List of NavigationPage must contain 2 members.");
        } else {
            mNavigationPageList = pages;
            mBottomNav = new BottomNavigationBar(this, pages, this);
            setupFragments();
        }

    }

    /**
     * sets up the fragments with initial view
     */
    private void setupFragments() {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout, mNavigationPageList.get(0).getFragment());
        fragmentTransaction.commit();
    }

    /**
     * handling onclick events of bar items
     * @param menuType
     */
    @Override
    public void onClickedOnBottomNavigationMenu(int menuType) {

        // finding the selected fragment
        Fragment fragment = null;
        switch (menuType) {
            case BottomNavigationBar.MENU_BAR_1:
                fragment = mNavigationPageList.get(0).getFragment();
                break;
            case BottomNavigationBar.MENU_BAR_2:
                fragment = mNavigationPageList.get(1).getFragment();
                break;
        }

        // replacing fragment with the current one
        if (fragment != null) {
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frameLayout, fragment);
            fragmentTransaction.commit();
        }

    }
}
