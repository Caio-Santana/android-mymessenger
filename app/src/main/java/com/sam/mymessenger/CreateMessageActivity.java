package com.sam.mymessenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

    public void onSendMessage(View view) {

        EditText editText = findViewById(R.id.message);

        Intent intent = new Intent(this, ReceiveMessageActivity.class);

        String message = editText.getText().toString();

        intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE,message);

        startActivity(intent);
    }
}
