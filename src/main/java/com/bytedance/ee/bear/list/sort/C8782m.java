package com.bytedance.ee.bear.list.sort;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.list.analysis.ListAnalysis;
import com.bytedance.ee.bear.list.cache.FolderSortStrategy;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.sort.AbstractC8765g;
import com.bytedance.ee.bear.list.sort.C8760e;
import com.bytedance.ee.bear.list.sort.C8792s;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.C13655e;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.list.sort.m */
public class C8782m implements AbstractC8765g.AbstractC8767b {

    /* renamed from: a */
    public final boolean f23659a;

    /* renamed from: b */
    public final boolean f23660b;

    /* renamed from: c */
    public final int f23661c;

    /* renamed from: d */
    public final int f23662d;

    /* renamed from: e */
    public C8760e f23663e;

    /* renamed from: f */
    public C8792s f23664f;

    /* renamed from: g */
    public AbstractC8765g.AbstractC8767b.AbstractC8768a f23665g;

    /* renamed from: h */
    private final View f23666h;

    /* renamed from: i */
    private final Context f23667i;

    /* renamed from: j */
    private final C10917c f23668j;

    /* renamed from: k */
    private final boolean f23669k;

    /* renamed from: l */
    private final boolean f23670l;

    /* renamed from: m */
    private final String f23671m;

    /* renamed from: n */
    private final String f23672n;

    /* renamed from: o */
    private final String f23673o;

    /* renamed from: p */
    private final String f23674p;

    /* renamed from: q */
    private final int f23675q;

    /* renamed from: r */
    private TextView f23676r;

    /* renamed from: s */
    private FolderSortStrategy f23677s;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m36837c();
    }

    /* renamed from: d */
    private boolean m36838d() {
        if (this.f23659a && this.f23663e.mo33812c() != this.f23661c) {
            return true;
        }
        if (!this.f23660b) {
            return false;
        }
        if (this.f23664f.mo33859c() != this.f23662d || this.f23664f.mo33858b().mo33846c()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void mo33833b() {
        this.f23676r.setBackgroundResource(R.drawable.list_edit_filter_reset_bg);
        if (m36838d()) {
            this.f23676r.setTextColor(this.f23667i.getResources().getColor(R.color.text_title));
            this.f23676r.setEnabled(true);
            return;
        }
        this.f23676r.setTextColor(this.f23667i.getResources().getColor(R.color.text_disable));
        this.f23676r.setEnabled(false);
    }

    /* renamed from: a */
    public FolderSortStrategy mo33830a() {
        boolean z;
        int i;
        String str;
        FilterType filterType;
        int b = C8275a.f22369b.mo32555b();
        FolderSortStrategy folderSortStrategy = this.f23677s;
        String str2 = "";
        if (folderSortStrategy != null) {
            b = folderSortStrategy.mo31554d();
            str2 = this.f23677s.mo31560f();
            str = this.f23677s.mo31561g();
            i = this.f23677s.mo31549b();
            z = this.f23677s.mo31558e();
        } else {
            i = -1;
            z = false;
            str = str2;
        }
        SortType rVar = null;
        if (this.f23659a) {
            filterType = this.f23663e.mo33811b();
        } else {
            filterType = null;
        }
        if (this.f23660b) {
            rVar = this.f23664f.mo33858b();
        }
        if (filterType != null) {
            b = filterType.getType();
            str2 = filterType.getFileType();
            str = filterType.getForbiddenFileType();
        }
        if (rVar != null) {
            i = rVar.mo33845b();
            z = rVar.mo33846c();
        }
        return new FolderSortStrategy(this.f23674p, b, str2, str, i, z);
    }

    /* renamed from: c */
    private void m36837c() {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        RecyclerView recyclerView = (RecyclerView) this.f23666h.findViewById(R.id.rv_filter_type);
        C8760e eVar = new C8760e();
        this.f23663e = eVar;
        eVar.mo33807a(this.f23661c);
        m36836a(recyclerView, this.f23663e);
        this.f23663e.mo33808a(new C8760e.AbstractC8762a() {
            /* class com.bytedance.ee.bear.list.sort.$$Lambda$m$rx_gvLkiCVK2ntmmI9tLFJMSPc */

            @Override // com.bytedance.ee.bear.list.sort.C8760e.AbstractC8762a
            public final void onItemClick(int i, FilterType filterType) {
                C8782m.m269779lambda$rx_gvLkiCVK2ntmmI9tLFJMSPc(C8782m.this, i, filterType);
            }
        });
        RecyclerView recyclerView2 = (RecyclerView) this.f23666h.findViewById(R.id.rv_sort_strategy);
        C8792s sVar = new C8792s();
        this.f23664f = sVar;
        sVar.mo33853a(this.f23662d);
        this.f23664f.mo33857a(this.f23669k);
        m36836a(recyclerView2, this.f23664f);
        this.f23664f.mo33854a(new C8792s.AbstractC8794a() {
            /* class com.bytedance.ee.bear.list.sort.$$Lambda$m$QCLSQ2iZPaMaRBLhfGEXpT5Sdg */

            @Override // com.bytedance.ee.bear.list.sort.C8792s.AbstractC8794a
            public final void onItemClick(int i, SortType rVar) {
                C8782m.m269778lambda$QCLSQ2iZPaMaRBLhfGEXpT5Sdg(C8782m.this, i, rVar);
            }
        });
        int i6 = 0;
        if (!this.f23659a || !this.f23660b) {
            z = false;
        } else {
            z = true;
        }
        TextView textView = (TextView) this.f23666h.findViewById(R.id.tv_type_title);
        TextView textView2 = (TextView) this.f23666h.findViewById(R.id.tv_sort_title);
        int i7 = 8;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        if (this.f23659a) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        recyclerView.setVisibility(i2);
        if (z) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        textView2.setVisibility(i3);
        if (this.f23660b) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        recyclerView2.setVisibility(i4);
        int i8 = this.f23675q;
        if (i8 != 0) {
            textView2.setText(i8);
        }
        TextView textView3 = (TextView) this.f23666h.findViewById(R.id.tv_reset);
        this.f23676r = textView3;
        textView3.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.list.sort.C8782m.C87831 */

            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                C13479a.m54764b("SortAndFilterView", "onClick reset()...");
                if (C8782m.this.f23659a) {
                    C8782m.this.f23663e.mo33807a(C8782m.this.f23661c);
                }
                if (C8782m.this.f23660b) {
                    C8782m.this.f23664f.mo33852a().get(C8782m.this.f23662d).mo33844a(false);
                    C8782m.this.f23664f.mo33853a(C8782m.this.f23662d);
                }
                C8782m.this.mo33833b();
                if (C8782m.this.f23665g != null) {
                    C8782m.this.f23665g.mo33817b(C8782m.this.mo33830a());
                }
                C8782m.this.mo33832a("reset");
                C8782m.this.mo33834b("reset");
            }
        });
        TextView textView4 = (TextView) this.f23666h.findViewById(R.id.tv_done);
        textView4.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.list.sort.C8782m.C87842 */

            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                C13479a.m54764b("SortAndFilterView", "onClick done()...");
                if (C8782m.this.f23665g != null) {
                    C8782m.this.f23665g.mo33816a(C8782m.this.mo33830a());
                }
                C8782m.this.mo33832a("done");
                C8782m.this.mo33834b("confirm");
            }
        });
        ((CommonActionPanelLayout) this.f23666h.findViewById(R.id.title_panel)).setOnActionListener(new CommonActionPanelLayout.SimpleActionListener() {
            /* class com.bytedance.ee.bear.list.sort.C8782m.C87853 */

            @Override // com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout.OnActionListener, com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout.SimpleActionListener
            /* renamed from: d */
            public void mo18838d() {
                super.mo18838d();
                C13479a.m54764b("SortAndFilterView", "onClick close()...");
                if (C8782m.this.f23665g != null) {
                    C8782m.this.f23665g.mo33815a();
                }
            }
        });
        TextView textView5 = this.f23676r;
        if (this.f23670l) {
            i7 = 0;
        }
        textView5.setVisibility(i7);
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) textView4.getLayoutParams();
        if (this.f23670l) {
            i5 = C13655e.m55410a(13.0f);
        } else {
            i5 = 0;
        }
        layoutParams.leftMargin = i5;
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) textView4.getLayoutParams();
        if (this.f23670l) {
            i6 = C13655e.m55410a(19.0f);
        }
        layoutParams2.topMargin = i6;
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC8765g.AbstractC8767b.AbstractC8768a aVar) {
        this.f23665g = aVar;
    }

    /* renamed from: b */
    public void mo33834b(String str) {
        FilterType filterType;
        String str2;
        SortType rVar = null;
        if (this.f23659a) {
            filterType = this.f23663e.mo33811b();
        } else {
            filterType = null;
        }
        if (this.f23660b) {
            rVar = this.f23664f.mo33858b();
        }
        String str3 = "";
        if (filterType != null) {
            str2 = filterType.getReportType();
        } else {
            str2 = str3;
        }
        if (rVar != null) {
            str3 = rVar.mo33847d();
            if (this.f23669k) {
                if (rVar.mo33846c()) {
                    str3 = str3 + "_up";
                } else {
                    str3 = str3 + "_down";
                }
            }
        }
        ListAnalysis.m32519a(str, this.f23671m, this.f23672n, this.f23673o, str2, str3);
    }

    @Override // com.bytedance.ee.bear.list.sort.AbstractC8765g.AbstractC8767b
    /* renamed from: a */
    public void mo33813a(FolderSortStrategy folderSortStrategy) {
        this.f23677s = folderSortStrategy;
        if (this.f23659a) {
            for (int i = 0; i < this.f23663e.mo33806a().size(); i++) {
                if (this.f23663e.mo33806a().get(i).isSame(folderSortStrategy.mo31554d(), folderSortStrategy.mo31560f(), folderSortStrategy.mo31561g())) {
                    this.f23663e.mo33807a(i);
                }
            }
        }
        if (this.f23660b) {
            for (int i2 = 0; i2 < this.f23664f.mo33852a().size(); i2++) {
                SortType rVar = this.f23664f.mo33852a().get(i2);
                if (rVar.mo33845b() == folderSortStrategy.mo31549b()) {
                    rVar.mo33844a(folderSortStrategy.mo31558e());
                    this.f23664f.mo33853a(i2);
                }
            }
        }
        mo33833b();
        C13479a.m54764b("SortAndFilterView", "show()...sortStrategy = " + folderSortStrategy.toString());
    }

    /* renamed from: a */
    public void mo33832a(String str) {
        FilterType filterType;
        String str2;
        SortType rVar = null;
        if (this.f23659a) {
            filterType = this.f23663e.mo33811b();
        } else {
            filterType = null;
        }
        if (this.f23660b) {
            rVar = this.f23664f.mo33858b();
        }
        String str3 = "";
        if (filterType != null) {
            str2 = filterType.getReportType();
        } else {
            str2 = str3;
        }
        if (rVar != null) {
            str3 = rVar.mo33847d();
        }
        HashMap hashMap = new HashMap();
        hashMap.put(ShareHitPoint.f121868c, "filter_board");
        hashMap.put("module", this.f23671m);
        hashMap.put("action", str);
        hashMap.put("filter_action", str2);
        hashMap.put("sort_action", str3);
        C5234y.m21391b().mo21079a("client_content_management", hashMap);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m36834a(int i, FilterType filterType) {
        mo33833b();
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m36835a(int i, SortType rVar) {
        mo33833b();
    }

    /* renamed from: a */
    private void m36836a(RecyclerView recyclerView, RecyclerView.Adapter adapter) {
        recyclerView.setLayoutManager(new GridLayoutManager(this.f23667i, 2, 1, false));
        recyclerView.addItemDecoration(new C8759d());
        recyclerView.setAdapter(adapter);
    }

    @Override // com.bytedance.ee.bear.list.sort.AbstractC8765g.AbstractC8767b
    /* renamed from: a */
    public void mo33814a(List<FilterType> list, List<SortType> list2) {
        if (this.f23659a) {
            this.f23663e.mo33810a(list);
        }
        if (this.f23660b) {
            this.f23664f.mo33856a(list2);
        }
    }

    C8782m(View view, Context context, C10917c cVar, boolean z, boolean z2, boolean z3, boolean z4, int i, int i2, String str, String str2, String str3, String str4, int i3) {
        this.f23666h = view;
        this.f23667i = context;
        this.f23668j = cVar;
        this.f23659a = z;
        this.f23660b = z2;
        this.f23669k = z3;
        this.f23670l = z4;
        this.f23661c = i;
        this.f23662d = i2;
        this.f23671m = str;
        this.f23672n = str2;
        this.f23673o = str3;
        this.f23674p = str4;
        this.f23675q = i3;
    }
}
