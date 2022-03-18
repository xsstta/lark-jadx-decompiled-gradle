package com.ss.android.lark.moments.impl.common.widget;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.google.android.gms.common.ConnectionResult;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import com.ss.android.lark.moments.impl.common.widget.C47297c;

/* renamed from: com.ss.android.lark.moments.impl.common.widget.c */
public class C47297c<T extends RecyclerView.Adapter> {

    /* renamed from: a */
    protected RecyclerView f119288a;

    /* renamed from: b */
    protected RecyclerView.AdapterDataObserver f119289b;

    /* renamed from: c */
    private int f119290c;

    /* renamed from: d */
    private Runnable f119291d;

    /* renamed from: e */
    private C47302d f119292e;

    /* renamed from: f */
    private boolean f119293f = true;

    /* renamed from: com.ss.android.lark.moments.impl.common.widget.c$c */
    public interface AbstractC47301c {
        /* renamed from: a */
        void mo166265a(int i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public RecyclerView.AdapterDataObserver mo166255b() {
        return new RecyclerView.AdapterDataObserver() {
            /* class com.ss.android.lark.moments.impl.common.widget.C47297c.C472981 */

            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeChanged(int i, int i2, Object obj) {
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeInserted(int i, int i2) {
            }
        };
    }

    /* renamed from: com.ss.android.lark.moments.impl.common.widget.c$a */
    public static class C47299a extends LinearSmoothScroller {

        /* renamed from: a */
        private final int f119295a;

        /* renamed from: b */
        private int f119296b;

        /* renamed from: c */
        private boolean f119297c;

        /* access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int getVerticalSnapPreference() {
            int i = this.f119296b;
            if (i == 48) {
                return -1;
            }
            if (i == 80) {
                return 1;
            }
            return 0;
        }

        /* renamed from: a */
        public void mo166256a(int i) {
            this.f119296b = i;
        }

        /* renamed from: a */
        public void mo166257a(boolean z) {
            this.f119297c = z;
        }

        /* access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int calculateTimeForScrolling(int i) {
            int i2;
            if (this.f119297c) {
                i2 = 1;
            } else {
                i2 = Math.max((int) ParticipantRepo.f117150c, Math.min(i, (int) ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED));
            }
            return super.calculateTimeForScrolling(i2);
        }

        C47299a(Context context, int i) {
            super(context);
            this.f119295a = i;
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int calculateDtToFit(int i, int i2, int i3, int i4, int i5) {
            int i6 = this.f119296b;
            if (i6 == 48 || (i6 == 17 && Math.abs(i2 - i) > Math.abs(i4 - i3))) {
                return (i3 - i) + this.f119295a;
            }
            if (this.f119296b == 80) {
                return i4 - i2;
            }
            return (i3 + ((i4 - i3) / 2)) - (i + ((i2 - i) / 2));
        }
    }

    /* renamed from: d */
    private RecyclerView.AdapterDataObserver m187296d() {
        if (this.f119289b == null) {
            this.f119289b = mo166255b();
        }
        return this.f119289b;
    }

    /* renamed from: a */
    public void mo166251a() {
        m187295c();
        this.f119292e = null;
    }

    /* renamed from: c */
    private void m187295c() {
        RecyclerView recyclerView = this.f119288a;
        if (recyclerView != null && recyclerView.getAdapter() != null) {
            this.f119288a.getAdapter().unregisterAdapterDataObserver(m187296d());
        }
    }

    /* renamed from: com.ss.android.lark.moments.impl.common.widget.c$b */
    public static final class C47300b {

        /* renamed from: a */
        public AbstractC47291a f119298a = $$Lambda$c$b$8LsFwnYUKhuQl99tfNxWEVZdA.INSTANCE;

        /* renamed from: b */
        public int f119299b = 48;

        /* renamed from: c */
        public int f119300c = 0;

        /* renamed from: d */
        public boolean f119301d = false;

        /* renamed from: e */
        public float f119302e = 2.14748365E9f;

        /* renamed from: f */
        public AbstractC47301c f119303f;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ int m187304a(int i, RecyclerView.Adapter adapter) {
            if (adapter != null) {
                return i;
            }
            return -1;
        }

        /* renamed from: a */
        public C47302d mo166262a() {
            return new C47302d(this);
        }

        /* renamed from: a */
        public C47300b mo166259a(AbstractC47291a aVar) {
            this.f119298a = aVar;
            return this;
        }

        /* renamed from: b */
        public C47300b mo166263b(int i) {
            this.f119299b = i;
            return this;
        }

        /* renamed from: c */
        public C47300b mo166264c(int i) {
            this.f119300c = i;
            return this;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ int m187305a(RecyclerView.Adapter adapter) {
            if (adapter != null) {
                return adapter.getItemCount() - 1;
            }
            return -1;
        }

        /* renamed from: a */
        public C47300b mo166258a(int i) {
            this.f119298a = new AbstractC47291a(i) {
                /* class com.ss.android.lark.moments.impl.common.widget.$$Lambda$c$b$PrtB7qQiXnzE_6GcNf_aQmWJhbE */
                public final /* synthetic */ int f$0;

                {
                    this.f$0 = r1;
                }

                @Override // com.ss.android.lark.moments.impl.common.widget.AbstractC47291a
                public final int getTargetItemPosition(RecyclerView.Adapter adapter) {
                    return C47297c.C47300b.m187304a(this.f$0, adapter);
                }
            };
            return this;
        }

        /* renamed from: a */
        public C47300b mo166260a(AbstractC47301c cVar) {
            this.f119303f = cVar;
            return this;
        }

        /* renamed from: a */
        public C47300b mo166261a(boolean z) {
            this.f119301d = z;
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.moments.impl.common.widget.c$d */
    public static final class C47302d {

        /* renamed from: a */
        final AbstractC47291a f119304a;

        /* renamed from: b */
        final int f119305b;

        /* renamed from: c */
        final int f119306c;

        /* renamed from: d */
        final boolean f119307d;

        /* renamed from: e */
        final float f119308e;

        /* renamed from: f */
        final AbstractC47301c f119309f;

        private C47302d(C47300b bVar) {
            this.f119304a = bVar.f119298a;
            this.f119305b = bVar.f119299b;
            this.f119306c = bVar.f119300c;
            this.f119307d = bVar.f119301d;
            this.f119308e = bVar.f119302e;
            this.f119309f = bVar.f119303f;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.ss.android.lark.moments.impl.common.widget.a<T extends androidx.recyclerview.widget.RecyclerView$Adapter> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private int m187291a(AbstractC47291a<T> aVar) {
        RecyclerView recyclerView = this.f119288a;
        if (recyclerView == null || recyclerView.getAdapter() == null) {
            return -1;
        }
        return aVar.getTargetItemPosition(recyclerView.getAdapter());
    }

    /* renamed from: a */
    public void mo166252a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f119288a;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                m187295c();
            }
            this.f119288a = recyclerView;
            if (!(recyclerView == null || recyclerView.getAdapter() == null)) {
                this.f119288a.getAdapter().registerAdapterDataObserver(m187296d());
            }
            if (this.f119292e != null) {
                Log.m165389i("ListScroller", "scroll pending request");
                mo166253a(this.f119292e);
                this.f119292e = null;
            }
        }
    }

    /* renamed from: a */
    public void mo166253a(C47302d dVar) {
        float f;
        float f2;
        RecyclerView recyclerView = this.f119288a;
        if (!this.f119293f) {
            Log.m165389i("ListScroller", "scroll disabled");
        } else if (recyclerView == null) {
            Log.m165389i("ListScroller", "scroll before attachToRecycleView");
            this.f119292e = dVar;
        } else {
            Runnable runnable = this.f119291d;
            if (runnable != null) {
                recyclerView.removeCallbacks(runnable);
            }
            AbstractC47291a aVar = dVar.f119304a;
            AbstractC47301c cVar = dVar.f119309f;
            int i = dVar.f119305b;
            int i2 = dVar.f119306c;
            if (i == 80) {
                f = BitmapDescriptorFactory.HUE_RED;
            } else {
                if (dVar.f119308e == 2.14748365E9f) {
                    f2 = (float) this.f119290c;
                } else {
                    f2 = dVar.f119308e;
                }
                f = f2;
            }
            $$Lambda$c$pHpmqpHlzc8qGAAFuQMeSLGrMMU r11 = new Runnable(aVar, cVar, dVar.f119307d, recyclerView, f, i) {
                /* class com.ss.android.lark.moments.impl.common.widget.$$Lambda$c$pHpmqpHlzc8qGAAFuQMeSLGrMMU */
                public final /* synthetic */ AbstractC47291a f$1;
                public final /* synthetic */ C47297c.AbstractC47301c f$2;
                public final /* synthetic */ boolean f$3;
                public final /* synthetic */ RecyclerView f$4;
                public final /* synthetic */ float f$5;
                public final /* synthetic */ int f$6;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                    this.f$4 = r5;
                    this.f$5 = r6;
                    this.f$6 = r7;
                }

                public final void run() {
                    C47297c.this.m187293a(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6);
                }
            };
            this.f119291d = r11;
            if (i2 > 0) {
                recyclerView.postDelayed(r11, (long) i2);
            } else {
                r11.run();
            }
        }
    }

    /* renamed from: a */
    public void mo166254a(boolean z) {
        Log.m165389i("ListScroller", "enableScroll:" + z);
        this.f119293f = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m187292a(RecyclerView recyclerView, C47299a aVar) {
        recyclerView.getLayoutManager().startSmoothScroll(aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m187293a(AbstractC47291a aVar, AbstractC47301c cVar, boolean z, RecyclerView recyclerView, float f, int i) {
        int a = m187291a(aVar);
        if (a >= 0) {
            if (z) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                if (a < findFirstVisibleItemPosition - 1) {
                    linearLayoutManager.scrollToPosition(a + 1);
                } else if (a > findLastVisibleItemPosition + 1) {
                    linearLayoutManager.scrollToPosition(a - 1);
                }
                C47299a aVar2 = new C47299a(recyclerView.getContext(), (int) f);
                aVar2.mo166256a(i);
                aVar2.mo166257a(false);
                aVar2.setTargetPosition(a);
                recyclerView.post(new Runnable(aVar2) {
                    /* class com.ss.android.lark.moments.impl.common.widget.$$Lambda$c$qJUGb5SXHRbkQPgVoexocisk8MI */
                    public final /* synthetic */ C47297c.C47299a f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C47297c.m187292a(RecyclerView.this, this.f$1);
                    }
                });
            } else {
                ((LinearLayoutManager) recyclerView.getLayoutManager()).scrollToPositionWithOffset(a, (int) f);
            }
            if (cVar != null) {
                recyclerView.post(new Runnable(a) {
                    /* class com.ss.android.lark.moments.impl.common.widget.$$Lambda$c$K9JP84417SZQvCaAyCLZM6nS60 */
                    public final /* synthetic */ int f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C47297c.AbstractC47301c.this.mo166265a(this.f$1);
                    }
                });
            }
        } else if (cVar != null) {
            cVar.mo166265a(a);
        }
    }
}
