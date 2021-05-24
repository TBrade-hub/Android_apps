package com.example.flow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //////
    Button btn_logger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setVariables();

        //simple button to move the user to the next screen will be replaced by login when further into the development

        btn_logger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                FragActivity();
            }
        });




    }


    ///////////methods and function ///////////
    private void setVariables()
    {
        btn_logger = findViewById(R.id.bt_home);

    }
    /// void methid that send the user to a new activity
    private void FragActivity()
    {
        //sending the usr to the settings page
        Intent SettingsIntent = new Intent(MainActivity.this, Home_Main.class);
        Intent intent = SettingsIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        finish();
    }


}
