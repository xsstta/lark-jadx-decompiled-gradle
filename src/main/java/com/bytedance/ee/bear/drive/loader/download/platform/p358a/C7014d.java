package com.bytedance.ee.bear.drive.loader.download.platform.p358a;

import com.bytedance.ee.bear.drive.core.model.AbstractC6949c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.drive.loader.download.platform.a.d */
public class C7014d implements AbstractC7013c {
    @Override // com.bytedance.ee.bear.drive.loader.download.platform.p358a.AbstractC7013c
    /* renamed from: a */
    public List<Integer> mo27565a(AbstractC6949c cVar, List<Integer> list) {
        if (!(list instanceof ArrayList)) {
            list = new ArrayList(list);
        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            if (intValue == -1 || intValue == -3 || intValue == 13 || intValue == 17 || intValue == 21) {
                it.remove();
            }
        }
        if (!list.contains(-2)) {
            list.add(-2);
        }
        return list;
    }
}
