package com.bytedance.ee.bear.list.manualoffline;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import androidx.recyclerview.widget.C1374g;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.facade.common.C7718l;
import com.bytedance.ee.bear.list.analysis.ListAnalysis;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.list.list.AbstractC8538g;
import com.bytedance.ee.bear.list.list.AbstractC8544i;
import com.bytedance.ee.bear.list.list.BaseListView;
import com.bytedance.ee.bear.list.list.C8534e;
import com.bytedance.ee.bear.list.loadstateview.C8594b;
import com.bytedance.ee.bear.list.loadstateview.EmptyCategory;
import com.bytedance.ee.bear.list.loadstateview.LoadStateView;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27129h;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.list.manualoffline.f */
public class C8607f extends BaseListView<AbstractC8544i.AbstractC8545a> implements AbstractC8601b {

    /* renamed from: a */
    protected boolean f23357a = true;

    /* renamed from: t */
    private final AbstractC8608a f23358t;

    /* renamed from: com.bytedance.ee.bear.list.manualoffline.f$a */
    interface AbstractC8608a {
        /* renamed from: a */
        void mo33536a();

        /* renamed from: a */
        void mo33537a(int i, int i2);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: f */
    public String mo32614f() {
        return "manual_offline";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: g */
    public String mo32615g() {
        return "ManualOfflineDocumentView";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: m */
    public String mo32618m() {
        return "offline";
    }

    @Override // com.bytedance.ee.bear.list.list.BaseListView, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        if (this.f23357a) {
            mo32604a();
        }
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8544i, com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: y */
    public void mo33353y() {
        super.mo33353y();
        ListAnalysis.m32529b("ccm_space_offline_page_view", mo32618m(), "", "");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo32604a() {
        ListAnalysis.m32504a(C5234y.m21391b(), mo32618m(), (String) null, "home", (String) null);
        ListAnalysis.m32526b(C5234y.m21391b(), mo32618m());
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: l */
    public void mo32617l() {
        this.f23100l = new C8594b((LoadStateView) this.f23091c.findViewById(R.id.list_state_view_root), Looper.getMainLooper());
        this.f23100l.mo33511a(false, EmptyCategory.f23245i);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: i */
    public AbstractC8538g mo32616i() {
        AbstractC8538g gVar;
        this.f23102n = null;
        if (this.f23095g) {
            gVar = new C8534e(this.f23094f, mo32618m(), this.f23104p);
        } else {
            gVar = new C8602c(this.f23094f, mo32618m(), this.f23104p, this.f23101m);
        }
        mo33329a(gVar);
        mo33332b(gVar);
        return gVar;
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8544i, com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: b */
    public void mo33334b(ArrayList<Document> arrayList) {
        int i;
        super.mo33334b(arrayList);
        if (arrayList == null) {
            i = 0;
        } else {
            i = arrayList.size();
        }
        mo32732a(i, false);
    }

    @Override // com.bytedance.ee.bear.list.list.BaseListView, com.scwang.smartrefresh.layout.p1236c.AbstractC27139c
    public void onRefresh(AbstractC27129h hVar) {
        super.onRefresh(hVar);
        AbstractC8608a aVar = this.f23358t;
        if (aVar != null) {
            aVar.mo33536a();
        }
    }

    @Override // com.bytedance.ee.bear.list.manualoffline.AbstractC8601b
    /* renamed from: a */
    public void mo33545a(SmartRefreshLayout smartRefreshLayout) {
        String g = mo32615g();
        C13479a.m54764b(g, "setRefreshLayout()...refreshLayout = " + smartRefreshLayout);
        this.f23099k = smartRefreshLayout;
        mo33352x();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: a */
    public C1374g.AbstractC1376a mo32602a(List<Document> list, List<Document> list2) {
        return new ManualOfflineItemDiffCallback(list, list2);
    }

    @Override // com.bytedance.ee.bear.list.list.BaseListView, com.bytedance.ee.bear.list.list.AbstractC8538g.AbstractC8540b
    /* renamed from: a */
    public void mo32606a(View view, int i, Document document, boolean z) {
        boolean z2;
        super.mo32606a(view, i, document, z);
        String m = mo32618m();
        String o = document.mo32472o();
        int t = document.mo32483t();
        String C = document.mo32377C();
        if (document.mo32483t() == C8275a.f22370c.mo32555b()) {
            z2 = true;
        } else {
            z2 = false;
        }
        ListAnalysis.m32523a("ccm_space_offline_page_click", m, "", "more", "ccm_space_right_click_menu_view", "", o, t, C, "", z2, FolderVersion.isShareFolder(document.an(), document.ap()), false, 0, Boolean.valueOf(mo33350v()), "suspend_create");
    }

    @Override // com.bytedance.ee.bear.list.list.BaseListView, com.bytedance.ee.bear.list.list.AbstractC8538g.AbstractC8540b
    /* renamed from: b */
    public void mo32610b(View view, int i, Document document, boolean z) {
        boolean z2;
        super.mo32610b(view, i, document, z);
        String m = mo32618m();
        String o = document.mo32472o();
        int t = document.mo32483t();
        String C = document.mo32377C();
        if (document.mo32483t() == C8275a.f22370c.mo32555b()) {
            z2 = true;
        } else {
            z2 = false;
        }
        ListAnalysis.m32523a("ccm_space_offline_page_click", m, "", "delete", "ccm_space_delete_view", "", o, t, C, "", z2, FolderVersion.isShareFolder(document.an(), document.ap()), false, 0, Boolean.valueOf(mo33350v()), "suspend_create");
    }

    public C8607f(Context context, View view, C7718l lVar, C10917c cVar, AbstractC8608a aVar) {
        super(context, view, lVar, cVar);
        this.f23358t = aVar;
    }

    @Override // com.bytedance.ee.bear.widgets.BaseRecyclerView.AbstractC11798a, com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: a */
    public void mo32605a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        super.mo32605a(i, i2, iArr, iArr2, i3);
        AbstractC8608a aVar = this.f23358t;
        if (aVar != null) {
            aVar.mo33537a(i, i2);
        }
    }
}
