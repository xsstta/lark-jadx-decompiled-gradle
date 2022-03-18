package com.tt.remotedebug;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;

/* renamed from: com.tt.remotedebug.a */
public class C67949a {

    /* renamed from: a */
    private boolean f171193a;

    /* renamed from: b */
    private String f171194b;

    /* renamed from: com.tt.remotedebug.a$a */
    public static class C67950a {

        /* renamed from: a */
        static C67949a f171195a = new C67949a();
    }

    /* renamed from: b */
    public static C67949a m264516b() {
        return C67950a.f171195a;
    }

    /* renamed from: a */
    public String mo235812a() {
        return this.f171194b;
    }

    /* renamed from: c */
    public boolean mo235814c() {
        return this.f171193a;
    }

    /* renamed from: a */
    public void mo235813a(String str) {
        if (!TextUtils.isEmpty(str)) {
            String uri = Uri.parse(str).buildUpon().appendQueryParameter("from", "for_device_debug").appendQueryParameter("platform", "android").build().toString();
            AppBrandLogger.m52828d("VscDebugManager", "skUrl is: " + uri);
            this.f171193a = true;
            this.f171194b = uri;
            return;
        }
        AppBrandLogger.m52829e("VscDebugManager", "skUrl is empty");
    }
}
