package com.example.vishnu.fresh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Math.tan;

public class Main2Activity extends AppCompatActivity {



    EditText pdeg1;
    EditText pdeg2;
    EditText tdeg1;
    EditText tdeg2;
    EditText pmin1;
    EditText pmin2;
    EditText tmin1;
    EditText tmin2;
    EditText psec1;
    EditText psec2;
    EditText tsec1;
    EditText tsec2;
    TextView textView3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);





            pdeg1 = (EditText) findViewById(R.id.pdeg1);
            pdeg2 = (EditText) findViewById(R.id.pdeg2);
            tdeg1 = (EditText) findViewById(R.id.tdeg1);
            tdeg2 = (EditText) findViewById(R.id.tdeg2);
            pmin1 = (EditText) findViewById(R.id.pmin1);
            pmin2 = (EditText) findViewById(R.id.pmin2);
            tmin1 = (EditText) findViewById(R.id.tmin1);
            tmin2 = (EditText) findViewById(R.id.tmin2);
            psec1 = (EditText) findViewById(R.id.psec2);
            psec2 = (EditText) findViewById(R.id.psec1);
            tsec1 = (EditText) findViewById(R.id.tsec1);
            tsec2 = (EditText) findViewById(R.id.tsec2);
            textView3 = (TextView)findViewById(R.id.textView3);



            Button calc = (Button) findViewById(R.id.calculate);
            calc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String def="0";
                    float pdegg1;
                    float pdegg2;
                    float tdegg1;
                    float tdegg2;
                    float pminn1;
                    float pminn2;
                    float tminn1;
                    float tminn2;
                    float psecc1;
                    float psecc2;
                    float tsecc1;
                    float tsecc2;

                    if(TextUtils.isEmpty(pdeg1.getText()))
                    {
                        pdegg1 = Float.parseFloat(def);
                    }
                    else
                    {
                        pdegg1 = Float.parseFloat(pdeg1.getText().toString());
                    }

                    if(TextUtils.isEmpty(pdeg2.getText()))
                    {
                        pdegg2 = Float.parseFloat(def);
                    }
                    else
                    {
                        pdegg2 = Float.parseFloat(pdeg2.getText().toString());
                    }

                    if(TextUtils.isEmpty(tdeg1.getText()))
                    {
                        tdegg1 = Float.parseFloat(def);
                    }
                    else
                    {
                        tdegg1 = Float.parseFloat(tdeg1.getText().toString());
                    }
                    if(TextUtils.isEmpty(tdeg2.getText()))
                    {
                        tdegg2 = Float.parseFloat(def);
                    }
                    else
                    {
                        tdegg2 = Float.parseFloat(tdeg2.getText().toString());
                    }
                    if(TextUtils.isEmpty(pmin1.getText()))
                    {
                       pminn1 = Float.parseFloat(def);
                    }
                    else
                    {
                        pminn1 = Float.parseFloat(pmin1.getText().toString());
                    }
                    if(TextUtils.isEmpty(pmin2.getText()))
                    {
                        pminn2 = Float.parseFloat(def);
                    }
                    else
                    {
                        pminn2 = Float.parseFloat(pmin2.getText().toString());
                    }
                    if(TextUtils.isEmpty(tmin1.getText()))
                    {
                        tminn1 = Float.parseFloat(def);
                    }
                    else
                    {
                        tminn1 = Float.parseFloat(tmin1.getText().toString());
                    }
                    if(TextUtils.isEmpty(tmin2.getText()))
                    {
                        tminn2 = Float.parseFloat(def);
                    }
                    else
                    {
                        tminn2 = Float.parseFloat(tmin2.getText().toString());
                    }
                    if(TextUtils.isEmpty(psec1.getText()))
                    {
                        psecc1 = Float.parseFloat(def);
                    }
                    else
                    {
                       psecc1 = Float.parseFloat(psec1.getText().toString());
                    }
                    if(TextUtils.isEmpty(psec2.getText()))
                    {
                        psecc2 = Float.parseFloat(def);
                    }
                    else
                    {
                        psecc2 = Float.parseFloat(psec2.getText().toString());
                    }
                    if(TextUtils.isEmpty(tsec1.getText()))
                    {
                        tsecc1 = Float.parseFloat(def);
                    }
                    else
                    {
                       tsecc1 = Float.parseFloat(tsec1.getText().toString());

                    }
                    if(TextUtils.isEmpty(tsec2.getText()))
                    {
                        tsecc2 = Float.parseFloat(def);
                    }
                    else
                    {
                        tsecc2 = Float.parseFloat(tsec2.getText().toString());
                    }


                    float lattitude1 = pdegg1 + pminn1/60 + psecc1/3600;
                    float lattitude2 = tdegg1 + tminn1/60 + tsecc1/3600;
                    float longitude1 = pdegg2 + pminn2/60 + psecc2/3600;
                    float longitude2 = tdegg2 + tminn2/60 + tsecc2/3600;

                   float  lat1 = (float) Math.toRadians(lattitude1);
                   float lng1 = (float) Math.toRadians(longitude1);
                   float lat2 = (float) Math.toRadians(lattitude2);
                   float lng2 = (float) Math.toRadians(longitude2);

                    float dlon = lng2 - lng1;
                    float dlat = lat2 - lat1;

                    float a = (float) (Math.pow((Math.sin(dlat/2)),2) + Math.cos(lat1) * Math.cos(lat2) * Math.pow(Math.sin(dlon/2),2));

                    float c = (float) (2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a)));

                    float  dist = (float) (6371*c);
                    textView3.setText(Float.toString(dist));





                }
            });
        }}

