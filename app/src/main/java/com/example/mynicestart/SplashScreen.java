package com.example.mynicestart;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        openApp(true);
        TextView tv = findViewById(R.id.textView);
        ImageView imagen = findViewById(R.id.imaCora);
        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.alpha);
        ImageView imagen2 = findViewById(R.id.imageView6);
        Animation myanim2 = AnimationUtils.loadAnimation(this,R.anim.translation);

        imagen.startAnimation(myanim);
        imagen2.startAnimation(myanim2);
        tv.startAnimation(myanim);

        ImageView miFoto = findViewById(R.id.imaCora);
        Glide.with(this)
                .load(R.mipmap.icon12)
                .centerCrop()
                .transition(DrawableTransitionOptions.withCrossFade(100))
                .placeholder(new ColorDrawable(this.getResources().getColor(R.color.light_purple_button)))
//                .circleCrop()
//                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .into(miFoto);

    }

    private void openApp(boolean locationPermission) {

        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen
                        .this, LoginActivity.class);
                startActivity(intent);
            }
        }, 5000);


    }

}

