package com.example.sedar.menuapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetailFragment extends Fragment {
    TextView detailTextView,titleTextView;
    ImageView imageView;

    public DetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =inflater.inflate(R.layout.fragment_detail, container, false);

        detailTextView = (TextView)view.findViewById(R.id.detail_description);
        titleTextView = (TextView)view.findViewById(R.id.detail_title);
        imageView = (ImageView)view.findViewById(R.id.detail_image);

        String[] itemNames = getResources().getStringArray(R.array.item_names);
        String[] itemDescriptions = getResources().getStringArray(R.array.item_descriptions);
        String[] images = getResources().getStringArray(R.array.item_images);


        int buttonNumber = getArguments().getInt("buttonNumber");
        buttonNumber -= 1;
        titleTextView.setText(itemNames[buttonNumber]);
        detailTextView.setText(itemDescriptions[buttonNumber]);
       int resourceId = getResources().getIdentifier(images[buttonNumber], "drawable",getActivity().getPackageName());
        imageView.setImageResource(resourceId);

        return view;
    }

}