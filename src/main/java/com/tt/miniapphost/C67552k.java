package com.tt.miniapphost;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.manager.p3302a.C66399c;
import com.tt.miniapphost.data.ContextSingletonInstance;

/* renamed from: com.tt.miniapphost.k */
public class C67552k {

    /* renamed from: com.tt.miniapphost.k$a */
    public static class C67553a {

        /* renamed from: a */
        public String f170360a;

        /* renamed from: b */
        public String f170361b;

        /* renamed from: c */
        public int f170362c;

        /* renamed from: d */
        public String f170363d;

        /* renamed from: e */
        public String f170364e;

        /* renamed from: f */
        public String f170365f;

        /* renamed from: g */
        public String f170366g;
    }

    /* renamed from: b */
    public static int m262721b() {
        C67553a aVar = ContextSingletonInstance.getInstance().sdkParamInstance;
        if (aVar.f170362c == 0 && AppbrandContext.getInst().getBuildConfig() != null) {
            aVar.f170362c = AppbrandContext.getInst().getBuildConfig().mo234533a();
        }
        return aVar.f170362c;
    }

    /* renamed from: c */
    public static String m262722c() {
        C67553a aVar = ContextSingletonInstance.getInstance().sdkParamInstance;
        if (TextUtils.isEmpty(aVar.f170361b) && AppbrandContext.getInst().getBuildConfig() != null) {
            aVar.f170361b = AppbrandContext.getInst().getBuildConfig().mo234534b();
        }
        return aVar.f170361b;
    }

    /* renamed from: d */
    public static String m262723d() {
        C67553a aVar = ContextSingletonInstance.getInstance().sdkParamInstance;
        if (TextUtils.isEmpty(aVar.f170363d) && AppbrandContext.getInst().getBuildConfig() != null) {
            aVar.f170363d = AppbrandContext.getInst().getBuildConfig().mo234535c();
        }
        return aVar.f170363d;
    }

    /* renamed from: e */
    public static String m262724e() {
        C67553a aVar = ContextSingletonInstance.getInstance().sdkParamInstance;
        if (TextUtils.isEmpty(aVar.f170364e) && AppbrandContext.getInst().getBuildConfig() != null) {
            aVar.f170364e = AppbrandContext.getInst().getBuildConfig().mo234536d();
        }
        return aVar.f170364e;
    }

    /* renamed from: a */
    public static String m262718a() {
        C67553a aVar = ContextSingletonInstance.getInstance().sdkParamInstance;
        String c = m262722c();
        if (TextUtils.isEmpty(aVar.f170360a) && !TextUtils.isEmpty(c)) {
            String[] split = c.split("\\.");
            aVar.f170360a = split[0] + "." + split[1] + "." + split[2];
        }
        return aVar.f170360a;
    }

    /* renamed from: a */
    public static String m262719a(Context context) {
        C67553a aVar = ContextSingletonInstance.getInstance().sdkParamInstance;
        if (context == null) {
            return aVar.f170366g;
        }
        if (!TextUtils.isEmpty(aVar.f170366g)) {
            return aVar.f170366g;
        }
        C66399c a = C66399c.m259608a();
        if (a != null) {
            aVar.f170366g = a.mo231913a(context);
        }
        if (TextUtils.isEmpty(aVar.f170366g)) {
            aVar.f170366g = "null";
        }
        return aVar.f170366g;
    }

    /* renamed from: a */
    public static String m262720a(Context context, IAppContext iAppContext) {
        C67553a aVar = ContextSingletonInstance.getInstance().sdkParamInstance;
        if (context == null) {
            return aVar.f170365f;
        }
        if (!TextUtils.isEmpty(aVar.f170365f)) {
            return aVar.f170365f;
        }
        C66399c a = C66399c.m259608a();
        if (a != null) {
            aVar.f170365f = a.mo231922b(context, iAppContext);
        }
        return aVar.f170365f;
    }
}
