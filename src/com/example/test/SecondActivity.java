package com.example.test;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import static com.example.test.R.*;


/**
 * Created by suki on 27/03/14.
 */
public class SecondActivity extends Activity
{

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(layout.second_activity);
    }

    public void zoomBack(View button)
    {
        startActivity(new Intent(this,MyActivity.class));
        overridePendingTransition(anim.zoom_back_in, anim.zoom_back_out);
    }
}