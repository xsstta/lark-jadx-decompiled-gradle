package com.ss.android.lark.mail.impl.widget.advrecyclerview.p2227b;

import android.util.Log;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.mail.impl.widget.advrecyclerview.p2227b.p2228a.AbstractC44010d;
import com.ss.android.lark.mail.impl.widget.advrecyclerview.p2227b.p2228a.AbstractC44012f;
import com.ss.android.lark.mail.impl.widget.advrecyclerview.p2227b.p2228a.AbstractC44013g;
import com.ss.android.lark.mail.impl.widget.advrecyclerview.p2227b.p2228a.AbstractC44014h;

/* renamed from: com.ss.android.lark.mail.impl.widget.advrecyclerview.b.c */
public abstract class AbstractC44018c extends AbstractC44004a {

    /* renamed from: a */
    private boolean f111696a;

    /* renamed from: b */
    private AbstractC44014h f111697b;

    /* renamed from: c */
    private AbstractC44010d f111698c;

    /* renamed from: d */
    private AbstractC44012f f111699d;

    /* renamed from: e */
    private AbstractC44013g f111700e;

    @Override // com.ss.android.lark.mail.impl.widget.advrecyclerview.p2227b.AbstractC44004a
    /* renamed from: b */
    public boolean mo156589b() {
        return this.f111696a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo156638d() {
        mo156639e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void runPendingAnimations() {
        if (mo156637c()) {
            mo156638d();
        }
    }

    @Override // com.ss.android.lark.mail.impl.widget.advrecyclerview.p2227b.AbstractC44004a
    /* renamed from: a */
    public boolean mo156586a() {
        if (this.f111696a && !isRunning()) {
            Log.d("ARVGeneralItemAnimator", "dispatchFinishedWhenDone()");
        }
        return super.mo156586a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo156637c() {
        if (this.f111697b.mo156608b() || this.f111700e.mo156608b() || this.f111699d.mo156608b() || this.f111698c.mo156608b()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean isRunning() {
        if (this.f111697b.mo156611c() || this.f111698c.mo156611c() || this.f111699d.mo156611c() || this.f111700e.mo156611c()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo156639e() {
        long j;
        long j2;
        long j3;
        boolean b = this.f111697b.mo156608b();
        boolean b2 = this.f111700e.mo156608b();
        boolean b3 = this.f111699d.mo156608b();
        boolean b4 = this.f111698c.mo156608b();
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
            this.f111697b.mo156603a(false, 0L);
        }
        if (b2) {
            this.f111700e.mo156603a(b, j);
        }
        if (b3) {
            this.f111699d.mo156603a(b, j);
        }
        if (b4) {
            if (b || b2 || b3) {
                z = true;
            }
            long max = j + Math.max(j2, j3);
            if (z) {
                j4 = max;
            }
            this.f111698c.mo156603a(z, j4);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void endAnimations() {
        this.f111700e.mo156613e();
        this.f111697b.mo156613e();
        this.f111698c.mo156613e();
        this.f111699d.mo156613e();
        if (isRunning()) {
            this.f111700e.mo156614f();
            this.f111698c.mo156614f();
            this.f111699d.mo156614f();
            this.f111697b.mo156612d();
            this.f111700e.mo156612d();
            this.f111698c.mo156612d();
            this.f111699d.mo156612d();
            dispatchAnimationsFinished();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo156640g(RecyclerView.ViewHolder viewHolder) {
        ViewCompat.m4103r(viewHolder.itemView).mo4730b();
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateAdd(RecyclerView.ViewHolder viewHolder) {
        if (this.f111696a) {
            Log.d("ARVGeneralItemAnimator", "animateAdd(id = " + viewHolder.getItemId() + ", position = " + viewHolder.getLayoutPosition() + ")");
        }
        return this.f111698c.mo156620d(viewHolder);
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateRemove(RecyclerView.ViewHolder viewHolder) {
        if (this.f111696a) {
            Log.d("ARVGeneralItemAnimator", "animateRemove(id = " + viewHolder.getItemId() + ", position = " + viewHolder.getLayoutPosition() + ")");
        }
        return this.f111697b.mo156632d(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void endAnimation(RecyclerView.ViewHolder viewHolder) {
        mo156640g(viewHolder);
        this.f111700e.mo156606b(viewHolder);
        this.f111699d.mo156606b(viewHolder);
        this.f111697b.mo156606b(viewHolder);
        this.f111698c.mo156606b(viewHolder);
        this.f111700e.mo156610c(viewHolder);
        this.f111699d.mo156610c(viewHolder);
        this.f111697b.mo156610c(viewHolder);
        this.f111698c.mo156610c(viewHolder);
        if (this.f111697b.mo156605a(viewHolder) && this.f111696a) {
            throw new IllegalStateException("after animation is cancelled, item should not be in the active animation list [remove]");
        } else if (this.f111698c.mo156605a(viewHolder) && this.f111696a) {
            throw new IllegalStateException("after animation is cancelled, item should not be in the active animation list [add]");
        } else if (this.f111699d.mo156605a(viewHolder) && this.f111696a) {
            throw new IllegalStateException("after animation is cancelled, item should not be in the active animation list [change]");
        } else if (!this.f111700e.mo156605a(viewHolder) || !this.f111696a) {
            mo156586a();
        } else {
            throw new IllegalStateException("after animation is cancelled, item should not be in the active animation list [move]");
        }
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateMove(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
        if (this.f111696a) {
            Log.d("ARVGeneralItemAnimator", "animateMove(id = " + viewHolder.getItemId() + ", position = " + viewHolder.getLayoutPosition() + ", fromX = " + i + ", fromY = " + i2 + ", toX = " + i3 + ", toY = " + i4 + ")");
        }
        return this.f111700e.mo156628a(viewHolder, i, i2, i3, i4);
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateChange(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4) {
        String str;
        String str2;
        String str3;
        if (viewHolder == viewHolder2) {
            return this.f111700e.mo156628a(viewHolder, i, i2, i3, i4);
        }
        if (this.f111696a) {
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
        return this.f111699d.mo156623a(viewHolder, viewHolder2, i, i2, i3, i4);
    }
}
