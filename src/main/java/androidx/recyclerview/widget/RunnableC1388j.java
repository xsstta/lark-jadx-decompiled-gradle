package androidx.recyclerview.widget;

import androidx.core.os.C0804i;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.j */
public final class RunnableC1388j implements Runnable {

    /* renamed from: a */
    static final ThreadLocal<RunnableC1388j> f4919a = new ThreadLocal<>();

    /* renamed from: e */
    static Comparator<C1391b> f4920e = new Comparator<C1391b>() {
        /* class androidx.recyclerview.widget.RunnableC1388j.C13891 */

        /* renamed from: a */
        public int compare(C1391b bVar, C1391b bVar2) {
            boolean z;
            boolean z2;
            if (bVar.f4932d == null) {
                z = true;
            } else {
                z = false;
            }
            if (bVar2.f4932d == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z != z2) {
                if (bVar.f4932d == null) {
                    return 1;
                }
                return -1;
            } else if (bVar.f4929a == bVar2.f4929a) {
                int i = bVar2.f4930b - bVar.f4930b;
                if (i != 0) {
                    return i;
                }
                int i2 = bVar.f4931c - bVar2.f4931c;
                if (i2 != 0) {
                    return i2;
                }
                return 0;
            } else if (bVar.f4929a) {
                return -1;
            } else {
                return 1;
            }
        }
    };

    /* renamed from: b */
    ArrayList<RecyclerView> f4921b = new ArrayList<>();

    /* renamed from: c */
    long f4922c;

    /* renamed from: d */
    long f4923d;

    /* renamed from: f */
    private ArrayList<C1391b> f4924f = new ArrayList<>();

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.j$a */
    public static class C1390a implements RecyclerView.LayoutManager.AbstractC1326a {

        /* renamed from: a */
        int f4925a;

        /* renamed from: b */
        int f4926b;

        /* renamed from: c */
        int[] f4927c;

        /* renamed from: d */
        int f4928d;

        C1390a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7438a() {
            int[] iArr = this.f4927c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f4928d = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo7441a(int i) {
            if (this.f4927c != null) {
                int i2 = this.f4928d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f4927c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7439a(int i, int i2) {
            this.f4925a = i;
            this.f4926b = i2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7440a(RecyclerView recyclerView, boolean z) {
            this.f4928d = 0;
            int[] iArr = this.f4927c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.mLayout;
            if (recyclerView.mAdapter != null && layoutManager != null && layoutManager.isItemPrefetchEnabled()) {
                if (z) {
                    if (!recyclerView.mAdapterHelper.mo7358d()) {
                        layoutManager.collectInitialPrefetchPositions(recyclerView.mAdapter.getItemCount(), this);
                    }
                } else if (!recyclerView.hasPendingAdapterUpdates()) {
                    layoutManager.collectAdjacentPrefetchPositions(this.f4925a, this.f4926b, recyclerView.mState, this);
                }
                if (this.f4928d > layoutManager.mPrefetchMaxCountObserved) {
                    layoutManager.mPrefetchMaxCountObserved = this.f4928d;
                    layoutManager.mPrefetchMaxObservedInInitialPrefetch = z;
                    recyclerView.mRecycler.updateViewCacheSize();
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager.AbstractC1326a
        /* renamed from: b */
        public void mo7063b(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i2 >= 0) {
                int i3 = this.f4928d * 2;
                int[] iArr = this.f4927c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f4927c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i3 >= iArr.length) {
                    int[] iArr3 = new int[(i3 * 2)];
                    this.f4927c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f4927c;
                iArr4[i3] = i;
                iArr4[i3 + 1] = i2;
                this.f4928d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.j$b */
    public static class C1391b {

        /* renamed from: a */
        public boolean f4929a;

        /* renamed from: b */
        public int f4930b;

        /* renamed from: c */
        public int f4931c;

        /* renamed from: d */
        public RecyclerView f4932d;

        /* renamed from: e */
        public int f4933e;

        C1391b() {
        }

        /* renamed from: a */
        public void mo7442a() {
            this.f4929a = false;
            this.f4930b = 0;
            this.f4931c = 0;
            this.f4932d = null;
            this.f4933e = 0;
        }
    }

    RunnableC1388j() {
    }

    public void run() {
        try {
            C0804i.m3896a("RV Prefetch");
            if (!this.f4921b.isEmpty()) {
                int size = this.f4921b.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = this.f4921b.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    mo7431a(TimeUnit.MILLISECONDS.toNanos(j) + this.f4923d);
                    this.f4922c = 0;
                    C0804i.m3895a();
                }
            }
        } finally {
            this.f4922c = 0;
            C0804i.m3895a();
        }
    }

    /* renamed from: a */
    private void m6344a() {
        C1391b bVar;
        boolean z;
        int size = this.f4921b.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView = this.f4921b.get(i2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.mPrefetchRegistry.mo7440a(recyclerView, false);
                i += recyclerView.mPrefetchRegistry.f4928d;
            }
        }
        this.f4924f.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = this.f4921b.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                C1390a aVar = recyclerView2.mPrefetchRegistry;
                int abs = Math.abs(aVar.f4925a) + Math.abs(aVar.f4926b);
                for (int i5 = 0; i5 < aVar.f4928d * 2; i5 += 2) {
                    if (i3 >= this.f4924f.size()) {
                        bVar = new C1391b();
                        this.f4924f.add(bVar);
                    } else {
                        bVar = this.f4924f.get(i3);
                    }
                    int i6 = aVar.f4927c[i5 + 1];
                    if (i6 <= abs) {
                        z = true;
                    } else {
                        z = false;
                    }
                    bVar.f4929a = z;
                    bVar.f4930b = abs;
                    bVar.f4931c = i6;
                    bVar.f4932d = recyclerView2;
                    bVar.f4933e = aVar.f4927c[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.f4924f, f4920e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7431a(long j) {
        m6344a();
        m6348b(j);
    }

    /* renamed from: b */
    public void mo7434b(RecyclerView recyclerView) {
        this.f4921b.remove(recyclerView);
    }

    /* renamed from: a */
    public void mo7432a(RecyclerView recyclerView) {
        this.f4921b.add(recyclerView);
    }

    /* renamed from: b */
    private void m6348b(long j) {
        for (int i = 0; i < this.f4924f.size(); i++) {
            C1391b bVar = this.f4924f.get(i);
            if (bVar.f4932d != null) {
                m6346a(bVar, j);
                bVar.mo7442a();
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private void m6345a(RecyclerView recyclerView, long j) {
        if (recyclerView != null) {
            if (recyclerView.mDataSetHasChangedAfterLayout && recyclerView.mChildHelper.getUnfilteredChildCount() != 0) {
                recyclerView.removeAndRecycleViews();
            }
            C1390a aVar = recyclerView.mPrefetchRegistry;
            aVar.mo7440a(recyclerView, true);
            if (aVar.f4928d != 0) {
                try {
                    C0804i.m3896a("RV Nested Prefetch");
                    recyclerView.mState.prepareForNestedPrefetch(recyclerView.mAdapter);
                    for (int i = 0; i < aVar.f4928d * 2; i += 2) {
                        m6343a(recyclerView, aVar.f4927c[i], j);
                    }
                } finally {
                    C0804i.m3895a();
                }
            }
        }
    }

    /* renamed from: a */
    private void m6346a(C1391b bVar, long j) {
        long j2;
        if (bVar.f4929a) {
            j2 = Long.MAX_VALUE;
        } else {
            j2 = j;
        }
        RecyclerView.ViewHolder a = m6343a(bVar.f4932d, bVar.f4933e, j2);
        if (a != null && a.mNestedRecyclerView != null && a.isBound() && !a.isInvalid()) {
            m6345a(a.mNestedRecyclerView.get(), j);
        }
    }

    /* renamed from: a */
    static boolean m6347a(RecyclerView recyclerView, int i) {
        int unfilteredChildCount = recyclerView.mChildHelper.getUnfilteredChildCount();
        for (int i2 = 0; i2 < unfilteredChildCount; i2++) {
            RecyclerView.ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.getUnfilteredChildAt(i2));
            if (childViewHolderInt.mPosition == i && !childViewHolderInt.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7433a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f4922c == 0) {
            this.f4922c = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.mPrefetchRegistry.mo7439a(i, i2);
    }

    /* renamed from: a */
    private RecyclerView.ViewHolder m6343a(RecyclerView recyclerView, int i, long j) {
        if (m6347a(recyclerView, i)) {
            return null;
        }
        RecyclerView.Recycler recycler = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.ViewHolder tryGetViewHolderForPositionByDeadline = recycler.tryGetViewHolderForPositionByDeadline(i, false, j);
            if (tryGetViewHolderForPositionByDeadline != null) {
                if (!tryGetViewHolderForPositionByDeadline.isBound() || tryGetViewHolderForPositionByDeadline.isInvalid()) {
                    recycler.addViewHolderToRecycledViewPool(tryGetViewHolderForPositionByDeadline, false);
                } else {
                    recycler.recycleView(tryGetViewHolderForPositionByDeadline.itemView);
                }
            }
            return tryGetViewHolderForPositionByDeadline;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
        }
    }
}
