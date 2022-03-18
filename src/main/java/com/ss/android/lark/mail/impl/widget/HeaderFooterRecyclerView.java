package com.ss.android.lark.mail.impl.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class HeaderFooterRecyclerView extends RecyclerView {

    /* renamed from: a */
    private RecyclerView.Adapter f111632a;

    /* renamed from: b */
    private boolean f111633b;

    /* renamed from: d */
    public int f111634d = Integer.MIN_VALUE;

    /* renamed from: e */
    public int f111635e = -2047483648;

    /* renamed from: f */
    public final List<C43986b> f111636f = new ArrayList();

    /* renamed from: g */
    public final List<C43986b> f111637g = new ArrayList();

    /* access modifiers changed from: protected */
    /* renamed from: com.ss.android.lark.mail.impl.widget.HeaderFooterRecyclerView$b */
    public static class C43986b {

        /* renamed from: a */
        public View f111638a;

        /* renamed from: b */
        public int f111639b;

        protected C43986b() {
        }
    }

    /* renamed from: d */
    public boolean mo156541d() {
        return this.f111633b;
    }

    public int getFootersCount() {
        return this.f111637g.size();
    }

    public int getHeadersCount() {
        return this.f111636f.size();
    }

    public int getItemCount() {
        RecyclerView.Adapter adapter = this.f111632a;
        if (adapter != null) {
            return (adapter.getItemCount() - getHeadersCount()) - getFootersCount();
        }
        return 0;
    }

    /* renamed from: com.ss.android.lark.mail.impl.widget.HeaderFooterRecyclerView$c */
    protected static class C43987c extends RecyclerView.Adapter {

        /* renamed from: b */
        HeaderFooterRecyclerView f111640b;

        /* renamed from: c */
        RecyclerView.Adapter f111641c;

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            int headersCount;
            int footersCount;
            if (this.f111641c != null) {
                headersCount = this.f111640b.getHeadersCount() + this.f111640b.getFootersCount();
                footersCount = this.f111641c.getItemCount();
            } else {
                headersCount = this.f111640b.getHeadersCount();
                footersCount = this.f111640b.getFootersCount();
            }
            return headersCount + footersCount;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            int a = mo156547a(i);
            if (a < 0) {
                return -1;
            }
            return this.f111641c.getItemId(a);
        }

        /* renamed from: a */
        public int mo156547a(int i) {
            int headersCount = this.f111640b.getHeadersCount();
            if (i >= headersCount && i < this.f111641c.getItemCount() + headersCount) {
                return i - headersCount;
            }
            return -1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            int headersCount = this.f111640b.getHeadersCount();
            if (i < headersCount) {
                return this.f111640b.f111636f.get(i).f111639b;
            }
            int i2 = i - headersCount;
            int i3 = 0;
            RecyclerView.Adapter adapter = this.f111641c;
            if (adapter == null || i2 >= (i3 = adapter.getItemCount())) {
                return this.f111640b.f111637g.get((i - i3) - this.f111640b.getHeadersCount()).f111639b;
            }
            int itemViewType = this.f111641c.getItemViewType(i2);
            if (itemViewType >= 0) {
                return itemViewType;
            }
            throw new IllegalArgumentException("HeaderFooterRecyclerView can't accept viewType<0");
        }

        public C43987c(final HeaderFooterRecyclerView headerFooterRecyclerView, RecyclerView.Adapter adapter) {
            this.f111640b = headerFooterRecyclerView;
            this.f111641c = adapter;
            adapter.registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() {
                /* class com.ss.android.lark.mail.impl.widget.HeaderFooterRecyclerView.C43987c.C439881 */

                @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
                public void onChanged() {
                    C43987c.this.notifyDataSetChanged();
                }

                @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
                public void onItemRangeChanged(int i, int i2) {
                    C43987c.this.notifyItemRangeChanged(headerFooterRecyclerView.getHeadersCount() + i, i2);
                }

                @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
                public void onItemRangeInserted(int i, int i2) {
                    C43987c.this.notifyItemRangeInserted(headerFooterRecyclerView.getHeadersCount() + i, i2);
                }

                @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
                public void onItemRangeRemoved(int i, int i2) {
                    C43987c.this.notifyItemMoved(headerFooterRecyclerView.getHeadersCount() + i, i2);
                }

                @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
                public void onItemRangeChanged(int i, int i2, Object obj) {
                    C43987c.this.notifyItemRangeChanged(i + i, i2, obj);
                }

                @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
                public void onItemRangeMoved(int i, int i2, int i3) {
                    C43987c.this.notifyItemMoved(headerFooterRecyclerView.getHeadersCount() + i, headerFooterRecyclerView.getHeadersCount() + i2);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i <= this.f111640b.f111634d) {
                for (C43986b bVar : this.f111640b.f111636f) {
                    if (bVar.f111639b == i) {
                        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
                        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        return new C43985a(frameLayout);
                    }
                }
            } else if (i <= this.f111640b.f111635e) {
                for (C43986b bVar2 : this.f111640b.f111637g) {
                    if (bVar2.f111639b == i) {
                        FrameLayout frameLayout2 = new FrameLayout(viewGroup.getContext());
                        frameLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        return new C43985a(frameLayout2);
                    }
                }
            }
            return this.f111641c.onCreateViewHolder(viewGroup, i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int headersCount = this.f111640b.getHeadersCount();
            int i2 = -2;
            int i3 = -1;
            if (i < headersCount) {
                View view = this.f111640b.f111636f.get(i).f111638a;
                if (view.getLayoutParams() != null) {
                    i3 = view.getLayoutParams().width;
                    i2 = view.getLayoutParams().height;
                }
                if (view.getParent() != null) {
                    ((ViewGroup) view.getParent()).removeAllViews();
                }
                ((FrameLayout) viewHolder.itemView).addView(view, new FrameLayout.LayoutParams(i3, i2));
                return;
            }
            int i4 = i - headersCount;
            RecyclerView.Adapter adapter = this.f111641c;
            if (adapter != null) {
                int itemCount = adapter.getItemCount();
                if (i4 < itemCount) {
                    this.f111641c.onBindViewHolder(viewHolder, i4);
                    return;
                }
                i4 -= itemCount;
            }
            View view2 = this.f111640b.f111637g.get(i4).f111638a;
            if (view2.getLayoutParams() != null) {
                i3 = view2.getLayoutParams().width;
                i2 = view2.getLayoutParams().height;
            }
            if (view2.getParent() != null) {
                ((ViewGroup) view2.getParent()).removeAllViews();
            }
            ((FrameLayout) viewHolder.itemView).addView(view2, new FrameLayout.LayoutParams(i3, i2));
        }
    }

    /* renamed from: com.ss.android.lark.mail.impl.widget.HeaderFooterRecyclerView$a */
    protected static class C43985a extends RecyclerView.ViewHolder {
        public C43985a(View view) {
            super(view);
        }
    }

    public void setHideHeaderFooterDivider(boolean z) {
        this.f111633b = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public int getChildAdapterPosition(View view) {
        return super.getChildAdapterPosition(view);
    }

    public void setWrappedAdapter(RecyclerView.Adapter adapter) {
        this.f111632a = adapter;
        super.setAdapter(adapter);
    }

    public HeaderFooterRecyclerView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo156539a(View view) {
        C43986b bVar = new C43986b();
        bVar.f111638a = view;
        int i = this.f111634d;
        this.f111634d = i + 1;
        bVar.f111639b = i;
        this.f111636f.add(bVar);
        RecyclerView.Adapter adapter = this.f111632a;
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    /* renamed from: b */
    public void mo156540b(View view) {
        C43986b bVar = new C43986b();
        bVar.f111638a = view;
        int i = this.f111635e;
        this.f111635e = i + 1;
        bVar.f111639b = i;
        this.f111637g.add(bVar);
        RecyclerView.Adapter adapter = this.f111632a;
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter adapter) {
        if (!(adapter instanceof C43987c)) {
            this.f111632a = new C43987c(this, adapter);
        } else {
            this.f111632a = adapter;
        }
        super.setAdapter(this.f111632a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void addItemDecoration(RecyclerView.AbstractC1335d dVar, int i) {
        super.addItemDecoration(dVar, i);
    }

    public HeaderFooterRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HeaderFooterRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
