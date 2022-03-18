package com.ss.android.lark.thirdshare.base.export.p2741c;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.ss.android.lark.thirdshare.base.export.c.c */
public class C55719c extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private SparseArray<View> f137426a = new SparseArray<>();

    public C55719c(View view) {
        super(view);
    }

    /* renamed from: a */
    public <T extends View> T mo189863a(int i) {
        T t = (T) this.f137426a.get(i);
        if (t != null) {
            return t;
        }
        T t2 = (T) this.itemView.findViewById(i);
        this.f137426a.put(i, t2);
        return t2;
    }
}
