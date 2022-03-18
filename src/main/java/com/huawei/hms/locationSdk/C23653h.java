package com.huawei.hms.locationSdk;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import com.huawei.agconnect.p1009a.AbstractC23399a;
import com.huawei.hmf.tasks.AbstractC23432f;
import com.huawei.hmf.tasks.C23433g;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.api.Api;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.location.FusedLocationProviderClient;
import com.huawei.hms.location.HWLocation;
import com.huawei.hms.location.LocationAvailability;
import com.huawei.hms.location.LocationCallback;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.location.LocationSettingsRequest;
import com.huawei.hms.location.LocationSettingsResponse;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.location.checksettings.CheckLocationSettingsRequest;
import com.huawei.hms.support.api.entity.location.common.LocationBaseRequest;
import com.huawei.hms.support.api.entity.location.common.LocationNaming;
import com.huawei.hms.support.api.entity.location.lastlocation.GetLastLocationRequest;
import com.huawei.hms.support.api.entity.location.mock.SetMockLocationRequest;
import com.huawei.hms.support.api.entity.location.mock.SetMockModeRequest;
import com.huawei.hms.support.api.entity.location.updates.RemoveLocationUpdatesRequest;
import com.huawei.hms.support.api.entity.location.updates.RequestLocationUpdatesRequest;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import org.json.JSONObject;

/* renamed from: com.huawei.hms.locationSdk.h */
public class C23653h extends HuaweiApi<C23668s> implements AbstractC23647f {

    /* renamed from: b */
    private static final C23648g f58408b = new C23648g();

    /* renamed from: c */
    private static final Api<C23668s> f58409c = new Api<>("HmsLocation.API");

    /* renamed from: a */
    private String f58410a = "";

    public C23653h(Activity activity, C23668s sVar) {
        super(activity, (Api) f58409c, (Api.ApiOptions) sVar, (AbstractClientBuilder) f58408b);
        m86063d();
    }

    public C23653h(Context context, C23668s sVar) {
        super(context, f58409c, sVar, f58408b);
        m86063d();
    }

    /* renamed from: d */
    private void m86063d() {
        try {
            this.f58410a = AbstractC23399a.m84921a(getContext()).mo81785a("client/product_id");
        } catch (Exception unused) {
            HMSLog.m86964e("LocationClientImpl", "get agc productId by exception");
        }
    }

    @Override // com.huawei.hms.locationSdk.AbstractC23647f
    /* renamed from: a */
    public AbstractC23432f<Void> mo83496a() {
        C23433g gVar = new C23433g();
        gVar.mo81845a((Exception) new ApiException(new Status(10806, y0.getStatusCodeString(10806))));
        return gVar.mo81844a();
    }

    @Override // com.huawei.hms.locationSdk.AbstractC23647f
    /* renamed from: a */
    public AbstractC23432f<Void> mo83497a(PendingIntent pendingIntent) {
        C23433g gVar = new C23433g();
        LocationBaseRequest locationBaseRequest = new LocationBaseRequest(getContext());
        String tid = locationBaseRequest.getTid();
        try {
            u0.m86106c("LocationClientImpl", tid, "removeLocationUpdates with intent begin");
            if (pendingIntent == null) {
                throw new ApiException(new Status(10801, y0.getStatusCodeString(10801)));
            } else if (x0.m86132c(getContext())) {
                a0 a0Var = (a0) C23677z.m86138b().mo83545b(new a0(null, pendingIntent, null, null, tid));
                if (a0Var != null) {
                    String a = a0Var.mo83541a();
                    locationBaseRequest.setTid(a);
                    l0 l0Var = new l0(LocationNaming.REMOVE_LOCATION_UPDATES, JsonUtil.createJsonString(locationBaseRequest), a, a0Var, "");
                    l0Var.setParcelable(pendingIntent);
                    u0.m86106c("LocationClientImpl", a, "removeLocationUpdates with callback tid =" + locationBaseRequest.getTid() + " Version Code = " + 51000300);
                    return doWrite(l0Var);
                }
                u0.m86105b("LocationClientImpl", tid, "remove location updates with intent cannot find intent");
                throw new ApiException(new Status(10805, y0.getStatusCodeString(10805)));
            } else {
                throw new ApiException(new Status(10803, y0.getStatusCodeString(10803)));
            }
        } catch (ApiException e) {
            e = e;
            u0.m86105b("LocationClientImpl", tid, "remove location updates with intent api exception:" + e.getMessage());
            gVar.mo81845a((Exception) e);
            return gVar.mo81844a();
        } catch (Exception unused) {
            u0.m86105b("LocationClientImpl", tid, "remove location updates with intent exception");
            e = new ApiException(new Status(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, y0.getStatusCodeString(HwBuildEx.VersionCodes.CUR_DEVELOPMENT)));
            gVar.mo81845a((Exception) e);
            return gVar.mo81844a();
        }
    }

    @Override // com.huawei.hms.locationSdk.AbstractC23647f
    /* renamed from: a */
    public AbstractC23432f<Void> mo83498a(Location location) {
        C23433g gVar = new C23433g();
        SetMockLocationRequest setMockLocationRequest = new SetMockLocationRequest(getContext());
        String tid = setMockLocationRequest.getTid();
        try {
            u0.m86106c("LocationClientImpl", tid, "set mock location begin");
            if (location == null) {
                throw new ApiException(new Status(10801, y0.getStatusCodeString(10801)));
            } else if (!x0.m86132c(getContext()) || !x0.m86129a(getContext().getPackageName(), getContext())) {
                throw new ApiException(new Status(10803, y0.getStatusCodeString(10803)));
            } else {
                setMockLocationRequest.setPackageName(getContext().getPackageName());
                setMockLocationRequest.setMockLocation(location);
                JSONObject a = w0.m86121a(setMockLocationRequest.getMockLocation());
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(FusedLocationProviderClient.KEY_MOCK_LOCATION, a);
                jSONObject.put("packageName", setMockLocationRequest.getPackageName());
                jSONObject.put("locTransactionId", setMockLocationRequest.getTid());
                return doWrite(new r0(LocationNaming.SET_MOCK_LOCATION, jSONObject.toString(), tid));
            }
        } catch (ApiException e) {
            e = e;
            u0.m86105b("LocationClientImpl", tid, "set mock location api exception:" + e.getMessage());
            gVar.mo81845a((Exception) e);
            return gVar.mo81844a();
        } catch (Exception unused) {
            u0.m86105b("LocationClientImpl", tid, "set mock location exception");
            e = new ApiException(new Status(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, y0.getStatusCodeString(HwBuildEx.VersionCodes.CUR_DEVELOPMENT)));
            gVar.mo81845a((Exception) e);
            return gVar.mo81844a();
        }
    }

    @Override // com.huawei.hms.locationSdk.AbstractC23647f
    /* renamed from: a */
    public AbstractC23432f<Void> mo83499a(LocationCallback locationCallback) {
        C23433g gVar = new C23433g();
        RemoveLocationUpdatesRequest removeLocationUpdatesRequest = new RemoveLocationUpdatesRequest(getContext());
        String tid = removeLocationUpdatesRequest.getTid();
        try {
            u0.m86106c("LocationClientImpl", tid, "removeLocationUpdates begin");
            if (locationCallback == null) {
                throw new ApiException(new Status(10801, y0.getStatusCodeString(10801)));
            } else if (x0.m86132c(getContext())) {
                a0 a0Var = (a0) C23677z.m86138b().mo83545b(new a0(null, null, locationCallback, null, tid));
                if (a0Var != null) {
                    String a = a0Var.mo83541a();
                    removeLocationUpdatesRequest.setTid(a);
                    removeLocationUpdatesRequest.setUuid(a0Var.mo83487g());
                    String createJsonString = JsonUtil.createJsonString(removeLocationUpdatesRequest);
                    u0.m86106c("LocationClientImpl", a, "removeLocationUpdates with callback uuid:" + removeLocationUpdatesRequest.getUuid() + ",tid =" + removeLocationUpdatesRequest.getTid() + " Version Code = " + 51000300);
                    return doWrite(new l0(LocationNaming.REMOVE_LOCATION_UPDATES, createJsonString, a, a0Var, ""));
                }
                u0.m86105b("LocationClientImpl", tid, "remove location updates with callback cannot find callback");
                throw new ApiException(new Status(10804, y0.getStatusCodeString(10804)));
            } else {
                throw new ApiException(new Status(10803, y0.getStatusCodeString(10803)));
            }
        } catch (ApiException e) {
            e = e;
            u0.m86105b("LocationClientImpl", tid, "remove location updates with callback api exception:" + e.getMessage());
            gVar.mo81845a((Exception) e);
            return gVar.mo81844a();
        } catch (Exception unused) {
            u0.m86105b("LocationClientImpl", tid, "remove location updates with callback exception");
            e = new ApiException(new Status(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, y0.getStatusCodeString(HwBuildEx.VersionCodes.CUR_DEVELOPMENT)));
            gVar.mo81845a((Exception) e);
            return gVar.mo81844a();
        }
    }

    @Override // com.huawei.hms.locationSdk.AbstractC23647f
    /* renamed from: a */
    public AbstractC23432f<HWLocation> mo83500a(LocationRequest locationRequest) {
        C23433g gVar = new C23433g();
        GetLastLocationRequest getLastLocationRequest = new GetLastLocationRequest(getContext(), locationRequest.getNeedAddress(), locationRequest.getLanguage(), locationRequest.getCountryCode());
        String tid = getLastLocationRequest.getTid();
        try {
            u0.m86106c("LocationClientImpl", tid, "get last location begin. Version Code = 51000300");
            if (x0.m86132c(getContext())) {
                return doWrite(new e0(LocationNaming.GET_LAST_LOCATION, JsonUtil.createJsonString(getLastLocationRequest), getLastLocationRequest.getTid(), ""));
            }
            throw new ApiException(new Status(10803, y0.getStatusCodeString(10803)));
        } catch (ApiException e) {
            u0.m86105b("LocationClientImpl", tid, "get last location api exception:" + e.getMessage());
            gVar.mo81845a((Exception) e);
            return gVar.mo81844a();
        } catch (Exception unused) {
            u0.m86105b("LocationClientImpl", tid, "get last location exception");
            gVar.mo81845a((Exception) new ApiException(new Status(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, y0.getStatusCodeString(HwBuildEx.VersionCodes.CUR_DEVELOPMENT))));
            return gVar.mo81844a();
        }
    }

    @Override // com.huawei.hms.locationSdk.AbstractC23647f
    /* renamed from: a */
    public AbstractC23432f<Void> mo83501a(LocationRequest locationRequest, PendingIntent pendingIntent) {
        C23433g gVar = new C23433g();
        RequestLocationUpdatesRequest requestLocationUpdatesRequest = new RequestLocationUpdatesRequest(getContext());
        String tid = requestLocationUpdatesRequest.getTid();
        try {
            u0.m86106c("LocationClientImpl", tid, "requestLocationUpdates with intent begin");
            if (locationRequest == null || pendingIntent == null) {
                throw new ApiException(new Status(10801, y0.getStatusCodeString(10801)));
            } else if (locationRequest.getNumUpdates() <= 0) {
                throw new ApiException(new Status(10802, y0.getStatusCodeString(10802)));
            } else if (x0.m86132c(getContext())) {
                if (locationRequest.getPriority() == 200) {
                    locationRequest.setPriority(100);
                }
                if (locationRequest.getPriority() == 300) {
                    locationRequest.setPriority(102);
                }
                locationRequest.getPriority();
                requestLocationUpdatesRequest.setLocationRequest(locationRequest);
                a0 a0Var = new a0(locationRequest, pendingIntent, null, null, tid);
                C23677z.m86138b().mo83547d(a0Var);
                q0 q0Var = new q0(LocationNaming.REQUEST_LOCATION_UPDATES, JsonUtil.createJsonString(requestLocationUpdatesRequest), tid, a0Var, "");
                q0Var.setParcelable(pendingIntent);
                u0.m86106c("LocationClientImpl", tid, "requestLocationUpdates with intent tid = " + requestLocationUpdatesRequest.getTid() + " Version Code = " + 51000300);
                return doWrite(q0Var);
            } else {
                throw new ApiException(new Status(10803, y0.getStatusCodeString(10803)));
            }
        } catch (ApiException e) {
            e = e;
            u0.m86105b("LocationClientImpl", tid, "request location updates with intent api exception:" + e.getMessage());
            gVar.mo81845a((Exception) e);
            return gVar.mo81844a();
        } catch (Exception unused) {
            u0.m86105b("LocationClientImpl", tid, "request location updates with intent exception");
            e = new ApiException(new Status(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, y0.getStatusCodeString(HwBuildEx.VersionCodes.CUR_DEVELOPMENT)));
            gVar.mo81845a((Exception) e);
            return gVar.mo81844a();
        }
    }

    @Override // com.huawei.hms.locationSdk.AbstractC23647f
    /* renamed from: a */
    public AbstractC23432f<Void> mo83502a(LocationRequest locationRequest, LocationCallback locationCallback, Looper looper) {
        String str;
        C23433g gVar = new C23433g();
        RequestLocationUpdatesRequest requestLocationUpdatesRequest = new RequestLocationUpdatesRequest(getContext());
        String tid = requestLocationUpdatesRequest.getTid();
        try {
            u0.m86106c("LocationClientImpl", tid, "requestLocationUpdatesEx with callback begin");
            if (locationRequest == null || locationCallback == null) {
                throw new ApiException(new Status(10801, y0.getStatusCodeString(10801)));
            } else if (locationRequest.getNumUpdates() > 0) {
                if (locationRequest.getPriority() == 200) {
                    locationRequest.setNeedAddress(false);
                }
                locationRequest.getPriority();
                if (looper == null) {
                    looper = Looper.myLooper();
                }
                if (x0.m86132c(getContext())) {
                    locationRequest.putExtras("productId", this.f58410a);
                    a0 a0Var = new a0(locationRequest, null, locationCallback, looper, tid);
                    a0 a0Var2 = (a0) C23677z.m86138b().mo83545b(a0Var);
                    if (a0Var2 != null) {
                        u0.m86106c("LocationClientImpl", tid, "requestLocationUpdatesInCache uuid=" + a0Var2.mo83487g() + " tid = " + a0Var2.mo83541a());
                        str = a0Var2.mo83487g();
                        a0Var.mo83480b(str);
                    } else {
                        str = tid;
                    }
                    C23677z.m86138b().mo83547d(a0Var);
                    requestLocationUpdatesRequest.setUuid(str);
                    requestLocationUpdatesRequest.setLocationRequest(locationRequest);
                    String createJsonString = JsonUtil.createJsonString(requestLocationUpdatesRequest);
                    u0.m86106c("LocationClientImpl", tid, "requestLocationUpdatesEx uuid=" + requestLocationUpdatesRequest.getUuid() + " tid = " + requestLocationUpdatesRequest.getTid() + " Version Code = " + 51000300);
                    o0 o0Var = new o0(LocationNaming.REQUEST_LOCATION_UPDATES_EX, createJsonString, tid, a0Var, looper, "");
                    u0.m86106c("LocationClientImpl", tid, "GET BINDER TO MONITOR");
                    o0Var.setParcelable(BinderC23642a.m86006a());
                    return doWrite(o0Var);
                }
                throw new ApiException(new Status(10803, y0.getStatusCodeString(10803)));
            } else {
                throw new ApiException(new Status(10802, y0.getStatusCodeString(10802)));
            }
        } catch (ApiException e) {
            e = e;
            u0.m86105b("LocationClientImpl", tid, "request location updates with callback api exception:" + e.getMessage());
            gVar.mo81845a((Exception) e);
            return gVar.mo81844a();
        } catch (Exception unused) {
            u0.m86105b("LocationClientImpl", tid, "request location updates with callback exception");
            e = new ApiException(new Status(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, y0.getStatusCodeString(HwBuildEx.VersionCodes.CUR_DEVELOPMENT)));
            gVar.mo81845a((Exception) e);
            return gVar.mo81844a();
        }
    }

    @Override // com.huawei.hms.locationSdk.AbstractC23647f
    /* renamed from: a */
    public AbstractC23432f<LocationSettingsResponse> mo83503a(LocationSettingsRequest locationSettingsRequest) {
        ApiException e;
        C23433g gVar = new C23433g();
        CheckLocationSettingsRequest checkLocationSettingsRequest = new CheckLocationSettingsRequest(getContext());
        String tid = checkLocationSettingsRequest.getTid();
        try {
            u0.m86106c("LocationClientImpl", tid, "checkLocationSettings");
            if (locationSettingsRequest != null) {
                checkLocationSettingsRequest.setLocationSettingsRequest(locationSettingsRequest);
                return doWrite(new d0(LocationNaming.CHECK_LOCATION_SETTINGS, JsonUtil.createJsonString(checkLocationSettingsRequest), tid));
            }
            throw new ApiException(new Status(10801, y0.getStatusCodeString(10801)));
        } catch (ApiException e2) {
            e = e2;
            u0.m86105b("LocationClientImpl", tid, "check location settings api exception:" + e.getMessage());
            gVar.mo81845a((Exception) e);
            return gVar.mo81844a();
        } catch (Exception unused) {
            u0.m86105b("LocationClientImpl", tid, "check location settings exception");
            e = new ApiException(new Status(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, y0.getStatusCodeString(HwBuildEx.VersionCodes.CUR_DEVELOPMENT)));
            gVar.mo81845a((Exception) e);
            return gVar.mo81844a();
        }
    }

    @Override // com.huawei.hms.locationSdk.AbstractC23647f
    /* renamed from: a */
    public AbstractC23432f<Void> mo83504a(boolean z) {
        C23433g gVar = new C23433g();
        String tid = new LocationBaseRequest(getContext()).getTid();
        try {
            u0.m86106c("LocationClientImpl", tid, "set mock mode begin");
            if (!x0.m86132c(getContext()) || !x0.m86129a(getContext().getPackageName(), getContext())) {
                u0.m86105b("LocationClientImpl", tid, "setMockEnabled,Permission is false ");
                throw new ApiException(new Status(10803, y0.getStatusCodeString(10803)));
            }
            SetMockModeRequest setMockModeRequest = new SetMockModeRequest(getContext());
            setMockModeRequest.setMockMode(z);
            return doWrite(new s0(LocationNaming.SET_MOCK_MODE, JsonUtil.createJsonString(setMockModeRequest), tid));
        } catch (ApiException e) {
            e = e;
            u0.m86105b("LocationClientImpl", tid, "set mock mode api exception:" + e.getMessage());
            gVar.mo81845a((Exception) e);
            return gVar.mo81844a();
        } catch (Exception unused) {
            u0.m86105b("LocationClientImpl", tid, "set mock mode exception");
            e = new ApiException(new Status(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, y0.getStatusCodeString(HwBuildEx.VersionCodes.CUR_DEVELOPMENT)));
            gVar.mo81845a((Exception) e);
            return gVar.mo81844a();
        }
    }

    @Override // com.huawei.hms.locationSdk.AbstractC23647f
    /* renamed from: b */
    public AbstractC23432f<LocationAvailability> mo83505b() {
        C23433g gVar = new C23433g();
        LocationBaseRequest locationBaseRequest = new LocationBaseRequest(getContext());
        String tid = locationBaseRequest.getTid();
        try {
            u0.m86106c("LocationClientImpl", tid, "get location availability begin");
            if (x0.m86132c(getContext())) {
                return doWrite(new g0(LocationNaming.GET_LOCATION_AVAILABILITY, JsonUtil.createJsonString(locationBaseRequest), tid));
            }
            throw new ApiException(new Status(10803, y0.getStatusCodeString(10803)));
        } catch (ApiException e) {
            u0.m86105b("LocationClientImpl", tid, "getLocationAvailability ApiException:" + e.getMessage());
            gVar.mo81845a((Exception) e);
            return gVar.mo81844a();
        } catch (Exception unused) {
            u0.m86105b("LocationClientImpl", tid, "getLocationAvailability exception");
            gVar.mo81845a((Exception) new ApiException(new Status(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, y0.getStatusCodeString(HwBuildEx.VersionCodes.CUR_DEVELOPMENT))));
            return gVar.mo81844a();
        }
    }

    @Override // com.huawei.hms.locationSdk.AbstractC23647f
    /* renamed from: b */
    public AbstractC23432f<Void> mo83506b(LocationRequest locationRequest, LocationCallback locationCallback, Looper looper) {
        String str;
        C23433g gVar = new C23433g();
        RequestLocationUpdatesRequest requestLocationUpdatesRequest = new RequestLocationUpdatesRequest(getContext());
        String tid = requestLocationUpdatesRequest.getTid();
        try {
            u0.m86106c("LocationClientImpl", tid, "requestLocationUpdates with callback begin");
            if (locationRequest == null || locationCallback == null) {
                throw new ApiException(new Status(10801, y0.getStatusCodeString(10801)));
            } else if (locationRequest.getNumUpdates() > 0) {
                if (looper == null) {
                    looper = Looper.myLooper();
                }
                if (x0.m86132c(getContext())) {
                    if (locationRequest.getPriority() == 200) {
                        locationRequest.setPriority(100);
                    }
                    if (locationRequest.getPriority() == 300) {
                        locationRequest.setPriority(102);
                    }
                    locationRequest.getPriority();
                    a0 a0Var = new a0(locationRequest, null, locationCallback, looper, tid);
                    a0 a0Var2 = (a0) C23677z.m86138b().mo83545b(a0Var);
                    if (a0Var2 != null) {
                        u0.m86106c("LocationClientImpl", tid, "requestLocationUpdatesInCache tid=" + a0Var2.mo83541a());
                        str = a0Var2.mo83487g();
                        a0Var.mo83480b(str);
                    } else {
                        str = tid;
                    }
                    C23677z.m86138b().mo83547d(a0Var);
                    requestLocationUpdatesRequest.setUuid(str);
                    requestLocationUpdatesRequest.setLocationRequest(locationRequest);
                    String createJsonString = JsonUtil.createJsonString(requestLocationUpdatesRequest);
                    u0.m86106c("LocationClientImpl", tid, "requestLocationUpdates with callback uuid=" + str + ", tid=" + requestLocationUpdatesRequest.getTid() + ", Version Code = " + 51000300);
                    p0 p0Var = new p0(LocationNaming.REQUEST_LOCATION_UPDATES, createJsonString, tid, a0Var, looper, "");
                    u0.m86106c("LocationClientImpl", tid, "GET BINDER TO MONITOR");
                    p0Var.setParcelable(BinderC23642a.m86006a());
                    return doWrite(p0Var);
                }
                throw new ApiException(new Status(10803, y0.getStatusCodeString(10803)));
            } else {
                throw new ApiException(new Status(10802, y0.getStatusCodeString(10802)));
            }
        } catch (ApiException e) {
            e = e;
            u0.m86105b("LocationClientImpl", tid, "request location updates with callback api exception");
            gVar.mo81845a((Exception) e);
            return gVar.mo81844a();
        } catch (Exception unused) {
            u0.m86105b("LocationClientImpl", tid, "request location updates with callback exception");
            e = new ApiException(new Status(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, y0.getStatusCodeString(HwBuildEx.VersionCodes.CUR_DEVELOPMENT)));
            gVar.mo81845a((Exception) e);
            return gVar.mo81844a();
        }
    }

    @Override // com.huawei.hms.locationSdk.AbstractC23647f
    /* renamed from: c */
    public AbstractC23432f<Location> mo83507c() {
        C23433g gVar = new C23433g();
        LocationBaseRequest locationBaseRequest = new LocationBaseRequest(getContext());
        String tid = locationBaseRequest.getTid();
        try {
            u0.m86106c("LocationClientImpl", tid, "get last location begin. Version Code = 51000300");
            if (x0.m86132c(getContext())) {
                return doWrite(new f0(LocationNaming.GET_LAST_LOCATION, JsonUtil.createJsonString(locationBaseRequest), locationBaseRequest.getTid(), ""));
            }
            throw new ApiException(new Status(10803, y0.getStatusCodeString(10803)));
        } catch (ApiException e) {
            u0.m86105b("LocationClientImpl", tid, "get last location api exception:" + e.getMessage());
            gVar.mo81845a((Exception) e);
            return gVar.mo81844a();
        } catch (Exception unused) {
            u0.m86105b("LocationClientImpl", tid, "get last location exception");
            gVar.mo81845a((Exception) new ApiException(new Status(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, y0.getStatusCodeString(HwBuildEx.VersionCodes.CUR_DEVELOPMENT))));
            return gVar.mo81844a();
        }
    }

    @Override // com.huawei.hms.common.HuaweiApi
    public int getKitSdkVersion() {
        return 51000300;
    }
}
