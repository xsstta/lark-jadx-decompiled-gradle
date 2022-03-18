package com.ss.android.lark.widget.recyclerview;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.ss.android.lark.widget.recyclerview.i */
public abstract class AbstractC59013i extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private C58984d f146214a;

    /* renamed from: b */
    public boolean mo200151b() {
        return this.f146214a.mo200107c();
    }

    /* renamed from: a */
    public boolean mo200150a() {
        return this.f146214a.mo200105b(getAdapterPosition());
    }

    public AbstractC59013i(View view, C58984d dVar) {
        super(view);
        this.f146214a = dVar;
    }
}
