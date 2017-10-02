package com.example.santiago.tallerlistview;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by SANTIAGO on 1/10/2017.
 */

public class Areas extends AppCompatActivity {
    private ListView lv;
    private Resources resources;
    private String opc[];
    private Intent in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_areas);
        lv = (ListView)findViewById(R.id.areas);
        resources = this.getResources();
        opc =resources.getStringArray(R.array.Areas);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,opc);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                switch (i){
                    case 0:
                        in = new Intent(Areas.this,Cuadrado.class);
                        startActivity(in);
                        break;
                    case 1:
                        in = new Intent(Areas.this,Rectangulo.class);
                        startActivity(in);
                        break;
                    case 2:
                        in = new Intent(Areas.this,Triangulo.class);
                        startActivity(in);
                        break;
                    case 3:
                        in = new Intent(Areas.this,Circulo.class);
                        startActivity(in);
                        break;
                }
            }
        });

    }
}
