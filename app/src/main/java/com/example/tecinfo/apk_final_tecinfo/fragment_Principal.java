package com.example.tecinfo.apk_final_tecinfo;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link fragment_Principal.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class fragment_Principal extends Fragment {

    private OnFragmentInteractionListener mListener;

    public fragment_Principal() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_fragment__principal, container, false);

        ImageView img1 = (ImageView) v.findViewById(R.id.img_res);
        ImageView img2 = (ImageView) v.findViewById(R.id.img_Piz);
        ImageView img3 = (ImageView) v.findViewById(R.id.img_Par);
        ImageView img4 = (ImageView) v.findViewById(R.id.img_Pis);
        ImageView img5 = (ImageView) v.findViewById(R.id.img_lan);
        ImageView img6 = (ImageView) v.findViewById(R.id.img_outros);

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getActivity(), Act_Lista_De_Locais.class);
                it.putExtra("identificador", "1");
                startActivity(it);

            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getActivity(), Act_Lista_De_Locais.class);
                it.putExtra("identificador", "2");
                startActivity(it);

            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getActivity(), Act_Lista_De_Locais.class);
                it.putExtra("identificador", "3");
                startActivity(it);

            }
        });

        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getActivity(), Act_Lista_De_Locais.class);
                it.putExtra("identificador", "4");
                startActivity(it);

            }
        });

        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getActivity(), Act_Lista_De_Locais.class);
                it.putExtra("identificador", "5");
                startActivity(it);

            }
        });

        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getActivity(), Act_Lista_De_Locais.class);
                it.putExtra("identificador", "6");
                startActivity(it);

            }
        });




        return v;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
