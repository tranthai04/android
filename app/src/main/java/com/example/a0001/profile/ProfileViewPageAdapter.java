package com.example.a0001.profile;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.a0001.fragment.NewsFragment;
import com.example.a0001.fragment.ProfileFragment;

public class ProfileViewPageAdapter extends FragmentStatePagerAdapter {
    public ProfileViewPageAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Tab1Fragment();
            case 1:
                return new Tab2Fragment();
            default:
                return new Tab1Fragment();
        }

    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Logo Trường ";
            case 1:
                return "Thông tin cá nhân";
            default:
                return "Logo Trường";
        }
    }
}
