package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.collection.C0513a;
import androidx.collection.C0516c;
import androidx.core.util.C0845f;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.AbstractC1168n;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C13998f;

/* renamed from: androidx.viewpager2.adapter.a */
public abstract class AbstractC1583a extends RecyclerView.Adapter<C1591b> implements AbstractC1592c {

    /* renamed from: a */
    final Lifecycle f5539a;

    /* renamed from: b */
    final FragmentManager f5540b;

    /* renamed from: c */
    final C0516c<Fragment> f5541c;

    /* renamed from: d */
    boolean f5542d;

    /* renamed from: e */
    private final C0516c<Fragment.SavedState> f5543e;

    /* renamed from: f */
    private final C0516c<Integer> f5544f;

    /* renamed from: g */
    private C1588b f5545g;

    /* renamed from: h */
    private boolean f5546h;

    /* renamed from: a */
    public abstract Fragment mo8246a(int i);

    /* renamed from: d */
    public final boolean onFailedToRecycleView(C1591b bVar) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return (long) i;
    }

    /* renamed from: androidx.viewpager2.adapter.a$a */
    private static abstract class AbstractC1587a extends RecyclerView.AdapterDataObserver {
        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public abstract void onChanged();

        private AbstractC1587a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeInserted(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeRemoved(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeMoved(int i, int i2, int i3) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i, int i2, Object obj) {
            onChanged();
        }
    }

    /* renamed from: a */
    public boolean mo8253a(long j) {
        return j >= 0 && j < ((long) getItemCount());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo8255b() {
        return this.f5540b.isStateSaved();
    }

    /* renamed from: d */
    private void mo123620d() {
        Handler handler = new Handler(Looper.getMainLooper());
        RunnableC15863 r1 = new Runnable() {
            /* class androidx.viewpager2.adapter.AbstractC1583a.RunnableC15863 */

            public void run() {
                AbstractC1583a.this.f5542d = false;
                AbstractC1583a.this.mo8248a();
            }
        };
        this.f5539a.addObserver(new FragmentStateAdapter$5(this, handler, r1));
        handler.postDelayed(r1, 10000);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8248a() {
        if (this.f5546h && !mo8255b()) {
            C0513a<Long> aVar = new C0513a();
            for (int i = 0; i < this.f5541c.mo2962b(); i++) {
                long b = this.f5541c.mo2963b(i);
                if (!mo8253a(b)) {
                    aVar.add(Long.valueOf(b));
                    this.f5544f.mo2964b(b);
                }
            }
            if (!this.f5542d) {
                this.f5546h = false;
                for (int i2 = 0; i2 < this.f5541c.mo2962b(); i2++) {
                    long b2 = this.f5541c.mo2963b(i2);
                    if (!mo123618b(b2)) {
                        aVar.add(Long.valueOf(b2));
                    }
                }
            }
            for (Long l : aVar) {
                m7228c(l.longValue());
            }
        }
    }

    @Override // androidx.viewpager2.adapter.AbstractC1592c
    /* renamed from: c */
    public final Parcelable mo8256c() {
        Bundle bundle = new Bundle(this.f5541c.mo2962b() + this.f5543e.mo2962b());
        for (int i = 0; i < this.f5541c.mo2962b(); i++) {
            long b = this.f5541c.mo2963b(i);
            Fragment a = this.f5541c.mo2959a(b);
            if (a != null && a.isAdded()) {
                this.f5540b.putFragment(bundle, m7221a("f#", b), a);
            }
        }
        for (int i2 = 0; i2 < this.f5543e.mo2962b(); i2++) {
            long b2 = this.f5543e.mo2963b(i2);
            if (mo8253a(b2)) {
                bundle.putParcelable(m7221a("s#", b2), this.f5543e.mo2959a(b2));
            }
        }
        return bundle;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager2.adapter.a$b */
    public class C1588b {

        /* renamed from: b */
        private ViewPager2.AbstractC1603e f5555b;

        /* renamed from: c */
        private RecyclerView.AdapterDataObserver f5556c;

        /* renamed from: d */
        private AbstractC1168n f5557d;

        /* renamed from: e */
        private ViewPager2 f5558e;

        /* renamed from: f */
        private long f5559f = -1;

        C1588b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo8263b(RecyclerView recyclerView) {
            m7244c(recyclerView).unregisterOnPageChangeCallback(this.f5555b);
            AbstractC1583a.this.unregisterAdapterDataObserver(this.f5556c);
            AbstractC1583a.this.f5539a.removeObserver(this.f5557d);
            this.f5558e = null;
        }

        /* renamed from: c */
        private ViewPager2 m7244c(RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo8261a(RecyclerView recyclerView) {
            this.f5558e = m7244c(recyclerView);
            C15891 r2 = new ViewPager2.AbstractC1603e() {
                /* class androidx.viewpager2.adapter.AbstractC1583a.C1588b.C15891 */

                @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1603e
                public void onPageScrollStateChanged(int i) {
                    C1588b.this.mo8262a(false);
                }

                @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1603e
                public void onPageSelected(int i) {
                    C1588b.this.mo8262a(false);
                }
            };
            this.f5555b = r2;
            this.f5558e.registerOnPageChangeCallback(r2);
            C15902 r22 = new AbstractC1587a() {
                /* class androidx.viewpager2.adapter.AbstractC1583a.C1588b.C15902 */

                @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver, androidx.viewpager2.adapter.AbstractC1583a.AbstractC1587a
                public void onChanged() {
                    C1588b.this.mo8262a(true);
                }
            };
            this.f5556c = r22;
            AbstractC1583a.this.registerAdapterDataObserver(r22);
            this.f5557d = new FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3(this);
            AbstractC1583a.this.f5539a.addObserver(this.f5557d);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo8262a(boolean z) {
            int currentItem;
            Fragment a;
            boolean z2;
            if (!AbstractC1583a.this.mo8255b() && this.f5558e.getScrollState() == 0 && !AbstractC1583a.this.f5541c.mo2969c() && AbstractC1583a.this.getItemCount() != 0 && (currentItem = this.f5558e.getCurrentItem()) < AbstractC1583a.this.getItemCount()) {
                long itemId = AbstractC1583a.this.getItemId(currentItem);
                if ((itemId != this.f5559f || z) && (a = AbstractC1583a.this.f5541c.mo2959a(itemId)) != null && a.isAdded()) {
                    this.f5559f = itemId;
                    FragmentTransaction beginTransaction = AbstractC1583a.this.f5540b.beginTransaction();
                    Fragment fragment = null;
                    for (int i = 0; i < AbstractC1583a.this.f5541c.mo2962b(); i++) {
                        long b = AbstractC1583a.this.f5541c.mo2963b(i);
                        Fragment c = AbstractC1583a.this.f5541c.mo2967c(i);
                        if (c.isAdded()) {
                            if (b != this.f5559f) {
                                beginTransaction.setMaxLifecycle(c, Lifecycle.State.STARTED);
                            } else {
                                fragment = c;
                            }
                            if (b == this.f5559f) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            c.setMenuVisibility(z2);
                        }
                    }
                    if (fragment != null) {
                        beginTransaction.setMaxLifecycle(fragment, Lifecycle.State.RESUMED);
                    }
                    if (!beginTransaction.isEmpty()) {
                        beginTransaction.commitNow();
                    }
                }
            }
        }
    }

    public AbstractC1583a(Fragment fragment) {
        this(fragment.getChildFragmentManager(), fragment.getLifecycle());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.f5545g.mo8263b(recyclerView);
        this.f5545g = null;
    }

    /* renamed from: c */
    public final void onViewRecycled(C1591b bVar) {
        Long b = mo123619b(bVar.mo8266a().getId());
        if (b != null) {
            m7228c(b.longValue());
            this.f5544f.mo2964b(b.longValue());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        boolean z;
        if (this.f5545g == null) {
            z = true;
        } else {
            z = false;
        }
        C0845f.m3993a(z);
        C1588b bVar = new C1588b();
        this.f5545g = bVar;
        bVar.mo8261a(recyclerView);
    }

    /* renamed from: b */
    private Long mo123619b(int i) {
        Long l = null;
        for (int i2 = 0; i2 < this.f5544f.mo2962b(); i2++) {
            if (this.f5544f.mo2967c(i2).intValue() == i) {
                if (l == null) {
                    l = Long.valueOf(this.f5544f.mo2963b(i2));
                } else {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
            }
        }
        return l;
    }

    /* renamed from: c */
    private void m7227c(int i) {
        long itemId = getItemId(i);
        if (!this.f5541c.mo2972d(itemId)) {
            Fragment a = mo8246a(i);
            a.setInitialSavedState(this.f5543e.mo2959a(itemId));
            this.f5541c.mo2965b(itemId, a);
        }
    }

    /* renamed from: b */
    private boolean mo123618b(long j) {
        View view;
        if (this.f5544f.mo2972d(j)) {
            return true;
        }
        Fragment a = this.f5541c.mo2959a(j);
        if (a == null || (view = a.getView()) == null || view.getParent() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private void m7228c(long j) {
        ViewParent parent;
        Fragment a = this.f5541c.mo2959a(j);
        if (a != null) {
            if (!(a.getView() == null || (parent = a.getView().getParent()) == null)) {
                ((FrameLayout) parent).removeAllViews();
            }
            if (!mo8253a(j)) {
                this.f5543e.mo2964b(j);
            }
            if (!a.isAdded()) {
                this.f5541c.mo2964b(j);
            } else if (mo8255b()) {
                this.f5546h = true;
            } else {
                if (a.isAdded() && mo8253a(j)) {
                    this.f5543e.mo2965b(j, this.f5540b.saveFragmentInstanceState(a));
                }
                this.f5540b.beginTransaction().remove(a).commitNow();
                this.f5541c.mo2964b(j);
            }
        }
    }

    @Override // androidx.viewpager2.adapter.AbstractC1592c
    /* renamed from: a */
    public final void mo8249a(Parcelable parcelable) {
        if (!this.f5543e.mo2969c() || !this.f5541c.mo2969c()) {
            throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
        }
        Bundle bundle = (Bundle) parcelable;
        if (bundle.getClassLoader() == null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        for (String str : bundle.keySet()) {
            if (m7223a(str, "f#")) {
                this.f5541c.mo2965b(m7224b(str, "f#"), this.f5540b.getFragment(bundle, str));
            } else if (m7223a(str, "s#")) {
                long b = m7224b(str, "s#");
                Fragment.SavedState savedState = (Fragment.SavedState) bundle.getParcelable(str);
                if (mo8253a(b)) {
                    this.f5543e.mo2965b(b, savedState);
                }
            } else {
                throw new IllegalArgumentException("Unexpected key in savedState: " + str);
            }
        }
        if (!this.f5541c.mo2969c()) {
            this.f5546h = true;
            this.f5542d = true;
            mo8248a();
            mo123620d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo8254b(C1591b bVar) {
        Fragment a = this.f5541c.mo2959a(bVar.getItemId());
        if (a != null) {
            FrameLayout a2 = bVar.mo8266a();
            View view = a.getView();
            if (!a.isAdded() && view != null) {
                throw new IllegalStateException("Design assumption violated.");
            } else if (a.isAdded() && view == null) {
                m7222a(a, a2);
            } else if (!a.isAdded() || view.getParent() == null) {
                if (a.isAdded()) {
                    mo8250a(view, a2);
                } else if (!mo8255b()) {
                    m7222a(a, a2);
                    FragmentTransaction beginTransaction = this.f5540b.beginTransaction();
                    beginTransaction.add(a, C13998f.f36682a + bVar.getItemId()).setMaxLifecycle(a, Lifecycle.State.STARTED).commitNow();
                    this.f5545g.mo8262a(false);
                } else if (!this.f5540b.isDestroyed()) {
                    this.f5539a.addObserver(new FragmentStateAdapter$2(this, bVar));
                }
            } else if (view.getParent() != a2) {
                mo8250a(view, a2);
            }
        } else {
            throw new IllegalStateException("Design assumption violated.");
        }
    }

    /* renamed from: a */
    public final void onViewAttachedToWindow(C1591b bVar) {
        mo8254b(bVar);
        mo8248a();
    }

    /* renamed from: a */
    public final C1591b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return C1591b.m7248a(viewGroup);
    }

    /* renamed from: a */
    private static String m7221a(String str, long j) {
        return str + j;
    }

    /* renamed from: b */
    private static long m7224b(String str, String str2) {
        return Long.parseLong(str.substring(str2.length()));
    }

    /* renamed from: a */
    private void m7222a(final Fragment fragment, final FrameLayout frameLayout) {
        this.f5540b.registerFragmentLifecycleCallbacks(new FragmentManager.AbstractC1010b() {
            /* class androidx.viewpager2.adapter.AbstractC1583a.C15852 */

            @Override // androidx.fragment.app.FragmentManager.AbstractC1010b
            /* renamed from: a */
            public void mo5403a(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
                if (fragment == fragment) {
                    fragmentManager.unregisterFragmentLifecycleCallbacks(this);
                    AbstractC1583a.this.mo8250a(view, frameLayout);
                }
            }
        }, false);
    }

    public AbstractC1583a(FragmentManager fragmentManager, Lifecycle lifecycle) {
        this.f5541c = new C0516c<>();
        this.f5543e = new C0516c<>();
        this.f5544f = new C0516c<>();
        this.f5542d = false;
        this.f5546h = false;
        this.f5540b = fragmentManager;
        this.f5539a = lifecycle;
        super.setHasStableIds(true);
    }

    /* renamed from: a */
    private static boolean m7223a(String str, String str2) {
        if (!str.startsWith(str2) || str.length() <= str2.length()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8250a(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        } else if (view.getParent() != frameLayout) {
            if (frameLayout.getChildCount() > 0) {
                frameLayout.removeAllViews();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            frameLayout.addView(view);
        }
    }

    /* renamed from: a */
    public final void onBindViewHolder(final C1591b bVar, int i) {
        long itemId = bVar.getItemId();
        int id = bVar.mo8266a().getId();
        Long b = mo123619b(id);
        if (!(b == null || b.longValue() == itemId)) {
            m7228c(b.longValue());
            this.f5544f.mo2964b(b.longValue());
        }
        this.f5544f.mo2965b(itemId, Integer.valueOf(id));
        m7227c(i);
        final FrameLayout a = bVar.mo8266a();
        if (ViewCompat.m4015I(a)) {
            if (a.getParent() == null) {
                a.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                    /* class androidx.viewpager2.adapter.AbstractC1583a.View$OnLayoutChangeListenerC15841 */

                    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                        if (a.getParent() != null) {
                            a.removeOnLayoutChangeListener(this);
                            AbstractC1583a.this.mo8254b(bVar);
                        }
                    }
                });
            } else {
                throw new IllegalStateException("Design assumption violated.");
            }
        }
        mo8248a();
    }
}
