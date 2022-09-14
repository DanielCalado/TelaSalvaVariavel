package com.example.login;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.login.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        Button botao = binding.button;
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.textView2.setText(binding.editTextTextPersonName.getText());
            }
        });
    }
}
