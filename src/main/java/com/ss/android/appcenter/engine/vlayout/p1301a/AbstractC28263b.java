package com.ss.android.appcenter.engine.vlayout.p1301a;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.appcenter.engine.vlayout.AbstractC28280c;
import com.ss.android.appcenter.engine.vlayout.AbstractC28282e;
import com.ss.android.appcenter.engine.vlayout.VirtualLayoutManager;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.appcenter.engine.vlayout.a.b */
public abstract class AbstractC28263b extends AbstractC28275j {

    /* renamed from: h */
    public static boolean f70967h;

    /* renamed from: e */
    private int f70968e = 0;

    /* renamed from: f */
    private AbstractC28265b f70969f;

    /* renamed from: g */
    private AbstractC28264a f70970g;

    /* renamed from: i */
    protected Rect f70971i = new Rect();

    /* renamed from: j */
    View f70972j;

    /* renamed from: k */
    int f70973k;

    /* renamed from: l */
    float f70974l = Float.NaN;

    /* renamed from: com.ss.android.appcenter.engine.vlayout.a.b$a */
    public interface AbstractC28264a {
        void onBind(View view, AbstractC28263b bVar);
    }

    /* renamed from: com.ss.android.appcenter.engine.vlayout.a.b$b */
    public interface AbstractC28265b {
        /* renamed from: a */
        void mo100738a(View view, AbstractC28263b bVar);
    }

    /* renamed from: c */
    private int m103607c(int i, int i2) {
        if (i < i2) {
            return i2 - i;
        }
        return 0;
    }

    /* renamed from: b */
    public abstract void mo100718b(RecyclerView.Recycler recycler, RecyclerView.State state, VirtualLayoutManager.C28259c cVar, C28273h hVar, AbstractC28282e eVar);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo100734c(AbstractC28282e eVar) {
    }

    @Override // com.ss.android.appcenter.engine.vlayout.AbstractC28280c
    /* renamed from: c */
    public boolean mo100735c() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo100736c(int i) {
        return (i == Integer.MAX_VALUE || i == Integer.MIN_VALUE) ? false : true;
    }

    @Override // com.ss.android.appcenter.engine.vlayout.AbstractC28280c
    /* renamed from: b */
    public int mo100730b() {
        return this.f70968e;
    }

    /* renamed from: e */
    public boolean mo100737e() {
        if (this.f70973k == 0 && this.f70970g == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo100728a(AbstractC28264a aVar) {
        this.f70970g = aVar;
    }

    @Override // com.ss.android.appcenter.engine.vlayout.AbstractC28280c
    /* renamed from: b */
    public void mo100732b(int i) {
        this.f70968e = i;
    }

    @Override // com.ss.android.appcenter.engine.vlayout.AbstractC28280c
    /* renamed from: b */
    public final void mo100733b(AbstractC28282e eVar) {
        View view = this.f70972j;
        if (view != null) {
            AbstractC28265b bVar = this.f70969f;
            if (bVar != null) {
                bVar.mo100738a(view, this);
            }
            eVar.mo100682a(this.f70972j);
            this.f70972j = null;
        }
        mo100734c(eVar);
    }

    /* renamed from: a */
    public void mo100723a(View view) {
        view.measure(View.MeasureSpec.makeMeasureSpec(this.f70971i.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f70971i.height(), 1073741824));
        view.layout(this.f70971i.left, this.f70971i.top, this.f70971i.right, this.f70971i.bottom);
        AbstractC28264a aVar = this.f70970g;
        if (aVar != null) {
            aVar.onBind(view, this);
        }
        this.f70971i.set(0, 0, 0, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo100729a(C28273h hVar, View view) {
        if (view != null) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            boolean z = true;
            if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
                hVar.f71004c = true;
            }
            if (!hVar.f71005d && !view.isFocusable()) {
                z = false;
            }
            hVar.f71005d = z;
        }
    }

    @Override // com.ss.android.appcenter.engine.vlayout.AbstractC28280c
    /* renamed from: a */
    public void mo100727a(RecyclerView.Recycler recycler, RecyclerView.State state, AbstractC28282e eVar) {
        if (f70967h) {
            Log.m165379d("BaseLayoutHelper", "call beforeLayout() on " + getClass().getSimpleName());
        }
        if (mo100737e()) {
            Log.m165389i("BaseLayoutHelper", "beforeLayout>>> requireLayoutView");
            return;
        }
        View view = this.f70972j;
        if (view != null) {
            AbstractC28265b bVar = this.f70969f;
            if (bVar != null) {
                bVar.mo100738a(view, this);
            }
            eVar.mo100682a(this.f70972j);
            this.f70972j = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo100731b(AbstractC28282e eVar, boolean z, boolean z2, boolean z3) {
        int i;
        int i2;
        if (z) {
            i2 = this.f71015t;
            i = this.f71011p;
        } else {
            i2 = this.f71012q;
            i = this.f71008m;
        }
        return i2 + i;
    }

    /* renamed from: a */
    public final View mo100722a(RecyclerView.Recycler recycler, VirtualLayoutManager.C28259c cVar, AbstractC28282e eVar, C28273h hVar) {
        View a = cVar.mo100703a(recycler);
        if (a != null) {
            eVar.mo100685a(cVar, a);
            return a;
        } else if (!f70967h || cVar.mo100707c()) {
            hVar.f71003b = true;
            return null;
        } else {
            throw new RuntimeException("received null view when unexpected");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo100721a(AbstractC28282e eVar, boolean z, boolean z2, boolean z3) {
        AbstractC28280c cVar;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        AbstractC28275j jVar = null;
        if (eVar instanceof VirtualLayoutManager) {
            cVar = ((VirtualLayoutManager) eVar).mo100681a(this, z2);
        } else {
            cVar = null;
        }
        if (cVar != null && (cVar instanceof AbstractC28275j)) {
            jVar = (AbstractC28275j) cVar;
        }
        if (cVar == this) {
            return 0;
        }
        if (!z3) {
            if (z) {
                i10 = this.f71014s;
                i9 = this.f71010o;
            } else {
                i10 = this.f71012q;
                i9 = this.f71008m;
            }
            return i10 + i9;
        }
        if (jVar == null) {
            if (z) {
                i8 = this.f71014s;
                i7 = this.f71010o;
            } else {
                i8 = this.f71012q;
                i7 = this.f71008m;
            }
            i = i8 + i7;
        } else if (z) {
            if (z2) {
                i6 = jVar.f71015t;
                i5 = this.f71014s;
            } else {
                i6 = jVar.f71014s;
                i5 = this.f71015t;
            }
            i = m103607c(i6, i5);
        } else {
            if (z2) {
                i4 = jVar.f71013r;
                i3 = this.f71012q;
            } else {
                i4 = jVar.f71012q;
                i3 = this.f71013r;
            }
            i = m103607c(i4, i3);
        }
        if (z) {
            if (z2) {
                i2 = this.f71010o;
            } else {
                i2 = this.f71011p;
            }
        } else if (z2) {
            i2 = this.f71008m;
        } else {
            i2 = this.f71009n;
        }
        return i + i2 + 0;
    }

    @Override // com.ss.android.appcenter.engine.vlayout.AbstractC28280c
    /* renamed from: a */
    public void mo100726a(RecyclerView.Recycler recycler, RecyclerView.State state, VirtualLayoutManager.C28259c cVar, C28273h hVar, AbstractC28282e eVar) {
        mo100718b(recycler, state, cVar, hVar, eVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo100724a(View view, int i, int i2, int i3, int i4, AbstractC28282e eVar) {
        mo100725a(view, i, i2, i3, i4, eVar, false);
    }

    @Override // com.ss.android.appcenter.engine.vlayout.AbstractC28280c
    /* renamed from: a */
    public void mo100713a(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int i2, int i3, AbstractC28282e eVar) {
        View view;
        if (f70967h) {
            Log.m165379d("BaseLayoutHelper", "call afterLayout() on " + getClass().getSimpleName());
        }
        if (mo100737e()) {
            if (mo100736c(i3) && (view = this.f70972j) != null) {
                this.f70971i.union(view.getLeft(), this.f70972j.getTop(), this.f70972j.getRight(), this.f70972j.getBottom());
            }
            if (!this.f70971i.isEmpty()) {
                if (mo100736c(i3)) {
                    if (eVar.getOrientation() == 1) {
                        this.f70971i.offset(0, -i3);
                    } else {
                        this.f70971i.offset(-i3, 0);
                    }
                }
                int c = eVar.mo100692c();
                int d = eVar.mo100693d();
                if (eVar.getOrientation() != 1 ? !this.f70971i.intersects((-c) / 4, 0, c + (c / 4), d) : !this.f70971i.intersects(0, (-d) / 4, c, d + (d / 4))) {
                    this.f70971i.set(0, 0, 0, 0);
                    View view2 = this.f70972j;
                    if (view2 != null) {
                        view2.layout(0, 0, 0, 0);
                    }
                } else {
                    if (this.f70972j == null) {
                        View a = eVar.mo100680a();
                        this.f70972j = a;
                        eVar.mo100684a(a, true);
                    }
                    if (eVar.getOrientation() == 1) {
                        this.f70971i.left = eVar.getPaddingLeft() + this.f71012q;
                        this.f70971i.right = (eVar.mo100692c() - eVar.getPaddingRight()) - this.f71013r;
                    } else {
                        this.f70971i.top = eVar.getPaddingTop() + this.f71014s;
                        this.f70971i.bottom = (eVar.mo100692c() - eVar.getPaddingBottom()) - this.f71015t;
                    }
                    mo100723a(this.f70972j);
                    return;
                }
            }
        }
        View view3 = this.f70972j;
        if (view3 != null) {
            AbstractC28265b bVar = this.f70969f;
            if (bVar != null) {
                bVar.mo100738a(view3, this);
            }
            eVar.mo100682a(this.f70972j);
            this.f70972j = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo100725a(View view, int i, int i2, int i3, int i4, AbstractC28282e eVar, boolean z) {
        eVar.mo100683a(view, i, i2, i3, i4);
        if (!mo100737e()) {
            return;
        }
        if (z) {
            this.f70971i.union((i - this.f71008m) - this.f71012q, (i2 - this.f71010o) - this.f71014s, i3 + this.f71009n + this.f71013r, i4 + this.f71011p + this.f71015t);
        } else {
            this.f70971i.union(i - this.f71008m, i2 - this.f71010o, i3 + this.f71009n, i4 + this.f71011p);
        }
    }
}
