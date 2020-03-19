package com.amartadev.covid19monitoring;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.amartadev.covid19monitoring.ui.country.CountryFragment;
import com.amartadev.covid19monitoring.ui.global.GlobalFragment;

public class PagerAdapter extends FragmentPagerAdapter {
    public PagerAdapter(FragmentManager fm){
        super(fm);

    }


    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new GlobalFragment();
            case 1:
                return new CountryFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Global";
            case 1:
                return "Country";
        }
        return super.getPageTitle(position);
    }
}
