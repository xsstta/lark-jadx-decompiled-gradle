package com.ss.android.vc.meeting.utils;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.PowerManager;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60752f;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.service.C63634c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000?\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b*\u0001\u000e\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001b\u001cB\u0007\b\u0016¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nJ\u000e\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0004J\u000e\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nJ\u0006\u0010\u0019\u001a\u00020\u0015J\u0006\u0010\u001a\u001a\u00020\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0018\u00010\u0013R\u00020\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/vc/meeting/utils/ProximityDetector;", "", "()V", "isEnable", "", "isProximityOptFgOn", "isStarted", "isSupprotSenor", "mListeners", "", "Lcom/ss/android/vc/meeting/utils/ProximityDetector$OnProximityChangedListener;", "mPowerManager", "Landroid/os/PowerManager;", "mSensorEventListener", "com/ss/android/vc/meeting/utils/ProximityDetector$mSensorEventListener$1", "Lcom/ss/android/vc/meeting/utils/ProximityDetector$mSensorEventListener$1;", "mSensorManager", "Landroid/hardware/SensorManager;", "mSensorWakeLock", "Landroid/os/PowerManager$WakeLock;", "addOnProximityChangedListener", "", "listener", "enable", "removeOnProximityChangedListener", "start", "stop", "Companion", "OnProximityChangedListener", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.utils.k */
public final class ProximityDetector {

    /* renamed from: e */
    public static final Companion f160426e = new Companion(null);

    /* renamed from: a */
    public PowerManager.WakeLock f160427a;

    /* renamed from: b */
    public List<OnProximityChangedListener> f160428b = new ArrayList();

    /* renamed from: c */
    public volatile boolean f160429c;

    /* renamed from: d */
    public volatile boolean f160430d = C63634c.m249496b("byteview.meeting.android.proximity_opt");

    /* renamed from: f */
    private SensorManager f160431f;

    /* renamed from: g */
    private PowerManager f160432g;

    /* renamed from: h */
    private volatile boolean f160433h;

    /* renamed from: i */
    private volatile boolean f160434i;

    /* renamed from: j */
    private final C63500c f160435j = new C63500c(this);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/ss/android/vc/meeting/utils/ProximityDetector$OnProximityChangedListener;", "", "onAwayFromScreen", "", "onCloseToScreen", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.utils.k$b */
    public interface OnProximityChangedListener {
        /* renamed from: a */
        void mo219644a();

        /* renamed from: b */
        void mo219645b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/vc/meeting/utils/ProximityDetector$Companion;", "", "()V", "TAG", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.utils.k$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    public final void mo219643b() {
        C60700b.m235851b("ProximityDetector", "[stop]", "stop");
        this.f160433h = false;
        if (this.f160434i && this.f160429c) {
            this.f160429c = false;
            SensorManager sensorManager = this.f160431f;
            if (sensorManager != null) {
                sensorManager.unregisterListener(this.f160435j);
            }
            PowerManager.WakeLock wakeLock = this.f160427a;
            if (wakeLock != null && wakeLock.isHeld()) {
                C60700b.m235851b("ProximityDetector", "[stop2]", "release wakelock");
                wakeLock.release();
            }
        }
    }

    public ProximityDetector() {
        Object systemService = ar.m236694a().getSystemService("sensor");
        if (systemService != null) {
            this.f160431f = (SensorManager) systemService;
            Object systemService2 = ar.m236694a().getSystemService("power");
            if (systemService2 != null) {
                this.f160432g = (PowerManager) systemService2;
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.os.PowerManager");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.hardware.SensorManager");
    }

    /* renamed from: a */
    public final void mo219641a() {
        boolean z;
        PowerManager.WakeLock wakeLock;
        C60700b.m235851b("ProximityDetector", "[start]", "isProximityOptFgOn=" + this.f160430d);
        SensorManager sensorManager = this.f160431f;
        if (sensorManager != null) {
            Sensor defaultSensor = sensorManager.getDefaultSensor(8);
            if (defaultSensor != null) {
                z = true;
            } else {
                z = false;
            }
            this.f160434i = z;
            if (this.f160434i && !this.f160429c) {
                this.f160429c = true;
                if (this.f160427a == null) {
                    PowerManager powerManager = this.f160432g;
                    if (powerManager != null) {
                        wakeLock = powerManager.newWakeLock(32, "vc:autoWakeOffScreen");
                    } else {
                        wakeLock = null;
                    }
                    this.f160427a = wakeLock;
                    Unit unit = Unit.INSTANCE;
                }
                if (this.f160430d) {
                    sensorManager.registerListener(this.f160435j, defaultSensor, 3, C60735ab.m236017e());
                    return;
                }
                PowerManager.WakeLock wakeLock2 = this.f160427a;
                if (wakeLock2 != null && !wakeLock2.isHeld()) {
                    C60700b.m235851b("ProximityDetector", "[start2]", "acquire wakelock");
                    wakeLock2.setReferenceCounted(false);
                    wakeLock2.acquire();
                }
                sensorManager.registerListener(this.f160435j, defaultSensor, 3);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/vc/meeting/utils/ProximityDetector$mSensorEventListener$1", "Landroid/hardware/SensorEventListener;", "onAccuracyChanged", "", "sensor", "Landroid/hardware/Sensor;", "accuracy", "", "onSensorChanged", "event", "Landroid/hardware/SensorEvent;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.utils.k$c */
    public static final class C63500c implements SensorEventListener {

        /* renamed from: a */
        final /* synthetic */ ProximityDetector f160436a;

        public void onAccuracyChanged(Sensor sensor, int i) {
            Intrinsics.checkParameterIsNotNull(sensor, "sensor");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C63500c(ProximityDetector kVar) {
            this.f160436a = kVar;
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            PowerManager.WakeLock wakeLock;
            boolean z;
            Intrinsics.checkParameterIsNotNull(sensorEvent, "event");
            float[] fArr = sensorEvent.values;
            if (!C60752f.m236080a(fArr)) {
                Sensor sensor = sensorEvent.sensor;
                Intrinsics.checkExpressionValueIsNotNull(sensor, "event.sensor");
                if (sensor.getType() == 8) {
                    C60700b.m235851b("ProximityDetector", "[onSensorChanged]", "value=" + fArr[0]);
                    if (fArr[0] < BitmapDescriptorFactory.HUE_RED || fArr[0] >= 3.1f) {
                        if (this.f160436a.f160430d && (wakeLock = this.f160436a.f160427a) != null) {
                            if (!this.f160436a.f160429c || wakeLock.isHeld()) {
                                z = false;
                            } else {
                                z = true;
                            }
                            if (!z) {
                                wakeLock = null;
                            }
                            if (wakeLock != null) {
                                C60700b.m235851b("ProximityDetector", "[onSensorChanged2]", "start: acquire wakelock");
                                wakeLock.setReferenceCounted(false);
                                wakeLock.acquire();
                            }
                        }
                        Iterator<T> it = this.f160436a.f160428b.iterator();
                        while (it.hasNext()) {
                            it.next().mo219645b();
                        }
                        return;
                    }
                    Iterator<T> it2 = this.f160436a.f160428b.iterator();
                    while (it2.hasNext()) {
                        it2.next().mo219644a();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo219642a(boolean z) {
        C60700b.m235851b("ProximityDetector", "[enable]", "oldEnable=" + this.f160433h + ", newEnable=" + z);
        if (this.f160433h != z) {
            this.f160433h = z;
            if (z) {
                mo219641a();
            } else {
                mo219643b();
            }
        }
    }
}
