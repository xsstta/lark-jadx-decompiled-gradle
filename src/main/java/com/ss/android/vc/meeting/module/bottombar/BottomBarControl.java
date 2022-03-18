package com.ss.android.vc.meeting.module.bottombar;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.bytedance.ee.util.C13612d;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.thread.C26171w;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.vc.VideoChatModule;
import com.ss.android.vc.common.lifecycle.VCAppLifeCycle;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60752f;
import com.ss.android.vc.common.p3083e.C60788y;
import com.ss.android.vc.common.permission.AbstractC60798c;
import com.ss.android.vc.common.permission.C60795b;
import com.ss.android.vc.common.utils.VCDialogUtils;
import com.ss.android.vc.dependency.IVideoChatDependency;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.InterpreterSetting;
import com.ss.android.vc.entity.LanguageType;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantSettings;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatCapabilities;
import com.ss.android.vc.entity.VideoChatSettings;
import com.ss.android.vc.entity.response.C60962ah;
import com.ss.android.vc.entity.response.C60987v;
import com.ss.android.vc.lark.guidetips.VideoChatGuideConstants;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.meeting.DisplayMode;
import com.ss.android.vc.meeting.model.C61373b;
import com.ss.android.vc.meeting.model.C61381c;
import com.ss.android.vc.meeting.model.C61383d;
import com.ss.android.vc.meeting.model.C61388g;
import com.ss.android.vc.meeting.model.LobbyData;
import com.ss.android.vc.meeting.model.MeetingSpecificData;
import com.ss.android.vc.meeting.module.audio.C61405a;
import com.ss.android.vc.meeting.module.audio.MeetingAudioManager;
import com.ss.android.vc.meeting.module.base.util.DataAdapterUtil;
import com.ss.android.vc.meeting.module.bottombar.AbstractC61444a;
import com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl;
import com.ss.android.vc.meeting.module.chat.C61584f;
import com.ss.android.vc.meeting.module.follow.AbstractC61751a;
import com.ss.android.vc.meeting.module.follow.share.desktop.C61831c;
import com.ss.android.vc.meeting.module.interpretation.p3127b.C61949d;
import com.ss.android.vc.meeting.module.interpretation.p3127b.C61956m;
import com.ss.android.vc.meeting.module.lobby.pb.VCLobbyParticipant;
import com.ss.android.vc.meeting.module.meetingdialog.labs.C62263l;
import com.ss.android.vc.meeting.module.meetingdialog.labs.C62264m;
import com.ss.android.vc.meeting.module.meetingdialog.labs.LabsUtils;
import com.ss.android.vc.meeting.module.meetingdialog.participantmanage.C62378o;
import com.ss.android.vc.meeting.module.meetingdialog.pstn.C62398c;
import com.ss.android.vc.meeting.module.meetingdialog.sip.C62439c;
import com.ss.android.vc.meeting.module.multi.gridcontent.AbsGridContentControl;
import com.ss.android.vc.meeting.module.p3148o.AbstractC62555a;
import com.ss.android.vc.meeting.module.p3148o.p3149a.C62591l;
import com.ss.android.vc.meeting.module.p3151p.AbstractC62612a;
import com.ss.android.vc.meeting.module.p3155q.AbstractC62782a;
import com.ss.android.vc.meeting.module.speakrequest.AbsSpeakRequestControl;
import com.ss.android.vc.meeting.module.subtitle.AbstractC63163j;
import com.ss.android.vc.meeting.module.subtitle.C63197s;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.net.service.VcBizService;
import com.ss.android.vc.statistics.event.C63732ac;
import com.ss.android.vc.statistics.event.C63738ah;
import com.ss.android.vc.statistics.event.C63742at;
import com.ss.android.vc.statistics.event.C63752c;
import com.ss.android.vc.statistics.event.C63763l;
import com.ss.android.vc.statistics.event.MeetingChargingEvent;
import com.ss.android.vc.statistics.event.bo;
import com.ss.android.vc.statistics.event.bv;
import com.ss.android.vc.statistics.event.ca;
import com.ss.android.vc.statistics.event2.InviteRoomEvent;
import com.ss.android.vc.statistics.event2.MeetingChatSendMsgEvent;
import com.ss.android.vc.statistics.event2.MeetingInterpretationEvent;
import com.ss.android.vc.statistics.event2.MeetingOnTheCallEvent2;
import com.ss.android.vc.statistics.event2.MeetingPhoneInviteEvent;
import com.ss.android.vc.statistics.event2.MeetingSettingEvent2;
import com.ss.android.vc.statistics.event2.MeetingShareWindowEvent;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010 \n\u0002\b\u0012\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u000f\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001bH\u0016J\u0010\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013H\u0016J\b\u0010 \u001a\u00020\u000eH\u0016J\u0018\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000eH\u0016J\u0018\u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000eH\u0016J\b\u0010&\u001a\u00020\u001dH\u0016J\b\u0010'\u001a\u00020\u001dH\u0016J\b\u0010(\u001a\u00020\u001dH\u0016J\b\u0010)\u001a\u00020\u001dH\u0002J\u0012\u0010*\u001a\u00020\u001d2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\n\u0010-\u001a\u0004\u0018\u00010.H\u0002J\b\u0010/\u001a\u000200H\u0002J\b\u00101\u001a\u000200H\u0002J\b\u00102\u001a\u0004\u0018\u00010\u0010J\u0012\u00103\u001a\u00020\u001d2\b\u00104\u001a\u0004\u0018\u00010.H\u0002J\b\u00105\u001a\u00020\u001dH\u0016J\b\u00106\u001a\u00020\u001dH\u0002J\b\u00107\u001a\u00020\u001dH\u0002J\b\u00108\u001a\u00020\u000eH\u0016J\b\u00109\u001a\u00020\u001dH\u0016J\b\u0010:\u001a\u00020\u001dH\u0016J \u0010;\u001a\u00020\u001d2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u000e2\u0006\u0010?\u001a\u00020\u000eH\u0016J\"\u0010@\u001a\u00020\u001d2\b\u0010<\u001a\u0004\u0018\u00010=2\u0006\u0010>\u001a\u00020\u000e2\u0006\u0010?\u001a\u00020\u000eH\u0016J\b\u0010A\u001a\u00020\u001dH\u0016J\u0012\u0010B\u001a\u00020\u001d2\b\u00104\u001a\u0004\u0018\u00010.H\u0016J\b\u0010C\u001a\u00020\u001dH\u0016J\u001a\u0010D\u001a\u00020\u001d2\u0006\u0010E\u001a\u00020F2\b\u0010G\u001a\u0004\u0018\u00010FH\u0016J\u0012\u0010H\u001a\u00020\u001d2\b\u00104\u001a\u0004\u0018\u00010.H\u0016J\b\u0010I\u001a\u00020\u001dH\u0016J\u0010\u0010J\u001a\u00020\u001d2\u0006\u0010K\u001a\u00020LH\u0016J\u0012\u0010M\u001a\u00020\u001d2\b\u00104\u001a\u0004\u0018\u00010.H\u0016J\u0012\u0010N\u001a\u00020\u001d2\b\u00104\u001a\u0004\u0018\u00010.H\u0016J\u000e\u0010O\u001a\u00020\u001d2\u0006\u0010P\u001a\u00020QJ\b\u0010R\u001a\u00020\u001dH\u0016J\u0010\u0010S\u001a\u00020\u001d2\u0006\u0010T\u001a\u00020\u000eH\u0016J\u0012\u0010U\u001a\u00020\u001d2\b\u00104\u001a\u0004\u0018\u00010.H\u0016J!\u0010V\u001a\u00020\u001d2\b\u0010W\u001a\u0004\u0018\u00010\u000e2\b\u0010X\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0002\u0010YJ\u0012\u0010Z\u001a\u00020\u001d2\b\u00104\u001a\u0004\u0018\u00010.H\u0016J\b\u0010[\u001a\u00020\u001dH\u0016J\b\u0010\\\u001a\u00020\u001dH\u0016J\b\u0010]\u001a\u00020\u001dH\u0016J\b\u0010^\u001a\u00020\u001dH\u0016J\u0012\u0010_\u001a\u00020\u001d2\b\u00104\u001a\u0004\u0018\u00010.H\u0016J\u001c\u0010`\u001a\u00020\u001d2\b\u0010a\u001a\u0004\u0018\u00010b2\b\u0010c\u001a\u0004\u0018\u00010bH\u0016J\u0012\u0010d\u001a\u00020\u001d2\b\u00104\u001a\u0004\u0018\u00010.H\u0016J\u0012\u0010e\u001a\u00020\u001d2\b\u00104\u001a\u0004\u0018\u00010.H\u0016J\u0010\u0010f\u001a\u00020\u001d2\u0006\u0010g\u001a\u00020\u000eH\u0016J\u001c\u0010h\u001a\u00020\u001d2\b\u0010i\u001a\u0004\u0018\u00010j2\b\u00104\u001a\u0004\u0018\u00010.H\u0016J \u0010k\u001a\u00020\u001d2\u0006\u0010E\u001a\u00020\n2\u0006\u0010G\u001a\u00020\n2\u0006\u0010l\u001a\u00020\nH\u0016J\b\u0010m\u001a\u00020\u001dH\u0002J\b\u0010n\u001a\u00020\u001dH\u0016J\u0010\u0010o\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001bH\u0016J\u0010\u0010p\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013H\u0016J\u0010\u0010q\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u000eH\u0002J\u0010\u0010r\u001a\u00020\u001d2\u0006\u0010s\u001a\u00020\u000eH\u0016J\u0010\u0010t\u001a\u00020\u001d2\u0006\u0010u\u001a\u00020\u000eH\u0016J\u0010\u0010v\u001a\u00020\u001d2\u0006\u0010w\u001a\u00020\u000eH\u0016J\b\u0010x\u001a\u00020\u001dH\u0002J\u0010\u0010y\u001a\u00020\u001d2\u0006\u0010z\u001a\u00020\u000eH\u0016J\u0010\u0010{\u001a\u00020\u001d2\u0006\u0010z\u001a\u00020\u000eH\u0016J\b\u0010|\u001a\u00020\u001dH\u0016J\u0016\u0010}\u001a\u00020\u001d2\f\u0010~\u001a\b\u0012\u0004\u0012\u00020b0H\u0002J\u0013\u0010\u0001\u001a\u00020\u001d2\b\u00104\u001a\u0004\u0018\u00010.H\u0002J\u0013\u0010\u0001\u001a\u00020\u001d2\b\u00104\u001a\u0004\u0018\u00010.H\u0002J\u0013\u0010\u0001\u001a\u00020\u001d2\b\u00104\u001a\u0004\u0018\u00010.H\u0002J\u0013\u0010\u0001\u001a\u00020\u001d2\b\u00104\u001a\u0004\u0018\u00010.H\u0002J\u0019\u0010\u0001\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000eH\u0002J\u0012\u0010\u0001\u001a\u00020\u001d2\u0007\u0010\u0001\u001a\u00020\nH\u0016J\u0019\u0010\u0001\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000eH\u0002J\t\u0010\u0001\u001a\u00020\u001dH\u0002J\u0012\u0010\u0001\u001a\u00020\u001d2\u0007\u0010\u0001\u001a\u00020\u000eH\u0016J\u0012\u0010\u0001\u001a\u00020\u001d2\u0007\u0010\u0001\u001a\u00020\nH\u0002J\u0012\u0010\u0001\u001a\u00020\u001d2\u0007\u0010\u0001\u001a\u00020\u000eH\u0002J\u0012\u0010\u0001\u001a\u00020\u001d2\u0007\u0010\u0001\u001a\u00020\u000eH\u0002J\u0012\u0010\u0001\u001a\u00020\u001d2\u0007\u0010\u0001\u001a\u00020\nH\u0016R\u000e\u0010\t\u001a\u00020\nXD¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fXD¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0001"}, d2 = {"Lcom/ss/android/vc/meeting/module/bottombar/BottomBarControl;", "Lcom/ss/android/vc/meeting/module/bottombar/AbsBottomBarControl;", "Lcom/ss/android/vc/meeting/module/audio/MeetingAudioManager$AudioStateChangedListener;", "Lcom/ss/android/vc/meeting/model/InMeetingInfoData$InMeetingInfoListener;", "Lcom/ss/android/vc/meeting/model/ParticipantData$ParticipantDataChange;", "Lcom/ss/android/vc/meeting/model/InMeetingChangeProcessor$InMeetingChangeListener;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "(Lcom/ss/android/vc/meeting/framework/meeting/Meeting;)V", "DEFAULT_MAX_PARTICIPANT_NUM", "", "TAG", "", "firstRouteIntercept", "", "labsDialog", "Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface;", "localMicCameraListeners", "", "Lcom/ss/android/vc/meeting/module/bottombar/ILocalMicCameraListener;", "mHasHandUpNotify", "mHasLobbyNotify", "maxParticipantNum", "participantHasNotify", "participantManageDialog", "viewControls", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/ss/android/vc/meeting/module/bottombar/AbsBottomBarControl$IBottomBarViewListener;", "addBottomBarViewListener", "", "listener", "addLocalMicCameraListener", "canUpdateMultiMeeting", "changeAudioMuteByUserClick", "isAudioMute", "requestByHost", "changeVideoMuteByUserClick", "isVideoMute", "collapseBottomBar", "disableViewAfterHangup", "dismissMicEchoDialog", "dismissPhotoPickerActivity", "doAfterOpenMicEchoDialog", "task", "Ljava/lang/Runnable;", "getActivity", "Landroid/app/Activity;", "getCameraStatus", "Lcom/ss/android/vc/entity/ParticipantSettings$EquipmentStatus;", "getMicrophoneStatus", "getParticipantManageDialog", "gotoSharePage", "mActivity", "initParticipantHasNotify", "initVideoChatSettings", "initView", "isBottomBarViewShowing", "onAskForHostHelpClicked", "onAudioMuted", "onAudioStateChanged", "lastType", "Lcom/ss/android/vc/meeting/module/audio/MeetingAudioManager$AudioType;", "lastOutSpeaker", "needTrack", "onAudioStateUnchanged", "onCameraBtnClicked", "onChatFunctionClicked", "onConfigurationChanged", "onDisplayModeChange", "src", "Lcom/ss/android/vc/meeting/framework/meeting/DisplayMode;", "dst", "onEffectFunctionClicked", "onHostTransfer", "onInMeetingInfoUpdate", "inMeetingInfo", "Lcom/ss/android/vc/entity/VideoChatInMeetingInfo;", "onInterpretationClicked", "onLiveFunctionClicked", "onMeetingUpgrade", ShareHitPoint.f121869d, "Lcom/ss/android/vc/entity/VideoChat$Type;", "onMicBtnClicked", "onOpenInterpretationChanged", "isOpen", "onPSTNFunctionClicked", "onPartiListNotifyChanged", "hasLobbyNotify", "hasHandUpNotify", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "onParticipantBtnClicked", "onPlaybackDigitalMute", "onReactionCollapse", "onReactionExpand", "onRecordFunctionClicked", "onSIPFunctionClicked", "onSelfParticipantRoleUpdate", "lastSelf", "Lcom/ss/android/vc/entity/Participant;", "currentSelf", "onSettingsClicked", "onShareBtnClicked", "onSpeakerIconClicked", "handled", "onSubtitleFunctionClicked", "anchor", "Landroid/view/View;", "onTransform", "event", "refreshHostControls", "refreshViews", "removeBottomBarViewListener", "removeLocalMicCameraListener", "sendVideoMuteStatisticEvent", "setBottomBarViewInvisible", "invisible", "setLocalAudioMuted", "isMuted", "setLocalVideoMuted", "isVideoMuted", "shareScreen", "showBottomBarView", "show", "showBottomOtherView", "showBreakoutRoomToolTip", "showLiveStreamGuideForMulti", "participants", "", "showParticipantManageDialog", "toOpenInterpretationSettingDialog", "toOpenSubtitle", "toSelectInterpretationDialog", "updateAudioState", "updateBreakoutRoomParticipantNum", "num", "updateCameraIcon", "updateLocalCameraAndMicForMulti", "updateParticipantNotify", "hasNotify", "updateParticipantNum", "updateShareText", "isSharing", "updateShareView", "updateUnreadCount", "unreadCount", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.bottombar.b */
public final class BottomBarControl extends AbstractC61444a implements C61373b.AbstractC61374a, C61381c.AbstractC61382a, C61388g.AbstractC61393a, MeetingAudioManager.AbstractC61403a {

    /* renamed from: a */
    public final String f154099a = "BottomBarControl";

    /* renamed from: b */
    public int f154100b = 6;

    /* renamed from: c */
    public boolean f154101c;

    /* renamed from: d */
    public boolean f154102d;

    /* renamed from: e */
    public CopyOnWriteArrayList<AbstractC61444a.AbstractC61445a> f154103e = new CopyOnWriteArrayList<>();

    /* renamed from: f */
    private final int f154104f = 6;

    /* renamed from: g */
    private List<ILocalMicCameraListener> f154105g = new LinkedList();

    /* renamed from: h */
    private boolean f154106h;

    /* renamed from: i */
    private AbstractC61222a f154107i;

    /* renamed from: j */
    private AbstractC61222a f154108j;

    /* renamed from: k */
    private boolean f154109k = true;

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "on", "", "onSubtitleOnOff"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.bottombar.b$i */
    public static final class C61456i implements AbstractC63163j {

        /* renamed from: a */
        public static final C61456i f154128a = new C61456i();

        C61456i() {
        }

        @Override // com.ss.android.vc.meeting.module.subtitle.AbstractC63163j
        public final void onSubtitleOnOff(boolean z) {
        }
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

    @Override // com.ss.android.vc.meeting.model.C61381c.AbstractC61382a
    /* renamed from: a */
    public /* synthetic */ void mo212486a(List list) {
        C61381c.AbstractC61382a.CC.$default$a(this, list);
    }

    @Override // com.ss.android.vc.meeting.model.C61381c.AbstractC61382a
    /* renamed from: a */
    public /* synthetic */ void mo212487a(boolean z) {
        C61381c.AbstractC61382a.CC.$default$a(this, z);
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

    @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
    public /* synthetic */ void i_(boolean z) {
        C61373b.AbstractC61374a.CC.$default$i_(this, z);
    }

    @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
    public /* synthetic */ void onOnlyPresenterCanAnnotateChanged(boolean z) {
        C61373b.AbstractC61374a.CC.$default$onOnlyPresenterCanAnnotateChanged(this, z);
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    public /* synthetic */ void onSelfRtcModeUpdate(Participant participant, Participant participant2) {
        C61388g.AbstractC61393a.CC.$default$onSelfRtcModeUpdate(this, participant, participant2);
    }

    @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
    public void bF_() {
        m239901u();
    }

    /* renamed from: q */
    public final AbstractC61222a mo213079q() {
        return this.f154108j;
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a
    /* renamed from: a */
    public boolean mo213012a() {
        T next;
        Iterator<T> it = this.f154103e.iterator();
        return it.hasNext() && (next = it.next()) != null && next.mo213068l();
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a
    /* renamed from: a */
    public void mo213011a(boolean z, boolean z2) {
        String str = this.f154099a;
        C60700b.m235851b(str, "[changeVideoMuteByUserClick]", "requestByHost = " + z2);
        if (C60788y.m236247a(mo213080r())) {
            mo213077d(z, z2);
            return;
        }
        boolean a = C60795b.m236297a((Object) mo213080r(), "android.permission.RECORD_AUDIO");
        C60788y.m236245a(VCAppLifeCycle.m236256c(), (AbstractC60798c) new C61448b(this, C60795b.m236297a((Object) mo213080r(), "android.permission.CAMERA"), z2, a));
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a
    /* renamed from: a */
    public void mo213010a(Runnable runnable) {
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        C61383d I = meeting.mo212091I();
        Intrinsics.checkExpressionValueIsNotNull(I, "meeting.meetingData");
        if (!I.mo212503j()) {
            C61303k meeting2 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
            if (meeting2.mo212092J().mo212510G()) {
                AbstractC61444a.AbstractC61445a aVar = (AbstractC61444a.AbstractC61445a) CollectionsKt.firstOrNull((List) this.f154103e);
                if (aVar != null) {
                    aVar.mo213048a(runnable);
                }
                C61303k meeting3 = getMeeting();
                Intrinsics.checkExpressionValueIsNotNull(meeting3, "meeting");
                C61383d I2 = meeting3.mo212091I();
                Intrinsics.checkExpressionValueIsNotNull(I2, "meeting.meetingData");
                I2.mo212495b(true);
                return;
            }
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.bottombar.b$j */
    public static final class RunnableC61457j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC61222a f154129a;

        RunnableC61457j(AbstractC61222a aVar) {
            this.f154129a = aVar;
        }

        public final void run() {
            this.f154129a.mo211606a();
        }
    }

    @Override // com.ss.android.vc.meeting.module.audio.MeetingAudioManager.AbstractC61403a
    public void onAudioMuted() {
        C60738ac.m236037c((int) R.string.View_MV_MutedNoTalk_Toast);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/vc/meeting/module/bottombar/BottomBarControl$updateBreakoutRoomParticipantNum$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.bottombar.b$k */
    public static final class RunnableC61458k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC61444a.AbstractC61445a f154130a;

        /* renamed from: b */
        final /* synthetic */ int f154131b;

        RunnableC61458k(AbstractC61444a.AbstractC61445a aVar, int i) {
            this.f154130a = aVar;
            this.f154131b = i;
        }

        public final void run() {
            AbstractC61444a.AbstractC61445a aVar = this.f154130a;
            if (aVar != null) {
                aVar.mo213046a(this.f154131b);
            }
        }
    }

    /* renamed from: A */
    private final ParticipantSettings.EquipmentStatus m239890A() {
        if (!C60788y.m236250b(ar.m236694a())) {
            return ParticipantSettings.EquipmentStatus.NO_PERMISSION;
        }
        return ParticipantSettings.EquipmentStatus.NORMAL;
    }

    /* renamed from: x */
    private final void m239904x() {
        VcBizSender.m249267e().mo219893b(new C61450d(this));
    }

    /* renamed from: z */
    private final ParticipantSettings.EquipmentStatus m239906z() {
        if (!C60788y.m236247a(ar.m236694a())) {
            return ParticipantSettings.EquipmentStatus.NO_PERMISSION;
        }
        return ParticipantSettings.EquipmentStatus.NORMAL;
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a
    /* renamed from: f */
    public void mo213029f() {
        AbstractC61444a.AbstractC61445a aVar = (AbstractC61444a.AbstractC61445a) CollectionsKt.firstOrNull((List) this.f154103e);
        if (aVar != null) {
            aVar.mo213073q();
        }
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a
    /* renamed from: n */
    public void mo213043n() {
        if (this.f154106h && isHostOrCoHost()) {
            mo213027e(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.bottombar.b$e */
    static final class RunnableC61451e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BottomBarControl f154121a;

        RunnableC61451e(BottomBarControl bVar) {
            this.f154121a = bVar;
        }

        public final void run() {
            for (T t : this.f154121a.f154103e) {
                if (t != null) {
                    t.mo213054d();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.bottombar.b$h */
    public static final class RunnableC61455h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BottomBarControl f154126a;

        /* renamed from: b */
        final /* synthetic */ AbstractC61222a f154127b;

        RunnableC61455h(BottomBarControl bVar, AbstractC61222a aVar) {
            this.f154126a = bVar;
            this.f154127b = aVar;
        }

        public final void run() {
            this.f154127b.mo211606a();
            MeetingInterpretationEvent.Companion aVar = MeetingInterpretationEvent.f160842a;
            C61303k meeting = this.f154126a.getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
            aVar.mo220294a(meeting);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/vc/meeting/module/bottombar/BottomBarControl$updateParticipantNum$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.bottombar.b$l */
    public static final class RunnableC61459l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC61444a.AbstractC61445a f154132a;

        /* renamed from: b */
        final /* synthetic */ int f154133b;

        /* renamed from: c */
        final /* synthetic */ Integer f154134c;

        RunnableC61459l(AbstractC61444a.AbstractC61445a aVar, int i, Integer num) {
            this.f154132a = aVar;
            this.f154133b = i;
            this.f154134c = num;
        }

        public final void run() {
            int i;
            AbstractC61444a.AbstractC61445a aVar = this.f154132a;
            if (aVar != null) {
                int i2 = this.f154133b;
                Integer num = this.f154134c;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 0;
                }
                aVar.mo213046a(i2 + i);
            }
        }
    }

    /* renamed from: v */
    private final void m239902v() {
        Activity c = VCAppLifeCycle.m236256c();
        if (VideoChatModuleDependency.getDependency().isPhotoPickActivity(c)) {
            c.finish();
        }
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a
    public void bA_() {
        for (T t : this.f154103e) {
            if (t != null) {
                t.mo213072p();
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a
    public void bz_() {
        for (T t : this.f154103e) {
            if (t != null) {
                t.mo213071o();
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a
    /* renamed from: d */
    public void mo213023d() {
        for (T t : this.f154103e) {
            if (t != null) {
                t.bW_();
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a
    /* renamed from: h */
    public void mo213037h() {
        for (T t : this.f154103e) {
            if (t != null) {
                t.mo213056e();
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a
    /* renamed from: m */
    public void mo213042m() {
        for (T t : this.f154103e) {
            if (t != null) {
                t.mo213069m();
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a
    /* renamed from: o */
    public void mo213044o() {
        for (T t : this.f154103e) {
            if (t != null) {
                t.mo213060g();
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a
    /* renamed from: p */
    public void mo213045p() {
        for (T t : this.f154103e) {
            if (t != null) {
                t.mo213063h();
            }
        }
        mo213081s();
    }

    /* renamed from: s */
    public void mo213081s() {
        AbstractC61222a aVar = this.f154107i;
        if (aVar != null && (aVar instanceof C62263l)) {
            if (aVar != null) {
                ((C62263l) aVar).mo215358l();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.vc.meeting.module.meetingdialog.labs.LabsDialog");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.bottombar.b$f */
    static final class RunnableC61452f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BottomBarControl f154122a;

        RunnableC61452f(BottomBarControl bVar) {
            this.f154122a = bVar;
        }

        public final void run() {
            boolean z;
            C61303k meeting = this.f154122a.getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
            AbstractC61444a ai2 = meeting.ai();
            if (this.f154122a.f154101c || this.f154122a.f154102d) {
                z = true;
            } else {
                z = false;
            }
            ai2.mo213027e(z);
        }
    }

    /* renamed from: u */
    private final void m239901u() {
        for (T t : this.f154103e) {
            if (t != null) {
                t.mo213065i();
            }
            if (t != null) {
                t.mo213067k();
            }
            if (t != null) {
                t.mo213070n();
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a
    /* renamed from: g */
    public void mo213033g() {
        C60700b.m235851b(this.f154099a, "[onCameraBtnClicked]", "onCameraBtnClicked");
        DataAdapterUtil aVar = DataAdapterUtil.f154006a;
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        boolean z = !aVar.mo212855c(meeting);
        mo213011a(z, false);
        m239893i(z);
        C63732ac.m249960a(getMeeting(), z);
        C61303k meeting2 = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
        MeetingOnTheCallEvent2.f160846b.mo220311a().mo220308a(!z, meeting2);
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a
    /* renamed from: j */
    public void mo213041j() {
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        meeting.al().mo213173c("toolbar_askforhelp");
        C61303k meeting2 = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
        C63752c.m250235a("clcik", "toolbar_askforhelp", meeting2.mo212056e());
    }

    /* renamed from: r */
    public final Activity mo213080r() {
        T t;
        Activity activity;
        boolean z;
        Iterator<T> it = this.f154103e.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            T t2 = t;
            if (t2 != null) {
                activity = t2.getActivity();
            } else {
                activity = null;
            }
            if (activity != null) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        T t3 = t;
        if (t3 != null) {
            return t3.getActivity();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.bottombar.b$c */
    public static final class RunnableC61449c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BottomBarControl f154118a;

        /* renamed from: b */
        final /* synthetic */ Activity f154119b;

        RunnableC61449c(BottomBarControl bVar, Activity activity) {
            this.f154118a = bVar;
            this.f154119b = activity;
        }

        public final void run() {
            C61831c.m241560a(this.f154119b, this.f154118a.getMeeting()).mo211606a();
            MeetingShareWindowEvent.Companion aVar = MeetingShareWindowEvent.f160861a;
            C61303k meeting = this.f154118a.getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
            aVar.mo220362a(meeting);
            C61303k meeting2 = this.f154118a.getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
            VideoChat e = meeting2.mo212056e();
            if (this.f154118a.getMeeting().f153550c == VideoChat.Type.CALL) {
                C63763l.m250311e(e);
            } else if (this.f154118a.getMeeting().f153550c == VideoChat.Type.MEET) {
                C63742at.m250108o(e);
            }
        }
    }

    /* renamed from: t */
    private final void m239900t() {
        C61383d I;
        C61388g b;
        List<Participant> f;
        AbsBreakoutRoomControl al;
        m239904x();
        C61303k meeting = getMeeting();
        if (meeting == null || (al = meeting.al()) == null || !al.mo213181h()) {
            C61303k meeting2 = getMeeting();
            if (meeting2 != null && (I = meeting2.mo212091I()) != null && (b = I.mo212494b()) != null && (f = b.mo212601f()) != null) {
                m239892c(f.size());
                return;
            }
            return;
        }
        C61303k meeting3 = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting3, "meeting");
        AbsBreakoutRoomControl al2 = meeting3.al();
        Intrinsics.checkExpressionValueIsNotNull(al2, "meeting.breakoutRoomControl");
        mo213004a(al2.mo213187n().size());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0025, code lost:
        if (r0.mo217363b() == false) goto L_0x0027;
     */
    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void by_() {
        /*
            r5 = this;
            boolean r0 = r5.isHost()
            java.lang.String r1 = "meeting.meetingControl.recordControl"
            java.lang.String r2 = "meeting.meetingControl"
            java.lang.String r3 = "meeting"
            if (r0 == 0) goto L_0x0027
            com.ss.android.vc.meeting.framework.meeting.k r0 = r5.getMeeting()
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r3)
            com.ss.android.vc.meeting.module.base.a r0 = r0.mo212105W()
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            com.ss.android.vc.meeting.module.record.a r0 = r0.mo212822a()
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            boolean r0 = r0.mo217363b()
            if (r0 != 0) goto L_0x004e
        L_0x0027:
            com.ss.android.vc.meeting.framework.meeting.k r0 = r5.getMeeting()
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r3)
            com.ss.android.vc.entity.VideoChat r0 = r0.mo212056e()
            com.ss.android.vc.meeting.framework.meeting.k r4 = r5.getMeeting()
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r3)
            com.ss.android.vc.meeting.module.base.a r4 = r4.mo212105W()
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r2)
            com.ss.android.vc.meeting.module.record.a r2 = r4.mo212822a()
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r1)
            boolean r1 = r2.mo217363b()
            com.ss.android.vc.statistics.event.ay.m250131b(r0, r1)
        L_0x004e:
            com.ss.android.vc.meeting.framework.meeting.k r0 = r5.getMeeting()
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r3)
            com.ss.android.vc.meeting.module.record.a r0 = r0.mo212106X()
            r1 = 0
            r0.mo217373a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.bottombar.BottomBarControl.by_():void");
    }

    /* renamed from: w */
    private final void m239903w() {
        VideoChatSettings.SubType subType;
        VideoChatSettings videoChatSettings;
        if (this.mMeeting != null && this.mMeeting.f153550c != null) {
            C61303k kVar = this.mMeeting;
            Intrinsics.checkExpressionValueIsNotNull(kVar, "mMeeting");
            VideoChat e = kVar.mo212056e();
            C61303k kVar2 = this.mMeeting;
            Intrinsics.checkExpressionValueIsNotNull(kVar2, "mMeeting");
            AbstractC62612a aj = kVar2.aj();
            Intrinsics.checkExpressionValueIsNotNull(aj, "mMeeting.shareScreenControl");
            if (aj.mo216408a()) {
                C61303k kVar3 = this.mMeeting;
                Intrinsics.checkExpressionValueIsNotNull(kVar3, "mMeeting");
                VideoChat e2 = kVar3.mo212056e();
                if (e2 == null || (videoChatSettings = e2.getVideoChatSettings()) == null) {
                    subType = null;
                } else {
                    subType = videoChatSettings.getSubType();
                }
                if (subType == VideoChatSettings.SubType.SCREEN_SHARE) {
                    C61303k meeting = getMeeting();
                    Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
                    meeting.ah().mo219482b();
                } else {
                    C61303k kVar4 = this.mMeeting;
                    Intrinsics.checkExpressionValueIsNotNull(kVar4, "mMeeting");
                    kVar4.aj().mo216414d();
                }
                if (this.mMeeting.f153550c == VideoChat.Type.CALL) {
                    C63763l.m250310d(e);
                } else if (this.mMeeting.f153550c == VideoChat.Type.MEET) {
                    C63742at.m250107n(e);
                }
            } else {
                C61303k kVar5 = this.mMeeting;
                Intrinsics.checkExpressionValueIsNotNull(kVar5, "mMeeting");
                kVar5.aj().mo216412c();
                if (this.mMeeting.f153550c == VideoChat.Type.CALL) {
                    C63763l.m250305b(e);
                } else if (this.mMeeting.f153550c == VideoChat.Type.MEET) {
                    C63742at.m250105l(e);
                }
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a
    /* renamed from: e */
    public void mo213025e() {
        VideoChat videoChat;
        C60700b.m235851b(this.f154099a, "[onMicBtnClicked]", "onMicBtnClicked");
        DataAdapterUtil aVar = DataAdapterUtil.f154006a;
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        boolean z = !aVar.mo212853b(meeting);
        C61303k meeting2 = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
        C60700b.m235841a(meeting2.mo212056e(), "UI", "RtcSDK", "muteAudio = " + z, this.f154099a, "[onClick] audio button = " + z);
        C61303k meeting3 = getMeeting();
        if (meeting3 != null) {
            videoChat = meeting3.mo212056e();
        } else {
            videoChat = null;
        }
        DataAdapterUtil aVar2 = DataAdapterUtil.f154006a;
        C61303k meeting4 = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting4, "meeting");
        C63742at.m250082b(z, videoChat, aVar2.mo212857d(meeting4));
        C61303k meeting5 = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting5, "meeting");
        MeetingOnTheCallEvent2.f160846b.mo220311a().mo220310b(!z, meeting5);
        mo213017b(z, false);
    }

    /* renamed from: y */
    private final void m239905y() {
        ParticipantSettings participantSettings;
        C61383d I;
        C61388g b;
        Participant j;
        C61303k meeting = getMeeting();
        if (meeting == null || (I = meeting.mo212091I()) == null || (b = I.mo212494b()) == null || (j = b.mo212605j()) == null) {
            participantSettings = null;
        } else {
            participantSettings = j.getParticipantSettings();
        }
        if (participantSettings != null) {
            if (participantSettings == null) {
                Intrinsics.throwNpe();
            }
            boolean isMicrophoneMuted = participantSettings.isMicrophoneMuted();
            boolean isCameraMuted = participantSettings.isCameraMuted();
            String str = this.f154099a;
            StringBuilder sb = new StringBuilder();
            sb.append("serverMicrophoneMuted : ");
            sb.append(isMicrophoneMuted);
            sb.append(",  ");
            sb.append("localMicMuted : ");
            C61303k meeting2 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
            sb.append(meeting2.mo212092J().mo212505B());
            sb.append("serverCameraMuted : ");
            sb.append(isCameraMuted);
            sb.append(",  ");
            sb.append("localCameraMuted : ");
            C61303k meeting3 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting3, "meeting");
            sb.append(meeting3.mo212092J().mo212504A());
            C60700b.m235851b(str, "[updateLocalCameraAndMicForMulti2]", sb.toString());
            C61303k meeting4 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting4, "meeting");
            if (isMicrophoneMuted != meeting4.mo212092J().mo212505B()) {
                DataAdapterUtil aVar = DataAdapterUtil.f154006a;
                C61303k meeting5 = getMeeting();
                Intrinsics.checkExpressionValueIsNotNull(meeting5, "meeting");
                aVar.mo212852b(meeting5, isMicrophoneMuted, false, true);
                mo213035g(isMicrophoneMuted);
            }
            if (isCameraMuted) {
                C61303k meeting6 = getMeeting();
                Intrinsics.checkExpressionValueIsNotNull(meeting6, "meeting");
                if (!meeting6.mo212092J().mo212504A()) {
                    DataAdapterUtil aVar2 = DataAdapterUtil.f154006a;
                    C61303k meeting7 = getMeeting();
                    Intrinsics.checkExpressionValueIsNotNull(meeting7, "meeting");
                    aVar2.mo212849a(meeting7, isCameraMuted, false, true);
                    mo213031f(isCameraMuted);
                    return;
                }
            }
            if (!isCameraMuted) {
                C61303k meeting8 = getMeeting();
                Intrinsics.checkExpressionValueIsNotNull(meeting8, "meeting");
                if (meeting8.mo212092J().mo212504A()) {
                    participantSettings.setCameraMuted(true);
                    C61303k meeting9 = getMeeting();
                    Intrinsics.checkExpressionValueIsNotNull(meeting9, "meeting");
                    VcBizService.changeOwnSetting(meeting9.mo212055d(), participantSettings, m239906z(), m239890A(), C60788y.m236247a(ar.m236694a()), C60788y.m236250b(ar.m236694a()));
                    return;
                }
                return;
            }
            return;
        }
        C60700b.m235851b(this.f154099a, "[updateLocalCameraAndMicForMulti]", "local settings is null.");
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a
    /* renamed from: b */
    public boolean mo213018b() {
        List<Participant> list;
        Participant c;
        VideoChatCapabilities capabilities;
        VideoChat e;
        C61303k meeting = getMeeting();
        if (meeting == null || (e = meeting.mo212056e()) == null) {
            list = null;
        } else {
            list = e.getParticipants();
        }
        if (C60752f.m236080a(list) || list.size() == 0 || (c = ParticipantUtil.m248731c(list)) == null || (capabilities = c.getCapabilities()) == null) {
            return false;
        }
        return capabilities.isUpdateMeeting();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/vc/meeting/module/bottombar/BottomBarControl$initVideoChatSettings$1", "Lcom/ss/android/vc/net/request/IVcGetDataCallback;", "Lcom/ss/android/vc/entity/response/PullPreVideoChatSettingEntity;", "onError", "", "error", "Lcom/ss/android/vc/net/request/VcErrorResult;", "onSuccess", "response", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.bottombar.b$d */
    public static final class C61450d implements AbstractC63598b<C60962ah> {

        /* renamed from: a */
        final /* synthetic */ BottomBarControl f154120a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C61450d(BottomBarControl bVar) {
            this.f154120a = bVar;
        }

        @Override // com.ss.android.vc.net.request.AbstractC63598b
        public void onError(C63602e eVar) {
            Intrinsics.checkParameterIsNotNull(eVar, "error");
            String str = this.f154120a.f154099a;
            C60700b.m235851b(str, "[initVideoChatSettings2]", "pullPreVideoChatSetting: " + eVar);
        }

        /* renamed from: a */
        public void onSuccess(C60962ah ahVar) {
            if (ahVar != null) {
                String str = this.f154120a.f154099a;
                StringBuilder sb = new StringBuilder();
                sb.append("max_participant_num = ");
                if (ahVar == null) {
                    Intrinsics.throwNpe();
                }
                sb.append(ahVar.f152644a);
                C60700b.m235851b(str, "[initVideoChatSettings]", sb.toString());
                this.f154120a.f154100b = ahVar.f152644a;
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a
    /* renamed from: b */
    public void mo213015b(AbstractC61444a.AbstractC61445a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f154103e.remove(aVar);
        this.f154107i = null;
    }

    /* renamed from: j */
    private final void m239894j(boolean z) {
        CopyOnWriteArrayList<AbstractC61444a.AbstractC61445a> copyOnWriteArrayList = this.f154103e;
        if (copyOnWriteArrayList != null) {
            for (T t : copyOnWriteArrayList) {
                if (t != null) {
                    t.mo213061g(z);
                }
            }
        }
    }

    /* renamed from: k */
    private final void m239895k(Activity activity) {
        C60735ab.m236002a(new RunnableC61457j(C61956m.m242064a(activity, getMeeting())), 200);
    }

    /* renamed from: l */
    private final void m239897l(Activity activity) {
        C60735ab.m236002a(new RunnableC61455h(this, C61949d.m242019a(activity, getMeeting(), true)), 200);
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a
    /* renamed from: a */
    public void mo213004a(int i) {
        Iterator<T> it = this.f154103e.iterator();
        while (it.hasNext()) {
            C26171w.m94675a(new RunnableC61458k(it.next(), i));
        }
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a
    /* renamed from: b */
    public void mo213013b(int i) {
        CopyOnWriteArrayList<AbstractC61444a.AbstractC61445a> copyOnWriteArrayList = this.f154103e;
        if (copyOnWriteArrayList != null) {
            for (T t : copyOnWriteArrayList) {
                if (t != null) {
                    t.mo213050b(i);
                }
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a
    /* renamed from: e */
    public void mo213027e(boolean z) {
        this.f154106h = z;
        for (T t : this.f154103e) {
            if (t != null) {
                t.mo213049a(z);
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a
    public void e_(boolean z) {
        for (T t : this.f154103e) {
            if (t != null) {
                t.mo213055d(z);
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a
    public void f_(boolean z) {
        for (T t : this.f154103e) {
            if (t != null) {
                t.mo213057e(z);
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a
    public void g_(boolean z) {
        for (T t : this.f154103e) {
            if (t != null) {
                t.mo213059f(z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "granted", "", "permissionGranted"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.bottombar.b$a */
    public static final class C61447a implements AbstractC60798c {

        /* renamed from: a */
        final /* synthetic */ BottomBarControl f154110a;

        /* renamed from: b */
        final /* synthetic */ boolean f154111b;

        /* renamed from: c */
        final /* synthetic */ boolean f154112c;

        /* renamed from: d */
        final /* synthetic */ boolean f154113d;

        C61447a(BottomBarControl bVar, boolean z, boolean z2, boolean z3) {
            this.f154110a = bVar;
            this.f154111b = z;
            this.f154112c = z2;
            this.f154113d = z3;
        }

        @Override // com.ss.android.vc.common.permission.AbstractC60798c
        public final void permissionGranted(boolean z) {
            boolean z2;
            if (z) {
                boolean z3 = true;
                if (!z || !this.f154111b) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                this.f154110a.mo213076c(z2, this.f154112c);
                if (!C60788y.m236247a(this.f154110a.mo213080r()) || !this.f154113d) {
                    z3 = false;
                }
                this.f154110a.mo213077d(z3, this.f154112c);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "granted", "", "permissionGranted"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.bottombar.b$b */
    public static final class C61448b implements AbstractC60798c {

        /* renamed from: a */
        final /* synthetic */ BottomBarControl f154114a;

        /* renamed from: b */
        final /* synthetic */ boolean f154115b;

        /* renamed from: c */
        final /* synthetic */ boolean f154116c;

        /* renamed from: d */
        final /* synthetic */ boolean f154117d;

        C61448b(BottomBarControl bVar, boolean z, boolean z2, boolean z3) {
            this.f154114a = bVar;
            this.f154115b = z;
            this.f154116c = z2;
            this.f154117d = z3;
        }

        @Override // com.ss.android.vc.common.permission.AbstractC60798c
        public final void permissionGranted(boolean z) {
            boolean z2;
            if (z) {
                boolean z3 = true;
                if (!z || !this.f154115b) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                this.f154114a.mo213077d(z2, this.f154116c);
                if (!C60788y.m236250b(this.f154114a.mo213080r()) || !this.f154117d) {
                    z3 = false;
                }
                this.f154114a.mo213076c(z3, this.f154116c);
            }
        }
    }

    /* renamed from: k */
    private final void m239896k(boolean z) {
        CopyOnWriteArrayList<AbstractC61444a.AbstractC61445a> copyOnWriteArrayList = this.f154103e;
        if (copyOnWriteArrayList != null) {
            Iterator<T> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().mo213064h(z);
            }
        }
    }

    /* renamed from: n */
    private final void m239899n(Activity activity) {
        VideoChat e;
        C61303k meeting = getMeeting();
        if (meeting != null && (e = meeting.mo212056e()) != null && activity != null) {
            VideoChatSettings videoChatSettings = e.getVideoChatSettings();
            if (videoChatSettings != null) {
                videoChatSettings.setMaxParticipantNum(this.f154100b);
            }
            AbstractC61222a a = C62378o.m243759a(activity, getMeeting());
            this.f154108j = a;
            if (a != null) {
                a.mo211606a();
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a
    /* renamed from: b */
    public void mo213016b(ILocalMicCameraListener eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "listener");
        this.f154105g.remove(eVar);
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a
    /* renamed from: c */
    public void mo213022c(Activity activity) {
        if (activity == null || getMeeting() == null) {
            C60700b.m235851b(this.f154099a, "[onChatFunctionClicked]", "activity or meeting is null");
            return;
        }
        C61584f.m240416a(activity, this.mMeeting).mo211606a();
        MeetingChatSendMsgEvent.Companion aVar = MeetingChatSendMsgEvent.f160836a;
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        aVar.mo220283a(meeting);
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a
    /* renamed from: d */
    public void mo213024d(Activity activity) {
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        meeting.am().mo214793a(null, activity);
    }

    @Override // com.ss.android.vc.meeting.model.C61381c.AbstractC61382a
    public void h_(boolean z) {
        VideoChatSettings videoChatSettings;
        if (z) {
            C61303k meeting = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
            VideoChat e = meeting.mo212056e();
            if (!(e == null || (videoChatSettings = e.getVideoChatSettings()) == null || !videoChatSettings.isMeetingOpenInterpretation())) {
                for (T t : this.f154103e) {
                    if (t != null) {
                        t.mo213047a(VideoChatGuideConstants.GuideType.LanguageInterpretation);
                    }
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/vc/meeting/module/bottombar/BottomBarControl$onSubtitleFunctionClicked$1", "Lcom/ss/android/vc/net/request/IVcGetDataCallback;", "Lcom/ss/android/vc/entity/response/GetSuiteQuotaEntity;", "onError", "", "error", "Lcom/ss/android/vc/net/request/VcErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.bottombar.b$g */
    public static final class C61453g implements AbstractC63598b<C60987v> {

        /* renamed from: a */
        final /* synthetic */ BottomBarControl f154123a;

        /* renamed from: b */
        final /* synthetic */ Activity f154124b;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.bottombar.b$g$a */
        public static final class DialogInterface$OnClickListenerC61454a implements DialogInterface.OnClickListener {

            /* renamed from: a */
            public static final DialogInterface$OnClickListenerC61454a f154125a = new DialogInterface$OnClickListenerC61454a();

            DialogInterface$OnClickListenerC61454a() {
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
            }
        }

        @Override // com.ss.android.vc.net.request.AbstractC63598b
        public void onError(C63602e eVar) {
        }

        /* renamed from: a */
        public void onSuccess(C60987v vVar) {
            if (vVar != null) {
                String str = this.f154123a.f154099a;
                C60700b.m235851b(str, "[onSubtitleFunctionClicked]", "GetSuiteQuotaEntity.subtitle : " + vVar.f152726d);
                if (vVar.f152726d) {
                    this.f154123a.mo213078j(this.f154124b);
                    return;
                }
                MeetingChargingEvent.m249932a(MeetingChargingEvent.Type.SUBTITLE, null);
                Activity activity = this.f154124b;
                if (activity != null) {
                    VCDialogUtils.m236181a((Context) activity, (int) R.string.View_G_UpgradePlanToExtendSubtitleLimit, (int) R.string.View_G_OkButton, (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC61454a.f154125a, false);
                    return;
                }
                return;
            }
            C60700b.m235851b(this.f154123a.f154099a, "[onSubtitleFunctionClicked2]", "GetSuiteQuotaEntity = null");
        }

        C61453g(BottomBarControl bVar, Activity activity) {
            this.f154123a = bVar;
            this.f154124b = activity;
        }
    }

    public BottomBarControl(C61303k kVar) {
        super(kVar);
        String str;
        C61383d I;
        C61381c a;
        StringBuilder sb = new StringBuilder();
        sb.append("meetingId: ");
        if (kVar != null) {
            str = kVar.mo212055d();
        } else {
            str = null;
        }
        sb.append(str);
        C60700b.m235851b("BottomBarControl", "[init]", sb.toString());
        MeetingAudioManager.m239471k().mo212685a(this);
        if (kVar != null && (I = kVar.mo212091I()) != null && (a = I.mo212490a()) != null) {
            a.mo212468a(this);
        }
    }

    /* renamed from: b */
    private final void m239891b(List<? extends Participant> list) {
        if (list != null) {
            int size = list.size();
            C61303k meeting = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
            if (meeting.mo212056e() != null) {
                C61303k meeting2 = getMeeting();
                Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
                VideoChat e = meeting2.mo212056e();
                Intrinsics.checkExpressionValueIsNotNull(e, "meeting.videoChat");
                if (e.getVideoChatSettings() != null) {
                    C61303k meeting3 = getMeeting();
                    Intrinsics.checkExpressionValueIsNotNull(meeting3, "meeting");
                    VideoChat e2 = meeting3.mo212056e();
                    Intrinsics.checkExpressionValueIsNotNull(e2, "meeting.videoChat");
                    VideoChatSettings videoChatSettings = e2.getVideoChatSettings();
                    Intrinsics.checkExpressionValueIsNotNull(videoChatSettings, "meeting.videoChat.videoChatSettings");
                    int maxParticipantNum = videoChatSettings.getMaxParticipantNum();
                    if (maxParticipantNum > 0 && size == ((int) (((double) maxParticipantNum) * 0.8d))) {
                        for (T t : this.f154103e) {
                            if (t != null) {
                                t.mo213047a(VideoChatGuideConstants.GuideType.Livestream);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: c */
    private final void m239892c(int i) {
        Integer num;
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        C61383d I = meeting.mo212091I();
        Intrinsics.checkExpressionValueIsNotNull(I, "meeting.meetingData");
        LobbyData d = I.mo212497d();
        Intrinsics.checkExpressionValueIsNotNull(d, "meeting.meetingData.lobbyData");
        List<VCLobbyParticipant> d2 = d.mo212422d();
        if (d2 != null) {
            num = Integer.valueOf(d2.size());
        } else {
            num = null;
        }
        Iterator<T> it = this.f154103e.iterator();
        while (it.hasNext()) {
            C26171w.m94675a(new RunnableC61459l(it.next(), i, num));
        }
    }

    /* renamed from: i */
    private final void m239893i(boolean z) {
        Boolean bool;
        MeetingSpecificData J;
        C61303k meeting = getMeeting();
        VideoChat videoChat = null;
        if (meeting == null || (J = meeting.mo212092J()) == null) {
            bool = null;
        } else {
            bool = Boolean.valueOf(J.mo212511H());
        }
        C61303k meeting2 = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
        if (meeting2.mo212057f() == VideoChat.Type.CALL) {
            C61303k meeting3 = getMeeting();
            if (meeting3 != null) {
                videoChat = meeting3.mo212056e();
            }
            C63763l.m250304a(z, videoChat, bool);
            return;
        }
        C61303k meeting4 = getMeeting();
        if (meeting4 != null) {
            videoChat = meeting4.mo212056e();
        }
        C63742at.m250073a(z, videoChat, bool);
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a
    /* renamed from: e */
    public void mo213026e(Activity activity) {
        if (getMeeting() == null) {
            C60700b.m235851b(this.f154099a, "[onEffectFunctionClicked]", "meeting is null");
            return;
        }
        LabsUtils.m242906b();
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        if (meeting.mo212056e() != null) {
            C63732ac.m249950a(getMeeting());
        }
        AbstractC61222a aVar = this.f154107i;
        if (aVar != null && (aVar instanceof C62263l)) {
            if (aVar == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.vc.meeting.module.meetingdialog.labs.LabsDialog");
            } else if (!(!Intrinsics.areEqual(((C62263l) aVar).bL_(), activity))) {
                AbstractC61222a aVar2 = this.f154107i;
                if (!(aVar2 instanceof C62263l)) {
                    aVar2 = null;
                }
                C62263l lVar = (C62263l) aVar2;
                if (lVar != null) {
                    lVar.mo215092k();
                    return;
                }
                return;
            }
        }
        AbstractC61222a a = C62264m.m243164a(activity, getMeeting());
        this.f154107i = a;
        if (a == null) {
            Intrinsics.throwNpe();
        }
        a.mo211606a();
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a
    /* renamed from: f */
    public void mo213030f(Activity activity) {
        String str;
        if (getMeeting() == null || getMeeting().f153550c == null) {
            C60700b.m235851b(this.f154099a, "[onPSTNFunctionClicked]", "meeting or type is null");
            return;
        }
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        VideoChat e = meeting.mo212056e();
        if (e != null) {
            if (e.getType() == VideoChat.Type.CALL) {
                str = "vc_call_page_onthecall";
            } else {
                str = "vc_meeting_page_onthecall";
            }
            bo.m250199a(str, e);
        }
        C62398c.m243874a(activity, getMeeting()).mo211606a();
        MeetingPhoneInviteEvent a = MeetingPhoneInviteEvent.f160852b.mo220314a();
        C61303k meeting2 = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
        a.mo220313a(meeting2.mo212056e());
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a
    /* renamed from: g */
    public void mo213034g(Activity activity) {
        String str;
        if (getMeeting() == null || getMeeting().f153550c == null) {
            C60700b.m235851b(this.f154099a, "[onSIPFunctionClicked]", "meeting or type is null");
            return;
        }
        InviteRoomEvent aVar = InviteRoomEvent.f160802a;
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        aVar.mo220221a(meeting);
        C61303k meeting2 = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
        VideoChat e = meeting2.mo212056e();
        if (e != null) {
            if (e.getType() == VideoChat.Type.CALL) {
                str = "vc_call_page_onthecall";
            } else {
                str = "vc_meeting_page_onthecall";
            }
            bv.m250219a(str, e);
        }
        C62439c.m244018a(activity, getMeeting()).mo211606a();
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a
    /* renamed from: h */
    public void mo213038h(Activity activity) {
        if (getMeeting() == null) {
            C60700b.m235851b(this.f154099a, "[onInterpretationClicked]", "meeting is null");
            return;
        }
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        C63742at.m250095f(meeting.mo212056e());
        C61303k meeting2 = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
        AbstractC62555a aa = meeting2.aa();
        Intrinsics.checkExpressionValueIsNotNull(aa, "meeting.settingMoreControl");
        if (aa.isHost()) {
            C61303k meeting3 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting3, "meeting");
            if (meeting3.mo212099Q()) {
                m239895k(activity);
            } else {
                m239897l(activity);
            }
        } else {
            m239895k(activity);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00cd, code lost:
        if (com.ss.android.vc.meeting.module.follow.common.C61806b.m241471a(r0.mo213882h()) == false) goto L_0x00cf;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m239898m(android.app.Activity r5) {
        /*
        // Method dump skipped, instructions count: 225
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.bottombar.BottomBarControl.m239898m(android.app.Activity):void");
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a
    /* renamed from: a */
    public void mo213005a(Activity activity) {
        C60700b.m235851b(this.f154099a, "[onShareBtnClicked]", "onShareBtnClicked");
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        AbstractC61751a ab = meeting.ab();
        Intrinsics.checkExpressionValueIsNotNull(ab, "meeting.followControl");
        if (!ab.mo213892r()) {
            C61303k meeting2 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
            if (!meeting2.aa().mo216287o()) {
                C61303k meeting3 = getMeeting();
                Intrinsics.checkExpressionValueIsNotNull(meeting3, "meeting");
                AbstractC62612a aj = meeting3.aj();
                Intrinsics.checkExpressionValueIsNotNull(aj, "meeting.shareScreenControl");
                if (aj.mo216415e()) {
                    C60700b.m235851b(this.f154099a, "[onShareBtnClicked3]", "shareScreen");
                    m239903w();
                } else {
                    C60700b.m235851b(this.f154099a, "[onShareBtnClicked4]", "don't go anywhere");
                }
                MeetingOnTheCallEvent2 a = MeetingOnTheCallEvent2.f160846b.mo220311a();
                C61303k meeting4 = getMeeting();
                Intrinsics.checkExpressionValueIsNotNull(meeting4, "meeting");
                MeetingOnTheCallEvent2.m249824a(a, meeting4, "share", "vc_meeting_sharewindow_view", null, null, null, 56, null);
            }
        }
        C60700b.m235851b(this.f154099a, "[onShareBtnClicked2]", "gotoSharePage");
        m239898m(activity);
        MeetingOnTheCallEvent2 a2 = MeetingOnTheCallEvent2.f160846b.mo220311a();
        C61303k meeting42 = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting42, "meeting");
        MeetingOnTheCallEvent2.m249824a(a2, meeting42, "share", "vc_meeting_sharewindow_view", null, null, null, 56, null);
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a
    /* renamed from: b */
    public void mo213014b(Activity activity) {
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        VideoChat videoChat = null;
        if (meeting.mo212057f() == VideoChat.Type.MEET) {
            C61303k meeting2 = getMeeting();
            if (meeting2 != null) {
                videoChat = meeting2.mo212056e();
            }
            C63742at.m250115v(videoChat);
            MeetingOnTheCallEvent2 a = MeetingOnTheCallEvent2.f160846b.mo220311a();
            C61303k meeting3 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting3, "meeting");
            MeetingOnTheCallEvent2.m249824a(a, meeting3, "userlist", null, null, null, null, 60, null);
        } else {
            C61303k meeting4 = getMeeting();
            if (meeting4 != null) {
                videoChat = meeting4.mo212056e();
            }
            C63763l.m250299a(videoChat);
        }
        C13612d.m55253a(activity);
        m239899n(activity);
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a
    /* renamed from: f */
    public void mo213031f(boolean z) {
        Participant participant;
        AbsGridContentControl aw;
        C61383d I;
        C61388g b;
        for (T t : this.f154103e) {
            if (t != null) {
                t.mo213051b(z);
            }
        }
        C61303k meeting = getMeeting();
        if (meeting == null || (I = meeting.mo212091I()) == null || (b = I.mo212494b()) == null) {
            participant = null;
        } else {
            participant = b.mo212605j();
        }
        if (participant != null) {
            ParticipantSettings participantSettings = participant.getParticipantSettings();
            if (participantSettings != null) {
                participantSettings.setCameraMuted(z);
            }
            C61303k meeting2 = getMeeting();
            if (!(meeting2 == null || (aw = meeting2.aw()) == null)) {
                String rtcJoinId = participant.getRtcJoinId();
                Intrinsics.checkExpressionValueIsNotNull(rtcJoinId, "it.rtcJoinId");
                aw.mo216143b(rtcJoinId);
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a
    /* renamed from: g */
    public void mo213035g(boolean z) {
        Participant participant;
        AbsGridContentControl aw;
        C61383d I;
        C61388g b;
        for (T t : this.f154103e) {
            if (t != null) {
                t.mo213053c(z);
            }
        }
        C61303k meeting = getMeeting();
        if (meeting == null || (I = meeting.mo212091I()) == null || (b = I.mo212494b()) == null) {
            participant = null;
        } else {
            participant = b.mo212605j();
        }
        if (participant != null) {
            ParticipantSettings participantSettings = participant.getParticipantSettings();
            if (participantSettings != null) {
                participantSettings.setMicrophoneMuted(z);
            }
            C61303k meeting2 = getMeeting();
            if (!(meeting2 == null || (aw = meeting2.aw()) == null)) {
                String rtcJoinId = participant.getRtcJoinId();
                Intrinsics.checkExpressionValueIsNotNull(rtcJoinId, "it.rtcJoinId");
                aw.mo216143b(rtcJoinId);
            }
        }
        for (ILocalMicCameraListener eVar : this.f154105g) {
            eVar.mo213137a(z);
        }
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a
    /* renamed from: h */
    public void mo213039h(boolean z) {
        VideoChat videoChat;
        C60700b.m235851b(this.f154099a, "[onSpeakerIconClicked]", String.valueOf(z));
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        AbstractC62782a af = meeting.af();
        Intrinsics.checkExpressionValueIsNotNull(af, "meeting.telephoneControl");
        if (!af.mo216827e()) {
            C61303k meeting2 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
            AbstractC62782a af2 = meeting2.af();
            Intrinsics.checkExpressionValueIsNotNull(af2, "meeting.telephoneControl");
            if (af2.mo216825c()) {
                C60738ac.m236037c((int) R.string.View_G_PhoneCallNoSpeaker);
                return;
            }
            return;
        }
        MeetingAudioManager k = MeetingAudioManager.m239471k();
        Intrinsics.checkExpressionValueIsNotNull(k, "MeetingAudioManager.getInstance()");
        MeetingAudioManager.AudioType y = k.mo212720y();
        MeetingAudioManager k2 = MeetingAudioManager.m239471k();
        Intrinsics.checkExpressionValueIsNotNull(k2, "MeetingAudioManager.getInstance()");
        boolean z2 = k2.mo212721z();
        C61303k meeting3 = getMeeting();
        String str = null;
        if (meeting3 != null) {
            videoChat = meeting3.mo212056e();
        } else {
            videoChat = null;
        }
        C63742at.m250069a(y, z2, videoChat);
        MeetingOnTheCallEvent2 a = MeetingOnTheCallEvent2.f160846b.mo220311a();
        MeetingAudioManager k3 = MeetingAudioManager.m239471k();
        Intrinsics.checkExpressionValueIsNotNull(k3, "MeetingAudioManager.getInstance()");
        MeetingAudioManager.AudioType y2 = k3.mo212720y();
        MeetingAudioManager k4 = MeetingAudioManager.m239471k();
        Intrinsics.checkExpressionValueIsNotNull(k4, "MeetingAudioManager.getInstance()");
        String a2 = C61405a.m239521a(y2, k4.mo212721z());
        Intrinsics.checkExpressionValueIsNotNull(a2, "AudioHelper.getAudioType…tInstance().isOutSpeaker)");
        C61303k meeting4 = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting4, "meeting");
        if (z) {
            str = "vc_meeting_loudspeaker_view";
        }
        a.mo220305a(a2, meeting4, str);
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a
    /* renamed from: i */
    public void mo213040i(Activity activity) {
        if (getMeeting() == null || getMeeting().f153550c == null) {
            C60700b.m235851b(this.f154099a, "[onSettingsClicked]", "meeting or type is null");
            return;
        }
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        C63742at.m250119z(meeting.mo212056e());
        C62591l.m244814a(activity, getMeeting()).mo211606a();
        MeetingSettingEvent2 a = MeetingSettingEvent2.f160860b.mo220361a();
        C61303k meeting2 = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
        a.mo220352a((String) null, meeting2.mo212056e(), (String) null, "main");
    }

    /* renamed from: j */
    public final void mo213078j(Activity activity) {
        if (this.mMeeting.f153550c == VideoChat.Type.CALL) {
            C61303k kVar = this.mMeeting;
            Intrinsics.checkExpressionValueIsNotNull(kVar, "mMeeting");
            C61303k kVar2 = this.mMeeting;
            Intrinsics.checkExpressionValueIsNotNull(kVar2, "mMeeting");
            C63763l.m250303a(!kVar.mo212107Y().mo218561b(), kVar2.mo212056e());
        } else if (this.mMeeting.f153550c == VideoChat.Type.MEET) {
            C61303k kVar3 = this.mMeeting;
            Intrinsics.checkExpressionValueIsNotNull(kVar3, "mMeeting");
            C61303k kVar4 = this.mMeeting;
            Intrinsics.checkExpressionValueIsNotNull(kVar4, "mMeeting");
            C63742at.m250091d(!kVar3.mo212107Y().mo218561b(), kVar4.mo212056e());
        }
        C61303k kVar5 = this.mMeeting;
        Intrinsics.checkExpressionValueIsNotNull(kVar5, "mMeeting");
        if (!kVar5.mo212107Y().mo218561b()) {
            C63197s.m247500a(activity, this.mMeeting, C61456i.f154128a);
        } else {
            C61303k kVar6 = this.mMeeting;
            Intrinsics.checkExpressionValueIsNotNull(kVar6, "mMeeting");
            VcBizSender.m249197a(kVar6.mo212055d(), false, (String) null, (String) null, (Boolean) null).mo219896d();
        }
        IVideoChatDependency dependency = VideoChatModule.getDependency();
        Intrinsics.checkExpressionValueIsNotNull(dependency, "VideoChatModule.getDependency()");
        dependency.getGuideDependency().completeGuide("all_vc_subtitles", true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b7, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8, com.ss.android.vc.dependency.VideoChatModuleDependency.m236629b()) != false) goto L_0x00bb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d4  */
    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61298f, com.ss.android.vc.meeting.model.C61381c.AbstractC61382a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onInMeetingInfoUpdate(com.ss.android.vc.entity.VideoChatInMeetingInfo r8) {
        /*
        // Method dump skipped, instructions count: 250
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.bottombar.BottomBarControl.onInMeetingInfoUpdate(com.ss.android.vc.entity.VideoChatInMeetingInfo):void");
    }

    /* renamed from: a */
    public final void mo213075a(VideoChat.Type type) {
        CopyOnWriteArrayList<AbstractC61444a.AbstractC61445a> copyOnWriteArrayList;
        Intrinsics.checkParameterIsNotNull(type, ShareHitPoint.f121869d);
        if (type == VideoChat.Type.MEET && (copyOnWriteArrayList = this.f154103e) != null) {
            for (T t : copyOnWriteArrayList) {
                if (t != null) {
                    t.mo213066j();
                }
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a
    /* renamed from: a */
    public void mo213007a(AbstractC61444a.AbstractC61445a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f154103e.add(aVar);
        m239900t();
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a
    /* renamed from: a */
    public void mo213008a(ILocalMicCameraListener eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "listener");
        if (!this.f154105g.contains(eVar)) {
            this.f154105g.add(eVar);
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61297e, com.ss.android.vc.meeting.module.base.AbstractC61420b
    public void onDisplayModeChange(DisplayMode displayMode, DisplayMode displayMode2) {
        Intrinsics.checkParameterIsNotNull(displayMode, "src");
        if (DisplayMode.WINDOW == displayMode) {
            m239902v();
        }
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a
    /* renamed from: a */
    public void mo213006a(View view, Activity activity) {
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        VcBizSender.m249303n(meeting.mo212055d()).mo219889a(new C61453g(this, activity));
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    /* renamed from: a */
    public void mo212620a(Participant participant, Participant participant2) {
        m239901u();
    }

    /* renamed from: c */
    public final void mo213076c(boolean z, boolean z2) {
        int i;
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        AbstractC62782a af = meeting.af();
        Intrinsics.checkExpressionValueIsNotNull(af, "meeting.telephoneControl");
        if (af.mo216825c()) {
            C60700b.m235851b(this.f154099a, "[onClick muteAudio]", "telephoneControl is off hook.");
            C60738ac.m236037c((int) R.string.View_G_PhoneCallNoMic);
            return;
        }
        String str = this.f154099a;
        C60700b.m235851b(str, "[updateAudioState]", "isAudioMute=" + z + ", requestByHost=" + z2);
        DataAdapterUtil aVar = DataAdapterUtil.f154006a;
        C61303k meeting2 = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
        boolean c = aVar.mo212856c(meeting2, z2);
        boolean z3 = true;
        if (c) {
            C61303k meeting3 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting3, "meeting");
            AbsSpeakRequestControl ao = meeting3.ao();
            C61303k meeting4 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting4, "meeting");
            if (meeting4.ao().mo218455a() == ParticipantSettings.HandsStatus.PUT_UP) {
                z3 = false;
            }
            ao.mo218461a(z3);
            C61303k meeting5 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting5, "meeting");
            ca.m250247d(meeting5.mo212056e());
            return;
        }
        DataAdapterUtil aVar2 = DataAdapterUtil.f154006a;
        C61303k meeting6 = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting6, "meeting");
        if (aVar2.mo212858d(meeting6, z2)) {
            C60738ac.m236037c((int) R.string.View_M_CanNotTurnOnMyMic);
            C61303k meeting7 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting7, "meeting");
            ca.m250241a(meeting7.mo212056e());
            return;
        }
        DataAdapterUtil aVar3 = DataAdapterUtil.f154006a;
        C61303k meeting8 = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting8, "meeting");
        aVar3.mo212852b(meeting8, z, true, z2);
        mo213035g(z);
        getMeeting().aF();
        if (z) {
            i = R.string.View_VM_MicOff;
        } else {
            i = R.string.View_VM_MicOn;
        }
        C60738ac.m236037c(i);
    }

    /* renamed from: d */
    public final void mo213077d(boolean z, boolean z2) {
        int i;
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        C60700b.m235841a(meeting.mo212056e(), "UI", "RtcSDK", "muteCamera = " + z, this.f154099a, "[onPermissionResult] isVideoMuted = " + z);
        C61303k meeting2 = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
        AbstractC62782a af = meeting2.af();
        Intrinsics.checkExpressionValueIsNotNull(af, "meeting.telephoneControl");
        if (af.mo216825c()) {
            C60738ac.m236037c((int) R.string.View_G_PhoneCallNoCamera);
            return;
        }
        DataAdapterUtil aVar = DataAdapterUtil.f154006a;
        C61303k meeting3 = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting3, "meeting");
        if (aVar.mo212851a(meeting3, z2)) {
            C60738ac.m236037c((int) R.string.View_M_RequestHostToTurnOnCam);
            C61303k meeting4 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting4, "meeting");
            ca.m250246c(meeting4.mo212056e());
            return;
        }
        DataAdapterUtil aVar2 = DataAdapterUtil.f154006a;
        C61303k meeting5 = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting5, "meeting");
        if (aVar2.mo212854b(meeting5, z2)) {
            C60738ac.m236037c((int) R.string.View_M_CanNotTurnOnMyCam);
            C61303k meeting6 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting6, "meeting");
            ca.m250245b(meeting6.mo212056e());
            return;
        }
        DataAdapterUtil aVar3 = DataAdapterUtil.f154006a;
        C61303k meeting7 = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting7, "meeting");
        aVar3.mo212849a(meeting7, z, true, z2);
        mo213031f(z);
        if (z) {
            i = R.string.View_VM_CameraOff;
        } else {
            i = R.string.View_VM_CameraOn;
        }
        C60738ac.m236037c(i);
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a
    /* renamed from: b */
    public void mo213017b(boolean z, boolean z2) {
        String str = this.f154099a;
        C60700b.m235851b(str, "[changeAudioMuteByUserClick]", "isAudioMute : " + z);
        if (C60788y.m236250b(mo213080r())) {
            mo213076c(z, z2);
            return;
        }
        C60788y.m236248b(VCAppLifeCycle.m236256c(), (AbstractC60798c) new C61447a(this, C60795b.m236297a((Object) mo213080r(), "android.permission.RECORD_AUDIO"), z2, C60795b.m236297a((Object) mo213080r(), "android.permission.CAMERA")));
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a
    /* renamed from: a */
    public void mo213009a(Boolean bool, Boolean bool2) {
        C61388g b;
        List<Participant> f;
        if (bool != null) {
            this.f154101c = bool.booleanValue();
        }
        if (bool2 != null) {
            this.f154102d = bool2.booleanValue();
        }
        C26171w.m94675a(new RunnableC61452f(this));
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        C61383d I = meeting.mo212091I();
        if (I != null && (b = I.mo212494b()) != null && (f = b.mo212601f()) != null) {
            m239892c(f.size());
        }
    }

    @Override // com.ss.android.vc.meeting.module.audio.MeetingAudioManager.AbstractC61403a
    public void onAudioStateUnchanged(MeetingAudioManager.AudioType audioType, boolean z, boolean z2) {
        VideoChat videoChat;
        if (z2) {
            C61303k meeting = getMeeting();
            if (meeting != null) {
                videoChat = meeting.mo212056e();
            } else {
                videoChat = null;
            }
            C63738ah.m250009a(audioType, z, videoChat);
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61302j, com.ss.android.vc.meeting.module.base.AbstractC61420b
    public void onTransform(int i, int i2, int i3) {
        if (i2 == 5) {
            m239902v();
            MeetingAudioManager.m239471k().mo212693b(this);
            this.f154103e.clear();
        }
    }

    @Override // com.ss.android.vc.meeting.module.audio.MeetingAudioManager.AbstractC61403a
    public void onAudioStateChanged(MeetingAudioManager.AudioType audioType, boolean z, boolean z2) {
        MeetingSpecificData J;
        VideoChat videoChat;
        Intrinsics.checkParameterIsNotNull(audioType, "lastType");
        MeetingAudioManager k = MeetingAudioManager.m239471k();
        Intrinsics.checkExpressionValueIsNotNull(k, "MeetingAudioManager.getInstance()");
        boolean z3 = k.mo212721z();
        MeetingAudioManager k2 = MeetingAudioManager.m239471k();
        Intrinsics.checkExpressionValueIsNotNull(k2, "MeetingAudioManager.getInstance()");
        MeetingAudioManager.AudioType y = k2.mo212720y();
        String str = this.f154099a;
        C60700b.m235851b(str, "[InMeetingBottomBarObserver]", "isOutSpeaker=" + z3 + ",type=" + y + ',' + "lastOutSpeaker=" + z + ",lastType=" + audioType);
        if (z2) {
            C61303k meeting = getMeeting();
            if (meeting != null) {
                videoChat = meeting.mo212056e();
            } else {
                videoChat = null;
            }
            C63738ah.m250010a(audioType, z, y, z3, videoChat);
        }
        C61303k meeting2 = getMeeting();
        if (meeting2 == null || (J = meeting2.mo212092J()) == null || !J.mo212510G() || y != MeetingAudioManager.AudioType.Default) {
            UICallbackExecutor.execute(new RunnableC61451e(this));
        } else {
            C60700b.m235851b(this.f154099a, "[InMeetingBottomBarObserver2]", "onAudioStateChanged intercept");
        }
    }
}
