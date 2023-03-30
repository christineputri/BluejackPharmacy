package com.example.mcsasg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.SurfaceControl;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MedicineDetailPage extends AppCompatActivity {

    private EditText editTextQuantity;
    private Button buyButton;

    private String selectedFilmTitle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicine_detail_page);

        editTextQuantity = findViewById(R.id.editTextQuantity);
        buyButton = findViewById(R.id.buyButton);

        Intent intent = getIntent();
        selectedFilmTitle = intent.getStringExtra("selectedFilmTitle");

        buyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
                String quantityString = editTextQuantity.getText().toString().trim();
                if (TextUtils.isEmpty(quantityString)) {
                    Toast.makeText(MedicineDetailPage.this, "Quantity is required.", Toast.LENGTH_SHORT).show();
                    return;
                }

                int quantity = Integer.parseInt(quantityString);
                if (quantity <= 0) {
                    Toast.makeText(MedicineDetailPage.this, "Quantity must be more than 0.", Toast.LENGTH_SHORT).show();
                    return;
                }

                Toast.makeText(MedicineDetailPage.this, "Transaction successful!", Toast.LENGTH_SHORT).show();

                finish();
            }
        });

    }
    public void goToHomeActivity(View view) {
        Intent intent = new Intent(MedicineDetailPage.this, HomeSection.class);
        startActivity(intent);
    }
}