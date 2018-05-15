package com.jning.unittest;

import android.content.pm.Signature;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,
                BuildConfig.BUILD_TYPE+"\n"+
                        BuildConfig.DEBUG+"\n"+
                        BuildConfig.FLAVOR+"\n"
                ,Toast.LENGTH_LONG).show();
    }
}
