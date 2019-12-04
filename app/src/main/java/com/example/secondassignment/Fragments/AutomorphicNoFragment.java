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
public class AutomorphicNoFragment extends Fragment implements View.OnClickListener{


    private EditText etNumber;
    private Button btnCheck;
    private TextView tvOutput;

    public AutomorphicNoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_automorphic_no,container,false);
        etNumber = view.findViewById(R.id.etAutomorphic);
        btnCheck = view.findViewById(R.id.btnCheckAutomorphic);
        tvOutput = view.findViewById(R.id.tvOutputAutomorphic);

        btnCheck.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        if (TextUtils.isEmpty(etNumber.getText())){
            etNumber.setError("Enter a Number");
            return;
        }

        int N = Integer.parseInt(etNumber.getText().toString());
        int d=1; int i;
        for(i=N;i>0;i=i/10)
        {
            d=d*10;
        }
        if((N*N)%d==N)
        {
            tvOutput.setText(Integer.toString(N).concat(" is a Automorphic Number"));
        }
        else
        {
            tvOutput.setText(Integer.toString(N).concat(" is not a Automorphic Number"));
        }

    }
}
