package com.ss.android.appcenter.business.tab.fragmentv3;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.appcenter.business.monitor.p1269a.C27700a;
import com.ss.android.appcenter.business.monitor.p1269a.C27702b;
import com.ss.android.appcenter.business.monitor.statistics.C27710b;
import com.ss.android.appcenter.business.p1265a.C27576e;
import com.ss.android.appcenter.business.p1265a.C27582j;
import com.ss.android.appcenter.business.tab.business.p1273a.C27789a;
import com.ss.android.appcenter.business.tab.business.p1273a.C27800k;
import com.ss.android.appcenter.business.tab.business.popups.BizPopupsHelper;
import com.ss.android.appcenter.business.view.StatusController;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.common.view.BannerRecyclerView;
import com.ss.android.appcenter.common.view.biz.WorkplaceErrorView;
import com.ss.android.appcenter.common.view.biz.WorkplaceLoadingView;
import com.ss.android.appcenter.engine.AbstractC28247f;
import com.ss.android.appcenter.engine.C28231a;
import com.ss.android.appcenter.engine.p1299a.AbstractC28238b;
import com.ss.android.appcenter.engine.p1299a.AbstractC28239c;
import com.ss.android.appcenter.p1262a.AbstractC27567c;
import com.ss.android.appcenter.p1262a.p1263a.C27548m;
import com.ss.android.lark.maincore.AbstractC44548e;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.maincore.ITitleInfo;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.ss.android.lark.opmonitor.trace.OPTraceService;
import com.ss.android.lark.util.share_preference.UserSP;

/* renamed from: com.ss.android.appcenter.business.tab.fragmentv3.a */
public class C28025a extends Fragment implements AbstractC27567c, AbstractC28247f {

    /* renamed from: a */
    public C27800k f70124a;

    /* renamed from: b */
    public C27576e f70125b;

    /* renamed from: c */
    public OPTrace f70126c;

    /* renamed from: d */
    private StatusController f70127d;

    /* renamed from: e */
    private C28231a f70128e;

    /* renamed from: f */
    private boolean f70129f;

    @Override // com.ss.android.appcenter.p1262a.AbstractC27567c
    /* renamed from: a */
    public void mo98243a() {
    }

    @Override // com.ss.android.appcenter.p1262a.AbstractC27567c
    /* renamed from: c */
    public void mo98245c() {
    }

    @Override // com.ss.android.appcenter.p1262a.AbstractC27567c
    /* renamed from: e */
    public Fragment mo98247e() {
        return this;
    }

    @Override // com.ss.android.appcenter.engine.AbstractC28247f
    /* renamed from: f */
    public boolean mo99867f() {
        return this.f70129f;
    }

    @Override // com.ss.android.appcenter.p1262a.AbstractC27567c
    /* renamed from: d */
    public ITitleInfo mo98246d() {
        return this.f70124a.mo99207e();
    }

    /* renamed from: h */
    private void m102431h() {
        C28231a aVar;
        if (this.f70129f && (aVar = this.f70128e) != null) {
            aVar.mo100605k();
        }
    }

    @Override // com.ss.android.appcenter.p1262a.AbstractC27567c
    /* renamed from: b */
    public void mo98244b() {
        C28184h.m103250d("Workplace_Template_Page", "onTabSwitch>>>");
        m102431h();
        C27710b.m101304j();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        BizPopupsHelper.f69630a.mo99360a();
        super.onDestroy();
        C28184h.m103250d("Workplace_Template_Page", "onDestroy>>>");
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        C28184h.m103250d("Workplace_Template_Page", "onPause>>>");
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        C28184h.m103250d("Workplace_Template_Page", "onStop>>>");
    }

    public C28025a() {
        this.f70125b = new C27576e(true);
        this.f70124a = new C27800k();
    }

    /* renamed from: g */
    private void m102430g() {
        boolean z = UserSP.getInstance().getBoolean("workplace_show_title", true);
        this.f70124a.mo99202a(z);
        if (z) {
            this.f70124a.mo99198a();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C28184h.m103250d("Workplace_Template_Page", "onResume>>>");
        m102431h();
        m102432i();
    }

    /* renamed from: i */
    private void m102432i() {
        FragmentActivity activity;
        Window window;
        View decorView;
        if (getUserVisibleHint() && (activity = getActivity()) != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            BizPopupsHelper.f69630a.mo99361a(this, decorView);
        }
    }

    /* renamed from: a */
    private void m102425a(FrameLayout frameLayout) {
        frameLayout.setPadding(0, this.f70124a.mo99206d(), 0, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m102428c(View view) {
        C27548m.m100547m().mo98216a().mo98154a(getContext());
    }

    /* renamed from: a */
    private void m102426a(boolean z) {
        Lifecycle.Event event;
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle instanceof LifecycleRegistry) {
            Lifecycle.State currentState = lifecycle.getCurrentState();
            if (currentState == Lifecycle.State.RESUMED || currentState == Lifecycle.State.STARTED) {
                LifecycleRegistry lifecycleRegistry = (LifecycleRegistry) lifecycle;
                if (z) {
                    event = Lifecycle.Event.ON_RESUME;
                } else {
                    event = Lifecycle.Event.ON_PAUSE;
                }
                lifecycleRegistry.handleLifecycleEvent(event);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m102429d(View view) {
        C28184h.m103250d("Workplace_Template_Page", "click retry. showLoading");
        this.f70127d.mo100033a(StatusController.Status.LOADING);
        C27700a.m101232a("op_workplace_event").setMonitorCode(C27702b.f69221R).addCategoryValue("render_scene", "error_retry").tracing(this.f70126c).flush();
        this.f70128e.mo100605k();
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        this.f70129f = z;
        C28184h.m103250d("Workplace_Template_Page", "setUserVisibleHint>>> isVisibleToUser:" + z);
        m102426a(z);
        m102432i();
    }

    /* renamed from: a */
    private void m102424a(View view) {
        this.f70127d = new StatusController();
        final WorkplaceLoadingView workplaceLoadingView = (WorkplaceLoadingView) view.findViewById(R.id.loading);
        this.f70127d.mo100035a(new StatusController.AbstractC28105b() {
            /* class com.ss.android.appcenter.business.tab.fragmentv3.C28025a.C280261 */

            @Override // com.ss.android.appcenter.business.view.StatusController.AbstractC28105b
            /* renamed from: a */
            public void mo98317a() {
                workplaceLoadingView.setVisibility(0);
                C27582j.m100671a(true, workplaceLoadingView.getLottieAnimationView());
            }

            @Override // com.ss.android.appcenter.business.view.StatusController.AbstractC28105b
            /* renamed from: b */
            public void mo98318b() {
                workplaceLoadingView.setVisibility(8);
                C27582j.m100671a(false, workplaceLoadingView.getLottieAnimationView());
            }
        }, StatusController.Status.LOADING);
        WorkplaceErrorView workplaceErrorView = (WorkplaceErrorView) view.findViewById(R.id.error);
        workplaceErrorView.mo100450a();
        workplaceErrorView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.appcenter.business.tab.fragmentv3.$$Lambda$a$VY_N8YvFEYzw97msWqDGpj4T1qI */

            public final void onClick(View view) {
                C28025a.this.m102429d(view);
            }
        });
        this.f70127d.mo100032a(workplaceErrorView, StatusController.Status.ERROR);
        View findViewById = view.findViewById(R.id.upgrade);
        findViewById.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.appcenter.business.tab.fragmentv3.$$Lambda$a$zYz1o5R84dARJHt4CQhaXhdpZjs */

            public final void onClick(View view) {
                C28025a.this.m102428c(view);
            }
        });
        this.f70127d.mo100032a(findViewById, StatusController.Status.UPGRADE);
        this.f70127d.mo100033a(StatusController.Status.LOADING);
        C28082d.m102671g().mo99976c();
    }

    /* renamed from: b */
    private void m102427b(View view) {
        final Context context = view.getContext();
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.workplace_fragment_container);
        C28231a aVar = new C28231a(context, this.f70126c);
        this.f70128e = aVar;
        aVar.mo100595a(new C28041b(aVar), new C28042c(this.f70128e));
        this.f70128e.mo100592a(this, this, new C28091f(context, this.f70126c), new AbstractC28239c() {
            /* class com.ss.android.appcenter.business.tab.fragmentv3.C28025a.C280272 */

            @Override // com.ss.android.appcenter.engine.p1299a.AbstractC28239c
            /* renamed from: a */
            public AbstractC28238b mo99868a() {
                return new C28086e(context, C28025a.this.f70126c);
            }
        }, this.f70127d, this.f70124a);
        final BannerRecyclerView bannerRecyclerView = (BannerRecyclerView) this.f70128e.mo100607m();
        RecyclerView.RecycledViewPool recycledViewPool = new RecyclerView.RecycledViewPool();
        recycledViewPool.setMaxRecycledViews(101, 20);
        recycledViewPool.setMaxRecycledViews(102, 10);
        bannerRecyclerView.setRecycledViewPool(recycledViewPool);
        bannerRecyclerView.setVisibility(8);
        frameLayout.addView(bannerRecyclerView, new FrameLayout.LayoutParams(-1, -1));
        this.f70127d.mo100035a(new StatusController.AbstractC28105b() {
            /* class com.ss.android.appcenter.business.tab.fragmentv3.C28025a.C280283 */

            @Override // com.ss.android.appcenter.business.view.StatusController.AbstractC28105b
            /* renamed from: a */
            public void mo98317a() {
                bannerRecyclerView.setVisibility(0);
                C28025a.this.f70124a.mo99204b(true);
            }

            @Override // com.ss.android.appcenter.business.view.StatusController.AbstractC28105b
            /* renamed from: b */
            public void mo98318b() {
                bannerRecyclerView.setVisibility(8);
                C28025a.this.f70124a.mo99204b(false);
            }
        }, StatusController.Status.CONTENT);
        bannerRecyclerView.mo100420a(new BannerRecyclerView.AbstractC28212a() {
            /* class com.ss.android.appcenter.business.tab.fragmentv3.C28025a.C280294 */

            @Override // com.ss.android.appcenter.common.view.BannerRecyclerView.AbstractC28212a
            /* renamed from: b */
            public void mo99722b() {
                C28184h.m103250d("Workplace_Template_Page", "workplace onFirstAppShowed");
            }

            @Override // com.ss.android.appcenter.common.view.BannerRecyclerView.AbstractC28212a
            /* renamed from: a */
            public void mo99721a() {
                C28025a.this.f70125b.mo98252a("Workplace_Template_Page", "period onFirstFrameShowed.", "renderFirstFrame", "renderEnd");
            }
        });
        m102425a(frameLayout);
        m102430g();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        this.f70126c = OPTraceService.m192757a();
        C27700a.m101232a("op_workplace_event").setMonitorCode(C27702b.f69221R).addCategoryValue("render_scene", "cold_boot").tracing(this.f70126c).flush();
        m102424a(view);
        m102427b(view);
        C27710b.m101304j();
    }

    public C28025a(Context context, AbstractC44548e eVar, ITitleController iTitleController) {
        this.f70125b = new C27576e(true);
        C28184h.m103250d("Workplace_Template_Page", "Constructor AppCenterFragmentV3");
        this.f70124a = new C27800k(iTitleController, eVar, new C27789a(context));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C28082d.m102671g().mo99974b();
        this.f70125b.mo98250a("Workplace_Template_Page", "onCreateView>>>");
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.appcenter_fragment_layout3, viewGroup, false);
        this.f70125b.mo98251a("Workplace_Template_Page", "onCreateView>>> inflate end.", "syncInflate");
        return inflate;
    }
}
