package com.ss.android.lark.main.app;

import android.os.Process;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.main.app.tab.C44373s;
import com.ss.android.lark.maincore.AbstractC44544a;
import com.ss.android.lark.utils.C57852m;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.ss.android.lark.main.app.i */
public class C44325i {

    /* renamed from: a */
    private static final Object f112400a = new Object();

    /* renamed from: b */
    private final ConcurrentHashMap<AbstractC44324h, Object> f112401b;

    /* renamed from: c */
    private final ConcurrentLinkedQueue<AbstractC44544a> f112402c;

    /* renamed from: d */
    private final ConcurrentLinkedQueue<AbstractC44328b> f112403d;

    /* renamed from: e */
    private volatile int f112404e;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.main.app.i$a */
    public static class C44327a {

        /* renamed from: a */
        static C44325i f112405a = new C44325i();
    }

    /* renamed from: com.ss.android.lark.main.app.i$b */
    public interface AbstractC44328b {
        void onFirstContentDraw(String str);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.main.app.i$c */
    public interface AbstractC44329c {
        void apply(AbstractC44544a aVar);
    }

    /* renamed from: a */
    public static C44325i m175831a() {
        return C44327a.f112405a;
    }

    /* renamed from: c */
    public void mo157447c() {
        synchronized (C44325i.class) {
            this.f112404e = 0;
        }
    }

    private C44325i() {
        this.f112401b = new ConcurrentHashMap<>();
        this.f112402c = new ConcurrentLinkedQueue<>();
        this.f112403d = new ConcurrentLinkedQueue<>();
        this.f112404e = 0;
    }

    /* renamed from: b */
    public boolean mo157446b() {
        if ((this.f112404e & 1) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void mo157443b(AbstractC44328b bVar) {
        this.f112403d.remove(bVar);
    }

    /* renamed from: a */
    public void mo157438a(AbstractC44324h hVar) {
        if (hVar != null) {
            this.f112401b.put(hVar, f112400a);
        }
    }

    /* renamed from: b */
    public void mo157444b(AbstractC44544a aVar) {
        this.f112402c.remove(aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m175833a(AbstractC44329c cVar) {
        Iterator<AbstractC44544a> it = this.f112402c.iterator();
        while (it.hasNext()) {
            cVar.apply(it.next());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m175835c(AbstractC44544a aVar) {
        try {
            aVar.mo102548b();
        } catch (Exception e) {
            Log.m165384e("MainModule_MileStone", "", e);
            if (C57852m.m224554a(LarkContext.getApplication())) {
                Process.killProcess(Process.myPid());
            }
        }
    }

    /* renamed from: b */
    public void mo157445b(String str) {
        m175832a(2, str, true, $$Lambda$cOiKzBei7R2st581tyAy0VZG2NQ.INSTANCE);
    }

    /* renamed from: d */
    public void mo157449d(String str) {
        Iterator<AbstractC44328b> it = this.f112403d.iterator();
        while (it.hasNext()) {
            it.next().onFirstContentDraw(str);
        }
    }

    /* renamed from: a */
    public void mo157439a(AbstractC44328b bVar) {
        this.f112403d.add(bVar);
    }

    /* renamed from: c */
    public void mo157448c(String str) {
        m175832a(4, str, true, new AbstractC44329c(str) {
            /* class com.ss.android.lark.main.app.$$Lambda$i$lA3eLcJ6DUs7hwUeenlaxFU39I */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // com.ss.android.lark.main.app.C44325i.AbstractC44329c
            public final void apply(AbstractC44544a aVar) {
                aVar.mo102547a(this.f$0);
            }
        });
    }

    /* renamed from: a */
    public void mo157440a(AbstractC44544a aVar) {
        if (aVar != null) {
            if (!this.f112402c.contains(aVar)) {
                this.f112402c.add(aVar);
            }
            synchronized (C44325i.class) {
                if ((this.f112404e & 1) == 1) {
                    aVar.mo102548b();
                }
                if ((this.f112404e & 2) == 2) {
                    aVar.mo102546a();
                }
                if ((this.f112404e & 4) == 4) {
                    aVar.mo102547a(C44373s.m176069a().mo157642d());
                }
            }
        }
    }

    /* renamed from: a */
    public void mo157441a(C57865c.AbstractC57871b<AbstractC44324h> bVar) {
        if (bVar != null) {
            for (AbstractC44324h hVar : this.f112401b.keySet()) {
                bVar.consume(hVar);
            }
        }
    }

    /* renamed from: a */
    public void mo157442a(String str) {
        m175832a(1, str, false, $$Lambda$i$br17i9KscvYJ7v1gWv2b94PsW0M.INSTANCE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0059, code lost:
        r3 = new com.ss.android.lark.main.app.$$Lambda$i$phZ6Kb_K06DReIbP05ZAOxRvI50(r2, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005e, code lost:
        if (r5 == false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0060, code lost:
        com.larksuite.framework.callback.UICallbackExecutor.execute(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0064, code lost:
        r3.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m175832a(int r3, java.lang.String r4, boolean r5, com.ss.android.lark.main.app.C44325i.AbstractC44329c r6) {
        /*
        // Method dump skipped, instructions count: 107
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.main.app.C44325i.m175832a(int, java.lang.String, boolean, com.ss.android.lark.main.app.i$c):void");
    }
}
