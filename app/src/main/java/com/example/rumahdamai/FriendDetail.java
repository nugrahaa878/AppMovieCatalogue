package com.example.rumahdamai;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class FriendDetail extends AppCompatActivity {
    private static final String TAG = "FriendDetail";
    private TextView Nama, About, Alamat, Nisn, Universitas;
    private ImageView Photo;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_friend);
        Log.d(TAG, "onCreate:started.");

        getIncomingIntent();
        setImage();
    }


    private void getIncomingIntent(){
       Nama = findViewById(R.id.tv_item_name);
       About = findViewById(R.id.tv_item_about);
       Alamat = findViewById(R.id.tv_item_alamat);
       Nisn = findViewById(R.id.tv_item_nisn);
       Universitas = findViewById(R.id.tv_item_universitas);
       Photo = findViewById(R.id.img_item_photo);
    }

    private void setImage(){

        Intent data = getIntent();
        String nama = data.getStringExtra("nama");
        String about = data.getStringExtra("about");
        String alamat = data.getStringExtra("alamat");
        String nisn = data.getStringExtra("nisn");
        String universitas = data.getStringExtra("universitas");
        String photo = data.getStringExtra("image_url");

        Nama.setText(nama);
        About.setText(about);
        Alamat.setText("Alamat : " + alamat);
        Nisn.setText("NISN : " + nisn);
        Universitas.setText("Sekarang kuliah di : " + universitas);

//        Glide.with(this)
//                .load(photo)
//                .apply(new RequestOptions().override(350, 350))
//                .into(Photo);

        Glide.with(this)
                .load(getResources().getIdentifier(photo, "drawable", getPackageName()))
                .apply(new RequestOptions().override(55,55))
                .into(Photo);
    }
}
