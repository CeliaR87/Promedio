package com.santotomas.ct;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button btn_convertir = null;
    EditText txt_c = null;
    EditText txt_f = null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_convertir = (Button)findViewById(R.id.btn_convertir);
        txt_c = (EditText)findViewById(R.id.txt_c);
        txt_f = (EditText)findViewById(R.id.txt_f);

        txt_f.setEnabled(false);

        btn_convertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt_c.getText().toString().equals("")){
                    Toast msg = Toast.makeText(getApplicationContext(), "Escribe una cantidad", Toast.LENGTH_SHORT);
                    msg.show();
                }else{
                    Double c  = Double.parseDouble(txt_c.getText().toString());
                    Double res = null;
                    res = 1.8 * c +32;
                    txt_f.setText(res.toString());
                }
            }
        });
    }
}
