package com.ss.android.appcenter.common.adapter.groupadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.ss.android.appcenter.common.util.C28184h;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.appcenter.common.adapter.groupadapter.c */
public abstract class AbstractC28120c extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: g */
    public static final int type_header = 2131361839;

    /* renamed from: h */
    public static final int type_footer = 2131361838;

    /* renamed from: i */
    public static final int type_child = 2131361837;

    /* renamed from: a */
    private int f70423a;

    /* renamed from: b */
    private boolean f70424b;

    /* renamed from: j */
    public AbstractC28127d f70425j;

    /* renamed from: k */
    public AbstractC28126c f70426k;

    /* renamed from: l */
    public AbstractC28125b f70427l;

    /* renamed from: m */
    public Context f70428m;

    /* renamed from: n */
    protected ArrayList<C28119b> f70429n;

    /* renamed from: o */
    public boolean f70430o;

    /* renamed from: com.ss.android.appcenter.common.adapter.groupadapter.c$b */
    public interface AbstractC28125b {
        /* renamed from: a */
        void mo100108a(AbstractC28120c cVar, C28118a aVar, int i, int i2);
    }

    /* renamed from: com.ss.android.appcenter.common.adapter.groupadapter.c$c */
    public interface AbstractC28126c {
        /* renamed from: a */
        void mo100109a(AbstractC28120c cVar, C28118a aVar, int i);
    }

    /* renamed from: com.ss.android.appcenter.common.adapter.groupadapter.c$d */
    public interface AbstractC28127d {
        /* renamed from: a */
        void mo100110a(AbstractC28120c cVar, C28118a aVar, int i);
    }

    /* renamed from: a */
    public abstract int mo98372a(int i);

    /* renamed from: a */
    public abstract void mo98617a(C28118a aVar, int i);

    /* renamed from: a */
    public abstract void mo98375a(C28118a aVar, int i, int i2);

    /* renamed from: a */
    public void mo99770a(C28118a aVar, int i, int i2, UpdateActionType updateActionType) {
    }

    /* renamed from: a */
    public void mo99771a(C28118a aVar, int i, UpdateActionType updateActionType) {
    }

    /* renamed from: b */
    public abstract int mo98377b();

    /* renamed from: b */
    public abstract void mo99772b(C28118a aVar, int i);

    /* renamed from: b */
    public void mo100098b(C28118a aVar, int i, UpdateActionType updateActionType) {
    }

    /* renamed from: b */
    public abstract boolean mo98379b(int i);

    /* renamed from: c */
    public abstract int mo98380c(int i);

    /* renamed from: d */
    public abstract int mo98381d(int i);

    /* renamed from: f */
    public abstract boolean mo99774f(int i);

    /* renamed from: g */
    public abstract int mo99775g(int i);

    /* renamed from: com.ss.android.appcenter.common.adapter.groupadapter.c$a */
    class C28124a extends RecyclerView.AdapterDataObserver {
        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            AbstractC28120c.this.f70430o = true;
        }

        C28124a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2) {
            AbstractC28120c.this.f70430o = true;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i, int i2) {
            AbstractC28120c.this.f70430o = true;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i, int i2) {
            AbstractC28120c.this.f70430o = true;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2, Object obj) {
            onItemRangeChanged(i, i2);
        }
    }

    /* renamed from: a */
    private int mo98373a() {
        return mo100100d(0, this.f70429n.size());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (this.f70430o) {
            mo98619c();
        }
        return mo98373a();
    }

    /* renamed from: c */
    private void mo98619c() {
        this.f70429n.clear();
        int b = mo98377b();
        for (int i = 0; i < b; i++) {
            this.f70429n.add(new C28119b(mo98379b(i), mo99774f(i), mo98372a(i)));
        }
        this.f70430o = false;
    }

    /* renamed from: h */
    public int mo99776h(int i) {
        return type_header;
    }

    /* renamed from: i */
    public int mo99777i(int i) {
        return type_footer;
    }

    public AbstractC28120c(Context context) {
        this(context, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        mo98619c();
    }

    /* renamed from: k */
    public int mo100102k(int i) {
        int size = this.f70429n.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += mo100104m(i3);
            if (i < i2) {
                return i3;
            }
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        if (m102838a(viewHolder)) {
            m102837a(viewHolder, viewHolder.getLayoutPosition());
        }
    }

    /* renamed from: a */
    private boolean m102838a(RecyclerView.ViewHolder viewHolder) {
        ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
        if (layoutParams == null || !(layoutParams instanceof StaggeredGridLayoutManager.LayoutParams)) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        this.f70423a = i;
        int k = mo100102k(i);
        int j = mo100101j(i);
        if (j == type_header) {
            return mo99776h(k);
        }
        if (j == type_footer) {
            return mo99777i(k);
        }
        if (j == type_child) {
            return mo98614a(k, mo100097b(k, i));
        }
        return super.getItemViewType(i);
    }

    /* renamed from: l */
    public int mo100103l(int i) {
        if (i < 0 || i >= this.f70429n.size() || !this.f70429n.get(i).mo100094a()) {
            return -1;
        }
        return mo100100d(0, i);
    }

    /* renamed from: m */
    public int mo100104m(int i) {
        int i2 = 0;
        if (i < 0 || i >= this.f70429n.size()) {
            return 0;
        }
        C28119b bVar = this.f70429n.get(i);
        if (bVar.mo100094a()) {
            i2 = 1;
        }
        int c = i2 + bVar.mo100096c();
        if (bVar.mo100095b()) {
            return c + 1;
        }
        return c;
    }

    /* renamed from: j */
    public int mo100101j(int i) {
        int size = this.f70429n.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            C28119b bVar = this.f70429n.get(i3);
            if (bVar.mo100094a() && i < (i2 = i2 + 1)) {
                return type_header;
            }
            i2 += bVar.mo100096c();
            if (i < i2) {
                return type_child;
            }
            if (bVar.mo100095b() && i < (i2 = i2 + 1)) {
                return type_footer;
            }
        }
        C28184h.m103248b("Workplace_Page", "can't determine the item type of the position.position = " + i + ",item count = " + getItemCount());
        return type_child;
    }

    /* renamed from: a */
    public int mo98614a(int i, int i2) {
        return type_child;
    }

    public AbstractC28120c(Context context, boolean z) {
        this.f70429n = new ArrayList<>();
        this.f70428m = context;
        this.f70424b = z;
        registerAdapterDataObserver(new C28124a());
    }

    /* renamed from: a */
    private void m102837a(RecyclerView.ViewHolder viewHolder, int i) {
        if (mo100101j(i) == type_header || mo100101j(i) == type_footer) {
            ((StaggeredGridLayoutManager.LayoutParams) viewHolder.itemView.getLayoutParams()).mo7274a(true);
        }
    }

    /* renamed from: d */
    public int mo100100d(int i, int i2) {
        int size = this.f70429n.size();
        int i3 = 0;
        int i4 = i;
        while (i4 < size && i4 < i + i2) {
            i3 += mo100104m(i4);
            i4++;
        }
        return i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C28118a(LayoutInflater.from(this.f70428m).inflate(m102840e(this.f70423a, i), viewGroup, false));
    }

    /* renamed from: e */
    private int m102840e(int i, int i2) {
        int j = mo100101j(i);
        if (j == type_header) {
            return mo98380c(i2);
        }
        if (j == type_footer) {
            return mo99775g(i2);
        }
        if (j == type_child) {
            return mo98381d(i2);
        }
        return 0;
    }

    /* renamed from: b */
    public int mo100097b(int i, int i2) {
        if (i < 0 || i >= this.f70429n.size()) {
            return -1;
        }
        int d = mo100100d(0, i + 1);
        C28119b bVar = this.f70429n.get(i);
        int c = (bVar.mo100096c() - (d - i2)) + (bVar.mo100095b() ? 1 : 0);
        if (c >= 0) {
            return c;
        }
        return -1;
    }

    /* renamed from: c */
    public int mo100099c(int i, int i2) {
        if (i < 0 || i >= this.f70429n.size()) {
            return -1;
        }
        C28119b bVar = this.f70429n.get(i);
        if (bVar.mo100096c() > i2) {
            return mo100100d(0, i) + i2 + (bVar.mo100094a() ? 1 : 0);
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(final RecyclerView.ViewHolder viewHolder, int i) {
        int j = mo100101j(i);
        final int k = mo100102k(i);
        if (j == type_header) {
            if (this.f70425j != null) {
                viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                    /* class com.ss.android.appcenter.common.adapter.groupadapter.AbstractC28120c.View$OnClickListenerC281211 */

                    public void onClick(View view) {
                        if (AbstractC28120c.this.f70425j != null) {
                            AbstractC28120c.this.f70425j.mo100110a(AbstractC28120c.this, (C28118a) viewHolder, k);
                        }
                    }
                });
            }
            mo99772b((C28118a) viewHolder, k);
        } else if (j == type_footer) {
            if (this.f70426k != null) {
                viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                    /* class com.ss.android.appcenter.common.adapter.groupadapter.AbstractC28120c.View$OnClickListenerC281222 */

                    public void onClick(View view) {
                        if (AbstractC28120c.this.f70426k != null) {
                            AbstractC28120c.this.f70426k.mo100109a(AbstractC28120c.this, (C28118a) viewHolder, k);
                        }
                    }
                });
            }
            mo98617a((C28118a) viewHolder, k);
        } else if (j == type_child) {
            final int b = mo100097b(k, i);
            if (this.f70427l != null) {
                viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                    /* class com.ss.android.appcenter.common.adapter.groupadapter.AbstractC28120c.View$OnClickListenerC281233 */

                    public void onClick(View view) {
                        if (AbstractC28120c.this.f70427l != null) {
                            AbstractC28120c.this.f70427l.mo100108a(AbstractC28120c.this, (C28118a) viewHolder, k, b);
                        }
                    }
                });
            }
            mo98375a((C28118a) viewHolder, k, b);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        if (list.isEmpty()) {
            onBindViewHolder(viewHolder, i);
            return;
        }
        Object obj = list.get(0);
        if (obj instanceof UpdateActionType) {
            UpdateActionType updateActionType = (UpdateActionType) obj;
            int j = mo100101j(i);
            int k = mo100102k(i);
            if (j == type_header) {
                mo99771a((C28118a) viewHolder, k, updateActionType);
            } else if (j == type_footer) {
                mo100098b((C28118a) viewHolder, k, updateActionType);
            } else if (j == type_child) {
                mo99770a((C28118a) viewHolder, k, mo100097b(k, i), updateActionType);
            }
        }
    }
}
