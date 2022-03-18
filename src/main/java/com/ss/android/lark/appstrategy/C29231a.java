package com.ss.android.lark.appstrategy;

import com.bytedance.ee.appstrategy.C4151c;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.appstrategy.p1374a.AbstractC29232a;
import com.ss.android.lark.appstrategy.service.AbstractC29242a;
import com.ss.android.lark.appstrategy.service.AbstractC29245b;
import com.ss.android.lark.appstrategy.service.impl.C29252a;
import com.ss.android.lark.appstrategy.service.impl.C29264b;
import com.ss.android.lark.utils.ApiUtils;

/* renamed from: com.ss.android.lark.appstrategy.a */
public class C29231a {
    /* access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ void m107508g() {
        C29252a.m107549c().mo103725e();
    }

    /* renamed from: b */
    public AbstractC29242a mo103647b() {
        return C29252a.m107549c();
    }

    /* renamed from: c */
    public AbstractC29245b mo103648c() {
        return C29264b.m107591a();
    }

    /* renamed from: e */
    public void mo103650e() {
        C29252a.m107549c().mo103724d();
    }

    /* renamed from: f */
    public void mo103651f() {
        C29252a.m107549c().mo103726f();
    }

    public C29231a() {
        C4151c.m17255a(m107507a().getLocale());
    }

    /* renamed from: a */
    public static AbstractC29232a m107507a() {
        return (AbstractC29232a) ApiUtils.getApi(AbstractC29232a.class);
    }

    /* renamed from: d */
    public void mo103649d() {
        CoreThreadPool.getBackgroundHandler().post($$Lambda$a$sbXt1JI8LtQ7adV85DikZGRHzDw.INSTANCE);
    }
}
