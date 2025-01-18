package com.example.listexample;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ListView listView;
        Spinner spinner;
        AutoCompleteTextView autotxt;
        spinner=findViewById(R.id.spinner);
        listView=findViewById(R.id.listview);
        autotxt=findViewById(R.id.autotxt);
        ArrayList<String> x=new ArrayList<>();
        ArrayList<String> arrid=new ArrayList<>(0);
        ArrayList<String> autoarr=new ArrayList<>();
        x.add("ram");
        x.add("lakhan");
        x.add("raman");
        x.add("ramanujan");
        x.add("ramdeep");
        x.add("rama");
        x.add("ramayan");
        x.add("rahul");
        x.add("rakesh");
        x.add("rohit");
        x.add("ravi");


        ArrayAdapter<String> adp=new ArrayAdapter<>(getApplication(), android.R.layout.simple_list_item_1,x);
        listView.setAdapter(adp);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==3){
                    Toast.makeText(MainActivity.this, "clicked first item", Toast.LENGTH_SHORT).show();
                }
            }
        });


        //spinner

        arrid.add("aadhar card");
        arrid.add("pan card");
        arrid.add("voter card");
        arrid.add("driving lisence card");
        arrid.add("credit card");
        arrid.add("debit card");
        arrid.add("ration card");
        arrid.add("10th marksheet");
        arrid.add("12th marksheet");


        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,arrid);
        spinner.setAdapter(arrayAdapter);



        //autocompletetextview
        autoarr.add("aadhar card");
        autoarr.add("pan card");
        autoarr.add("voter card");
        autoarr.add("driving lisence card");
        autoarr.add("credit card");
        autoarr.add("debit card");
        autoarr.add("ration card");
        autoarr.add("10th marksheet");
        autoarr.add("12th marksheet");

        ArrayAdapter<String> autoadapter =new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,autoarr);

        autotxt.setAdapter(autoadapter);
        autotxt.setThreshold(1);




    }
}