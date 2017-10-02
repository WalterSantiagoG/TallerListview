package com.example.santiago.tallerlistview;

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

public class Rectangulo extends AppCompatActivity {

    private TextView res;
    private EditText n1,n2;
    private Resources resources;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangulo);

        n1 = (EditText)findViewById(R.id.txtLadoA);
        n2 = (EditText)findViewById(R.id.txtLadoB);
        res = (TextView)findViewById(R.id.txtResultado);
        resources = this.getResources();

    }

    public boolean validar (){

        if (n1.getText().toString().isEmpty()) {
            n1.setError(resources.getString(R.string.mensaje_de_error_uno));
            return false;
        }
        if (n2.getText().toString().isEmpty()) {
            n2.setError(resources.getString(R.string.mensaje_de_error_uno));
            return false;
        }
        return true;
    }

    //Estructura para llamar a un botón
    public void calcular (View v){

        int num1, num2, resultado=0;
        res.setText("");

        if (validar()){

            num1 = Integer.parseInt(n1.getText().toString()) ;
            num2 = Integer.parseInt(n2.getText().toString()) ;
            resultado = num1 * num2;

            String ope,dat,result;
            ope = resources.getString(R.string.area_del_rectangulo);
            dat = "Lado A: "+num1+ " | Lado B: "+num2;
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
