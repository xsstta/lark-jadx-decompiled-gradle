package com.ss.android.lark.safetynet.inhouse.p2580b;

import android.content.Context;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.safetynet.inhouse.C53215a;
import com.ss.sys.ces.out.ISdk;
import com.ss.sys.ces.out.StcSDKFactory;

/* renamed from: com.ss.android.lark.safetynet.inhouse.b.a */
public class C53220a {

    /* renamed from: a */
    private ISdk f131557a;

    /* renamed from: b */
    private boolean f131558b;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.safetynet.inhouse.b.a$a */
    public static class C53222a {

        /* renamed from: a */
        public static final C53220a f131559a = new C53220a();
    }

    private C53220a() {
    }

    /* renamed from: a */
    public static C53220a m205864a() {
        return C53222a.f131559a;
    }

    /* renamed from: c */
    public boolean mo181676c() {
        ISdk iSdk = this.f131557a;
        if (iSdk != null) {
            return iSdk.checkSign();
        }
        return true;
    }

    /* renamed from: b */
    public void mo181675b() {
        int d = C53215a.m205848a().mo178249d();
        boolean e = C53215a.m205848a().mo178250e();
        Context c = C53215a.m205848a().mo178248c();
        if (e) {
            d = 1128;
        }
        this.f131557a = StcSDKFactory.getSDK(c, (long) d);
    }

    /* renamed from: d */
    private boolean m205865d() {
        if (this.f131558b) {
            return true;
        }
        if (this.f131557a == null) {
            return false;
        }
        String a = C53215a.m205848a().mo178245a();
        if (a.equals("unknown")) {
            Log.m165383e("SafetyNetInhouseManager", "get sec_sdk host failed: host is unknown");
            return false;
        }
        String str = "https://" + a + "/device/sdk";
        this.f131557a.setUrlInterface(1025, str);
        this.f131557a.setUrlInterface(1026, str);
        this.f131558b = true;
        return true;
    }

    /* renamed from: a */
    public void mo181673a(String str) {
        mo181674a(str, null);
    }

    /* renamed from: a */
    public void mo181674a(String str, String str2) {
        if (this.f131557a != null && m205865d()) {
            this.f131557a.setParams(str, str2);
        }
    }
}
