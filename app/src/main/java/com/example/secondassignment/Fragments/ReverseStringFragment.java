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
public class ReverseStringFragment extends Fragment implements View.OnClickListener{

    private EditText etString;
    private Button btnCalculate;
    private TextView tvOutput;


    public ReverseStringFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_reverse_string,container,false);
        etString = view.findViewById(R.id.etReserveS);
        btnCalculate = view.findViewById(R.id.btnReverseS);
        tvOutput = view.findViewById(R.id.tvOutputReverseS);

        btnCalculate.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        if (TextUtils.isEmpty(etString.getText())){
            etString.setError("Enter a String");
            return;
        }

        String S = String.valueOf(etString.getText());
        StringBuilder stringBuilder = new StringBuilder(S);
        String Result = String.valueOf(stringBuilder.reverse());

        tvOutput.setText("Reversed String is: ".concat(Result));

    }
}
