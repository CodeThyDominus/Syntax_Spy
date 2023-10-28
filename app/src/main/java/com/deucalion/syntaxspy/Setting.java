package com.deucalion.syntaxspy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.widget.Button;

public class Setting extends AppCompatActivity {

    Button changeFontButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        findId();
    }

    public void setChangeFontButton(Button changeFontButton) {
        this.changeFontButton = changeFontButton;
    }

    public void findId(){
        changeFontButton = findViewById(R.id.changeFontButton)
    }

}

