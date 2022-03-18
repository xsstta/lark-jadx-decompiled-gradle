package com.ss.android.lark.invite_new_tenant.invite.all.link;

import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.invite_new_tenant.invite.all.link.C40550a;
import com.ss.android.lark.invite_new_tenant.invite.all.p2067a.C40547a;
import com.ss.android.lark.invite_new_tenant.p2064b.C40534a;
import com.ss.android.lark.invite_new_tenant.statistics.StatisticsManager;

/* renamed from: com.ss.android.lark.invite_new_tenant.invite.all.link.d */
public class C40557d extends BasePresenter<C40550a.AbstractC40551a, C40550a.AbstractC40552b, C40550a.AbstractC40552b.AbstractC40553a> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C40550a.AbstractC40552b.AbstractC40553a createViewDelegate() {
        return new C40561a();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        final C405581 r0 = new IGetDataCallback<C40547a>() {
            /* class com.ss.android.lark.invite_new_tenant.invite.all.link.C40557d.C405581 */

            /* renamed from: a */
            public void onSuccess(C40547a aVar) {
                ((C40550a.AbstractC40552b) C40557d.this.getView()).mo146667a(aVar);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                if (!TextUtils.isEmpty(errorResult.getDisplayMsg())) {
                    ((C40550a.AbstractC40552b) C40557d.this.getView()).mo146669a(errorResult.getDisplayMsg());
                }
            }
        };
        CoreThreadPool.getDefault().getCachedThreadPool().submit(new Runnable() {
            /* class com.ss.android.lark.invite_new_tenant.invite.all.link.C40557d.RunnableC405592 */

            public void run() {
                ((C40550a.AbstractC40551a) C40557d.this.getModel()).mo146672a(new UIGetDataCallback(r0));
            }
        });
        ((C40550a.AbstractC40551a) getModel()).mo146673b(new UIGetDataCallback(new IGetDataCallback<C40534a>() {
            /* class com.ss.android.lark.invite_new_tenant.invite.all.link.C40557d.C405603 */

            /* renamed from: a */
            public void onSuccess(C40534a aVar) {
                ((C40550a.AbstractC40552b) C40557d.this.getView()).mo146666a(aVar);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                if (!TextUtils.isEmpty(errorResult.getDisplayMsg())) {
                    ((C40550a.AbstractC40552b) C40557d.this.getView()).mo146669a(errorResult.getDisplayMsg());
                }
            }
        }));
        StatisticsManager.m160654a("invite_tenant_via_link_view");
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.invite_new_tenant.invite.all.link.d$a */
    public class C40561a implements C40550a.AbstractC40552b.AbstractC40553a {
        private C40561a() {
        }
    }

    public C40557d(C40550a.AbstractC40551a aVar, C40550a.AbstractC40552b bVar) {
        super(aVar, bVar);
    }
}
