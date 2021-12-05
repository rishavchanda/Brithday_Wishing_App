package com.rishav.brithdaywishing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.rishav.brithdaywishing.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    // View Binding 
    ActivityMainBinding binding;
    String input="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



        binding.next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input = binding.nameInput.getText().toString();
                if(!input.equals("")) {
                    Intent intent = new Intent(MainActivity.this, WishingScreeen.class);
                    intent.putExtra("Name", input);
                    startActivity(intent);
                }else{
                    Toast.makeText(MainActivity.this, "Enter Name first", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}