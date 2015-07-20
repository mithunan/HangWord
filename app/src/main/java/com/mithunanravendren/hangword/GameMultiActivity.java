package com.mithunanravendren.hangword;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class GameMultiActivity extends Activity implements View.OnClickListener {

    String mWord;
    String mLetterPressed;
    int mFailCounter = 0;
    int mGuessedLetters = 0;
    int mPoints = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_game);

        String wordSent = getIntent().getStringExtra("WORD_IDENTIFIER");
        Log.d("MYLOG",wordSent);

        mWord = wordSent;
        createTextViews(wordSent);

        Button a = (Button) findViewById(R.id.btnA);
        a.setOnClickListener(this); // calling onClick() method
        Button b = (Button) findViewById(R.id.btnB);
        b.setOnClickListener(this); // calling onClick() method
        Button c = (Button) findViewById(R.id.btnC);
        c.setOnClickListener(this); // calling onClick() method
        Button d = (Button) findViewById(R.id.btnD);
        d.setOnClickListener(this); // calling onClick() method
        Button e = (Button) findViewById(R.id.btnE);
        e.setOnClickListener(this); // calling onClick() method
        Button f = (Button) findViewById(R.id.btnF);
        f.setOnClickListener(this); // calling onClick() method
        Button g = (Button) findViewById(R.id.btnG);
        g.setOnClickListener(this); // calling onClick() method
        Button h = (Button) findViewById(R.id.btnH);
        h.setOnClickListener(this); // calling onClick() method
        Button i = (Button) findViewById(R.id.btnI);
        i.setOnClickListener(this); // calling onClick() method
        Button j = (Button) findViewById(R.id.btnJ);
        j.setOnClickListener(this); // calling onClick() method
        Button k = (Button) findViewById(R.id.btnK);
        k.setOnClickListener(this); // calling onClick() method
        Button l = (Button) findViewById(R.id.btnL);
        l.setOnClickListener(this); // calling onClick() method
        Button m = (Button) findViewById(R.id.btnM);
        m.setOnClickListener(this); // calling onClick() method
        Button n = (Button) findViewById(R.id.btnN);
        n.setOnClickListener(this); // calling onClick() method
        Button o = (Button) findViewById(R.id.btnO);
        o.setOnClickListener(this); // calling onClick() method
        Button p = (Button) findViewById(R.id.btnP);
        p.setOnClickListener(this); // calling onClick() method
        Button q = (Button) findViewById(R.id.btnQ);
        q.setOnClickListener(this); // calling onClick() method
        Button r = (Button) findViewById(R.id.btnR);
        r.setOnClickListener(this); // calling onClick() method
        Button s = (Button) findViewById(R.id.btnS);
        s.setOnClickListener(this); // calling onClick() method
        Button t = (Button) findViewById(R.id.btnT);
        t.setOnClickListener(this); // calling onClick() method
        Button u = (Button) findViewById(R.id.btnU);
        u.setOnClickListener(this); // calling onClick() method
        Button v = (Button) findViewById(R.id.btnV);
        v.setOnClickListener(this); // calling onClick() method
        Button w = (Button) findViewById(R.id.btnW);
        w.setOnClickListener(this); // calling onClick() method
        Button x = (Button) findViewById(R.id.btnX);
        x.setOnClickListener(this); // calling onClick() method
        Button y = (Button) findViewById(R.id.btnY);
        y.setOnClickListener(this); // calling onClick() method
        Button z = (Button) findViewById(R.id.btnZ);
        z.setOnClickListener(this); // calling onClick() method

    }

    @Override
    public void onClick(View v){
        switch (v.getId()) {

            case R.id.btnA:
                mLetterPressed = "A";
                Log.d("MYLOG", "The letter button pressed is " + mLetterPressed);
                letterPressed(mLetterPressed);
                break;
            case R.id.btnB:
                mLetterPressed = "B";
                Log.d("MYLOG", "The letter button pressed is " + mLetterPressed);
                letterPressed(mLetterPressed);
                break;
            case R.id.btnC:
                mLetterPressed = "C";
                Log.d("MYLOG", "The letter button pressed is " + mLetterPressed);
                letterPressed(mLetterPressed);
                break;
            case R.id.btnD:
                mLetterPressed = "D";
                Log.d("MYLOG", "The letter button pressed is " + mLetterPressed);
                letterPressed(mLetterPressed);
                break;
            case R.id.btnE:
                mLetterPressed = "E";
                Log.d("MYLOG", "The letter button pressed is " + mLetterPressed);
                letterPressed(mLetterPressed);
                break;
            case R.id.btnF:
                mLetterPressed = "F";
                Log.d("MYLOG", "The letter button pressed is " + mLetterPressed);
                letterPressed(mLetterPressed);
                break;
            case R.id.btnG:
                mLetterPressed = "G";
                Log.d("MYLOG", "The letter button pressed is " + mLetterPressed);
                letterPressed(mLetterPressed);
                break;
            case R.id.btnH:
                mLetterPressed = "H";
                Log.d("MYLOG", "The letter button pressed is " + mLetterPressed);
                letterPressed(mLetterPressed);
                break;
            case R.id.btnI:
                mLetterPressed = "I";
                Log.d("MYLOG", "The letter button pressed is " + mLetterPressed);
                letterPressed(mLetterPressed);
                break;
            case R.id.btnJ:
                mLetterPressed = "J";
                Log.d("MYLOG", "The letter button pressed is " + mLetterPressed);
                letterPressed(mLetterPressed);
                break;
            case R.id.btnK:
                mLetterPressed = "K";
                Log.d("MYLOG", "The letter button pressed is " + mLetterPressed);
                letterPressed(mLetterPressed);
                break;
            case R.id.btnL:
                mLetterPressed = "L";
                Log.d("MYLOG", "The letter button pressed is " + mLetterPressed);
                letterPressed(mLetterPressed);
                break;
            case R.id.btnM:
                mLetterPressed = "M";
                Log.d("MYLOG", "The letter button pressed is " + mLetterPressed);
                letterPressed(mLetterPressed);
                break;
            case R.id.btnN:
                mLetterPressed = "N";
                Log.d("MYLOG", "The letter button pressed is " + mLetterPressed);
                letterPressed(mLetterPressed);
                break;
            case R.id.btnO:
                mLetterPressed = "O";
                Log.d("MYLOG", "The letter button pressed is " + mLetterPressed);
                letterPressed(mLetterPressed);
                break;
            case R.id.btnP:
                mLetterPressed = "P";
                Log.d("MYLOG", "The letter button pressed is " + mLetterPressed);
                letterPressed(mLetterPressed);
                break;
            case R.id.btnQ:
                mLetterPressed = "Q";
                Log.d("MYLOG", "The letter button pressed is " + mLetterPressed);
                letterPressed(mLetterPressed);
                break;
            case R.id.btnR:
                mLetterPressed = "R";
                Log.d("MYLOG", "The letter button pressed is " + mLetterPressed);
                letterPressed(mLetterPressed);
                break;
            case R.id.btnS:
                mLetterPressed = "S";
                Log.d("MYLOG", "The letter button pressed is " + mLetterPressed);
                letterPressed(mLetterPressed);
                break;
            case R.id.btnT:
                mLetterPressed = "T";
                Log.d("MYLOG", "The letter button pressed is " + mLetterPressed);
                letterPressed(mLetterPressed);
                break;
            case R.id.btnU:
                mLetterPressed = "U";
                Log.d("MYLOG", "The letter button pressed is " + mLetterPressed);
                letterPressed(mLetterPressed);
                break;
            case R.id.btnV:
                mLetterPressed = "V";
                Log.d("MYLOG", "The letter button pressed is " + mLetterPressed);
                letterPressed(mLetterPressed);
                break;
            case R.id.btnW:
                mLetterPressed = "W";
                Log.d("MYLOG", "The letter button pressed is " + mLetterPressed);
                letterPressed(mLetterPressed);
                break;
            case R.id.btnY:
                mLetterPressed = "Y";
                Log.d("MYLOG", "The letter button pressed is " + mLetterPressed);
                letterPressed(mLetterPressed);
                break;
            case R.id.btnX:
                mLetterPressed = "X";
                Log.d("MYLOG", "The letter button pressed is " + mLetterPressed);
                letterPressed(mLetterPressed);
                break;
            case R.id.btnZ:
                mLetterPressed = "Z";
                Log.d("MYLOG", "The letter button pressed is " + mLetterPressed);
                letterPressed(mLetterPressed);
                break;

            default:
                break;
        }
    }

    public void createTextViews(String word){
        LinearLayout layoutLetters = (LinearLayout) findViewById(R.id.layoutLetters);

        for (int i = 0; i < word.length() ; i++){
            TextView newTextView = (TextView) getLayoutInflater().inflate(R.layout.textview,null);
            layoutLetters.addView(newTextView);
        }
    }

    public void letterPressed(String mLetterPressed){

        char charPressed = mLetterPressed.charAt(0);
        boolean letterGuessed = false;

        //check if letter is in word to guess
        for ( int i = 0 ; i < mWord.length() ; i++){
            char charFromTheWord = mWord.charAt(i);
            if (charFromTheWord == charPressed){
                Log.d("MYLOG", "There was one match from custom keyboard");
                letterGuessed = true;
                showLettersAtIndex(i,charPressed);
                mGuessedLetters++;
            }else{

            }
        }
        if (!letterGuessed) {
            letterFailed(Character.toString(charPressed));
            Toast.makeText(this,"Sorry No Match", Toast.LENGTH_SHORT).show();
        }
        if (mGuessedLetters == mWord.length()){
            //SCORE ONE POINT
            mPoints++;
            //CLEAR THE PREVIOUS WORD
            clearScreen();
            //Remove the multiActivity from the stack
            finish();
        }
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
            finish();
        }
    }

    public void showLettersAtIndex(int position, char letterGuessed){
        LinearLayout layoutLetter = (LinearLayout) findViewById(R.id.layoutLetters);
        TextView textView = (TextView) layoutLetter.getChildAt(position);
        textView.setText(Character.toString(letterGuessed));
    }




    /**
     * Retrieving the letter introduced on the editText
     * @param v (button clicked)
     **/
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
            Log.d("MYLOG", "The letter we are cycling through in the FOR is "+charFromTheWord);
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
            finish();
        }
    }

}