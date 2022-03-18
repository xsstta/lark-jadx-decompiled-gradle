package com.ss.android.lark.mail.impl.p2168g.p2169a;

import com.larksuite.framework.utils.CollectionUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.g.a.u */
public class C42144u<S, D> {
    /* renamed from: a */
    public List<D> mo152106a(List<S> list, AbstractC42142s<S, D> sVar) {
        ArrayList arrayList = new ArrayList();
        if (CollectionUtils.isEmpty(list)) {
            return arrayList;
        }
        for (S s : list) {
            if (C42113ab.m168091a(s.getClass().getName())) {
                arrayList.add(s);
            } else {
                arrayList.add(sVar.mo152042b(s, null));
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public List<S> mo152107b(List<D> list, AbstractC42142s<S, D> sVar) {
        ArrayList arrayList = new ArrayList();
        if (CollectionUtils.isEmpty(list)) {
            return arrayList;
        }
        for (D d : list) {
            if (C42113ab.m168091a(d.getClass().getName())) {
                arrayList.add(d);
            } else {
                arrayList.add(sVar.mo152040a(null, d));
            }
        }
        return arrayList;
    }
}
