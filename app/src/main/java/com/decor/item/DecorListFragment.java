package com.decor.item;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.chethanseenappa.mydecor.R;

/**
 * Created by ChethanSeenappa on 1/23/2016.
 */
public class DecorListFragment extends Fragment{
    private static final String TAG = DecorListFragment.class.getSimpleName();
    CardView mCardView;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment NotificationFragment.
     */
    public static DecorListFragment newInstance() {
        DecorListFragment fragment = new DecorListFragment();
        fragment.setRetainInstance(true);
        return fragment;
    }

    public DecorListFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_card_view, parent, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mCardView = (CardView) view.findViewById(R.id.cardview);
//        mCardView.setOnClickListener();
    }

}
