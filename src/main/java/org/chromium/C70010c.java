package org.chromium;

import android.util.Pair;
import com.ttnet.org.chromium.base.Reflect;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: org.chromium.c */
public class C70010c {

    /* renamed from: a */
    private static volatile C70010c f174988a;

    /* renamed from: b */
    private Object f174989b;

    private C70010c() {
    }

    /* renamed from: a */
    public void mo246393a(Object obj) {
        List<Class> a;
        if (obj != null) {
            try {
                Class<?> cls = obj.getClass();
                if (!(cls == null || (a = C70014f.m268589a(cls)) == null)) {
                    if (!a.isEmpty()) {
                        for (Class cls2 : a) {
                            if ("com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider".equals(cls2.getName())) {
                                if (C70011d.m268581a().loggerDebug()) {
                                    C70011d.m268581a().loggerD("CronetAppProviderManager", "inject CronetAppProviderManager success");
                                }
                                this.f174989b = obj;
                                return;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public void mo246396a(String str, String str2) {
        if (C70011d.m268581a().loggerDebug()) {
            C70011d a = C70011d.m268581a();
            a.loggerD("CronetAppProviderManager", "Send monitor json = " + str + ", log type =" + str2);
        }
        try {
            Object obj = this.f174989b;
            if (obj != null) {
                Reflect.on(obj).call("sendAppMonitorEvent", new Class[]{String.class, String.class}, str, str2);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo246399a(boolean z, String str, String str2, String str3, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, boolean z2, long j11, long j12, String str4, String str5, String str6, int i, int i2, String str7) {
        if (C70011d.m268581a().loggerDebug()) {
            C70011d.m268581a().loggerD("CronetAppProviderManager", "handleApiResult ");
        }
        try {
            if (this.f174989b != null) {
                IOException iOException = null;
                if (!z) {
                    iOException = C70014f.m268587a(C70014f.m268586a(i, i2, str7));
                }
                Reflect.on(this.f174989b).call("handleApiResult", new Class[]{Boolean.TYPE, String.class, String.class, String.class, Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, Boolean.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, String.class, String.class, Exception.class}, Boolean.valueOf(z), str, str2, str3, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j5), Long.valueOf(j6), Long.valueOf(j7), Long.valueOf(j8), Long.valueOf(j9), Long.valueOf(j10), Boolean.valueOf(z2), Long.valueOf(j11), Long.valueOf(j12), str4, str5, str6, iOException);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo246394a(String str) {
        if (C70011d.m268581a().loggerDebug()) {
            C70011d a = C70011d.m268581a();
            a.loggerD("CronetAppProviderManager", "onTTNetDetectInfoChanged info str = " + str);
        }
        try {
            Object obj = this.f174989b;
            if (obj != null) {
                Reflect.on(obj).call("onTTNetDetectInfoChanged", new Class[]{String.class}, str);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo246397a(String str, String str2, int i, int i2, int i3, List<String> list, String str3) {
        if (C70011d.m268581a().loggerDebug()) {
            C70011d a = C70011d.m268581a();
            a.loggerD("CronetAppProviderManager", "onTTDnsResolveResult info uuid = " + str + " host: " + str2);
        }
        try {
            Object obj = this.f174989b;
            if (obj != null) {
                Reflect.on(obj).call("onTTDnsResolveResult", new Class[]{String.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, List.class, String.class}, str, str2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), list, str3);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo246395a(String str, int i) {
        if (C70011d.m268581a().loggerDebug()) {
            C70011d a = C70011d.m268581a();
            a.loggerD("CronetAppProviderManager", "onMappingRequestStatus key = " + str + " status = " + i);
        }
        try {
            Object obj = this.f174989b;
            if (obj != null) {
                Reflect.on(obj).call("onMappingRequestStatus", new Class[]{String.class, Integer.TYPE}, str, Integer.valueOf(i));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo246398a(String str, String str2, String str3) {
        if (C70011d.m268581a().loggerDebug()) {
            C70011d.m268581a().loggerD("CronetAppProviderManager", "onStoreIdcChanged ");
        }
        try {
            Object obj = this.f174989b;
            if (obj != null) {
                Reflect.on(obj).call("onStoreIdcChanged", new Class[]{String.class, String.class, String.class}, str, str2, str3);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo246400a(String[] strArr, String str) {
        if (C70011d.m268581a().loggerDebug()) {
            C70011d.m268581a().loggerD("CronetAppProviderManager", "onTNCUpdateFailed ");
        }
        try {
            if (!(this.f174989b == null || strArr == null)) {
                if (strArr.length > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (String str2 : strArr) {
                        arrayList.add(str2);
                    }
                    Reflect.on(this.f174989b).call("onTNCUpdateFailed", new Class[]{ArrayList.class, String.class}, arrayList, str);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: A */
    public String mo246370A() {
        return m268521d("getTNCRequestFlags");
    }

    /* renamed from: B */
    public String mo246371B() {
        return m268521d("getHttpDnsRequestFlags");
    }

    /* renamed from: d */
    public String mo246406d() {
        return m268521d("getUserId");
    }

    /* renamed from: e */
    public String mo246407e() {
        return m268521d("getAppId");
    }

    /* renamed from: f */
    public String mo246408f() {
        return m268521d("getOSApi");
    }

    /* renamed from: g */
    public String mo246409g() {
        return m268521d("getDeviceId");
    }

    /* renamed from: h */
    public String mo246410h() {
        return m268521d("getNetAccessType");
    }

    /* renamed from: i */
    public String mo246411i() {
        return m268521d("getVersionCode");
    }

    /* renamed from: j */
    public String mo246412j() {
        return m268521d("getDeviceType");
    }

    /* renamed from: k */
    public String mo246413k() {
        return m268521d("getAppName");
    }

    /* renamed from: l */
    public String mo246414l() {
        return m268521d("getSdkAppId");
    }

    /* renamed from: m */
    public String mo246415m() {
        return m268521d("getSdkVersion");
    }

    /* renamed from: n */
    public String mo246416n() {
        return m268521d("getChannel");
    }

    /* renamed from: o */
    public String mo246417o() {
        return m268521d("getOSVersion");
    }

    /* renamed from: p */
    public String mo246418p() {
        return m268521d("getAbi");
    }

    /* renamed from: q */
    public String mo246419q() {
        return m268521d("getDevicePlatform");
    }

    /* renamed from: r */
    public String mo246420r() {
        return m268521d("getDeviceBrand");
    }

    /* renamed from: s */
    public String mo246421s() {
        return m268521d("getDeviceModel");
    }

    /* renamed from: t */
    public String mo246422t() {
        return m268521d("getVersionName");
    }

    /* renamed from: u */
    public String mo246423u() {
        return m268521d("getUpdateVersionCode");
    }

    /* renamed from: v */
    public String mo246424v() {
        return m268521d("getManifestVersionCode");
    }

    /* renamed from: w */
    public String mo246425w() {
        return m268521d("getStoreIdc");
    }

    /* renamed from: x */
    public String mo246426x() {
        return m268521d("getRegion");
    }

    /* renamed from: y */
    public String mo246427y() {
        return m268521d("getSysRegion");
    }

    /* renamed from: z */
    public String mo246428z() {
        return m268521d("getCarrierRegion");
    }

    /* renamed from: a */
    public static C70010c m268520a() {
        if (f174988a == null) {
            synchronized (C70010c.class) {
                if (f174988a == null) {
                    f174988a = new C70010c();
                }
            }
        }
        return f174988a;
    }

    /* renamed from: D */
    public String mo246373D() {
        try {
            Object obj = this.f174989b;
            if (obj == null) {
                return null;
            }
            return (String) Reflect.on(obj).call("getGetDomainDefaultJSON").get();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: E */
    public ArrayList<byte[]> mo246374E() {
        try {
            Object obj = this.f174989b;
            if (obj == null) {
                return null;
            }
            return (ArrayList) Reflect.on(obj).call("getOpaqueData").get();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: F */
    public Map<String[], Pair<byte[], byte[]>> mo246375F() {
        try {
            Object obj = this.f174989b;
            if (obj == null) {
                return null;
            }
            return (Map) Reflect.on(obj).call("getClientOpaqueData").get();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: G */
    public Map<String, String> mo246376G() {
        try {
            Object obj = this.f174989b;
            if (obj == null) {
                return null;
            }
            return (Map) Reflect.on(obj).call("getTNCRequestHeader").get();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: H */
    public Map<String, String> mo246377H() {
        try {
            Object obj = this.f174989b;
            if (obj == null) {
                return null;
            }
            return (Map) Reflect.on(obj).call("getTNCRequestQuery").get();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: I */
    public boolean mo246378I() {
        try {
            Object obj = this.f174989b;
            if (obj == null) {
                return false;
            }
            return ((Boolean) Reflect.on(obj).call("isEnableQuic").get()).booleanValue();
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    /* renamed from: J */
    public boolean mo246379J() {
        try {
            Object obj = this.f174989b;
            if (obj == null) {
                return false;
            }
            return ((Boolean) Reflect.on(obj).call("isEnableHttp2").get()).booleanValue();
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    /* renamed from: K */
    public boolean mo246380K() {
        try {
            Object obj = this.f174989b;
            if (obj == null) {
                return false;
            }
            return ((Boolean) Reflect.on(obj).call("isEnableBrotli").get()).booleanValue();
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    /* renamed from: L */
    public Map<String, Pair<Integer, Integer>> mo246381L() {
        try {
            Object obj = this.f174989b;
            if (obj == null) {
                return null;
            }
            return (Map) Reflect.on(obj).call("getQuicHint").get();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: M */
    public boolean mo246382M() {
        try {
            Object obj = this.f174989b;
            if (obj == null) {
                return false;
            }
            return ((Boolean) Reflect.on(obj).call("isBOEProxyEnabled").get()).booleanValue();
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    /* renamed from: N */
    public String mo246383N() {
        try {
            Object obj = this.f174989b;
            if (obj == null) {
                return null;
            }
            return (String) Reflect.on(obj).call("getBypassBOEJSON").get();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: O */
    public String mo246384O() {
        try {
            Object obj = this.f174989b;
            if (obj == null) {
                return null;
            }
            return (String) Reflect.on(obj).call("getStoreIdcRuleJSON").get();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: P */
    public boolean mo246385P() {
        try {
            Object obj = this.f174989b;
            if (obj == null) {
                return false;
            }
            return ((Boolean) Reflect.on(obj).call("needCustomLoadLibrary").get()).booleanValue();
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    /* renamed from: Q */
    public String mo246386Q() {
        try {
            Object obj = this.f174989b;
            if (obj == null) {
                return null;
            }
            return (String) Reflect.on(obj).call("getCronetSoPath").get();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: R */
    public int mo246387R() {
        try {
            Object obj = this.f174989b;
            if (obj == null) {
                return 0;
            }
            return ((Integer) Reflect.on(obj).call("getProcessFlag").get()).intValue();
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    /* renamed from: C */
    public Map<String, String> mo246372C() {
        try {
            Object obj = this.f174989b;
            if (obj == null) {
                return Collections.emptyMap();
            }
            return (Map) Reflect.on(obj).call("getGetDomainDependHostMap").get();
        } catch (Throwable th) {
            th.printStackTrace();
            return Collections.emptyMap();
        }
    }

    /* renamed from: b */
    public void mo246401b() {
        if (C70011d.m268581a().loggerDebug()) {
            C70011d.m268581a().loggerD("CronetAppProviderManager", "onColdStartFinish ");
        }
        try {
            Object obj = this.f174989b;
            if (obj != null) {
                Reflect.on(obj).call("onColdStartFinish");
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: c */
    public void mo246404c() {
        if (C70011d.m268581a().loggerDebug()) {
            C70011d.m268581a().loggerD("CronetAppProviderManager", "onCronetBootSucceed ");
        }
        try {
            Object obj = this.f174989b;
            if (obj != null) {
                Reflect.on(obj).call("onCronetBootSucceed");
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: d */
    private String m268521d(String str) {
        try {
            Object obj = this.f174989b;
            if (obj == null) {
                return "";
            }
            return (String) Reflect.on(obj).call(str).get();
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    /* renamed from: c */
    public void mo246405c(String str) {
        try {
            Object obj = this.f174989b;
            if (obj != null) {
                Reflect.on(obj).call("doLoadLibrary", new Class[]{String.class}, str);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: b */
    public void mo246402b(String str) {
        if (C70011d.m268581a().loggerDebug()) {
            C70011d.m268581a().loggerD("CronetAppProviderManager", "onClientIPChanged ");
        }
        try {
            Object obj = this.f174989b;
            if (obj != null) {
                Reflect.on(obj).call("onClientIPChanged", new Class[]{String.class}, str);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo246389a(int i) {
        if (C70011d.m268581a().loggerDebug()) {
            C70011d a = C70011d.m268581a();
            a.loggerD("CronetAppProviderManager", "onEffectiveConnectionTypeChanged type = " + i);
        }
        try {
            Object obj = this.f174989b;
            if (obj != null) {
                Reflect.on(obj).call("onEffectiveConnectionTypeChanged", new Class[]{Integer.TYPE}, Integer.valueOf(i));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public Map<String, String> mo246388a(String str, Map<String, String> map) {
        if (C70011d.m268581a().loggerDebug()) {
            C70011d a = C70011d.m268581a();
            a.loggerD("CronetAppProviderManager", "onCallToAddSecurityFactor info url = " + str);
        }
        try {
            Object obj = this.f174989b;
            if (obj == null) {
                return null;
            }
            return (Map) Reflect.on(obj).call("onCallToAddSecurityFactor", new Class[]{String.class, Map.class}, str, map).get();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public void mo246403b(String str, String str2) {
        if (C70011d.m268581a().loggerDebug()) {
            C70011d a = C70011d.m268581a();
            a.loggerD("CronetAppProviderManager", "onServerConfigUpdated json = " + str);
        }
        try {
            Object obj = this.f174989b;
            if (obj != null) {
                Reflect.on(obj).call("onServerConfigEtagChanged", new Class[]{String.class}, str2);
                Reflect.on(this.f174989b).call("onServerConfigUpdated", new Class[]{String.class}, str);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo246391a(int i, int i2) {
        if (C70011d.m268581a().loggerDebug()) {
            C70011d a = C70011d.m268581a();
            a.loggerD("CronetAppProviderManager", "onMultiNetworkStateChanged, prev state = " + i + ", curr state = " + i2);
        }
        try {
            Object obj = this.f174989b;
            if (obj != null) {
                Reflect.on(obj).call("onMultiNetworkStateChanged", new Class[]{Integer.TYPE, Integer.TYPE}, Integer.valueOf(i), Integer.valueOf(i2)).get();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo246392a(int i, int i2, int i3) {
        if (C70011d.m268581a().loggerDebug()) {
            C70011d a = C70011d.m268581a();
            a.loggerD("CronetAppProviderManager", "onRTTOrThroughputEstimatesComputed httpRtt = " + i + ", transportRttMs = " + i2 + ",downstreamThroughputKbps = " + i3);
        }
        try {
            Object obj = this.f174989b;
            if (obj != null) {
                Reflect.on(obj).call("onRTTOrThroughputEstimatesComputed", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo246390a(int i, double d, double d2, double d3, double d4) {
        if (C70011d.m268581a().loggerDebug()) {
            C70011d a = C70011d.m268581a();
            a.loggerD("CronetAppProviderManager", "onPacketLossComputed protocol = " + i + ", upstreamLossRate = " + d + ", upstreamLossRateVariance = " + d2 + ", downstreamLossRate = " + d3 + ", downstreamLossRateVariance = " + d4);
        }
        try {
            Object obj = this.f174989b;
            if (obj != null) {
                Reflect.on(obj).call("onPacketLossComputed", new Class[]{Integer.TYPE, Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE}, Integer.valueOf(i), Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
