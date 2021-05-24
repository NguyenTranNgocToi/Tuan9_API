package com.example.api;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.android.volley.RequestQueue;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RequestQueue requestQueue;
    private ArrayList<User> users = new ArrayList<>();
    private SwipeRefreshLayout refresh;
    private UserAdapter adt;
    private RecyclerView recyclerView;
    private Dialog dialog;

    public MainActivity() {
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        refresh = (SwipeRefreshLayout) findViewById(R.id.swipedown);
        recyclerView =  (RecyclerView) findViewById(R.id.lvUser);



    }
}