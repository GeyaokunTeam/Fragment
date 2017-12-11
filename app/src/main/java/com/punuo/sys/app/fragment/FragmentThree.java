package com.punuo.sys.app.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by asus on 2017/11/8.
 */

public class FragmentThree extends Fragment implements View.OnClickListener {
    private Button mBtn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_three, container, false);
        mBtn = (Button) view.findViewById(R.id.id_fragment_three_btn);
        mBtn.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(getActivity(), " i am a btn in Fragment three",
                Toast.LENGTH_SHORT).show();
    }


}
