package com.ss.android.lark.notification.setting.impl.p2391a;

import android.content.Context;
import android.view.View;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.framework.utils.C26323w;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.notification.C48398a;
import com.ss.android.lark.notification.C48405b;
import com.ss.android.lark.notification.setting.impl.p2391a.AbstractC48571a;

/* renamed from: com.ss.android.lark.notification.setting.impl.a.d */
public class C48578d extends BasePresenter<AbstractC48571a.AbstractC48572a, AbstractC48571a.AbstractC48573b, AbstractC48571a.AbstractC48573b.AbstractC48574a> {

    /* renamed from: a */
    public final Context f122214a;

    /* renamed from: d */
    public void mo169666d() {
        m191488e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC48571a.AbstractC48573b.AbstractC48574a createViewDelegate() {
        return new AbstractC48571a.AbstractC48573b.AbstractC48574a() {
            /* class com.ss.android.lark.notification.setting.impl.p2391a.C48578d.C485791 */

            @Override // com.ss.android.lark.notification.setting.impl.p2391a.AbstractC48571a.AbstractC48573b.AbstractC48574a
            /* renamed from: b */
            public void mo169660b() {
                C48405b.m190969a(C48578d.this.f122214a, false);
            }

            @Override // com.ss.android.lark.notification.setting.impl.p2391a.AbstractC48571a.AbstractC48573b.AbstractC48574a
            /* renamed from: a */
            public void mo169658a() {
                if (DesktopUtil.m144301a(C48578d.this.f122214a)) {
                    C26323w.m95329b(C48578d.this.f122214a, 268435456);
                } else {
                    C26323w.m95328b(C48578d.this.f122214a);
                }
            }

            @Override // com.ss.android.lark.notification.setting.impl.p2391a.AbstractC48571a.AbstractC48573b.AbstractC48574a
            /* renamed from: a */
            public void mo169659a(String str) {
                C48398a.m190922a().mo169353p().mo169364a(C48578d.this.f122214a, str, true);
            }
        };
    }

    /* renamed from: c */
    public void mo169665c() {
        m191489f();
        m191488e();
    }

    /* renamed from: b */
    public View mo169664b() {
        return ((AbstractC48571a.AbstractC48573b) getView()).mo169654a();
    }

    /* renamed from: e */
    private void m191488e() {
        ((AbstractC48571a.AbstractC48573b) getView()).mo169655a(((AbstractC48571a.AbstractC48572a) getModel()).mo169652a());
    }

    /* renamed from: f */
    private void m191489f() {
        boolean a = ((AbstractC48571a.AbstractC48572a) getModel()).mo169653a(this.f122214a);
        ((AbstractC48571a.AbstractC48573b) getView()).mo169656a(a);
        if (DesktopUtil.m144301a(this.f122214a) && !a) {
            ((AbstractC48571a.AbstractC48573b) getView()).mo169657b();
        }
    }

    public C48578d(Context context, AbstractC48571a.AbstractC48572a aVar, AbstractC48571a.AbstractC48573b bVar) {
        super(aVar, bVar);
        this.f122214a = context;
    }
}
