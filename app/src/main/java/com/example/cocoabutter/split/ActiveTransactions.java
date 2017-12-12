package com.example.cocoabutter.split;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class ActiveTransactions extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_active_transactions);
        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        List<Person> myDataset = new ArrayList<>();
        myDataset.add(new Person("Harry", "Potter"));
        myDataset.add(new Person("Ronald", "Weasley"));
        myDataset.add(new Person("Harmione", "Granger"));
        myDataset.add(new Person("Fred", "Weasley"));
        myDataset.add(new Person("George", "Weasley"));
        myDataset.add(new Person("Ginny", "Weasley"));
        myDataset.add(new Person("Molly", "Weasley"));
        myDataset.add(new Person("Albus", "Dumbledore"));

//        {"Harry Potter","Ronald Weasley", "Hermione Granger"};
        mAdapter = new MyAdapter(myDataset);
        mRecyclerView.setAdapter(mAdapter);
    }


    public void sendMessage(View view){
        Intent intent = new Intent(this, AddNewPerson.class);
        startActivity(intent);
    }
}
