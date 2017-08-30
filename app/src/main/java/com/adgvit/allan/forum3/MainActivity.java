package com.adgvit.allan.forum3;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.*;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabs;
    private ViewPager pager;
    private EditText doubt;
    private Button Send;
    private android.support.v4.app.FragmentPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabs = (TabLayout) findViewById(R.id.tabs);
        pager = (ViewPager) findViewById(R.id.pager);
        doubt = (EditText) findViewById(R.id.doubt);
        Send = (Button) findViewById(R.id.send);
        adapter = new FragmentPagerAdapter(getSupportFragmentManager());
        pager.setAdapter(adapter);
        tabs.setupWithViewPager(pager);
        Send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ques = doubt.getText().toString();
                //POST ques to server
            }
        });
    }
}
