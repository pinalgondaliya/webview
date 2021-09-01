package com.oscar.career.myapplication;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.oscar.career.myapplication.frag.BlankFragment;
import com.oscar.career.myapplication.frag.BlankFragment2;
import com.oscar.career.myapplication.frag.BlankFragment3;

public class MyPAgerAdpater extends FragmentStatePagerAdapter {


    public MyPAgerAdpater(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new BlankFragment();
            case 1: return new BlankFragment2();
            case 2: return new BlankFragment3();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
