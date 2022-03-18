package com.ss.android.lark.passport.env;

import android.app.Application;
import android.text.TextUtils;
import com.larksuite.framework.utils.C26284k;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.env.p2419a.C49001c;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.env.HostEnvBean;
import com.ss.android.lark.utils.LarkContext;

/* renamed from: com.ss.android.lark.passport.env.a */
public class C48998a {

    /* renamed from: a */
    public static C48998a f123026a = null;

    /* renamed from: b */
    private static String f123027b = "EnvModuleExport";

    /* renamed from: b */
    public void mo171067b() {
    }

    /* renamed from: c */
    public void mo171068c() {
    }

    /* renamed from: f */
    public String mo171071f() {
        return "eu_ea";
    }

    /* renamed from: g */
    public String mo171072g() {
        return "boeva";
    }

    /* renamed from: h */
    public String mo171073h() {
        return "eu_nc";
    }

    /* renamed from: i */
    public String mo171074i() {
        return "boecn";
    }

    /* renamed from: e */
    public HostEnvBean mo171070e() {
        return C49001c.m192988c();
    }

    /* renamed from: a */
    public boolean mo171066a() {
        HostEnvBean c = C49001c.m192988c();
        if (c.isStdLark != null) {
            return c.isStdLark.booleanValue();
        }
        if (c.passportConfigEnv != null) {
            return c.passportConfigEnv.booleanValue();
        }
        return ServiceFinder.m193748c().isLarkPackage();
    }

    /* renamed from: d */
    public String mo171069d() {
        String b = C49001c.m192986b();
        if (TextUtils.isEmpty(b)) {
            Application application = LarkContext.getApplication();
            if (C26284k.m95186b(application) || C26284k.m95185a(application)) {
                b = ServiceFinder.m193748c().getDebugUnit();
                String str = f123027b;
                Log.m165389i(str, "error!!!, getUserUnit is null, return UserUnit with debug unit: " + b);
            } else {
                if (ServiceFinder.m193748c().isLarkPackage()) {
                    b = mo171071f();
                } else {
                    b = mo171073h();
                }
                String str2 = f123027b;
                Log.m165383e(str2, "error!!!, getUserUnit is null, return UserUnit with package: " + b);
            }
        }
        String str3 = f123027b;
        Log.m165379d(str3, "getUserUnit(): " + b);
        return b;
    }

    /* renamed from: a */
    public void mo171062a(AbstractC49352d<String> dVar) {
        C49001c.m192983a(dVar);
        ServiceFinder.m193752g().onHostEnvClear();
    }

    /* renamed from: a */
    public void mo171064a(Boolean bool) {
        HostEnvBean e = mo171070e();
        e.isStdLark = bool;
        C49001c.m192985a(e, false, null);
    }

    /* renamed from: a */
    public void mo171063a(HostEnvBean hostEnvBean, AbstractC49352d<String> dVar) {
        C49001c.m192984a(hostEnvBean, dVar);
    }

    /* renamed from: a */
    public void mo171065a(String str, AbstractC49352d<String> dVar) {
        HostEnvBean e = mo171070e();
        e.userUnit = str;
        C49001c.m192985a(e, true, dVar);
    }
}
