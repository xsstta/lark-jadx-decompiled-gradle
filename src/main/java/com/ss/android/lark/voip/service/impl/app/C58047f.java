package com.ss.android.lark.voip.service.impl.app;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.voip.service.impl.C58151d;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.ss.android.lark.voip.service.impl.app.f */
public class C58047f {

    /* renamed from: a */
    public Set<AbstractC58049a> f142776a = new HashSet();

    /* renamed from: b */
    private SensorManager f142777b;

    /* renamed from: c */
    private SensorEventListener f142778c = new SensorEventListener() {
        /* class com.ss.android.lark.voip.service.impl.app.C58047f.C580481 */

        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            float[] fArr = sensorEvent.values;
            if (fArr != null && sensorEvent.sensor.getType() == 8) {
                boolean z = false;
                if (Float.compare(fArr[0], BitmapDescriptorFactory.HUE_RED) != 0) {
                    z = true;
                }
                for (AbstractC58049a aVar : C58047f.this.f142776a) {
                    if (z) {
                        aVar.mo196782b();
                    } else {
                        aVar.mo196780a();
                    }
                }
                if (z) {
                    C58151d.m225578a("ui", "ui", "away from screen", "[ProximitySensorDetector] onAwayFromScreen");
                } else {
                    C58151d.m225578a("ui", "ui", "close to screen", "[ProximitySensorDetector] onCloseToScreen");
                }
            }
        }
    };

    /* renamed from: com.ss.android.lark.voip.service.impl.app.f$a */
    public interface AbstractC58049a {
        /* renamed from: a */
        void mo196780a();

        /* renamed from: b */
        void mo196782b();
    }

    /* renamed from: a */
    public void mo196812a() {
        this.f142776a.clear();
        SensorManager sensorManager = this.f142777b;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this.f142778c);
        }
    }

    public C58047f(Context context) {
        this.f142777b = (SensorManager) context.getSystemService("sensor");
    }

    /* renamed from: a */
    public void mo196813a(AbstractC58049a aVar) {
        if (aVar != null && !this.f142776a.contains(aVar)) {
            this.f142776a.add(aVar);
        }
        SensorManager sensorManager = this.f142777b;
        if (sensorManager != null) {
            sensorManager.registerListener(this.f142778c, sensorManager.getDefaultSensor(8), 2);
        }
    }
}
