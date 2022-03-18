package com.bytedance.ee.util.p702e;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.ee.util.e.d */
public class C13659d {

    /* renamed from: com.bytedance.ee.util.e.d$a */
    public interface AbstractC13660a<T> {
        boolean accept(T t);
    }

    /* renamed from: com.bytedance.ee.util.e.d$b */
    public interface AbstractC13661b<T> {
        void accept(T t);
    }

    /* renamed from: com.bytedance.ee.util.e.d$c */
    public interface AbstractC13662c<T, R> {
        R accept(T t);
    }

    /* renamed from: a */
    public static <T> List<T> m55429a(T t) {
        ArrayList arrayList = new ArrayList(1);
        if (t != null) {
            arrayList.add(t);
        }
        return arrayList;
    }

    /* renamed from: a */
    public static <T> List<T> m55430a(List<T> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        arrayList.addAll(list);
        list.clear();
        return arrayList;
    }

    /* renamed from: a */
    public static <T> int m55428a(List<T> list, AbstractC13660a<T> aVar) {
        if (!(list == null || aVar == null)) {
            for (int i = 0; i < list.size(); i++) {
                if (aVar.accept(list.get(i))) {
                    return i;
                }
            }
        }
        return -1;
    }

    /* renamed from: c */
    public static <T> T m55434c(List<T> list, AbstractC13660a<T> aVar) {
        if (!(list == null || aVar == null)) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                T next = it.next();
                if (aVar.accept(next)) {
                    it.remove();
                    return next;
                }
            }
        }
        return null;
    }

    /* renamed from: d */
    public static <T> boolean m55435d(List<T> list, AbstractC13660a<T> aVar) {
        if (!(list == null || aVar == null)) {
            for (T t : list) {
                if (aVar.accept(t)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public static <T> List<T> m55433b(List<T> list, AbstractC13660a<T> aVar) {
        ArrayList arrayList = new ArrayList();
        if (!(list == null || aVar == null)) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                T next = it.next();
                if (aVar.accept(next)) {
                    it.remove();
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static <T, R> List<R> m55431a(List<T> list, AbstractC13662c<T, R> cVar) {
        ArrayList arrayList = new ArrayList();
        if (!(list == null || cVar == null)) {
            for (T t : list) {
                R accept = cVar.accept(t);
                if (accept != null) {
                    arrayList.add(accept);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static <T> void m55432a(List<T> list, AbstractC13661b<T> bVar) {
        if (!(list == null || bVar == null)) {
            for (T t : list) {
                bVar.accept(t);
            }
        }
    }
}
