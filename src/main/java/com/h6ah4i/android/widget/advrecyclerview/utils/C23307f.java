package com.h6ah4i.android.widget.advrecyclerview.utils;

import androidx.recyclerview.widget.RecyclerView;
import com.h6ah4i.android.widget.advrecyclerview.p1004a.AbstractC23235h;
import com.h6ah4i.android.widget.advrecyclerview.p1004a.C23227a;
import com.h6ah4i.android.widget.advrecyclerview.p1004a.C23228b;
import com.h6ah4i.android.widget.advrecyclerview.p1004a.C23232e;
import com.h6ah4i.android.widget.advrecyclerview.p1004a.C23233f;

/* renamed from: com.h6ah4i.android.widget.advrecyclerview.utils.f */
public class C23307f {
    /* renamed from: a */
    public static <T> T m84666a(RecyclerView.Adapter adapter, Class<T> cls) {
        if (cls.isInstance(adapter)) {
            return cls.cast(adapter);
        }
        if (adapter instanceof C23232e) {
            return (T) m84666a(((C23232e) adapter).mo80574b(), cls);
        }
        return null;
    }

    /* renamed from: a */
    public static int m84664a(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2, int i) {
        return m84665a(adapter, adapter2, null, i, null);
    }

    /* renamed from: a */
    public static int m84665a(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2, Object obj, int i, C23227a aVar) {
        C23233f fVar = new C23233f();
        if (aVar != null) {
            aVar.mo80558a();
        }
        if (adapter == null) {
            return -1;
        }
        Object obj2 = null;
        if (aVar != null) {
            aVar.mo80560a(new C23228b(adapter, null));
        }
        while (true) {
            if (i != -1 && adapter != adapter2) {
                if (adapter instanceof AbstractC23235h) {
                    fVar.mo80581a();
                    ((AbstractC23235h) adapter).mo80572a(fVar, i);
                    i = fVar.f57300c;
                    obj2 = fVar.f57299b;
                    if (fVar.mo80582b() && aVar != null) {
                        aVar.mo80561a(fVar);
                    }
                    adapter = fVar.f57298a;
                    if (adapter == null) {
                        break;
                    }
                } else if (adapter2 != null) {
                    i = -1;
                }
            } else {
                break;
            }
        }
        if (!(adapter2 == null || adapter == adapter2)) {
            i = -1;
        }
        if (!(obj == null || obj2 == obj)) {
            i = -1;
        }
        if (i == -1 && aVar != null) {
            aVar.mo80558a();
        }
        return i;
    }
}
