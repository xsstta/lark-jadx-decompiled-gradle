package com.h6ah4i.android.widget.advrecyclerview.swipeable;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.h6ah4i.android.widget.advrecyclerview.swipeable.p1008a.AbstractC23277a;
import com.h6ah4i.android.widget.advrecyclerview.utils.C23304c;
import com.h6ah4i.android.widget.advrecyclerview.utils.C23307f;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* renamed from: com.h6ah4i.android.widget.advrecyclerview.swipeable.i */
public class C23299i<VH extends RecyclerView.ViewHolder> extends C23304c<VH> {

    /* renamed from: b */
    private AbstractC23297g f57456b;

    /* renamed from: c */
    private C23289c f57457c;

    /* renamed from: d */
    private long f57458d = -1;

    /* renamed from: e */
    private AbstractC23298h f57459e;

    /* renamed from: f */
    private boolean f57460f;

    /* renamed from: b */
    private static boolean m84598b(int i, int i2, int i3) {
        return i >= i2 && i < i2 + i3;
    }

    /* renamed from: d */
    private static float m84599d(int i, int i2) {
        if (i2 == 1 || i2 == 2) {
            if (i == 2) {
                return -65536.0f;
            }
            if (i == 3) {
                return -65537.0f;
            }
            if (i == 4) {
                return 65536.0f;
            }
            if (i != 5) {
                return BitmapDescriptorFactory.HUE_RED;
            }
            return 65537.0f;
        } else if (i2 == 4 && i == 2) {
            return -65536.0f;
        } else {
            return BitmapDescriptorFactory.HUE_RED;
        }
    }

    /* renamed from: a */
    public void mo80858a(AbstractC23298h hVar) {
        this.f57459e = hVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo80857a(C23289c cVar, RecyclerView.ViewHolder viewHolder, int i, long j) {
        this.f57458d = j;
        this.f57460f = true;
        this.f57456b.mo80774e(viewHolder, i);
        this.f57460f = false;
    }

    /* renamed from: f */
    private void m84601f() {
        C23289c cVar = this.f57457c;
        if (cVar != null) {
            cVar.mo80816c();
        }
    }

    /* renamed from: g */
    private boolean m84602g() {
        return this.f57457c.mo80818d();
    }

    /* renamed from: d */
    public void mo80859d() {
        AbstractC23298h hVar = this.f57459e;
        if (hVar != null) {
            hVar.mo80835a(BitmapDescriptorFactory.HUE_RED);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo80860e() {
        if (this.f57458d != -1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.h6ah4i.android.widget.advrecyclerview.p1004a.C23232e
    /* renamed from: c */
    public void mo80577c() {
        if (mo80860e() && !this.f57460f) {
            m84601f();
        }
        super.mo80577c();
    }

    /* access modifiers changed from: protected */
    @Override // com.h6ah4i.android.widget.advrecyclerview.p1004a.C23232e
    /* renamed from: a */
    public void mo80568a(int i, int i2) {
        super.mo80568a(i, i2);
    }

    /* renamed from: a */
    private static float m84596a(AbstractC23298h hVar, boolean z) {
        if (z) {
            return hVar.mo80845e();
        }
        return hVar.mo80846f();
    }

    @Override // com.h6ah4i.android.widget.advrecyclerview.p1004a.C23232e, androidx.recyclerview.widget.RecyclerView.Adapter
    public VH onCreateViewHolder(ViewGroup viewGroup, int i) {
        VH vh = (VH) super.onCreateViewHolder(viewGroup, i);
        if (vh instanceof AbstractC23298h) {
            ((AbstractC23298h) vh).mo80837a(-1);
        }
        return vh;
    }

    /* renamed from: e */
    private static void m84600e(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder instanceof AbstractC23298h) {
            AbstractC23298h hVar = (AbstractC23298h) viewHolder;
            int a = hVar.mo80834a();
            if (a == -1 || ((a ^ i) & Integer.MAX_VALUE) != 0) {
                i |= Integer.MIN_VALUE;
            }
            hVar.mo80837a(i);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.h6ah4i.android.widget.advrecyclerview.p1004a.C23232e
    /* renamed from: b */
    public void mo80575b(int i, int i2) {
        int e;
        if (mo80860e() && (e = this.f57457c.mo80819e()) >= i) {
            this.f57457c.mo80810b(e + i2);
        }
        super.mo80575b(i, i2);
    }

    public C23299i(C23289c cVar, RecyclerView.Adapter<VH> adapter) {
        super(adapter);
        AbstractC23297g gVar = (AbstractC23297g) C23307f.m84666a(adapter, AbstractC23297g.class);
        this.f57456b = gVar;
        if (gVar == null) {
            throw new IllegalArgumentException("adapter does not implement SwipeableItemAdapter");
        } else if (cVar != null) {
            this.f57457c = cVar;
        } else {
            throw new IllegalArgumentException("manager cannot be null");
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.h6ah4i.android.widget.advrecyclerview.p1004a.C23232e
    /* renamed from: c */
    public void mo80578c(int i, int i2) {
        if (mo80860e()) {
            int e = this.f57457c.mo80819e();
            if (m84598b(e, i, i2)) {
                m84601f();
            } else if (i < e) {
                this.f57457c.mo80810b(e - i2);
            }
        }
        super.mo80578c(i, i2);
    }

    @Override // com.h6ah4i.android.widget.advrecyclerview.p1004a.C23232e, com.h6ah4i.android.widget.advrecyclerview.p1004a.AbstractC23234g
    /* renamed from: c */
    public void mo80579c(VH vh, int i) {
        super.mo80579c(vh, i);
        long j = this.f57458d;
        if (j != -1 && j == vh.getItemId()) {
            this.f57457c.mo80816c();
        }
        if (vh instanceof AbstractC23298h) {
            C23289c cVar = this.f57457c;
            if (cVar != null) {
                cVar.mo80811b(vh);
            }
            AbstractC23298h hVar = (AbstractC23298h) vh;
            hVar.mo80841b(0);
            hVar.mo80843c(0);
            hVar.mo80835a(BitmapDescriptorFactory.HUE_RED);
            hVar.mo80840b(BitmapDescriptorFactory.HUE_RED);
            hVar.mo80838a(true);
            View a = C23300j.m84620a(hVar);
            if (a != null) {
                ViewCompat.m4103r(a).mo4730b();
                a.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                a.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            }
        }
    }

    /* renamed from: a */
    private static void m84597a(AbstractC23298h hVar, float f, boolean z) {
        if (z) {
            hVar.mo80835a(f);
        } else {
            hVar.mo80840b(f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public AbstractC23277a mo80853a(RecyclerView.ViewHolder viewHolder, int i, int i2) {
        this.f57458d = -1;
        return this.f57456b.mo80765b(viewHolder, i, i2);
    }

    /* access modifiers changed from: protected */
    @Override // com.h6ah4i.android.widget.advrecyclerview.p1004a.C23232e
    /* renamed from: a */
    public void mo80569a(int i, int i2, int i3) {
        if (mo80860e()) {
            this.f57457c.mo80820f();
        }
        super.mo80569a(i, i2, i3);
    }

    /* access modifiers changed from: protected */
    @Override // com.h6ah4i.android.widget.advrecyclerview.p1004a.C23232e
    /* renamed from: a */
    public void mo80570a(int i, int i2, Object obj) {
        super.mo80570a(i, i2, obj);
    }

    @Override // com.h6ah4i.android.widget.advrecyclerview.p1004a.C23232e, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(VH vh, int i, List<Object> list) {
        AbstractC23298h hVar;
        float f;
        boolean z = vh instanceof AbstractC23298h;
        if (z) {
            hVar = (AbstractC23298h) vh;
        } else {
            hVar = null;
        }
        if (hVar != null) {
            f = m84596a((AbstractC23298h) vh, m84602g());
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        if (mo80860e()) {
            int i2 = 1;
            if (vh.getItemId() == this.f57458d) {
                i2 = 3;
            }
            m84600e(vh, i2);
            super.onBindViewHolder(vh, i, list);
        } else {
            m84600e(vh, 0);
            super.onBindViewHolder(vh, i, list);
        }
        if (z && this.f57459e != vh) {
            ((AbstractC23298h) vh).mo80835a(BitmapDescriptorFactory.HUE_RED);
        }
        if (hVar != null) {
            float a = m84596a(hVar, m84602g());
            boolean d = hVar.mo80844d();
            boolean b = this.f57457c.mo80814b();
            boolean a2 = this.f57457c.mo80807a(vh);
            if (Math.signum(f) != BitmapDescriptorFactory.HUE_RED || Math.signum(a) != BitmapDescriptorFactory.HUE_RED || b || a2 || ((AbstractC23298h) vh).mo80839b() != 0) {
                if (f != a || (!b && !a2)) {
                    this.f57457c.mo80803a(vh, i, f, a, d, m84602g(), true, b);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo80852a(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3) {
        return this.f57456b.mo80756a(viewHolder, i, i2, i3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo80856a(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, AbstractC23277a aVar) {
        AbstractC23298h hVar = (AbstractC23298h) viewHolder;
        hVar.mo80841b(i2);
        hVar.mo80843c(i3);
        if (i3 != 3) {
            m84597a(hVar, m84599d(i2, i3), m84602g());
        }
        aVar.mo80778b();
        notifyDataSetChanged();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo80854a(RecyclerView.ViewHolder viewHolder, int i, float f, boolean z, boolean z2, boolean z3) {
        float f2;
        AbstractC23298h hVar = (AbstractC23298h) viewHolder;
        float a = C23289c.m84508a(hVar, z2, f, z, hVar.mo80844d());
        if (z2) {
            f2 = a;
        } else {
            f2 = BitmapDescriptorFactory.HUE_RED;
        }
        if (z2) {
            a = BitmapDescriptorFactory.HUE_RED;
        }
        hVar.mo80836a(f2, a, z3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo80855a(RecyclerView.ViewHolder viewHolder, int i, float f, boolean z, boolean z2, boolean z3, int i2) {
        this.f57456b.mo80760a(viewHolder, i, i2);
    }
}
