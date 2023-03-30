package com.example.mcsasg;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.mcsasg.R;

public class MyViewHolder extends RecyclerView.ViewHolder {
    ImageView medicineView;
    TextView nameView, manufacturerView, priceView;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        medicineView= itemView.findViewById(R.id.medicineview);
        nameView= itemView.findViewById(R.id.name);
        manufacturerView= itemView.findViewById(R.id.manufaturer);
        priceView= itemView.findViewById(R.id.price);

    }

}
