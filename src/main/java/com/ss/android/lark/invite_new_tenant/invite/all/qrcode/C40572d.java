package com.ss.android.lark.invite_new_tenant.invite.all.qrcode;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.invite_new_tenant.invite.all.qrcode.C40564a;
import com.ss.android.lark.invite_new_tenant.p2064b.C40534a;
import com.ss.android.lark.invite_new_tenant.statistics.StatisticsManager;

/* renamed from: com.ss.android.lark.invite_new_tenant.invite.all.qrcode.d */
public class C40572d extends BasePresenter<C40564a.AbstractC40565a, C40564a.AbstractC40566b, C40564a.AbstractC40566b.AbstractC40567a> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C40564a.AbstractC40566b.AbstractC40567a createViewDelegate() {
        return new C40576a();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        ((C40564a.AbstractC40566b) getView()).mo146683b();
        final C405731 r0 = new IGetDataCallback<Bitmap>() {
            /* class com.ss.android.lark.invite_new_tenant.invite.all.qrcode.C40572d.C405731 */

            /* renamed from: a */
            public void onSuccess(Bitmap bitmap) {
                ((C40564a.AbstractC40566b) C40572d.this.getView()).mo146685c();
                ((C40564a.AbstractC40566b) C40572d.this.getView()).mo146679a(bitmap);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                ((C40564a.AbstractC40566b) C40572d.this.getView()).mo146685c();
                if (!TextUtils.isEmpty(errorResult.getDisplayMsg())) {
                    ((C40564a.AbstractC40566b) C40572d.this.getView()).mo146682a(errorResult.getDisplayMsg());
                }
            }
        };
        CoreThreadPool.getDefault().getCachedThreadPool().submit(new Runnable() {
            /* class com.ss.android.lark.invite_new_tenant.invite.all.qrcode.C40572d.RunnableC405742 */

            public void run() {
                ((C40564a.AbstractC40565a) C40572d.this.getModel()).mo146689a(new UIGetDataCallback(r0));
            }
        });
        ((C40564a.AbstractC40565a) getModel()).mo146690b(new UIGetDataCallback(new IGetDataCallback<C40534a>() {
            /* class com.ss.android.lark.invite_new_tenant.invite.all.qrcode.C40572d.C405753 */

            /* renamed from: a */
            public void onSuccess(C40534a aVar) {
                ((C40564a.AbstractC40566b) C40572d.this.getView()).mo146680a(aVar);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                if (!TextUtils.isEmpty(errorResult.getDisplayMsg())) {
                    ((C40564a.AbstractC40566b) C40572d.this.getView()).mo146682a(errorResult.getDisplayMsg());
                }
            }
        }));
        StatisticsManager.m160654a("invite_tenant_via_qrcode");
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.invite_new_tenant.invite.all.qrcode.d$a */
    public class C40576a implements C40564a.AbstractC40566b.AbstractC40567a {
        private C40576a() {
        }

        @Override // com.ss.android.lark.invite_new_tenant.invite.all.qrcode.C40564a.AbstractC40566b.AbstractC40567a
        /* renamed from: a */
        public void mo146691a(Bitmap bitmap) {
            ((C40564a.AbstractC40565a) C40572d.this.getModel()).mo146688a(bitmap, new UIGetDataCallback(new IGetDataCallback<String>() {
                /* class com.ss.android.lark.invite_new_tenant.invite.all.qrcode.C40572d.C40576a.C405771 */

                /* renamed from: a */
                public void onSuccess(String str) {
                    ((C40564a.AbstractC40566b) C40572d.this.getView()).mo146678a();
                    ((C40564a.AbstractC40566b) C40572d.this.getView()).mo146684b(str);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    if (!TextUtils.isEmpty(errorResult.getDisplayMsg())) {
                        ((C40564a.AbstractC40566b) C40572d.this.getView()).mo146682a(errorResult.getDisplayMsg());
                    }
                }
            }));
        }
    }

    public C40572d(C40564a.AbstractC40565a aVar, C40564a.AbstractC40566b bVar) {
        super(aVar, bVar);
    }
}
