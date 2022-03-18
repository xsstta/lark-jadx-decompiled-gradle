package com.bytedance.ee.bear.bitable.card.view.p258a;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.lifecycle.AbstractC1178x;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.bitable.card.model.stmodel.C4525a;
import com.bytedance.ee.bear.bitable.card.model.stmodel.cell.C4537a;
import com.bytedance.ee.bear.bitable.card.view.AbstractC4712d;
import com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4549f;
import com.bytedance.ee.bear.bitable.card.view.title.BitableCardTitleView;
import com.bytedance.ee.bear.bitable.card.viewmodel.C4771b;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10549e;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;
import me.p3476a.p3477a.p3478a.p3479a.C69607g;

/* renamed from: com.bytedance.ee.bear.bitable.card.view.a.j */
public class C4554j implements AbstractC4549f, AbstractC10549e {

    /* renamed from: a */
    public RecyclerView f13404a;

    /* renamed from: b */
    public C4552h f13405b;

    /* renamed from: c */
    public AbstractC4549f.AbstractC4551b f13406c;

    /* renamed from: d */
    public List<AbstractC4549f.AbstractC4550a> f13407d;

    /* renamed from: e */
    public AbstractC10550f f13408e;

    /* renamed from: f */
    public Context f13409f;

    /* renamed from: g */
    private View f13410g;

    /* renamed from: h */
    private View f13411h;

    /* renamed from: i */
    private View f13412i;

    /* renamed from: j */
    private View f13413j;

    /* renamed from: k */
    private BitableCardTitleView f13414k;

    /* renamed from: l */
    private View f13415l;

    /* renamed from: m */
    private View f13416m;

    /* renamed from: n */
    private boolean f13417n;

    /* renamed from: o */
    private View f13418o;

    /* renamed from: p */
    private AbstractC4712d f13419p;

    /* renamed from: q */
    private RecyclerView.OnScrollListener f13420q;

    @Override // com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4549f
    public View getRootView() {
        return this.f13410g;
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4549f
    public View getTitleBar() {
        return this.f13413j;
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4549f
    /* renamed from: b */
    public void mo17916b() {
        this.f13406c = null;
    }

    /* renamed from: c */
    public void mo17935c() {
        View findViewById;
        View h = this.f13419p.mo17875h();
        if (h != null && (findViewById = h.findViewById(R.id.multi_text_tool_bar_layout)) != null) {
            findViewById.setVisibility(8);
        }
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4549f
    public int getCurrentScrollPosition() {
        RecyclerView.LayoutManager layoutManager = this.f13404a.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).findLastCompletelyVisibleItemPosition();
        }
        return 0;
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4549f
    /* renamed from: a */
    public boolean mo17915a() {
        if (((LinearLayoutManager) this.f13404a.getLayoutManager()).findFirstCompletelyVisibleItemPosition() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4549f
    public void setUpdateCardStatusListener(AbstractC4549f.AbstractC4551b bVar) {
        this.f13406c = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m18922b(View view) {
        setFiltered(false);
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4549f
    /* renamed from: a */
    public void mo17912a(C4525a aVar) {
        this.f13405b.mo17895a(aVar);
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4549f
    public void setHeaderColor(int i) {
        this.f13412i.setBackgroundColor(i);
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4549f
    public void setTitle(C4537a aVar) {
        this.f13414k.setData(aVar);
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4549f
    /* renamed from: a */
    public void mo17911a(int i) {
        this.f13404a.post(new Runnable(i) {
            /* class com.bytedance.ee.bear.bitable.card.view.p258a.$$Lambda$j$pvsW1Ygh_sLb8TZougKx47nOBi0 */
            public final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C4554j.lambda$pvsW1Ygh_sLb8TZougKx47nOBi0(C4554j.this, this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m18919a(View view) {
        C10548d.m43696a(this.f13409f);
        List<AbstractC4549f.AbstractC4550a> list = this.f13407d;
        if (list != null) {
            for (AbstractC4549f.AbstractC4550a aVar : list) {
                aVar.mo17927a();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m18921b(int i) {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f13404a.getLayoutManager();
        if (i > linearLayoutManager.findLastCompletelyVisibleItemPosition()) {
            linearLayoutManager.scrollToPositionWithOffset(i, this.f13404a.getHeight() / 3);
        }
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4549f
    public void setAddRecordTitleBarVisibility(Boolean bool) {
        int i;
        View view = this.f13418o;
        int i2 = 0;
        if (bool.booleanValue()) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        View view2 = this.f13413j;
        if (bool.booleanValue()) {
            i2 = 8;
        }
        view2.setVisibility(i2);
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4549f
    public void setFiltered(boolean z) {
        int i;
        View view = this.f13415l;
        int i2 = 0;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        View view2 = this.f13416m;
        if (z) {
            i2 = 8;
        }
        view2.setVisibility(i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m18924b(String str) {
        ((LinearLayoutManager) this.f13404a.getLayoutManager()).scrollToPositionWithOffset(this.f13405b.mo17890a(str), 0);
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4549f
    /* renamed from: a */
    public void mo17913a(AbstractC4549f.AbstractC4550a aVar) {
        if (this.f13407d == null) {
            this.f13407d = new ArrayList();
        }
        if (!this.f13407d.contains(aVar)) {
            this.f13407d.add(aVar);
        }
        this.f13404a.addOnScrollListener(this.f13420q);
        this.f13417n = true;
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4549f
    public void setVisitPermission(boolean z) {
        int i;
        int i2;
        int i3;
        View view = this.f13411h;
        int i4 = 8;
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        view.setVisibility(i);
        BitableCardTitleView bitableCardTitleView = this.f13414k;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        bitableCardTitleView.setVisibility(i2);
        View view2 = this.f13416m;
        if (z) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        view2.setVisibility(i3);
        RecyclerView recyclerView = this.f13404a;
        if (z) {
            i4 = 0;
        }
        recyclerView.setVisibility(i4);
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4549f
    /* renamed from: a */
    public void mo17914a(String str) {
        if (this.f13417n) {
            this.f13404a.post(new Runnable(str) {
                /* class com.bytedance.ee.bear.bitable.card.view.p258a.$$Lambda$j$Ud7uSWtwNSE80ZpUC47tGL2J694 */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C4554j.lambda$Ud7uSWtwNSE80ZpUC47tGL2J694(C4554j.this, this.f$1);
                }
            });
        }
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4549f
    /* renamed from: b */
    public void mo17917b(AbstractC4549f.AbstractC4550a aVar) {
        List<AbstractC4549f.AbstractC4550a> list = this.f13407d;
        if (list != null) {
            list.remove(aVar);
        }
        this.f13404a.removeOnScrollListener(this.f13420q);
        this.f13417n = false;
    }

    @Override // com.bytedance.ee.bear.p522q.p523a.AbstractC10549e
    public void onKeyboardHeightChanged(AbstractC10550f fVar, int i, int i2) {
        if (i == 0) {
            mo17935c();
            C10548d.m43697a(this.f13410g);
        }
    }

    public C4554j(View view, C4771b bVar, AbstractC4712d dVar) {
        this.f13410g = view;
        this.f13419p = dVar;
        this.f13409f = view.getContext();
        this.f13411h = view.findViewById(R.id.no_permission_placeholder);
        this.f13412i = view.findViewById(R.id.recordcard_top_bar);
        this.f13413j = view.findViewById(R.id.recordcard_title_ll);
        BitableCardTitleView bitableCardTitleView = (BitableCardTitleView) view.findViewById(R.id.recordcard_title_tv);
        this.f13414k = bitableCardTitleView;
        bitableCardTitleView.setBitableCardDelegate(dVar);
        this.f13415l = view.findViewById(R.id.recordcard_banner);
        this.f13416m = view.findViewById(R.id.recordcard_border);
        this.f13404a = (RecyclerView) view.findViewById(R.id.recordcard_content_recycler);
        this.f13418o = view.findViewById(R.id.add_record_titlebar);
        view.findViewById(R.id.add_record_confirm_btn).setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.bitable.card.view.p258a.$$Lambda$j$Q5YcTgd7eLwW5ki45b6Nq8oWJaE */

            public final void onClick(View view) {
                C4554j.lambda$Q5YcTgd7eLwW5ki45b6Nq8oWJaE(C4771b.this, view);
            }
        });
        view.findViewById(R.id.add_record_cancel_btn).setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.bitable.card.view.p258a.$$Lambda$j$nbnqsMQjcab6y0Vr7K97PCJIIkg */

            public final void onClick(View view) {
                C4554j.lambda$nbnqsMQjcab6y0Vr7K97PCJIIkg(C4771b.this, view);
            }
        });
        view.findViewById(R.id.recordcard_banner_close).setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.bitable.card.view.p258a.$$Lambda$j$rt41St4wwSmOaaGhhnr08fP2Y4A */

            public final void onClick(View view) {
                C4554j.lambda$rt41St4wwSmOaaGhhnr08fP2Y4A(C4554j.this, view);
            }
        });
        view.findViewById(R.id.recordcard_close).setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.bitable.card.view.p258a.$$Lambda$j$J2mPwvG_lWDStMFith6Q2iZoKfs */

            public final void onClick(View view) {
                C4554j.lambda$J2mPwvG_lWDStMFith6Q2iZoKfs(C4554j.this, view);
            }
        });
        this.f13404a.setItemAnimator(null);
        this.f13404a.setLayoutManager(new LinearLayoutManager(view.getContext()) {
            /* class com.bytedance.ee.bear.bitable.card.view.p258a.C4554j.C45551 */

            @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean onRequestChildFocus(RecyclerView recyclerView, RecyclerView.State state, View view, View view2) {
                return true;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
                return false;
            }
        });
        this.f13404a.addItemDecoration(new C4543b());
        C4552h hVar = new C4552h(bVar, dVar, this.f13404a);
        this.f13405b = hVar;
        hVar.setHasStableIds(true);
        this.f13404a.setAdapter(this.f13405b);
        C69607g.m267378a(this.f13404a, 0);
        Context context = this.f13409f;
        if (context instanceof Activity) {
            AbstractC10550f b = AbstractC10550f.AbstractC10551a.m43717b((Activity) context);
            this.f13408e = b;
            b.mo39924a(this);
        }
        bVar.getActive().mo5923a(dVar.mo17874g(), new AbstractC1178x<Boolean>() {
            /* class com.bytedance.ee.bear.bitable.card.view.p258a.C4554j.C45562 */

            /* renamed from: a */
            public void onChanged(Boolean bool) {
                if (!bool.booleanValue() && C4554j.this.f13408e != null) {
                    C4554j.this.f13408e.mo39928b(C4554j.this);
                    C4554j.this.mo17935c();
                }
            }
        });
        this.f13420q = new RecyclerView.OnScrollListener() {
            /* class com.bytedance.ee.bear.bitable.card.view.p258a.C4554j.C45573 */

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                if (C4554j.this.f13404a.getLayoutManager().getFocusedChild() == null) {
                    C13479a.m54772d("RecordView", "no focused child view");
                    C10548d.m43696a(C4554j.this.f13409f);
                }
                int findFirstCompletelyVisibleItemPosition = ((LinearLayoutManager) C4554j.this.f13404a.getLayoutManager()).findFirstCompletelyVisibleItemPosition();
                if (C4554j.this.f13406c != null) {
                    C4554j.this.f13406c.mo17929a(C4554j.this.f13405b.mo17898c(findFirstCompletelyVisibleItemPosition));
                }
                boolean z = !recyclerView.canScrollVertically(-1);
                if (C4554j.this.f13407d != null) {
                    for (AbstractC4549f.AbstractC4550a aVar : C4554j.this.f13407d) {
                        aVar.mo17928a(z);
                    }
                }
            }
        };
    }
}
