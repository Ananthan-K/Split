package com.example.cocoabutter.split;

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
//    private String[] mDataset;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextView;

        public ViewHolder(View v){
            super(v);
            mTextView = (TextView) v.findViewById(R.id.name);
        }
    }

    public MyAdapter(List<Person> personList){
//        this.mDataset = myDataset;
        this.personList = personList;
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
        holder.mTextView.setText(p.firstName+ " " + p.lastName);
//        holder.mTextView.setText(mDataset[position]);
    }

    @Override
    public int getItemCount(){
//        return mDataset.length;
        return personList.size();
    }
}
