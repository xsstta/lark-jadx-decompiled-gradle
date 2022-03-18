package com.ss.android.lark.profile.func.share_profile.share_url.mvp;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.profile.C52239a;
import com.ss.android.lark.profile.dependency.IProfileModuleDependency;
import com.ss.android.lark.profile.func.share_profile.p2524a.C52461a;
import com.ss.android.lark.profile.func.share_profile.share_url.mvp.AbstractC52537a;
import com.ss.android.lark.profile.func.share_profile.share_url.mvp.C52542b;
import com.ss.android.lark.profile.func.share_profile.share_url.mvp.ShareProfileUrlView;
import com.ss.android.lark.profile.p2520a.p2521a.AbstractC52240a;

/* renamed from: com.ss.android.lark.profile.func.share_profile.share_url.mvp.b */
public class C52542b extends BaseModel implements AbstractC52537a.AbstractC52538a {

    /* renamed from: a */
    public AbstractC52537a.AbstractC52538a.AbstractC52539a f130015a;

    /* renamed from: b */
    private IProfileModuleDependency.AbstractC52250e f130016b = C52239a.m202617d().mo133582l();

    /* renamed from: c */
    private AbstractC52240a f130017c = new AbstractC52240a() {
        /* class com.ss.android.lark.profile.func.share_profile.share_url.mvp.C52542b.C525431 */

        @Override // com.ss.android.lark.profile.p2520a.p2521a.AbstractC52240a
        /* renamed from: a */
        public void mo178826a(String str) {
            C52542b.this.mo179551a(str);
        }
    };

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m203424a();
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        m203425b();
    }

    /* renamed from: a */
    private void m203424a() {
        C52239a.m202617d().mo133588r().mo133630a(this.f130017c);
    }

    /* renamed from: b */
    private void m203425b() {
        C52239a.m202617d().mo133588r().mo133633b(this.f130017c);
    }

    @Override // com.ss.android.lark.profile.func.share_profile.share_url.mvp.AbstractC52537a.AbstractC52538a
    /* renamed from: a */
    public void mo179547a(AbstractC52537a.AbstractC52538a.AbstractC52539a aVar) {
        this.f130015a = aVar;
    }

    /* renamed from: com.ss.android.lark.profile.func.share_profile.share_url.mvp.b$a */
    private abstract class AbstractC52547a implements IGetDataCallback<String> {

        /* renamed from: a */
        private IGetDataCallback<String> f130024a;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract String mo179553a(String str);

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            IGetDataCallback<String> iGetDataCallback = this.f130024a;
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(errorResult);
            }
        }

        /* renamed from: b */
        public void onSuccess(String str) {
            IGetDataCallback<String> iGetDataCallback = this.f130024a;
            if (iGetDataCallback != null) {
                iGetDataCallback.onSuccess(mo179553a(str));
            }
        }

        public AbstractC52547a(IGetDataCallback<String> iGetDataCallback) {
            this.f130024a = iGetDataCallback;
        }
    }

    @Override // com.ss.android.lark.profile.func.share_profile.share_url.mvp.AbstractC52537a.AbstractC52538a
    /* renamed from: a */
    public void mo179546a(final IGetDataCallback<ShareProfileUrlView.C52535a> iGetDataCallback) {
        C52461a.m203283b((IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<ShareProfileUrlView.C52535a>() {
            /* class com.ss.android.lark.profile.func.share_profile.share_url.mvp.C52542b.C525442 */

            /* renamed from: a */
            public void onSuccess(ShareProfileUrlView.C52535a aVar) {
                iGetDataCallback.onSuccess(aVar);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }
        }));
    }

    @Override // com.ss.android.lark.profile.func.share_profile.share_url.mvp.AbstractC52537a.AbstractC52538a
    /* renamed from: b */
    public void mo179548b(IGetDataCallback<String> iGetDataCallback) {
        this.f130016b.mo133654a(new AbstractC52547a(iGetDataCallback) {
            /* class com.ss.android.lark.profile.func.share_profile.share_url.mvp.C52542b.C525453 */

            /* access modifiers changed from: package-private */
            @Override // com.ss.android.lark.profile.func.share_profile.share_url.mvp.C52542b.AbstractC52547a
            /* renamed from: a */
            public String mo179553a(String str) {
                return str;
            }
        });
    }

    /* renamed from: a */
    public void mo179551a(final String str) {
        if (str != null) {
            this.f130016b.mo133654a(new IGetDataCallback<String>() {
                /* class com.ss.android.lark.profile.func.share_profile.share_url.mvp.C52542b.C525464 */

                /* access modifiers changed from: private */
                /* access modifiers changed from: public */
                /* renamed from: b */
                private /* synthetic */ void m203433b(String str) {
                    C52542b.this.f130015a.mo179549a(str);
                }

                /* access modifiers changed from: private */
                /* access modifiers changed from: public */
                /* renamed from: c */
                private /* synthetic */ void m203434c(String str) {
                    C52542b.this.f130015a.mo179549a(str);
                }

                /* renamed from: a */
                public void onSuccess(String str) {
                    if (C52542b.this.f130015a != null) {
                        UICallbackExecutor.execute(new Runnable(str) {
                            /* class com.ss.android.lark.profile.func.share_profile.share_url.mvp.$$Lambda$b$4$D6_0_g23TvdYcRWnZMEXzrQiyY */
                            public final /* synthetic */ String f$1;

                            {
                                this.f$1 = r2;
                            }

                            public final void run() {
                                C52542b.C525464.this.m203434c(this.f$1);
                            }
                        });
                    }
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165379d("ShareProfileUrlModel", "get contacts invite url error,use token");
                    String b = C52239a.m202617d().mo133563b(str);
                    if (C52542b.this.f130015a != null) {
                        UICallbackExecutor.execute(new Runnable(b) {
                            /* class com.ss.android.lark.profile.func.share_profile.share_url.mvp.$$Lambda$b$4$tuj22H_Zr1nRPXqSOvuKL0OLu7A */
                            public final /* synthetic */ String f$1;

                            {
                                this.f$1 = r2;
                            }

                            public final void run() {
                                C52542b.C525464.this.m203433b(this.f$1);
                            }
                        });
                    }
                }
            });
        }
    }
}
