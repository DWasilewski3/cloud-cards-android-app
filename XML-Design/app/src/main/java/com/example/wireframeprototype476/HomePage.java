package com.example.wireframeprototype476;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HomePage extends AppCompatActivity {

    private TextView welcomeTextView;
    private Button editCardButton;
    private Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        welcomeTextView = findViewById(R.id.welcomeTextView);
        editCardButton = findViewById(R.id.editCardButton);
        backButton = findViewById(R.id.backButton);

        String username = getIntent().getStringExtra("USERNAME");
        // Use the string resource with the placeholder
        welcomeTextView.setText(getString(R.string.welcome_user, username));

        editCardButton.setOnClickListener(v -> {
            Intent intent = new Intent(HomePage.this, EditPage.class);
            startActivity(intent);
        });
    }
}