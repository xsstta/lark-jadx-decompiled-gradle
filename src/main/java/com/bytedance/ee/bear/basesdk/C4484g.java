package com.bytedance.ee.bear.basesdk;

import android.text.TextUtils;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.contract.ao;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13615c;
import java.util.Locale;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.basesdk.g */
public class C4484g extends AbstractC4344a {

    /* renamed from: b */
    private String f13151b;

    /* renamed from: c */
    private AbstractC4483f f13152c;

    /* renamed from: d */
    private C1177w<String> f13153d;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.basesdk.g$a */
    public static class C4486a {

        /* renamed from: a */
        public static final ao f13154a = new C4484g();
    }

    /* renamed from: b */
    public static ao m18494b() {
        return C4486a.f13154a;
    }

    @Override // com.bytedance.ee.bear.contract.ao
    /* renamed from: e */
    public LiveData<String> mo17254e() {
        return this.f13153d;
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        mo16975a();
        super.finalize();
    }

    @Override // com.bytedance.ee.bear.contract.ao
    /* renamed from: c */
    public String mo17252c() {
        return m18495f().getLanguage();
    }

    private C4484g() {
        this.f13153d = new C1177w<>();
        this.f13152c = (AbstractC4483f) KoinJavaComponent.m268610a(AbstractC4483f.class);
        mo16976a(C13615c.f35773a);
    }

    /* renamed from: f */
    private Locale m18495f() {
        AbstractC4483f fVar = this.f13152c;
        if (fVar != null) {
            return fVar.mo17251a();
        }
        C13479a.m54759a("SdkLocaleServiceWrapper", "mLocalProvider == null", new Throwable());
        return Locale.ENGLISH;
    }

    @Override // com.bytedance.ee.bear.contract.ao
    /* renamed from: d */
    public Locale mo17253d() {
        Locale f = m18495f();
        String language = f.getLanguage();
        if (!TextUtils.equals(this.f13151b, language)) {
            this.f13151b = language;
            this.f13153d.mo5926a(language);
        }
        return f;
    }
}
