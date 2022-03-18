package com.ss.android.vc.meeting.module.floatingwindow;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LiveData;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.thread.C26171w;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60740ad;
import com.ss.android.vc.common.p3083e.C60752f;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.common.p3083e.C60783v;
import com.ss.android.vc.common.p3083e.C60788y;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantSettings;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatInMeetingInfo;
import com.ss.android.vc.entity.follow.FollowInfo;
import com.ss.android.vc.irtc.AbstractC61025d;
import com.ss.android.vc.irtc.C61071u;
import com.ss.android.vc.irtc.VcByteStream;
import com.ss.android.vc.irtc.utils.C61074b;
import com.ss.android.vc.meeting.framework.meeting.ByteRtc;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.meeting.rtcstream.StreamManagerGlobal;
import com.ss.android.vc.meeting.framework.meeting.rtcstream.StreamSpec;
import com.ss.android.vc.meeting.model.C61381c;
import com.ss.android.vc.meeting.model.C61383d;
import com.ss.android.vc.meeting.model.C61388g;
import com.ss.android.vc.meeting.model.MeetingSpecificData;
import com.ss.android.vc.meeting.model.data.MeetingTimeData;
import com.ss.android.vc.meeting.module.audio.MeetingAudioManager;
import com.ss.android.vc.meeting.module.fastentry.AbstractC61660c;
import com.ss.android.vc.meeting.module.floatingwindow.IFloatWindowPresent;
import com.ss.android.vc.meeting.module.multi.ByteRTCMeetingActivity;
import com.ss.android.vc.meeting.module.p3117d.C61599a;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import com.ss.android.vc.net.service.VideoChatUser;
import com.ss.android.vc.service.C63634c;
import com.ss.android.vc.statistics.event.C63765n;
import com.ss.android.vc.statistics.event.bk;
import com.ss.android.vc.statistics.event.cc;
import com.ss.android.vc.statistics.p3180a.C63693e;
import com.ss.android.vcxp.annotation.XClass;
import com.ss.android.vcxp.annotation.XMethod;
import com.ss.android.vcxp.annotation.XProcess;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0002\u001a&\b\u0007\u0018\u0000 ¨\u00012\u00020\u0001:\u0002¨\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u00105\u001a\u000206H\u0007J\u0006\u00107\u001a\u000206J\u0006\u00108\u001a\u000206J\b\u00109\u001a\u000206H\u0007J.\u0010:\u001a\u0002062\b\u0010;\u001a\u0004\u0018\u00010<2\b\u0010=\u001a\u0004\u0018\u00010<2\b\u0010>\u001a\u0004\u0018\u00010<2\u0006\u0010?\u001a\u00020@H\u0002J\b\u0010A\u001a\u000206H\u0002J\n\u0010B\u001a\u0004\u0018\u00010)H\u0002J\b\u0010C\u001a\u00020DH\u0007J\u0006\u0010E\u001a\u000206J\b\u0010F\u001a\u000206H\u0007J\u0006\u0010G\u001a\u000206J\u0006\u0010H\u001a\u000206J\u0012\u0010I\u001a\u0002062\b\u0010J\u001a\u0004\u0018\u00010KH\u0007J\b\u0010L\u001a\u000206H\u0003J\u0006\u0010M\u001a\u000206J\b\u0010N\u001a\u00020\u001dH\u0007J\b\u0010O\u001a\u00020\u001dH\u0007J\u0006\u0010P\u001a\u00020\u001dJ\u000f\u0010Q\u001a\u0004\u0018\u00010\u001dH\u0003¢\u0006\u0002\u0010RJ\u0006\u0010S\u001a\u000206J\u0006\u0010T\u001a\u000206J \u0010U\u001a\u0002062\u0006\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020\u001d2\u0006\u0010Y\u001a\u00020\u001dH\u0016J \u0010Z\u001a\u0002062\u0006\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020\u001d2\u0006\u0010Y\u001a\u00020\u001dH\u0016J\b\u0010[\u001a\u000206H\u0007J\b\u0010\\\u001a\u000206H\u0016J\"\u0010]\u001a\u0002062\b\u0010^\u001a\u0004\u0018\u00010<2\u0006\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020`H\u0016J\"\u0010b\u001a\u0002062\b\u0010c\u001a\u0004\u0018\u00010<2\u0006\u0010d\u001a\u00020`2\u0006\u0010e\u001a\u00020`H\u0016J\u0010\u0010f\u001a\u0002062\u0006\u0010g\u001a\u00020hH\u0002J(\u0010i\u001a\u0002062\u0006\u0010j\u001a\u00020k2\u0006\u0010l\u001a\u00020k2\u0006\u0010m\u001a\u00020k2\u0006\u0010g\u001a\u00020hH\u0003J\u0010\u0010n\u001a\u0002062\u0006\u0010g\u001a\u00020hH\u0002J\b\u0010o\u001a\u000206H\u0016J\u0015\u0010p\u001a\u0002062\b\u0010q\u001a\u0004\u0018\u00010\u001d¢\u0006\u0002\u0010rJ\u0017\u0010s\u001a\u0002062\b\u0010q\u001a\u0004\u0018\u00010\u001dH\u0007¢\u0006\u0002\u0010rJ\u0015\u0010t\u001a\u0002062\b\u0010q\u001a\u0004\u0018\u00010\u001d¢\u0006\u0002\u0010rJ\u0015\u0010u\u001a\u0002062\b\u0010v\u001a\u0004\u0018\u00010\u001d¢\u0006\u0002\u0010rJ\u0017\u0010w\u001a\u0002062\b\u0010v\u001a\u0004\u0018\u00010\u001dH\u0007¢\u0006\u0002\u0010rJ\u0015\u0010x\u001a\u0002062\b\u0010v\u001a\u0004\u0018\u00010\u001d¢\u0006\u0002\u0010rJ\b\u0010y\u001a\u000206H\u0003J\u001c\u0010z\u001a\u0002062\b\u0010c\u001a\u0004\u0018\u00010<2\b\u0010{\u001a\u0004\u0018\u00010<H\u0016J\b\u0010|\u001a\u000206H\u0016J\u001c\u0010}\u001a\u0002062\b\u0010~\u001a\u0004\u0018\u000102\b\u0010{\u001a\u0004\u0018\u00010<H\u0016J\t\u0010\u0001\u001a\u000206H\u0002J\t\u0010\u0001\u001a\u000206H\u0003J\t\u0010\u0001\u001a\u000206H\u0002J\u0018\u0010\u0001\u001a\u0002062\u0006\u0010c\u001a\u00020<2\u0007\u0010\u0001\u001a\u00020\u001dJ\u001a\u0010\u0001\u001a\u0002062\u0006\u0010c\u001a\u00020<2\u0007\u0010\u0001\u001a\u00020\u001dH\u0007J\u0018\u0010\u0001\u001a\u0002062\u0006\u0010c\u001a\u00020<2\u0007\u0010\u0001\u001a\u00020\u001dJ\t\u0010\u0001\u001a\u000206H\u0002J\t\u0010\u0001\u001a\u000206H\u0002J\t\u0010\u0001\u001a\u000206H\u0007J\t\u0010\u0001\u001a\u000206H\u0003J\t\u0010\u0001\u001a\u000206H\u0003J\t\u0010\u0001\u001a\u000206H\u0002J\t\u0010\u0001\u001a\u000206H\u0003J\t\u0010\u0001\u001a\u000206H\u0003J\t\u0010\u0001\u001a\u000206H\u0002J\t\u0010\u0001\u001a\u000206H\u0002J\u0011\u0010\u0001\u001a\u0002062\b\u0010\u0001\u001a\u00030\u0001J\u0013\u0010\u0001\u001a\u0002062\b\u0010\u0001\u001a\u00030\u0001H\u0007J\u0011\u0010\u0001\u001a\u0002062\b\u0010\u0001\u001a\u00030\u0001J\u0007\u0010\u0001\u001a\u000206J\u0007\u0010\u0001\u001a\u000206J\u001c\u0010\u0001\u001a\u0002062\b\u0010^\u001a\u0004\u0018\u00010<2\u0007\u0010\u0001\u001a\u00020`H\u0016J\t\u0010\u0001\u001a\u000206H\u0002J\u0010\u0010\u0001\u001a\u0002062\u0007\u0010\u0001\u001a\u00020\u001dJ\u0010\u0010\u0001\u001a\u0002062\u0007\u0010\u0001\u001a\u00020\u001dJ\u0012\u0010\u0001\u001a\u0002062\u0007\u0010\u0001\u001a\u00020\u001dH\u0007J\u0010\u0010 \u0001\u001a\u0002062\u0007\u0010\u0001\u001a\u00020\u001dJ\t\u0010¡\u0001\u001a\u000206H\u0003J\u001c\u0010¢\u0001\u001a\u0002062\b\u0010£\u0001\u001a\u00030¤\u00012\u0007\u0010\u0001\u001a\u00020\u001dH\u0003J\t\u0010¥\u0001\u001a\u000206H\u0002J\t\u0010¦\u0001\u001a\u000206H\u0003J\t\u0010§\u0001\u001a\u000206H\u0003R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0010\u0010\u0019\u001a\u00020\u001aX\u0004¢\u0006\u0004\n\u0002\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u001dX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 R\u0012\u0010#\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u0004\n\u0002\u0010$R\u0010\u0010%\u001a\u00020&X\u0004¢\u0006\u0004\n\u0002\u0010'R\u001c\u0010(\u001a\u0004\u0018\u00010)X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u000e\u0010.\u001a\u00020\u001dX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010/\u001a\u00020\u001dX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001e\"\u0004\b1\u0010 R\u0014\u00102\u001a\b\u0012\u0004\u0012\u00020403X\u0004¢\u0006\u0002\n\u0000¨\u0006©\u0001"}, d2 = {"Lcom/ss/android/vc/meeting/module/floatingwindow/VideoChatFloatWindow;", "Lcom/ss/android/vc/meeting/module/floatingwindow/VCBaseFloatWindow;", "present", "Lcom/ss/android/vc/meeting/module/floatingwindow/IFloatWindowPresent;", "floatWindowType2", "Lcom/ss/android/vc/meeting/module/floatingwindow/IFloatWindowPresent$FloatWindowType;", "(Lcom/ss/android/vc/meeting/module/floatingwindow/IFloatWindowPresent;Lcom/ss/android/vc/meeting/module/floatingwindow/IFloatWindowPresent$FloatWindowType;)V", "bubbleFloatWindow", "Lcom/ss/android/vc/meeting/module/floatingwindow/IBubbleFloatWindowPresent;", "getBubbleFloatWindow", "()Lcom/ss/android/vc/meeting/module/floatingwindow/IBubbleFloatWindowPresent;", "setBubbleFloatWindow", "(Lcom/ss/android/vc/meeting/module/floatingwindow/IBubbleFloatWindowPresent;)V", "fastEntryWindow", "Lcom/ss/android/vc/meeting/module/fastentry/IFastEntryWindowPresent;", "getFastEntryWindow", "()Lcom/ss/android/vc/meeting/module/fastentry/IFastEntryWindowPresent;", "setFastEntryWindow", "(Lcom/ss/android/vc/meeting/module/fastentry/IFastEntryWindowPresent;)V", "frameCapturer", "Lcom/ss/android/vc/irtc/IFrameCapturer;", "getFrameCapturer", "()Lcom/ss/android/vc/irtc/IFrameCapturer;", "setFrameCapturer", "(Lcom/ss/android/vc/irtc/IFrameCapturer;)V", "isRtcInterruptedObserver", "com/ss/android/vc/meeting/module/floatingwindow/VideoChatFloatWindow$isRtcInterruptedObserver$1", "Lcom/ss/android/vc/meeting/module/floatingwindow/VideoChatFloatWindow$isRtcInterruptedObserver$1;", "isStatusHidden", "", "()Z", "setStatusHidden", "(Z)V", "isStatusTextSet", "setStatusTextSet", "lastRemoteVideoMuted", "Ljava/lang/Boolean;", "mMeetingDataListener", "com/ss/android/vc/meeting/module/floatingwindow/VideoChatFloatWindow$mMeetingDataListener$1", "Lcom/ss/android/vc/meeting/module/floatingwindow/VideoChatFloatWindow$mMeetingDataListener$1;", "mRenderView", "Landroid/view/View;", "getMRenderView", "()Landroid/view/View;", "setMRenderView", "(Landroid/view/View;)V", "mShowingRemoteUser", "shouldScheduleProcess", "getShouldScheduleProcess", "setShouldScheduleProcess", "timerObserver", "Landroidx/lifecycle/Observer;", "Lcom/ss/android/vc/meeting/model/data/MeetingTimeData;", "addListener", "", "backToActivity", "dismiss", "dismissInternal", "displayUserInfo", "userName", "", "userIconUrl", "userId", ShareHitPoint.f121869d, "Lcom/ss/android/vc/entity/ParticipantType;", "getFloatWindow", "getRenderView", "getVideoChat", "Lcom/ss/android/vc/entity/VideoChat;", "hideStatus", "hideStatusOnMain", "hideStatusOnVC", "hideView", "inMeetingInfoUpdate", "inMeetingInfo", "Lcom/ss/android/vc/entity/VideoChatInMeetingInfo;", "initDataObservers", "initFrameRenderOnMain", "isMuted", "isOnTheCall", "isRemoteUserCameraEnabled", "isRtcInterrupted", "()Ljava/lang/Boolean;", "meetingForeground", "meetingWakeUp", "onAudioStateChanged", "lastType", "Lcom/ss/android/vc/meeting/module/audio/MeetingAudioManager$AudioType;", "lastOutSpeaker", "needTrack", "onAudioStateUnchanged", "onClickInternal", "onDismiss", "onFirstRemoteScreenFrame", "rtcJoinId", "i", "", "i1", "onFirstRemoteVideoFrame", "uid", "width", "height", "onFrame", "vcVideoFrame", "Lcom/ss/android/vc/irtc/VcVideoFrame;", "onFrameOnMain", "y", "", "u", "v", "onFrameOnVC", "onInit", "onLivingChanged", "isLiving", "(Ljava/lang/Boolean;)V", "onLivingChangedOnMain", "onLivingChangedOnVC", "onRecordingChanged", "isRecording", "onRecordingChangedOnMain", "onRecordingChangedOnVC", "onRemoteMuteChange", "onScreenStreamAdd", "streamInfo", "onShow", "onStreamAdd", "stream", "Lcom/ss/android/vc/irtc/VcByteStream;", "onSurfaceMapChanged", "onSurfaceMapChangedOnMain", "onSurfaceMapChangedOnVC", "onUserMuteVideoAction", "muted", "onUserMuteVideoActionOnMain", "onUserMuteVideoActionOnVC", "playBubbleHideAnimation", "playBubbleShowAnimation", "release", "removeDataObservers", "removeLocal", "removeRemote", "removeRemoteOnMain", "removeRemoteOnVC", "returnMeetingFragment", "returnMeetingFragmentInternal", "setStatusText", "id", "Ljava/lang/Integer;", "setStatusTextOnMain", "setStatusTextOnVC", "setVideoView", "showMeetingFloatingWindow", "showRemotePoorNetQuality", "quality", "showRemoteSurfaceView", "showStaticFloatingWindow", "isCalling", "showSurface", "isShow", "showSurfaceOnMain", "showSurfaceOnVC", "subscribeFrame", "subscriberRemoteVideo", "participant", "Lcom/ss/android/vc/entity/Participant;", "tryPerformClick", "unsubscribeFrame", "updateRecAndLiveView", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
@XClass(runOnProcess = XProcess.VC)
public final class VideoChatFloatWindow extends VCBaseFloatWindow {

    /* renamed from: J */
    public static String f154851J = "VideoChatFloatWindow@";

    /* renamed from: K */
    public static final Companion f154852K = new Companion(null);

    /* renamed from: F */
    public boolean f154853F = true;

    /* renamed from: G */
    public final C61704f f154854G = new C61704f(this);

    /* renamed from: H */
    public final C61705g f154855H = new C61705g(this);

    /* renamed from: I */
    public final AbstractC1178x<MeetingTimeData> f154856I = new C61699ac(this);

    /* renamed from: L */
    private AbstractC61732e f154857L;

    /* renamed from: M */
    private AbstractC61660c f154858M;

    /* renamed from: N */
    private View f154859N;

    /* renamed from: O */
    private boolean f154860O;

    /* renamed from: P */
    private AbstractC61025d f154861P;

    /* renamed from: Q */
    private boolean f154862Q;

    /* renamed from: R */
    private boolean f154863R;

    /* renamed from: S */
    private Boolean f154864S;

    /* renamed from: T */
    private IFloatWindowPresent.FloatWindowType f154865T;

    @XMethod(isReleaseMethod = true)
    public final void release() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/vc/meeting/module/floatingwindow/VideoChatFloatWindow$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "setTAG", "(Ljava/lang/String;)V", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.floatingwindow.VideoChatFloatWindow$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final String mo213776a() {
            return VideoChatFloatWindow.f154851J;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @XMethod(runOnProcess = XProcess.Main)
    private final void onSurfaceMapChangedOnMain() {
        m240903N();
    }

    @XMethod(runOnProcess = XProcess.Main)
    private final void removeRemoteOnMain() {
        removeRemoteOnVC();
    }

    /* renamed from: B */
    public final void mo213726B() {
        mo213691n();
    }

    /* renamed from: d */
    public final AbstractC61732e mo213204d() {
        return this.f154857L;
    }

    /* renamed from: h */
    public final AbstractC61660c mo213751h() {
        return this.f154858M;
    }

    @XMethod(runOnProcess = XProcess.Main)
    public final void hideStatusOnMain() {
        mo213731G();
    }

    /* renamed from: i */
    public final View mo213753i() {
        return this.f154859N;
    }

    /* renamed from: o */
    public final boolean mo213692o() {
        return this.f154860O;
    }

    /* renamed from: p */
    public final AbstractC61025d mo213695p() {
        return this.f154861P;
    }

    /* renamed from: q */
    public final boolean mo213762q() {
        return this.f154862Q;
    }

    /* renamed from: r */
    public final boolean mo213763r() {
        return this.f154863R;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.floatingwindow.VideoChatFloatWindow$h */
    static final class RunnableC61706h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VideoChatFloatWindow f154877a;

        RunnableC61706h(VideoChatFloatWindow videoChatFloatWindow) {
            this.f154877a = videoChatFloatWindow;
        }

        public final void run() {
            this.f154877a.mo213728D();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.floatingwindow.VideoChatFloatWindow$s */
    public static final class RunnableC61717s implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VideoChatFloatWindow f154890a;

        RunnableC61717s(VideoChatFloatWindow videoChatFloatWindow) {
            this.f154890a = videoChatFloatWindow;
        }

        public final void run() {
            this.f154890a.mo213774y();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.floatingwindow.VideoChatFloatWindow$x */
    public static final class RunnableC61725x implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VideoChatFloatWindow f154900a;

        RunnableC61725x(VideoChatFloatWindow videoChatFloatWindow) {
            this.f154900a = videoChatFloatWindow;
        }

        public final void run() {
            this.f154900a.updateRecAndLiveView();
        }
    }

    @XMethod
    private final void unsubscribeFrame() {
        this.f154861P = null;
    }

    /* renamed from: y */
    public final void mo213774y() {
        m240899J();
        removeLocal();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.floatingwindow.VideoChatFloatWindow$b */
    public static final class RunnableC61700b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VideoChatFloatWindow f154871a;

        RunnableC61700b(VideoChatFloatWindow videoChatFloatWindow) {
            this.f154871a = videoChatFloatWindow;
        }

        public final void run() {
            TextView textView = this.f154871a.f154828k;
            Intrinsics.checkExpressionValueIsNotNull(textView, "mStatusTv");
            C60752f.m236083c(textView);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.floatingwindow.VideoChatFloatWindow$e */
    public static final class RunnableC61703e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VideoChatFloatWindow f154874a;

        RunnableC61703e(VideoChatFloatWindow videoChatFloatWindow) {
            this.f154874a = videoChatFloatWindow;
        }

        public final void run() {
            C61074b.m237509a(this.f154874a.mo213753i());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.floatingwindow.VideoChatFloatWindow$i */
    public static final class RunnableC61707i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VideoChatFloatWindow f154878a;

        RunnableC61707i(VideoChatFloatWindow videoChatFloatWindow) {
            this.f154878a = videoChatFloatWindow;
        }

        public final void run() {
            View view = this.f154878a.f154825h;
            Intrinsics.checkExpressionValueIsNotNull(view, "mAvatarContainer");
            view.setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.floatingwindow.VideoChatFloatWindow$j */
    public static final class RunnableC61708j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VideoChatFloatWindow f154879a;

        RunnableC61708j(VideoChatFloatWindow videoChatFloatWindow) {
            this.f154879a = videoChatFloatWindow;
        }

        public final void run() {
            ImageView imageView = this.f154879a.f154827j;
            Intrinsics.checkExpressionValueIsNotNull(imageView, "mCameraIcon");
            imageView.setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.floatingwindow.VideoChatFloatWindow$r */
    public static final class RunnableC61716r implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VideoChatFloatWindow f154889a;

        RunnableC61716r(VideoChatFloatWindow videoChatFloatWindow) {
            this.f154889a = videoChatFloatWindow;
        }

        public final void run() {
            C60740ad.m236044a(this.f154889a.mo213753i());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.floatingwindow.VideoChatFloatWindow$t */
    public static final class RunnableC61718t implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VideoChatFloatWindow f154891a;

        /* renamed from: b */
        final /* synthetic */ Integer f154892b;

        RunnableC61718t(VideoChatFloatWindow videoChatFloatWindow, Integer num) {
            this.f154891a = videoChatFloatWindow;
            this.f154892b = num;
        }

        public final void run() {
            this.f154891a.f154828k.setText(this.f154892b.intValue());
        }
    }

    /* renamed from: I */
    private final void m240898I() {
        C60735ab.m236001a(new RunnableC61720v(this, isRtcInterrupted()));
    }

    /* renamed from: J */
    private final void m240899J() {
        if (this.f154860O) {
            removeRemoteOnMain();
        } else {
            removeRemoteOnVC();
        }
    }

    @XMethod
    private final void initDataObservers() {
        C60735ab.m236001a(new RunnableC61702d(this));
    }

    @XMethod
    private final void removeDataObservers() {
        C60735ab.m236001a(new RunnableC61714p(this));
    }

    @XMethod
    private final void removeLocal() {
        C60735ab.m236001a(new RunnableC61715q(this));
    }

    @XMethod
    private final void removeRemoteOnVC() {
        C60735ab.m236001a(new RunnableC61716r(this));
    }

    /* renamed from: A */
    public final void mo213725A() {
        C60700b.m235851b(f154851J, "[meetingWakeUp]", "meetingWakeUp");
        m240902M();
    }

    /* renamed from: D */
    public final void mo213728D() {
        if (this.f154860O) {
            onSurfaceMapChangedOnMain();
        } else {
            m240903N();
        }
    }

    /* renamed from: F */
    public final void mo213730F() {
        if (this.f154860O) {
            hideStatusOnMain();
        } else {
            mo213731G();
        }
    }

    /* renamed from: G */
    public final void mo213731G() {
        C60735ab.m236001a(new RunnableC61700b(this));
    }

    @XMethod
    public final boolean isOnTheCall() {
        C61303k e = mo213813e();
        Intrinsics.checkExpressionValueIsNotNull(e, "meeting");
        return e.mo212065n();
    }

    @Override // com.ss.android.vc.meeting.module.floatingwindow.AbstractC61729b, com.ss.android.vc.meeting.module.floatingwindow.AbstractC61734g
    /* renamed from: l */
    public void mo213667l() {
        C60700b.m235851b(f154851J, "[onInit]", "onInit");
        initDataObservers();
    }

    @Override // com.ss.android.vc.meeting.module.floatingwindow.AbstractC61729b
    /* renamed from: m */
    public void mo213690m() {
        C60700b.m235851b(f154851J, "[onShow]", "onShow");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.floatingwindow.VideoChatFloatWindow$ab */
    public static final class RunnableC61698ab implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VideoChatFloatWindow f154867a;

        /* renamed from: b */
        final /* synthetic */ VcByteStream f154868b;

        /* renamed from: c */
        final /* synthetic */ boolean f154869c;

        RunnableC61698ab(VideoChatFloatWindow videoChatFloatWindow, VcByteStream vcByteStream, boolean z) {
            this.f154867a = videoChatFloatWindow;
            this.f154868b = vcByteStream;
            this.f154869c = z;
        }

        public final void run() {
            C61303k e = this.f154867a.mo213813e();
            Intrinsics.checkExpressionValueIsNotNull(e, "meeting");
            e.mo212102T().mo212214a(this.f154868b, StreamSpec.Scene.GLOBAL_FLOAT_WINDOW, StreamSpec.Resolution.FLOAT_WINDOW, this.f154869c);
        }
    }

    /* renamed from: N */
    private final void m240903N() {
        View z = mo213775z();
        C61074b.m237510a(z, (float) C60773o.m236115a(4.0d));
        C61074b.m237511a(z, C60773o.m236126d(R.color.vc_bg_float_video));
        m240898I();
    }

    @XMethod
    private final Boolean isRtcInterrupted() {
        MeetingSpecificData J;
        LiveData<Boolean> y;
        C61303k e = mo213813e();
        if (e == null || (J = e.mo212092J()) == null || (y = J.mo212575y()) == null) {
            return null;
        }
        return y.mo5927b();
    }

    @XMethod
    public final void addListener() {
        MeetingAudioManager.m239471k().mo212685a(this);
        C61303k e = mo213813e();
        Intrinsics.checkExpressionValueIsNotNull(e, "meeting");
        e.an().mo214602a(this);
    }

    @XMethod
    public final VideoChat getVideoChat() {
        C61303k e = mo213813e();
        Intrinsics.checkExpressionValueIsNotNull(e, "meeting");
        VideoChat e2 = e.mo212056e();
        Intrinsics.checkExpressionValueIsNotNull(e2, "meeting.videoChat");
        return e2;
    }

    @XMethod
    public final boolean isMuted() {
        C61303k e = mo213813e();
        Intrinsics.checkExpressionValueIsNotNull(e, "meeting");
        return e.mo212092J().mo212507D();
    }

    /* renamed from: z */
    public final View mo213775z() {
        if (this.f154859N == null) {
            C61303k e = mo213813e();
            Intrinsics.checkExpressionValueIsNotNull(e, "meeting");
            this.f154859N = e.mo212165y().mo211988a(false);
        }
        return this.f154859N;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.floatingwindow.VideoChatFloatWindow$k */
    public static final class RunnableC61709k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VideoChatFloatWindow f154880a;

        /* renamed from: b */
        final /* synthetic */ Boolean f154881b;

        RunnableC61709k(VideoChatFloatWindow videoChatFloatWindow, Boolean bool) {
            this.f154880a = videoChatFloatWindow;
            this.f154881b = bool;
        }

        public final void run() {
            if (Intrinsics.areEqual((Object) this.f154881b, (Object) true)) {
                TextView textView = this.f154880a.f154831n;
                Intrinsics.checkExpressionValueIsNotNull(textView, "mLiveView");
                textView.setVisibility(0);
                return;
            }
            TextView textView2 = this.f154880a.f154831n;
            Intrinsics.checkExpressionValueIsNotNull(textView2, "mLiveView");
            textView2.setVisibility(4);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.floatingwindow.VideoChatFloatWindow$l */
    public static final class RunnableC61710l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VideoChatFloatWindow f154882a;

        /* renamed from: b */
        final /* synthetic */ Boolean f154883b;

        RunnableC61710l(VideoChatFloatWindow videoChatFloatWindow, Boolean bool) {
            this.f154882a = videoChatFloatWindow;
            this.f154883b = bool;
        }

        public final void run() {
            if (Intrinsics.areEqual((Object) this.f154883b, (Object) true)) {
                View view = this.f154882a.f154832o;
                Intrinsics.checkExpressionValueIsNotNull(view, "mRecView");
                view.setVisibility(0);
                this.f154882a.f154833p.mo217344a();
                return;
            }
            View view2 = this.f154882a.f154832o;
            Intrinsics.checkExpressionValueIsNotNull(view2, "mRecView");
            view2.setVisibility(4);
            this.f154882a.f154833p.mo217346b();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.floatingwindow.VideoChatFloatWindow$q */
    public static final class RunnableC61715q implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VideoChatFloatWindow f154888a;

        RunnableC61715q(VideoChatFloatWindow videoChatFloatWindow) {
            this.f154888a = videoChatFloatWindow;
        }

        public final void run() {
            C61303k e = this.f154888a.mo213813e();
            Intrinsics.checkExpressionValueIsNotNull(e, "meeting");
            e.mo212102T().mo212222c();
            ByteRTCMeetingActivity.Companion aVar = ByteRTCMeetingActivity.f157054h;
            C61303k e2 = this.f154888a.mo213813e();
            Intrinsics.checkExpressionValueIsNotNull(e2, "meeting");
            aVar.mo215867a(e2);
        }
    }

    /* renamed from: H */
    private final void m240897H() {
        if (this.f154865T == IFloatWindowPresent.FloatWindowType.BUBBLE) {
            IFloatWindowPresent iFloatWindowPresent = this.f154904a;
            if (iFloatWindowPresent != null) {
                this.f154857L = (AbstractC61732e) iFloatWindowPresent;
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.vc.meeting.module.floatingwindow.IBubbleFloatWindowPresent");
        } else if (this.f154865T == IFloatWindowPresent.FloatWindowType.FAST_ENTRY) {
            IFloatWindowPresent iFloatWindowPresent2 = this.f154904a;
            if (iFloatWindowPresent2 != null) {
                this.f154858M = (AbstractC61660c) iFloatWindowPresent2;
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.vc.meeting.module.fastentry.IFastEntryWindowPresent");
        }
    }

    /* renamed from: L */
    private final void m240901L() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f154906c, "translationX", 0.0f, (float) UIHelper.getDimens(R.dimen.fv_width));
        Intrinsics.checkExpressionValueIsNotNull(ofFloat, "animOut");
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(new AccelerateInterpolator());
        ofFloat.addListener(new C61711m(this));
        ofFloat.start();
    }

    /* renamed from: C */
    public final void mo213727C() {
        AbstractC61660c cVar;
        C60700b.m235851b(f154851J, "[dismiss]", "dismiss");
        dismissInternal();
        if (this.f154905b == IFloatWindowPresent.FloatWindowType.BUBBLE) {
            AbstractC61732e eVar = this.f154857L;
            if (eVar != null) {
                eVar.mo213677s();
            }
        } else if (this.f154905b == IFloatWindowPresent.FloatWindowType.FAST_ENTRY && (cVar = this.f154858M) != null) {
            cVar.dismissFastEntry();
        }
    }

    @XMethod
    public final void dismissInternal() {
        MeetingAudioManager.m239471k().mo212693b(this);
        C61303k e = mo213813e();
        Intrinsics.checkExpressionValueIsNotNull(e, "meeting");
        e.an().mo214605b(this);
        C61303k e2 = mo213813e();
        Intrinsics.checkExpressionValueIsNotNull(e2, "meeting");
        e2.an().mo214604a(false);
    }

    @Override // com.ss.android.vc.meeting.module.floatingwindow.AbstractC61729b, com.ss.android.vc.meeting.module.floatingwindow.VCBaseFloatWindow
    /* renamed from: n */
    public void mo213691n() {
        super.mo213691n();
        C60700b.m235851b(f154851J, "[onDismiss]", "dismiss");
        removeDataObservers();
        if (this.f154860O && this.f154859N != null) {
            unsubscribeFrame();
            C61074b.m237513b(this.f154859N);
            this.f154859N = null;
        }
        if (this.f154859N != null) {
            C61303k e = mo213813e();
            Intrinsics.checkExpressionValueIsNotNull(e, "meeting");
            ByteRtc y = e.mo212165y();
            if (y != null) {
                y.mo211992a(this.f154859N);
            }
        }
    }

    /* renamed from: s */
    public final void mo213765s() {
        IFloatWindowPresent iFloatWindowPresent = this.f154904a;
        Intrinsics.checkExpressionValueIsNotNull(iFloatWindowPresent, "mPresent");
        C61303k m = iFloatWindowPresent.mo213668m();
        Intrinsics.checkExpressionValueIsNotNull(m, "mPresent.vcMeeting");
        this.f154859N = m.mo212165y().mo211988a(false);
        C60735ab.m236001a(new RunnableC61703e(this));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.floatingwindow.VideoChatFloatWindow$n */
    public static final class RunnableC61712n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VideoChatFloatWindow f154885a;

        RunnableC61712n(VideoChatFloatWindow videoChatFloatWindow) {
            this.f154885a = videoChatFloatWindow;
        }

        public final void run() {
            String a = VideoChatFloatWindow.f154852K.mo213776a();
            C60700b.m235851b(a, "[playBubbleShowAnimation2]", "bubble showFloat, " + this.f154885a.f154815C);
            AbstractC61732e d = this.f154885a.mo213204d();
            if (d != null) {
                d.mo213676r();
            }
            if (this.f154885a.f154906c == null) {
                return;
            }
            if (this.f154885a.f154815C) {
                ViewGroup viewGroup = this.f154885a.f154906c;
                Intrinsics.checkExpressionValueIsNotNull(viewGroup, "contentView");
                viewGroup.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                return;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f154885a.f154906c, "translationX", (float) UIHelper.getDimens(R.dimen.fv_width), 0.0f);
            Intrinsics.checkExpressionValueIsNotNull(ofFloat, "animIn");
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(new AccelerateInterpolator());
            ofFloat.start();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.floatingwindow.VideoChatFloatWindow$o */
    public static final class RunnableC61713o implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VideoChatFloatWindow f154886a;

        RunnableC61713o(VideoChatFloatWindow videoChatFloatWindow) {
            this.f154886a = videoChatFloatWindow;
        }

        public final void run() {
            String a = VideoChatFloatWindow.f154852K.mo213776a();
            C60700b.m235851b(a, "[playBubbleShowAnimation3]", "fast entry showFloat, " + this.f154886a.f154815C);
            AbstractC61660c h = this.f154886a.mo213751h();
            if (h != null) {
                h.showFastEntry();
            }
            if (this.f154886a.f154906c != null) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f154886a.f154906c, "translationX", (float) UIHelper.getDimens(R.dimen.fv_width), 0.0f);
                Intrinsics.checkExpressionValueIsNotNull(ofFloat, "animIn");
                ofFloat.setDuration(200L);
                ofFloat.setInterpolator(new AccelerateInterpolator());
                ofFloat.start();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.floatingwindow.VideoChatFloatWindow$y */
    public static final class RunnableC61726y implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VideoChatFloatWindow f154901a;

        /* renamed from: b */
        final /* synthetic */ boolean f154902b;

        RunnableC61726y(VideoChatFloatWindow videoChatFloatWindow, boolean z) {
            this.f154901a = videoChatFloatWindow;
            this.f154902b = z;
        }

        public final void run() {
            if (this.f154902b) {
                FrameLayout frameLayout = this.f154901a.f154823f;
                Intrinsics.checkExpressionValueIsNotNull(frameLayout, "mSurfaceContainer");
                C60752f.m236079a((View) frameLayout);
                return;
            }
            if (this.f154901a.mo213729E()) {
                View view = this.f154901a.f154825h;
                Intrinsics.checkExpressionValueIsNotNull(view, "mAvatarContainer");
                C60752f.m236079a(view);
            } else {
                ImageView imageView = this.f154901a.f154827j;
                Intrinsics.checkExpressionValueIsNotNull(imageView, "mCameraIcon");
                C60752f.m236079a((View) imageView);
            }
            FrameLayout frameLayout2 = this.f154901a.f154823f;
            Intrinsics.checkExpressionValueIsNotNull(frameLayout2, "mSurfaceContainer");
            C60752f.m236083c(frameLayout2);
        }
    }

    /* renamed from: K */
    private final void m240900K() {
        C60700b.m235851b(f154851J, "[playBubbleShowAnimation]", String.valueOf(this.f154815C));
        Boolean bool = null;
        if (this.f154905b == IFloatWindowPresent.FloatWindowType.BUBBLE) {
            AbstractC61732e eVar = this.f154857L;
            if (eVar != null) {
                bool = Boolean.valueOf(eVar.mo213675q());
            }
            if (bool == null) {
                Intrinsics.throwNpe();
            }
            if (!bool.booleanValue()) {
                new Handler(Looper.getMainLooper()).postDelayed(new RunnableC61712n(this), 300);
            }
        } else if (this.f154905b == IFloatWindowPresent.FloatWindowType.FAST_ENTRY) {
            AbstractC61660c cVar = this.f154858M;
            if (cVar != null) {
                bool = Boolean.valueOf(cVar.isFastEntryShown());
            }
            if (bool == null) {
                Intrinsics.throwNpe();
            }
            if (!bool.booleanValue()) {
                new Handler(Looper.getMainLooper()).postDelayed(new RunnableC61713o(this), 300);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        if (r0.booleanValue() == false) goto L_0x0020;
     */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m240902M() {
        /*
            r3 = this;
            com.ss.android.vc.meeting.module.floatingwindow.IFloatWindowPresent$FloatWindowType r0 = r3.f154905b
            com.ss.android.vc.meeting.module.floatingwindow.IFloatWindowPresent$FloatWindowType r1 = com.ss.android.vc.meeting.module.floatingwindow.IFloatWindowPresent.FloatWindowType.BUBBLE
            r2 = 0
            if (r0 != r1) goto L_0x0020
            com.ss.android.vc.meeting.module.floatingwindow.e r0 = r3.f154857L
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.mo213675q()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x0015
        L_0x0014:
            r0 = r2
        L_0x0015:
            if (r0 != 0) goto L_0x001a
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x001a:
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x003d
        L_0x0020:
            com.ss.android.vc.meeting.module.floatingwindow.IFloatWindowPresent$FloatWindowType r0 = r3.f154905b
            com.ss.android.vc.meeting.module.floatingwindow.IFloatWindowPresent$FloatWindowType r1 = com.ss.android.vc.meeting.module.floatingwindow.IFloatWindowPresent.FloatWindowType.FAST_ENTRY
            if (r0 != r1) goto L_0x0057
            com.ss.android.vc.meeting.module.fastentry.c r0 = r3.f154858M
            if (r0 == 0) goto L_0x0032
            boolean r0 = r0.isFastEntryShown()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
        L_0x0032:
            if (r2 != 0) goto L_0x0037
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0037:
            boolean r0 = r2.booleanValue()
            if (r0 == 0) goto L_0x0057
        L_0x003d:
            android.view.ViewGroup r0 = r3.f154822e
            java.lang.String r1 = "mRootView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0057
            android.view.ViewGroup r0 = r3.f154822e
            boolean r0 = r0.hasOnClickListeners()
            if (r0 == 0) goto L_0x0057
            android.view.ViewGroup r0 = r3.f154822e
            r0.callOnClick()
        L_0x0057:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.floatingwindow.VideoChatFloatWindow.m240902M():void");
    }

    /* renamed from: E */
    public final boolean mo213729E() {
        ParticipantSettings.EquipmentStatus equipmentStatus;
        ParticipantSettings participantSettings;
        C61303k e = mo213813e();
        Intrinsics.checkExpressionValueIsNotNull(e, "meeting");
        String h = e.mo212092J().mo212546h();
        C61303k e2 = mo213813e();
        Intrinsics.checkExpressionValueIsNotNull(e2, "meeting");
        C61383d I = e2.mo212091I();
        Intrinsics.checkExpressionValueIsNotNull(I, "meeting.meetingData");
        C61388g b = I.mo212494b();
        Intrinsics.checkExpressionValueIsNotNull(b, "meeting.meetingData.participantData");
        Participant b2 = ParticipantUtil.m248723b(h, b.mo212601f());
        if (b2 == null || (participantSettings = b2.getParticipantSettings()) == null) {
            equipmentStatus = null;
        } else {
            equipmentStatus = participantSettings.getCameraStatus();
        }
        if (equipmentStatus == ParticipantSettings.EquipmentStatus.NORMAL || equipmentStatus == ParticipantSettings.EquipmentStatus.UNKNOWN) {
            return true;
        }
        return false;
    }

    @XMethod
    public final void onClickInternal() {
        C61303k e = mo213813e();
        Intrinsics.checkExpressionValueIsNotNull(e, "meeting");
        if (e.mo212064m()) {
            C61303k e2 = mo213813e();
            Intrinsics.checkExpressionValueIsNotNull(e2, "meeting");
            C60700b.m235841a(e2.mo212056e(), "UI", "UI", "clickFloatOpenCallingFragment", f154851J, "clickFloatOpenCallingFragment");
            C63693e.m249685b("calling");
            ByteRTCMeetingActivity.Companion aVar = ByteRTCMeetingActivity.f157054h;
            C61303k e3 = mo213813e();
            Intrinsics.checkExpressionValueIsNotNull(e3, "meeting");
            aVar.mo215868a(e3, true);
            return;
        }
        C61303k e4 = mo213813e();
        Intrinsics.checkExpressionValueIsNotNull(e4, "meeting");
        C60700b.m235841a(e4.mo212056e(), "UI", "UI", "clickFloatOpenRingingFragment", f154851J, "clickFloatOpenRingingFragment");
        C63693e.m249685b("single_ringing");
        ByteRTCMeetingActivity.Companion aVar2 = ByteRTCMeetingActivity.f157054h;
        C61303k e5 = mo213813e();
        Intrinsics.checkExpressionValueIsNotNull(e5, "meeting");
        aVar2.mo215871b(e5, true);
    }

    @XMethod
    public final void subscribeFrame() {
        boolean z;
        C61303k e = mo213813e();
        Intrinsics.checkExpressionValueIsNotNull(e, "meeting");
        String i = e.mo212092J().mo212548i();
        if (i == null || i.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.f154861P = new C61727z(this);
            C61303k e2 = mo213813e();
            Intrinsics.checkExpressionValueIsNotNull(e2, "meeting");
            C61303k e3 = mo213813e();
            Intrinsics.checkExpressionValueIsNotNull(e3, "meeting");
            e2.mo212165y().mo211996a(new C61697aa(this), e3.mo212092J().mo212548i());
        }
    }

    @XMethod
    public final void updateRecAndLiveView() {
        C61383d I;
        C61303k e = mo213813e();
        if (e != null && (I = e.mo212091I()) != null && I != null) {
            C61303k e2 = mo213813e();
            Intrinsics.checkExpressionValueIsNotNull(e2, "meeting");
            C61383d I2 = e2.mo212091I();
            Intrinsics.checkExpressionValueIsNotNull(I2, "meeting.meetingData");
            C61381c a = I2.mo212490a();
            Intrinsics.checkExpressionValueIsNotNull(a, "meeting.meetingData.inMeetingInfoData");
            mo213733a(Boolean.valueOf(a.mo212482n()));
            C61303k e3 = mo213813e();
            Intrinsics.checkExpressionValueIsNotNull(e3, "meeting");
            C61383d I3 = e3.mo212091I();
            Intrinsics.checkExpressionValueIsNotNull(I3, "meeting.meetingData");
            C61381c a2 = I3.mo212490a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "meeting.meetingData.inMeetingInfoData");
            if (a2.mo212481m() != null) {
                C61303k e4 = mo213813e();
                Intrinsics.checkExpressionValueIsNotNull(e4, "meeting");
                C61383d I4 = e4.mo212091I();
                Intrinsics.checkExpressionValueIsNotNull(I4, "meeting.meetingData");
                C61381c a3 = I4.mo212490a();
                Intrinsics.checkExpressionValueIsNotNull(a3, "meeting.meetingData.inMeetingInfoData");
                mo213741c(Boolean.valueOf(a3.mo212481m().mo209943b()));
            }
        }
    }

    /* renamed from: w */
    public final void mo213772w() {
        C60700b.m235851b(f154851J, "[setVideoView]", "setVideoView");
        C61303k e = mo213813e();
        Intrinsics.checkExpressionValueIsNotNull(e, "meeting");
        if (!e.mo212092J().mo212507D()) {
            FrameLayout frameLayout = this.f154823f;
            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "mSurfaceContainer");
            C60752f.m236079a((View) frameLayout);
            m240898I();
            return;
        }
        FrameLayout frameLayout2 = this.f154823f;
        Intrinsics.checkExpressionValueIsNotNull(frameLayout2, "mSurfaceContainer");
        C60752f.m236083c(frameLayout2);
        if (C60788y.m236247a(ar.m236694a())) {
            View view = this.f154825h;
            Intrinsics.checkExpressionValueIsNotNull(view, "mAvatarContainer");
            C60752f.m236079a(view);
            return;
        }
        ImageView imageView = this.f154827j;
        Intrinsics.checkExpressionValueIsNotNull(imageView, "mCameraIcon");
        C60752f.m236079a((View) imageView);
    }

    /* renamed from: x */
    public final void mo213773x() {
        AbstractC61660c cVar;
        FrameLayout f;
        View f2;
        C63693e.m249685b("onthecall");
        int[] iArr = new int[2];
        if (this.f154905b == IFloatWindowPresent.FloatWindowType.BUBBLE) {
            AbstractC61732e eVar = this.f154857L;
            if (!(eVar == null || (f2 = eVar.mo213580f()) == null)) {
                f2.getLocationOnScreen(iArr);
            }
        } else if (!(this.f154905b != IFloatWindowPresent.FloatWindowType.FAST_ENTRY || (cVar = this.f154858M) == null || (f = cVar.mo213580f()) == null)) {
            f.getLocationOnScreen(iArr);
        }
        VideoChat videoChat = getVideoChat();
        if (this.f154815C || iArr[0] <= C60776r.m236139a() / 2) {
            mo213774y();
            mo213727C();
        } else {
            m240901L();
            this.f154906c.postDelayed(new RunnableC61717s(this), 100);
        }
        C60700b.m235841a(videoChat, "UI", "UI", "clickFloatOpenOnTheCallFragment", f154851J, "clickFloatOpenOnTheCallFragment");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.floatingwindow.VideoChatFloatWindow$d */
    public static final class RunnableC61702d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VideoChatFloatWindow f154873a;

        RunnableC61702d(VideoChatFloatWindow videoChatFloatWindow) {
            this.f154873a = videoChatFloatWindow;
        }

        public final void run() {
            C61383d I;
            C61381c a;
            String a2 = VideoChatFloatWindow.f154852K.mo213776a();
            StringBuilder sb = new StringBuilder();
            sb.append("meetingId: ");
            C61303k e = this.f154873a.mo213813e();
            Intrinsics.checkExpressionValueIsNotNull(e, "meeting");
            sb.append(e.mo212055d());
            C60700b.m235851b(a2, "[initDataObservers]", sb.toString());
            this.f154873a.mo213813e().f153584l.mo212458a().mo5925a(this.f154873a.f154856I);
            C61303k e2 = this.f154873a.mo213813e();
            if (!(e2 == null || (I = e2.mo212091I()) == null || (a = I.mo212490a()) == null)) {
                a.mo212468a(this.f154873a.f154855H);
            }
            C61303k e3 = this.f154873a.mo213813e();
            Intrinsics.checkExpressionValueIsNotNull(e3, "meeting");
            e3.mo212092J().mo212575y().mo5925a(this.f154873a.f154854G);
            C61303k e4 = this.f154873a.mo213813e();
            Intrinsics.checkExpressionValueIsNotNull(e4, "meeting");
            e4.af().mo216821a(this.f154873a);
            C61303k e5 = this.f154873a.mo213813e();
            Intrinsics.checkExpressionValueIsNotNull(e5, "meeting");
            e5.mo212164x().mo211751a(this.f154873a);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.floatingwindow.VideoChatFloatWindow$p */
    public static final class RunnableC61714p implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VideoChatFloatWindow f154887a;

        RunnableC61714p(VideoChatFloatWindow videoChatFloatWindow) {
            this.f154887a = videoChatFloatWindow;
        }

        public final void run() {
            C61383d I;
            C61381c a;
            String a2 = VideoChatFloatWindow.f154852K.mo213776a();
            StringBuilder sb = new StringBuilder();
            sb.append("meetingId: ");
            C61303k e = this.f154887a.mo213813e();
            Intrinsics.checkExpressionValueIsNotNull(e, "meeting");
            sb.append(e.mo212055d());
            C60700b.m235851b(a2, "[removeDataObservers]", sb.toString());
            this.f154887a.mo213813e().f153584l.mo212458a().mo5928b(this.f154887a.f154856I);
            C61303k e2 = this.f154887a.mo213813e();
            if (!(e2 == null || (I = e2.mo212091I()) == null || (a = I.mo212490a()) == null)) {
                a.mo212470b(this.f154887a.f154855H);
            }
            C61303k e3 = this.f154887a.mo213813e();
            Intrinsics.checkExpressionValueIsNotNull(e3, "meeting");
            e3.mo212092J().mo212575y().mo5928b(this.f154887a.f154854G);
            C61303k e4 = this.f154887a.mo213813e();
            Intrinsics.checkExpressionValueIsNotNull(e4, "meeting");
            e4.af().mo216824b(this.f154887a);
            C61303k e5 = this.f154887a.mo213813e();
            Intrinsics.checkExpressionValueIsNotNull(e5, "meeting");
            e5.mo212164x().mo211761b(this.f154887a);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.floatingwindow.VideoChatFloatWindow$v */
    public static final class RunnableC61720v implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VideoChatFloatWindow f154894a;

        /* renamed from: b */
        final /* synthetic */ Boolean f154895b;

        RunnableC61720v(VideoChatFloatWindow videoChatFloatWindow, Boolean bool) {
            this.f154894a = videoChatFloatWindow;
            this.f154895b = bool;
        }

        public final void run() {
            ViewParent viewParent;
            ByteRtc y;
            if (!Intrinsics.areEqual((Object) this.f154895b, (Object) true)) {
                if (this.f154894a.mo213692o()) {
                    this.f154894a.subscribeFrame();
                }
                View z = this.f154894a.mo213775z();
                if (z != null) {
                    viewParent = z.getParent();
                } else {
                    viewParent = null;
                }
                if (!Intrinsics.areEqual(viewParent, this.f154894a.f154823f)) {
                    C61303k e = this.f154894a.mo213813e();
                    Intrinsics.checkExpressionValueIsNotNull(e, "meeting");
                    StreamManagerGlobal T = e.mo212102T();
                    View z2 = this.f154894a.mo213775z();
                    C61303k e2 = this.f154894a.mo213813e();
                    Intrinsics.checkExpressionValueIsNotNull(e2, "meeting");
                    T.mo212218b(z2, e2.mo212092J().mo212548i());
                    if (C60788y.m236247a(ar.m236694a())) {
                        View view = this.f154894a.f154825h;
                        Intrinsics.checkExpressionValueIsNotNull(view, "mAvatarContainer");
                        C60752f.m236079a(view);
                    } else {
                        ImageView imageView = this.f154894a.f154827j;
                        Intrinsics.checkExpressionValueIsNotNull(imageView, "mCameraIcon");
                        C60752f.m236079a((View) imageView);
                    }
                    C60740ad.m236044a(z);
                    C61074b.m237510a(z, (float) UIHelper.dp2px(8.0f));
                    C61303k e3 = this.f154894a.mo213813e();
                    if (!(e3 == null || (y = e3.mo212165y()) == null)) {
                        y.mo211993a(z, new C61599a(this, VideoChatFloatWindow.f154852K.mo213776a()) {
                            /* class com.ss.android.vc.meeting.module.floatingwindow.VideoChatFloatWindow.RunnableC61720v.C617211 */

                            /* renamed from: a */
                            final /* synthetic */ RunnableC61720v f154896a;

                            @Override // com.ss.android.vc.meeting.module.p3117d.C61599a, com.ss.android.vc.irtc.AbstractC61030i
                            /* renamed from: a */
                            public void mo210658a() {
                                C26171w.m94675a(new RunnableC61722a(this));
                            }

                            @Override // com.ss.android.vc.meeting.module.p3117d.C61599a, com.ss.android.vc.irtc.AbstractC61030i
                            /* renamed from: b */
                            public void mo210659b() {
                                super.mo210659b();
                                C26171w.m94675a(new RunnableC61723b(this));
                            }

                            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
                            /* renamed from: com.ss.android.vc.meeting.module.floatingwindow.VideoChatFloatWindow$v$1$a */
                            static final class RunnableC61722a implements Runnable {

                                /* renamed from: a */
                                final /* synthetic */ C617211 f154897a;

                                RunnableC61722a(C617211 r1) {
                                    this.f154897a = r1;
                                }

                                public final void run() {
                                    View view = this.f154897a.f154896a.f154894a.f154825h;
                                    Intrinsics.checkExpressionValueIsNotNull(view, "mAvatarContainer");
                                    C60752f.m236083c(view);
                                    ImageView imageView = this.f154897a.f154896a.f154894a.f154827j;
                                    Intrinsics.checkExpressionValueIsNotNull(imageView, "mCameraIcon");
                                    C60752f.m236083c(imageView);
                                }
                            }

                            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
                            /* renamed from: com.ss.android.vc.meeting.module.floatingwindow.VideoChatFloatWindow$v$1$b */
                            static final class RunnableC61723b implements Runnable {

                                /* renamed from: a */
                                final /* synthetic */ C617211 f154898a;

                                RunnableC61723b(C617211 r1) {
                                    this.f154898a = r1;
                                }

                                public final void run() {
                                    if (C60788y.m236247a(ar.m236694a())) {
                                        View view = this.f154898a.f154896a.f154894a.f154825h;
                                        Intrinsics.checkExpressionValueIsNotNull(view, "mAvatarContainer");
                                        C60752f.m236079a(view);
                                        return;
                                    }
                                    ImageView imageView = this.f154898a.f154896a.f154894a.f154827j;
                                    Intrinsics.checkExpressionValueIsNotNull(imageView, "mCameraIcon");
                                    C60752f.m236079a((View) imageView);
                                }
                            }

                            {
                                this.f154896a = r1;
                            }
                        });
                    }
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.gravity = 17;
                    this.f154894a.f154823f.removeAllViews();
                    this.f154894a.f154823f.addView(z, 0, layoutParams);
                }
            } else if (C60788y.m236247a(ar.m236694a())) {
                View view2 = this.f154894a.f154825h;
                Intrinsics.checkExpressionValueIsNotNull(view2, "mAvatarContainer");
                C60752f.m236079a(view2);
            } else {
                ImageView imageView2 = this.f154894a.f154827j;
                Intrinsics.checkExpressionValueIsNotNull(imageView2, "mCameraIcon");
                C60752f.m236079a((View) imageView2);
            }
        }
    }

    @XMethod
    public final void onRemoteMuteChange() {
        setFollowThumbnailVisibility(8);
        setShareIconVisibility(8);
        C61303k e = mo213813e();
        Intrinsics.checkExpressionValueIsNotNull(e, "meeting");
        String h = e.mo212092J().mo212546h();
        C61303k e2 = mo213813e();
        Intrinsics.checkExpressionValueIsNotNull(e2, "meeting");
        C61383d I = e2.mo212091I();
        Intrinsics.checkExpressionValueIsNotNull(I, "meeting.meetingData");
        C61388g b = I.mo212494b();
        Intrinsics.checkExpressionValueIsNotNull(b, "meeting.meetingData.participantData");
        Participant b2 = ParticipantUtil.m248723b(h, b.mo212601f());
        if (b2 != null) {
            String str = f154851J;
            StringBuilder sb = new StringBuilder();
            sb.append("participant id ");
            sb.append(b2.getId());
            sb.append(" isMicroMuted ");
            ParticipantSettings participantSettings = b2.getParticipantSettings();
            Intrinsics.checkExpressionValueIsNotNull(participantSettings, "it.participantSettings");
            sb.append(participantSettings.isMicrophoneMuted());
            sb.append(' ');
            sb.append(" isCameraMuted ");
            ParticipantSettings participantSettings2 = b2.getParticipantSettings();
            Intrinsics.checkExpressionValueIsNotNull(participantSettings2, "it.participantSettings");
            sb.append(participantSettings2.isCameraMuted());
            C60700b.m235851b(str, "[onRemoteMuteChange]", sb.toString());
            ParticipantSettings participantSettings3 = b2.getParticipantSettings();
            Intrinsics.checkExpressionValueIsNotNull(participantSettings3, "it.participantSettings");
            subscriberRemoteVideo(b2, participantSettings3.isCameraMuted());
            ParticipantSettings participantSettings4 = b2.getParticipantSettings();
            Intrinsics.checkExpressionValueIsNotNull(participantSettings4, "it.participantSettings");
            boolean isCameraMuted = participantSettings4.isCameraMuted();
            String str2 = f154851J;
            C60700b.m235851b(str2, "[onRemoteMuteChange2]", "currentRemoteVideoMuted=" + isCameraMuted + " lastRemoteVideoMuted=" + this.f154864S);
            if ((!Intrinsics.areEqual(Boolean.valueOf(isCameraMuted), this.f154864S)) || !this.f154853F) {
                C61303k e3 = mo213813e();
                Intrinsics.checkExpressionValueIsNotNull(e3, "meeting");
                mo213742c(e3.mo212092J().mo212546h(), isCameraMuted);
            }
            this.f154864S = Boolean.valueOf(isCameraMuted);
        }
    }

    /* renamed from: v */
    public final void mo213771v() {
        String str;
        C60700b.m235851b(f154851J, "[showMeetingFloatingWindow]", "start");
        mo213715t();
        m240897H();
        boolean isMuted = isMuted();
        IFloatWindowPresent iFloatWindowPresent = this.f154904a;
        Intrinsics.checkExpressionValueIsNotNull(iFloatWindowPresent, "mPresent");
        VideoChatUser localUser = iFloatWindowPresent.getLocalUser();
        IFloatWindowPresent iFloatWindowPresent2 = this.f154904a;
        Intrinsics.checkExpressionValueIsNotNull(iFloatWindowPresent2, "mPresent");
        VideoChatUser remoteUser = iFloatWindowPresent2.getRemoteUser();
        String str2 = f154851J;
        StringBuilder sb = new StringBuilder();
        sb.append("localUser = ");
        String str3 = null;
        if (localUser != null) {
            str = localUser.getName();
        } else {
            str = null;
        }
        sb.append(str);
        sb.append(" remoteUser = ");
        if (remoteUser != null) {
            str3 = remoteUser.getName();
        }
        sb.append(str3);
        sb.append(" muted = ");
        sb.append(isMuted);
        C60700b.m235851b(str2, "[showMeetingFloatingWindow2]", sb.toString());
        C61074b.m237511a(mo213775z(), C60773o.m236126d(R.color.vc_bg_float_video));
        if (!(remoteUser == null || remoteUser == null)) {
            String name = remoteUser.getName();
            String avatarKey = remoteUser.getAvatarKey();
            String id = remoteUser.getId();
            ParticipantType type = remoteUser.getType();
            Intrinsics.checkExpressionValueIsNotNull(type, "remoteUser.type");
            mo213735a(name, avatarKey, id, type);
        }
        C61303k e = mo213813e();
        Intrinsics.checkExpressionValueIsNotNull(e, "meeting");
        C61383d I = e.mo212091I();
        Intrinsics.checkExpressionValueIsNotNull(I, "meeting.meetingData");
        C61381c a = I.mo212490a();
        Intrinsics.checkExpressionValueIsNotNull(a, "meeting.meetingData.inMeetingInfoData");
        inMeetingInfoUpdate(a.mo212471c());
        this.f154904a.mo213667l();
        m240900K();
        this.f154822e.setOnClickListener(new View$OnClickListenerC61719u(this));
        addListener();
        C60700b.m235851b(f154851J, "[showMeetingFloatingWindow2]", "end");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.floatingwindow.VideoChatFloatWindow$c */
    public static final class RunnableC61701c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VideoChatFloatWindow f154872a;

        RunnableC61701c(VideoChatFloatWindow videoChatFloatWindow) {
            this.f154872a = videoChatFloatWindow;
        }

        public final void run() {
            C60700b.m235851b(VideoChatFloatWindow.f154852K.mo213776a(), "[onInMeetingInfoUpdateOnVC]", "update");
            C61303k e = this.f154872a.mo213813e();
            Intrinsics.checkExpressionValueIsNotNull(e, "meeting");
            if (e.mo212057f() == VideoChat.Type.CALL) {
                C61303k e2 = this.f154872a.mo213813e();
                Intrinsics.checkExpressionValueIsNotNull(e2, "meeting");
                String h = e2.mo212092J().mo212546h();
                C61303k e3 = this.f154872a.mo213813e();
                Intrinsics.checkExpressionValueIsNotNull(e3, "meeting");
                C61383d I = e3.mo212091I();
                Intrinsics.checkExpressionValueIsNotNull(I, "meeting.meetingData");
                C61388g b = I.mo212494b();
                Intrinsics.checkExpressionValueIsNotNull(b, "meeting.meetingData.participantData");
                Participant b2 = ParticipantUtil.m248723b(h, b.mo212601f());
                if (b2 != null) {
                    C61303k e4 = this.f154872a.mo213813e();
                    Intrinsics.checkExpressionValueIsNotNull(e4, "meeting");
                    MeetingSpecificData J = e4.mo212092J();
                    ParticipantSettings participantSettings = b2.getParticipantSettings();
                    Intrinsics.checkExpressionValueIsNotNull(participantSettings, "it.participantSettings");
                    J.mo212545g(participantSettings.isMicrophoneMuted());
                    C61303k e5 = this.f154872a.mo213813e();
                    Intrinsics.checkExpressionValueIsNotNull(e5, "meeting");
                    MeetingSpecificData J2 = e5.mo212092J();
                    ParticipantSettings participantSettings2 = b2.getParticipantSettings();
                    Intrinsics.checkExpressionValueIsNotNull(participantSettings2, "it.participantSettings");
                    J2.mo212547h(participantSettings2.isCameraMuted());
                }
                if (this.f154872a.isInFollow()) {
                    this.f154872a.detachScreenShareView();
                    C61303k e6 = this.f154872a.mo213813e();
                    Intrinsics.checkExpressionValueIsNotNull(e6, "meeting");
                    C61383d I2 = e6.mo212091I();
                    Intrinsics.checkExpressionValueIsNotNull(I2, "meeting.meetingData");
                    C61381c a = I2.mo212490a();
                    Intrinsics.checkExpressionValueIsNotNull(a, "meeting.meetingData.inMeetingInfoData");
                    FollowInfo l = a.mo212480l();
                    Intrinsics.checkExpressionValueIsNotNull(l, "followInfo");
                    if (!TextUtils.equals(l.getRawUrl(), this.f154872a.f154839v)) {
                        this.f154872a.showFollowThumbnail();
                    }
                    if (b2 != null) {
                        this.f154872a.subscriberRemoteVideo(b2, true);
                    }
                    C61303k e7 = this.f154872a.mo213813e();
                    Intrinsics.checkExpressionValueIsNotNull(e7, "meeting");
                    e7.ay().mo216071c(false);
                    this.f154872a.f154853F = false;
                } else if (this.f154872a.isInShareContent()) {
                    this.f154872a.processShareContent();
                    this.f154872a.f154853F = false;
                    this.f154872a.f154839v = null;
                } else {
                    this.f154872a.detachScreenShareView();
                    this.f154872a.onRemoteMuteChange();
                    C61303k e8 = this.f154872a.mo213813e();
                    Intrinsics.checkExpressionValueIsNotNull(e8, "meeting");
                    e8.ay().mo216071c(false);
                    this.f154872a.f154853F = true;
                    this.f154872a.f154839v = null;
                }
                IFloatWindowPresent iFloatWindowPresent = this.f154872a.f154904a;
                Intrinsics.checkExpressionValueIsNotNull(iFloatWindowPresent, "mPresent");
                VideoChatUser remoteUser = iFloatWindowPresent.getRemoteUser();
                if (!(remoteUser == null || remoteUser == null)) {
                    VideoChatFloatWindow videoChatFloatWindow = this.f154872a;
                    IFloatWindowPresent iFloatWindowPresent2 = videoChatFloatWindow.f154904a;
                    Intrinsics.checkExpressionValueIsNotNull(iFloatWindowPresent2, "mPresent");
                    VideoChatUser remoteUser2 = iFloatWindowPresent2.getRemoteUser();
                    Intrinsics.checkExpressionValueIsNotNull(remoteUser2, "mPresent.remoteUser");
                    String name = remoteUser2.getName();
                    IFloatWindowPresent iFloatWindowPresent3 = this.f154872a.f154904a;
                    Intrinsics.checkExpressionValueIsNotNull(iFloatWindowPresent3, "mPresent");
                    VideoChatUser remoteUser3 = iFloatWindowPresent3.getRemoteUser();
                    Intrinsics.checkExpressionValueIsNotNull(remoteUser3, "mPresent.remoteUser");
                    String id = remoteUser3.getId();
                    IFloatWindowPresent iFloatWindowPresent4 = this.f154872a.f154904a;
                    Intrinsics.checkExpressionValueIsNotNull(iFloatWindowPresent4, "mPresent");
                    VideoChatUser remoteUser4 = iFloatWindowPresent4.getRemoteUser();
                    Intrinsics.checkExpressionValueIsNotNull(remoteUser4, "mPresent.remoteUser");
                    ParticipantType type = remoteUser4.getType();
                    Intrinsics.checkExpressionValueIsNotNull(type, "mPresent.remoteUser.type");
                    videoChatFloatWindow.mo213735a(name, (String) null, id, type);
                }
                this.f154872a.updateRecAndLiveView();
            }
        }
    }

    /* renamed from: a */
    public final void mo213736a(boolean z) {
        this.f154860O = z;
    }

    /* renamed from: b */
    public final void mo213740b(boolean z) {
        this.f154862Q = z;
    }

    @XMethod(runOnProcess = XProcess.Main)
    public final void onLivingChangedOnMain(Boolean bool) {
        mo213743d(bool);
    }

    @XMethod(runOnProcess = XProcess.Main)
    public final void onRecordingChangedOnMain(Boolean bool) {
        mo213738b(bool);
    }

    @XMethod(runOnProcess = XProcess.Main)
    public final void showSurfaceOnMain(boolean z) {
        mo213749g(z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"com/ss/android/vc/meeting/module/floatingwindow/VideoChatFloatWindow$isRtcInterruptedObserver$1", "Landroidx/lifecycle/Observer;", "", "onChanged", "", "isRtcInterrupted", "(Ljava/lang/Boolean;)V", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.floatingwindow.VideoChatFloatWindow$f */
    public static final class C61704f implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ VideoChatFloatWindow f154875a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C61704f(VideoChatFloatWindow videoChatFloatWindow) {
            this.f154875a = videoChatFloatWindow;
        }

        /* renamed from: a */
        public void onChanged(Boolean bool) {
            String str;
            C61303k e = this.f154875a.mo213813e();
            Intrinsics.checkExpressionValueIsNotNull(e, "meeting");
            boolean D = e.mo212092J().mo212507D();
            VideoChatFloatWindow videoChatFloatWindow = this.f154875a;
            IFloatWindowPresent iFloatWindowPresent = videoChatFloatWindow.f154904a;
            Intrinsics.checkExpressionValueIsNotNull(iFloatWindowPresent, "mPresent");
            VideoChatUser remoteUser = iFloatWindowPresent.getRemoteUser();
            if (remoteUser != null) {
                str = remoteUser.getId();
            } else {
                str = null;
            }
            if (str == null) {
                Intrinsics.throwNpe();
            }
            videoChatFloatWindow.mo213742c(str, D);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/floatingwindow/VideoChatFloatWindow$mMeetingDataListener$1", "Lcom/ss/android/vc/meeting/model/InMeetingInfoData$InMeetingInfoListener;", "onInMeetingInfoUpdate", "", "inMeetingInfo", "Lcom/ss/android/vc/entity/VideoChatInMeetingInfo;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.floatingwindow.VideoChatFloatWindow$g */
    public static final class C61705g implements C61381c.AbstractC61382a {

        /* renamed from: a */
        final /* synthetic */ VideoChatFloatWindow f154876a;

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

        @Override // com.ss.android.vc.meeting.model.C61381c.AbstractC61382a
        public /* synthetic */ void h_(boolean z) {
            C61381c.AbstractC61382a.CC.$default$h_(this, z);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C61705g(VideoChatFloatWindow videoChatFloatWindow) {
            this.f154876a = videoChatFloatWindow;
        }

        @Override // com.ss.android.vc.meeting.model.C61381c.AbstractC61382a
        public void onInMeetingInfoUpdate(VideoChatInMeetingInfo videoChatInMeetingInfo) {
            this.f154876a.inMeetingInfoUpdate(videoChatInMeetingInfo);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/floatingwindow/VideoChatFloatWindow$playBubbleHideAnimation$1", "Lcom/ss/android/vc/meeting/module/floatingwindow/SimpleAnimatorListener;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.floatingwindow.VideoChatFloatWindow$m */
    public static final class C61711m extends C61740j {

        /* renamed from: a */
        final /* synthetic */ VideoChatFloatWindow f154884a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C61711m(VideoChatFloatWindow videoChatFloatWindow) {
            this.f154884a = videoChatFloatWindow;
        }

        @Override // com.ss.android.vc.meeting.module.floatingwindow.C61740j
        public void onAnimationEnd(Animator animator) {
            this.f154884a.mo213727C();
        }
    }

    /* renamed from: d */
    public final void mo213745d(boolean z) {
        this.f154863R = z;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "vcVideoFrame", "Lcom/ss/android/vc/irtc/VcVideoFrame;", "onFrameReceived"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.floatingwindow.VideoChatFloatWindow$z */
    public static final class C61727z implements AbstractC61025d {

        /* renamed from: a */
        final /* synthetic */ VideoChatFloatWindow f154903a;

        C61727z(VideoChatFloatWindow videoChatFloatWindow) {
            this.f154903a = videoChatFloatWindow;
        }

        @Override // com.ss.android.vc.irtc.AbstractC61025d
        /* renamed from: a */
        public final void mo210648a(C61071u uVar) {
            Intrinsics.checkParameterIsNotNull(uVar, "vcVideoFrame");
            this.f154903a.mo213732a(uVar);
        }
    }

    /* renamed from: a */
    public final void mo213733a(Boolean bool) {
        if (this.f154860O) {
            onRecordingChangedOnMain(bool);
        } else {
            mo213738b(bool);
        }
    }

    /* renamed from: b */
    public final void mo213738b(Boolean bool) {
        C60735ab.m236001a(new RunnableC61710l(this, bool));
    }

    /* renamed from: c */
    public final void mo213741c(Boolean bool) {
        if (this.f154860O) {
            onLivingChangedOnMain(bool);
        } else {
            mo213743d(bool);
        }
    }

    /* renamed from: d */
    public final void mo213743d(Boolean bool) {
        C60735ab.m236001a(new RunnableC61709k(this, bool));
    }

    /* renamed from: f */
    public final void mo213748f(boolean z) {
        if (this.f154860O) {
            showSurfaceOnMain(z);
        } else {
            mo213749g(z);
        }
    }

    /* renamed from: g */
    public final void mo213749g(boolean z) {
        C60735ab.m236001a(new RunnableC61726y(this, z));
    }

    @XMethod
    public final void inMeetingInfoUpdate(VideoChatInMeetingInfo videoChatInMeetingInfo) {
        C26171w.m94675a(new RunnableC61701c(this));
    }

    @XMethod(runOnProcess = XProcess.Main)
    public final void setStatusTextOnMain(Integer num) {
        Intrinsics.checkParameterIsNotNull(num, "id");
        mo213739b(num);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "vcVideoFrame", "Lcom/ss/android/vc/irtc/VcVideoFrame;", "onFrameReceived"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.floatingwindow.VideoChatFloatWindow$aa */
    public static final class C61697aa implements AbstractC61025d {

        /* renamed from: a */
        final /* synthetic */ VideoChatFloatWindow f154866a;

        C61697aa(VideoChatFloatWindow videoChatFloatWindow) {
            this.f154866a = videoChatFloatWindow;
        }

        @Override // com.ss.android.vc.irtc.AbstractC61025d
        /* renamed from: a */
        public final void mo210648a(C61071u uVar) {
            AbstractC61025d p;
            if (this.f154866a.mo213695p() != null && (p = this.f154866a.mo213695p()) != null) {
                p.mo210648a(uVar);
            }
        }
    }

    /* renamed from: b */
    public final void mo213739b(Integer num) {
        Intrinsics.checkParameterIsNotNull(num, "id");
        C60735ab.m236001a(new RunnableC61718t(this, num));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.floatingwindow.VideoChatFloatWindow$u */
    public static final class View$OnClickListenerC61719u implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VideoChatFloatWindow f154893a;

        View$OnClickListenerC61719u(VideoChatFloatWindow videoChatFloatWindow) {
            this.f154893a = videoChatFloatWindow;
        }

        public final void onClick(View view) {
            C60700b.m235851b(VideoChatFloatWindow.f154852K.mo213776a(), "[onClick2]", "staticCallingView click returnMeetingFragment");
            VideoChat videoChat = this.f154893a.getVideoChat();
            this.f154893a.mo213773x();
            bk.m250184b(videoChat, this.f154893a.mo213814f());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.floatingwindow.VideoChatFloatWindow$w */
    public static final class View$OnClickListenerC61724w implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VideoChatFloatWindow f154899a;

        View$OnClickListenerC61724w(VideoChatFloatWindow videoChatFloatWindow) {
            this.f154899a = videoChatFloatWindow;
        }

        public final void onClick(View view) {
            C60700b.m235851b(VideoChatFloatWindow.f154852K.mo213776a(), "[onClick]", "staticCallingView setOnClickListener dismiss");
            bk.m250184b(this.f154899a.getVideoChat(), this.f154899a.mo213814f());
            if (this.f154899a.isOnTheCall()) {
                this.f154899a.mo213773x();
                return;
            }
            this.f154899a.onClickInternal();
            this.f154899a.mo213727C();
        }
    }

    /* renamed from: a */
    public final void mo213732a(C61071u uVar) {
        if (this.f154860O) {
            byte[] bArr = uVar.f152941a;
            Intrinsics.checkExpressionValueIsNotNull(bArr, "vcVideoFrame.y");
            byte[] bArr2 = uVar.f152942b;
            Intrinsics.checkExpressionValueIsNotNull(bArr2, "vcVideoFrame.u");
            byte[] bArr3 = uVar.f152943c;
            Intrinsics.checkExpressionValueIsNotNull(bArr3, "vcVideoFrame.v");
            onFrameOnMain(bArr, bArr2, bArr3, uVar);
            return;
        }
        m240904b(uVar);
    }

    /* renamed from: b */
    private final void m240904b(C61071u uVar) {
        View view = this.f154825h;
        Intrinsics.checkExpressionValueIsNotNull(view, "mAvatarContainer");
        if (view.getVisibility() == 0) {
            C60735ab.m236001a(new RunnableC61707i(this));
        }
        ImageView imageView = this.f154827j;
        Intrinsics.checkExpressionValueIsNotNull(imageView, "mCameraIcon");
        if (imageView.getVisibility() == 0) {
            C60735ab.m236001a(new RunnableC61708j(this));
        }
        C61303k e = mo213813e();
        Intrinsics.checkExpressionValueIsNotNull(e, "meeting");
        e.mo212165y().mo211994a(this.f154859N, uVar);
    }

    /* renamed from: a */
    public final void mo213734a(Integer num) {
        Intrinsics.checkParameterIsNotNull(num, "id");
        if (this.f154860O) {
            setStatusTextOnMain(num);
        } else {
            mo213739b(num);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "timeData", "Lcom/ss/android/vc/meeting/model/data/MeetingTimeData;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.floatingwindow.VideoChatFloatWindow$ac */
    static final class C61699ac<T> implements AbstractC1178x<MeetingTimeData> {

        /* renamed from: a */
        final /* synthetic */ VideoChatFloatWindow f154870a;

        C61699ac(VideoChatFloatWindow videoChatFloatWindow) {
            this.f154870a = videoChatFloatWindow;
        }

        /* renamed from: a */
        public final void onChanged(MeetingTimeData aVar) {
            if (this.f154870a.mo213813e() != null) {
                C61303k e = this.f154870a.mo213813e();
                Intrinsics.checkExpressionValueIsNotNull(e, "meeting");
                if (e.mo212065n() && aVar != null) {
                    if (C63634c.m249496b("byteview.call.android.status_connecting")) {
                        C61303k e2 = this.f154870a.mo213813e();
                        Intrinsics.checkExpressionValueIsNotNull(e2, "meeting");
                        if (Intrinsics.areEqual((Object) e2.mo212092J().mo212572v().mo5927b(), (Object) true)) {
                            if (!this.f154870a.mo213762q()) {
                                this.f154870a.mo213740b(true);
                                this.f154870a.mo213730F();
                            }
                        } else if (!this.f154870a.mo213763r()) {
                            this.f154870a.mo213745d(true);
                            this.f154870a.mo213734a(new Integer((int) R.string.View_G_Connecting));
                        }
                    } else if (!this.f154870a.mo213762q()) {
                        this.f154870a.mo213740b(true);
                        this.f154870a.mo213730F();
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo213747e(boolean z) {
        mo213715t();
        m240897H();
        IFloatWindowPresent iFloatWindowPresent = this.f154904a;
        Intrinsics.checkExpressionValueIsNotNull(iFloatWindowPresent, "mPresent");
        VideoChatUser remoteUser = iFloatWindowPresent.getRemoteUser();
        if (!(remoteUser == null || remoteUser == null)) {
            IFloatWindowPresent iFloatWindowPresent2 = this.f154904a;
            Intrinsics.checkExpressionValueIsNotNull(iFloatWindowPresent2, "mPresent");
            VideoChatUser remoteUser2 = iFloatWindowPresent2.getRemoteUser();
            Intrinsics.checkExpressionValueIsNotNull(remoteUser2, "mPresent.remoteUser");
            String name = remoteUser2.getName();
            IFloatWindowPresent iFloatWindowPresent3 = this.f154904a;
            Intrinsics.checkExpressionValueIsNotNull(iFloatWindowPresent3, "mPresent");
            VideoChatUser remoteUser3 = iFloatWindowPresent3.getRemoteUser();
            Intrinsics.checkExpressionValueIsNotNull(remoteUser3, "mPresent.remoteUser");
            String avatarKey = remoteUser3.getAvatarKey();
            IFloatWindowPresent iFloatWindowPresent4 = this.f154904a;
            Intrinsics.checkExpressionValueIsNotNull(iFloatWindowPresent4, "mPresent");
            VideoChatUser remoteUser4 = iFloatWindowPresent4.getRemoteUser();
            Intrinsics.checkExpressionValueIsNotNull(remoteUser4, "mPresent.remoteUser");
            String id = remoteUser4.getId();
            IFloatWindowPresent iFloatWindowPresent5 = this.f154904a;
            Intrinsics.checkExpressionValueIsNotNull(iFloatWindowPresent5, "mPresent");
            VideoChatUser remoteUser5 = iFloatWindowPresent5.getRemoteUser();
            Intrinsics.checkExpressionValueIsNotNull(remoteUser5, "mPresent.remoteUser");
            ParticipantType type = remoteUser5.getType();
            Intrinsics.checkExpressionValueIsNotNull(type, "mPresent.remoteUser.type");
            mo213735a(name, avatarKey, id, type);
        }
        if (C60788y.m236247a(ar.m236694a())) {
            View view = this.f154825h;
            Intrinsics.checkExpressionValueIsNotNull(view, "mAvatarContainer");
            C60752f.m236079a(view);
        } else {
            ImageView imageView = this.f154827j;
            Intrinsics.checkExpressionValueIsNotNull(imageView, "mCameraIcon");
            C60752f.m236079a((View) imageView);
        }
        FrameLayout frameLayout = this.f154823f;
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "mSurfaceContainer");
        C60752f.m236083c(frameLayout);
        if (z) {
            this.f154828k.setText(R.string.View_G_Calling);
        } else {
            this.f154828k.setText(R.string.View_G_Ringing);
        }
        TextView textView = this.f154828k;
        Intrinsics.checkExpressionValueIsNotNull(textView, "mStatusTv");
        C60752f.m236079a((View) textView);
        addListener();
        this.f154904a.mo213667l();
        m240900K();
        this.f154822e.setOnClickListener(new View$OnClickListenerC61724w(this));
        new Handler().postDelayed(new RunnableC61725x(this), 800);
    }

    @XMethod(runOnProcess = XProcess.Main)
    public final void onUserMuteVideoActionOnMain(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "uid");
        mo213744d(str, z);
    }

    public VideoChatFloatWindow(IFloatWindowPresent iFloatWindowPresent, IFloatWindowPresent.FloatWindowType floatWindowType) {
        super(iFloatWindowPresent, floatWindowType);
        this.f154865T = floatWindowType;
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d, com.ss.android.vc.meeting.framework.meeting.AbstractC61293a
    /* renamed from: a */
    public void mo211750a(VcByteStream vcByteStream, String str) {
        C60700b.m235851b(f154851J, "[onStreamAdd]", "onStreamAdd");
        C61303k e = mo213813e();
        Intrinsics.checkExpressionValueIsNotNull(e, "meeting");
        e.mo212102T().mo212214a(vcByteStream, StreamSpec.Scene.GLOBAL_FLOAT_WINDOW, StreamSpec.Resolution.FLOAT_WINDOW, false);
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d, com.ss.android.vc.meeting.framework.meeting.AbstractC61293a
    /* renamed from: c */
    public void mo211770c(String str, String str2) {
        C60700b.m235851b(f154851J, "[onScreenStreamAdd]", "onScreenStreamAdd");
        C61303k e = mo213813e();
        Intrinsics.checkExpressionValueIsNotNull(e, "meeting");
        e.mo212102T().mo212216a(str2, false);
    }

    /* renamed from: c */
    public final void mo213742c(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "uid");
        if (this.f154860O) {
            onUserMuteVideoActionOnMain(str, z);
        } else {
            mo213744d(str, z);
        }
    }

    @XMethod
    public final void subscriberRemoteVideo(Participant participant, boolean z) {
        C61303k e = mo213813e();
        Intrinsics.checkExpressionValueIsNotNull(e, "meeting");
        StreamManagerGlobal T = e.mo212102T();
        String rtcJoinId = participant.getRtcJoinId();
        Intrinsics.checkExpressionValueIsNotNull(rtcJoinId, "participant.rtcJoinId");
        VcByteStream e2 = T.mo212228e(rtcJoinId);
        if (e2 != null) {
            String str = f154851J;
            C60700b.m235851b(str, "[subscriberRemoteVideo]", "subscribeStream, muted = " + z);
            C26171w.m94675a(new RunnableC61698ab(this, e2, z));
        }
    }

    /* renamed from: d */
    public final void mo213744d(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "uid");
        C61303k e = mo213813e();
        Intrinsics.checkExpressionValueIsNotNull(e, "meeting");
        C60700b.m235841a(e.mo212056e(), "RtcSDK", "UI", "onUserMuteVideo: " + z, f154851J, "[onUserMuteVideo] uid = " + str + " muted = " + z);
        if (!z) {
            m240898I();
            mo213748f(true);
        } else if (z) {
            mo213748f(false);
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d, com.ss.android.vc.meeting.framework.meeting.AbstractC61293a
    /* renamed from: b */
    public void mo211763b(String str, int i, int i2) {
        String str2 = f154851J;
        C60700b.m235851b(str2, "[onFirstRemoteScreenFrame]", "rtcJoinId=" + str);
        processShareContent();
    }

    @Override // com.ss.android.vc.meeting.module.audio.MeetingAudioManager.AbstractC61403a, com.ss.android.vc.meeting.module.floatingwindow.AbstractC61729b
    public void onAudioStateChanged(MeetingAudioManager.AudioType audioType, boolean z, boolean z2) {
        VideoChat videoChat;
        Intrinsics.checkParameterIsNotNull(audioType, "lastType");
        super.onAudioStateChanged(audioType, z, z2);
        MeetingAudioManager k = MeetingAudioManager.m239471k();
        Intrinsics.checkExpressionValueIsNotNull(k, "MeetingAudioManager.getInstance()");
        boolean z3 = k.mo212721z();
        MeetingAudioManager k2 = MeetingAudioManager.m239471k();
        Intrinsics.checkExpressionValueIsNotNull(k2, "MeetingAudioManager.getInstance()");
        MeetingAudioManager.AudioType y = k2.mo212720y();
        mo213811a(audioType, z, y, z3);
        if (z2) {
            C61303k e = mo213813e();
            Intrinsics.checkExpressionValueIsNotNull(e, "meeting");
            if (e.mo212065n()) {
                C61303k e2 = mo213813e();
                if (e2 != null) {
                    videoChat = e2.mo212056e();
                } else {
                    videoChat = null;
                }
                cc.m250256a(audioType, z, y, z3, videoChat);
                return;
            }
            C61303k e3 = mo213813e();
            Intrinsics.checkExpressionValueIsNotNull(e3, "meeting");
            if (e3.mo212064m()) {
                C61303k e4 = mo213813e();
                Intrinsics.checkExpressionValueIsNotNull(e4, "meeting");
                C63765n.m250321a(audioType, z, y, z3, e4.mo212056e());
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.audio.MeetingAudioManager.AbstractC61403a, com.ss.android.vc.meeting.module.floatingwindow.AbstractC61729b
    public void onAudioStateUnchanged(MeetingAudioManager.AudioType audioType, boolean z, boolean z2) {
        VideoChat videoChat;
        Intrinsics.checkParameterIsNotNull(audioType, "lastType");
        if (z2) {
            C61303k e = mo213813e();
            Intrinsics.checkExpressionValueIsNotNull(e, "meeting");
            if (e.mo212065n()) {
                C61303k e2 = mo213813e();
                if (e2 != null) {
                    videoChat = e2.mo212056e();
                } else {
                    videoChat = null;
                }
                cc.m250255a(audioType, z, videoChat);
                return;
            }
            C61303k e3 = mo213813e();
            Intrinsics.checkExpressionValueIsNotNull(e3, "meeting");
            if (e3.mo212064m()) {
                C61303k e4 = mo213813e();
                Intrinsics.checkExpressionValueIsNotNull(e4, "meeting");
                C63765n.m250323b(audioType, z, e4.mo212056e());
            }
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d, com.ss.android.vc.meeting.framework.meeting.AbstractC61293a
    /* renamed from: a */
    public void mo211752a(String str, int i, int i2) {
        String str2 = f154851J;
        C60700b.m235851b(str2, "[onFirstRemoteVideoFrame]", "uid=" + str);
        C60735ab.m236001a(new RunnableC61706h(this));
    }

    @XMethod(bigParamCacheId = "8d76f710-286d-4eb4-8155-0951cd2e619f", runOnProcess = XProcess.Main)
    private final void onFrameOnMain(byte[] bArr, byte[] bArr2, byte[] bArr3, C61071u uVar) {
        uVar.f152941a = bArr;
        uVar.f152942b = bArr2;
        uVar.f152943c = bArr3;
        m240904b(uVar);
    }

    /* renamed from: a */
    public final void mo213735a(String str, String str2, String str3, ParticipantType participantType) {
        String str4 = f154851J;
        C60700b.m235851b(str4, "[displayUserInfo]", "userIconUrl = " + str2);
        if (!TextUtils.isEmpty(str2)) {
            C60783v.m236230a(str2, str3, participantType, this.f154826i, 60, 60);
        }
        if (str == null) {
            str = "";
        }
        this.f154814B = str;
        TextView textView = this.f154830m;
        Intrinsics.checkExpressionValueIsNotNull(textView, "mNameTv");
        textView.setText(this.f154814B);
        C61303k e = mo213813e();
        Intrinsics.checkExpressionValueIsNotNull(e, "meeting");
        if (e.mo212092J().mo212506C()) {
            ImageView imageView = this.f154829l;
            Intrinsics.checkExpressionValueIsNotNull(imageView, "mIconImg");
            imageView.setVisibility(0);
        } else {
            ImageView imageView2 = this.f154829l;
            Intrinsics.checkExpressionValueIsNotNull(imageView2, "mIconImg");
            imageView2.setVisibility(8);
        }
        mo213716u();
    }
}
