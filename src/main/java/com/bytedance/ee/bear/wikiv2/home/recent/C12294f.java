package com.bytedance.ee.bear.wikiv2.home.recent;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.facade.common.C7718l;
import com.bytedance.ee.bear.facade.common.widget.p382a.C7732b;
import com.bytedance.ee.bear.list.analysis.ListAnalysis;
import com.bytedance.ee.bear.list.list.AbstractC8538g;
import com.bytedance.ee.bear.list.list.AbstractC8544i;
import com.bytedance.ee.bear.list.list.BaseListView;
import com.bytedance.ee.bear.list.loadstateview.C8594b;
import com.bytedance.ee.bear.list.loadstateview.EmptyCategory;
import com.bytedance.ee.bear.list.loadstateview.LoadStateCategory;
import com.bytedance.ee.bear.list.loadstateview.LoadStateView;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.widgets.BaseRecyclerView;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27129h;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.wikiv2.home.recent.f */
public final class C12294f extends BaseListView<AbstractC8544i.AbstractC8545a> {

    /* renamed from: a */
    private final AbstractC12295a f33007a;

    /* renamed from: t */
    private ViewTreeObserver.OnPreDrawListener f33008t;

    /* renamed from: u */
    private boolean f33009u;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.recent.f$a */
    public interface AbstractC12295a {
        /* renamed from: a */
        void mo46879a();

        /* renamed from: a */
        void mo46880a(int i, int i2);
    }

    @Override // com.bytedance.ee.bear.list.list.BaseListView, com.bytedance.ee.bear.list.AbstractC8651p.AbstractC8660i
    /* renamed from: a */
    public void mo30963a(boolean z) {
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: f */
    public String mo32614f() {
        return "";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: g */
    public String mo32615g() {
        return "Wiki_RecentWikiListView";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: m */
    public String mo32618m() {
        return "wiki";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: n */
    public String mo32750n() {
        return "all_files_token";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: q */
    public boolean mo33345q() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: r */
    public String mo33346r() {
        return "wiki";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: s */
    public String mo33347s() {
        return "none";
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: h */
    private /* synthetic */ void m51230h() {
        onRefresh(null);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: d */
    public void mo32613d() {
        super.mo32613d();
        m51227a();
    }

    @Override // com.bytedance.ee.bear.list.common.header.DriveUploadView.AbstractC8225a, com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: b */
    public void mo32243b() {
        super.mo32243b();
        ListAnalysis.m32512a("none");
    }

    @Override // com.bytedance.ee.bear.list.list.BaseListView, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        this.f23098j.getViewTreeObserver().removeOnPreDrawListener(this.f33008t);
    }

    /* renamed from: a */
    private void m51227a() {
        this.f33008t = new ViewTreeObserver.OnPreDrawListener() {
            /* class com.bytedance.ee.bear.wikiv2.home.recent.$$Lambda$f$evlJDivp0kdeJHkB_LICWSCAtvg */

            public final boolean onPreDraw() {
                return C12294f.this.m51231j();
            }
        };
        this.f23098j.getViewTreeObserver().addOnPreDrawListener(this.f33008t);
        this.f23100l.mo33505a(this.f23092d, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.wikiv2.home.recent.$$Lambda$f$Epc5YYnc5slwget_VNzZqTWP6yA */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C12294f.this.m51228a((C12294f) ((LoadStateCategory) obj));
            }
        });
    }

    /* renamed from: e */
    private void m51229e() {
        ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31520d().mo33057c("wiki");
        this.f23098j.getViewTreeObserver().removeOnPreDrawListener(this.f33008t);
        this.f33009u = true;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: j */
    private /* synthetic */ boolean m51231j() {
        if (this.f33009u || this.f23098j.getChildCount() <= 0) {
            return true;
        }
        m51229e();
        return true;
    }

    @Override // com.bytedance.ee.bear.list.list.BaseListView, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        ListAnalysis.m32504a(C5234y.m21391b(), mo32618m(), (String) null, "home", (String) null);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: t */
    public void mo33348t() {
        super.mo33348t();
        BaseRecyclerView baseRecyclerView = this.f23098j;
        C7732b.m30927a(baseRecyclerView, "bear_wiki_list_" + mo32618m());
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: i */
    public AbstractC8538g mo32616i() {
        this.f23102n = null;
        C12293e eVar = new C12293e(this.f23094f, mo32618m(), this.f23104p, this.f23101m);
        eVar.mo33368a(this.f23103o);
        eVar.mo33374b(mo33326E());
        eVar.mo33369a((AbstractC8538g.AbstractC8539a) this);
        return eVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: l */
    public void mo32617l() {
        this.f23100l = new C8594b((LoadStateView) this.f23091c.findViewById(R.id.list_state_view_root), Looper.getMainLooper());
        this.f23100l.mo33511a(false, EmptyCategory.f23249m);
        this.f23100l.mo33509a(new LoadStateView.AbstractC8574f() {
            /* class com.bytedance.ee.bear.wikiv2.home.recent.$$Lambda$f$X9nI9WOyWJBxhky2guJGhgvtqU */

            @Override // com.bytedance.ee.bear.list.loadstateview.LoadStateView.AbstractC8574f
            public final void onTouchEvent() {
                C12294f.this.m51230h();
            }
        });
    }

    /* renamed from: a */
    public void mo46882a(SmartRefreshLayout smartRefreshLayout) {
        this.f23099k = smartRefreshLayout;
        mo33352x();
    }

    @Override // com.bytedance.ee.bear.list.list.BaseListView, com.scwang.smartrefresh.layout.p1236c.AbstractC27139c
    public void onRefresh(AbstractC27129h hVar) {
        AbstractC12295a aVar;
        super.onRefresh(hVar);
        if (hVar != null && (aVar = this.f33007a) != null) {
            aVar.mo46879a();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m51228a(LoadStateCategory loadStateCategory) {
        if ((LoadStateCategory.LOADED_FAIL.equals(loadStateCategory) || LoadStateCategory.LOADED_SUCCESS_EMPTY.equals(loadStateCategory)) && !this.f33009u) {
            m51229e();
        }
    }

    @Override // com.bytedance.ee.bear.list.common.header.DriveUploadView.AbstractC8225a, com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: a */
    public void mo32242a(String str, String str2) {
        super.mo32242a(str, str2);
        ListAnalysis.m32516a("none", str2, str, "success");
    }

    public C12294f(Context context, View view, C7718l lVar, C10917c cVar, AbstractC12295a aVar) {
        super(context, view, lVar, cVar);
        this.f33007a = aVar;
    }

    @Override // com.bytedance.ee.bear.list.list.BaseListView, com.bytedance.ee.bear.widgets.BaseRecyclerView.AbstractC11798a
    /* renamed from: a */
    public void mo32605a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        super.mo32605a(i, i2, iArr, iArr2, i3);
        AbstractC12295a aVar = this.f33007a;
        if (aVar != null) {
            aVar.mo46880a(i, i2);
        }
    }
}
