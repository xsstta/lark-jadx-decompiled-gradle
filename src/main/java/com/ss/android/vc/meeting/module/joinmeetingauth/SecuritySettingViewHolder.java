package com.ss.android.vc.meeting.module.joinmeetingauth;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.udswitch.UDSwitch;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60752f;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.entity.InterpreterSetting;
import com.ss.android.vc.entity.LanguageType;
import com.ss.android.vc.entity.MeetingSecuritySetting;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.entity.VCManageCapability;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatSettings;
import com.ss.android.vc.entity.breakoutroom.BreakoutRoomManage;
import com.ss.android.vc.entity.request.HostManageRequest;
import com.ss.android.vc.entity.response.C60987v;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.model.C61373b;
import com.ss.android.vc.meeting.model.C61383d;
import com.ss.android.vc.meeting.model.C61388g;
import com.ss.android.vc.meeting.module.VCBreakoutRoomInfo;
import com.ss.android.vc.meeting.module.VCBreakoutRoomInfoSettings;
import com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl;
import com.ss.android.vc.meeting.module.joinmeetingauth.SecuritySettingManager;
import com.ss.android.vc.meeting.module.lobby.C62120c;
import com.ss.android.vc.meeting.module.p3123g.C61873a;
import com.ss.android.vc.meeting.module.p3148o.AbstractC62555a;
import com.ss.android.vc.meeting.module.share.C62955c;
import com.ss.android.vc.meeting.module.share.ShareItemType;
import com.ss.android.vc.meeting.module.share.VideoChatShareItem;
import com.ss.android.vc.meeting.module.share.p3163d.C62965c;
import com.ss.android.vc.meeting.module.speakrequest.AbsSpeakRequestControl;
import com.ss.android.vc.meeting.utils.SpanUtil;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.service.VcBizService;
import com.ss.android.vc.statistics.event.C63742at;
import com.ss.android.vc.statistics.event.MeetingChargingEvent;
import com.ss.android.vc.statistics.event.bf;
import com.ss.android.vc.statistics.event2.MeetingHostPanelEvent;
import com.ss.ugc.effectplatform.util.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 P2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001PB%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0006\u00107\u001a\u000208J\u0006\u00109\u001a\u00020 J\u0006\u0010:\u001a\u000208J.\u0010;\u001a\n\u0012\u0004\u0012\u00020=\u0018\u00010<2\u0014\u0010>\u001a\u0010\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020=\u0018\u00010?2\u0006\u0010A\u001a\u00020BH\u0002J \u0010C\u001a\u0002082\u0006\u0010D\u001a\u00020 2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\b\u0010E\u001a\u000208H\u0002J\u0006\u0010F\u001a\u000208J\b\u0010G\u001a\u000208H\u0016J\u0010\u0010H\u001a\u0002082\u0006\u0010I\u001a\u00020\u000bH\u0016J\u001c\u0010J\u001a\u0002082\b\u0010K\u001a\u0004\u0018\u00010L2\b\u0010M\u001a\u0004\u0018\u00010LH\u0016J\u0006\u0010N\u001a\u000208J\u0006\u0010O\u001a\u000208R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010(\u001a\u00020)X.¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020/X.¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0010\u00104\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u0010\u00105\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000¨\u0006Q"}, d2 = {"Lcom/ss/android/vc/meeting/module/joinmeetingauth/SecuritySettingViewHolder;", "Lcom/ss/android/vc/meeting/model/ParticipantData$ParticipantDataChange;", "Lcom/ss/android/vc/meeting/model/InMeetingChangeProcessor$InMeetingChangeListener;", "Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface$OnDismissListener;", "activity", "Landroid/app/Activity;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "dialog", "Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface;", "isFromParticipantManager", "", "(Landroid/app/Activity;Lcom/ss/android/vc/meeting/framework/meeting/Meeting;Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface;Z)V", "allowPartiUnMuteContainer", "Landroid/view/ViewGroup;", "closeButton", "Landroid/widget/ImageView;", "getCloseButton", "()Landroid/widget/ImageView;", "setCloseButton", "(Landroid/widget/ImageView;)V", "iSecuritySettingChange", "Lcom/ss/android/vc/meeting/module/joinmeetingauth/SecuritySettingManager$ISecuritySettingChange;", "isServerPushAllowPartiUnMute", "isServerPushEnableLobby", "isServerPushMuteOnEntry", "mEnableLobbyContainer", "mEnableLobbySwitcher", "Lcom/larksuite/component/universe_design/udswitch/UDSwitch;", "mEnableLobbyTv", "Landroid/widget/TextView;", "mLobbyDivider", "Landroid/view/View;", "mShareDialog", "mSpeakRequestControlListener", "Lcom/ss/android/vc/meeting/module/speakrequest/AbsSpeakRequestControl$ISpeakRequestControlListener;", "muteOnEntryContainer", "partiJoinPermissionsTitle", "partiMicSettingContainer", "partiMicSettingTitle", "securitySettingAdapter", "Lcom/ss/android/vc/meeting/module/joinmeetingauth/SecuritySettingAdapter;", "getSecuritySettingAdapter", "()Lcom/ss/android/vc/meeting/module/joinmeetingauth/SecuritySettingAdapter;", "setSecuritySettingAdapter", "(Lcom/ss/android/vc/meeting/module/joinmeetingauth/SecuritySettingAdapter;)V", "settingListView", "Landroidx/recyclerview/widget/RecyclerView;", "getSettingListView", "()Landroidx/recyclerview/widget/RecyclerView;", "setSettingListView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "switchAllowUserUnMute", "switchMuteOnEntry", "title", "beforeDialogDismiss", "", "contentView", "dismiss", "getSelectedVideoChatShareItems", "Ljava/util/ArrayList;", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareItem;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "", "meetingSecuritySetting", "Lcom/ss/android/vc/entity/MeetingSecuritySetting;", "init", "rootView", "initMicSettings", "onDialogDismiss", "onDismiss", "onMuteOnEntryChanged", "muteOnEntry", "onSelfParticipantRoleUpdate", "lastSelf", "Lcom/ss/android/vc/entity/Participant;", "currentSelf", "refresh", "show", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.g.g */
public final class SecuritySettingViewHolder implements AbstractC61222a.AbstractC61223a, C61373b.AbstractC61374a, C61388g.AbstractC61393a {

    /* renamed from: p */
    public static final Companion f155378p = new Companion(null);

    /* renamed from: a */
    public RecyclerView f155379a;

    /* renamed from: b */
    public ImageView f155380b;

    /* renamed from: c */
    public C61873a f155381c;

    /* renamed from: d */
    public AbstractC61222a f155382d;

    /* renamed from: e */
    public ViewGroup f155383e;

    /* renamed from: f */
    public UDSwitch f155384f;

    /* renamed from: g */
    public TextView f155385g;

    /* renamed from: h */
    public boolean f155386h;

    /* renamed from: i */
    public UDSwitch f155387i;

    /* renamed from: j */
    public ViewGroup f155388j;

    /* renamed from: k */
    public UDSwitch f155389k;

    /* renamed from: l */
    public boolean f155390l;

    /* renamed from: m */
    public boolean f155391m;

    /* renamed from: n */
    public C61303k f155392n;

    /* renamed from: o */
    public boolean f155393o;

    /* renamed from: q */
    private View f155394q;

    /* renamed from: r */
    private TextView f155395r;

    /* renamed from: s */
    private TextView f155396s;

    /* renamed from: t */
    private ViewGroup f155397t;

    /* renamed from: u */
    private ViewGroup f155398u;

    /* renamed from: v */
    private TextView f155399v;

    /* renamed from: w */
    private SecuritySettingManager.ISecuritySettingChange f155400w;

    /* renamed from: x */
    private AbsSpeakRequestControl.ISpeakRequestControlListener f155401x;

    /* renamed from: y */
    private Activity f155402y;

    /* renamed from: z */
    private AbstractC61222a f155403z;

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
    /* renamed from: b */
    public /* synthetic */ void mo212621b(Participant participant, Participant participant2) {
        C61388g.AbstractC61393a.CC.$default$b(this, participant, participant2);
    }

    @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
    /* renamed from: b */
    public /* synthetic */ void mo212445b(boolean z) {
        C61373b.AbstractC61374a.CC.$default$b(this, z);
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

    @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
    /* renamed from: c */
    public /* synthetic */ void mo212449c(boolean z) {
        C61373b.AbstractC61374a.CC.$default$c(this, z);
    }

    @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
    public /* synthetic */ void c_(String str, String str2) {
        C61373b.AbstractC61374a.CC.$default$c_(this, str, str2);
    }

    @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
    /* renamed from: d */
    public /* synthetic */ void mo212451d(boolean z) {
        C61373b.AbstractC61374a.CC.$default$d(this, z);
    }

    /* renamed from: e */
    public final void mo214285e() {
    }

    @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
    public /* synthetic */ void onOnlyPresenterCanAnnotateChanged(boolean z) {
        C61373b.AbstractC61374a.CC.$default$onOnlyPresenterCanAnnotateChanged(this, z);
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    public /* synthetic */ void onSelfRtcModeUpdate(Participant participant, Participant participant2) {
        C61388g.AbstractC61393a.CC.$default$onSelfRtcModeUpdate(this, participant, participant2);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/vc/meeting/module/joinmeetingauth/SecuritySettingViewHolder$Companion;", "", "()V", "TAG", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.g.g$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/vc/meeting/module/joinmeetingauth/SecuritySettingViewHolder$init$3", "Lcom/ss/android/vc/meeting/module/joinmeetingauth/SecuritySettingAdapter$Listener;", "getDisplayNameForContactGroup", "", "securitySetting", "Lcom/ss/android/vc/entity/MeetingSecuritySetting;", "getMeeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "onSecuritySettingChanged", "", "setting", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.g.g$e */
    public static final class C61894e implements C61873a.AbstractC61876a {

        /* renamed from: a */
        final /* synthetic */ SecuritySettingViewHolder f155412a;

        /* renamed from: b */
        final /* synthetic */ C61303k f155413b;

        /* renamed from: c */
        final /* synthetic */ Activity f155414c;

        @Override // com.ss.android.vc.meeting.module.p3123g.C61873a.AbstractC61876a
        /* renamed from: a */
        public C61303k mo214255a() {
            return this.f155413b;
        }

        @Override // com.ss.android.vc.meeting.module.p3123g.C61873a.AbstractC61876a
        /* renamed from: b */
        public String mo214257b(MeetingSecuritySetting meetingSecuritySetting) {
            Intrinsics.checkParameterIsNotNull(meetingSecuritySetting, "securitySetting");
            return this.f155413b.mo212161u().mo214266b(meetingSecuritySetting);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: com.ss.android.vc.entity.MeetingSecuritySetting */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.ss.android.vc.meeting.module.p3123g.C61873a.AbstractC61876a
        /* renamed from: a */
        public void mo214256a(MeetingSecuritySetting meetingSecuritySetting) {
            Intrinsics.checkParameterIsNotNull(meetingSecuritySetting, "setting");
            if (meetingSecuritySetting.getSecurityLevel() == MeetingSecuritySetting.SecurityLevel.CONTACTS_AND_GROUP) {
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = meetingSecuritySetting;
                this.f155413b.mo212161u().mo214260a(objectRef.element, new C61895a(this, objectRef));
                return;
            }
            SecuritySettingManager.m241708a(this.f155413b.mo212161u(), this.f155413b, meetingSecuritySetting, null, null, 12, null);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/vc/meeting/module/joinmeetingauth/SecuritySettingViewHolder$init$3$onSecuritySettingChanged$1", "Lcom/ss/android/vc/meeting/module/joinmeetingauth/SecuritySettingManager$IGetContactAndGroupInfo;", "onGetContactAndGroupInfo", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareItem;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.g.g$e$a */
        public static final class C61895a implements SecuritySettingManager.IGetContactAndGroupInfo {

            /* renamed from: a */
            final /* synthetic */ C61894e f155415a;

            /* renamed from: b */
            final /* synthetic */ Ref.ObjectRef f155416b;

            @Override // com.ss.android.vc.meeting.module.joinmeetingauth.SecuritySettingManager.IGetContactAndGroupInfo
            public void onGetContactAndGroupInfo(Map<String, VideoChatShareItem> map) {
                ArrayList<VideoChatShareItem> a = this.f155415a.f155412a.mo214283a(map, this.f155416b.element);
                this.f155415a.f155412a.f155382d = C62965c.m246555a(this.f155415a.f155414c, this.f155415a.f155413b, new C62955c(this.f155415a.f155413b.mo212055d(), VideoChat.VendorType.RTC.getNumber()), a);
                AbstractC61222a aVar = this.f155415a.f155412a.f155382d;
                if (aVar != null) {
                    aVar.mo211606a();
                }
            }

            C61895a(C61894e eVar, Ref.ObjectRef objectRef) {
                this.f155415a = eVar;
                this.f155416b = objectRef;
            }
        }

        C61894e(SecuritySettingViewHolder gVar, C61303k kVar, Activity activity) {
            this.f155412a = gVar;
            this.f155413b = kVar;
            this.f155414c = activity;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/vc/meeting/module/joinmeetingauth/SecuritySettingViewHolder$init$2", "Lcom/ss/android/vc/meeting/module/joinmeetingauth/SecuritySettingManager$ISecuritySettingChange;", "onEnableLobbyChanged", "", "onSecuritySettingChanged", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.g.g$d */
    public static final class C61892d implements SecuritySettingManager.ISecuritySettingChange {

        /* renamed from: a */
        final /* synthetic */ SecuritySettingViewHolder f155408a;

        /* renamed from: b */
        final /* synthetic */ C61303k f155409b;

        @Override // com.ss.android.vc.meeting.module.joinmeetingauth.SecuritySettingManager.ISecuritySettingChange
        /* renamed from: a */
        public void mo214273a() {
            this.f155408a.mo214287g();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.g.g$d$a */
        static final class RunnableC61893a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C61892d f155410a;

            /* renamed from: b */
            final /* synthetic */ Ref.ObjectRef f155411b;

            RunnableC61893a(C61892d dVar, Ref.ObjectRef objectRef) {
                this.f155410a = dVar;
                this.f155411b = objectRef;
            }

            public final void run() {
                this.f155410a.f155408a.f155386h = true;
                UDSwitch uDSwitch = this.f155410a.f155408a.f155384f;
                if (uDSwitch != null) {
                    uDSwitch.setChecked(this.f155411b.element.isEnableLobby());
                }
            }
        }

        @Override // com.ss.android.vc.meeting.module.joinmeetingauth.SecuritySettingManager.ISecuritySettingChange
        /* renamed from: b */
        public void mo214274b() {
            ViewGroup viewGroup;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            VideoChat e = this.f155409b.mo212056e();
            Intrinsics.checkExpressionValueIsNotNull(e, "meeting.videoChat");
            VideoChatSettings videoChatSettings = e.getVideoChatSettings();
            Intrinsics.checkExpressionValueIsNotNull(videoChatSettings, "meeting.videoChat.videoChatSettings");
            objectRef.element = (T) videoChatSettings.getSecuritySetting();
            ViewGroup viewGroup2 = this.f155408a.f155383e;
            if (viewGroup2 != null && viewGroup2.getVisibility() == 0 && objectRef.element != null && (viewGroup = this.f155408a.f155383e) != null) {
                viewGroup.post(new RunnableC61893a(this, objectRef));
            }
        }

        C61892d(SecuritySettingViewHolder gVar, C61303k kVar) {
            this.f155408a = gVar;
            this.f155409b = kVar;
        }
    }

    /* renamed from: f */
    public final void mo214286f() {
        this.f155403z.dismiss();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/joinmeetingauth/SecuritySettingViewHolder$init$10", "Lcom/ss/android/vc/meeting/module/speakrequest/AbsSpeakRequestControl$ISpeakRequestControlListener;", "onDealAllowPartiUnMute", "", "allowPartiUnMute", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.g.g$c */
    public static final class C61890c implements AbsSpeakRequestControl.ISpeakRequestControlListener {

        /* renamed from: a */
        final /* synthetic */ SecuritySettingViewHolder f155405a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.g.g$c$a */
        static final class RunnableC61891a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C61890c f155406a;

            /* renamed from: b */
            final /* synthetic */ boolean f155407b;

            RunnableC61891a(C61890c cVar, boolean z) {
                this.f155406a = cVar;
                this.f155407b = z;
            }

            public final void run() {
                this.f155406a.f155405a.f155391m = true;
                UDSwitch uDSwitch = this.f155406a.f155405a.f155389k;
                if (uDSwitch != null) {
                    uDSwitch.setChecked(this.f155407b);
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C61890c(SecuritySettingViewHolder gVar) {
            this.f155405a = gVar;
        }

        @Override // com.ss.android.vc.meeting.module.speakrequest.AbsSpeakRequestControl.ISpeakRequestControlListener
        /* renamed from: a */
        public void mo214289a(boolean z) {
            ViewGroup viewGroup;
            ViewGroup viewGroup2 = this.f155405a.f155388j;
            if (viewGroup2 != null && viewGroup2.getVisibility() == 0) {
                UDSwitch uDSwitch = this.f155405a.f155389k;
                if ((uDSwitch == null || uDSwitch.isChecked() != z) && (viewGroup = this.f155405a.f155388j) != null) {
                    viewGroup.post(new RunnableC61891a(this, z));
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.g.g$j */
    static final class RunnableC61901j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SecuritySettingViewHolder f155426a;

        /* renamed from: b */
        final /* synthetic */ boolean f155427b;

        RunnableC61901j(SecuritySettingViewHolder gVar, boolean z) {
            this.f155426a = gVar;
            this.f155427b = z;
        }

        public final void run() {
            this.f155426a.f155390l = true;
            UDSwitch uDSwitch = this.f155426a.f155387i;
            if (uDSwitch != null) {
                uDSwitch.setChecked(this.f155427b);
            }
        }
    }

    /* renamed from: d */
    public final void mo214284d() {
        SecuritySettingManager u = this.f155392n.mo212161u();
        SecuritySettingManager.ISecuritySettingChange cVar = this.f155400w;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("iSecuritySettingChange");
        }
        u.mo214268b(cVar);
    }

    /* renamed from: a */
    public final View mo214282a() {
        View inflate = LayoutInflater.from(this.f155402y).inflate(R.layout.join_meeting_security_setting, (ViewGroup) null);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "rootView");
        m241733a(inflate, this.f155392n, this.f155402y);
        if (this.f155393o) {
            MeetingHostPanelEvent.f160841b.mo220293a().mo220289a(this.f155392n, "user_list");
        } else {
            MeetingHostPanelEvent.f160841b.mo220293a().mo220289a(this.f155392n, "tool_bar");
        }
        return inflate;
    }

    @Override // com.ss.android.vc.meeting.basedialog.AbstractC61222a.AbstractC61223a
    public void bY_() {
        C61383d I = this.f155392n.mo212091I();
        Intrinsics.checkExpressionValueIsNotNull(I, "meeting.meetingData");
        I.mo212498e().mo212444b(this);
        this.f155392n.ao().mo218464b(this.f155401x);
    }

    /* renamed from: m */
    private final void m241734m() {
        TextView textView;
        ViewGroup viewGroup;
        AbstractC62555a aa = this.f155392n.aa();
        Intrinsics.checkExpressionValueIsNotNull(aa, "meeting.settingMoreControl");
        if (!aa.mo216281i() && (viewGroup = this.f155398u) != null) {
            viewGroup.setVisibility(8);
        }
        AbstractC62555a aa2 = this.f155392n.aa();
        Intrinsics.checkExpressionValueIsNotNull(aa2, "meeting.settingMoreControl");
        if (!aa2.mo216281i() && !this.f155392n.ao().mo218468d() && (textView = this.f155396s) != null) {
            textView.setVisibility(8);
        }
        UDSwitch uDSwitch = this.f155387i;
        if (uDSwitch != null) {
            VideoChat e = this.f155392n.mo212056e();
            Intrinsics.checkExpressionValueIsNotNull(e, "meeting.videoChat");
            VideoChatSettings videoChatSettings = e.getVideoChatSettings();
            Intrinsics.checkExpressionValueIsNotNull(videoChatSettings, "meeting.videoChat.videoChatSettings");
            uDSwitch.setChecked(videoChatSettings.isMuteOnEntry());
        }
        UDSwitch uDSwitch2 = this.f155387i;
        if (uDSwitch2 != null) {
            uDSwitch2.setOnCheckedChangeListener(new C61899h(this));
        }
        if (this.f155392n.ao().mo218468d()) {
            UDSwitch uDSwitch3 = this.f155389k;
            if (uDSwitch3 != null) {
                VideoChat e2 = this.f155392n.mo212056e();
                Intrinsics.checkExpressionValueIsNotNull(e2, "meeting.videoChat");
                VideoChatSettings videoChatSettings2 = e2.getVideoChatSettings();
                Intrinsics.checkExpressionValueIsNotNull(videoChatSettings2, "meeting.videoChat.videoChatSettings");
                uDSwitch3.setChecked(videoChatSettings2.getAllowPartiUnMute());
            }
            UDSwitch uDSwitch4 = this.f155389k;
            if (uDSwitch4 != null) {
                uDSwitch4.setOnCheckedChangeListener(new C61900i(this));
                return;
            }
            return;
        }
        ViewGroup viewGroup2 = this.f155388j;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(8);
        }
    }

    /* renamed from: g */
    public final void mo214287g() {
        C61873a aVar = this.f155381c;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("securitySettingAdapter");
        }
        List items = aVar.getItems();
        Intrinsics.checkExpressionValueIsNotNull(items, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        int i = 0;
        for (Object obj : items) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            MeetingSecuritySetting meetingSecuritySetting = (MeetingSecuritySetting) obj;
            Intrinsics.checkExpressionValueIsNotNull(meetingSecuritySetting, "videoChatSecuritySetting");
            VideoChat e = this.f155392n.mo212056e();
            Intrinsics.checkExpressionValueIsNotNull(e, "meeting.videoChat");
            VideoChatSettings videoChatSettings = e.getVideoChatSettings();
            Intrinsics.checkExpressionValueIsNotNull(videoChatSettings, "meeting.videoChat.videoChatSettings");
            MeetingSecuritySetting securitySetting = videoChatSettings.getSecuritySetting();
            Intrinsics.checkExpressionValueIsNotNull(securitySetting, "meeting.videoChat.videoC…tSettings.securitySetting");
            meetingSecuritySetting.setGroupIds(securitySetting.getGroupIds());
            VideoChat e2 = this.f155392n.mo212056e();
            Intrinsics.checkExpressionValueIsNotNull(e2, "meeting.videoChat");
            VideoChatSettings videoChatSettings2 = e2.getVideoChatSettings();
            Intrinsics.checkExpressionValueIsNotNull(videoChatSettings2, "meeting.videoChat.videoChatSettings");
            MeetingSecuritySetting securitySetting2 = videoChatSettings2.getSecuritySetting();
            Intrinsics.checkExpressionValueIsNotNull(securitySetting2, "meeting.videoChat.videoC…tSettings.securitySetting");
            meetingSecuritySetting.setUserIds(securitySetting2.getUserIds());
            VideoChat e3 = this.f155392n.mo212056e();
            Intrinsics.checkExpressionValueIsNotNull(e3, "meeting.videoChat");
            VideoChatSettings videoChatSettings3 = e3.getVideoChatSettings();
            Intrinsics.checkExpressionValueIsNotNull(videoChatSettings3, "meeting.videoChat.videoChatSettings");
            MeetingSecuritySetting securitySetting3 = videoChatSettings3.getSecuritySetting();
            Intrinsics.checkExpressionValueIsNotNull(securitySetting3, "meeting.videoChat.videoC…tSettings.securitySetting");
            meetingSecuritySetting.setRoomIds(securitySetting3.getRoomIds());
            VideoChat e4 = this.f155392n.mo212056e();
            Intrinsics.checkExpressionValueIsNotNull(e4, "meeting.videoChat");
            VideoChatSettings videoChatSettings4 = e4.getVideoChatSettings();
            Intrinsics.checkExpressionValueIsNotNull(videoChatSettings4, "meeting.videoChat.videoChatSettings");
            MeetingSecuritySetting securitySetting4 = videoChatSettings4.getSecuritySetting();
            Intrinsics.checkExpressionValueIsNotNull(securitySetting4, "meeting.videoChat.videoC…tSettings.securitySetting");
            meetingSecuritySetting.setSpecialGroupTypes(securitySetting4.getSpecialGroupTypes());
            MeetingSecuritySetting.SecurityLevel securityLevel = meetingSecuritySetting.getSecurityLevel();
            VideoChat e5 = this.f155392n.mo212056e();
            Intrinsics.checkExpressionValueIsNotNull(e5, "meeting.videoChat");
            VideoChatSettings videoChatSettings5 = e5.getVideoChatSettings();
            Intrinsics.checkExpressionValueIsNotNull(videoChatSettings5, "meeting.videoChat.videoChatSettings");
            MeetingSecuritySetting securitySetting5 = videoChatSettings5.getSecuritySetting();
            Intrinsics.checkExpressionValueIsNotNull(securitySetting5, "meeting.videoChat.videoC…tSettings.securitySetting");
            if (securityLevel == securitySetting5.getSecurityLevel()) {
                C61873a aVar2 = this.f155381c;
                if (aVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("securitySettingAdapter");
                }
                aVar2.mo214253a(i);
            }
            i = i2;
        }
        C61873a aVar3 = this.f155381c;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("securitySettingAdapter");
        }
        aVar3.notifyDataSetChanged();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.g.g$b */
    public static final class View$OnClickListenerC61889b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SecuritySettingViewHolder f155404a;

        View$OnClickListenerC61889b(SecuritySettingViewHolder gVar) {
            this.f155404a = gVar;
        }

        public final void onClick(View view) {
            this.f155404a.mo214286f();
        }
    }

    @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
    public void i_(boolean z) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = this.f155398u;
        if (viewGroup2 != null && viewGroup2.getVisibility() == 0) {
            UDSwitch uDSwitch = this.f155387i;
            if ((uDSwitch == null || z != uDSwitch.isChecked()) && (viewGroup = this.f155398u) != null) {
                viewGroup.post(new RunnableC61901j(this, z));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/vc/meeting/module/joinmeetingauth/SecuritySettingViewHolder$init$9", "Lcom/ss/android/vc/net/request/IVcGetDataCallback;", "Lcom/ss/android/vc/entity/response/GetSuiteQuotaEntity;", "onError", "", "error", "Lcom/ss/android/vc/net/request/VcErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.g.g$g */
    public static final class C61898g implements AbstractC63598b<C60987v> {

        /* renamed from: a */
        final /* synthetic */ SecuritySettingViewHolder f155421a;

        /* renamed from: b */
        final /* synthetic */ VCManageCapability f155422b;

        /* renamed from: c */
        final /* synthetic */ Activity f155423c;

        @Override // com.ss.android.vc.net.request.AbstractC63598b
        public void onError(C63602e eVar) {
        }

        /* renamed from: a */
        public void onSuccess(C60987v vVar) {
            boolean z;
            if (vVar != null) {
                C60700b.m235851b("SecuritySettingViewHolder", "[getSuiteQuotaEntity]", "GetSuiteQuotaEntity.waitingRoom : " + vVar.f152723a);
                if (vVar.f152723a) {
                    VCManageCapability vCManageCapability = this.f155422b;
                    if (vCManageCapability != null) {
                        z = vCManageCapability.isVCLobby();
                    } else {
                        z = true;
                    }
                    UDSwitch uDSwitch = this.f155421a.f155384f;
                    if (uDSwitch != null) {
                        uDSwitch.setEnabled(z);
                        return;
                    }
                    return;
                }
                UDSwitch uDSwitch2 = this.f155421a.f155384f;
                if (uDSwitch2 != null) {
                    uDSwitch2.setEnabled(false);
                }
                SpanUtil.f160471a.mo219672a(this.f155421a.f155385g, this.f155423c, MeetingChargingEvent.Type.SETTING);
            }
        }

        C61898g(SecuritySettingViewHolder gVar, VCManageCapability vCManageCapability, Activity activity) {
            this.f155421a = gVar;
            this.f155422b = vCManageCapability;
            this.f155423c = activity;
        }
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    /* renamed from: a */
    public void mo212620a(Participant participant, Participant participant2) {
        boolean z;
        if (participant2 != null) {
            z = participant2.isParticipant();
        } else {
            z = false;
        }
        if (z) {
            AbstractC61222a aVar = this.f155382d;
            if (aVar != null) {
                aVar.dismiss();
            }
            mo214286f();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "buttonView", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.g.g$f */
    public static final class C61896f implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ SecuritySettingViewHolder f155417a;

        /* renamed from: b */
        final /* synthetic */ C61303k f155418b;

        C61896f(SecuritySettingViewHolder gVar, C61303k kVar) {
            this.f155417a = gVar;
            this.f155418b = kVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, final boolean z) {
            String str;
            C60700b.m235851b("SecuritySettingViewHolder", "[onClick]", "click enable lobby button: enable lobby = " + z);
            if (!this.f155417a.f155386h) {
                VideoChat e = this.f155418b.mo212056e();
                Intrinsics.checkExpressionValueIsNotNull(e, "meeting.videoChat");
                VideoChatSettings videoChatSettings = e.getVideoChatSettings();
                Intrinsics.checkExpressionValueIsNotNull(videoChatSettings, "meeting.videoChat.videoChatSettings");
                MeetingSecuritySetting securitySetting = videoChatSettings.getSecuritySetting();
                Intrinsics.checkExpressionValueIsNotNull(securitySetting, "meeting.videoChat.videoC…         .securitySetting");
                C63742at.m250066a(this.f155418b.mo212056e(), z, securitySetting.getSecurityLevel());
                MeetingHostPanelEvent a = MeetingHostPanelEvent.f160841b.mo220293a();
                C61303k kVar = this.f155418b;
                if (this.f155417a.f155393o) {
                    str = "user_list";
                } else {
                    str = "tool_bar";
                }
                a.mo220291a(kVar, "join_permission", "lobby_entry", z, str);
                securitySetting.setEnableLobby(z);
                UDSwitch uDSwitch = this.f155417a.f155384f;
                if (uDSwitch != null) {
                    uDSwitch.setClickable(false);
                }
                this.f155418b.mo212161u().mo214263a(this.f155418b, new AbstractC63598b<String>(this) {
                    /* class com.ss.android.vc.meeting.module.joinmeetingauth.SecuritySettingViewHolder.C61896f.C618971 */

                    /* renamed from: a */
                    final /* synthetic */ C61896f f155419a;

                    /* renamed from: a */
                    public void onSuccess(String str) {
                        UDSwitch uDSwitch = this.f155419a.f155417a.f155384f;
                        if (uDSwitch != null) {
                            uDSwitch.setClickable(true);
                        }
                    }

                    @Override // com.ss.android.vc.net.request.AbstractC63598b
                    public void onError(C63602e eVar) {
                        Intrinsics.checkParameterIsNotNull(eVar, "error");
                        UDSwitch uDSwitch = this.f155419a.f155417a.f155384f;
                        if (uDSwitch != null) {
                            uDSwitch.setChecked(!z);
                        }
                        UDSwitch uDSwitch2 = this.f155419a.f155417a.f155384f;
                        if (uDSwitch2 != null) {
                            uDSwitch2.setClickable(true);
                        }
                    }

                    {
                        this.f155419a = r1;
                    }
                });
                return;
            }
            this.f155417a.f155386h = false;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "buttonView", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.g.g$h */
    public static final class C61899h implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ SecuritySettingViewHolder f155424a;

        C61899h(SecuritySettingViewHolder gVar) {
            this.f155424a = gVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x007e  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x00ba  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x00bd  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x00cb  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x00d2  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onCheckedChanged(android.widget.CompoundButton r15, boolean r16) {
            /*
            // Method dump skipped, instructions count: 222
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.joinmeetingauth.SecuritySettingViewHolder.C61899h.onCheckedChanged(android.widget.CompoundButton, boolean):void");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "buttonView", "Landroid/widget/CompoundButton;", "isChecked", "", "onCheckedChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.g.g$i */
    public static final class C61900i implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ SecuritySettingViewHolder f155425a;

        C61900i(SecuritySettingViewHolder gVar) {
            this.f155425a = gVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            String str;
            if (!this.f155425a.f155391m) {
                C60700b.m235851b("HostAdvancedOptionsViewHolder", "[onClick2]", "lock button: allow participant unMute = " + z);
                String str2 = null;
                BreakoutRoomManage breakoutRoomManage = null;
                HostManageRequest.Action action = HostManageRequest.Action.ALLOW_PARTI_UNMUTE;
                AbsBreakoutRoomControl al = this.f155425a.f155392n.al();
                Intrinsics.checkExpressionValueIsNotNull(al, "meeting.breakoutRoomControl");
                if (al.mo213182i()) {
                    AbsBreakoutRoomControl al2 = this.f155425a.f155392n.al();
                    Intrinsics.checkExpressionValueIsNotNull(al2, "meeting.breakoutRoomControl");
                    VCBreakoutRoomInfo k = al2.mo213184k();
                    if (k != null) {
                        VCBreakoutRoomInfoSettings settings = k.getSettings();
                        if (settings != null) {
                            settings.setArticipantUnmuteDeny(!z);
                        }
                        str2 = k.getBreakoutRoomId();
                        breakoutRoomManage = new BreakoutRoomManage();
                        breakoutRoomManage.setManageType(BreakoutRoomManage.ManageType.UPDATE_SETTINGS);
                        ArrayList arrayList = new ArrayList(1);
                        arrayList.add(k);
                        breakoutRoomManage.setRoomInfos(arrayList);
                    }
                }
                if (!TextUtils.f165135a.mo228357a(str2)) {
                    action = HostManageRequest.Action.MANAGE_BREAKOUT_ROOM;
                }
                VcBizService.sendManageRequest(this.f155425a.f155392n.mo212055d(), str2, breakoutRoomManage, action, (String) null, (String) null, (ParticipantType) null, false, false, false, Boolean.valueOf(z), (String) null);
                bf.m250159a(this.f155425a.f155392n.mo212056e(), z);
                MeetingHostPanelEvent a = MeetingHostPanelEvent.f160841b.mo220293a();
                C61303k kVar = this.f155425a.f155392n;
                if (this.f155425a.f155393o) {
                    str = "user_list";
                } else {
                    str = "tool_bar";
                }
                a.mo220291a(kVar, "advanced_options", "participants_unmute_permission", z, str);
                return;
            }
            this.f155425a.f155391m = false;
        }
    }

    /* renamed from: a */
    public final ArrayList<VideoChatShareItem> mo214283a(Map<String, VideoChatShareItem> map, MeetingSecuritySetting meetingSecuritySetting) {
        ArrayList<VideoChatShareItem> arrayList = new ArrayList<>();
        if (C60752f.m236082b(map)) {
            List<String> groupIds = meetingSecuritySetting.getGroupIds();
            if (groupIds != null) {
                Iterator<T> it = groupIds.iterator();
                while (it.hasNext()) {
                    VideoChatShareItem videoChatShareItem = map.get(it.next());
                    if (videoChatShareItem != null) {
                        arrayList.add(videoChatShareItem);
                    }
                }
            }
            List<String> userIds = meetingSecuritySetting.getUserIds();
            if (userIds != null) {
                Iterator<T> it2 = userIds.iterator();
                while (it2.hasNext()) {
                    VideoChatShareItem videoChatShareItem2 = map.get(it2.next());
                    if (videoChatShareItem2 != null) {
                        arrayList.add(videoChatShareItem2);
                    }
                }
            }
            List<String> roomIds = meetingSecuritySetting.getRoomIds();
            if (roomIds != null) {
                Iterator<T> it3 = roomIds.iterator();
                while (it3.hasNext()) {
                    VideoChatShareItem videoChatShareItem3 = map.get(it3.next());
                    if (videoChatShareItem3 != null) {
                        arrayList.add(videoChatShareItem3);
                    }
                }
            }
        }
        if (!(meetingSecuritySetting == null || meetingSecuritySetting.getSpecialGroupTypes() == null)) {
            for (MeetingSecuritySetting.SpecialGroupType specialGroupType : meetingSecuritySetting.getSpecialGroupTypes()) {
                if (specialGroupType == MeetingSecuritySetting.SpecialGroupType.CALENDAR_GUEST_LIST) {
                    String string = this.f155402y.getResources().getString(R.string.View_G_EventGuests);
                    Intrinsics.checkExpressionValueIsNotNull(string, "activity.resources.getSt…tring.View_G_EventGuests)");
                    arrayList.add(new VideoChatShareItem("", string, "", "", ShareItemType.CALENDAR_GROUP, false, null, null, false, false, false, 0, null, null, null, false, null, 130048, null));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private final void m241733a(View view, C61303k kVar, Activity activity) {
        VCManageCapability vCManageCapability;
        boolean z;
        UDSwitch uDSwitch;
        View findViewById = view.findViewById(R.id.close);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.findViewById(id.close)");
        ImageView imageView = (ImageView) findViewById;
        this.f155380b = imageView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("closeButton");
        }
        imageView.setOnClickListener(new View$OnClickListenerC61889b(this));
        this.f155383e = (ViewGroup) view.findViewById(R.id.enable_lobby_container);
        this.f155384f = (UDSwitch) view.findViewById(R.id.switcher_enable_lobby);
        this.f155385g = (TextView) view.findViewById(R.id.enable_lobby_tv);
        this.f155394q = view.findViewById(R.id.divider_view2);
        this.f155399v = (TextView) view.findViewById(R.id.dialog_title);
        this.f155395r = (TextView) view.findViewById(R.id.parti_join_permissions_title);
        this.f155396s = (TextView) view.findViewById(R.id.parti_mic_setting_title);
        this.f155397t = (ViewGroup) view.findViewById(R.id.parti_mic_setting_container);
        this.f155398u = (ViewGroup) view.findViewById(R.id.mute_on_entry_container);
        this.f155387i = (UDSwitch) view.findViewById(R.id.switcher_mute_on_entry);
        this.f155388j = (ViewGroup) view.findViewById(R.id.allow_parti_unmute_container);
        this.f155389k = (UDSwitch) view.findViewById(R.id.switcher_allow_user_unmute);
        if (this.f155393o) {
            TextView textView = this.f155395r;
            if (textView != null) {
                textView.setVisibility(0);
            }
            TextView textView2 = this.f155396s;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            ViewGroup viewGroup = this.f155397t;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            ImageView imageView2 = this.f155380b;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("closeButton");
            }
            imageView2.setImageDrawable(C60773o.m236128f(R.drawable.ud_icon_left_outlined));
            ImageView imageView3 = this.f155380b;
            if (imageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("closeButton");
            }
            imageView3.getDrawable().setTint(C60773o.m236126d(R.color.icon_n1));
            TextView textView3 = this.f155399v;
            if (textView3 != null) {
                textView3.setText(C60773o.m236119a((int) R.string.View_G_Settings));
            }
            m241734m();
        } else {
            TextView textView4 = this.f155395r;
            if (textView4 != null) {
                textView4.setVisibility(8);
            }
            TextView textView5 = this.f155396s;
            if (textView5 != null) {
                textView5.setVisibility(8);
            }
            ViewGroup viewGroup2 = this.f155397t;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(8);
            }
            ImageView imageView4 = this.f155380b;
            if (imageView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("closeButton");
            }
            imageView4.setImageDrawable(C60773o.m236128f(R.drawable.ud_icon_close_small_outlined));
            ImageView imageView5 = this.f155380b;
            if (imageView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("closeButton");
            }
            imageView5.getDrawable().setTint(C60773o.m236126d(R.color.icon_n1));
            TextView textView6 = this.f155399v;
            if (textView6 != null) {
                textView6.setText(C60773o.m236119a((int) R.string.View_M_JoiningPermissions));
            }
        }
        VideoChat e = kVar.mo212056e();
        Intrinsics.checkExpressionValueIsNotNull(e, "meeting.videoChat");
        VideoChatSettings videoChatSettings = e.getVideoChatSettings();
        if (videoChatSettings != null) {
            vCManageCapability = videoChatSettings.getManageCapability();
        } else {
            vCManageCapability = null;
        }
        if (!(vCManageCapability == null || (uDSwitch = this.f155389k) == null)) {
            uDSwitch.setEnabled(vCManageCapability.isForceMuteMicrophone());
        }
        UDSwitch uDSwitch2 = this.f155384f;
        if (uDSwitch2 != null) {
            if (vCManageCapability != null) {
                z = vCManageCapability.isVCLobby();
            } else {
                z = true;
            }
            uDSwitch2.setEnabled(z);
        }
        View findViewById2 = view.findViewById(R.id.setting_list);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "rootView.findViewById(id.setting_list)");
        this.f155379a = (RecyclerView) findViewById2;
        this.f155400w = new C61892d(this, kVar);
        SecuritySettingManager u = kVar.mo212161u();
        SecuritySettingManager.ISecuritySettingChange cVar = this.f155400w;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("iSecuritySettingChange");
        }
        u.mo214264a(cVar);
        this.f155381c = new C61873a(new C61894e(this, kVar, activity), this.f155393o);
        RecyclerView recyclerView = this.f155379a;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("settingListView");
        }
        C61873a aVar = this.f155381c;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("securitySettingAdapter");
        }
        recyclerView.setAdapter(aVar);
        RecyclerView recyclerView2 = this.f155379a;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("settingListView");
        }
        RecyclerView.ItemAnimator itemAnimator = recyclerView2.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.setAddDuration(0);
        }
        RecyclerView recyclerView3 = this.f155379a;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("settingListView");
        }
        RecyclerView.ItemAnimator itemAnimator2 = recyclerView3.getItemAnimator();
        if (itemAnimator2 != null) {
            itemAnimator2.setChangeDuration(0);
        }
        RecyclerView recyclerView4 = this.f155379a;
        if (recyclerView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("settingListView");
        }
        RecyclerView.ItemAnimator itemAnimator3 = recyclerView4.getItemAnimator();
        if (itemAnimator3 != null) {
            itemAnimator3.setMoveDuration(0);
        }
        RecyclerView recyclerView5 = this.f155379a;
        if (recyclerView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("settingListView");
        }
        RecyclerView.ItemAnimator itemAnimator4 = recyclerView5.getItemAnimator();
        if (itemAnimator4 != null) {
            itemAnimator4.setRemoveDuration(0);
        }
        C61873a aVar2 = this.f155381c;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("securitySettingAdapter");
        }
        List items = aVar2.getItems();
        MeetingSecuritySetting meetingSecuritySetting = new MeetingSecuritySetting();
        meetingSecuritySetting.setSecurityLevel(MeetingSecuritySetting.SecurityLevel.PUBLIC);
        items.add(meetingSecuritySetting);
        MeetingSecuritySetting meetingSecuritySetting2 = new MeetingSecuritySetting();
        meetingSecuritySetting2.setSecurityLevel(MeetingSecuritySetting.SecurityLevel.TENANT);
        items.add(meetingSecuritySetting2);
        MeetingSecuritySetting meetingSecuritySetting3 = new MeetingSecuritySetting();
        meetingSecuritySetting3.setSecurityLevel(MeetingSecuritySetting.SecurityLevel.CONTACTS_AND_GROUP);
        items.add(meetingSecuritySetting3);
        MeetingSecuritySetting meetingSecuritySetting4 = new MeetingSecuritySetting();
        meetingSecuritySetting4.setSecurityLevel(MeetingSecuritySetting.SecurityLevel.ONLY_HOST);
        items.add(meetingSecuritySetting4);
        if (C62120c.m242645a()) {
            ViewGroup viewGroup3 = this.f155383e;
            if (viewGroup3 != null) {
                viewGroup3.setVisibility(0);
            }
            View view2 = this.f155394q;
            if (view2 != null) {
                view2.setVisibility(0);
            }
        } else {
            ViewGroup viewGroup4 = this.f155383e;
            if (viewGroup4 != null) {
                viewGroup4.setVisibility(8);
            }
            View view3 = this.f155394q;
            if (view3 != null) {
                view3.setVisibility(8);
            }
        }
        UDSwitch uDSwitch3 = this.f155384f;
        if (uDSwitch3 != null) {
            VideoChat e2 = kVar.mo212056e();
            Intrinsics.checkExpressionValueIsNotNull(e2, "meeting.videoChat");
            VideoChatSettings videoChatSettings2 = e2.getVideoChatSettings();
            Intrinsics.checkExpressionValueIsNotNull(videoChatSettings2, "meeting.videoChat.videoChatSettings");
            MeetingSecuritySetting securitySetting = videoChatSettings2.getSecuritySetting();
            Intrinsics.checkExpressionValueIsNotNull(securitySetting, "meeting.videoChat.videoC…tSettings.securitySetting");
            uDSwitch3.setChecked(securitySetting.isEnableLobby());
        }
        UDSwitch uDSwitch4 = this.f155384f;
        if (uDSwitch4 != null) {
            uDSwitch4.setOnCheckedChangeListener(new C61896f(this, kVar));
        }
        SecuritySettingManager u2 = kVar.mo212161u();
        String d = kVar.mo212055d();
        Intrinsics.checkExpressionValueIsNotNull(d, "meeting.meetingId");
        u2.mo214265a(d, new C61898g(this, vCManageCapability, activity));
        this.f155401x = new C61890c(this);
        C61383d I = kVar.mo212091I();
        Intrinsics.checkExpressionValueIsNotNull(I, "meeting.meetingData");
        I.mo212498e().mo212443a(this);
        kVar.ao().mo218458a(this.f155401x);
        AbstractC61222a aVar3 = this.f155403z;
        if (aVar3 instanceof SecuritySettingDialog) {
            aVar3.mo211609a(this);
        }
    }

    public SecuritySettingViewHolder(Activity activity, C61303k kVar, AbstractC61222a aVar, boolean z) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        Intrinsics.checkParameterIsNotNull(aVar, "dialog");
        this.f155402y = activity;
        this.f155392n = kVar;
        this.f155403z = aVar;
        this.f155393o = z;
    }
}
