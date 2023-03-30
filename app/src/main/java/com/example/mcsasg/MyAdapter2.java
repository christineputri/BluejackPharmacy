//package com.example.mcsasg;
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.ViewGroup;
//import java.util.List;
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//public class MyAdapter2 extends RecyclerView.Adapter<MyViewHolder> {
//
//    Context context2;
//    List<Transaction> transactions;
//
//    public MyAdapter2(Context context2, List<Transaction> transactions) {
//        this.context2 = context2;
//        this.transactions = transactions;
//    }
//
//    @NonNull
//    @Override
//    public MyViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
//        return new MyViewHolder (LayoutInflater.from(context2).inflate(R.layout.transaction_view,parent,false));
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull  MyViewHolder holder, int position) {
//        holder.medDateView.setText(transactions.get(position).getMedDate());
//        holder.medNameView.setText(transactions.get(position).getMedName());
//        holder.medPriceView.setText(transactions.get(position).getMedPrice());
//        holder.medQuantityView.setText(transactions.get(position).getMedQuantity());
//    }
//
//    @Override
//    public int getItemCount() {
//        return transactions.size();
//    }
//}
