package com.larksuite.component.openplatform.plugins.device.wifi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.util.Log;
import com.alibaba.fastjson.annotation.JSONField;
import com.larksuite.component.openplatform.plugins.device.wifi.WifiPlugin;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.common.C25921b;
import java.util.LinkedList;
import java.util.List;

public class WifiScanReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private AbstractC25905b f62312a;

    /* renamed from: b */
    private WifiManager f62313b;

    private static class WifiListResponse extends C25921b {
        @JSONField(name = "wifiList")
        public List<WifiPlugin.GetConnectedWifiResponse> mGetWifiLists = new LinkedList();
    }

    public WifiScanReceiver(AbstractC25905b bVar, WifiManager wifiManager) {
        this.f62312a = bVar;
        this.f62313b = wifiManager;
    }

    public void onReceive(Context context, Intent intent) {
        List<ScanResult> scanResults = this.f62313b.getScanResults();
        WifiListResponse wifiListResponse = new WifiListResponse();
        for (ScanResult scanResult : scanResults) {
            if (!(scanResult.SSID == null || scanResult.BSSID == null)) {
                WifiPlugin.GetConnectedWifiResponse getConnectedWifiResponse = new WifiPlugin.GetConnectedWifiResponse();
                getConnectedWifiResponse.mSSID = scanResult.SSID;
                getConnectedWifiResponse.mBSSID = scanResult.BSSID;
                getConnectedWifiResponse.mSecurity = C25609a.m91372a(scanResult);
                getConnectedWifiResponse.mSignalStrength = Math.abs(scanResult.level);
                wifiListResponse.mGetWifiLists.add(getConnectedWifiResponse);
            }
        }
        Log.i("WifiScanReceiver", "onReceive wifiList " + wifiListResponse.mGetWifiLists.size());
        this.f62312a.mo92214a("onGetWifiList", wifiListResponse);
    }
}
