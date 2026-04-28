package gr.york.mobiledev2026.database;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import gr.york.mobiledev2026.databinding.ActivityDatabaseBinding;

public class DatabaseActivity extends AppCompatActivity {

    private ActivityDatabaseBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDatabaseBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.databaseTxtTitle.setText(getIntent().getExtras().getString("name"));
        binding.databaseTxtNumber.setText(String.valueOf(getIntent().getExtras().getInt("number")));

        binding.databaseBtnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent();
                intent.putExtra("result", "Data from DatabaseActivity");

                setResult(3000, intent);
                finish();
            }
        });
    }
}