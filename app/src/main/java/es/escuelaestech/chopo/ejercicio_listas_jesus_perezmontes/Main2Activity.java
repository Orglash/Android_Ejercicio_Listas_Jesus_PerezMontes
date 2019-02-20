package es.escuelaestech.chopo.ejercicio_listas_jesus_perezmontes;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    EditText input_lugar;
    EditText input_provincia;
    Button button2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String lugar = input_lugar.getText().toString();
                String provincia = input_provincia.getText().toString();
                Intent intent = new Intent();
                intent.putExtra("MESSAGE", "test");
                //intent.putExtra("Provincia", provincia);
                setResult(2, intent);
                finish();
            }
        });
    }
}
