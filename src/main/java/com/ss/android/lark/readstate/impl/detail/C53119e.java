package com.ss.android.lark.readstate.impl.detail;

import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.monitor.p2372a.C48211b;
import com.ss.android.lark.readstate.impl.detail.C53111a;
import com.ss.android.lark.readstate.impl.detail.C53119e;
import com.ss.android.lark.readstate.impl.detail.vo.SearchReadStateResult;
import com.ss.android.lark.readstate.impl.detail.vo.ShowReadStateResult;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.readstate.impl.detail.e */
public class C53119e extends BasePresenter<C53111a.AbstractC53112a, C53111a.AbstractC53113b, C53111a.AbstractC53113b.AbstractC53114a> {

    /* renamed from: a */
    public CallbackManager f131372a = new CallbackManager();

    /* renamed from: a */
    public C53111a.AbstractC53113b.AbstractC53114a createViewDelegate() {
        return new C53121a();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f131372a.cancelCallbacks();
        super.destroy();
    }

    /* renamed from: com.ss.android.lark.readstate.impl.detail.e$a */
    public class C53121a implements C53111a.AbstractC53113b.AbstractC53114a {
        public C53121a() {
            C53119e.this = r1;
        }

        /* access modifiers changed from: public */
        /* renamed from: b */
        private /* synthetic */ void m205631b(String str) {
            ((C53111a.AbstractC53112a) C53119e.this.getModel()).mo181418a(str, C53119e.this.f131372a.wrapAndAddGetDataCallback(new IGetDataCallback<SearchReadStateResult>() {
                /* class com.ss.android.lark.readstate.impl.detail.C53119e.C53121a.C531221 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165382e(errorResult.toString());
                }

                /* access modifiers changed from: public */
                /* renamed from: b */
                private /* synthetic */ void m205633b(SearchReadStateResult aVar) {
                    ((C53111a.AbstractC53113b) C53119e.this.getView()).mo181407a(aVar);
                }

                /* renamed from: a */
                public void onSuccess(SearchReadStateResult aVar) {
                    UICallbackExecutor.execute(new Runnable(aVar) {
                        /* class com.ss.android.lark.readstate.impl.detail.$$Lambda$e$a$1$AnccSR866ahXNlPcvWSp2val5oU */
                        public final /* synthetic */ SearchReadStateResult f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void run() {
                            C53119e.C53121a.C531221.lambda$AnccSR866ahXNlPcvWSp2val5oU(C53119e.C53121a.C531221.this, this.f$1);
                        }
                    });
                }
            }));
        }

        @Override // com.ss.android.lark.readstate.impl.detail.C53111a.AbstractC53113b.AbstractC53114a
        /* renamed from: a */
        public void mo181419a(String str) {
            CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable(str) {
                /* class com.ss.android.lark.readstate.impl.detail.$$Lambda$e$a$4jWsijjgmdOuevtvGdnBbTM5ow */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C53119e.C53121a.m270937lambda$4jWsijjgmdOuevtvGdnBbTM5ow(C53119e.C53121a.this, this.f$1);
                }
            });
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m205627b(C53117c cVar) {
        ((C53111a.AbstractC53112a) getModel()).mo181417a(cVar, this.f131372a.wrapAndAddGetDataCallback(new IGetDataCallback<ShowReadStateResult>() {
            /* class com.ss.android.lark.readstate.impl.detail.C53119e.C531201 */

            /* renamed from: a */
            public void onSuccess(ShowReadStateResult bVar) {
                ((C53111a.AbstractC53113b) C53119e.this.getView()).mo181408a(bVar);
                C48211b.m190251a().mo168691c("Init MVP");
                C48211b.m190251a().mo168692d();
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165382e(errorResult.toString());
                ((C53111a.AbstractC53113b) C53119e.this.getView()).mo181405a();
                ((C53111a.AbstractC53113b) C53119e.this.getView()).mo181409a(UIHelper.getString(R.string.Lark_Legacy_GetMessageReadstateFail));
                C48211b.m190251a().mo168691c("Init MVP");
                C48211b.m190251a().mo168692d();
            }
        }));
    }

    /* renamed from: a */
    public void mo181436a(C53117c cVar) {
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable(cVar) {
            /* class com.ss.android.lark.readstate.impl.detail.$$Lambda$e$o_8t5dGiOucmLVRHAk1V8XViylI */
            public final /* synthetic */ C53117c f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C53119e.lambda$o_8t5dGiOucmLVRHAk1V8XViylI(C53119e.this, this.f$1);
            }
        });
    }

    public C53119e(C53111a.AbstractC53112a aVar, C53111a.AbstractC53113b bVar) {
        super(aVar, bVar);
    }
}
