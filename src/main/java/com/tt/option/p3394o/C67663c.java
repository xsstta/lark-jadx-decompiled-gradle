package com.tt.option.p3394o;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.suite.R;
import com.tt.miniapp.jsbridge.C66236a;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.util.AppbrandUtil;
import com.tt.miniapphost.util.C67590h;

/* renamed from: com.tt.option.o.c */
public class C67663c {

    /* renamed from: a */
    private String f170494a;

    /* renamed from: b */
    private String f170495b;

    /* renamed from: c */
    private String f170496c;

    /* renamed from: d */
    private String f170497d;

    /* renamed from: e */
    private String f170498e;

    /* renamed from: f */
    private String f170499f;

    /* renamed from: g */
    private String f170500g;

    /* renamed from: h */
    private String f170501h;

    /* renamed from: i */
    private String f170502i;

    /* renamed from: j */
    private String f170503j;

    /* renamed from: a */
    public String mo234916a() {
        return this.f170495b;
    }

    /* renamed from: b */
    public String mo234917b() {
        return this.f170496c;
    }

    /* renamed from: c */
    public String mo234918c() {
        return this.f170497d;
    }

    /* renamed from: d */
    public String mo234919d() {
        return this.f170498e;
    }

    /* renamed from: e */
    public String mo234920e() {
        return this.f170499f;
    }

    /* renamed from: f */
    public String mo234921f() {
        return this.f170500g;
    }

    /* renamed from: g */
    public String mo234922g() {
        return this.f170501h;
    }

    /* renamed from: h */
    public String mo234923h() {
        return this.f170502i;
    }

    /* renamed from: i */
    public String mo234924i() {
        return this.f170503j;
    }

    /* renamed from: j */
    public String mo234925j() {
        return this.f170494a;
    }

    /* renamed from: com.tt.option.o.c$a */
    public static final class C67665a {

        /* renamed from: a */
        public String f170504a = C67590h.m263073a((int) R.string.LittleApp_UserInfoPermission_PermissionName);

        /* renamed from: b */
        public String f170505b = C67590h.m263073a((int) R.string.microapp_m_acquire_geo_info);

        /* renamed from: c */
        public String f170506c = C67590h.m263073a((int) R.string.microapp_m_acquire_microphone);

        /* renamed from: d */
        public String f170507d = C67590h.m263073a((int) R.string.microapp_m_acquire_camera);

        /* renamed from: e */
        public String f170508e = C67590h.m263073a((int) R.string.microapp_m_acquire_album);

        /* renamed from: f */
        public String f170509f = C67590h.m263073a((int) R.string.microapp_m_acquire_your_receive_address);

        /* renamed from: g */
        public String f170510g = (AppbrandUtil.getApplicationName(AppbrandContext.getInst().getApplicationContext()) + C67590h.m263073a((int) R.string.microapp_m_acquire_your_binding_phonenum));

        /* renamed from: h */
        public String f170511h = C67590h.m263073a((int) R.string.LittleApp_GadgetAndriod_PermissionName_Clipboard);

        /* renamed from: i */
        public String f170512i = C67590h.m263073a((int) R.string.OpenPlatform_AppCenter_BadgeTab);

        /* renamed from: j */
        public String f170513j = C67590h.m263073a((int) R.string.LittleApp_StepsApi_ScopeNameDetail);

        /* renamed from: a */
        public C67665a mo234926a(String str) {
            this.f170504a = str;
            return this;
        }

        /* renamed from: b */
        public C67665a mo234928b(String str) {
            this.f170505b = str;
            return this;
        }

        /* renamed from: c */
        public C67665a mo234929c(String str) {
            this.f170506c = str;
            return this;
        }

        /* renamed from: d */
        public C67665a mo234930d(String str) {
            this.f170507d = str;
            return this;
        }

        /* renamed from: e */
        public C67665a mo234931e(String str) {
            this.f170508e = str;
            return this;
        }

        /* renamed from: f */
        public C67665a mo234932f(String str) {
            this.f170509f = str;
            return this;
        }

        /* renamed from: g */
        public C67665a mo234933g(String str) {
            this.f170511h = str;
            return this;
        }

        /* renamed from: h */
        public C67665a mo234934h(String str) {
            this.f170512i = str;
            return this;
        }

        /* renamed from: i */
        public C67665a mo234935i(String str) {
            this.f170513j = str;
            return this;
        }

        /* renamed from: a */
        public C67663c mo234927a(IAppContext iAppContext) {
            return new C67663c(this, iAppContext);
        }
    }

    private C67663c(C67665a aVar, IAppContext iAppContext) {
        this.f170495b = aVar.f170504a;
        this.f170496c = aVar.f170505b;
        this.f170497d = aVar.f170506c;
        this.f170498e = aVar.f170507d;
        this.f170499f = aVar.f170508e;
        this.f170500g = aVar.f170509f;
        if (C66236a.m259221a(iAppContext)) {
            this.f170501h = C67590h.m263073a((int) R.string.microapp_m_acquire_your_phonenum);
        } else {
            this.f170501h = aVar.f170510g;
        }
        this.f170502i = aVar.f170511h;
        this.f170503j = aVar.f170512i;
        this.f170494a = aVar.f170513j;
    }
}
