package com.niko.android_dev_lesson_1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main extends Activity {

    Button btnOK;
    Button btnCancel;
    TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnOK = findViewById(R.id.btnOK);
        btnOK.setOnClickListener(onClickListener);
        btnCancel = findViewById(R.id.btnCancel);
        btnCancel.setOnClickListener(onClickListener);
        txtView = findViewById(R.id.txtView);

    }


    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.btnOK:
                    txtView.setText("It's OK");
                    break;
                case R.id.btnCancel:
                    txtView.setText("It's cancel");
                    break;
            }
        }
    };
}
