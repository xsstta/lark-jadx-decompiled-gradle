package com.bytedance.ee.bear.service;

import com.bytedance.ee.bear.service.base.AbstractC10913a;
import com.bytedance.ee.log.C13479a;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.bear.service.b */
public class C10911b {
    C10911b() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<AbstractC10913a> mo41495a(List<AbstractC10913a> list) {
        Class<?>[] b;
        LinkedList linkedList = new LinkedList();
        linkedList.addAll(list);
        C13479a.m54764b("DependenciesResolver", "sort: before --> " + linkedList);
        HashSet hashSet = new HashSet();
        while (hashSet.size() != linkedList.size()) {
            int i = 0;
            while (i < linkedList.size()) {
                AbstractC10913a aVar = (AbstractC10913a) linkedList.get(i);
                if (!hashSet.contains(aVar)) {
                    if (!(!(aVar instanceof AbstractC10933f) || (b = ((AbstractC10933f) aVar).mo16351b()) == null || b.length == 0)) {
                        for (int i2 = i + 1; i2 < linkedList.size(); i2++) {
                            AbstractC10913a aVar2 = (AbstractC10913a) linkedList.get(i2);
                            boolean z = false;
                            for (Class<?> cls : b) {
                                if (cls.isAssignableFrom(aVar2.getClass())) {
                                    z = true;
                                }
                            }
                            if (z) {
                                linkedList.remove(aVar2);
                                linkedList.add(i, aVar2);
                            }
                        }
                    }
                    hashSet.add(aVar);
                    if (aVar != linkedList.get(i)) {
                        i--;
                    }
                }
                i++;
            }
        }
        C13479a.m54764b("DependenciesResolver", "sort: after -> " + linkedList);
        return linkedList;
    }
}
