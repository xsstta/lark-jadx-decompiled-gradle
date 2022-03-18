package com.haibin.calendarview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.haibin.calendarview.b */
abstract class AbstractC23344b<T> extends RecyclerView.Adapter {

    /* renamed from: a */
    LayoutInflater f57588a;

    /* renamed from: b */
    public AbstractC23347b f57589b;

    /* renamed from: c */
    Context f57590c;

    /* renamed from: d */
    private List<T> f57591d = new ArrayList();

    /* renamed from: e */
    private AbstractView$OnClickListenerC23346a f57592e;

    /* renamed from: com.haibin.calendarview.b$b */
    interface AbstractC23347b {
        /* renamed from: a */
        void mo81064a(int i, long j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract RecyclerView.ViewHolder mo81087a(ViewGroup viewGroup, int i);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo81090a(RecyclerView.ViewHolder viewHolder, T t, int i);

    /* renamed from: com.haibin.calendarview.b$a */
    static abstract class AbstractView$OnClickListenerC23346a implements View.OnClickListener {
        /* renamed from: a */
        public abstract void mo81093a(int i, long j);

        AbstractView$OnClickListenerC23346a() {
        }

        public void onClick(View view) {
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) view.getTag();
            mo81093a(viewHolder.getAdapterPosition(), viewHolder.getItemId());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final List<T> mo81089a() {
        return this.f57591d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f57591d.size();
    }

    AbstractC23344b(Context context) {
        this.f57590c = context;
        this.f57588a = LayoutInflater.from(context);
        this.f57592e = new AbstractView$OnClickListenerC23346a() {
            /* class com.haibin.calendarview.AbstractC23344b.C233451 */

            @Override // com.haibin.calendarview.AbstractC23344b.AbstractView$OnClickListenerC23346a
            /* renamed from: a */
            public void mo81093a(int i, long j) {
                if (AbstractC23344b.this.f57589b != null) {
                    AbstractC23344b.this.f57589b.mo81064a(i, j);
                }
            }
        };
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final T mo81088a(int i) {
        if (i < 0 || i >= this.f57591d.size()) {
            return null;
        }
        return this.f57591d.get(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo81091a(AbstractC23347b bVar) {
        this.f57589b = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo81092a(T t) {
        if (t != null) {
            this.f57591d.add(t);
            notifyItemChanged(this.f57591d.size());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        mo81090a(viewHolder, this.f57591d.get(i), i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder a = mo81087a(viewGroup, i);
        if (a != null) {
            a.itemView.setTag(a);
            a.itemView.setOnClickListener(this.f57592e);
        }
        return a;
    }
}
