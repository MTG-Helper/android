package com.ingsoft.magic_assistant;

import android.app.Activity;
import android.support.design.widget.CollapsingToolbarLayout;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ingsoft.magic_assistant.services.StatsService;

/**
 * A fragment representing a single Estadistica detail screen.
 * This fragment is either contained in a {@link EstadisticaListActivity}
 * in two-pane mode (on tablets) or a {@link EstadisticaDetailActivity}
 * on handsets.
 */
public class EstadisticaDetailFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    /**
     * The dummy content this fragment is presenting.
     */
    private StatsService.Stats mItem;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public EstadisticaDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            mItem = StatsService.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));

            Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
            if (appBarLayout != null) {
                appBarLayout.setTitle(mItem.content);
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_estadistica_detail, container, false);

        if (mItem != null) {
            // ACA DEBERIA IR EL PEDIDO A LA API
            ((TextView) rootView.findViewById(R.id.estadistica_detail)).setText(mItem.details);
        }

        return rootView;
    }
}
