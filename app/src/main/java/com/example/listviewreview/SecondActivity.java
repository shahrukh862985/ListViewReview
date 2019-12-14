package com.example.listviewreview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<String> employees = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        listView = findViewById(R.id.list_view);
        employees.add("Asif");
        employees.add("Waqar");
        employees.add("Kashan");
        employees.add("Osama");
        employees.add("Ali");
        employees.add("Adil");
        employees.add("Asif");
        employees.add("Waqar");
        employees.add("Kashan");
        employees.add("Osama");
        employees.add("Ali");
        employees.add("Adil");
        employees.add("Asif");
        employees.add("Okasha");
        employees.add("Kashan");
        employees.add("Osama");
        employees.add("Ali");
        employees.add("Adil");
        employees.add("Umer");
        employees.add("Waqar");
        employees.add("Kashan");
        employees.add("Osama");
        employees.add("Owais");
        employees.add("Adil");
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,employees);
        listView.setAdapter(adapter);

    }
}
