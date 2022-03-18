package com.h6ah4i.android.widget.advrecyclerview.p1005b;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;

/* renamed from: com.h6ah4i.android.widget.advrecyclerview.b.a */
public abstract class AbstractC23236a extends SimpleItemAnimator {

    /* renamed from: a */
    private AbstractC23237a f57301a;

    /* renamed from: com.h6ah4i.android.widget.advrecyclerview.b.a$a */
    public interface AbstractC23237a {
        /* renamed from: a */
        void mo80593a(RecyclerView.ViewHolder viewHolder);

        /* renamed from: b */
        void mo80594b(RecyclerView.ViewHolder viewHolder);

        /* renamed from: c */
        void mo80595c(RecyclerView.ViewHolder viewHolder);

        /* renamed from: d */
        void mo80596d(RecyclerView.ViewHolder viewHolder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo80583a(RecyclerView.ViewHolder viewHolder) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo80584a(RecyclerView.ViewHolder viewHolder, boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo80586b(RecyclerView.ViewHolder viewHolder) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo80587b(RecyclerView.ViewHolder viewHolder, boolean z) {
    }

    /* renamed from: b */
    public boolean mo80588b() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo80589c(RecyclerView.ViewHolder viewHolder) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo80590d(RecyclerView.ViewHolder viewHolder) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo80591e(RecyclerView.ViewHolder viewHolder) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo80592f(RecyclerView.ViewHolder viewHolder) {
    }

    /* renamed from: a */
    public boolean mo80585a() {
        if (isRunning()) {
            return false;
        }
        dispatchAnimationsFinished();
        return true;
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public final void onAddStarting(RecyclerView.ViewHolder viewHolder) {
        mo80583a(viewHolder);
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public final void onMoveStarting(RecyclerView.ViewHolder viewHolder) {
        mo80589c(viewHolder);
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public final void onRemoveStarting(RecyclerView.ViewHolder viewHolder) {
        mo80591e(viewHolder);
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public final void onAddFinished(RecyclerView.ViewHolder viewHolder) {
        mo80586b(viewHolder);
        AbstractC23237a aVar = this.f57301a;
        if (aVar != null) {
            aVar.mo80594b(viewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public final void onMoveFinished(RecyclerView.ViewHolder viewHolder) {
        mo80590d(viewHolder);
        AbstractC23237a aVar = this.f57301a;
        if (aVar != null) {
            aVar.mo80595c(viewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public final void onRemoveFinished(RecyclerView.ViewHolder viewHolder) {
        mo80592f(viewHolder);
        AbstractC23237a aVar = this.f57301a;
        if (aVar != null) {
            aVar.mo80593a(viewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public final void onChangeStarting(RecyclerView.ViewHolder viewHolder, boolean z) {
        mo80584a(viewHolder, z);
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public final void onChangeFinished(RecyclerView.ViewHolder viewHolder, boolean z) {
        mo80587b(viewHolder, z);
        AbstractC23237a aVar = this.f57301a;
        if (aVar != null) {
            aVar.mo80596d(viewHolder);
        }
    }
}
