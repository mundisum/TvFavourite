package se.andreasottesen.tvfavourite.ui;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.IOException;

import se.andreasottesen.tvfavourite.R;
import se.andreasottesen.tvfavourite.data.ApiService;

public class MainActivity extends AppCompatActivity {
    private ViewPager _viewPager;
    private SectionPageAdapter _adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeScreen();

        ApiService service = new ApiService();

        //service.findShows("star");
        //service.getShowByImdb("tt0944947");
    }

    private void initializeScreen(){
        _viewPager = (ViewPager) findViewById(R.id.pager);
        _viewPager.setOffscreenPageLimit(2);

        _adapter = new SectionPageAdapter(getSupportFragmentManager());

        _viewPager.setAdapter(_adapter);
    }
}

