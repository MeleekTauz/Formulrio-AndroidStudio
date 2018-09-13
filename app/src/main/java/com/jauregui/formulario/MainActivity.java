package com.jauregui.formulario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et1, et2, et3, et4;
    TextView tv3;
    RadioButton rbt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.edNombre);
        et2 = (EditText) findViewById(R.id.edApellido);
        et3 = (EditText) findViewById(R.id.edEdad);
        et4 = (EditText) findViewById(R.id.edCorreo);
        tv3 = (TextView) findViewById(R.id.txView);
        rbt1 = (RadioButton) findViewById(R.id.rbtnAlumno);

    }

    public void ejecutar (View v){
        String mensaje = " no es alumno";
        if (rbt1.isChecked()){
            mensaje = "es alumno";
        }
        tv3.setText(et1.getText().toString()+ " "+et2.getText().toString()+ '\n' + mensaje+ '\n'+ "Tiene "+ et3.getText().toString()+ " años"+
        '\n'+ "Correo: "+ et4.getText().toString());

    }

}
