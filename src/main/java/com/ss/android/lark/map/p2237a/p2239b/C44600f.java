package com.ss.android.lark.map.p2237a.p2239b;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.IntentSender;
import android.location.Location;
import android.os.Looper;
import androidx.core.app.ActivityCompat;
import com.huawei.hmf.tasks.AbstractC23429c;
import com.huawei.hmf.tasks.AbstractC23430d;
import com.huawei.hmf.tasks.AbstractC23431e;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.ResolvableApiException;
import com.huawei.hms.location.FusedLocationProviderClient;
import com.huawei.hms.location.LocationAvailability;
import com.huawei.hms.location.LocationCallback;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.location.LocationResult;
import com.huawei.hms.location.LocationServices;
import com.huawei.hms.location.LocationSettingsRequest;
import com.huawei.hms.location.LocationSettingsResponse;
import com.huawei.hms.location.LocationSettingsStates;
import com.ss.android.lark.location.dto.LarkLocation;
import com.ss.android.lark.location.listener.AbstractC41582a;
import com.ss.android.lark.location.listener.LocationRequestOption;
import com.ss.android.lark.location.p2146b.AbstractC41556a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.map.MapModule;
import java.util.List;

/* renamed from: com.ss.android.lark.map.a.b.f */
public class C44600f extends AbstractC41556a {

    /* renamed from: h */
    public LocationCallback f113036h = new LocationCallback() {
        /* class com.ss.android.lark.map.p2237a.p2239b.C44600f.C446011 */

        @Override // com.huawei.hms.location.LocationCallback
        public void onLocationAvailability(LocationAvailability locationAvailability) {
            Log.m165389i("LocationService", "location availability:" + locationAvailability.toString());
            super.onLocationAvailability(locationAvailability);
            if (locationAvailability != null && !locationAvailability.isLocationAvailable()) {
                C44600f.this.mo149523a((LarkLocation) null, (List<Location>) null);
            }
        }

        @Override // com.huawei.hms.location.LocationCallback
        public void onLocationResult(LocationResult locationResult) {
            String str;
            Log.m165389i("LocationService", "huaweimaps location onLocationResult");
            if (locationResult == null || locationResult.getLastLocation() == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("huaweimaps location result null:");
                if (locationResult == null) {
                    str = "locationResult is null";
                } else {
                    str = "last location is null";
                }
                sb.append(str);
                Log.m165383e("LocationService", sb.toString());
                C44600f.this.mo149523a((LarkLocation) null, (List<Location>) null);
                return;
            }
            Location lastLocation = locationResult.getLastLocation();
            Log.m165389i("LocationService", "huaweimaps location size:" + locationResult.getLocations().size());
            for (Location location : locationResult.getLocations()) {
                if (location != null) {
                    Log.m165389i("LocationService", "all huaweimaps location result: " + location.toString() + "\ntime: " + location.getTime() + "\nspeed:" + location.getSpeed() + "\nElapsedRealtime:" + location.getElapsedRealtimeNanos());
                    if (location.getTime() > lastLocation.getTime()) {
                        Log.m165389i("LocationService", "changed huaweimaps location result: " + location.toString() + "\ntime: " + location.getTime() + "\nspeed:" + location.getSpeed() + "\nElapsedRealtime:" + location.getElapsedRealtimeNanos());
                        lastLocation = location;
                    }
                }
            }
            if (lastLocation.getExtras() != null) {
                Log.m165389i("LocationService", "huaweimaps location extras: " + lastLocation.getExtras().toString());
            }
            if (C44600f.this.f113036h != null) {
                LarkLocation a = C44588b.m176896a(lastLocation);
                Log.m165389i("LocationService", "huaweimaps location result" + lastLocation.toString() + "\ntime: " + lastLocation.getTime() + "\nspeed:" + lastLocation.getSpeed() + "\nElapsedRealtime:" + lastLocation.getElapsedRealtimeNanos());
                C44600f.this.mo149523a(a, locationResult.getLocations());
            }
        }
    };

    /* renamed from: i */
    private LocationRequest f113037i;

    /* renamed from: j */
    private FusedLocationProviderClient f113038j;

    /* renamed from: k */
    private boolean f113039k;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.location.p2146b.AbstractC41556a
    /* renamed from: e */
    public boolean mo149535e() {
        return MapModule.getDependency().getAppStateDependency().mo149519a();
    }

    /* renamed from: g */
    private void m176931g() {
        if (this.f113037i == null || this.f105630a == null) {
            Log.m165383e("LocationService", "failed to checkLocationSettings，because location request is null or content is null.");
            return;
        }
        LocationSettingsRequest.Builder builder = new LocationSettingsRequest.Builder();
        builder.addLocationRequest(this.f113037i);
        LocationServices.getSettingsClient(this.f105630a).checkLocationSettings(builder.build()).mo81828a(new AbstractC23431e<LocationSettingsResponse>() {
            /* class com.ss.android.lark.map.p2237a.p2239b.C44600f.C446055 */

            /* renamed from: a */
            public void onSuccess(LocationSettingsResponse locationSettingsResponse) {
                if (locationSettingsResponse != null && locationSettingsResponse.getLocationSettingsStates() != null) {
                    LocationSettingsStates locationSettingsStates = locationSettingsResponse.getLocationSettingsStates();
                    Log.m165389i("LocationService", "bluetooth: usable :" + locationSettingsStates.isBleUsable() + " present:" + locationSettingsStates.isBlePresent() + "\tgps: usable:" + locationSettingsStates.isGpsUsable() + " present:" + locationSettingsStates.isGpsPresent() + "\tlocation: usable:" + locationSettingsStates.isLocationUsable() + " present:" + locationSettingsStates.isLocationPresent() + "\tnetwork: usable:" + locationSettingsStates.isNetworkLocationUsable() + " present:" + locationSettingsStates.isNetworkLocationPresent() + "\thms location: usable:" + locationSettingsStates.isHMSLocationUsable() + " present:" + locationSettingsStates.isHMSLocationPresent());
                }
            }
        }).mo81827a(new AbstractC23430d() {
            /* class com.ss.android.lark.map.p2237a.p2239b.C44600f.C446044 */

            @Override // com.huawei.hmf.tasks.AbstractC23430d
            public void onFailure(Exception exc) {
                Log.m165383e("LocationService", "huaweimaps location settings fail:" + exc);
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
        Log.m165389i("LocationService", "huaweimaps release called.");
        if (this.f113038j == null) {
            mo149522a();
            return;
        }
        if (mo149536f()) {
            mo149522a();
            this.f113038j.removeLocationUpdates(this.f113036h);
            this.f113037i = null;
            this.f113038j = null;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.location.p2146b.AbstractC41556a
    /* renamed from: b */
    public synchronized void mo149529b() {
        Log.m165389i("LocationService", "huaweimaps onRestartLocation called.");
        if (!this.f113039k) {
            Log.m165389i("LocationService", "huaweimaps onRestartLocation called. GooglePlayServices isn't available.");
        } else if (this.f113038j == null) {
            Log.m165389i("LocationService", "huaweimaps onRestartLocation called. FusedLocationClient is null.");
        } else if (this.f113037i == null) {
            Log.m165389i("LocationService", "huaweimaps onRestartLocation called. LocationRequest is null.");
        } else if (mo149536f()) {
            Log.m165389i("LocationService", "huaweimaps onRestartLocation called. listeners is empty.");
        } else if (ActivityCompat.checkSelfPermission(this.f105630a, "android.permission.ACCESS_FINE_LOCATION") == 0 || ActivityCompat.checkSelfPermission(this.f105630a, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            Log.m165389i("LocationService", "huaweimaps onRestartLocation called. restart location.");
            this.f113038j.requestLocationUpdates(this.f113037i, this.f113036h, Looper.getMainLooper());
        } else {
            mo149523a((LarkLocation) null, (List<Location>) null);
            Log.m165389i("LocationService", "huaweimaps onRestartLocation called. haven't permission.");
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.location.p2146b.AbstractC41556a
    /* renamed from: c */
    public synchronized void mo149533c() {
        Log.m165389i("LocationService", "huaweimaps onPauseLocation called.");
        if (!this.f113039k) {
            Log.m165389i("LocationService", "huaweimaps onPauseLocation called, GooglePlayServices isn't available.");
        } else if (this.f113038j == null) {
            Log.m165389i("LocationService", "huaweimaps onRestartLocation called. FusedLocationClient is null.");
        } else if (this.f113037i == null) {
            Log.m165389i("LocationService", "huaweimaps onRestartLocation called. LocationRequest is null.");
        } else if (mo149536f()) {
            Log.m165389i("LocationService", "huaweimaps onRestartLocation called. listeners is empty.");
        } else {
            this.f113038j.removeLocationUpdates(this.f113036h);
            Log.m165389i("LocationService", "huaweimaps onPauseLocation called. stop location.");
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

    public C44600f(Context context) {
        if (context == null) {
            Log.m165383e("LocationService", "context is null.");
            return;
        }
        this.f105630a = context.getApplicationContext();
        this.f113039k = C44588b.m176897a(this.f105630a);
        LocationRequest create = LocationRequest.create();
        this.f113037i = create;
        create.setPriority(100);
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41556a
    /* renamed from: a */
    public boolean mo149525a(LocationRequestOption locationRequestOption) {
        Log.m165389i("LocationService", "huaweimaps getOnceLocation called, appStatus:" + mo149535e());
        if (!this.f113039k) {
            Log.m165389i("LocationService", "failed to get location , google play service isn't available.");
            mo149523a((LarkLocation) null, (List<Location>) null);
            return false;
        }
        if (this.f113037i == null) {
            LocationRequest create = LocationRequest.create();
            this.f113037i = create;
            create.setPriority(100);
        }
        if (this.f113038j == null) {
            this.f113038j = LocationServices.getFusedLocationProviderClient(this.f105630a);
        }
        if (ActivityCompat.checkSelfPermission(this.f105630a, "android.permission.ACCESS_FINE_LOCATION") == 0 || ActivityCompat.checkSelfPermission(this.f105630a, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            if (locationRequestOption != null) {
                Log.m165389i("LocationService", "huaweimaps location priority:" + locationRequestOption.mo149700b().toString());
                this.f113037i.setPriority(C44588b.m176895a(locationRequestOption.mo149700b()));
            }
            m176931g();
            this.f113038j.setMockMode(false);
            if (!mo149535e()) {
                return true;
            }
            Log.m165389i("LocationService", "huaweimaps getOnceLocation called, appStatus:" + mo149535e() + ", start once request location.");
            this.f113038j.requestLocationUpdates(this.f113037i, this.f113036h, Looper.getMainLooper());
            return true;
        }
        mo149523a((LarkLocation) null, (List<Location>) null);
        return false;
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41556a
    /* renamed from: b */
    public boolean mo149531b(LocationRequestOption locationRequestOption) {
        Log.m165389i("LocationService", "huaweimaps getContinuousLocation called, appStatus:" + mo149535e());
        if (!this.f113039k) {
            Log.m165389i("LocationService", "failed to request location , huaweimaps play service isn't available.");
            mo149523a((LarkLocation) null, (List<Location>) null);
            return false;
        }
        if (this.f113037i == null) {
            LocationRequest create = LocationRequest.create();
            this.f113037i = create;
            create.setPriority(100);
        }
        this.f113037i.setInterval((long) this.f105631b);
        if (this.f113038j == null) {
            this.f113038j = LocationServices.getFusedLocationProviderClient(this.f105630a);
        }
        if (ActivityCompat.checkSelfPermission(this.f105630a, "android.permission.ACCESS_FINE_LOCATION") == 0 || ActivityCompat.checkSelfPermission(this.f105630a, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            if (locationRequestOption != null) {
                Log.m165389i("LocationService", "google location priority:" + locationRequestOption.mo149700b().toString());
                this.f113037i.setPriority(C44588b.m176895a(locationRequestOption.mo149700b()));
            }
            m176931g();
            this.f113038j.setMockMode(false);
            if (!mo149535e()) {
                return true;
            }
            Log.m165389i("LocationService", "huaweimaps getContinuousLocation called, appStatus:" + mo149535e() + ", start continuous location");
            this.f113038j.requestLocationUpdates(this.f113037i, this.f113036h, Looper.getMainLooper()).mo81827a(new AbstractC23430d() {
                /* class com.ss.android.lark.map.p2237a.p2239b.C44600f.C446033 */

                @Override // com.huawei.hmf.tasks.AbstractC23430d
                public void onFailure(Exception exc) {
                    Log.m165384e("LocationService", "huaweimaps location exception:", exc);
                    if (exc instanceof ApiException) {
                        Log.m165383e("LocationService", "google location fail, error code:" + ((ApiException) exc).getStatusCode());
                    }
                }
            }).mo81826a(new AbstractC23429c() {
                /* class com.ss.android.lark.map.p2237a.p2239b.C44600f.C446022 */

                @Override // com.huawei.hmf.tasks.AbstractC23429c
                /* renamed from: a */
                public void mo81841a() {
                    Log.m165383e("LocationService", "huaweimaps location cancel");
                }
            });
            return true;
        }
        Log.m165383e("LocationService", "request location , huaweimaps play has no permission");
        mo149523a((LarkLocation) null, (List<Location>) null);
        return false;
    }
}
