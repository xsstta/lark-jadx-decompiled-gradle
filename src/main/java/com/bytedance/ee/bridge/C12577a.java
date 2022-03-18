package com.bytedance.ee.bridge;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.bytedance.ee.bridge.connectormodule.C12603a;
import com.bytedance.ee.bridge.connectormodule.C12606b;
import com.facebook.react.C21130g;
import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import com.facebook.react.bridge.ReactContext;
import com.facebook.soloader.SoLoader;

/* renamed from: com.bytedance.ee.bridge.a */
public final class C12577a {

    /* renamed from: a */
    public ReactContext f33688a;

    /* renamed from: b */
    public C12603a f33689b;

    /* renamed from: c */
    private final C12608d f33690c;

    /* renamed from: d */
    private final Context f33691d;

    /* renamed from: com.bytedance.ee.bridge.a$a */
    public interface AbstractC12579a {
        /* renamed from: a */
        void mo47824a();
    }

    /* renamed from: a */
    public C12603a mo47817a() {
        return this.f33689b;
    }

    /* renamed from: c */
    public void mo47822c() {
        this.f33688a = null;
        this.f33690c.mo71858h().mo71830g();
    }

    /* renamed from: b */
    public void mo47821b() {
        if (this.f33690c.mo71859i() && this.f33690c.mo47903a()) {
            this.f33690c.mo71858h().mo71831h();
        }
    }

    /* renamed from: com.bytedance.ee.bridge.a$b */
    public static class C12580b {

        /* renamed from: a */
        public boolean f33694a;

        /* renamed from: b */
        public Application f33695b;

        /* renamed from: c */
        public Activity f33696c;

        /* renamed from: d */
        public String f33697d;

        /* renamed from: e */
        public String f33698e;

        /* renamed from: f */
        public String f33699f;

        /* renamed from: g */
        public NativeModuleCallExceptionHandler f33700g;

        /* renamed from: a */
        public C12577a mo47829a() {
            return new C12577a(this);
        }

        /* renamed from: a */
        public C12580b mo47825a(Application application) {
            this.f33695b = application;
            return this;
        }

        /* renamed from: b */
        public C12580b mo47830b(String str) {
            this.f33698e = str;
            return this;
        }

        /* renamed from: a */
        public C12580b mo47826a(NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler) {
            this.f33700g = nativeModuleCallExceptionHandler;
            return this;
        }

        /* renamed from: a */
        public C12580b mo47827a(String str) {
            this.f33697d = str;
            return this;
        }

        /* renamed from: a */
        public C12580b mo47828a(boolean z) {
            this.f33694a = z;
            return this;
        }
    }

    /* renamed from: a */
    public void mo47820a(String str) {
        this.f33690c.mo47909d(str);
    }

    /* renamed from: a */
    public void mo47818a(Activity activity) {
        this.f33690c.mo71858h().mo71821a(activity);
    }

    /* renamed from: a */
    public void mo47819a(final AbstractC12579a aVar) {
        if (!this.f33690c.mo71858h().mo71828e()) {
            this.f33690c.mo71858h().mo71824a(new C21130g.AbstractC21142b() {
                /* class com.bytedance.ee.bridge.C12577a.C125781 */

                @Override // com.facebook.react.C21130g.AbstractC21142b
                /* renamed from: a */
                public void mo47823a(ReactContext reactContext) {
                    C12577a.this.f33688a = reactContext;
                    C12577a aVar = C12577a.this;
                    aVar.f33689b = new C12603a(aVar.f33688a);
                    aVar.mo47824a();
                }
            });
            this.f33690c.mo71858h().mo71826c();
        }
    }

    private C12577a(C12580b bVar) {
        Context applicationContext = bVar.f33695b.getApplicationContext();
        this.f33691d = applicationContext;
        C12608d dVar = new C12608d(bVar.f33695b);
        this.f33690c = dVar;
        dVar.mo47902a(bVar.f33694a);
        dVar.mo47899a(bVar.f33696c);
        dVar.mo47905b(bVar.f33697d);
        dVar.mo47907c(bVar.f33698e);
        dVar.mo47901a(bVar.f33699f);
        dVar.mo47900a(bVar.f33700g);
        C12606b.f33750a = bVar.f33694a;
        C12606b.f33752c = bVar.f33694a;
        C12606b.f33754e = bVar.f33694a;
        SoLoader.init(applicationContext, false);
    }
}
