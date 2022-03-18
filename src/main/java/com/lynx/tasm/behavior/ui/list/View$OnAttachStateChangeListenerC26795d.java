package com.lynx.tasm.behavior.ui.list;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.p1221a.AbstractC26623a;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.view.C26840a;
import com.lynx.tasm.behavior.ui.view.C26841b;
import com.lynx.tasm.behavior.ui.view.UIComponent;

/* renamed from: com.lynx.tasm.behavior.ui.list.d */
public class View$OnAttachStateChangeListenerC26795d extends RecyclerView.OnScrollListener implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    private UIList f66476a;

    /* renamed from: b */
    private C26797a f66477b;

    /* renamed from: c */
    private int f66478c = -1;

    /* renamed from: d */
    private int f66479d = -1;

    /* renamed from: e */
    private C26798b f66480e = new C26798b();

    /* renamed from: f */
    private C26798b f66481f = new C26798b();

    /* access modifiers changed from: private */
    /* renamed from: com.lynx.tasm.behavior.ui.list.d$b */
    public static class C26798b {

        /* renamed from: a */
        public UIComponent f66485a;

        /* renamed from: b */
        public int f66486b = -1;
    }

    public void onViewDetachedFromWindow(View view) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public ViewGroup mo95310b() {
        return this.f66477b;
    }

    /* renamed from: a */
    public void mo95309a(RecyclerView recyclerView, int i) {
        if (i > 0) {
            m97286a(this.f66481f, false);
        } else if (i < 0) {
            m97286a(this.f66480e, true);
        }
        m97283a(recyclerView);
        m97285a(this.f66480e, this.f66478c, true);
        m97285a(this.f66481f, this.f66479d, false);
        mo95311c();
    }

    /* renamed from: c */
    public void mo95311c() {
        C26799e eVar;
        int i;
        C26799e eVar2;
        int i2 = 0;
        if (this.f66480e.f66486b != -1) {
            int e = this.f66476a.mo53307k().mo95334e(this.f66480e.f66486b + 1);
            if (e == -1 || (eVar2 = (C26799e) this.f66476a.mo53305i().findViewHolderForAdapterPosition(e)) == null) {
                i = 0;
            } else {
                i = Math.min(0, eVar2.itemView.getTop() - ((C26840a) this.f66480e.f66485a.av()).getBottom());
            }
            ((C26840a) this.f66480e.f66485a.av()).setTranslationY((float) i);
        }
        if (this.f66481f.f66486b != -1) {
            int d = this.f66476a.mo53307k().mo95333d(this.f66481f.f66486b - 1);
            if (!(d == -1 || (eVar = (C26799e) this.f66476a.mo53305i().findViewHolderForAdapterPosition(d)) == null)) {
                i2 = Math.max(0, eVar.itemView.getBottom() - ((C26840a) this.f66481f.f66485a.av()).getTop());
            }
            ((C26840a) this.f66481f.f66485a.av()).setTranslationY((float) i2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo95308a() {
        if (this.f66480e.f66486b != -1) {
            m97284a(this.f66480e);
        }
        if (this.f66481f.f66486b != -1) {
            m97284a(this.f66481f);
        }
    }

    public void onViewAttachedToWindow(View view) {
        if (this.f66477b.indexOfChild(view) < 0) {
            this.f66477b.mo95315a(view);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.behavior.ui.list.d$a */
    public class C26797a extends FrameLayout {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo95315a(View view) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            int indexOfChild = viewGroup.indexOfChild(view);
            viewGroup.removeViewAt(indexOfChild);
            addView(view, new FrameLayout.LayoutParams(-1, -1));
            viewGroup.addView(this, indexOfChild);
        }

        public C26797a(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            View$OnAttachStateChangeListenerC26795d.this.mo95311c();
        }

        /* access modifiers changed from: protected */
        public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
            if (view instanceof C26841b) {
                view.measure(view.getMeasuredWidth(), view.getMeasuredHeight());
            } else {
                super.measureChildWithMargins(view, i, i2, i3, i4);
            }
        }
    }

    /* renamed from: a */
    private static ViewGroup m97282a(View view) {
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
        return (ViewGroup) parent;
    }

    View$OnAttachStateChangeListenerC26795d(UIList uIList) {
        this.f66476a = uIList;
        this.f66477b = new C26797a(uIList.mo95039u());
        uIList.mo53305i().addOnScrollListener(this);
        uIList.mo53305i().addOnAttachStateChangeListener(this);
    }

    /* renamed from: a */
    private void m97284a(C26798b bVar) {
        if (UIList.f66420e) {
            LLog.m96423b("UIList2", "cleanOldStickyItem position " + bVar.f66486b);
        }
        m97282a(bVar.f66485a.av());
        this.f66476a.mo95255a((LynxUI) bVar.f66485a);
        bVar.f66486b = -1;
        bVar.f66485a = null;
    }

    /* renamed from: a */
    private void m97283a(RecyclerView recyclerView) {
        int i;
        int i2;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            int[] a = staggeredGridLayoutManager.mo7253a((int[]) null);
            int[] c = staggeredGridLayoutManager.mo7262c((int[]) null);
            i = Integer.MAX_VALUE;
            for (int i3 : a) {
                i = Math.min(i, i3);
            }
            i2 = Integer.MIN_VALUE;
            for (int i4 : c) {
                i2 = Math.max(i2, i4);
            }
        } else {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            i = linearLayoutManager.findFirstVisibleItemPosition();
            i2 = linearLayoutManager.findLastVisibleItemPosition();
        }
        int d = this.f66476a.mo53307k().mo95333d(i);
        int e = this.f66476a.mo53307k().mo95334e(i2);
        if (this.f66476a.mo53307k().mo95331b(d) && this.f66478c != d) {
            this.f66478c = d;
            if (UIList.f66420e) {
                LLog.m96425c("UIList2", String.format("new sticky-top position %d", Integer.valueOf(this.f66478c)));
            }
        }
        if (this.f66476a.mo53307k().mo95332c(e) && this.f66479d != e) {
            this.f66479d = e;
            if (UIList.f66420e) {
                LLog.m96425c("UIList2", String.format("new sticky-bottom position %d", Integer.valueOf(this.f66479d)));
            }
        }
        if (!(this.f66480e.f66486b == -1 || this.f66480e.f66486b == this.f66478c)) {
            m97284a(this.f66480e);
        }
        if (!(this.f66481f.f66486b == -1 || this.f66481f.f66486b == this.f66479d)) {
            m97284a(this.f66481f);
        }
    }

    /* renamed from: a */
    private void m97286a(C26798b bVar, boolean z) {
        C26799e eVar;
        boolean z2;
        if (bVar.f66486b != -1 && (eVar = (C26799e) this.f66476a.mo53305i().findViewHolderForAdapterPosition(bVar.f66486b)) != null) {
            if (eVar.mo95320b() != null) {
                eVar.mo95318a();
            }
            int top = eVar.f66487a.getTop();
            View av = bVar.f66485a.av();
            if ((!z || top <= av.getTop()) && (z || top >= av.getTop())) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                if (UIList.f66420e) {
                    LLog.m96425c("UIList2", "restoreToHolderIfNeed stickyItem position" + bVar.f66486b);
                }
                m97282a(bVar.f66485a.av());
                eVar.mo95319a(bVar.f66485a);
                bVar.f66486b = -1;
                bVar.f66485a = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public AbstractC26623a mo95307a(int i, int i2) {
        if (this.f66480e.f66485a != null) {
            Rect rect = new Rect();
            ((C26840a) this.f66480e.f66485a.av()).getHitRect(rect);
            if (rect.contains(i, i2)) {
                return this.f66480e.f66485a.mo94945a((float) i, (float) i2);
            }
        }
        if (this.f66481f.f66485a == null) {
            return null;
        }
        Rect rect2 = new Rect();
        ((C26840a) this.f66481f.f66485a.av()).getHitRect(rect2);
        if (rect2.contains(i, i2)) {
            return this.f66481f.f66485a.mo94945a((float) i, (float) i2);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(final RecyclerView recyclerView, int i, int i2) {
        if (i2 == 0) {
            recyclerView.post(new Runnable() {
                /* class com.lynx.tasm.behavior.ui.list.View$OnAttachStateChangeListenerC26795d.RunnableC267961 */

                public void run() {
                    View$OnAttachStateChangeListenerC26795d.this.mo95309a(recyclerView, 0);
                }
            });
        } else {
            mo95309a(recyclerView, i2);
        }
    }

    /* renamed from: a */
    private void m97285a(C26798b bVar, int i, boolean z) {
        UIComponent b;
        int i2;
        boolean z2;
        boolean z3;
        if (i != -1 && i != bVar.f66486b) {
            RecyclerView i3 = this.f66476a.mo53305i();
            C26799e eVar = (C26799e) i3.findViewHolderForAdapterPosition(i);
            boolean z4 = true;
            if (eVar == null) {
                eVar = (C26799e) i3.getAdapter().createViewHolder(i3, i3.getAdapter().getItemViewType(i));
                i3.getAdapter().bindViewHolder(eVar, i);
            } else {
                if (!z || eVar.f66487a.getTop() >= 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z || eVar.f66487a.getBottom() <= this.f66477b.getHeight()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (!z2 && !z3) {
                    z4 = false;
                }
            }
            if (z4 && (b = eVar.mo95320b()) != null) {
                eVar.mo95318a();
                if (z) {
                    i2 = 48;
                } else {
                    i2 = 80;
                }
                this.f66477b.addView(b.av(), new FrameLayout.LayoutParams(-2, -2, i2));
                bVar.f66485a = b;
                bVar.f66486b = i;
                if (UIList.f66420e) {
                    LLog.m96425c("UIList2", "finish moveSticky " + i);
                }
            }
        }
    }
}
