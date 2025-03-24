package com.example.myapp;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import com.example.myapp.R; // Ensure R class is imported.

public class Main extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Use XML layout

        // Initialize UI components (buttons and text view)
        TextView menuOptions = findViewById(R.id.menuOptions);
        Button btnAccountOption = findViewById(R.id.btnAccountOption);
        Button btnBankOption = findViewById(R.id.btnBankOption);
        Button btnCreateBank = findViewById(R.id.btnCreateBank);
        Button btnExit = findViewById(R.id.btnExit);

        // Example logic for initial screen (when banks don't exist)
        menuOptions.setText("Main menu");

        // Handle Account Option Click
        btnAccountOption.setOnClickListener(v -> {
            menuOptions.setText("Account Login Menu");
            // Logic for account login
        });

        // Handle Bank Option Click
        btnBankOption.setOnClickListener(v -> {
            menuOptions.setText("All registered banks");
            // Logic for bank options
        });

        // Handle Create New Bank Click
        btnCreateBank.setOnClickListener(v -> {
            menuOptions.setText("Creating a new bank...");
            // Logic to create a new bank
        });

        // Handle Exit Click
        btnExit.setOnClickListener(v -> {
            finish(); // Exits the activity
        });
    }
}
