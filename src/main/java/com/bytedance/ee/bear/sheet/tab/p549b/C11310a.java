package com.bytedance.ee.bear.sheet.tab.p549b;

import android.content.res.Configuration;
import android.view.View;
import com.bytedance.ee.bear.sheet.tab.contract.ISheetTabModel;
import com.bytedance.ee.bear.sheet.tab.contract.ISheetTabView;
import com.bytedance.ee.util.p718t.C13749l;

/* renamed from: com.bytedance.ee.bear.sheet.tab.b.a */
public class C11310a {

    /* renamed from: a */
    private ISheetTabView f30411a;

    /* renamed from: b */
    private ISheetTabModel f30412b;

    /* renamed from: c */
    private boolean f30413c;

    /* renamed from: d */
    private boolean f30414d;

    /* renamed from: a */
    public ISheetTabView mo43340a() {
        return this.f30411a;
    }

    /* renamed from: b */
    public void mo43345b() {
        mo43340a().mo43331a();
    }

    /* renamed from: c */
    public void mo43346c() {
        mo43340a().mo43336b();
    }

    /* renamed from: a */
    public void mo43342a(View view) {
        mo43340a().mo43332a(view);
    }

    /* renamed from: a */
    public void mo43344a(ISheetTabView.Delegate aVar) {
        mo43340a().mo43333a(aVar);
    }

    /* renamed from: a */
    private void m47006a(boolean z) {
        mo43340a().mo43337b(z);
        mo43340a().mo43335a(z);
        mo43340a().mo43338c(z);
    }

    /* renamed from: a */
    public void mo43341a(Configuration configuration) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (configuration == null || 2 != configuration.orientation || this.f30414d) {
            z = false;
        } else {
            z = true;
        }
        this.f30413c = z;
        ISheetTabModel bVar = this.f30412b;
        if (bVar == null || !bVar.canEdit() || this.f30413c) {
            z2 = false;
        } else {
            z2 = true;
        }
        m47006a(z2);
        ISheetTabView a = mo43340a();
        if (!this.f30413c || C13749l.m55746a(configuration)) {
            z3 = false;
        }
        a.mo43339d(z3);
    }

    /* renamed from: a */
    public void mo43343a(ISheetTabModel bVar) {
        boolean z;
        this.f30412b = bVar;
        mo43340a().mo43334a(bVar.getSheetTabData());
        if (!bVar.canEdit() || this.f30413c) {
            z = false;
        } else {
            z = true;
        }
        m47006a(z);
    }

    public C11310a(ISheetTabView cVar, boolean z) {
        this.f30411a = cVar;
        this.f30414d = z;
    }
}
