package com.ss.android.vc.meeting.module.topbar;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LiveData;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60748b;
import com.ss.android.vc.common.p3083e.C60752f;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.common.widget.AdaptiveWidthTextView;
import com.ss.android.vc.dependency.AbstractC60888d;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.entity.LanguageType;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatSettings;
import com.ss.android.vc.entity.livestream.LiveInfo;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.model.C61381c;
import com.ss.android.vc.meeting.model.C61383d;
import com.ss.android.vc.meeting.model.MeetingSpecificData;
import com.ss.android.vc.meeting.model.data.MeetingTimeData;
import com.ss.android.vc.meeting.module.VCBreakoutRoomInfo;
import com.ss.android.vc.meeting.module.base.AbstractC61424d;
import com.ss.android.vc.meeting.module.base.AbstractC61429i;
import com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl;
import com.ss.android.vc.meeting.module.interpretation.p3128c.C61958a;
import com.ss.android.vc.meeting.module.interpretation.widget.LanguageLabel;
import com.ss.android.vc.meeting.module.livestream.C62070h;
import com.ss.android.vc.meeting.module.p3129j.AbstractC61994a;
import com.ss.android.vc.meeting.module.topbar.AbstractC63441a;
import com.ss.android.vc.meeting.module.topbar.data.PromptData;
import com.ss.android.vc.meeting.module.topbar.data.TopBarInterpretationData;
import com.ss.android.vc.meeting.module.topbar.data.TopBarLiveIconData;
import com.ss.android.vc.meeting.module.topbar.viewstub.BreakoutRoomViewStub;
import com.ss.android.vc.meeting.module.topbar.viewstub.InterpretationAreaStub;
import com.ss.android.vc.meeting.module.topbar.viewstub.LiveAreaStub;
import com.ss.android.vc.meeting.module.topbar.viewstub.LockViewStub;
import com.ss.android.vc.meeting.module.topbar.viewstub.NetworkAreaStub;
import com.ss.android.vc.meeting.module.topbar.viewstub.RecordAreaStub;
import com.ss.android.vc.meeting.module.topbar.viewstub.TimeLimitViewStub;
import com.ss.android.vc.meeting.module.topbar.viewstub.TopBarPromptStub;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import com.ss.android.vc.service.C63634c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u00104\u001a\u000205H\u0016J\b\u00106\u001a\u000205H\u0016J\b\u00107\u001a\u000205H\u0016J\b\u00108\u001a\u000205H\u0002J\b\u00109\u001a\u000205H\u0002J\u001c\u0010:\u001a\u0002052\b\u0010;\u001a\u0004\u0018\u00010\b2\b\u0010<\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010=\u001a\u000205H\u0016J\u0018\u0010>\u001a\u0002052\u0006\u0010;\u001a\u00020\b2\u0006\u0010<\u001a\u00020\bH\u0016J\b\u0010?\u001a\u000205H\u0016J\u0010\u0010@\u001a\u0002052\u0006\u0010A\u001a\u00020BH\u0016J\u0010\u0010C\u001a\u0002052\u0006\u0010D\u001a\u00020BH\u0016J\u0010\u0010E\u001a\u0002052\u0006\u0010F\u001a\u00020BH\u0016J\u0006\u0010G\u001a\u000205J\b\u0010H\u001a\u000205H\u0016J\u0010\u0010I\u001a\u0002052\u0006\u0010J\u001a\u00020BH\u0016J\u0012\u0010K\u001a\u0002052\b\u0010L\u001a\u0004\u0018\u00010MH\u0016J\u0010\u0010N\u001a\u0002052\u0006\u0010O\u001a\u00020PH\u0002J\u0010\u0010Q\u001a\u0002052\u0006\u0010R\u001a\u00020SH\u0016J\u0010\u0010T\u001a\u0002052\u0006\u0010U\u001a\u00020BH\u0016J\u0012\u0010V\u001a\u0002052\b\u0010W\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010X\u001a\u0002052\b\u0010Y\u001a\u0004\u0018\u00010ZH\u0016J\u0010\u0010[\u001a\u0002052\u0006\u0010\\\u001a\u00020BH\u0016J\u0010\u0010]\u001a\u0002052\u0006\u0010^\u001a\u00020BH\u0016J\u0012\u0010_\u001a\u0002052\b\u0010`\u001a\u0004\u0018\u00010aH\u0016J\u0010\u0010b\u001a\u0002052\u0006\u0010c\u001a\u00020BH\u0016R\u000e\u0010\u0007\u001a\u00020\bXD¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u0004\u0018\u00010.X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u000100X\u000e¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u000102X\u000e¢\u0006\u0002\n\u0000R\u0010\u00103\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006d"}, d2 = {"Lcom/ss/android/vc/meeting/module/topbar/TopBarViewControl;", "Lcom/ss/android/vc/meeting/module/base/BaseViewControl;", "Lcom/ss/android/vc/meeting/module/topbar/AbsTopBarControl$ITopBarViewListener;", "Lcom/ss/android/vc/meeting/module/breakoutroom/AbsBreakoutRoomControl$IRoomStatusChangedListener;", "present", "Lcom/ss/android/vc/meeting/module/base/IMeetingCallPresent;", "(Lcom/ss/android/vc/meeting/module/base/IMeetingCallPresent;)V", "TAG", "", "backBtn", "Landroid/view/View;", "container", "Landroid/widget/FrameLayout;", "dividerBarView", "expandSolid", "externalTagView", "followTitleLeftContainer", "Landroid/widget/LinearLayout;", "hangUpBtn", "interpretationAreaStub", "Lcom/ss/android/vc/meeting/module/topbar/viewstub/InterpretationAreaStub;", "leaveRoom", "liveAreaStub", "Lcom/ss/android/vc/meeting/module/topbar/viewstub/LiveAreaStub;", "lockViewStub", "Lcom/ss/android/vc/meeting/module/topbar/viewstub/LockViewStub;", "networkAreaStub", "Lcom/ss/android/vc/meeting/module/topbar/viewstub/NetworkAreaStub;", "recordAreaStub", "Lcom/ss/android/vc/meeting/module/topbar/viewstub/RecordAreaStub;", "roomDividerBarView", "roomTitleStub", "Lcom/ss/android/vc/meeting/module/topbar/viewstub/BreakoutRoomViewStub;", "rotateDegree", "", "statusBarBgView", "statusIconContainer", "time", "Lcom/ss/android/vc/common/widget/AdaptiveWidthTextView;", "timeLimitViewStub", "Lcom/ss/android/vc/meeting/module/topbar/viewstub/TimeLimitViewStub;", "title", "Landroid/widget/TextView;", "titleMoreGroup", "titleMoreIcon", "topBarLayout", "Landroidx/constraintlayout/widget/ConstraintLayout;", "topBarLeftContainer", "Landroid/view/ViewGroup;", "topBarPromptStub", "Lcom/ss/android/vc/meeting/module/topbar/viewstub/TopBarPromptStub;", "topbarStatusIcons", "destroy", "", "disableViewAfterHangup", "init", "initLogicOfViews", "initStatusBar", "onJoinEnd", "originId", "dstId", "onJoinStart", "onLeaveEnd", "onLeaveStart", "setBackBtnEnable", "enable", "", "showOrHideTopBar", "show", "updateBreakoutRoomTitle", "isShow", "updateDividerBar", "updateExpandSolidIcon", "updateExternalIcon", "isExternalMeeting", "updateInterpretationView", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/vc/meeting/module/topbar/data/TopBarInterpretationData;", "updateLiveAudienceNumber", "audienceCount", "", "updateLiveIcon", "liveIconData", "Lcom/ss/android/vc/meeting/module/topbar/data/TopBarLiveIconData;", "updateLockIcon", "isLocked", "updateMeetingId", "meetingId", "updateMeetingTime", "timeData", "Lcom/ss/android/vc/meeting/model/data/MeetingTimeData;", "updateRecordingIcon", "isRecording", "updateTimeLimitTv", "showTimeLimit", "updateTopBarPromptData", "promptData", "Lcom/ss/android/vc/meeting/module/topbar/data/PromptData;", "updateWeakNetworkIcon", "isWeak", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.topbar.c */
public final class TopBarViewControl extends AbstractC61424d implements AbsBreakoutRoomControl.AbstractC61510d, AbstractC63441a.AbstractC63442a {

    /* renamed from: A */
    private float f160243A;

    /* renamed from: a */
    private final String f160244a = "TopBarViewControl";

    /* renamed from: b */
    private View f160245b;

    /* renamed from: c */
    private ConstraintLayout f160246c;

    /* renamed from: d */
    private View f160247d;

    /* renamed from: e */
    private View f160248e;

    /* renamed from: f */
    private View f160249f;

    /* renamed from: g */
    private LiveAreaStub f160250g;

    /* renamed from: h */
    private RecordAreaStub f160251h;

    /* renamed from: i */
    private NetworkAreaStub f160252i;

    /* renamed from: j */
    private TextView f160253j;

    /* renamed from: k */
    private View f160254k;

    /* renamed from: l */
    private View f160255l;

    /* renamed from: m */
    private ViewGroup f160256m;

    /* renamed from: n */
    private View f160257n;

    /* renamed from: o */
    private View f160258o;

    /* renamed from: p */
    private AdaptiveWidthTextView f160259p;

    /* renamed from: q */
    private LockViewStub f160260q;

    /* renamed from: r */
    private BreakoutRoomViewStub f160261r;

    /* renamed from: s */
    private View f160262s;

    /* renamed from: t */
    private TimeLimitViewStub f160263t;

    /* renamed from: u */
    private TopBarPromptStub f160264u;

    /* renamed from: v */
    private InterpretationAreaStub f160265v;

    /* renamed from: w */
    private View f160266w;

    /* renamed from: x */
    private FrameLayout f160267x = ((FrameLayout) findViewById(R.id.container_top_bar));

    /* renamed from: y */
    private View f160268y;

    /* renamed from: z */
    private View f160269z;

    @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl.AbstractC61510d
    public void bE_() {
    }

    /* renamed from: g */
    private final void m248627g() {
        ViewGroup.LayoutParams layoutParams;
        View view = this.f160247d;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            layoutParams.height = C60776r.m236148f();
        }
        View view2 = this.f160247d;
        if (view2 != null) {
            view2.setLayoutParams(layoutParams);
        }
    }

    @Override // com.ss.android.vc.meeting.module.topbar.AbstractC63441a.AbstractC63442a
    /* renamed from: a */
    public void mo219489a() {
        View view = this.f160248e;
        if (view != null) {
            view.setEnabled(false);
        }
        ViewGroup viewGroup = this.f160256m;
        if (viewGroup != null) {
            viewGroup.setEnabled(false);
        }
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        meeting.ai().mo213037h();
    }

    /* renamed from: f */
    private final void m248626f() {
        m248627g();
        View view = this.f160248e;
        if (view != null) {
            view.setOnClickListener(new C63455a(this));
        }
        View view2 = this.f160249f;
        if (view2 != null) {
            view2.setOnClickListener(new C63456b(this));
        }
        View view3 = this.f160266w;
        if (view3 != null) {
            view3.setOnClickListener(new C63457c(this));
        }
        ViewGroup viewGroup = this.f160256m;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new C63458d(this));
        }
    }

    @Override // com.ss.android.vc.meeting.module.topbar.AbstractC63441a.AbstractC63442a
    /* renamed from: c */
    public void mo219497c() {
        float f = this.f160243A;
        RotateAnimation rotateAnimation = new RotateAnimation(f, f + 180.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(300);
        rotateAnimation.setFillAfter(true);
        this.f160243A = (this.f160243A + ((float) 180)) % ((float) 360);
        View view = this.f160269z;
        if (view != null) {
            view.startAnimation(rotateAnimation);
        }
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void destroy() {
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        meeting.ah().mo219484b(this);
        C61303k meeting2 = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
        meeting2.al().mo213171b(this);
    }

    @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl.AbstractC61510d
    /* renamed from: d */
    public void mo213204d() {
        if (ParticipantUtil.m248733c(getMeeting())) {
            C61303k meeting = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
            AbsBreakoutRoomControl al = meeting.al();
            Intrinsics.checkExpressionValueIsNotNull(al, "meeting.breakoutRoomControl");
            if (al.mo213185l() == VCBreakoutRoomInfo.Status.COUNT_DOWN) {
                View view = this.f160249f;
                if (view != null) {
                    view.setVisibility(8);
                }
                View view2 = this.f160266w;
                if (view2 != null) {
                    view2.setVisibility(0);
                    return;
                }
                return;
            }
        }
        View view3 = this.f160249f;
        if (view3 != null) {
            view3.setVisibility(0);
        }
        View view4 = this.f160266w;
        if (view4 != null) {
            view4.setVisibility(8);
        }
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void init() {
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        meeting.ah().mo219477a(this);
        C61303k meeting2 = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
        meeting2.al().mo213165a(this);
        C61303k meeting3 = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting3, "meeting");
        AbsBreakoutRoomControl al = meeting3.al();
        Intrinsics.checkExpressionValueIsNotNull(al, "meeting.breakoutRoomControl");
        if (al.mo213181h()) {
            C61303k meeting4 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting4, "meeting");
            AbsBreakoutRoomControl al2 = meeting4.al();
            Intrinsics.checkExpressionValueIsNotNull(al2, "meeting.breakoutRoomControl");
            if (al2.mo213185l() == VCBreakoutRoomInfo.Status.COUNT_DOWN && ParticipantUtil.m248733c(getMeeting())) {
                View view = this.f160266w;
                if (view != null) {
                    view.setVisibility(0);
                }
                View view2 = this.f160249f;
                if (view2 != null) {
                    view2.setVisibility(8);
                    return;
                }
                return;
            }
        }
        View view3 = this.f160266w;
        if (view3 != null) {
            view3.setVisibility(8);
        }
        View view4 = this.f160249f;
        if (view4 != null) {
            view4.setVisibility(0);
        }
    }

    /* renamed from: e */
    public final void mo219527e() {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        C61383d I;
        C61381c a;
        LiveInfo m;
        VideoChat e;
        VideoChatSettings videoChatSettings;
        C61383d I2;
        C61381c a2;
        AbstractC61994a an;
        C61303k meeting = getMeeting();
        Boolean bool4 = null;
        if (meeting == null || (an = meeting.an()) == null) {
            bool = null;
        } else {
            bool = Boolean.valueOf(an.mo214607b());
        }
        C61303k meeting2 = getMeeting();
        if (meeting2 == null || (I2 = meeting2.mo212091I()) == null || (a2 = I2.mo212490a()) == null) {
            bool2 = null;
        } else {
            bool2 = Boolean.valueOf(a2.mo212482n());
        }
        C61303k meeting3 = getMeeting();
        if (meeting3 == null || (e = meeting3.mo212056e()) == null || (videoChatSettings = e.getVideoChatSettings()) == null) {
            bool3 = null;
        } else {
            bool3 = Boolean.valueOf(videoChatSettings.isLocked());
        }
        C61303k meeting4 = getMeeting();
        if (!(meeting4 == null || (I = meeting4.mo212091I()) == null || (a = I.mo212490a()) == null || (m = a.mo212481m()) == null)) {
            bool4 = Boolean.valueOf(m.mo209943b());
        }
        if (Intrinsics.areEqual((Object) true, (Object) bool) || Intrinsics.areEqual((Object) true, (Object) bool2) || Intrinsics.areEqual((Object) true, (Object) bool3) || Intrinsics.areEqual((Object) true, (Object) bool4)) {
            View view = this.f160268y;
            if (view != null) {
                view.setVisibility(0);
                return;
            }
            return;
        }
        View view2 = this.f160268y;
        if (view2 != null) {
            view2.setVisibility(8);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/topbar/TopBarViewControl$initLogicOfViews$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.topbar.c$a */
    public static final class C63455a extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ TopBarViewControl f160270a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C63455a(TopBarViewControl cVar) {
            this.f160270a = cVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            C61303k meeting = this.f160270a.getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
            meeting.ah().mo219483b(this.f160270a.getActivity());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/topbar/TopBarViewControl$initLogicOfViews$2", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.topbar.c$b */
    public static final class C63456b extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ TopBarViewControl f160271a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C63456b(TopBarViewControl cVar) {
            this.f160271a = cVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            C61303k meeting = this.f160271a.getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
            meeting.ah().mo219475a(this.f160271a.getActivity(), view);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/topbar/TopBarViewControl$initLogicOfViews$3", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.topbar.c$c */
    public static final class C63457c extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ TopBarViewControl f160272a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C63457c(TopBarViewControl cVar) {
            this.f160272a = cVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            C61303k meeting = this.f160272a.getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
            meeting.ah().mo219475a(this.f160272a.getActivity(), view);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/topbar/TopBarViewControl$initLogicOfViews$4", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.topbar.c$d */
    public static final class C63458d extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ TopBarViewControl f160273a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C63458d(TopBarViewControl cVar) {
            this.f160273a = cVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            C61303k meeting = this.f160273a.getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
            meeting.ah().mo219474a(this.f160273a.getActivity());
            C61303k meeting2 = this.f160273a.getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
            meeting2.ah().mo219486c();
        }
    }

    @Override // com.ss.android.vc.meeting.module.topbar.AbstractC63441a.AbstractC63442a
    /* renamed from: a */
    public void mo219495a(boolean z) {
        View view = this.f160248e;
        if (view != null) {
            view.setEnabled(z);
        }
    }

    @Override // com.ss.android.vc.meeting.module.topbar.AbstractC63441a.AbstractC63442a
    /* renamed from: a */
    public void mo219494a(String str) {
        TextView textView;
        if (str != null && (textView = this.f160253j) != null) {
            textView.setText(str);
        }
    }

    @Override // com.ss.android.vc.meeting.module.topbar.AbstractC63441a.AbstractC63442a
    /* renamed from: g */
    public void mo219502g(boolean z) {
        int i;
        View view = this.f160245b;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    @Override // com.ss.android.vc.meeting.module.topbar.AbstractC63441a.AbstractC63442a
    /* renamed from: b */
    public void mo219496b(boolean z) {
        mo219527e();
        RecordAreaStub fVar = this.f160251h;
        if (fVar == null) {
            return;
        }
        if (z) {
            fVar.mo219545a();
        } else {
            fVar.mo219546b();
        }
    }

    @Override // com.ss.android.vc.meeting.module.topbar.AbstractC63441a.AbstractC63442a
    /* renamed from: c */
    public void mo219498c(boolean z) {
        mo219527e();
        NetworkAreaStub eVar = this.f160252i;
        if (eVar == null) {
            return;
        }
        if (z) {
            eVar.mo219543a();
        } else {
            eVar.mo219544b();
        }
    }

    @Override // com.ss.android.vc.meeting.module.topbar.AbstractC63441a.AbstractC63442a
    /* renamed from: a */
    public void mo219491a(PromptData aVar) {
        if (aVar == null) {
            return;
        }
        if (aVar.mo219504a() == TopBarPromptStub.Mode.GONE) {
            TopBarPromptStub topBarPromptStub = this.f160264u;
            if (topBarPromptStub != null) {
                topBarPromptStub.mo219528a();
            }
            View view = this.f160258o;
            if (view != null) {
                view.setVisibility(0);
                return;
            }
            return;
        }
        TopBarPromptStub topBarPromptStub2 = this.f160264u;
        if (topBarPromptStub2 != null) {
            topBarPromptStub2.mo219529a(aVar.mo219504a(), aVar.mo219505b());
        }
        View view2 = this.f160258o;
        if (view2 != null) {
            view2.setVisibility(8);
        }
    }

    @Override // com.ss.android.vc.meeting.module.topbar.AbstractC63441a.AbstractC63442a
    /* renamed from: d */
    public void mo219499d(boolean z) {
        mo219527e();
        LockViewStub dVar = this.f160260q;
        if (dVar == null) {
            return;
        }
        if (z) {
            dVar.mo219541a();
        } else {
            dVar.mo219542b();
        }
    }

    @Override // com.ss.android.vc.meeting.module.topbar.AbstractC63441a.AbstractC63442a
    /* renamed from: h */
    public void mo219503h(boolean z) {
        if (z) {
            ConstraintLayout constraintLayout = this.f160246c;
            if (constraintLayout != null) {
                C60752f.m236079a((View) constraintLayout);
            }
            View view = this.f160247d;
            if (view != null) {
                C60752f.m236079a(view);
                return;
            }
            return;
        }
        ConstraintLayout constraintLayout2 = this.f160246c;
        if (constraintLayout2 != null) {
            C60752f.m236083c(constraintLayout2);
        }
        View view2 = this.f160247d;
        if (view2 != null) {
            C60752f.m236083c(view2);
        }
    }

    /* renamed from: a */
    private final void m248625a(int i) {
        Boolean bool;
        String str;
        AbstractC60888d appEnvDependency = VideoChatModuleDependency.getAppEnvDependency();
        TextView textView = null;
        if (appEnvDependency != null) {
            bool = Boolean.valueOf(appEnvDependency.mo196333c());
        } else {
            bool = null;
        }
        String valueOf = String.valueOf(i);
        if (Intrinsics.areEqual((Object) bool, (Object) true)) {
            str = C62070h.m242514b(valueOf);
            Intrinsics.checkExpressionValueIsNotNull(str, "LivestreamUtil.formatNumOversea(count)");
        } else {
            str = C62070h.m242513a(valueOf);
            Intrinsics.checkExpressionValueIsNotNull(str, "LivestreamUtil.formatNumInternal(count)");
        }
        LiveAreaStub cVar = this.f160250g;
        if (cVar != null) {
            textView = cVar.mo219540c();
        }
        if (textView == null) {
            Intrinsics.throwNpe();
        }
        textView.setText(str);
    }

    @Override // com.ss.android.vc.meeting.module.topbar.AbstractC63441a.AbstractC63442a
    /* renamed from: e */
    public void mo219500e(boolean z) {
        if (z) {
            C61303k meeting = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
            AbsBreakoutRoomControl al = meeting.al();
            Intrinsics.checkExpressionValueIsNotNull(al, "meeting.breakoutRoomControl");
            VCBreakoutRoomInfo k = al.mo213184k();
            if (k != null) {
                BreakoutRoomViewStub aVar = this.f160261r;
                if (aVar != null) {
                    String roomTopic = k.getRoomTopic();
                    Intrinsics.checkExpressionValueIsNotNull(roomTopic, "info.roomTopic");
                    aVar.mo219533a(roomTopic);
                }
                View view = this.f160262s;
                if (view != null) {
                    view.setVisibility(0);
                }
            }
        } else {
            BreakoutRoomViewStub aVar2 = this.f160261r;
            if (aVar2 != null) {
                aVar2.mo219532a();
            }
            View view2 = this.f160262s;
            if (view2 != null) {
                view2.setVisibility(8);
            }
        }
        mo213204d();
    }

    @Override // com.ss.android.vc.meeting.module.topbar.AbstractC63441a.AbstractC63442a
    /* renamed from: f */
    public void mo219501f(boolean z) {
        TimeLimitViewStub gVar = this.f160263t;
        if (gVar == null) {
            return;
        }
        if (z) {
            C61303k meeting = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
            VideoChat e = meeting.mo212056e();
            Intrinsics.checkExpressionValueIsNotNull(e, "meeting.videoChat");
            VideoChatSettings videoChatSettings = e.getVideoChatSettings();
            Intrinsics.checkExpressionValueIsNotNull(videoChatSettings, "meeting.videoChat.videoChatSettings");
            gVar.mo219548a(videoChatSettings.getPlanTimeLimit());
            return;
        }
        gVar.mo219547a();
    }

    @Override // com.ss.android.vc.meeting.module.topbar.AbstractC63441a.AbstractC63442a
    /* renamed from: a */
    public void mo219490a(MeetingTimeData aVar) {
        Boolean bool;
        AdaptiveWidthTextView adaptiveWidthTextView;
        MeetingSpecificData J;
        LiveData<Boolean> v;
        if (aVar == null) {
            C60700b.m235851b(this.f160244a, "[updateMeetingTime]", "timeData is null");
            return;
        }
        if (this.f160259p == null) {
            C60700b.m235851b(this.f160244a, "[updateMeetingTime2]", "time view is null");
        }
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        if (meeting.mo212057f() != VideoChat.Type.CALL) {
            AdaptiveWidthTextView adaptiveWidthTextView2 = this.f160259p;
            if (adaptiveWidthTextView2 != null) {
                adaptiveWidthTextView2.setAdaptiveWidthText(aVar.mo212432a());
            }
        } else if (C63634c.m249496b("byteview.call.android.status_connecting")) {
            C61303k meeting2 = getMeeting();
            if (meeting2 == null || (J = meeting2.mo212092J()) == null || (v = J.mo212572v()) == null) {
                bool = null;
            } else {
                bool = v.mo5927b();
            }
            if (Intrinsics.areEqual((Object) bool, (Object) true)) {
                AdaptiveWidthTextView adaptiveWidthTextView3 = this.f160259p;
                if (!(adaptiveWidthTextView3 == null || adaptiveWidthTextView3.getVisibility() != 8 || (adaptiveWidthTextView = this.f160259p) == null)) {
                    adaptiveWidthTextView.setVisibility(0);
                }
                AdaptiveWidthTextView adaptiveWidthTextView4 = this.f160259p;
                if (adaptiveWidthTextView4 != null) {
                    adaptiveWidthTextView4.setAdaptiveWidthText(aVar.mo212432a());
                    return;
                }
                return;
            }
            AdaptiveWidthTextView adaptiveWidthTextView5 = this.f160259p;
            if (adaptiveWidthTextView5 != null) {
                adaptiveWidthTextView5.setVisibility(8);
            }
        } else {
            AdaptiveWidthTextView adaptiveWidthTextView6 = this.f160259p;
            if (adaptiveWidthTextView6 != null) {
                adaptiveWidthTextView6.setAdaptiveWidthText(aVar.mo212432a());
            }
        }
    }

    public TopBarViewControl(AbstractC61429i iVar) {
        super(iVar);
        C60748b.m236068a(getActivity(), R.layout.vc_top_bar_layout, this.f160267x, true);
        this.f160247d = findViewById(R.id.view_statusbar_bg);
        this.f160246c = (ConstraintLayout) findViewById(R.id.top_bar_layout);
        this.f160248e = findViewById(R.id.iv_back);
        this.f160249f = findViewById(R.id.hangup);
        this.f160266w = findViewById(R.id.leave_room);
        this.f160268y = findViewById(R.id.vc_divider_bar);
        this.f160262s = findViewById(R.id.break_room_divider_bar);
        this.f160269z = findViewById(R.id.title_more_icon);
        this.f160250g = new LiveAreaStub(getRootView());
        this.f160245b = findViewById(R.id.externalTag);
        this.f160251h = new RecordAreaStub(getRootView());
        this.f160252i = new NetworkAreaStub(getRootView());
        this.f160257n = findViewById(R.id.top_bar_status_container);
        this.f160258o = findViewById(R.id.top_bar_status_icons);
        this.f160259p = (AdaptiveWidthTextView) findViewById(R.id.time);
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        if (meeting.mo212057f() == VideoChat.Type.MEET) {
            this.f160260q = new LockViewStub(getRootView());
            this.f160261r = new BreakoutRoomViewStub(getRootView());
        }
        this.f160263t = new TimeLimitViewStub(getRootView());
        this.f160264u = new TopBarPromptStub(getRootView());
        this.f160265v = new InterpretationAreaStub(getRootView());
        this.f160256m = (ViewGroup) findViewById(R.id.top_bar_left_container);
        this.f160253j = (TextView) findViewById(R.id.title);
        this.f160254k = findViewById(R.id.title_more_group);
        this.f160255l = findViewById(R.id.title_more_icon);
        init();
        m248626f();
    }

    @Override // com.ss.android.vc.meeting.module.topbar.AbstractC63441a.AbstractC63442a
    /* renamed from: a */
    public void mo219492a(TopBarInterpretationData bVar) {
        LanguageLabel c;
        String str;
        if (bVar == null) {
            Intrinsics.throwNpe();
        }
        if (!bVar.mo219509a() || !C60752f.m236082b(bVar.mo219510b())) {
            InterpretationAreaStub bVar2 = this.f160265v;
            if (bVar2 != null) {
                bVar2.mo219535b();
                return;
            }
            return;
        }
        InterpretationAreaStub bVar3 = this.f160265v;
        if (bVar3 != null) {
            bVar3.mo219534a();
        }
        InterpretationAreaStub bVar4 = this.f160265v;
        TextView textView = null;
        if (!(bVar4 == null || (c = bVar4.mo219536c()) == null)) {
            LanguageType b = bVar.mo219510b();
            if (b != null) {
                str = b.iconStr;
            } else {
                str = null;
            }
            c.setText(str);
        }
        LanguageType b2 = bVar.mo219510b();
        InterpretationAreaStub bVar5 = this.f160265v;
        if (bVar5 != null) {
            textView = bVar5.mo219537d();
        }
        C61958a.m242072a(b2, textView);
    }

    @Override // com.ss.android.vc.meeting.module.topbar.AbstractC63441a.AbstractC63442a
    /* renamed from: a */
    public void mo219493a(TopBarLiveIconData cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "liveIconData");
        mo219527e();
        if (cVar.mo219513a()) {
            LiveAreaStub cVar2 = this.f160250g;
            if (cVar2 != null) {
                cVar2.mo219538a();
            }
            m248625a(cVar.mo219514b());
            return;
        }
        LiveAreaStub cVar3 = this.f160250g;
        if (cVar3 != null) {
            cVar3.mo219539b();
        }
    }

    @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl.AbstractC61510d
    public void a_(String str, String str2) {
        View view = this.f160249f;
        if (view != null) {
            view.setVisibility(0);
        }
        View view2 = this.f160266w;
        if (view2 != null) {
            view2.setVisibility(8);
        }
    }

    @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl.AbstractC61510d
    /* renamed from: d */
    public void mo213205d(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "originId");
        Intrinsics.checkParameterIsNotNull(str2, "dstId");
        View view = this.f160249f;
        if (view != null) {
            view.setVisibility(0);
        }
        View view2 = this.f160266w;
        if (view2 != null) {
            view2.setVisibility(8);
        }
    }
}
