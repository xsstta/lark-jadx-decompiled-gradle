package com.ss.ttm.player;

import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.Log;

public class SensorData {
    private float[] accel = new float[3];
    private long mHandle;
    private SensorEventListener mListener;
    private SensorManager mSensorManager;
    private float[] magnet = new float[3];

    private static final native void _writeData(long j, int i, float f, float f2, float f3);

    /* access modifiers changed from: protected */
    public void finalize() {
        stop();
    }

    public Boolean initListeners() {
        return false;
    }

    public int start() {
        if (initListeners().booleanValue()) {
            return 0;
        }
        return -1;
    }

    public void stop() {
        Log.e("ttmn", "stop sensor");
        this.mHandle = 0;
    }

    public void setHandle(long j, TTPlayer tTPlayer) {
        this.mHandle = j;
        tTPlayer.getContext();
    }
}
