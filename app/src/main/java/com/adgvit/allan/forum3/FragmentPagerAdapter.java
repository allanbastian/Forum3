package com.adgvit.allan.forum3;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

/**
 * Created by Lenovo on 29-08-2017.
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
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0: return "FAQs";
            case 1: return "FORUM";
        }
        return super.getPageTitle(position);
    }
}
