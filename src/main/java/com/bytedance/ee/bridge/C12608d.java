package com.bytedance.ee.bridge;

import android.app.Activity;
import android.app.Application;
import android.text.TextUtils;
import com.bytedance.ee.log.C13479a;
import com.facebook.infer.annotation.C21045a;
import com.facebook.react.AbstractC21145j;
import com.facebook.react.AbstractC21146k;
import com.facebook.react.C21130g;
import com.facebook.react.C21143h;
import com.facebook.react.C21263n;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.p958c.C21106a;
import com.facebook.v8.reactexecutor.C21277a;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.bridge.d */
public class C12608d extends AbstractC21145j {

    /* renamed from: a */
    public NativeModuleCallExceptionHandler f33756a;

    /* renamed from: b */
    private boolean f33757b;

    /* renamed from: c */
    private String f33758c = "index.android";

    /* renamed from: d */
    private String f33759d = "index.android.jsbundle";

    /* renamed from: e */
    private String f33760e;

    /* renamed from: f */
    private Activity f33761f;

    /* renamed from: g */
    private Application f33762g;

    /* renamed from: h */
    private Set<String> f33763h = new HashSet();

    /* access modifiers changed from: protected */
    @Override // com.facebook.react.AbstractC21145j
    /* renamed from: c */
    public String mo47906c() {
        return this.f33758c;
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.react.AbstractC21145j
    /* renamed from: f */
    public JavaScriptExecutorFactory mo47911f() {
        return new C21277a();
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.react.AbstractC21145j
    /* renamed from: b */
    public List<AbstractC21146k> mo47904b() {
        return Arrays.asList(new C21106a(), new C12599b(), new C12601c());
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.react.AbstractC21145j
    @Nullable
    /* renamed from: d */
    public String mo47908d() {
        C13479a.m54764b("RNBridge->ReactNativeRuntime", "getBundleAssetName: " + this.f33759d);
        return this.f33759d;
    }

    @Override // com.facebook.react.AbstractC21145j
    /* renamed from: a */
    public boolean mo47903a() {
        return this.f33757b;
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.react.AbstractC21145j
    @Nullable
    /* renamed from: e */
    public String mo47910e() {
        if (!TextUtils.isEmpty(this.f33760e)) {
            File file = new File(this.f33760e);
            boolean isFile = file.isFile();
            boolean exists = file.exists();
            if (isFile && exists) {
                return this.f33760e;
            }
            C13479a.m54764b("RNBridge->ReactNativeRuntime", "bundleIsFile: " + isFile + "->bundleFileIsExists: " + exists);
            return null;
        }
        C13479a.m54764b("RNBridge->ReactNativeRuntime", "bundleFilePathIsEmpty");
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.react.AbstractC21145j
    /* renamed from: g */
    public C21130g mo47912g() {
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_REACT_INSTANCE_MANAGER_START);
        C21143h a = C21130g.m76807a().mo71845a(this.f33762g).mo71856c(mo47906c()).mo71854a(mo47903a()).mo71851a(mo71860j()).mo71848a(mo47911f()).mo71847a(mo71861k()).mo71850a(LifecycleState.BEFORE_CREATE);
        if (!mo47903a()) {
            a.mo71849a(new NativeModuleCallExceptionHandler() {
                /* class com.bytedance.ee.bridge.C12608d.C126091 */

                @Override // com.facebook.react.bridge.NativeModuleCallExceptionHandler
                public void handleException(Exception exc) {
                    if (C12608d.this.f33756a != null) {
                        C12608d.this.f33756a.handleException(exc);
                    }
                    C13479a.m54759a("RNBridge->ReactNativeRuntime", "rn js call exception", exc);
                }
            });
        }
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
        Activity activity = this.f33761f;
        if (activity != null) {
            a2.mo71821a(activity);
        }
        return a2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo47899a(Activity activity) {
        this.f33761f = activity;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo47900a(NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler) {
        if (nativeModuleCallExceptionHandler != null) {
            this.f33756a = nativeModuleCallExceptionHandler;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo47901a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f33758c = str;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo47905b(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f33759d = str;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo47907c(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f33760e = str;
        }
    }

    protected C12608d(Application application) {
        super(application);
        this.f33762g = application;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo47902a(boolean z) {
        this.f33757b = z;
    }

    /* renamed from: d */
    public void mo47909d(String str) {
        if (this.f33763h.contains(str)) {
            C13479a.m54764b("RNBridge->ReactNativeRuntime", "addMultibundler return  path: " + str);
            return;
        }
        C21263n.m77063a(str, C21263n.m77062a(this), str, false);
        this.f33763h.add(str);
    }
}
