package com.vimalcvs.colledge.questionpaper;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.AppCompatButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.vimalcvs.colledge.MainActivity;
import com.vimalcvs.colledge.R;

/**
 * Created by VIMALCVS on 21-Oct-18.
 */

public class HonoursFragment extends Fragment {

    private OnFragmentInteractionListener listener;


    public static HonoursFragment newInstance() {
        return new HonoursFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.honoursfragment, container, false);


        RelativeLayout layout1 = (RelativeLayout) view.findViewById(R.id.button1);
        layout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getActivity(), H_English_Que.class);
                i.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(i);
            }
        });


        RelativeLayout layout2 = (RelativeLayout) view.findViewById(R.id.button2);
        layout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getActivity(), H_Economics_Que.class);
                i.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(i);
            }
        });
        RelativeLayout layout3 = (RelativeLayout) view.findViewById(R.id.button3);
        layout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getActivity(), H_Historys_Que.class);
                i.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(i);
            }
        });


        RelativeLayout layout4 = (RelativeLayout) view.findViewById(R.id.button4);
        layout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getActivity(), H_Hindi_Que.class);
                i.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(i);
            }
        });
        RelativeLayout layout5 = (RelativeLayout) view.findViewById(R.id.button5);
        layout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getActivity(), H_Business_Economics_Que.class);
                i.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(i);
            }
        });


        RelativeLayout layout6 = (RelativeLayout) view.findViewById(R.id.button6);
        layout6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getActivity(), H_Computer_Science_Que.class);
                i.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(i);

            }
        });

        RelativeLayout layout7 = (RelativeLayout) view.findViewById(R.id.button7);
        layout7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), H_Bachelor_of_Commerce_Que.class);
                i.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(i);

            }
        });

        return view;


    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
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

    public interface OnFragmentInteractionListener {
        void onClicked();
    }

}
