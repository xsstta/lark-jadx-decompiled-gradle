package org.chromium;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.frameworks.baselib.network.http.util.C14091i;
import com.ttnet.org.chromium.net.TTAppInfoProvider;
import java.net.CookieHandler;
import java.util.List;
import java.util.Map;

/* renamed from: org.chromium.a */
public class C70008a extends TTAppInfoProvider {

    /* renamed from: a */
    private static C70008a f174984a;

    /* renamed from: b */
    private TTAppInfoProvider.AppInfo f174985b;

    /* renamed from: c */
    private Context f174986c;

    @Override // com.ttnet.org.chromium.net.TTAppInfoProvider
    public TTAppInfoProvider.AppInfo getAppInfo() {
        try {
            synchronized (C70008a.class) {
                if (this.f174985b == null) {
                    this.f174985b = new TTAppInfoProvider.AppInfo();
                }
            }
            this.f174985b.setAppId(C70010c.m268520a().mo246407e());
            this.f174985b.setAppName(C70010c.m268520a().mo246413k());
            this.f174985b.setSdkAppID(C70010c.m268520a().mo246414l());
            this.f174985b.setSdkVersion(C70010c.m268520a().mo246415m());
            this.f174985b.setChannel(C70010c.m268520a().mo246416n());
            this.f174985b.setDeviceId(C70010c.m268520a().mo246409g());
            if (C70014f.m268590a(this.f174986c)) {
                this.f174985b.setIsMainProcess("1");
            } else {
                this.f174985b.setIsMainProcess("0");
            }
            this.f174985b.setAbi(C70010c.m268520a().mo246418p());
            this.f174985b.setDevicePlatform(C70010c.m268520a().mo246419q());
            this.f174985b.setDeviceType(C70010c.m268520a().mo246412j());
            this.f174985b.setDeviceBrand(C70010c.m268520a().mo246420r());
            this.f174985b.setDeviceModel(C70010c.m268520a().mo246421s());
            this.f174985b.setNetAccessType(C70010c.m268520a().mo246410h());
            this.f174985b.setOSApi(C70010c.m268520a().mo246408f());
            this.f174985b.setOSVersion(C70010c.m268520a().mo246417o());
            this.f174985b.setUserId(C70010c.m268520a().mo246406d());
            this.f174985b.setVersionCode(C70010c.m268520a().mo246411i());
            this.f174985b.setVersionName(C70010c.m268520a().mo246422t());
            this.f174985b.setUpdateVersionCode(C70010c.m268520a().mo246423u());
            this.f174985b.setManifestVersionCode(C70010c.m268520a().mo246424v());
            this.f174985b.setStoreIdc(C70010c.m268520a().mo246425w());
            this.f174985b.setRegion(C70010c.m268520a().mo246426x());
            this.f174985b.setSysRegion(C70010c.m268520a().mo246427y());
            this.f174985b.setCarrierRegion(C70010c.m268520a().mo246428z());
            this.f174985b.setTNCRequestFlags(C70010c.m268520a().mo246370A());
            this.f174985b.setHttpDnsRequestFlags(C70010c.m268520a().mo246371B());
            Map<String, String> C = C70010c.m268520a().mo246372C();
            if (C != null && !C.isEmpty()) {
                this.f174985b.setHostFirst(C.get("first"));
                this.f174985b.setHostSecond(C.get("second"));
                this.f174985b.setHostThird(C.get("third"));
                this.f174985b.setDomainHttpDns(C.get("httpdns"));
                this.f174985b.setDomainNetlog(C.get("netlog"));
                this.f174985b.setDomainBoe(C.get("boe"));
                this.f174985b.setDomainBoeHttps(C.get("boe_https"));
            }
            Map<String, String> G = C70010c.m268520a().mo246376G();
            String str = "";
            if (G != null && !G.isEmpty()) {
                for (Map.Entry<String, String> entry : G.entrySet()) {
                    str = entry.getKey() + ":" + entry.getValue() + "\r\n" + str;
                }
            }
            String a = m268517a(C.get("first"));
            if (!TextUtils.isEmpty(a)) {
                str = "Cookie:" + a + "\r\n" + str;
            }
            this.f174985b.setTNCRequestHeader(str);
            Map<String, String> H = C70010c.m268520a().mo246377H();
            String str2 = "";
            if (H != null && !H.isEmpty()) {
                for (Map.Entry<String, String> entry2 : H.entrySet()) {
                    str2 = entry2.getKey() + ":" + entry2.getValue() + "\r\n" + str2;
                }
            }
            this.f174985b.setTNCRequestQuery(str2);
            if (C70011d.m268581a().loggerDebug()) {
                C70011d a2 = C70011d.m268581a();
                a2.loggerD("CronetAppInfoProvider", "get appinfo = " + ("AppInfo{, mUserId='" + this.f174985b.getUserId() + '\'' + ", mAppId='" + this.f174985b.getAppId() + '\'' + ", mOSApi='" + this.f174985b.getOSApi() + '\'' + ", mDeviceId='" + this.f174985b.getDeviceId() + '\'' + ", mNetAccessType='" + this.f174985b.getNetAccessType() + '\'' + ", mVersionCode='" + this.f174985b.getVersionCode() + '\'' + ", mDeviceType='" + this.f174985b.getDeviceType() + '\'' + ", mAppName='" + this.f174985b.getAppName() + '\'' + ", mSdkAppID='" + this.f174985b.getSdkAppID() + '\'' + ", mSdkVersion='" + this.f174985b.getSdkVersion() + '\'' + ", mChannel='" + this.f174985b.getChannel() + '\'' + ", mOSVersion='" + this.f174985b.getOSVersion() + '\'' + ", mAbi='" + this.f174985b.getAbi() + '\'' + ", mDevicePlatform='" + this.f174985b.getDevicePlatform() + '\'' + ", mDeviceBrand='" + this.f174985b.getDeviceBrand() + '\'' + ", mDeviceModel='" + this.f174985b.getDeviceModel() + '\'' + ", mVersionName='" + this.f174985b.getVersionName() + '\'' + ", mUpdateVersionCode='" + this.f174985b.getUpdateVersionCode() + '\'' + ", mManifestVersionCode='" + this.f174985b.getManifestVersionCode() + '\'' + ", mHostFirst='" + this.f174985b.getHostFirst() + '\'' + ", mHostSecond='" + this.f174985b.getHostSecond() + '\'' + ", mHostThird='" + this.f174985b.getHostThird() + '\'' + ", mDomainHttpDns='" + this.f174985b.getDomainHttpDns() + '\'' + ", mDomainNetlog='" + this.f174985b.getDomainNetlog() + '\'' + ", mDomainBoe='" + this.f174985b.getDomainBoe() + '\'' + '}'));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return this.f174985b;
    }

    private C70008a(Context context) {
        this.f174986c = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C70008a m268518a(Context context) {
        if (f174984a == null) {
            synchronized (C70008a.class) {
                if (f174984a == null) {
                    f174984a = new C70008a(context);
                }
            }
        }
        return f174984a;
    }

    /* renamed from: a */
    private String m268517a(String str) {
        CookieHandler cookieHandler = CookieHandler.getDefault();
        if (!TextUtils.isEmpty(str) && cookieHandler != null) {
            try {
                Map<String, List<String>> map = cookieHandler.get(C14091i.m57054b("https://" + str), null);
                if (map != null && map.size() > 0) {
                    for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                        if ("Cookie".equalsIgnoreCase(entry.getKey()) && !entry.getValue().isEmpty()) {
                            StringBuilder sb = new StringBuilder();
                            int i = 0;
                            for (String str2 : entry.getValue()) {
                                if (i > 0) {
                                    sb.append("; ");
                                }
                                sb.append(str2);
                                i++;
                            }
                            return sb.toString();
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
