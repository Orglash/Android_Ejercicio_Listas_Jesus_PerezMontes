package es.escuelaestech.chopo.ejercicio_listas_jesus_perezmontes;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView mList;
    List<Lugares> lugares;
    ArrayAdapter<Lugares> mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicialize();


        mList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Lugares currentLugar = mAdapter.getItem(position);
                Toast.makeText(mAdapter.getContext(),
                        "Iniciar screen de detalle para: \n" + currentLugar.getLugar(),
                        Toast.LENGTH_SHORT).show();
            }
        });

        final Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivityForResult(intent,2);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 2){
            assert data != null;
            String intent_lugar= data.getStringExtra("Lugar");
            String intent_provincia= data.getStringExtra("Provincia");
            Lugares lugar = new Lugares(intent_lugar, intent_provincia);
            lugares.add(lugar);
            mAdapter.notifyDataSetChanged();
        }
    }
    private void inicialize(){
        lugares = new ArrayList<Lugares>();
        mList = findViewById(R.id.lugares_list);
        mAdapter= new LugaresAdapter(this, lugares);
        mList.setAdapter(mAdapter);

    }
}
