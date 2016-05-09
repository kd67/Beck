package com.rohan.beck;

/**
 * Created by Rohan on 2/2/2016.
 */
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import android.widget.Toast;
import android.content.Intent;

public class TabFragment3 extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View rootView =  inflater.inflate(R.layout.tab_fragment_3, container, false);
        return rootView;
    }

}
