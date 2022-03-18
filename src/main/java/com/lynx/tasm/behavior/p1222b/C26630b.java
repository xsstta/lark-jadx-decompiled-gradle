package com.lynx.tasm.behavior.p1222b;

import android.view.View;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.animation.C26562a;
import com.lynx.tasm.behavior.ui.LynxUI;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;

/* renamed from: com.lynx.tasm.behavior.b.b */
public class C26630b {

    /* renamed from: a */
    private ConcurrentHashMap<String, WeakReference<View>> f65920a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private WeakHashMap<LynxUI, C26562a> f65921b = new WeakHashMap<>();

    /* renamed from: c */
    private WeakHashMap<LynxUI, C26562a> f65922c = new WeakHashMap<>();

    /* renamed from: d */
    private WeakHashMap<LynxUI, C26562a> f65923d = new WeakHashMap<>();

    /* renamed from: e */
    private WeakHashMap<LynxUI, C26562a> f65924e = new WeakHashMap<>();

    /* renamed from: f */
    private WeakHashMap<LynxUI, String> f65925f = new WeakHashMap<>();

    /* renamed from: g */
    private volatile boolean f65926g = true;

    /* access modifiers changed from: private */
    /* renamed from: com.lynx.tasm.behavior.b.b$a */
    public static final class C26633a {

        /* renamed from: a */
        public static C26630b f65933a = new C26630b();
    }

    /* renamed from: com.lynx.tasm.behavior.b.b$b */
    public interface AbstractC26634b {
        /* renamed from: a */
        void mo94603a();
    }

    /* renamed from: com.lynx.tasm.behavior.b.b$c */
    public interface AbstractC26635c {
        /* renamed from: a */
        void mo94604a();
    }

    /* renamed from: b */
    public static C26630b m96516b() {
        return C26633a.f65933a;
    }

    /* renamed from: a */
    public boolean mo94598a() {
        return this.f65926g;
    }

    @Nullable
    /* renamed from: a */
    private View m96514a(String str) {
        WeakReference<View> weakReference = this.f65920a.get(str);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: b */
    public void mo94599b(LynxView lynxView) {
        m96515a(this.f65925f, lynxView);
        m96515a(this.f65922c, lynxView);
        m96515a(this.f65921b, lynxView);
        m96515a(this.f65924e, lynxView);
        m96515a(this.f65923d, lynxView);
    }

    /* renamed from: a */
    public void mo94593a(LynxView lynxView) {
        for (LynxUI lynxUI : this.f65923d.keySet()) {
            if (lynxUI.mo95039u().mo94692n().mo53300d() == lynxView) {
                lynxUI.aC();
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo94596a(LynxUI lynxUI, C26562a aVar) {
        this.f65922c.put(lynxUI, aVar);
        lynxUI.mo95070b(aVar);
    }

    /* renamed from: b */
    public synchronized void mo94600b(LynxUI lynxUI, C26562a aVar) {
        this.f65921b.put(lynxUI, aVar);
        lynxUI.mo95071c(aVar);
    }

    /* renamed from: c */
    public synchronized void mo94601c(LynxUI lynxUI, C26562a aVar) {
        this.f65923d.put(lynxUI, aVar);
        lynxUI.mo95074e(aVar);
    }

    /* renamed from: d */
    public synchronized void mo94602d(LynxUI lynxUI, C26562a aVar) {
        this.f65924e.put(lynxUI, aVar);
        lynxUI.mo95073d(aVar);
    }

    /* renamed from: a */
    private <T> void m96515a(Map<LynxUI, T> map, LynxView lynxView) {
        Iterator<Map.Entry<LynxUI, T>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().mo95039u().mo94692n().mo53300d() == lynxView) {
                it.remove();
            }
        }
    }

    /* renamed from: a */
    public synchronized View mo94592a(String str, LynxUI lynxUI) {
        View a = m96514a(str);
        if (a == null) {
            for (Map.Entry<LynxUI, String> entry : this.f65925f.entrySet()) {
                LynxUI key = entry.getKey();
                if (lynxUI != key && entry.getValue().equals(str)) {
                    return key.av();
                }
            }
        }
        return a;
    }

    /* renamed from: a */
    public void mo94594a(LynxView lynxView, final AbstractC26634b bVar) {
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        for (LynxUI lynxUI : this.f65922c.keySet()) {
            if (lynxUI.mo95039u().mo94692n().mo53300d() == lynxView) {
                atomicInteger.incrementAndGet();
                lynxUI.mo95057a((AbstractC26634b) new AbstractC26634b() {
                    /* class com.lynx.tasm.behavior.p1222b.C26630b.C266311 */

                    @Override // com.lynx.tasm.behavior.p1222b.C26630b.AbstractC26634b
                    /* renamed from: a */
                    public void mo94603a() {
                        AbstractC26634b bVar;
                        if (atomicInteger.decrementAndGet() == 0 && (bVar = bVar) != null) {
                            bVar.mo94603a();
                        }
                    }
                });
            }
        }
        if (atomicInteger.get() == 0 && bVar != null) {
            bVar.mo94603a();
        }
    }

    /* renamed from: a */
    public void mo94595a(LynxView lynxView, final AbstractC26635c cVar) {
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        for (LynxUI lynxUI : this.f65921b.keySet()) {
            if (lynxUI.mo95039u().mo94692n().mo53300d() == lynxView) {
                atomicInteger.incrementAndGet();
                lynxUI.mo95058a((AbstractC26635c) new AbstractC26635c() {
                    /* class com.lynx.tasm.behavior.p1222b.C26630b.C266322 */

                    @Override // com.lynx.tasm.behavior.p1222b.C26630b.AbstractC26635c
                    /* renamed from: a */
                    public void mo94604a() {
                        AbstractC26635c cVar;
                        if (atomicInteger.decrementAndGet() == 0 && (cVar = cVar) != null) {
                            cVar.mo94604a();
                        }
                    }
                });
            }
        }
        if (atomicInteger.get() == 0 && cVar != null) {
            cVar.mo94604a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public synchronized void mo94597a(LynxUI lynxUI, String str) {
        this.f65925f.put(lynxUI, str);
    }
}
