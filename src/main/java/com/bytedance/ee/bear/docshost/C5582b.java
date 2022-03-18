package com.bytedance.ee.bear.docshost;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ee.bear.contract.ak;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.log.C13479a;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;

/* renamed from: com.bytedance.ee.bear.docshost.b */
public class C5582b implements AbstractC5586d {

    /* renamed from: a */
    private C10917c f15826a = new C10917c(new C10929e());

    @Override // com.bytedance.ee.bear.docshost.AbstractC5586d
    /* renamed from: a */
    public boolean mo22259a() {
        return mo22260a("REMOVE_ORG");
    }

    @Override // com.bytedance.ee.bear.docshost.AbstractC5586d
    /* renamed from: b */
    public void mo22261b(String str) {
        Uri parse = Uri.parse(str);
        if (parse.isHierarchical()) {
            Uri.Builder fragment = new Uri.Builder().scheme(parse.getScheme()).authority(parse.getAuthority()).path(parse.getPath()).fragment(parse.getEncodedFragment());
            for (String str2 : parse.getQueryParameterNames()) {
                fragment.appendQueryParameter(str2, Uri.encode(parse.getQueryParameter(str2)));
            }
            str = fragment.build().toString();
        }
        this.f15826a.mo41508c(ak.class).mo238020d(new Function(new Uri.Builder().scheme("lark").authority("client").path("/web").appendQueryParameter("url", str).build()) {
            /* class com.bytedance.ee.bear.docshost.$$Lambda$b$jfGXJrNJ1Z7nF3mkjWGH0dWwmWs */
            public final /* synthetic */ Uri f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C5582b.m22599a(this.f$0, (ak) obj);
            }
        }).mo238001b($$Lambda$b$J4i0df4JKfORhF5LH707u3QNAE.INSTANCE, $$Lambda$b$8MjdSXxt6indGQJl43h71I1BL4s.INSTANCE);
    }

    /* renamed from: a */
    public boolean mo22260a(String str) {
        return ((Boolean) LoginIdentifyServiceImp.f15829b.mo22268b().mo22256a(str)).booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ String m22599a(Uri uri, ak akVar) throws Exception {
        akVar.openExternalUrl(uri.toString(), null);
        return "";
    }

    @Override // com.bytedance.ee.bear.docshost.AbstractC5586d
    /* renamed from: a */
    public Disposable mo22257a(String str, CharSequence charSequence) {
        return this.f15826a.mo41508c(ak.class).mo238020d(new Function(charSequence, str) {
            /* class com.bytedance.ee.bear.docshost.$$Lambda$b$U0yHEy_l3AV4qElYhCvYUwf5VW0 */
            public final /* synthetic */ CharSequence f$0;
            public final /* synthetic */ String f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C5582b.m22600a(this.f$0, this.f$1, (ak) obj);
            }
        }).mo238001b($$Lambda$b$ox3T8UgGnFGitCHgzmRD4LadGcQ.INSTANCE, $$Lambda$b$KmEoedSqkMqI_cP7Fr_0FoGQc.INSTANCE);
    }

    @Override // com.bytedance.ee.bear.docshost.AbstractC5586d
    /* renamed from: a */
    public void mo22258a(String str, float f) {
        C5590g.m22626a().mo22270a(str, f);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ String m22600a(CharSequence charSequence, String str, ak akVar) throws Exception {
        String str2;
        if (!TextUtils.isEmpty(charSequence)) {
            str2 = charSequence.toString();
        } else {
            str2 = null;
        }
        C13479a.m54772d("DocsHost", "goToProfileMain()... userid = " + str + ", title =" + str2);
        akVar.goToProfileMain(str, str2);
        return "";
    }
}
