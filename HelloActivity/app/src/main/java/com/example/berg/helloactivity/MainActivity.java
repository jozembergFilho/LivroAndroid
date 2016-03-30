package com.example.berg.helloactivity;

import android.os.Bundle;
import android.util.Log;

/**
 * Created by Berg on 29/03/16.
 */
public class MainActivity extends DebugActivity {

    protected static final String TAG = "livro";

    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        Log.i(TAG, getClassName() + ".onCreate() chamado: " + icicle);
    }
    protected void onStart(){
        super.onStart();
        Log.i(TAG, getClassName() + ".onStart() chamado.");
    }
    protected void onRestart(){
        super.onRestart();
        Log.i(TAG, getClassName() + ".onRestart() chamado.");
    }
    protected void onResume(){
        super.onResume();
        Log.i(TAG, getClassName() + ".onResume() chamado.");
    }
    protected void onPause(){
        super.onPause();
        Log.i(TAG, getClassName() + ".onPause() chamado.");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        Log.i(TAG, getClassName() + ".onSaveInstanceState() chamado.");
    }
    protected void onStop(){
        super.onStop();
        Log.i(TAG, getClassName() + ".onStop() chamado.");
    }
    protected void onDestroy(){
        super.onDestroy();
        Log.i(TAG, getClassName() + ".onDestroy() chamado.");
    }

    private String getClassName() {
        String s = getClass().getName();
        return  s.substring(s.lastIndexOf("."));
    }
}
