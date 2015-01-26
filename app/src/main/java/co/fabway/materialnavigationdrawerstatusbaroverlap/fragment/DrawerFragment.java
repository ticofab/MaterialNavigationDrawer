package co.fabway.materialnavigationdrawerstatusbaroverlap.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import co.fabway.materialnavigationdrawerstatusbaroverlap.R;

/**
 * Copyright 2015 Hengroen
 * Created by fabiotiriticco on 26/01/15.
 */
public class DrawerFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.drawer_fragment, null);
        return root;
    }
}
