package com.example.santiago.tallerlistview;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by SANTIAGO on 1/10/2017.
 */

public class Circulo extends AppCompatActivity {

    private TextView res;
    private EditText n1;
    private Resources resources;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circulo);

        n1 = (EditText)findViewById(R.id.txtDiametro);
        res = (TextView)findViewById(R.id.txtResultado);
        resources = this.getResources();

    }

    public boolean validar (){

        if (n1.getText().toString().isEmpty()) {
            n1.setError(resources.getString(R.string.mensaje_de_error_uno));
            return false;
        }
        return true;
    }

    //Estructura para llamar a un botón
    public void calcular (View v){

        double num1, resultado=0;
        res.setText("");

        if (validar()){

            num1 = Double.parseDouble(n1.getText().toString()) ;
            resultado = ((num1 * num1) * 3.1416);

            String ope,dat,result;
            ope = "Area del circulo";
            dat = "Diametro: "+num1;
            result = ""+resultado;

            Operacion o = new Operacion(ope,dat,result);
            o.guardar();
            Toast.makeText(this,resources.getString(R.string.operacion_registrada), Toast.LENGTH_SHORT).show();

            res.setText("\n\n"+"Resultado "+"\n"+ "Area: "+ resultado);
        }

    }

    //Estructura para llamar a un botón
    public void borrar (View v){

        res.setText("");
        n1.setText("");
        n1.requestFocus();

    }
}
