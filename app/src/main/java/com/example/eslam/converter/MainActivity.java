package com.example.eslam.converter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button imgButton;
    float money = 0;
    float newAmount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnClickButton (View view){
        EditText editText = (EditText) findViewById(R.id.amount);
        if ( isEmpty(editText) == false) {
            ImageView imageView = (ImageView) findViewById(R.id.dollar);
            imageView.setImageResource(R.drawable.pounds);
            convertMethod();
        }
        else {
            Toast.makeText(this, "Enter a value to convert", Toast.LENGTH_SHORT).show();
            return;
        }
    }

    public void convertMethod (){
        EditText editText = (EditText) findViewById(R.id.amount);
        money = Float.valueOf(editText.getText().toString());
        newAmount = (float) (12.3 * money);
        TextView moneyAmount = (TextView) findViewById(R.id.inpound);
        moneyAmount.setText(String.valueOf(newAmount));
    }

    public void onTouch (View view){
        ImageView imgView = (ImageView) findViewById(R.id.dollar);
        imgView.setImageResource(R.drawable.dollar);
    }

    private boolean isEmpty(EditText edText){
        if (edText.getText().toString().equals(""))
          return true ;
        else
        return false;
    }
}
