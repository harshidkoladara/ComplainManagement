package com.hacks.complainmanagement;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.tabs.TabLayout;

public class log_sign extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_sign);

        Toolbar toolbar = findViewById(R.id.log_sign_activity_toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_close_black_24dp);

        tabLayout = findViewById(R.id.log_sign_tab);
        viewPager = findViewById(R.id.log_sign_pager);

        tabLayout.post(new Runnable() {
            @Override
            public void run() {
                tabLayout.setupWithViewPager(viewPager);
            }
        });

        FragmentManager fragmentManager = getSupportFragmentManager();
        CustomAdapter customAdapter = new CustomAdapter(fragmentManager);
        viewPager.setAdapter(customAdapter);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

    private class CustomAdapter extends FragmentPagerAdapter {
        public CustomAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            switch (position){
                case 0:
                    return "Log IN";
                case 1:
                    return "Sign up";
            }
            return null;
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    return new login_fragment();
                case 1:
                    return new signup_fragment();
            }
            return null;
        }

        @Override
        public int getCount() {
            return 2;
        }
    }
}
