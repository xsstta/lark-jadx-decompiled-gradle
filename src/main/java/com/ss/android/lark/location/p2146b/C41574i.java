package com.ss.android.lark.location.p2146b;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Looper;
import androidx.core.app.ActivityCompat;
import com.ss.android.lark.location.C41550a;
import com.ss.android.lark.location.dto.LarkLocation;
import com.ss.android.lark.location.listener.AbstractC41582a;
import com.ss.android.lark.location.listener.LocationRequestOption;
import com.ss.android.lark.location.p2147c.C41576a;
import com.ss.android.lark.log.Log;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.ss.android.lark.location.b.i */
public class C41574i extends AbstractC41556a {

    /* renamed from: h */
    protected int f105639h = 0;

    /* renamed from: i */
    private LocationManager f105640i;

    /* renamed from: j */
    private Set<String> f105641j = new HashSet();

    /* renamed from: k */
    private boolean f105642k = false;

    /* renamed from: l */
    private LocationListener f105643l;

    /* renamed from: g */
    private void m164960g() {
        this.f105640i = (LocationManager) this.f105630a.getSystemService("location");
        m164961h();
    }

    /* renamed from: j */
    private LocationListener m164963j() {
        LocationListener locationListener = this.f105643l;
        if (locationListener != null) {
            return locationListener;
        }
        C415751 r0 = new LocationListener() {
            /* class com.ss.android.lark.location.p2146b.C41574i.C415751 */

            public void onLocationChanged(Location location) {
                Log.m165389i("LocationManagerService", "LocationManager onLocationChanged called.");
                C41574i.this.mo149601a(location);
            }

            public void onProviderDisabled(String str) {
                Log.m165389i("LocationManagerService", "onProviderDisabled called. provider:" + str);
            }

            public void onProviderEnabled(String str) {
                Log.m165389i("LocationManagerService", "onProviderEnabled called. provider:" + str);
            }

            public void onStatusChanged(String str, int i, Bundle bundle) {
                Log.m165389i("LocationManagerService", "onStatusChanged called. provider:" + str + ", status:" + i + ", extras:" + bundle);
            }
        };
        this.f105643l = r0;
        return r0;
    }

    /* renamed from: k */
    private void m164964k() {
        LocationListener locationListener;
        LocationManager locationManager = this.f105640i;
        if (locationManager != null && (locationListener = this.f105643l) != null) {
            locationManager.removeUpdates(locationListener);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.location.p2146b.AbstractC41556a
    /* renamed from: e */
    public boolean mo149535e() {
        return C41550a.m164878a().getAppStateDependency().mo149511a();
    }

    /* renamed from: i */
    private boolean m164962i() {
        if (ActivityCompat.checkSelfPermission(this.f105630a, "android.permission.ACCESS_FINE_LOCATION") == 0 || ActivityCompat.checkSelfPermission(this.f105630a, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private void m164961h() {
        if (this.f105641j == null) {
            this.f105641j = new HashSet();
        }
        if (this.f105640i.isProviderEnabled("gps")) {
            this.f105641j.add("gps");
        }
        if (this.f105640i.isProviderEnabled("network")) {
            this.f105641j.add("network");
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.location.p2146b.AbstractC41556a
    /* renamed from: c */
    public void mo149533c() {
        Log.m165389i("LocationManagerService", "LocationManager onPauseLocation called.");
        if (this.f105640i == null) {
            Log.m165389i("LocationManagerService", "LocationManager onPauseLocation called. but LocationManager is null.");
        } else if (this.f105641j.isEmpty()) {
            Log.m165389i("LocationManagerService", "LocationManager onPauseLocation called. but providerSet is empty.");
        } else if (mo149536f()) {
            Log.m165389i("LocationManagerService", "LocationManager onPauseLocation called. but listeners is empty.");
        } else {
            m164964k();
            Log.m165389i("LocationManagerService", "LocationManager onPauseLocation called. stop location.");
        }
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41556a
    /* renamed from: d */
    public void mo149534d() {
        Log.m165389i("LocationManagerService", "LocationManager release called.");
        if (mo149536f()) {
            if (this.f105640i != null) {
                Log.m165389i("LocationManagerService", "removeUpdates.");
                m164964k();
                this.f105641j.clear();
                this.f105640i = null;
                this.f105643l = null;
            }
            mo149522a();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.location.p2146b.AbstractC41556a
    /* renamed from: b */
    public void mo149529b() {
        Log.m165389i("LocationManagerService", "LocationManager onRestartLocation called.");
        if (this.f105640i == null) {
            Log.m165389i("LocationManagerService", "LocationManager onRestartLocation called. but locationManager is null.");
        } else if (this.f105641j.isEmpty()) {
            Log.m165389i("LocationManagerService", "LocationManager onRestartLocation called. but providerSet is empty.");
        } else if (mo149536f()) {
            Log.m165389i("LocationManagerService", "LocationManager onRestartLocation called. but listeners is empty.");
        } else if (m164962i()) {
            mo149523a((LarkLocation) null, (List<Location>) null);
            Log.m165389i("LocationManagerService", "LocationManager onRestartLocation called. haven't permission.");
        } else {
            if (this.f105642k) {
                for (String str : this.f105641j) {
                    this.f105640i.requestSingleUpdate(str, m164963j(), (Looper) null);
                }
            } else {
                for (String str2 : this.f105641j) {
                    this.f105640i.requestLocationUpdates(str2, (long) this.f105631b, (float) this.f105639h, m164963j());
                }
            }
            Log.m165389i("LocationManagerService", "LocationManager onRestartLocation called. restart location.");
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.location.p2146b.AbstractC41556a
    /* renamed from: a */
    public void mo149524a(AbstractC41582a aVar) {
        C41550a.m164878a().getAppStateDependency().mo149510a(aVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.location.p2146b.AbstractC41556a
    /* renamed from: b */
    public void mo149530b(AbstractC41582a aVar) {
        C41550a.m164878a().getAppStateDependency().mo149512b(aVar);
    }

    public C41574i(Context context) {
        if (context == null) {
            Log.m165383e("LocationManagerService", "context is null.");
            return;
        }
        this.f105630a = context.getApplicationContext();
        m164960g();
    }

    /* renamed from: a */
    public synchronized void mo149601a(Location location) {
        if (m164962i()) {
            Log.m165389i("LocationManagerService", "LocationManager onLocationChanged called. haven't permission.");
        } else if (location == null) {
            Log.m165389i("LocationManagerService", "LocationManager onLocationChanged called. but location is null, so getLastKnownLocation");
            mo149523a(C41576a.m164976a(this.f105630a, C41576a.m164974a(this.f105630a, this.f105640i, this.f105641j)), (List<Location>) null);
        } else {
            LarkLocation a = C41576a.m164976a(this.f105630a, location);
            mo149523a(a, (List<Location>) null);
            if (a != null) {
                Log.m165389i("LocationManagerService", "LocationManager location result" + a + "\ntime: " + a.getTime() + "\nspeed:" + a.getSpeed() + "\nElapsedRealtime:" + a.getElapsedRealtimeNanos());
            }
            if (this.f105642k) {
                m164964k();
            }
        }
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41556a
    /* renamed from: a */
    public boolean mo149525a(LocationRequestOption locationRequestOption) {
        Log.m165389i("LocationManagerService", "LocationManager getOnceLocation called, appStatus:" + mo149535e());
        this.f105642k = true;
        if (m164962i()) {
            mo149523a((LarkLocation) null, (List<Location>) null);
            Log.m165389i("LocationManagerService", "failed to getOnceLocation called. haven't permission.");
            return false;
        }
        if (this.f105640i == null) {
            this.f105640i = (LocationManager) this.f105630a.getSystemService("location");
        }
        if (locationRequestOption != null) {
            this.f105641j = C41576a.m164978a(this.f105640i, locationRequestOption.mo149700b());
        }
        if (this.f105641j.isEmpty()) {
            m164961h();
        }
        m164964k();
        if (mo149535e()) {
            Log.m165389i("LocationManagerService", "LocationManager getOnceLocation called, appStatus:" + mo149535e() + ", start once request location.");
            for (String str : this.f105641j) {
                this.f105640i.requestSingleUpdate(str, m164963j(), (Looper) null);
            }
        }
        return true;
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41556a
    /* renamed from: b */
    public boolean mo149531b(LocationRequestOption locationRequestOption) {
        Log.m165389i("LocationManagerService", "LocationManager getContinuousLocation called, appStatus:" + mo149535e());
        this.f105642k = false;
        if (m164962i()) {
            mo149523a((LarkLocation) null, (List<Location>) null);
            Log.m165389i("LocationManagerService", "failed to getContinuousLocation called. haven't permission.");
            return false;
        }
        if (this.f105640i == null) {
            this.f105640i = (LocationManager) this.f105630a.getSystemService("location");
        }
        if (locationRequestOption != null) {
            this.f105641j = C41576a.m164978a(this.f105640i, locationRequestOption.mo149700b());
        }
        if (this.f105641j.isEmpty()) {
            m164961h();
        }
        m164964k();
        if (!mo149535e()) {
            return true;
        }
        Log.m165389i("LocationManagerService", "LocationManager getContinuousLocation called, appStatus:" + mo149535e() + ", start continuous request location.");
        for (String str : this.f105641j) {
            this.f105640i.requestLocationUpdates(str, (long) this.f105631b, (float) this.f105639h, m164963j());
        }
        return true;
    }
}
