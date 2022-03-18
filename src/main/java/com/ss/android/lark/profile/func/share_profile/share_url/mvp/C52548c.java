package com.ss.android.lark.profile.func.share_profile.share_url.mvp;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.profile.func.share_profile.share_url.mvp.AbstractC52537a;
import com.ss.android.lark.profile.func.share_profile.share_url.mvp.ShareProfileUrlView;

/* renamed from: com.ss.android.lark.profile.func.share_profile.share_url.mvp.c */
public class C52548c extends BasePresenter<AbstractC52537a.AbstractC52538a, AbstractC52537a.AbstractC52540b, AbstractC52537a.AbstractC52540b.AbstractC52541a> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC52537a.AbstractC52540b.AbstractC52541a createViewDelegate() {
        return new C52552b();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m203438b();
    }

    /* renamed from: b */
    private void m203438b() {
        ((AbstractC52537a.AbstractC52538a) getModel()).mo179546a(new UIGetDataCallback(new IGetDataCallback<ShareProfileUrlView.C52535a>() {
            /* class com.ss.android.lark.profile.func.share_profile.share_url.mvp.C52548c.C525491 */

            /* renamed from: a */
            public void onSuccess(ShareProfileUrlView.C52535a aVar) {
                ((AbstractC52537a.AbstractC52540b) C52548c.this.getView()).mo179542a(aVar);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165382e("getLoginProfileUrlViewData failed: " + errorResult.getDebugMsg());
            }
        }));
        ((AbstractC52537a.AbstractC52538a) getModel()).mo179548b(new UIGetDataCallback(new IGetDataCallback<String>() {
            /* class com.ss.android.lark.profile.func.share_profile.share_url.mvp.C52548c.C525502 */

            /* renamed from: a */
            public void onSuccess(String str) {
                ((AbstractC52537a.AbstractC52540b) C52548c.this.getView()).mo179544a(str);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165382e("get login contact url failed: " + errorResult.toString());
            }
        }));
    }

    /* renamed from: com.ss.android.lark.profile.func.share_profile.share_url.mvp.c$a */
    private class C52551a implements AbstractC52537a.AbstractC52538a.AbstractC52539a {
        private C52551a() {
        }

        @Override // com.ss.android.lark.profile.func.share_profile.share_url.mvp.AbstractC52537a.AbstractC52538a.AbstractC52539a
        /* renamed from: a */
        public void mo179549a(String str) {
            ((AbstractC52537a.AbstractC52540b) C52548c.this.getView()).mo179544a(str);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.profile.func.share_profile.share_url.mvp.c$b */
    public class C52552b implements AbstractC52537a.AbstractC52540b.AbstractC52541a {
        private C52552b() {
        }

        @Override // com.ss.android.lark.profile.func.share_profile.share_url.mvp.AbstractC52537a.AbstractC52540b.AbstractC52541a
        /* renamed from: a */
        public void mo179550a(String str) {
            ((AbstractC52537a.AbstractC52540b) C52548c.this.getView()).mo179545b(str);
        }
    }

    public C52548c(AbstractC52537a.AbstractC52538a aVar, AbstractC52537a.AbstractC52540b bVar) {
        super(aVar, bVar);
        ((AbstractC52537a.AbstractC52538a) getModel()).mo179547a(new C52551a());
    }
}
