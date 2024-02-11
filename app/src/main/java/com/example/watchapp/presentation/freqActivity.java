package com.example.watchapp.presentation;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.TextView;

import com.example.watchapp.R;

import me.tankery.lib.circularseekbar.CircularSeekBar;

public class freqActivity extends Activity {

    private int freqHZ = 0;

    private CircularSeekBar circle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_freq);

        TextView percentageDisplay = findViewById(R.id.textView);

        circle = findViewById(R.id.circularSeekBar);

        percentageDisplay.setText(((int)(((double)circle.getProgress()/100)*390))+10+" Hz");

        circle.setOnSeekBarChangeListener(new CircularSeekBar.OnCircularSeekBarChangeListener() {
            @Override
            public void onProgressChanged(CircularSeekBar circularSeekBar, float progress, boolean fromUser) {
                // Log the progress value whenever it changes
                Log.d("CircularSeekBar", "Progress: " + progress);
                percentageDisplay.setText(((int)(((double)circle.getProgress()/100)*390))+10+" Hz");
                freqHZ=(((int)(((double)circle.getProgress()/100)*390))+10);
            }

            @Override
            public void onStopTrackingTouch(CircularSeekBar seekBar) {
                // Handle when the user stops dragging the thumb (optional)
            }

            @Override
            public void onStartTrackingTouch(CircularSeekBar seekBar) {
                // Handle when the user starts dragging the thumb (optional)
            }
        });



        Button send = findViewById(R.id.button);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String dataToSend = "f "+freqHZ;

                Intent intent = new Intent(freqActivity.this, MainActivity.class);
                intent.putExtra("key", dataToSend);
                setResult(RESULT_OK, intent);
                finish();

            }
        });

    }

}