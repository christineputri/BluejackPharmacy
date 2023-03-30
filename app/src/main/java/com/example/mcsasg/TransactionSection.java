//package com.example.mcsasg;
//
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.recyclerview.widget.LinearLayoutManager;
//import androidx.recyclerview.widget.RecyclerView;
//
//import android.os.Bundle;
//import android.os.Bundle;
//import android.view.View;
//import android.content.ClipData.Item;
//import java.util.ArrayList;
//import java.util.List;
//public class TransactionSection extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_transaction_section);
//
//        RecyclerView recyclerView = findViewById(R.id.recyclerview);
//
//        List<Transaction> transactions = new ArrayList<Transaction>();
//        transactions.add(new Transaction("20 March 2023", "Nalgestan","Rp 9.500", "3"));
//
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        recyclerView.setAdapter(new MyAdapter (getApplicationContext(),transactions));
//
//    }
//}