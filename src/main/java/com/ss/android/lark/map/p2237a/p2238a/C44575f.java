package com.ss.android.lark.map.p2237a.p2238a;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.IntentSender;
import android.location.Location;
import android.os.Looper;
import androidx.core.app.ActivityCompat;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.location.C21947c;
import com.google.android.gms.location.C21949e;
import com.google.android.gms.location.C21951f;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsStates;
import com.google.android.gms.tasks.AbstractC22091c;
import com.google.android.gms.tasks.AbstractC22092d;
import com.google.android.gms.tasks.AbstractC22093e;
import com.ss.android.lark.location.dto.LarkLocation;
import com.ss.android.lark.location.listener.AbstractC41582a;
import com.ss.android.lark.location.listener.LocationRequestOption;
import com.ss.android.lark.location.p2146b.AbstractC41556a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.map.MapModule;
import java.util.List;

/* renamed from: com.ss.android.lark.map.a.a.f */
public class C44575f extends AbstractC41556a {

    /* renamed from: h */
    public C21947c f112976h = new C21947c() {
        /* class com.ss.android.lark.map.p2237a.p2238a.C44575f.C445761 */

        @Override // com.google.android.gms.location.C21947c
        public void onLocationAvailability(LocationAvailability locationAvailability) {
            Log.m165389i("LocationService", "location availability:" + locationAvailability.toString());
            super.onLocationAvailability(locationAvailability);
            if (locationAvailability != null && !locationAvailability.mo74313a()) {
                C44575f.this.mo149523a((LarkLocation) null, (List<Location>) null);
            }
        }

        @Override // com.google.android.gms.location.C21947c
        public void onLocationResult(LocationResult locationResult) {
            String str;
            Log.m165389i("LocationService", "google location onLocationResult");
            if (locationResult == null || locationResult.mo74328a() == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("google location result null:");
                if (locationResult == null) {
                    str = "locationResult is null";
                } else {
                    str = "last location is null";
                }
                sb.append(str);
                Log.m165383e("LocationService", sb.toString());
                C44575f.this.mo149523a((LarkLocation) null, (List<Location>) null);
                return;
            }
            Location a = locationResult.mo74328a();
            Log.m165389i("LocationService", "google location size:" + locationResult.mo74329b().size());
            for (Location location : locationResult.mo74329b()) {
                if (location != null) {
                    Log.m165389i("LocationService", "all google location result: " + location.toString() + "\ntime: " + location.getTime() + "\nspeed:" + location.getSpeed() + "\nElapsedRealtime:" + location.getElapsedRealtimeNanos());
                    if (location.getTime() > a.getTime()) {
                        Log.m165389i("LocationService", "changed google location result: " + location.toString() + "\ntime: " + location.getTime() + "\nspeed:" + location.getSpeed() + "\nElapsedRealtime:" + location.getElapsedRealtimeNanos());
                        a = location;
                    }
                }
            }
            if (a.getExtras() != null) {
                Log.m165389i("LocationService", "google location extras: " + a.getExtras().toString());
            }
            if (C44575f.this.f112976h != null) {
                LarkLocation a2 = C44561b.m176807a(a);
                Log.m165389i("LocationService", "google location result" + a.toString() + "\ntime: " + a.getTime() + "\nspeed:" + a.getSpeed() + "\nElapsedRealtime:" + a.getElapsedRealtimeNanos());
                C44575f.this.mo149523a(a2, locationResult.mo74329b());
            }
        }
    };

    /* renamed from: i */
    private LocationRequest f112977i;

    /* renamed from: j */
    private FusedLocationProviderClient f112978j;

    /* renamed from: k */
    private boolean f112979k;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.location.p2146b.AbstractC41556a
    /* renamed from: e */
    public boolean mo149535e() {
        return MapModule.getDependency().getAppStateDependency().mo149519a();
    }

    /* renamed from: g */
    private void m176851g() {
        if (this.f112977i == null || this.f105630a == null) {
            Log.m165383e("LocationService", "failed to checkLocationSettings，because location request is null or content is null.");
            return;
        }
        LocationSettingsRequest.C21938a aVar = new LocationSettingsRequest.C21938a();
        aVar.mo74335a(this.f112977i);
        C21949e.m79315a(this.f105630a).mo74358a(aVar.mo74336a()).addOnSuccessListener(new AbstractC22093e<C21951f>() {
            /* class com.ss.android.lark.map.p2237a.p2238a.C44575f.C445805 */

            /* renamed from: a */
            public void mo75026a(C21951f fVar) {
                if (fVar != null && fVar.mo74357b() != null) {
                    LocationSettingsStates b = fVar.mo74357b();
                    Log.m165389i("LocationService", "bluetooth: usable :" + b.mo74345g() + " present:" + b.mo74346h() + "\tgps: usable:" + b.mo74339a() + " present:" + b.mo74340b() + "\tlocation: usable:" + b.mo74343e() + " present:" + b.mo74344f() + "\tnetwork: usable:" + b.mo74341c() + " present:" + b.mo74342d());
                }
            }
        }).addOnFailureListener(new AbstractC22092d() {
            /* class com.ss.android.lark.map.p2237a.p2238a.C44575f.C445794 */

            @Override // com.google.android.gms.tasks.AbstractC22092d
            /* renamed from: a */
            public void mo75025a(Exception exc) {
                Log.m165383e("LocationService", "google location settings fail:" + exc);
                Activity topActivity = MapModule.getDependency().getTopActivity();
                if (topActivity == null) {
                    Log.m165383e("LocationService", "failed to get top activity.");
                    return;
                }
                int statusCode = ((ApiException) exc).getStatusCode();
                Log.m165389i("LocationService", "failed to location settings, code:" + statusCode);
                if (statusCode == 6) {
                    try {
                        ((ResolvableApiException) exc).startResolutionForResult(topActivity, 1000);
                    } catch (IntentSender.SendIntentException e) {
                        Log.m165384e("LocationService", "failed to location settings resolution, e:", e);
                    } catch (ActivityNotFoundException e2) {
                        Log.m165384e("LocationService", "failed to find location settings activity, e:", e2);
                    }
                } else if (statusCode == 8502) {
                    Log.m165389i("LocationService", "location settings can't be resolved.");
                }
            }
        });
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41556a
    /* renamed from: d */
    public synchronized void mo149534d() {
        Log.m165389i("LocationService", "googlemaps release called.");
        if (this.f112978j == null) {
            mo149522a();
            return;
        }
        if (mo149536f()) {
            mo149522a();
            this.f112978j.mo74308a(this.f112976h);
            this.f112977i = null;
            this.f112978j = null;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.location.p2146b.AbstractC41556a
    /* renamed from: b */
    public synchronized void mo149529b() {
        Log.m165389i("LocationService", "googlemaps onRestartLocation called.");
        if (!this.f112979k) {
            Log.m165389i("LocationService", "googlemaps onRestartLocation called. GooglePlayServices isn't available.");
        } else if (this.f112978j == null) {
            Log.m165389i("LocationService", "googlemaps onRestartLocation called. FusedLocationClient is null.");
        } else if (this.f112977i == null) {
            Log.m165389i("LocationService", "googlemaps onRestartLocation called. LocationRequest is null.");
        } else if (mo149536f()) {
            Log.m165389i("LocationService", "googlemaps onRestartLocation called. listeners is empty.");
        } else if (ActivityCompat.checkSelfPermission(this.f105630a, "android.permission.ACCESS_FINE_LOCATION") == 0 || ActivityCompat.checkSelfPermission(this.f105630a, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            Log.m165389i("LocationService", "googlemaps onRestartLocation called. restart location.");
            this.f112978j.mo74307a(this.f112977i, this.f112976h, Looper.getMainLooper());
        } else {
            mo149523a((LarkLocation) null, (List<Location>) null);
            Log.m165389i("LocationService", "googlemaps onRestartLocation called. haven't permission.");
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.location.p2146b.AbstractC41556a
    /* renamed from: c */
    public synchronized void mo149533c() {
        Log.m165389i("LocationService", "googlemaps onPauseLocation called.");
        if (!this.f112979k) {
            Log.m165389i("LocationService", "googlemaps onPauseLocation called, GooglePlayServices isn't available.");
        } else if (this.f112978j == null) {
            Log.m165389i("LocationService", "googlemaps onRestartLocation called. FusedLocationClient is null.");
        } else if (this.f112977i == null) {
            Log.m165389i("LocationService", "googlemaps onRestartLocation called. LocationRequest is null.");
        } else if (mo149536f()) {
            Log.m165389i("LocationService", "googlemaps onRestartLocation called. listeners is empty.");
        } else {
            this.f112978j.mo74308a(this.f112976h);
            Log.m165389i("LocationService", "googlemaps onPauseLocation called. stop location.");
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.location.p2146b.AbstractC41556a
    /* renamed from: a */
    public void mo149524a(AbstractC41582a aVar) {
        MapModule.getDependency().getAppStateDependency().mo149518a(aVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.location.p2146b.AbstractC41556a
    /* renamed from: b */
    public void mo149530b(AbstractC41582a aVar) {
        MapModule.getDependency().getAppStateDependency().mo149520b(aVar);
    }

    public C44575f(Context context) {
        if (context == null) {
            Log.m165383e("LocationService", "context is null.");
            return;
        }
        this.f105630a = context.getApplicationContext();
        this.f112979k = C44561b.m176808a(this.f105630a);
        LocationRequest a = LocationRequest.m79289a();
        this.f112977i = a;
        a.mo74318a(100);
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41556a
    /* renamed from: a */
    public boolean mo149525a(LocationRequestOption locationRequestOption) {
        Log.m165389i("LocationService", "googlemaps getOnceLocation called, appStatus:" + mo149535e());
        if (!this.f112979k) {
            Log.m165389i("LocationService", "failed to get location , google play service isn't available.");
            mo149523a((LarkLocation) null, (List<Location>) null);
            return false;
        }
        if (this.f112977i == null) {
            LocationRequest a = LocationRequest.m79289a();
            this.f112977i = a;
            a.mo74318a(100);
        }
        if (this.f112978j == null) {
            this.f112978j = C21949e.m79316b(this.f105630a);
        }
        if (ActivityCompat.checkSelfPermission(this.f105630a, "android.permission.ACCESS_FINE_LOCATION") == 0 || ActivityCompat.checkSelfPermission(this.f105630a, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            this.f112978j.mo74309a(false);
            if (locationRequestOption != null) {
                Log.m165389i("LocationService", "google location priority:" + locationRequestOption.mo149700b().toString());
                this.f112977i.mo74318a(C44561b.m176806a(locationRequestOption.mo149700b()));
            }
            m176851g();
            if (!mo149535e()) {
                return true;
            }
            Log.m165389i("LocationService", "googlemaps getOnceLocation called, appStatus:" + mo149535e() + ", start once request location.");
            this.f112978j.mo74307a(this.f112977i, this.f112976h, Looper.getMainLooper());
            return true;
        }
        mo149523a((LarkLocation) null, (List<Location>) null);
        return false;
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41556a
    /* renamed from: b */
    public boolean mo149531b(LocationRequestOption locationRequestOption) {
        Log.m165389i("LocationService", "googlemaps getContinuousLocation called, appStatus:" + mo149535e());
        if (!this.f112979k) {
            Log.m165389i("LocationService", "failed to request location , google play service isn't available.");
            mo149523a((LarkLocation) null, (List<Location>) null);
            return false;
        }
        if (this.f112977i == null) {
            LocationRequest a = LocationRequest.m79289a();
            this.f112977i = a;
            a.mo74318a(100);
        }
        this.f112977i.mo74319a((long) this.f105631b);
        if (this.f112978j == null) {
            this.f112978j = C21949e.m79316b(this.f105630a);
        }
        if (ActivityCompat.checkSelfPermission(this.f105630a, "android.permission.ACCESS_FINE_LOCATION") == 0 || ActivityCompat.checkSelfPermission(this.f105630a, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            this.f112978j.mo74309a(false);
            if (locationRequestOption != null) {
                Log.m165389i("LocationService", "google location priority:" + locationRequestOption.mo149700b().toString());
                this.f112977i.mo74318a(C44561b.m176806a(locationRequestOption.mo149700b()));
            }
            m176851g();
            if (!mo149535e()) {
                return true;
            }
            Log.m165389i("LocationService", "googlemaps getContinuousLocation called, appStatus:" + mo149535e() + ", start continuous location");
            this.f112978j.mo74307a(this.f112977i, this.f112976h, Looper.getMainLooper()).addOnFailureListener(new AbstractC22092d() {
                /* class com.ss.android.lark.map.p2237a.p2238a.C44575f.C445783 */

                @Override // com.google.android.gms.tasks.AbstractC22092d
                /* renamed from: a */
                public void mo75025a(Exception exc) {
                    Log.m165383e("LocationService", "google location fail" + exc.getMessage());
                    Log.m165386e("google location exception:", exc);
                    if (exc instanceof ApiException) {
                        Log.m165383e("LocationService", "google location fail, error code:" + ((ApiException) exc).getStatusCode());
                    }
                }
            }).addOnCanceledListener(new AbstractC22091c() {
                /* class com.ss.android.lark.map.p2237a.p2238a.C44575f.C445772 */

                @Override // com.google.android.gms.tasks.AbstractC22091c
                public void V_() {
                    Log.m165383e("LocationService", "google location cancel");
                }
            });
            return true;
        }
        Log.m165383e("LocationService", "request location , google play has no permission");
        mo149523a((LarkLocation) null, (List<Location>) null);
        return false;
    }
}
