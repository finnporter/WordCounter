package com.example.finn.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashMap;

public class CounterActivity extends AppCompatActivity {

    EditText inputEditText;
    Button countButton;
    TextView resultText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        inputEditText = (EditText)findViewById(R.id.input_text);
        countButton = (Button)findViewById(R.id.count_button);
        resultText = (TextView)findViewById(R.id.result_text);
    }

    public void onCountButtonClicked(View button) {
        Log.d(getClass().toString(), "onCountButtonClicked was called");
        String input = inputEditText.getText().toString();
        Log.d(getClass().toString(), "The input given was '" + input + "'");
        Counter counter = new Counter(input);
        int result = counter.countWords();
        resultText.setText(Integer.toString(result));
        //currently breaks/force closes app instead of showing int

        //HashMap<String, Integer> hash = result.frequency();
        // can't set frequency method


    }
}
