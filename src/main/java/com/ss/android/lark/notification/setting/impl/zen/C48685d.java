package com.ss.android.lark.notification.setting.impl.zen;

import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.notification.dto.C48444c;
import com.ss.android.lark.notification.setting.impl.zen.C48675a;

/* renamed from: com.ss.android.lark.notification.setting.impl.zen.d */
public class C48685d extends BasePresenter<C48675a.AbstractC48676a, C48675a.AbstractC48678b, C48675a.AbstractC48678b.AbstractC48679a> {

    /* renamed from: a */
    public final ZenSettingSelectHandler f122412a;

    /* renamed from: b */
    private C48675a.AbstractC48676a.AbstractC48677a m191867b() {
        return new C48675a.AbstractC48676a.AbstractC48677a() {
            /* class com.ss.android.lark.notification.setting.impl.zen.C48685d.C486861 */

            @Override // com.ss.android.lark.notification.setting.impl.zen.C48675a.AbstractC48676a.AbstractC48677a
            /* renamed from: a */
            public void mo169895a(final C48444c cVar) {
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.notification.setting.impl.zen.C48685d.C486861.RunnableC486871 */

                    public void run() {
                        ((C48675a.AbstractC48678b) C48685d.this.getView()).mo169870a(cVar);
                    }
                });
            }
        };
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C48675a.AbstractC48678b.AbstractC48679a createViewDelegate() {
        return new C48675a.AbstractC48678b.AbstractC48679a() {
            /* class com.ss.android.lark.notification.setting.impl.zen.C48685d.C486882 */

            @Override // com.ss.android.lark.notification.setting.impl.zen.C48675a.AbstractC48678b.AbstractC48679a
            /* renamed from: a */
            public void mo169896a() {
                C48685d.this.f122412a.mo169906c();
            }

            @Override // com.ss.android.lark.notification.setting.impl.zen.C48675a.AbstractC48678b.AbstractC48679a
            /* renamed from: a */
            public void mo169897a(long j, String str) {
                C48685d.this.f122412a.mo169903a(Long.valueOf(j), str);
            }
        };
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        this.f122412a.mo169907d();
    }

    public C48685d(C48675a.AbstractC48676a aVar, C48675a.AbstractC48678b bVar) {
        super(aVar, bVar);
        aVar.mo169891a(m191867b());
        this.f122412a = new ZenSettingSelectHandler(aVar, bVar);
    }
}
