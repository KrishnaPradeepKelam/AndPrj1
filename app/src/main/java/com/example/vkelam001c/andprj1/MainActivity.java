package com.example.vkelam001c.andprj1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> items;
    ArrayAdapter<String> itemsAdapter;
    ListView lvItems;
    EditText etEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        populateArrayItems();
        lvItems = (ListView) findViewById(R.id.lvItems);
        lvItems.setAdapter(itemsAdapter);
        etEditText = (EditText) findViewById(R.id.etEditText);
        lvItems.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                items.remove(position);
                itemsAdapter.notifyDataSetChanged();
                writeitems();
                return true;
            }
        });

        lvItems.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            private final int REQUEST_CODE = 20;
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                String str = lvItems.getItemAtPosition(position).toString();
                Intent i = new Intent(MainActivity.this,EditList.class);
                i.putExtra("ListData",str);
                i.putExtra("Position",position);
                // startActivity(i);
                startActivityForResult(i, REQUEST_CODE);
            }
        });
    }
    private final int REQUEST_CODE = 20;
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        Log.i("mytag","We reached back");
        if (resultCode == RESULT_OK && requestCode == REQUEST_CODE) {
            Log.i("mytag","We reached back II");
            String name = data.getExtras().getString("ListDatareturn");
            int code = data.getExtras().getInt("code", 0);
            int position = data.getExtras().getInt("Position",0);
            Log.i("mytag","We reached back III"+name+","+String.valueOf(position));
            items.set(position,name);
            itemsAdapter.notifyDataSetChanged();
            writeitems();
        }
    }
    public void populateArrayItems()
    {
        //items = new ArrayList<String>();
        //items.add("Item 1");
        //items.add("Item 2");
        //items.add("Item 3");
        readItems();
        if(items!= null)
            itemsAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items);

    }
    private void readItems(){
        File filesDir = getFilesDir();
        File file = new File(filesDir,"todo3.txt");
        try{
            items = new ArrayList<String>(FileUtils.readLines(file));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    private void writeitems(){
        File filesDir = getFilesDir();
        File file = new File(filesDir,"todo3.txt");
        try {
            FileUtils.writeLines(file, items);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public void OnClick(View view) {
        if(items == null) {
            items = new ArrayList<String>();
            items.add(etEditText.getText().toString());
            populateArrayItems();
        }
        itemsAdapter.add(etEditText.getText().toString());
        etEditText.setText("");
        writeitems();

    }
}
