package com.ss.android.lark.desktopmode.p1788b.p1789a;

import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.desktopmode.p1788b.p1792d.AbstractC36551c;

/* renamed from: com.ss.android.lark.desktopmode.b.a.d */
public class C36535d {

    /* renamed from: a */
    private AbstractC36551c f94074a;

    /* renamed from: a */
    public void mo134862a() {
        this.f94074a.mo134898b();
    }

    public C36535d(AbstractC36551c cVar) {
        this.f94074a = cVar;
    }

    /* renamed from: a */
    public void mo134863a(C36516a aVar) {
        if (!(aVar.getFragmentParams() instanceof FloatWindowParams)) {
            return;
        }
        if (((FloatWindowParams) aVar.getFragmentParams()).getFloatTag() == null) {
            this.f94074a.mo134906f(aVar);
        } else {
            this.f94074a.mo134907g(aVar);
        }
    }

    /* renamed from: b */
    public void mo134864b(C36516a aVar) {
        if (aVar == null || !(aVar.getFragmentParams() instanceof FloatWindowParams)) {
            return;
        }
        if (((FloatWindowParams) aVar.getFragmentParams()).getFloatTag() == null) {
            this.f94074a.mo134902c(aVar.getFragmentInfoId());
        } else {
            this.f94074a.mo134908h(aVar);
        }
    }
}
