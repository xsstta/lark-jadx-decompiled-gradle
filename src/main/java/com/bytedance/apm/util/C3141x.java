package com.bytedance.apm.util;

import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/* renamed from: com.bytedance.apm.util.x */
public class C3141x<E extends Comparable> {

    /* renamed from: a */
    private PriorityQueue<E> f10084a;

    /* renamed from: b */
    private int f10085b;

    /* renamed from: b */
    public int mo13062b() {
        return this.f10084a.size();
    }

    /* renamed from: c */
    public void mo13063c() {
        this.f10084a.clear();
    }

    /* renamed from: a */
    public List<E> mo13060a() {
        ArrayList arrayList = new ArrayList(this.f10084a);
        Collections.sort(arrayList);
        return arrayList;
    }

    public C3141x(int i) {
        if (i > 0) {
            this.f10085b = i;
            this.f10084a = new PriorityQueue<>(i, new Comparator<E>() {
                /* class com.bytedance.apm.util.C3141x.C31421 */

                /* renamed from: a */
                public int compare(E e, E e2) {
                    return e.compareTo(e2);
                }
            });
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public void mo13061a(E e) {
        if (this.f10084a.size() < this.f10085b) {
            this.f10084a.add(e);
        } else if (e.compareTo(this.f10084a.peek()) > 0) {
            this.f10084a.poll();
            this.f10084a.add(e);
        }
    }
}
