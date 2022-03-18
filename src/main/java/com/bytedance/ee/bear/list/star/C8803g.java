package com.bytedance.ee.bear.list.star;

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
import com.bytedance.ee.bear.list.list.BaseListView;
import com.bytedance.ee.bear.list.loadstateview.C8594b;
import com.bytedance.ee.bear.list.loadstateview.EmptyCategory;
import com.bytedance.ee.bear.list.loadstateview.LoadStateView;
import com.bytedance.ee.bear.list.more.itemv2.C8634d;
import com.bytedance.ee.bear.list.star.AbstractC8808k;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.list.star.g */
public class C8803g extends BaseListView<AbstractC8808k.AbstractC8809a> implements AbstractC8808k {

    /* renamed from: a */
    protected boolean f23727a = true;

    /* renamed from: t */
    private final AbstractC8804a f23728t;

    /* renamed from: com.bytedance.ee.bear.list.star.g$a */
    interface AbstractC8804a {
        /* renamed from: a */
        void mo33861a(int i, int i2);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: f */
    public String mo32614f() {
        return "star";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: g */
    public String mo32615g() {
        return "FavoriteView";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: m */
    public String mo32618m() {
        return "favorites";
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: e */
    private /* synthetic */ void m36911e() {
        onRefresh(null);
    }

    @Override // com.bytedance.ee.bear.list.list.BaseListView, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        if (this.f23727a) {
            mo32604a();
        }
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8544i, com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: y */
    public void mo33353y() {
        super.mo33353y();
        ListAnalysis.m32529b("ccm_space_favorites_page_view", mo32618m(), "", "");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo32604a() {
        ListAnalysis.m32504a(C5234y.m21391b(), mo32618m(), (String) null, "home", (String) null);
        ListAnalysis.m32526b(C5234y.m21391b(), mo32618m());
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: i */
    public AbstractC8538g mo32616i() {
        AbstractC8538g gVar;
        this.f23102n = null;
        if (this.f23095g) {
            gVar = new C8799b(this.f23094f, mo32618m(), this.f23104p);
        } else {
            gVar = new C8800d(this.f23094f, mo32618m(), this.f23104p, this.f23101m);
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
        this.f23100l.mo33511a(false, EmptyCategory.f23243g);
        this.f23100l.mo33509a(new LoadStateView.AbstractC8574f() {
            /* class com.bytedance.ee.bear.list.star.$$Lambda$g$nPoOf7WiNaFLBHUpF8ndmVU6xTQ */

            @Override // com.bytedance.ee.bear.list.loadstateview.LoadStateView.AbstractC8574f
            public final void onTouchEvent() {
                C8803g.this.m36911e();
            }
        });
    }

    @Override // com.bytedance.ee.bear.list.star.AbstractC8808k
    /* renamed from: a */
    public void mo33862a(SmartRefreshLayout smartRefreshLayout) {
        this.f23099k = smartRefreshLayout;
        mo33352x();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: a */
    public C1374g.AbstractC1376a mo32602a(List<Document> list, List<Document> list2) {
        return new FavoriteItemDiffCallback(list, list2);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: a */
    public C8634d.AbstractC8636b mo32603a(Document document, boolean z) {
        return new C8798a(this.f23092d.getActivity(), this.f23094f, document, this.f23103o, mo33322A(), mo32618m(), z, this.f23093e);
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
        ListAnalysis.m32523a("ccm_space_favorites_page_click", m, "", "more", "ccm_space_right_click_menu_view", "", o, t, C, "", z2, FolderVersion.isShareFolder(document.an(), document.ap()), false, 0, Boolean.valueOf(C13657b.m55421a(mo33351w())), "suspend_create");
    }

    @Override // com.bytedance.ee.bear.list.list.BaseListView, com.bytedance.ee.bear.list.list.AbstractC8538g.AbstractC8540b
    /* renamed from: b */
    public void mo32610b(View view, int i, Document document, boolean z) {
        String str;
        boolean z2;
        String g = mo32615g();
        C13479a.m54764b(g, "onRightSlideMenuClick()...position = " + i);
        ((AbstractC8808k.AbstractC8809a) this.f23093e).mo32659c(document);
        String m = mo32618m();
        if (document.mo32456j()) {
            str = "remove_from_favorites";
        } else {
            str = "add_to_favorites";
        }
        String o = document.mo32472o();
        int t = document.mo32483t();
        String C = document.mo32377C();
        if (document.mo32483t() == C8275a.f22370c.mo32555b()) {
            z2 = true;
        } else {
            z2 = false;
        }
        ListAnalysis.m32523a("ccm_space_favorites_page_click", m, "", str, "none", "", o, t, C, "", z2, FolderVersion.isShareFolder(document.an(), document.ap()), false, 0, Boolean.valueOf(mo33350v()), "suspend_create");
    }

    public C8803g(Context context, View view, C7718l lVar, C10917c cVar, AbstractC8804a aVar) {
        super(context, view, lVar, cVar);
        this.f23728t = aVar;
    }

    @Override // com.bytedance.ee.bear.widgets.BaseRecyclerView.AbstractC11798a, com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: a */
    public void mo32605a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        super.mo32605a(i, i2, iArr, iArr2, i3);
        AbstractC8804a aVar = this.f23728t;
        if (aVar != null) {
            aVar.mo33861a(i, i2);
        }
    }
}
