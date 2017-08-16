package com.example.vkelam001c.andprj1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class EditList extends AppCompatActivity {
    int listViewPostion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_list);
        Bundle page2Data = getIntent().getExtras();
        String listvalue = page2Data.getString("ListData");
        listViewPostion = page2Data.getInt("Position");
        TextView page2Text = (TextView) findViewById(R.id.etEditText2);
        page2Text.setText(listvalue);
    }

    public void onSave(View view) {
        //this.finish();
        //EditText etName = (EditText) findViewById(R.id.name);
        TextView page2Text = (TextView) findViewById(R.id.etEditText2);
        Intent data = new Intent();
        data.putExtra("ListDatareturn", page2Text.getText().toString());
        data.putExtra("Position",listViewPostion);
        data.putExtra("code", 200);
        setResult(RESULT_OK, data);
        Log.i("mytag","Debug 1"+page2Text.getText().toString());
        finish();
    }
}
