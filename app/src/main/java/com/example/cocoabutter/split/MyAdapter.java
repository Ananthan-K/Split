package com.example.cocoabutter.split;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Ananthan on 2017-12-06.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{
    private List<Person> personList;
    private String[] mDataset;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public final TextView nameTextView;
        public final TextView amountTextView;

        public ViewHolder(View v){
            super(v);
            //nameTextView = (TextView) v.findViewById(R.id.name);
            nameTextView = (TextView) v.findViewById(R.id.firstname);
            amountTextView = (TextView) v.findViewById(R.id.amount);
        }

        public TextView getNameTextView(){
            return nameTextView;
        }
        public TextView getAmountTextView(){
            return amountTextView;
        }
    }

    public MyAdapter(List<Person> persons){
//        mDataset = persons;
        personList = persons;
    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.my_text_view, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position){
        Person p = personList.get(position);
        holder.nameTextView.setText(p.firstName + " " + p.lastName);
        if(p.oweMe == true){
            holder.amountTextView.setTextColor(Color.GREEN);
        }
        else{
            holder.amountTextView.setTextColor(Color.RED);
        }
        holder.amountTextView.setText("$" + p.amount);
//        holder.nameTextView.setText(mDataset[position]);
//        holder.getTextView().setText(mDataset[position]);
    }

    @Override
    public int getItemCount(){
//        return mDataset.length;
        return personList.size();
    }
}
