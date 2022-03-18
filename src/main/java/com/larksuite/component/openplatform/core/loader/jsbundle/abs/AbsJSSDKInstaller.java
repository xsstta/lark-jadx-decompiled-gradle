package com.larksuite.component.openplatform.core.loader.jsbundle.abs;

import android.content.Context;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract class AbsJSSDKInstaller {

    /* renamed from: a */
    protected AbstractC24537c f60458a;

    @Retention(RetentionPolicy.SOURCE)
    public @interface InstallFrom {
    }

    /* renamed from: com.larksuite.component.openplatform.core.loader.jsbundle.abs.AbsJSSDKInstaller$a */
    public interface AbstractC24521a {
        /* renamed from: a */
        void mo87398a(long j, boolean z);

        /* renamed from: a */
        void mo87399a(String str, String str2);
    }

    /* renamed from: a */
    public abstract void mo87394a(Context context, File file, String str, AbstractC24521a aVar);

    /* renamed from: com.larksuite.component.openplatform.core.loader.jsbundle.abs.AbsJSSDKInstaller$b */
    public static class C24522b {

        /* renamed from: a */
        public static final C24522b f60459a = new C24522b("10000", "unknown install error! ");

        /* renamed from: b */
        public static final C24522b f60460b = new C24522b("10001", "download file not exist!");

        /* renamed from: c */
        public static final C24522b f60461c = new C24522b("10100", "un zip failed!");

        /* renamed from: d */
        private String f60462d;

        /* renamed from: e */
        private String f60463e;

        /* renamed from: a */
        public String mo87400a() {
            return this.f60463e;
        }

        /* renamed from: b */
        public String mo87401b() {
            return this.f60462d;
        }

        public C24522b(String str, String str2) {
            this.f60462d = str;
            this.f60463e = str2;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public long mo87397b() {
        return this.f60458a.mo87437c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public File mo87396a() {
        return this.f60458a.mo87435b();
    }

    public AbsJSSDKInstaller(AbstractC24537c cVar) {
        this.f60458a = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public long mo87395a(Context context, File file) {
        return this.f60458a.mo87427a(context, file);
    }
}
