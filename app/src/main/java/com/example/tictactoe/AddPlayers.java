package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddPlayers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_players);

        final EditText playerOne= findViewById(R.id.playerOneName);
        final EditText playerTwo= findViewById(R.id.playerTwoName);
        final AppCompatButton playBtn= findViewById(R.id.startGameButton);

        playBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String getPlayerOnename=playerOne.getText().toString();
                final String getPlayerTwoname=playerTwo.getText().toString();
                if (getPlayerOnename.isEmpty()||getPlayerTwoname.isEmpty())
                {
                    Toast.makeText(AddPlayers.this,"Please Enter Player name",Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent=new Intent(AddPlayers.this,MainActivity.class);
                    intent.putExtra("player One",getPlayerOnename);
                    intent.putExtra("player Two",getPlayerTwoname);
                    startActivity(intent);
                }
            }
        });
    }
}