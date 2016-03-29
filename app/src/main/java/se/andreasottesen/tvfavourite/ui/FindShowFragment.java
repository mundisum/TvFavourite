package se.andreasottesen.tvfavourite.ui;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import se.andreasottesen.tvfavourite.R;
import se.andreasottesen.tvfavourite.data.EndpointInterface;
import se.andreasottesen.tvfavourite.model.Show;
import se.andreasottesen.tvfavourite.model.ShowAdapter;
import se.andreasottesen.tvfavourite.utils.Constants;

/**
 * A simple {@link Fragment} subclass.
 */
public class FindShowFragment extends Fragment {
    private static final String LOG_TAG = FindShowFragment.class.getSimpleName();

    private ListView _listView;
    private ShowAdapter _adapter;
    private EndpointInterface _serviceInterface;
    private List<Show> _shows;
    private EditText _editFindShow;
    private Retrofit _retrofit;

    public FindShowFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_find_show, container, false);

        initializeScreen(rootView);

        return rootView;
    }

    private void initializeScreen(View rootView){
        _listView = (ListView) rootView.findViewById(R.id.list_find_show);
        _editFindShow = (EditText) rootView.findViewById(R.id.edit_find_show);

        _retrofit = new Retrofit.Builder()
                .baseUrl(Constants.API_ROOT_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        _serviceInterface = _retrofit.create(EndpointInterface.class);

        // Hook up keyboard and done to search field
        _editFindShow.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE || event.getKeyCode() == KeyEvent.FLAG_EDITOR_ACTION){
                    findShows(_editFindShow.getText().toString());
                }
                return true;
            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();

        if(_adapter != null){
            _adapter.clear();
        }
    }

    public void findShows(String query){
        Call<List<Show>> call = _serviceInterface.searchShow(query);
        call.enqueue(new Callback<List<Show>>() {
            @Override
            public void onResponse(Call<List<Show>> call, retrofit2.Response<List<Show>> response) {
                int statusCode = response.code();
                _shows = response.body();

                populateList();
            }

            @Override
            public void onFailure(Call<List<Show>> call, Throwable t) {
                Log.e(LOG_TAG, "error searching show " + t.getMessage());
            }
        });
    }

    private void populateList(){
        _adapter = new ShowAdapter(getActivity(), R.layout.list_item_show, _shows);
        _listView.setAdapter(_adapter);
    }
}
