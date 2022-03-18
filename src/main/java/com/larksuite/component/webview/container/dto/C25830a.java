package com.larksuite.component.webview.container.dto;

import android.text.TextUtils;
import com.larksuite.component.webview.container.impl.jsapi.InjectJSApiWrapper;
import com.larksuite.component.webview.container.impl.queryapi.InjectQueryApiWrapper;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.UUID;

/* renamed from: com.larksuite.component.webview.container.dto.a */
public class C25830a {

    /* renamed from: a */
    ArrayList<InjectJSApiWrapper> f63897a;

    /* renamed from: b */
    ArrayList<InjectQueryApiWrapper> f63898b;

    /* renamed from: c */
    AbstractInjectWebViewDelegate f63899c;

    /* renamed from: d */
    private String f63900d;

    /* renamed from: e */
    private boolean f63901e;

    /* renamed from: a */
    public String mo91894a() {
        return this.f63900d;
    }

    /* renamed from: b */
    public boolean mo91897b() {
        return this.f63901e;
    }

    /* renamed from: c */
    public AbstractInjectWebViewDelegate mo91898c() {
        return this.f63899c;
    }

    /* renamed from: d */
    public ArrayList<InjectJSApiWrapper> mo91899d() {
        return this.f63897a;
    }

    /* renamed from: e */
    public ArrayList<InjectQueryApiWrapper> mo91900e() {
        return this.f63898b;
    }

    public C25830a() {
        this(true);
    }

    /* renamed from: a */
    public void mo91895a(boolean z) {
        this.f63901e = z;
    }

    /* renamed from: a */
    public C25830a mo91890a(AbstractInjectWebViewDelegate abstractInjectWebViewDelegate) {
        if (abstractInjectWebViewDelegate == null) {
            Log.m165383e("FeatureInjector", "setWebViewDelegate error, empty viewDelegate.");
            return this;
        }
        this.f63899c = abstractInjectWebViewDelegate;
        return this;
    }

    /* renamed from: a */
    public C25830a mo91893a(ArrayList<InjectJSApiWrapper> arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            Log.m165383e("FeatureInjector", "setJSApiHandler error, empty list data.");
            return this;
        }
        this.f63897a.clear();
        this.f63897a.addAll(arrayList);
        return this;
    }

    /* renamed from: b */
    public C25830a mo91896b(ArrayList<InjectQueryApiWrapper> arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            Log.m165383e("FeatureInjector", "setJSApiHandler error, empty list data.");
            return this;
        }
        this.f63898b.clear();
        this.f63898b.addAll(arrayList);
        return this;
    }

    public C25830a(boolean z) {
        this.f63901e = true;
        this.f63897a = new ArrayList<>();
        this.f63898b = new ArrayList<>();
        this.f63900d = UUID.randomUUID().toString();
        this.f63901e = z;
    }

    /* renamed from: a */
    public C25830a mo91891a(String str, AbstractInjectJSApiHandler abstractInjectJSApiHandler) {
        if (TextUtils.isEmpty(str) || abstractInjectJSApiHandler == null) {
            Log.m165383e("FeatureInjector", "addJSApiHandler error, empty data. name is " + str);
            return this;
        }
        this.f63897a.add(new InjectJSApiWrapper(str, abstractInjectJSApiHandler));
        return this;
    }

    /* renamed from: a */
    public C25830a mo91892a(String str, AbstractInjectQueryApiHandler abstractInjectQueryApiHandler) {
        if (TextUtils.isEmpty(str) || abstractInjectQueryApiHandler == null) {
            Log.m165383e("FeatureInjector", "addQueryApiHandler error, empty data. name is " + str);
            return this;
        }
        this.f63898b.add(new InjectQueryApiWrapper(str, abstractInjectQueryApiHandler));
        return this;
    }
}
