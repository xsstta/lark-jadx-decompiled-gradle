package com.huawei.hms.locationSdk;

import android.app.PendingIntent;
import android.os.Looper;
import com.huawei.hms.location.LocationCallback;
import com.huawei.hms.location.LocationRequest;
import java.util.Objects;

public class a0 extends AbstractC23675x {

    /* renamed from: b */
    private LocationRequest f58390b;

    /* renamed from: c */
    private PendingIntent f58391c;

    /* renamed from: d */
    private LocationCallback f58392d;

    /* renamed from: e */
    private int f58393e = 0;

    /* renamed from: f */
    private String f58394f;

    /* renamed from: g */
    private Looper f58395g;

    public a0(LocationRequest locationRequest, PendingIntent pendingIntent, LocationCallback locationCallback, Looper looper, String str) {
        this.f58390b = locationRequest;
        this.f58391c = pendingIntent;
        if (locationRequest != null) {
            this.f58393e = locationRequest.getNumUpdates();
        }
        this.f58392d = locationCallback;
        this.f58395g = looper;
        if (locationCallback != null) {
            this.f58394f = str;
        } else {
            this.f58394f = null;
        }
        mo83542a(str);
    }

    /* renamed from: a */
    public void mo83477a(int i) {
        this.f58393e = i;
    }

    /* renamed from: a */
    public boolean mo83478a(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a0.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f58392d, ((a0) obj).f58392d);
    }

    /* renamed from: b */
    public PendingIntent mo83479b() {
        return this.f58391c;
    }

    /* renamed from: b */
    public void mo83480b(String str) {
        this.f58394f = str;
    }

    /* renamed from: b */
    public boolean mo83481b(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a0.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f58391c, ((a0) obj).f58391c);
    }

    /* renamed from: c */
    public LocationCallback mo83482c() {
        return this.f58392d;
    }

    /* renamed from: d */
    public LocationRequest mo83483d() {
        return this.f58390b;
    }

    /* renamed from: e */
    public Looper mo83484e() {
        return this.f58395g;
    }

    @Override // com.huawei.hms.locationSdk.AbstractC23675x
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a0.class == obj.getClass()) {
            if (mo83482c() != null) {
                return mo83478a(obj);
            }
            if (mo83479b() != null) {
                return mo83481b(obj);
            }
        }
        return false;
    }

    /* renamed from: f */
    public int mo83486f() {
        return this.f58393e;
    }

    /* renamed from: g */
    public String mo83487g() {
        return this.f58394f;
    }

    public int hashCode() {
        return 0;
    }
}
