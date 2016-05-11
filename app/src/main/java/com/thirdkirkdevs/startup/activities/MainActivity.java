package com.thirdkirkdevs.startup.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

import com.thirdkirkdevs.startup.R;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {
    @Click(R.id.manage_alarms_btn)
    protected void gotoAlarmManager(){
        Intent i = new Intent(this, AlarmManagerActivity_.class);
        startActivity(i);
    }
}
