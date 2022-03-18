package com.ss.android.openbusiness.p3003a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* renamed from: com.ss.android.openbusiness.a.c */
public abstract class AbstractC59449c extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public static final int opb_type_header = 2131361830;

    /* renamed from: b */
    public static final int opb_type_footer = 2131361829;

    /* renamed from: c */
    public static final int opb_type_child = 2131361828;

    /* renamed from: d */
    public AbstractC59456d f147594d;

    /* renamed from: e */
    public AbstractC59455c f147595e;

    /* renamed from: f */
    public AbstractC59454b f147596f;

    /* renamed from: g */
    protected Context f147597g;

    /* renamed from: h */
    protected ArrayList<C59448b> f147598h;

    /* renamed from: i */
    public boolean f147599i;

    /* renamed from: j */
    private int f147600j;

    /* renamed from: k */
    private boolean f147601k;

    /* renamed from: com.ss.android.openbusiness.a.c$b */
    public interface AbstractC59454b {
        /* renamed from: a */
        void mo202750a(AbstractC59449c cVar, C59447a aVar, int i, int i2);
    }

    /* renamed from: com.ss.android.openbusiness.a.c$c */
    public interface AbstractC59455c {
        /* renamed from: a */
        void mo202751a(AbstractC59449c cVar, C59447a aVar, int i);
    }

    /* renamed from: com.ss.android.openbusiness.a.c$d */
    public interface AbstractC59456d {
        /* renamed from: a */
        void mo202752a(AbstractC59449c cVar, C59447a aVar, int i);
    }

    /* renamed from: a */
    public abstract void mo202731a(C59447a aVar, int i);

    /* renamed from: a */
    public abstract void mo202732a(C59447a aVar, int i, int i2);

    /* renamed from: b */
    public abstract int mo202733b();

    /* renamed from: b */
    public abstract void mo202736b(C59447a aVar, int i);

    /* renamed from: f */
    public abstract int mo202741f(int i);

    /* renamed from: g */
    public abstract boolean mo202742g(int i);

    /* renamed from: h */
    public abstract boolean mo202743h(int i);

    /* renamed from: i */
    public abstract int mo202744i(int i);

    /* renamed from: j */
    public abstract int mo202745j(int i);

    /* renamed from: k */
    public abstract int mo202746k(int i);

    /* renamed from: com.ss.android.openbusiness.a.c$a */
    class C59453a extends RecyclerView.AdapterDataObserver {
        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            AbstractC59449c.this.f147599i = true;
        }

        C59453a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2) {
            AbstractC59449c.this.f147599i = true;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i, int i2) {
            AbstractC59449c.this.f147599i = true;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i, int i2) {
            AbstractC59449c.this.f147599i = true;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2, Object obj) {
            onItemRangeChanged(i, i2);
        }
    }

    /* renamed from: c */
    private int mo202754c() {
        return mo202738c(0, this.f147598h.size());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (this.f147599i) {
            mo202755d();
        }
        return mo202754c();
    }

    /* renamed from: a */
    public void mo202730a() {
        this.f147599i = true;
        notifyDataSetChanged();
    }

    /* renamed from: d */
    private void mo202755d() {
        this.f147598h.clear();
        int b = mo202733b();
        for (int i = 0; i < b; i++) {
            this.f147598h.add(new C59448b(mo202742g(i), mo202743h(i), mo202741f(i)));
        }
        this.f147599i = false;
    }

    /* renamed from: a */
    public int mo202728a(int i) {
        return opb_type_header;
    }

    public AbstractC59449c(Context context) {
        this(context, false);
    }

    /* renamed from: b */
    public int mo202734b(int i) {
        return opb_type_footer;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        mo202755d();
    }

    /* renamed from: a */
    private boolean m230786a(RecyclerView.ViewHolder viewHolder) {
        ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
        if (layoutParams == null || !(layoutParams instanceof StaggeredGridLayoutManager.LayoutParams)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public int mo202739d(int i) {
        int size = this.f147598h.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += mo202740e(i3);
            if (i < i2) {
                return i3;
            }
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        if (m230786a(viewHolder)) {
            m230785a(viewHolder, viewHolder.getLayoutPosition());
        }
    }

    /* renamed from: c */
    public int mo202737c(int i) {
        int size = this.f147598h.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            C59448b bVar = this.f147598h.get(i3);
            if (bVar.mo202725a() && i < (i2 = i2 + 1)) {
                return opb_type_header;
            }
            i2 += bVar.mo202727c();
            if (i < i2) {
                return opb_type_child;
            }
            if (bVar.mo202726b() && i < (i2 = i2 + 1)) {
                return opb_type_footer;
            }
        }
        return opb_type_child;
    }

    /* renamed from: e */
    public int mo202740e(int i) {
        int i2 = 0;
        if (i < 0 || i >= this.f147598h.size()) {
            return 0;
        }
        C59448b bVar = this.f147598h.get(i);
        if (bVar.mo202725a()) {
            i2 = 1;
        }
        int c = i2 + bVar.mo202727c();
        if (bVar.mo202726b()) {
            return c + 1;
        }
        return c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        this.f147600j = i;
        int d = mo202739d(i);
        int c = mo202737c(i);
        if (c == opb_type_header) {
            return mo202728a(d);
        }
        if (c == opb_type_footer) {
            return mo202734b(d);
        }
        if (c == opb_type_child) {
            return mo202729a(d, mo202735b(d, i));
        }
        return super.getItemViewType(i);
    }

    /* renamed from: a */
    public int mo202729a(int i, int i2) {
        return opb_type_child;
    }

    public AbstractC59449c(Context context, boolean z) {
        this.f147598h = new ArrayList<>();
        this.f147597g = context;
        this.f147601k = z;
        registerAdapterDataObserver(new C59453a());
    }

    /* renamed from: a */
    private void m230785a(RecyclerView.ViewHolder viewHolder, int i) {
        if (mo202737c(i) == opb_type_header || mo202737c(i) == opb_type_footer) {
            ((StaggeredGridLayoutManager.LayoutParams) viewHolder.itemView.getLayoutParams()).mo7274a(true);
        }
    }

    /* renamed from: c */
    public int mo202738c(int i, int i2) {
        int size = this.f147598h.size();
        int i3 = 0;
        int i4 = i;
        while (i4 < size && i4 < i + i2) {
            i3 += mo202740e(i4);
            i4++;
        }
        return i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C59447a(LayoutInflater.from(this.f147597g).inflate(m230788d(this.f147600j, i), viewGroup, false));
    }

    /* renamed from: d */
    private int m230788d(int i, int i2) {
        int c = mo202737c(i);
        if (c == opb_type_header) {
            return mo202744i(i2);
        }
        if (c == opb_type_footer) {
            return mo202745j(i2);
        }
        if (c == opb_type_child) {
            return mo202746k(i2);
        }
        return 0;
    }

    /* renamed from: b */
    public int mo202735b(int i, int i2) {
        if (i < 0 || i >= this.f147598h.size()) {
            return -1;
        }
        int c = mo202738c(0, i + 1);
        C59448b bVar = this.f147598h.get(i);
        int c2 = (bVar.mo202727c() - (c - i2)) + (bVar.mo202726b() ? 1 : 0);
        if (c2 >= 0) {
            return c2;
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(final RecyclerView.ViewHolder viewHolder, int i) {
        int c = mo202737c(i);
        final int d = mo202739d(i);
        if (c == opb_type_header) {
            if (this.f147594d != null) {
                viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                    /* class com.ss.android.openbusiness.p3003a.AbstractC59449c.View$OnClickListenerC594501 */

                    public void onClick(View view) {
                        if (AbstractC59449c.this.f147594d != null) {
                            AbstractC59449c.this.f147594d.mo202752a(AbstractC59449c.this, (C59447a) viewHolder, d);
                        }
                    }
                });
            }
            mo202731a((C59447a) viewHolder, d);
        } else if (c == opb_type_footer) {
            if (this.f147595e != null) {
                viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                    /* class com.ss.android.openbusiness.p3003a.AbstractC59449c.View$OnClickListenerC594512 */

                    public void onClick(View view) {
                        if (AbstractC59449c.this.f147595e != null) {
                            AbstractC59449c.this.f147595e.mo202751a(AbstractC59449c.this, (C59447a) viewHolder, d);
                        }
                    }
                });
            }
            mo202736b((C59447a) viewHolder, d);
        } else if (c == opb_type_child) {
            final int b = mo202735b(d, i);
            if (this.f147596f != null) {
                viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                    /* class com.ss.android.openbusiness.p3003a.AbstractC59449c.View$OnClickListenerC594523 */

                    public void onClick(View view) {
                        if (AbstractC59449c.this.f147596f != null) {
                            AbstractC59449c.this.f147596f.mo202750a(AbstractC59449c.this, (C59447a) viewHolder, d, b);
                        }
                    }
                });
            }
            mo202732a((C59447a) viewHolder, d, b);
        }
    }
}
