package com.ss.android.appcenter.business.tab.business;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.ss.android.appcenter.business.monitor.p1269a.C27700a;
import com.ss.android.appcenter.business.net.p1272c.C27727a;
import com.ss.android.appcenter.business.net.p1272c.C27733c;
import com.ss.android.appcenter.business.p1265a.C27582j;
import com.ss.android.appcenter.business.tab.business.p1273a.C27789a;
import com.ss.android.appcenter.business.tab.fragmentv2.C27973a;
import com.ss.android.appcenter.business.tab.fragmentv3.C28025a;
import com.ss.android.appcenter.business.tab.fragmentv3.C28082d;
import com.ss.android.appcenter.business.view.StatusController;
import com.ss.android.appcenter.common.util.C28177b;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.common.view.biz.WorkplaceErrorView;
import com.ss.android.appcenter.common.view.biz.WorkplaceLoadingView;
import com.ss.android.appcenter.p1262a.AbstractC27567c;
import com.ss.android.lark.maincore.AbstractC44548e;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.maincore.ITitleInfo;
import com.ss.android.lark.opmonitor.trace.OPTraceService;
import com.ss.android.lark.util.share_preference.UserSP;
import java.util.List;

/* renamed from: com.ss.android.appcenter.business.tab.business.a */
public class C27782a extends Fragment implements AbstractC27567c {

    /* renamed from: a */
    public StatusController f69406a;

    /* renamed from: b */
    public boolean f69407b;

    /* renamed from: c */
    public boolean f69408c;

    /* renamed from: d */
    public boolean f69409d;

    /* renamed from: e */
    private ITitleController f69410e;

    /* renamed from: f */
    private AbstractC44548e f69411f;

    /* renamed from: g */
    private AbstractC27567c f69412g;

    /* renamed from: h */
    private C27727a f69413h;

    /* renamed from: i */
    private boolean f69414i;

    public C27782a() {
    }

    @Override // com.ss.android.appcenter.p1262a.AbstractC27567c
    /* renamed from: e */
    public Fragment mo98247e() {
        C28184h.m103250d("WorkplaceRouterFragment", "getPageContent>>>");
        return this;
    }

    @Override // com.ss.android.appcenter.p1262a.AbstractC27567c
    /* renamed from: a */
    public void mo98243a() {
        C28184h.m103250d("WorkplaceRouterFragment", "reload>>>");
        AbstractC27567c cVar = this.f69412g;
        if (cVar != null) {
            cVar.mo98243a();
        }
    }

    @Override // com.ss.android.appcenter.p1262a.AbstractC27567c
    /* renamed from: c */
    public void mo98245c() {
        C28184h.m103250d("WorkplaceRouterFragment", "onMainDrawerShow>>>");
        AbstractC27567c cVar = this.f69412g;
        if (cVar != null) {
            cVar.mo98245c();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C28184h.m103250d("WorkplaceRouterFragment", "onDestroy>>>");
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        C28184h.m103250d("WorkplaceRouterFragment", "onPause>>>");
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C28184h.m103250d("WorkplaceRouterFragment", "onResume>>>");
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        C28184h.m103250d("WorkplaceRouterFragment", "onStart>>>");
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        C28184h.m103250d("WorkplaceRouterFragment", "onStop>>>");
    }

    /* renamed from: f */
    private boolean m101540f() {
        if (!this.f69408c) {
            return false;
        }
        C28184h.m103250d("WorkplaceRouterFragment", "checkReload>>>");
        this.f69408c = false;
        mo99160b(this.f69409d);
        return true;
    }

    @Override // com.ss.android.appcenter.p1262a.AbstractC27567c
    /* renamed from: b */
    public void mo98244b() {
        C28184h.m103250d("WorkplaceRouterFragment", "onTabSwitch>>>");
        if (!m101540f()) {
            m101537d(false);
            AbstractC27567c cVar = this.f69412g;
            if (cVar != null) {
                cVar.mo98244b();
            }
        }
    }

    @Override // com.ss.android.appcenter.p1262a.AbstractC27567c
    /* renamed from: d */
    public ITitleInfo mo98246d() {
        C28184h.m103250d("WorkplaceRouterFragment", "getTitleInfo>>>");
        AbstractC27567c cVar = this.f69412g;
        if (cVar != null) {
            return cVar.mo98246d();
        }
        return new C27789a(getContext());
    }

    /* renamed from: b */
    public void mo99160b(boolean z) {
        UICallbackExecutor.post(new Runnable(z) {
            /* class com.ss.android.appcenter.business.tab.business.$$Lambda$a$YUjowpmkEw1hoADtMqhzt50FRqg */
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C27782a.lambda$YUjowpmkEw1hoADtMqhzt50FRqg(C27782a.this, this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m101536b(View view) {
        C28184h.m103250d("WorkplaceRouterFragment", "click retry. showLoading");
        this.f69406a.mo100033a(StatusController.Status.LOADING);
        m101537d(true);
    }

    /* renamed from: d */
    private void m101537d(final boolean z) {
        C28184h.m103250d("WorkplaceRouterFragment", "requestWorkplaceTemplateInfo>>>");
        C27727a aVar = this.f69413h;
        if (aVar == null) {
            C28184h.m103250d("WorkplaceRouterFragment", "requestWorkplaceTemplateInfo>>> mTemplateService is null");
        } else {
            aVar.mo98899a(new C27727a.AbstractC27731b() {
                /* class com.ss.android.appcenter.business.tab.business.C27782a.C277864 */

                @Override // com.ss.android.appcenter.business.net.p1272c.C27727a.AbstractC27731b
                /* renamed from: a */
                public void mo98903a() {
                    if (z) {
                        C27782a.this.f69406a.mo100033a(StatusController.Status.ERROR);
                    }
                    C28184h.m103250d("WorkplaceRouterFragment", "requestWorkplaceTemplateInfo>>> onError");
                }

                @Override // com.ss.android.appcenter.business.net.p1272c.C27727a.AbstractC27731b
                /* renamed from: b */
                public void mo98905b() {
                    C28184h.m103250d("WorkplaceRouterFragment", "requestWorkplaceTemplateInfo>>> onAvailableTemplateIsEmpty");
                    if (z) {
                        C27782a.this.mo99159a(false);
                    } else {
                        C27782a.this.mo99161c(false);
                    }
                    UserSP.getInstance().putBoolean("WorkplaceTemplateFragmentKey", false);
                }

                @Override // com.ss.android.appcenter.business.net.p1272c.C27727a.AbstractC27731b
                /* renamed from: a */
                public void mo98904a(List<C27733c> list) {
                    C28184h.m103250d("WorkplaceRouterFragment", "requestWorkplaceTemplateInfo>>> onSuccess with templateInfoList");
                    if (z) {
                        C27782a.this.mo99159a(true);
                    } else {
                        C27782a.this.mo99161c(true);
                    }
                    UserSP.getInstance().putBoolean("WorkplaceTemplateFragmentKey", true);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo99159a(boolean z) {
        StatusController statusController = this.f69406a;
        if (statusController != null) {
            statusController.mo100033a(StatusController.Status.CONTENT);
        }
        UICallbackExecutor.post(new Runnable(z) {
            /* class com.ss.android.appcenter.business.tab.business.$$Lambda$a$jdm_UkdOO4_w0jPRW_lfzUnrWvo */
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C27782a.lambda$jdm_UkdOO4_w0jPRW_lfzUnrWvo(C27782a.this, this.f$1);
            }
        });
    }

    /* renamed from: c */
    public void mo99161c(boolean z) {
        if (this.f69414i) {
            this.f69414i = false;
            m101538e(z);
            return;
        }
        AbstractC27567c cVar = this.f69412g;
        if ((cVar instanceof C28025a) && !z) {
            m101538e(false);
        } else if ((cVar instanceof C27973a) && z) {
            m101538e(true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        C28184h.m103250d("WorkplaceRouterFragment", "setUserVisibleHint>>> " + z);
        this.f69407b = z;
        AbstractC27567c cVar = this.f69412g;
        if (cVar != null && cVar.mo98247e() != null) {
            this.f69412g.mo98247e().setUserVisibleHint(z);
        }
    }

    /* renamed from: a */
    private void m101535a(View view) {
        this.f69406a = new StatusController();
        final WorkplaceLoadingView workplaceLoadingView = (WorkplaceLoadingView) view.findViewById(R.id.loading);
        this.f69406a.mo100035a(new StatusController.AbstractC28105b() {
            /* class com.ss.android.appcenter.business.tab.business.C27782a.C277831 */

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
            /* class com.ss.android.appcenter.business.tab.business.$$Lambda$a$2yUOqDlSfFqD98cGl4MwzlrFk6g */

            public final void onClick(View view) {
                C27782a.lambda$2yUOqDlSfFqD98cGl4MwzlrFk6g(C27782a.this, view);
            }
        });
        this.f69406a.mo100032a(workplaceErrorView, StatusController.Status.ERROR);
        this.f69406a.mo100035a(new StatusController.AbstractC28105b() {
            /* class com.ss.android.appcenter.business.tab.business.C27782a.C277842 */

            @Override // com.ss.android.appcenter.business.view.StatusController.AbstractC28105b
            /* renamed from: a */
            public void mo98317a() {
            }

            @Override // com.ss.android.appcenter.business.view.StatusController.AbstractC28105b
            /* renamed from: b */
            public void mo98318b() {
            }
        }, StatusController.Status.CONTENT);
        view.postDelayed(new Runnable() {
            /* class com.ss.android.appcenter.business.tab.business.C27782a.RunnableC277853 */

            public void run() {
                C28184h.m103250d("WorkplaceRouterFragment", "delay>>> try showImageLoading");
                if (C27782a.this.f69406a.mo100037a() && C27782a.this.f69407b) {
                    C28184h.m103250d("WorkplaceRouterFragment", "delay>>> now is uninit");
                    C27782a.this.f69406a.mo100033a(StatusController.Status.LOADING);
                }
            }
        }, 500);
        workplaceErrorView.setPadding(0, this.f69410e.mo99189a(), 0, 0);
        workplaceLoadingView.setPadding(0, this.f69410e.mo99189a(), 0, 0);
    }

    /* renamed from: e */
    private void m101538e(final boolean z) {
        Context context = getContext();
        if (context == null) {
            C28184h.m103248b("WorkplaceRouterFragment", "showUpgradeDialog>>> context is null.");
            return;
        }
        C28184h.m103250d("WorkplaceRouterFragment", "showUpgradeDialog>>> hasTemplate:" + z);
        C28177b.m103225b(context, context.getString(R.string.OpenPlatform_Workplace_WorkplaceUpdateTtl), context.getString(R.string.OpenPlatform_Workplace_WorkplaceUpdateDesc), context.getString(R.string.OpenPlatform_Workplace_WorkplaceUpdateBttn), context.getString(R.string.OpenPlatform_Workplace_WorkplaceUpdateCancelBttn), new DialogInterface.OnClickListener() {
            /* class com.ss.android.appcenter.business.tab.business.C27782a.DialogInterface$OnClickListenerC277875 */

            public void onClick(DialogInterface dialogInterface, int i) {
                C28184h.m103250d("WorkplaceRouterFragment", "upgradeDialog>>> click confirm");
                C27782a.this.mo99160b(z);
            }
        }, new DialogInterface.OnClickListener() {
            /* class com.ss.android.appcenter.business.tab.business.C27782a.DialogInterface$OnClickListenerC277886 */

            public void onClick(DialogInterface dialogInterface, int i) {
                C28184h.m103250d("WorkplaceRouterFragment", "upgradeDialog>>> click cancel");
                C27782a.this.f69408c = true;
                C27782a.this.f69409d = z;
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m101539f(boolean z) {
        C28184h.m103250d("WorkplaceRouterFragment", "replaceFragment>>> templateFragment:" + z);
        try {
            FragmentManager childFragmentManager = getChildFragmentManager();
            FragmentTransaction beginTransaction = childFragmentManager.beginTransaction();
            if (z) {
                this.f69412g = new C28025a(getContext(), this.f69411f, this.f69410e);
            } else {
                this.f69412g = new C27973a(getContext(), this.f69410e);
            }
            this.f69412g.mo98247e().setUserVisibleHint(this.f69407b);
            beginTransaction.replace(R.id.fragment_container, this.f69412g.mo98247e());
            beginTransaction.commitAllowingStateLoss();
            childFragmentManager.executePendingTransactions();
        } catch (Exception e) {
            C28184h.m103247a("WorkplaceRouterFragment", "replaceFragment>>> exception:", e);
            C27700a.m101236a("replaceFragment", e);
            this.f69414i = true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m101541g(boolean z) {
        C28184h.m103250d("WorkplaceRouterFragment", "loadFragment>>> templateFragment:" + z);
        try {
            FragmentManager childFragmentManager = getChildFragmentManager();
            FragmentTransaction beginTransaction = childFragmentManager.beginTransaction();
            if (z) {
                this.f69412g = new C28025a(getContext(), this.f69411f, this.f69410e);
            } else {
                this.f69412g = new C27973a(getContext(), this.f69410e);
            }
            this.f69412g.mo98247e().setUserVisibleHint(this.f69407b);
            beginTransaction.add(R.id.fragment_container, this.f69412g.mo98247e());
            beginTransaction.commitAllowingStateLoss();
            childFragmentManager.executePendingTransactions();
        } catch (Exception e) {
            C28184h.m103247a("WorkplaceRouterFragment", "loadFragment>>> exception:", e);
            C27700a.m101236a("loadFragment", e);
            this.f69414i = true;
        }
    }

    public C27782a(AbstractC44548e eVar, ITitleController iTitleController) {
        this.f69411f = eVar;
        this.f69410e = iTitleController;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C28082d.m102671g().mo99971a();
        this.f69413h = new C27727a(OPTraceService.m192757a());
        boolean contains = UserSP.getInstance().contains("WorkplaceTemplateFragmentKey");
        C28184h.m103250d("WorkplaceRouterFragment", "onCreateView>>> withCache:" + contains);
        if (contains) {
            boolean z = UserSP.getInstance().getBoolean("WorkplaceTemplateFragmentKey");
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.workplace_router_simple_fragment, viewGroup, false);
            mo99159a(z);
            m101537d(false);
            return inflate;
        }
        View inflate2 = LayoutInflater.from(getContext()).inflate(R.layout.workplace_router_status_fragment, viewGroup, false);
        m101535a(inflate2);
        m101537d(true);
        return inflate2;
    }
}
