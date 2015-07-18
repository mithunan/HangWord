package com.mithunanravendren.hangword;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class GameActivity extends Activity {


    String mWord;
    int mFailCounter = 0;
    int mGuessedLetters = 0;
    int mPoints = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        setRandomWord();
    }


    /**
     * Retrieving the letter introduced on the editText
     * @param v (button clicked)
     */
    public void introduceLetter(View v){

        EditText myEditText = (EditText) findViewById(R.id.editTextLetter);

        String letter = myEditText.getText().toString();

        myEditText.setText("");

        Log.d("MYLOG", "The letter is " + letter);

        if (letter.length() == 1 ){
            checkLetter(letter.toUpperCase());
        } else {
            Toast.makeText(this,"Please enter a letter", Toast.LENGTH_SHORT).show();
        }

    }


    /**
     * Checking if the letter introduced matches any letter in the word to guess
     * @param introducedLetter
     */

    public void checkLetter(String introducedLetter){

        char charIntroduced = introducedLetter.charAt(0);
        boolean letterGuessed = false;

        for ( int i = 0 ; i < mWord.length() ; i++){

            char charFromTheWord = mWord.charAt(i);
            Log.d("MYLOG", "The letter we are cycling through in the FOR is"+charFromTheWord);

            if (charFromTheWord == charIntroduced){
                Log.d("MYLOG", "There was one match");
                letterGuessed = true;
                showLettersAtIndex(i,charIntroduced);
                mGuessedLetters++;
            }else{
            }
        }

        if (letterGuessed == false) {
            letterFailed(Character.toString(charIntroduced));
        }

        if (mGuessedLetters == mWord.length()){
            //SCORE ONE POINT
            mPoints++;
            //CLEAR THE PREVIOUS WORD
            clearScreen();

            //START THE NEXT LEVEL
            setRandomWord();
        }
    }


    public void setRandomWord(){

        String words = "WORD BIRD HERD STOP MUST";

        String[] arrayWords = words.split(" ");

        Log.d("MYLOG","The Array length "+arrayWords.length);

        int randomNumber = (int) (Math.random() * arrayWords.length);

        String randomWord = arrayWords[randomNumber];

        mWord = randomWord;

    }

    public void clearScreen(){
        //clear the guessed letters
        TextView textViewFailed = (TextView) findViewById(R.id.textView7);
        textViewFailed.setText("");

        //reset counters
        mGuessedLetters = 0;
        mFailCounter = 0;

        //Clear the spots where the letters were filled in
        LinearLayout layoutLetters = (LinearLayout) findViewById(R.id.layoutLetters);
        for (int i=0 ; i < layoutLetters.getChildCount() ; i++){
            TextView currentTextView = (TextView) layoutLetters.getChildAt(i);
            currentTextView.setText("_");
        }

        //Reset the image
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.hangdroid_0);

    }


    public void letterFailed(String letterFailed){

        TextView textViewFailed = (TextView) findViewById(R.id.textView7);
        String previousFail = textViewFailed.getText().toString();
        textViewFailed.setText(previousFail+letterFailed);

        mFailCounter++;
        ImageView imageView = (ImageView) findViewById(R.id.imageView);

        if(mFailCounter == 1) {
            imageView.setImageResource(R.drawable.hangdroid_1);
        }else if (mFailCounter == 2){
            imageView.setImageResource(R.drawable.hangdroid_2);
        }else if (mFailCounter == 3){
            imageView.setImageResource(R.drawable.hangdroid_3);
        }else if (mFailCounter == 4){
            imageView.setImageResource(R.drawable.hangdroid_4);
        }else if (mFailCounter == 5){
            imageView.setImageResource(R.drawable.hangdroid_5);
        }else if (mFailCounter == 6){

            Intent gameOverIntent = new Intent(this,GameOverActivity.class);
            gameOverIntent.putExtra("POINTS_IDENTIFIER",mPoints);
            startActivity(gameOverIntent);
            finish();
        }
    }

    /**
     * Display a letter guessed by the user
     * @param position
     * @param letterGuessed
     */
    public void showLettersAtIndex(int position, char letterGuessed){

        LinearLayout layoutLetter = (LinearLayout) findViewById(R.id.layoutLetters);

        TextView textView = (TextView) layoutLetter.getChildAt(position);

        textView.setText(Character.toString(letterGuessed));
    }



//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_game, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
}
