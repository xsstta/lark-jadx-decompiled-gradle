package com.ss.android.lark.chat.chatwindow.chat;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.google.android.gms.common.ConnectionResult;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.chat.base.view.recycleview.AbstractC32943c;
import com.ss.android.lark.chat.chatwindow.chat.C33247j;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.j */
public class C33247j<T extends RecyclerView.Adapter> {

    /* renamed from: a */
    protected RecyclerView f85557a;

    /* renamed from: b */
    protected RecyclerView.AdapterDataObserver f85558b;

    /* renamed from: c */
    private int f85559c;

    /* renamed from: d */
    private Runnable f85560d;

    /* renamed from: e */
    private C33252d f85561e;

    /* renamed from: f */
    private boolean f85562f = true;

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.j$c */
    public interface AbstractC33251c {
        /* renamed from: a */
        void mo122610a(int i);
    }

    /* renamed from: a */
    public void mo122597a(boolean z) {
        Log.m165389i("chatwindow", "enableScroll:" + z);
        this.f85562f = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public RecyclerView.AdapterDataObserver mo122598b() {
        return new RecyclerView.AdapterDataObserver() {
            /* class com.ss.android.lark.chat.chatwindow.chat.C33247j.C332481 */

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ int m128590a(int i, RecyclerView.Adapter adapter) {
                return i;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeInserted(int i, int i2) {
                C33086b bVar = (C33086b) C33247j.this.f85557a.getAdapter();
                if (bVar != null && i > 0 && bVar.getItemCount() == i + 1) {
                    ChatMessageVO b = bVar.mo31276a(bVar.getItemCount() - 1);
                    boolean c = b.mo121695c();
                    if (C33247j.this.mo122599c() || c) {
                        C33247j.this.mo122593a(100, !b.ai());
                    }
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeChanged(int i, int i2, Object obj) {
                if (obj != null && i2 == 1 && i == C33247j.this.mo122600d()) {
                    C33247j.this.mo122596a(new C33250b().mo122605a(new AbstractC32943c(i) {
                        /* class com.ss.android.lark.chat.chatwindow.chat.$$Lambda$j$1$QueQ6ymrDvisImfz8bRQX2sD5g8 */
                        public final /* synthetic */ int f$0;

                        {
                            this.f$0 = r1;
                        }

                        @Override // com.ss.android.lark.chat.base.view.recycleview.AbstractC32943c
                        public final int getTargetItemPosition(RecyclerView.Adapter adapter) {
                            return C33247j.C332481.m128590a(this.f$0, adapter);
                        }
                    }).mo122609b(100).mo122607a(true).mo122608a());
                }
            }
        };
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.j$a */
    public static class C33249a extends LinearSmoothScroller {

        /* renamed from: a */
        private final int f85564a;

        /* renamed from: b */
        private int f85565b;

        /* renamed from: c */
        private boolean f85566c;

        /* access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int getVerticalSnapPreference() {
            int i = this.f85565b;
            if (i == 48) {
                return -1;
            }
            if (i == 80) {
                return 1;
            }
            return 0;
        }

        /* renamed from: a */
        public void mo122601a(int i) {
            this.f85565b = i;
        }

        /* renamed from: a */
        public void mo122602a(boolean z) {
            this.f85566c = z;
        }

        /* access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int calculateTimeForScrolling(int i) {
            int i2;
            if (this.f85566c) {
                i2 = 1;
            } else {
                i2 = Math.max((int) ParticipantRepo.f117150c, Math.min(i, (int) ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED));
            }
            return super.calculateTimeForScrolling(i2);
        }

        C33249a(Context context, int i) {
            super(context);
            this.f85564a = i;
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int calculateDtToFit(int i, int i2, int i3, int i4, int i5) {
            int i6 = this.f85565b;
            if (i6 == 48 || (i6 == 17 && Math.abs(i2 - i) > Math.abs(i4 - i3))) {
                return (i3 - i) + this.f85564a;
            }
            if (this.f85565b == 80) {
                return i4 - i2;
            }
            return (i3 + ((i4 - i3) / 2)) - (i + ((i2 - i) / 2));
        }
    }

    /* renamed from: f */
    private RecyclerView.AdapterDataObserver m128578f() {
        if (this.f85558b == null) {
            this.f85558b = mo122598b();
        }
        return this.f85558b;
    }

    /* renamed from: a */
    public void mo122590a() {
        m128577e();
        this.f85561e = null;
    }

    /* renamed from: d */
    public int mo122600d() {
        return ((LinearLayoutManager) this.f85557a.getLayoutManager()).findLastVisibleItemPosition();
    }

    /* renamed from: e */
    private void m128577e() {
        RecyclerView recyclerView = this.f85557a;
        if (recyclerView != null && recyclerView.getAdapter() != null) {
            this.f85557a.getAdapter().unregisterAdapterDataObserver(m128578f());
        }
    }

    /* renamed from: c */
    public boolean mo122599c() {
        if (this.f85557a.computeVerticalScrollExtent() + this.f85557a.computeVerticalScrollOffset() >= this.f85557a.computeVerticalScrollRange()) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.j$b */
    public static final class C33250b {

        /* renamed from: a */
        public AbstractC32943c f85567a = $$Lambda$j$b$bfY92p_D2DxFn6zodmZI2cOXIqw.INSTANCE;

        /* renamed from: b */
        public int f85568b = 48;

        /* renamed from: c */
        public int f85569c = 0;

        /* renamed from: d */
        public boolean f85570d = false;

        /* renamed from: e */
        public float f85571e = 2.14748365E9f;

        /* renamed from: f */
        public AbstractC33251c f85572f;

        /* renamed from: a */
        public C33252d mo122608a() {
            return new C33252d(this);
        }

        /* renamed from: a */
        public C33250b mo122603a(float f) {
            this.f85571e = f;
            return this;
        }

        /* renamed from: b */
        public C33250b mo122609b(int i) {
            this.f85569c = i;
            return this;
        }

        /* renamed from: a */
        public C33250b mo122604a(int i) {
            this.f85568b = i;
            return this;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ int m128593a(RecyclerView.Adapter adapter) {
            if (adapter != null) {
                return adapter.getItemCount() - 1;
            }
            return -1;
        }

        /* renamed from: a */
        public C33250b mo122605a(AbstractC32943c cVar) {
            this.f85567a = cVar;
            return this;
        }

        /* renamed from: a */
        public C33250b mo122606a(AbstractC33251c cVar) {
            this.f85572f = cVar;
            return this;
        }

        /* renamed from: a */
        public C33250b mo122607a(boolean z) {
            this.f85570d = z;
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.j$d */
    public static class C33252d {

        /* renamed from: a */
        final AbstractC32943c f85573a;

        /* renamed from: b */
        final int f85574b;

        /* renamed from: c */
        final int f85575c;

        /* renamed from: d */
        final boolean f85576d;

        /* renamed from: e */
        final float f85577e;

        /* renamed from: f */
        final AbstractC33251c f85578f;

        private C33252d(C33250b bVar) {
            this.f85573a = bVar.f85567a;
            this.f85574b = bVar.f85568b;
            this.f85575c = bVar.f85569c;
            this.f85576d = bVar.f85570d;
            this.f85577e = bVar.f85571e;
            this.f85578f = bVar.f85572f;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.ss.android.lark.chat.base.view.recycleview.c<T extends androidx.recyclerview.widget.RecyclerView$Adapter> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private int m128573a(AbstractC32943c<T> cVar) {
        RecyclerView recyclerView = this.f85557a;
        if (recyclerView == null || recyclerView.getAdapter() == null) {
            return -1;
        }
        return cVar.getTargetItemPosition(recyclerView.getAdapter());
    }

    /* renamed from: a */
    public void mo122591a(int i) {
        this.f85559c = i;
    }

    /* renamed from: a */
    public void mo122595a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f85557a;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                m128577e();
            }
            this.f85557a = recyclerView;
            if (!(recyclerView == null || recyclerView.getAdapter() == null)) {
                this.f85557a.getAdapter().registerAdapterDataObserver(m128578f());
            }
            if (this.f85561e != null) {
                Log.m165389i("chatwindow", "scroll pending request");
                mo122596a(this.f85561e);
                this.f85561e = null;
            }
        }
    }

    /* renamed from: a */
    public void mo122596a(C33252d dVar) {
        float f;
        float f2;
        RecyclerView recyclerView = this.f85557a;
        if (!this.f85562f) {
            Log.m165389i("chatwindow", "scroll disabled");
        } else if (recyclerView == null) {
            Log.m165389i("chatwindow", "scroll before attachToRecycleView");
            this.f85561e = dVar;
        } else {
            Runnable runnable = this.f85560d;
            if (runnable != null) {
                recyclerView.removeCallbacks(runnable);
            }
            AbstractC32943c cVar = dVar.f85573a;
            AbstractC33251c cVar2 = dVar.f85578f;
            int i = dVar.f85574b;
            int i2 = dVar.f85575c;
            if (i == 80) {
                f = BitmapDescriptorFactory.HUE_RED;
            } else {
                if (dVar.f85577e == 2.14748365E9f) {
                    f2 = (float) this.f85559c;
                } else {
                    f2 = dVar.f85577e;
                }
                f = f2;
            }
            $$Lambda$j$DsHthiynRc4GQa98z3p4h5qVN4 r11 = new Runnable(cVar, cVar2, dVar.f85576d, recyclerView, f, i) {
                /* class com.ss.android.lark.chat.chatwindow.chat.$$Lambda$j$DsHthiynRc4GQa98z3p4h5qVN4 */
                public final /* synthetic */ AbstractC32943c f$1;
                public final /* synthetic */ C33247j.AbstractC33251c f$2;
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
                    C33247j.this.m128575a(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6);
                }
            };
            this.f85560d = r11;
            if (i2 > 0) {
                recyclerView.postDelayed(r11, (long) i2);
            } else {
                r11.run();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m128574a(RecyclerView recyclerView, C33249a aVar) {
        recyclerView.getLayoutManager().startSmoothScroll(aVar);
    }

    /* renamed from: a */
    public void mo122592a(int i, int i2) {
        RecyclerView recyclerView = this.f85557a;
        if (recyclerView == null) {
            Log.m165383e("chatwindow", "MessageListScroller is not init");
        } else {
            recyclerView.scrollBy(i, i2);
        }
    }

    /* renamed from: a */
    public void mo122593a(int i, boolean z) {
        mo122594a(i, z, null);
    }

    /* renamed from: a */
    public void mo122594a(int i, boolean z, AbstractC33251c cVar) {
        mo122596a(new C33250b().mo122604a(80).mo122609b(i).mo122607a(z).mo122606a(cVar).mo122608a());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m128575a(AbstractC32943c cVar, AbstractC33251c cVar2, boolean z, RecyclerView recyclerView, float f, int i) {
        int a = m128573a(cVar);
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
                C33249a aVar = new C33249a(recyclerView.getContext(), (int) f);
                aVar.mo122601a(i);
                aVar.mo122602a(false);
                aVar.setTargetPosition(a);
                recyclerView.post(new Runnable(aVar) {
                    /* class com.ss.android.lark.chat.chatwindow.chat.$$Lambda$j$VgveseJk5cgt5VDDCU_1BC3EXiw */
                    public final /* synthetic */ C33247j.C33249a f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C33247j.m128574a(RecyclerView.this, this.f$1);
                    }
                });
            } else {
                ((LinearLayoutManager) recyclerView.getLayoutManager()).scrollToPositionWithOffset(a, (int) f);
            }
            if (cVar2 != null) {
                recyclerView.post(new Runnable(a) {
                    /* class com.ss.android.lark.chat.chatwindow.chat.$$Lambda$j$QClbud7eYd5nEMXow1y6fb_kVNw */
                    public final /* synthetic */ int f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C33247j.AbstractC33251c.this.mo122610a(this.f$1);
                    }
                });
            }
        } else if (cVar2 != null) {
            cVar2.mo122610a(a);
        }
    }
}
