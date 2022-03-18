package com.h6ah4i.android.widget.advrecyclerview.p1005b;

import android.util.Log;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.h6ah4i.android.widget.advrecyclerview.p1005b.p1006a.AbstractC23243d;
import com.h6ah4i.android.widget.advrecyclerview.p1005b.p1006a.AbstractC23245f;
import com.h6ah4i.android.widget.advrecyclerview.p1005b.p1006a.AbstractC23246g;
import com.h6ah4i.android.widget.advrecyclerview.p1005b.p1006a.AbstractC23247h;

/* renamed from: com.h6ah4i.android.widget.advrecyclerview.b.c */
public abstract class AbstractC23251c extends AbstractC23236a {

    /* renamed from: a */
    private boolean f57326a;

    /* renamed from: b */
    private AbstractC23247h f57327b;

    /* renamed from: c */
    private AbstractC23243d f57328c;

    /* renamed from: d */
    private AbstractC23245f f57329d;

    /* renamed from: e */
    private AbstractC23246g f57330e;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo80649c();

    @Override // com.h6ah4i.android.widget.advrecyclerview.p1005b.AbstractC23236a
    /* renamed from: b */
    public boolean mo80588b() {
        return this.f57326a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo80655e() {
        mo80656f();
    }

    protected AbstractC23251c() {
        m84287g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void runPendingAnimations() {
        if (mo80654d()) {
            mo80655e();
        }
    }

    /* renamed from: g */
    private void m84287g() {
        mo80649c();
        if (this.f57327b == null || this.f57328c == null || this.f57329d == null || this.f57330e == null) {
            throw new IllegalStateException("setup incomplete");
        }
    }

    @Override // com.h6ah4i.android.widget.advrecyclerview.p1005b.AbstractC23236a
    /* renamed from: a */
    public boolean mo80585a() {
        if (this.f57326a && !isRunning()) {
            Log.d("ARVGeneralItemAnimator", "dispatchFinishedWhenDone()");
        }
        return super.mo80585a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo80654d() {
        if (this.f57327b.mo80607b() || this.f57330e.mo80607b() || this.f57329d.mo80607b() || this.f57328c.mo80607b()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean isRunning() {
        if (this.f57327b.mo80610c() || this.f57328c.mo80610c() || this.f57329d.mo80610c() || this.f57330e.mo80610c()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void endAnimations() {
        this.f57330e.mo80615e();
        this.f57327b.mo80615e();
        this.f57328c.mo80615e();
        this.f57329d.mo80615e();
        if (isRunning()) {
            this.f57330e.mo80618f();
            this.f57328c.mo80618f();
            this.f57329d.mo80618f();
            this.f57327b.mo80612d();
            this.f57330e.mo80612d();
            this.f57328c.mo80612d();
            this.f57329d.mo80612d();
            dispatchAnimationsFinished();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo80656f() {
        long j;
        long j2;
        long j3;
        boolean b = this.f57327b.mo80607b();
        boolean b2 = this.f57330e.mo80607b();
        boolean b3 = this.f57329d.mo80607b();
        boolean b4 = this.f57328c.mo80607b();
        long j4 = 0;
        if (b) {
            j = getRemoveDuration();
        } else {
            j = 0;
        }
        if (b2) {
            j2 = getMoveDuration();
        } else {
            j2 = 0;
        }
        if (b3) {
            j3 = getChangeDuration();
        } else {
            j3 = 0;
        }
        boolean z = false;
        if (b) {
            this.f57327b.mo80603a(false, 0L);
        }
        if (b2) {
            this.f57330e.mo80603a(b, j);
        }
        if (b3) {
            this.f57329d.mo80603a(b, j);
        }
        if (b4) {
            if (b || b2 || b3) {
                z = true;
            }
            long max = j + Math.max(j2, j3);
            if (z) {
                j4 = max;
            }
            this.f57328c.mo80603a(z, j4);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo80650a(AbstractC23243d dVar) {
        this.f57328c = dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo80651a(AbstractC23245f fVar) {
        this.f57329d = fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo80652a(AbstractC23246g gVar) {
        this.f57330e = gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo80657g(RecyclerView.ViewHolder viewHolder) {
        ViewCompat.m4103r(viewHolder.itemView).mo4730b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo80653a(AbstractC23247h hVar) {
        this.f57327b = hVar;
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateAdd(RecyclerView.ViewHolder viewHolder) {
        if (this.f57326a) {
            Log.d("ARVGeneralItemAnimator", "animateAdd(id = " + viewHolder.getItemId() + ", position = " + viewHolder.getLayoutPosition() + ")");
        }
        return this.f57328c.mo80625a(viewHolder);
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateRemove(RecyclerView.ViewHolder viewHolder) {
        if (this.f57326a) {
            Log.d("ARVGeneralItemAnimator", "animateRemove(id = " + viewHolder.getItemId() + ", position = " + viewHolder.getLayoutPosition() + ")");
        }
        return this.f57327b.mo80625a(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void endAnimation(RecyclerView.ViewHolder viewHolder) {
        mo80657g(viewHolder);
        this.f57330e.mo80613d(viewHolder);
        this.f57329d.mo80613d(viewHolder);
        this.f57327b.mo80613d(viewHolder);
        this.f57328c.mo80613d(viewHolder);
        this.f57330e.mo80616e(viewHolder);
        this.f57329d.mo80616e(viewHolder);
        this.f57327b.mo80616e(viewHolder);
        this.f57328c.mo80616e(viewHolder);
        if (this.f57327b.mo80611c(viewHolder) && this.f57326a) {
            throw new IllegalStateException("after animation is cancelled, item should not be in the active animation list [remove]");
        } else if (this.f57328c.mo80611c(viewHolder) && this.f57326a) {
            throw new IllegalStateException("after animation is cancelled, item should not be in the active animation list [add]");
        } else if (this.f57329d.mo80611c(viewHolder) && this.f57326a) {
            throw new IllegalStateException("after animation is cancelled, item should not be in the active animation list [change]");
        } else if (!this.f57330e.mo80611c(viewHolder) || !this.f57326a) {
            mo80585a();
        } else {
            throw new IllegalStateException("after animation is cancelled, item should not be in the active animation list [move]");
        }
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateMove(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
        if (this.f57326a) {
            Log.d("ARVGeneralItemAnimator", "animateMove(id = " + viewHolder.getItemId() + ", position = " + viewHolder.getLayoutPosition() + ", fromX = " + i + ", fromY = " + i2 + ", toX = " + i3 + ", toY = " + i4 + ")");
        }
        return this.f57330e.mo80638a(viewHolder, i, i2, i3, i4);
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateChange(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4) {
        String str;
        String str2;
        String str3;
        if (viewHolder == viewHolder2) {
            return this.f57330e.mo80638a(viewHolder, i, i2, i3, i4);
        }
        if (this.f57326a) {
            String str4 = "-";
            if (viewHolder != null) {
                str = Long.toString(viewHolder.getItemId());
            } else {
                str = str4;
            }
            if (viewHolder != null) {
                str2 = Long.toString((long) viewHolder.getLayoutPosition());
            } else {
                str2 = str4;
            }
            if (viewHolder2 != null) {
                str3 = Long.toString(viewHolder2.getItemId());
            } else {
                str3 = str4;
            }
            if (viewHolder2 != null) {
                str4 = Long.toString((long) viewHolder2.getLayoutPosition());
            }
            Log.d("ARVGeneralItemAnimator", "animateChange(old.id = " + str + ", old.position = " + str2 + ", new.id = " + str3 + ", new.position = " + str4 + ", fromX = " + i + ", fromY = " + i2 + ", toX = " + i3 + ", toY = " + i4 + ")");
        }
        return this.f57329d.mo80631a(viewHolder, viewHolder2, i, i2, i3, i4);
    }
}
