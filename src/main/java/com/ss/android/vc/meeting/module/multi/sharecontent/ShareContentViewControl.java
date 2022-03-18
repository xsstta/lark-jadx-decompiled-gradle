package com.ss.android.vc.meeting.module.multi.sharecontent;

import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import com.larksuite.framework.thread.C26171w;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60740ad;
import com.ss.android.vc.common.p3083e.C60748b;
import com.ss.android.vc.common.p3083e.C60752f;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.singleinstance.AbsSingleInstanceControl;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.irtc.AbstractC61030i;
import com.ss.android.vc.irtc.utils.C61074b;
import com.ss.android.vc.meeting.framework.meeting.ByteRtc;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.meeting.rtcstream.IResumeSubscribeObserver;
import com.ss.android.vc.meeting.framework.meeting.rtcstream.StreamManagerGlobal;
import com.ss.android.vc.meeting.model.C61383d;
import com.ss.android.vc.meeting.module.base.AbstractC61429i;
import com.ss.android.vc.meeting.module.base.content.AbstractC61422a;
import com.ss.android.vc.meeting.module.base.content.AbstractC61423b;
import com.ss.android.vc.meeting.module.base.content.ContentViewType;
import com.ss.android.vc.meeting.module.follow.AbstractC61751a;
import com.ss.android.vc.meeting.module.landscapefloater.ILandscapeFloatToolbarListener;
import com.ss.android.vc.meeting.module.landscapefloater.LandscapeFloatToolbarViewControl;
import com.ss.android.vc.meeting.module.multi.gridcontent.AbsGridContentControl;
import com.ss.android.vc.meeting.module.p3151p.AbstractC62612a;
import com.ss.android.vc.meeting.p3104c.C61246b;
import com.ss.android.vc.net.service.GetUserInfoListener;
import com.ss.android.vc.net.service.UserInfoService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\n\u0010\u0018\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001aH\u0016J\b\u0010\u001f\u001a\u00020\u001aH\u0016J\b\u0010 \u001a\u00020!H\u0016J\u0018\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020!H\u0016J\b\u0010%\u001a\u00020\u001aH\u0016J\b\u0010&\u001a\u00020\u001aH\u0016J\u0010\u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020!H\u0016J\b\u0010)\u001a\u00020\u001aH\u0016J\b\u0010*\u001a\u00020\u001aH\u0016J\b\u0010+\u001a\u00020\u001aH\u0002J\u0010\u0010,\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020!H\u0016J\b\u0010.\u001a\u00020\u001aH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/ss/android/vc/meeting/module/multi/sharecontent/ShareContentViewControl;", "Lcom/ss/android/vc/meeting/module/base/content/BaseContentViewControl;", "Lcom/ss/android/vc/meeting/module/multi/sharecontent/IShareContentViewListener;", "Lcom/ss/android/vc/meeting/framework/meeting/rtcstream/IResumeSubscribeObserver;", "mDelegate", "Lcom/ss/android/vc/meeting/module/base/content/IContentViewDelegate;", "(Lcom/ss/android/vc/meeting/module/base/content/IContentViewDelegate;)V", "TAG", "", "landscapeFloatToolbarViewControl", "Lcom/ss/android/vc/meeting/module/landscapefloater/LandscapeFloatToolbarViewControl;", "mRootView", "Landroid/view/View;", "mRtcRenderListener", "Lcom/ss/android/vc/irtc/IRtcEglRenderListener;", "mShareContentBanner", "Lcom/ss/android/vc/meeting/module/multi/sharecontent/ShareContentBanner;", "mShareContentControl", "Lcom/ss/android/vc/meeting/module/multi/sharecontent/AbsShareContentControl;", "mSharePlaceHolder", "mShareScreenContainer", "Landroid/widget/FrameLayout;", "mSurfaceViewWrapper", "Lcom/ss/android/vc/meeting/gesture/GestureSurfaceViewWrapper;", "createContentView", "destroy", "", "destroyContentView", "getContentViewType", "Lcom/ss/android/vc/meeting/module/base/content/ContentViewType;", "goToGridContent", "initShareScreen", "onBackPressed", "", "onOrientation", "isLandscape", "isRotate", "onResume", "onResumeSubscribe", "onShareScreenChanged", "hasFollow", "onStart", "refreshName", "releaseSurface", "setSketchEnabled", "enable", "showSharedPage", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.multi.b.f */
public final class ShareContentViewControl extends AbstractC61422a implements IResumeSubscribeObserver, IShareContentViewListener {

    /* renamed from: b */
    public final String f157220b = ("ShareContentViewControl@" + hashCode());

    /* renamed from: c */
    public AbsShareContentControl f157221c;

    /* renamed from: d */
    public ShareContentBanner f157222d;

    /* renamed from: e */
    public View f157223e;

    /* renamed from: f */
    public FrameLayout f157224f;

    /* renamed from: g */
    private View f157225g;

    /* renamed from: h */
    private AbstractC61030i f157226h;

    /* renamed from: i */
    private LandscapeFloatToolbarViewControl f157227i;

    /* renamed from: j */
    private C61246b f157228j;

    @Override // com.ss.android.vc.meeting.framework.meeting.rtcstream.IResumeSubscribeObserver
    /* renamed from: a */
    public void mo212235a() {
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.b.f$a */
    public static final class RunnableC62496a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ShareContentViewControl f157229a;

        RunnableC62496a(ShareContentViewControl fVar) {
            this.f157229a = fVar;
        }

        public final void run() {
            this.f157229a.f157224f = null;
        }
    }

    /* renamed from: l */
    private final void m244332l() {
        C61246b bVar = this.f157228j;
        if (bVar != null) {
            bVar.mo211814e();
            bVar.setOnClickListener(null);
        }
        this.f157228j = null;
    }

    @Override // com.ss.android.vc.meeting.module.base.content.AbstractC61422a
    /* renamed from: g */
    public ContentViewType mo212886g() {
        C60700b.m235851b(this.f157220b, "[getContentViewType]", "SHARE_SCREEN");
        return ContentViewType.SHARE_SCREEN;
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void onStart() {
        super.onStart();
        C60700b.m235851b(this.f157220b, "[onStart]", "onStart");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/vc/meeting/module/multi/sharecontent/ShareContentViewControl$showSharedPage$1", "Lcom/ss/android/vc/irtc/IRtcEglRenderListener;", "onBeginRender", "", "onEndRender", "onRenderFrame", "onVideoFrameSizeChanged", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.b.f$d */
    public static final class C62499d implements AbstractC61030i {

        /* renamed from: a */
        final /* synthetic */ ShareContentViewControl f157234a;

        @Override // com.ss.android.vc.irtc.AbstractC61030i
        /* renamed from: c */
        public void mo210660c() {
        }

        @Override // com.ss.android.vc.irtc.AbstractC61030i
        /* renamed from: d */
        public void mo210661d() {
        }

        @Override // com.ss.android.vc.irtc.AbstractC61030i
        /* renamed from: a */
        public void mo210658a() {
            C60700b.m235851b(this.f157234a.f157220b, "[initShareScreen]", "onBeginRender");
            C26171w.m94675a(new RunnableC62500a(this));
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.multi.b.f$d$b */
        static final class RunnableC62501b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C62499d f157236a;

            RunnableC62501b(C62499d dVar) {
                this.f157236a = dVar;
            }

            public final void run() {
                ShareContentBanner cVar = this.f157236a.f157234a.f157222d;
                boolean z = false;
                if (cVar != null) {
                    cVar.mo216082a(false);
                }
                View view = this.f157236a.f157234a.f157223e;
                if (view != null) {
                    C60752f.m236079a(view);
                }
                String str = this.f157236a.f157234a.f157220b;
                StringBuilder sb = new StringBuilder();
                sb.append("onEndRender video surface invisible: ");
                if (this.f157236a.f157234a.f157223e == null) {
                    z = true;
                }
                sb.append(z);
                C60700b.m235851b(str, "[initShareScreen5]", sb.toString());
            }
        }

        @Override // com.ss.android.vc.irtc.AbstractC61030i
        /* renamed from: b */
        public void mo210659b() {
            String str = this.f157234a.f157220b;
            StringBuilder sb = new StringBuilder();
            sb.append("onEndRender: ");
            Looper mainLooper = Looper.getMainLooper();
            Intrinsics.checkExpressionValueIsNotNull(mainLooper, "Looper.getMainLooper()");
            sb.append(Intrinsics.areEqual(mainLooper.getThread(), Thread.currentThread()));
            C60700b.m235851b(str, "[initShareScreen4]", sb.toString());
            C26171w.m94675a(new RunnableC62501b(this));
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.multi.b.f$d$a */
        static final class RunnableC62500a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C62499d f157235a;

            RunnableC62500a(C62499d dVar) {
                this.f157235a = dVar;
            }

            public final void run() {
                ShareContentModel eVar;
                ShareContentBanner cVar = this.f157235a.f157234a.f157222d;
                if (cVar != null) {
                    cVar.mo216082a(true);
                }
                AbsShareContentControl aVar = this.f157235a.f157234a.f157221c;
                if (aVar != null) {
                    eVar = aVar.mo216065a();
                } else {
                    eVar = null;
                }
                if (eVar != null) {
                    View view = this.f157235a.f157234a.f157223e;
                    if (view != null) {
                        C60752f.m236083c(view);
                    }
                    C60700b.m235851b(this.f157235a.f157234a.f157220b, "[initShareScreen2]", "onBeginRender avatar gone!");
                    return;
                }
                C60700b.m235864f(this.f157235a.f157234a.f157220b, "[initShareScreen3]", "onBeginRender skip!!!");
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C62499d(ShareContentViewControl fVar) {
            this.f157234a = fVar;
        }
    }

    @Override // com.ss.android.vc.meeting.module.base.content.AbstractC61422a, com.ss.android.vc.meeting.basedialog.FullScreen.AbstractC61214a
    public boolean bS_() {
        super.bS_();
        C60700b.m235851b(this.f157220b, "[onBackPressed]", "onBackPressed");
        LandscapeFloatToolbarViewControl bVar = this.f157227i;
        if (bVar != null) {
            return bVar.mo214413d();
        }
        return false;
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void destroy() {
        C60700b.m235851b(this.f157220b, "[destroy]", "destroy");
        mo212885f();
        AbsShareContentControl aVar = this.f157221c;
        if (aVar == null) {
            Intrinsics.throwNpe();
        }
        aVar.mo216069b(this);
        AbsShareContentControl aVar2 = this.f157221c;
        if (aVar2 != null) {
            aVar2.mo216072d();
        }
        this.f157222d = null;
        super.destroy();
    }

    @Override // com.ss.android.vc.meeting.module.base.content.AbstractC61422a
    /* renamed from: e */
    public View mo212884e() {
        View view;
        C60700b.m235851b(this.f157220b, "[createContentView]", "createContentView");
        FrameLayout frameLayout = null;
        View a = C60748b.m236068a(getActivity(), R.layout.layout_share_screen_content, null, false);
        this.f157225g = a;
        if (a != null) {
            view = a.findViewById(R.id.sharePlaceHolder);
        } else {
            view = null;
        }
        this.f157223e = view;
        View view2 = this.f157225g;
        if (view2 != null) {
            frameLayout = (FrameLayout) view2.findViewById(R.id.shareScreenContainer);
        }
        this.f157224f = frameLayout;
        return this.f157225g;
    }

    @Override // com.ss.android.vc.meeting.module.multi.sharecontent.IShareContentViewListener
    /* renamed from: b */
    public void mo216077b() {
        C60700b.m235851b(this.f157220b, "[refreshName]", "refreshName");
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        String n = meeting.mo212092J().mo212558n();
        C61303k meeting2 = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
        String m = meeting2.mo212092J().mo212556m();
        C61303k meeting3 = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting3, "meeting");
        ParticipantType o = meeting3.mo212092J().mo212560o();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        C61303k meeting4 = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting4, "meeting");
        C61383d I = meeting4.mo212091I();
        Intrinsics.checkExpressionValueIsNotNull(I, "meeting.meetingData");
        T t = (T) I.mo212494b().mo212589a(n, o, m);
        if (t != null) {
            objectRef.element = t;
            C61303k meeting5 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting5, "meeting");
            UserInfoService.getUserInfoById(meeting5.mo212055d(), n, objectRef.element.getParticipantType(), new C62498c(this, objectRef));
        }
    }

    @Override // com.ss.android.vc.meeting.module.base.content.AbstractC61422a
    /* renamed from: f */
    public void mo212885f() {
        View view;
        if (this.f157225g != null) {
            C60700b.m235851b(this.f157220b, "[destroyContentView]", "destroyContentView");
            View view2 = null;
            this.f157225g = view2;
            C61303k meeting = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
            ByteRtc y = meeting.mo212165y();
            C61246b bVar = this.f157228j;
            if (bVar != null) {
                view = bVar.getRenderer();
            } else {
                view = null;
            }
            y.mo211992a(view);
            C60740ad.m236049a(this.f157224f, 4, 1000, new RunnableC62496a(this));
            this.f157223e = view2;
            this.f157226h = null;
            ShareContentBanner cVar = this.f157222d;
            if (cVar != null) {
                cVar.mo216079a();
            }
            ShareContentBanner cVar2 = this.f157222d;
            if (cVar2 != null) {
                cVar2.mo216080a((ILandscapeFloatToolbarListener) null);
            }
            LandscapeFloatToolbarViewControl bVar2 = this.f157227i;
            if (bVar2 != null) {
                bVar2.destroy();
            }
            this.f157227i = null;
            m244332l();
        }
    }

    /* renamed from: i */
    public void mo216091i() {
        AbsSingleInstanceControl aE;
        C61303k meeting;
        AbsSingleInstanceControl aE2;
        C60700b.m235851b(this.f157220b, "[showSharedPage]", "showSharedPage");
        bR_();
        C61303k meeting2 = getMeeting();
        if (meeting2 == null || (aE = meeting2.aE()) == null || !aE.mo208293c() || (meeting = getMeeting()) == null || (aE2 = meeting.aE()) == null || aE2.mo208292b()) {
            if (this.f157227i == null) {
                AbstractC61423b bVar = this.f154014a;
                Intrinsics.checkExpressionValueIsNotNull(bVar, "mDelegate");
                this.f157227i = new LandscapeFloatToolbarViewControl(bVar);
            }
            LandscapeFloatToolbarViewControl bVar2 = this.f157227i;
            if (bVar2 != null) {
                bVar2.mo214408a(mo212886g());
            }
            ShareContentBanner cVar = this.f157222d;
            if (cVar != null) {
                cVar.mo216080a(this.f157227i);
            }
            if (this.f157226h == null) {
                this.f157226h = new C62499d(this);
                return;
            }
            return;
        }
        C60700b.m235851b(this.f157220b, "[showSharedPage]", "activity is in background, cancel");
    }

    /* renamed from: j */
    public void mo216092j() {
        Boolean bool;
        C61303k meeting;
        AbsGridContentControl aw;
        AbstractC61751a ab;
        C60700b.m235851b(this.f157220b, "[goToGridContent]", "goToGridContent");
        C61303k meeting2 = getMeeting();
        if (meeting2 == null || (ab = meeting2.ab()) == null) {
            bool = null;
        } else {
            bool = Boolean.valueOf(ab.mo213880f());
        }
        if (bool == null) {
            Intrinsics.throwNpe();
        }
        if (!bool.booleanValue()) {
            C61303k meeting3 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting3, "meeting");
            AbstractC62612a aj = meeting3.aj();
            Intrinsics.checkExpressionValueIsNotNull(aj, "meeting.shareScreenControl");
            if (!aj.mo216408a() && (meeting = getMeeting()) != null && (aw = meeting.aw()) != null) {
                aw.mo216154i();
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void onResume() {
        AbsSingleInstanceControl aE;
        super.onResume();
        C60700b.m235851b(this.f157220b, "[onResume]", "");
        C61303k meeting = getMeeting();
        if (meeting != null && (aE = meeting.aE()) != null && aE.mo208293c()) {
            if (this.f157228j != null) {
                C61303k meeting2 = getMeeting();
                Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
                meeting2.ag().setGestureSurfaceViewWrapper(this.f157228j);
            }
            C61246b bVar = this.f157228j;
            if (bVar != null) {
                bVar.mo211809b();
            }
            C61246b bVar2 = this.f157228j;
            if (bVar2 != null) {
                bVar2.setOnVisible(true);
            }
            C61246b bVar3 = this.f157228j;
            if (bVar3 != null) {
                bVar3.mo211810c();
            }
        }
    }

    /* renamed from: k */
    public void mo216093k() {
        C60700b.m235851b(this.f157220b, "[initShareScreen]", "initShareScreen");
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        String n = meeting.mo212092J().mo212558n();
        C61303k meeting2 = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
        String m = meeting2.mo212092J().mo212556m();
        C61303k meeting3 = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting3, "meeting");
        ParticipantType o = meeting3.mo212092J().mo212560o();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        C61303k meeting4 = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting4, "meeting");
        C61383d I = meeting4.mo212091I();
        Intrinsics.checkExpressionValueIsNotNull(I, "meeting.meetingData");
        T t = (T) I.mo212494b().mo212589a(n, o, m);
        if (t != null) {
            objectRef.element = t;
            C61303k meeting5 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting5, "meeting");
            UserInfoService.getUserInfoById(meeting5.mo212055d(), n, objectRef.element.getParticipantType(), new C62497b(this, objectRef));
            if (this.f157228j == null) {
                StreamManagerGlobal.Companion aVar = StreamManagerGlobal.f153617a;
                C61303k meeting6 = getMeeting();
                Intrinsics.checkExpressionValueIsNotNull(meeting6, "meeting");
                C61246b a = aVar.mo212234a(meeting6);
                this.f157228j = a;
                if (a != null) {
                    C61074b.m237512a(C60752f.m236078a(a, 0), 200L);
                }
            }
            C61303k meeting7 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting7, "meeting");
            ByteRtc y = meeting7.mo212165y();
            C61246b bVar = this.f157228j;
            if (bVar == null) {
                Intrinsics.throwNpe();
            }
            y.mo212015c(C60752f.m236078a(bVar, 0), objectRef.element.getRtcJoinId());
            C61303k meeting8 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting8, "meeting");
            meeting8.ag().setGestureSurfaceViewWrapper(this.f157228j);
            C61303k meeting9 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting9, "meeting");
            meeting9.ag().checkAndCreateSketchView();
            C61246b bVar2 = this.f157228j;
            if (bVar2 == null) {
                C60700b.m235851b(this.f157220b, "[initShareScreen]", "share surface is null.");
                View view = this.f157223e;
                if (view != null) {
                    C60752f.m236079a(view);
                    return;
                }
                return;
            }
            C61246b bVar3 = bVar2;
            C60752f.m236079a((View) bVar3);
            bVar2.setRtcEglRenderListener(this.f157226h);
            if (Intrinsics.areEqual(bVar2.getParent(), this.f157224f)) {
                C60700b.m235851b(this.f157220b, "[initShareScreen2]", "share surface has been attached.");
                bVar2.setAutoRenderMode(false);
                return;
            }
            C60700b.m235851b(this.f157220b, "[initShareScreen3]", "share surface attached");
            bVar2.setCornerRadius((float) C60773o.m236115a(0.0d));
            bVar2.setRenderMode(0);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            FrameLayout frameLayout = this.f157224f;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            bVar2.setId(R.id.gesture_wrapper);
            C61074b.m237511a(bVar2.getRenderer(), C60773o.m236126d(R.color.vc_bg_cam_off));
            FrameLayout frameLayout2 = this.f157224f;
            if (frameLayout2 != null) {
                frameLayout2.addView(bVar3, 0, layoutParams);
            }
            bVar2.setGestureEnable(true);
            bVar2.mo211810c();
        }
    }

    @Override // com.ss.android.vc.meeting.module.multi.sharecontent.IShareContentViewListener
    /* renamed from: b */
    public void mo216078b(boolean z) {
        ShareContentBanner cVar = this.f157222d;
        if (cVar != null) {
            cVar.mo216087c(z);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShareContentViewControl(AbstractC61423b bVar) {
        super(bVar);
        Intrinsics.checkParameterIsNotNull(bVar, "mDelegate");
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        AbsShareContentControl ay = meeting.ay();
        this.f157221c = ay;
        if (ay != null) {
            ay.mo216066a(this);
        }
        AbsShareContentControl aVar = this.f157221c;
        if (aVar != null) {
            aVar.mo216070c();
        }
        C61303k meeting2 = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
        this.f157222d = new ShareContentBanner(getRootView(), meeting2);
    }

    @Override // com.ss.android.vc.meeting.module.multi.sharecontent.IShareContentViewListener
    /* renamed from: a */
    public void mo216076a(boolean z) {
        ShareContentModel eVar;
        C61246b bVar;
        boolean z2;
        AbsSingleInstanceControl aE;
        AbstractC61429i iVar = this.mPresent;
        Intrinsics.checkExpressionValueIsNotNull(iVar, "mPresent");
        if (iVar.mo212925j() != null) {
            AbsShareContentControl aVar = this.f157221c;
            ShareContentModel eVar2 = null;
            if (aVar != null) {
                eVar = aVar.mo216065a();
            } else {
                eVar = null;
            }
            if (eVar != null) {
                mo216091i();
                C61303k meeting = getMeeting();
                if (!(meeting == null || (aE = meeting.aE()) == null || !aE.mo208293c())) {
                    C61303k meeting2 = getMeeting();
                    Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
                    if (!meeting2.aE().mo208292b()) {
                        C60700b.m235851b(this.f157220b, "[onShareScreenChanged]", "activity is in background, cancel");
                        return;
                    }
                }
                mo216093k();
                AbsShareContentControl aVar2 = this.f157221c;
                if (aVar2 != null) {
                    eVar2 = aVar2.mo216065a();
                }
                AbsShareContentControl aVar3 = this.f157221c;
                if (aVar3 != null) {
                    if (eVar2 == null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    aVar3.mo216071c(z2);
                }
                if (!(getMeeting() == null || (bVar = this.f157228j) == null)) {
                    bVar.setOnVisible(true);
                }
                C60700b.m235851b(this.f157220b, "[onShareScreenChanged]", "Share screen start.");
            } else if (!z) {
                mo216092j();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "user", "Lcom/ss/android/vc/net/service/VideoChatUser;", "kotlin.jvm.PlatformType", "onGetUserInfo"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.b.f$b */
    public static final class C62497b implements GetUserInfoListener {

        /* renamed from: a */
        final /* synthetic */ ShareContentViewControl f157230a;

        /* renamed from: b */
        final /* synthetic */ Ref.ObjectRef f157231b;

        C62497b(ShareContentViewControl fVar, Ref.ObjectRef objectRef) {
            this.f157230a = fVar;
            this.f157231b = objectRef;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a5, code lost:
            if (r2.isUnknownType() != false) goto L_0x00a7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0048, code lost:
            if (r0.isUnknownType() != false) goto L_0x004a;
         */
        @Override // com.ss.android.vc.net.service.GetUserInfoListener
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onGetUserInfo(com.ss.android.vc.net.service.VideoChatUser r5) {
            /*
            // Method dump skipped, instructions count: 201
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.multi.sharecontent.ShareContentViewControl.C62497b.onGetUserInfo(com.ss.android.vc.net.service.VideoChatUser):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "user", "Lcom/ss/android/vc/net/service/VideoChatUser;", "kotlin.jvm.PlatformType", "onGetUserInfo"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.b.f$c */
    static final class C62498c implements GetUserInfoListener {

        /* renamed from: a */
        final /* synthetic */ ShareContentViewControl f157232a;

        /* renamed from: b */
        final /* synthetic */ Ref.ObjectRef f157233b;

        C62498c(ShareContentViewControl fVar, Ref.ObjectRef objectRef) {
            this.f157232a = fVar;
            this.f157233b = objectRef;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a5, code lost:
            if (r2.isUnknownType() != false) goto L_0x00a7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0048, code lost:
            if (r0.isUnknownType() != false) goto L_0x004a;
         */
        @Override // com.ss.android.vc.net.service.GetUserInfoListener
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onGetUserInfo(com.ss.android.vc.net.service.VideoChatUser r5) {
            /*
            // Method dump skipped, instructions count: 201
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.multi.sharecontent.ShareContentViewControl.C62498c.onGetUserInfo(com.ss.android.vc.net.service.VideoChatUser):void");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0054, code lost:
        if (r2.isSketchOn() == false) goto L_0x0058;
     */
    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onOrientation(boolean r5, boolean r6) {
        /*
        // Method dump skipped, instructions count: 141
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.multi.sharecontent.ShareContentViewControl.onOrientation(boolean, boolean):void");
    }
}
