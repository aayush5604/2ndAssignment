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
public class PalindromeFragment extends Fragment implements View.OnClickListener{
    private Button btnCalculate;
    private EditText etNumber;
    private TextView tvOutput;

    public PalindromeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_palindrome, container, false);
        etNumber = view.findViewById(R.id.etPalindrome);
        btnCalculate = view.findViewById(R.id.btnCheckPalindrome);
        tvOutput = view.findViewById(R.id.tvOutputPalindrome);

        btnCalculate.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        if (TextUtils.isEmpty(etNumber.getText())){
            etNumber.setError("Enter a Number");
            return;
        }

        int P;
        P = Integer.parseInt(etNumber.getText().toString());
        int Palindrome = P;
        int remainder;
        int reserve = 0;


        while( Palindrome != 0 )
        {
            remainder = Palindrome % 10;
            reserve = reserve * 10 + remainder;
            Palindrome  /= 10;
        }

        if (reserve == P){
            tvOutput.setText((Integer.toString(P).concat(" is a Palindrome No")));
        } else {
            tvOutput.setText((Integer.toString(P).concat(" is not a Palindrome No")));
        }


    }
}
