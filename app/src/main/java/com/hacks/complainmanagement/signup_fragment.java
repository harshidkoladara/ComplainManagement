package com.hacks.complainmanagement;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class signup_fragment extends Fragment {

    TextView signupText;
    EditText firstName, lastName, contact, email, password;
    RadioGroup sex;
    Button signup;

    public signup_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_signup_fragment, container, false);

        signupText = v.findViewById(R.id.signup_signuptext);
        firstName = v.findViewById(R.id.signup_firstname);
        lastName = v.findViewById(R.id.signup_lastname);
        contact = v.findViewById(R.id.signup_contact);
        email = v.findViewById(R.id.signup_email);
        password = v.findViewById(R.id.signup_password);
        sex = v.findViewById(R.id.signup_sex);
        signup = v.findViewById(R.id.signup_button);

//dfsdfsfs
        return v;
    }

    //TODO:take data make it validate and then add into server

}
