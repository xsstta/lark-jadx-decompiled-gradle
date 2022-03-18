package com.ss.android.lark.threaddetail.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.lark.threaddetail.view.a */
public class C55855a extends SimpleItemAnimator {

    /* renamed from: h */
    private static TimeInterpolator f137999h;

    /* renamed from: a */
    ArrayList<ArrayList<RecyclerView.ViewHolder>> f138000a = new ArrayList<>();

    /* renamed from: b */
    ArrayList<ArrayList<C55865b>> f138001b = new ArrayList<>();

    /* renamed from: c */
    ArrayList<ArrayList<C55864a>> f138002c = new ArrayList<>();

    /* renamed from: d */
    ArrayList<RecyclerView.ViewHolder> f138003d = new ArrayList<>();

    /* renamed from: e */
    ArrayList<RecyclerView.ViewHolder> f138004e = new ArrayList<>();

    /* renamed from: f */
    ArrayList<RecyclerView.ViewHolder> f138005f = new ArrayList<>();

    /* renamed from: g */
    ArrayList<RecyclerView.ViewHolder> f138006g = new ArrayList<>();

    /* renamed from: i */
    private ArrayList<RecyclerView.ViewHolder> f138007i = new ArrayList<>();

    /* renamed from: j */
    private ArrayList<RecyclerView.ViewHolder> f138008j = new ArrayList<>();

    /* renamed from: k */
    private ArrayList<C55865b> f138009k = new ArrayList<>();

    /* renamed from: l */
    private ArrayList<C55864a> f138010l = new ArrayList<>();

    /* renamed from: m */
    private View f138011m;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo190526a() {
        if (!isRunning()) {
            dispatchAnimationsFinished();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.threaddetail.view.a$a */
    public static class C55864a {

        /* renamed from: a */
        public RecyclerView.ViewHolder f138040a;

        /* renamed from: b */
        public RecyclerView.ViewHolder f138041b;

        /* renamed from: c */
        public int f138042c;

        /* renamed from: d */
        public int f138043d;

        /* renamed from: e */
        public int f138044e;

        /* renamed from: f */
        public int f138045f;

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f138040a + ", newHolder=" + this.f138041b + ", fromX=" + this.f138042c + ", fromY=" + this.f138043d + ", toX=" + this.f138044e + ", toY=" + this.f138045f + '}';
        }

        private C55864a(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            this.f138040a = viewHolder;
            this.f138041b = viewHolder2;
        }

        C55864a(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4) {
            this(viewHolder, viewHolder2);
            this.f138042c = i;
            this.f138043d = i2;
            this.f138044e = i3;
            this.f138045f = i4;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean isRunning() {
        if (!this.f138008j.isEmpty() || !this.f138010l.isEmpty() || !this.f138009k.isEmpty() || !this.f138007i.isEmpty() || !this.f138004e.isEmpty() || !this.f138005f.isEmpty() || !this.f138003d.isEmpty() || !this.f138006g.isEmpty() || !this.f138001b.isEmpty() || !this.f138000a.isEmpty() || !this.f138002c.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void runPendingAnimations() {
        long j;
        long j2;
        boolean z = !this.f138007i.isEmpty();
        boolean z2 = !this.f138009k.isEmpty();
        boolean z3 = !this.f138010l.isEmpty();
        boolean z4 = !this.f138008j.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.ViewHolder> it = this.f138007i.iterator();
            while (it.hasNext()) {
                m216982b(it.next());
            }
            this.f138007i.clear();
            if (z2) {
                final ArrayList<C55865b> arrayList = new ArrayList<>();
                arrayList.addAll(this.f138009k);
                this.f138001b.add(arrayList);
                this.f138009k.clear();
                RunnableC558561 r5 = new Runnable() {
                    /* class com.ss.android.lark.threaddetail.view.C55855a.RunnableC558561 */

                    public void run() {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            C55865b bVar = (C55865b) it.next();
                            C55855a.this.mo190528a(bVar.f138046a, bVar.f138047b, bVar.f138048c, bVar.f138049d, bVar.f138050e);
                        }
                        arrayList.clear();
                        C55855a.this.f138001b.remove(arrayList);
                    }
                };
                if (z) {
                    ViewCompat.m4047a(this.f138011m, r5, getRemoveDuration());
                } else {
                    r5.run();
                }
            }
            if (z3) {
                final ArrayList<C55864a> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.f138010l);
                this.f138002c.add(arrayList2);
                this.f138010l.clear();
                RunnableC558572 r52 = new Runnable() {
                    /* class com.ss.android.lark.threaddetail.view.C55855a.RunnableC558572 */

                    public void run() {
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            C55855a.this.mo190529a((C55864a) it.next());
                        }
                        arrayList2.clear();
                        C55855a.this.f138002c.remove(arrayList2);
                    }
                };
                if (z) {
                    ViewCompat.m4047a(this.f138011m, r52, getRemoveDuration());
                } else {
                    r52.run();
                }
            }
            if (z4) {
                final ArrayList<RecyclerView.ViewHolder> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.f138008j);
                this.f138000a.add(arrayList3);
                this.f138008j.clear();
                RunnableC558583 r4 = new Runnable() {
                    /* class com.ss.android.lark.threaddetail.view.C55855a.RunnableC558583 */

                    public void run() {
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            C55855a.this.mo190527a((RecyclerView.ViewHolder) it.next());
                        }
                        arrayList3.clear();
                        C55855a.this.f138000a.remove(arrayList3);
                    }
                };
                if (z || z2 || z3) {
                    long j3 = 0;
                    if (z) {
                        j = getRemoveDuration();
                    } else {
                        j = 0;
                    }
                    if (z2) {
                        j2 = getMoveDuration();
                    } else {
                        j2 = 0;
                    }
                    if (z3) {
                        j3 = getChangeDuration();
                    }
                    ViewCompat.m4047a(this.f138011m, r4, j + Math.max(j2, j3));
                    return;
                }
                r4.run();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void endAnimations() {
        int size = this.f138009k.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C55865b bVar = this.f138009k.get(size);
            View view = bVar.f138046a.itemView;
            view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
            dispatchMoveFinished(bVar.f138046a);
            this.f138009k.remove(size);
        }
        for (int size2 = this.f138007i.size() - 1; size2 >= 0; size2--) {
            dispatchRemoveFinished(this.f138007i.get(size2));
            this.f138007i.remove(size2);
        }
        int size3 = this.f138008j.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.ViewHolder viewHolder = this.f138008j.get(size3);
            viewHolder.itemView.setAlpha(1.0f);
            dispatchAddFinished(viewHolder);
            this.f138008j.remove(size3);
        }
        for (int size4 = this.f138010l.size() - 1; size4 >= 0; size4--) {
            m216983b(this.f138010l.get(size4));
        }
        this.f138010l.clear();
        if (isRunning()) {
            for (int size5 = this.f138001b.size() - 1; size5 >= 0; size5--) {
                ArrayList<C55865b> arrayList = this.f138001b.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    C55865b bVar2 = arrayList.get(size6);
                    View view2 = bVar2.f138046a.itemView;
                    view2.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                    view2.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                    dispatchMoveFinished(bVar2.f138046a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f138001b.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f138000a.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.ViewHolder> arrayList2 = this.f138000a.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.ViewHolder viewHolder2 = arrayList2.get(size8);
                    viewHolder2.itemView.setAlpha(1.0f);
                    dispatchAddFinished(viewHolder2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f138000a.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f138002c.size() - 1; size9 >= 0; size9--) {
                ArrayList<C55864a> arrayList3 = this.f138002c.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    m216983b(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f138002c.remove(arrayList3);
                    }
                }
            }
            mo190530a(this.f138005f);
            mo190530a(this.f138004e);
            mo190530a(this.f138003d);
            mo190530a(this.f138006g);
            dispatchAnimationsFinished();
        }
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateAdd(RecyclerView.ViewHolder viewHolder) {
        m216984c(viewHolder);
        viewHolder.itemView.setAlpha(BitmapDescriptorFactory.HUE_RED);
        this.f138008j.add(viewHolder);
        return true;
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateRemove(RecyclerView.ViewHolder viewHolder) {
        m216984c(viewHolder);
        this.f138007i.add(viewHolder);
        return true;
    }

    /* renamed from: b */
    private void m216983b(C55864a aVar) {
        if (aVar.f138040a != null) {
            m216981a(aVar, aVar.f138040a);
        }
        if (aVar.f138041b != null) {
            m216981a(aVar, aVar.f138041b);
        }
    }

    /* renamed from: c */
    private void m216984c(RecyclerView.ViewHolder viewHolder) {
        if (f137999h == null) {
            f137999h = new ValueAnimator().getInterpolator();
        }
        viewHolder.itemView.animate().setInterpolator(f137999h);
        endAnimation(viewHolder);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo190530a(List<RecyclerView.ViewHolder> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).itemView.animate().cancel();
        }
    }

    /* renamed from: b */
    private void m216982b(final RecyclerView.ViewHolder viewHolder) {
        final View view = viewHolder.itemView;
        final ViewPropertyAnimator animate = view.animate();
        this.f138005f.add(viewHolder);
        animate.setDuration(getRemoveDuration()).alpha(BitmapDescriptorFactory.HUE_RED).setListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.lark.threaddetail.view.C55855a.C558594 */

            public void onAnimationStart(Animator animator) {
                C55855a.this.dispatchRemoveStarting(viewHolder);
            }

            public void onAnimationEnd(Animator animator) {
                animate.setListener(null);
                view.setAlpha(1.0f);
                C55855a.this.dispatchRemoveFinished(viewHolder);
                C55855a.this.f138005f.remove(viewHolder);
                C55855a.this.mo190526a();
            }
        }).start();
    }

    C55855a(View view) {
        this.f138011m = view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo190527a(final RecyclerView.ViewHolder viewHolder) {
        final View view = viewHolder.itemView;
        final ViewPropertyAnimator animate = view.animate();
        this.f138003d.add(viewHolder);
        animate.alpha(1.0f).setDuration(getAddDuration()).setListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.lark.threaddetail.view.C55855a.C558605 */

            public void onAnimationCancel(Animator animator) {
                view.setAlpha(1.0f);
            }

            public void onAnimationStart(Animator animator) {
                C55855a.this.dispatchAddStarting(viewHolder);
            }

            public void onAnimationEnd(Animator animator) {
                animate.setListener(null);
                C55855a.this.dispatchAddFinished(viewHolder);
                C55855a.this.f138003d.remove(viewHolder);
                C55855a.this.mo190526a();
            }
        }).start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void endAnimation(RecyclerView.ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        view.animate().cancel();
        int size = this.f138009k.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.f138009k.get(size).f138046a == viewHolder) {
                view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                dispatchMoveFinished(viewHolder);
                this.f138009k.remove(size);
            }
        }
        m216980a(this.f138010l, viewHolder);
        if (this.f138007i.remove(viewHolder)) {
            view.setAlpha(1.0f);
            dispatchRemoveFinished(viewHolder);
        }
        if (this.f138008j.remove(viewHolder)) {
            view.setAlpha(1.0f);
            dispatchAddFinished(viewHolder);
        }
        for (int size2 = this.f138002c.size() - 1; size2 >= 0; size2--) {
            ArrayList<C55864a> arrayList = this.f138002c.get(size2);
            m216980a(arrayList, viewHolder);
            if (arrayList.isEmpty()) {
                this.f138002c.remove(size2);
            }
        }
        for (int size3 = this.f138001b.size() - 1; size3 >= 0; size3--) {
            ArrayList<C55865b> arrayList2 = this.f138001b.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (arrayList2.get(size4).f138046a == viewHolder) {
                    view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                    view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                    dispatchMoveFinished(viewHolder);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f138001b.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f138000a.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.ViewHolder> arrayList3 = this.f138000a.get(size5);
            if (arrayList3.remove(viewHolder)) {
                view.setAlpha(1.0f);
                dispatchAddFinished(viewHolder);
                if (arrayList3.isEmpty()) {
                    this.f138000a.remove(size5);
                }
            }
        }
        this.f138005f.remove(viewHolder);
        this.f138003d.remove(viewHolder);
        this.f138006g.remove(viewHolder);
        this.f138004e.remove(viewHolder);
        mo190526a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo190529a(final C55864a aVar) {
        final View view;
        RecyclerView.ViewHolder viewHolder = aVar.f138040a;
        final View view2 = null;
        if (viewHolder == null) {
            view = null;
        } else {
            view = viewHolder.itemView;
        }
        RecyclerView.ViewHolder viewHolder2 = aVar.f138041b;
        if (viewHolder2 != null) {
            view2 = viewHolder2.itemView;
        }
        if (view != null) {
            final ViewPropertyAnimator duration = view.animate().setDuration(getChangeDuration());
            this.f138006g.add(aVar.f138040a);
            duration.translationX((float) (aVar.f138044e - aVar.f138042c));
            duration.translationY((float) (aVar.f138045f - aVar.f138043d));
            duration.setListener(new AnimatorListenerAdapter() {
                /* class com.ss.android.lark.threaddetail.view.C55855a.C558627 */

                public void onAnimationStart(Animator animator) {
                    C55855a.this.dispatchChangeStarting(aVar.f138040a, true);
                }

                public void onAnimationEnd(Animator animator) {
                    duration.setListener(null);
                    view.setAlpha(1.0f);
                    view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                    view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                    C55855a.this.dispatchChangeFinished(aVar.f138040a, true);
                    C55855a.this.f138006g.remove(aVar.f138040a);
                    C55855a.this.mo190526a();
                }
            }).start();
        }
        if (view2 != null) {
            final ViewPropertyAnimator animate = view2.animate();
            this.f138006g.add(aVar.f138041b);
            animate.translationX(BitmapDescriptorFactory.HUE_RED).translationY(BitmapDescriptorFactory.HUE_RED).setDuration(getChangeDuration()).setListener(new AnimatorListenerAdapter() {
                /* class com.ss.android.lark.threaddetail.view.C55855a.C558638 */

                public void onAnimationStart(Animator animator) {
                    C55855a.this.dispatchChangeStarting(aVar.f138041b, false);
                }

                public void onAnimationEnd(Animator animator) {
                    animate.setListener(null);
                    view2.setAlpha(1.0f);
                    view2.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                    view2.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                    C55855a.this.dispatchChangeFinished(aVar.f138041b, false);
                    C55855a.this.f138006g.remove(aVar.f138041b);
                    C55855a.this.mo190526a();
                }
            }).start();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean canReuseUpdatedViewHolder(RecyclerView.ViewHolder viewHolder, List<Object> list) {
        if (!list.isEmpty() || super.canReuseUpdatedViewHolder(viewHolder, list)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m216980a(List<C55864a> list, RecyclerView.ViewHolder viewHolder) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C55864a aVar = list.get(size);
            if (m216981a(aVar, viewHolder) && aVar.f138040a == null && aVar.f138041b == null) {
                list.remove(aVar);
            }
        }
    }

    /* renamed from: a */
    private boolean m216981a(C55864a aVar, RecyclerView.ViewHolder viewHolder) {
        boolean z = false;
        if (aVar.f138041b == viewHolder) {
            aVar.f138041b = null;
        } else if (aVar.f138040a != viewHolder) {
            return false;
        } else {
            aVar.f138040a = null;
            z = true;
        }
        viewHolder.itemView.setAlpha(1.0f);
        viewHolder.itemView.setTranslationX(BitmapDescriptorFactory.HUE_RED);
        viewHolder.itemView.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        dispatchChangeFinished(viewHolder, z);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.threaddetail.view.a$b */
    public static class C55865b {

        /* renamed from: a */
        public RecyclerView.ViewHolder f138046a;

        /* renamed from: b */
        public int f138047b;

        /* renamed from: c */
        public int f138048c;

        /* renamed from: d */
        public int f138049d;

        /* renamed from: e */
        public int f138050e;

        C55865b(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
            this.f138046a = viewHolder;
            this.f138047b = i;
            this.f138048c = i2;
            this.f138049d = i3;
            this.f138050e = i4;
        }
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateMove(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
        View view = viewHolder.itemView;
        int translationX = i + ((int) viewHolder.itemView.getTranslationX());
        int translationY = i2 + ((int) viewHolder.itemView.getTranslationY());
        m216984c(viewHolder);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            dispatchMoveFinished(viewHolder);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX((float) (-i5));
        }
        if (i6 != 0) {
            view.setTranslationY((float) (-i6));
        }
        this.f138009k.add(new C55865b(viewHolder, translationX, translationY, i3, i4));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo190528a(final RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
        final View view = viewHolder.itemView;
        final int i5 = i3 - i;
        final int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(BitmapDescriptorFactory.HUE_RED);
        }
        if (i6 != 0) {
            view.animate().translationY(BitmapDescriptorFactory.HUE_RED);
        }
        final ViewPropertyAnimator animate = view.animate();
        this.f138004e.add(viewHolder);
        animate.setDuration(getMoveDuration()).setListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.lark.threaddetail.view.C55855a.C558616 */

            public void onAnimationStart(Animator animator) {
                C55855a.this.dispatchMoveStarting(viewHolder);
            }

            public void onAnimationCancel(Animator animator) {
                if (i5 != 0) {
                    view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                }
                if (i6 != 0) {
                    view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                }
            }

            public void onAnimationEnd(Animator animator) {
                animate.setListener(null);
                C55855a.this.dispatchMoveFinished(viewHolder);
                C55855a.this.f138004e.remove(viewHolder);
                C55855a.this.mo190526a();
            }
        }).start();
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateChange(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4) {
        if (viewHolder == viewHolder2) {
            return animateMove(viewHolder, i, i2, i3, i4);
        }
        float translationX = viewHolder.itemView.getTranslationX();
        float translationY = viewHolder.itemView.getTranslationY();
        float alpha = viewHolder.itemView.getAlpha();
        m216984c(viewHolder);
        int i5 = (int) (((float) (i3 - i)) - translationX);
        int i6 = (int) (((float) (i4 - i2)) - translationY);
        viewHolder.itemView.setTranslationX(translationX);
        viewHolder.itemView.setTranslationY(translationY);
        viewHolder.itemView.setAlpha(alpha);
        if (viewHolder2 != null) {
            m216984c(viewHolder2);
            viewHolder2.itemView.setTranslationX((float) (-i5));
            viewHolder2.itemView.setTranslationY((float) (-i6));
        }
        this.f138010l.add(new C55864a(viewHolder, viewHolder2, i, i2, i3, i4));
        return true;
    }
}
