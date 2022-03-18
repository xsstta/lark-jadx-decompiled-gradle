package com.larksuite.component.webview.container.impl.inject;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.larksuite.component.webview.container.dto.AbstractC25831b;
import com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate;
import com.larksuite.component.webview.container.dto.C25830a;
import com.larksuite.component.webview.container.dto.IWebContainerContract;
import com.larksuite.component.webview.container.impl.jsapi.InjectJSApiWrapper;
import com.larksuite.component.webview.container.impl.mvp.InjectWebViewDelegateWrapper;
import com.larksuite.component.webview.container.impl.queryapi.InjectQueryApiWrapper;
import com.larksuite.component.webview.container.p1169a.C25821b;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26252ad;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.log.Log;
import ee.android.framework.manis.C68183b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;

/* renamed from: com.larksuite.component.webview.container.impl.inject.c */
public class C25864c implements AbstractC25867d {

    /* renamed from: a */
    private ConcurrentHashMap<String, C25863b> f63991a;

    /* access modifiers changed from: private */
    /* renamed from: com.larksuite.component.webview.container.impl.inject.c$a */
    public static class C25866a {

        /* renamed from: a */
        public static C25864c f63992a = new C25864c();
    }

    /* renamed from: a */
    public static AbstractC25831b m93607a() {
        return C25866a.f63992a;
    }

    @Override // com.larksuite.component.webview.container.impl.inject.AbstractC25867d
    /* renamed from: a */
    public void mo92012a(boolean z, Bundle bundle, Bundle bundle2) {
        C25863b a = mo92008a(bundle2);
        if (a != null) {
            C25830a aVar = new C25830a(z);
            aVar.mo91893a(a.mo92005b());
            aVar.mo91896b(a.mo92006c());
            aVar.mo91890a(a.mo92007d());
            mo91901a(bundle, aVar);
        }
    }

    @Override // com.larksuite.component.webview.container.impl.inject.AbstractC25867d
    /* renamed from: a */
    public void mo92011a(C25862a aVar, Activity activity, Fragment fragment, ConcurrentHashMap<String, Object> concurrentHashMap, IWebContainerContract.IWebContainerView iWebContainerView, IWebContainerContract.AbstractC25826a aVar2) {
        if (aVar != null) {
            aVar.mo91989a(activity);
            aVar.mo91994b(fragment);
            aVar.mo91993a(concurrentHashMap);
            aVar.mo91990a(iWebContainerView);
            aVar.mo91991a(aVar2);
        }
    }

    private C25864c() {
        this.f63991a = new ConcurrentHashMap<>();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m93609a(C25830a aVar) {
        m93608a(C25821b.m93347a().mo91844a(), aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m93612b(Future future) {
        if (future != null && !future.isDone()) {
            future.cancel(true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m93611a(Future future) {
        if (future != null && !future.isDone()) {
            future.cancel(true);
        }
    }

    @Override // com.larksuite.component.webview.container.impl.inject.AbstractC25867d
    /* renamed from: b */
    public C25863b mo92013b(String str) {
        if (this.f63991a.containsKey(str)) {
            return this.f63991a.get(str);
        }
        return null;
    }

    @Override // com.larksuite.component.webview.container.impl.inject.AbstractC25867d
    /* renamed from: b */
    public void mo92014b(Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("feature_inject_session");
            if (!TextUtils.isEmpty(string)) {
                this.f63991a.remove(string);
            }
        }
    }

    @Override // com.larksuite.component.webview.container.impl.inject.AbstractC25867d
    /* renamed from: a */
    public C25863b mo92008a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String string = bundle.getString("feature_inject_session");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return mo92013b(string);
    }

    @Override // com.larksuite.component.webview.container.impl.inject.AbstractC25867d
    /* renamed from: a */
    public C25863b mo92009a(String str) {
        C25863b bVar;
        synchronized (this.f63991a) {
            if (this.f63991a.containsKey(str)) {
                bVar = this.f63991a.get(str);
            } else {
                C25863b bVar2 = new C25863b(str);
                this.f63991a.put(str, bVar2);
                bVar = bVar2;
            }
        }
        return bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m93610a(String str, IGetDataCallback iGetDataCallback) {
        C25863b a = mo92009a(str);
        if (a.f63985a) {
            try {
                synchronized (a.f63986b) {
                    a.f63986b.wait();
                }
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(a);
                }
            } catch (InterruptedException e) {
                Log.m165384e("FeatureInjectManager", "bindFeature occur InterruptedException", e);
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(new ErrorResult("bind inject data has been interrupted"));
                }
            }
        } else if (iGetDataCallback != null) {
            iGetDataCallback.onSuccess(a);
        }
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractC25831b
    /* renamed from: a */
    public Bundle mo91901a(Bundle bundle, C25830a aVar) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (aVar == null) {
            return bundle;
        }
        bundle.putString("feature_inject_session", aVar.mo91894a());
        CoreThreadPool.getBackgroundHandler().postDelayed(new Runnable(CoreThreadPool.getDefault().getFixedThreadPool().submit(new Runnable(aVar) {
            /* class com.larksuite.component.webview.container.impl.inject.$$Lambda$c$WOJX6GbtTFPUiRMqnb8RHYdWydQ */
            public final /* synthetic */ C25830a f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C25864c.this.m93609a((C25864c) this.f$1);
            }
        })) {
            /* class com.larksuite.component.webview.container.impl.inject.$$Lambda$c$KDFd2uj2AJi6RG9wGJFmjKC18 */
            public final /* synthetic */ Future f$0;

            {
                this.f$0 = r1;
            }

            public final void run() {
                C25864c.m93612b(this.f$0);
            }
        }, 5000);
        return bundle;
    }

    /* renamed from: a */
    private void m93608a(Context context, C25830a aVar) {
        IBrowserSubProcess iBrowserSubProcess;
        boolean z;
        AbstractInjectWebViewDelegate abstractInjectWebViewDelegate;
        if (!aVar.mo91897b() || "p0".equals(C26252ad.m94994c(context))) {
            z = true;
            iBrowserSubProcess = new BrowserSubProcessImpl(context);
        } else {
            iBrowserSubProcess = (IBrowserSubProcess) C68183b.m264839a().mo237086a(context, IBrowserSubProcess.class);
            z = false;
        }
        if (iBrowserSubProcess != null) {
            iBrowserSubProcess.startInjection(aVar.mo91894a());
            if (!CollectionUtils.isEmpty(aVar.mo91899d())) {
                ArrayList<InjectJSApiWrapper> arrayList = new ArrayList<>();
                Iterator<InjectJSApiWrapper> it = aVar.mo91899d().iterator();
                while (it.hasNext()) {
                    InjectJSApiWrapper next = it.next();
                    if (z) {
                        Parcel obtain = Parcel.obtain();
                        obtain.writeParcelable(next, 0);
                        obtain.setDataPosition(0);
                        next = (InjectJSApiWrapper) obtain.readParcelable(InjectJSApiWrapper.class.getClassLoader());
                        obtain.recycle();
                    }
                    arrayList.add(next);
                    if (arrayList.size() >= 10) {
                        iBrowserSubProcess.registerJSApiHandler(aVar.mo91894a(), arrayList);
                        arrayList = new ArrayList<>();
                    }
                }
                iBrowserSubProcess.registerJSApiHandler(aVar.mo91894a(), arrayList);
            }
            if (!CollectionUtils.isEmpty(aVar.mo91900e())) {
                ArrayList<InjectQueryApiWrapper> arrayList2 = new ArrayList<>();
                Iterator<InjectQueryApiWrapper> it2 = aVar.mo91900e().iterator();
                while (it2.hasNext()) {
                    InjectQueryApiWrapper next2 = it2.next();
                    if (z) {
                        Parcel obtain2 = Parcel.obtain();
                        obtain2.writeParcelable(next2, 0);
                        obtain2.setDataPosition(0);
                        next2 = (InjectQueryApiWrapper) obtain2.readParcelable(InjectQueryApiWrapper.class.getClassLoader());
                        obtain2.recycle();
                    }
                    arrayList2.add(next2);
                    if (arrayList2.size() >= 10) {
                        iBrowserSubProcess.registerQueryApiHandler(aVar.mo91894a(), arrayList2);
                        arrayList2 = new ArrayList<>();
                    }
                }
                iBrowserSubProcess.registerQueryApiHandler(aVar.mo91894a(), arrayList2);
            }
            if (aVar.mo91898c() != null) {
                if (z) {
                    Parcel obtain3 = Parcel.obtain();
                    obtain3.writeParcelable(aVar.mo91898c(), 0);
                    obtain3.setDataPosition(0);
                    abstractInjectWebViewDelegate = (AbstractInjectWebViewDelegate) obtain3.readParcelable(AbstractInjectWebViewDelegate.class.getClassLoader());
                    obtain3.recycle();
                } else {
                    abstractInjectWebViewDelegate = aVar.mo91898c();
                }
                iBrowserSubProcess.registerWebViewDelegate(aVar.mo91894a(), new InjectWebViewDelegateWrapper(abstractInjectWebViewDelegate));
            }
            iBrowserSubProcess.finishInjection(aVar.mo91894a());
        }
    }

    @Override // com.larksuite.component.webview.container.impl.inject.AbstractC25867d
    /* renamed from: a */
    public Future mo92010a(Bundle bundle, IGetDataCallback<C25863b> iGetDataCallback) {
        if (bundle == null) {
            return null;
        }
        String string = bundle.getString("feature_inject_session");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        Future<?> submit = CoreThreadPool.getDefault().getFixedThreadPool().submit(new Runnable(string, iGetDataCallback) {
            /* class com.larksuite.component.webview.container.impl.inject.$$Lambda$c$SBZ5t3C21MhjRdgazZ54QeArX98 */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ IGetDataCallback f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C25864c.this.m93610a((C25864c) this.f$1, (String) this.f$2);
            }
        });
        CoreThreadPool.getBackgroundHandler().postDelayed(new Runnable(submit) {
            /* class com.larksuite.component.webview.container.impl.inject.$$Lambda$c$QmOzVvytgpwQPJWX0nwUEmc1qKI */
            public final /* synthetic */ Future f$0;

            {
                this.f$0 = r1;
            }

            public final void run() {
                C25864c.m93611a(this.f$0);
            }
        }, 5000);
        return submit;
    }
}
