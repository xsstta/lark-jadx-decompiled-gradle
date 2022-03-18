package com.p943f.p944a;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1374g;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p943f.p944a.C20963a;
import com.p943f.p944a.C20972g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.f.a.d */
public class C20967d<VH extends C20972g> extends RecyclerView.Adapter<VH> implements AbstractC20970e {

    /* renamed from: a */
    public int f51330a = 1;

    /* renamed from: b */
    private final List<AbstractC20966c> f51331b = new ArrayList();

    /* renamed from: c */
    private AbstractC20979j f51332c;

    /* renamed from: d */
    private AbstractC20980k f51333d;

    /* renamed from: e */
    private AbstractC20975h f51334e;

    /* renamed from: f */
    private C20963a.AbstractC20964a f51335f;

    /* renamed from: g */
    private C20963a f51336g;

    /* renamed from: h */
    private final GridLayoutManager.AbstractC1297b f51337h;

    /* renamed from: a */
    public void onBindViewHolder(VH vh, int i) {
    }

    /* renamed from: a */
    public void mo71020a(Collection<? extends AbstractC20966c> collection, boolean z) {
        C1374g.C1377b a = C1374g.m6298a(new C20965b(new ArrayList(this.f51331b), collection), z);
        mo71025b(collection);
        a.mo7413a(this.f51335f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return C20971f.m76383a(this.f51331b);
    }

    public C20967d() {
        C209681 r0 = new C20963a.AbstractC20964a() {
            /* class com.p943f.p944a.C20967d.C209681 */

            @Override // androidx.recyclerview.widget.AbstractC1398p
            /* renamed from: a */
            public void mo7365a(int i, int i2) {
                C20967d.this.notifyItemRangeInserted(i, i2);
            }

            @Override // androidx.recyclerview.widget.AbstractC1398p
            /* renamed from: b */
            public void mo7367b(int i, int i2) {
                C20967d.this.notifyItemRangeRemoved(i, i2);
            }

            @Override // androidx.recyclerview.widget.AbstractC1398p
            /* renamed from: c */
            public void mo7368c(int i, int i2) {
                C20967d.this.notifyItemMoved(i, i2);
            }

            @Override // androidx.recyclerview.widget.AbstractC1398p
            /* renamed from: a */
            public void mo7366a(int i, int i2, Object obj) {
                C20967d.this.notifyItemRangeChanged(i, i2, obj);
            }
        };
        this.f51335f = r0;
        this.f51336g = new C20963a(r0);
        this.f51337h = new GridLayoutManager.AbstractC1297b() {
            /* class com.p943f.p944a.C20967d.C209692 */

            @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1297b
            /* renamed from: a */
            public int mo6533a(int i) {
                try {
                    return C20967d.this.mo71012a(i).mo71039a(C20967d.this.f51330a, i);
                } catch (IndexOutOfBoundsException unused) {
                    return C20967d.this.f51330a;
                }
            }
        };
    }

    /* renamed from: a */
    public AbstractC20975h mo71012a(int i) {
        return C20971f.m76384a(this.f51331b, i);
    }

    /* renamed from: e */
    public AbstractC20975h mo71030e(VH vh) {
        return vh.mo71035l();
    }

    /* renamed from: d */
    public void onViewDetachedFromWindow(VH vh) {
        super.onViewDetachedFromWindow(vh);
        mo71030e(vh).mo71048c(vh);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return mo71012a(i).mo71055z();
    }

    /* renamed from: a */
    public int mo71009a(AbstractC20966c cVar) {
        int indexOf = this.f51331b.indexOf(cVar);
        if (indexOf == -1) {
            return -1;
        }
        int i = 0;
        for (int i2 = 0; i2 < indexOf; i2++) {
            i += this.f51331b.get(i2).mo71008u();
        }
        return i;
    }

    /* renamed from: b */
    public void mo71023b(AbstractC20966c cVar) {
        if (cVar != null) {
            int itemCount = getItemCount();
            cVar.mo71005a(this);
            this.f51331b.add(cVar);
            notifyItemRangeInserted(itemCount, cVar.mo71008u());
            return;
        }
        throw new RuntimeException("Group cannot be null");
    }

    /* renamed from: c */
    public void onViewAttachedToWindow(VH vh) {
        super.onViewAttachedToWindow(vh);
        mo71030e(vh).mo71046b(vh);
    }

    /* renamed from: c */
    private AbstractC20975h<VH> m76351c(int i) {
        AbstractC20975h hVar = this.f51334e;
        if (hVar != null && hVar.mo71053x() == i) {
            return this.f51334e;
        }
        for (int i2 = 0; i2 < getItemCount(); i2++) {
            AbstractC20975h<VH> a = mo71012a(i2);
            if (a.mo71053x() == i) {
                return a;
            }
        }
        throw new IllegalStateException("Could not find model for view type: " + i);
    }

    /* renamed from: a */
    public int mo71010a(AbstractC20975h hVar) {
        int i = 0;
        for (AbstractC20966c cVar : this.f51331b) {
            int c = cVar.mo71007c(hVar);
            if (c >= 0) {
                return c + i;
            }
            i += cVar.mo71008u();
        }
        return -1;
    }

    /* renamed from: b */
    public AbstractC20966c mo71022b(AbstractC20975h hVar) {
        for (AbstractC20966c cVar : this.f51331b) {
            if (cVar.mo71007c(hVar) >= 0) {
                return cVar;
            }
        }
        throw new IndexOutOfBoundsException("Item is not present in adapter or in any group");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        AbstractC20975h a = mo71012a(i);
        this.f51334e = a;
        if (a != null) {
            return a.mo71053x();
        }
        throw new RuntimeException("Invalid position " + i);
    }

    /* renamed from: b */
    public AbstractC20966c mo71021b(int i) {
        int i2 = 0;
        for (AbstractC20966c cVar : this.f51331b) {
            if (i - i2 < cVar.mo71008u()) {
                return cVar;
            }
            i2 += cVar.mo71008u();
        }
        throw new IndexOutOfBoundsException("Requested position " + i + " in group adapter but there are only " + i2 + " items");
    }

    /* renamed from: b */
    public void mo71025b(Collection<? extends AbstractC20966c> collection) {
        for (AbstractC20966c cVar : this.f51331b) {
            cVar.mo71006b(this);
        }
        this.f51331b.clear();
        this.f51331b.addAll(collection);
        for (AbstractC20966c cVar2 : collection) {
            cVar2.mo71005a(this);
        }
    }

    /* renamed from: a */
    public void onViewRecycled(VH vh) {
        vh.mo71035l().mo71040a(vh);
    }

    /* renamed from: b */
    public boolean onFailedToRecycleView(VH vh) {
        return vh.mo71035l().mo71051v();
    }

    /* renamed from: a */
    public void mo71018a(AbstractC20979j jVar) {
        this.f51332c = jVar;
    }

    /* renamed from: a */
    public void mo71019a(Collection<? extends AbstractC20966c> collection) {
        mo71020a(collection, true);
    }

    /* renamed from: a */
    public VH onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        AbstractC20975h<VH> c = m76351c(i);
        return c.mo71003b(from.inflate(c.mo71038a(), viewGroup, false));
    }

    @Override // com.p943f.p944a.AbstractC20970e
    /* renamed from: a */
    public void mo71013a(AbstractC20966c cVar, int i, int i2) {
        notifyItemRangeInserted(mo71009a(cVar) + i, i2);
    }

    @Override // com.p943f.p944a.AbstractC20970e
    /* renamed from: b */
    public void mo71024b(AbstractC20966c cVar, int i, int i2) {
        notifyItemRangeRemoved(mo71009a(cVar) + i, i2);
    }

    @Override // com.p943f.p944a.AbstractC20970e
    /* renamed from: c */
    public void mo71027c(AbstractC20966c cVar, int i, int i2) {
        int a = mo71009a(cVar);
        notifyItemMoved(i + a, a + i2);
    }

    /* renamed from: a */
    public void onBindViewHolder(VH vh, int i, List<Object> list) {
        mo71012a(i).mo71043a(vh, i, list, this.f51332c, this.f51333d);
    }

    @Override // com.p943f.p944a.AbstractC20970e
    /* renamed from: a */
    public void mo71014a(AbstractC20966c cVar, int i, int i2, Object obj) {
        notifyItemRangeChanged(mo71009a(cVar) + i, i2, obj);
    }
}
