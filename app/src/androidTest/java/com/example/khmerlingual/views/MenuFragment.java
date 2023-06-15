package com.example.khmerlingual.views;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.khmerlingual.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

/**
 * Main navigation menu
 * Slides down from top right corner to display written list
 * of the app's main pages (home, leaderboard, profile, stats).
 * Menu can be hidden by tapping away from the menu on the
 * bottom half of the screen.
 */
public class MenuFragment extends BottomSheetDialogFragment{

    public MenuFragment() { }

    /**
     * Called when the activity is started
     * @param savedInstanceState  - if non-null, the fragment is being
     * re-constructed from this previous saved state
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    /**
     * Called after the view is created
     * @param inflater  - the LayoutInflater object that can be used to inflate
     * any views in the fragment
     * @param viewGroup  - if non-null, this is the parent view that the fragment's
     * UI should be attached to. This can be used to generate the LayoutParams of the view.
     * @param savedInstanceState  - if non-null, the fragment is being re-constructed
     * from this previous saved state
     *
     * @return view the created view
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_menu, viewGroup, false);

        // add functionality to home text
        TextView homeText = view.findViewById(R.id.home_text);
        homeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), AppHomeActivity.class));
            }
        });

        return view;
    }
}

