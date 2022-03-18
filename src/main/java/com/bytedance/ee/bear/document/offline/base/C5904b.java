package com.bytedance.ee.bear.document.offline.base;

import android.content.Context;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.p276c.C4969a;
import com.bytedance.ee.bear.thread.C11674a;
import com.bytedance.ee.eenet.httpclient.AbstractC12625f;
import com.bytedance.ee.eenet.httpclient.C12617b;
import com.huawei.hms.android.HwBuildEx;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import okhttp3.Dispatcher;

/* renamed from: com.bytedance.ee.bear.document.offline.base.b */
public class C5904b {

    /* renamed from: a */
    private static AbstractC12625f f16534a;

    /* renamed from: b */
    private final Context f16535b;

    /* renamed from: c */
    private final ConnectionService f16536c;

    /* renamed from: d */
    private C5913h f16537d;

    /* renamed from: b */
    private int m23780b() {
        boolean z = true;
        if (this.f16536c.mo20038b().mo20040a() != 1) {
            z = false;
        }
        if (z) {
            return HwBuildEx.VersionCodes.CUR_DEVELOPMENT;
        }
        return 20000;
    }

    /* renamed from: a */
    public AbstractC12625f mo23870a() {
        if (f16534a == null) {
            ExecutorService b = new C11674a().mo44758b("fetch");
            this.f16537d = new C5913h(C4969a.m20606a());
            f16534a = C12617b.m52365c().mo47928a().mo47915a((long) m23780b(), TimeUnit.MILLISECONDS).mo47920b((long) m23780b(), TimeUnit.MILLISECONDS).mo47917a(new Dispatcher(b)).mo47916a(this.f16537d).mo47919a();
        }
        return f16534a;
    }

    public C5904b(Context context, ConnectionService connectionService) {
        this.f16535b = context;
        this.f16536c = connectionService;
    }
}
