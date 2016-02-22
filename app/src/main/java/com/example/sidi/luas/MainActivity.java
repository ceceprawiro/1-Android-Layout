package com.example.sidi.luas;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.bindOnClick();
    }

    private void bindOnClick() {
        Button buttonHitung = (Button) findViewById(R.id.buttonHitung);
        buttonHitung.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View view) {
                EditText editPanjang = (EditText) findViewById(R.id.editPanjang);
                EditText editLebar = (EditText) findViewById(R.id.editLebar);
                TextView textLuas = (TextView) findViewById(R.id.textLuas);

                int panjang = Integer.parseInt(editPanjang.getText().toString());
                int lebar = Integer.parseInt(editLebar.getText().toString());
                int luas = panjang * lebar;

                textLuas.setText(String.valueOf(luas));
            }
        });
    }
}
