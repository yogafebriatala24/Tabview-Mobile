package com.tvacstudio.tabs;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FlightsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FlightsFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FlightsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FlightsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FlightsFragment newInstance(String param1, String param2) {
        FlightsFragment fragment = new FlightsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_flights, container, false);
        String[] menuItems={"Mobile Programing","Pemrograman Web 2","Teknik Kompilasi","Kecerdasan Buatan"};
        ListView listView= view.findViewById(R.id.listview);
        ArrayAdapter<String> listViewAdapter= new ArrayAdapter<String>(
                getActivity(), android.R.layout.simple_list_item_1,menuItems
        );
        listView.setAdapter(listViewAdapter);


        // Inflate the layout for this fragment
        return view ;
    }
}