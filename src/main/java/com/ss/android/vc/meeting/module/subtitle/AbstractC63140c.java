package com.ss.android.vc.meeting.module.subtitle;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.core.view.AbstractC0928y;
import androidx.core.view.C0924x;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.subtitle.c */
public abstract class AbstractC63140c extends SimpleItemAnimator {

    /* renamed from: a */
    public ArrayList<ArrayList<RecyclerView.ViewHolder>> f159107a = new ArrayList<>();

    /* renamed from: b */
    public ArrayList<ArrayList<C63150d>> f159108b = new ArrayList<>();

    /* renamed from: c */
    public ArrayList<ArrayList<C63147a>> f159109c = new ArrayList<>();

    /* renamed from: d */
    protected ArrayList<RecyclerView.ViewHolder> f159110d = new ArrayList<>();

    /* renamed from: e */
    public ArrayList<RecyclerView.ViewHolder> f159111e = new ArrayList<>();

    /* renamed from: f */
    protected ArrayList<RecyclerView.ViewHolder> f159112f = new ArrayList<>();

    /* renamed from: g */
    public ArrayList<RecyclerView.ViewHolder> f159113g = new ArrayList<>();

    /* renamed from: h */
    protected Interpolator f159114h = new DecelerateInterpolator();

    /* renamed from: i */
    private ArrayList<RecyclerView.ViewHolder> f159115i = new ArrayList<>();

    /* renamed from: j */
    private ArrayList<RecyclerView.ViewHolder> f159116j = new ArrayList<>();

    /* renamed from: k */
    private ArrayList<C63150d> f159117k = new ArrayList<>();

    /* renamed from: l */
    private ArrayList<C63147a> f159118l = new ArrayList<>();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo218598a(RecyclerView.ViewHolder viewHolder) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo218602b(RecyclerView.ViewHolder viewHolder) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo218603c(RecyclerView.ViewHolder viewHolder);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo218604d(RecyclerView.ViewHolder viewHolder);

    /* renamed from: com.ss.android.vc.meeting.module.subtitle.c$e */
    private static class C63151e implements AbstractC0928y {
        @Override // androidx.core.view.AbstractC0928y
        /* renamed from: a */
        public void mo868a(View view) {
        }

        @Override // androidx.core.view.AbstractC0928y
        /* renamed from: b */
        public void mo869b(View view) {
        }

        @Override // androidx.core.view.AbstractC0928y
        /* renamed from: c */
        public void mo2464c(View view) {
        }

        private C63151e() {
        }
    }

    /* renamed from: a */
    public void mo218597a() {
        if (!isRunning()) {
            dispatchAnimationsFinished();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.meeting.module.subtitle.c$a */
    public static class C63147a {

        /* renamed from: a */
        public RecyclerView.ViewHolder f159137a;

        /* renamed from: b */
        public RecyclerView.ViewHolder f159138b;

        /* renamed from: c */
        public int f159139c;

        /* renamed from: d */
        public int f159140d;

        /* renamed from: e */
        public int f159141e;

        /* renamed from: f */
        public int f159142f;

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f159137a + ", newHolder=" + this.f159138b + ", fromX=" + this.f159139c + ", fromY=" + this.f159140d + ", toX=" + this.f159141e + ", toY=" + this.f159142f + '}';
        }

        private C63147a(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            this.f159137a = viewHolder;
            this.f159138b = viewHolder2;
        }

        private C63147a(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4) {
            this(viewHolder, viewHolder2);
            this.f159139c = i;
            this.f159140d = i2;
            this.f159141e = i3;
            this.f159142f = i4;
        }
    }

    public AbstractC63140c() {
        setSupportsChangeAnimations(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean isRunning() {
        if (!this.f159116j.isEmpty() || !this.f159118l.isEmpty() || !this.f159117k.isEmpty() || !this.f159115i.isEmpty() || !this.f159111e.isEmpty() || !this.f159112f.isEmpty() || !this.f159110d.isEmpty() || !this.f159113g.isEmpty() || !this.f159108b.isEmpty() || !this.f159107a.isEmpty() || !this.f159109c.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void runPendingAnimations() {
        long j;
        long j2;
        boolean z = !this.f159115i.isEmpty();
        boolean z2 = !this.f159117k.isEmpty();
        boolean z3 = !this.f159118l.isEmpty();
        boolean z4 = !this.f159116j.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.ViewHolder> it = this.f159115i.iterator();
            while (it.hasNext()) {
                m247256j(it.next());
            }
            this.f159115i.clear();
            if (z2) {
                final ArrayList<C63150d> arrayList = new ArrayList<>();
                arrayList.addAll(this.f159117k);
                this.f159108b.add(arrayList);
                this.f159117k.clear();
                RunnableC631411 r6 = new Runnable() {
                    /* class com.ss.android.vc.meeting.module.subtitle.AbstractC63140c.RunnableC631411 */

                    public void run() {
                        if (AbstractC63140c.this.f159108b.remove(arrayList)) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                C63150d dVar = (C63150d) it.next();
                                AbstractC63140c.this.mo218599a(dVar.f159147a, dVar.f159148b, dVar.f159149c, dVar.f159150d, dVar.f159151e);
                            }
                            arrayList.clear();
                        }
                    }
                };
                if (z) {
                    ViewCompat.m4047a(arrayList.get(0).f159147a.itemView, r6, getRemoveDuration());
                } else {
                    r6.run();
                }
            }
            if (z3) {
                final ArrayList<C63147a> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.f159118l);
                this.f159109c.add(arrayList2);
                this.f159118l.clear();
                RunnableC631422 r62 = new Runnable() {
                    /* class com.ss.android.vc.meeting.module.subtitle.AbstractC63140c.RunnableC631422 */

                    public void run() {
                        if (AbstractC63140c.this.f159109c.remove(arrayList2)) {
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                AbstractC63140c.this.mo218600a((C63147a) it.next());
                            }
                            arrayList2.clear();
                        }
                    }
                };
                if (z) {
                    ViewCompat.m4047a(arrayList2.get(0).f159137a.itemView, r62, getRemoveDuration());
                } else {
                    r62.run();
                }
            }
            if (z4) {
                final ArrayList<RecyclerView.ViewHolder> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.f159116j);
                this.f159107a.add(arrayList3);
                this.f159116j.clear();
                RunnableC631433 r5 = new Runnable() {
                    /* class com.ss.android.vc.meeting.module.subtitle.AbstractC63140c.RunnableC631433 */

                    public void run() {
                        if (AbstractC63140c.this.f159107a.remove(arrayList3)) {
                            Iterator it = arrayList3.iterator();
                            while (it.hasNext()) {
                                AbstractC63140c.this.mo218605e((RecyclerView.ViewHolder) it.next());
                            }
                            arrayList3.clear();
                        }
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
                    ViewCompat.m4047a(arrayList3.get(0).itemView, r5, j + Math.max(j2, j3));
                    return;
                }
                r5.run();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void endAnimations() {
        int size = this.f159117k.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C63150d dVar = this.f159117k.get(size);
            View view = dVar.f159147a.itemView;
            ViewCompat.m4057b(view, (float) BitmapDescriptorFactory.HUE_RED);
            ViewCompat.m4030a(view, (float) BitmapDescriptorFactory.HUE_RED);
            dispatchMoveFinished(dVar.f159147a);
            this.f159117k.remove(size);
        }
        for (int size2 = this.f159115i.size() - 1; size2 >= 0; size2--) {
            dispatchRemoveFinished(this.f159115i.get(size2));
            this.f159115i.remove(size2);
        }
        for (int size3 = this.f159116j.size() - 1; size3 >= 0; size3--) {
            RecyclerView.ViewHolder viewHolder = this.f159116j.get(size3);
            C63197s.m247502a(viewHolder.itemView);
            dispatchAddFinished(viewHolder);
            this.f159116j.remove(size3);
        }
        for (int size4 = this.f159118l.size() - 1; size4 >= 0; size4--) {
            m247253b(this.f159118l.get(size4));
        }
        this.f159118l.clear();
        if (isRunning()) {
            for (int size5 = this.f159108b.size() - 1; size5 >= 0; size5--) {
                ArrayList<C63150d> arrayList = this.f159108b.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    C63150d dVar2 = arrayList.get(size6);
                    View view2 = dVar2.f159147a.itemView;
                    ViewCompat.m4057b(view2, (float) BitmapDescriptorFactory.HUE_RED);
                    ViewCompat.m4030a(view2, (float) BitmapDescriptorFactory.HUE_RED);
                    dispatchMoveFinished(dVar2.f159147a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f159108b.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f159107a.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.ViewHolder> arrayList2 = this.f159107a.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.ViewHolder viewHolder2 = arrayList2.get(size8);
                    ViewCompat.m4064c(viewHolder2.itemView, 1.0f);
                    dispatchAddFinished(viewHolder2);
                    if (size8 < arrayList2.size()) {
                        arrayList2.remove(size8);
                    }
                    if (arrayList2.isEmpty()) {
                        this.f159107a.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f159109c.size() - 1; size9 >= 0; size9--) {
                ArrayList<C63147a> arrayList3 = this.f159109c.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    m247253b(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f159109c.remove(arrayList3);
                    }
                }
            }
            mo218601a(this.f159112f);
            mo218601a(this.f159111e);
            mo218601a(this.f159110d);
            mo218601a(this.f159113g);
            dispatchAnimationsFinished();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.ss.android.vc.meeting.module.subtitle.c$b */
    public class C63148b extends C63151e {

        /* renamed from: a */
        RecyclerView.ViewHolder f159143a;

        @Override // androidx.core.view.AbstractC0928y, com.ss.android.vc.meeting.module.subtitle.AbstractC63140c.C63151e
        /* renamed from: c */
        public void mo2464c(View view) {
            C63197s.m247502a(view);
        }

        @Override // androidx.core.view.AbstractC0928y, com.ss.android.vc.meeting.module.subtitle.AbstractC63140c.C63151e
        /* renamed from: a */
        public void mo868a(View view) {
            AbstractC63140c.this.dispatchAddStarting(this.f159143a);
        }

        @Override // androidx.core.view.AbstractC0928y, com.ss.android.vc.meeting.module.subtitle.AbstractC63140c.C63151e
        /* renamed from: b */
        public void mo869b(View view) {
            C63197s.m247502a(view);
            AbstractC63140c.this.dispatchAddFinished(this.f159143a);
            AbstractC63140c.this.f159110d.remove(this.f159143a);
            AbstractC63140c.this.mo218597a();
        }

        public C63148b(RecyclerView.ViewHolder viewHolder) {
            super();
            this.f159143a = viewHolder;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.ss.android.vc.meeting.module.subtitle.c$c */
    public class C63149c extends C63151e {

        /* renamed from: a */
        RecyclerView.ViewHolder f159145a;

        @Override // androidx.core.view.AbstractC0928y, com.ss.android.vc.meeting.module.subtitle.AbstractC63140c.C63151e
        /* renamed from: c */
        public void mo2464c(View view) {
            C63197s.m247502a(view);
        }

        @Override // androidx.core.view.AbstractC0928y, com.ss.android.vc.meeting.module.subtitle.AbstractC63140c.C63151e
        /* renamed from: a */
        public void mo868a(View view) {
            AbstractC63140c.this.dispatchRemoveStarting(this.f159145a);
        }

        @Override // androidx.core.view.AbstractC0928y, com.ss.android.vc.meeting.module.subtitle.AbstractC63140c.C63151e
        /* renamed from: b */
        public void mo869b(View view) {
            C63197s.m247502a(view);
            AbstractC63140c.this.dispatchRemoveFinished(this.f159145a);
            AbstractC63140c.this.f159112f.remove(this.f159145a);
            AbstractC63140c.this.mo218597a();
        }

        public C63149c(RecyclerView.ViewHolder viewHolder) {
            super();
            this.f159145a = viewHolder;
        }
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateAdd(RecyclerView.ViewHolder viewHolder) {
        endAnimation(viewHolder);
        m247255i(viewHolder);
        this.f159116j.add(viewHolder);
        return true;
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateRemove(RecyclerView.ViewHolder viewHolder) {
        endAnimation(viewHolder);
        m247254h(viewHolder);
        this.f159115i.add(viewHolder);
        return true;
    }

    /* renamed from: b */
    private void m247253b(C63147a aVar) {
        if (aVar.f159137a != null) {
            m247252a(aVar, aVar.f159137a);
        }
        if (aVar.f159138b != null) {
            m247252a(aVar, aVar.f159138b);
        }
    }

    /* renamed from: h */
    private void m247254h(RecyclerView.ViewHolder viewHolder) {
        C63197s.m247502a(viewHolder.itemView);
        if (viewHolder instanceof AbstractC63129b) {
            ((AbstractC63129b) viewHolder).mo218590b(viewHolder);
        } else {
            mo218598a(viewHolder);
        }
    }

    /* renamed from: i */
    private void m247255i(RecyclerView.ViewHolder viewHolder) {
        C63197s.m247502a(viewHolder.itemView);
        if (viewHolder instanceof AbstractC63129b) {
            ((AbstractC63129b) viewHolder).mo218588a(viewHolder);
        } else {
            mo218602b(viewHolder);
        }
    }

    /* renamed from: j */
    private void m247256j(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof AbstractC63129b) {
            ((AbstractC63129b) viewHolder).mo218591b(viewHolder, new C63149c(viewHolder));
        } else {
            mo218603c(viewHolder);
        }
        this.f159112f.add(viewHolder);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo218601a(List<RecyclerView.ViewHolder> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ViewCompat.m4103r(list.get(size).itemView).mo4730b();
        }
    }

    /* renamed from: e */
    public void mo218605e(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof AbstractC63129b) {
            ((AbstractC63129b) viewHolder).mo218589a(viewHolder, new C63148b(viewHolder));
        } else {
            mo218604d(viewHolder);
        }
        this.f159110d.add(viewHolder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public long mo218606f(RecyclerView.ViewHolder viewHolder) {
        return Math.abs((((long) viewHolder.getOldPosition()) * getRemoveDuration()) / 4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public long mo218607g(RecyclerView.ViewHolder viewHolder) {
        return Math.abs((((long) viewHolder.getAdapterPosition()) * getAddDuration()) / 4);
    }

    /* renamed from: a */
    public void mo218600a(final C63147a aVar) {
        View view;
        RecyclerView.ViewHolder viewHolder = aVar.f159137a;
        final View view2 = null;
        if (viewHolder == null) {
            view = null;
        } else {
            view = viewHolder.itemView;
        }
        RecyclerView.ViewHolder viewHolder2 = aVar.f159138b;
        if (viewHolder2 != null) {
            view2 = viewHolder2.itemView;
        }
        if (view != null) {
            this.f159113g.add(aVar.f159137a);
            final C0924x a = ViewCompat.m4103r(view).mo4724a(getChangeDuration());
            a.mo4728b((float) (aVar.f159141e - aVar.f159139c));
            a.mo4731c((float) (aVar.f159142f - aVar.f159140d));
            a.mo4723a(BitmapDescriptorFactory.HUE_RED).mo4727a(new C63151e() {
                /* class com.ss.android.vc.meeting.module.subtitle.AbstractC63140c.C631455 */

                @Override // androidx.core.view.AbstractC0928y, com.ss.android.vc.meeting.module.subtitle.AbstractC63140c.C63151e
                /* renamed from: a */
                public void mo868a(View view) {
                    AbstractC63140c.this.dispatchChangeStarting(aVar.f159137a, true);
                }

                @Override // androidx.core.view.AbstractC0928y, com.ss.android.vc.meeting.module.subtitle.AbstractC63140c.C63151e
                /* renamed from: b */
                public void mo869b(View view) {
                    a.mo4727a((AbstractC0928y) null);
                    ViewCompat.m4064c(view, 1.0f);
                    ViewCompat.m4030a(view, (float) BitmapDescriptorFactory.HUE_RED);
                    ViewCompat.m4057b(view, (float) BitmapDescriptorFactory.HUE_RED);
                    AbstractC63140c.this.dispatchChangeFinished(aVar.f159137a, true);
                    AbstractC63140c.this.f159113g.remove(aVar.f159137a);
                    AbstractC63140c.this.mo218597a();
                }
            }).mo4732c();
        }
        if (view2 != null) {
            this.f159113g.add(aVar.f159138b);
            final C0924x r = ViewCompat.m4103r(view2);
            r.mo4728b(BitmapDescriptorFactory.HUE_RED).mo4731c(BitmapDescriptorFactory.HUE_RED).mo4724a(getChangeDuration()).mo4723a(1.0f).mo4727a(new C63151e() {
                /* class com.ss.android.vc.meeting.module.subtitle.AbstractC63140c.C631466 */

                @Override // androidx.core.view.AbstractC0928y, com.ss.android.vc.meeting.module.subtitle.AbstractC63140c.C63151e
                /* renamed from: a */
                public void mo868a(View view) {
                    AbstractC63140c.this.dispatchChangeStarting(aVar.f159138b, false);
                }

                @Override // androidx.core.view.AbstractC0928y, com.ss.android.vc.meeting.module.subtitle.AbstractC63140c.C63151e
                /* renamed from: b */
                public void mo869b(View view) {
                    r.mo4727a((AbstractC0928y) null);
                    ViewCompat.m4064c(view2, 1.0f);
                    ViewCompat.m4030a(view2, (float) BitmapDescriptorFactory.HUE_RED);
                    ViewCompat.m4057b(view2, (float) BitmapDescriptorFactory.HUE_RED);
                    AbstractC63140c.this.dispatchChangeFinished(aVar.f159138b, false);
                    AbstractC63140c.this.f159113g.remove(aVar.f159138b);
                    AbstractC63140c.this.mo218597a();
                }
            }).mo4732c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void endAnimation(RecyclerView.ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        ViewCompat.m4103r(view).mo4730b();
        int size = this.f159117k.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.f159117k.get(size).f159147a == viewHolder) {
                ViewCompat.m4057b(view, (float) BitmapDescriptorFactory.HUE_RED);
                ViewCompat.m4030a(view, (float) BitmapDescriptorFactory.HUE_RED);
                dispatchMoveFinished(viewHolder);
                this.f159117k.remove(size);
            }
        }
        m247251a(this.f159118l, viewHolder);
        if (this.f159115i.remove(viewHolder)) {
            C63197s.m247502a(viewHolder.itemView);
            dispatchRemoveFinished(viewHolder);
        }
        if (this.f159116j.remove(viewHolder)) {
            C63197s.m247502a(viewHolder.itemView);
            dispatchAddFinished(viewHolder);
        }
        for (int size2 = this.f159109c.size() - 1; size2 >= 0; size2--) {
            ArrayList<C63147a> arrayList = this.f159109c.get(size2);
            m247251a(arrayList, viewHolder);
            if (arrayList.isEmpty()) {
                this.f159109c.remove(size2);
            }
        }
        for (int size3 = this.f159108b.size() - 1; size3 >= 0; size3--) {
            ArrayList<C63150d> arrayList2 = this.f159108b.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (arrayList2.get(size4).f159147a == viewHolder) {
                    ViewCompat.m4057b(view, (float) BitmapDescriptorFactory.HUE_RED);
                    ViewCompat.m4030a(view, (float) BitmapDescriptorFactory.HUE_RED);
                    dispatchMoveFinished(viewHolder);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f159108b.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f159107a.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.ViewHolder> arrayList3 = this.f159107a.get(size5);
            if (arrayList3.remove(viewHolder)) {
                C63197s.m247502a(viewHolder.itemView);
                dispatchAddFinished(viewHolder);
                if (arrayList3.isEmpty()) {
                    this.f159107a.remove(size5);
                }
            }
        }
        this.f159112f.remove(viewHolder);
        this.f159110d.remove(viewHolder);
        this.f159113g.remove(viewHolder);
        this.f159111e.remove(viewHolder);
        mo218597a();
    }

    /* renamed from: a */
    private void m247251a(List<C63147a> list, RecyclerView.ViewHolder viewHolder) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C63147a aVar = list.get(size);
            if (m247252a(aVar, viewHolder) && aVar.f159137a == null && aVar.f159138b == null) {
                list.remove(aVar);
            }
        }
    }

    /* renamed from: a */
    private boolean m247252a(C63147a aVar, RecyclerView.ViewHolder viewHolder) {
        boolean z = false;
        if (aVar.f159138b == viewHolder) {
            aVar.f159138b = null;
        } else if (aVar.f159137a != viewHolder) {
            return false;
        } else {
            aVar.f159137a = null;
            z = true;
        }
        ViewCompat.m4064c(viewHolder.itemView, 1.0f);
        ViewCompat.m4030a(viewHolder.itemView, (float) BitmapDescriptorFactory.HUE_RED);
        ViewCompat.m4057b(viewHolder.itemView, (float) BitmapDescriptorFactory.HUE_RED);
        dispatchChangeFinished(viewHolder, z);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.meeting.module.subtitle.c$d */
    public static class C63150d {

        /* renamed from: a */
        public RecyclerView.ViewHolder f159147a;

        /* renamed from: b */
        public int f159148b;

        /* renamed from: c */
        public int f159149c;

        /* renamed from: d */
        public int f159150d;

        /* renamed from: e */
        public int f159151e;

        private C63150d(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
            this.f159147a = viewHolder;
            this.f159148b = i;
            this.f159149c = i2;
            this.f159150d = i3;
            this.f159151e = i4;
        }
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateMove(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
        View view = viewHolder.itemView;
        int n = (int) (((float) i) + ViewCompat.m4099n(viewHolder.itemView));
        int o = (int) (((float) i2) + ViewCompat.m4100o(viewHolder.itemView));
        endAnimation(viewHolder);
        int i5 = i3 - n;
        int i6 = i4 - o;
        if (i5 == 0 && i6 == 0) {
            dispatchMoveFinished(viewHolder);
            return false;
        }
        if (i5 != 0) {
            ViewCompat.m4030a(view, (float) (-i5));
        }
        if (i6 != 0) {
            ViewCompat.m4057b(view, (float) (-i6));
        }
        this.f159117k.add(new C63150d(viewHolder, n, o, i3, i4));
        return true;
    }

    /* renamed from: a */
    public void mo218599a(final RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
        View view = viewHolder.itemView;
        final int i5 = i3 - i;
        final int i6 = i4 - i2;
        if (i5 != 0) {
            ViewCompat.m4103r(view).mo4728b(BitmapDescriptorFactory.HUE_RED);
        }
        if (i6 != 0) {
            ViewCompat.m4103r(view).mo4731c(BitmapDescriptorFactory.HUE_RED);
        }
        this.f159111e.add(viewHolder);
        final C0924x r = ViewCompat.m4103r(view);
        r.mo4724a(getMoveDuration()).mo4727a(new C63151e() {
            /* class com.ss.android.vc.meeting.module.subtitle.AbstractC63140c.C631444 */

            @Override // androidx.core.view.AbstractC0928y, com.ss.android.vc.meeting.module.subtitle.AbstractC63140c.C63151e
            /* renamed from: a */
            public void mo868a(View view) {
                AbstractC63140c.this.dispatchMoveStarting(viewHolder);
            }

            @Override // androidx.core.view.AbstractC0928y, com.ss.android.vc.meeting.module.subtitle.AbstractC63140c.C63151e
            /* renamed from: c */
            public void mo2464c(View view) {
                if (i5 != 0) {
                    ViewCompat.m4030a(view, (float) BitmapDescriptorFactory.HUE_RED);
                }
                if (i6 != 0) {
                    ViewCompat.m4057b(view, (float) BitmapDescriptorFactory.HUE_RED);
                }
            }

            @Override // androidx.core.view.AbstractC0928y, com.ss.android.vc.meeting.module.subtitle.AbstractC63140c.C63151e
            /* renamed from: b */
            public void mo869b(View view) {
                r.mo4727a((AbstractC0928y) null);
                AbstractC63140c.this.dispatchMoveFinished(viewHolder);
                AbstractC63140c.this.f159111e.remove(viewHolder);
                AbstractC63140c.this.mo218597a();
            }
        }).mo4732c();
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateChange(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4) {
        if (viewHolder == viewHolder2) {
            return animateMove(viewHolder, i, i2, i3, i4);
        }
        float n = ViewCompat.m4099n(viewHolder.itemView);
        float o = ViewCompat.m4100o(viewHolder.itemView);
        float g = ViewCompat.m4079g(viewHolder.itemView);
        endAnimation(viewHolder);
        int i5 = (int) (((float) (i3 - i)) - n);
        int i6 = (int) (((float) (i4 - i2)) - o);
        ViewCompat.m4030a(viewHolder.itemView, n);
        ViewCompat.m4057b(viewHolder.itemView, o);
        ViewCompat.m4064c(viewHolder.itemView, g);
        if (!(viewHolder2 == null || viewHolder2.itemView == null)) {
            endAnimation(viewHolder2);
            ViewCompat.m4030a(viewHolder2.itemView, (float) (-i5));
            ViewCompat.m4057b(viewHolder2.itemView, (float) (-i6));
            ViewCompat.m4064c(viewHolder2.itemView, (float) BitmapDescriptorFactory.HUE_RED);
        }
        this.f159118l.add(new C63147a(viewHolder, viewHolder2, i, i2, i3, i4));
        return true;
    }
}
