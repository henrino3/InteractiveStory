package com.mascot.team.interactivestory.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.mascot.team.interactivestory.R;

public class Interactive extends AppCompatActivity {

    private EditText mNameView;
    private Button mSubmitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interactive);

        mNameView = (EditText) findViewById(R.id.EnterNameView);

        mSubmitButton = (Button) findViewById(R.id.SubmitButtonView);

        mSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = String.valueOf(mNameView.getText());
                /*
                Toast.makeText(Interactive.this, name, Toast.LENGTH_LONG).show();
                */
                startStory(name);


            }
        });

    }

    private void startStory(String name){
        Intent intent = new Intent(this, StoryActivity.class);
        intent.putExtra("name", name);
        startActivity(intent);
    }
}
