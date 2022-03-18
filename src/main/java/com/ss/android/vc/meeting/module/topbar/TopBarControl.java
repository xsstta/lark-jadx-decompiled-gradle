package com.ss.android.vc.meeting.module.topbar;

import android.app.Activity;
import android.view.View;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.thread.C26171w;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60754h;
import com.ss.android.vc.entity.InterpreterSetting;
import com.ss.android.vc.entity.LanguageType;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatInMeetingInfo;
import com.ss.android.vc.entity.VideoChatSettings;
import com.ss.android.vc.entity.livestream.LiveInfo;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.meeting.DisplayMode;
import com.ss.android.vc.meeting.framework.meeting.EventSource;
import com.ss.android.vc.meeting.framework.statemachine.C61344j;
import com.ss.android.vc.meeting.model.C61381c;
import com.ss.android.vc.meeting.model.C61383d;
import com.ss.android.vc.meeting.model.C61388g;
import com.ss.android.vc.meeting.model.MeetingSpecificData;
import com.ss.android.vc.meeting.model.data.MeetingTimeData;
import com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl;
import com.ss.android.vc.meeting.module.calendar.C61553b;
import com.ss.android.vc.meeting.module.calendar.C61554c;
import com.ss.android.vc.meeting.module.meetingdialog.meetinginfo.C62303a;
import com.ss.android.vc.meeting.module.meetingdialog.meetinginfo.C62304b;
import com.ss.android.vc.meeting.module.meetingdialog.participantmanage.popupwindow.View$OnClickListenerC62383a;
import com.ss.android.vc.meeting.module.p3129j.AbstractC61994a;
import com.ss.android.vc.meeting.module.topbar.AbstractC63441a;
import com.ss.android.vc.meeting.module.topbar.data.PromptData;
import com.ss.android.vc.meeting.module.topbar.data.TopBarInterpretationData;
import com.ss.android.vc.meeting.module.topbar.data.TopBarLiveIconData;
import com.ss.android.vc.meeting.module.topbar.viewstub.TopBarPromptStub;
import com.ss.android.vc.meeting.utils.C63492g;
import com.ss.android.vc.statistics.event.C63742at;
import com.ss.android.vc.statistics.event.C63763l;
import com.ss.android.vc.statistics.event2.MeetingCardEvent;
import com.ss.android.vc.statistics.event2.MeetingOnTheCallEvent2;
import com.ss.android.vc.statistics.p3180a.C63693e;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0011H\u0002J\b\u0010\u0017\u001a\u00020\u0011H\u0002J\b\u0010\u0018\u001a\u00020\u0011H\u0002J\b\u0010\u0019\u001a\u00020\u0011H\u0002J\b\u0010\u001a\u001a\u00020\u0011H\u0002J\b\u0010\u001b\u001a\u00020\u0011H\u0016J\u0012\u0010\u001c\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u001a\u0010\u001f\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010 \u001a\u00020!H\u0016J\u0012\u0010\"\u001a\u00020\u00112\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020\u0011H\u0016J\u0012\u0010&\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J \u0010'\u001a\u00020\u00112\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)H\u0016J\u0010\u0010,\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\u0010\u0010-\u001a\u00020\u00112\u0006\u0010.\u001a\u00020\fH\u0002J\b\u0010/\u001a\u000200H\u0016J\u0010\u00101\u001a\u00020\u00112\u0006\u00102\u001a\u000200H\u0016J\u0018\u00103\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u00104\u001a\u00020\u0007H\u0016J\b\u00105\u001a\u00020\u0011H\u0002J\b\u00106\u001a\u00020\u0011H\u0016J\u0012\u00107\u001a\u00020\u00112\b\u00108\u001a\u0004\u0018\u000109H\u0016J\u0010\u0010:\u001a\u00020\u00112\u0006\u0010;\u001a\u000200H\u0016J\u0012\u0010<\u001a\u00020\u00112\b\u0010=\u001a\u0004\u0018\u00010>H\u0002J\u0010\u0010?\u001a\u00020\u00112\u0006\u0010@\u001a\u000200H\u0016J\u0010\u0010A\u001a\u00020\u00112\u0006\u0010B\u001a\u000200H\u0016J\u0010\u0010C\u001a\u00020\u00112\u0006\u0010D\u001a\u00020)H\u0016J\b\u0010E\u001a\u00020\u0011H\u0002J\u0012\u0010F\u001a\u00020\u00112\b\u0010G\u001a\u0004\u0018\u00010HH\u0016J\u0012\u0010I\u001a\u00020\u00112\b\u0010=\u001a\u0004\u0018\u00010>H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007XD¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006J"}, d2 = {"Lcom/ss/android/vc/meeting/module/topbar/TopBarControl;", "Lcom/ss/android/vc/meeting/module/topbar/AbsTopBarControl;", "Lcom/ss/android/vc/meeting/model/ParticipantData$ParticipantDataChange;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "(Lcom/ss/android/vc/meeting/framework/meeting/Meeting;)V", "TAG", "", "formatMeetingNumber", "mLiveIconData", "Lcom/ss/android/vc/meeting/module/topbar/data/TopBarLiveIconData;", "mPromptData", "Lcom/ss/android/vc/meeting/module/topbar/data/PromptData;", "viewControls", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/ss/android/vc/meeting/module/topbar/AbsTopBarControl$ITopBarViewListener;", "addTopBarViewListener", "", "listener", "dismissPrompt", "mode", "Lcom/ss/android/vc/meeting/module/topbar/viewstub/TopBarPromptStub$Mode;", "initExternalData", "initLiveStreamData", "initNetworkData", "initRecordingData", "initView", "leaveMeeting", "onBackBtnClicked", "activity", "Landroid/app/Activity;", "onHandUpBtnClicked", "anchor", "Landroid/view/View;", "onInMeetingInfoUpdate", "inMeetingInfo", "Lcom/ss/android/vc/entity/VideoChatInMeetingInfo;", "onMeetingExternalTagUpdate", "onMeetingIdClicked", "onTransform", "src", "", "dst", "event", "removeTopBarViewListener", "setPromptData", "promptData", "shouldShowTimeLimit", "", "showOrHideTopBar", "show", "showPrompt", "text", "updateBreakoutRoomTitle", "updateExpandSolid", "updateInterpretation", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/vc/meeting/module/topbar/data/TopBarInterpretationData;", "updateIsLiving", "isLiving", "updateIsLocked", "videoChatSettings", "Lcom/ss/android/vc/entity/VideoChatSettings;", "updateIsRecording", "isrecording", "updateIsWeakNetwork", "isWeakNetwork", "updateLivingCount", "audienceCount", "updateMeetingNumber", "updateMeetingTime", "meetingTimeData", "Lcom/ss/android/vc/meeting/model/data/MeetingTimeData;", "updateTimeLimit", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.topbar.b */
public final class TopBarControl extends AbstractC63441a implements C61388g.AbstractC61393a {

    /* renamed from: a */
    public final String f160218a = "TopBarControl";

    /* renamed from: b */
    public String f160219b;

    /* renamed from: c */
    public PromptData f160220c;

    /* renamed from: d */
    public TopBarLiveIconData f160221d = new TopBarLiveIconData(false, 0);

    /* renamed from: e */
    public CopyOnWriteArrayList<AbstractC63441a.AbstractC63442a> f160222e = new CopyOnWriteArrayList<>();

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    /* renamed from: a */
    public /* synthetic */ void mo212617a(InterpreterSetting interpreterSetting, InterpreterSetting interpreterSetting2) {
        C61388g.AbstractC61393a.CC.$default$a(this, interpreterSetting, interpreterSetting2);
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    /* renamed from: a */
    public /* synthetic */ void mo212618a(LanguageType languageType, LanguageType languageType2) {
        C61388g.AbstractC61393a.CC.$default$a(this, languageType, languageType2);
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    /* renamed from: a */
    public /* synthetic */ void mo212619a(Participant participant) {
        C61388g.AbstractC61393a.CC.$default$a(this, participant);
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    /* renamed from: a */
    public /* synthetic */ void mo212620a(Participant participant, Participant participant2) {
        C61388g.AbstractC61393a.CC.$default$a(this, participant, participant2);
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    /* renamed from: b */
    public /* synthetic */ void mo212621b(Participant participant, Participant participant2) {
        C61388g.AbstractC61393a.CC.$default$b(this, participant, participant2);
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    public /* synthetic */ void bD_() {
        C61388g.AbstractC61393a.CC.$default$bD_(this);
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    public /* synthetic */ void bG_() {
        C61388g.AbstractC61393a.CC.$default$bG_(this);
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    public /* synthetic */ void onSelfRtcModeUpdate(Participant participant, Participant participant2) {
        C61388g.AbstractC61393a.CC.$default$onSelfRtcModeUpdate(this, participant, participant2);
    }

    /* renamed from: g */
    private final void m248600g() {
        bB_();
    }

    @Override // com.ss.android.vc.meeting.module.topbar.AbstractC63441a
    /* renamed from: a */
    public boolean mo219481a() {
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        if (meeting.mo212057f() == VideoChat.Type.MEET) {
            C61303k meeting2 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
            VideoChat e = meeting2.mo212056e();
            Intrinsics.checkExpressionValueIsNotNull(e, "meeting.videoChat");
            VideoChatSettings videoChatSettings = e.getVideoChatSettings();
            Intrinsics.checkExpressionValueIsNotNull(videoChatSettings, "meeting.videoChat.videoChatSettings");
            if (videoChatSettings.getCountDownDuration() != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.vc.meeting.module.topbar.AbstractC63441a
    /* renamed from: a */
    public void mo219479a(TopBarPromptStub.Mode mode) {
        Intrinsics.checkParameterIsNotNull(mode, "mode");
        PromptData aVar = this.f160220c;
        if (mode == (aVar != null ? aVar.mo219504a() : null)) {
            m248595a(new PromptData(TopBarPromptStub.Mode.GONE, null));
        }
    }

    @Override // com.ss.android.vc.meeting.module.topbar.AbstractC63441a
    /* renamed from: a */
    public void mo219478a(TopBarInterpretationData bVar) {
        C26171w.m94675a(new RunnableC63446d(this, bVar));
    }

    @Override // com.ss.android.vc.meeting.module.topbar.AbstractC63441a
    /* renamed from: a */
    public void mo219480a(boolean z) {
        C26171w.m94675a(new RunnableC63447e(this, z));
    }

    @Override // com.ss.android.vc.meeting.module.topbar.AbstractC63441a
    /* renamed from: c */
    public void mo219486c() {
        C26171w.m94675a(new RunnableC63445c(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.topbar.b$c */
    static final class RunnableC63445c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TopBarControl f160226a;

        RunnableC63445c(TopBarControl bVar) {
            this.f160226a = bVar;
        }

        public final void run() {
            Iterator<AbstractC63441a.AbstractC63442a> it = this.f160226a.f160222e.iterator();
            while (it.hasNext()) {
                AbstractC63441a.AbstractC63442a next = it.next();
                if (next != null) {
                    next.mo219497c();
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.topbar.b$d */
    static final class RunnableC63446d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TopBarControl f160227a;

        /* renamed from: b */
        final /* synthetic */ TopBarInterpretationData f160228b;

        RunnableC63446d(TopBarControl bVar, TopBarInterpretationData bVar2) {
            this.f160227a = bVar;
            this.f160228b = bVar2;
        }

        public final void run() {
            Iterator<AbstractC63441a.AbstractC63442a> it = this.f160227a.f160222e.iterator();
            while (it.hasNext()) {
                AbstractC63441a.AbstractC63442a next = it.next();
                if (next != null) {
                    next.mo219492a(this.f160228b);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.topbar.b$g */
    public static final class RunnableC63449g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TopBarControl f160233a;

        /* renamed from: b */
        final /* synthetic */ boolean f160234b;

        RunnableC63449g(TopBarControl bVar, boolean z) {
            this.f160233a = bVar;
            this.f160234b = z;
        }

        public final void run() {
            Iterator<AbstractC63441a.AbstractC63442a> it = this.f160233a.f160222e.iterator();
            while (it.hasNext()) {
                AbstractC63441a.AbstractC63442a next = it.next();
                if (next != null) {
                    next.mo219496b(this.f160234b);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.topbar.b$h */
    public static final class RunnableC63450h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TopBarControl f160235a;

        /* renamed from: b */
        final /* synthetic */ boolean f160236b;

        RunnableC63450h(TopBarControl bVar, boolean z) {
            this.f160235a = bVar;
            this.f160236b = z;
        }

        public final void run() {
            Iterator<AbstractC63441a.AbstractC63442a> it = this.f160235a.f160222e.iterator();
            while (it.hasNext()) {
                AbstractC63441a.AbstractC63442a next = it.next();
                if (next != null) {
                    next.mo219498c(this.f160236b);
                }
            }
        }
    }

    /* renamed from: e */
    private final void m248598e() {
        boolean z;
        C61383d I;
        C61381c a;
        C61303k meeting = getMeeting();
        if (meeting == null || (I = meeting.mo212091I()) == null || (a = I.mo212490a()) == null) {
            z = false;
        } else {
            z = a.mo212482n();
        }
        mo219487c(z);
    }

    /* renamed from: f */
    private final void m248599f() {
        boolean z;
        AbstractC61994a an;
        C61303k meeting = getMeeting();
        if (meeting == null || (an = meeting.an()) == null) {
            z = false;
        } else {
            z = an.mo214607b();
        }
        mo219485b(z);
    }

    /* renamed from: m */
    private final void m248603m() {
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        if (meeting.mo212057f() == VideoChat.Type.MEET) {
            C26171w.m94675a(new RunnableC63444b(this));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.topbar.b$a */
    public static final class RunnableC63443a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TopBarControl f160223a;

        /* renamed from: b */
        final /* synthetic */ PromptData f160224b;

        RunnableC63443a(TopBarControl bVar, PromptData aVar) {
            this.f160223a = bVar;
            this.f160224b = aVar;
        }

        public final void run() {
            this.f160223a.f160220c = this.f160224b;
            Iterator<AbstractC63441a.AbstractC63442a> it = this.f160223a.f160222e.iterator();
            while (it.hasNext()) {
                AbstractC63441a.AbstractC63442a next = it.next();
                if (next != null) {
                    next.mo219491a(this.f160223a.f160220c);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.topbar.b$b */
    public static final class RunnableC63444b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TopBarControl f160225a;

        RunnableC63444b(TopBarControl bVar) {
            this.f160225a = bVar;
        }

        public final void run() {
            Iterator<AbstractC63441a.AbstractC63442a> it = this.f160225a.f160222e.iterator();
            while (it.hasNext()) {
                AbstractC63441a.AbstractC63442a next = it.next();
                if (next != null) {
                    C61303k meeting = this.f160225a.getMeeting();
                    Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
                    AbsBreakoutRoomControl al = meeting.al();
                    Intrinsics.checkExpressionValueIsNotNull(al, "meeting.breakoutRoomControl");
                    next.mo219500e(al.mo213182i());
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.topbar.b$e */
    public static final class RunnableC63447e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TopBarControl f160229a;

        /* renamed from: b */
        final /* synthetic */ boolean f160230b;

        RunnableC63447e(TopBarControl bVar, boolean z) {
            this.f160229a = bVar;
            this.f160230b = z;
        }

        public final void run() {
            this.f160229a.f160221d.mo219512a(this.f160230b);
            Iterator<AbstractC63441a.AbstractC63442a> it = this.f160229a.f160222e.iterator();
            while (it.hasNext()) {
                AbstractC63441a.AbstractC63442a next = it.next();
                if (next != null) {
                    next.mo219493a(this.f160229a.f160221d);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.topbar.b$f */
    public static final class RunnableC63448f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TopBarControl f160231a;

        /* renamed from: b */
        final /* synthetic */ VideoChatSettings f160232b;

        RunnableC63448f(TopBarControl bVar, VideoChatSettings videoChatSettings) {
            this.f160231a = bVar;
            this.f160232b = videoChatSettings;
        }

        public final void run() {
            boolean z;
            Iterator<AbstractC63441a.AbstractC63442a> it = this.f160231a.f160222e.iterator();
            while (it.hasNext()) {
                AbstractC63441a.AbstractC63442a next = it.next();
                if (next != null) {
                    VideoChatSettings videoChatSettings = this.f160232b;
                    if (videoChatSettings != null) {
                        z = videoChatSettings.isLocked();
                    } else {
                        z = false;
                    }
                    next.mo219499d(z);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.topbar.b$i */
    static final class RunnableC63451i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TopBarControl f160237a;

        /* renamed from: b */
        final /* synthetic */ int f160238b;

        RunnableC63451i(TopBarControl bVar, int i) {
            this.f160237a = bVar;
            this.f160238b = i;
        }

        public final void run() {
            this.f160237a.f160221d.mo219511a(this.f160238b);
            Iterator<AbstractC63441a.AbstractC63442a> it = this.f160237a.f160222e.iterator();
            while (it.hasNext()) {
                AbstractC63441a.AbstractC63442a next = it.next();
                if (next != null) {
                    next.mo219493a(this.f160237a.f160221d);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.topbar.b$j */
    public static final class RunnableC63452j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TopBarControl f160239a;

        RunnableC63452j(TopBarControl bVar) {
            this.f160239a = bVar;
        }

        public final void run() {
            String str = UIHelper.getString(R.string.View_M_MeetingIDShort) + this.f160239a.f160219b;
            Iterator<AbstractC63441a.AbstractC63442a> it = this.f160239a.f160222e.iterator();
            while (it.hasNext()) {
                AbstractC63441a.AbstractC63442a next = it.next();
                if (next != null) {
                    next.mo219494a(str);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.topbar.b$l */
    public static final class RunnableC63454l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TopBarControl f160242a;

        RunnableC63454l(TopBarControl bVar) {
            this.f160242a = bVar;
        }

        public final void run() {
            Iterator<AbstractC63441a.AbstractC63442a> it = this.f160242a.f160222e.iterator();
            while (it.hasNext()) {
                AbstractC63441a.AbstractC63442a next = it.next();
                if (next != null) {
                    next.mo219501f(this.f160242a.mo219481a());
                }
            }
        }
    }

    /* renamed from: d */
    private final void m248597d() {
        VideoChatSettings videoChatSettings;
        VideoChat e;
        m248602i();
        C61303k meeting = getMeeting();
        if (meeting == null || (e = meeting.mo212056e()) == null) {
            videoChatSettings = null;
        } else {
            videoChatSettings = e.getVideoChatSettings();
        }
        m248594a(videoChatSettings);
        m248603m();
        m248601h();
        m248598e();
        m248599f();
        m248600g();
    }

    /* renamed from: h */
    private final void m248601h() {
        LiveInfo aVar;
        C61383d I;
        C61381c a;
        C61303k meeting = getMeeting();
        if (meeting == null || (I = meeting.mo212091I()) == null || (a = I.mo212490a()) == null) {
            aVar = null;
        } else {
            aVar = a.mo212481m();
        }
        if (aVar != null) {
            mo219480a(aVar.mo209943b());
        }
    }

    /* renamed from: i */
    private final void m248602i() {
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        VideoChat e = meeting.mo212056e();
        Intrinsics.checkExpressionValueIsNotNull(e, "meeting.videoChat");
        this.f160219b = C60754h.m236085a(e.getMeetNumber());
        C26171w.m94675a(new RunnableC63452j(this));
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    public void bB_() {
        Iterator<AbstractC63441a.AbstractC63442a> it = this.f160222e.iterator();
        while (it.hasNext()) {
            AbstractC63441a.AbstractC63442a next = it.next();
            if (next != null) {
                C61303k meeting = getMeeting();
                Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
                next.mo219502g(meeting.mo212162v());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.topbar.b$k */
    static final class RunnableC63453k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TopBarControl f160240a;

        /* renamed from: b */
        final /* synthetic */ MeetingTimeData f160241b;

        RunnableC63453k(TopBarControl bVar, MeetingTimeData aVar) {
            this.f160240a = bVar;
            this.f160241b = aVar;
        }

        public final void run() {
            for (T t : this.f160240a.f160222e) {
                if (t != null) {
                    t.mo219490a(this.f160241b);
                }
            }
            if (this.f160240a.f160222e.size() == 0) {
                C61303k meeting = this.f160240a.getMeeting();
                Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
                if (meeting.mo212067p() == DisplayMode.ACTIVITY) {
                    C60700b.m235851b(this.f160240a.f160218a, "[updateMeetingTime]", "viewControl size = 0");
                }
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.topbar.AbstractC63441a
    /* renamed from: b */
    public void mo219482b() {
        C61303k kVar = this.mMeeting;
        Intrinsics.checkExpressionValueIsNotNull(kVar, "mMeeting");
        C63492g.m248824b(true, Boolean.valueOf(kVar.mo212092J().mo212512I()));
        C61344j a = C61344j.m239002a().mo212329a(103).mo212331a(EventSource.EVENT_ACTIVITY);
        C61303k meeting = getMeeting();
        if (meeting != null) {
            meeting.mo212051a(a);
        }
        Iterator<AbstractC63441a.AbstractC63442a> it = this.f160222e.iterator();
        while (it.hasNext()) {
            AbstractC63441a.AbstractC63442a next = it.next();
            if (next != null) {
                next.mo219489a();
            }
        }
        MeetingOnTheCallEvent2 a2 = MeetingOnTheCallEvent2.f160846b.mo220311a();
        C61303k meeting2 = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
        MeetingOnTheCallEvent2.m249824a(a2, meeting2, "leave", null, null, null, null, 60, null);
    }

    /* renamed from: a */
    private final void m248595a(PromptData aVar) {
        C26171w.m94675a(new RunnableC63443a(this, aVar));
    }

    /* renamed from: b */
    private final void m248596b(VideoChatSettings videoChatSettings) {
        C26171w.m94675a(new RunnableC63454l(this));
    }

    /* renamed from: a */
    private final void m248594a(VideoChatSettings videoChatSettings) {
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        if (meeting.mo212057f() == VideoChat.Type.MEET) {
            C26171w.m94675a(new RunnableC63448f(this, videoChatSettings));
        }
    }

    @Override // com.ss.android.vc.meeting.module.topbar.AbstractC63441a
    /* renamed from: b */
    public void mo219485b(boolean z) {
        C26171w.m94675a(new RunnableC63450h(this, z));
    }

    @Override // com.ss.android.vc.meeting.module.topbar.AbstractC63441a
    /* renamed from: c */
    public void mo219487c(boolean z) {
        C26171w.m94675a(new RunnableC63449g(this, z));
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61298f
    public void onInMeetingInfoUpdate(VideoChatInMeetingInfo videoChatInMeetingInfo) {
        if (videoChatInMeetingInfo != null) {
            m248602i();
            m248594a(videoChatInMeetingInfo.getVideoChatSettings());
            m248596b(videoChatInMeetingInfo.getVideoChatSettings());
            m248603m();
        }
    }

    public TopBarControl(C61303k kVar) {
        super(kVar);
        C61383d I;
        C61388g b;
        if (kVar != null && (I = kVar.mo212091I()) != null && (b = I.mo212494b()) != null) {
            b.mo212593a(this);
        }
    }

    @Override // com.ss.android.vc.meeting.module.topbar.AbstractC63441a
    /* renamed from: a */
    public void mo219473a(int i) {
        C26171w.m94675a(new RunnableC63451i(this, i));
    }

    @Override // com.ss.android.vc.meeting.module.topbar.AbstractC63441a
    /* renamed from: b */
    public void mo219484b(AbstractC63441a.AbstractC63442a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f160222e.remove(aVar);
        String str = this.f160218a;
        C60700b.m235851b(str, "removeTopBarViewListener", "listener" + aVar.hashCode() + ", + viewControls size = " + this.f160222e.size());
    }

    @Override // com.ss.android.vc.meeting.module.topbar.AbstractC63441a
    /* renamed from: d */
    public void mo219488d(boolean z) {
        String str = this.f160218a;
        C60700b.m235851b(str, "[showOrHideTopBar]", "show: " + z + ", viewControl size = " + this.f160222e.size());
        Iterator<AbstractC63441a.AbstractC63442a> it = this.f160222e.iterator();
        while (it.hasNext()) {
            AbstractC63441a.AbstractC63442a next = it.next();
            if (next != null) {
                next.mo219503h(z);
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.topbar.AbstractC63441a
    /* renamed from: a */
    public void mo219474a(Activity activity) {
        VideoChat.MeetingSource meetingSource;
        VideoChat e;
        KeyboardUtils.hideKeyboard(activity);
        C60700b.m235851b(this.f160218a, "[onClick]", "MeetingId, viewControl size = " + this.f160222e.size());
        C61303k meeting = getMeeting();
        VideoChat videoChat = null;
        if (meeting == null || (e = meeting.mo212056e()) == null) {
            meetingSource = null;
        } else {
            meetingSource = e.getMeetingSource();
        }
        if (meetingSource == VideoChat.MeetingSource.VC_FROM_CALENDAR) {
            C61303k meeting2 = getMeeting();
            if (meeting2 != null) {
                videoChat = meeting2.mo212056e();
            }
            C63742at.m250101i(videoChat);
            if (!DesktopUtil.m144307b()) {
                new C61554c(activity, getMeeting()).mo211606a();
            } else {
                new C61553b(activity, getMeeting()).mo211606a();
            }
        } else {
            if (!DesktopUtil.m144307b()) {
                new C62304b(activity, getMeeting()).mo211606a();
            } else {
                new C62303a(activity, getMeeting()).mo211606a();
            }
            MeetingCardEvent.Companion aVar = MeetingCardEvent.f160834a;
            C61303k meeting3 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting3, "meeting");
            aVar.mo220279a(meeting3);
        }
        if (getMeeting() != null) {
            MeetingOnTheCallEvent2 a = MeetingOnTheCallEvent2.f160846b.mo220311a();
            C61303k meeting4 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting4, "meeting");
            MeetingOnTheCallEvent2.m249824a(a, meeting4, "info_more", "vc_meeting_card_view", null, null, null, 56, null);
        }
    }

    @Override // com.ss.android.vc.meeting.module.topbar.AbstractC63441a
    /* renamed from: b */
    public void mo219483b(Activity activity) {
        boolean z;
        MeetingSpecificData J;
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        VideoChat e = meeting.mo212056e();
        String str = this.f160218a;
        C60700b.m235841a(e, "UI", "UI", "clickOnTheCallMinimize", str, "clickOnTheCallMinimizeButton, viewControl size = " + this.f160222e.size());
        C61303k meeting2 = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
        if (meeting2.ae().mo213808a(activity, 0)) {
            C63693e.m249682a("onthecall");
            C61303k meeting3 = getMeeting();
            if (meeting3 == null || (J = meeting3.mo212092J()) == null) {
                z = false;
            } else {
                z = J.mo212511H();
            }
            C61303k meeting4 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting4, "meeting");
            VideoChat videoChat = null;
            if (meeting4.mo212057f() == VideoChat.Type.MEET) {
                C61303k meeting5 = getMeeting();
                if (meeting5 != null) {
                    videoChat = meeting5.mo212056e();
                }
                C63742at.m250062a(videoChat, Boolean.valueOf(z));
                return;
            }
            C61303k meeting6 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting6, "meeting");
            if (meeting6.mo212057f() == VideoChat.Type.CALL) {
                C61303k meeting7 = getMeeting();
                if (meeting7 != null) {
                    videoChat = meeting7.mo212056e();
                }
                C63763l.m250306b(videoChat, z);
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.topbar.AbstractC63441a
    /* renamed from: a */
    public void mo219476a(MeetingTimeData aVar) {
        C26171w.m94675a(new RunnableC63453k(this, aVar));
    }

    @Override // com.ss.android.vc.meeting.module.topbar.AbstractC63441a
    /* renamed from: a */
    public void mo219477a(AbstractC63441a.AbstractC63442a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f160222e.add(aVar);
        String str = this.f160218a;
        C60700b.m235851b(str, "addTopBarViewListener", "listener" + aVar.hashCode() + ", + viewControls size = " + this.f160222e.size());
        m248597d();
    }

    @Override // com.ss.android.vc.meeting.module.topbar.AbstractC63441a
    /* renamed from: a */
    public void mo219475a(Activity activity, View view) {
        Intrinsics.checkParameterIsNotNull(view, "anchor");
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        C61383d I = meeting.mo212091I();
        Intrinsics.checkExpressionValueIsNotNull(I, "meeting.meetingData");
        C61388g b = I.mo212494b();
        Intrinsics.checkExpressionValueIsNotNull(b, "meeting.meetingData.participantData");
        int o = b.mo212610o();
        String str = this.f160218a;
        C60700b.m235851b(str, "[onClick]", "hangup, num = " + o + ", viewControl size = " + this.f160222e.size());
        if (o > 1) {
            C61303k meeting2 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
            if (meeting2.mo212057f() == VideoChat.Type.MEET) {
                C61303k meeting3 = getMeeting();
                Intrinsics.checkExpressionValueIsNotNull(meeting3, "meeting");
                C63742at.m250099h(meeting3.mo212056e());
                Iterator<T> it = this.f160222e.iterator();
                while (it.hasNext()) {
                    View$OnClickListenerC62383a aVar = (View$OnClickListenerC62383a) View$OnClickListenerC62383a.m243797a(activity, view, getMeeting(), it.next()).mo219699g();
                    if (aVar != null) {
                        aVar.mo211397b();
                    }
                }
                return;
            }
        }
        C61303k meeting4 = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting4, "meeting");
        if (meeting4.mo212057f() == VideoChat.Type.CALL) {
            C61303k meeting5 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting5, "meeting");
            C60700b.m235841a(meeting5.mo212056e(), "UI", "StateEngine", "clickHangUp", this.f160218a, "clickHangUpButton");
        } else {
            C61303k meeting6 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting6, "meeting");
            C63742at.m250099h(meeting6.mo212056e());
        }
        mo219482b();
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61302j, com.ss.android.vc.meeting.module.base.AbstractC61420b
    public void onTransform(int i, int i2, int i3) {
        if (i2 == 5) {
            Iterator<AbstractC63441a.AbstractC63442a> it = this.f160222e.iterator();
            while (it.hasNext()) {
                AbstractC63441a.AbstractC63442a next = it.next();
                if (next != null) {
                    next.mo219495a(false);
                }
            }
            this.f160222e.clear();
        }
    }
}
