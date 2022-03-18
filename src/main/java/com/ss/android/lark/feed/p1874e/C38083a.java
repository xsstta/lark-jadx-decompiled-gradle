package com.ss.android.lark.feed.p1874e;

import com.ss.android.lark.biz.im.api.AbstractC29620m;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.lark.feed.e.a */
public class C38083a {

    /* renamed from: a */
    private static final Object f97729a = new Object();

    /* renamed from: b */
    private static volatile C38083a f97730b;

    /* renamed from: c */
    private CopyOnWriteArrayList<AbstractC29620m> f97731c = new CopyOnWriteArrayList<>();

    private C38083a() {
    }

    /* renamed from: a */
    public static C38083a m149814a() {
        if (f97730b == null) {
            synchronized (C38083a.class) {
                if (f97730b == null) {
                    f97730b = new C38083a();
                }
            }
        }
        return f97730b;
    }

    /* renamed from: a */
    public void mo139405a(AbstractC29620m mVar) {
        if (mVar != null) {
            this.f97731c.add(mVar);
        }
    }

    /* renamed from: a */
    public void mo139406a(C57865c.AbstractC57871b<AbstractC29620m> bVar) {
        if (bVar != null) {
            Iterator<AbstractC29620m> it = this.f97731c.iterator();
            while (it.hasNext()) {
                bVar.consume(it.next());
            }
        }
    }
}
