package br.eti.kge.ciclovidaactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Activity2 extends AppCompatActivity {

    private static final String TAG_CICLO = "CicloVidaB";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Log.i(TAG_CICLO, getClass().getName() + ".onCreate()");
    }

    public void btnVoltarClick(View v) {
        this.finish();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG_CICLO, getClass().getName() + ".onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG_CICLO, getClass().getName() + ".onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG_CICLO, getClass().getName() + ".onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG_CICLO, getClass().getName() + ".onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG_CICLO, getClass().getName() + ".onRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG_CICLO, getClass().getName() + ".onDestroy()");
    }

}