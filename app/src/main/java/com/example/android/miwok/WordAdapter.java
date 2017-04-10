package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Matusz on 06.04.2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColor;

    public WordAdapter(Activity context, ArrayList<Word> word, int color){
        super(context, 0, word);
        this.mColor = color;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);

        }
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView miwokWordTextView = (TextView) listItemView.findViewById(R.id.miwokWord);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        miwokWordTextView.setText(currentWord.getMiwokTranslation());


        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView englishWordTextView = (TextView) listItemView.findViewById(R.id.englishWord);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        englishWordTextView.setText(currentWord.getEnglishTranslation());


        ImageView iconView = (ImageView) listItemView.findViewById(R.id.iconView);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        if(currentWord.hasImage()) {
            iconView.setImageResource(currentWord.getImageResourceId());
            iconView.setVisibility(View.VISIBLE);
        }
        else{
            iconView.setVisibility(View.GONE);
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColor);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}

