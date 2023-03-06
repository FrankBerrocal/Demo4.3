package com.example.demo43;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.app_bar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.mi_settings:
                Toast.makeText(this, "You clicked on Settings", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.mi_contact:
                Toast.makeText(this, "You clicked on Add contact", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.mi_favorites:
                Toast.makeText(this, "You clicked on Favorites", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.mi_feedback:
                Toast.makeText(this, "You clicked on Feedback", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.mi_close:
                Toast.makeText(this, "You clicked on Close", Toast.LENGTH_SHORT).show();
                return true;
        }
        return true;
    }



    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }

    public void onRadioButtonClicked(View view) {
        // Check to see if a button has been clicked.
        boolean checked = ((RadioButton) view).isChecked();

        String radio_button_text ="";

        // Check which radio button was clicked.
        switch(view.getId()) {
            case R.id.sameday:
                if (checked)
                    // Do something with spinner_item string.
                    radio_button_text = ((RadioButton) view).getText().toString();
                displayToast(radio_button_text);
                break;
            case R.id.nextday:
                if (checked)
                    radio_button_text = ((RadioButton) view).getText().toString();
                displayToast(radio_button_text);
                break;
            case R.id.pickup:
                if (checked)
                    radio_button_text = ((RadioButton) view).getText().toString();
                displayToast(radio_button_text);
                break;
        }
    }
}