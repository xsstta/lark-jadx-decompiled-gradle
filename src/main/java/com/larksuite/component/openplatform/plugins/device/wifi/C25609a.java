package com.larksuite.component.openplatform.plugins.device.wifi;

import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.ss.android.lark.log.Log;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.larksuite.component.openplatform.plugins.device.wifi.a */
public class C25609a {
    /* renamed from: a */
    private static int m91370a(WifiConfiguration wifiConfiguration) {
        if (wifiConfiguration.allowedKeyManagement.get(1)) {
            return 2;
        }
        if (wifiConfiguration.allowedKeyManagement.get(2) || wifiConfiguration.allowedKeyManagement.get(3)) {
            return 3;
        }
        if (wifiConfiguration.wepKeys[0] != null) {
            return 1;
        }
        return 0;
    }

    /* renamed from: a */
    public static boolean m91372a(ScanResult scanResult) {
        String str = scanResult.capabilities;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String[] strArr = {"WEP", "WPA", "WPA2", "WPA-EAP", "IEEE8021X", "-EAP-"};
        for (int i = 0; i < 6; i++) {
            if (str.contains(strArr[i])) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m91374a(C25610b bVar) {
        WifiInfo a;
        if (bVar != null && (a = bVar.mo88836a()) != null && !TextUtils.isEmpty(a.getSSID()) && !a.getSSID().contains("unknown ssid")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m91373a(WifiInfo wifiInfo, WifiManager wifiManager) {
        int i;
        if (wifiInfo == null) {
            return false;
        }
        try {
            List<WifiConfiguration> configuredNetworks = wifiManager.getConfiguredNetworks();
            if (configuredNetworks != null) {
                Iterator<WifiConfiguration> it = configuredNetworks.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    WifiConfiguration next = it.next();
                    String str = next.SSID;
                    String ssid = wifiInfo.getSSID();
                    if (!TextUtils.isEmpty(str)) {
                        if (!TextUtils.isEmpty(ssid)) {
                            if (ssid.replace("\"", "").equals(str.replace("\"", "")) && wifiInfo.getNetworkId() == next.networkId) {
                                i = m91370a(next);
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            i = 0;
            if (i == 0) {
                return false;
            }
            return true;
        } catch (Exception e) {
            Log.m165384e("WifiObject", "getSecurity", e);
            return true;
        }
    }

    /* renamed from: a */
    public static C25610b m91371a(AbstractC25905b bVar, WifiManager wifiManager, long j) {
        try {
            WifiInfo connectionInfo = wifiManager.getConnectionInfo();
            C25610b bVar2 = new C25610b();
            bVar2.mo88838a(connectionInfo);
            bVar2.mo88837a(j);
            return bVar2;
        } catch (Exception e) {
            Log.m165389i("ContentValues", "get wifi object exception = " + e.getMessage());
            return null;
        }
    }
}
