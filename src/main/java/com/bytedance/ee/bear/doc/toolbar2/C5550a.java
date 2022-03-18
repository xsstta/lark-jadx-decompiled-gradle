package com.bytedance.ee.bear.doc.toolbar2;

import android.os.Bundle;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.doc.toolbar.C5544b;
import com.bytedance.ee.bear.document.model.toolbar.DocToolbarV2;
import com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7603a;
import com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7616f;
import com.bytedance.ee.bear.edit.component.toolbar2.C7645l;
import kotlin.jvm.functions.Function0;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.doc.toolbar2.a */
public class C5550a extends AbstractC7603a {

    /* renamed from: a */
    static final /* synthetic */ boolean f15778a;

    /* renamed from: h */
    private C5544b f15779h;

    /* access modifiers changed from: public */
    /* renamed from: f */
    private /* synthetic */ DefinitionParameters m22530f() {
        return new DefinitionParameters(this);
    }

    @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7610d
    /* renamed from: a */
    public AbstractC7616f<DocToolbarV2> mo22161a() {
        if (f15778a || getActivity() != null) {
            return (AbstractC7616f) C4950k.m20474a(this, C7645l.class);
        }
        throw new AssertionError();
    }

    @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7603a
    /* renamed from: a */
    public void mo22162a(String str) {
        C5544b bVar = this.f15779h;
        if (bVar != null) {
            bVar.mo22137a(str);
        }
    }

    @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7603a
    /* renamed from: b */
    public void mo22163b(String str) {
        C5544b bVar = this.f15779h;
        if (bVar != null) {
            bVar.mo22138b(str);
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7610d, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f15779h = (C5544b) KoinJavaComponent.m268612a(C5544b.class, null, new Function0() {
            /* class com.bytedance.ee.bear.doc.toolbar2.$$Lambda$a$zAYxfp2dLSstJ1_R2w7M5Uz45G8 */

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5550a.lambda$zAYxfp2dLSstJ1_R2w7M5Uz45G8(C5550a.this);
            }
        });
    }
}
