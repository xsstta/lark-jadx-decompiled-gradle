package com.ss.android.vc.meeting.module.reaction;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60748b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.base.AbstractC61424d;
import com.ss.android.vc.meeting.module.base.AbstractC61429i;
import com.ss.android.vc.meeting.module.bottombar.AbstractC61444a;
import com.ss.android.vc.meeting.module.chat.p3115a.AbstractC61567a;
import com.ss.android.vc.meeting.module.p3130k.C61999a;
import com.ss.android.vc.meeting.module.reaction.entity.IMSource;
import com.ss.android.vc.meeting.module.reaction.entity.InteractionMessage;
import com.ss.android.vc.meeting.module.reaction.entity.ViewItemReaction;
import com.ss.android.vc.meeting.module.reaction.listener.IReactionViewControlListener;
import com.ss.android.vc.meeting.module.reaction.util.ReactionUtil;
import com.ss.android.vc.meeting.module.reaction.view.IMGeneralView;
import com.ss.android.vc.meeting.module.reaction.view.reaction.C62859a;
import com.ss.android.vc.meeting.module.reaction.view.reaction.ReactionPosition;
import com.ss.android.vc.meeting.module.reaction.widget.C62877d;
import com.ss.android.vc.service.C63634c;
import com.ss.android.vc.statistics.event.VideoChatIMEvent;
import com.ss.android.vc.statistics.event2.MeetingChatReactionEvent;
import com.ss.android.vc.statistics.event2.MeetingOnTheCallEvent2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f*\u0002*-\u0018\u0000 x2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001xB\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J \u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020\u000fH\u0016J\u0012\u0010=\u001a\u0002082\b\u0010>\u001a\u0004\u0018\u00010?H\u0016J\b\u0010@\u001a\u000208H\u0016J\b\u0010A\u001a\u000208H\u0016J\b\u0010B\u001a\u000208H\u0002J\b\u0010C\u001a\u000208H\u0016J\b\u0010D\u001a\u00020EH\u0016J\u0010\u0010F\u001a\u0002082\u0006\u0010G\u001a\u00020\u001bH\u0016J\u0010\u0010H\u001a\u0002082\u0006\u0010G\u001a\u00020\u001bH\u0016J\b\u0010I\u001a\u000208H\u0016J\b\u0010J\u001a\u000208H\u0016J\b\u0010K\u001a\u00020\u001bH\u0016J\b\u0010L\u001a\u000208H\u0016J\u0010\u0010M\u001a\u0002082\u0006\u0010N\u001a\u00020\u001bH\u0016J\u0018\u0010O\u001a\u0002082\u0006\u0010P\u001a\u00020\u001b2\u0006\u0010Q\u001a\u00020\u000fH\u0016JR\u0010R\u001a\u0002082\b\u0010S\u001a\u0004\u0018\u00010T2\u0006\u0010U\u001a\u00020\u000f2\u0006\u0010V\u001a\u00020\u000f2\u0006\u0010W\u001a\u00020\u000f2\u0006\u0010X\u001a\u00020\u000f2\u0006\u0010Y\u001a\u00020\u000f2\u0006\u0010Z\u001a\u00020\u000f2\u0006\u0010[\u001a\u00020\u000f2\u0006\u0010\\\u001a\u00020\u000fH\u0016J\u0018\u0010]\u001a\u0002082\u0006\u0010^\u001a\u00020\u001b2\u0006\u0010_\u001a\u00020\u001bH\u0016J\u0010\u0010`\u001a\u0002082\u0006\u0010Q\u001a\u00020\u000fH\u0016J\b\u0010a\u001a\u000208H\u0002J\b\u0010b\u001a\u000208H\u0016J\u0010\u0010c\u001a\u0002082\u0006\u0010d\u001a\u00020\u000fH\u0016J\u0010\u0010e\u001a\u0002082\u0006\u0010f\u001a\u00020gH\u0016J\u0012\u0010h\u001a\u0002082\b\u0010i\u001a\u0004\u0018\u00010jH\u0016J\u0018\u0010k\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010l\u001a\u00020mH\u0016J\"\u0010n\u001a\u0002082\b\u0010S\u001a\u0004\u0018\u00010T2\u0006\u0010o\u001a\u00020g2\u0006\u0010p\u001a\u00020\u001bH\u0016J \u0010q\u001a\u0002082\u0006\u0010o\u001a\u00020g2\u0006\u0010r\u001a\u00020\u000f2\u0006\u0010s\u001a\u00020\u001bH\u0016J\u0010\u0010t\u001a\u0002082\u0006\u0010u\u001a\u00020\u001bH\u0016J\u0018\u0010v\u001a\u0002082\u0006\u0010^\u001a\u00020\u001b2\u0006\u0010w\u001a\u00020\u001bH\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0011\"\u0004\b\"\u0010\u0013R\u001c\u0010#\u001a\u0004\u0018\u00010$X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0010\u0010)\u001a\u00020*X\u000e¢\u0006\u0004\n\u0002\u0010+R\u0010\u0010,\u001a\u00020-X\u000e¢\u0006\u0004\n\u0002\u0010.R\u001c\u0010/\u001a\u0004\u0018\u000100X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u000e\u00105\u001a\u000206X\u0004¢\u0006\u0002\n\u0000¨\u0006y"}, d2 = {"Lcom/ss/android/vc/meeting/module/reaction/ReactionViewControl;", "Lcom/ss/android/vc/meeting/module/base/BaseViewControl;", "Lcom/ss/android/vc/meeting/module/reaction/listener/IReactionViewControlListener;", "Landroid/view/View$OnLayoutChangeListener;", "Lcom/ss/android/vc/meeting/module/chat/message/AbsMessageControl$IMessageViewControlListener;", "present", "Lcom/ss/android/vc/meeting/module/base/IMeetingCallPresent;", "(Lcom/ss/android/vc/meeting/module/base/IMeetingCallPresent;)V", "imGeneralView", "Lcom/ss/android/vc/meeting/module/reaction/view/IMGeneralView;", "getImGeneralView", "()Lcom/ss/android/vc/meeting/module/reaction/view/IMGeneralView;", "setImGeneralView", "(Lcom/ss/android/vc/meeting/module/reaction/view/IMGeneralView;)V", "lastReactionMaxNum", "", "getLastReactionMaxNum", "()I", "setLastReactionMaxNum", "(I)V", "longClickPopUpWindow", "Lcom/ss/android/vc/meeting/module/reaction/view/reaction/LongClickReactionPopWindow;", "getLongClickPopUpWindow", "()Lcom/ss/android/vc/meeting/module/reaction/view/reaction/LongClickReactionPopWindow;", "setLongClickPopUpWindow", "(Lcom/ss/android/vc/meeting/module/reaction/view/reaction/LongClickReactionPopWindow;)V", "mIsLandscape", "", "getMIsLandscape", "()Z", "setMIsLandscape", "(Z)V", "mMeetingContentHeight", "getMMeetingContentHeight", "setMMeetingContentHeight", "mMeetingContentView", "Landroid/widget/FrameLayout;", "getMMeetingContentView", "()Landroid/widget/FrameLayout;", "setMMeetingContentView", "(Landroid/widget/FrameLayout;)V", "mReactionListener", "com/ss/android/vc/meeting/module/reaction/ReactionViewControl$mReactionListener$1", "Lcom/ss/android/vc/meeting/module/reaction/ReactionViewControl$mReactionListener$1;", "mReactionLongClickListener", "com/ss/android/vc/meeting/module/reaction/ReactionViewControl$mReactionLongClickListener$1", "Lcom/ss/android/vc/meeting/module/reaction/ReactionViewControl$mReactionLongClickListener$1;", "reactionView", "Lcom/ss/android/vc/meeting/module/reaction/widget/VcReactionPanelFacade;", "getReactionView", "()Lcom/ss/android/vc/meeting/module/reaction/widget/VcReactionPanelFacade;", "setReactionView", "(Lcom/ss/android/vc/meeting/module/reaction/widget/VcReactionPanelFacade;)V", "runnable", "Ljava/lang/Runnable;", "addReactionCountNum", "", "position", "Lcom/ss/android/vc/meeting/module/reaction/view/reaction/ReactionPosition;", "countNum", "displayPeriod", "bindView", "reactionSendArea", "Landroid/view/ViewGroup;", "completeRefresh", "contractBar", "createIMExpandView", "destroy", "getMessageSource", "Lcom/ss/android/vc/meeting/module/reaction/entity/IMSource;", "hideBreakoutRoomTips", "withAnimation", "hideMessage", "init", "initDetailPanel", "isShowing", "onBottomBarCollapsed", "onEnterOrExitFullScreenPage", "isFullScreenPage", "onEnterOrExitSketchPage", "isSketchPage", "bottomMargin", "onLayoutChange", "view", "Landroid/view/View;", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "onOrientation", "isLandscape", "isRotate", "onOrientationInSketchPage", "registerContentHeightChangeListener", "restoreViewPos", "setVisibility", "visibility", "showErrorToast", "toastStr", "", "showMessage", "message", "Lcom/ss/android/vc/meeting/module/reaction/entity/InteractionMessage;", "showReaction", "reactionItem", "Lcom/ss/android/vc/meeting/module/reaction/entity/ViewItemReaction;", "startLongClickAnim", "reactionKey", "firstLineOrDetailPanel", "stopLongClickAnim", "count", "shouldCollapseBottomBar", "updateExtendToUp", "reactionExtendUp", "updateReactionMaxLines", "isMessageBubbleVisible", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.reaction.c */
public final class ReactionViewControl extends AbstractC61424d implements View.OnLayoutChangeListener, AbstractC61567a.AbstractC61568a, IReactionViewControlListener {

    /* renamed from: a */
    public static final Companion f157999a = new Companion(null);

    /* renamed from: l */
    private static final String f158000l = f158000l;

    /* renamed from: b */
    private IMGeneralView f158001b;

    /* renamed from: c */
    private FrameLayout f158002c;

    /* renamed from: d */
    private int f158003d;

    /* renamed from: e */
    private int f158004e;

    /* renamed from: f */
    private C62877d f158005f;

    /* renamed from: g */
    private C62859a f158006g;

    /* renamed from: h */
    private boolean f158007h;

    /* renamed from: i */
    private final Runnable f158008i = new RunnableC62805e(this);

    /* renamed from: j */
    private C62802b f158009j;

    /* renamed from: k */
    private C62803c f158010k;

    @Override // com.ss.android.vc.meeting.module.reaction.listener.IReactionViewControlListener
    /* renamed from: c */
    public void mo216871c() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/vc/meeting/module/reaction/ReactionViewControl$Companion;", "", "()V", "TAG", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.reaction.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final IMGeneralView mo216894a() {
        return this.f158001b;
    }

    /* renamed from: b */
    public final boolean mo216896b() {
        return this.f158007h;
    }

    @Override // com.ss.android.vc.meeting.module.chat.p3115a.AbstractC61567a.AbstractC61568a
    /* renamed from: v */
    public IMSource mo213104v() {
        return IMSource.REACTION;
    }

    @Override // com.ss.android.vc.meeting.module.reaction.listener.IReactionViewControlListener
    /* renamed from: e */
    public void mo216873e() {
        C62877d dVar = this.f158005f;
        if (dVar != null) {
            dVar.mo217267c();
        }
    }

    @Override // com.ss.android.vc.meeting.module.reaction.listener.IReactionViewControlListener
    /* renamed from: d */
    public void mo216872d() {
        C62877d dVar = this.f158005f;
        if (dVar != null) {
            dVar.mo217265b(false);
        }
        C62859a aVar = this.f158006g;
        if (aVar != null) {
            aVar.mo211398c();
        }
    }

    @Override // com.ss.android.vc.meeting.module.reaction.listener.IReactionViewControlListener
    /* renamed from: f */
    public void mo216874f() {
        C60700b.m235851b(f158000l, "[contractBar]", "start");
    }

    @Override // com.ss.android.vc.meeting.module.chat.p3115a.AbstractC61567a.AbstractC61568a
    /* renamed from: u */
    public boolean mo213103u() {
        IMGeneralView aVar = this.f158001b;
        if (aVar == null || !aVar.mo217167c()) {
            return false;
        }
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\b"}, d2 = {"com/ss/android/vc/meeting/module/reaction/ReactionViewControl$mReactionListener$1", "Lcom/ss/android/vc/meeting/module/reaction/widget/VcReactionPanelFacade$ReactionClickListener;", "onReactionClick", "", "reactionKey", "", "onShowLessBtnClick", "onShowMoreBtnClick", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.reaction.c$b */
    public static final class C62802b implements C62877d.AbstractC62881b {

        /* renamed from: a */
        final /* synthetic */ ReactionViewControl f158011a;

        @Override // com.ss.android.vc.meeting.module.reaction.widget.C62877d.AbstractC62881b
        /* renamed from: a */
        public void mo216898a() {
            C61303k meeting = this.f158011a.getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
            meeting.ai().bz_();
        }

        @Override // com.ss.android.vc.meeting.module.reaction.widget.C62877d.AbstractC62881b
        /* renamed from: b */
        public void mo216900b() {
            C61303k meeting = this.f158011a.getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
            meeting.ai().bA_();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C62802b(ReactionViewControl cVar) {
            this.f158011a = cVar;
        }

        @Override // com.ss.android.vc.meeting.module.reaction.widget.C62877d.AbstractC62881b
        /* renamed from: a */
        public void mo216899a(String str) {
            AbstractC61444a ai2;
            AbsReactionControl ar;
            VideoChat videoChat;
            Intrinsics.checkParameterIsNotNull(str, "reactionKey");
            if (!TextUtils.equals(str, "#android#reaction#show#nothing#holder")) {
                AbstractC61429i iVar = this.f158011a.mPresent;
                Intrinsics.checkExpressionValueIsNotNull(iVar, "mPresent");
                C61303k f = iVar.mo212921f();
                if (!(f == null || (ar = f.ar()) == null)) {
                    AbstractC61429i iVar2 = this.f158011a.mPresent;
                    Intrinsics.checkExpressionValueIsNotNull(iVar2, "mPresent");
                    C61303k f2 = iVar2.mo212921f();
                    if (f2 != null) {
                        videoChat = f2.mo212056e();
                    } else {
                        videoChat = null;
                    }
                    ar.mo216851a(str, videoChat);
                }
                AbstractC61429i iVar3 = this.f158011a.mPresent;
                Intrinsics.checkExpressionValueIsNotNull(iVar3, "mPresent");
                C61303k f3 = iVar3.mo212921f();
                if (!(f3 == null || (ai2 = f3.ai()) == null)) {
                    ai2.mo213042m();
                }
                MeetingOnTheCallEvent2 a = MeetingOnTheCallEvent2.f160846b.mo220311a();
                C61303k meeting = this.f158011a.getMeeting();
                Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
                MeetingOnTheCallEvent2.m249824a(a, meeting, "reaction", null, null, null, null, 60, null);
                MeetingChatReactionEvent.Companion aVar = MeetingChatReactionEvent.f160835a;
                C61303k meeting2 = this.f158011a.getMeeting();
                Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
                aVar.mo220282a(meeting2, "send_reaction", str, null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.reaction.c$e */
    static final class RunnableC62805e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ReactionViewControl f158016a;

        RunnableC62805e(ReactionViewControl cVar) {
            this.f158016a = cVar;
        }

        public final void run() {
            ReactionViewControl cVar = this.f158016a;
            boolean b = cVar.mo216896b();
            IMGeneralView a = this.f158016a.mo216894a();
            boolean z = true;
            if (a == null || !a.mo217165b()) {
                z = false;
            }
            cVar.mo216895a(b, z);
        }
    }

    /* renamed from: g */
    private final void m245804g() {
        FrameLayout frameLayout = (FrameLayout) this.mPresent.mo212917a(R.id.container_content);
        this.f158002c = frameLayout;
        if (frameLayout != null) {
            frameLayout.addOnLayoutChangeListener(this);
        }
    }

    /* renamed from: h */
    private final void m245805h() {
        if (!C63634c.m249496b("byteview.meeting.android.chat")) {
            C60700b.m235851b(f158000l, "[createIMExpandView]", "Fg not enable");
            return;
        }
        C60748b.m236068a(getActivity(), R.layout.vc_view_im_general, (FrameLayout) findViewById(R.id.container_im_expand), true);
        AbstractC61429i iVar = this.mPresent;
        Intrinsics.checkExpressionValueIsNotNull(iVar, "mPresent");
        this.f158001b = new IMGeneralView(iVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.reaction.c$d */
    static final class RunnableC62804d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ReactionViewControl f158013a;

        /* renamed from: b */
        final /* synthetic */ FrameLayout f158014b;

        /* renamed from: c */
        final /* synthetic */ boolean f158015c;

        RunnableC62804d(ReactionViewControl cVar, FrameLayout frameLayout, boolean z) {
            this.f158013a = cVar;
            this.f158014b = frameLayout;
            this.f158015c = z;
        }

        public final void run() {
            ViewGroup.LayoutParams layoutParams;
            int i;
            FrameLayout frameLayout = this.f158014b;
            if (frameLayout != null) {
                layoutParams = frameLayout.getLayoutParams();
            } else {
                layoutParams = null;
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            if (this.f158015c) {
                if (layoutParams2 != null) {
                    layoutParams2.removeRule(8);
                }
                if (layoutParams2 != null) {
                    layoutParams2.addRule(8, R.id.container_bottom_bar);
                }
            } else {
                if (layoutParams2 != null) {
                    layoutParams2.removeRule(8);
                }
                if (layoutParams2 != null) {
                    layoutParams2.addRule(8, R.id.container_content_layout);
                }
            }
            FrameLayout frameLayout2 = this.f158014b;
            if (frameLayout2 != null) {
                frameLayout2.setLayoutParams(layoutParams2);
            }
            if (this.f158015c) {
                i = C60773o.m236115a(42.0d);
            } else if (this.f158013a.mo216896b()) {
                i = C60773o.m236115a(16.0d);
            } else {
                i = C60773o.m236115a(40.0d);
            }
            IMGeneralView a = this.f158013a.mo216894a();
            if (a != null) {
                a.mo217163b(i);
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void destroy() {
        super.destroy();
        IMGeneralView aVar = this.f158001b;
        if (aVar != null) {
            aVar.mo217156a();
        }
        FrameLayout frameLayout = this.f158002c;
        if (frameLayout != null) {
            frameLayout.removeOnLayoutChangeListener(this);
        }
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        meeting.ar().mo216857b(this);
        C61303k meeting2 = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
        AbstractC61567a aC = meeting2.aC();
        if (aC != null) {
            aC.mo213388b(this);
        }
        C62859a aVar2 = this.f158006g;
        if (aVar2 != null) {
            aVar2.mo211398c();
        }
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void init() {
        super.init();
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        meeting.ar().mo216847a(this);
        C61303k meeting2 = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
        AbstractC61567a aC = meeting2.aC();
        if (aC != null) {
            aC.mo213385a(this);
        }
        m245805h();
        m245804g();
        boolean f = C61999a.m242220f();
        IMGeneralView aVar = this.f158001b;
        boolean z = true;
        if (aVar == null || !aVar.mo217165b()) {
            z = false;
        }
        mo216895a(f, z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J*\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/vc/meeting/module/reaction/ReactionViewControl$mReactionLongClickListener$1", "Lcom/ss/android/vc/meeting/module/reaction/widget/VcReactionPanelFacade$ReactionLongClickListener;", "onStartLongClickAnim", "", "view", "Landroid/view/View;", "reactionKey", "", "firstLineOrDetailPanel", "", "onStopLongClickAnim", "duration", "", "shouldCollapseBottomBar", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.reaction.c$c */
    public static final class C62803c implements C62877d.AbstractC62882c {

        /* renamed from: a */
        final /* synthetic */ ReactionViewControl f158012a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C62803c(ReactionViewControl cVar) {
            this.f158012a = cVar;
        }

        @Override // com.ss.android.vc.meeting.module.reaction.widget.C62877d.AbstractC62882c
        /* renamed from: a */
        public void mo216902a(View view, String str, boolean z) {
            AbsReactionControl ar;
            Intrinsics.checkParameterIsNotNull(str, "reactionKey");
            if (!TextUtils.equals(str, "#android#reaction#show#nothing#holder")) {
                AbstractC61429i iVar = this.f158012a.mPresent;
                Intrinsics.checkExpressionValueIsNotNull(iVar, "mPresent");
                C61303k f = iVar.mo212921f();
                if (f != null && (ar = f.ar()) != null) {
                    ar.mo216845a(view, str, z);
                }
            }
        }

        @Override // com.ss.android.vc.meeting.module.reaction.widget.C62877d.AbstractC62882c
        /* renamed from: a */
        public void mo216901a(View view, String str, long j, boolean z) {
            AbsReactionControl ar;
            Intrinsics.checkParameterIsNotNull(str, "reactionKey");
            if (!TextUtils.equals(str, "#android#reaction#show#nothing#holder")) {
                int i = (int) (j / ((long) LocationRequest.PRIORITY_INDOOR));
                AbstractC61429i iVar = this.f158012a.mPresent;
                Intrinsics.checkExpressionValueIsNotNull(iVar, "mPresent");
                C61303k f = iVar.mo212921f();
                if (f != null && (ar = f.ar()) != null) {
                    ar.mo216850a(str, i, z);
                }
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.reaction.listener.IReactionViewControlListener
    /* renamed from: a */
    public void mo216862a(int i) {
        IMGeneralView aVar = this.f158001b;
        if (aVar != null) {
            aVar.mo217157a(i);
        }
    }

    @Override // com.ss.android.vc.meeting.module.reaction.listener.IReactionViewControlListener
    /* renamed from: b */
    public void mo216870b(boolean z) {
        C62877d dVar = this.f158005f;
        if (dVar != null) {
            dVar.mo217263a(z);
        }
    }

    @Override // com.ss.android.vc.meeting.module.chat.p3115a.AbstractC61567a.AbstractC61568a
    /* renamed from: i */
    public void mo213098i(boolean z) {
        IMGeneralView aVar = this.f158001b;
        if (aVar != null) {
            aVar.mo217161a(z);
        }
        mo216895a(C61999a.m242220f(), false);
    }

    @Override // com.ss.android.vc.meeting.module.reaction.listener.IReactionViewControlListener
    /* renamed from: a */
    public void mo216864a(ViewGroup viewGroup) {
        if (viewGroup != null) {
            C62877d a = ReactionUtil.m245802a(viewGroup, this.f158009j, this.f158010k);
            this.f158005f = a;
            if (a != null) {
                a.mo217262a();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReactionViewControl(AbstractC61429i iVar) {
        super(iVar);
        Intrinsics.checkParameterIsNotNull(iVar, "present");
        init();
        this.f158009j = new C62802b(this);
        this.f158010k = new C62803c(this);
    }

    @Override // com.ss.android.vc.meeting.module.chat.p3115a.AbstractC61567a.AbstractC61568a
    /* renamed from: b */
    public void mo213096b(InteractionMessage aVar) {
        AbstractC61429i iVar = this.mPresent;
        Intrinsics.checkExpressionValueIsNotNull(iVar, "mPresent");
        C61303k f = iVar.mo212921f();
        Intrinsics.checkExpressionValueIsNotNull(f, "mPresent.vcMeeting");
        AbstractC61444a ai2 = f.ai();
        Intrinsics.checkExpressionValueIsNotNull(ai2, "mPresent.vcMeeting.bottomBarControl");
        if (!ai2.mo213012a()) {
            IMGeneralView aVar2 = this.f158001b;
            if (aVar2 != null) {
                aVar2.mo217164b(aVar);
            }
            mo216895a(C61999a.m242220f(), true);
        }
    }

    @Override // com.ss.android.vc.meeting.module.reaction.listener.IReactionViewControlListener
    /* renamed from: a */
    public void mo216868a(boolean z) {
        UICallbackExecutor.execute(new RunnableC62804d(this, (FrameLayout) findViewById(R.id.container_im_expand), z));
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void onOrientation(boolean z, boolean z2) {
        this.f158007h = z;
        IMGeneralView aVar = this.f158001b;
        boolean z3 = true;
        if (aVar == null || !aVar.mo217165b()) {
            z3 = false;
        }
        mo216895a(z, z3);
        IMGeneralView aVar2 = this.f158001b;
        if (aVar2 != null) {
            aVar2.mo217162a(z, z2);
        }
    }

    @Override // com.ss.android.vc.meeting.module.reaction.listener.IReactionViewControlListener
    /* renamed from: a */
    public void mo216866a(ReactionPosition reactionPosition, ViewItemReaction fVar) {
        Intrinsics.checkParameterIsNotNull(reactionPosition, "position");
        Intrinsics.checkParameterIsNotNull(fVar, "reactionItem");
        IMGeneralView aVar = this.f158001b;
        if (aVar != null) {
            aVar.mo217160a(reactionPosition, fVar);
        }
    }

    @Override // com.ss.android.vc.meeting.module.reaction.listener.IReactionViewControlListener
    /* renamed from: a */
    public void mo216869a(boolean z, int i) {
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        meeting.aC().mo213387a(false);
        if (!z) {
            if (this.f158007h) {
                i = C60773o.m236115a(16.0d);
            } else {
                i = C60773o.m236115a(40.0d);
            }
        }
        IMGeneralView aVar = this.f158001b;
        if (aVar != null) {
            aVar.mo217157a(i);
        }
    }

    /* renamed from: a */
    public void mo216895a(boolean z, boolean z2) {
        int i;
        int i2 = this.f158003d;
        if (C61999a.m242220f()) {
            i = C60773o.m236115a(32.0d);
        } else {
            i2 /= 2;
            i = C60773o.m236115a(20.0d);
        }
        int i3 = i2 - i;
        if (z2) {
            i3 -= C60773o.m236115a(62.0d);
        }
        int a = i3 / C60773o.m236115a(52.0d);
        if (a != this.f158004e) {
            String str = f158000l;
            C60700b.m235851b(str, "[updateReactionMaxLines]", "mMeetingContentHeight is " + this.f158003d + ", " + "isLandscape is " + z + ", " + "isMessageBubbleVisible is " + z2 + "currMaxNum is " + a + ", " + "lastReactionMaxNum is " + this.f158004e);
            this.f158004e = a;
            C61303k meeting = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
            meeting.ar().mo216844a(a);
            IMGeneralView aVar = this.f158001b;
            if (aVar != null) {
                aVar.mo217169d(a);
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.reaction.listener.IReactionViewControlListener
    /* renamed from: a */
    public void mo216865a(ReactionPosition reactionPosition, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(reactionPosition, "position");
        IMGeneralView aVar = this.f158001b;
        if (aVar != null) {
            aVar.mo217159a(reactionPosition, i, i2);
        }
    }

    @Override // com.ss.android.vc.meeting.module.reaction.listener.IReactionViewControlListener
    /* renamed from: a */
    public void mo216863a(View view, String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "reactionKey");
        String str2 = f158000l;
        C60700b.m235851b(str2, "[startLongClickAnim]", "reactionKey:" + str + ", firstLineOrDetailPanel:" + z);
        C62859a a = C62859a.m246061a(getContext(), getMeeting(), str);
        this.f158006g = a;
        if (a != null) {
            a.mo217216a(view, z);
        }
    }

    @Override // com.ss.android.vc.meeting.module.reaction.listener.IReactionViewControlListener
    /* renamed from: a */
    public void mo216867a(String str, int i, boolean z) {
        VideoChat videoChat;
        AbstractC61444a ai2;
        Intrinsics.checkParameterIsNotNull(str, "reactionKey");
        C62859a aVar = this.f158006g;
        if (aVar == null || !aVar.mo219704l()) {
            String str2 = f158000l;
            C60700b.m235851b(str2, "[stopLongClickAnim2]", "window is null. reactionKey:" + str + ", count:" + i);
            return;
        }
        String str3 = f158000l;
        C60700b.m235851b(str3, "[stopLongClickAnim]", "reactionKey:" + str + ", count:" + i);
        C62859a aVar2 = this.f158006g;
        if (aVar2 != null) {
            aVar2.mo211398c();
        }
        VideoChatIMEvent cdVar = VideoChatIMEvent.f160907a;
        AbstractC61429i iVar = this.mPresent;
        Intrinsics.checkExpressionValueIsNotNull(iVar, "mPresent");
        C61303k f = iVar.mo212921f();
        if (f != null) {
            videoChat = f.mo212056e();
        } else {
            videoChat = null;
        }
        cdVar.mo220402a(str, i, videoChat);
        if (z) {
            AbstractC61429i iVar2 = this.mPresent;
            Intrinsics.checkExpressionValueIsNotNull(iVar2, "mPresent");
            C61303k f2 = iVar2.mo212921f();
            if (f2 != null && (ai2 = f2.ai()) != null) {
                ai2.mo213042m();
            }
        }
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        if (i != i5 || i3 != i7 || i2 != i6 || i4 != i8) {
            FrameLayout frameLayout = this.f158002c;
            if (frameLayout != null) {
                i9 = frameLayout.getMeasuredHeight();
            } else {
                i9 = 0;
            }
            this.f158003d = i9;
            UICallbackExecutor.removeCallbacks(this.f158008i);
            UICallbackExecutor.executeDelayed(this.f158008i, 500);
        }
    }
}
