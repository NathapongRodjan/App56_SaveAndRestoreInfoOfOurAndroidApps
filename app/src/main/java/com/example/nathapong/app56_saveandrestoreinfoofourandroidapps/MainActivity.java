package com.example.nathapong.app56_saveandrestoreinfoofourandroidapps;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView txtHi;
    Button btnHi;

    String stringValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        letCreateAToast("OnCreate Method is Called");

        txtHi = (TextView)findViewById(R.id.txtHi);
        btnHi = (Button)findViewById(R.id.btnHi);


        btnHi.setOnClickListener(MainActivity.this);

    }

    @Override
    public void onClick(View v) {

        stringValue = "Hi !!!";
        txtHi.setText(stringValue);

    }

    public void letCreateAToast(String message){
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        letCreateAToast("OnStart Method is Called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        letCreateAToast("OnResume Method is Called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        letCreateAToast("OnPause Method is Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        letCreateAToast("OnStop Method is Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        letCreateAToast("OnDestroy Method is Called");
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        letCreateAToast("OnSaveInstanceState Method is Called");

        savedInstanceState.putString("STRING_VALUE", stringValue);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        letCreateAToast("OnRestoreInstanceState Method is Called");

        stringValue = savedInstanceState.getString("STRING_VALUE");
        txtHi.setText(stringValue);
    }
}
