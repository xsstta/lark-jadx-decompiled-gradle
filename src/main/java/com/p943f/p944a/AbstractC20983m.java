package com.p943f.p944a;

import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.f.a.m */
public abstract class AbstractC20983m extends ItemTouchHelper.AbstractC1309d {
    public AbstractC20983m() {
        super(0, 0);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1309d
    /* renamed from: f */
    public int mo6606f(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        return ((C20972g) viewHolder).mo71033j();
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1309d
    /* renamed from: g */
    public int mo6607g(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        return ((C20972g) viewHolder).mo71034k();
    }
}
