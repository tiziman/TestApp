package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }
        public void onClick_Btn(View v){

            Toast.makeText(this, "Test Button 을 눌렀음...1", Toast.LENGTH_LONG).show();
            //Toast.makeText(this, "Test Button 을 눌렀음...2", Toast.LENGTH_LONG).show();
            //Toast.makeText(this, "Test Button 을 눌렀음...3", Toast.LENGTH_LONG).show();
            //Toast.makeText(this, "Test Button 을 눌렀음...4", Toast.LENGTH_LONG).show();

        }
}
