package com.ss.android.lark.passport.env.p2419a;

import android.content.Context;
import android.text.TextUtils;
import com.larksuite.framework.utils.C26284k;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.env.C48998a;
import com.ss.android.lark.passport.env.service.p2420a.C49003a;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.env.HostEnvBean;

/* renamed from: com.ss.android.lark.passport.env.a.c */
public class C49001c {

    /* renamed from: a */
    private static C48999a f123029a;

    /* renamed from: b */
    public static String m192986b() {
        return m192982a().mo171078c();
    }

    /* renamed from: c */
    public static HostEnvBean m192988c() {
        return m192982a().mo171075a();
    }

    /* renamed from: d */
    public static HostEnvBean m192989d() {
        return m192982a().mo171077b();
    }

    /* renamed from: a */
    public static C48999a m192982a() {
        if (f123029a == null) {
            synchronized (C48999a.class) {
                if (f123029a == null) {
                    f123029a = new C48999a();
                }
            }
        }
        return f123029a;
    }

    /* renamed from: e */
    public static boolean m192990e() {
        String d = C48998a.f123026a.mo171069d();
        if (ServiceFinder.m193748c().isLarkPackage()) {
            boolean equals = TextUtils.equals(d, C48998a.f123026a.mo171071f());
            boolean equals2 = TextUtils.equals(d, C48998a.f123026a.mo171072g());
            if (equals || equals2) {
                return true;
            }
            return false;
        }
        boolean equals3 = TextUtils.equals(d, C48998a.f123026a.mo171073h());
        boolean equals4 = TextUtils.equals(d, C48998a.f123026a.mo171074i());
        if (equals3 || equals4) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m192983a(AbstractC49352d<String> dVar) {
        m192982a().mo171079d();
        HostEnvBean cloneMe = m192989d().cloneMe();
        Context applicationContext = ServiceFinder.m193748c().getApplicationContext();
        if (C26284k.m95186b(applicationContext) || C26284k.m95185a(applicationContext)) {
            cloneMe.userUnit = ServiceFinder.m193748c().getDebugUnit();
            Log.m165389i("EnvUtils", "cleanAndRestEnv() use debugger unit option: " + cloneMe.userUnit);
        }
        m192985a(cloneMe, true, dVar);
    }

    /* renamed from: a */
    public static void m192984a(HostEnvBean hostEnvBean, AbstractC49352d<String> dVar) {
        m192985a(hostEnvBean, true, dVar);
    }

    /* renamed from: a */
    public static void m192985a(HostEnvBean hostEnvBean, boolean z, AbstractC49352d<String> dVar) {
        if (hostEnvBean == null || TextUtils.isEmpty(hostEnvBean.userUnit)) {
            Log.m165383e("EnvUtils", "new log: updateUnit bean is null");
            return;
        }
        Log.m165389i("EnvUtils", "new log: recoverEnv userUnit=" + hostEnvBean.userUnit);
        m192987b(hostEnvBean, z, dVar);
    }

    /* renamed from: b */
    private static void m192987b(HostEnvBean hostEnvBean, boolean z, AbstractC49352d<String> dVar) {
        String b = m192986b();
        m192982a().mo171076a(hostEnvBean);
        StringBuilder sb = new StringBuilder();
        sb.append("saveHostEnvWithRestart user unit change=");
        sb.append(!TextUtils.equals(b, hostEnvBean.userUnit));
        sb.append("; and notify others");
        Log.m165389i("EnvUtils", sb.toString());
        if (z) {
            new C49003a().mo171103a(hostEnvBean, dVar);
        }
    }
}
