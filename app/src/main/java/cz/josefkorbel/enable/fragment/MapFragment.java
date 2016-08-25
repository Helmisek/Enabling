package cz.josefkorbel.enable.fragment;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mapbox.mapboxsdk.MapboxAccountManager;
import com.mapbox.mapboxsdk.annotations.IconFactory;
import com.mapbox.mapboxsdk.annotations.MarkerOptions;
import com.mapbox.mapboxsdk.annotations.MarkerViewOptions;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.maps.MapView;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.OnMapReadyCallback;

import cz.josefkorbel.enable.R;
import cz.josefkorbel.enable.databinding.FragmentMapBinding;
import cz.josefkorbel.enable.fragment.base.BaseFragment;
import cz.josefkorbel.enable.viewmodel.MapFragmentViewModel;
import cz.kinst.jakub.viewmodelbinding.ViewModelBindingConfig;

/**
 * Created by Jsf on 23. 8. 2016.
 * Map Fragment Containing All Map Setup And Functions
 */

public class MapFragment extends BaseFragment<FragmentMapBinding,MapFragmentViewModel> {

    private MapView mapView;
    private BitmapDrawable bitmapDrawable;
    private Bitmap originalBitmap;
    private Bitmap resizedBitmap;
    private com.mapbox.mapboxsdk.annotations.Icon icon;

    @Override
    public ViewModelBindingConfig<MapFragmentViewModel> getViewModelBindingConfig() {
        return new ViewModelBindingConfig<>(R.layout.fragment_map, MapFragmentViewModel.class);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = super.onCreateView(inflater, container, savedInstanceState);

        // Map
        MapboxAccountManager.start(this.getContext(), getString(R.string.access_token));
        mapView = (MapView) rootView.findViewById(R.id.mapview);
        mapView.onCreate(savedInstanceState);

        // Icon Size 56x56dp
        int height = (int) convertDpToPixel(56,getContext());
        int width = (int) convertDpToPixel(56,getContext());

        bitmapDrawable =(BitmapDrawable) ContextCompat.getDrawable(this.getContext(), R.drawable.pinpoint_timothy);
        originalBitmap = bitmapDrawable.getBitmap();
        resizedBitmap = Bitmap.createScaledBitmap(originalBitmap, width, height, false);

        IconFactory iconFactory = IconFactory.getInstance(this.getContext());
        icon = iconFactory.fromBitmap(resizedBitmap);


        mapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(MapboxMap mapboxMap) {
                // Customize map with markers, polylines, etc.

                mapboxMap.addMarker(new MarkerOptions()
                        .position(new LatLng(-33.85699436, 151.21510684))
                        .icon(icon));

                mapboxMap.addMarker(new MarkerOptions()
                        .position(new LatLng(-33.60699436, 151.11110684))
                        .icon(icon));

                mapboxMap.addMarker(new MarkerOptions()
                        .position(new LatLng(-33.50699436, 151.12110684))
                        .icon(icon));

                mapboxMap.addMarker(new MarkerOptions()
                        .position(new LatLng(-33.40699436, 151.13110684))
                        .icon(icon));

            }
        });

        return rootView;
    }


    /**
     * This method converts dp unit to equivalent pixels, depending on device density.
     *
     * @param dp A value in dp (density independent pixels) unit. Which we need to convert into pixels
     * @param context Context to get resources and device specific display metrics
     * @return A float value to represent px equivalent to dp depending on device density
     */
    private static float convertDpToPixel(float dp, Context context){
        Resources resources = context.getResources();
        DisplayMetrics metrics = resources.getDisplayMetrics();
        return dp * ((float)metrics.densityDpi / DisplayMetrics.DENSITY_DEFAULT);
    }

    @Override
    public void onResume() {
        super.onResume();
        mapView.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        mapView.onPause();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mapView.onSaveInstanceState(outState);
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mapView.onLowMemory();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mapView.onDestroy();
    }


}
