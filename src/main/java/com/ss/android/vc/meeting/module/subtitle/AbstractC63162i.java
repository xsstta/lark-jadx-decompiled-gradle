package com.ss.android.vc.meeting.module.subtitle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.ss.android.vc.meeting.module.subtitle.i */
public abstract class AbstractC63162i extends RecyclerView.OnScrollListener {

    /* renamed from: a */
    public int f159164a = 1;

    /* renamed from: b */
    private int f159165b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo218634a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo218635a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo218636a(boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo218637b();

    /* renamed from: d */
    public int mo218640d() {
        return this.f159164a;
    }

    /* renamed from: c */
    public void mo218639c() {
        this.f159164a = 1;
        this.f159165b = 0;
    }

    /* renamed from: b */
    public void mo218638b(int i) {
        if (this.f159164a != 4) {
            this.f159164a = i;
            mo218635a(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        int i2 = this.f159164a;
        if (i2 != 2 && i2 != 4) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            if (findFirstVisibleItemPosition == 0 || findFirstVisibleItemPosition == 1) {
                mo218634a();
            }
            if (findLastVisibleItemPosition >= this.f159165b) {
                this.f159165b = findLastVisibleItemPosition;
                if (layoutManager.getItemCount() - 1 == findLastVisibleItemPosition) {
                    mo218637b();
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        super.onScrolled(recyclerView, i, i2);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        int findLastVisibleItemPosition = ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
        if (findLastVisibleItemPosition >= 0 && layoutManager.getChildCount() != 0) {
            C63152d dVar = (C63152d) recyclerView.getAdapter();
            if (findLastVisibleItemPosition == layoutManager.getItemCount() - 1) {
                mo218636a(true);
            } else if (findLastVisibleItemPosition != layoutManager.getItemCount() - 2 && findLastVisibleItemPosition != layoutManager.getItemCount() - 3) {
                mo218636a(false);
            } else if (dVar.mo218622b()) {
                mo218636a(false);
            } else {
                mo218636a(true);
            }
        }
    }
}
