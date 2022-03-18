package com.ss.android.lark.widget.recyclerview.p2964a;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.ss.android.lark.widget.recyclerview.a.c */
public class C58974c extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private SparseArray<View> f146127a = new SparseArray<>();

    public C58974c(View view) {
        super(view);
    }

    /* renamed from: a */
    public <T extends View> T mo200081a(int i) {
        T t = (T) this.f146127a.get(i);
        if (t != null) {
            return t;
        }
        T t2 = (T) this.itemView.findViewById(i);
        this.f146127a.put(i, t2);
        return t2;
    }
}
