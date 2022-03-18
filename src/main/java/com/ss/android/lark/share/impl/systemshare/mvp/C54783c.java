package com.ss.android.lark.share.impl.systemshare.mvp;

import com.larksuite.framework.callback.AbstractC25968b;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.ICallback;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.biz.core.api.CommonShareData;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.permission.AbstractC51324c;
import com.ss.android.lark.share.impl.systemshare.mvp.AbstractC54774a;

/* renamed from: com.ss.android.lark.share.impl.systemshare.mvp.c */
public class C54783c extends BasePresenter<AbstractC54774a.AbstractC54775a, AbstractC54774a.AbstractC54776b, AbstractC54774a.AbstractC54776b.AbstractC54777a> {

    /* renamed from: a */
    AbstractC54787b f135268a;

    /* renamed from: b */
    public CallbackManager f135269b = new CallbackManager();

    /* renamed from: com.ss.android.lark.share.impl.systemshare.mvp.c$b */
    public interface AbstractC54787b {
        /* renamed from: a */
        void mo186916a(CommonShareData commonShareData);

        /* renamed from: a */
        void mo186917a(CommonShareData commonShareData, AbstractC54788c cVar);

        /* renamed from: a */
        void mo186918a(AbstractC51324c cVar);
    }

    /* renamed from: com.ss.android.lark.share.impl.systemshare.mvp.c$c */
    public interface AbstractC54788c extends ICallback {
        /* renamed from: a */
        void mo186957a();
    }

    /* renamed from: com.ss.android.lark.share.impl.systemshare.mvp.c$d */
    public interface AbstractC54789d {
        void onFinish();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public AbstractC54774a.AbstractC54776b.AbstractC54777a createViewDelegate() {
        return new C54790e();
    }

    /* renamed from: c */
    public void mo186955c() {
        ((AbstractC54774a.AbstractC54776b) getView()).mo186930a();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f135269b.cancelCallbacks();
        super.destroy();
        this.f135268a = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.share.impl.systemshare.mvp.c$a */
    public static class C54786a extends AbstractC25968b<AbstractC54788c> implements AbstractC54788c {
        @Override // com.ss.android.lark.share.impl.systemshare.mvp.C54783c.AbstractC54788c
        /* renamed from: a */
        public void mo186957a() {
            if (!isCanceled() && this.callback != null) {
                ((AbstractC54788c) this.callback).mo186957a();
            }
        }

        public C54786a(AbstractC54788c cVar) {
            super(cVar);
        }
    }

    /* renamed from: a */
    public void mo186953a() {
        Log.m165389i("ShareContentActivity", "content is loading");
        ((AbstractC54774a.AbstractC54776b) getView()).mo186933b();
        ((AbstractC54774a.AbstractC54775a) getModel()).mo186941a(new IGetDataCallback<CommonShareData>() {
            /* class com.ss.android.lark.share.impl.systemshare.mvp.C54783c.C547852 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("ShareContentActivity", errorResult.getDebugMsg());
                Log.m165389i("ShareContentActivity", "fetch content failed ，now hide Dialog");
                ((AbstractC54774a.AbstractC54776b) C54783c.this.getView()).mo186934c();
            }

            /* renamed from: a */
            public void onSuccess(CommonShareData commonShareData) {
                Log.m165389i("ShareContentActivity", "content load success，hide Dialog");
                ((AbstractC54774a.AbstractC54776b) C54783c.this.getView()).mo186934c();
                Log.m165389i("ShareContentActivity", "show content");
                ((AbstractC54774a.AbstractC54776b) C54783c.this.getView()).mo186931a(commonShareData);
            }
        });
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        AbstractC54787b bVar = this.f135268a;
        if (bVar != null) {
            bVar.mo186918a(new AbstractC51324c() {
                /* class com.ss.android.lark.share.impl.systemshare.mvp.C54783c.C547841 */

                @Override // com.ss.android.lark.permission.AbstractC51324c
                /* renamed from: a */
                public void mo49823a() {
                    ((AbstractC54774a.AbstractC54775a) C54783c.this.getModel()).mo186943a(true);
                    C54783c.this.mo186953a();
                }

                @Override // com.ss.android.lark.permission.AbstractC51324c
                /* renamed from: b */
                public void mo49824b() {
                    ((AbstractC54774a.AbstractC54775a) C54783c.this.getModel()).mo186943a(false);
                    Log.m165383e("ShareContentActivity", "get permission fail! load pics error");
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.share.impl.systemshare.mvp.c$e */
    public class C54790e implements AbstractC54774a.AbstractC54776b.AbstractC54777a {
        @Override // com.ss.android.lark.share.impl.systemshare.mvp.AbstractC54774a.AbstractC54776b.AbstractC54777a
        /* renamed from: c */
        public void mo186947c(AbstractC54789d dVar) {
            dVar.onFinish();
        }

        private C54790e() {
        }

        @Override // com.ss.android.lark.share.impl.systemshare.mvp.AbstractC54774a.AbstractC54776b.AbstractC54777a
        /* renamed from: a */
        public void mo186945a(final AbstractC54789d dVar) {
            if (!((AbstractC54774a.AbstractC54775a) C54783c.this.getModel()).mo186944a()) {
                ((AbstractC54774a.AbstractC54776b) C54783c.this.getView()).mo186930a();
                dVar.onFinish();
                return;
            }
            final C547911 r0 = new IGetDataCallback<Boolean>() {
                /* class com.ss.android.lark.share.impl.systemshare.mvp.C54783c.C54790e.C547911 */

                /* renamed from: a */
                public void onSuccess(Boolean bool) {
                    ((AbstractC54774a.AbstractC54776b) C54783c.this.getView()).mo186930a();
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165383e("ShareContentActivity", errorResult.getDebugMsg());
                }
            };
            ((AbstractC54774a.AbstractC54775a) C54783c.this.getModel()).mo186941a(new IGetDataCallback<CommonShareData>() {
                /* class com.ss.android.lark.share.impl.systemshare.mvp.C54783c.C54790e.C547922 */

                /* renamed from: a */
                public void onSuccess(final CommonShareData commonShareData) {
                    C54786a aVar = new C54786a(new AbstractC54788c() {
                        /* class com.ss.android.lark.share.impl.systemshare.mvp.C54783c.C54790e.C547922.C547931 */

                        @Override // com.ss.android.lark.share.impl.systemshare.mvp.C54783c.AbstractC54788c
                        /* renamed from: a */
                        public void mo186957a() {
                            ((AbstractC54774a.AbstractC54775a) C54783c.this.getModel()).mo186942a(commonShareData, r0);
                            dVar.onFinish();
                        }
                    });
                    C54783c.this.f135269b.addCancelableCallback(aVar);
                    C54783c.this.f135268a.mo186917a(commonShareData, aVar);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165383e("ShareContentActivity", errorResult.getDebugMsg());
                    ((AbstractC54774a.AbstractC54776b) C54783c.this.getView()).mo186930a();
                    dVar.onFinish();
                }
            });
        }

        @Override // com.ss.android.lark.share.impl.systemshare.mvp.AbstractC54774a.AbstractC54776b.AbstractC54777a
        /* renamed from: b */
        public void mo186946b(final AbstractC54789d dVar) {
            if (!((AbstractC54774a.AbstractC54775a) C54783c.this.getModel()).mo186944a()) {
                ((AbstractC54774a.AbstractC54776b) C54783c.this.getView()).mo186930a();
                dVar.onFinish();
                return;
            }
            ((AbstractC54774a.AbstractC54775a) C54783c.this.getModel()).mo186941a(new IGetDataCallback<CommonShareData>() {
                /* class com.ss.android.lark.share.impl.systemshare.mvp.C54783c.C54790e.C547943 */

                /* renamed from: a */
                public void onSuccess(final CommonShareData commonShareData) {
                    C54786a aVar = new C54786a(new AbstractC54788c() {
                        /* class com.ss.android.lark.share.impl.systemshare.mvp.C54783c.C54790e.C547943.C547951 */

                        @Override // com.ss.android.lark.share.impl.systemshare.mvp.C54783c.AbstractC54788c
                        /* renamed from: a */
                        public void mo186957a() {
                            if (C54783c.this.f135268a != null) {
                                C54783c.this.f135268a.mo186916a(commonShareData);
                            }
                            if (dVar != null) {
                                dVar.onFinish();
                            }
                        }
                    });
                    C54783c.this.f135269b.addCancelableCallback(aVar);
                    C54783c.this.f135268a.mo186917a(commonShareData, aVar);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165383e("ShareContentActivity", errorResult.getDebugMsg());
                    ((AbstractC54774a.AbstractC54776b) C54783c.this.getView()).mo186930a();
                    dVar.onFinish();
                }
            });
        }
    }

    public C54783c(AbstractC54774a.AbstractC54775a aVar, AbstractC54774a.AbstractC54776b bVar, AbstractC54787b bVar2) {
        super(aVar, bVar);
        this.f135268a = bVar2;
    }
}
