package com.example.mounikapathuri.fragment101;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by mounikapathuri on 19-02-2018.
 */

public class SimpleAddition extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_main,container,false);

        Button b = (Button) view.findViewById(R.id.submit);
        final EditText editText = (EditText) view.findViewById(R.id.number);
        final TextView textView = (TextView) view.findViewById(R.id.fragment);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(editText.getText().toString());
            }
        });
        return view;
    }
}
