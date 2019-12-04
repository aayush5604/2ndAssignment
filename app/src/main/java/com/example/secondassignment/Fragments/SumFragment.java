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
public class SumFragment extends Fragment implements View.OnClickListener{
    private Button btnCalculate;
    private EditText etFirst,etSecond;
    private TextView tvOutput;


    public SumFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sum,container,false);
        // Inflate the layout for this fragment
        etFirst = view.findViewById(R.id.etFirst);
        etSecond = view.findViewById(R.id.etSecond);
        btnCalculate = view.findViewById(R.id.btnSum);
        tvOutput = view.findViewById(R.id.tvOutputSum);

        btnCalculate.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {

        if (TextUtils.isEmpty(etFirst.getText())){
            etFirst.setError("Enter First No");
            return;
        }
        else if (TextUtils.isEmpty(etSecond.getText())){
            etSecond.setError("Enter Second No");
            return;
        }

        int First = Integer.parseInt(etFirst.getText().toString());
        int Second = Integer.parseInt(etSecond.getText().toString());
        int Result = First + Second;

        tvOutput.setText("Sum is: ".concat(Integer.toString(Result)));

    }
}
