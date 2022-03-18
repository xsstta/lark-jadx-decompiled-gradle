package com.ss.android.vc.irtc.impl.audioroute.controllerState;

interface ControllerState {
    int getState();

    void onEvent(int i, int i2);
}
