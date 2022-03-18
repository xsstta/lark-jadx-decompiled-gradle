package com.bytedance.ee.bear.wiki.homepage.recent;

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

/* renamed from: com.bytedance.ee.bear.wiki.homepage.recent.f */
public final class C11983f extends BaseListView<AbstractC8544i.AbstractC8545a> {

    /* renamed from: a */
    private final AbstractC11984a f32365a;

    /* renamed from: t */
    private ViewTreeObserver.OnPreDrawListener f32366t;

    /* renamed from: u */
    private boolean f32367u;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.wiki.homepage.recent.f$a */
    public interface AbstractC11984a {
        /* renamed from: a */
        void mo45914a();

        /* renamed from: a */
        void mo45915a(int i, int i2);
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
    /* renamed from: q */
    public boolean mo33345q() {
        return false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: h */
    private /* synthetic */ void m49667h() {
        onRefresh(null);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: d */
    public void mo32613d() {
        super.mo32613d();
        m49664a();
    }

    @Override // com.bytedance.ee.bear.list.list.BaseListView, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        this.f23098j.getViewTreeObserver().removeOnPreDrawListener(this.f32366t);
    }

    /* renamed from: a */
    private void m49664a() {
        this.f32366t = new ViewTreeObserver.OnPreDrawListener() {
            /* class com.bytedance.ee.bear.wiki.homepage.recent.$$Lambda$f$pOt2ZH1jM0thNz8jbDyDIM9lUik */

            public final boolean onPreDraw() {
                return C11983f.this.m49668j();
            }
        };
        this.f23098j.getViewTreeObserver().addOnPreDrawListener(this.f32366t);
        this.f23100l.mo33505a(this.f23092d, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.wiki.homepage.recent.$$Lambda$f$L_EAPAVu8vZegiSzDr0ibyFkCs0 */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C11983f.this.m49665a((C11983f) ((LoadStateCategory) obj));
            }
        });
    }

    /* renamed from: e */
    private void m49666e() {
        ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31520d().mo33057c("wiki");
        this.f23098j.getViewTreeObserver().removeOnPreDrawListener(this.f32366t);
        this.f32367u = true;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: j */
    private /* synthetic */ boolean m49668j() {
        if (this.f32367u || this.f23098j.getChildCount() <= 0) {
            return true;
        }
        m49666e();
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
        C11982e eVar = new C11982e(this.f23094f, mo32618m(), this.f23104p, this.f23101m);
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
            /* class com.bytedance.ee.bear.wiki.homepage.recent.$$Lambda$f$k3rH5fFzCx1yNKe1O_ercJg9y8w */

            @Override // com.bytedance.ee.bear.list.loadstateview.LoadStateView.AbstractC8574f
            public final void onTouchEvent() {
                C11983f.this.m49667h();
            }
        });
    }

    /* renamed from: a */
    public void mo45920a(SmartRefreshLayout smartRefreshLayout) {
        this.f23099k = smartRefreshLayout;
        mo33352x();
    }

    @Override // com.bytedance.ee.bear.list.list.BaseListView, com.scwang.smartrefresh.layout.p1236c.AbstractC27139c
    public void onRefresh(AbstractC27129h hVar) {
        AbstractC11984a aVar;
        super.onRefresh(hVar);
        if (hVar != null && (aVar = this.f32365a) != null) {
            aVar.mo45914a();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m49665a(LoadStateCategory loadStateCategory) {
        if ((LoadStateCategory.LOADED_FAIL.equals(loadStateCategory) || LoadStateCategory.LOADED_SUCCESS_EMPTY.equals(loadStateCategory)) && !this.f32367u) {
            m49666e();
        }
    }

    public C11983f(Context context, View view, C7718l lVar, C10917c cVar, AbstractC11984a aVar) {
        super(context, view, lVar, cVar);
        this.f32365a = aVar;
    }

    @Override // com.bytedance.ee.bear.list.list.BaseListView, com.bytedance.ee.bear.widgets.BaseRecyclerView.AbstractC11798a
    /* renamed from: a */
    public void mo32605a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        super.mo32605a(i, i2, iArr, iArr2, i3);
        AbstractC11984a aVar = this.f32365a;
        if (aVar != null) {
            aVar.mo45915a(i, i2);
        }
    }
}
