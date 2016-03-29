package se.andreasottesen.tvfavourite.ui;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class SectionPageAdapter extends FragmentStatePagerAdapter {

    public SectionPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;

        switch (position)
        {
            case 0:
                fragment = new FindShowFragment();
                break;
            case 1:
                fragment = new FindShowFragment();
                break;
            default:
                fragment = new FindShowFragment();
                break;

        }
        return fragment;
    }

    @Override
    public CharSequence getPageTitle(int position)
    {
        return "default title";
    }

    @Override
    public int getCount() {
        return 2;
    }
}
