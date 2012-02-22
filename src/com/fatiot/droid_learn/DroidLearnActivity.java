package com.fatiot.droid_learn;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class DroidLearnActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        TextView tv = new TextView(this);
        tv.setText("Sup mang!");

        setContentView(tv);
    }
}
