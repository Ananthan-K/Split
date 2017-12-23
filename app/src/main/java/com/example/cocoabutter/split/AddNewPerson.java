package com.example.cocoabutter.split;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.math.BigDecimal;

public class AddNewPerson extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_person);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

    public void onFinish(View view){
        EditText firstname = (EditText) findViewById(R.id.firstname);
        String firstnametext = firstname.getText().toString();

        EditText lastname = (EditText) findViewById(R.id.lastname);
        String lastnametext = lastname.getText().toString();

//        EditText amount = (EditText) findViewById(R.id.amount);
//        BigDecimal amounttext = (BigDecimal) amount.getText();
        EditText amount = (EditText) findViewById(R.id.amount);
        String amounttext = amount.getText().toString();

        Context context = getApplicationContext();
        CharSequence text = "Hello " + firstnametext + " " + lastnametext + " = $" + amounttext + "!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

        this.finish();
//        Intent intent = new Intent(this, AddNewPerson.class);
//        startActivity(intent);
    }

}
