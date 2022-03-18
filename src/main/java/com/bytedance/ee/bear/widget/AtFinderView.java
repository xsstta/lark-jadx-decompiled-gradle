package com.bytedance.ee.bear.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.aj;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.at.AtObject;
import com.bytedance.ee.bear.atfinder.AbstractC4271f;
import com.bytedance.ee.bear.atfinder.AtFinderResult;
import com.bytedance.ee.bear.atfinder.C4266b;
import com.bytedance.ee.bear.atfinder.C4268c;
import com.bytedance.ee.bear.atfinder.View$OnKeyListenerC4262a;
import com.bytedance.ee.bear.bean.C4519b;
import com.bytedance.ee.bear.bean.C4520c;
import com.bytedance.ee.bear.facade.common.widget.BearLottieView;
import com.bytedance.ee.bear.p526r.C10599b;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.bytedance.ee.util.p718t.C13747j;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.larksuite.suite.R;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.AbstractC68309a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AtFinderView extends FrameLayout implements View$OnKeyListenerC4262a.AbstractC4265a {

    /* renamed from: a */
    View$OnKeyListenerC4262a f31613a;

    /* renamed from: b */
    private final String f31614b;

    /* renamed from: c */
    private C11762c f31615c;

    /* renamed from: d */
    private C4268c f31616d;

    /* renamed from: e */
    private C4266b f31617e;

    /* renamed from: f */
    private List<AtObject> f31618f = new ArrayList();

    /* renamed from: g */
    private int f31619g;

    /* renamed from: h */
    private String f31620h;

    /* renamed from: i */
    private AbstractC1178x<AtFinderResult> f31621i;

    /* renamed from: j */
    private AbstractC4271f f31622j;

    /* renamed from: k */
    private LifecycleOwner f31623k;

    /* renamed from: l */
    private AbstractC11761b f31624l;

    /* renamed from: m */
    private C4519b f31625m;

    /* renamed from: com.bytedance.ee.bear.widget.AtFinderView$b */
    public interface AbstractC11761b {
        void onHeightChange();
    }

    /* renamed from: f */
    private void m48761f() {
        this.f31615c.mo45028b();
    }

    /* renamed from: g */
    private void m48762g() {
        this.f31615c.mo45025a();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.widget.AtFinderView$c */
    public static final class C11762c {

        /* renamed from: a */
        String f31628a = "ViewsHolder";

        /* renamed from: b */
        public long f31629b;

        /* renamed from: c */
        View f31630c;

        /* renamed from: d */
        View f31631d;

        /* renamed from: e */
        RecyclerView f31632e;

        /* renamed from: f */
        CommonActionPanelLayout f31633f;

        /* renamed from: g */
        BearLottieView f31634g;

        /* renamed from: h */
        public AbstractC11774d f31635h;

        /* renamed from: i */
        private Disposable f31636i;

        /* renamed from: j */
        private Disposable f31637j;

        /* renamed from: h */
        private boolean m48774h() {
            if (this.f31634g.getVisibility() == 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo45025a() {
            this.f31631d.setVisibility(0);
            this.f31633f.setVisibility(8);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo45028b() {
            this.f31631d.setVisibility(8);
            this.f31633f.setVisibility(0);
        }

        /* renamed from: f */
        private void m48772f() {
            Disposable disposable = this.f31636i;
            if (disposable != null && !disposable.isDisposed()) {
                this.f31636i.dispose();
                C13479a.m54772d(this.f31628a, "disposeShowLoading");
            }
        }

        /* renamed from: g */
        private void m48773g() {
            Disposable disposable = this.f31637j;
            if (disposable != null && !disposable.isDisposed()) {
                this.f31637j.dispose();
                C13479a.m54772d(this.f31628a, "disposeHideLoading");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo45029c() {
            m48772f();
            m48773g();
            if (!m48774h()) {
                C13479a.m54772d(this.f31628a, "showSearchLoading delay");
                this.f31636i = Observable.timer(250, TimeUnit.MILLISECONDS).subscribeOn(C11678b.m48480d()).observeOn(C11678b.m48481e()).doOnComplete(new AbstractC68309a() {
                    /* class com.bytedance.ee.bear.widget.AtFinderView.C11762c.C117642 */

                    @Override // io.reactivex.functions.AbstractC68309a
                    public void run() throws Exception {
                        if (C11762c.this.f31634g == null || C11762c.this.f31634g.getWindowToken() == null) {
                            C13479a.m54775e(C11762c.this.f31628a, "showSearchLoading: loading view is null");
                            return;
                        }
                        C13479a.m54764b(C11762c.this.f31628a, "run(): showSearchLoading");
                        C11762c.this.f31629b = System.currentTimeMillis();
                        C11762c.this.f31634g.setVisibility(0);
                        C11762c.this.f31634g.playAnimation();
                    }
                }).subscribe();
            }
        }

        /* renamed from: e */
        private void m48771e() {
            this.f31631d = this.f31630c.findViewById(R.id.search_not_found);
            this.f31632e = (RecyclerView) this.f31630c.findViewById(R.id.search_result_list);
            this.f31634g = (BearLottieView) this.f31630c.findViewById(R.id.search_loading);
            CommonActionPanelLayout commonActionPanelLayout = (CommonActionPanelLayout) this.f31630c.findViewById(R.id.search_result_view);
            this.f31633f = commonActionPanelLayout;
            commonActionPanelLayout.setOnActionListener(new CommonActionPanelLayout.SimpleActionListener() {
                /* class com.bytedance.ee.bear.widget.AtFinderView.C11762c.C117631 */

                @Override // com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout.OnActionListener, com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout.SimpleActionListener
                /* renamed from: a */
                public void mo18276a() {
                    if (C11762c.this.f31635h != null) {
                        C11762c.this.f31635h.onCancel();
                    }
                }
            });
            C13747j.m55726a((View) this.f31634g, (int) R.color.bg_body);
            C13747j.m55726a(this.f31631d, (int) R.color.bg_body);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo45030d() {
            m48772f();
            m48773g();
            if (m48774h()) {
                long currentTimeMillis = System.currentTimeMillis() - this.f31629b;
                C13479a.m54772d(this.f31628a, "delay hideSearchLoading");
                this.f31637j = Observable.timer(Math.max(0L, 500 - currentTimeMillis), TimeUnit.MILLISECONDS).subscribeOn(C11678b.m48481e()).observeOn(C11678b.m48481e()).doOnComplete(new AbstractC68309a() {
                    /* class com.bytedance.ee.bear.widget.AtFinderView.C11762c.C117653 */

                    @Override // io.reactivex.functions.AbstractC68309a
                    public void run() throws Exception {
                        C13479a.m54764b(C11762c.this.f31628a, "run(): hideSearchLoading");
                        C11762c.this.f31634g.setVisibility(8);
                        C11762c.this.f31634g.cancelAnimation();
                    }
                }).subscribe();
            }
        }

        /* renamed from: a */
        public void mo45026a(AbstractC11774d dVar) {
            this.f31635h = dVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo45027a(String str) {
            this.f31633f.setTitle(str);
        }

        C11762c(View view) {
            this.f31630c = view;
            m48771e();
        }
    }

    /* renamed from: e */
    private void m48760e() {
        setBackground(null);
        this.f31615c.f31631d.setBackgroundColor(-1);
        this.f31615c.f31631d.setElevation(30.0f);
    }

    @Override // com.bytedance.ee.bear.atfinder.View$OnKeyListenerC4262a.AbstractC4265a
    /* renamed from: a */
    public void mo16798a() {
        this.f31617e.getSearchResultList(this.f31620h).mo5923a(this.f31623k, this.f31621i);
        setVisibility(0);
    }

    @Override // com.bytedance.ee.bear.atfinder.View$OnKeyListenerC4262a.AbstractC4265a
    /* renamed from: b */
    public void mo16799b() {
        this.f31617e.getSearchResultList(this.f31620h).mo5928b(this.f31621i);
        this.f31615c.f31634g.cancelAnimation();
        setVisibility(8);
    }

    @Override // com.bytedance.ee.bear.atfinder.View$OnKeyListenerC4262a.AbstractC4265a
    /* renamed from: c */
    public void mo16800c() {
        C13479a.m54764b(this.f31614b, "showLoading");
        this.f31615c.mo45029c();
        AbstractC11761b bVar = this.f31624l;
        if (bVar != null) {
            bVar.onHeightChange();
        }
    }

    /* renamed from: d */
    private void m48759d() {
        C13479a.m54772d(this.f31614b, "AtFinderView.initViews:82 ");
        C11762c cVar = new C11762c(LayoutInflater.from(getContext()).inflate(R.layout.at_atfinder_inner_fragment_main, (ViewGroup) this, true));
        this.f31615c = cVar;
        cVar.f31628a = this.f31614b;
        this.f31616d = new C4268c(this.f31618f);
        this.f31615c.f31632e.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f31615c.f31632e.setAdapter(this.f31616d);
        setVisibility(8);
        m48760e();
    }

    public void setAtCommonConfig(C4519b bVar) {
        this.f31625m = bVar;
    }

    public void setContentHeightChangeCallback(AbstractC11761b bVar) {
        this.f31624l = bVar;
    }

    public void setSearchDelegate(AbstractC4271f fVar) {
        this.f31622j = fVar;
    }

    public void setAtFinderViewDelegate(AbstractC11774d dVar) {
        this.f31615c.mo45026a(dVar);
    }

    public void setTitle(String str) {
        this.f31615c.mo45027a(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.widget.AtFinderView$a */
    public static final class C11760a implements AbstractC1178x<AtFinderResult> {

        /* renamed from: a */
        private WeakReference<AtFinderView> f31626a;

        /* renamed from: b */
        private AtFinderResult f31627b;

        C11760a(AtFinderView atFinderView) {
            this.f31626a = new WeakReference<>(atFinderView);
        }

        /* renamed from: a */
        public void onChanged(AtFinderResult atFinderResult) {
            if (this.f31627b != atFinderResult && atFinderResult != null) {
                this.f31627b = atFinderResult;
                AtFinderView atFinderView = this.f31626a.get();
                if (atFinderView != null) {
                    C13479a.m54772d("AtFinderView", "mSearchResultList onChanged");
                    atFinderView.mo45017a(atFinderResult);
                }
            }
        }
    }

    public AtFinderView(Context context) {
        super(context);
        String str = "AtFinderView#" + Integer.toHexString(hashCode());
        this.f31614b = str;
        C13479a.m54772d(str, "AtFinderView.AtFinderView:64 ");
        m48759d();
    }

    /* renamed from: a */
    public void mo45017a(AtFinderResult atFinderResult) {
        boolean z;
        this.f31618f.clear();
        this.f31615c.mo45030d();
        if (atFinderResult == null || atFinderResult.list == null || atFinderResult.list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        String str = this.f31614b;
        C13479a.m54772d(str, "onRefreshSearchResult: hasResult=" + z);
        if (z) {
            m48761f();
            C13479a.m54772d(this.f31614b, "AtFinderView.onRefreshSearchResult:147 ");
            this.f31618f.addAll(atFinderResult.list);
        } else {
            m48762g();
        }
        String str2 = this.f31614b;
        C13479a.m54772d(str2, "onRefreshSearchResult mSearchResultList = " + this.f31618f.size());
        this.f31616d.mo70690f(this.f31618f);
        View$OnKeyListenerC4262a aVar = this.f31613a;
        if (!(aVar == null || atFinderResult == null)) {
            if (z) {
                aVar.mo16788b(atFinderResult.keyword);
            } else {
                aVar.mo16784a(atFinderResult.keyword);
            }
        }
        AbstractC11761b bVar = this.f31624l;
        if (bVar != null) {
            bVar.onHeightChange();
        }
    }

    /* renamed from: a */
    public void mo45018a(C4520c cVar) {
        boolean z;
        int c = cVar.mo17415c();
        this.f31619g = c;
        C4268c cVar2 = this.f31616d;
        if (c == 6) {
            z = true;
        } else {
            z = false;
        }
        cVar2.mo16807a(z);
    }

    /* renamed from: a */
    private void m48758a(List<String> list, C4520c cVar) {
        this.f31617e.setSearchDelegate(this.f31622j);
        this.f31621i = new C11760a(this);
        View$OnKeyListenerC4262a aVar = new View$OnKeyListenerC4262a(this.f31617e, cVar, this.f31625m.mo17411a(), C10599b.m43900a(list), this);
        this.f31613a = aVar;
        this.f31620h = aVar.mo16781a();
        this.f31616d.mo70668a((BaseQuickAdapter.AbstractC20911a) this.f31613a);
        mo45018a(cVar);
    }

    public AtFinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        String str = "AtFinderView#" + Integer.toHexString(hashCode());
        this.f31614b = str;
        C13479a.m54772d(str, "AtFinderView.AtFinderView:69 ");
        m48759d();
    }

    /* renamed from: a */
    public View$OnKeyListenerC4262a mo45015a(Fragment fragment, List<String> list, C4520c cVar) {
        String str = this.f31614b;
        C13479a.m54772d(str, "AtFinderView.makeAtFinderController:79token=" + C13598b.m55197d(cVar.mo17414b()) + " source=" + cVar.mo17415c());
        this.f31623k = fragment;
        this.f31617e = (C4266b) aj.m5364a(fragment).mo6005a(C4266b.class);
        m48758a(list, cVar);
        return this.f31613a;
    }

    public AtFinderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        String str = "AtFinderView#" + Integer.toHexString(hashCode());
        this.f31614b = str;
        C13479a.m54772d(str, "AtFinderView.AtFinderView:74 ");
        m48759d();
    }

    /* renamed from: a */
    public View$OnKeyListenerC4262a mo45016a(FragmentActivity fragmentActivity, List<String> list, C4520c cVar) {
        String str = this.f31614b;
        C13479a.m54772d(str, "AtFinderView.makeAtFinderController:79token=" + C13598b.m55197d(cVar.mo17414b()) + " source=" + cVar.mo17415c());
        this.f31623k = fragmentActivity;
        this.f31617e = (C4266b) aj.m5366a(fragmentActivity).mo6005a(C4266b.class);
        m48758a(list, cVar);
        return this.f31613a;
    }
}
