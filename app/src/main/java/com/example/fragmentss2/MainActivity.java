package com.example.fragmentss2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements TruyenSV{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void DataStudent(Sv sv) {
        FragmentSVInfo fragmentSVInfo = (FragmentSVInfo) getFragmentManager().findFragmentById(R.id.fragsvinfo);

        if(fragmentSVInfo != null && fragmentSVInfo.isInLayout()){
            fragmentSVInfo.setInfo(sv);
        }
        else {
            Intent intent = new Intent(MainActivity.this, SVInfo_2.class);
            intent.putExtra("thongtin", sv);
            startActivity(intent);
        }
    }
}