package com.ss.android.lark.guidemgr.p1935b.p1941f;

import com.ss.android.lark.guidemgr.p1935b.p1938c.C38711a;
import com.ss.android.lark.guidemgr.p1935b.p1938c.C38712b;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.ss.android.lark.guidemgr.b.f.a */
public class C38720a {

    /* renamed from: a */
    private Queue<C38712b> f99607a;

    /* renamed from: b */
    private volatile C38712b f99608b;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.guidemgr.b.f.a$a */
    public static class C38722a {

        /* renamed from: a */
        public static final C38720a f99610a = new C38720a();
    }

    /* renamed from: c */
    public static C38720a m152926c() {
        return C38722a.f99610a;
    }

    /* renamed from: a */
    public synchronized C38712b mo141886a() {
        return this.f99608b;
    }

    private C38720a() {
        this.f99607a = new ConcurrentLinkedQueue();
    }

    /* renamed from: b */
    public synchronized void mo141891b() {
        this.f99607a.clear();
        this.f99608b = null;
    }

    /* renamed from: d */
    private C38711a m152927d() {
        C38712b peek = this.f99607a.peek();
        if (peek != null) {
            return peek.mo141874c();
        }
        return null;
    }

    /* renamed from: a */
    public synchronized C38712b mo141887a(boolean z) {
        if (this.f99608b == null || z) {
            this.f99608b = this.f99607a.poll();
        }
        return this.f99608b;
    }

    /* renamed from: b */
    public void mo141892b(C38712b bVar) {
        this.f99607a.remove(bVar);
        if (this.f99608b != null && this.f99608b.equals(bVar)) {
            this.f99608b = null;
        }
    }

    /* renamed from: a */
    public String mo141888a(List<String> list) {
        if (list == null) {
            return null;
        }
        for (String str : list) {
            this.f99607a.remove(new C38712b(str));
        }
        if (this.f99608b == null || !list.contains(this.f99608b.mo141871a())) {
            return null;
        }
        String a = this.f99608b.mo141871a();
        this.f99608b = null;
        return a;
    }

    /* renamed from: a */
    public void mo141890a(C38712b bVar) {
        if (bVar != null && bVar.mo141874c() != null) {
            C38711a d = m152927d();
            int a = m152925a(d, bVar.mo141874c());
            if (a < 0 || (a == 0 && !bVar.mo141874c().equals(d))) {
                this.f99607a.clear();
                this.f99607a.add(bVar);
            } else if (a == 0) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(bVar);
                mo141889a(bVar.mo141874c(), arrayList);
            } else {
                Log.m165397w("GuideTaskManager", "addTasks but " + d + " > " + bVar.mo141874c());
            }
        }
    }

    /* renamed from: a */
    private int m152925a(C38711a aVar, C38711a aVar2) {
        if (aVar == null) {
            return -1;
        }
        return (int) (aVar.mo141869a() - aVar2.mo141869a());
    }

    /* renamed from: a */
    public void mo141889a(C38711a aVar, List<C38712b> list) {
        if (list != null && !list.isEmpty()) {
            C38711a d = m152927d();
            int a = m152925a(d, aVar);
            if (a < 0 || (a == 0 && !aVar.equals(d))) {
                this.f99607a.clear();
                this.f99607a.addAll(list);
            } else if (a == 0) {
                ArrayList arrayList = new ArrayList(this.f99607a);
                arrayList.removeAll(list);
                if (this.f99608b != null) {
                    list.remove(this.f99608b);
                }
                arrayList.addAll(list);
                Collections.sort(arrayList, new Comparator<C38712b>() {
                    /* class com.ss.android.lark.guidemgr.p1935b.p1941f.C38720a.C387211 */

                    /* renamed from: a */
                    public int compare(C38712b bVar, C38712b bVar2) {
                        return (int) (bVar.mo141873b() - bVar2.mo141873b());
                    }
                });
                this.f99607a.clear();
                this.f99607a.addAll(arrayList);
            } else {
                Log.m165397w("GuideTaskManager", "addTasks but " + d + " > " + aVar);
            }
        }
    }
}
