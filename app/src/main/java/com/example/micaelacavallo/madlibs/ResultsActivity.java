package com.example.micaelacavallo.madlibs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by micaela.cavallo on 21/01/2015.
 */
public class ResultsActivity extends ActionBarActivity {
    Button mFinish;
    TextView mResult;
    public ResultsActivity(){
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.results);
        prepareTextViewResult();
        prepareButtonFinish();
    }

    private void prepareTextViewResult() {
        mResult = (TextView)findViewById(R.id.textView);
        String[] words =  getIntent().getStringArrayExtra(Intent.EXTRA_TEXT);
        String result = "";
        for (int x= 0; x<10; x++)
        {
            result += words[x] + "\n";
        }
        mResult.setText(result);
    }

    private void prepareButtonFinish() {
        mFinish = (Button)findViewById(R.id.finish);
        mFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
