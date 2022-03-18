package com.ss.android.openbusiness.p3003a;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.ss.android.openbusiness.a.a */
public class C59447a extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private SparseArray<View> f147589a = new SparseArray<>();

    /* renamed from: b */
    private Object f147590b;

    /* renamed from: a */
    public Object mo202723a() {
        return this.f147590b;
    }

    /* renamed from: a */
    public void mo202724a(Object obj) {
        this.f147590b = obj;
    }

    public C59447a(View view) {
        super(view);
    }

    /* renamed from: a */
    public <T extends View> T mo202722a(int i) {
        T t = (T) this.f147589a.get(i);
        if (t != null) {
            return t;
        }
        T t2 = (T) this.itemView.findViewById(i);
        this.f147589a.put(i, t2);
        return t2;
    }
}
