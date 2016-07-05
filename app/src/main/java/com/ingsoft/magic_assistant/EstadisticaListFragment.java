package com.ingsoft.magic_assistant;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.ingsoft.magic_assistant.data.StatsData;
import com.ingsoft.magic_assistant.services.StatsService;
import com.ingsoft.magic_assistant.services.StatsServiceInstance;

import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;


public class EstadisticaListFragment extends ListFragment {

    public StatsData estadisticas = new StatsData();

    /**m
     * The serialization (saved instance state) Bundle key representing the
     * activated item position. Only used on tablets.
     */
    private static final String STATE_ACTIVATED_POSITION = "activated_position";

    /**
     * The fragment's current callback object, which is notified of list item
     * clicks.
     */

    /**
     * The current activated item position. Only used on tablets.
     */
    private int mActivatedPosition = ListView.INVALID_POSITION;

    /**
     * A callback interface that all activities containing this fragment must
     * implement. This mechanism allows activities to be notified of item
     * selections.
     */
    /*
    public interface Callbacks {

        public void onItemSelected(String id);
    }


    private static Callbacks sDummyCallbacks = new Callbacks() {
        @Override
        public void onItemSelected(String id) {
        }
    };
    */

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public EstadisticaListFragment() {
    }

    private void obtenerEstadisticasPersonaje() {
        StatsService dueloService = StatsServiceInstance.createStatsService();
        Call<StatsData> estadisticas = dueloService.getStats();

        estadisticas.enqueue(new Callback<StatsData>() {
            @Override
            public void onResponse(Response<StatsData> response, Retrofit retrofit) {
                StatsData estadisticas = response.body();
                mostrarCaracteristicasPersonaje(estadisticas);
            }


            @Override
            public void onFailure(Throwable t) {
                t.printStackTrace();
                Log.e("MTGApp", t.getMessage());
            }
        });

    }

    private void mostrarCaracteristicasPersonaje( StatsData estadisticas) {
        this.estadisticas.sum(estadisticas);
        setListAdapter(
                new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_activated_1,
                android.R.id.text1,
                estadisticas.toStats()));

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        obtenerEstadisticasPersonaje();
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Restore the previously serialized activated item position.
        if (savedInstanceState != null
                && savedInstanceState.containsKey(STATE_ACTIVATED_POSITION)) {
            setActivatedPosition(savedInstanceState.getInt(STATE_ACTIVATED_POSITION));
        }
    }



    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        if (mActivatedPosition != ListView.INVALID_POSITION) {
            // Serialize and persist the activated item position.
            outState.putInt(STATE_ACTIVATED_POSITION, mActivatedPosition);
        }
    }

    /**
     * Turns on activate-on-click mode. When this mode is on, list items will be
     * given the 'activated' state when touched.
     */
    public void setActivateOnItemClick(boolean activateOnItemClick) {
        // When setting CHOICE_MODE_SINGLE, ListView will automatically
        // give items the 'activated' state when touched.
        getListView().setChoiceMode(activateOnItemClick
                ? ListView.CHOICE_MODE_SINGLE
                : ListView.CHOICE_MODE_NONE);
    }

    private void setActivatedPosition(int position) {
        if (position == ListView.INVALID_POSITION) {
            getListView().setItemChecked(mActivatedPosition, false);
        } else {
            getListView().setItemChecked(position, true);
        }

        mActivatedPosition = position;
    }
}
