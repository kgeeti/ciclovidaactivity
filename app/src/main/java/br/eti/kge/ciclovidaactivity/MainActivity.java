package br.eti.kge.ciclovidaactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String TAG_CICLO = "CicloVidaA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG_CICLO, getClass().getName() + ".onCreate()");

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


    public void btnAbreJanelaClick(View v) {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }


}