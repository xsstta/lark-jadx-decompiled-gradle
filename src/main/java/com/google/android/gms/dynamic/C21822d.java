package com.google.android.gms.dynamic;

import android.os.Bundle;
import com.google.android.gms.dynamic.AbstractC21818a;
import java.util.Iterator;

/* renamed from: com.google.android.gms.dynamic.d */
final class C21822d implements AbstractC21821c<T> {

    /* renamed from: a */
    private final /* synthetic */ AbstractC21818a f53231a;

    C21822d(AbstractC21818a aVar) {
        this.f53231a = aVar;
    }

    @Override // com.google.android.gms.dynamic.AbstractC21821c
    /* renamed from: a */
    public final void mo73903a(T t) {
        AbstractC21818a.m79102a(this.f53231a, (AbstractC21820b) t);
        Iterator it = AbstractC21818a.m79103a(this.f53231a).iterator();
        while (it.hasNext()) {
            ((AbstractC21818a.AbstractC21819a) it.next()).mo73891a(AbstractC21818a.m79106b(this.f53231a));
        }
        AbstractC21818a.m79103a(this.f53231a).clear();
        AbstractC21818a.m79101a(this.f53231a, (Bundle) null);
    }
}
