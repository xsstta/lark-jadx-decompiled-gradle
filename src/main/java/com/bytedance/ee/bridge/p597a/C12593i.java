package com.bytedance.ee.bridge.p597a;

import android.app.Activity;
import android.app.Application;
import com.bytedance.ee.bridge.C12577a;
import com.bytedance.ee.bridge.p597a.C12586f;
import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import java.util.Objects;

/* renamed from: com.bytedance.ee.bridge.a.i */
public class C12593i {

    /* renamed from: a */
    private C12586f f33721a;

    /* renamed from: b */
    private long f33722b;

    /* renamed from: c */
    private long f33723c;

    /* renamed from: d */
    private AbstractC12585e f33724d;

    /* renamed from: e */
    private AbstractC12585e f33725e;

    /* renamed from: f */
    private AbstractC12584d f33726f;

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public AbstractC12584d mo47865c() {
        return this.f33726f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C12586f mo47866d() {
        return this.f33721a;
    }

    /* renamed from: e */
    public long mo47867e() {
        return this.f33722b;
    }

    /* renamed from: f */
    public long mo47868f() {
        return this.f33723c;
    }

    /* renamed from: b */
    public void mo47863b() {
        this.f33721a.mo47849c();
    }

    /* renamed from: g */
    public void mo47869g() {
        this.f33721a.mo47851d();
    }

    /* renamed from: a */
    public void mo47859a() {
        this.f33721a.mo47846b();
    }

    /* renamed from: com.bytedance.ee.bridge.a.i$a */
    public static class C12595a {

        /* renamed from: a */
        public boolean f33727a;

        /* renamed from: b */
        public Application f33728b;

        /* renamed from: c */
        public long f33729c = 6000;

        /* renamed from: d */
        public long f33730d = 20000;

        /* renamed from: e */
        public String f33731e;

        /* renamed from: f */
        public AbstractC12585e f33732f;

        /* renamed from: g */
        public AbstractC12585e f33733g;

        /* renamed from: h */
        public AbstractC12584d f33734h;

        /* renamed from: i */
        public String f33735i;

        /* renamed from: j */
        public NativeModuleCallExceptionHandler f33736j;

        /* renamed from: a */
        public C12593i mo47875a() {
            return new C12593i(this);
        }

        /* renamed from: a */
        public C12595a mo47870a(Application application) {
            this.f33728b = application;
            return this;
        }

        /* renamed from: b */
        public C12595a mo47876b(AbstractC12585e eVar) {
            this.f33733g = eVar;
            return this;
        }

        /* renamed from: a */
        public C12595a mo47871a(AbstractC12585e eVar) {
            this.f33732f = eVar;
            return this;
        }

        /* renamed from: a */
        public C12595a mo47872a(NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler) {
            this.f33736j = nativeModuleCallExceptionHandler;
            return this;
        }

        /* renamed from: a */
        public C12595a mo47873a(String str) {
            this.f33731e = str;
            return this;
        }

        /* renamed from: a */
        public C12595a mo47874a(boolean z) {
            this.f33727a = z;
            return this;
        }
    }

    /* renamed from: a */
    private void m52278a(Object obj) {
        Objects.requireNonNull(obj, "jsclient build npe");
    }

    /* renamed from: a */
    public AbstractC12583c mo47858a(AbstractC12581a aVar) {
        return new C12590g(this, aVar);
    }

    /* renamed from: b */
    public void mo47864b(C12586f.AbstractC12589a aVar) {
        this.f33721a.mo47847b(aVar);
    }

    /* renamed from: a */
    public void mo47860a(Activity activity) {
        this.f33721a.mo47841a(activity);
    }

    private C12593i(C12595a aVar) {
        m52278a(aVar.f33732f);
        m52278a(aVar.f33728b);
        this.f33722b = aVar.f33729c;
        this.f33723c = aVar.f33730d;
        C12577a.C12580b bVar = new C12577a.C12580b();
        bVar.mo47825a(aVar.f33728b);
        bVar.mo47828a(aVar.f33727a);
        bVar.mo47830b(aVar.f33731e);
        bVar.mo47827a(aVar.f33735i);
        bVar.mo47826a(aVar.f33736j);
        this.f33724d = aVar.f33732f;
        this.f33725e = aVar.f33733g;
        if (aVar.f33734h == null) {
            this.f33726f = new C12596j();
        } else {
            this.f33726f = aVar.f33734h;
        }
        this.f33721a = new C12586f(bVar.mo47829a(), new C12598l(), this.f33724d, this.f33725e);
    }

    /* renamed from: a */
    public void mo47861a(C12586f.AbstractC12589a aVar) {
        this.f33721a.mo47843a(aVar);
    }

    /* renamed from: a */
    public void mo47862a(String str) {
        this.f33721a.mo47844a(str);
    }
}
