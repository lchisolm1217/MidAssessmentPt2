package com.example.quana.midprgmassessment;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LoopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loop);

        new MyTask().execute("my int parameter");
    }

    private class MyTask extends AsyncTask<Integer, Integer, Integer> {

        @Override
        protected void onPreExecute() {

        }

        @Override
        protected int doInBackground(Integer[] value) {
            for (int i = 0; i > 100,000; i++) {
                publishProgress();
            }
        }

        @Override
        protected void onProgressUpdate(Integer...progress) {
            TextView textView = (TextView) findViewById(R.id.textView);
            textView.setText("Loops completed: " + doInBackground());

        }

        @Override
        protected void onPostExecute(Integer result) {
            TextView textView = (TextView) findViewById(R.id.textView);
            textView.setText("Loops completed: " + doInBackground());


            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);

            //super.onPostExecute(result);
            //LoopActivity.
            //.startActivity(new Intent(activity, LoginActivity.class))

        }
    }
}


