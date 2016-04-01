package com.example.evgeniy.messenger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateMessageActivity extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
        editText = (EditText)findViewById(R.id.message);
    }

    public void onSendMessage(View view){
        Intent intent = new Intent(this,ReceiveMessageActivity.class);
        intent.putExtra(ReceiveMessageActivity.TEXT_MESSAGE, editText.getText().toString());
        startActivity(intent);
    }
}
