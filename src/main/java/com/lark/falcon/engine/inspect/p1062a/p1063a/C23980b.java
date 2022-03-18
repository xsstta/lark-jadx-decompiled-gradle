package com.lark.falcon.engine.inspect.p1062a.p1063a;

import java.util.ArrayList;

/* renamed from: com.lark.falcon.engine.inspect.a.a.b */
public class C23980b {

    /* renamed from: a */
    private final ArrayList<AbstractC23992i> f59330a = new ArrayList<>();

    /* renamed from: b */
    private final ArrayList<AbstractC23981c> f59331b = new ArrayList<>();

    /* renamed from: a */
    public synchronized AbstractC23981c mo86137a(String str) {
        int size = this.f59330a.size();
        for (int i = 0; i < size; i++) {
            if (this.f59330a.get(i).mo86136a(str)) {
                return this.f59331b.get(i);
            }
        }
        return null;
    }

    /* renamed from: a */
    public synchronized void mo86138a(AbstractC23992i iVar, AbstractC23981c cVar) {
        this.f59330a.add(iVar);
        this.f59331b.add(cVar);
    }

    /* renamed from: b */
    public synchronized boolean mo86139b(AbstractC23992i iVar, AbstractC23981c cVar) {
        int indexOf = this.f59330a.indexOf(iVar);
        if (indexOf < 0 || cVar != this.f59331b.get(indexOf)) {
            return false;
        }
        this.f59330a.remove(indexOf);
        this.f59331b.remove(indexOf);
        return true;
    }
}
