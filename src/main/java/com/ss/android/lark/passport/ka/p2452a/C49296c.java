package com.ss.android.lark.passport.ka.p2452a;

import android.text.TextUtils;
import com.ss.android.lark.http.p1953b.C38760a;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.C49194j;
import com.ss.android.lark.passport.ka.C49288a;
import com.ss.android.lark.passport.ka.model.InnerIdentify;
import com.ss.android.lark.passport.ka.model.KaIdentity;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49392e;
import com.ss.android.lark.util.share_preference.C57744a;

/* renamed from: com.ss.android.lark.passport.ka.a.c */
public class C49296c {

    /* renamed from: a */
    private static C49296c f123751a;

    /* renamed from: d */
    public String mo171918d() {
        return mo171906a("KEY_KA_CONIG_IDP_TYPE");
    }

    /* renamed from: f */
    public String mo171921f() {
        return mo171906a("KEY_EXTRA_URL");
    }

    private C49296c() {
        C49194j.m193951a(true, new AbstractC49392e() {
            /* class com.ss.android.lark.passport.ka.p2452a.C49296c.C492971 */

            @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49392e
            /* renamed from: b */
            public void mo171342b(String str) {
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49392e
            /* renamed from: a */
            public void mo171341a(String str) {
                PassportLog a = PassportLog.f123351c.mo171474a();
                a.mo171465b("KaLoginManager", "encrypt deviceId=" + str);
            }
        });
    }

    /* renamed from: b */
    public KaIdentity mo171912b() {
        return (KaIdentity) C38760a.m153056a(mo171906a("KEY_EXTRA_IDINTITY"), KaIdentity.class);
    }

    /* renamed from: a */
    public static C49296c m194232a() {
        if (f123751a == null) {
            synchronized (C49296c.class) {
                if (f123751a == null) {
                    f123751a = new C49296c();
                }
            }
        }
        return f123751a;
    }

    /* renamed from: c */
    public String mo171916c() {
        return "KEY_KA_CONIG_" + mo171906a("KEY_KA_CONIG_IDP_TYPE");
    }

    /* renamed from: e */
    public String mo171920e() {
        return ServiceFinder.m193752g().getBuildPackageChannel(ServiceFinder.m193748c().getApplicationContext());
    }

    /* renamed from: b */
    public void mo171915b(String str) {
        mo171910a("KEY_KA_CONIG_IDP_TYPE", str);
    }

    /* renamed from: a */
    public <T> T mo171905a(Class<T> cls) {
        return (T) C38760a.m153056a(mo171906a(mo171916c()), cls);
    }

    /* renamed from: c */
    public void mo171917c(String str) {
        mo171910a(m194232a().mo171916c(), str);
    }

    /* renamed from: d */
    public void mo171919d(String str) {
        mo171910a("KEY_EXTRA_URL", str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo171906a(String str) {
        String b = mo171913b("ka", str, null);
        if (TextUtils.isEmpty(b)) {
            return mo171913b("ka_crc", str, null);
        }
        return b;
    }

    /* renamed from: a */
    public void mo171907a(InnerIdentify innerIdentify) {
        mo171910a("KEY_INNER_IDINTITY", C38760a.m153057a(innerIdentify));
    }

    /* renamed from: b */
    public void mo171914b(KaIdentity kaIdentity) {
        mo171910a("KEY_EXTRA_IDINTITY", C38760a.m153057a(kaIdentity));
    }

    /* renamed from: a */
    public void mo171908a(KaIdentity kaIdentity) {
        mo171910a("KEY_EXTRA_IDINTITY", C38760a.m153057a(kaIdentity));
    }

    /* renamed from: a */
    public void mo171910a(String str, String str2) {
        mo171911a("ka", str, str2);
    }

    /* renamed from: b */
    private String m194233b(String str, String str2) {
        return str + "_Signin_" + str2;
    }

    /* renamed from: a */
    public void mo171909a(String str, AbstractC49352d<String> dVar) {
        if (C49288a.m194203a().mo171895d() != null) {
            C49288a.m194203a().mo171895d().mo171961a(str, dVar);
        }
    }

    /* renamed from: b */
    public String mo171913b(String str, String str2, String str3) {
        return C57744a.m224104a().getString(m194233b(str, str2), str3);
    }

    /* renamed from: a */
    public void mo171911a(String str, String str2, String str3) {
        if (str3 == null) {
            C57744a.m224104a().remove(m194233b(str, str2));
        } else {
            C57744a.m224104a().putString(m194233b(str, str2), str3);
        }
    }
}
