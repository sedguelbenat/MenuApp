package com.example.sedar.menuapp;


import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MenuFragment fragment = new MenuFragment();

        FragmentManager fragmentManager=getSupportFragmentManager();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction = fragmentTransaction.add(R.id.main_activity_fragment_container, fragment);

        fragmentTransaction.commit();
    }

    public void showDetail(int buttonNumber){

        //Create the Bundle object
        Bundle bundle = new Bundle();
        //Put the number in it with String key as buttonNumber
        bundle.putInt("buttonNumber", buttonNumber);

        DetailFragment detailFragment = new DetailFragment();
        //Pass in the bundle object
        detailFragment.setArguments(bundle);

        FragmentManager fragmentManager = getSupportFragmentManager();


        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction().replace(R.id.detail_activity_fragment_container_large,detailFragment);
        fragmentTransaction.commit();
    }
}