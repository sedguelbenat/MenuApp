package com.example.sedar.menuapp;


import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class MenuFragment extends Fragment {
    Button button1,button2,button3,button4,button5;

    public MenuFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_menu, container, false);

        button1 = (Button) view.findViewById(R.id.button1);
        button2 = (Button) view.findViewById(R.id.button2);
        button3 = (Button) view.findViewById(R.id.button3);
        button4 = (Button) view.findViewById(R.id.button4);
        button5 = (Button) view.findViewById(R.id.button5);



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            startDetailsActivity(1);

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDetailsActivity(2);

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDetailsActivity(3);

            }
        });


        // Inflate the layout for this fragment
        return view;
    }


    public void startDetailsActivity(int buttonNumber){

        if(getActivity().findViewById(R.id.detail_activity_fragment_container_large) != null){
            ((MainActivity) getActivity()).showDetail(buttonNumber);
        }

        else{
            //Create the intent
            Intent intent = new Intent(getActivity().getApplicationContext(), DetailActivity.class);

            //put the button number that was clicked
            //The string adds as a key, we can use this later to find the intent
            intent.putExtra("buttonNumber", buttonNumber);
            //finally, start the activity
            startActivity(intent);
        }

    }
}