package com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.larksuite.framework.ui.dragger.AbstractC26202c;
import com.larksuite.framework.ui.dragger.C26201b;

/* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.d */
public class C30126d extends C30148m<C30125c> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo108624a(C26201b bVar, C30125c cVar) {
        mo108712b(bVar, (C30132j) cVar);
        mo108637a((AbstractC26202c) bVar, (C30132j) cVar, ((FrameLayout.LayoutParams) cVar.getLayoutParams()).topMargin);
        AbstractC30154s sVar = (AbstractC30154s) mo108603a(AbstractC30154s.class);
        if (sVar != null) {
            sVar.mo108683a((ViewGroup) cVar.getParent(), cVar);
        }
    }
}
