package com.example.mynicestart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomappbar.BottomAppBar;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        BottomAppBar bottomAppBar = findViewById(R.id.bottom_app_bar);

        findViewById(R.id.fab).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity3.this, "FAB Clicked.", Toast.LENGTH_SHORT).show();
            }
        });
        // miTexto= findViewById(R.id.txthola);
        //click event en el Hamburguer menu
        bottomAppBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity3.this, "Menu clicked!", Toast.LENGTH_SHORT).show();
//                sheetBehavior = BottomSheetBehavior.from(sheet);
            }


        });
        //click event en el Bottom bar menu item
        bottomAppBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.bottom_app_bar_menu_share:
                        Toast.makeText(MainActivity3.this, "More clicked.", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.bottom_app_bar_menu_search:
                        Toast.makeText(MainActivity3.this, "Search clicked.", Toast.LENGTH_SHORT).show();
                        break;
                }
                return false;
            }
        });
    }
}