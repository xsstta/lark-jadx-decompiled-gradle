package com.ss.android.lark.threadmergeforward;

import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.threaddetail.view.C55906d;
import com.ss.android.lark.threaddetail.view.p2755c.C55905a;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.lark.threadmergeforward.b */
class C55959b extends C55906d {
    C55959b() {
    }

    @Override // com.ss.android.lark.threaddetail.view.C55906d, com.ss.android.lark.threaddetail.view.AbstractC55904c
    /* renamed from: a */
    public void mo190568a(List<C55905a> list, boolean z) {
        boolean z2;
        if (CollectionUtils.isNotEmpty(list)) {
            Iterator<C55905a> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!it.next().mo190601g()) {
                        z2 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z2 = false;
        if (z2) {
            C55905a aVar = new C55905a();
            aVar.mo190588b(true);
            list.add(aVar);
            C55905a aVar2 = new C55905a();
            aVar2.mo190592c(true);
            list.add(aVar2);
        } else {
            C55905a aVar3 = new C55905a();
            aVar3.mo190592c(true);
            list.add(aVar3);
        }
        this.f138126a.mo7376a(list);
    }
}
