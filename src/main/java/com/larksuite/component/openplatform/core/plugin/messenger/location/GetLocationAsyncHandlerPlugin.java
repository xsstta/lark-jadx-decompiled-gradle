package com.larksuite.component.openplatform.core.plugin.messenger.location;

import android.app.Activity;
import android.location.Location;
import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.huawei.hms.location.FusedLocationProviderClient;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.C67475d;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3408f.AbstractC67724a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class GetLocationAsyncHandlerPlugin extends BaseLocationPlugin {
    public float acc;
    private long cacheTimeout;
    private String mode;
    private String priority;
    public long timeout;
    private String type;

    private static class GetLocationAsyncHandlerRequest extends C25920a {
        @JSONField(name = "cacheTimeout")
        public int cacheTimeout;
        @JSONField(name = "accuracy")
        public String mode = "high";
        @JSONField(name = "priority")
        public String priority = "";
        @JSONField(name = "timeout")
        public int timeout = 5;
        @JSONField(name = ShareHitPoint.f121869d)
        public String type = "wgs84";

        private GetLocationAsyncHandlerRequest() {
        }
    }

    /* access modifiers changed from: private */
    public static class LocationResponse extends C25921b {
        @JSONField(name = "locationCode")
        public int locationCode;
        @JSONField(name = "locationMsg")
        public String locationMsg;
        @JSONField(name = "accuracy")
        public float mAccuracy;
        @JSONField(name = "horizontalAccuracy")
        public float mHorizontalAccuracy;
        @JSONField(name = "latitude")
        public double mLatitude;
        @JSONField(name = "locations")
        public List<LocationResponse> mLocations = new LinkedList();
        @JSONField(name = "longitude")
        public double mLongitude;
        @JSONField(name = "timestamp")
        public float mTimestamp;
        @JSONField(name = ShareHitPoint.f121869d)
        public String mType;
        @JSONField(name = FusedLocationProviderClient.KEY_VERTICAL_ACCURACY)
        public int mVerticalAccuracy;

        public String toString() {
            return "LocationResponse{mType='" + this.mType + '\'' + ", mLatitude=" + this.mLatitude + ", mLongitude=" + this.mLongitude + ", mAccuracy=" + this.mAccuracy + ", mHorizontalAccuracy=" + this.mHorizontalAccuracy + ", mTimestamp=" + this.mTimestamp + ", mVerticalAccuracy=" + this.mVerticalAccuracy + ", mLocations=" + this.mLocations + ", locationCode=" + this.locationCode + ", locationMsg='" + this.locationMsg + '\'' + '}';
        }
    }

    public LocationResponse getLocationResponse(Location location, String str) {
        LocationResponse locationResponse = new LocationResponse();
        if (location != null) {
            if (!TextUtils.isEmpty(str)) {
                locationResponse.mType = str;
            }
            locationResponse.mLatitude = location.getLatitude();
            locationResponse.mLongitude = location.getLongitude();
            locationResponse.mAccuracy = location.getAccuracy();
            locationResponse.mHorizontalAccuracy = location.getAccuracy();
            locationResponse.mTimestamp = (float) location.getTime();
            locationResponse.mVerticalAccuracy = 0;
        }
        return locationResponse;
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.openplatform.core.plugin.messenger.location.BaseLocationPlugin
    public void onSystemPermissionGranted(LKEvent lKEvent, AbstractC25905b bVar, AbstractC25895f fVar) {
        doGetLocation(lKEvent, bVar, fVar);
    }

    private void doGetLocation(LKEvent lKEvent, final AbstractC25905b bVar, final AbstractC25895f fVar) {
        LocationResponse locationResponse = new LocationResponse();
        String str = "wgs84";
        if (TextUtils.isEmpty(this.type) || this.type.equals("gcj02") || this.type.equals(str)) {
            C25226i.m90650a().mo88332c(getAppContext());
            final long currentTimeMillis = System.currentTimeMillis();
            fVar.mo92190b().mo92224i("locationPlugin", "start call lark location api: ", Long.valueOf(System.currentTimeMillis() - this.startTime));
            if (!TextUtils.isEmpty(this.type)) {
                str = this.type;
            }
            this.type = str;
            ((AbstractC67724a) getAppContext().findServiceByInterface(AbstractC67724a.class)).mo50443a(getApiDependency().mo235051f(), this.type, this.acc, this.timeout, this.priority, this.cacheTimeout, new AbstractC67724a.AbstractC67726b() {
                /* class com.larksuite.component.openplatform.core.plugin.messenger.location.GetLocationAsyncHandlerPlugin.C251871 */

                /* renamed from: a */
                int f61493a;

                /* renamed from: b */
                ArrayList<C25225h> f61494b = new ArrayList<>();

                @Override // com.tt.refer.p3400a.p3408f.AbstractC67724a.AbstractC67726b
                /* renamed from: a */
                public void mo88297a(String str, int i) {
                    C25226i.m90650a().mo88333d(GetLocationAsyncHandlerPlugin.this.getAppContext());
                    fVar.mo92190b().mo92223e("locationPlugin", "get location from lark fail:", str, Integer.valueOf(i));
                    if (GetLocationAsyncHandlerPlugin.this.getAppContext() == null || GetLocationAsyncHandlerPlugin.this.getAppContext().isDestroyed()) {
                        fVar.mo92190b().mo92223e("locationPlugin", "get location from lark fail and app context is destroyed:", str, Integer.valueOf(i));
                        return;
                    }
                    GetLocationAsyncHandlerPlugin getLocationAsyncHandlerPlugin = GetLocationAsyncHandlerPlugin.this;
                    getLocationAsyncHandlerPlugin.failCallback(i, str, this.f61493a, currentTimeMillis, getLocationAsyncHandlerPlugin.mInvokeCallback);
                }

                @Override // com.tt.refer.p3400a.p3408f.AbstractC67724a.AbstractC67726b
                /* renamed from: a */
                public void mo88296a(Location location, String str, int i) {
                    C25226i.m90650a().mo88333d(GetLocationAsyncHandlerPlugin.this.getAppContext());
                    if (GetLocationAsyncHandlerPlugin.this.getAppContext() == null || GetLocationAsyncHandlerPlugin.this.getAppContext().isDestroyed()) {
                        fVar.mo92190b().mo92223e("locationPlugin", "get location from lark success and app context is destroyed");
                        fVar.mo92190b().mo92224i("locationPlugin", "get location from lark success: la:", Double.valueOf(location.getLatitude()), "l", Double.valueOf(location.getLongitude()), AbstractC60044a.f149675a, Float.valueOf(location.getAccuracy()), "type:", str, "located time:", Long.valueOf(System.currentTimeMillis() - GetLocationAsyncHandlerPlugin.this.startTime));
                    } else if (location == null) {
                        fVar.mo92190b().mo92224i("locationPlugin", "get location from lark success: but location is null");
                        GetLocationAsyncHandlerPlugin getLocationAsyncHandlerPlugin = GetLocationAsyncHandlerPlugin.this;
                        getLocationAsyncHandlerPlugin.failCallback(2001, "location is null", this.f61493a, currentTimeMillis, getLocationAsyncHandlerPlugin.mInvokeCallback);
                    } else {
                        fVar.mo92190b().mo92224i("locationPlugin", "get location from lark success: la:", Double.valueOf(location.getLatitude()), "l", Double.valueOf(location.getLongitude()), AbstractC60044a.f149675a, Float.valueOf(location.getAccuracy()), "type:", str, "located time:", Long.valueOf(System.currentTimeMillis() - GetLocationAsyncHandlerPlugin.this.startTime));
                        GetLocationAsyncHandlerPlugin getLocationAsyncHandlerPlugin2 = GetLocationAsyncHandlerPlugin.this;
                        getLocationAsyncHandlerPlugin2.successCallback(location, this.f61494b, currentTimeMillis, this.f61493a, str, i, getLocationAsyncHandlerPlugin2.mInvokeCallback);
                    }
                }

                @Override // com.tt.refer.p3400a.p3408f.AbstractC67724a.AbstractC67726b
                /* renamed from: a */
                public void mo88298a(ArrayList<Location> arrayList, Location location, String str, int i) {
                    String str2;
                    long j;
                    float f;
                    String str3 = "locationPlugin";
                    if (GetLocationAsyncHandlerPlugin.this.getAppContext() == null || GetLocationAsyncHandlerPlugin.this.getAppContext().isDestroyed()) {
                        fVar.mo92190b().mo92223e(str3, "on location change and app context is destroyed");
                        return;
                    }
                    this.f61493a++;
                    if (C67432a.m262319a(GetLocationAsyncHandlerPlugin.this.getAppContext()).getJsBridge() != null) {
                        LocationResponse locationResponse = new LocationResponse();
                        if (location != null) {
                            locationResponse = GetLocationAsyncHandlerPlugin.this.getLocationResponse(location, str);
                            f = location.getAccuracy();
                            j = location.getTime();
                            str2 = location.getProvider();
                        } else {
                            j = 0;
                            str2 = null;
                            f = BitmapDescriptorFactory.HUE_RED;
                        }
                        if (arrayList != null && arrayList.size() > 0) {
                            Iterator<Location> it = arrayList.iterator();
                            while (it.hasNext()) {
                                Location next = it.next();
                                this.f61494b.add(new C25225h(next, System.currentTimeMillis()));
                                locationResponse.mLocations.add(GetLocationAsyncHandlerPlugin.this.getLocationResponse(next, str));
                                str3 = str3;
                            }
                        }
                        fVar.mo92190b().mo92224i(str3, "on location change:", locationResponse.toString(), "type:", str, "time:", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                        if (GetLocationAsyncHandlerPlugin.this.getAppContext() != null && GetLocationAsyncHandlerPlugin.this.getAppContext().getAppType() == AppType.GadgetAPP) {
                            bVar.mo92214a("onLocationChange", locationResponse);
                        }
                        C67475d.m262453a(GetLocationAsyncHandlerPlugin.this.getAppContext(), System.currentTimeMillis() - currentTimeMillis, i, f, j, str2, GetLocationAsyncHandlerPlugin.this.timeout, GetLocationAsyncHandlerPlugin.this.acc, arrayList);
                    }
                }
            });
            return;
        }
        fVar.mo92190b().mo92223e("locationPlugin", "params is wrong:", this.type);
        C25906a aVar = C25906a.f64072b;
        fillFailedResponse(locationResponse, aVar, "params is wrong:" + this.type);
        this.mInvokeCallback.callback(locationResponse);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x00bd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void failCallback(int r26, java.lang.String r27, int r28, long r29, com.larksuite.framework.apiplugin.p1175a.AbstractC25897h<com.larksuite.component.openplatform.core.plugin.messenger.location.GetLocationAsyncHandlerPlugin.LocationResponse> r31) {
        /*
        // Method dump skipped, instructions count: 199
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.openplatform.core.plugin.messenger.location.GetLocationAsyncHandlerPlugin.failCallback(int, java.lang.String, int, long, com.larksuite.framework.apiplugin.a.h):void");
    }

    @LKPluginFunction(async = true, eventName = {"getLocation"})
    public void getLocationAsync(LKEvent lKEvent, GetLocationAsyncHandlerRequest getLocationAsyncHandlerRequest, AbstractC25905b bVar, AbstractC25895f fVar, AbstractC25897h<LocationResponse> hVar) {
        float f;
        this.mInvokeCallback = hVar;
        this.startTime = System.currentTimeMillis();
        this.type = getLocationAsyncHandlerRequest.type;
        String str = getLocationAsyncHandlerRequest.mode;
        this.mode = str;
        if (TextUtils.equals(str, "best")) {
            f = 20.0f;
        } else {
            f = 100.0f;
        }
        this.acc = f;
        this.timeout = (long) (getLocationAsyncHandlerRequest.timeout * 1000);
        this.priority = getLocationAsyncHandlerRequest.priority;
        this.cacheTimeout = (long) (getLocationAsyncHandlerRequest.cacheTimeout * 1000);
        fVar.mo92190b().mo92224i("locationPlugin", "location args:", getLocationAsyncHandlerRequest.toString());
        C67475d.m262454a(getAppContext(), getLocationAsyncHandlerRequest.toString());
        Activity f2 = getApiDependency().mo235051f();
        if (f2 == null) {
            LocationResponse locationResponse = new LocationResponse();
            fillFailedResponse(locationResponse, C25906a.f64080j, "activity is null");
            this.mInvokeCallback.callback(locationResponse);
            fVar.mo92190b().mo92223e("locationPlugin", "activity is null");
            return;
        }
        if (!checkGPSIsOpen(f2, fVar)) {
            fVar.mo92190b().mo92223e("locationPlugin", "GPS is close, show open gps dialog");
            openDialog(f2, fVar);
        }
        checkPermission(lKEvent, bVar, fVar);
    }

    public void successCallback(Location location, ArrayList<C25225h> arrayList, long j, int i, String str, int i2, AbstractC25897h<LocationResponse> hVar) {
        hVar.callback(getLocationResponse(location, str));
        if (getAppContext() != null && getAppContext().getApplicationContext() != null) {
            C67475d.m262455a(getAppContext(), "success", System.currentTimeMillis() - j, i2, location.getAccuracy(), location.getTime(), location.getProvider(), this.timeout, this.mode, this.acc, 0, null, i, "current_location", C25224g.m90647c(getAppContext().getApplicationContext()), C25224g.m90644a(getAppContext().getApplicationContext()), C25224g.m90646b(getAppContext().getApplicationContext()), arrayList);
        }
    }
}
