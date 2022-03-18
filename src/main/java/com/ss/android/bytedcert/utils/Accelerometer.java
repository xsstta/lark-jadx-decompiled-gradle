package com.ss.android.bytedcert.utils;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

public class Accelerometer {

    /* renamed from: a */
    public static CLOCKWISE_ANGLE f71511a;

    /* renamed from: b */
    private SensorManager f71512b;

    /* renamed from: c */
    private boolean f71513c;

    /* renamed from: d */
    private SensorEventListener f71514d = new SensorEventListener() {
        /* class com.ss.android.bytedcert.utils.Accelerometer.C284301 */

        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            if (sensorEvent.sensor.getType() == 1) {
                float f = sensorEvent.values[0];
                float f2 = sensorEvent.values[1];
                float f3 = sensorEvent.values[2];
                if (Math.abs(f) <= 3.0f && Math.abs(f2) <= 3.0f) {
                    return;
                }
                if (Math.abs(f) > Math.abs(f2)) {
                    if (f > BitmapDescriptorFactory.HUE_RED) {
                        Accelerometer.f71511a = CLOCKWISE_ANGLE.Deg0;
                    } else {
                        Accelerometer.f71511a = CLOCKWISE_ANGLE.Deg180;
                    }
                } else if (f2 > BitmapDescriptorFactory.HUE_RED) {
                    Accelerometer.f71511a = CLOCKWISE_ANGLE.Deg90;
                } else {
                    Accelerometer.f71511a = CLOCKWISE_ANGLE.Deg270;
                }
            }
        }
    };

    public enum CLOCKWISE_ANGLE {
        Deg0(0),
        Deg90(1),
        Deg180(2),
        Deg270(3);
        
        private int value;

        public int getValue() {
            return this.value;
        }

        private CLOCKWISE_ANGLE(int i) {
            this.value = i;
        }
    }

    /* renamed from: c */
    public static int m104197c() {
        return f71511a.getValue();
    }

    /* renamed from: b */
    public void mo101230b() {
        if (this.f71513c) {
            this.f71513c = false;
            this.f71512b.unregisterListener(this.f71514d);
        }
    }

    /* renamed from: a */
    public void mo101229a() {
        if (!this.f71513c) {
            this.f71513c = true;
            f71511a = CLOCKWISE_ANGLE.Deg90;
            SensorManager sensorManager = this.f71512b;
            sensorManager.registerListener(this.f71514d, sensorManager.getDefaultSensor(1), 3);
        }
    }

    public Accelerometer(Context context) {
        this.f71512b = (SensorManager) context.getSystemService("sensor");
        f71511a = CLOCKWISE_ANGLE.Deg90;
    }
}
