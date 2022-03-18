package com.ss.android.appcenter.business.tab.fragmentv2;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.aj;
import com.larksuite.suite.R;
import com.ss.android.appcenter.business.activity.appprivacy.AppPrivacyActivity;
import com.ss.android.appcenter.business.activity.appsort.TouchDetectFrameLayout;
import com.ss.android.appcenter.business.dto.OnboardingAppInfo;
import com.ss.android.appcenter.business.monitor.p1269a.C27700a;
import com.ss.android.appcenter.business.monitor.p1269a.C27702b;
import com.ss.android.appcenter.business.monitor.statistics.C27710b;
import com.ss.android.appcenter.business.net.operationconfig.OperationalConfigData;
import com.ss.android.appcenter.business.net.workplacehome.WorkplaceHomeData;
import com.ss.android.appcenter.business.net.workplacesetting.WorkplaceSetting;
import com.ss.android.appcenter.business.p1265a.C27576e;
import com.ss.android.appcenter.business.p1265a.C27582j;
import com.ss.android.appcenter.business.tab.business.onboarding.OnboardingView;
import com.ss.android.appcenter.business.tab.business.p1273a.C27789a;
import com.ss.android.appcenter.business.tab.business.p1273a.C27790b;
import com.ss.android.appcenter.business.tab.business.p1273a.C27792c;
import com.ss.android.appcenter.business.tab.business.p1273a.C27795f;
import com.ss.android.appcenter.business.tab.business.p1273a.C27797h;
import com.ss.android.appcenter.business.tab.business.p1273a.C27798i;
import com.ss.android.appcenter.business.tab.business.popups.BizPopupsHelper;
import com.ss.android.appcenter.business.tab.business.push.C27881a;
import com.ss.android.appcenter.business.tab.business.view.bubble.C27900a;
import com.ss.android.appcenter.business.tab.business.widget.C27971l;
import com.ss.android.appcenter.business.tab.business.widget.WidgetData;
import com.ss.android.appcenter.business.tab.fragmentv2.adapter.C27995b;
import com.ss.android.appcenter.business.tab.fragmentv2.adapter.model.C28000b;
import com.ss.android.appcenter.business.tab.fragmentv2.p1280a.C27986a;
import com.ss.android.appcenter.business.tab.fragmentv3.C28082d;
import com.ss.android.appcenter.business.view.StatusController;
import com.ss.android.appcenter.common.util.C28183g;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.common.view.BannerRecyclerView;
import com.ss.android.appcenter.common.view.biz.WorkplaceGuideView;
import com.ss.android.appcenter.common.view.biz.WorkplaceLoadingView;
import com.ss.android.appcenter.p1262a.AbstractC27567c;
import com.ss.android.appcenter.p1262a.p1263a.C27548m;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.maincore.ITitleInfo;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.ss.android.appcenter.business.tab.fragmentv2.a */
public class C27973a extends Fragment implements AbstractC27567c {

    /* renamed from: a */
    public ITitleController f69976a;

    /* renamed from: b */
    public C27789a f69977b;

    /* renamed from: c */
    public BannerRecyclerView f69978c;

    /* renamed from: d */
    public C27986a f69979d;

    /* renamed from: e */
    public C27971l f69980e;

    /* renamed from: f */
    public HandlerC27985a f69981f;

    /* renamed from: g */
    public boolean f69982g;

    /* renamed from: h */
    public WorkplaceLoadingView f69983h;

    /* renamed from: i */
    public StatusController f69984i;

    /* renamed from: j */
    public long f69985j;

    /* renamed from: k */
    public C27576e f69986k;

    /* renamed from: l */
    public C27900a f69987l;

    /* renamed from: m */
    public boolean f69988m;

    /* renamed from: n */
    public boolean f69989n;

    /* renamed from: o */
    private C27995b f69990o;

    /* renamed from: p */
    private TextView f69991p;

    /* renamed from: q */
    private OnboardingView f69992q;

    /* renamed from: r */
    private boolean f69993r;

    /* renamed from: s */
    private boolean f69994s;

    /* renamed from: t */
    private Boolean f69995t;

    /* renamed from: u */
    private boolean f69996u;

    /* renamed from: v */
    private boolean f69997v;

    /* renamed from: w */
    private boolean f69998w;

    /* renamed from: x */
    private C27881a.AbstractC27890a f69999x;

    /* renamed from: y */
    private C27881a.AbstractC27891b f70000y;

    /* renamed from: z */
    private TouchDetectFrameLayout f70001z;

    @Override // com.ss.android.appcenter.p1262a.AbstractC27567c
    /* renamed from: e */
    public Fragment mo98247e() {
        return this;
    }

    @Override // com.ss.android.appcenter.p1262a.AbstractC27567c
    /* renamed from: d */
    public ITitleInfo mo98246d() {
        return this.f69977b;
    }

    /* renamed from: u */
    private void m102147u() {
        C28184h.m103250d("Workplace_Page", "refreshWidgetData");
        C27971l lVar = this.f69980e;
        if (lVar != null) {
            lVar.reload();
        }
    }

    /* renamed from: y */
    private void m102151y() {
        C27548m.m100547m().mo98227k().mo98189b();
    }

    @Override // com.ss.android.appcenter.p1262a.AbstractC27567c
    /* renamed from: b */
    public void mo98244b() {
        if (this.f69998w) {
            mo99712g();
            C27971l lVar = this.f69980e;
            if (lVar != null) {
                lVar.onTabSwitch();
            }
        }
    }

    @Override // com.ss.android.appcenter.p1262a.AbstractC27567c
    /* renamed from: c */
    public void mo98245c() {
        C28184h.m103250d("Workplace_Page", "onDrawerShow>>>");
        mo99710b(true);
    }

    /* renamed from: g */
    public void mo99712g() {
        C27986a aVar = this.f69979d;
        if (aVar != null) {
            aVar.refreshOperationalConfig();
        } else {
            C28184h.m103250d("Workplace_Page", "viewmodel is null when refreshOperationalConfig");
        }
    }

    /* renamed from: j */
    public boolean mo99715j() {
        if (this.f69990o.mo98377b() != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        C28184h.m103250d("Workplace_Page", "onStop>>>");
        mo99710b(true);
    }

    public C27973a() {
        this.f69986k = new C27576e(true);
        this.f69989n = false;
        this.f69976a = new C27795f();
        this.f69977b = new C27789a();
    }

    /* renamed from: n */
    private void m102140n() {
        this.f69979d.getWorkplaceHomeLiveData().mo5923a(this, new AbstractC1178x<WorkplaceHomeData>() {
            /* class com.ss.android.appcenter.business.tab.fragmentv2.C27973a.C279817 */

            /* renamed from: b */
            private long f70019b;

            /* renamed from: c */
            private long f70020c;

            /* renamed from: a */
            public void onChanged(final WorkplaceHomeData workplaceHomeData) {
                C28184h.m103250d("Workplace_Page", "WorkplaceHomeData onChanged");
                long currentTimeMillis = System.currentTimeMillis();
                long j = this.f70019b;
                if (currentTimeMillis - j > 400) {
                    if (C27973a.this.isAdded()) {
                        C27973a.this.mo99706a(workplaceHomeData);
                    }
                    this.f70020c = 0;
                } else {
                    this.f70020c = Math.max(0L, (this.f70020c + 350) - (currentTimeMillis - j));
                    C27973a.this.f69978c.postDelayed(new Runnable() {
                        /* class com.ss.android.appcenter.business.tab.fragmentv2.C27973a.C279817.RunnableC279821 */

                        public void run() {
                            if (C27973a.this.isAdded()) {
                                C27973a.this.mo99706a(workplaceHomeData);
                            }
                        }
                    }, this.f70020c);
                }
                this.f70019b = currentTimeMillis;
            }
        });
        this.f69979d.requestWorkplaceHomeCacheData();
        this.f69979d.requestWorkplaceHomeNetworkData();
    }

    /* renamed from: o */
    private void m102141o() {
        this.f69979d.getWorkplaceSettingLiveData().mo5923a(this, new AbstractC1178x<WorkplaceSetting>() {
            /* class com.ss.android.appcenter.business.tab.fragmentv2.C27973a.C279838 */

            /* renamed from: b */
            private boolean f70024b;

            /* renamed from: a */
            public void onChanged(WorkplaceSetting workplaceSetting) {
                C28184h.m103250d("Workplace_Page", "WorkplaceSetting onChanged:" + workplaceSetting + "hasInited:" + this.f70024b);
                if (!this.f70024b || workplaceSetting != null) {
                    this.f70024b = true;
                    m102181b(workplaceSetting);
                }
            }

            /* renamed from: b */
            private void m102181b(WorkplaceSetting workplaceSetting) {
                if (workplaceSetting != null && workplaceSetting.isShowAppStore()) {
                    C27973a.this.f69977b.mo99170a(new C27792c(C27973a.this.getContext(), workplaceSetting.getAppStoreMobileUrl()));
                }
                C27973a.this.f69976a.mo99191a(C27973a.this.f69977b);
                if (C27973a.this.f69987l != null && C27973a.this.f69987l.mo99475a()) {
                    C27973a.this.f69981f.sendEmptyMessage(16);
                }
            }
        });
        this.f69979d.requestWorkplaceSettingFromLocal();
        this.f69979d.requestWorkplaceSettingFromNet();
    }

    /* renamed from: p */
    private void m102142p() {
        if (this.f69979d.checkOperationalConfigEnable()) {
            this.f69989n = true;
            this.f69979d.getOperationalConfigLiveData().mo5923a(this, new AbstractC1178x<OperationalConfigData>() {
                /* class com.ss.android.appcenter.business.tab.fragmentv2.C27973a.C279849 */

                /* renamed from: a */
                public void onChanged(OperationalConfigData operationalConfigData) {
                    C27973a.this.f69989n = false;
                    if (operationalConfigData == null) {
                        C28184h.m103250d("Workplace_Page", "OperationalConfigData is null");
                        C27973a.this.mo99716k();
                        return;
                    }
                    C27973a.this.mo99705a(operationalConfigData);
                }
            });
        }
    }

    /* renamed from: r */
    private void m102144r() {
        C28184h.m103250d("Workplace_Page", "removeTipTitleButton>>>");
        this.f69977b.mo99169a(1);
        this.f69976a.mo99191a(this.f69977b);
    }

    /* renamed from: t */
    private void m102146t() {
        C27881a.m101794a().mo99408b(this.f69999x);
        C27881a.m101794a().mo99409b(this.f70000y);
    }

    /* renamed from: z */
    private void m102152z() {
        C27548m.m100547m().mo98227k().mo98190c();
        C27548m.m100547m().mo98216a().mo98161b();
    }

    @Override // com.ss.android.appcenter.p1262a.AbstractC27567c
    /* renamed from: a */
    public void mo98243a() {
        C28184h.m103250d("Workplace_Page", "reload fragment");
        if (this.f69998w) {
            mo99711f();
            m102147u();
        }
    }

    /* renamed from: f */
    public void mo99711f() {
        C28184h.m103250d("Workplace_Page", "refreshWorkplaceHome");
        C27986a aVar = this.f69979d;
        if (aVar != null) {
            aVar.requestWorkplaceHomeNetworkData();
        } else {
            C28184h.m103250d("Workplace_Page", "viewmodel is null when refreshWorkplaceHome");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        LiveData<WorkplaceHomeData> workplaceHomeLiveData;
        BizPopupsHelper.f69630a.mo99360a();
        super.onDestroy();
        C28184h.m103250d("Workplace_Page", "onDestroy>>>");
        m102146t();
        C27986a aVar = this.f69979d;
        if (aVar != null && (workplaceHomeLiveData = aVar.getWorkplaceHomeLiveData()) != null) {
            workplaceHomeLiveData.mo5922a(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C28184h.m103250d("Workplace_Page", "onResume>>>");
        if (getUserVisibleHint()) {
            mo99711f();
            m102147u();
            mo99716k();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public /* synthetic */ void m102129A() {
        String str;
        OPMonitor monitorCode = C27700a.m101232a("op_workplace_event").setMonitorCode(C27702b.f69231b);
        if (this.f69994s) {
            str = "error_retry";
        } else {
            str = "cold_boot";
        }
        monitorCode.addCategoryValue("render_scene", str).flush();
        this.f69994s = false;
    }

    /* renamed from: l */
    private void m102138l() {
        mo99707a(true);
        this.f69977b.mo99180j();
        this.f69977b.mo99170a(new C27797h(getContext(), this.f69976a));
        this.f69977b.mo99170a(new C27790b(getContext()));
        this.f69976a.mo99191a(this.f69977b);
    }

    /* renamed from: q */
    private boolean m102143q() {
        Locale a = C27548m.m100547m().mo98218b().mo98170a();
        if (a == null) {
            C28184h.m103248b("Workplace_Page", "locale is null.");
            return false;
        } else if (C28183g.m103243a(a) || C28183g.m103244b(a)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: s */
    private void m102145s() {
        this.f69999x = new C27881a.AbstractC27890a() {
            /* class com.ss.android.appcenter.business.tab.fragmentv2.C27973a.C279752 */

            @Override // com.ss.android.appcenter.business.tab.business.push.C27881a.AbstractC27890a
            /* renamed from: a */
            public void mo99412a(String str) {
                try {
                    C28184h.m103250d("Workplace_Page", "workplace refresh push:" + str + " oldTs:" + C27973a.this.f69985j + " isVisibleToUser" + C27973a.this.f69982g);
                    long longValue = Long.valueOf(str).longValue();
                    if (longValue > C27973a.this.f69985j) {
                        if (C27973a.this.f69982g) {
                            C27973a.this.mo99711f();
                        }
                        C27973a.this.f69985j = longValue;
                    }
                } catch (NumberFormatException unused) {
                    C28184h.m103250d("Workplace_Page", "workplace push ts invalid");
                }
            }
        };
        C27881a.m101794a().mo99406a(this.f69999x);
        this.f70000y = new C27881a.AbstractC27891b() {
            /* class com.ss.android.appcenter.business.tab.fragmentv2.C27973a.C279763 */

            @Override // com.ss.android.appcenter.business.tab.business.push.C27881a.AbstractC27891b
            /* renamed from: a */
            public void mo99413a(List<WidgetData> list) {
                if (C27973a.this.f69980e != null) {
                    C27973a.this.f69980e.onPush(list);
                }
            }
        };
        C27881a.m101794a().mo99407a(this.f70000y);
    }

    /* renamed from: v */
    private void m102148v() {
        C28184h.m103250d("Workplace_Page", "period showError>>>");
        this.f69991p.setVisibility(8);
        this.f69984i.mo100034a(StatusController.Status.ERROR, new StatusController.AbstractC28104a() {
            /* class com.ss.android.appcenter.business.tab.fragmentv2.$$Lambda$a$7leOhGe0yoT2Kd7rq1iOs1uaRc */

            @Override // com.ss.android.appcenter.business.view.StatusController.AbstractC28104a
            public final void onStatusChanged() {
                C27973a.this.m102129A();
            }
        });
        this.f69993r = false;
        this.f69986k.mo98256c("Workplace_Page", "period showError.");
        m102135c(false);
        m102130a(this.f69986k.mo98249a());
        m102151y();
        m102152z();
    }

    /* renamed from: x */
    private void m102150x() {
        C28184h.m103250d("Workplace_Page", "period showGuide");
        this.f69991p.setVisibility(8);
        this.f69984i.mo100033a(StatusController.Status.GUIDE);
        this.f69986k.mo98256c("Workplace_Page", "period showGuide.");
        this.f69993r = false;
        this.f69994s = false;
        m102151y();
        m102152z();
    }

    /* renamed from: h */
    public void mo99713h() {
        C28184h.m103250d("Workplace_Page", "period showContent>>>");
        this.f69991p.setVisibility(8);
        this.f69984i.mo100033a(StatusController.Status.CONTENT);
        m102149w();
        m102135c(true);
        m102130a(this.f69986k.mo98249a());
        this.f69993r = false;
        this.f69994s = false;
    }

    /* renamed from: i */
    public void mo99714i() {
        C28184h.m103250d("Workplace_Page", "period showImgLoading");
        this.f69991p.setVisibility(8);
        if (this.f69984i.mo100040d()) {
            C28184h.m103250d("Workplace_Page", "has already show content");
        } else if (this.f69984i.mo100042f()) {
            C27710b.m101318r("OnboardingToImgLoading");
        } else {
            this.f69984i.mo100033a(StatusController.Status.LOADING);
        }
    }

    /* renamed from: k */
    public void mo99716k() {
        FragmentActivity activity;
        Window window;
        View decorView;
        if (!this.f69989n && !this.f69988m && getUserVisibleHint() && (activity = getActivity()) != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            BizPopupsHelper.f69630a.mo99361a(this, decorView);
        }
    }

    /* renamed from: m */
    private void m102139m() {
        if (getActivity() == null) {
            C28184h.m103248b("Workplace_Page", "initViewModel>>> getActivity is null.");
            return;
        }
        this.f69979d = (C27986a) aj.m5364a(this).mo6005a(C27986a.class);
        m102140n();
        m102141o();
        m102142p();
        C27971l lVar = (C27971l) aj.m5364a(this).mo6005a(C27971l.class);
        this.f69980e = lVar;
        lVar.init(true);
        this.f69990o.mo99768a(this.f69980e);
        this.f69986k.mo98251a("Workplace_Page", "initViewModel>>> period request finish.", "initFinish");
    }

    /* renamed from: w */
    private void m102149w() {
        int i;
        if (this.f69993r) {
            OPMonitor addCategoryValue = C27700a.m101232a("op_workplace_event").setMonitorCode(C27702b.f69230a).addCategoryValue("render_scene", "cold_boot");
            Boolean bool = this.f69995t;
            if (bool == null || !bool.booleanValue()) {
                i = 0;
            } else {
                i = 1;
            }
            OPMonitor addCategoryValue2 = addCategoryValue.addCategoryValue("use_cache", Integer.valueOf(i));
            Map<String, Long> b = this.f69986k.mo98253b();
            for (String str : b.keySet()) {
                addCategoryValue2.addCategoryValue(str, b.get(str));
            }
            addCategoryValue2.flush();
        } else if (this.f69994s) {
            C27700a.m101232a("op_workplace_event").setMonitorCode(C27702b.f69230a).addCategoryValue("render_scene", "error_retry").flush();
        }
    }

    /* renamed from: b */
    public void mo99710b(boolean z) {
        C27900a aVar = this.f69987l;
        if (aVar != null) {
            aVar.mo99474a(z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.appcenter.business.tab.fragmentv2.a$a */
    public static class HandlerC27985a extends Handler {

        /* renamed from: a */
        private final WeakReference<C27973a> f70026a;

        public HandlerC27985a(C27973a aVar) {
            this.f70026a = new WeakReference<>(aVar);
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            C27973a aVar = this.f70026a.get();
            int i = message.what;
            if (i != 8) {
                if (i == 16) {
                    C28184h.m103250d("UIHandler", "handleMessage>>> MSG_SHOW_TIP_BUBBLE");
                    if (aVar != null && aVar.isAdded() && aVar.f69979d != null && aVar.f69979d.showTipButtonBubblt()) {
                        aVar.mo99709b(aVar.f69979d.getOperationalConfig());
                    }
                }
            } else if (aVar != null && aVar.isAdded() && aVar.f69979d != null && aVar.f69979d.haveRecommendAppsToInstall()) {
                aVar.mo99710b(true);
                aVar.mo99708a(false, aVar.f69979d.getOperationalConfig());
            }
        }
    }

    /* renamed from: a */
    private void m102130a(long j) {
        if (!this.f69997v) {
            this.f69997v = true;
            C27710b.m101255a(j);
        }
    }

    /* renamed from: c */
    private void m102133c(View view) {
        view.findViewById(R.id.container).setPadding(0, this.f69976a.mo99189a(), 0, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m102136d(View view) {
        C28184h.m103250d("Workplace_Page", "click retry. showLoading");
        mo99714i();
        mo99711f();
        this.f69994s = true;
    }

    /* renamed from: c */
    private void m102134c(final OperationalConfigData operationalConfigData) {
        final String operationalType = operationalConfigData.getOperationalType();
        C28184h.m103250d("Workplace_Page", "addTipTitleButton>>> type:" + operationalType);
        this.f69977b.mo99170a(new C27798i(getContext(), new View.OnClickListener() {
            /* class com.ss.android.appcenter.business.tab.fragmentv2.C27973a.AnonymousClass10 */

            /* renamed from: a */
            private void m102172a(String str) {
                C27548m.m100547m().mo98222f().mo98206c(C27973a.this.getContext(), str);
            }

            public void onClick(View view) {
                if (operationalConfigData.haveRecommendAppsToInstall()) {
                    C27973a.this.f69981f.sendEmptyMessage(8);
                } else {
                    m102172a(operationalConfigData.getOperationActivity().getMobileUrl());
                }
                C27710b.m101320t(operationalType);
            }
        }));
        this.f69976a.mo99191a(this.f69977b);
        C27710b.m101319s(operationalType);
    }

    /* renamed from: d */
    private void m102137d(boolean z) {
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

    /* renamed from: a */
    public void mo99707a(boolean z) {
        this.f69977b.mo99175a(z);
        if (z) {
            this.f69976a.mo99192a(false);
        } else {
            this.f69976a.mo99194b(false);
        }
    }

    /* renamed from: b */
    public void mo99709b(final OperationalConfigData operationalConfigData) {
        C28184h.m103250d("Workplace_Page", "showTipButtonBubble>>>");
        if (this.f69987l == null) {
            this.f69987l = new C27900a(getContext(), this);
        }
        final View b = this.f69977b.mo99176b(1);
        if (b == null) {
            C28184h.m103248b("Workplace_Page", "no tip button when bubble show.");
            return;
        }
        this.f69987l.mo99476b(true);
        b.post(new Runnable() {
            /* class com.ss.android.appcenter.business.tab.fragmentv2.C27973a.AnonymousClass11 */

            public void run() {
                C28184h.m103250d("Workplace_Page", "showTipButtonBubble>>> run post task");
                C27973a.this.f69987l.mo99473a(b, operationalConfigData);
                C27973a.this.f69987l.mo99476b(false);
            }
        });
        this.f70001z.setOnAnyTouchEventListener(new TouchDetectFrameLayout.AbstractC27680a() {
            /* class com.ss.android.appcenter.business.tab.fragmentv2.C27973a.AnonymousClass12 */

            @Override // com.ss.android.appcenter.business.activity.appsort.TouchDetectFrameLayout.AbstractC27680a
            /* renamed from: a */
            public void mo98630a(MotionEvent motionEvent) {
                C27973a.this.mo99710b(false);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        C28184h.m103250d("Workplace_Page", "path appcenterfragment setUserVisibleHint:" + z);
        this.f69982g = z;
        m102137d(z);
        if (!z) {
            mo99710b(true);
        }
        if (!z && this.f69988m) {
            C27710b.m101318r("OnboardingSwitchToOtherTab");
        }
        mo99716k();
    }

    /* renamed from: a */
    private void m102131a(View view) {
        this.f69983h = (WorkplaceLoadingView) view.findViewById(R.id.loading);
        this.f69984i = new StatusController(view.findViewById(R.id.recycler), view.findViewById(R.id.error), new StatusController.AbstractC28105b() {
            /* class com.ss.android.appcenter.business.tab.fragmentv2.C27973a.C279741 */

            @Override // com.ss.android.appcenter.business.view.StatusController.AbstractC28105b
            /* renamed from: a */
            public void mo98317a() {
                C27973a.this.f69983h.setVisibility(0);
                C27582j.m100671a(true, C27973a.this.f69983h.getLottieAnimationView());
            }

            @Override // com.ss.android.appcenter.business.view.StatusController.AbstractC28105b
            /* renamed from: b */
            public void mo98318b() {
                C27582j.m100671a(false, C27973a.this.f69983h.getLottieAnimationView());
                C27973a.this.f69983h.setVisibility(8);
            }
        });
        WorkplaceGuideView workplaceGuideView = (WorkplaceGuideView) view.findViewById(R.id.guide);
        workplaceGuideView.mo100452a();
        this.f69984i.mo100032a(workplaceGuideView, StatusController.Status.GUIDE);
        OnboardingView onboardingView = (OnboardingView) view.findViewById(R.id.install_onboarding);
        this.f69992q = onboardingView;
        this.f69984i.mo100032a(onboardingView, StatusController.Status.ONBOARDING);
        view.postDelayed(new Runnable() {
            /* class com.ss.android.appcenter.business.tab.fragmentv2.C27973a.RunnableC279795 */

            public void run() {
                C28184h.m103250d("Workplace_Page", "delay>>> try showImageLoading");
                if (C27973a.this.f69984i.mo100037a() && C27973a.this.f69982g) {
                    C28184h.m103250d("Workplace_Page", "delay>>> now is uninit");
                    C27973a.this.mo99714i();
                }
            }
        }, 500);
    }

    /* renamed from: b */
    private void m102132b(View view) {
        view.findViewById(R.id.error).setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.appcenter.business.tab.fragmentv2.$$Lambda$a$FrM5TsfNK7lD0rW2IC6u8gMyo58 */

            public final void onClick(View view) {
                C27973a.this.m102136d((C27973a) view);
            }
        });
        this.f70001z = (TouchDetectFrameLayout) view.findViewById(R.id.workplace_fragment_container);
        this.f69978c = (BannerRecyclerView) view.findViewById(R.id.recycler);
        this.f69991p = (TextView) view.findViewById(R.id.text_loading);
        C27995b bVar = new C27995b(getContext(), this, this.f69978c);
        this.f69990o = bVar;
        this.f69978c.setLayoutManager(bVar.mo99767a(getContext()));
        this.f69978c.setAdapter(this.f69990o);
        this.f69978c.setItemAnimator(null);
        this.f69978c.setFocusableInTouchMode(false);
        this.f69978c.mo100420a(new BannerRecyclerView.AbstractC28212a() {
            /* class com.ss.android.appcenter.business.tab.fragmentv2.C27973a.C279806 */

            @Override // com.ss.android.appcenter.common.view.BannerRecyclerView.AbstractC28212a
            /* renamed from: b */
            public void mo99722b() {
                C28184h.m103250d("Workplace_Page", "workplace onFirstAppShowed");
            }

            @Override // com.ss.android.appcenter.common.view.BannerRecyclerView.AbstractC28212a
            /* renamed from: a */
            public void mo99721a() {
                C27973a.this.f69986k.mo98252a("Workplace_Page", "period onFirstFrameShowed.", "renderFirstFrame", "renderEnd");
                if (!C27973a.this.f69984i.mo100042f()) {
                    C27973a.this.mo99713h();
                    C28184h.m103250d("Workplace_Page", "workplace onFirstFrameShowed.");
                }
            }
        });
        m102133c(view);
        m102138l();
    }

    /* renamed from: c */
    private void m102135c(boolean z) {
        if (this.f69996u) {
            return;
        }
        if (z) {
            this.f69996u = true;
            C27710b.m101268a(true);
            return;
        }
        C27710b.m101268a(false);
    }

    /* renamed from: a */
    public void mo99705a(OperationalConfigData operationalConfigData) {
        boolean q = m102143q();
        C28184h.m103250d("Workplace_Page", "OperationalConfigData>>> handle." + operationalConfigData + " localeEnable:" + q);
        if (q) {
            if (operationalConfigData.showTipTitleButton()) {
                m102134c(operationalConfigData);
            } else {
                m102144r();
            }
        }
        if (operationalConfigData.showOnboardingInstallApps()) {
            C27710b.m101318r("ShowOnboardingInstallApps");
            mo99708a(true, operationalConfigData);
            return;
        }
        mo99716k();
        if (q && operationalConfigData.showTipButtonBubble()) {
            mo99709b(operationalConfigData);
        }
    }

    /* renamed from: a */
    public void mo99706a(WorkplaceHomeData workplaceHomeData) {
        int i;
        C27548m.m100547m().mo98227k().mo98188a();
        C28184h.m103250d("Workplace_Page", "handleWorkplaceHomeData>>>");
        this.f69986k.mo98251a("Workplace_Page", "period handleWorkplaceHomeData.", "receiveData");
        if (workplaceHomeData != null) {
            if (this.f69995t == null) {
                this.f69995t = Boolean.valueOf(workplaceHomeData.isFromCache());
            }
            C28000b bVar = new C28000b(workplaceHomeData);
            if (workplaceHomeData.isDataEmpty()) {
                C28184h.m103250d("Workplace_Page", "handleWorkplaceHomeData>>> data is empty. showGuide.");
                m102150x();
                return;
            }
            if (bVar.mo99802a() && this.f69979d.getCategoryData() != null) {
                bVar.mo99801a(this.f69979d.getCategoryData());
            }
            this.f69990o.mo99769a(bVar);
            if (getView() != null) {
                i = getView().getMeasuredHeight();
            } else {
                i = 0;
            }
            this.f69990o.mo99773e(i - this.f69976a.mo99189a());
            if (this.f69984i.mo100042f()) {
                C28184h.m103250d("Workplace_Page", "handleWorkplaceHomeData>>> showContent when onboarding status. skip.");
            } else if (this.f69993r) {
                C28184h.m103250d("Workplace_Page", "handleWorkplaceHomeData>>> coldBoot, let rv draw.");
                this.f69978c.setVisibility(0);
            } else {
                C28184h.m103250d("Workplace_Page", "handleWorkplaceHomeData>>> showContent.");
                mo99713h();
            }
            this.f69979d.setHasShowContent(true);
            this.f69985j = workplaceHomeData.getTimeStamp();
        } else if (this.f69979d.needShowError()) {
            this.f69979d.setHasShowContent(false);
            C28184h.m103250d("Workplace_Page", "handleWorkplaceHomeData>>> data is null. showError.");
            if (this.f69984i.mo100042f()) {
                C27710b.m101318r("OnboardingToError");
            } else {
                m102148v();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m102131a(view);
        m102132b(view);
        m102139m();
        m102145s();
        this.f69998w = true;
        this.f69988m = false;
    }

    public C27973a(Context context, ITitleController iTitleController) {
        this.f69986k = new C27576e(true);
        this.f69989n = false;
        C28184h.m103250d("Workplace_Page", "Constructor AppCenterFragmentV2");
        if (iTitleController == null) {
            C28184h.m103248b("Workplace_Page", "ITitleController is null");
            this.f69976a = new C27795f();
        } else {
            this.f69976a = iTitleController;
        }
        this.f69977b = new C27789a(context);
    }

    /* renamed from: a */
    public void mo99708a(final boolean z, OperationalConfigData operationalConfigData) {
        C28184h.m103250d("Workplace_Page", "changeToOnboarding.");
        this.f69991p.setVisibility(8);
        this.f69984i.mo100033a(StatusController.Status.ONBOARDING);
        this.f69993r = false;
        this.f69994s = false;
        if (z) {
            this.f69988m = true;
        }
        this.f69992q.mo99341a(getContext(), z, operationalConfigData, new OnboardingView.AbstractC27851b() {
            /* class com.ss.android.appcenter.business.tab.fragmentv2.C27973a.C279774 */

            @Override // com.ss.android.appcenter.business.tab.business.onboarding.OnboardingView.AbstractC27851b
            /* renamed from: a */
            public void mo99352a(List<OnboardingAppInfo> list) {
                AppPrivacyActivity.m100994a(C27973a.this.getContext(), list);
            }

            @Override // com.ss.android.appcenter.business.tab.business.onboarding.OnboardingView.AbstractC27851b
            /* renamed from: a */
            public void mo99353a(final boolean z) {
                C28184h.m103250d("Workplace_Page", "finishOnboarding. showContent.");
                C27973a.this.f69988m = false;
                if (C27973a.this.getActivity() != null) {
                    C27973a.this.getActivity().runOnUiThread(new Runnable() {
                        /* class com.ss.android.appcenter.business.tab.fragmentv2.C27973a.C279774.RunnableC279781 */

                        public void run() {
                            if (C27973a.this.mo99715j()) {
                                C27973a.this.mo99713h();
                            } else {
                                C27973a.this.mo99714i();
                                C27973a.this.mo99711f();
                            }
                            C27973a.this.mo99707a(true);
                            if (z) {
                                C27973a.this.mo99712g();
                            } else if (z) {
                                C27973a.this.f69981f.sendEmptyMessage(16);
                            }
                        }
                    });
                } else {
                    C28184h.m103250d("Workplace_Page", "finishOnboarding. getActivity is null.");
                }
            }
        });
        mo99707a(false);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C28082d.m102671g().mo99980f();
        this.f69986k.mo98250a("Workplace_Page", "inflateLayout>>>");
        this.f69998w = false;
        this.f69993r = true;
        this.f69981f = new HandlerC27985a(this);
        View inflate = layoutInflater.inflate(R.layout.appcenter_fragment_layout2, viewGroup, false);
        this.f69986k.mo98251a("Workplace_Page", "period sync inflate finish", "syncInflate");
        return inflate;
    }
}
