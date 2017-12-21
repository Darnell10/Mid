package c4q.com.new_recycler_view;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import c4q.com.mid_unit_4.DisplayFragment;
import c4q.com.mid_unit_4.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {

    View rootView;
    Button button;



    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_main, container, false);
        button = (Button)rootView.findViewById(R.id.first_button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayFragment displayFragment = new DisplayFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Bundle bundle = new Bundle();
                displayFragment.setArguments(bundle);
                fragmentTransaction.replace(R.id.main_frag_container);
                fragmentTransaction.addToBackStack("next");
                fragmentTransaction.commit();

            }
        });
    }

}
