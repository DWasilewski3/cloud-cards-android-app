package com.example.wireframeprototype476;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class EditPage extends AppCompatActivity {

    private EditText editTextName, editTextEmail, editTextJob, editTextLinkedIn;
    private Button buttonSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_page);

        editTextName = findViewById(R.id.editTextName);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextJob = findViewById(R.id.editTextJob);
        editTextLinkedIn = findViewById(R.id.editTextLinkedIn);
        buttonSave = findViewById(R.id.buttonSave);

        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pass the inputted data to CardDisplayActivity
                Intent intent = new Intent(EditPage.this, DisplayPage.class);
                intent.putExtra("name", editTextName.getText().toString());
                intent.putExtra("email", editTextEmail.getText().toString());
                intent.putExtra("job", editTextJob.getText().toString());
                intent.putExtra("linkedin", editTextLinkedIn.getText().toString());
                startActivity(intent);
            }
        });
    }
}
