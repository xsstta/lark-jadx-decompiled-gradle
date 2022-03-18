package com.ss.android.lark.mine.impl.info.mvp;

import android.content.Context;
import com.larksuite.framework.callback.C25975i;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mine.C45421b;
import com.ss.android.lark.mine.dto.C45427e;
import com.ss.android.lark.mine.dto.TenantCertificationInfo;
import com.ss.android.lark.mine.impl.info.mvp.C45778a;
import com.ss.android.lark.mine.impl.info.mvp.MineInfoView;

/* renamed from: com.ss.android.lark.mine.impl.info.mvp.c */
public class C45789c extends BasePresenter<C45778a.AbstractC45779a, C45778a.AbstractC45781b, C45778a.AbstractC45781b.AbstractC45782a> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C45778a.AbstractC45781b.AbstractC45782a createViewDelegate() {
        return new C45796b();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m181448b();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mine.impl.info.mvp.c$b */
    public class C45796b implements C45778a.AbstractC45781b.AbstractC45782a {
        @Override // com.ss.android.lark.mine.impl.info.mvp.C45778a.AbstractC45781b.AbstractC45782a
        /* renamed from: b */
        public String mo161000b() {
            return ((C45778a.AbstractC45779a) C45789c.this.getModel()).mo160996c();
        }

        @Override // com.ss.android.lark.mine.impl.info.mvp.C45778a.AbstractC45781b.AbstractC45782a
        /* renamed from: a */
        public void mo160999a() {
            ((C45778a.AbstractC45781b) C45789c.this.getView()).mo160986b(((C45778a.AbstractC45779a) C45789c.this.getModel()).mo160990a());
        }

        private C45796b() {
        }
    }

    /* renamed from: b */
    private void m181448b() {
        m181451e();
        m181450d();
        m181449c();
        m181452f();
    }

    /* renamed from: f */
    private void m181452f() {
        ((C45778a.AbstractC45779a) getModel()).mo160994b(new IGetDataCallback<TenantCertificationInfo>() {
            /* class com.ss.android.lark.mine.impl.info.mvp.C45789c.C457934 */

            /* renamed from: a */
            public void onSuccess(TenantCertificationInfo gVar) {
                ((C45778a.AbstractC45781b) C45789c.this.getView()).mo160981a(gVar);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("MineInfoPresenter", "fetch tenantCertification info failed: " + errorResult.toString());
                ((C45778a.AbstractC45781b) C45789c.this.getView()).mo160981a((TenantCertificationInfo) null);
            }
        });
    }

    /* renamed from: c */
    private void m181449c() {
        ((C45778a.AbstractC45779a) getModel()).mo160991a((IGetDataCallback<Boolean>) new UIGetDataCallback(new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.mine.impl.info.mvp.C45789c.C457901 */

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                ((C45778a.AbstractC45781b) C45789c.this.getView()).mo160984a(bool.booleanValue());
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                if (C45421b.m180420a().mo133451j().mo133481a("lark.all.change.name")) {
                    ((C45778a.AbstractC45781b) C45789c.this.getView()).mo160984a(true);
                } else {
                    ((C45778a.AbstractC45781b) C45789c.this.getView()).mo160984a(((C45778a.AbstractC45779a) C45789c.this.getModel()).mo160995b());
                }
                Log.m165383e("MineInfoPresenter", "getMineUpdateNamePermission failed: " + errorResult.getDebugMsg());
            }
        }));
    }

    /* renamed from: d */
    private void m181450d() {
        ((C45778a.AbstractC45779a) getModel()).mo160992a(new UIGetDataCallback<>(new IGetDataCallback<Chatter>() {
            /* class com.ss.android.lark.mine.impl.info.mvp.C45789c.C457912 */

            /* renamed from: a */
            public void onSuccess(Chatter chatter) {
                ((C45778a.AbstractC45781b) C45789c.this.getView()).mo160980a(chatter);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("MineInfoPresenter", "get login chatter failed: " + errorResult.toString());
            }
        }));
    }

    /* renamed from: e */
    private void m181451e() {
        ((C45778a.AbstractC45779a) getModel()).mo160993a(new C25975i<>(new IGetDataCallback<C45427e>() {
            /* class com.ss.android.lark.mine.impl.info.mvp.C45789c.C457923 */

            /* renamed from: a */
            public void onSuccess(C45427e eVar) {
                if (eVar != null) {
                    ((C45778a.AbstractC45781b) C45789c.this.getView()).mo160983a(eVar.mo160301b());
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("MineInfoPresenter", "fetch profile info failed: " + errorResult.toString());
            }
        }));
    }

    /* renamed from: com.ss.android.lark.mine.impl.info.mvp.c$a */
    private class C45794a implements C45778a.AbstractC45779a.AbstractC45780a {
        private C45794a() {
        }

        @Override // com.ss.android.lark.mine.impl.info.mvp.C45778a.AbstractC45779a.AbstractC45780a
        /* renamed from: a */
        public void mo160997a(Chatter chatter) {
            ((C45778a.AbstractC45781b) C45789c.this.getView()).mo160988c(chatter);
        }

        @Override // com.ss.android.lark.mine.impl.info.mvp.C45778a.AbstractC45779a.AbstractC45780a
        /* renamed from: b */
        public void mo160998b(final Chatter chatter) {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.mine.impl.info.mvp.C45789c.C45794a.RunnableC457951 */

                public void run() {
                    ((C45778a.AbstractC45781b) C45789c.this.getView()).mo160989c(chatter.getName());
                }
            });
        }
    }

    /* renamed from: a */
    public void mo161008a(String str) {
        ((C45778a.AbstractC45781b) getView()).mo160987b(str);
    }

    public C45789c(Context context, MineInfoView.AbstractC45777a aVar) {
        MineInfoView mineInfoView = new MineInfoView(context, aVar);
        mineInfoView.setViewDelegate(createViewDelegate());
        setView(mineInfoView);
        C45783b bVar = new C45783b();
        bVar.mo161002a(new C45794a());
        setModel(bVar);
    }
}
