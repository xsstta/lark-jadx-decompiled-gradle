package com.ss.android.vc.meeting.module.setting.settingdialog;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.larksuite.component.universe_design.udswitch.UDSwitch;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60775q;
import com.ss.android.vc.entity.InterpreterSetting;
import com.ss.android.vc.entity.LanguageType;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.entity.VCManageCapability;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatSettings;
import com.ss.android.vc.entity.breakoutroom.BreakoutRoomManage;
import com.ss.android.vc.entity.request.HostManageRequest;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.model.C61373b;
import com.ss.android.vc.meeting.model.C61383d;
import com.ss.android.vc.meeting.model.C61388g;
import com.ss.android.vc.meeting.module.VCBreakoutRoomInfo;
import com.ss.android.vc.meeting.module.VCBreakoutRoomInfoSettings;
import com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl;
import com.ss.android.vc.meeting.module.lobby.pb.VCManageResult;
import com.ss.android.vc.meeting.module.p3148o.AbstractC62555a;
import com.ss.android.vc.meeting.module.speakrequest.AbsSpeakRequestControl;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import com.ss.android.vc.net.service.VcBizService;
import com.ss.android.vc.statistics.event.SharePermissionEvent;
import com.ss.android.vc.statistics.event.bf;
import com.ss.android.vc.statistics.event2.MeetingHostPanelEvent;
import com.ss.ugc.effectplatform.util.TextUtils;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u0000 O2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001OB\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010'\u001a\u00020(H\u0016J\u0006\u0010)\u001a\u00020\rJ\u0012\u0010*\u001a\u00020(2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0006\u0010-\u001a\u00020(J\b\u0010.\u001a\u00020(H\u0016J\u0010\u0010/\u001a\u00020(2\u0006\u00100\u001a\u00020\u0014H\u0016J\u0010\u00101\u001a\u00020(2\u0006\u00102\u001a\u00020\rH\u0002J\b\u00103\u001a\u00020(H\u0016J\u0010\u00104\u001a\u00020(2\u0006\u00105\u001a\u00020\u0014H\u0016J\u0010\u00106\u001a\u00020(2\u0006\u00107\u001a\u00020\u0014H\u0016J\u0010\u00108\u001a\u00020(2\u0006\u00109\u001a\u00020\u0014H\u0016J\u0010\u0010:\u001a\u00020(2\u0006\u0010;\u001a\u00020\u0014H\u0016J\u0010\u0010<\u001a\u00020(2\u0006\u0010;\u001a\u00020\u0014H\u0016J\u001c\u0010=\u001a\u00020(2\b\u0010>\u001a\u0004\u0018\u00010?2\b\u0010@\u001a\u0004\u0018\u00010?H\u0016J\u0010\u0010A\u001a\u00020(2\u0006\u0010B\u001a\u00020\u0014H\u0016J\u0006\u0010B\u001a\u00020(J\u001c\u0010C\u001a\u00020(2\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010D\u001a\u0004\u0018\u00010,H\u0016J\u0012\u0010E\u001a\u00020(2\b\u0010F\u001a\u0004\u0018\u00010,H\u0016J\u0012\u0010G\u001a\u00020(2\b\u0010H\u001a\u0004\u0018\u00010IH\u0016J\u0010\u0010J\u001a\u00020(2\u0006\u0010K\u001a\u00020LH\u0016J\u0018\u0010M\u001a\u00020(2\u0006\u0010B\u001a\u00020\u00142\u0006\u0010N\u001a\u00020\u0014H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010%X\u000e¢\u0006\u0002\n\u0000¨\u0006P"}, d2 = {"Lcom/ss/android/vc/meeting/module/setting/settingdialog/HostAdvancedOptionsViewHolder;", "Lcom/ss/android/vc/meeting/model/InMeetingChangeProcessor$InMeetingChangeListener;", "Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface$OnDismissListener;", "Lcom/ss/android/vc/meeting/model/ParticipantData$ParticipantDataChange;", "Lcom/ss/android/vc/meeting/module/breakoutroom/AbsBreakoutRoomControl$IBreakoutRoomViewControl;", "activity", "Landroid/app/Activity;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "dialog", "Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface;", "(Landroid/app/Activity;Lcom/ss/android/vc/meeting/framework/meeting/Meeting;Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface;)V", "allowPartiUnMuteContainer", "Landroid/view/View;", "allowPartiUnMuteSwitcher", "Lcom/larksuite/component/universe_design/udswitch/UDSwitch;", "closeBtn", "Landroid/widget/ImageView;", "divider", "isServerPushAllowPartiUnMute", "", "isServerPushMuteOnEntry", "isServerPushOnlyHostCanReplaceShare", "isServerPushOnlyHostCanShare", "isServerPushOnlyPresenterCanAnnotate", "mSpeakRequestControlListener", "Lcom/ss/android/vc/meeting/module/speakrequest/AbsSpeakRequestControl$ISpeakRequestControlListener;", "muteOnEntryContainer", "muteOnEntrySwitcher", "onlyHostCanReplaceShareContainer", "onlyHostCanReplaceShareSwitcher", "onlyHostCanShareContainer", "onlyHostCanShareSwitcher", "onlyPresenterCanAnnotateContainer", "onlyPresenterCanAnnotateDivider", "onlyPresenterCanAnnotateSwitcher", "prtiMicSettingTitle", "Landroid/widget/TextView;", "sharePermissionTitle", "closeBroadcastTips", "", "contentView", "createPopupWindow", "roomId", "", "dismiss", "dismissPopupWindow", "enableOnlyPresenterCanAnnotate", "enable", "init", "rootView", "onDismiss", "onMuteOnEntryChanged", "muteOnEntry", "onOnlyHostCanReplaceShareChanged", "onlyHostCanReplaceShare", "onOnlyHostCanShareChanged", "onlyHostCanShare", "onOnlyPresenterCanAnnotateCapabilityChanged", "onlyPresenterCanAnnotate", "onOnlyPresenterCanAnnotateChanged", "onSelfParticipantRoleUpdate", "lastSelf", "Lcom/ss/android/vc/entity/Participant;", "currentSelf", "setShouldShow", "show", "showAskHostForHelpDialog", ShareHitPoint.f121868c, "showBroadcastTips", "content", "showToastForHelp", "action", "Lcom/ss/android/vc/meeting/module/lobby/pb/VCManageResult$Action;", "updatePopupWindowTitle", "millisUntilFinished", "", "updateTransitionPage", "isTransfer", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.o.a.f */
public final class HostAdvancedOptionsViewHolder implements AbstractC61222a.AbstractC61223a, C61373b.AbstractC61374a, C61388g.AbstractC61393a, AbsBreakoutRoomControl.AbstractC61508b {

    /* renamed from: m */
    public static final Companion f157480m = new Companion(null);

    /* renamed from: a */
    public UDSwitch f157481a;

    /* renamed from: b */
    public View f157482b;

    /* renamed from: c */
    public UDSwitch f157483c;

    /* renamed from: d */
    public UDSwitch f157484d;

    /* renamed from: e */
    public UDSwitch f157485e;

    /* renamed from: f */
    public UDSwitch f157486f;

    /* renamed from: g */
    public boolean f157487g;

    /* renamed from: h */
    public boolean f157488h;

    /* renamed from: i */
    public boolean f157489i;

    /* renamed from: j */
    public boolean f157490j;

    /* renamed from: k */
    public boolean f157491k;

    /* renamed from: l */
    public C61303k f157492l;

    /* renamed from: n */
    private ImageView f157493n;

    /* renamed from: o */
    private View f157494o;

    /* renamed from: p */
    private TextView f157495p;

    /* renamed from: q */
    private TextView f157496q;

    /* renamed from: r */
    private View f157497r;

    /* renamed from: s */
    private View f157498s;

    /* renamed from: t */
    private View f157499t;

    /* renamed from: u */
    private View f157500u;

    /* renamed from: v */
    private View f157501v;

    /* renamed from: w */
    private AbsSpeakRequestControl.ISpeakRequestControlListener f157502w;

    /* renamed from: x */
    private Activity f157503x;

    /* renamed from: y */
    private AbstractC61222a f157504y;

    @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl.AbstractC61508b
    /* renamed from: a */
    public void mo213189a() {
    }

    @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl.AbstractC61508b
    /* renamed from: a */
    public void mo213190a(long j) {
    }

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

    @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl.AbstractC61508b
    /* renamed from: a */
    public void mo213191a(VCManageResult.Action action) {
    }

    @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl.AbstractC61508b
    /* renamed from: a */
    public void mo213192a(String str) {
    }

    @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl.AbstractC61508b
    /* renamed from: a */
    public void mo213193a(String str, String str2) {
    }

    @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl.AbstractC61508b
    /* renamed from: a */
    public void mo213194a(boolean z, boolean z2) {
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    /* renamed from: b */
    public /* synthetic */ void mo212621b(Participant participant, Participant participant2) {
        C61388g.AbstractC61393a.CC.$default$b(this, participant, participant2);
    }

    @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl.AbstractC61508b
    /* renamed from: b */
    public void mo213195b(String str) {
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    public /* synthetic */ void bB_() {
        C61388g.AbstractC61393a.CC.$default$bB_(this);
    }

    @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
    public /* synthetic */ void bC_() {
        C61373b.AbstractC61374a.CC.$default$bC_(this);
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    public /* synthetic */ void bD_() {
        C61388g.AbstractC61393a.CC.$default$bD_(this);
    }

    @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
    public /* synthetic */ void bF_() {
        C61373b.AbstractC61374a.CC.$default$bF_(this);
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    public /* synthetic */ void bG_() {
        C61388g.AbstractC61393a.CC.$default$bG_(this);
    }

    @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
    public /* synthetic */ void bX_() {
        C61373b.AbstractC61374a.CC.$default$bX_(this);
    }

    @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl.AbstractC61508b
    /* renamed from: c */
    public void mo213196c() {
    }

    @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
    public /* synthetic */ void c_(String str, String str2) {
        C61373b.AbstractC61374a.CC.$default$c_(this, str, str2);
    }

    @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl.AbstractC61508b
    /* renamed from: e */
    public void mo213197e(boolean z) {
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    public /* synthetic */ void onSelfRtcModeUpdate(Participant participant, Participant participant2) {
        C61388g.AbstractC61393a.CC.$default$onSelfRtcModeUpdate(this, participant, participant2);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/vc/meeting/module/setting/settingdialog/HostAdvancedOptionsViewHolder$Companion;", "", "()V", "TAG", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.o.a.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: e */
    public final void mo216332e() {
        this.f157504y.dismiss();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/setting/settingdialog/HostAdvancedOptionsViewHolder$init$7", "Lcom/ss/android/vc/meeting/module/speakrequest/AbsSpeakRequestControl$ISpeakRequestControlListener;", "onDealAllowPartiUnMute", "", "allowPartiUnMute", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.o.a.f$i */
    public static final class C62570i implements AbsSpeakRequestControl.ISpeakRequestControlListener {

        /* renamed from: a */
        final /* synthetic */ HostAdvancedOptionsViewHolder f157513a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.o.a.f$i$a */
        static final class RunnableC62571a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C62570i f157514a;

            /* renamed from: b */
            final /* synthetic */ boolean f157515b;

            RunnableC62571a(C62570i iVar, boolean z) {
                this.f157514a = iVar;
                this.f157515b = z;
            }

            public final void run() {
                this.f157514a.f157513a.f157488h = true;
                UDSwitch uDSwitch = this.f157514a.f157513a.f157483c;
                if (uDSwitch != null) {
                    uDSwitch.setChecked(this.f157515b);
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C62570i(HostAdvancedOptionsViewHolder fVar) {
            this.f157513a = fVar;
        }

        @Override // com.ss.android.vc.meeting.module.speakrequest.AbsSpeakRequestControl.ISpeakRequestControlListener
        /* renamed from: a */
        public void mo214289a(boolean z) {
            View view;
            View view2 = this.f157513a.f157482b;
            if (view2 != null && view2.getVisibility() == 0) {
                UDSwitch uDSwitch = this.f157513a.f157483c;
                if ((uDSwitch == null || uDSwitch.isChecked() != z) && (view = this.f157513a.f157482b) != null) {
                    view.post(new RunnableC62571a(this, z));
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.o.a.f$b */
    static final class RunnableC62563b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ HostAdvancedOptionsViewHolder f157505a;

        /* renamed from: b */
        final /* synthetic */ boolean f157506b;

        RunnableC62563b(HostAdvancedOptionsViewHolder fVar, boolean z) {
            this.f157505a = fVar;
            this.f157506b = z;
        }

        public final void run() {
            this.f157505a.f157491k = true;
            UDSwitch uDSwitch = this.f157505a.f157486f;
            if (uDSwitch != null) {
                uDSwitch.setChecked(this.f157506b);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.o.a.f$j */
    static final class RunnableC62572j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ HostAdvancedOptionsViewHolder f157516a;

        /* renamed from: b */
        final /* synthetic */ boolean f157517b;

        RunnableC62572j(HostAdvancedOptionsViewHolder fVar, boolean z) {
            this.f157516a = fVar;
            this.f157517b = z;
        }

        public final void run() {
            this.f157516a.f157487g = true;
            UDSwitch uDSwitch = this.f157516a.f157481a;
            if (uDSwitch != null) {
                uDSwitch.setChecked(this.f157517b);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.o.a.f$k */
    static final class RunnableC62573k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ HostAdvancedOptionsViewHolder f157518a;

        /* renamed from: b */
        final /* synthetic */ boolean f157519b;

        RunnableC62573k(HostAdvancedOptionsViewHolder fVar, boolean z) {
            this.f157518a = fVar;
            this.f157519b = z;
        }

        public final void run() {
            this.f157518a.f157490j = true;
            UDSwitch uDSwitch = this.f157518a.f157485e;
            if (uDSwitch != null) {
                uDSwitch.setChecked(this.f157519b);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.o.a.f$l */
    static final class RunnableC62574l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ HostAdvancedOptionsViewHolder f157520a;

        /* renamed from: b */
        final /* synthetic */ boolean f157521b;

        RunnableC62574l(HostAdvancedOptionsViewHolder fVar, boolean z) {
            this.f157520a = fVar;
            this.f157521b = z;
        }

        public final void run() {
            this.f157520a.f157489i = true;
            UDSwitch uDSwitch = this.f157520a.f157484d;
            if (uDSwitch != null) {
                uDSwitch.setChecked(this.f157521b);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.o.a.f$m */
    static final class RunnableC62575m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ HostAdvancedOptionsViewHolder f157522a;

        /* renamed from: b */
        final /* synthetic */ boolean f157523b;

        RunnableC62575m(HostAdvancedOptionsViewHolder fVar, boolean z) {
            this.f157522a = fVar;
            this.f157523b = z;
        }

        public final void run() {
            UDSwitch uDSwitch;
            UDSwitch uDSwitch2 = this.f157522a.f157486f;
            if (uDSwitch2 != null) {
                uDSwitch2.setEnabled(this.f157523b);
            }
            if (!this.f157523b && (uDSwitch = this.f157522a.f157486f) != null) {
                uDSwitch.setChecked(false);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.o.a.f$n */
    static final class RunnableC62576n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ HostAdvancedOptionsViewHolder f157524a;

        /* renamed from: b */
        final /* synthetic */ boolean f157525b;

        RunnableC62576n(HostAdvancedOptionsViewHolder fVar, boolean z) {
            this.f157524a = fVar;
            this.f157525b = z;
        }

        public final void run() {
            this.f157524a.f157491k = true;
            UDSwitch uDSwitch = this.f157524a.f157486f;
            if (uDSwitch != null) {
                uDSwitch.setChecked(this.f157525b);
            }
        }
    }

    @Override // com.ss.android.vc.meeting.basedialog.AbstractC61222a.AbstractC61223a
    public void bY_() {
        C61383d I = this.f157492l.mo212091I();
        Intrinsics.checkExpressionValueIsNotNull(I, "meeting.meetingData");
        I.mo212498e().mo212444b(this);
        this.f157492l.al().mo213170b(this);
        this.f157492l.ao().mo218464b(this.f157502w);
    }

    /* renamed from: d */
    public final View mo216331d() {
        View inflate = LayoutInflater.from(this.f157503x).inflate(R.layout.meeting_dialog_host_advanced_options, (ViewGroup) null);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "rootView");
        m244735a(inflate);
        MeetingHostPanelEvent.f160841b.mo220293a().mo220289a(this.f157492l, "tool_bar");
        return inflate;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/setting/settingdialog/HostAdvancedOptionsViewHolder$init$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.o.a.f$c */
    public static final class C62564c extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ HostAdvancedOptionsViewHolder f157507a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C62564c(HostAdvancedOptionsViewHolder fVar) {
            this.f157507a = fVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            this.f157507a.mo216332e();
        }
    }

    @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
    /* renamed from: d */
    public void mo212451d(boolean z) {
        View view;
        View view2 = this.f157501v;
        if (view2 != null && view2.getVisibility() == 0 && (view = this.f157501v) != null) {
            view.post(new RunnableC62575m(this, z));
        }
    }

    @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
    /* renamed from: b */
    public void mo212445b(boolean z) {
        View view;
        View view2 = this.f157498s;
        if (view2 != null && view2.getVisibility() == 0) {
            UDSwitch uDSwitch = this.f157484d;
            if ((uDSwitch == null || uDSwitch.isChecked() != z) && (view = this.f157498s) != null) {
                view.post(new RunnableC62574l(this, z));
            }
        }
    }

    @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
    /* renamed from: c */
    public void mo212449c(boolean z) {
        View view;
        View view2 = this.f157499t;
        if (view2 != null && view2.getVisibility() == 0) {
            UDSwitch uDSwitch = this.f157485e;
            if ((uDSwitch == null || uDSwitch.isChecked() != z) && (view = this.f157499t) != null) {
                view.post(new RunnableC62573k(this, z));
            }
        }
    }

    @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
    public void i_(boolean z) {
        View view;
        View view2 = this.f157497r;
        if (view2 != null && view2.getVisibility() == 0) {
            UDSwitch uDSwitch = this.f157481a;
            if ((uDSwitch == null || z != uDSwitch.isChecked()) && (view = this.f157497r) != null) {
                view.post(new RunnableC62572j(this, z));
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl.AbstractC61508b
    /* renamed from: f */
    public void mo213198f(boolean z) {
        View view;
        if (C60775q.m236138a()) {
            C60700b.m235851b("HostAdvancedOptionsViewHolder", "[enableOnlyPresenterCanAnnotate]", "enable=" + z);
        }
        View view2 = this.f157501v;
        if (view2 != null && view2.getVisibility() == 0) {
            UDSwitch uDSwitch = this.f157486f;
            if ((uDSwitch == null || uDSwitch.isChecked() != z) && (view = this.f157501v) != null) {
                view.post(new RunnableC62563b(this, z));
            }
        }
    }

    @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
    public void onOnlyPresenterCanAnnotateChanged(boolean z) {
        View view;
        if (C60775q.m236138a()) {
            C60700b.m235851b("HostAdvancedOptionsViewHolder", "[onOnlyPresenterCanAnnotateChanged]", "enable=" + z);
        }
        View view2 = this.f157501v;
        if (view2 != null && view2.getVisibility() == 0) {
            UDSwitch uDSwitch = this.f157486f;
            if ((uDSwitch == null || uDSwitch.isChecked() != z) && (view = this.f157501v) != null) {
                view.post(new RunnableC62576n(this, z));
            }
        }
    }

    /* renamed from: a */
    private final void m244735a(View view) {
        VCManageCapability vCManageCapability;
        View view2;
        UDSwitch uDSwitch;
        View view3;
        boolean z;
        this.f157493n = (ImageView) view.findViewById(R.id.advanced_options_close_btn);
        this.f157494o = view.findViewById(R.id.divider);
        this.f157495p = (TextView) view.findViewById(R.id.share_permission_title);
        this.f157497r = view.findViewById(R.id.mute_on_entry_container);
        this.f157481a = (UDSwitch) view.findViewById(R.id.switcher_mute_on_entry);
        this.f157483c = (UDSwitch) view.findViewById(R.id.switcher_allow_user_unmute);
        this.f157482b = view.findViewById(R.id.allow_parti_unmute_container);
        this.f157498s = view.findViewById(R.id.only_host_can_share_container);
        this.f157484d = (UDSwitch) view.findViewById(R.id.switcher_only_host_can_share);
        this.f157499t = view.findViewById(R.id.only_host_can_replace_share_container);
        this.f157485e = (UDSwitch) view.findViewById(R.id.switcher_only_host_can_replace_share);
        this.f157500u = view.findViewById(R.id.only_presenter_can_annotate_divider);
        this.f157501v = view.findViewById(R.id.only_presenter_can_annotate_container);
        this.f157486f = (UDSwitch) view.findViewById(R.id.switcher_only_presenter_can_annotate);
        this.f157496q = (TextView) view.findViewById(R.id.parti_mic_setting_title);
        VideoChat e = this.f157492l.mo212056e();
        Intrinsics.checkExpressionValueIsNotNull(e, "meeting.videoChat");
        VideoChatSettings videoChatSettings = e.getVideoChatSettings();
        if (videoChatSettings != null) {
            vCManageCapability = videoChatSettings.getManageCapability();
        } else {
            vCManageCapability = null;
        }
        if (vCManageCapability != null) {
            UDSwitch uDSwitch2 = this.f157484d;
            if (uDSwitch2 != null) {
                uDSwitch2.setEnabled(vCManageCapability.isSharePermission());
            }
            UDSwitch uDSwitch3 = this.f157485e;
            if (uDSwitch3 != null) {
                uDSwitch3.setEnabled(vCManageCapability.isForceGetSharePermission());
            }
            UDSwitch uDSwitch4 = this.f157483c;
            if (uDSwitch4 != null) {
                uDSwitch4.setEnabled(vCManageCapability.isForceMuteMicrophone());
            }
            AbsBreakoutRoomControl al = this.f157492l.al();
            Intrinsics.checkExpressionValueIsNotNull(al, "meeting.breakoutRoomControl");
            if (al.mo213182i()) {
                UDSwitch uDSwitch5 = this.f157486f;
                if (uDSwitch5 != null) {
                    AbsBreakoutRoomControl al2 = this.f157492l.al();
                    Intrinsics.checkExpressionValueIsNotNull(al2, "meeting.breakoutRoomControl");
                    VCBreakoutRoomInfo k = al2.mo213184k();
                    Intrinsics.checkExpressionValueIsNotNull(k, "meeting.breakoutRoomControl.breakoutRoomInfo");
                    VCBreakoutRoomInfoSettings settings = k.getSettings();
                    if (settings != null) {
                        z = settings.isOnlyPresenterCanAnnote();
                    } else {
                        z = false;
                    }
                    uDSwitch5.setEnabled(z);
                }
            } else {
                UDSwitch uDSwitch6 = this.f157486f;
                if (uDSwitch6 != null) {
                    uDSwitch6.setEnabled(vCManageCapability.isOnlyPresenterCanAnnotate());
                }
            }
        }
        ImageView imageView = this.f157493n;
        if (imageView != null) {
            imageView.setOnClickListener(new C62564c(this));
        }
        AbstractC62555a aa = this.f157492l.aa();
        Intrinsics.checkExpressionValueIsNotNull(aa, "meeting.settingMoreControl");
        if (!aa.mo216281i() && (view3 = this.f157497r) != null) {
            view3.setVisibility(8);
        }
        AbstractC62555a aa2 = this.f157492l.aa();
        Intrinsics.checkExpressionValueIsNotNull(aa2, "meeting.settingMoreControl");
        if (!aa2.mo216281i() && !this.f157492l.ao().mo218468d()) {
            TextView textView = this.f157496q;
            if (textView != null) {
                textView.setVisibility(8);
            }
            View view4 = this.f157494o;
            if (view4 != null) {
                view4.setVisibility(8);
            }
        }
        UDSwitch uDSwitch7 = this.f157481a;
        if (uDSwitch7 != null) {
            VideoChat e2 = this.f157492l.mo212056e();
            Intrinsics.checkExpressionValueIsNotNull(e2, "meeting.videoChat");
            VideoChatSettings videoChatSettings2 = e2.getVideoChatSettings();
            Intrinsics.checkExpressionValueIsNotNull(videoChatSettings2, "meeting.videoChat.videoChatSettings");
            uDSwitch7.setChecked(videoChatSettings2.isMuteOnEntry());
        }
        UDSwitch uDSwitch8 = this.f157481a;
        if (uDSwitch8 != null) {
            uDSwitch8.setOnCheckedChangeListener(new C62565d(this));
        }
        if (this.f157492l.ao().mo218468d()) {
            UDSwitch uDSwitch9 = this.f157483c;
            if (uDSwitch9 != null) {
                VideoChat e3 = this.f157492l.mo212056e();
                Intrinsics.checkExpressionValueIsNotNull(e3, "meeting.videoChat");
                VideoChatSettings videoChatSettings3 = e3.getVideoChatSettings();
                Intrinsics.checkExpressionValueIsNotNull(videoChatSettings3, "meeting.videoChat.videoChatSettings");
                uDSwitch9.setChecked(videoChatSettings3.getAllowPartiUnMute());
            }
            UDSwitch uDSwitch10 = this.f157483c;
            if (uDSwitch10 != null) {
                uDSwitch10.setOnCheckedChangeListener(new C62566e(this));
            }
        } else {
            View view5 = this.f157482b;
            if (view5 != null) {
                view5.setVisibility(8);
            }
        }
        UDSwitch uDSwitch11 = this.f157484d;
        if (uDSwitch11 != null) {
            VideoChat e4 = this.f157492l.mo212056e();
            Intrinsics.checkExpressionValueIsNotNull(e4, "meeting.videoChat");
            VideoChatSettings videoChatSettings4 = e4.getVideoChatSettings();
            Intrinsics.checkExpressionValueIsNotNull(videoChatSettings4, "meeting.videoChat.videoChatSettings");
            uDSwitch11.setChecked(videoChatSettings4.getOnlyHostCanShare());
        }
        UDSwitch uDSwitch12 = this.f157484d;
        if (!(uDSwitch12 == null || !uDSwitch12.isEnabled() || (uDSwitch = this.f157485e) == null)) {
            VideoChat e5 = this.f157492l.mo212056e();
            Intrinsics.checkExpressionValueIsNotNull(e5, "meeting.videoChat");
            VideoChatSettings videoChatSettings5 = e5.getVideoChatSettings();
            Intrinsics.checkExpressionValueIsNotNull(videoChatSettings5, "meeting.videoChat.videoChatSettings");
            uDSwitch.setEnabled(true ^ videoChatSettings5.getOnlyHostCanShare());
        }
        UDSwitch uDSwitch13 = this.f157484d;
        if (uDSwitch13 != null) {
            uDSwitch13.setOnCheckedChangeListener(new C62567f(this));
        }
        UDSwitch uDSwitch14 = this.f157485e;
        if (uDSwitch14 != null) {
            VideoChat e6 = this.f157492l.mo212056e();
            Intrinsics.checkExpressionValueIsNotNull(e6, "meeting.videoChat");
            VideoChatSettings videoChatSettings6 = e6.getVideoChatSettings();
            Intrinsics.checkExpressionValueIsNotNull(videoChatSettings6, "meeting.videoChat.videoChatSettings");
            uDSwitch14.setChecked(videoChatSettings6.getOnlyHostCanReplaceShare());
        }
        UDSwitch uDSwitch15 = this.f157485e;
        if (uDSwitch15 != null) {
            uDSwitch15.setOnCheckedChangeListener(new C62568g(this));
        }
        AbstractC62555a aa3 = this.f157492l.aa();
        Intrinsics.checkExpressionValueIsNotNull(aa3, "meeting.settingMoreControl");
        if (!aa3.mo216278f()) {
            View view6 = this.f157500u;
            if (view6 != null) {
                view6.setVisibility(8);
            }
            View view7 = this.f157501v;
            if (view7 != null) {
                view7.setVisibility(8);
            }
            UDSwitch uDSwitch16 = this.f157486f;
            if (uDSwitch16 != null) {
                uDSwitch16.setVisibility(8);
            }
        }
        AbsBreakoutRoomControl al3 = this.f157492l.al();
        Intrinsics.checkExpressionValueIsNotNull(al3, "meeting.breakoutRoomControl");
        if (al3.mo213182i() && !ParticipantUtil.m248736d(this.f157492l) && !ParticipantUtil.m248733c(this.f157492l) && (view2 = this.f157501v) != null) {
            view2.setVisibility(8);
        }
        UDSwitch uDSwitch17 = this.f157486f;
        if (uDSwitch17 != null) {
            VideoChat e7 = this.f157492l.mo212056e();
            Intrinsics.checkExpressionValueIsNotNull(e7, "meeting.videoChat");
            VideoChatSettings videoChatSettings7 = e7.getVideoChatSettings();
            Intrinsics.checkExpressionValueIsNotNull(videoChatSettings7, "meeting.videoChat.videoChatSettings");
            uDSwitch17.setChecked(videoChatSettings7.getOnlyPresenterCanAnnotate());
        }
        UDSwitch uDSwitch18 = this.f157486f;
        if (uDSwitch18 != null) {
            uDSwitch18.setOnCheckedChangeListener(new C62569h(this));
        }
        C61383d I = this.f157492l.mo212091I();
        Intrinsics.checkExpressionValueIsNotNull(I, "meeting.meetingData");
        I.mo212498e().mo212443a(this);
        this.f157492l.al().mo213163a(this);
        this.f157502w = new C62570i(this);
        this.f157492l.ao().mo218458a(this.f157502w);
        AbstractC61222a aVar = this.f157504y;
        if (aVar instanceof HostAdvancedOptionsDialog) {
            aVar.mo211609a(this);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "button", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.o.a.f$f */
    public static final class C62567f implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ HostAdvancedOptionsViewHolder f157510a;

        C62567f(HostAdvancedOptionsViewHolder fVar) {
            this.f157510a = fVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!this.f157510a.f157489i) {
                C60700b.m235851b("HostAdvancedOptionsViewHolder", "[onClick3]", "only host can share, isChecked = " + z);
                VcBizService.sendManageRequest(this.f157510a.f157492l.mo212055d(), HostManageRequest.Action.SET_ONLY_HOST_CAN_SHARE, null, null, null, Boolean.valueOf(z), null, null);
                SharePermissionEvent.Companion aVar = SharePermissionEvent.f160905a;
                VideoChat e = this.f157510a.f157492l.mo212056e();
                Intrinsics.checkExpressionValueIsNotNull(e, "meeting.videoChat");
                aVar.mo220399a(z, e);
                MeetingHostPanelEvent.m249807a(MeetingHostPanelEvent.f160841b.mo220293a(), this.f157510a.f157492l, "advanced_options", "share_permission", z, (String) null, 16, (Object) null);
            } else {
                this.f157510a.f157489i = false;
            }
            UDSwitch uDSwitch = this.f157510a.f157485e;
            if (uDSwitch != null) {
                uDSwitch.setEnabled(!z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "button", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.o.a.f$g */
    public static final class C62568g implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ HostAdvancedOptionsViewHolder f157511a;

        C62568g(HostAdvancedOptionsViewHolder fVar) {
            this.f157511a = fVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!this.f157511a.f157490j) {
                C60700b.m235851b("HostAdvancedOptionsViewHolder", "[onClick4]", "only host can replace share, isChecked = " + z);
                VcBizService.sendManageRequest(this.f157511a.f157492l.mo212055d(), HostManageRequest.Action.SET_ONLY_HOST_CAN_REPLACE_SHARE, null, null, null, null, Boolean.valueOf(z), null);
                SharePermissionEvent.Companion aVar = SharePermissionEvent.f160905a;
                VideoChat e = this.f157511a.f157492l.mo212056e();
                Intrinsics.checkExpressionValueIsNotNull(e, "meeting.videoChat");
                aVar.mo220401b(z, e);
                MeetingHostPanelEvent.m249807a(MeetingHostPanelEvent.f160841b.mo220293a(), this.f157511a.f157492l, "advanced_options", "host_reshare_permission", z, (String) null, 16, (Object) null);
                return;
            }
            this.f157511a.f157490j = false;
        }
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    /* renamed from: a */
    public void mo212620a(Participant participant, Participant participant2) {
        if (participant2 != null && participant2.isParticipant()) {
            mo216332e();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "buttonView", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.o.a.f$d */
    public static final class C62565d implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ HostAdvancedOptionsViewHolder f157508a;

        C62565d(HostAdvancedOptionsViewHolder fVar) {
            this.f157508a = fVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x007e  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x00c1  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x00c8  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onCheckedChanged(android.widget.CompoundButton r15, boolean r16) {
            /*
            // Method dump skipped, instructions count: 212
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.setting.settingdialog.HostAdvancedOptionsViewHolder.C62565d.onCheckedChanged(android.widget.CompoundButton, boolean):void");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "buttonView", "Landroid/widget/CompoundButton;", "isChecked", "", "onCheckedChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.o.a.f$e */
    public static final class C62566e implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ HostAdvancedOptionsViewHolder f157509a;

        C62566e(HostAdvancedOptionsViewHolder fVar) {
            this.f157509a = fVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!this.f157509a.f157488h) {
                C60700b.m235851b("HostAdvancedOptionsViewHolder", "[onClick2]", "lock button: allow participant unMute = " + z);
                String str = null;
                BreakoutRoomManage breakoutRoomManage = null;
                HostManageRequest.Action action = HostManageRequest.Action.ALLOW_PARTI_UNMUTE;
                AbsBreakoutRoomControl al = this.f157509a.f157492l.al();
                Intrinsics.checkExpressionValueIsNotNull(al, "meeting.breakoutRoomControl");
                if (al.mo213182i()) {
                    AbsBreakoutRoomControl al2 = this.f157509a.f157492l.al();
                    Intrinsics.checkExpressionValueIsNotNull(al2, "meeting.breakoutRoomControl");
                    VCBreakoutRoomInfo k = al2.mo213184k();
                    if (k != null) {
                        VCBreakoutRoomInfoSettings settings = k.getSettings();
                        if (settings != null) {
                            settings.setArticipantUnmuteDeny(!z);
                        }
                        str = k.getBreakoutRoomId();
                        breakoutRoomManage = new BreakoutRoomManage();
                        breakoutRoomManage.setManageType(BreakoutRoomManage.ManageType.UPDATE_SETTINGS);
                        ArrayList arrayList = new ArrayList(1);
                        arrayList.add(k);
                        breakoutRoomManage.setRoomInfos(arrayList);
                    }
                }
                if (!TextUtils.f165135a.mo228357a(str)) {
                    action = HostManageRequest.Action.MANAGE_BREAKOUT_ROOM;
                }
                VcBizService.sendManageRequest(this.f157509a.f157492l.mo212055d(), str, breakoutRoomManage, action, (String) null, (String) null, (ParticipantType) null, false, false, false, Boolean.valueOf(z), (String) null);
                bf.m250159a(this.f157509a.f157492l.mo212056e(), z);
                MeetingHostPanelEvent.f160841b.mo220293a().mo220291a(this.f157509a.f157492l, "advanced_options", "participants_unmute_permission", z, "tool_bar");
                return;
            }
            this.f157509a.f157488h = false;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "button", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.o.a.f$h */
    public static final class C62569h implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ HostAdvancedOptionsViewHolder f157512a;

        C62569h(HostAdvancedOptionsViewHolder fVar) {
            this.f157512a = fVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!this.f157512a.f157491k) {
                C60700b.m235851b("HostAdvancedOptionsViewHolder", "[onClick5]", "only host can replace share, isChecked = " + z);
                String str = null;
                BreakoutRoomManage breakoutRoomManage = null;
                AbsBreakoutRoomControl al = this.f157512a.f157492l.al();
                Intrinsics.checkExpressionValueIsNotNull(al, "meeting.breakoutRoomControl");
                if (al.mo213182i()) {
                    AbsBreakoutRoomControl al2 = this.f157512a.f157492l.al();
                    Intrinsics.checkExpressionValueIsNotNull(al2, "meeting.breakoutRoomControl");
                    VCBreakoutRoomInfo k = al2.mo213184k();
                    if (k != null) {
                        VCBreakoutRoomInfoSettings settings = k.getSettings();
                        if (settings != null) {
                            settings.setOnlyPresenterCanAnnote(z);
                        }
                        str = k.getBreakoutRoomId();
                        breakoutRoomManage = new BreakoutRoomManage();
                        breakoutRoomManage.setManageType(BreakoutRoomManage.ManageType.UPDATE_SETTINGS);
                        ArrayList arrayList = new ArrayList(1);
                        arrayList.add(k);
                        breakoutRoomManage.setRoomInfos(arrayList);
                    }
                    if (!TextUtils.f165135a.mo228357a(str)) {
                        VcBizService.sendManageRequest(this.f157512a.f157492l.mo212055d(), str, breakoutRoomManage, HostManageRequest.Action.MANAGE_BREAKOUT_ROOM, (String) null, (String) null, (ParticipantType) null, false, false, false, (Boolean) false, (String) null);
                    }
                } else {
                    VcBizService.sendManageRequest(this.f157512a.f157492l.mo212055d(), HostManageRequest.Action.SET_ONLY_PRESENTER_CAN_ANNOTATE, null, null, null, null, null, Boolean.valueOf(z));
                }
                SharePermissionEvent.Companion aVar = SharePermissionEvent.f160905a;
                boolean f = this.f157512a.f157492l.ay().mo216075f();
                VideoChat e = this.f157512a.f157492l.mo212056e();
                Intrinsics.checkExpressionValueIsNotNull(e, "meeting.videoChat");
                aVar.mo220400a(z, f, e);
                MeetingHostPanelEvent.m249807a(MeetingHostPanelEvent.f160841b.mo220293a(), this.f157512a.f157492l, "advanced_options", "host_mark_permission", z, (String) null, 16, (Object) null);
                return;
            }
            this.f157512a.f157491k = false;
        }
    }

    public HostAdvancedOptionsViewHolder(Activity activity, C61303k kVar, AbstractC61222a aVar) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        Intrinsics.checkParameterIsNotNull(aVar, "dialog");
        this.f157503x = activity;
        this.f157492l = kVar;
        this.f157504y = aVar;
    }
}
