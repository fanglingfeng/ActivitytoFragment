package com.fanglingfeng.activitytofragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/*
 *  @项目名：  ActivitytoFragment 
 *  @包名：    com.fanglingfeng.activitytofragment
 *  @文件名:   MyFragment
 *  @创建者:   lingfeng
 *  @创建时间:  2017/4/4 21:55
 *  @描述：    TODO
 */
public class MyFragment
        extends android.app.Fragment
{
    private static final String TAG = "MyFragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment, container, false);
        view.findViewById(R.id.toActivity)
            .setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String toFragment = getArguments().getString("toFragment");
                    Toast.makeText(getActivity(), toFragment, Toast.LENGTH_LONG)
                         .show();

                }
            });
        getArguments().putString("fromFragment", "helloActivity");
        return view;

    }
}
