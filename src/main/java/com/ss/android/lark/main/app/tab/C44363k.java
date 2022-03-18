package com.ss.android.lark.main.app.tab;

import com.p943f.p944a.AbstractC20966c;
import com.p943f.p944a.C20981l;
import java.util.Collection;

/* renamed from: com.ss.android.lark.main.app.tab.k */
class C44363k extends C20981l {

    /* renamed from: a */
    private AbstractC20966c f112562a;

    public int hashCode() {
        AbstractC20966c cVar = this.f112562a;
        if (cVar != null) {
            return cVar.hashCode();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC20966c cVar = this.f112562a;
        AbstractC20966c cVar2 = ((C44363k) obj).f112562a;
        if (cVar != null) {
            return cVar.equals(cVar2);
        }
        if (cVar2 == null) {
            return true;
        }
        return false;
    }

    C44363k(AbstractC20966c cVar, Collection<? extends AbstractC20966c> collection) {
        super(cVar, collection);
        this.f112562a = cVar;
    }
}
