package com.ss.android.lark.main.app.drawer;

import android.content.Context;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.main.C44134a;
import com.ss.android.lark.main.app.drawer.C44232c;
import com.ss.android.lark.main.interfaces.AbstractC44499a;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import java.util.List;

/* renamed from: com.ss.android.lark.main.app.drawer.b */
public class C44224b extends BasePresenter<C44232c.AbstractC44233a, C44232c.AbstractC44235b, C44232c.AbstractC44235b.AbstractC44236a> {

    /* renamed from: a */
    public volatile boolean f112205a;

    /* renamed from: b */
    public volatile int f112206b = 1;

    /* renamed from: c */
    public boolean f112207c;

    /* renamed from: d */
    private AbstractC44499a f112208d = new AbstractC44499a() {
        /* class com.ss.android.lark.main.app.drawer.C44224b.C442251 */

        @Override // com.ss.android.lark.main.interfaces.AbstractC44499a
        /* renamed from: a */
        public void mo157172a() {
            C44232c.AbstractC44235b bVar = (C44232c.AbstractC44235b) C44224b.this.getView();
            if (bVar != null) {
                bVar.mo157201d();
            }
        }
    };

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C44232c.AbstractC44235b.AbstractC44236a createViewDelegate() {
        return new C44232c.AbstractC44235b.AbstractC44236a() {
            /* class com.ss.android.lark.main.app.drawer.C44224b.C442262 */

            @Override // com.ss.android.lark.main.app.drawer.C44232c.AbstractC44235b.AbstractC44236a
            /* renamed from: b */
            public boolean mo157259b() {
                return ((C44232c.AbstractC44233a) C44224b.this.getModel()).mo157231c();
            }

            @Override // com.ss.android.lark.main.app.drawer.C44232c.AbstractC44235b.AbstractC44236a
            /* renamed from: c */
            public boolean mo157260c() {
                return ((C44232c.AbstractC44233a) C44224b.this.getModel()).mo157232d();
            }

            @Override // com.ss.android.lark.main.app.drawer.C44232c.AbstractC44235b.AbstractC44236a
            /* renamed from: a */
            public void mo157256a() {
                C44232c.AbstractC44233a aVar = (C44232c.AbstractC44233a) C44224b.this.getModel();
                if (aVar != null) {
                    aVar.mo157228a(true);
                }
                UICallbackExecutor.executeDelayed(new Runnable() {
                    /* class com.ss.android.lark.main.app.drawer.C44224b.C442262.RunnableC442271 */

                    public void run() {
                        C44232c.AbstractC44235b bVar = (C44232c.AbstractC44235b) C44224b.this.getView();
                        if (bVar != null && C44224b.this.f112206b == 0) {
                            bVar.mo157198a(true);
                        }
                    }
                }, 100);
            }

            @Override // com.ss.android.lark.main.app.drawer.C44232c.AbstractC44235b.AbstractC44236a
            /* renamed from: d */
            public String mo157261d() {
                TenantInfo e = ((C44232c.AbstractC44233a) C44224b.this.getModel()).mo157233e();
                if (e == null) {
                    return "";
                }
                return e.getTenantId();
            }

            @Override // com.ss.android.lark.main.app.drawer.C44232c.AbstractC44235b.AbstractC44236a
            /* renamed from: a */
            public void mo157258a(boolean z) {
                C44224b.this.f112205a = true;
                C44224b.this.f112207c = z;
                C44224b.this.mo157254c();
            }

            @Override // com.ss.android.lark.main.app.drawer.C44232c.AbstractC44235b.AbstractC44236a
            /* renamed from: a */
            public void mo157257a(Context context, String str, IGetDataCallback<Boolean> iGetDataCallback) {
                ((C44232c.AbstractC44233a) C44224b.this.getModel()).mo157225a(context, str, iGetDataCallback);
            }
        };
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C44232c.AbstractC44233a.AbstractC44234a mo157253b() {
        return new C44232c.AbstractC44233a.AbstractC44234a() {
            /* class com.ss.android.lark.main.app.drawer.C44224b.C442283 */

            @Override // com.ss.android.lark.main.app.drawer.C44232c.AbstractC44233a.AbstractC44234a
            /* renamed from: a */
            public void mo157263a(final List<TenantInfo> list, final List<TenantInfo.PendingUser> list2) {
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.main.app.drawer.C44224b.C442283.RunnableC442291 */

                    public void run() {
                        C44232c.AbstractC44235b bVar = (C44232c.AbstractC44235b) C44224b.this.getView();
                        if (bVar != null) {
                            bVar.mo157197a(list, list2);
                            bVar.mo157199b();
                            bVar.mo157196a(list);
                        }
                    }
                });
            }
        };
    }

    /* renamed from: d */
    public void mo157255d() {
        ((C44232c.AbstractC44235b) getView()).mo157200c();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        C44134a.m174959a().mo133194N().mo133383a(this.f112208d);
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        C44134a.m174959a().mo133194N().mo133387b(this.f112208d);
        super.destroy();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        r0 = (com.ss.android.lark.main.app.drawer.C44232c.AbstractC44233a) getModel();
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo157254c() {
        /*
            r3 = this;
            boolean r0 = r3.f112207c
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            int r0 = r3.f112206b
            if (r0 != 0) goto L_0x0023
            boolean r0 = r3.f112205a
            if (r0 != 0) goto L_0x000e
            goto L_0x0023
        L_0x000e:
            com.larksuite.framework.mvp.IModel r0 = r3.getModel()
            com.ss.android.lark.main.app.drawer.c$a r0 = (com.ss.android.lark.main.app.drawer.C44232c.AbstractC44233a) r0
            if (r0 != 0) goto L_0x0017
            return
        L_0x0017:
            boolean r1 = r0.mo157229a()
            com.ss.android.lark.main.app.drawer.b$4 r2 = new com.ss.android.lark.main.app.drawer.b$4
            r2.<init>(r1, r0)
            com.larksuite.framework.callback.UICallbackExecutor.execute(r2)
        L_0x0023:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.main.app.drawer.C44224b.mo157254c():void");
    }

    /* renamed from: a */
    public void mo157252a(int i) {
        this.f112206b = i;
        ((C44232c.AbstractC44235b) getView()).mo157192a(i);
        if (i == 0) {
            mo157254c();
            return;
        }
        C44232c.AbstractC44235b bVar = (C44232c.AbstractC44235b) getView();
        if (bVar != null) {
            bVar.mo157198a(false);
        }
    }

    public C44224b(C44232c.AbstractC44235b bVar, C44232c.AbstractC44233a aVar) {
        super(aVar, bVar);
        aVar.mo157226a(mo157253b());
    }
}
