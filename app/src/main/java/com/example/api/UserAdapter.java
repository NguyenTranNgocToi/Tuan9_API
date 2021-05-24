package com.example.api;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.MyViewHolder> {
    private Context context;
    private ArrayList<User> users;
    private String url="";

    public UserAdapter(Context context, ArrayList<User> users) {
        this.context = context;
        this.users = users;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        view = layoutInflater.inflate(R.layout.user,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
            holder.tile.setText(users.get(position).getName());
            holder.no.setText("#"+ String.valueOf(position+1));
    }

    @Override
    public int getItemCount() {
        return users.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView tile, no;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            no = (TextView) itemView.findViewById(R.id.no);
            tile = (TextView) itemView.findViewById(R.id.name);
        }
    }
}
