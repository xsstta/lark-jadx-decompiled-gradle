package com.ss.android.vc.meeting.module.follow;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.larksuite.framework.thread.C26171w;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60740ad;
import com.ss.android.vc.common.p3083e.C60741ae;
import com.ss.android.vc.common.p3083e.C60748b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.utils.VCDialogUtils;
import com.ss.android.vc.common.widget.LoadingLottieView;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.follow.FollowInfo;
import com.ss.android.vc.meeting.module.base.content.AbstractC61422a;
import com.ss.android.vc.meeting.module.base.content.AbstractC61423b;
import com.ss.android.vc.meeting.module.base.content.ContentViewType;
import com.ss.android.vc.meeting.module.bottombar.AbstractC61444a;
import com.ss.android.vc.meeting.module.follow.AbstractC61751a;
import com.ss.android.vc.meeting.module.follow.FollowControl;
import com.ss.android.vc.meeting.module.follow.agent.FollowExternalPermsViewControl;
import com.ss.android.vc.meeting.module.follow.agent.IFollowExternalPermsViewControl;
import com.ss.android.vc.meeting.module.follow.common.FollowConfig;
import com.ss.android.vc.meeting.module.follow.p3120a.AbstractC61767j;
import com.ss.android.vc.meeting.module.follow.p3120a.AbstractC61768k;
import com.ss.android.vc.meeting.module.follow.p3120a.AbstractC61769l;
import com.ss.android.vc.meeting.module.follow.p3120a.AbstractC61770m;
import com.ss.android.vc.meeting.module.follow.p3120a.C61760c;
import com.ss.android.vc.meeting.module.follow.p3120a.C61762d;
import com.ss.android.vc.meeting.module.follow.p3120a.C61764f;
import com.ss.android.vc.meeting.module.follow.p3120a.C61766h;
import com.ss.android.vc.meeting.module.landscapefloater.LandscapeFloatToolbarViewControl;
import com.ss.android.vc.meeting.module.p3130k.C61999a;
import com.ss.android.vc.meeting.module.topbar.AbstractC63441a;
import com.ss.android.vc.meeting.utils.C63489e;
import com.ss.android.vc.statistics.event.C63771t;
import com.ss.android.vc.statistics.event.C63775w;
import com.ss.android.vc.statistics.event2.MeetingMagicShareEvent;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.vc.meeting.module.follow.b */
public class C61771b extends AbstractC61422a implements IFollowContainerEventProcessor, AbstractC61751a.AbstractC61753b, AbstractC61751a.AbstractC61754c {

    /* renamed from: b */
    public View f155015b;

    /* renamed from: c */
    private View f155016c;

    /* renamed from: d */
    private LoadingLottieView f155017d;

    /* renamed from: e */
    private AbstractC61769l f155018e;

    /* renamed from: f */
    private AbstractC61767j f155019f;

    /* renamed from: g */
    private AbstractC61768k f155020g;

    /* renamed from: h */
    private AbstractC61807d f155021h;

    /* renamed from: i */
    private IFollowExternalPermsViewControl f155022i;

    /* renamed from: j */
    private LandscapeFloatToolbarViewControl f155023j;

    /* renamed from: k */
    private AbstractC61770m f155024k;

    /* renamed from: l */
    private final List<WeakReference<View>> f155025l = new CopyOnWriteArrayList();

    @Override // com.ss.android.vc.meeting.module.base.content.AbstractC61422a
    /* renamed from: h */
    public boolean mo212887h() {
        return false;
    }

    @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a.AbstractC61753b
    /* renamed from: a */
    public AbstractC61768k mo213915a() {
        return this.f155020g;
    }

    @Override // com.ss.android.vc.meeting.module.base.content.AbstractC61422a
    /* renamed from: g */
    public ContentViewType mo212886g() {
        return ContentViewType.MAGIC_SHARE;
    }

    @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a.AbstractC61754c
    /* renamed from: m */
    public void mo213934m() {
        mo213912n();
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void onResume() {
        super.onResume();
    }

    @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a.AbstractC61754c
    /* renamed from: i */
    public void mo213929i() {
        AbstractC61769l lVar = this.f155018e;
        if (lVar != null) {
            lVar.mo213987j();
        }
    }

    @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a.AbstractC61754c, com.ss.android.vc.meeting.module.base.AbstractC61424d
    public boolean isFollowPage() {
        return this.f154014a.mo212924i();
    }

    @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a.AbstractC61754c
    /* renamed from: k */
    public void mo213932k() {
        AbstractC61769l lVar = this.f155018e;
        if (lVar != null) {
            lVar.mo213984g();
        }
    }

    @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a.AbstractC61754c
    /* renamed from: l */
    public void mo213933l() {
        AbstractC61768k kVar = this.f155020g;
        if (kVar != null) {
            kVar.mo213959a();
        }
    }

    @Override // com.ss.android.vc.meeting.module.follow.IFollowContainerEventProcessor
    /* renamed from: n */
    public void mo213912n() {
        AbstractC61769l lVar = this.f155018e;
        if (lVar != null) {
            lVar.mo213986i();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ void m241261o() {
        getActivity().setRequestedOrientation(8);
    }

    @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a.AbstractC61754c
    /* renamed from: j */
    public void mo213931j() {
        AbstractC61769l lVar = this.f155018e;
        if (lVar != null) {
            lVar.mo213985h();
        }
        mo213917a(FollowControl.FollowDirection.NONE);
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void onStart() {
        C60700b.m235851b("FollowLog_FollowContentViewControl", "[onStart]", "onStart");
        super.onStart();
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void onStop() {
        C60700b.m235851b("FollowLog_FollowContentViewControl", "[onStop]", "onStop");
        super.onStop();
    }

    @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a.AbstractC61754c
    public void bH_() {
        C60700b.m235851b("FollowLog_FollowContentViewControl", "[showPage]", "start");
        bR_();
        getRootView().findViewById(R.id.container_share_toolbar).setVisibility(0);
    }

    @Override // com.ss.android.vc.meeting.module.base.content.AbstractC61422a, com.ss.android.vc.meeting.basedialog.FullScreen.AbstractC61214a
    public boolean bS_() {
        super.bS_();
        C60700b.m235851b("FollowLog_FollowContentViewControl", "[onBackPressed]", "onBackPressed");
        return getMeeting().ab().mo213886l();
    }

    @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a.AbstractC61754c
    /* renamed from: d */
    public void mo213926d() {
        boolean e = getMeeting().ay().mo216074e();
        boolean a = getMeeting().aj().mo216408a();
        C60700b.m235851b("FollowLog_FollowContentViewControl", "[closePage]", String.format("isSharingScreen=%s", Boolean.valueOf(e)));
        if (!e && !a) {
            getMeeting().aw().mo216154i();
        }
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void destroy() {
        C60700b.m235851b("FollowLog_FollowContentViewControl", "[destroy]", "clearFollowContentViewControl");
        mo212885f();
        getMeeting().ab().mo213868b(this);
        AbstractC61807d dVar = this.f155021h;
        if (dVar != null) {
            dVar.destroy();
            this.f155021h = null;
        }
        super.destroy();
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void init() {
        C60700b.m235851b("FollowLog_FollowContentViewControl", "[init]", "and setFollowContentViewControl]");
        getMeeting().ab().mo213858a(this);
        if (!FollowConfig.m241446b()) {
            this.f155021h = new FollowInMeetingViewControl(this.mPresent);
        }
    }

    @Override // com.ss.android.vc.meeting.module.base.content.AbstractC61422a
    /* renamed from: e */
    public View mo212884e() {
        C60700b.m235851b("FollowLog_FollowContentViewControl", "[createContentView]", "createContentView");
        View a = C60748b.m236068a(ar.m236694a(), R.layout.follow_content_viewcontrol_layout, null, false);
        this.f155015b = a;
        ((FollowContentViewControlContainer) a.findViewById(R.id.follow_content_viewcontrol_container)).setInterceptChecker(this);
        if (getContext() != null) {
            this.f155018e = new C61764f(getContext(), getMeeting(), (ViewGroup) getRootView().findViewById(R.id.container_share_toolbar), this.f154014a, this);
            this.f155024k = new C61766h(getContext(), getMeeting(), (ViewGroup) getRootView().findViewById(R.id.container_follow_tip));
            this.f155020g = new C61762d(getContext(), getMeeting(), this.f155015b);
        }
        this.f155019f = new C61760c(getMeeting(), this.f155015b);
        this.f155022i = new FollowExternalPermsViewControl(getMeeting(), this.f155015b);
        this.f155023j = new LandscapeFloatToolbarViewControl(this.f154014a);
        this.f155015b.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            /* class com.ss.android.vc.meeting.module.follow.C61771b.ViewTreeObserver$OnGlobalLayoutListenerC617721 */

            public void onGlobalLayout() {
                if (C61771b.this.getMeeting() != null && C61771b.this.getMeeting().mo212056e() != null && C61771b.this.f155015b != null) {
                    C61771b.this.f155015b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    C63771t.m250372a(C61771b.this.getMeeting().mo212056e(), C61771b.this.getMeeting().ab().mo213882h(), C61771b.this.f155015b.getMeasuredWidth(), C61771b.this.f155015b.getMeasuredHeight());
                }
            }
        });
        return this.f155015b;
    }

    @Override // com.ss.android.vc.meeting.module.base.content.AbstractC61422a
    /* renamed from: f */
    public void mo212885f() {
        boolean z;
        C60700b.m235851b("FollowLog_FollowContentViewControl", "[destroyContentView]", "show");
        getMeeting().ab().mo213857a(FollowControl.PageStatus.AUTO_CLOSE);
        AbstractC61769l lVar = this.f155018e;
        if (lVar != null) {
            lVar.mo213987j();
            this.f155018e.mo213983f();
            this.f155018e.mo213973a();
        }
        AbstractC61770m mVar = this.f155024k;
        if (mVar != null) {
            mVar.mo213994a();
        }
        LandscapeFloatToolbarViewControl bVar = this.f155023j;
        if (bVar != null) {
            bVar.destroy();
            this.f155023j = null;
        }
        IFollowExternalPermsViewControl iVar = this.f155022i;
        if (iVar != null) {
            iVar.mo213952c();
            this.f155022i = null;
        }
        getMeeting().ab().mo213866b();
        Fragment findFragmentById = this.f154014a.mo212889u().findFragmentById(R.id.follow_content_viewcontrol_container);
        C60700b.m235851b("FollowLog_FollowContentViewControl", "[destroyContentView2]", "find Fragment: " + findFragmentById);
        if (findFragmentById != null && findFragmentById.isAdded() && this.f154014a.mo212889u().equals(findFragmentById.getParentFragmentManager())) {
            FragmentTransaction beginTransaction = this.f154014a.mo212889u().beginTransaction();
            beginTransaction.remove(findFragmentById);
            beginTransaction.commitAllowingStateLoss();
        }
        AbstractC61768k kVar = this.f155020g;
        if (kVar != null) {
            kVar.mo213962b();
        }
        if (getMeeting().ah() != null) {
            AbstractC63441a ah = getMeeting().ah();
            if (DesktopUtil.m144307b() || !C61999a.m242220f()) {
                z = true;
            } else {
                z = false;
            }
            ah.mo219488d(z);
        }
        this.f155025l.add(new WeakReference<>(this.f155015b));
        this.f155018e = null;
        this.f155024k = null;
        this.f155019f = null;
        this.f155017d = null;
        this.f155020g = null;
        this.f155016c = null;
        this.f155015b = null;
    }

    @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a.AbstractC61754c
    /* renamed from: b */
    public void mo213922b(String str) {
        IFollowExternalPermsViewControl iVar = this.f155022i;
        if (iVar != null) {
            iVar.mo213949a(str);
        }
    }

    @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a.AbstractC61754c
    /* renamed from: c */
    public void mo213925c(boolean z) {
        AbstractC61770m mVar = this.f155024k;
        if (mVar != null) {
            mVar.mo213995a(z);
        }
    }

    public C61771b(AbstractC61423b bVar) {
        super(bVar);
        init();
    }

    /* renamed from: c */
    private void m241259c(String str) {
        VideoChatModuleDependency.getBrowserDependency().openUrlBrowser(getAppContext(), str);
    }

    @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a.AbstractC61754c
    /* renamed from: b */
    public void mo213923b(boolean z) {
        AbstractC61769l lVar = this.f155018e;
        if (lVar != null) {
            lVar.mo213979b(z);
        }
    }

    @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a.AbstractC61754c
    /* renamed from: a */
    public void mo213917a(FollowControl.FollowDirection followDirection) {
        AbstractC61767j jVar = this.f155019f;
        if (jVar != null) {
            jVar.mo213957a(followDirection);
        }
    }

    @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a.AbstractC61754c
    /* renamed from: e */
    public void mo213928e(boolean z) {
        AbstractC61769l lVar;
        if (getMeeting().ab().mo213882h() != null && getMeeting().ab().mo213882h().getShareType() != FollowInfo.ShareType.UNIVERSAL && !getMeeting().ab().mo213889o() && (lVar = this.f155018e) != null) {
            lVar.mo213976a(z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m241260f(boolean z) {
        int i;
        View view = this.f155015b;
        if (view != null) {
            if (this.f155016c == null) {
                C60740ad.m236052b((ViewStub) view.findViewById(R.id.stub_follow_request));
                this.f155016c = this.f155015b.findViewById(R.id.loading_request);
                this.f155017d = (LoadingLottieView) this.f155015b.findViewById(R.id.loadingView2);
            }
            View view2 = this.f155016c;
            int i2 = 0;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view2.setVisibility(i);
            LoadingLottieView loadingLottieView = this.f155017d;
            if (loadingLottieView != null) {
                if (!z) {
                    i2 = 8;
                }
                loadingLottieView.setVisibility(i2);
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a.AbstractC61754c
    /* renamed from: a */
    public void mo213916a(Fragment fragment) {
        C60700b.m235851b("FollowLog_FollowContentViewControl", "[showFollowRuntime]", "start");
        LandscapeFloatToolbarViewControl bVar = this.f155023j;
        if (bVar != null) {
            bVar.mo214408a(ContentViewType.MAGIC_SHARE);
        }
        for (WeakReference<View> weakReference : this.f155025l) {
            if (!(weakReference == null || weakReference.get() == null)) {
                C60740ad.m236044a(weakReference.get());
            }
        }
        if (!fragment.isAdded()) {
            FragmentTransaction beginTransaction = this.f154014a.mo212889u().beginTransaction();
            beginTransaction.replace(R.id.follow_content_viewcontrol_container, fragment);
            beginTransaction.commitAllowingStateLoss();
        }
        IFollowExternalPermsViewControl iVar = this.f155022i;
        if (iVar != null) {
            iVar.mo213953d();
        }
        MeetingMagicShareEvent.m249817a().mo220296a(getMeeting());
    }

    @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a.AbstractC61754c
    /* renamed from: d */
    public void mo213927d(boolean z) {
        int i;
        getMeeting().mo212107Y().mo218568f(z);
        boolean c = getMeeting().mo212107Y().mo218563c();
        C60700b.m235851b("FollowLog_FollowContentViewControl", "[onKeyboardStateChanged]", "keyBoardShow = " + z + ", mmBarShow = " + c);
        if (c) {
            getMeeting().mo212107Y().mo218567e(!z);
        }
        if (!C61999a.m242220f()) {
            getMeeting().ai().e_(!z);
        }
        ViewGroup viewGroup = (ViewGroup) getRootView().findViewById(R.id.container_share_toolbar);
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        viewGroup.setVisibility(i);
    }

    @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a.AbstractC61754c
    /* renamed from: a */
    public void mo213918a(String str) {
        AbstractC61769l lVar;
        if (!TextUtils.isEmpty(str) && (lVar = this.f155018e) != null) {
            lVar.mo213975a(str);
        }
    }

    @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a.AbstractC61754c
    /* renamed from: a */
    public void mo213920a(boolean z) {
        C26171w.m94675a(new Runnable(z) {
            /* class com.ss.android.vc.meeting.module.follow.$$Lambda$b$yrGRyiwYuwYY3sqzHfiogO7kbE */
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C61771b.this.m241260f(this.f$1);
            }
        });
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void onOrientation(boolean z, boolean z2) {
        boolean z3;
        if (DesktopUtil.m144307b() && C60773o.m236120a(getActivity())) {
            C60741ae.m236053a(new Runnable() {
                /* class com.ss.android.vc.meeting.module.follow.$$Lambda$b$ez64uMeKFgWjDk7dpCUXOOBz5UQ */

                public final void run() {
                    C61771b.this.m241261o();
                }
            });
        }
        boolean z4 = false;
        if (getMeeting().ai() != null) {
            AbstractC61444a ai2 = getMeeting().ai();
            if (!z || DesktopUtil.m144307b()) {
                z3 = true;
            } else {
                z3 = false;
            }
            ai2.e_(z3);
        }
        if (getMeeting().ah() != null) {
            AbstractC63441a ah = getMeeting().ah();
            if (DesktopUtil.m144307b() || !z) {
                z4 = true;
            }
            ah.mo219488d(z4);
        }
        AbstractC61769l lVar = this.f155018e;
        if (lVar != null) {
            lVar.mo213977a(z, z2);
        }
        AbstractC61767j jVar = this.f155019f;
        if (jVar != null) {
            jVar.mo213958a(z, z2);
        }
        AbstractC61768k kVar = this.f155020g;
        if (kVar != null) {
            kVar.mo213961a(z, z2);
        }
        LandscapeFloatToolbarViewControl bVar = this.f155023j;
        if (bVar != null) {
            bVar.onOrientation(z, z2);
        }
        IFollowExternalPermsViewControl iVar = this.f155022i;
        if (iVar != null) {
            iVar.mo213950a(z, z2);
        }
        if (getActivity() != null) {
            C63489e.m248808a(getActivity());
        }
    }

    @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a.AbstractC61754c
    /* renamed from: a */
    public void mo213919a(String str, String str2) {
        if (this.f155018e != null) {
            C60700b.m235851b("FollowLog_FollowContentViewControl", "[onRequestOpenLink]", String.format("url=%s, title=%s", str, str2));
            AbstractC61769l lVar = this.f155018e;
            if (!TextUtils.isEmpty(str2)) {
                str = str2;
            }
            lVar.mo213975a(str);
        }
    }

    @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a.AbstractC61754c
    /* renamed from: a */
    public void mo213921a(boolean z, String str) {
        if (z) {
            String mustacheFormat = UIHelper.mustacheFormat((int) R.string.View_MV_OpenLinkBrowser, "appName", VideoChatModuleDependency.getLarkAppDependency().mo196409b());
            String a = C60773o.m236119a((int) R.string.View_MV_FollowersCantSee);
            C63775w.m250397a();
            C60735ab.m236001a(new Runnable(mustacheFormat, a, str) {
                /* class com.ss.android.vc.meeting.module.follow.$$Lambda$b$o0p8KcxIuztWSdyockE5IyZp8 */
                public final /* synthetic */ String f$1;
                public final /* synthetic */ String f$2;
                public final /* synthetic */ String f$3;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                }

                public final void run() {
                    C61771b.this.m241258a((C61771b) this.f$1, this.f$2, this.f$3);
                }
            });
            return;
        }
        m241259c(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m241257a(String str, DialogInterface dialogInterface, int i) {
        C63775w.m250398a(true);
        m241259c(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m241258a(String str, String str2, String str3) {
        VCDialogUtils.m236216b((Context) getActivity(), str, 1, str2, (int) R.string.View_MV_CancelButtonTwo, (DialogInterface.OnClickListener) $$Lambda$b$T9fU0_KThT_dOsLABhsddERQ00.INSTANCE, (int) R.string.View_VM_OpenLink, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(str3) {
            /* class com.ss.android.vc.meeting.module.follow.$$Lambda$b$oKy9jTB7WOCs6b5A5hwKhvOYZVY */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C61771b.this.m241257a((C61771b) this.f$1, (String) dialogInterface, (DialogInterface) i);
            }
        }, false);
    }
}
