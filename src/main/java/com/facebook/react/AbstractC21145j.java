package com.facebook.react;

import android.app.Application;
import com.facebook.infer.annotation.C21045a;
import com.facebook.react.bridge.JSIModulePackage;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.devsupport.RedBoxHandler;
import java.util.List;

/* renamed from: com.facebook.react.j */
public abstract class AbstractC21145j {

    /* renamed from: a */
    private final Application f51577a;

    /* renamed from: b */
    private C21130g f51578b;

    /* renamed from: a */
    public abstract boolean mo47903a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract List<AbstractC21146k> mo47904b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo47906c() {
        return "index.android";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo47908d() {
        return "index.android.bundle";
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo47910e() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public JavaScriptExecutorFactory mo47911f() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public RedBoxHandler mo71860j() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public JSIModulePackage mo71861k() {
        return null;
    }

    /* renamed from: i */
    public boolean mo71859i() {
        if (this.f51578b != null) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public C21130g mo71858h() {
        if (this.f51578b == null) {
            ReactMarker.logMarker(ReactMarkerConstants.GET_REACT_INSTANCE_MANAGER_START);
            this.f51578b = mo47912g();
            ReactMarker.logMarker(ReactMarkerConstants.GET_REACT_INSTANCE_MANAGER_END);
        }
        return this.f51578b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C21130g mo47912g() {
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_REACT_INSTANCE_MANAGER_START);
        C21143h a = C21130g.m76807a().mo71845a(this.f51577a).mo71856c(mo47906c()).mo71854a(mo47903a()).mo71851a(mo71860j()).mo71848a(mo47911f()).mo71847a(mo71861k()).mo71850a(LifecycleState.BEFORE_CREATE);
        for (AbstractC21146k kVar : mo47904b()) {
            a.mo71852a(kVar);
        }
        String e = mo47910e();
        if (e != null) {
            a.mo71855b(e);
        } else {
            a.mo71853a((String) C21045a.m76676a(mo47908d()));
        }
        C21130g a2 = a.mo71844a();
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_REACT_INSTANCE_MANAGER_END);
        return a2;
    }

    protected AbstractC21145j(Application application) {
        this.f51577a = application;
    }
}
