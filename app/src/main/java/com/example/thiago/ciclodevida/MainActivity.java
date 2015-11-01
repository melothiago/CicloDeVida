package com.example.thiago.ciclodevida;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "1.OnCreate", Toast.LENGTH_SHORT).show();

        Button btChamar = (Button) findViewById(R.id.btChamar);
        btChamar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com")));

            }
        });
    }

    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(this, "2. OnStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(this, "3.OnResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Toast.makeText(this, "4. OnRestart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause(){
        Toast.makeText(this, "5. OnPause", Toast.LENGTH_SHORT).show();
        super.onPause();
    }

    @Override
    protected void onStop(){
        Toast.makeText(this, "6. OnStop", Toast.LENGTH_SHORT).show();
        super.onStop();
    }

    @Override
    protected void onDestroy(){
        Toast.makeText(this, "7. OnDestroy", Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }
}
