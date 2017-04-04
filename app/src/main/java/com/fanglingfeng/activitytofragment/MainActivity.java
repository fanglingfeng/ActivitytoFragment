package com.fanglingfeng.activitytofragment;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity
        extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager  fragmentManager = getFragmentManager();
        final MyFragment myFragment      = new MyFragment();
        fragmentManager.beginTransaction()
                       .add(R.id.Fragment, myFragment)
                       .commit();


        findViewById(R.id.fromFragment).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle       = myFragment.getArguments();
                String fromFragment = bundle.getString("fromFragment");
                Toast.makeText(MainActivity.this, fromFragment, Toast.LENGTH_LONG)
                     .show();
            }
        });
        Bundle bundle = new Bundle();
        bundle.putString("toFragment", "helloFragment");
        myFragment.setArguments(bundle);
    }
}
