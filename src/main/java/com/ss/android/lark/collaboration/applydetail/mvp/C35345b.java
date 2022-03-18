package com.ss.android.lark.collaboration.applydetail.mvp;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.collaboration.applydetail.mvp.AbstractC35350d;
import com.ss.android.lark.collaboration.applydetail.mvp.C35345b;
import com.ss.android.lark.contact.entity.Contact;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.collaboration.applydetail.mvp.b */
public class C35345b extends BasePresenter<AbstractC35350d.AbstractC35351a, AbstractC35350d.AbstractC35353b, AbstractC35350d.AbstractC35353b.AbstractC35354a> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC35350d.AbstractC35353b.AbstractC35354a createViewDelegate() {
        return new AbstractC35350d.AbstractC35353b.AbstractC35354a() {
            /* class com.ss.android.lark.collaboration.applydetail.mvp.C35345b.C353461 */
        };
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m138110b() {
        UICallbackExecutor.execute(new Runnable() {
            /* class com.ss.android.lark.collaboration.applydetail.mvp.$$Lambda$b$5hbQI1m4RlSczcMUlLl_Fq3QwKI */

            public final void run() {
                C35345b.this.m138111c();
            }
        });
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m138111c() {
        ((AbstractC35350d.AbstractC35353b) getView()).mo130080a();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        ((AbstractC35350d.AbstractC35351a) getModel()).mo130083a(new IGetDataCallback<List<Contact>>() {
            /* class com.ss.android.lark.collaboration.applydetail.mvp.C35345b.C353472 */

            /* access modifiers changed from: private */
            /* access modifiers changed from: public */
            /* renamed from: a */
            private /* synthetic */ void m138113a() {
                ((AbstractC35350d.AbstractC35353b) C35345b.this.getView()).mo130082a(new ArrayList());
            }

            /* access modifiers changed from: private */
            /* access modifiers changed from: public */
            /* renamed from: b */
            private /* synthetic */ void m138114b(List list) {
                ((AbstractC35350d.AbstractC35353b) C35345b.this.getView()).mo130082a(list);
            }

            /* renamed from: a */
            public void onSuccess(List<Contact> list) {
                UICallbackExecutor.execute(new Runnable(list) {
                    /* class com.ss.android.lark.collaboration.applydetail.mvp.$$Lambda$b$2$8rtzl79wGfGPMeIENxNB4BlZ7GY */
                    public final /* synthetic */ List f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C35345b.C353472.this.m138114b(this.f$1);
                    }
                });
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.collaboration.applydetail.mvp.$$Lambda$b$2$ZnvdZ9zsBbdNrKTWrglf4hSTgr4 */

                    public final void run() {
                        C35345b.C353472.this.m138113a();
                    }
                });
            }
        });
    }

    public C35345b(AbstractC35350d.AbstractC35351a aVar, AbstractC35350d.AbstractC35353b bVar) {
        super(aVar, bVar);
        aVar.mo130084a(new AbstractC35350d.AbstractC35351a.AbstractC35352a() {
            /* class com.ss.android.lark.collaboration.applydetail.mvp.$$Lambda$b$DxHgHSoNH4VJOTK87njMj1q4mA */

            public final void notifyContactListChanged() {
                C35345b.this.m138110b();
            }
        });
    }
}
