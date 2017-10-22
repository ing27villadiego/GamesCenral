package edu.webfutuandroid.ing26sistemas.gamescenral.view.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.webfutuandroid.ing26sistemas.gamescenral.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TournamentsFragment extends Fragment {


    public TournamentsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tournaments, container, false);
    }

}
