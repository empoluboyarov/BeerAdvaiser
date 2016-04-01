package com.example.evgeniy.messenger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiveMessageActivity extends AppCompatActivity {

    public static final String TEXT_MESSAGE = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);

        Intent intent = getIntent();
        String text = intent.getStringExtra(TEXT_MESSAGE);

        TextView textView = (TextView)findViewById(R.id.message);
        textView.setText(text);
    }
}
