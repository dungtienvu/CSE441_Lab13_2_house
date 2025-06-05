package com.example.gridviewbonus;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class ImageActivity extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        imageView = new ImageView(this);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        ));
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);

        int imgId = getIntent().getIntExtra("img_id", -1);
        if (imgId != -1) {
            Bitmap bitmap = ImageUtils.decodeSampledBitmapFromResource(
                    getResources(), imgId, 800, 800 // giới hạn ảnh khoảng 800x800
            );
            imageView.setImageBitmap(bitmap);
        }


        setContentView(imageView);
    }
}

