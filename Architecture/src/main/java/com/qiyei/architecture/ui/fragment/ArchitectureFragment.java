package com.qiyei.architecture.ui.fragment;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.qiyei.architecture.R;
import com.qiyei.framework.fragment.BaseFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class ArchitectureFragment extends BaseFragment {


    public ArchitectureFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_architecture, container, false);
    }

}
