package com.example.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    private TextView texto;
    private TextView  texto1;
    private TextView  texto2;
    @Override

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        texto = (TextView) findViewById(R.id.button);
        texto1 = (TextView) findViewById(R.id.button2);
        texto2 = (TextView) findViewById(R.id.button3);

        Animation anim = AnimationUtils.loadAnimation(this, R.anim.anim);
        Animation derecha = AnimationUtils.loadAnimation(this, R.anim.derecha);
        Animation izquierda = AnimationUtils.loadAnimation(this, R.anim.izquierda);
        anim.reset();
        derecha.reset();
        izquierda.reset();
        texto.startAnimation(anim);
        texto1.startAnimation(derecha);
        texto2.startAnimation(izquierda);
    }




    public void zoomBack(View button)
    {
        startActivity(new Intent(this,SecondActivity.class));
        overridePendingTransition(R.anim.zoom_back_in, R.anim.zoom_back_out);
    }

}
