package com.qiyei.opensource.ui.fragment;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.qiyei.opensource.R;
import com.qiyei.framework.fragment.BaseFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class OpenSourceFragment extends BaseFragment {


    public OpenSourceFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_open_source, container, false);
    }

}
