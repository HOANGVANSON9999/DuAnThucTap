package com.example.duanthuctap.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.duanthuctap.Fragment.HistoryFragment;
import com.example.duanthuctap.Fragment.OnComingFragment;
import com.example.duanthuctap.Fragment.Pr_OrdersFragment;

public class ViewPageAdapter extends FragmentStatePagerAdapter {
    public ViewPageAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Pr_OrdersFragment();
            case 1:
                return new OnComingFragment();
            case 2:
                return new HistoryFragment();
            default:
                return new Pr_OrdersFragment();
        }

    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position) {
            case 0:
                title = "Pr_Orders";
                break;
            case 1:
                title = "OnComing";
                break;
            case 2:
                title = "History";
                break;
        }

        return title;
    }
}
