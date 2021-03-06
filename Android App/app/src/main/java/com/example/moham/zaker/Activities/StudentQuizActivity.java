package com.example.moham.zaker.Activities;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.moham.zaker.Data.MyDBManager;
import com.example.moham.zaker.R;

import java.util.List;
import java.util.Random;

public class StudentQuizActivity extends AppCompatActivity {

    private MyDBManager db;
    public int i;
    public String word;
    public String trans;
    public String randWord;
    int score = 0;
    int QUIZ_SIZE;
    public int quizNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_quiz_list);

        Intent intent = getIntent();
        quizNumber = intent.getIntExtra("quizNumber", 1);

        // get ONLY the RIGHT words from the database; words with the right quiz_id
        db = MyDBManager.getInstance(getApplicationContext());
        Cursor cursor = db.selectWordsFromQuiz(quizNumber);

        // Initialize iterator to one
        i = 1;
        nextWord();
    }

    public void nextWord(){
        // get database
        db = MyDBManager.getInstance(getApplicationContext());

        // get a list with the words & translation. since it's only 2 items, a hash map is overkill
        List cursor = db.getWordAndTranslation(i, quizNumber);
        TextView txt = (TextView) findViewById(R.id.txt_question);
        word = (String) cursor.get(0);
        trans = (String) cursor.get(1);

        // get a ransom translation as a test word
        Random rand = new Random();
        int n = rand.nextInt(QUIZ_SIZE) + 1;
        cursor = db.getWordAndTranslation(n, quizNumber);
        randWord = (String) cursor.get(1);

        // Set the text for the question
        txt.setText("Does " + word + " mean " + randWord + "?");

    }

    public void onClick(View v){
        Button button = (Button) v;
        String btn_text = (String) button.getText();
        TextView txtScore = (TextView) findViewById(R.id.text_score);

        // if answered correctly, increase score
        if (btn_text.equals("True") && randWord.equals(trans)){
            score++;
            txtScore.setText("Score: " + score);
        }

        else if (btn_text.equals("False") && !randWord.equals(trans)){
            score++;
            txtScore.setText("Score: " + score);
        }
        // move to the next word
        i++;
        nextWord();

        // After the quiz size is reached, report score and move to next activity
        if (i == QUIZ_SIZE){
            Intent intent = new Intent (StudentQuizActivity.this,
                            StudentFinalScoreActivity.class);
            intent.putExtra("score", score);
            intent.putExtra("quizId", quizNumber);
            startActivity(intent);
        }

    }
}
