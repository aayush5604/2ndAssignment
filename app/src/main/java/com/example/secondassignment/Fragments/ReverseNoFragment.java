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
public class ReverseNoFragment extends Fragment implements View.OnClickListener{
    private Button btnCalculate;
    private EditText etNumber;
    private TextView tvOutput;

    public ReverseNoFragment() {


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_reverse_no, container, false);
        etNumber = view.findViewById(R.id.etReserveN);
        btnCalculate = view.findViewById(R.id.btnReverseN);
        tvOutput = view.findViewById(R.id.tvOutputReverseN);

        btnCalculate.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        if (TextUtils.isEmpty(etNumber.getText())){
            etNumber.setError("Enter No");
            return;
        }

        int Reverse = Integer.parseInt(etNumber.getText().toString());
        int ReversedNo = 0, Remainder;

        while (Reverse != 0 ){
            Remainder = Reverse % 10;
            ReversedNo = ReversedNo * 10 + Remainder;
            Reverse = Reverse/10;
        }

        tvOutput.setText("Reverse is: ".concat(Integer.toString(ReversedNo)));


    }
}
