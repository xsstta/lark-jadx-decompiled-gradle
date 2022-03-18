package com.bytedance.ee.bear.list.p429f;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import androidx.recyclerview.widget.C1374g;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.facade.common.C7718l;
import com.bytedance.ee.bear.list.AbstractC8651p;
import com.bytedance.ee.bear.list.analysis.ListAnalysis;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.homepage.AbstractC8459a;
import com.bytedance.ee.bear.list.homepage.AbstractC8463b;
import com.bytedance.ee.bear.list.list.AbstractC8538g;
import com.bytedance.ee.bear.list.list.BaseListView;
import com.bytedance.ee.bear.list.list.C8534e;
import com.bytedance.ee.bear.list.loadstateview.C8594b;
import com.bytedance.ee.bear.list.loadstateview.EmptyCategory;
import com.bytedance.ee.bear.list.loadstateview.LoadStateView;
import com.bytedance.ee.bear.list.more.itemv2.C8633c;
import com.bytedance.ee.bear.list.more.itemv2.C8634d;
import com.bytedance.ee.bear.list.p429f.AbstractC8293a;
import com.bytedance.ee.bear.list.star.C8798a;
import com.bytedance.ee.bear.list.star.FavoriteItemDiffCallback;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.list.f.g */
public class C8303g extends BaseListView<AbstractC8293a.AbstractC8294a> implements AbstractC8293a, AbstractC8651p.AbstractC8657f {

    /* renamed from: a */
    private AnimatorSet f22437a = new AnimatorSet();

    /* renamed from: t */
    private ValueAnimator f22438t;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: f */
    public String mo32614f() {
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: g */
    public String mo32615g() {
        return "PinView";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: m */
    public String mo32618m() {
        return "quick_access";
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m34224j() {
        onRefresh(null);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: d */
    public void mo32613d() {
        super.mo32613d();
        m34222e();
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8651p.AbstractC8657f
    /* renamed from: a */
    public void mo32604a() {
        onRefresh(null);
    }

    /* renamed from: e */
    private void m34222e() {
        if (this.f23092d.getParentFragment() instanceof AbstractC8459a) {
            this.f23099k = ((AbstractC8459a) this.f23092d.getParentFragment()).mo30968g();
        }
        mo33352x();
    }

    /* renamed from: h */
    private void m34223h() {
        ListAnalysis.m32504a(C5234y.m21391b(), "home", mo32618m(), (String) null, (String) null);
        ListAnalysis.m32526b(C5234y.m21391b(), mo32618m());
    }

    @Override // com.bytedance.ee.bear.list.list.BaseListView, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        C13479a.m54764b("PinView", "destroy()...");
        AnimatorSet animatorSet = this.f22437a;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f22437a = null;
        }
        ValueAnimator valueAnimator = this.f22438t;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f22438t = null;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: i */
    public AbstractC8538g mo32616i() {
        AbstractC8538g gVar;
        C13479a.m54764b("PinView", "getAdapter()...");
        this.f23102n = null;
        if (this.f23095g) {
            gVar = new C8534e(this.f23094f, mo32618m(), this.f23104p);
        } else {
            gVar = new C8295b(this.f23094f, mo32618m(), this.f23104p, this.f23101m);
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
        this.f23100l.mo33511a(false, EmptyCategory.f23237a);
        this.f23100l.mo33509a(new LoadStateView.AbstractC8574f() {
            /* class com.bytedance.ee.bear.list.p429f.$$Lambda$g$StotpmmrwGRB_U8qpug9k2WoQ4o */

            @Override // com.bytedance.ee.bear.list.loadstateview.LoadStateView.AbstractC8574f
            public final void onTouchEvent() {
                C8303g.this.m34224j();
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: b */
    public C8634d.AbstractC8635a mo32609b(Document document) {
        return new C8633c(document, "home", mo32618m());
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8544i, com.bytedance.ee.bear.list.list.BaseListView
    public void b_(boolean z) {
        super.b_(z);
        C13479a.m54764b("PinView", "setUserVisibleHint()...isVisibleToUser = " + z);
        if (z) {
            m34222e();
            m34223h();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: a */
    public C1374g.AbstractC1376a mo32602a(List<Document> list, List<Document> list2) {
        return new FavoriteItemDiffCallback(list, list2);
    }

    @Override // com.chad.library.adapter.base.p936c.AbstractC20924a
    /* renamed from: b */
    public void mo32611b(RecyclerView.ViewHolder viewHolder, int i) {
        C13479a.m54764b("PinView", "onItemDragEnd()...");
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: a */
    public C8634d.AbstractC8636b mo32603a(Document document, boolean z) {
        return new C8798a(this.f23092d.getActivity(), this.f23094f, document, this.f23103o, mo33322A(), mo32618m(), z, this.f23093e);
    }

    @Override // com.chad.library.adapter.base.p936c.AbstractC20924a
    /* renamed from: a */
    public void mo32607a(RecyclerView.ViewHolder viewHolder, int i) {
        C13479a.m54764b("PinView", "onItemDragStart()...");
    }

    C8303g(Context context, View view, C7718l lVar, C10917c cVar) {
        super(context, view, lVar, cVar);
    }

    @Override // com.bytedance.ee.bear.list.list.BaseListView, com.bytedance.ee.bear.list.list.AbstractC8538g.AbstractC8540b
    /* renamed from: a */
    public void mo32606a(View view, int i, Document document, boolean z) {
        super.mo32606a(view, i, document, z);
        ListAnalysis.m32520a("home", mo32618m(), "more", "ccm_space_right_click_menu_view", mo32618m(), document.mo32472o(), document.mo32483t(), document.mo32377C(), Boolean.valueOf(mo33350v()), "suspend_create");
    }

    @Override // com.bytedance.ee.bear.list.list.BaseListView, com.bytedance.ee.bear.list.list.AbstractC8538g.AbstractC8540b
    /* renamed from: b */
    public void mo32610b(View view, int i, Document document, boolean z) {
        String str;
        String g = mo32615g();
        C13479a.m54764b(g, "onRightSlideMenuClick()...position = " + i);
        ((AbstractC8293a.AbstractC8294a) this.f23093e).mo32585b(document);
        String m = mo32618m();
        if (document.mo32404T()) {
            str = "remove_from_quickaccess";
        } else {
            str = "add_to_quickaccess";
        }
        ListAnalysis.m32520a("home", m, str, "none", mo32618m(), document.mo32472o(), document.mo32483t(), document.mo32377C(), Boolean.valueOf(mo33350v()), "suspend_create");
    }

    @Override // com.chad.library.adapter.base.p936c.AbstractC20924a
    /* renamed from: a */
    public void mo32608a(RecyclerView.ViewHolder viewHolder, int i, RecyclerView.ViewHolder viewHolder2, int i2) {
        C13479a.m54764b("PinView", "onItemDragMoving()...");
    }

    @Override // com.bytedance.ee.bear.widgets.BaseRecyclerView.AbstractC11798a, com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: a */
    public void mo32605a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        super.mo32605a(i, i2, iArr, iArr2, i3);
        if (this.f23092d.getParentFragment() instanceof AbstractC8463b) {
            ((AbstractC8463b) this.f23092d.getParentFragment()).mo30959a(i, i2);
        }
    }
}
