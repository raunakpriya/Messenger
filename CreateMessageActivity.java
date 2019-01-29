package com.hfad.messenger;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.R;

public class CreateMessageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }
    public void onSendMessage(View view) {
        EditText messageView= findViewById(R.id.message);
        String messageText=messageView.getText().toString();
        Intent intent=new Intent(this,RecieveMessageActivity.class);
        intent.putExtra(RecieveMessageActivity.EXTRA_MESSAGE,messageText);
        startActivity(intent);

    }

    private void startActivity(Intent intent) {
    }
}

