package com.nasirusalisugada.englishapp;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(32, 32, 32, 32);
        layout.setBackgroundColor(Color.WHITE);

        TextView title = new TextView(this);
        title.setText("English Learning App");
        title.setTextSize(28);
        title.setTextColor(Color.BLACK);
        title.setGravity(Gravity.CENTER);

        TextView subtitle = new TextView(this);
        subtitle.setText(
                "\nLearn English • Practice • Improve\n\n" +
                "Developer: NASIRU SALISU GADA"
        );
        subtitle.setTextSize(17);
        subtitle.setTextColor(Color.DKGRAY);
        subtitle.setGravity(Gravity.CENTER);

        layout.addView(title);
        layout.addView(subtitle);

        setContentView(layout);
    }
}
