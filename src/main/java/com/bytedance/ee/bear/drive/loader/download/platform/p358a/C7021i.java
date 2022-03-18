package com.bytedance.ee.bear.drive.loader.download.platform.p358a;

import com.bytedance.ee.bear.drive.common.C6892d;
import com.bytedance.ee.bear.drive.core.model.AbstractC6949c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.drive.loader.download.platform.a.i */
public class C7021i implements AbstractC7013c {
    @Override // com.bytedance.ee.bear.drive.loader.download.platform.p358a.AbstractC7013c
    /* renamed from: a */
    public List<Integer> mo27565a(AbstractC6949c cVar, List<Integer> list) {
        if (!(list instanceof ArrayList)) {
            list = new ArrayList(list);
        }
        if (C6892d.m27245c(cVar.mo27373c())) {
            list.remove((Object) -2);
        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().intValue() == 8) {
                it.remove();
            }
        }
        return list;
    }
}
