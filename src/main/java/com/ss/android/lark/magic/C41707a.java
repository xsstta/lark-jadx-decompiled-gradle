package com.ss.android.lark.magic;

import com.ss.android.lark.biz.core.api.AbstractC29588w;
import com.ss.android.lark.biz.core.api.MagicViewContainer;
import com.ss.android.lark.biz.core.api.magic.IMagicLifecycleListener;
import com.ss.android.lark.magic.p2152b.AbstractC41708a;
import com.ss.android.lark.magic.service.MagicService;
import java.util.Map;

/* renamed from: com.ss.android.lark.magic.a */
public class C41707a {

    /* renamed from: a */
    private static volatile AbstractC41708a f105926a;

    /* renamed from: b */
    private boolean f105927b;

    /* renamed from: b */
    public static AbstractC41708a m165544b() {
        return f105926a;
    }

    /* renamed from: c */
    private boolean m165545c() {
        return !this.f105927b;
    }

    /* renamed from: d */
    private boolean m165546d() {
        return f105926a.mo150009l().mo150011a("lark.magic.enable");
    }

    /* renamed from: a */
    public void mo149982a() {
        boolean d = m165546d();
        this.f105927b = d;
        if (d) {
            MagicService.m165661b().mo150061a();
        }
    }

    public C41707a(AbstractC41708a aVar) {
        f105926a = aVar;
    }

    /* renamed from: b */
    public void mo149986b(String str) {
        if (!m165545c()) {
            MagicService.m165661b().mo150066b(str);
        }
    }

    /* renamed from: a */
    public void mo149983a(String str) {
        if (!m165545c()) {
            MagicService.m165661b().mo150062a(str);
        }
    }

    /* renamed from: a */
    public void mo149984a(String str, IMagicLifecycleListener bVar) {
        if (!m165545c()) {
            MagicService.m165661b().mo150064a(str, bVar);
        }
    }

    /* renamed from: a */
    public void mo149985a(String str, Map<String, String> map, MagicViewContainer awVar, AbstractC29588w wVar) {
        if (!m165545c()) {
            MagicService.m165661b().mo150063a(str, awVar, wVar);
        }
    }
}
