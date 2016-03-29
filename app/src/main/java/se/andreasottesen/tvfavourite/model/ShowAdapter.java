package se.andreasottesen.tvfavourite.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import se.andreasottesen.tvfavourite.R;

/**
 * Created by andreas.ottesen on 2016-03-29.
 */
public class ShowAdapter extends ArrayAdapter {
    private Context _context;
    private int _layout;
    private List<Show> _shows;

    private TextView textShowName;

    public ShowAdapter(Context context, int layout, List<Show> shows){
        super(context, layout, shows);

        this._context = context;
        this._layout = layout;
        this._shows = shows;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Show show = (Show) getItem(position);

        if (convertView == null){
            convertView = LayoutInflater.from(_context).inflate(_layout, parent, false);
        }

        textShowName = (TextView) convertView.findViewById(R.id.text_show_name);
        textShowName.setText(show.getName());

        return convertView;
    }
}
