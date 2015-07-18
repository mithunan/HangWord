package com.mithunanravendren.hangword;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    //@@@@@@ - - - NOTES
    //Public can be called from other activities, java or xml files
    //Private can only be called from the same class

    public void startSinglePlayerGame(View v) {
        Intent myIntent = new Intent(this,GameActivity.class);
        startActivity(myIntent);
    }


    public void startMultiGame(View v){
        Intent myIntent = new Intent(this,MultiplayerActivity.class);
        startActivity(myIntent);
    }


    public void openScores(View v){
        Intent myIntent = new Intent(this,ScoresActivity.class);
        startActivity(myIntent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
