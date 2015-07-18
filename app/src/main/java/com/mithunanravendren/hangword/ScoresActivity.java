package com.mithunanravendren.hangword;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class ScoresActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scores);

        SharedPreferences preferences = getSharedPreferences("MYSCORES",MODE_PRIVATE);

        String scores = preferences.getString("SCORES","NO SCORES");

        TextView textViewScores = (TextView) findViewById(R.id.textViewScores);

        textViewScores.setText(scores);
    }


}
