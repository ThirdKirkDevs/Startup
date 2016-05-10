package com.thirdkirkdevs.startup.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.thirdkirkdevs.startup.R;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {
    @Click(R.id.alarm_manger_button)
    protected void gotoAlarmManager(){
        Intent i = new Intent(this, AlarmManagerActivity_.class);
        startActivity(i);
    }
}
