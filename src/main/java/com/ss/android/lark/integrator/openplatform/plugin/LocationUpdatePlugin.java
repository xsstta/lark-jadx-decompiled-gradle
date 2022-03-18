package com.ss.android.lark.integrator.openplatform.plugin;

import android.app.Activity;
import android.location.Location;
import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.huawei.hms.location.FusedLocationProviderClient;
import com.larksuite.component.openplatform.core.plugin.messenger.location.BaseLocationPlugin;
import com.larksuite.component.openplatform.core.plugin.messenger.location.C25226i;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.entity.LKPluginHandleResult;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25896g;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.larksuite.framework.apiplugin.p1176b.C25911f;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.integrator.littleapp.C39811c;
import com.ss.android.lark.littleapp.AbstractC41371j;
import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LocationUpdatePlugin extends BaseLocationPlugin {
    private AbstractC41371j.AbstractC41380i locationInfoCallback = new AbstractC41371j.AbstractC41380i() {
        /* class com.ss.android.lark.integrator.openplatform.plugin.LocationUpdatePlugin.C399421 */

        @Override // com.ss.android.lark.littleapp.AbstractC41371j.AbstractC41380i
        /* renamed from: a */
        public void mo142998a() {
            LocationUpdatePlugin.this.startLocation = false;
        }

        @Override // com.ss.android.lark.littleapp.AbstractC41371j.AbstractC41380i
        /* renamed from: a */
        public void mo143000a(String str, int i) {
            C25226i.m90650a().mo88331b(LocationUpdatePlugin.this.getAppContext());
            LocationUpdatePlugin.this.mLkEventContext.mo92190b().mo92223e("StartLocationUpdatePlugin", "get location from lark fail:", str, Integer.valueOf(i));
            if (LocationUpdatePlugin.this.getAppContext().isDestroyed()) {
                LocationUpdatePlugin.this.mLkEventContext.mo92190b().mo92223e("StartLocationUpdatePlugin", "get location from lark error and app context is destroyed");
                return;
            }
            LocationUpdatePlugin.this.mInvokeCallback.callback(LocationUpdatePlugin.this.createFailedResponse(C25911f.f64135a));
        }

        @Override // com.ss.android.lark.littleapp.AbstractC41371j.AbstractC41380i
        /* renamed from: a */
        public void mo142999a(Location location, String str, int i) {
            C25226i.m90650a().mo88331b(LocationUpdatePlugin.this.getAppContext());
            if (LocationUpdatePlugin.this.getAppContext().isDestroyed()) {
                LocationUpdatePlugin.this.mLkEventContext.mo92190b().mo92223e("StartLocationUpdatePlugin", "get location from lark success and app context is destroyed");
            } else if (location == null) {
                LocationUpdatePlugin.this.mInvokeCallback.callback(LocationUpdatePlugin.this.createFailedResponse(C25911f.f64135a));
            } else {
                LocationUpdatePlugin.this.mLkEventContext.mo92190b().mo92224i("StartLocationUpdatePlugin", "get location from lark success: la:", Double.valueOf(location.getLatitude()), "l", Double.valueOf(location.getLongitude()), AbstractC60044a.f149675a, Float.valueOf(location.getAccuracy()), "type:", str, "located time:", Long.valueOf(System.currentTimeMillis() - LocationUpdatePlugin.this.startTime));
                if (LocationUpdatePlugin.this.mInvokeCallback != null) {
                    LocationUpdatePlugin.this.mInvokeCallback.callback(LocationUpdatePlugin.this.getLocationResponse(location));
                }
            }
        }

        @Override // com.ss.android.lark.littleapp.AbstractC41371j.AbstractC41380i
        /* renamed from: a */
        public void mo143001a(ArrayList<Location> arrayList, Location location, String str, int i) {
            if (LocationUpdatePlugin.this.getAppContext().isDestroyed()) {
                LocationUpdatePlugin.this.mLkEventContext.mo92190b().mo92223e("StartLocationUpdatePlugin", "on location change and app context is destroyed");
            } else if (location != null) {
                StartLocationUpdateResponse locationResponse = LocationUpdatePlugin.this.getLocationResponse(location);
                if (arrayList != null && arrayList.size() > 0) {
                    Iterator<Location> it = arrayList.iterator();
                    while (it.hasNext()) {
                        locationResponse.mLocations.add(LocationUpdatePlugin.this.getLocationResponse(it.next()));
                    }
                }
                LocationUpdatePlugin.this.mLkEventContext.mo92190b().mo92224i("StartLocationUpdatePlugin", "on location change:", locationResponse.toString());
                LocationUpdatePlugin.this.mLkBridgeContext.mo92214a("onLocationChange", locationResponse);
            }
        }
    };
    public AbstractC25905b mLkBridgeContext;
    public AbstractC25895f mLkEventContext;
    private boolean needContinueLocation;
    public boolean startLocation;
    private String type;

    public static class StartLocationUpdateRequest extends C25920a {
        @JSONField(name = ShareHitPoint.f121869d)
        public String type = "wgs84";
    }

    @Override // com.larksuite.component.openplatform.core.plugin.messenger.location.BaseLocationPlugin, com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
        this.mLkEventContext = null;
        this.mLkBridgeContext = null;
        this.locationInfoCallback = null;
    }

    public static class StartLocationUpdateResponse extends C25921b {
        @JSONField(name = "accuracy")
        public float mAccuracy;
        @JSONField(name = "horizontalAccuracy")
        public float mHorizontalAccuracy;
        @JSONField(name = "latitude")
        public double mLatitude;
        @JSONField(name = "locations")
        public List<StartLocationUpdateResponse> mLocations = new LinkedList();
        @JSONField(name = "longitude")
        public double mLongitude;
        @JSONField(name = "timestamp")
        public float mTimestamp;
        @JSONField(name = FusedLocationProviderClient.KEY_VERTICAL_ACCURACY)
        public int mVerticalAccuracy;
        @JSONField(name = ShareHitPoint.f121869d)
        public String type;

        public String toString() {
            return "StartLocationUpdateResponse{type='" + this.type + '\'' + ", mLatitude=" + this.mLatitude + ", mLongitude=" + this.mLongitude + ", mAccuracy=" + this.mAccuracy + ", mHorizontalAccuracy=" + this.mHorizontalAccuracy + ", mTimestamp=" + this.mTimestamp + ", mVerticalAccuracy=" + this.mVerticalAccuracy + ", mLocations=" + this.mLocations + '}';
        }
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25889a, com.larksuite.framework.apiplugin.AbstractC25937e
    public void addEvents(AbstractC25896g gVar) {
        gVar.mo92192a("onForeGround");
        gVar.mo92192a("onBackGround");
        super.addEvents(gVar);
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25889a, com.larksuite.framework.apiplugin.AbstractC25937e, com.larksuite.framework.apiplugin.p1175a.AbstractC25899j
    public LKPluginHandleResult handleEvent(LKEvent lKEvent) {
        if (checkApplicationForeGround(lKEvent)) {
            return lKEvent.mo92155v();
        }
        return super.handleEvent(lKEvent);
    }

    private boolean checkApplicationForeGround(LKEvent lKEvent) {
        String m = lKEvent.mo92146m();
        m.hashCode();
        if (m.equals("onForeGround")) {
            if (this.needContinueLocation) {
                C39811c.m158045a().mo144310a(this.mLkBridgeContext.mo92207a(), this.type, this.locationInfoCallback);
                this.needContinueLocation = false;
            }
            return true;
        } else if (!m.equals("onBackGround")) {
            return false;
        } else {
            if (this.startLocation) {
                C39811c.m158045a().mo144311b();
                this.needContinueLocation = true;
            }
            return true;
        }
    }

    public StartLocationUpdateResponse getLocationResponse(Location location) {
        StartLocationUpdateResponse startLocationUpdateResponse = new StartLocationUpdateResponse();
        if (location != null) {
            startLocationUpdateResponse.type = this.type;
            startLocationUpdateResponse.mLatitude = location.getLatitude();
            startLocationUpdateResponse.mLongitude = location.getLongitude();
            startLocationUpdateResponse.mAccuracy = location.getAccuracy();
            startLocationUpdateResponse.mHorizontalAccuracy = location.getAccuracy();
            startLocationUpdateResponse.mTimestamp = (float) location.getTime();
            startLocationUpdateResponse.mVerticalAccuracy = 0;
        }
        return startLocationUpdateResponse;
    }

    private void startLocation(LKEvent lKEvent) {
        if (TextUtils.isEmpty(this.type) || this.type.equals("gcj02") || this.type.equals("wgs84")) {
            C25226i.m90650a().mo88330a(getAppContext());
            this.mLkEventContext.mo92190b().mo92224i("StartLocationUpdatePlugin", "start call lark location api: ", Long.valueOf(System.currentTimeMillis() - this.startTime));
            C39811c.m158045a().mo144310a(this.mLkBridgeContext.mo92207a(), this.type, this.locationInfoCallback);
            this.startLocation = true;
            if (this.mInvokeCallback != null) {
                this.mInvokeCallback.callback(new C25921b());
                return;
            }
            return;
        }
        this.mLkEventContext.mo92190b().mo92223e("StartLocationUpdatePlugin", "params is wrong:", this.type);
        AbstractC25897h hVar = this.mInvokeCallback;
        C25906a aVar = C25906a.f64072b;
        hVar.callback(createFailedResponse(aVar, "params is wrong:" + this.type));
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.openplatform.core.plugin.messenger.location.BaseLocationPlugin
    public void onSystemPermissionGranted(LKEvent lKEvent, AbstractC25905b bVar, AbstractC25895f fVar) {
        startLocation(lKEvent);
    }

    @LKPluginFunction(async = true, eventName = {"stopLocationUpdate"})
    public void stopLocationUpdate(LKEvent lKEvent, AbstractC25895f fVar, AbstractC25897h<C25921b> hVar) {
        if (getApiDependency().mo235051f() == null) {
            this.mInvokeCallback.callback(createFailedResponse(C25906a.f64080j, "activity is null"));
            fVar.mo92190b().mo92223e("StartLocationUpdatePlugin", "activity is null");
            return;
        }
        C25226i.m90650a().mo88331b(getAppContext());
        C39811c.m158045a().mo144311b();
        hVar.callback(new C25921b());
    }

    @LKPluginFunction(async = true, eventName = {"startLocationUpdate"})
    public void startLocationUpdate(LKEvent lKEvent, StartLocationUpdateRequest startLocationUpdateRequest, AbstractC25905b bVar, AbstractC25895f fVar, AbstractC25897h<StartLocationUpdateResponse> hVar) {
        this.mInvokeCallback = hVar;
        this.mLkEventContext = fVar;
        this.mLkBridgeContext = bVar;
        this.type = startLocationUpdateRequest.type;
        Activity f = getApiDependency().mo235051f();
        if (f == null) {
            this.mInvokeCallback.callback(createFailedResponse(C25906a.f64080j, "activity is null"));
            fVar.mo92190b().mo92223e("StartLocationUpdatePlugin", "activity is null");
            return;
        }
        if (!checkGPSIsOpen(f, fVar)) {
            openDialog(f, fVar);
        }
        checkPermission(lKEvent, bVar, fVar);
    }
}
