package com.example.santiago.tallerlistview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by SANTIAGO on 1/10/2017.
 */

public class OperacionesRealizas extends AppCompatActivity {
    private TableLayout tabla;
    private ArrayList<Operacion> operaciones;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.operaciones_realizadas);
        tabla = (TableLayout)findViewById(R.id.TABLA);
        operaciones=Datos.Obtener();

        for (int i = 0; i < operaciones.size(); i++){
            TableRow fila = new TableRow(this);
            TextView c1 = new TextView(this);
            TextView c2 = new TextView(this);
            TextView c3 = new TextView(this);
            TextView c4 = new TextView(this);

            int no=i+1;
            c1.setText(""+no);
            c2.setText(""+operaciones.get(i).getOperacion());
            c3.setText(""+operaciones.get(i).getDatos());
            c4.setText(""+operaciones.get(i).getResultado());

            fila.addView(c1);
            fila.addView(c2);
            fila.addView(c3);
            fila.addView(c4);

            tabla.addView(fila);
        }


    }
}
