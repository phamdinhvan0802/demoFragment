package com.example.fragmentss2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SVInfo_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_svinfo2);

        Intent intent = getIntent();

        Sv sv = (Sv) intent.getSerializableExtra("thongtin");

        FragmentSVInfo svInfo = (FragmentSVInfo) getFragmentManager().findFragmentById(R.id.FragInfo);

        svInfo.setInfo(sv);
    }
}