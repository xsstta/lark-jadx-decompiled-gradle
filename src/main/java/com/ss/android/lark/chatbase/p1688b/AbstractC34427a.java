package com.ss.android.lark.chatbase.p1688b;

import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.core.model.AbstractC33953b;
import com.ss.android.lark.chat.core.model.AbstractC33964i;
import com.ss.android.lark.chat.core.model.C33952a;
import com.ss.android.lark.chat.core.model.C33963h;
import com.ss.android.lark.chat.core.model.ChannelDataFetcherStrategy;
import com.ss.android.lark.chat.core.model.MessageFetchScene;
import com.ss.android.lark.chat.core.model.PageLoader;
import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chatbase.AbstractC34417b;
import com.ss.android.lark.chatbase.C34414a;
import com.ss.android.lark.chatbase.p1688b.AbstractC34427a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.message.MessageHitPoint;
import com.ss.android.lark.utils.statistics.PerfLog;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.lark.chatbase.b.a */
public abstract class AbstractC34427a<T extends AbstractC34006a, PageData extends C33952a<T>> {

    /* renamed from: a */
    protected AbstractC33953b<T, PageData> f88890a;

    /* renamed from: b */
    protected AbstractC34417b<T, PageData> f88891b;

    /* renamed from: c */
    protected Executor f88892c;

    /* renamed from: d */
    protected Executor f88893d;

    /* renamed from: e */
    protected CallbackManager f88894e;

    /* renamed from: f */
    private int f88895f;

    /* renamed from: a */
    public abstract void mo122910a(List<Integer> list, IGetDataCallback<Boolean> iGetDataCallback);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo122911a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo122912b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo122913c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract String mo122914d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract String mo122915e();

    /* renamed from: a */
    private void m133536a(final IGetDataCallback<AbstractC33964i<T>> iGetDataCallback) {
        this.f88890a.mo124047a(new C33963h(0, 15, MessageFetchScene.FIRST_SCREEN, ChannelDataFetcherStrategy.SYNC_SERVER_DATA), new PageLoader.AbstractC33948a<PageData>() {
            /* class com.ss.android.lark.chatbase.p1688b.AbstractC34427a.C344303 */

            /* renamed from: a */
            public void mo124053a(PageData pagedata) {
                AbstractC34427a.this.f88892c.execute(new Runnable(pagedata, iGetDataCallback) {
                    /* class com.ss.android.lark.chatbase.p1688b.$$Lambda$a$3$bv0v25yzEiUAvqiYGoVyLVAbrA */
                    public final /* synthetic */ C33952a f$1;
                    public final /* synthetic */ IGetDataCallback f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        AbstractC34427a.C344303.this.m133550a(this.f$1, this.f$2);
                    }
                });
            }

            @Override // com.ss.android.lark.chat.core.model.PageLoader.AbstractC33948a
            /* renamed from: a */
            public void mo124054a(Throwable th) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null && (th instanceof ErrorResult)) {
                    iGetDataCallback.onError((ErrorResult) th);
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m133550a(C33952a aVar, IGetDataCallback iGetDataCallback) {
                if (AbstractC34427a.this.f88891b.mo127120h()) {
                    AbstractC34427a.this.f88891b.mo127112c(aVar);
                    iGetDataCallback.onSuccess(AbstractC34427a.this.f88891b.mo127125l());
                    AbstractC34427a.this.mo122913c();
                    return;
                }
                Log.m165383e(AbstractC34427a.this.mo122915e(), "data back after send msg, abandon");
            }
        }, this.f88893d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo127137a(int i) {
        if (this.f88891b.mo127117f() < i || this.f88891b.mo127115e() > i) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m133537a(final boolean z, final IGetDataCallback<AbstractC33964i<T>> iGetDataCallback) {
        ChannelDataFetcherStrategy channelDataFetcherStrategy;
        int i = this.f88895f;
        if (i <= 0) {
            i = 15;
        }
        MessageFetchScene messageFetchScene = MessageFetchScene.FIRST_SCREEN;
        if (z) {
            channelDataFetcherStrategy = ChannelDataFetcherStrategy.SYNC_SERVER_DATA;
        } else {
            channelDataFetcherStrategy = ChannelDataFetcherStrategy.RETURN_LOCAL_DATA;
        }
        this.f88890a.mo124045a(new C33963h(0, i, messageFetchScene, channelDataFetcherStrategy), new C34414a(this.f88891b, (IGetDataCallback) this.f88894e.wrapAndAddCallback(new IGetDataCallback<PageData>() {
            /* class com.ss.android.lark.chatbase.p1688b.AbstractC34427a.C344281 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(PageData pagedata) {
                if (z) {
                    iGetDataCallback.onSuccess(AbstractC34427a.this.f88891b.mo127125l());
                    return;
                }
                AbstractC34427a aVar = AbstractC34427a.this;
                aVar.mo127136a(pagedata, aVar.f88891b.mo127125l(), AbstractC34427a.this.f88891b.mo127123j(), iGetDataCallback);
            }
        })));
    }

    /* renamed from: a */
    public void mo127135a(int i, IGetDataCallback<AbstractC33964i<T>> iGetDataCallback) {
        this.f88895f = i;
        m133537a(!mo122911a(), iGetDataCallback);
    }

    /* renamed from: a */
    private void m133538a(boolean z, boolean z2, boolean z3, boolean z4) {
        MessageHitPoint.f135779d.mo187535a(mo122914d(), z, z2, z3, z4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo127136a(PageData pagedata, AbstractC33964i<T> iVar, List<Integer> list, final IGetDataCallback<AbstractC33964i<T>> iGetDataCallback) {
        boolean isNotEmpty = CollectionUtils.isNotEmpty(list);
        boolean isNotEmpty2 = CollectionUtils.isNotEmpty(iVar);
        String e = mo122915e();
        Log.m165389i(e, "dataList size is:" + iVar.size() + ", missingPos:" + list);
        if (!isNotEmpty) {
            Log.m165389i(mo122915e(), "data completely");
            iGetDataCallback.onSuccess(iVar);
            mo122913c();
            m133538a(false, false, false, false);
        } else if (isNotEmpty2) {
            String e2 = mo122915e();
            Log.m165389i(e2, "partly completly load missingPos:" + list);
            iGetDataCallback.onSuccess(iVar);
            mo122910a(list, (IGetDataCallback<Boolean>) null);
            mo122913c();
        } else {
            Log.m165389i(mo122915e(), "no data back, get net data");
            C344292 r5 = new IGetDataCallback<AbstractC33964i<T>>() {
                /* class com.ss.android.lark.chatbase.p1688b.AbstractC34427a.C344292 */

                /* renamed from: a */
                public void onSuccess(AbstractC33964i<T> iVar) {
                    C29990c.m110930b().mo134577e().mo120972d(false);
                    PerfLog.end("chat_loadData_viaNetwork", "");
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onSuccess(iVar);
                    }
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    C29990c.m110930b().mo134577e().mo120972d(false);
                    PerfLog.end("chat_loadData_viaNetwork", "");
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(errorResult);
                    }
                }
            };
            C29990c.m110930b().mo134577e().mo120972d(true);
            PerfLog.start("chat_loadData_viaNetwork", "");
            if (mo122912b()) {
                m133536a(r5);
            } else {
                m133537a(true, (IGetDataCallback) r5);
            }
            m133538a(true, true, false, false);
        }
    }

    public AbstractC34427a(AbstractC33953b<T, PageData> bVar, AbstractC34417b<T, PageData> bVar2, Executor executor, Executor executor2, CallbackManager callbackManager) {
        this.f88890a = bVar;
        this.f88891b = bVar2;
        this.f88893d = executor;
        this.f88892c = executor2;
        this.f88894e = callbackManager;
    }
}
