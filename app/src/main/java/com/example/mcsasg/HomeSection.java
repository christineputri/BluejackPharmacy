package com.example.mcsasg;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.List;
import java.util.ArrayList;

public class HomeSection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_section);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<Medicine> medicines = new ArrayList<Medicine>();
        medicines.add(new Medicine(R.drawable.nalgestan, "Nalgestan", "Darya Varia Laboratoria", "Rp 9.500"));
        medicines.add(new Medicine(R.drawable.panadol, "Panadol", "Sterling", "Rp 9.700"));
        medicines.add(new Medicine(R.drawable.combantrin, "Combantrin", "Pfizer", "Rp 14.700"));
        medicines.add(new Medicine(R.drawable.sangobion, "Sangobion", "Merck Indonesia", "Rp 48.000"));
        medicines.add(new Medicine(R.drawable.tolakangin, "Tolak Angin", "Sidomuncul", "Rp 12.000"));
        medicines.add(new Medicine(R.drawable.insto, "Insto", "Sterling", "Rp 17.800"));
        medicines.add(new Medicine(R.drawable.konidin, "Konidin", "Konimex", "Rp 2.000"));
        medicines.add(new Medicine(R.drawable.betadine, "Betadine", "Mundipharma Healthcare Indonesia", "Rp 7.300"));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(), medicines));

    }

    public void goToLoginActivity(View view) {
        Intent intent = new Intent(HomeSection.this, MainActivity.class);
        startActivity(intent);
    }
    public void goToDetailActivity(View view) {
        Intent intent = new Intent(HomeSection.this, MedicineDetailPage.class);
        startActivity(intent);
    }
    public void goToAboutUsActivity(View view) {
        Intent intent = new Intent(HomeSection.this, AboutUsPage.class);
        startActivity(intent);
    }
}