package com.ipkw.gambar;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView ourView;

    // This is the entry point to our game
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Do all our drawing in a separate method
        draw();

        // Make ourView ImageView object the view for the Activity
        setContentView(ourView);

    }

    private void draw() {
        // Declare an object of type Bitmap
        Bitmap blankBitmap;
        // Make it 600 x 600 pixels in size and an appropriate format
        blankBitmap = Bitmap.createBitmap(600,600,Bitmap.Config.ARGB_8888);
        // Declare an object of type canvas
        Canvas canvas;
        // Initialize it by making its surface our previously created blank bitmap
        canvas = new Canvas(blankBitmap);

        // Initialize our previously declared member object of type ImageView
        ourView = new ImageView(this);
        // Put our blank bitmap on ourView
        ourView.setImageBitmap(blankBitmap);

        // We now have a surface ready to draw on
        // But we need something to draw with

        // Declare an object of type Paint
        Paint paint;
        // Initialize it ready for painting our canvas
        paint = new Paint();

        // Make the canvas tosca
        canvas.drawColor(Color.argb(255, 0, 193, 187));

        // Make the brush black
        paint.setColor(Color.argb(255,  0, 0, 20));
        // We can change this around as wells

        // Declare an object of type Bitmap
        Bitmap bitmapSnowman;
        // Initialize it using the snowman.png file
        bitmapSnowman = BitmapFactory.decodeResource(this.getResources(), R.drawable.snowman);
        // Now draw snowman to our canvas
        canvas.drawBitmap(bitmapSnowman, 450, 50, paint);

        // Draw a line
        canvas.drawLine(50,50,250,250,paint);

        // Draw some text
        canvas.drawText("Snowman", 50, 50, paint);

        // Draw a pixel
        canvas.drawPoint(10,50,paint);

        // Draw a circle
        canvas.drawCircle(350,250,100,paint);

        // Change the brush color
        paint.setColor(Color.argb(255,  255, 255, 255));

        // Draw a rectangle
        canvas.drawRect(50,450,500,550,paint);

        // Back to onCreate method to set our canvas as the view

    }
}