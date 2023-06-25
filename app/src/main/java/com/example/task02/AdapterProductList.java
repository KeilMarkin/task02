package com.example.task02;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterProductList extends RecyclerView.Adapter<AdapterProductList.ViewHolder> {
    private final Context context;
    private final List<ModelProductShort> modelProductShortList;
public AdapterProductList(List<ModelProductShort> modelProductShortList,Context context){
    this.modelProductShortList = modelProductShortList;
    this.context = context;
}
    @NonNull
    @Override
    public AdapterProductList.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterProductList.ViewHolder holder, int position) {

        ModelProductShort modelProductShort = modelProductShortList.get(position);
        holder.ProductName.setText(modelProductShort.getProductName());
        holder.ProductComposition.setText(modelProductShort.getProductComposition());
        holder.btnPrice.setText("от " + modelProductShort.getPrice());
        holder.ProductImage.setImageResource(R.drawable.pizza);

    }

    @Override
    public int getItemCount() {
        return modelProductShortList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private final TextView ProductName;
        private final TextView ProductComposition;
        private final Button btnPrice;
        private final ImageView ProductImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            ProductName = itemView.findViewById(R.id.ProductName);
            ProductComposition = itemView.findViewById(R.id.ProductComposition);
            ProductImage = itemView.findViewById(R.id.ProductImage);
            btnPrice = itemView.findViewById(R.id.btnPrice);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            ModelProductShort modelProductShort = modelProductShortList.get(getAdapterPosition());
            Toast.makeText(context, modelProductShort.getProductName(), Toast.LENGTH_SHORT).show();
        }
    }
}
