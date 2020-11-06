package com.example.android_num7_activitytransvalue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        text_A();
    }
    public void clickBtoA(View v)
    {
        EditText edit_B = (EditText)findViewById(R.id.editV2);
        Intent intent = new Intent(this, MainActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("R", edit_B.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);
    }
    private void text_A()
    {
        int A1= 0;
        Bundle bundle = this.getIntent().getExtras();
        if (bundle != null)
        {
            A1 = Integer.parseInt(bundle.getString("T"));
            TextView A = (TextView) findViewById(R.id.valueStr);
            A.setText(Integer.toString(A1));
        }
    }
}