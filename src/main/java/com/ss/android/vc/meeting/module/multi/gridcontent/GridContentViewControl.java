package com.ss.android.vc.meeting.module.multi.gridcontent;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.os.MessageQueue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.viewpager.widget.ViewPager;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60740ad;
import com.ss.android.vc.common.p3083e.C60748b;
import com.ss.android.vc.common.p3083e.C60752f;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.singleinstance.AbsSingleInstanceControl;
import com.ss.android.vc.common.widget.insta.InstagramDotView;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.meeting.DisplayMode;
import com.ss.android.vc.meeting.framework.meeting.rtcstream.IResumeSubscribeObserver;
import com.ss.android.vc.meeting.model.C61383d;
import com.ss.android.vc.meeting.model.C61388g;
import com.ss.android.vc.meeting.module.base.content.AbstractC61422a;
import com.ss.android.vc.meeting.module.base.content.AbstractC61423b;
import com.ss.android.vc.meeting.module.base.content.ContentViewType;
import com.ss.android.vc.meeting.module.floatingwindow.InMeetingFloatView;
import com.ss.android.vc.meeting.module.multi.InMeetingPageView;
import com.ss.android.vc.meeting.module.multi.gridcontent.AbsGridContentControl;
import com.ss.android.vc.meeting.module.multi.p3140a.AbstractC62485a;
import com.ss.android.vc.meeting.module.multi.presenter.InMeetingPresenter;
import com.ss.android.vc.meeting.module.multi.viewpager.IMeetingPageBuilder;
import com.ss.android.vc.meeting.module.multi.viewpager.InMeetingViewPager;
import com.ss.android.vc.meeting.module.multi.viewpager.MeetingPageAdapter;
import com.ss.android.vc.meeting.module.multi.viewpager.PageHolder;
import com.ss.android.vc.meeting.module.multi.viewstub.DesktopScrollBtnStubs;
import com.ss.android.vc.meeting.module.p3130k.C61999a;
import com.ss.android.vc.statistics.event.av;
import com.ss.android.vc.trace.VCLauncherStatistics;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\nH\u0002J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u001eH\u0016J\b\u0010#\u001a\u00020\u001eH\u0016J\b\u0010$\u001a\u00020\nH\u0016J\b\u0010%\u001a\u00020\u001eH\u0002J\b\u0010&\u001a\u00020'H\u0016J\n\u0010(\u001a\u0004\u0018\u00010\u0012H\u0002J\u0012\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020\bH\u0016J\b\u0010,\u001a\u00020\u001eH\u0016J\b\u0010-\u001a\u00020\u001eH\u0002J\b\u0010.\u001a\u00020\u001eH\u0002J\b\u0010/\u001a\u00020\u001eH\u0002J\b\u00100\u001a\u00020\nH\u0016J\b\u00101\u001a\u00020\nH\u0016J\b\u00102\u001a\u00020\u001eH\u0002J\u0018\u00103\u001a\u00020\u001e2\u0006\u00104\u001a\u00020\n2\u0006\u00105\u001a\u00020\nH\u0016J\b\u00106\u001a\u00020\u001eH\u0016J\u0010\u00107\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020\bH\u0016J\b\u00108\u001a\u00020\u001eH\u0016J\b\u00109\u001a\u00020\u001eH\u0016J\b\u0010:\u001a\u00020\u001eH\u0002J\b\u0010;\u001a\u00020\u001eH\u0002J\b\u0010<\u001a\u00020\u001eH\u0016J\b\u0010=\u001a\u00020\u001eH\u0002J\u0018\u0010>\u001a\u00020\u001e2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020@H\u0002J\u0010\u0010B\u001a\u00020\u001e2\u0006\u0010C\u001a\u00020DH\u0002R\u000e\u0010\u0007\u001a\u00020\bXD¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000¨\u0006E"}, d2 = {"Lcom/ss/android/vc/meeting/module/multi/gridcontent/GridContentViewControl;", "Lcom/ss/android/vc/meeting/module/base/content/BaseContentViewControl;", "Lcom/ss/android/vc/meeting/module/multi/gridcontent/AbsGridContentControl$IGridContentViewListener;", "Lcom/ss/android/vc/meeting/framework/meeting/rtcstream/IResumeSubscribeObserver;", "delegate", "Lcom/ss/android/vc/meeting/module/base/content/IContentViewDelegate;", "(Lcom/ss/android/vc/meeting/module/base/content/IContentViewDelegate;)V", "TAG", "", "completeStatisticLaunch", "", "deskScrollStub", "Lcom/ss/android/vc/meeting/module/multi/viewstub/DesktopScrollBtnStubs;", "gridByteRtcListener", "Lcom/ss/android/vc/meeting/module/multi/gridcontent/GridByteRtcListener;", "mActivity", "Landroid/app/Activity;", "mFv", "Lcom/ss/android/vc/meeting/module/floatingwindow/InMeetingFloatView;", "mFvContainer", "Landroid/view/ViewGroup;", "mIdleHandle", "Landroid/os/MessageQueue$IdleHandler;", "mInstagramDotView", "Lcom/ss/android/vc/common/widget/insta/InstagramDotView;", "mRootView", "mViewCreated", "mViewPagerAdapter", "Lcom/ss/android/vc/meeting/module/multi/viewpager/MeetingPageAdapter;", "activeViewPager", "", "canRefreshUi", "createContentView", "Landroid/view/View;", "destroy", "destroyContentView", "enableOrientation", "endLaunch", "getContentViewType", "Lcom/ss/android/vc/meeting/module/base/content/ContentViewType;", "getFloatView", "getPageViewByRtcJoinId", "Lcom/ss/android/vc/meeting/module/multi/InMeetingPageView;", "rtcJoinId", "init", "initFloatView", "initScrollButton", "initViewPager", "isActivityInvalid", "isViewValid", "onNewPageInfo", "onOrientation", "isLandscape", "isRotate", "onResumeSubscribe", "refreshGridViewByRtcJoinId", "refreshView", "refreshWhenGoToBackground", "reset", "rotateDotView", "showGridContent", "updateFloatView", "updateScrollButton", "itemCount", "", "position", "updateViewPagerMargin", "margin", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.multi.gridcontent.d */
public final class GridContentViewControl extends AbstractC61422a implements IResumeSubscribeObserver, AbsGridContentControl.IGridContentViewListener {

    /* renamed from: b */
    public final String f157320b = "GridContentViewControl";

    /* renamed from: c */
    public ViewGroup f157321c;

    /* renamed from: d */
    public boolean f157322d;

    /* renamed from: e */
    public MessageQueue.IdleHandler f157323e;

    /* renamed from: f */
    private Activity f157324f;

    /* renamed from: g */
    private ViewGroup f157325g;

    /* renamed from: h */
    private InMeetingFloatView f157326h;

    /* renamed from: i */
    private InstagramDotView f157327i;

    /* renamed from: j */
    private DesktopScrollBtnStubs f157328j;

    /* renamed from: k */
    private MeetingPageAdapter f157329k;

    /* renamed from: l */
    private boolean f157330l;

    /* renamed from: m */
    private GridByteRtcListener f157331m;

    @Override // com.ss.android.vc.meeting.module.base.content.AbstractC61422a
    /* renamed from: h */
    public boolean mo212887h() {
        return false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"com/ss/android/vc/meeting/module/multi/gridcontent/GridContentViewControl$initViewPager$1", "Lcom/ss/android/vc/meeting/module/multi/viewpager/IMeetingPageBuilder;", "build", "Lcom/ss/android/vc/meeting/module/multi/viewpager/PageHolder;", "presenter", "Lcom/ss/android/vc/meeting/module/multi/presenter/InMeetingPresenter;", "container", "Landroid/view/ViewGroup;", "position", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.gridcontent.d$d */
    public static final class C62521d implements IMeetingPageBuilder {
        C62521d() {
        }

        @Override // com.ss.android.vc.meeting.module.multi.viewpager.IMeetingPageBuilder
        /* renamed from: a */
        public PageHolder mo216170a(InMeetingPresenter bVar, ViewGroup viewGroup, int i) {
            Intrinsics.checkParameterIsNotNull(bVar, "presenter");
            Intrinsics.checkParameterIsNotNull(viewGroup, "container");
            Context context = viewGroup.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "container.context");
            return new PageHolder(new InMeetingPageView(bVar, context, null, 0, 12, null), i);
        }
    }

    @Override // com.ss.android.vc.meeting.module.multi.gridcontent.AbsGridContentControl.IGridContentViewListener
    /* renamed from: c */
    public boolean mo216158c() {
        return this.f157330l;
    }

    @Override // com.ss.android.vc.meeting.module.multi.gridcontent.AbsGridContentControl.IGridContentViewListener
    /* renamed from: d */
    public void mo216159d() {
        bR_();
    }

    @Override // com.ss.android.vc.meeting.module.base.content.AbstractC61422a
    /* renamed from: g */
    public ContentViewType mo212886g() {
        return ContentViewType.VIDEO_GRID;
    }

    /* renamed from: l */
    private final boolean m244489l() {
        return mo216158c();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.gridcontent.d$a */
    public static final class RunnableC62518a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ GridContentViewControl f157332a;

        RunnableC62518a(GridContentViewControl dVar) {
            this.f157332a = dVar;
        }

        public final void run() {
            if (!this.f157332a.f157322d) {
                VCLauncherStatistics.m250425c();
            }
            this.f157332a.f157322d = true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/vc/meeting/module/multi/gridcontent/GridContentViewControl$mIdleHandle$1", "Landroid/os/MessageQueue$IdleHandler;", "queueIdle", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.gridcontent.d$g */
    public static final class C62524g implements MessageQueue.IdleHandler {

        /* renamed from: a */
        final /* synthetic */ GridContentViewControl f157338a;

        public boolean queueIdle() {
            C60700b.m235851b(this.f157338a.f157320b, "[IdleHandler]", "queueIdle");
            this.f157338a.mo216166k();
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C62524g(GridContentViewControl dVar) {
            this.f157338a = dVar;
        }
    }

    /* renamed from: m */
    private final void m244490m() {
        ViewGroup viewGroup = this.f157321c;
        if (viewGroup == null) {
            Intrinsics.throwNpe();
        }
        this.f157325g = (FrameLayout) viewGroup.findViewById(R.id.container_fv);
    }

    /* renamed from: r */
    private final void m244495r() {
        ViewGroup viewGroup;
        if (!this.f157322d && (viewGroup = this.f157321c) != null) {
            viewGroup.post(new RunnableC62518a(this));
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.rtcstream.IResumeSubscribeObserver
    /* renamed from: a */
    public void mo212235a() {
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        meeting.aw().mo216153h();
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void destroy() {
        C60700b.m235851b(this.f157320b, "[destroy]", "destroy");
        mo212885f();
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        meeting.aw().mo216142b(this);
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void init() {
        C60700b.m235851b(this.f157320b, "[init]", String.valueOf(this));
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        meeting.aw().mo216140a(this);
    }

    /* renamed from: k */
    public final void mo216166k() {
        if (bI_() != null && !bI_().getMInMeetingActived()) {
            bI_().setMInMeetingActived(true);
            MeetingPageAdapter bVar = this.f157329k;
            if (bVar != null) {
                bVar.mo216230b();
            }
        }
    }

    /* renamed from: q */
    private final void m244494q() {
        View a;
        View b;
        if (DesktopUtil.m144307b()) {
            ViewGroup viewGroup = this.f157321c;
            if (viewGroup == null) {
                Intrinsics.throwNpe();
            }
            DesktopScrollBtnStubs bVar = new DesktopScrollBtnStubs(viewGroup);
            this.f157328j = bVar;
            if (!(bVar == null || (b = bVar.mo216110b()) == null)) {
                b.setOnClickListener(new View$OnClickListenerC62519b(this));
            }
            DesktopScrollBtnStubs bVar2 = this.f157328j;
            if (bVar2 != null && (a = bVar2.mo216109a()) != null) {
                a.setOnClickListener(new View$OnClickListenerC62520c(this));
            }
        }
    }

    /* renamed from: t */
    private final void m244497t() {
        InMeetingViewPager inMeetingViewPager;
        ViewGroup viewGroup = this.f157321c;
        if (!(viewGroup == null || (inMeetingViewPager = (InMeetingViewPager) viewGroup.findViewById(R.id.viewPager)) == null)) {
            inMeetingViewPager.clearOnPageChangeListeners();
        }
        this.f157327i = null;
        this.f157328j = null;
        InMeetingFloatView inMeetingFloatView = this.f157326h;
        if (inMeetingFloatView != null) {
            inMeetingFloatView.mo213681f();
        }
        this.f157326h = null;
        ViewGroup viewGroup2 = null;
        this.f157325g = viewGroup2;
        this.f157321c = viewGroup2;
        this.f157329k = null;
    }

    @Override // com.ss.android.vc.meeting.module.multi.gridcontent.AbsGridContentControl.IGridContentViewListener
    /* renamed from: i */
    public boolean mo216160i() {
        Activity activity = this.f157324f;
        if (activity != null) {
            if (activity == null) {
                Intrinsics.throwNpe();
            }
            if (!activity.isFinishing()) {
                Activity activity2 = this.f157324f;
                if (activity2 == null) {
                    Intrinsics.throwNpe();
                }
                if (activity2.isDestroyed()) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    @Override // com.ss.android.vc.meeting.module.multi.gridcontent.AbsGridContentControl.IGridContentViewListener
    /* renamed from: j */
    public void mo216161j() {
        AbsSingleInstanceControl aE;
        C61303k meeting = getMeeting();
        if (meeting != null && (aE = meeting.aE()) != null && aE.mo208293c() && m244489l()) {
            MeetingPageAdapter bVar = this.f157329k;
            if (bVar != null) {
                bVar.notifyDataSetChanged();
            }
            m244496s();
            m244492o();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r1.getParent(), r0)) != false) goto L_0x0019;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.ss.android.vc.meeting.module.floatingwindow.InMeetingFloatView m244491n() {
        /*
            r8 = this;
            android.view.ViewGroup r0 = r8.f157325g
            if (r0 == 0) goto L_0x0040
            com.ss.android.vc.meeting.module.floatingwindow.InMeetingFloatView r1 = r8.f157326h
            if (r1 == 0) goto L_0x0019
            if (r1 != 0) goto L_0x000d
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x000d:
            android.view.ViewParent r1 = r1.getParent()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x0040
        L_0x0019:
            com.ss.android.vc.meeting.module.floatingwindow.InMeetingFloatView r1 = new com.ss.android.vc.meeting.module.floatingwindow.InMeetingFloatView
            android.content.Context r3 = r0.getContext()
            java.lang.String r2 = "it.context"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r2)
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)
            r8.f157326h = r1
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r2 = -1
            r1.<init>(r2, r2)
            r0.removeAllViews()
            com.ss.android.vc.meeting.module.floatingwindow.InMeetingFloatView r2 = r8.f157326h
            android.view.View r2 = (android.view.View) r2
            android.view.ViewGroup$LayoutParams r1 = (android.view.ViewGroup.LayoutParams) r1
            r0.addView(r2, r1)
        L_0x0040:
            com.ss.android.vc.meeting.module.floatingwindow.InMeetingFloatView r0 = r8.f157326h
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.multi.gridcontent.GridContentViewControl.m244491n():com.ss.android.vc.meeting.module.floatingwindow.InMeetingFloatView");
    }

    /* renamed from: p */
    private final void m244493p() {
        InMeetingPresenter bI_ = bI_();
        if (bI_ == null) {
            Intrinsics.throwNpe();
        }
        this.f157329k = new MeetingPageAdapter(bI_, new C62521d());
        ViewGroup viewGroup = this.f157321c;
        if (viewGroup == null) {
            Intrinsics.throwNpe();
        }
        ((InMeetingViewPager) viewGroup.findViewById(R.id.viewPager)).setTouchListener(new C62522e(this));
        ViewGroup viewGroup2 = this.f157321c;
        if (viewGroup2 == null) {
            Intrinsics.throwNpe();
        }
        InMeetingViewPager inMeetingViewPager = (InMeetingViewPager) viewGroup2.findViewById(R.id.viewPager);
        Intrinsics.checkExpressionValueIsNotNull(inMeetingViewPager, "mRootView!!.viewPager");
        inMeetingViewPager.setAdapter(this.f157329k);
        ViewGroup viewGroup3 = this.f157321c;
        if (viewGroup3 == null) {
            Intrinsics.throwNpe();
        }
        ((InMeetingViewPager) viewGroup3.findViewById(R.id.viewPager)).addOnPageChangeListener(new C62523f(this));
        m244495r();
    }

    @Override // com.ss.android.vc.meeting.module.base.content.AbstractC61422a
    /* renamed from: f */
    public void mo212885f() {
        C60700b.m235851b(this.f157320b, "[destroyContentView]", String.valueOf(this));
        this.f157324f = null;
        this.f157330l = false;
        MeetingPageAdapter bVar = this.f157329k;
        if (bVar != null) {
            bVar.mo216229a();
        }
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        meeting.mo212164x().mo211761b(this.f157331m);
        C61303k meeting2 = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
        meeting2.mo212102T().mo212219b(this);
        m244497t();
    }

    /* renamed from: o */
    private final void m244492o() {
        InMeetingFloatView n;
        if (m244489l()) {
            C61303k meeting = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
            AbstractC62485a az = meeting.az();
            Intrinsics.checkExpressionValueIsNotNull(az, "meeting.fullScreenVideoControl");
            if (!az.mo216034a()) {
                C61303k meeting2 = getMeeting();
                Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
                if (!meeting2.aw().mo216148d()) {
                    InMeetingFloatView inMeetingFloatView = this.f157326h;
                    if (inMeetingFloatView != null) {
                        C60752f.m236083c(inMeetingFloatView);
                    }
                    InMeetingFloatView inMeetingFloatView2 = this.f157326h;
                    if (inMeetingFloatView2 != null) {
                        inMeetingFloatView2.mo213681f();
                        return;
                    }
                    return;
                }
                InMeetingFloatView n2 = m244491n();
                if (!(n2 == null || n2.getVisibility() != 8 || (n = m244491n()) == null)) {
                    n.mo208526b();
                }
                InMeetingFloatView n3 = m244491n();
                if (n3 != null) {
                    n3.setContentClickListener(new View$OnClickListenerC62525h(this));
                }
                C61303k meeting3 = getMeeting();
                Intrinsics.checkExpressionValueIsNotNull(meeting3, "meeting");
                C61383d I = meeting3.mo212091I();
                Intrinsics.checkExpressionValueIsNotNull(I, "meeting.meetingData");
                C61388g b = I.mo212494b();
                C61303k meeting4 = getMeeting();
                Intrinsics.checkExpressionValueIsNotNull(meeting4, "meeting");
                Participant a = b.mo212587a(meeting4.aw().mo216151f());
                if (a != null) {
                    String str = this.f157320b;
                    C60700b.m235851b(str, "[updateFloatView]", "DeviceId: " + a.getDeviceId());
                    InMeetingFloatView n4 = m244491n();
                    if (n4 != null) {
                        C60752f.m236079a((View) n4);
                    }
                    InMeetingFloatView n5 = m244491n();
                    if (n5 != null) {
                        n5.mo213679a(a, bI_());
                    }
                }
            }
        }
    }

    /* renamed from: s */
    private final void m244496s() {
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        int c = meeting.aw().mo216145c();
        if (c < 2) {
            InstagramDotView instagramDotView = this.f157327i;
            if (instagramDotView != null) {
                instagramDotView.setVisibility(8);
            }
            m244487a(3.5d);
            ViewGroup viewGroup = this.f157321c;
            if (viewGroup == null) {
                Intrinsics.throwNpe();
            }
            InMeetingViewPager inMeetingViewPager = (InMeetingViewPager) viewGroup.findViewById(R.id.viewPager);
            Intrinsics.checkExpressionValueIsNotNull(inMeetingViewPager, "mRootView!!.viewPager");
            m244488a(c, inMeetingViewPager.getCurrentItem());
            return;
        }
        if (this.f157327i == null) {
            ViewGroup viewGroup2 = this.f157321c;
            if (viewGroup2 == null) {
                Intrinsics.throwNpe();
            }
            C60740ad.m236052b((ViewStub) viewGroup2.findViewById(R.id.stub_instagram_dot));
            ViewGroup viewGroup3 = this.f157321c;
            if (viewGroup3 == null) {
                Intrinsics.throwNpe();
            }
            InstagramDotView instagramDotView2 = (InstagramDotView) viewGroup3.findViewById(R.id.vp_instagram_dot);
            this.f157327i = instagramDotView2;
            if (instagramDotView2 == null) {
                Intrinsics.throwNpe();
            }
            instagramDotView2.setActiveDotSize(C60773o.m236115a(6.0d));
        }
        InstagramDotView instagramDotView3 = this.f157327i;
        if (instagramDotView3 != null) {
            instagramDotView3.mo208704a(c);
        }
        InstagramDotView instagramDotView4 = this.f157327i;
        if (instagramDotView4 != null) {
            ViewGroup viewGroup4 = this.f157321c;
            if (viewGroup4 == null) {
                Intrinsics.throwNpe();
            }
            InMeetingViewPager inMeetingViewPager2 = (InMeetingViewPager) viewGroup4.findViewById(R.id.viewPager);
            Intrinsics.checkExpressionValueIsNotNull(inMeetingViewPager2, "mRootView!!.viewPager");
            instagramDotView4.mo208705b(inMeetingViewPager2.getCurrentItem());
        }
        InstagramDotView instagramDotView5 = this.f157327i;
        if (instagramDotView5 != null) {
            instagramDotView5.setVisibility(0);
        }
        ViewGroup viewGroup5 = this.f157321c;
        if (viewGroup5 == null) {
            Intrinsics.throwNpe();
        }
        InMeetingViewPager inMeetingViewPager3 = (InMeetingViewPager) viewGroup5.findViewById(R.id.viewPager);
        Intrinsics.checkExpressionValueIsNotNull(inMeetingViewPager3, "mRootView!!.viewPager");
        m244488a(c, inMeetingViewPager3.getCurrentItem());
        m244487a(0.0d);
    }

    @Override // com.ss.android.vc.meeting.module.multi.gridcontent.AbsGridContentControl.IGridContentViewListener
    /* renamed from: b */
    public void mo216157b() {
        AbsSingleInstanceControl aE;
        DisplayMode displayMode;
        DisplayMode displayMode2;
        AbsSingleInstanceControl aE2;
        C61303k meeting;
        AbsSingleInstanceControl aE3;
        if (m244489l()) {
            MeetingPageAdapter bVar = this.f157329k;
            if (bVar != null) {
                bVar.notifyDataSetChanged();
            }
            C61303k meeting2 = getMeeting();
            if (!(meeting2 == null || (aE = meeting2.aE()) == null || !aE.mo208293c())) {
                C61303k meeting3 = getMeeting();
                Boolean bool = null;
                if (meeting3 != null) {
                    displayMode = meeting3.mo212067p();
                } else {
                    displayMode = null;
                }
                if (!(displayMode == DisplayMode.ACTIVITY && ((meeting = getMeeting()) == null || (aE3 = meeting.aE()) == null || aE3.mo208292b()))) {
                    String str = this.f157320b;
                    StringBuilder sb = new StringBuilder();
                    sb.append("displayMode=");
                    C61303k meeting4 = getMeeting();
                    if (meeting4 != null) {
                        displayMode2 = meeting4.mo212067p();
                    } else {
                        displayMode2 = null;
                    }
                    sb.append(displayMode2);
                    sb.append(",meetingPageActive=");
                    C61303k meeting5 = getMeeting();
                    if (!(meeting5 == null || (aE2 = meeting5.aE()) == null)) {
                        bool = Boolean.valueOf(aE2.mo208292b());
                    }
                    sb.append(bool);
                    C60700b.m235843a(str, "[refreshView]", sb.toString());
                    return;
                }
            }
            m244496s();
            m244492o();
        }
    }

    @Override // com.ss.android.vc.meeting.module.base.content.AbstractC61422a
    /* renamed from: e */
    public View mo212884e() {
        boolean f = C61999a.m242220f();
        String str = this.f157320b;
        C60700b.m235851b(str, "[createContentView]", "isLandscape: " + f + ", " + this);
        Activity activity = getActivity();
        this.f157324f = activity;
        View a = C60748b.m236069a(activity, R.layout.fragment_meeting_2, null, false, "fragment_meeting_2");
        if (a != null) {
            this.f157321c = (ViewGroup) a;
            m244493p();
            m244494q();
            m244490m();
            this.f157330l = true;
            C61303k meeting = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
            meeting.az().mo216036b();
            C61303k meeting2 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
            meeting2.aw().mo216137a();
            C61303k meeting3 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting3, "meeting");
            meeting3.ai().e_(true);
            C61303k meeting4 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting4, "meeting");
            meeting4.mo212164x().mo211751a(this.f157331m);
            C61303k meeting5 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting5, "meeting");
            meeting5.mo212102T().mo212209a(this);
            ViewGroup viewGroup = this.f157321c;
            if (viewGroup == null) {
                Intrinsics.throwNpe();
            }
            return viewGroup;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/multi/gridcontent/GridContentViewControl$initViewPager$2", "Lcom/ss/android/vc/meeting/module/multi/viewpager/InMeetingViewPager$VCTouchListener;", "onTouch", "", "isTouch", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.gridcontent.d$e */
    public static final class C62522e implements InMeetingViewPager.AbstractC62529a {

        /* renamed from: a */
        final /* synthetic */ GridContentViewControl f157335a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C62522e(GridContentViewControl dVar) {
            this.f157335a = dVar;
        }

        @Override // com.ss.android.vc.meeting.module.multi.viewpager.InMeetingViewPager.AbstractC62529a
        /* renamed from: a */
        public void mo216171a(boolean z) {
            InMeetingViewPager inMeetingViewPager;
            Looper.myQueue().removeIdleHandler(this.f157335a.f157323e);
            this.f157335a.mo216166k();
            ViewGroup viewGroup = this.f157335a.f157321c;
            if (viewGroup != null && (inMeetingViewPager = (InMeetingViewPager) viewGroup.findViewById(R.id.viewPager)) != null) {
                inMeetingViewPager.setTouchListener(null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H\u0016J \u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0003H\u0016J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0003H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"com/ss/android/vc/meeting/module/multi/gridcontent/GridContentViewControl$initViewPager$3", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "newPage", "", "getNewPage", "()I", "setNewPage", "(I)V", "onPageScrollStateChanged", "", "state", "onPageScrolled", "position", "positionOffset", "", "positionOffsetPixels", "onPageSelected", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.gridcontent.d$f */
    public static final class C62523f implements ViewPager.OnPageChangeListener {

        /* renamed from: a */
        final /* synthetic */ GridContentViewControl f157336a;

        /* renamed from: b */
        private int f157337b;

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C62523f(GridContentViewControl dVar) {
            this.f157336a = dVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            int i2;
            C61303k meeting = this.f157336a.getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
            AbsGridContentControl aw = meeting.aw();
            if (aw != null) {
                i2 = aw.mo216141b();
            } else {
                i2 = 0;
            }
            if (i == 0 && this.f157337b != i2) {
                C61303k meeting2 = this.f157336a.getMeeting();
                Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
                if (meeting2.aw() != null) {
                    av.m250121a(this.f157337b, this.f157336a.isHost());
                }
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            ViewGroup viewGroup = this.f157336a.f157321c;
            if (viewGroup != null) {
                if (i != this.f157337b) {
                    InMeetingViewPager inMeetingViewPager = (InMeetingViewPager) viewGroup.findViewById(R.id.viewPager);
                    Intrinsics.checkExpressionValueIsNotNull(inMeetingViewPager, "it.viewPager");
                    if (inMeetingViewPager.mo216225a()) {
                        av.m250122a(this.f157336a.isHost());
                    }
                }
                String str = this.f157336a.f157320b;
                C60700b.m235851b(str, "[OnPageChangeListener-onPageSelected]", "position: " + i);
                this.f157337b = i;
                C61303k meeting = this.f157336a.getMeeting();
                Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
                AbsGridContentControl aw = meeting.aw();
                if (aw != null) {
                    aw.mo216144b(this.f157337b);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.gridcontent.d$b */
    public static final class View$OnClickListenerC62519b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GridContentViewControl f157333a;

        View$OnClickListenerC62519b(GridContentViewControl dVar) {
            this.f157333a = dVar;
        }

        public final void onClick(View view) {
            InMeetingViewPager inMeetingViewPager;
            ViewGroup viewGroup = this.f157333a.f157321c;
            if (viewGroup != null && (inMeetingViewPager = (InMeetingViewPager) viewGroup.findViewById(R.id.viewPager)) != null) {
                inMeetingViewPager.arrowScroll(17);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.gridcontent.d$c */
    public static final class View$OnClickListenerC62520c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GridContentViewControl f157334a;

        View$OnClickListenerC62520c(GridContentViewControl dVar) {
            this.f157334a = dVar;
        }

        public final void onClick(View view) {
            InMeetingViewPager inMeetingViewPager;
            ViewGroup viewGroup = this.f157334a.f157321c;
            if (viewGroup != null && (inMeetingViewPager = (InMeetingViewPager) viewGroup.findViewById(R.id.viewPager)) != null) {
                inMeetingViewPager.arrowScroll(66);
            }
        }
    }

    public GridContentViewControl(AbstractC61423b bVar) {
        super(bVar);
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        this.f157331m = new GridByteRtcListener(meeting);
        this.f157323e = new C62524g(this);
        init();
    }

    /* renamed from: a */
    private final void m244487a(double d) {
        ViewGroup viewGroup = this.f157321c;
        if (viewGroup == null) {
            Intrinsics.throwNpe();
        }
        InMeetingViewPager inMeetingViewPager = (InMeetingViewPager) viewGroup.findViewById(R.id.viewPager);
        Intrinsics.checkExpressionValueIsNotNull(inMeetingViewPager, "viewPager");
        ViewGroup.LayoutParams layoutParams = inMeetingViewPager.getLayoutParams();
        if (layoutParams != null) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = C60773o.m236115a(d);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.gridcontent.d$h */
    public static final class View$OnClickListenerC62525h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GridContentViewControl f157339a;

        View$OnClickListenerC62525h(GridContentViewControl dVar) {
            this.f157339a = dVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0052, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) true) != false) goto L_0x0054;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r4) {
            /*
            // Method dump skipped, instructions count: 133
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.multi.gridcontent.GridContentViewControl.View$OnClickListenerC62525h.onClick(android.view.View):void");
        }
    }

    @Override // com.ss.android.vc.meeting.module.multi.gridcontent.AbsGridContentControl.IGridContentViewListener
    /* renamed from: a */
    public void mo216156a(String str) {
        InMeetingPageView dVar;
        Intrinsics.checkParameterIsNotNull(str, "rtcJoinId");
        if (m244489l()) {
            MeetingPageAdapter bVar = this.f157329k;
            if (bVar != null) {
                dVar = bVar.mo216228a(str);
            } else {
                dVar = null;
            }
            if (dVar != null) {
                dVar.mo216113a(str);
            } else {
                m244492o();
            }
        }
    }

    /* renamed from: a */
    private final void m244488a(int i, int i2) {
        View a;
        View b;
        View a2;
        View b2;
        View a3;
        View b3;
        View a4;
        View b4;
        if (DesktopUtil.m144307b()) {
            if (i <= 1) {
                DesktopScrollBtnStubs bVar = this.f157328j;
                if (!(bVar == null || (b = bVar.mo216110b()) == null)) {
                    C60752f.m236083c(b);
                }
                DesktopScrollBtnStubs bVar2 = this.f157328j;
                if (bVar2 != null && (a = bVar2.mo216109a()) != null) {
                    C60752f.m236083c(a);
                }
            } else if (i2 == 0) {
                DesktopScrollBtnStubs bVar3 = this.f157328j;
                if (!(bVar3 == null || (b4 = bVar3.mo216110b()) == null)) {
                    C60752f.m236083c(b4);
                }
                DesktopScrollBtnStubs bVar4 = this.f157328j;
                if (bVar4 != null && (a4 = bVar4.mo216109a()) != null) {
                    C60752f.m236079a(a4);
                }
            } else if (i2 == i - 1) {
                DesktopScrollBtnStubs bVar5 = this.f157328j;
                if (!(bVar5 == null || (b3 = bVar5.mo216110b()) == null)) {
                    C60752f.m236079a(b3);
                }
                DesktopScrollBtnStubs bVar6 = this.f157328j;
                if (bVar6 != null && (a3 = bVar6.mo216109a()) != null) {
                    C60752f.m236083c(a3);
                }
            } else {
                DesktopScrollBtnStubs bVar7 = this.f157328j;
                if (!(bVar7 == null || (b2 = bVar7.mo216110b()) == null)) {
                    C60752f.m236079a(b2);
                }
                DesktopScrollBtnStubs bVar8 = this.f157328j;
                if (bVar8 != null && (a2 = bVar8.mo216109a()) != null) {
                    C60752f.m236079a(a2);
                }
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void onOrientation(boolean z, boolean z2) {
        int i;
        String str = this.f157320b;
        C60700b.m235851b(str, "[onOrientation]", mo216158c() + ", Grid onOrientation: " + z + ", " + z2 + ", " + "isDesktopMode: " + DesktopUtil.m144307b());
        if (m244489l() && !DesktopUtil.m144307b()) {
            ViewGroup viewGroup = this.f157321c;
            if (viewGroup != null) {
                if (z) {
                    i = 4;
                } else {
                    i = 0;
                }
                viewGroup.setVisibility(i);
            }
            C61303k meeting = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
            if (meeting.ai() != null) {
                C61303k meeting2 = getMeeting();
                Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
                meeting2.ai().e_(!z);
            }
            C61303k meeting3 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting3, "meeting");
            if (meeting3.aw() != null) {
                C61303k meeting4 = getMeeting();
                Intrinsics.checkExpressionValueIsNotNull(meeting4, "meeting");
                meeting4.aw().mo216153h();
            }
        }
    }
}
