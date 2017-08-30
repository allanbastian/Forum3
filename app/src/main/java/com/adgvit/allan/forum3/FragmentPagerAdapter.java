package com.adgvit.allan.forum3;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

/**
 * Created by Allan on 29-08-2017.
 */

public class FragmentPagerAdapter extends android.support.v4.app.FragmentPagerAdapter {

    public FragmentPagerAdapter(FragmentManager fm) {
        //required constructor
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: UserFragment userFragment = new UserFragment();
                    return userFragment;
            case 1: ForumFragment forumFragment = new ForumFragment();
                    return forumFragment;
            case 2: TrendingFragment trendingFragment = new TrendingFragment();
                    return trendingFragment;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0: return "FAQs";
            case 1: return "FORUM";
            case 2:return "TRENDING";
        }
        return super.getPageTitle(position);
    }
}
