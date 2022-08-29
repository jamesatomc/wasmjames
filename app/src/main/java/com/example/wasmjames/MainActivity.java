package com.example.wasmjames;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] clubList = {"Arsenal", "Chelsea", "Everton", "Liverpool",
                "Man City", "Man Utd", "Spuru"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, clubList);

        setListAdapter(adapter);
    }
}




