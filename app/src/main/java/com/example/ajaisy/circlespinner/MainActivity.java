package com.example.ajaisy.circlespinner;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;


public class MainActivity extends Activity {
    private ProgressBar bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bar = (ProgressBar) this.findViewById(R.id.progressBar);
        new ProgressTask().execute();

    }

    private class ProgressTask extends AsyncTask<Void, Void, Void> {
        @Override
        protected void onPreExecute() {
            bar.setVisibility(View.VISIBLE);
        }

        @Override
        protected Void doInBackground(Void... arg0) {
            return  null;

        }

        @Override
        protected void onPostExecute(Void result) {
            //bar.setVisibility(View.GONE);
        }
    }
}


