package com.vimalcvs.colledge;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.github.javiersantos.materialstyleddialogs.MaterialStyledDialog;
import com.github.javiersantos.materialstyleddialogs.enums.Style;
import com.smarteist.autoimageslider.SliderLayout;
import com.smarteist.autoimageslider.SliderView;
import com.vimalcvs.colledge.honours.HonoursCourses;
import com.vimalcvs.colledge.helper.aboutus.act.ActivitySample;
import com.vimalcvs.colledge.helper.menu.DrawerAdapter;
import com.vimalcvs.colledge.helper.menu.DrawerItem;
import com.vimalcvs.colledge.helper.menu.SimpleItem;
import com.vimalcvs.colledge.helper.menu.SpaceItem;
import com.vimalcvs.colledge.vocational.VocationalCourses;
import com.yarolegovich.slidingrootnav.SlidingRootNav;
import com.yarolegovich.slidingrootnav.SlidingRootNavBuilder;

import java.util.Arrays;

import technolifestyle.com.imageslider.FlipperLayout;
import technolifestyle.com.imageslider.FlipperView;

/**
 * Created by VIMALCVS on 25.08.2018.
 */

public class MainActivity extends AppCompatActivity implements DrawerAdapter.OnItemSelectedListener {
    SliderLayout sliderLayout;
    private static final int POS_HOME = 0;
    private static final int POS_ABOUT = 1;
    private static final int POS_FEEDBACK = 2;
    private static final int POS_DONATIONS = 3;
    private static final int POS_EXIT = 5;

    private String[] screenTitles;
    private Drawable[] screenIcons;
    private SlidingRootNav slidingRootNav;

    public CardView cardView1, cardView2, cardView3, cardView4, cardView5,cardView6;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        cardView1 = findViewById(R.id.main_hons);
        cardView2 = findViewById(R.id.main_vocational);
        cardView3 = findViewById(R.id.main_que);
        cardView4 = findViewById(R.id.main_syllabus);


        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, HonoursCourses.class);
                startActivity(myIntent);
                overridePendingTransition(R.anim.right_in, R.anim.left_out);
            }
        });

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, VocationalCourses.class);
                startActivity(myIntent);
                overridePendingTransition(R.anim.right_in, R.anim.left_out);
            }
        });

        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, Notification.class);
                startActivity(myIntent);
                overridePendingTransition(R.anim.right_in, R.anim.left_out);


            }
        });
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, Syllabus.class);
                startActivity(myIntent);
                overridePendingTransition(R.anim.right_in, R.anim.left_out);

            }
        });





        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String share = "CollEdge Try out this awesome app on\nGoogle Play!\n";
                String shareBody = share + "https://play.google.com/store/apps/details?id=com.vimalcvs.colledge=en";
                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Official 2018 CollEdge app");
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(sharingIntent, "Share With"));
            }
        });




        slidingRootNav = new SlidingRootNavBuilder(this)
                .withToolbarMenuToggle(toolbar)
                .withMenuOpened(false)
                .withContentClickableWhenMenuOpened(false)
                .withSavedState(savedInstanceState)
                .withMenuLayout(R.layout.menu_left_drawer)
                .inject();

        screenIcons = loadScreenIcons();
        screenTitles = loadScreenTitles();

        DrawerAdapter adapter = new DrawerAdapter(Arrays.asList(
                createItemFor(POS_HOME).setChecked(true),
                createItemFor(POS_ABOUT),
                createItemFor(POS_FEEDBACK),
                createItemFor(POS_DONATIONS),
                new SpaceItem(48),
                createItemFor(POS_EXIT)));
                adapter.setListener(this);

        RecyclerView list = findViewById(R.id.list);
        list.setNestedScrollingEnabled(false);
        list.setLayoutManager(new LinearLayoutManager(this));
        list.setAdapter(adapter);
        adapter.setSelected(POS_HOME);

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
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.homemain, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_notifications:
                new MaterialStyledDialog.Builder(this)
                        .setTitle("COMING SOON")
                        .setDescription(R.string.dialog_content)
                        .setStyle(Style.HEADER_WITH_TITLE)
                        .setHeaderColor(R.color.colorPrimary)
                        .setPositiveText("Github")
                        .withDialogAnimation(true)
                        .onPositive(new MaterialDialog.SingleButtonCallback() {
                            @Override
                            public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {
                                String url = (getString(R.string.github_url));
                                Intent i = new Intent(Intent.ACTION_VIEW);
                                i.setData(Uri.parse(url));
                                startActivity(i);
                            }
                        })
                        .setNegativeText("Ok")
                        .onNegative(new MaterialDialog.SingleButtonCallback() {
                            @Override
                            public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {

                            }
                        })
                        .withDivider(true)
                        .setCancelable(false)
                        .show();
                return true;
            case R.id.action_about:
                Intent vIntent = new Intent(MainActivity.this, ActivitySample.class);
                startActivity(vIntent);
                overridePendingTransition(R.anim.right_in, R.anim.left_out);
                return true;
            case R.id.action_share:
                String share = "CollEdge Try out this awesome app on\nGoogle Play!\n";
                String shareBody = share + "https://play.google.com/store/apps/details?id=com.vimalcvs.colledge=en";
                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Official 2018 CollEdge app");
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(sharingIntent, "Share With"));

                return true;
            case R.id.action_exit:
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle(R.string.app_name);
                builder.setIcon(R.mipmap.ic_launcher);
                builder.setMessage("Do you want to exit?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                finish();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onItemSelected(int position) {
        if (position == POS_HOME) {
            overridePendingTransition(R.anim.right_in, R.anim.left_out);
        }
        if (position == POS_ABOUT) {
            Intent myIntent = new Intent(MainActivity.this, ActivitySample.class);
            startActivity(myIntent);
            overridePendingTransition(R.anim.right_in, R.anim.left_out);
        }
        if (position == POS_FEEDBACK) {
            Intent myIntent = new Intent(MainActivity.this, Feedback.class);
            startActivity(myIntent);
            overridePendingTransition(R.anim.right_in, R.anim.left_out);
        }
        if (position == POS_DONATIONS) {
            try {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("market://details?id=" + this.getPackageName())));
            } catch (android.content.ActivityNotFoundException e) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://play.google.com/store/apps/details?id=" + this.getPackageName())));
            }
        }
        if (position == POS_EXIT) {
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setTitle(R.string.app_name);
            builder.setIcon(R.mipmap.ic_launcher);
            builder.setMessage("Do you want to exit?")
                    .setCancelable(false)
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            finish();
                        }
                    })
                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                        }
                    });
            AlertDialog alert = builder.create();
            alert.show();
        }
    }

    private DrawerItem createItemFor(int position) {
        return new SimpleItem(screenIcons[position], screenTitles[position])
                .withIconTint(color(R.color.textColorSecondary))
                .withTextTint(color(R.color.textColorPrimary))
                .withSelectedIconTint(color(R.color.colorAccent))
                .withSelectedTextTint(color(R.color.colorAccent));
    }

    private String[] loadScreenTitles() {
        return getResources().getStringArray(R.array.ld_activityScreenTitles);
    }

    private Drawable[] loadScreenIcons() {
        TypedArray ta = getResources().obtainTypedArray(R.array.ld_activityScreenIcons);
        Drawable[] icons = new Drawable[ta.length()];
        for (int i = 0; i < ta.length(); i++) {
            int id = ta.getResourceId(i, 0);
            if (id != 0) {
                icons[i] = ContextCompat.getDrawable(this, id);
            }
        }
        ta.recycle();
        return icons;
    }

    @ColorInt
    private int color(@ColorRes int res) {
        return ContextCompat.getColor(this, res);

    }
}