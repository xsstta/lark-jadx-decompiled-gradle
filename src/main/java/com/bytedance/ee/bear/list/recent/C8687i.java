package com.bytedance.ee.bear.list.recent;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC1178x;
import androidx.recyclerview.widget.C1374g;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.facade.common.C7718l;
import com.bytedance.ee.bear.list.analysis.ListAnalysis;
import com.bytedance.ee.bear.list.cache.FolderSortStrategy;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.homepage.AbstractC8459a;
import com.bytedance.ee.bear.list.list.AbstractC8538g;
import com.bytedance.ee.bear.list.list.AbstractC8544i;
import com.bytedance.ee.bear.list.list.BaseListView;
import com.bytedance.ee.bear.list.listsync.C8566e;
import com.bytedance.ee.bear.list.loadstateview.C8594b;
import com.bytedance.ee.bear.list.loadstateview.EmptyCategory;
import com.bytedance.ee.bear.list.loadstateview.LoadStateCategory;
import com.bytedance.ee.bear.list.loadstateview.LoadStateView;
import com.bytedance.ee.bear.list.more.itemv2.C8633c;
import com.bytedance.ee.bear.list.more.itemv2.C8634d;
import com.bytedance.ee.bear.list.p422a.C8143b;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.list.preload.C8664a;
import com.bytedance.ee.bear.list.preload.C8670d;
import com.bytedance.ee.bear.list.preload.RecentListContainer;
import com.bytedance.ee.bear.list.sort.FilterType;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import com.bytedance.ee.util.p718t.C13726a;
import com.bytedance.ee.util.p718t.C13748k;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27129h;
import com.ss.android.lark.ui.p2892a.C57582a;
import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.list.recent.i */
public class C8687i extends BaseListView<AbstractC8544i.AbstractC8545a> implements C8664a.AbstractC8665a, AbstractC8680b {

    /* renamed from: a */
    public final AbstractC8690a f23501a;

    /* renamed from: t */
    protected C8566e f23502t;

    /* renamed from: u */
    private RecentListContainer f23503u;

    /* renamed from: v */
    private boolean f23504v;

    /* renamed from: w */
    private boolean f23505w;

    /* renamed from: x */
    private final Runnable f23506x = new Runnable() {
        /* class com.bytedance.ee.bear.list.recent.C8687i.RunnableC86881 */

        public void run() {
            if (C8687i.this.f23502t != null) {
                C8687i.this.f23502t.mo33423c();
            }
        }
    };

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.list.recent.i$a */
    public interface AbstractC8690a {
        /* renamed from: a */
        void mo33707a();

        /* renamed from: a */
        void mo33708a(int i, int i2);

        /* renamed from: b */
        void mo33709b();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: A */
    public String mo33322A() {
        return "home";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: f */
    public String mo32614f() {
        return "recent";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: g */
    public String mo32615g() {
        return "RecentDocumentView";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: m */
    public String mo32618m() {
        return "recent";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: q */
    public boolean mo33345q() {
        return this.f23505w;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: F */
    private /* synthetic */ void m36338F() {
        onRefresh(null);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: G */
    private /* synthetic */ void m36339G() {
        if (!this.f23504v) {
            m36343e();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: d */
    public void mo32613d() {
        super.mo32613d();
        m36345j();
    }

    @Override // com.bytedance.ee.bear.list.preload.C8664a.AbstractC8665a
    public void onFirstContentDraw() {
        this.f23505w = true;
        mo33344p();
    }

    @Override // com.bytedance.ee.bear.list.list.BaseListView, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m36340a();
        m36344h();
    }

    /* renamed from: h */
    private void m36344h() {
        ListAnalysis.m32504a(C5234y.m21391b(), "home", "recent", (String) null, (String) null);
        ListAnalysis.m32526b(C5234y.m21391b(), mo32618m());
    }

    /* renamed from: j */
    private void m36345j() {
        if (this.f23092d.getParentFragment() instanceof AbstractC8459a) {
            this.f23099k = ((AbstractC8459a) this.f23092d.getParentFragment()).mo30968g();
        }
        mo33352x();
    }

    @Override // com.bytedance.ee.bear.list.list.BaseListView, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        C13748k.m55735c(this.f23506x);
        this.f23503u.setFirstPageViewListener(null);
        C8670d.m36229a().mo33676b();
        C8664a.m36219b(this);
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8544i, com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: o */
    public void mo33343o() {
        super.mo33343o();
        if (this.f23102n != null) {
            this.f23102n.mo33373b(RecentSort.ALL.getRank());
        }
    }

    /* renamed from: a */
    private void m36340a() {
        RecentListContainer recentListContainer = (RecentListContainer) this.f23091c.findViewById(R.id.list_layout_root);
        this.f23503u = recentListContainer;
        recentListContainer.setFirstPageViewListener(new RecentListContainer.AbstractC8663a() {
            /* class com.bytedance.ee.bear.list.recent.$$Lambda$i$aZwCo5ZQvYxjJZkym5El3HxpvOY */

            @Override // com.bytedance.ee.bear.list.preload.RecentListContainer.AbstractC8663a
            public final void onFirstContentShowed() {
                C8687i.this.m36339G();
            }
        });
        this.f23100l.mo33505a(this.f23092d, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.list.recent.$$Lambda$i$BvUMzLGwUkEhW4250UVNHdVUA */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C8687i.this.m36342a((C8687i) ((LoadStateCategory) obj));
            }
        });
        C8664a.m36218a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: i */
    public AbstractC8538g mo32616i() {
        AbstractC8538g gVar;
        this.f23102n = null;
        if (this.f23095g) {
            gVar = new C8683e(this.f23094f, mo32618m(), this.f23104p);
        } else {
            gVar = new C8684g(this.f23094f, mo32618m(), this.f23104p, this.f23101m);
        }
        mo33329a(gVar);
        mo33332b(gVar);
        return gVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: l */
    public void mo32617l() {
        this.f23100l = new C8594b((LoadStateView) this.f23091c.findViewById(R.id.list_state_view_root), Looper.getMainLooper());
        this.f23100l.mo33511a(false, EmptyCategory.f23238b);
        this.f23100l.mo33509a(new LoadStateView.AbstractC8574f() {
            /* class com.bytedance.ee.bear.list.recent.$$Lambda$i$7ZLxUvSY0zmh4nXTY0RuY9RpZk */

            @Override // com.bytedance.ee.bear.list.loadstateview.LoadStateView.AbstractC8574f
            public final void onTouchEvent() {
                C8687i.this.m36338F();
            }
        });
        this.f23100l.mo33508a(new LoadStateView.AbstractC8570b() {
            /* class com.bytedance.ee.bear.list.recent.C8687i.C86892 */

            @Override // com.bytedance.ee.bear.list.loadstateview.LoadStateView.AbstractC8570b
            /* renamed from: b */
            public void mo32736b() {
            }

            @Override // com.bytedance.ee.bear.list.loadstateview.LoadStateView.AbstractC8570b
            /* renamed from: c */
            public void mo32737c() {
            }

            @Override // com.bytedance.ee.bear.list.loadstateview.LoadStateView.AbstractC8570b
            /* renamed from: a */
            public void mo32735a() {
                if (C8687i.this.f23501a != null) {
                    C8687i.this.f23501a.mo33709b();
                }
            }
        });
    }

    /* renamed from: e */
    private void m36343e() {
        String str;
        C13479a.m54764b("RecentDocumentView", "notifyFirstContentDraw()...");
        C8143b.m32605a().mo31468b("fill_ui");
        C8143b.m32605a().mo31460a(0, "");
        if (this.f23105q == 2) {
            str = "main";
        } else {
            str = "space";
        }
        ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31520d().mo33057c(str);
        C8664a.m36217a();
        this.f23504v = true;
        this.f23503u.setFirstPageViewListener(null);
        mo33331b(C13657b.m55424c(mo33351w()));
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8544i, com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: C */
    public void mo33324C() {
        if (!C13726a.m55676b(this.f23092d.getActivity())) {
            C13479a.m54775e(mo32615g(), "showRefreshTipsToast() activity is not active");
            return;
        }
        if (this.f23502t == null) {
            this.f23502t = new C8566e(this.f23090b);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.bottomMargin = C57582a.m223600a(60);
            layoutParams.gravity = 81;
            ((ViewGroup) this.f23092d.getActivity().findViewById(R.id.list_home_drive_root)).addView(this.f23502t, layoutParams);
            this.f23502t.setOnClickListener(new View.OnClickListener() {
                /* class com.bytedance.ee.bear.list.recent.$$Lambda$i$0cs9MYvijZqQKBEegHiOm5b9U40 */

                public final void onClick(View view) {
                    C8687i.this.m36341a((C8687i) view);
                }
            });
        }
        this.f23502t.mo33421a();
        C13748k.m55733a(this.f23506x, 5000);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: b */
    public C8634d.AbstractC8635a mo32609b(Document document) {
        return new C8633c(document, "home", mo32618m());
    }

    @Override // com.bytedance.ee.bear.list.list.BaseListView, com.scwang.smartrefresh.layout.p1236c.AbstractC27139c
    public void onRefresh(AbstractC27129h hVar) {
        super.onRefresh(hVar);
        AbstractC8690a aVar = this.f23501a;
        if (aVar != null) {
            aVar.mo33707a();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m36341a(View view) {
        C13479a.m54764b(mo32615g(), "showRefreshTipsToast() click refresh tips, start refresh...");
        this.f23502t.mo33422b();
        onRefresh(this.f23099k);
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8544i, com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: b */
    public void mo33333b(Throwable th) {
        super.mo33333b(th);
        C8566e eVar = this.f23502t;
        if (eVar != null) {
            eVar.mo33423c();
        }
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8544i, com.bytedance.ee.bear.list.list.BaseListView
    public void b_(boolean z) {
        super.b_(z);
        C13479a.m54764b("RecentDocumentView", "setUserVisibleHint()...isVisibleToUser = " + z);
        if (z) {
            m36345j();
            m36344h();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m36342a(LoadStateCategory loadStateCategory) {
        if ((LoadStateCategory.LOADED_FAIL.equals(loadStateCategory) || LoadStateCategory.LOADED_SUCCESS_EMPTY.equals(loadStateCategory)) && !this.f23504v) {
            m36343e();
        }
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8544i, com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: b */
    public void mo33334b(ArrayList<Document> arrayList) {
        C8143b.m32605a().mo31470c("fill_ui");
        super.mo33334b(arrayList);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: a */
    public void mo32733a(FolderSortStrategy folderSortStrategy) {
        super.mo32733a(folderSortStrategy);
        if (folderSortStrategy.mo31554d() != FilterType.ALL.getType()) {
            this.f23100l.mo33506a(EmptyCategory.f23239c);
        } else {
            this.f23100l.mo33506a(EmptyCategory.f23238b);
        }
    }

    @Override // com.bytedance.ee.bear.list.recent.AbstractC8680b
    /* renamed from: a */
    public void mo33706a(SmartRefreshLayout smartRefreshLayout) {
        this.f23099k = smartRefreshLayout;
        mo33352x();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: a */
    public C1374g.AbstractC1376a mo32602a(List<Document> list, List<Document> list2) {
        return new RecentDocumentItemDiffCallback(list, list2);
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8544i, com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: a */
    public void mo32732a(int i, boolean z) {
        super.mo32732a(i, z);
        this.f23100l.mo33504a(i + this.f23102n.mo33378c());
        C8566e eVar = this.f23502t;
        if (eVar != null) {
            eVar.mo33423c();
        }
    }

    @Override // com.bytedance.ee.bear.list.list.BaseListView, com.bytedance.ee.bear.list.list.AbstractC8538g.AbstractC8540b
    /* renamed from: b */
    public void mo32610b(View view, int i, Document document, boolean z) {
        String str;
        super.mo32610b(view, i, document, z);
        String m = mo32618m();
        String m2 = mo32618m();
        String o = document.mo32472o();
        int t = document.mo32483t();
        String C = document.mo32377C();
        Boolean valueOf = Boolean.valueOf(mo33350v());
        if (mo33350v()) {
            str = "middle";
        } else {
            str = "suspend_create";
        }
        ListAnalysis.m32520a("home", m, "delete", "ccm_space_delete_view", m2, o, t, C, valueOf, str);
    }

    @Override // com.bytedance.ee.bear.list.list.BaseListView, com.bytedance.ee.bear.list.list.AbstractC8538g.AbstractC8540b
    /* renamed from: a */
    public void mo32606a(View view, int i, Document document, boolean z) {
        String str;
        super.mo32606a(view, i, document, z);
        String m = mo32618m();
        String m2 = mo32618m();
        String o = document.mo32472o();
        int t = document.mo32483t();
        String C = document.mo32377C();
        Boolean valueOf = Boolean.valueOf(mo33350v());
        if (mo33350v()) {
            str = "middle";
        } else {
            str = "suspend_create";
        }
        ListAnalysis.m32520a("home", m, "more", "ccm_space_right_click_menu_view", m2, o, t, C, valueOf, str);
    }

    C8687i(Context context, View view, C7718l lVar, C10917c cVar, AbstractC8690a aVar) {
        super(context, view, lVar, cVar);
        this.f23501a = aVar;
    }

    @Override // com.bytedance.ee.bear.widgets.BaseRecyclerView.AbstractC11798a, com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: a */
    public void mo32605a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        super.mo32605a(i, i2, iArr, iArr2, i3);
        AbstractC8690a aVar = this.f23501a;
        if (aVar != null) {
            aVar.mo33708a(i, i2);
        }
    }
}
