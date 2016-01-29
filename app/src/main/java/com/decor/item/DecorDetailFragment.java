package com.decor.item;

import android.app.Activity;
import android.support.design.widget.CollapsingToolbarLayout;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.decor.item.model.DecorItem;
import com.example.chethanseenappa.mydecor.R;
import com.decor.item.model.DecorMainCategory;

/**
 * A fragment representing a single Decor detail screen.
 * This fragment is either contained in a {@link DecorMainActivity}
 * in two-pane mode (on tablets) or a {@link DecorDetailActivity}
 * on handsets.
 */
public class DecorDetailFragment extends Fragment {
    public static final String ARG_ITEM_ID = "item_id";
    private DecorItem.Item mItem;

    public DecorDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments().containsKey(ARG_ITEM_ID)) {
//            mItem = DecorItem.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));
            Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
            if (appBarLayout != null) {
//                appBarLayout.setTitle(mItem.content);
                appBarLayout.setTitle("Some random value");
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.decor_detail, container, false);
        if (mItem != null) {
//            ((TextView) rootView.findViewById(R.id.decor_detail)).setText(mItem.details);
            ((TextView) rootView.findViewById(R.id.decor_detail)).setText("random text");
        }
        return rootView;
    }
}