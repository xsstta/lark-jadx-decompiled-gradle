package com.ss.android.lark.larkconfig.userconfig;

import com.bytedance.lark.pb.basic.v1.AppConfig;
import com.ss.android.lark.biz.core.api.C29550b;
import com.ss.android.lark.larkconfig.userconfig.p2118a.AbstractC41220a;

/* renamed from: com.ss.android.lark.larkconfig.userconfig.c */
public class C41222c {

    /* renamed from: a */
    private static volatile AbstractC41220a f104996a;

    /* renamed from: a */
    public static AbstractC41220a m163478a() {
        return f104996a;
    }

    /* renamed from: b */
    public void mo148568b() {
        mo148569c().mo148566g();
    }

    /* renamed from: c */
    public AbstractC41238h mo148569c() {
        return new C41221b();
    }

    /* renamed from: d */
    public boolean mo148570d() {
        C29550b d = C41227e.m163488a().mo148583d();
        if (d == null || d.mo105658m() != AppConfig.CryptoChatState.ALLOW.getValue()) {
            return false;
        }
        return true;
    }

    public C41222c(AbstractC41220a aVar) {
        f104996a = aVar;
    }
}
