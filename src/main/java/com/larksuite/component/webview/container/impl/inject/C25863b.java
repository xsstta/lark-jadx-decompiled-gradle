package com.larksuite.component.webview.container.impl.inject;

import android.text.TextUtils;
import com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate;
import com.larksuite.component.webview.container.impl.jsapi.InjectJSApiWrapper;
import com.larksuite.component.webview.container.impl.queryapi.InjectQueryApiWrapper;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;

/* renamed from: com.larksuite.component.webview.container.impl.inject.b */
public class C25863b {

    /* renamed from: a */
    volatile boolean f63985a = true;

    /* renamed from: b */
    volatile Object f63986b = new Object();

    /* renamed from: c */
    private String f63987c;

    /* renamed from: d */
    private ArrayList<InjectJSApiWrapper> f63988d = new ArrayList<>();

    /* renamed from: e */
    private ArrayList<InjectQueryApiWrapper> f63989e = new ArrayList<>();

    /* renamed from: f */
    private AbstractInjectWebViewDelegate f63990f;

    /* renamed from: b */
    public ArrayList<InjectJSApiWrapper> mo92005b() {
        return this.f63988d;
    }

    /* renamed from: c */
    public ArrayList<InjectQueryApiWrapper> mo92006c() {
        return this.f63989e;
    }

    /* renamed from: d */
    public AbstractInjectWebViewDelegate mo92007d() {
        return this.f63990f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo92001a() {
        synchronized (this.f63986b) {
            this.f63985a = false;
            this.f63986b.notifyAll();
        }
    }

    C25863b(String str) {
        this.f63987c = str;
    }

    /* renamed from: a */
    public void mo92002a(AbstractInjectWebViewDelegate abstractInjectWebViewDelegate) {
        if (abstractInjectWebViewDelegate == null) {
            Log.m165389i("FeatureInjectData", "registerWebViewDelegate with empty data");
        } else {
            this.f63990f = abstractInjectWebViewDelegate;
        }
    }

    /* renamed from: a */
    public void mo92003a(InjectJSApiWrapper injectJSApiWrapper) {
        if (injectJSApiWrapper == null || TextUtils.isEmpty(injectJSApiWrapper.f63993a) || injectJSApiWrapper.f63994b == null) {
            Log.m165389i("FeatureInjectData", "registerJSApiHandler with empty data");
        } else {
            this.f63988d.add(injectJSApiWrapper);
        }
    }

    /* renamed from: a */
    public void mo92004a(InjectQueryApiWrapper injectQueryApiWrapper) {
        if (injectQueryApiWrapper == null || TextUtils.isEmpty(injectQueryApiWrapper.f64003a) || injectQueryApiWrapper.f64004b == null) {
            Log.m165389i("FeatureInjectData", "registerQueryApiHandler with empty data");
        } else {
            this.f63989e.add(injectQueryApiWrapper);
        }
    }
}
