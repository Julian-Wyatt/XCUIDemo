package com.demo.Saucelabs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {
    Button submitBtn;
    TextView enterNameText;
    TextView helloText;
    EditText NameInput;

//    Button submitBtn = (Button) findViewById(R.id.submitBtn);
//    TextView enterNameText = (TextView) findViewById(R.id.NameMsg);
//    TextView helloText = (TextView) findViewById(R.id.helloMsg);
//    EditText NameInput = (EditText) findViewById(R.id.editTextTextPersonName);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /** Called when the user touches the button */
    public void submit(View view) {
        // Do something in response to button click
        submitBtn = (Button) findViewById(R.id.submitBtn);
        enterNameText = (TextView) findViewById(R.id.NameMsg);
        helloText = (TextView) findViewById(R.id.helloMsg);
        NameInput = (EditText) findViewById(R.id.editTextTextPersonName);

        if (NameInput.getText().length() > 0){
            // disable interactable elements
            submitBtn.setEnabled(false);
            submitBtn.setAlpha(0);

            NameInput.setEnabled(false);
            NameInput.setAlpha(0);

//            edit welcome message
            enterNameText.setText("Welcome to the XCUI demo");
            helloText.setText("Hello "+NameInput.getText()+",");
        }
        else{
            enterNameText.setText("I'm sorry, you left your name blank");
        }
    }

}