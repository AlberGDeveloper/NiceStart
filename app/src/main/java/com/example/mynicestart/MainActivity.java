package com.example.mynicestart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomappbar.BottomAppBar;

/**
 /**
 * @author Alberto García
 * Ventana cuyo uso es, volver a la ventana del logín a través del botón cancel, o a un segundo main activity a través del botón go main2.
 * A futuro, es ese main activity2, habrá más contenido.
 * @see MainActivity2
 */
public class MainActivity extends AppCompatActivity {
    protected TextView miTexto;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView mycontext = findViewById(R.id.imageView);
        registerForContextMenu(mycontext);
        Button miBoton = findViewById(R.id.btn22);

        miBoton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);

            }
        });

        Button miBoton2 = findViewById(R.id.btn23);
        miBoton2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);

            }
        });
    }
    //  MENU CONTEXTUAL

    //    inflamos el menu contextual con los items del menu xml correspondiente
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_context, menu);

    }

    //    creamos una lista de eventos para los items del menus contextual
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        switch (item.getItemId()) {
            case R.id.edit:
                Toast toast = Toast.makeText(this, "going CONTEXT CAMERA", Toast.LENGTH_LONG);
                toast.show();
                break;
            case R.id.delete:
                Toast toast2 = Toast.makeText(this, "going CONTEXT SETTINGS", Toast.LENGTH_LONG);
                toast2.show();
                break;
        }
        return super.onContextItemSelected(item);
    }

    public void openScrolling(View view) {
    }
}