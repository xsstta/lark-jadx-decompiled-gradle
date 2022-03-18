package com.bytedance.ee.bear.todocenter.ui.p565a;

import com.chad.library.adapter.base.entity.AbstractC20929b;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.todocenter.ui.a.a */
public class C11727a {
    /* renamed from: a */
    public static boolean m48642a(Object obj) {
        if (obj == null || !(obj instanceof AbstractC20929b)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m48641a(AbstractC20929b bVar) {
        List subItems;
        if (bVar == null || (subItems = bVar.getSubItems()) == null || subItems.size() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static AbstractC20929b m48643b(List list, int i) {
        Object obj = list.get(i);
        if (m48642a(obj)) {
            return (AbstractC20929b) obj;
        }
        return null;
    }

    /* renamed from: a */
    public static void m48640a(List list, int i) {
        AbstractC20929b b = m48643b(list, i);
        if (b != null) {
            List subItems = b.getSubItems();
            int i2 = i + 1;
            list.addAll(i2, subItems);
            m48639a(list, i2, subItems);
            b.setExpanded(true);
        }
    }

    /* renamed from: a */
    private static int m48639a(List list, int i, List list2) {
        int size = list2.size();
        int size2 = (i + list2.size()) - 1;
        int size3 = list2.size() - 1;
        while (size3 >= 0) {
            if (list2.get(size3) instanceof AbstractC20929b) {
                AbstractC20929b bVar = (AbstractC20929b) list2.get(size3);
                if (bVar.isExpanded() && m48641a(bVar)) {
                    List subItems = bVar.getSubItems();
                    int i2 = size2 + 1;
                    list.addAll(i2, subItems);
                    size += m48639a(list, i2, subItems);
                }
            }
            size3--;
            size2--;
        }
        return size;
    }
}
