package com.bytedance.ee.bear.sheet.tab.view;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.C1363f;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.sheet.tab.contract.ISheetTabAdapter;
import com.bytedance.ee.bear.sheet.tab.contract.ISheetTabView;
import com.bytedance.ee.bear.sheet.tab.jsdata.SheetTabItem;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.chad.library.adapter.base.p936c.AbstractC20924a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.sheet.tab.view.e */
public class C11320e implements ISheetTabView, AbstractC20924a {

    /* renamed from: a */
    public ISheetTabView.Delegate f30441a;

    /* renamed from: b */
    private C11313a f30442b;

    /* renamed from: c */
    private View f30443c;

    /* renamed from: d */
    private View f30444d;

    /* renamed from: e */
    private View f30445e;

    /* renamed from: f */
    private RecyclerView f30446f;

    /* renamed from: g */
    private int f30447g;

    /* renamed from: h */
    private C11318c f30448h;

    @Override // com.chad.library.adapter.base.p936c.AbstractC20924a
    /* renamed from: a */
    public void mo32608a(RecyclerView.ViewHolder viewHolder, int i, RecyclerView.ViewHolder viewHolder2, int i2) {
    }

    /* access modifiers changed from: public */
    /* renamed from: e */
    private /* synthetic */ void m47046e() {
        this.f30442b.notifyDataSetChanged();
    }

    /* access modifiers changed from: public */
    /* renamed from: f */
    private /* synthetic */ void m47047f() {
        this.f30442b.notifyDataSetChanged();
    }

    /* access modifiers changed from: public */
    /* renamed from: g */
    private /* synthetic */ void m47048g() {
        this.f30442b.notifyDataSetChanged();
    }

    /* access modifiers changed from: public */
    /* renamed from: h */
    private /* synthetic */ void m47049h() {
        this.f30442b.notifyDataSetChanged();
    }

    @Override // com.bytedance.ee.bear.sheet.tab.contract.ISheetTabView
    /* renamed from: b */
    public void mo43336b() {
        View view = this.f30443c;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* renamed from: c */
    private void m47044c() {
        View findViewById = this.f30443c.findViewById(R.id.fl_add_sheets);
        this.f30444d = findViewById;
        findViewById.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.sheet.tab.view.C11320e.C113211 */

            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (C11320e.this.f30441a != null) {
                    C11320e.this.f30441a.mo43314a();
                }
            }
        });
    }

    /* renamed from: d */
    private void m47045d() {
        View findViewById = this.f30443c.findViewById(R.id.exit_landscape_btn);
        this.f30445e = findViewById;
        findViewById.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.sheet.tab.view.C11320e.C113222 */

            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (C11320e.this.f30441a != null) {
                    C11320e.this.f30441a.mo43318b();
                }
            }
        });
    }

    @Override // com.bytedance.ee.bear.sheet.tab.contract.ISheetTabView
    /* renamed from: a */
    public void mo43331a() {
        View view = this.f30443c;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    @Override // com.bytedance.ee.bear.sheet.tab.contract.ISheetTabView
    /* renamed from: a */
    public void mo43333a(ISheetTabView.Delegate aVar) {
        this.f30441a = aVar;
        this.f30442b.mo43416a((ISheetTabAdapter.OnSheetTabItemActionListener) aVar);
    }

    /* renamed from: a */
    private void m47041a(Context context) {
        m47043b(context);
        m47044c();
        m47045d();
    }

    /* renamed from: a */
    private void m47042a(List<SheetTabItem> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).getSelected()) {
                this.f30446f.smoothScrollToPosition(i);
                return;
            }
        }
    }

    @Override // com.bytedance.ee.bear.sheet.tab.contract.ISheetTabView
    /* renamed from: b */
    public void mo43337b(boolean z) {
        int i;
        View view = this.f30444d;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
            this.f30443c.post(new Runnable() {
                /* class com.bytedance.ee.bear.sheet.tab.view.$$Lambda$e$Eun_N_70oxy1P8PelZDjOIALOkg */

                public final void run() {
                    C11320e.lambda$Eun_N_70oxy1P8PelZDjOIALOkg(C11320e.this);
                }
            });
        }
    }

    @Override // com.bytedance.ee.bear.sheet.tab.contract.ISheetTabView
    /* renamed from: c */
    public void mo43338c(boolean z) {
        C11313a aVar = this.f30442b;
        if (aVar != null) {
            aVar.mo43419a(z);
            this.f30443c.post(new Runnable() {
                /* class com.bytedance.ee.bear.sheet.tab.view.$$Lambda$e$Bm3mk_WKziEppbZEf29ZQ6plU3E */

                public final void run() {
                    C11320e.lambda$Bm3mk_WKziEppbZEf29ZQ6plU3E(C11320e.this);
                }
            });
        }
    }

    @Override // com.bytedance.ee.bear.sheet.tab.contract.ISheetTabView
    /* renamed from: d */
    public void mo43339d(boolean z) {
        int i;
        View view = this.f30445e;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
            this.f30445e.post(new Runnable() {
                /* class com.bytedance.ee.bear.sheet.tab.view.$$Lambda$e$ESdmhjrgUbMtGZZ6Ck3IThaqXj0 */

                public final void run() {
                    C11320e.lambda$ESdmhjrgUbMtGZZ6Ck3IThaqXj0(C11320e.this);
                }
            });
        }
    }

    /* renamed from: b */
    private void m47043b(Context context) {
        RecyclerView recyclerView = (RecyclerView) this.f30443c.findViewById(R.id.rv_sheet_tab);
        this.f30446f = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        this.f30446f.addItemDecoration(new C11317b(context));
        C1363f fVar = new C1363f();
        fVar.setChangeDuration(0);
        this.f30446f.setItemAnimator(fVar);
        C11313a aVar = new C11313a();
        this.f30442b = aVar;
        aVar.mo43416a((ISheetTabAdapter.OnSheetTabItemActionListener) this.f30441a);
        this.f30446f.setAdapter(this.f30442b);
        C11318c cVar = new C11318c(this.f30442b);
        this.f30448h = cVar;
        cVar.mo70730a(12);
        this.f30448h.mo70731c(BitmapDescriptorFactory.HUE_RED);
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(this.f30448h);
        itemTouchHelper.attachToRecyclerView(this.f30446f);
        this.f30442b.mo70714a(itemTouchHelper, 0, false);
        this.f30442b.mo70716a((AbstractC20924a) this);
    }

    @Override // com.bytedance.ee.bear.sheet.tab.contract.ISheetTabView
    /* renamed from: a */
    public void mo43332a(View view) {
        this.f30443c = view;
        m47041a(view.getContext());
    }

    @Override // com.bytedance.ee.bear.sheet.tab.contract.ISheetTabView
    /* renamed from: a */
    public void mo43334a(ArrayList<SheetTabItem> arrayList) {
        C11313a aVar = this.f30442b;
        if (aVar != null) {
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            aVar.mo43418a(arrayList);
            m47042a(this.f30442b.mo70673b());
        }
    }

    @Override // com.bytedance.ee.bear.sheet.tab.contract.ISheetTabView
    /* renamed from: a */
    public void mo43335a(boolean z) {
        this.f30448h.mo43432a(z);
        this.f30443c.post(new Runnable() {
            /* class com.bytedance.ee.bear.sheet.tab.view.$$Lambda$e$bJdzZRlCh6ewxB7nx_br0aSW0 */

            public final void run() {
                C11320e.m269961lambda$bJdzZRlCh6ewxB7nx_br0aSW0(C11320e.this);
            }
        });
    }

    @Override // com.chad.library.adapter.base.p936c.AbstractC20924a
    /* renamed from: b */
    public void mo32611b(RecyclerView.ViewHolder viewHolder, int i) {
        ISheetTabView.Delegate aVar = this.f30441a;
        boolean z = false;
        if (aVar != null) {
            aVar.mo43317a(false);
        }
        if (i < 0 || i >= this.f30442b.mo70673b().size()) {
            z = true;
        }
        if (z) {
            i = -1;
        }
        if (this.f30447g != -1 && i != -1) {
            SheetTabItem sheetTabItem = (SheetTabItem) this.f30442b.mo70685d(i);
            ISheetTabView.Delegate aVar2 = this.f30441a;
            if (aVar2 != null && sheetTabItem != null) {
                aVar2.mo43315a(this.f30447g, sheetTabItem, i);
            }
        }
    }

    @Override // com.chad.library.adapter.base.p936c.AbstractC20924a
    /* renamed from: a */
    public void mo32607a(RecyclerView.ViewHolder viewHolder, int i) {
        ISheetTabView.Delegate aVar = this.f30441a;
        boolean z = true;
        if (aVar != null) {
            aVar.mo43317a(true);
        }
        if (i >= 0 && i < this.f30442b.mo70673b().size()) {
            z = false;
        }
        if (z) {
            i = -1;
        }
        this.f30447g = i;
    }
}
