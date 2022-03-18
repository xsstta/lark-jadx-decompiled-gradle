package com.bytedance.ee.bear.bitable.card.view.form;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.bitable.card.model.stmodel.C4525a;
import com.bytedance.ee.bear.bitable.card.model.stmodel.cell.C4537a;
import com.bytedance.ee.bear.bitable.card.view.AbstractC4712d;
import com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4607d;
import com.bytedance.ee.bear.bitable.card.view.form.C4725h;
import com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4548e;
import com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4549f;
import com.bytedance.ee.bear.bitable.card.viewmodel.C4771b;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.document.p305e.C5752a;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13742g;
import com.larksuite.suite.R;
import me.p3476a.p3477a.p3478a.p3479a.AbstractC69593b;
import me.p3476a.p3477a.p3478a.p3479a.C69607g;

/* renamed from: com.bytedance.ee.bear.bitable.card.view.form.h */
public class C4725h extends FrameLayout implements AbstractC4549f {

    /* renamed from: a */
    public final RecyclerView f13939a;

    /* renamed from: b */
    private final C4716b f13940b;

    @Override // com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4549f
    /* renamed from: a */
    public void mo17913a(AbstractC4549f.AbstractC4550a aVar) {
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4549f
    /* renamed from: a */
    public void mo17914a(String str) {
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4549f
    /* renamed from: a */
    public boolean mo17915a() {
        return false;
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4549f
    /* renamed from: b */
    public void mo17916b() {
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4549f
    /* renamed from: b */
    public void mo17917b(AbstractC4549f.AbstractC4550a aVar) {
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4549f
    public View getRootView() {
        return this;
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4549f
    public View getTitleBar() {
        return null;
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4549f
    public void setAddRecordTitleBarVisibility(Boolean bool) {
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4549f
    public void setFiltered(boolean z) {
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4549f
    public void setHeaderColor(int i) {
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4549f
    public void setTitle(C4537a aVar) {
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4549f
    public void setUpdateCardStatusListener(AbstractC4549f.AbstractC4551b bVar) {
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4549f
    public void setVisitPermission(boolean z) {
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4549f
    public int getCurrentScrollPosition() {
        RecyclerView.LayoutManager layoutManager = this.f13939a.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).findLastCompletelyVisibleItemPosition();
        }
        return 0;
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4549f
    /* renamed from: a */
    public void mo17911a(int i) {
        this.f13939a.scrollToPosition(i);
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4549f
    /* renamed from: a */
    public void mo17912a(C4525a aVar) {
        this.f13940b.mo17895a(aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.form.h$a */
    public class C4727a extends RecyclerView.OnScrollListener implements AbstractC4548e {

        /* renamed from: b */
        private final Context f13943b;

        /* renamed from: c */
        private final C5752a f13944c;

        /* renamed from: d */
        private final int f13945d;

        /* renamed from: e */
        private boolean f13946e = true;

        /* renamed from: f */
        private boolean f13947f;

        /* renamed from: g */
        private AbstractC69593b f13948g;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m19590a(AbstractC4607d dVar) {
            int a = dVar.mo17990a(this.f13943b);
            C13479a.m54772d("FormViewScrollListener", "onShow, editPanel = " + dVar.getClass().getSimpleName() + ", panelHeight = " + dVar.mo17990a(this.f13943b));
            if (a > 0) {
                this.f13947f = true;
                this.f13944c.hideFab();
            }
        }

        @Override // com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4548e
        /* renamed from: a */
        public void mo17908a(View view, AbstractC4607d dVar) {
            C13742g.m55705a(new Runnable(dVar) {
                /* class com.bytedance.ee.bear.bitable.card.view.form.$$Lambda$h$a$Cs8QGxkpgr0dD3FdwpH1DZRMFc */
                public final /* synthetic */ AbstractC4607d f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C4725h.C4727a.this.m19590a(this.f$1);
                }
            });
        }

        @Override // com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4548e
        /* renamed from: b */
        public void mo17910b(View view, AbstractC4607d dVar) {
            this.f13947f = false;
            this.f13944c.showFab();
        }

        public C4727a(Context context, C5752a aVar) {
            this.f13944c = aVar;
            this.f13943b = context;
            this.f13945d = ViewConfiguration.get(context).getScaledTouchSlop();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            if (i2 != 0) {
                boolean canScrollVertically = recyclerView.canScrollVertically(-1);
                if (Math.abs(i2) > this.f13945d || !canScrollVertically) {
                    if (i2 >= 0 || this.f13947f) {
                        this.f13944c.hideFab();
                    } else {
                        this.f13944c.showFab();
                    }
                }
                AbstractC69593b bVar = this.f13948g;
                if (bVar != null && !canScrollVertically) {
                    bVar.mo243154c();
                    this.f13946e = true;
                } else if (this.f13946e) {
                    this.f13948g = C69607g.m267378a(C4725h.this.f13939a, 0);
                    this.f13946e = false;
                }
                if (C4725h.this.f13939a.getLayoutManager().getFocusedChild() == null) {
                    C13479a.m54772d("FormViewScrollListener", "no focused child view");
                    C10548d.m43696a(this.f13943b);
                }
            }
        }
    }

    public C4725h(Context context, C4771b bVar, AbstractC4712d dVar) {
        super(context);
        C4727a aVar = new C4727a(context, (C5752a) C4950k.m20474a(dVar.mo17874g(), C5752a.class));
        LayoutInflater.from(context).inflate(R.layout.bitable_form_layout, this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.form_content_recycler);
        this.f13939a = recyclerView;
        recyclerView.setItemAnimator(null);
        recyclerView.setLayoutManager(new LinearLayoutManager(context) {
            /* class com.bytedance.ee.bear.bitable.card.view.form.C4725h.C47261 */

            @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean onRequestChildFocus(RecyclerView recyclerView, RecyclerView.State state, View view, View view2) {
                return true;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
                return false;
            }
        });
        recyclerView.addItemDecoration(new C4723f());
        C4716b bVar2 = new C4716b(bVar, dVar, recyclerView, aVar);
        this.f13940b = bVar2;
        bVar2.setHasStableIds(true);
        recyclerView.setAdapter(bVar2);
        recyclerView.addOnScrollListener(aVar);
    }
}
