package com.example.mynicestart;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

//import com.alespero.expandablecardview.ExpandableCardView;
import com.alespero.expandablecardview.ExpandableCardView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.google.android.material.snackbar.Snackbar;

/**
 * Ventana con glide para poner de ejemplo el circlecrop. En construcción.
 * @author Alberto García
 */

public class MainActivity2 extends AppCompatActivity {
    ImageView fotonubes;
    private SwipeRefreshLayout swipeLayout;
    private ExpandableCardView card;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        swipeLayout = (SwipeRefreshLayout) findViewById(R.id.myswipe);
        swipeLayout.setOnRefreshListener(mOnRefreshListener);
        fotonubes =findViewById(R.id.fotoNube);

        card = findViewById(R.id.profile);
        card.setOnExpandedListener(new
                                           ExpandableCardView.OnExpandedListener() {
                                               @Override
                                               public void onExpandChanged(View v, boolean isExpanded) {
                                                   Toast.makeText(MainActivity2.this, isExpanded ? "Expanded!" :
                                                           "Collapsed!", Toast.LENGTH_SHORT).show();
                                               }
                                           });

        Glide.with(this)
                .load(R.drawable.nubesenfriamiento)
                .centerCrop()
                .transition(DrawableTransitionOptions.withCrossFade(100))
                //.placeholder(new ColorDrawable(this.getResources()
                // .getColor(R.color.design_default_color_background)))
                .circleCrop()
                //.getDiskCacheStrategy(DiskCacheStrategy.NONE)
                .into(fotonubes);


    }

    protected SwipeRefreshLayout.OnRefreshListener mOnRefreshListener = new SwipeRefreshLayout.OnRefreshListener() {

        @Override

        public void onRefresh() {





            //    opción TOAST

            //

            //          Toast toast0 = Toast.makeText(MainContextActivity.this, "going swipeREFRESH", Toast.LENGTH_LONG);

            //          toast0.show();









            //   opción SNACKBAR





//           SUSTITUIR POR CONSTRAINT EN SU CASO

            final ConstraintLayout mLayout = (ConstraintLayout) findViewById(R.id.activity_main2);

  //          final RelativeLayout mLayout = (RelativeLayout) findViewById(R.id.activity_main_context);





            Snackbar snackbar = Snackbar

                    .make(mLayout, "fancy a Snack while you refresh?", Snackbar.LENGTH_LONG)

                    .setAction("UNDO", new View.OnClickListener() {

                        @Override

                        public void onClick(View view) {

                            Snackbar snackbar1 = Snackbar.make(mLayout, "Action is restored!", Snackbar.LENGTH_SHORT);

                            snackbar1.show();

                        }

                    });





            snackbar.show();
            showAlertDialogButtonClicked(MainActivity2.this);
            swipeLayout.setRefreshing(false);





        }

    };


    // *** DIALOGO MODAL ***
    public void showAlertDialogButtonClicked(MainActivity2 view) {
        // setup the alert builder

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        //el dialogo estandar tiene título/icono pero podemos sustituirlo por un XML a medida
        builder.setTitle("Achtung!");
        builder.setMessage("Where do you go?");
// builder.setIcon(R.drawable.ic_action_name_dark);
        // un XML a medida para el diálogo

        builder.setView(getLayoutInflater().inflate(R.layout.alertdialog_view,
                null));


        // add the buttons
        builder.setPositiveButton("Glide", new
                DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // do something like...
                        dialog.dismiss();
                    }
                });
        builder.setNegativeButton("ChatBot", new
                DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // do something like...
                        dialog.dismiss();
                    }
                });

        builder.setNeutralButton("MotionLayout", new
                DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // do something like...
                        dialog.dismiss();
                    }
                });
        // create and show the alert dialog
        AlertDialog dialog = builder.create();
        dialog.show();
    }




}