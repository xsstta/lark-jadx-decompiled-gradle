package com.ss.android.lark.mail.impl.widget.advrecyclerview.utils;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.mail.impl.widget.advrecyclerview.p2226a.AbstractC44003h;
import com.ss.android.lark.mail.impl.widget.advrecyclerview.p2226a.C43995a;
import com.ss.android.lark.mail.impl.widget.advrecyclerview.p2226a.C43996b;
import com.ss.android.lark.mail.impl.widget.advrecyclerview.p2226a.C44000e;
import com.ss.android.lark.mail.impl.widget.advrecyclerview.p2226a.C44001f;

/* renamed from: com.ss.android.lark.mail.impl.widget.advrecyclerview.utils.e */
public class C44049e {
    /* renamed from: a */
    public static <T> T m174507a(RecyclerView.Adapter adapter, Class<T> cls) {
        if (cls.isInstance(adapter)) {
            return cls.cast(adapter);
        }
        if (adapter instanceof C44000e) {
            return (T) m174507a(((C44000e) adapter).mo156575b(), cls);
        }
        return null;
    }

    /* renamed from: a */
    public static int m174505a(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2, int i) {
        return m174506a(adapter, adapter2, null, i, null);
    }

    /* renamed from: a */
    public static int m174506a(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2, Object obj, int i, C43995a aVar) {
        C44001f fVar = new C44001f();
        if (aVar != null) {
            aVar.mo156559a();
        }
        if (adapter == null) {
            return -1;
        }
        Object obj2 = null;
        if (aVar != null) {
            aVar.mo156561a(new C43996b(adapter, null));
        }
        while (true) {
            if (i != -1 && adapter != adapter2) {
                if (adapter instanceof AbstractC44003h) {
                    fVar.mo156582a();
                    ((AbstractC44003h) adapter).mo156573a(fVar, i);
                    i = fVar.f111675c;
                    obj2 = fVar.f111674b;
                    if (fVar.mo156583b() && aVar != null) {
                        aVar.mo156562a(fVar);
                    }
                    adapter = fVar.f111673a;
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
            aVar.mo156559a();
        }
        return i;
    }
}
