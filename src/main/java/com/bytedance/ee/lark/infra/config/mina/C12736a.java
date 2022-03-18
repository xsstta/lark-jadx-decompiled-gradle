package com.bytedance.ee.lark.infra.config.mina;

import android.content.Context;
import com.bytedance.ee.lark.infra.config.mina.C12740b;
import com.bytedance.ee.lark.infra.config.mina.p614a.C12739b;
import com.bytedance.ee.lark.infra.config.mina.p615b.AbstractC12742a;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.AbstractC12790g;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.ee.lark.infra.config.mina.a */
public class C12736a {

    /* renamed from: b */
    private static final AbstractC12790g<C12736a> f34101b = new AbstractC12790g<C12736a>() {
        /* class com.bytedance.ee.lark.infra.config.mina.C12736a.C127371 */

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C12736a mo48227b(Context... contextArr) {
            return new C12736a();
        }
    };

    /* renamed from: a */
    private AtomicBoolean f34102a;

    private C12736a() {
        this.f34102a = new AtomicBoolean(false);
    }

    /* renamed from: a */
    public static final C12736a m52718a() {
        return f34101b.mo48348c(new Context[0]);
    }

    /* renamed from: a */
    public void mo48225a(Context context, AbstractC12742a aVar) {
        if (this.f34102a.get()) {
            AppBrandLogger.m52830i("AppBrandSettingsManager", "initSettingManager already init!");
            return;
        }
        C12739b.m52731a(new C12740b.C12741a().mo48228a(context).mo48229a(aVar).mo48230a());
        this.f34102a.compareAndSet(false, true);
    }
}
