package com.bytedance.ee.bear.document;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.browser.AbstractC4931i;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.document.toolbar.editpanels.C6215b;
import com.bytedance.ee.bear.jsbridge.IBridge;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;

/* renamed from: com.bytedance.ee.bear.document.s */
public class C6095s extends C4933k implements WebEditorAbility {

    /* renamed from: b */
    private DocViewModel f16978b;

    /* renamed from: c */
    private C6215b f16979c;

    /* renamed from: d */
    private aj f16980d;

    /* renamed from: e */
    private C10917c f16981e;

    /* renamed from: f */
    private AbstractC5887o f16982f;

    /* renamed from: l */
    public aj mo24597l() {
        return this.f16980d;
    }

    /* renamed from: m */
    public DocViewModel mo24598m() {
        return this.f16978b;
    }

    /* renamed from: n */
    public C6215b mo24599n() {
        return this.f16979c;
    }

    @Override // com.bytedance.ee.bear.document.EditorAbility
    /* renamed from: o */
    public AbstractC5887o mo24600o() {
        return this.f16982f;
    }

    @Override // com.bytedance.ee.bear.document.EditorAbility
    /* renamed from: q */
    public DocumentMetadata mo24602q() {
        return this.f16978b;
    }

    @Override // com.bytedance.ee.bear.document.WebEditorAbility, com.bytedance.ee.bear.browser.C4933k
    /* renamed from: b */
    public AbstractC4931i mo19448b() {
        return super.mo19448b();
    }

    @Override // com.bytedance.ee.bear.document.EditorAbility
    /* renamed from: r */
    public View mo24603r() {
        return super.mo19448b().mo19435b();
    }

    @Override // com.bytedance.ee.bear.browser.BridgeHolder
    /* renamed from: a */
    public IBridge mo19354a() {
        return mo19448b().mo19440c();
    }

    /* renamed from: p */
    public C10917c mo24601p() {
        if (this.f16981e == null) {
            this.f16981e = new C10917c(new C10929e());
        }
        return this.f16981e;
    }

    /* renamed from: a */
    public void mo24594a(DocViewModel docViewModel) {
        this.f16978b = docViewModel;
    }

    public C6095s(AbstractC4931i iVar) {
        super(iVar);
        mo19545a(this);
    }

    /* renamed from: a */
    public void mo24595a(aj ajVar) {
        this.f16980d = ajVar;
    }

    /* renamed from: a */
    private void m24634a(FragmentActivity fragmentActivity) {
        this.f16979c = (C6215b) aj.m5366a(fragmentActivity).mo6005a(C6215b.class);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.browser.plugin.C4943e
    /* renamed from: a */
    public void mo19544a(C4943e.AbstractC4944a aVar) {
        m24634a(aVar.getActivity());
        super.mo19544a(aVar);
    }

    /* renamed from: a */
    public void mo24596a(AbstractC5887o oVar) {
        this.f16982f = oVar;
    }
}
