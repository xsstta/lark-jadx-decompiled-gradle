package com.ss.android.appcenter.common.adapter.groupadapter;

import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.ss.android.appcenter.common.adapter.groupadapter.a */
public class C28118a extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private SparseArray<View> f70418a = new SparseArray<>();

    /* renamed from: b */
    private Object f70419b;

    /* renamed from: a */
    public Object mo100092a() {
        return this.f70419b;
    }

    /* renamed from: a */
    public void mo100093a(Object obj) {
        this.f70419b = obj;
    }

    public C28118a(View view) {
        super(view);
    }

    /* renamed from: a */
    public <T extends View> T mo100089a(int i) {
        T t = (T) this.f70418a.get(i);
        if (t != null) {
            return t;
        }
        T t2 = (T) this.itemView.findViewById(i);
        this.f70418a.put(i, t2);
        return t2;
    }

    /* renamed from: a */
    public C28118a mo100090a(int i, String str) {
        ((TextView) mo100089a(i)).setText(str);
        return this;
    }

    /* renamed from: a */
    public C28118a mo100091a(int i, boolean z) {
        int i2;
        View a = mo100089a(i);
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        a.setVisibility(i2);
        return this;
    }
}
