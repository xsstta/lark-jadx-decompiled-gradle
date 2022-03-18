package com.ss.android.appcenter.engine.vlayout;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.List;

/* renamed from: com.ss.android.appcenter.engine.vlayout.j */
public abstract class AbstractC28292j<VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {

    /* renamed from: c */
    protected VirtualLayoutManager f71047c;

    /* renamed from: b */
    public List<AbstractC28280c> mo100820b() {
        return this.f71047c.mo100695f();
    }

    public AbstractC28292j(VirtualLayoutManager virtualLayoutManager) {
        this.f71047c = virtualLayoutManager;
    }

    /* renamed from: a */
    public void mo100767a(List<AbstractC28280c> list) {
        this.f71047c.mo100688a(list);
    }
}
