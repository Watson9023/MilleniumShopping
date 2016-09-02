package com.milleniumshopping.app.milleniumshopping.activity.internet;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.milleniumshopping.app.milleniumshopping.R;
import com.milleniumshopping.app.milleniumshopping.domain.internet.Internet;

public class AddInternet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_internet);
    }

    public void previewInternet(View v)
    {
        Intent intent = new Intent(this, PreviewInternet.class);

        String isp = ((EditText)findViewById(R.id.editText1)).getText().toString();
        String planName = ((EditText)findViewById(R.id.editText2)).getText().toString();
        String price = ((EditText)findViewById(R.id.editText3)).getText().toString();
        String dataAllowance = ((EditText)findViewById(R.id.editText4)).getText().toString();
        String type = ((EditText)findViewById(R.id.editText5)).getText().toString();

        Internet internet = new Internet.Builder()
                .ISP(isp)
                .planName(planName)
                .price(price)
                .dataAllowance(dataAllowance)
                .type(type)
                .build();

        intent.putExtra("INTERNET", internet);
        startActivity(intent);
    }
}
