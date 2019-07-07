package com.vimalcvs.colledge.questionpaper;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.vimalcvs.colledge.MainActivity;
import com.vimalcvs.colledge.R;

/**
 * Created by VIMALCVS on 21-Oct-18.
 */

public class VocationalFragment extends Fragment {

    private OnFragmentInteractionListener listener;
    public static VocationalFragment newInstance() {
        return new VocationalFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.vocationalfragment, container, false);


        RelativeLayout layout1 = (RelativeLayout) view.findViewById(R.id.button1);
        layout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getActivity(),V_Tourism_Management_Que.class);
                i.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(i);
            }
        });


        RelativeLayout layout2 = (RelativeLayout) view.findViewById(R.id.button2);
        layout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getActivity(), V_Materials_Management_Que.class);
                i.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(i);
            }
        });
        RelativeLayout layout3 = (RelativeLayout) view.findViewById(R.id.button3);
        layout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getActivity(), V_Human_Resource_Management_Que.class);
                i.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(i);
            }
        });


        RelativeLayout layout4 = (RelativeLayout) view.findViewById(R.id.button4);
        layout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getActivity(), V_Small_and_Medium_Enterprises_Que.class);
                i.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(i);
            }
        });
        RelativeLayout layout5 = (RelativeLayout) view.findViewById(R.id.button5);
        layout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getActivity(), V_Management_and_Marketing_of_Insurance_Que.class);
                i.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(i);
            }
        });


        RelativeLayout layout6 = (RelativeLayout) view.findViewById(R.id.button6);
        layout6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getActivity(), V_Office_Management_and_Secretarial_Practice_Que.class);
                i.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(i);

            }
        });

        RelativeLayout layout7 = (RelativeLayout) view.findViewById(R.id.button7);
        layout7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), V_Marketing_Management_and_Retail_Business_Que.class);
                i.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(i);

            }
        });
        RelativeLayout layout8 = (RelativeLayout) view.findViewById(R.id.button8);
        layout8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), V_Bachelor_of_Management_Studies_Que.class);
                i.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(i);

            }
        });

        return view;


    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof HonoursFragment.OnFragmentInteractionListener) {
            listener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        listener = null;
    }





    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




    }

    public interface OnFragmentInteractionListener {

    }

}
