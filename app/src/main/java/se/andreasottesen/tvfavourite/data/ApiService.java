package se.andreasottesen.tvfavourite.data;

import android.util.Log;

import java.io.IOException;
import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import se.andreasottesen.tvfavourite.model.Show;
import se.andreasottesen.tvfavourite.utils.Constants;

/**
 * Created by andreas.ottesen on 2016-03-27.
 */
public class ApiService {
    private final String LOG_TAG = ApiService.class.getSimpleName();
    private Retrofit _retrofit;
    private EndpointInterface _serviceInterface;

    public ApiService(){
        _retrofit = new Retrofit.Builder()
                .baseUrl(Constants.API_ROOT_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        _serviceInterface = _retrofit.create(EndpointInterface.class);
    }

    public void getShowByImdb(String imdb) {
        Call<Show> call = _serviceInterface.getShowByImdb(imdb);
        call.enqueue(new Callback<Show>() {
            @Override
            public void onResponse(Call<Show> call, retrofit2.Response<Show> response) {
                int statusCode = response.code();
                Show show = response.body();
            }

            @Override
            public void onFailure(Call<Show> call, Throwable t) {
                Log.e(LOG_TAG, "error getting show " + t.getMessage());
            }
        });
    }
}
