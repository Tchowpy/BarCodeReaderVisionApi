package com.tchow.barcodereadervisionapi;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Yougourta on 12/31/16.
 */

public class Result extends AppCompatActivity
{
    //Toolbar
    @Bind(R.id.toolbar)
    Toolbar toolbar;


    @Bind(R.id.result)
    TextView result;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_activity);
        ButterKnife.bind(this);

        //Adding the toolbar
        setSupportActionBar(toolbar);

        //Customising by adding the humbourger icon
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeAsUpIndicator(R.drawable.ic_menu);
        actionBar.setDisplayHomeAsUpEnabled(true);

        Bundle extras = getIntent().getExtras();
        result.setText(extras.getString("TCHOWH"));
    }
}
