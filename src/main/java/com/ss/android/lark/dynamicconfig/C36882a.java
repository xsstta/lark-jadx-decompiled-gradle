package com.ss.android.lark.dynamicconfig;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.ss.android.lark.dynamicconfig.manis.DynamicHostProxy;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.LarkContext;
import ee.android.framework.manis.C68183b;

/* renamed from: com.ss.android.lark.dynamicconfig.a */
public class C36882a {
    /* renamed from: e */
    public static String m145561e() {
        return DynamicConfigModule.m145551a(DomainSettings.Alias.SUITE_MAIN_DOMAIN);
    }

    /* renamed from: h */
    public static String m145564h() {
        return DynamicConfigModule.m145551a(DomainSettings.Alias.DOCS_MAIN_DOMAIN);
    }

    /* renamed from: a */
    public static String m145556a() {
        return "https://" + DynamicConfigModule.m145551a(DomainSettings.Alias.API);
    }

    /* renamed from: b */
    public static String m145558b() {
        return "https://" + DynamicConfigModule.m145551a(DomainSettings.Alias.PASSPORT);
    }

    /* renamed from: c */
    public static String m145559c() {
        return "https://" + DynamicConfigModule.m145552b().mo136165a("passport_accounts");
    }

    /* renamed from: d */
    public static String m145560d() {
        return "https://" + DynamicConfigModule.m145551a(DomainSettings.Alias.CJ_HONGBAO);
    }

    /* renamed from: g */
    public static String m145563g() {
        return "https://" + DynamicConfigModule.m145551a(DomainSettings.Alias.OPEN);
    }

    /* renamed from: f */
    public static String m145562f() {
        DynamicHostProxy dynamicHostProxy = (DynamicHostProxy) C68183b.m264839a().mo237086a(LarkContext.getApplication(), DynamicHostProxy.class);
        if (dynamicHostProxy != null) {
            return dynamicHostProxy.getMainDomain();
        }
        Log.m165397w("DynamicHostProvider", "mainDomainMultiProcess failed, will return normal mainDomain");
        return m145561e();
    }

    /* renamed from: i */
    public static String m145565i() {
        DynamicHostProxy dynamicHostProxy = (DynamicHostProxy) C68183b.m264839a().mo237086a(LarkContext.getApplication(), DynamicHostProxy.class);
        if (dynamicHostProxy != null) {
            return dynamicHostProxy.getDocMainDomain();
        }
        Log.m165397w("DynamicHostProvider", "docMainDomainMultiProcess failed, will return normal docMainDomain");
        return m145564h();
    }

    /* renamed from: a */
    public static String m145557a(String str) {
        String h = m145564h();
        if (h.split("\\.").length >= 3 || TextUtils.isEmpty(str)) {
            return h;
        }
        return str + '.' + h;
    }
}
