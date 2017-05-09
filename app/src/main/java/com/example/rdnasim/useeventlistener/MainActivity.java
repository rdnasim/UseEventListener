package com.example.rdnasim.useeventlistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myButton = (Button) findViewById(R.id.button);

        myButton.setOnClickListener(

                new Button.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        TextView myText = (TextView) findViewById(R.id.textView);

                        myText.setText("Amar Bangladesh");

                    }
                }
        );
    }
}
