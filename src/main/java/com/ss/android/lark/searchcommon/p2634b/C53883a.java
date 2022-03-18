package com.ss.android.lark.searchcommon.p2634b;

import com.larksuite.framework.utils.C26253ae;
import com.ss.android.lark.utils.C57782ag;
import java.io.File;

/* renamed from: com.ss.android.lark.searchcommon.b.a */
public class C53883a {

    /* renamed from: a */
    private String f133140a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.searchcommon.b.a$a */
    public static final class C53885a {

        /* renamed from: a */
        public static final C53883a f133141a = new C53883a();
    }

    /* renamed from: a */
    public static C53883a m208794a() {
        return C53885a.f133141a;
    }

    /* renamed from: c */
    public void mo183800c() {
        this.f133140a = m208795d();
    }

    private C53883a() {
        this.f133140a = m208795d();
    }

    /* renamed from: b */
    public String mo183799b() {
        if (C57782ag.m224241a(this.f133140a)) {
            return m208795d();
        }
        return this.f133140a;
    }

    /* renamed from: d */
    private String m208795d() {
        return System.currentTimeMillis() + File.separator + C26253ae.m94997a();
    }
}
