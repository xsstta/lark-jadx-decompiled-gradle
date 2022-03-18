package com.ss.android.lark.platform.p2486g;

import android.text.TextUtils;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.dynamicconfig.DynamicConfigModule;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.util.share_preference.C57744a;

/* renamed from: com.ss.android.lark.platform.g.a */
public class C51808a {

    /* renamed from: a */
    private static volatile C51808a f128750a;

    private C51808a() {
    }

    /* renamed from: c */
    public void mo177931c() {
        CoreThreadPool.getDefault().getFixedThreadPool().execute($$Lambda$a$hLdH7UrlNTVSrYfYN_6EFxt1104.INSTANCE);
    }

    /* renamed from: a */
    public static C51808a m200830a() {
        if (f128750a == null) {
            synchronized (C51808a.class) {
                if (f128750a == null) {
                    f128750a = new C51808a();
                }
            }
        }
        return f128750a;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m200831d() {
        C57744a.m224104a().putString("npth_host_sp", DynamicConfigModule.m145552b().mo136165a("tt_npth"));
    }

    /* renamed from: b */
    public String mo177930b() {
        String string = C57744a.m224104a().getString("npth_host_sp", null);
        if (!TextUtils.isEmpty(string)) {
            Log.m165389i("CrashMonitorHostProvider", "load npth sdk host from cache");
            return string;
        }
        Log.m165389i("CrashMonitorHostProvider", "load npth sdk cache host failed");
        return DynamicConfigModule.m145552b().mo136165a("tt_npth");
    }
}
