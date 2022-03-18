package com.ss.android.vc.common.p3083e;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.core.app.ActivityCompat;
import com.larksuite.framework.http.p1187b.AbstractC25990b;
import com.larksuite.framework.http.request.AbstractC26011b;
import com.larksuite.framework.http.request.C26010a;
import com.larksuite.framework.http.request.HttpMethod;
import com.larksuite.framework.http.request.RequestBody;
import com.larksuite.framework.http.response.BaseResponse;
import com.larksuite.framework.http.response.ErrorResult;
import com.ss.android.lark.http.netstate.NetworkUtils;
import com.ss.android.lark.integrator.p2018e.C39400a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pb.videochat.NetworkType;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.p3069b.C60686i;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

/* renamed from: com.ss.android.vc.common.e.x */
public class C60785x {
    /* renamed from: a */
    public static boolean m236237a() {
        return NetworkUtils.m153075h(ar.m236694a());
    }

    /* renamed from: b */
    public static boolean m236238b() {
        return NetworkUtils.m153070c(ar.m236694a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.common.e.x$2 */
    public static /* synthetic */ class C607872 {

        /* renamed from: a */
        static final /* synthetic */ int[] f151986a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.ss.android.lark.http.netstate.NetworkUtils$NetworkType[] r0 = com.ss.android.lark.http.netstate.NetworkUtils.NetworkType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.vc.common.p3083e.C60785x.C607872.f151986a = r0
                com.ss.android.lark.http.netstate.NetworkUtils$NetworkType r1 = com.ss.android.lark.http.netstate.NetworkUtils.NetworkType.WIFI     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.vc.common.p3083e.C60785x.C607872.f151986a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.http.netstate.NetworkUtils$NetworkType r1 = com.ss.android.lark.http.netstate.NetworkUtils.NetworkType.MOBILE_2G     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.vc.common.p3083e.C60785x.C607872.f151986a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.http.netstate.NetworkUtils$NetworkType r1 = com.ss.android.lark.http.netstate.NetworkUtils.NetworkType.MOBILE_3G     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.vc.common.p3083e.C60785x.C607872.f151986a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.http.netstate.NetworkUtils$NetworkType r1 = com.ss.android.lark.http.netstate.NetworkUtils.NetworkType.MOBILE_4G     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.vc.common.p3083e.C60785x.C607872.f151986a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.android.lark.http.netstate.NetworkUtils$NetworkType r1 = com.ss.android.lark.http.netstate.NetworkUtils.NetworkType.MOBILE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.common.p3083e.C60785x.C607872.<clinit>():void");
        }
    }

    /* renamed from: d */
    public static NetworkType m236240d() {
        int i = C607872.f151986a[NetworkUtils.m153071d(ar.m236694a()).ordinal()];
        if (i == 1) {
            return NetworkType.NetworkType_WIRELESS;
        }
        if (i == 2) {
            return NetworkType.NetworkType_2G;
        }
        if (i == 3) {
            return NetworkType.NetworkType_3G;
        }
        if (i == 4) {
            return NetworkType.NetworkType_4G;
        }
        if (i != 5) {
            return NetworkType.NetworkType_UNKNOWN;
        }
        if (m236241e()) {
            return NetworkType.NetworkType_5G;
        }
        return NetworkType.NetworkType_CELLULAR;
    }

    /* renamed from: e */
    private static boolean m236241e() {
        Context a = ar.m236694a();
        if (ActivityCompat.checkSelfPermission(a, "android.permission.READ_PHONE_STATE") == 0 && Build.VERSION.SDK_INT >= 29 && 20 == m236235a((TelephonyManager) a.getSystemService("phone"))) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static String m236239c() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                if (nextElement.getDisplayName().equals("wlan0") || nextElement.getDisplayName().equals("eth0")) {
                    Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress nextElement2 = inetAddresses.nextElement();
                        if ((nextElement2 instanceof Inet4Address) && !nextElement2.isLoopbackAddress()) {
                            return nextElement2.getHostAddress();
                        }
                    }
                    continue;
                }
            }
            return "127.0.0.1";
        } catch (Exception e) {
            e.printStackTrace();
            return "127.0.0.1";
        }
    }

    /* renamed from: a */
    public static int m236235a(TelephonyManager telephonyManager) {
        if (Build.VERSION.SDK_INT < 24) {
            return telephonyManager.getNetworkType();
        }
        try {
            C39400a.m155625a().mo143243a(LarkContext.getApplication());
            C39400a.m155625a().mo143245b(LarkContext.getApplication());
            if (C39400a.m155625a().mo143244b() != -1) {
                return C39400a.m155625a().mo143244b();
            }
            int networkType = telephonyManager.getNetworkType();
            C39400a.m155625a().mo143242a(networkType);
            Log.m165389i("TelephonyManagerLancetHook", "get network type from system");
            return networkType;
        } catch (Throwable th) {
            Log.m165386e("TelephonyManagerLancetHook", th);
            return telephonyManager.getNetworkType();
        }
    }

    /* renamed from: a */
    public static void m236236a(String str, String str2) {
        AbstractC25990b httpClient = VideoChatModuleDependency.getDependency().getHttpClient();
        C26010a aVar = new C26010a(HttpMethod.POST, str);
        aVar.mo92476b(new RequestBody("application/x-www-form-urlencoded", str2));
        httpClient.mo92412a(aVar).mo92408a(new AbstractC26011b<BaseResponse>() {
            /* class com.ss.android.vc.common.p3083e.C60785x.C607861 */

            /* renamed from: a */
            public void mo86434a(BaseResponse baseResponse) {
                C60686i.m235797a("VCNetworkUtils", "[sendPostRequest] success");
            }

            @Override // com.larksuite.framework.http.request.AbstractC26011b
            /* renamed from: a */
            public void mo86433a(ErrorResult errorResult) {
                C60686i.m235797a("VCNetworkUtils", "[sendPostRequest] error");
            }
        });
    }
}
