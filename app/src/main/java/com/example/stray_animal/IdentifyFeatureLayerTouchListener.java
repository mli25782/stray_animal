package com.example.stray_animal;

import android.content.Context;
import android.view.MotionEvent;

import com.esri.arcgisruntime.layers.FeatureLayer;
import com.esri.arcgisruntime.mapping.view.DefaultMapViewOnTouchListener;
import com.esri.arcgisruntime.mapping.view.MapView;

public class IdentifyFeatureLayerTouchListener extends DefaultMapViewOnTouchListener {
    private FeatureLayer layer = null; // reference to the layer to identify features in

    // provide a default constructor
    public IdentifyFeatureLayerTouchListener(Context context, MapView mapView, FeatureLayer layerToIdentify) {
        super(context, mapView);
        layer = layerToIdentify;
    }

    // override the onSingleTapConfirmed gesture to handle a single tap on the MapView
    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        // get the screen point where user tapped
        android.graphics.Point screenPoint = new android.graphics.Point((int) e.getX(), (int) e.getY());
        // ...

        return true;
    }
}
