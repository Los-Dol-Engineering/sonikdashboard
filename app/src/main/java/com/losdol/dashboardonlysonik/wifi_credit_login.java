package com.losdol.dashboardonlysonik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class wifi_credit_login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wifi_credit_login);
        Button enterButton = findViewById(R.id.enter_wifi_button);
        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(wifi_credit_login.this, ready_to_setup_screen.class));
                finish();
            }
        });
    }
}
