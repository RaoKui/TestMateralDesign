package com.example.raokui.testmateraldesign;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = findViewById(R.id.tab_layout);
        viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(new MyAdapter(getSupportFragmentManager()));
        tabLayout.setupWithViewPager(viewPager);
    }


    private class MyAdapter extends FragmentPagerAdapter {

        String[] titles = {"one", "two", "three"};

        @Override
        public CharSequence getPageTitle(int position) {
            return titles[position];
        }

        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new TestFragment();
                case 1:
                    return new TestFragment();
                case 2:
                    return new TestFragment();
                default:
                    return new TestFragment();
            }
        }

        @Override
        public int getCount() {
            return 3;
        }
    }
}
