package com.facebook.react.modules.netinfo;

import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.netinfo.types.CellularGeneration;
import com.facebook.react.modules.netinfo.types.ConnectionType;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* access modifiers changed from: package-private */
/* renamed from: com.facebook.react.modules.netinfo.b */
public abstract class AbstractC21199b {

    /* renamed from: a */
    private final ConnectivityManager f51674a;

    /* renamed from: b */
    private final WifiManager f51675b;

    /* renamed from: c */
    private final TelephonyManager f51676c;

    /* renamed from: d */
    private final ReactApplicationContext f51677d;
    @Nonnull

    /* renamed from: e */
    private ConnectionType f51678e = ConnectionType.UNKNOWN;
    @Nullable

    /* renamed from: f */
    private CellularGeneration f51679f;

    /* renamed from: g */
    private boolean f51680g;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo72016a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo72018b();

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public ReactApplicationContext mo72024d() {
        return this.f51677d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public ConnectivityManager mo72025e() {
        return this.f51674a;
    }

    /* renamed from: c */
    private void mo72019c() {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) mo72024d().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("netInfo.networkStatusDidChange", m76947f());
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:20|21|(1:25)|26|27|28|29|30|31) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0099 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x00a8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x00c5 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.facebook.react.bridge.WritableMap m76947f() {
        /*
        // Method dump skipped, instructions count: 300
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.netinfo.AbstractC21199b.m76947f():com.facebook.react.bridge.WritableMap");
    }

    /* renamed from: a */
    public void mo72017a(Promise promise) {
        promise.resolve(m76947f());
    }

    AbstractC21199b(ReactApplicationContext reactApplicationContext) {
        this.f51677d = reactApplicationContext;
        this.f51674a = (ConnectivityManager) reactApplicationContext.getSystemService("connectivity");
        this.f51675b = (WifiManager) reactApplicationContext.getApplicationContext().getSystemService("wifi");
        this.f51676c = (TelephonyManager) reactApplicationContext.getSystemService("phone");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo72023a(@Nonnull ConnectionType connectionType, @Nullable CellularGeneration cellularGeneration, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4 = true;
        if (connectionType != this.f51678e) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (cellularGeneration != this.f51679f) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z == this.f51680g) {
            z4 = false;
        }
        if (z2 || z3 || z4) {
            this.f51678e = connectionType;
            this.f51679f = cellularGeneration;
            this.f51680g = z;
            mo72019c();
        }
    }
}
