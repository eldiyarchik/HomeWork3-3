package com.agn.homework3month3.reciclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.agn.homework3month3.R;
import com.agn.homework3month3.Resturant;

import java.util.ArrayList;
import java.util.List;

public class ResturentAdapter extends RecyclerView.Adapter<ResturentAdapter.ViewHolder> {
    private List<Resturant> list;
    private LayoutInflater inflater;

    public ResturentAdapter(Context context, List<Resturant> list){
        this.list = list;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ResturentAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_resturant, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Resturant list1 = list.get(position);
        holder.name.setText(list1.getName());
        holder.ingridinet.setText(list1.getSostav());
        holder.rise.setText(list1.getPrice());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView name;
        TextView ingridinet;
        TextView rise;
        public ViewHolder(View view){
            super(view);
            name = view.findViewById(R.id.dishNameTextView);
            ingridinet = view.findViewById(R.id.ingridientTextView);
            rise = view.findViewById(R.id.priceTextView);
        }
    }
}
