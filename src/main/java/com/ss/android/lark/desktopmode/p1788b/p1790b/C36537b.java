package com.ss.android.lark.desktopmode.p1788b.p1790b;

import android.view.KeyEvent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.lark.desktopmode.b.b.b */
public class C36537b {

    /* renamed from: a */
    private List<WeakReference<AbstractC36536a>> f94075a = new ArrayList();

    /* renamed from: a */
    public synchronized void mo134865a(AbstractC36536a aVar) {
        this.f94075a.add(new WeakReference<>(aVar));
    }

    /* renamed from: a */
    public boolean mo134866a(KeyEvent keyEvent) {
        Iterator<WeakReference<AbstractC36536a>> it = this.f94075a.iterator();
        boolean z = false;
        while (it.hasNext() && !z) {
            AbstractC36536a aVar = it.next().get();
            if (aVar != null) {
                z = aVar.mo122126a(keyEvent);
            }
        }
        return z;
    }

    /* renamed from: b */
    public synchronized void mo134867b(AbstractC36536a aVar) {
        Iterator<WeakReference<AbstractC36536a>> it = this.f94075a.iterator();
        while (it.hasNext()) {
            AbstractC36536a aVar2 = it.next().get();
            if (aVar2 != null && aVar2 == aVar) {
                it.remove();
            }
        }
    }
}
