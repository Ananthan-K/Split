package com.example.cocoabutter.split;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;

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
        myDataset.add(new Person("Harry", "Potter", new BigDecimal(5.0).setScale(2, BigDecimal.ROUND_CEILING)));
        myDataset.add(new Person("Ronald", "Weasley", new BigDecimal(7.0).setScale(2, BigDecimal.ROUND_CEILING)));
        myDataset.add(new Person("Hermione", "Granger", new BigDecimal(2.43).setScale(2, BigDecimal.ROUND_CEILING)));
        myDataset.add(new Person("Fred", "Weasley", new BigDecimal(1.25).setScale(2, BigDecimal.ROUND_CEILING)));
        myDataset.add(new Person("George", "Weasley", new BigDecimal(10.39).setScale(2, BigDecimal.ROUND_CEILING)));
        myDataset.add(new Person("Ginny", "Weasley", new BigDecimal(502.3).setScale(2, BigDecimal.ROUND_CEILING)));
        myDataset.add(new Person("Molly", "Weasley", new BigDecimal(3).setScale(2, BigDecimal.ROUND_CEILING)));
        myDataset.add(new Person("Albus", "Dumbledore", new BigDecimal(34).setScale(2, BigDecimal.ROUND_CEILING)));

//        String[] myDataset = {"Harry Potter","Ronald Weasley", "Hermione Granger"};
        mAdapter = new MyAdapter(myDataset);
        mRecyclerView.setAdapter(mAdapter);
    }


    public void sendMessage(View view){
        Intent intent = new Intent(this, AddNewPerson.class);
        startActivity(intent);
    }
}
