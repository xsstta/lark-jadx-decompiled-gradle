package com.bytedance.ee.lark.infra.network.p622a.p623a;

import android.app.Activity;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.ee.lark.infra.network.a.a.f */
public class C12807f {

    /* renamed from: a */
    private String f34189a;

    /* renamed from: b */
    private String f34190b;

    /* renamed from: c */
    private boolean f34191c;

    /* renamed from: d */
    private int f34192d;

    /* renamed from: e */
    private long f34193e;

    /* renamed from: f */
    private WifiManager f34194f;

    /* renamed from: g */
    private WifiInfo f34195g;

    /* renamed from: a */
    public long mo48361a() {
        return this.f34193e;
    }

    /* renamed from: b */
    public String mo48362b() {
        return this.f34189a;
    }

    /* renamed from: c */
    public String mo48363c() {
        return this.f34190b;
    }

    /* renamed from: d */
    public int mo48364d() {
        return this.f34192d;
    }

    /* renamed from: f */
    public boolean mo48366f() {
        return this.f34191c;
    }

    /* renamed from: e */
    public boolean mo48365e() {
        return this.f34194f.isWifiEnabled();
    }

    /* renamed from: g */
    private void m52901g() {
        this.f34195g = this.f34194f.getConnectionInfo();
    }

    /* renamed from: h */
    private boolean m52902h() {
        int i;
        if (this.f34195g == null) {
            return false;
        }
        try {
            List<WifiConfiguration> configuredNetworks = this.f34194f.getConfiguredNetworks();
            if (configuredNetworks != null) {
                Iterator<WifiConfiguration> it = configuredNetworks.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    WifiConfiguration next = it.next();
                    String str = next.SSID;
                    String ssid = this.f34195g.getSSID();
                    if (!TextUtils.isEmpty(str)) {
                        if (!TextUtils.isEmpty(ssid)) {
                            if (ssid.replace("\"", "").equals(str.replace("\"", "")) && this.f34195g.getNetworkId() == next.networkId) {
                                i = m52899a(next);
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
            AppBrandLogger.m52829e("WifiObject", "getmSecurity", e);
        }
    }

    /* renamed from: a */
    private void m52900a(Activity activity) {
        this.f34194f = (WifiManager) activity.getApplicationContext().getSystemService("wifi");
    }

    public C12807f(Activity activity) {
        String str;
        int i;
        m52900a(activity);
        m52901g();
        WifiInfo wifiInfo = this.f34195g;
        String str2 = "";
        if (wifiInfo == null) {
            str = str2;
        } else {
            str = wifiInfo.getSSID();
        }
        this.f34189a = str;
        WifiInfo wifiInfo2 = this.f34195g;
        this.f34190b = wifiInfo2 != null ? wifiInfo2.getBSSID() : str2;
        this.f34191c = m52902h();
        WifiInfo wifiInfo3 = this.f34195g;
        if (wifiInfo3 == null) {
            i = 0;
        } else {
            i = wifiInfo3.getRssi();
        }
        this.f34192d = i;
        this.f34193e = System.currentTimeMillis();
    }

    /* renamed from: a */
    private int m52899a(WifiConfiguration wifiConfiguration) {
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

    public C12807f(IAppContext iAppContext) {
        String str;
        int i;
        m52900a(iAppContext.getCurrentActivity());
        m52901g();
        WifiInfo wifiInfo = this.f34195g;
        String str2 = "";
        if (wifiInfo == null) {
            str = str2;
        } else {
            str = wifiInfo.getSSID();
        }
        this.f34189a = str;
        WifiInfo wifiInfo2 = this.f34195g;
        this.f34190b = wifiInfo2 != null ? wifiInfo2.getBSSID() : str2;
        this.f34191c = m52902h();
        WifiInfo wifiInfo3 = this.f34195g;
        if (wifiInfo3 == null) {
            i = 0;
        } else {
            i = wifiInfo3.getRssi();
        }
        this.f34192d = i;
        this.f34193e = System.currentTimeMillis();
    }
}
