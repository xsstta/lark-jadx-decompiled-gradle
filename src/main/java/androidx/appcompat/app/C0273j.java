package androidx.appcompat.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import androidx.core.content.PermissionChecker;
import java.util.Calendar;

/* access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.app.j */
public class C0273j {

    /* renamed from: a */
    private static C0273j f739a;

    /* renamed from: b */
    private final Context f740b;

    /* renamed from: c */
    private final LocationManager f741c;

    /* renamed from: d */
    private final C0274a f742d = new C0274a();

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.j$a */
    public static class C0274a {

        /* renamed from: a */
        boolean f743a;

        /* renamed from: b */
        long f744b;

        /* renamed from: c */
        long f745c;

        /* renamed from: d */
        long f746d;

        /* renamed from: e */
        long f747e;

        /* renamed from: f */
        long f748f;

        C0274a() {
        }
    }

    /* renamed from: c */
    private boolean m1006c() {
        if (this.f742d.f748f > System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private Location m1005b() {
        Location location;
        Location location2 = null;
        if (PermissionChecker.checkSelfPermission(this.f740b, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            location = m1002a("network");
        } else {
            location = null;
        }
        if (PermissionChecker.checkSelfPermission(this.f740b, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location2 = m1002a("gps");
        }
        return (location2 == null || location == null) ? location2 != null ? location2 : location : location2.getTime() > location.getTime() ? location2 : location;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo974a() {
        C0274a aVar = this.f742d;
        if (m1006c()) {
            return aVar.f743a;
        }
        Location b = m1005b();
        if (b != null) {
            m1004a(b);
            return aVar.f743a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        if (i < 6 || i >= 22) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private Location m1002a(String str) {
        try {
            if (this.f741c.isProviderEnabled(str)) {
                return this.f741c.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }

    /* renamed from: a */
    static C0273j m1003a(Context context) {
        if (f739a == null) {
            Context applicationContext = context.getApplicationContext();
            f739a = new C0273j(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f739a;
    }

    /* renamed from: a */
    private void m1004a(Location location) {
        boolean z;
        long j;
        long j2;
        C0274a aVar = this.f742d;
        long currentTimeMillis = System.currentTimeMillis();
        C0272i a = C0272i.m1000a();
        a.mo973a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j3 = a.f736a;
        a.mo973a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        if (a.f738c == 1) {
            z = true;
        } else {
            z = false;
        }
        long j4 = a.f737b;
        long j5 = a.f736a;
        a.mo973a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j6 = a.f737b;
        if (j4 == -1 || j5 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            if (currentTimeMillis > j5) {
                j2 = 0 + j6;
            } else if (currentTimeMillis > j4) {
                j2 = 0 + j5;
            } else {
                j2 = 0 + j4;
            }
            j = j2 + 60000;
        }
        aVar.f743a = z;
        aVar.f744b = j3;
        aVar.f745c = j4;
        aVar.f746d = j5;
        aVar.f747e = j6;
        aVar.f748f = j;
    }

    C0273j(Context context, LocationManager locationManager) {
        this.f740b = context;
        this.f741c = locationManager;
    }
}
