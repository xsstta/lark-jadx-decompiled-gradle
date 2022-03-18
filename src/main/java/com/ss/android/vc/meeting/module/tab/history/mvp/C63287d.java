package com.ss.android.vc.meeting.module.tab.history.mvp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.rxjava.C57865c;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.vc.VideoChatModule;
import com.ss.android.vc.common.lifecycle.VCAppLifeCycle;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.AbstractC60728a;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60785x;
import com.ss.android.vc.common.widget.LineHeightTextView;
import com.ss.android.vc.dependency.AbstractC60894j;
import com.ss.android.vc.dependency.VCNetworkLevel;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.ap;
import com.ss.android.vc.dependency.aq;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.tab.VCTabListHistoryListEntity;
import com.ss.android.vc.entity.tab.VCTabListItem;
import com.ss.android.vc.meeting.module.tab.history.mvp.C63278a;
import com.ss.android.vc.meeting.module.tab.history.mvp.C63287d;
import com.ss.android.vc.meeting.module.tab.history.mvp.VcTabListDataLoader;
import com.ss.android.vc.meeting.module.tab.history.p3171a.AbstractC63274a;
import com.ss.android.vc.meeting.module.tab.history.p3171a.C63276c;
import com.ss.android.vc.meeting.module.tab.history.p3171a.C63277d;
import com.ss.android.vc.meeting.module.tab.history.view.VcTabPageView;
import com.ss.android.vc.meeting.module.tab.history.view.VideoChatMainTabRelativeLayout;
import com.ss.android.vc.meeting.module.tab.widgets.PageLoadErrorView;
import com.ss.android.vc.service.C63634c;
import com.ss.android.vc.service.impl.VideoChatService;
import com.ss.android.vc.statistics.event.ce;
import com.ss.android.vc.statistics.event2.VCTabEvent;
import java.util.List;
import java.util.UUID;

/* renamed from: com.ss.android.vc.meeting.module.tab.history.mvp.d */
public class C63287d implements C63278a.AbstractC63281b {

    /* renamed from: a */
    public C63291e f159639a;

    /* renamed from: b */
    public PageLoadErrorView f159640b;

    /* renamed from: c */
    private final VideoChatMainTabRelativeLayout f159641c;

    /* renamed from: d */
    private ITitleController f159642d;

    /* renamed from: e */
    private View f159643e;

    /* renamed from: f */
    private View f159644f;

    /* renamed from: g */
    private View f159645g;

    /* renamed from: h */
    private View f159646h;

    /* renamed from: i */
    private View f159647i;

    /* renamed from: j */
    private LineHeightTextView f159648j;

    /* renamed from: k */
    private VcTabPageView f159649k;

    /* renamed from: l */
    private AbstractC63274a f159650l;

    /* renamed from: m */
    private C63277d f159651m;

    /* renamed from: n */
    private final ap f159652n = VideoChatModule.getDependency().getWschannelDependency();

    /* renamed from: o */
    private aq f159653o;

    /* renamed from: p */
    private LinearLayout f159654p;

    /* renamed from: q */
    private final String f159655q = UUID.randomUUID().toString();

    /* renamed from: r */
    private final AbstractC60894j f159656r = new AbstractC60894j() {
        /* class com.ss.android.vc.meeting.module.tab.history.mvp.C63287d.C632881 */

        @Override // com.ss.android.vc.dependency.AbstractC60894j
        public void onConnStateChanged(boolean z) {
            C60735ab.m236001a(new Runnable(z) {
                /* class com.ss.android.vc.meeting.module.tab.history.mvp.$$Lambda$d$1$qSEnv_EOW6Ut6SNUhvcjPXBhQ8 */
                public final /* synthetic */ boolean f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C63287d.C632881.this.m247917a(this.f$1);
                }
            });
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m247917a(boolean z) {
            C60700b.m235851b("VideoChatTab_VCTabHistoryView", "[onConnStateChanged]", "isConnected = " + z);
            if (!z) {
                C63287d.this.mo219010b();
            }
        }
    };

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m247890a(Boolean bool) {
    }

    @Override // com.ss.android.vc.meeting.module.tab.history.mvp.C63278a.AbstractC63281b
    /* renamed from: a */
    public void mo219008a(C63278a.AbstractC63279a aVar) {
    }

    /* renamed from: l */
    private boolean m247895l() {
        return C63634c.m249496b("byteview.callmeeting.android.lm_tab");
    }

    /* renamed from: p */
    private void m247899p() {
        this.f159652n.unRegisterNetworkLevelListener(this.f159653o);
    }

    @Override // com.ss.android.vc.meeting.module.tab.history.mvp.C63278a.AbstractC63281b
    /* renamed from: c */
    public View mo219011c() {
        return this.f159641c;
    }

    /* renamed from: e */
    public void mo219023e() {
        this.f159654p.setVisibility(0);
    }

    /* renamed from: f */
    public void mo219024f() {
        this.f159654p.setVisibility(8);
    }

    /* renamed from: n */
    private void m247897n() {
        VideoChatModule.m235665i().mo208191a(this.f159656r);
        this.f159653o = new aq() {
            /* class com.ss.android.vc.meeting.module.tab.history.mvp.$$Lambda$d$zQ5XhLlJ8cLveY21xxo3_KCY7No */

            @Override // com.ss.android.vc.dependency.aq
            public final void onNetworkLevelChanged(VCNetworkLevel vCNetworkLevel) {
                C63287d.this.m247889a((C63287d) vCNetworkLevel);
            }
        };
        m247898o();
    }

    /* renamed from: o */
    private void m247898o() {
        C60700b.m235851b("VideoChatTab_VCTabHistoryView", "[registerNetworkListener]", "registerNetworkListener");
        this.f159652n.registerNetworkLevelListener(this.f159653o);
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static /* synthetic */ Boolean m247900q() {
        VideoChatModule.m235659c().mo208161d(VCAppLifeCycle.m236256c());
        return true;
    }

    @Override // com.ss.android.vc.meeting.module.tab.history.mvp.C63278a.AbstractC63281b
    /* renamed from: a */
    public void mo219004a() {
        this.f159649k.mo219057a();
        this.f159649k.setVisibility(0);
        this.f159640b.setVisibility(8);
        this.f159649k.mo219060a(true);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        C60700b.m235851b("VideoChatTab_VCTabHistoryView", "[create]", "create");
        m247894k();
        m247897n();
        m247896m();
        this.f159639a.mo219033a(true, false);
        VCTabEvent.m249739a(this.f159655q);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        C60700b.m235851b("VideoChatTab_VCTabHistoryView", "[destroy]", "destroy");
        m247899p();
        VideoChatModule.m235665i().mo208199b(this.f159656r);
        this.f159639a = null;
        this.f159649k.mo219063d();
    }

    /* renamed from: g */
    public void mo219025g() {
        C60700b.m235851b("VideoChatTab_VCTabHistoryView", "[createMeeting]", "createMeeting");
        VCTabEvent.m249741a(this.f159655q, "new_meeting", "vc_meeting_pre_view");
        C57865c.m224574a($$Lambda$d$CFGVBkee41whOtLdJFK80K24JKM.INSTANCE, $$Lambda$d$YdYTmXXJG011VI6ZhuJY4orkhw.INSTANCE);
    }

    /* renamed from: h */
    public void mo219026h() {
        C60700b.m235851b("VideoChatTab_VCTabHistoryView", "[joinMeeting]", "joinMeeting");
        VCTabEvent.m249741a(this.f159655q, "join_meeting", "vc_meeting_pre_view");
        VideoChatService.m249602d().openJoinMeetingPage(ar.m236694a(), "tab_top_join_room");
    }

    /* renamed from: i */
    public void mo219027i() {
        C60700b.m235851b("VideoChatTab_VCTabHistoryView", "[localShare]", "localShare");
        VCTabEvent.m249741a(this.f159655q, "share_screen", "vc_meeting_sharewindow_view");
        VideoChatService.m249602d().openLocalSharePage(VCAppLifeCycle.m236256c(), "tab_top_share_screen");
    }

    /* renamed from: m */
    private void m247896m() {
        ITitleController iTitleController = this.f159642d;
        if (iTitleController != null) {
            iTitleController.mo99192a(false);
            this.f159651m.mo218975a(true);
            C63276c cVar = new C63276c(this.f159641c.getContext(), this.f159642d, this.f159651m);
            this.f159650l = cVar;
            cVar.mo218965a();
            this.f159650l.mo218967a(UIHelper.getString(R.string.View_MV_MeetingsTab));
            this.f159649k.setTitleBar(this.f159650l);
        }
        C60735ab.m235996a(new AbstractC60728a<Boolean>() {
            /* class com.ss.android.vc.meeting.module.tab.history.mvp.C63287d.C632903 */

            /* access modifiers changed from: protected */
            /* renamed from: c */
            public Boolean mo208348a() {
                return Boolean.valueOf(C60785x.m236238b());
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo208351b(Boolean bool) {
                super.mo208351b(bool);
                if (!bool.booleanValue()) {
                    C63287d.this.mo219023e();
                }
            }
        });
    }

    @Override // com.ss.android.vc.meeting.module.tab.history.mvp.C63278a.AbstractC63281b
    /* renamed from: b */
    public void mo219010b() {
        C60700b.m235851b("VideoChatTab_VCTabHistoryView", "[showErrorResultView]", "showErrorResultView");
        this.f159649k.mo219061b();
        this.f159649k.setVisibility(8);
        this.f159649k.mo219063d();
        this.f159640b.setVisibility(0);
        this.f159649k.mo219060a(false);
    }

    /* renamed from: j */
    public void mo219028j() {
        C60700b.m235851b("VideoChatTab_VCTabHistoryView", "[gotoLMPage]", "gotoLMPage");
        VCTabEvent.m249741a(this.f159655q, "lark_minutes", "vc_minutes_list_view");
        ce.m250274g();
        VideoChatModuleDependency.getMinutesDependency().mo196439a(this.f159641c.getContext());
    }

    /* renamed from: k */
    private void m247894k() {
        this.f159643e = this.f159641c.findViewById(R.id.layout_new_meeting);
        this.f159644f = this.f159641c.findViewById(R.id.layout_join_meeting);
        this.f159645g = this.f159641c.findViewById(R.id.layout_lark_minutes);
        this.f159648j = (LineHeightTextView) this.f159641c.findViewById(R.id.tv_lark_minutes);
        VcTabPageView vcTabPageView = (VcTabPageView) this.f159641c.findViewById(R.id.tag_page_view);
        this.f159649k = vcTabPageView;
        vcTabPageView.setRootView(this.f159641c);
        this.f159649k.setStatisticsId(this.f159655q);
        this.f159646h = this.f159641c.findViewById(R.id.layout_bt);
        this.f159654p = (LinearLayout) this.f159641c.findViewById(R.id.no_connection_layout);
        this.f159647i = this.f159641c.findViewById(R.id.layout_local_share);
        this.f159654p.setVisibility(8);
        this.f159649k.setDataLoader(new VcTabListDataLoader(this.f159639a));
        PageLoadErrorView pageLoadErrorView = (PageLoadErrorView) this.f159641c.findViewById(R.id.vc_tab_load_error_container);
        this.f159640b = pageLoadErrorView;
        pageLoadErrorView.setVisibility(8);
        this.f159640b.setTryReloadingClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.tab.history.mvp.C63287d.C632892 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                C63287d.this.f159640b.setVisibility(8);
                C63287d.this.f159639a.mo219033a(C63287d.this.f159639a.mo219031a().isEmpty(), false);
            }
        });
        mo219012d();
    }

    @Override // com.ss.android.vc.meeting.module.tab.history.mvp.C63278a.AbstractC63281b
    /* renamed from: d */
    public void mo219012d() {
        if (this.f159647i == null || this.f159643e == null || this.f159644f == null || this.f159645g == null) {
            C60700b.m235851b("VideoChatTab_VCTabHistoryView", "[refreshTabItem]", "some view is null, stop refresh");
        }
        if (C63634c.m249496b("byteview.callmeeting.android.screenshare_entry")) {
            this.f159647i.setVisibility(0);
        } else {
            this.f159647i.setVisibility(8);
        }
        if (this.f159642d != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f159646h.getLayoutParams();
            marginLayoutParams.topMargin = this.f159642d.mo99189a();
            this.f159646h.setLayoutParams(marginLayoutParams);
        }
        this.f159647i.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.tab.history.mvp.$$Lambda$d$sDGFyXeg9grcnYboMkqhoVy8Mhg */

            public final void onClick(View view) {
                C63287d.this.m247893d(view);
            }
        });
        this.f159643e.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.tab.history.mvp.$$Lambda$d$EG_fyKMvtXiDnRRk9XgIAWsH0 */

            public final void onClick(View view) {
                C63287d.this.m247892c(view);
            }
        });
        this.f159644f.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.tab.history.mvp.$$Lambda$d$WMlt9VLdtR7LzRxJHm5_EFyk0 */

            public final void onClick(View view) {
                C63287d.this.m247891b(view);
            }
        });
        if (m247895l()) {
            this.f159645g.setVisibility(0);
            this.f159645g.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.vc.meeting.module.tab.history.mvp.$$Lambda$d$yn6D7qlbu36EGHToPoxhq2WW94 */

                public final void onClick(View view) {
                    C63287d.this.m247888a((C63287d) view);
                }
            });
            this.f159648j.setText(UIHelper.mustacheFormat((int) R.string.View_G_MinutesAppName, "appName", UIHelper.getAppName()));
            return;
        }
        this.f159645g.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m247888a(View view) {
        mo219028j();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m247891b(View view) {
        mo219026h();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m247892c(View view) {
        mo219025g();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m247893d(View view) {
        mo219027i();
    }

    @Override // com.ss.android.vc.meeting.module.tab.history.mvp.C63278a.AbstractC63281b
    /* renamed from: a */
    public void mo219005a(ITitleController iTitleController) {
        this.f159642d = iTitleController;
        this.f159651m = new C63277d();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m247889a(VCNetworkLevel vCNetworkLevel) {
        C60700b.m235851b("VideoChatTab_VCTabHistoryView", "[onNetworkLevel]", "VCNetworkLevel: " + vCNetworkLevel);
        if (vCNetworkLevel == VCNetworkLevel.NET_UNAVAILABLE) {
            C60735ab.m236001a(new Runnable() {
                /* class com.ss.android.vc.meeting.module.tab.history.mvp.$$Lambda$R1gg_ULz0b7sFVJhJeV0oaCKGyo */

                public final void run() {
                    C63287d.this.mo219023e();
                }
            });
        } else {
            C60735ab.m236001a(new Runnable() {
                /* class com.ss.android.vc.meeting.module.tab.history.mvp.$$Lambda$z8Z3oRXbYwApbnMwIMyGocZ2Us */

                public final void run() {
                    C63287d.this.mo219024f();
                }
            });
        }
    }

    @Override // com.ss.android.vc.meeting.module.tab.history.mvp.C63278a.AbstractC63281b
    /* renamed from: a */
    public void mo219006a(VCTabListHistoryListEntity vCTabListHistoryListEntity) {
        C60700b.m235851b("VideoChatTab_VCTabHistoryView", "[showResultView]", "showResultView");
        this.f159649k.mo219058a(vCTabListHistoryListEntity);
    }

    @Override // com.ss.android.vc.meeting.module.tab.history.mvp.C63278a.AbstractC63281b
    /* renamed from: a */
    public void mo219007a(VcTabListDataLoader.LoadType loadType) {
        this.f159649k.mo219059a(loadType);
    }

    /* renamed from: a */
    public void setViewDelegate(C63278a.AbstractC63281b.AbstractC63282a aVar) {
        this.f159639a = (C63291e) aVar;
    }

    @Override // com.ss.android.vc.meeting.module.tab.history.mvp.C63278a.AbstractC63281b
    /* renamed from: a */
    public void mo219009a(List<VCTabListItem> list) {
        C60700b.m235851b("VideoChatTab_VCTabHistoryView", "[onPushHistoryListChanged]", "onPushHistoryListChanged");
        VcTabPageView vcTabPageView = this.f159649k;
        if (vcTabPageView != null) {
            vcTabPageView.mo219062c();
        }
    }

    public C63287d(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f159641c = (VideoChatMainTabRelativeLayout) layoutInflater.inflate(R.layout.tab_vc_fragment_layout, viewGroup, false);
    }
}
