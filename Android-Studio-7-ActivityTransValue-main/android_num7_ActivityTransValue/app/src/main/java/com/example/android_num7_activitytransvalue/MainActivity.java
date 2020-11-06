package com.example.android_num7_activitytransvalue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text_B();
    }
    public void clickAtoB(View v)
    {
        EditText edit_A = (EditText)findViewById(R.id.editV1);
        Intent intent = new Intent(this, SecondActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("T", edit_A.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);
    }
    private void text_B()
    {
        int B1 = 0;
        Bundle bundle = this.getIntent().getExtras();
        if (bundle != null)
        {
            B1 = Integer.parseInt(bundle.getString("R"));
            TextView B = (TextView) findViewById(R.id.valueStr);
            B.setText(Integer.toString(B1));
        }
    }
}