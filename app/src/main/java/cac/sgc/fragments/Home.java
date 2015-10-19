package cac.sgc.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cac.sgc.MainActivity;
import cac.sgc.R;

/**
 * Created by Legal on 04/10/2015.
 */
public class Home extends Fragment {

    private static Home ourInstance = null;
    private MainActivity context;
    private View view;

    public Home() {}

    public static Home init(MainActivity context) {
        if ( ourInstance == null ) {
            ourInstance = new Home();
            ourInstance.context = context;
        }
        return ourInstance;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.home,container,false);

        return view;
    }

}