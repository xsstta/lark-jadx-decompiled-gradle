package com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable.p2229a.AbstractC44022a;
import com.ss.android.lark.mail.impl.widget.advrecyclerview.utils.C44046b;
import com.ss.android.lark.mail.impl.widget.advrecyclerview.utils.C44049e;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable.i */
public class C44042i<VH extends RecyclerView.ViewHolder> extends C44046b<VH> {

    /* renamed from: b */
    private AbstractC44040g f111778b;

    /* renamed from: c */
    private C44032c f111779c;

    /* renamed from: d */
    private long f111780d = -1;

    /* renamed from: e */
    private AbstractC44041h f111781e;

    /* renamed from: f */
    private boolean f111782f;

    /* renamed from: b */
    private static boolean m174450b(int i, int i2, int i3) {
        return i >= i2 && i < i2 + i3;
    }

    /* renamed from: d */
    private static float m174451d(int i, int i2) {
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
    public void mo156716a(AbstractC44041h hVar) {
        this.f111781e = hVar;
    }

    /* renamed from: e */
    private void m174452e() {
        C44032c cVar = this.f111779c;
        if (cVar != null) {
            cVar.mo156679c();
        }
    }

    /* renamed from: f */
    private boolean m174454f() {
        return this.f111779c.mo156681d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo156717d() {
        if (this.f111780d != -1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.widget.advrecyclerview.p2226a.C44000e
    /* renamed from: c */
    public void mo156578c() {
        if (mo156717d() && !this.f111782f) {
            m174452e();
        }
        super.mo156578c();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.widget.advrecyclerview.p2226a.C44000e
    /* renamed from: a */
    public void mo156569a(int i, int i2) {
        super.mo156569a(i, i2);
    }

    /* renamed from: a */
    private static float m174448a(AbstractC44041h hVar, boolean z) {
        if (z) {
            return hVar.mo156704j();
        }
        return hVar.mo156705k();
    }

    @Override // com.ss.android.lark.mail.impl.widget.advrecyclerview.p2226a.C44000e, androidx.recyclerview.widget.RecyclerView.Adapter
    public VH onCreateViewHolder(ViewGroup viewGroup, int i) {
        VH vh = (VH) super.onCreateViewHolder(viewGroup, i);
        if (vh instanceof AbstractC44041h) {
            ((AbstractC44041h) vh).mo156696a(-1);
        }
        return vh;
    }

    /* renamed from: e */
    private static void m174453e(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder instanceof AbstractC44041h) {
            AbstractC44041h hVar = (AbstractC44041h) viewHolder;
            int g = hVar.mo156701g();
            if (g == -1 || ((g ^ i) & Integer.MAX_VALUE) != 0) {
                i |= Integer.MIN_VALUE;
            }
            hVar.mo156696a(i);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.widget.advrecyclerview.p2226a.C44000e
    /* renamed from: b */
    public void mo156576b(int i, int i2) {
        int e;
        if (mo156717d() && (e = this.f111779c.mo156682e()) >= i) {
            this.f111779c.mo156677c(e + i2);
        }
        super.mo156576b(i, i2);
    }

    public C44042i(C44032c cVar, RecyclerView.Adapter<VH> adapter) {
        super(adapter);
        AbstractC44040g gVar = (AbstractC44040g) C44049e.m174507a(adapter, AbstractC44040g.class);
        this.f111778b = gVar;
        if (gVar == null) {
            throw new IllegalArgumentException("adapter does not implement SwipeableItemAdapter");
        } else if (cVar != null) {
            this.f111779c = cVar;
        } else {
            throw new IllegalArgumentException("manager cannot be null");
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.widget.advrecyclerview.p2226a.C44000e
    /* renamed from: c */
    public void mo156579c(int i, int i2) {
        if (mo156717d()) {
            int e = this.f111779c.mo156682e();
            if (m174450b(e, i, i2)) {
                m174452e();
            } else if (i < e) {
                this.f111779c.mo156677c(e - i2);
            }
        }
        super.mo156579c(i, i2);
    }

    @Override // com.ss.android.lark.mail.impl.widget.advrecyclerview.p2226a.C44000e, com.ss.android.lark.mail.impl.widget.advrecyclerview.p2226a.AbstractC44002g
    /* renamed from: c */
    public void mo156580c(VH vh, int i) {
        super.mo156580c(vh, i);
        long j = this.f111780d;
        if (j != -1 && j == vh.getItemId()) {
            this.f111779c.mo156679c();
        }
        if (vh instanceof AbstractC44041h) {
            C44032c cVar = this.f111779c;
            if (cVar != null) {
                cVar.mo156673b(vh);
            }
            AbstractC44041h hVar = (AbstractC44041h) vh;
            hVar.mo156698b(0);
            hVar.mo156699c(0);
            hVar.mo156695a(BitmapDescriptorFactory.HUE_RED);
            hVar.mo156697b(BitmapDescriptorFactory.HUE_RED);
            hVar.mo156700d(true);
            View a = C44043j.m174471a(hVar);
            if (a != null) {
                ViewCompat.m4103r(a).mo4730b();
                a.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                a.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            }
        }
    }

    /* renamed from: a */
    private static void m174449a(AbstractC44041h hVar, float f, boolean z) {
        if (z) {
            hVar.mo156695a(f);
        } else {
            hVar.mo156697b(f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public AbstractC44022a mo156711a(RecyclerView.ViewHolder viewHolder, int i, int i2) {
        this.f111780d = -1;
        return this.f111778b.mo153099b(viewHolder, i, i2);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.widget.advrecyclerview.p2226a.C44000e
    /* renamed from: a */
    public void mo156570a(int i, int i2, int i3) {
        if (mo156717d()) {
            this.f111779c.mo156683f();
        }
        super.mo156570a(i, i2, i3);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.widget.advrecyclerview.p2226a.C44000e
    /* renamed from: a */
    public void mo156571a(int i, int i2, Object obj) {
        super.mo156571a(i, i2, obj);
    }

    @Override // com.ss.android.lark.mail.impl.widget.advrecyclerview.p2226a.C44000e, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(VH vh, int i, List<Object> list) {
        AbstractC44041h hVar;
        float f;
        boolean z = vh instanceof AbstractC44041h;
        if (z) {
            hVar = (AbstractC44041h) vh;
        } else {
            hVar = null;
        }
        if (hVar != null) {
            f = m174448a((AbstractC44041h) vh, m174454f());
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        if (mo156717d()) {
            int i2 = 1;
            if (vh.getItemId() == this.f111780d) {
                i2 = 3;
            }
            m174453e(vh, i2);
            super.onBindViewHolder(vh, i, list);
        } else {
            m174453e(vh, 0);
            super.onBindViewHolder(vh, i, list);
        }
        if (z && this.f111781e != vh) {
            ((AbstractC44041h) vh).mo156695a(BitmapDescriptorFactory.HUE_RED);
        }
        if (hVar != null) {
            float a = m174448a(hVar, m174454f());
            boolean i3 = hVar.mo156703i();
            boolean b = this.f111779c.mo156676b();
            boolean a2 = this.f111779c.mo156669a(vh);
            if (Math.signum(f) != BitmapDescriptorFactory.HUE_RED || Math.signum(a) != BitmapDescriptorFactory.HUE_RED || b || a2 || ((AbstractC44041h) vh).mo156702h() != 0) {
                if (f != a || (!b && !a2)) {
                    this.f111779c.mo156664a(vh, i, f, a, i3, m174454f(), true, b);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo156710a(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3) {
        return this.f111778b.mo153096a(viewHolder, i, i2, i3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo156715a(C44032c cVar, RecyclerView.ViewHolder viewHolder, int i, long j) {
        this.f111780d = j;
        this.f111782f = true;
        this.f111778b.mo153097a(viewHolder, i);
        this.f111782f = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo156714a(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, AbstractC44022a aVar) {
        AbstractC44041h hVar = (AbstractC44041h) viewHolder;
        hVar.mo156698b(i2);
        hVar.mo156699c(i3);
        if (i3 != 3) {
            m174449a(hVar, m174451d(i2, i3), m174454f());
        }
        aVar.mo156642e();
        notifyDataSetChanged();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo156712a(RecyclerView.ViewHolder viewHolder, int i, float f, boolean z, boolean z2, boolean z3) {
        float f2;
        AbstractC44041h hVar = (AbstractC44041h) viewHolder;
        float a = C44032c.m174359a(hVar, z2, f, z, hVar.mo156703i());
        if (z2) {
            f2 = a;
        } else {
            f2 = BitmapDescriptorFactory.HUE_RED;
        }
        if (z2) {
            a = BitmapDescriptorFactory.HUE_RED;
        }
        hVar.mo153359a(f2, a, z3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo156713a(RecyclerView.ViewHolder viewHolder, int i, float f, boolean z, boolean z2, boolean z3, int i2) {
        this.f111778b.mo153098a(viewHolder, i, i2);
    }
}
