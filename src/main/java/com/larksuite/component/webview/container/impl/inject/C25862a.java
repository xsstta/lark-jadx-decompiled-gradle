package com.larksuite.component.webview.container.impl.inject;

import android.app.Activity;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.larksuite.component.webview.container.dto.IWebContainerContract;
import com.larksuite.component.webview.container.p1169a.C25821b;
import com.larksuite.framework.utils.C26284k;
import com.ss.android.lark.log.Log;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.larksuite.component.webview.container.impl.inject.a */
public class C25862a {

    /* renamed from: a */
    private Activity f63980a;

    /* renamed from: b */
    private Fragment f63981b;

    /* renamed from: c */
    private IWebContainerContract.IWebContainerView f63982c;

    /* renamed from: d */
    private IWebContainerContract.AbstractC25826a f63983d;

    /* renamed from: e */
    private ConcurrentHashMap<String, Object> f63984e;

    /* renamed from: t */
    public boolean mo91996t() {
        IWebContainerContract.IWebContainerView iWebContainerView;
        if (this.f63980a == null || this.f63981b == null || (iWebContainerView = this.f63982c) == null || iWebContainerView.mo67314g() == null || this.f63983d == null) {
            return false;
        }
        return true;
    }

    /* renamed from: u */
    public final Activity mo91997u() {
        if (this.f63980a == null) {
            if (C25821b.m93347a().mo91844a() == null || !C26284k.m95185a(C25821b.m93347a().mo91844a())) {
                Log.m165383e("BaseInjectData", "call getActivity to early, should wait for finish init process");
            } else {
                throw new RuntimeException("call getActivity to early, check getActivity running time!");
            }
        }
        return this.f63980a;
    }

    /* renamed from: v */
    public final Fragment mo91998v() {
        if (this.f63981b == null) {
            if (C25821b.m93347a().mo91844a() == null || !C26284k.m95185a(C25821b.m93347a().mo91844a())) {
                Log.m165383e("BaseInjectData", "call getFragment to early, should wait for finish init process");
            } else {
                throw new RuntimeException("call getFragment to early, check getFragment running time!");
            }
        }
        return this.f63981b;
    }

    /* renamed from: w */
    public final IWebContainerContract.IWebContainerView mo91999w() {
        if (this.f63982c == null) {
            if (C25821b.m93347a().mo91844a() == null || !C26284k.m95185a(C25821b.m93347a().mo91844a())) {
                Log.m165383e("BaseInjectData", "call getWebContainerView to early, should wait for finish init process");
            } else {
                throw new RuntimeException("call getWebContainerView to early, check getWebContainerView running time!");
            }
        }
        return this.f63982c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final IWebContainerContract.AbstractC25826a mo92000x() {
        if (this.f63983d == null) {
            if (C25821b.m93347a().mo91844a() == null || !C26284k.m95185a(C25821b.m93347a().mo91844a())) {
                Log.m165383e("BaseInjectData", "call getWebContainerModel to early, should wait for finish init process");
            } else {
                throw new RuntimeException("call getWebContainerModel to early, check getWebContainerModel running time!");
            }
        }
        return this.f63983d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo91989a(Activity activity) {
        this.f63980a = activity;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo91994b(Fragment fragment) {
        this.f63981b = fragment;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo91990a(IWebContainerContract.IWebContainerView iWebContainerView) {
        this.f63982c = iWebContainerView;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo91991a(IWebContainerContract.AbstractC25826a aVar) {
        this.f63983d = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo91993a(ConcurrentHashMap<String, Object> concurrentHashMap) {
        if (concurrentHashMap == null) {
            Log.m165383e("BaseInjectData", "bindSessionDataPool error , pool is null");
        } else {
            this.f63984e = concurrentHashMap;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final <T> T mo91995c(String str) {
        if (this.f63984e == null) {
            if (C25821b.m93347a().mo91844a() == null || !C26284k.m95185a(C25821b.m93347a().mo91844a())) {
                Log.m165383e("BaseInjectData", "call getDataFromPool to early, should wait for finish init process");
            } else {
                throw new RuntimeException("call getDataFromPool to early, check getDataFromPool running time!");
            }
        }
        if (TextUtils.isEmpty(str)) {
            Log.m165397w("BaseInjectData", "call getDataFromPool cast Type failed , key is empty");
            return null;
        }
        try {
            return (T) this.f63984e.get(str);
        } catch (Exception e) {
            Log.m165384e("BaseInjectData", "call getDataFromPool cast Type failed , key is " + str, e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo91992a(String str, Object obj) {
        if (this.f63984e == null) {
            if (C25821b.m93347a().mo91844a() == null || !C26284k.m95185a(C25821b.m93347a().mo91844a())) {
                Log.m165383e("BaseInjectData", "call putDataFromPool to early, should wait for finish init process");
            } else {
                throw new RuntimeException("call putDataFromPool to early, check putDataFromPool running time!");
            }
        }
        if (TextUtils.isEmpty(str)) {
            Log.m165397w("BaseInjectData", "call putDataFromPool cast Type failed , key is empty");
            return;
        }
        if (this.f63984e.containsKey(str)) {
            Log.m165389i("BaseInjectData", "call putDataFromPool key " + str + " is exist");
        }
        this.f63984e.put(str, obj);
    }
}
