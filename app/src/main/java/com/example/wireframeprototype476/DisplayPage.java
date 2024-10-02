package com.example.wireframeprototype476;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DisplayPage extends AppCompatActivity {

    private TextView textViewName, textViewEmail, textViewJob, textViewLinkedIn;
    private ImageView iconEmail, iconJob, iconLinkedIn, iconPerson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_page);

        textViewName = findViewById(R.id.textViewName);
        textViewEmail = findViewById(R.id.textViewEmail);
        textViewJob = findViewById(R.id.textViewJob);
        textViewLinkedIn = findViewById(R.id.textViewLinkedIn);

        iconEmail = findViewById(R.id.iconEmail);
        iconJob = findViewById(R.id.iconJob);
        iconLinkedIn = findViewById(R.id.iconLinkedIn);
        iconPerson = findViewById(R.id.iconPerson);

        // Retrieve the data from the intent
        String name = getIntent().getStringExtra("name");
        String email = getIntent().getStringExtra("email");
        String job = getIntent().getStringExtra("job");
        String linkedin = getIntent().getStringExtra("linkedin");

        // Set the data to the corresponding views
        textViewName.setText(name);
        textViewEmail.setText(email);
        textViewJob.setText(job);
        textViewLinkedIn.setText(linkedin);

        // Set the icons for each section (assuming icons are vector resources)
        iconPerson.setImageResource(R.drawable.ic_person);
        iconEmail.setImageResource(R.drawable.ic_email);
        iconJob.setImageResource(R.drawable.ic_job);
        iconLinkedIn.setImageResource(R.drawable.ic_linkedin);
    }
}
