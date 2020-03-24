package com.example.recruitmentinformationcs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private TabLayout tablayout;
    private ViewPager viewPager;
    private TabItem tab_e, tab_bb, tab_c, tab_cl, tab_dm;
    public PagerAdapter pagerAdapter;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tablayout = (TabLayout) findViewById(R.id.tablayout);
        tab_e = (TabItem) findViewById(R.id.Events);
        tab_bb = (TabItem) findViewById(R.id.Bulletin);
        tab_c = (TabItem) findViewById(R.id.Contacts);
        tab_cl = (TabItem) findViewById(R.id.CourseL);
        tab_dm = (TabItem) findViewById(R.id.DegreeM);
        viewPager = findViewById(R.id.viewpager);

        pagerAdapter = new PageAdapter(getSupportFragmentManager(),tablayout.getTabCount());
        viewPager.setAdapter(pagerAdapter);

        tablayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if (tab.getPosition()==0) {
                    pagerAdapter.notifyDataSetChanged(); }
                    else if (tab.getPosition()==1) {
                        pagerAdapter.notifyDataSetChanged(); }
                       else if (tab.getPosition()==2) {
                            pagerAdapter.notifyDataSetChanged(); }
                            else if (tab.getPosition()==3) {
                        pagerAdapter.notifyDataSetChanged(); }
                        else if (tab.getPosition()==4) {
                        pagerAdapter.notifyDataSetChanged();
                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tablayout));


    }



    }

