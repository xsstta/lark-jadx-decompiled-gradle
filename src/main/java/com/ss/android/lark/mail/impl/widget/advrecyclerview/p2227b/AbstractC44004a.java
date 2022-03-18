package com.ss.android.lark.mail.impl.widget.advrecyclerview.p2227b;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;

/* renamed from: com.ss.android.lark.mail.impl.widget.advrecyclerview.b.a */
public abstract class AbstractC44004a extends SimpleItemAnimator {

    /* renamed from: a */
    private AbstractC44005a f111676a;

    /* renamed from: com.ss.android.lark.mail.impl.widget.advrecyclerview.b.a$a */
    public interface AbstractC44005a {
        /* renamed from: a */
        void mo156594a(RecyclerView.ViewHolder viewHolder);

        /* renamed from: b */
        void mo156595b(RecyclerView.ViewHolder viewHolder);

        /* renamed from: c */
        void mo156596c(RecyclerView.ViewHolder viewHolder);

        /* renamed from: d */
        void mo156597d(RecyclerView.ViewHolder viewHolder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo156584a(RecyclerView.ViewHolder viewHolder) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo156585a(RecyclerView.ViewHolder viewHolder, boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo156587b(RecyclerView.ViewHolder viewHolder) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo156588b(RecyclerView.ViewHolder viewHolder, boolean z) {
    }

    /* renamed from: b */
    public boolean mo156589b() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo156590c(RecyclerView.ViewHolder viewHolder) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo156591d(RecyclerView.ViewHolder viewHolder) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo156592e(RecyclerView.ViewHolder viewHolder) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo156593f(RecyclerView.ViewHolder viewHolder) {
    }

    /* renamed from: a */
    public boolean mo156586a() {
        if (isRunning()) {
            return false;
        }
        dispatchAnimationsFinished();
        return true;
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public final void onAddStarting(RecyclerView.ViewHolder viewHolder) {
        mo156584a(viewHolder);
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public final void onMoveStarting(RecyclerView.ViewHolder viewHolder) {
        mo156590c(viewHolder);
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public final void onRemoveStarting(RecyclerView.ViewHolder viewHolder) {
        mo156592e(viewHolder);
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public final void onAddFinished(RecyclerView.ViewHolder viewHolder) {
        mo156587b(viewHolder);
        AbstractC44005a aVar = this.f111676a;
        if (aVar != null) {
            aVar.mo156595b(viewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public final void onMoveFinished(RecyclerView.ViewHolder viewHolder) {
        mo156591d(viewHolder);
        AbstractC44005a aVar = this.f111676a;
        if (aVar != null) {
            aVar.mo156596c(viewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public final void onRemoveFinished(RecyclerView.ViewHolder viewHolder) {
        mo156593f(viewHolder);
        AbstractC44005a aVar = this.f111676a;
        if (aVar != null) {
            aVar.mo156594a(viewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public final void onChangeStarting(RecyclerView.ViewHolder viewHolder, boolean z) {
        mo156585a(viewHolder, z);
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public final void onChangeFinished(RecyclerView.ViewHolder viewHolder, boolean z) {
        mo156588b(viewHolder, z);
        AbstractC44005a aVar = this.f111676a;
        if (aVar != null) {
            aVar.mo156597d(viewHolder);
        }
    }
}
