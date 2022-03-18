package com.ss.android.lark.p1820e;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;

/* renamed from: com.ss.android.lark.e.b */
public class C36910b {

    /* renamed from: a */
    public volatile AbstractC36912a f94900a;

    /* renamed from: b */
    private SensorManager f94901b;

    /* renamed from: c */
    private SensorEventListener f94902c = new SensorEventListener() {
        /* class com.ss.android.lark.p1820e.C36910b.C369111 */

        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            if (sensorEvent.sensor.getType() == 8 && sensorEvent.values != null) {
                if (sensorEvent.values[0] >= sensorEvent.sensor.getMaximumRange()) {
                    AbstractC36912a aVar = C36910b.this.f94900a;
                    if (aVar != null) {
                        aVar.mo136194a();
                        return;
                    }
                    return;
                }
                AbstractC36912a aVar2 = C36910b.this.f94900a;
                if (aVar2 != null) {
                    aVar2.mo136195b();
                }
            }
        }
    };

    /* renamed from: com.ss.android.lark.e.b$a */
    public interface AbstractC36912a {
        /* renamed from: a */
        void mo136194a();

        /* renamed from: b */
        void mo136195b();
    }

    /* renamed from: a */
    public void mo136280a() {
        SensorManager sensorManager = this.f94901b;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this.f94902c);
            this.f94900a = null;
        }
    }

    public C36910b(Context context) {
        if (context != null) {
            this.f94901b = (SensorManager) context.getSystemService("sensor");
        }
    }

    /* renamed from: a */
    public boolean mo136281a(AbstractC36912a aVar) {
        if (this.f94901b == null || aVar == null) {
            return false;
        }
        this.f94900a = aVar;
        SensorManager sensorManager = this.f94901b;
        sensorManager.registerListener(this.f94902c, sensorManager.getDefaultSensor(8), 3, ParticipantRepo.f117150c);
        return true;
    }
}
