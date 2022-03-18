package com.larksuite.component.openplatform.plugins.device.wifi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.LocationManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.framework.apiplugin.AbstractC25889a;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.common.SystemPermission;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.larksuite.framework.apiplugin.p1176b.C25907b;
import com.ss.android.lark.log.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import me.ele.lancet.base.annotations.Skip;

public class WifiPlugin extends AbstractC25889a {
    private AtomicBoolean mRegistered = new AtomicBoolean();
    private WifiManager mWifiManager;
    public C25610b mWifiObject;
    private WifiScanReceiver mWifiScanReceiver;

    public static class GetConnectedWifiRequest extends C25920a {
        @JSONField(name = "cacheTimeout")
        public int cacheTimeout;
    }

    public static class GetConnectedWifiResponse extends C25921b {
        @JSONField(name = "BSSID")
        public String mBSSID;
        @JSONField(name = "SSID")
        public String mSSID;
        @JSONField(name = "secure")
        public boolean mSecurity;
        @JSONField(name = "signalStrength")
        public int mSignalStrength;
    }

    public static class GetWifiStatusResponse extends C25921b {
        @JSONField(name = UpdateKey.STATUS)
        public String mStatus;
    }

    public static class WifiCommonRequest extends C25920a {
    }

    public static class WifiCommonResponse extends C25921b {
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
    }

    public WifiManager getWifiManager(AbstractC25905b bVar) {
        WifiManager wifiManager = this.mWifiManager;
        if (wifiManager != null) {
            return wifiManager;
        }
        WifiManager wifiManager2 = (WifiManager) bVar.mo92207a().getApplicationContext().getSystemService("wifi");
        this.mWifiManager = wifiManager2;
        return wifiManager2;
    }

    private WifiScanReceiver getWifiScanReceiver(AbstractC25905b bVar, WifiManager wifiManager) {
        WifiScanReceiver wifiScanReceiver = this.mWifiScanReceiver;
        if (wifiScanReceiver != null) {
            return wifiScanReceiver;
        }
        WifiScanReceiver wifiScanReceiver2 = new WifiScanReceiver(bVar, wifiManager);
        this.mWifiScanReceiver = wifiScanReceiver2;
        return wifiScanReceiver2;
    }

    public GetConnectedWifiResponse generateConnectedWifiResponse(WifiInfo wifiInfo, WifiManager wifiManager) {
        GetConnectedWifiResponse getConnectedWifiResponse = new GetConnectedWifiResponse();
        getConnectedWifiResponse.mSSID = wifiInfo.getSSID();
        getConnectedWifiResponse.mBSSID = wifiInfo.getBSSID();
        getConnectedWifiResponse.mSecurity = C25609a.m91373a(wifiInfo, wifiManager);
        getConnectedWifiResponse.mSignalStrength = wifiInfo.getRssi();
        return getConnectedWifiResponse;
    }

    @LKPluginFunction(async = true, eventName = {"getWifiStatus"})
    public void getWifiStatus(AbstractC25897h<GetWifiStatusResponse> hVar, AbstractC25905b bVar) {
        String str;
        WifiManager wifiManager = getWifiManager(bVar);
        GetWifiStatusResponse getWifiStatusResponse = new GetWifiStatusResponse();
        if (wifiManager != null) {
            if (wifiManager.isWifiEnabled()) {
                str = "on";
            } else {
                str = "off";
            }
            getWifiStatusResponse.mStatus = str;
            hVar.callback(getWifiStatusResponse);
            return;
        }
        fillFailedResponse(getWifiStatusResponse, C25906a.f64080j, "wifiManager = null");
        hVar.callback(getWifiStatusResponse);
    }

    @LKPluginFunction(async = true, eventName = {"offGetWifiList"})
    public void offGetWifiList(AbstractC25897h<C25921b> hVar, AbstractC25905b bVar) {
        if (this.mRegistered.compareAndSet(true, false)) {
            try {
                bVar.mo92207a().unregisterReceiver(getWifiScanReceiver(bVar, getWifiManager(bVar)));
            } catch (Exception e) {
                Log.m165390i("WifiPlugin", "wifi scan receiver unregister failed e = ", e);
            }
        } else {
            Log.m165389i("WifiPlugin", "wifi scan receiver has unRegistered");
        }
        hVar.callback(null);
    }

    @LKPluginFunction(async = true, eventName = {"onGetWifiList"})
    public void onGetWifiList(AbstractC25897h<C25921b> hVar, AbstractC25905b bVar) {
        if (this.mRegistered.compareAndSet(false, true)) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.wifi.SCAN_RESULTS");
            INVOKEVIRTUAL_com_larksuite_component_openplatform_plugins_device_wifi_WifiPlugin_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(bVar.mo92207a(), getWifiScanReceiver(bVar, getWifiManager(bVar)), intentFilter);
        } else {
            Log.m165389i("WifiPlugin", "wifi scan receiver has registered");
        }
        hVar.callback(null);
    }

    @LKPluginFunction(async = true, eventName = {"getWifiList"})
    public void getWifiList(final AbstractC25897h<C25921b> hVar, AbstractC25905b bVar) {
        final WifiManager wifiManager = getWifiManager(bVar);
        if (!wifiManager.isWifiEnabled()) {
            Log.m165389i("WifiPlugin", "getWifiList, wifi disable");
            hVar.callback(createFailedResponse(C25907b.f64089a));
        } else if (!((LocationManager) bVar.mo92207a().getApplicationContext().getSystemService("location")).isProviderEnabled("gps")) {
            Log.m165389i("WifiPlugin", "getWifiList, gps closed");
            hVar.callback(createFailedResponse(C25907b.f64091c));
        } else {
            SystemPermission.Request request = new SystemPermission.Request();
            request.mPermissions.add("android.permission.ACCESS_FINE_LOCATION");
            bVar.mo92209a("requestSystemPermission", request, new AbstractC25897h<SystemPermission.Response>() {
                /* class com.larksuite.component.openplatform.plugins.device.wifi.WifiPlugin.C256082 */

                /* renamed from: a */
                public void callback(SystemPermission.Response response) {
                    if (!response.mGrantedPermissions.contains("android.permission.ACCESS_FINE_LOCATION")) {
                        Log.m165389i("WifiPlugin", "getWifiList, system auth deny");
                        hVar.callback(WifiPlugin.this.createFailedResponse(C25906a.f64075e, C25906a.f64075e.f64117J));
                    } else if (!wifiManager.startScan()) {
                        Log.m165389i("WifiPlugin", "getWifiList, wifi scan failed");
                        hVar.callback(WifiPlugin.this.createFailedResponse(C25906a.f64080j, "getWifiList, wifi scan failed"));
                    } else {
                        hVar.callback(null);
                    }
                }
            }, SystemPermission.Response.class);
        }
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    public static Intent INVOKEVIRTUAL_com_larksuite_component_openplatform_plugins_device_wifi_WifiPlugin_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }

    @LKPluginFunction(async = true, eventName = {"getConnectedWifi"})
    public void getConnectedWifi(final GetConnectedWifiRequest getConnectedWifiRequest, final AbstractC25897h<GetConnectedWifiResponse> hVar, final AbstractC25905b bVar) {
        SystemPermission.Request request = new SystemPermission.Request();
        request.setForceUiThread(false);
        request.mPermissions.add("android.permission.ACCESS_FINE_LOCATION");
        bVar.mo92209a("requestSystemPermission", request, new AbstractC25897h<SystemPermission.Response>() {
            /* class com.larksuite.component.openplatform.plugins.device.wifi.WifiPlugin.C256071 */

            /* renamed from: a */
            public void callback(SystemPermission.Response response) {
                GetConnectedWifiResponse getConnectedWifiResponse = new GetConnectedWifiResponse();
                if (!response.mGrantedPermissions.contains("android.permission.ACCESS_FINE_LOCATION")) {
                    Log.m165389i("WifiPlugin", "getConnectedWifi, system auth deny");
                    WifiPlugin.this.fillFailedResponse(getConnectedWifiResponse, C25906a.f64075e, "getConnectedWifi, system auth deny");
                    hVar.callback(getConnectedWifiResponse);
                    return;
                }
                int i = 0;
                GetConnectedWifiRequest getConnectedWifiRequest = getConnectedWifiRequest;
                if (getConnectedWifiRequest != null) {
                    i = getConnectedWifiRequest.cacheTimeout;
                    Log.m165389i("WifiPlugin", "getConnectedWifi, use cache timeout, timeout = " + i);
                }
                long currentTimeMillis = System.currentTimeMillis();
                WifiManager wifiManager = WifiPlugin.this.getWifiManager(bVar);
                if (WifiPlugin.this.mWifiObject == null || WifiPlugin.this.mWifiObject.mo88839b() + ((long) (i * 1000)) < currentTimeMillis) {
                    WifiPlugin.this.mWifiObject = C25609a.m91371a(bVar, wifiManager, currentTimeMillis);
                }
                if (WifiPlugin.this.mWifiObject == null || WifiPlugin.this.mWifiObject.mo88836a() == null) {
                    Log.m165389i("WifiPlugin", "getConnectedWifi, wifiObject empty");
                    WifiPlugin.this.fillFailedResponse(getConnectedWifiResponse, C25906a.f64080j, "getConnectedWifi, wifiObject empty");
                    hVar.callback(getConnectedWifiResponse);
                } else if (!wifiManager.isWifiEnabled()) {
                    Log.m165389i("WifiPlugin", "getConnectedWifi, wifi disable");
                    WifiPlugin.this.fillFailedResponse(getConnectedWifiResponse, C25907b.f64089a, "wifi disable");
                    hVar.callback(getConnectedWifiResponse);
                } else if (!C25609a.m91374a(WifiPlugin.this.mWifiObject)) {
                    Log.m165389i("WifiPlugin", "getConnectedWifi, invalid wifi ssid");
                    WifiPlugin.this.fillFailedResponse(getConnectedWifiResponse, C25907b.f64090b, "invalid wifi ssid");
                    hVar.callback(getConnectedWifiResponse);
                } else {
                    AbstractC25897h hVar = hVar;
                    WifiPlugin wifiPlugin = WifiPlugin.this;
                    hVar.callback(wifiPlugin.generateConnectedWifiResponse(wifiPlugin.mWifiObject.mo88836a(), wifiManager));
                }
            }
        }, SystemPermission.Response.class);
    }
}
