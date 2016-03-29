package se.andreasottesen.tvfavourite.data;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import se.andreasottesen.tvfavourite.model.Show;

/**
 * Created by andreas.ottesen on 2016-03-27.
 */
public interface EndpointInterface {

    @GET("lookup/shows")
    Call<Show> getShowByImdb(@Query("imdb") String imdb);

    @GET("search/shows")
    Call<List<Show>> searchShow(@Query("q") String query);
}
