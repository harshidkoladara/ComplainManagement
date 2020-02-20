package com.hacks.complainmanagement;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class login_fragment extends Fragment {

    TextView login, forgot;
    EditText email, password;
    Button button;

    public login_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_login_fragment, container, false);

        login = v.findViewById(R.id.login_textlogin);
        forgot = v.findViewById(R.id.login_forgot);
        email = v.findViewById(R.id.login__email);
        password = v.findViewById(R.id.login__password);
        button = v.findViewById(R.id.login_button);
            //TODO: get data from field and validate through database and use connection detector
        return v;
    }


}
