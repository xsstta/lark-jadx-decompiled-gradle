package com.bytedance.ee.bear.list.share;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import androidx.recyclerview.widget.C1374g;
import com.bytedance.ee.bear.basesdk.services.C4511g;
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
import com.bytedance.ee.bear.list.more.itemv2.C8633c;
import com.bytedance.ee.bear.list.more.itemv2.C8634d;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27129h;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.list.share.w */
public class C8750w extends BaseListView<AbstractC8544i.AbstractC8545a> implements AbstractC8739n {

    /* renamed from: a */
    private final AbstractC8751a f23607a;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.list.share.w$a */
    public interface AbstractC8751a {
        /* renamed from: a */
        void mo33748a();

        /* renamed from: a */
        void mo33749a(int i, int i2);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: A */
    public String mo33322A() {
        return "shared";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: f */
    public String mo32614f() {
        return "shared_file";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: g */
    public String mo32615g() {
        return "ShareDocumentView";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: m */
    public String mo32618m() {
        return "sharetome";
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m36757e() {
        onRefresh(null);
    }

    @Override // com.bytedance.ee.bear.list.list.BaseListView, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m36756a();
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8544i, com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: y */
    public void mo33353y() {
        super.mo33353y();
        ListAnalysis.m32529b("ccm_space_shared_page_view", "shared", mo32618m(), "");
    }

    /* renamed from: a */
    private void m36756a() {
        boolean z;
        if (C4511g.m18594d().mo17344E() == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ListAnalysis.m32497a(C5234y.m21391b(), mo32618m());
        } else {
            ListAnalysis.m32504a(C5234y.m21391b(), mo32618m(), (String) null, "home", (String) null);
        }
        ListAnalysis.m32526b(C5234y.m21391b(), mo32618m());
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
            gVar = new C8746t(this.f23094f, mo32618m(), this.f23104p, this.f23101m);
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
        this.f23100l.mo33511a(false, EmptyCategory.f23242f);
        this.f23100l.mo33509a(new LoadStateView.AbstractC8574f() {
            /* class com.bytedance.ee.bear.list.share.$$Lambda$w$0FtSFyNjIkpy23YAXeNrzWqyIU */

            @Override // com.bytedance.ee.bear.list.loadstateview.LoadStateView.AbstractC8574f
            public final void onTouchEvent() {
                C8750w.this.m36757e();
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: b */
    public C8634d.AbstractC8635a mo32609b(Document document) {
        return new C8633c(document, "shared", "sharetome");
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8544i, com.bytedance.ee.bear.list.list.BaseListView
    public void b_(boolean z) {
        super.b_(z);
        if (z) {
            m36756a();
        }
    }

    @Override // com.bytedance.ee.bear.list.list.BaseListView, com.scwang.smartrefresh.layout.p1236c.AbstractC27139c
    public void onRefresh(AbstractC27129h hVar) {
        super.onRefresh(hVar);
        AbstractC8751a aVar = this.f23607a;
        if (aVar != null) {
            aVar.mo33748a();
        }
    }

    @Override // com.bytedance.ee.bear.list.share.AbstractC8739n
    /* renamed from: a */
    public void mo33781a(SmartRefreshLayout smartRefreshLayout) {
        String g = mo32615g();
        C13479a.m54764b(g, "setRefreshLayout()...refreshLayout = " + smartRefreshLayout);
        this.f23099k = smartRefreshLayout;
        mo33352x();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: a */
    public C1374g.AbstractC1376a mo32602a(List<Document> list, List<Document> list2) {
        return new ShareDocumentItemDiffCallback(list, list2);
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
        ListAnalysis.m32523a("ccm_space_shared_page_click", "shared", m, "more", "ccm_space_right_click_menu_view", "", o, t, C, "", z2, FolderVersion.isShareFolder(document.an(), document.ap()), false, 0, Boolean.valueOf(mo33350v()), "suspend_create");
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
        ListAnalysis.m32523a("ccm_space_shared_page_click", "shared", m, "delete", "ccm_space_delete_view", "", o, t, C, "", z2, FolderVersion.isShareFolder(document.an(), document.ap()), false, 0, Boolean.valueOf(mo33350v()), "suspend_create");
    }

    C8750w(Context context, View view, C7718l lVar, C10917c cVar, AbstractC8751a aVar) {
        super(context, view, lVar, cVar);
        this.f23607a = aVar;
    }

    @Override // com.bytedance.ee.bear.widgets.BaseRecyclerView.AbstractC11798a, com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: a */
    public void mo32605a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        super.mo32605a(i, i2, iArr, iArr2, i3);
        AbstractC8751a aVar = this.f23607a;
        if (aVar != null) {
            aVar.mo33749a(i, i2);
        }
    }
}
