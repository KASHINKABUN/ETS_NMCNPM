package com.example.kashin.ets_marketonline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class activitylogin extends AppCompatActivity {

    Button btnlogin;
    EditText edtusername;
    EditText edtpassword;
    String user = "user";
    String pass = "123";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitylogin);

        btnlogin = (Button) findViewById(R.id.btnlogin);
        edtusername = (EditText) findViewById(R.id.edtusername);
        edtpassword = (EditText) findViewById(R.id.edtpass);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( edtusername.getText().toString().equals(user) && edtpassword.getText().toString().equals(pass) )
                {
                    Intent intent = new Intent(activitylogin.this, activitylaunch.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "login fail", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menusetting,menu);

        return super.onCreateOptionsMenu(menu);
    }
}
