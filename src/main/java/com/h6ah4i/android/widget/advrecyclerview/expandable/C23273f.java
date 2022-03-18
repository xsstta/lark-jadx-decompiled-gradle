package com.h6ah4i.android.widget.advrecyclerview.expandable;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.h6ah4i.android.widget.advrecyclerview.draggable.AbstractC23263b;
import com.h6ah4i.android.widget.advrecyclerview.expandable.RecyclerViewExpandableItemManager;
import com.h6ah4i.android.widget.advrecyclerview.p1004a.C23231d;
import com.h6ah4i.android.widget.advrecyclerview.p1004a.C23232e;
import com.h6ah4i.android.widget.advrecyclerview.swipeable.AbstractC23297g;
import com.h6ah4i.android.widget.advrecyclerview.swipeable.p1008a.AbstractC23277a;
import com.h6ah4i.android.widget.advrecyclerview.utils.C23307f;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.h6ah4i.android.widget.advrecyclerview.expandable.f */
public class C23273f extends C23232e<RecyclerView.ViewHolder> implements AbstractC23297g<RecyclerView.ViewHolder> {

    /* renamed from: b */
    private AbstractC23270c f57367b;

    /* renamed from: c */
    private RecyclerViewExpandableItemManager f57368c;

    /* renamed from: d */
    private C23272e f57369d;

    /* renamed from: e */
    private int f57370e = -1;

    /* renamed from: f */
    private int f57371f = -1;

    /* renamed from: g */
    private int f57372g = -1;

    /* renamed from: h */
    private int f57373h = -1;

    /* renamed from: i */
    private int f57374i = -1;

    /* renamed from: j */
    private int f57375j = -1;

    /* renamed from: k */
    private int f57376k = -1;

    /* renamed from: l */
    private int f57377l = -1;

    /* renamed from: m */
    private RecyclerViewExpandableItemManager.AbstractC23267b f57378m;

    /* renamed from: n */
    private RecyclerViewExpandableItemManager.AbstractC23266a f57379n;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo80764a(int i, boolean z, Object obj) {
        if (!this.f57369d.mo80744a(i) || !this.f57367b.mo80730b(i, z, obj)) {
            return false;
        }
        if (this.f57369d.mo80752d(i)) {
            notifyItemRangeRemoved(this.f57369d.mo80739a(C23269b.m84398a(i)) + 1, this.f57369d.mo80747b(i));
        }
        notifyItemChanged(this.f57369d.mo80739a(C23269b.m84398a(i)), obj);
        RecyclerViewExpandableItemManager.AbstractC23266a aVar = this.f57379n;
        if (aVar != null) {
            aVar.mo80711a(i, z, obj);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo80763a(int i) {
        return this.f57369d.mo80744a(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo80762a(RecyclerViewExpandableItemManager.AbstractC23267b bVar) {
        this.f57378m = bVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.h6ah4i.android.widget.advrecyclerview.p1004a.C23232e
    /* renamed from: c */
    public void mo80577c() {
        m84443d();
        super.mo80577c();
    }

    @Override // com.h6ah4i.android.widget.advrecyclerview.p1004a.C23232e, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f57369d.mo80746b();
    }

    /* renamed from: d */
    private void m84443d() {
        C23272e eVar = this.f57369d;
        if (eVar != null) {
            long[] a = eVar.mo80745a();
            this.f57369d.mo80742a(this.f57367b, 0, this.f57368c.mo80697b());
            this.f57369d.mo80743a(a, null, null, null);
        }
    }

    /* renamed from: a */
    private static AbstractC23270c m84440a(RecyclerView.Adapter adapter) {
        return (AbstractC23270c) C23307f.m84666a(adapter, AbstractC23270c.class);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo80766b(int i) {
        int a = this.f57369d.mo80739a(C23269b.m84398a(i));
        int g = this.f57369d.mo80755g(i);
        if (g > 0) {
            notifyItemRangeRemoved(a, g);
        }
    }

    @Override // com.h6ah4i.android.widget.advrecyclerview.p1004a.C23232e, androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        if (this.f57367b == null) {
            return -1;
        }
        long f = this.f57369d.mo80754f(i);
        int b = C23269b.m84400b(f);
        int a = C23269b.m84397a(f);
        if (a == -1) {
            return C23231d.m84170a(this.f57367b.mo80728b(b));
        }
        return C23231d.m84171a(this.f57367b.mo80728b(b), this.f57367b.mo80721a(b, a));
    }

    @Override // com.h6ah4i.android.widget.advrecyclerview.p1004a.C23232e, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        int i2;
        if (this.f57367b == null) {
            return 0;
        }
        long f = this.f57369d.mo80754f(i);
        int b = C23269b.m84400b(f);
        int a = C23269b.m84397a(f);
        if (a == -1) {
            i2 = this.f57367b.mo80731c(b);
        } else {
            i2 = this.f57367b.mo80727b(b, a);
        }
        if ((i2 & Integer.MIN_VALUE) != 0) {
            throw new IllegalStateException("Illegal view type (type = " + Integer.toHexString(i2) + ")");
        } else if (a == -1) {
            return i2 | Integer.MIN_VALUE;
        } else {
            return i2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo80761a(RecyclerViewExpandableItemManager.AbstractC23266a aVar) {
        this.f57379n = aVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.h6ah4i.android.widget.advrecyclerview.p1004a.C23232e
    /* renamed from: a */
    public void mo80568a(int i, int i2) {
        super.mo80568a(i, i2);
    }

    /* access modifiers changed from: protected */
    @Override // com.h6ah4i.android.widget.advrecyclerview.p1004a.C23232e
    /* renamed from: b */
    public void mo80575b(int i, int i2) {
        m84443d();
        super.mo80575b(i, i2);
    }

    @Override // com.h6ah4i.android.widget.advrecyclerview.p1004a.C23232e, com.h6ah4i.android.widget.advrecyclerview.p1004a.AbstractC23234g
    /* renamed from: c */
    public void mo80579c(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder instanceof AbstractC23271d) {
            ((AbstractC23271d) viewHolder).mo80736a(-1);
        }
        super.mo80579c(viewHolder, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo80773e(int i, int i2) {
        int a = this.f57369d.mo80739a(C23269b.m84399a(i, i2));
        this.f57369d.mo80740a(i, i2);
        if (a != -1) {
            notifyItemRemoved(a);
        }
    }

    /* renamed from: f */
    private static void m84444f(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder instanceof AbstractC23271d) {
            AbstractC23271d dVar = (AbstractC23271d) viewHolder;
            int a = dVar.mo80735a();
            if (!(a == -1 || ((a ^ i) & 4) == 0)) {
                i |= 8;
            }
            if (a == -1 || ((a ^ i) & Integer.MAX_VALUE) != 0) {
                i |= Integer.MIN_VALUE;
            }
            dVar.mo80736a(i);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.h6ah4i.android.widget.advrecyclerview.p1004a.C23232e
    /* renamed from: c */
    public void mo80578c(int i, int i2) {
        if (i2 == 1) {
            long f = this.f57369d.mo80754f(i);
            int b = C23269b.m84400b(f);
            int a = C23269b.m84397a(f);
            if (a == -1) {
                this.f57369d.mo80755g(b);
            } else {
                this.f57369d.mo80740a(b, a);
            }
        } else {
            m84443d();
        }
        super.mo80578c(i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo80772d(int i, int i2) {
        this.f57369d.mo80748b(i, i2);
        int a = this.f57369d.mo80739a(C23269b.m84399a(i, i2));
        if (a != -1) {
            notifyItemInserted(a);
        }
    }

    @Override // com.h6ah4i.android.widget.advrecyclerview.swipeable.AbstractC23297g
    /* renamed from: e */
    public void mo80774e(RecyclerView.ViewHolder viewHolder, int i) {
        AbstractC23270c cVar = this.f57367b;
        if (cVar instanceof AbstractC23268a) {
            AbstractC23268a aVar = (AbstractC23268a) cVar;
            long f = this.f57369d.mo80754f(i);
            int b = C23269b.m84400b(f);
            int a = C23269b.m84397a(f);
            if (a == -1) {
                aVar.mo80715a(viewHolder, b);
            } else {
                aVar.mo80716a(viewHolder, b, a);
            }
        }
    }

    @Override // com.h6ah4i.android.widget.advrecyclerview.p1004a.C23232e, androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolder;
        AbstractC23270c cVar = this.f57367b;
        if (cVar == null) {
            return null;
        }
        int i2 = Integer.MAX_VALUE & i;
        if ((i & Integer.MIN_VALUE) != 0) {
            viewHolder = cVar.mo80722a(viewGroup, i2);
        } else {
            viewHolder = cVar.mo80729b(viewGroup, i2);
        }
        if (viewHolder instanceof AbstractC23271d) {
            ((AbstractC23271d) viewHolder).mo80736a(-1);
        }
        return viewHolder;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo80758a(int i, Object obj) {
        int a = this.f57369d.mo80739a(C23269b.m84398a(i));
        if (a != -1) {
            notifyItemChanged(a, obj);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo80759a(int i, boolean z) {
        if (this.f57369d.mo80738a(i, z) > 0) {
            notifyItemInserted(this.f57369d.mo80739a(C23269b.m84398a(i)));
            m84441a(i, 1, false, (Object) null);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.h6ah4i.android.widget.advrecyclerview.p1004a.C23232e
    /* renamed from: a */
    public void mo80569a(int i, int i2, int i3) {
        m84443d();
        super.mo80569a(i, i2, i3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo80768b(int i, int i2, Object obj) {
        mo80757a(i, i2, 1, obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo80771c(int i, int i2, int i3) {
        int a = this.f57369d.mo80739a(C23269b.m84399a(i, i2));
        this.f57369d.mo80741a(i, i2, i3);
        if (a != -1) {
            notifyItemRangeRemoved(a, i3);
        }
    }

    @Override // com.h6ah4i.android.widget.advrecyclerview.swipeable.AbstractC23297g
    /* renamed from: b */
    public AbstractC23277a mo80765b(RecyclerView.ViewHolder viewHolder, int i, int i2) {
        AbstractC23270c cVar = this.f57367b;
        if (!(cVar instanceof AbstractC23268a) || i == -1) {
            return null;
        }
        long f = this.f57369d.mo80754f(i);
        return C23275h.m84472a((AbstractC23268a) cVar, viewHolder, C23269b.m84400b(f), C23269b.m84397a(f), i2);
    }

    public C23273f(RecyclerViewExpandableItemManager recyclerViewExpandableItemManager, RecyclerView.Adapter<RecyclerView.ViewHolder> adapter, long[] jArr) {
        super(adapter);
        AbstractC23270c a = m84440a(adapter);
        this.f57367b = a;
        if (a == null) {
            throw new IllegalArgumentException("adapter does not implement ExpandableItemAdapter");
        } else if (recyclerViewExpandableItemManager != null) {
            this.f57368c = recyclerViewExpandableItemManager;
            C23272e eVar = new C23272e();
            this.f57369d = eVar;
            eVar.mo80742a(this.f57367b, 0, this.f57368c.mo80697b());
            if (jArr != null) {
                this.f57369d.mo80743a(jArr, null, null, null);
            }
        } else {
            throw new IllegalArgumentException("manager cannot be null");
        }
    }

    /* renamed from: c */
    private void m84442c(RecyclerView.ViewHolder viewHolder, int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (viewHolder instanceof AbstractC23263b) {
            AbstractC23263b bVar = (AbstractC23263b) viewHolder;
            int i3 = this.f57370e;
            boolean z5 = false;
            if (i3 == -1 || this.f57371f == -1) {
                z = false;
            } else {
                z = true;
            }
            int i4 = this.f57372g;
            if (i4 == -1 || this.f57373h == -1) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (i < i3 || i > this.f57371f) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (i == -1 || i2 < i4 || i2 > this.f57373h) {
                z4 = false;
            } else {
                z4 = true;
            }
            int a = bVar.mo80684a();
            if ((a & 1) != 0 && (a & 4) == 0 && ((!z || z3) && (!z2 || (z2 && z4)))) {
                z5 = true;
            }
            if (z5) {
                bVar.mo80685a(a | 4 | Integer.MIN_VALUE);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo80767b(int i, int i2, int i3) {
        this.f57369d.mo80749b(i, i2, i3);
        int a = this.f57369d.mo80739a(C23269b.m84399a(i, i2));
        if (a != -1) {
            notifyItemRangeInserted(a, i3);
        }
    }

    @Override // com.h6ah4i.android.widget.advrecyclerview.p1004a.C23232e, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        int i2;
        if (this.f57367b != null) {
            long f = this.f57369d.mo80754f(i);
            int b = C23269b.m84400b(f);
            int a = C23269b.m84397a(f);
            int itemViewType = viewHolder.getItemViewType() & Integer.MAX_VALUE;
            if (a == -1) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            if (this.f57369d.mo80744a(b)) {
                i2 |= 4;
            }
            m84444f(viewHolder, i2);
            m84442c(viewHolder, b, a);
            if (a == -1) {
                this.f57367b.mo80724a(viewHolder, b, itemViewType, list);
            } else {
                this.f57367b.mo80723a(viewHolder, b, a, itemViewType, list);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo80769b(int i, boolean z, Object obj) {
        if (this.f57369d.mo80744a(i) || !this.f57367b.mo80725a(i, z, obj)) {
            return false;
        }
        if (this.f57369d.mo80753e(i)) {
            notifyItemRangeInserted(this.f57369d.mo80739a(C23269b.m84398a(i)) + 1, this.f57369d.mo80747b(i));
        }
        notifyItemChanged(this.f57369d.mo80739a(C23269b.m84398a(i)), obj);
        RecyclerViewExpandableItemManager.AbstractC23267b bVar = this.f57378m;
        if (bVar != null) {
            bVar.mo80712a(i, z, obj);
        }
        return true;
    }

    @Override // com.h6ah4i.android.widget.advrecyclerview.swipeable.AbstractC23297g
    /* renamed from: a */
    public void mo80760a(RecyclerView.ViewHolder viewHolder, int i, int i2) {
        AbstractC23270c cVar = this.f57367b;
        if (cVar instanceof AbstractC23268a) {
            AbstractC23268a aVar = (AbstractC23268a) cVar;
            long f = this.f57369d.mo80754f(i);
            int b = C23269b.m84400b(f);
            int a = C23269b.m84397a(f);
            if (a == -1) {
                aVar.mo80717b(viewHolder, b, i2);
            } else {
                aVar.mo80718b(viewHolder, b, a, i2);
            }
        }
    }

    /* renamed from: a */
    private void m84441a(int i, int i2, boolean z, Object obj) {
        if (this.f57378m != null) {
            for (int i3 = 0; i3 < i2; i3++) {
                this.f57378m.mo80712a(i + i3, z, obj);
            }
        }
    }

    @Override // com.h6ah4i.android.widget.advrecyclerview.swipeable.AbstractC23297g
    /* renamed from: a */
    public int mo80756a(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3) {
        AbstractC23270c cVar = this.f57367b;
        if (!(cVar instanceof AbstractC23268a)) {
            return 0;
        }
        AbstractC23268a aVar = (AbstractC23268a) cVar;
        long f = this.f57369d.mo80754f(i);
        int b = C23269b.m84400b(f);
        int a = C23269b.m84397a(f);
        if (a == -1) {
            return aVar.mo80713a(viewHolder, b, i2, i3);
        }
        return aVar.mo80714a(viewHolder, b, a, i2, i3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo80757a(int i, int i2, int i3, Object obj) {
        int a;
        int c = this.f57369d.mo80750c(i);
        if (c > 0 && i2 < c && (a = this.f57369d.mo80739a(C23269b.m84399a(i, 0))) != -1) {
            notifyItemRangeChanged(a + i2, Math.min(i3, c - i2), obj);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo80770b(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3) {
        if (this.f57367b == null) {
            return false;
        }
        long f = this.f57369d.mo80754f(i);
        int b = C23269b.m84400b(f);
        if (C23269b.m84397a(f) != -1) {
            return false;
        }
        boolean z = !this.f57369d.mo80744a(b);
        if (!this.f57367b.mo80726a(viewHolder, b, i2, i3, z)) {
            return false;
        }
        if (z) {
            mo80769b(b, true, (Object) null);
        } else {
            mo80764a(b, true, (Object) null);
        }
        return true;
    }
}
