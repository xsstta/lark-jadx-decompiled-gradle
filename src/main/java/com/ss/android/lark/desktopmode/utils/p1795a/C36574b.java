package com.ss.android.lark.desktopmode.utils.p1795a;

import com.larksuite.framework.utils.RomUtils;

/* renamed from: com.ss.android.lark.desktopmode.utils.a.b */
public class C36574b {

    /* renamed from: a */
    private AbstractC36577c f94142a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.desktopmode.utils.a.b$a */
    public static class C36576a {

        /* renamed from: a */
        static final C36574b f94143a = new C36574b();
    }

    /* renamed from: a */
    public static C36574b m144312a() {
        return C36576a.f94143a;
    }

    /* renamed from: b */
    public String mo134971b() {
        return this.f94142a.mo134970a();
    }

    private C36574b() {
        if (RomUtils.m94953h()) {
            this.f94142a = new C36579e();
        } else if (RomUtils.m94950f()) {
            this.f94142a = new C36578d();
        } else {
            this.f94142a = new C36573a();
        }
    }
}
