package com.example.mcsasg;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    Context context;
    List<Medicine> medicines;
    public MyAdapter(Context context, List<Medicine> medicines) {
        this.context = context;
        this.medicines = medicines;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.medicine_view, parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.nameView.setText(medicines.get(position).getName());
        holder.manufacturerView.setText(medicines.get(position).getName());
        holder.priceView.setText(medicines.get(position).getName());
        holder.medicineView.setImageResource(medicines.get(position).getImage());    }

    @Override
    public int getItemCount() {
        return medicines.size();
    }
}

