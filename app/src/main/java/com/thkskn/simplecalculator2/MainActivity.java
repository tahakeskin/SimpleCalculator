package com.thkskn.simplecalculator2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.ads.*;


public class MainActivity extends Activity {

    private EditText e1,e2;
    private Button b1,b2,b3,b4;

    private double bir,iki,sonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //assign textview
        e1=(EditText)findViewById(R.id.edit_text_1);
        e2=(EditText)findViewById(R.id.edit_text_2);

        //assign Button
        b1=(Button)findViewById(R.id.Button_Plus);
        b2=(Button)findViewById(R.id.Button_Minus);
        b3=(Button)findViewById(R.id.Button_Multiply);
        b4=(Button)findViewById(R.id.Button_Divide);

        // Java code required.
        // testDevices and loadAdOnCreate attributes are
        // no longer available.
        AdView adView = (AdView)this.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .addTestDevice("TEST_DEVICE_ID")
                .build();
        adView.loadAd(adRequest);


    }

    public void onClickButton(View view) {

        bir=Double.valueOf(e1.getText().toString());
        iki=Double.valueOf(e2.getText().toString());


        switch (view.getId())
        {
            case (R.id.Button_Plus):
                sonuc=bir+iki;
                Toast.makeText(this,String.valueOf(sonuc),Toast.LENGTH_SHORT).show();
                break;
            case (R.id.Button_Minus):
                sonuc=bir-iki;
                Toast.makeText(this,String.valueOf(sonuc),Toast.LENGTH_SHORT).show();
                break;
            case (R.id.Button_Multiply):
                sonuc=bir*iki;
                Toast.makeText(this,String.valueOf(sonuc),Toast.LENGTH_SHORT).show();
                break;
            case (R.id.Button_Divide):
                sonuc=bir/iki;
                Toast.makeText(this,String.valueOf(sonuc),Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
