package com.bytedance.ee.bear.list.sort;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.list.cache.FolderSortStrategy;
import com.bytedance.ee.bear.list.sort.AbstractC8769h;
import com.bytedance.ee.bear.list.sort.C8773i;
import com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.list.sort.t */
public class C8796t implements AbstractC8769h.AbstractC8771b {

    /* renamed from: a */
    public AbstractC8769h.AbstractC8771b.AbstractC8772a f23711a;

    /* renamed from: b */
    private final View f23712b;

    /* renamed from: c */
    private final Context f23713c;

    /* renamed from: d */
    private final int f23714d;

    /* renamed from: e */
    private final String f23715e;

    /* renamed from: f */
    private final boolean f23716f;

    /* renamed from: g */
    private FolderSortStrategy f23717g;

    /* renamed from: h */
    private C8773i f23718h;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m36877a();
    }

    /* renamed from: a */
    private void m36877a() {
        ((CommonActionPanelLayout) this.f23712b.findViewById(R.id.title_panel)).setOnActionListener(new CommonActionPanelLayout.SimpleActionListener() {
            /* class com.bytedance.ee.bear.list.sort.C8796t.C87971 */

            @Override // com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout.OnActionListener, com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout.SimpleActionListener
            /* renamed from: d */
            public void mo18838d() {
                super.mo18838d();
                C13479a.m54764b("SortView", "onClick close()...");
                if (C8796t.this.f23711a != null) {
                    C8796t.this.f23711a.mo33820a();
                }
            }
        });
        C8773i iVar = new C8773i(this.f23716f);
        this.f23718h = iVar;
        iVar.mo33824a(this.f23714d);
        m36879a((RecyclerView) this.f23712b.findViewById(R.id.rv_sort_strategy), this.f23718h);
        this.f23718h.mo33825a(new C8773i.AbstractC8775a() {
            /* class com.bytedance.ee.bear.list.sort.$$Lambda$t$FARjg6vnyqQEPFxUjTqwhPZJWM */

            @Override // com.bytedance.ee.bear.list.sort.C8773i.AbstractC8775a
            public final void onItemClick(int i, SortType rVar) {
                C8796t.this.m36878a((C8796t) i, (int) rVar);
            }
        });
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC8769h.AbstractC8771b.AbstractC8772a aVar) {
        this.f23711a = aVar;
    }

    @Override // com.bytedance.ee.bear.list.sort.AbstractC8769h.AbstractC8771b
    /* renamed from: a */
    public void mo33819a(List<SortType> list) {
        this.f23718h.mo33827a(list);
    }

    /* renamed from: a */
    private FolderSortStrategy m36876a(SortType rVar) {
        FolderSortStrategy folderSortStrategy = this.f23717g;
        if (folderSortStrategy == null) {
            return new FolderSortStrategy(this.f23715e, FilterType.ALL.getType(), FilterType.ALL.getFileType(), FilterType.ALL.getForbiddenFileType(), rVar.mo33845b(), rVar.mo33846c());
        }
        folderSortStrategy.mo31546a(rVar.mo33845b());
        this.f23717g.mo31548a(rVar.mo33846c());
        return this.f23717g;
    }

    @Override // com.bytedance.ee.bear.list.sort.AbstractC8769h.AbstractC8771b
    /* renamed from: a */
    public void mo33818a(FolderSortStrategy folderSortStrategy) {
        this.f23717g = new FolderSortStrategy(folderSortStrategy.mo31545a(), folderSortStrategy.mo31554d(), folderSortStrategy.mo31560f(), folderSortStrategy.mo31561g(), folderSortStrategy.mo31549b(), folderSortStrategy.mo31558e());
        for (int i = 0; i < this.f23718h.mo33823a().size(); i++) {
            SortType rVar = this.f23718h.mo33823a().get(i);
            if (rVar.mo33845b() == folderSortStrategy.mo31549b()) {
                rVar.mo33844a(folderSortStrategy.mo31558e());
                this.f23718h.mo33824a(i);
            }
        }
        C13479a.m54764b("SortView", "show()...sortStrategy = " + folderSortStrategy.toString());
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m36878a(int i, SortType rVar) {
        AbstractC8769h.AbstractC8771b.AbstractC8772a aVar = this.f23711a;
        if (aVar != null) {
            aVar.mo33821a(m36876a(rVar));
        }
    }

    /* renamed from: a */
    private void m36879a(RecyclerView recyclerView, RecyclerView.Adapter adapter) {
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f23713c, 1, false));
        recyclerView.addItemDecoration(new C8759d());
        recyclerView.setAdapter(adapter);
    }

    C8796t(View view, Context context, int i, String str, boolean z) {
        this.f23712b = view;
        this.f23713c = context;
        this.f23714d = i;
        this.f23715e = str;
        this.f23716f = z;
    }
}
