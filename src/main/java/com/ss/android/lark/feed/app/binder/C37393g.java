package com.ss.android.lark.feed.app.binder;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.feed.app.binder.g */
public class C37393g {

    /* renamed from: a */
    private final List<Class<?>> f95934a = new ArrayList();

    /* renamed from: b */
    private final List<AbstractC37406i<?, ?, ?>> f95935b = new ArrayList();

    /* renamed from: a */
    public AbstractC37406i<?, ?, ?> mo137273a(int i) {
        return this.f95935b.get(i);
    }

    /* renamed from: b */
    public boolean mo137275b(Class<?> cls) {
        boolean z = false;
        while (true) {
            int indexOf = this.f95934a.indexOf(cls);
            if (indexOf == -1) {
                return z;
            }
            this.f95934a.remove(indexOf);
            this.f95935b.remove(indexOf);
            z = true;
        }
    }

    /* renamed from: a */
    public int mo137272a(Class<?> cls) {
        int indexOf = this.f95934a.indexOf(cls);
        if (indexOf != -1) {
            return indexOf;
        }
        for (int i = 0; i < this.f95934a.size(); i++) {
            if (this.f95934a.get(i).isAssignableFrom(cls)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public <T> void mo137274a(Class<? extends T> cls, AbstractC37406i<T, ?, ?> iVar) {
        this.f95934a.add(cls);
        this.f95935b.add(iVar);
    }
}
