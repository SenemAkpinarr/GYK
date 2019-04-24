
package com.example.esrapc.gyk_1;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iniatilize();
    }

    private void iniatilize() {
        ListView cityList = findViewById(R.id.citylist);

        final ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Senem");
        arrayList.add("Akpunar");
        arrayList.add("Loves");
        arrayList.add("Claude");
        arrayList.add("Monet");
        arrayList.add(" ");

        arrayList.add("Senem");
        arrayList.add("Akpunar");
        arrayList.add("Loves");
        arrayList.add("Claude");
        arrayList.add("Monet");
        arrayList.add(" ");

        arrayList.add("Senem");
        arrayList.add("Akpunar");
        arrayList.add("Loves");
        arrayList.add("Claude");
        arrayList.add("Monet");
        arrayList.add(" ");



        ArrayAdapter<String> listAdapter = new ArrayAdapter<String>
                (this,
                        android.R.layout.simple_list_item_1,
                        android.R.id.text1,
                        arrayList);

        cityList.setAdapter(listAdapter);

        cityList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
                alertDialogBuilder.setMessage(arrayList.get(position))
                                  .setPositiveButton("Tamam", new DialogInterface.OnClickListener() {
                                      @Override
                                      public void onClick(DialogInterface dialog, int which) {
                                          dialog.dismiss();
                                      }
                                  });
                alertDialogBuilder.create().show();
            }
        });

    }
}
