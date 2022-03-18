package com.ss.android.lark.money.redpacket.cover.preview.discretescrollview;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.DiscreteScrollLayoutManager;
import java.util.Locale;

/* renamed from: com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.c */
public class C48082c<T extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<T> implements DiscreteScrollLayoutManager.AbstractC48071b {

    /* renamed from: a */
    private RecyclerView.Adapter<T> f121054a;

    /* renamed from: b */
    private DiscreteScrollLayoutManager f121055b;

    /* renamed from: b */
    public int mo168371b() {
        return this.f121054a.getItemCount();
    }

    /* renamed from: c */
    private boolean m189828c() {
        if (this.f121054a.getItemCount() > 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.DiscreteScrollLayoutManager.AbstractC48071b
    /* renamed from: a */
    public int mo168339a() {
        if (m189828c()) {
            return 1073741823;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (m189828c()) {
            return Integer.MAX_VALUE;
        }
        return this.f121054a.getItemCount();
    }

    /* renamed from: b */
    public void mo168372b(int i) {
        this.f121055b.scrollToPosition(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.f121054a.getItemViewType(m189827c(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.f121054a.onDetachedFromRecyclerView(recyclerView);
        this.f121055b = null;
    }

    /* renamed from: d */
    private boolean m189829d(int i) {
        if (!m189828c() || (i > 100 && i < 2147483547)) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.f121054a.onAttachedToRecyclerView(recyclerView);
        if (recyclerView instanceof DiscreteScrollView) {
            this.f121055b = (DiscreteScrollLayoutManager) recyclerView.getLayoutManager();
            return;
        }
        throw new RuntimeException();
    }

    /* renamed from: c */
    private int m189827c(int i) {
        if (i >= 1073741823) {
            return (i - 1073741823) % this.f121054a.getItemCount();
        }
        int itemCount = (1073741823 - i) % this.f121054a.getItemCount();
        if (itemCount == 0) {
            return 0;
        }
        return this.f121054a.getItemCount() - itemCount;
    }

    /* renamed from: e */
    private void m189830e(int i) {
        if (i >= this.f121054a.getItemCount()) {
            throw new IndexOutOfBoundsException(String.format(Locale.US, "requested position is outside adapter's bounds: position=%d, size=%d", Integer.valueOf(i), Integer.valueOf(this.f121054a.getItemCount())));
        }
    }

    /* renamed from: a */
    public int mo168370a(int i) {
        int i2;
        m189830e(i);
        int e = this.f121055b.mo168335e();
        int c = m189827c(e);
        if (i == c) {
            return e;
        }
        int i3 = i - c;
        int i4 = e + i3;
        if (i > c) {
            i2 = i3 - this.f121054a.getItemCount();
        } else {
            i2 = i3 + this.f121054a.getItemCount();
        }
        int i5 = i2 + e;
        int abs = Math.abs(e - i4);
        int abs2 = Math.abs(e - i5);
        return abs == abs2 ? i4 > e ? i4 : i5 : abs < abs2 ? i4 : i5;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public T onCreateViewHolder(ViewGroup viewGroup, int i) {
        return this.f121054a.onCreateViewHolder(viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(T t, int i) {
        if (m189829d(i)) {
            mo168372b(m189827c(this.f121055b.mo168335e()) + 1073741823);
        } else {
            this.f121054a.onBindViewHolder(t, m189827c(i));
        }
    }
}
