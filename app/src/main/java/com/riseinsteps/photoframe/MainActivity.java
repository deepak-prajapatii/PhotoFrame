package com.riseinsteps.photoframe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    ImageView images;
    int currImage = 0;
    TextView name;
    String names[] = {"Grid","Sabrina","Deepak"};
    public void prev(View view){
        String idX = "images" + currImage;
        int x = this.getResources().getIdentifier(idX,"id",getPackageName());
        images = findViewById(x);
        images.setAlpha(0f);

        currImage = (3 + currImage - 1)%3;
        String idY = "images"+currImage;
        int y = this.getResources().getIdentifier(idY,"id",getPackageName());
        images = findViewById(y);
        images.setAlpha(1f);
        name = findViewById(R.id.img_name);
        name.setText(names[currImage]);
    }

    public void next(View view){
        String idY = "images" + currImage;
        int y = this.getResources().getIdentifier(idY,"id",getPackageName());
        images = findViewById(y);
        images.setAlpha(0f);

        currImage = (3 + currImage + 1)%3;
        String idX = "images" + currImage;
        int x = this.getResources().getIdentifier(idX,"id", getPackageName());
        images = findViewById(x);
        images.setAlpha(1f);
        name = findViewById(R.id.img_name);
        name.setText(names[currImage]);

    }

}