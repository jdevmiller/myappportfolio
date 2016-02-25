package com.jeff.example.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

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


    //Launch my spotify app
    public void spotifyButton(View view) {
        displayToast(getString(R.string.spotify_toast));
    }

    //Launch my scores app
    public void scoresButton(View view) {
        displayToast(getString(R.string.scores_toast));
    }

    //Launch my libarary app
    public void libraryButton(View view) {
        displayToast(getString(R.string.library_toast));
    }

    //Launch my Build it Bigger app
    public void buildBiggerButton(View view) {
        displayToast(getString(R.string.build_bigger_toast));
    }

    //Launch my XYZ reader app
    public void xyzButton(View view) {
        displayToast(getString(R.string.xyz_reader_toast));
    }

    //Launch my capstone app
    public void capstoneButton(View view) {
        displayToast(getString(R.string.capstone_toast));
    }

    private void displayToast(String string) {
        Toast.makeText(getApplicationContext(), string, Toast.LENGTH_SHORT).show();
    }
}
