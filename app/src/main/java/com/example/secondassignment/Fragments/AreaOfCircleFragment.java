package com.example.secondassignment.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.secondassignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AreaOfCircleFragment extends Fragment implements View.OnClickListener{
    private Button btnCalculate;
    private EditText etRadius;
    private TextView tvResult;


    public AreaOfCircleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_area_of_circle,container,false);

        etRadius = view.findViewById(R.id.etRadius);
        btnCalculate= view.findViewById(R.id.btnArea);
        tvResult = view.findViewById(R.id.tvOutputArea);

        btnCalculate.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {

        if (TextUtils.isEmpty(etRadius.getText())){
            etRadius.setError("Enter Radius");
            return;
        }

        double Radius = Double.parseDouble(etRadius.getText().toString());
        double Result = Math.PI * Radius * Radius;

        tvResult.setText("Area is: ".concat(Double.toString(Result)));


    }
}
