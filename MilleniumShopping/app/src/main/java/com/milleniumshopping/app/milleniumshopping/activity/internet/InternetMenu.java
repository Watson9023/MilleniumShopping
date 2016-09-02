package com.milleniumshopping.app.milleniumshopping.activity.internet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.milleniumshopping.app.milleniumshopping.R;

public class InternetMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internet_menu);
    }

    public void addInternet(View v)
    {
        Intent intent = new Intent(this, AddInternet.class);
        startActivity(intent);
    }

    public void viewInternet(View v)
    {
        Intent intent = new Intent(this, ViewInternet.class);
        startActivity(intent);
    }
}
