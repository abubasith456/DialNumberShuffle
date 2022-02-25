package com.example.dialnumbershuffle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.dialnumbershuffle.Utils.KeyboardView;
import com.example.dialnumbershuffle.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;
    SharedPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        prefs = getSharedPreferences("ToolTipActivity2", MODE_PRIVATE);
        activityMainBinding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String check = prefs.getString("value", "");
                Toast.makeText(getApplicationContext(), ""+check, Toast.LENGTH_SHORT).show();
            }
        });
    }
}