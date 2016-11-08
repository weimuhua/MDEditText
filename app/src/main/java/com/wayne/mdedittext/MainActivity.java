package com.wayne.mdedittext;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;

import com.wayne.mdedittext.ui.MDEditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    @SuppressWarnings("deprecation")
    private void initView() {
        MDEditText customUnderlineEt1 = (MDEditText) findViewById(R.id.custom_underline_et1);
        customUnderlineEt1.getEditText().setBackgroundDrawable(
                ContextCompat.getDrawable(this, R.drawable.md_edittext_bkg));

        MDEditText customUnderlineEt2 = (MDEditText) findViewById(R.id.custom_underline_et2);
        customUnderlineEt2.getEditText().setBackgroundDrawable(
                ContextCompat.getDrawable(this, R.drawable.md_edittext_bkg));
    }
}