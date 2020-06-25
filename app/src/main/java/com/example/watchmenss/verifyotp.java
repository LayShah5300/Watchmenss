package com.example.watchmenss;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class verifyotp extends AppCompatActivity implements TextWatcher {
    EditText editText1;
    EditText editText2;
    EditText editText3;
    EditText editText4;
    EditText editText5;
    EditText editText6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verifyotp);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        editText3 = findViewById(R.id.editText3);
        editText4 = findViewById(R.id.editText4);
        editText5 = findViewById(R.id.editText5);
        editText6 = findViewById(R.id.editText6);

        editText1.addTextChangedListener(this);
        editText2.addTextChangedListener(this);
        editText3.addTextChangedListener(this);
        editText4.addTextChangedListener(this);
        editText5.addTextChangedListener(this);
        editText6.addTextChangedListener(this);
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void afterTextChanged(Editable editable) {
        if (editable.length()==1)
        {
            if(editText1.length()==1)
            {
                editText2.requestFocus();
            }
            if(editText2.length()==1)
            {
                editText3.requestFocus();
            }
            if(editText3.length()==1)
            {
                editText4.requestFocus();
            }
            if(editText4.length()==1)
            {
                editText5.requestFocus();
            }
            if(editText5.length()==1)
            {
                editText6.requestFocus();
            }
        }
        else if (editable.length()==0) {
            if (editText6.length() == 0) {
                editText5.requestFocus();
            }
            if (editText5.length() == 0) {
                editText4.requestFocus();
            }
            if (editText4.length() == 0) {
                editText3.requestFocus();
            }
            if (editText3.length() == 0) {
                editText2.requestFocus();
            }
            if (editText2.length() == 0) {
                editText1.requestFocus();
            }
        }
    }
}
