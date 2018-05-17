package com.jning.unittest;

import android.content.pm.Signature;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String infoStr=
                "build type: "+BuildConfig.BUILD_TYPE+"\n"+
                        "debug: "+BuildConfig.DEBUG+"\n"+
                        "flavor: "+BuildConfig.FLAVOR+"\n"+
                        "vCode: "+BuildConfig.VERSION_CODE +"\n"+
                        "vName: "+BuildConfig.VERSION_NAME;
        ((TextView)findViewById(R.id.tv_info)).setText(infoStr);
        ((TextView)findViewById(R.id.tv_hello)).setText();

    }
}
