package com.larksuite.component.openplatform.core.plugin.device.bluetooth.ibeacon;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.ibeacon.BeaconManager;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.annotation.LKRequiredParam;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.common.SystemPermission;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.larksuite.framework.apiplugin.p1176b.C25907b;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.miniapp.permission.C66578b;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import java.util.ArrayList;
import java.util.List;

public class StartBeaconDiscoveryPlugin extends OPPlugin {
    private AbstractC25897h<StartBeaconDiscoveryResponse> invokeCallback;
    public AbstractC25905b lkBridgeContext;
    public ILogger log;
    public IAppContext mAppContext;
    private StartBeaconDiscoveryRequest request;

    public static class OnBeaconServiceChangeResponse extends C25921b {
        @JSONField(name = "available")
        public boolean available;
        @JSONField(name = "discovering")
        public boolean discovering;
    }

    public static class OnBeaconUpdateResponse extends C25921b {
        @JSONField(name = "beacons")
        public List<BeaconInfo> mBeacons = new ArrayList();
    }

    public static class StartBeaconDiscoveryRequest extends C25920a {
        @JSONField(name = "uuids")
        @LKRequiredParam
        public List<String> mUUIDs = new ArrayList();
    }

    public static class StartBeaconDiscoveryResponse extends C25921b {
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public boolean shouldHandleActivityResult() {
        return true;
    }

    public void callbackOk() {
        StartBeaconDiscoveryResponse startBeaconDiscoveryResponse = new StartBeaconDiscoveryResponse();
        AbstractC25897h<StartBeaconDiscoveryResponse> hVar = this.invokeCallback;
        if (hVar != null) {
            hVar.callback(startBeaconDiscoveryResponse);
        }
    }

    private boolean checkParam() {
        List<String> list = this.request.mUUIDs;
        if (list.size() == 0) {
            this.log.mo92223e("StartBeaconDiscoveryPlugin", "uuids is empty");
            callbackFail(C25906a.f64072b.f64115H, C25906a.f64072b.f64117J, "uuids is empty");
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!TextUtils.isEmpty(str) && checkUUID(str)) {
                arrayList.add(str);
            }
        }
        if (arrayList.size() == 0) {
            this.log.mo92223e("StartBeaconDiscoveryPlugin", "uuids not has avaliable uuid");
            callbackFail(C25906a.f64072b.f64115H, C25906a.f64072b.f64117J, "uuids not has avaliable uuid");
            return false;
        }
        this.request.mUUIDs = arrayList;
        return true;
    }

    public void startScan() {
        BeaconManager.ScanState a = BeaconManager.m89833a(this.mAppContext).mo87773a(this.request.mUUIDs, new BeaconManager.AbstractC24763c() {
            /* class com.larksuite.component.openplatform.core.plugin.device.bluetooth.ibeacon.StartBeaconDiscoveryPlugin.C247673 */

            @Override // com.larksuite.component.openplatform.core.plugin.device.bluetooth.ibeacon.BeaconManager.AbstractC24763c
            /* renamed from: a */
            public void mo87789a() {
                StartBeaconDiscoveryPlugin.this.callbackOk();
            }

            @Override // com.larksuite.component.openplatform.core.plugin.device.bluetooth.ibeacon.BeaconManager.AbstractC24763c
            /* renamed from: a */
            public void mo87791a(List<BeaconInfo> list) {
                OnBeaconUpdateResponse onBeaconUpdateResponse = new OnBeaconUpdateResponse();
                onBeaconUpdateResponse.mBeacons.addAll(list);
                StartBeaconDiscoveryPlugin.this.lkBridgeContext.mo92214a("beaconUpdate", onBeaconUpdateResponse);
            }

            @Override // com.larksuite.component.openplatform.core.plugin.device.bluetooth.ibeacon.BeaconManager.AbstractC24763c
            /* renamed from: a */
            public void mo87790a(int i) {
                if (i == 2) {
                    StartBeaconDiscoveryPlugin startBeaconDiscoveryPlugin = StartBeaconDiscoveryPlugin.this;
                    int i2 = C25906a.f64080j.f64115H;
                    startBeaconDiscoveryPlugin.callbackFail(i2, "please restart bluetooth", "please restart bluetooth  code is" + i);
                    return;
                }
                StartBeaconDiscoveryPlugin startBeaconDiscoveryPlugin2 = StartBeaconDiscoveryPlugin.this;
                int i3 = C25906a.f64080j.f64115H;
                String str = C25906a.f64080j.f64117J;
                startBeaconDiscoveryPlugin2.callbackFail(i3, str, "inner error  code is" + i);
            }
        });
        if (a == BeaconManager.ScanState.SCAN_ERROR) {
            this.log.mo92223e("StartBeaconDiscoveryPlugin", "beacon start scan error");
            callbackFail(C25906a.f64080j.f64115H, C25906a.f64080j.f64117J, "beacon start scan error");
        } else if (a == BeaconManager.ScanState.ALREADY_SCANNED) {
            this.log.mo92223e("StartBeaconDiscoveryPlugin", "beacon is already start scan");
            callbackFail(C25907b.f64082A.f64115H, C25907b.f64082A.f64117J, "beacon is already start scan");
        }
    }

    private boolean checkUUID(String str) {
        if (!str.replaceAll("-", "").matches("[0-9a-fA-F]{32}")) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean checkGPSIsOpen(Context context) {
        boolean z;
        LocationManager locationManager = (LocationManager) context.getSystemService("location");
        if (locationManager != null) {
            z = locationManager.isProviderEnabled("gps");
        } else {
            z = false;
        }
        this.log.mo92224i("StartBeaconDiscoveryPlugin", "gps state:", Boolean.valueOf(z));
        return z;
    }

    public void requestSystemPermission(final AbstractC25905b bVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.ACCESS_FINE_LOCATION");
        arrayList.add("android.permission.BLUETOOTH");
        SystemPermission.Request request2 = new SystemPermission.Request();
        request2.mPermissions = arrayList;
        bVar.mo92209a("requestSystemPermission", request2, new AbstractC25897h<SystemPermission.Response>() {
            /* class com.larksuite.component.openplatform.core.plugin.device.bluetooth.ibeacon.StartBeaconDiscoveryPlugin.C247652 */

            /* renamed from: a */
            public void callback(SystemPermission.Response response) {
                List<String> list = response.mDeniedPermissions;
                if (list == null || list.size() == 0) {
                    BeaconManager.m89833a(StartBeaconDiscoveryPlugin.this.mAppContext).mo87776a(new BeaconManager.AbstractC24762b() {
                        /* class com.larksuite.component.openplatform.core.plugin.device.bluetooth.ibeacon.StartBeaconDiscoveryPlugin.C247652.C247661 */

                        @Override // com.larksuite.component.openplatform.core.plugin.device.bluetooth.ibeacon.BeaconManager.AbstractC24762b
                        /* renamed from: a */
                        public void mo87788a(boolean z, boolean z2) {
                            OnBeaconServiceChangeResponse onBeaconServiceChangeResponse = new OnBeaconServiceChangeResponse();
                            onBeaconServiceChangeResponse.available = z;
                            onBeaconServiceChangeResponse.discovering = z2;
                            ILogger aVar = StartBeaconDiscoveryPlugin.this.log;
                            aVar.mo92224i("StartBeaconDiscoveryPlugin", "fire event available:" + z + ", discovering:" + z2);
                            bVar.mo92214a("beaconServiceChange", onBeaconServiceChangeResponse);
                        }
                    });
                    if (BeaconManager.m89833a(StartBeaconDiscoveryPlugin.this.mAppContext).mo87778b()) {
                        StartBeaconDiscoveryPlugin.this.startScan();
                    } else if (StartBeaconDiscoveryPlugin.this.mAppContext.getCurrentActivity() == null) {
                        StartBeaconDiscoveryPlugin.this.log.mo92223e("StartBeaconDiscoveryPlugin", "activity is null");
                        StartBeaconDiscoveryPlugin.this.callbackFail(C25906a.f64080j.f64115H, C25906a.f64080j.f64117J, "activity is null");
                    } else {
                        StartBeaconDiscoveryPlugin.this.log.mo92224i("StartBeaconDiscoveryPlugin", "askUserToEnableBluetooth");
                        BeaconManager.m89833a(StartBeaconDiscoveryPlugin.this.mAppContext).mo87774a(StartBeaconDiscoveryPlugin.this.mAppContext.getCurrentActivity(), 2001);
                    }
                } else {
                    StartBeaconDiscoveryPlugin.this.log.mo92223e("StartBeaconDiscoveryPlugin", "ibeacon permission is denied");
                    StartBeaconDiscoveryPlugin.this.callbackFail(C25907b.f64085D.f64115H, C25907b.f64085D.f64117J, "permission is denied");
                }
            }
        }, SystemPermission.Response.class);
    }

    public void callbackFail(int i, String str, String str2) {
        StartBeaconDiscoveryResponse startBeaconDiscoveryResponse = new StartBeaconDiscoveryResponse();
        startBeaconDiscoveryResponse.mErrorCode = i;
        startBeaconDiscoveryResponse.mErrorMessage = str;
        startBeaconDiscoveryResponse.mInnerCode = i;
        startBeaconDiscoveryResponse.mInnerMsg = str2;
        AbstractC25897h<StartBeaconDiscoveryResponse> hVar = this.invokeCallback;
        if (hVar != null) {
            hVar.callback(startBeaconDiscoveryResponse);
        }
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public boolean handleActivityResult(int i, int i2, Intent intent) {
        if (i == 2001) {
            if (i2 == -1) {
                startScan();
            } else {
                this.log.mo92223e("StartBeaconDiscoveryPlugin", "beacon is not enable");
                callbackFail(C25907b.f64086E.f64115H, C25907b.f64086E.f64117J, "beacon is not enable");
            }
        }
        return true;
    }

    @LKPluginFunction(async = true, eventName = {"startBeaconDiscovery"})
    public void startBeaconDiscovery(StartBeaconDiscoveryRequest startBeaconDiscoveryRequest, LKEvent lKEvent, ILogger aVar, final AbstractC25905b bVar, AbstractC25897h<StartBeaconDiscoveryResponse> hVar) {
        this.invokeCallback = hVar;
        this.log = aVar;
        this.request = startBeaconDiscoveryRequest;
        this.lkBridgeContext = bVar;
        if (checkParam()) {
            IAppContext appContext = getAppContext();
            this.mAppContext = appContext;
            if (appContext == null) {
                this.log.mo92223e("StartBeaconDiscoveryPlugin", "appContext is null");
                callbackFail(C25906a.f64080j.f64115H, C25906a.f64080j.f64117J, "appContext is null");
            } else if (!checkGPSIsOpen(appContext.getApplicationContext())) {
                this.log.mo92223e("StartBeaconDiscoveryPlugin", "device not support gps");
                callbackFail(C25907b.f64085D.f64115H, C25907b.f64085D.f64117J, "device not support gps");
            } else if (!BeaconManager.m89833a(this.mAppContext).mo87777a()) {
                this.log.mo92223e("StartBeaconDiscoveryPlugin", "device not support ibeacon");
                callbackFail(C25907b.f64083B.f64115H, C25907b.f64083B.f64117J, "device not support ibeacon");
            } else {
                Activity currentActivity = this.mAppContext.getCurrentActivity();
                if (currentActivity == null) {
                    this.log.mo92223e("StartBeaconDiscoveryPlugin", "activity is null");
                    callbackFail(C25906a.f64080j.f64115H, C25906a.f64080j.f64117J, "activity is null");
                    return;
                }
                getApiDependency().mo235021a(currentActivity, lKEvent.mo92146m(), C66578b.C66579a.m260113b(this.mAppContext), new AbstractC67709b.AbstractC67711b() {
                    /* class com.larksuite.component.openplatform.core.plugin.device.bluetooth.ibeacon.StartBeaconDiscoveryPlugin.C247641 */

                    @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
                    /* renamed from: a */
                    public void mo87574a() {
                        StartBeaconDiscoveryPlugin.this.log.mo92224i("StartBeaconDiscoveryPlugin", "brand location permission granted");
                        StartBeaconDiscoveryPlugin.this.requestSystemPermission(bVar);
                    }

                    @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
                    /* renamed from: a */
                    public void mo87575a(String str) {
                        StartBeaconDiscoveryPlugin.this.log.mo92223e("StartBeaconDiscoveryPlugin", "brand location permission is denied");
                        StartBeaconDiscoveryPlugin.this.callbackFail(C25906a.f64076f.f64115H, C25906a.f64076f.f64117J, "brand location permission is denied");
                    }
                });
            }
        }
    }
}
