package com.example.swara.googlemapsample;

import java.util.List;

/**
 * Created by swara on 12/6/17.
 */

public interface DirectionFinderListener {
    void onDirectionFinderStart();
    void onDirectionFinderSuccess(List<Route> route);
}
