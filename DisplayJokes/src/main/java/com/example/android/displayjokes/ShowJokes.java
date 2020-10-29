package com.example.android.displayjokes;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class ShowJokes extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_jokes);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(R.string.jokes_title);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        }

        textView = (TextView) findViewById(R.id.joke_content_TV);

        String joke = getIntent().getStringExtra(getString(R.string.jokes_content));

        textView.setText(joke);




    }


    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

}