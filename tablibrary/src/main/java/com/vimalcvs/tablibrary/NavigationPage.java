package com.vimalcvs.tablibrary;

import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;

/**
 * A base class that holds the title, icon and an instance of the fragment to be shown as each
 * Navigation page
 *
 * Created by VIMALCVS on 15-Apr-18.
 */

public class NavigationPage {

    private String title;
    private Drawable icon;
    private Fragment fragment;

    public NavigationPage(String title, Drawable icon, Fragment fragment) {
        this.title = title;
        this.icon = icon;
        this.fragment = fragment;
    }

    public String getTitle() {
        return title;
    }

    public Drawable getIcon() {
        return icon;
    }

    public Fragment getFragment() {
        return fragment;
    }
}
