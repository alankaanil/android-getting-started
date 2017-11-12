package com.jarvis.android.criminalintent.activities;

import android.support.v4.app.Fragment;

import com.jarvis.android.criminalintent.fragments.CrimeListFragment;
import com.jarvis.android.criminalintent.models.Crime;
import com.jarvis.android.criminalintent.models.CrimeLab;

import java.util.List;

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
