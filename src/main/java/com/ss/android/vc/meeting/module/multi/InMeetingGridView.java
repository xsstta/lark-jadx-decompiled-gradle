package com.ss.android.vc.meeting.module.multi;

import android.app.Activity;
import android.content.Context;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.C0689b;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LiveData;
import com.airbnb.lottie.LottieAnimationView;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.component.universe_design.shadow.UDShadowLayout;
import com.larksuite.framework.thread.C26171w;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60740ad;
import com.ss.android.vc.common.p3083e.C60752f;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.common.p3083e.C60783v;
import com.ss.android.vc.common.p3083e.C60788y;
import com.ss.android.vc.common.widget.TruncatTextView;
import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.entity.InMeetingData;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantRole;
import com.ss.android.vc.entity.ParticipantSettings;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.follow.FollowInfo;
import com.ss.android.vc.irtc.AbstractC61030i;
import com.ss.android.vc.irtc.utils.C61074b;
import com.ss.android.vc.meeting.framework.manager.MeetingUtil;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.meeting.DisplayMode;
import com.ss.android.vc.meeting.framework.meeting.rtcstream.StreamManagerGlobal;
import com.ss.android.vc.meeting.model.C61381c;
import com.ss.android.vc.meeting.model.C61383d;
import com.ss.android.vc.meeting.model.C61388g;
import com.ss.android.vc.meeting.module.base.util.DataAdapterUtil;
import com.ss.android.vc.meeting.module.follow.AbstractC61751a;
import com.ss.android.vc.meeting.module.follow.common.VCShadowLayout;
import com.ss.android.vc.meeting.module.meetingdialog.participantmanage.ControlOptionShowHelper;
import com.ss.android.vc.meeting.module.meetingdialog.participantmanage.popupwindow.InMeetingParticipantControlPopWindow;
import com.ss.android.vc.meeting.module.multi.UserInfoStatusLayout;
import com.ss.android.vc.meeting.module.multi.gridcontent.AbsGridContentControl;
import com.ss.android.vc.meeting.module.multi.p3140a.AbstractC62485a;
import com.ss.android.vc.meeting.module.multi.p3140a.AbstractC62492f;
import com.ss.android.vc.meeting.module.multi.presenter.C62526c;
import com.ss.android.vc.meeting.module.multi.presenter.InMeetingPresenter;
import com.ss.android.vc.meeting.module.multi.presenter.MeetingPageModel;
import com.ss.android.vc.meeting.module.p3119f.AbstractView$OnClickListenerC61654c;
import com.ss.android.vc.meeting.module.p3129j.AbstractC61994a;
import com.ss.android.vc.meeting.utils.ActiveSpeakerCalculator;
import com.ss.android.vc.meeting.utils.C63497j;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import com.ss.android.vc.net.service.GetUserInfoListener;
import com.ss.android.vc.net.service.UserInfoService;
import com.ss.android.vc.net.service.VideoChatUser;
import com.ss.android.vc.service.C63634c;
import com.ss.android.vc.statistics.event.C63742at;
import com.ss.android.vc.statistics.event.ax;
import com.ss.android.vc.statistics.event.bj;
import com.ss.android.vc.trace.C63784a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002¸\u0001B%\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010i\u001a\u00020jH\u0016J\u0018\u0010k\u001a\u00020j2\u0006\u0010l\u001a\u00020A2\u0006\u0010m\u001a\u00020nH\u0016J\u0010\u0010o\u001a\u00020j2\b\u0010p\u001a\u0004\u0018\u00010nJ\u0006\u0010q\u001a\u00020jJ\b\u0010r\u001a\u00020\u001fH\u0016J\b\u0010s\u001a\u00020\u001fH\u0016J\u0010\u0010t\u001a\u00020j2\u0006\u0010u\u001a\u00020vH\u0016J\u0006\u0010w\u001a\u00020jJ\u0006\u0010x\u001a\u00020jJ\u000e\u0010x\u001a\u00020j2\u0006\u0010y\u001a\u00020\u001fJ\b\u0010z\u001a\u00020vH\u0016J\u0012\u0010{\u001a\u0004\u0018\u00010n2\u0006\u0010|\u001a\u00020\fH\u0016J\n\u0010}\u001a\u0004\u0018\u00010nH\u0004J\u0006\u0010~\u001a\u00020\u001fJ\b\u0010\u001a\u00020jH\u0016J\t\u0010\u0001\u001a\u00020jH\u0016J\u0007\u0010\u0001\u001a\u00020\u001fJ\t\u0010\u0001\u001a\u00020\u001fH\u0002J\t\u0010\u0001\u001a\u00020\u001fH\u0016J\u0007\u0010\u0001\u001a\u00020\u001fJ\t\u0010\u0001\u001a\u00020\u001fH\u0002J\t\u0010\u0001\u001a\u00020\u001fH\u0002J\u0007\u0010\u0001\u001a\u00020\u001fJ\t\u0010\u0001\u001a\u00020\u001fH\u0002J\t\u0010\u0001\u001a\u00020\u001fH\u0016J\t\u0010\u0001\u001a\u00020jH\u0002J\t\u0010\u0001\u001a\u00020jH\u0014J\t\u0010\u0001\u001a\u00020jH\u0014J\u001b\u0010\u0001\u001a\u00020j2\u0007\u0010\u0001\u001a\u00020\t2\u0007\u0010\u0001\u001a\u00020\tH\u0014J\t\u0010\u0001\u001a\u00020jH\u0016J\t\u0010\u0001\u001a\u00020jH\u0016J\t\u0010\u0001\u001a\u00020\u001fH\u0002J\t\u0010\u0001\u001a\u00020\u001fH\u0002J\t\u0010\u0001\u001a\u00020jH\u0002J\t\u0010\u0001\u001a\u00020\u001fH\u0002J\t\u0010\u0001\u001a\u00020jH\u0016J\t\u0010\u0001\u001a\u00020jH\u0002J\t\u0010\u0001\u001a\u00020jH\u0002J\t\u0010\u0001\u001a\u00020jH\u0016J\t\u0010\u0001\u001a\u00020jH\u0002J\u001d\u0010\u0001\u001a\u00020j2\t\u0010\u0001\u001a\u0004\u0018\u00010!2\u0007\u0010\u0001\u001a\u00020\u001fH\u0016J\t\u0010\u0001\u001a\u00020\u001fH\u0016J\t\u0010\u0001\u001a\u00020jH\u0002J\t\u0010 \u0001\u001a\u00020\u001fH\u0016J\u0015\u0010¡\u0001\u001a\u00020j2\n\u0010¢\u0001\u001a\u0005\u0018\u00010£\u0001H\u0016J\u0012\u0010¤\u0001\u001a\u00020j2\u0007\u0010¥\u0001\u001a\u00020\tH\u0016J\u001d\u0010¦\u0001\u001a\u00020j2\t\u0010§\u0001\u001a\u0004\u0018\u00010\f2\u0007\u0010¥\u0001\u001a\u00020\tH\u0016J\u0007\u0010¨\u0001\u001a\u00020jJ\t\u0010©\u0001\u001a\u00020jH\u0016J\u0012\u0010ª\u0001\u001a\u00020j2\u0007\u0010«\u0001\u001a\u00020\u001fH\u0016J\u0012\u0010¬\u0001\u001a\u00020j2\u0007\u0010­\u0001\u001a\u00020\u001fH\u0002J\t\u0010®\u0001\u001a\u00020jH\u0016J\t\u0010¯\u0001\u001a\u00020jH\u0016J\u0012\u0010°\u0001\u001a\u00020j2\u0007\u0010­\u0001\u001a\u00020\u001fH\u0002J\t\u0010±\u0001\u001a\u00020jH\u0016J\u0013\u0010²\u0001\u001a\u00020j2\b\u0010³\u0001\u001a\u00030´\u0001H\u0016J\u0012\u0010µ\u0001\u001a\u00020j2\u0007\u0010¶\u0001\u001a\u00020PH\u0002J\t\u0010·\u0001\u001a\u00020\u001fH\u0016R\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010 \u001a\u0004\u0018\u00010!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001c\u0010&\u001a\u0004\u0018\u00010!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010#\"\u0004\b(\u0010%R\u001c\u0010)\u001a\u0004\u0018\u00010!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010#\"\u0004\b+\u0010%R\u001a\u0010,\u001a\u00020\fX.¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u000e\"\u0004\b.\u0010\u0010R\u001a\u0010/\u001a\u00020\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u00104\u001a\u00020\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00101\"\u0004\b6\u00103R\u001c\u00107\u001a\u0004\u0018\u00010!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010#\"\u0004\b9\u0010%R\u001a\u0010:\u001a\u00020;X.¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001a\u0010@\u001a\u00020AX.¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001c\u0010F\u001a\u0004\u0018\u00010GX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001c\u0010L\u001a\u0004\u0018\u00010!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010#\"\u0004\bN\u0010%R\u001a\u0010O\u001a\u00020PX.¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010U\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u000e\u0010[\u001a\u00020\u001fX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\\\u001a\u0004\u0018\u00010]X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u000e\u0010b\u001a\u00020cX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010d\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\be\u0010fR\u000e\u0010g\u001a\u00020hX\u0004¢\u0006\u0002\n\u0000¨\u0006¹\u0001"}, d2 = {"Lcom/ss/android/vc/meeting/module/multi/InMeetingGridView;", "Landroid/widget/FrameLayout;", "Lcom/ss/android/vc/meeting/module/netquality/AbsNetworkQualityControl$INetQualityViewControlListener;", "Lcom/ss/android/vc/common/utils/VCToastUtils$IVCToastListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "TAG", "", "getTAG", "()Ljava/lang/String;", "setTAG", "(Ljava/lang/String;)V", "asSpeakerListener", "Lcom/ss/android/vc/meeting/utils/ActiveSpeakerCalculator$ActiveSpeakerSpeakListener;", "getAsSpeakerListener", "()Lcom/ss/android/vc/meeting/utils/ActiveSpeakerCalculator$ActiveSpeakerSpeakListener;", "setAsSpeakerListener", "(Lcom/ss/android/vc/meeting/utils/ActiveSpeakerCalculator$ActiveSpeakerSpeakListener;)V", "lastAsSpeakTime", "", "getLastAsSpeakTime", "()J", "setLastAsSpeakTime", "(J)V", "m1v1ConnectingObserver", "Landroidx/lifecycle/Observer;", "", "mAsHintView", "Landroid/view/View;", "getMAsHintView", "()Landroid/view/View;", "setMAsHintView", "(Landroid/view/View;)V", "mBtnCancel", "getMBtnCancel", "setMBtnCancel", "mBtnShadowLayoutView", "getMBtnShadowLayoutView", "setMBtnShadowLayoutView", "mGridId", "getMGridId", "setMGridId", "mIsBind", "getMIsBind", "()Z", "setMIsBind", "(Z)V", "mIsSame", "getMIsSame", "setMIsSame", "mLottieView", "getMLottieView", "setMLottieView", "mMeeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "getMMeeting", "()Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "setMMeeting", "(Lcom/ss/android/vc/meeting/framework/meeting/Meeting;)V", "mPresenter", "Lcom/ss/android/vc/meeting/module/multi/presenter/InMeetingPresenter;", "getMPresenter", "()Lcom/ss/android/vc/meeting/module/multi/presenter/InMeetingPresenter;", "setMPresenter", "(Lcom/ss/android/vc/meeting/module/multi/presenter/InMeetingPresenter;)V", "mRootView", "Landroid/view/ViewGroup;", "getMRootView", "()Landroid/view/ViewGroup;", "setMRootView", "(Landroid/view/ViewGroup;)V", "mSurface", "getMSurface", "setMSurface", "mUser", "Lcom/ss/android/vc/net/service/VideoChatUser;", "getMUser", "()Lcom/ss/android/vc/net/service/VideoChatUser;", "setMUser", "(Lcom/ss/android/vc/net/service/VideoChatUser;)V", "netQualityListenerRef", "Ljava/lang/ref/WeakReference;", "getNetQualityListenerRef", "()Ljava/lang/ref/WeakReference;", "setNetQualityListenerRef", "(Ljava/lang/ref/WeakReference;)V", "pendingRemove", "popWindow", "Lcom/ss/android/vc/meeting/module/meetingdialog/participantmanage/popupwindow/InMeetingParticipantControlPopWindow;", "getPopWindow", "()Lcom/ss/android/vc/meeting/module/meetingdialog/participantmanage/popupwindow/InMeetingParticipantControlPopWindow;", "setPopWindow", "(Lcom/ss/android/vc/meeting/module/meetingdialog/participantmanage/popupwindow/InMeetingParticipantControlPopWindow;)V", "removeTask", "Ljava/lang/Runnable;", "shadow", "getShadow", "()I", "surfaceHandler", "Landroid/os/Handler;", "adjustLayoutForGallery", "", "bindData", "presenter", "meetingGridModel", "Lcom/ss/android/vc/meeting/module/multi/presenter/MeetingGridModel;", "bindSurface", "model", "cancelAnimation", "checkNeedUpdateAs", "checkNeedUpdateUserInfo", "clipSurfaceCorner", "clipSize", "", "createSurfaceIfNeed", "destroy", "remove", "getClipRadius", "getGridModelById", "gridId", "gridModel", "hasCancelCallPermission", "hideLocalPoorQuality", "inflateGridView", "isCameraMuted", "isCoHost", "isFrozen", "isGridValid", "isHost", "isMyRoleInterviewee", "isSelfCameraUnavailable", "isSelfMicUnavailable", "isShowing", "loadAvatarImage", "onAttachedToWindow", "onDetachedFromWindow", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onVcToastShow", "refreshActiveState", "refreshAudioState", "refreshCallingStatus", "refreshNickName", "refreshShareIcon", "refreshUIState", "refreshUserName", "refreshVideoState", "remeasureAsHint", "remove1v1ConnectingObserver", "setOnTheCallStatusInfoBg", "view", "fillParent", "shouldShowCancel", "show1v1Connecting", "showDoubleTapTip", "showFullScreenVideo", "participant", "Lcom/ss/android/vc/entity/Participant;", "showLocalPoorNetQuality", "quality", "showRemotePoorNetQuality", "rtcJoinId", "unbindSurface", "updateActionMore", "updateAsHintVisibility", "visible", "updateAvatarContainer", "show", "updateAvatarImageSize", "updateCameraUnavailableSize", "updateNetWeakIcon", "updateSwitchCamera", "updateUserInfoBackground", "textView", "Landroid/widget/TextView;", "updateVideoChatUser", "user", "videoStreamInvalid", "WeakRtcEglRenderListener", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public class InMeetingGridView extends FrameLayout implements C60738ac.AbstractC60739a, AbstractC61994a.AbstractC61995a {

    /* renamed from: a */
    public VideoChatUser f157101a;

    /* renamed from: b */
    public String f157102b;

    /* renamed from: c */
    public InMeetingPresenter f157103c;

    /* renamed from: d */
    public C61303k f157104d;

    /* renamed from: e */
    public boolean f157105e;

    /* renamed from: f */
    private String f157106f;

    /* renamed from: g */
    private ViewGroup f157107g;

    /* renamed from: h */
    private View f157108h;

    /* renamed from: i */
    private View f157109i;

    /* renamed from: j */
    private View f157110j;

    /* renamed from: k */
    private View f157111k;

    /* renamed from: l */
    private WeakReference<AbstractC61994a.AbstractC61995a> f157112l;

    /* renamed from: m */
    private long f157113m;

    /* renamed from: n */
    private AbstractC1178x<Boolean> f157114n;

    /* renamed from: o */
    private final int f157115o;

    /* renamed from: p */
    private InMeetingParticipantControlPopWindow f157116p;

    /* renamed from: q */
    private View f157117q;

    /* renamed from: r */
    private boolean f157118r;

    /* renamed from: s */
    private boolean f157119s;

    /* renamed from: t */
    private ActiveSpeakerCalculator.ActiveSpeakerSpeakListener f157120t;

    /* renamed from: u */
    private final Handler f157121u;

    /* renamed from: v */
    private final Runnable f157122v;

    /* renamed from: w */
    private HashMap f157123w;

    public InMeetingGridView(Context context) {
        this(context, null, 0, 6, null);
    }

    public InMeetingGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public View mo214298a(int i) {
        if (this.f157123w == null) {
            this.f157123w = new HashMap();
        }
        View view = (View) this.f157123w.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f157123w.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.vc.meeting.module.p3129j.AbstractC61994a.AbstractC61995a
    /* renamed from: c */
    public void mo213812c(int i) {
    }

    public double getClipRadius() {
        return 10.5d;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0013H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR(\u0010\u000b\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\u00030\u00030\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, d2 = {"Lcom/ss/android/vc/meeting/module/multi/InMeetingGridView$WeakRtcEglRenderListener;", "Lcom/ss/android/vc/irtc/IRtcEglRenderListener;", "gridView", "Lcom/ss/android/vc/meeting/module/multi/InMeetingGridView;", "(Lcom/ss/android/vc/meeting/module/multi/InMeetingGridView;)V", "TAG", "", "getTAG", "()Ljava/lang/String;", "setTAG", "(Ljava/lang/String;)V", "mReference", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "getMReference", "()Ljava/lang/ref/WeakReference;", "setMReference", "(Ljava/lang/ref/WeakReference;)V", "onBeginRender", "", "onEndRender", "onRenderFrame", "onVideoFrameSizeChanged", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.InMeetingGridView$a */
    public static final class WeakRtcEglRenderListener implements AbstractC61030i {

        /* renamed from: a */
        private String f157124a = "WeakRtcEglRenderListener";

        /* renamed from: b */
        private WeakReference<InMeetingGridView> f157125b;

        @Override // com.ss.android.vc.irtc.AbstractC61030i
        /* renamed from: c */
        public void mo210660c() {
        }

        @Override // com.ss.android.vc.irtc.AbstractC61030i
        /* renamed from: d */
        public void mo210661d() {
        }

        /* renamed from: e */
        public final String mo215962e() {
            return this.f157124a;
        }

        /* renamed from: f */
        public final WeakReference<InMeetingGridView> mo215963f() {
            return this.f157125b;
        }

        @Override // com.ss.android.vc.irtc.AbstractC61030i
        /* renamed from: a */
        public void mo210658a() {
            C60700b.m235851b(this.f157124a, "[onBeginRender]", "start");
            C26171w.m94675a(new RunnableC62459a(this));
        }

        @Override // com.ss.android.vc.irtc.AbstractC61030i
        /* renamed from: b */
        public void mo210659b() {
            C60700b.m235851b(this.f157124a, "[onEndRender]", "start");
            C26171w.m94675a(new RunnableC62460b(this));
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.multi.InMeetingGridView$a$b */
        static final class RunnableC62460b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ WeakRtcEglRenderListener f157127a;

            RunnableC62460b(WeakRtcEglRenderListener aVar) {
                this.f157127a = aVar;
            }

            public final void run() {
                InMeetingGridView inMeetingGridView = this.f157127a.mo215963f().get();
                if (inMeetingGridView != null && inMeetingGridView.mo215958w()) {
                    if (inMeetingGridView.mo215936q()) {
                        inMeetingGridView.mo215913b(false);
                    } else {
                        inMeetingGridView.mo215913b(true);
                    }
                    C60700b.m235851b(this.f157127a.mo215962e(), "[onEndRender2]", "Video surface invisible!");
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.multi.InMeetingGridView$a$a */
        static final class RunnableC62459a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ WeakRtcEglRenderListener f157126a;

            RunnableC62459a(WeakRtcEglRenderListener aVar) {
                this.f157126a = aVar;
            }

            public final void run() {
                Integer num;
                InMeetingGridView inMeetingGridView = this.f157126a.mo215963f().get();
                if (inMeetingGridView != null && inMeetingGridView.mo215958w()) {
                    if (inMeetingGridView.mo215957v()) {
                        inMeetingGridView.mo215913b(true);
                        C60700b.m235864f(this.f157126a.mo215962e(), "[onBeginRender2]", "onBeginRender: camera is muted");
                        return;
                    }
                    inMeetingGridView.mo215913b(false);
                    String e = this.f157126a.mo215962e();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Avatar gone!, ");
                    View mSurface = inMeetingGridView.getMSurface();
                    if (mSurface != null) {
                        num = Integer.valueOf(mSurface.hashCode());
                    } else {
                        num = null;
                    }
                    sb.append(num);
                    C60700b.m235851b(e, "[onBeginRender3]", sb.toString());
                }
            }
        }

        public WeakRtcEglRenderListener(InMeetingGridView inMeetingGridView) {
            Intrinsics.checkParameterIsNotNull(inMeetingGridView, "gridView");
            this.f157125b = new WeakReference<>(inMeetingGridView);
        }
    }

    @Override // com.ss.android.vc.common.p3083e.C60738ac.AbstractC60739a
    /* renamed from: a */
    public void mo208364a() {
        mo213817k();
    }

    public final ActiveSpeakerCalculator.ActiveSpeakerSpeakListener getAsSpeakerListener() {
        return this.f157120t;
    }

    public final long getLastAsSpeakTime() {
        return this.f157113m;
    }

    public final View getMAsHintView() {
        return this.f157109i;
    }

    public final View getMBtnCancel() {
        return this.f157110j;
    }

    public final View getMBtnShadowLayoutView() {
        return this.f157111k;
    }

    public final boolean getMIsBind() {
        return this.f157119s;
    }

    public final boolean getMIsSame() {
        return this.f157118r;
    }

    public final View getMLottieView() {
        return this.f157108h;
    }

    public final ViewGroup getMRootView() {
        return this.f157107g;
    }

    public final View getMSurface() {
        return this.f157117q;
    }

    public final WeakReference<AbstractC61994a.AbstractC61995a> getNetQualityListenerRef() {
        return this.f157112l;
    }

    public final InMeetingParticipantControlPopWindow getPopWindow() {
        return this.f157116p;
    }

    public final int getShadow() {
        return this.f157115o;
    }

    public String getTAG() {
        return this.f157106f;
    }

    /* renamed from: a */
    public void mo214303a(boolean z) {
        if (z) {
            if (this.f157109i == null) {
                C60740ad.m236052b((ViewStub) findViewById(R.id.stub_as_hint));
                this.f157109i = mo214298a(R.id.view_as_hint_border);
            }
            View view = this.f157109i;
            if (view != null) {
                C60752f.m236079a(view);
                return;
            }
            return;
        }
        View view2 = this.f157109i;
        if (view2 != null && view2 != null) {
            C60752f.m236083c(view2);
        }
    }

    /* renamed from: a */
    public final void mo215912a(VideoChatUser videoChatUser) {
        C63784a.m250428a("[VideoChat_InMeetingGridView_updateVideoChatUser]");
        this.f157101a = videoChatUser;
        m244119G();
        m244117E();
        C63784a.m250429b("[VideoChat_InMeetingGridView_updateVideoChatUser]");
    }

    /* renamed from: b */
    public boolean mo214304b() {
        return isAttachedToWindow();
    }

    /* renamed from: j */
    public boolean mo214314j() {
        return mo215956u();
    }

    /* renamed from: y */
    public final void mo215960y() {
        mo215914c(false);
    }

    public final String getMGridId() {
        String str = this.f157102b;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGridId");
        }
        return str;
    }

    public final C61303k getMMeeting() {
        C61303k kVar = this.f157104d;
        if (kVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMeeting");
        }
        return kVar;
    }

    public final InMeetingPresenter getMPresenter() {
        InMeetingPresenter bVar = this.f157103c;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
        }
        return bVar;
    }

    public final VideoChatUser getMUser() {
        VideoChatUser videoChatUser = this.f157101a;
        if (videoChatUser == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUser");
        }
        return videoChatUser;
    }

    /* renamed from: p */
    public boolean mo215935p() {
        ViewGroup viewGroup = this.f157107g;
        if (viewGroup == null) {
            Intrinsics.throwNpe();
        }
        return viewGroup.isAttachedToWindow();
    }

    /* renamed from: A */
    private final boolean m244113A() {
        C62526c x = mo215959x();
        if (x == null || !x.mo216207l() || C60788y.m236250b(getContext())) {
            return false;
        }
        return true;
    }

    /* renamed from: D */
    private final boolean m244116D() {
        C62526c x;
        if (!mo215958w()) {
            return false;
        }
        C62526c x2 = mo215959x();
        if ((x2 == null || x2.mo216205j()) && (x = mo215959x()) != null) {
            return x.mo216204i();
        }
        return false;
    }

    /* renamed from: d */
    public boolean mo214306d() {
        C61303k kVar = this.f157104d;
        if (kVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMeeting");
        }
        AbstractC62485a az = kVar.az();
        Intrinsics.checkExpressionValueIsNotNull(az, "mMeeting.fullScreenVideoControl");
        return az.mo216034a();
    }

    /* renamed from: f */
    public boolean mo214308f() {
        MeetingPageModel e;
        C62526c x = mo215959x();
        if (x == null || (e = x.mo216200e()) == null) {
            return false;
        }
        return e.mo216180d();
    }

    /* renamed from: g */
    public void mo214309g() {
        ViewGroup viewGroup;
        if (mo215958w() && (viewGroup = this.f157107g) != null && viewGroup != null) {
            viewGroup.post(new RunnableC62475p(this));
        }
    }

    /* renamed from: m */
    public void mo214316m() {
        ViewGroup viewGroup;
        if (mo215958w() && (viewGroup = this.f157107g) != null && viewGroup != null) {
            viewGroup.post(new RunnableC62476q(this));
        }
    }

    /* renamed from: n */
    public boolean mo214317n() {
        C61303k kVar = this.f157104d;
        if (kVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMeeting");
        }
        if (kVar.aw().mo216149e() <= 2) {
            return false;
        }
        C60738ac.m236037c((int) R.string.View_G_DoubleTapToViewInFullScreen);
        return true;
    }

    /* renamed from: q */
    public final boolean mo215936q() {
        C62526c x = mo215959x();
        if (x == null || !x.mo216207l() || C60788y.m236247a(getContext())) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    public final void mo215955t() {
        View view = this.f157117q;
        if (view != null) {
            C61303k kVar = this.f157104d;
            if (kVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMeeting");
            }
            kVar.mo212102T().mo212207a(view);
        }
        this.f157119s = false;
    }

    /* renamed from: w */
    public final boolean mo215958w() {
        if (this.f157102b == null) {
            return false;
        }
        String str = this.f157102b;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGridId");
        }
        if (mo214299a(str) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public final C62526c mo215959x() {
        if (!mo215958w()) {
            return null;
        }
        String str = this.f157102b;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGridId");
        }
        return mo214299a(str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/vc/meeting/module/multi/InMeetingGridView$bindData$4", "Lcom/ss/android/vc/meeting/module/interfaces/IOnDoubleTapListener;", "onDoubleTap", "", "onSingleTap", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.InMeetingGridView$e */
    public static final class C62464e extends AbstractView$OnClickListenerC61654c {

        /* renamed from: b */
        final /* synthetic */ InMeetingGridView f157133b;

        /* renamed from: c */
        final /* synthetic */ C62526c f157134c;

        @Override // com.ss.android.vc.meeting.module.p3119f.AbstractView$OnClickListenerC61654c
        /* renamed from: a */
        public void mo213554a() {
            Participant participant;
            if (this.f157133b.mo215958w()) {
                String tag = this.f157133b.getTAG();
                C60700b.m235851b(tag, "[setOnClickListener]", "click into fullscreen, deviceId = " + this.f157134c.mo216202g());
                InMeetingGridView inMeetingGridView = this.f157133b;
                C62526c x = inMeetingGridView.mo215959x();
                if (x != null) {
                    participant = x.mo216208m();
                } else {
                    participant = null;
                }
                inMeetingGridView.mo214302a(participant);
            }
        }

        @Override // com.ss.android.vc.meeting.module.p3119f.AbstractView$OnClickListenerC61654c
        /* renamed from: b */
        public void mo213555b() {
            if (this.f157133b.mo215958w()) {
                String tag = this.f157133b.getTAG();
                C60700b.m235851b(tag, "[setOnClickListener2]", "single click tip, deviceId = " + this.f157134c.mo216202g());
                C61383d I = this.f157133b.getMMeeting().mo212091I();
                Intrinsics.checkExpressionValueIsNotNull(I, "mMeeting.meetingData");
                if (!I.mo212502i()) {
                    C61383d I2 = this.f157133b.getMMeeting().mo212091I();
                    Intrinsics.checkExpressionValueIsNotNull(I2, "mMeeting.meetingData");
                    I2.mo212493a(this.f157133b.mo214317n());
                }
            }
        }

        C62464e(InMeetingGridView inMeetingGridView, C62526c cVar) {
            this.f157133b = inMeetingGridView;
            this.f157134c = cVar;
        }
    }

    /* renamed from: J */
    private final boolean m244122J() {
        C61303k kVar = this.f157104d;
        if (kVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMeeting");
        }
        if (kVar.mo212090H() == VideoChat.MeetingSource.VC_FROM_INTERVIEW) {
            C61303k kVar2 = this.f157104d;
            if (kVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMeeting");
            }
            if (kVar2.mo212089G() == ParticipantRole.INTERVIEWEE) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: M */
    private final void m244125M() {
        InMeetingPresenter bVar = this.f157103c;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
        }
        C61303k meeting = bVar.getMeeting();
        if (this.f157114n != null) {
            Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
            LiveData<Boolean> v = meeting.mo212092J().mo212572v();
            AbstractC1178x<Boolean> xVar = this.f157114n;
            if (xVar == null) {
                Intrinsics.throwNpe();
            }
            v.mo5928b(xVar);
        }
    }

    /* renamed from: l */
    public void mo214315l() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.view_in_meeting_grid, (ViewGroup) this, true);
        if (inflate != null) {
            this.f157107g = (ViewGroup) inflate;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* renamed from: o */
    public boolean mo214318o() {
        if (mo215959x() == null) {
            return true;
        }
        boolean q = mo215936q();
        if (mo215957v() || !mo214308f() || q) {
            return true;
        }
        C61303k kVar = this.f157104d;
        if (kVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMeeting");
        }
        if (kVar.aE().mo208293c()) {
            C61303k kVar2 = this.f157104d;
            if (kVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMeeting");
            }
            if (!kVar2.aE().mo208292b()) {
                return true;
            }
        }
        return false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.InMeetingGridView$l */
    static final class RunnableC62471l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InMeetingGridView f157143a;

        RunnableC62471l(InMeetingGridView inMeetingGridView) {
            this.f157143a = inMeetingGridView;
        }

        public final void run() {
            Integer num;
            FrameLayout frameLayout;
            String tag = this.f157143a.getTAG();
            StringBuilder sb = new StringBuilder();
            sb.append("surface = ");
            View mSurface = this.f157143a.getMSurface();
            if (mSurface != null) {
                num = Integer.valueOf(mSurface.hashCode());
            } else {
                num = null;
            }
            sb.append(num);
            C60700b.m235851b(tag, "[removeTask]", sb.toString());
            this.f157143a.f157105e = false;
            ViewGroup mRootView = this.f157143a.getMRootView();
            if (mRootView != null && (frameLayout = (FrameLayout) mRootView.findViewById(R.id.container_surface)) != null) {
                frameLayout.removeAllViews();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0046, code lost:
        if (r0.isGuest() == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005f, code lost:
        if (r0.getParticipantRole() == com.ss.android.vc.entity.ParticipantRole.INTERVIEWEE) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0065, code lost:
        if (r0.isGuest() != false) goto L_0x0068;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006b  */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m244120H() {
        /*
        // Method dump skipped, instructions count: 123
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.multi.InMeetingGridView.m244120H():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m244121I() {
        /*
            r5 = this;
            boolean r0 = r5.mo215958w()
            java.lang.String r1 = "mMeeting"
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0038
            com.ss.android.vc.meeting.module.multi.presenter.c r0 = r5.mo215959x()
            if (r0 == 0) goto L_0x0015
            com.ss.android.vc.entity.Participant r0 = r0.mo216208m()
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            if (r0 == 0) goto L_0x0038
            boolean r0 = r0.isCoHost()
            if (r0 != r3) goto L_0x0038
            com.ss.android.vc.meeting.framework.meeting.k r0 = r5.f157104d
            if (r0 != 0) goto L_0x0025
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0025:
            com.ss.android.vc.entity.VideoChat r0 = r0.mo212056e()
            java.lang.String r4 = "mMeeting.videoChat"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r4)
            com.ss.android.vc.entity.VideoChat$Type r0 = r0.getType()
            com.ss.android.vc.entity.VideoChat$Type r4 = com.ss.android.vc.entity.VideoChat.Type.MEET
            if (r0 != r4) goto L_0x0038
            r0 = 1
            goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            if (r0 == 0) goto L_0x0049
            com.ss.android.vc.meeting.framework.meeting.k r0 = r5.f157104d
            if (r0 != 0) goto L_0x0042
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0042:
            boolean r0 = r0.mo212098P()
            if (r0 != 0) goto L_0x0049
            r2 = 1
        L_0x0049:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.multi.InMeetingGridView.m244121I():boolean");
    }

    /* renamed from: c */
    public void mo214305c() {
        UserInfoStatusLayout userInfoStatusLayout;
        UserInfoStatusLayout userInfoStatusLayout2;
        UserInfoStatusLayout userInfoStatusLayout3;
        UserInfoStatusLayout userInfoStatusLayout4;
        UserInfoStatusLayout userInfoStatusLayout5;
        ViewGroup viewGroup = this.f157107g;
        if (!(viewGroup == null || (userInfoStatusLayout5 = (UserInfoStatusLayout) viewGroup.findViewById(R.id.tv_user_info_status_onthecall)) == null)) {
            userInfoStatusLayout5.setTextSize(12.0f);
        }
        ViewGroup viewGroup2 = this.f157107g;
        if (!(viewGroup2 == null || (userInfoStatusLayout4 = (UserInfoStatusLayout) viewGroup2.findViewById(R.id.tv_user_info_status_onthecall)) == null)) {
            userInfoStatusLayout4.setMUdIconSize(16.0f);
        }
        ViewGroup viewGroup3 = this.f157107g;
        if (!(viewGroup3 == null || (userInfoStatusLayout3 = (UserInfoStatusLayout) viewGroup3.findViewById(R.id.tv_user_info_status_onthecall)) == null)) {
            userInfoStatusLayout3.setTextPadding(C60773o.m236115a(5.0d));
        }
        ViewGroup viewGroup4 = this.f157107g;
        if (!(viewGroup4 == null || (userInfoStatusLayout2 = (UserInfoStatusLayout) viewGroup4.findViewById(R.id.tv_user_info_status_onthecall)) == null)) {
            userInfoStatusLayout2.setHostTextViewBgRes(R.drawable.vc_bg_user_info_host_grid);
        }
        ViewGroup viewGroup5 = this.f157107g;
        if (viewGroup5 != null && (userInfoStatusLayout = (UserInfoStatusLayout) viewGroup5.findViewById(R.id.tv_user_info_status_onthecall)) != null) {
            userInfoStatusLayout.setIconMargin(C60773o.m236115a(2.0d));
        }
    }

    @Override // com.ss.android.vc.meeting.module.p3129j.AbstractC61994a.AbstractC61995a
    /* renamed from: k */
    public void mo213817k() {
        Participant participant;
        Participant m;
        if (mo215958w()) {
            C62526c x = mo215959x();
            String str = null;
            if (x != null) {
                participant = x.mo216208m();
            } else {
                participant = null;
            }
            if (participant != null) {
                C62526c x2 = mo215959x();
                if (x2 == null || x2.mo216205j()) {
                    C61303k kVar = this.f157104d;
                    if (kVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mMeeting");
                    }
                    AbstractC61994a an = kVar.an();
                    Intrinsics.checkExpressionValueIsNotNull(an, "mMeeting.netQualityControl");
                    String a = an.mo214601a();
                    C62526c x3 = mo215959x();
                    if (!(x3 == null || (m = x3.mo216208m()) == null)) {
                        str = m.getRtcJoinId();
                    }
                    if (Intrinsics.areEqual(a, str)) {
                        m244126d(false);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        String str;
        int i;
        FrameLayout frameLayout;
        Participant m;
        super.onAttachedToWindow();
        if (this.f157117q != null) {
            C62526c x = mo215959x();
            boolean v = mo215957v();
            String tag = getTAG();
            StringBuilder sb = new StringBuilder();
            sb.append(v);
            sb.append(", onAttachedToWindow ");
            Boolean bool = null;
            if (x == null || (m = x.mo216208m()) == null) {
                str = null;
            } else {
                str = m.getRtcJoinId();
            }
            sb.append(str);
            sb.append(", ");
            sb.append("isSelf: ");
            if (x != null) {
                bool = Boolean.valueOf(x.mo216207l());
            }
            sb.append(bool);
            sb.append(", ");
            View view = this.f157117q;
            if (view != null) {
                i = view.hashCode();
            } else {
                i = 0;
            }
            sb.append(i);
            C60700b.m235851b(tag, "[onAttachedToWindow]", sb.toString());
            if (!v && x != null) {
                ViewGroup viewGroup = this.f157107g;
                if (!(viewGroup == null || (frameLayout = (FrameLayout) viewGroup.findViewById(R.id.container_surface)) == null)) {
                    C60752f.m236079a((View) frameLayout);
                }
                mo215911a(x);
            }
        }
    }

    /* renamed from: u */
    public final boolean mo215956u() {
        C61388g b;
        Participant j;
        String str;
        ParticipantType participantType;
        Participant m;
        Participant m2;
        Participant m3;
        C61303k kVar = this.f157104d;
        if (kVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMeeting");
        }
        C61383d I = kVar.mo212091I();
        if (I == null || (b = I.mo212494b()) == null || (j = b.mo212605j()) == null) {
            return false;
        }
        C62526c x = mo215959x();
        String str2 = null;
        if (x == null || (m3 = x.mo216208m()) == null) {
            str = null;
        } else {
            str = m3.getInviterId();
        }
        C62526c x2 = mo215959x();
        if (x2 == null || (m2 = x2.mo216208m()) == null) {
            participantType = null;
        } else {
            participantType = m2.getInviterType();
        }
        C62526c x3 = mo215959x();
        if (!(x3 == null || (m = x3.mo216208m()) == null)) {
            str2 = m.getInviterDeviceId();
        }
        if (!ParticipantUtil.m248722a(str, participantType, str2)) {
            C61303k kVar2 = this.f157104d;
            if (kVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMeeting");
            }
            if (kVar2.f153550c != VideoChat.Type.MEET) {
                return false;
            }
            if (j == null) {
                Intrinsics.throwNpe();
            }
            if (!j.isHostOrCoHost()) {
                return false;
            }
            C61303k kVar3 = this.f157104d;
            if (kVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMeeting");
            }
            if (!kVar3.mo212098P()) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public final boolean mo215957v() {
        boolean z;
        Participant participant;
        if (!mo215958w()) {
            return false;
        }
        C62526c x = mo215959x();
        if (x != null) {
            z = x.mo216203h();
        } else {
            z = true;
        }
        C62526c x2 = mo215959x();
        if (x2 == null || !x2.mo216205j()) {
            return z;
        }
        C62526c x3 = mo215959x();
        if (x3 != null) {
            participant = x3.mo216208m();
        } else {
            participant = null;
        }
        if (!ParticipantUtil.m248732c(participant)) {
            return z;
        }
        C61303k kVar = this.f157104d;
        if (kVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMeeting");
        }
        return kVar.mo212092J().mo212504A();
    }

    /* renamed from: z */
    public final void mo215961z() {
        ViewGroup viewGroup = this.f157107g;
        if (viewGroup != null) {
            if (viewGroup == null) {
                Intrinsics.throwNpe();
            }
            if (((LottieAnimationView) viewGroup.findViewById(R.id.lottie)) != null) {
                ViewGroup viewGroup2 = this.f157107g;
                if (viewGroup2 == null) {
                    Intrinsics.throwNpe();
                }
                LottieAnimationView lottieAnimationView = (LottieAnimationView) viewGroup2.findViewById(R.id.lottie);
                Intrinsics.checkExpressionValueIsNotNull(lottieAnimationView, "mRootView!!.lottie");
                if (lottieAnimationView.isAnimating()) {
                    C60700b.m235851b(getTAG(), "[cancelAnimation]", "cancelAnimation");
                    ViewGroup viewGroup3 = this.f157107g;
                    if (viewGroup3 == null) {
                        Intrinsics.throwNpe();
                    }
                    ((LottieAnimationView) viewGroup3.findViewById(R.id.lottie)).cancelAnimation();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.InMeetingGridView$p */
    public static final class RunnableC62475p implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InMeetingGridView f157147a;

        RunnableC62475p(InMeetingGridView inMeetingGridView) {
            this.f157147a = inMeetingGridView;
        }

        public final void run() {
            FrameLayout frameLayout;
            ConstraintLayout constraintLayout;
            ConstraintLayout constraintLayout2;
            if (this.f157147a.getMRootView() != null) {
                ViewGroup mRootView = this.f157147a.getMRootView();
                ConstraintLayout constraintLayout3 = null;
                if (mRootView != null) {
                    frameLayout = (FrameLayout) mRootView.findViewById(R.id.container);
                } else {
                    frameLayout = null;
                }
                if (frameLayout != null) {
                    ViewGroup mRootView2 = this.f157147a.getMRootView();
                    if (mRootView2 != null) {
                        constraintLayout = (ConstraintLayout) mRootView2.findViewById(R.id.container_avatar);
                    } else {
                        constraintLayout = null;
                    }
                    if (constraintLayout != null) {
                        ViewGroup mRootView3 = this.f157147a.getMRootView();
                        if (mRootView3 == null) {
                            Intrinsics.throwNpe();
                        }
                        FrameLayout frameLayout2 = (FrameLayout) mRootView3.findViewById(R.id.container);
                        Intrinsics.checkExpressionValueIsNotNull(frameLayout2, "mRootView!!.container");
                        int width = frameLayout2.getWidth();
                        ViewGroup mRootView4 = this.f157147a.getMRootView();
                        if (mRootView4 == null) {
                            Intrinsics.throwNpe();
                        }
                        FrameLayout frameLayout3 = (FrameLayout) mRootView4.findViewById(R.id.container);
                        Intrinsics.checkExpressionValueIsNotNull(frameLayout3, "mRootView!!.container");
                        int height = frameLayout3.getHeight();
                        C0689b bVar = new C0689b();
                        ViewGroup mRootView5 = this.f157147a.getMRootView();
                        if (mRootView5 != null) {
                            constraintLayout2 = (ConstraintLayout) mRootView5.findViewById(R.id.container_avatar);
                        } else {
                            constraintLayout2 = null;
                        }
                        bVar.mo3901b(constraintLayout2);
                        if (width < height) {
                            bVar.mo3887a(R.id.img_avatar, "H,1:1");
                            bVar.mo3887a(R.id.lottie, "H,1:1");
                        } else if (width > height) {
                            bVar.mo3887a(R.id.img_avatar, "W,1:1");
                            bVar.mo3887a(R.id.lottie, "W,1:1");
                        } else {
                            bVar.mo3887a(R.id.img_avatar, "H,1:1");
                            bVar.mo3887a(R.id.lottie, "H,1:1");
                        }
                        ViewGroup mRootView6 = this.f157147a.getMRootView();
                        if (mRootView6 != null) {
                            constraintLayout3 = (ConstraintLayout) mRootView6.findViewById(R.id.container_avatar);
                        }
                        bVar.mo3905c(constraintLayout3);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.InMeetingGridView$q */
    public static final class RunnableC62476q implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InMeetingGridView f157148a;

        RunnableC62476q(InMeetingGridView inMeetingGridView) {
            this.f157148a = inMeetingGridView;
        }

        public final void run() {
            FrameLayout frameLayout;
            ConstraintLayout constraintLayout;
            ConstraintLayout constraintLayout2;
            if (this.f157148a.getMRootView() != null) {
                ViewGroup mRootView = this.f157148a.getMRootView();
                ConstraintLayout constraintLayout3 = null;
                if (mRootView != null) {
                    frameLayout = (FrameLayout) mRootView.findViewById(R.id.container);
                } else {
                    frameLayout = null;
                }
                if (frameLayout != null) {
                    ViewGroup mRootView2 = this.f157148a.getMRootView();
                    if (mRootView2 != null) {
                        constraintLayout = (ConstraintLayout) mRootView2.findViewById(R.id.container_videocam);
                    } else {
                        constraintLayout = null;
                    }
                    if (constraintLayout != null) {
                        ViewGroup mRootView3 = this.f157148a.getMRootView();
                        if (mRootView3 == null) {
                            Intrinsics.throwNpe();
                        }
                        FrameLayout frameLayout2 = (FrameLayout) mRootView3.findViewById(R.id.container);
                        Intrinsics.checkExpressionValueIsNotNull(frameLayout2, "mRootView!!.container");
                        int width = frameLayout2.getWidth();
                        ViewGroup mRootView4 = this.f157148a.getMRootView();
                        if (mRootView4 == null) {
                            Intrinsics.throwNpe();
                        }
                        FrameLayout frameLayout3 = (FrameLayout) mRootView4.findViewById(R.id.container);
                        Intrinsics.checkExpressionValueIsNotNull(frameLayout3, "mRootView!!.container");
                        int height = frameLayout3.getHeight();
                        C0689b bVar = new C0689b();
                        ViewGroup mRootView5 = this.f157148a.getMRootView();
                        if (mRootView5 != null) {
                            constraintLayout2 = (ConstraintLayout) mRootView5.findViewById(R.id.container_videocam);
                        } else {
                            constraintLayout2 = null;
                        }
                        bVar.mo3901b(constraintLayout2);
                        if (width < height) {
                            bVar.mo3887a(R.id.camera_unavailable, "H,1:1");
                        } else if (width > height) {
                            bVar.mo3887a(R.id.camera_unavailable, "W,1:1");
                        } else {
                            bVar.mo3887a(R.id.camera_unavailable, "H,1:1");
                        }
                        ViewGroup mRootView6 = this.f157148a.getMRootView();
                        if (mRootView6 != null) {
                            constraintLayout3 = (ConstraintLayout) mRootView6.findViewById(R.id.container_videocam);
                        }
                        bVar.mo3905c(constraintLayout3);
                    }
                }
            }
        }
    }

    /* renamed from: E */
    private final void m244117E() {
        Participant participant;
        if (this.f157101a == null || !mo215958w() || this.f157107g == null) {
            C60700b.m235864f(getTAG(), "[loadAvatarImage]", "user = null");
            return;
        }
        mo214309g();
        C61303k kVar = this.f157104d;
        if (kVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMeeting");
        }
        C62526c x = mo215959x();
        if (x != null) {
            participant = x.mo216208m();
        } else {
            participant = null;
        }
        if (MeetingUtil.m238366a(kVar, participant)) {
            ViewGroup viewGroup = this.f157107g;
            if (viewGroup == null) {
                Intrinsics.throwNpe();
            }
            C60783v.m236226a((int) R.drawable.icon_interviewer_avatar, (LKUIRoundedImageView) viewGroup.findViewById(R.id.img_avatar));
            return;
        }
        int e = (int) (((double) C60776r.m236147e()) * 0.5d);
        int e2 = (int) (((double) C60776r.m236147e()) * 0.5d);
        VideoChatUser videoChatUser = this.f157101a;
        if (videoChatUser == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUser");
        }
        String avatarKey = videoChatUser.getAvatarKey();
        VideoChatUser videoChatUser2 = this.f157101a;
        if (videoChatUser2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUser");
        }
        String id = videoChatUser2.getId();
        VideoChatUser videoChatUser3 = this.f157101a;
        if (videoChatUser3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUser");
        }
        ParticipantType type = videoChatUser3.getType();
        ViewGroup viewGroup2 = this.f157107g;
        if (viewGroup2 == null) {
            Intrinsics.throwNpe();
        }
        C60783v.m236231a(avatarKey, id, type, (LKUIRoundedImageView) viewGroup2.findViewById(R.id.img_avatar), e2, e2, e, e);
    }

    /* renamed from: F */
    private final void m244118F() {
        Participant participant;
        ParticipantType participantType;
        ParticipantType participantType2;
        ParticipantType participantType3;
        if (this.f157101a != null) {
            C62526c x = mo215959x();
            ParticipantSettings participantSettings = null;
            if (x != null) {
                participant = x.mo216208m();
            } else {
                participant = null;
            }
            if ((participant == null || (participantType3 = participant.getParticipantType()) == null || !participantType3.isNewType()) && (participant == null || (participantType2 = participant.getParticipantType()) == null || !participantType2.isUnknownType())) {
                if (participant != null) {
                    participantType = participant.getParticipantType();
                } else {
                    participantType = null;
                }
                if (participantType != ParticipantType.NEO_USER) {
                    return;
                }
            }
            if (participant != null) {
                participantSettings = participant.getParticipantSettings();
            }
            if (participantSettings != null) {
                ParticipantSettings participantSettings2 = participant.getParticipantSettings();
                Intrinsics.checkExpressionValueIsNotNull(participantSettings2, "participant.participantSettings");
                if (!TextUtils.isEmpty(participantSettings2.getNickname())) {
                    ParticipantSettings participantSettings3 = participant.getParticipantSettings();
                    Intrinsics.checkExpressionValueIsNotNull(participantSettings3, "participant.participantSettings");
                    String nickname = participantSettings3.getNickname();
                    VideoChatUser videoChatUser = this.f157101a;
                    if (videoChatUser == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mUser");
                    }
                    if (videoChatUser != null) {
                        String str = nickname;
                        if (!TextUtils.isEmpty(str)) {
                            VideoChatUser videoChatUser2 = this.f157101a;
                            if (videoChatUser2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mUser");
                            }
                            if (!TextUtils.equals(str, videoChatUser2.getNickname())) {
                                VideoChatUser videoChatUser3 = this.f157101a;
                                if (videoChatUser3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("mUser");
                                }
                                videoChatUser3.setNickname(nickname);
                                m244119G();
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: K */
    private final boolean m244123K() {
        Participant participant;
        String str;
        String str2;
        ParticipantType participantType;
        Participant participant2;
        String str3;
        String str4;
        C61381c a;
        InMeetingData.ScreenSharedData f;
        C61381c a2;
        InMeetingData.ScreenSharedData f2;
        C61381c a3;
        InMeetingData.ScreenSharedData f3;
        if (!mo215958w()) {
            return false;
        }
        C62526c x = mo215959x();
        ParticipantType participantType2 = null;
        if (x != null) {
            participant = x.mo216208m();
        } else {
            participant = null;
        }
        C61303k kVar = this.f157104d;
        if (kVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMeeting");
        }
        C61383d I = kVar.mo212091I();
        if (I == null || (a3 = I.mo212490a()) == null || (f3 = a3.mo212474f()) == null) {
            str = null;
        } else {
            str = f3.getParticipantId();
        }
        C61303k kVar2 = this.f157104d;
        if (kVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMeeting");
        }
        C61383d I2 = kVar2.mo212091I();
        if (I2 == null || (a2 = I2.mo212490a()) == null || (f2 = a2.mo212474f()) == null) {
            str2 = null;
        } else {
            str2 = f2.getParticipantDeviceId();
        }
        C61303k kVar3 = this.f157104d;
        if (kVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMeeting");
        }
        C61383d I3 = kVar3.mo212091I();
        if (I3 == null || (a = I3.mo212490a()) == null || (f = a.mo212474f()) == null) {
            participantType = null;
        } else {
            participantType = f.getParticipantType();
        }
        boolean a4 = ParticipantUtil.m248717a(participant, str, str2, participantType);
        C62526c x2 = mo215959x();
        if (x2 != null) {
            participant2 = x2.mo216208m();
        } else {
            participant2 = null;
        }
        C61303k kVar4 = this.f157104d;
        if (kVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMeeting");
        }
        AbstractC61751a ab = kVar4.ab();
        Intrinsics.checkExpressionValueIsNotNull(ab, "mMeeting.followControl");
        FollowInfo h = ab.mo213882h();
        if (h != null) {
            str3 = h.getUserId();
        } else {
            str3 = null;
        }
        C61303k kVar5 = this.f157104d;
        if (kVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMeeting");
        }
        AbstractC61751a ab2 = kVar5.ab();
        Intrinsics.checkExpressionValueIsNotNull(ab2, "mMeeting.followControl");
        FollowInfo h2 = ab2.mo213882h();
        if (h2 != null) {
            str4 = h2.getDeviceId();
        } else {
            str4 = null;
        }
        C61303k kVar6 = this.f157104d;
        if (kVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMeeting");
        }
        AbstractC61751a ab3 = kVar6.ab();
        Intrinsics.checkExpressionValueIsNotNull(ab3, "mMeeting.followControl");
        FollowInfo h3 = ab3.mo213882h();
        if (h3 != null) {
            participantType2 = h3.getUserType();
        }
        boolean a5 = ParticipantUtil.m248717a(participant2, str3, str4, participantType2);
        if (a4 || a5) {
            return true;
        }
        return false;
    }

    /* renamed from: L */
    private final void m244124L() {
        TextView textView;
        int i;
        InMeetingPresenter bVar = this.f157103c;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
        }
        C61303k meeting = bVar.getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        if (meeting.mo212057f() == VideoChat.Type.CALL && C63634c.m249496b("byteview.call.android.status_connecting")) {
            Boolean b = meeting.mo212092J().mo212572v().mo5927b();
            String tag = getTAG();
            C60700b.m235851b(tag, "[show1v1Connecting]", "connected=" + b);
            ViewGroup viewGroup = this.f157107g;
            if (!(viewGroup == null || (textView = (TextView) viewGroup.findViewById(R.id.connecting_text)) == null)) {
                if (Intrinsics.areEqual((Object) b, (Object) true)) {
                    i = 8;
                } else {
                    i = 0;
                }
                textView.setVisibility(i);
            }
            this.f157114n = new C62472m(this);
            LiveData<Boolean> v = meeting.mo212092J().mo212572v();
            AbstractC1178x<Boolean> xVar = this.f157114n;
            if (xVar == null) {
                Intrinsics.throwNpe();
            }
            v.mo5925a(xVar);
            C60700b.m235851b(getTAG(), "[show1v1Connecting4]", "observeForever");
        }
    }

    /* renamed from: e */
    public void mo214307e() {
        ActiveSpeakerCalculator.ActiveSpeakerSpeakListener bVar;
        if (!mo215958w()) {
            C60700b.m235851b(getTAG(), "[refreshVideoState]", "Illegal grid.");
            return;
        }
        C61303k kVar = this.f157104d;
        if (kVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMeeting");
        }
        if (kVar.aE().mo208293c()) {
            C61303k kVar2 = this.f157104d;
            if (kVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMeeting");
            }
            if (!kVar2.aE().mo208292b()) {
                C61303k kVar3 = this.f157104d;
                if (kVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mMeeting");
                }
                ActiveSpeakerCalculator w = kVar3.mo212163w();
                if (w != null) {
                    bVar = w.mo219610d();
                } else {
                    bVar = null;
                }
                if (Intrinsics.areEqual(bVar, this.f157120t)) {
                    C61303k kVar4 = this.f157104d;
                    if (kVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mMeeting");
                    }
                    ActiveSpeakerCalculator w2 = kVar4.mo212163w();
                    if (w2 != null) {
                        w2.mo219602a((ActiveSpeakerCalculator.ActiveSpeakerSpeakListener) null);
                    }
                }
                mo214303a(false);
                return;
            }
        }
        C62526c x = mo215959x();
        if (x != null && x.mo216206k() && mo214308f()) {
            C61303k kVar5 = this.f157104d;
            if (kVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMeeting");
            }
            if (kVar5.aw().mo216149e() > 2) {
                C61303k kVar6 = this.f157104d;
                if (kVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mMeeting");
                }
                kVar6.mo212163w().mo219602a(this.f157120t);
                return;
            }
        }
        mo214303a(false);
    }

    /* renamed from: h */
    public void mo214312h() {
        VCShadowLayout vCShadowLayout;
        AppCompatImageView appCompatImageView;
        VCShadowLayout vCShadowLayout2;
        AppCompatImageView appCompatImageView2;
        Participant participant;
        int i;
        AppCompatImageView appCompatImageView3;
        ViewGroup viewGroup = this.f157107g;
        if (!(viewGroup == null || (appCompatImageView2 = (AppCompatImageView) viewGroup.findViewById(R.id.switch_camera)) == null)) {
            ControlOptionShowHelper aVar = ControlOptionShowHelper.f156623a;
            C61303k kVar = this.f157104d;
            if (kVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMeeting");
            }
            C62526c x = mo215959x();
            if (x != null) {
                participant = x.mo216208m();
            } else {
                participant = null;
            }
            if (aVar.mo215544b(kVar, participant, InMeetingParticipantControlPopWindow.GridType.GRID_VIEW)) {
                ViewGroup viewGroup2 = this.f157107g;
                if (!(viewGroup2 == null || (appCompatImageView3 = (AppCompatImageView) viewGroup2.findViewById(R.id.switch_camera)) == null)) {
                    appCompatImageView3.setOnClickListener(new C62477r(this));
                }
                i = 0;
            } else {
                i = 4;
            }
            appCompatImageView2.setVisibility(i);
        }
        ViewGroup viewGroup3 = this.f157107g;
        if (viewGroup3 == null || (appCompatImageView = (AppCompatImageView) viewGroup3.findViewById(R.id.switch_camera)) == null || appCompatImageView.getVisibility() != 0) {
            ViewGroup viewGroup4 = this.f157107g;
            if (viewGroup4 != null && (vCShadowLayout = (VCShadowLayout) viewGroup4.findViewById(R.id.switch_camera_shadow_layout)) != null) {
                vCShadowLayout.setVisibility(4);
                return;
            }
            return;
        }
        ViewGroup viewGroup5 = this.f157107g;
        if (viewGroup5 != null && (vCShadowLayout2 = (VCShadowLayout) viewGroup5.findViewById(R.id.switch_camera_shadow_layout)) != null) {
            vCShadowLayout2.setVisibility(0);
        }
    }

    /* renamed from: i */
    public void mo214313i() {
        VCShadowLayout vCShadowLayout;
        AppCompatImageView appCompatImageView;
        VCShadowLayout vCShadowLayout2;
        AppCompatImageView appCompatImageView2;
        Participant participant;
        int i;
        AppCompatImageView appCompatImageView3;
        ViewGroup viewGroup = this.f157107g;
        if (!(viewGroup == null || (appCompatImageView2 = (AppCompatImageView) viewGroup.findViewById(R.id.action_more)) == null)) {
            ControlOptionShowHelper aVar = ControlOptionShowHelper.f156623a;
            C61303k kVar = this.f157104d;
            if (kVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMeeting");
            }
            C62526c x = mo215959x();
            if (x != null) {
                participant = x.mo216208m();
            } else {
                participant = null;
            }
            if (aVar.mo215543a(kVar, participant, InMeetingParticipantControlPopWindow.GridType.GRID_VIEW)) {
                ViewGroup viewGroup2 = this.f157107g;
                if (!(viewGroup2 == null || (appCompatImageView3 = (AppCompatImageView) viewGroup2.findViewById(R.id.action_more)) == null)) {
                    appCompatImageView3.setOnClickListener(new C62474o(this));
                }
                i = 0;
            } else {
                i = 4;
            }
            appCompatImageView2.setVisibility(i);
        }
        ViewGroup viewGroup3 = this.f157107g;
        if (viewGroup3 == null || (appCompatImageView = (AppCompatImageView) viewGroup3.findViewById(R.id.action_more)) == null || appCompatImageView.getVisibility() != 0) {
            ViewGroup viewGroup4 = this.f157107g;
            if (viewGroup4 != null && (vCShadowLayout = (VCShadowLayout) viewGroup4.findViewById(R.id.action_more_shadow_layout)) != null) {
                vCShadowLayout.setVisibility(4);
                return;
            }
            return;
        }
        ViewGroup viewGroup5 = this.f157107g;
        if (viewGroup5 != null && (vCShadowLayout2 = (VCShadowLayout) viewGroup5.findViewById(R.id.action_more_shadow_layout)) != null) {
            vCShadowLayout2.setVisibility(0);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        String str;
        int i;
        Participant m;
        super.onDetachedFromWindow();
        if (this.f157117q != null) {
            if (getContext() instanceof Activity) {
                Context context = getContext();
                if (context == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
                } else if (((Activity) context).isFinishing()) {
                    C60700b.m235851b(getTAG(), "[onDetachedFromWindow]", "call destroy");
                    mo215960y();
                    return;
                }
            }
            C62526c x = mo215959x();
            String tag = getTAG();
            StringBuilder sb = new StringBuilder();
            Boolean bool = null;
            if (x == null || (m = x.mo216208m()) == null) {
                str = null;
            } else {
                str = m.getRtcJoinId();
            }
            sb.append(str);
            sb.append(", isSelf: ");
            if (x != null) {
                bool = Boolean.valueOf(x.mo216207l());
            }
            sb.append(bool);
            sb.append(", ");
            View view = this.f157117q;
            if (view != null) {
                i = view.hashCode();
            } else {
                i = 0;
            }
            sb.append(i);
            C60700b.m235851b(tag, "[onDetachedFromWindow2]", sb.toString());
            mo215955t();
        }
    }

    /* renamed from: r */
    public void mo215937r() {
        TruncatTextView truncatTextView;
        UserInfoStatusLayout userInfoStatusLayout;
        UserInfoStatusLayout userInfoStatusLayout2;
        TruncatTextView truncatTextView2;
        UserInfoStatusLayout userInfoStatusLayout3;
        if (mo214306d()) {
            C60700b.m235864f(getTAG(), "[refreshUIState]", "view is in frozen, return");
            return;
        }
        mo214313i();
        mo214312h();
        mo214307e();
        m244115C();
        boolean B = m244114B();
        boolean D = m244116D();
        boolean K = m244123K();
        if (B) {
            ViewGroup viewGroup = this.f157107g;
            if (!(viewGroup == null || (userInfoStatusLayout3 = (UserInfoStatusLayout) viewGroup.findViewById(R.id.tv_user_info_status_onthecall)) == null)) {
                C60752f.m236083c(userInfoStatusLayout3);
            }
            ViewGroup viewGroup2 = this.f157107g;
            if (viewGroup2 != null && (truncatTextView2 = (TruncatTextView) viewGroup2.findViewById(R.id.tv_user_info_status_calling)) != null) {
                C60752f.m236079a((View) truncatTextView2);
                return;
            }
            return;
        }
        ViewGroup viewGroup3 = this.f157107g;
        if (!(viewGroup3 == null || (userInfoStatusLayout2 = (UserInfoStatusLayout) viewGroup3.findViewById(R.id.tv_user_info_status_onthecall)) == null)) {
            C60752f.m236079a((View) userInfoStatusLayout2);
        }
        ViewGroup viewGroup4 = this.f157107g;
        if (!(viewGroup4 == null || (userInfoStatusLayout = (UserInfoStatusLayout) viewGroup4.findViewById(R.id.tv_user_info_status_onthecall)) == null)) {
            UserInfoStatusLayout.m244197a(userInfoStatusLayout, Boolean.valueOf(m244120H()), Boolean.valueOf(D), Boolean.valueOf(K), null, null, Boolean.valueOf(m244121I()), Boolean.valueOf(m244113A()), 24, null);
        }
        ViewGroup viewGroup5 = this.f157107g;
        if (viewGroup5 != null && (truncatTextView = (TruncatTextView) viewGroup5.findViewById(R.id.tv_user_info_status_calling)) != null) {
            C60752f.m236083c(truncatTextView);
        }
    }

    /* renamed from: s */
    public final void mo215938s() {
        Integer num;
        this.f157121u.removeCallbacks(this.f157122v);
        boolean z = this.f157105e;
        if (z) {
            String tag = getTAG();
            StringBuilder sb = new StringBuilder();
            sb.append("pr ");
            View view = this.f157117q;
            if (view != null) {
                num = Integer.valueOf(view.hashCode());
            } else {
                num = null;
            }
            sb.append(num);
            C60700b.m235851b(tag, "[createSurfaceIfNeed]", sb.toString());
        }
        this.f157105e = false;
        if (this.f157117q == null || z) {
            this.f157117q = StreamManagerGlobal.f153617a.mo212233a();
            C61074b.m237510a(this.f157117q, (float) C60773o.m236115a(getClipRadius()));
        }
        View view2 = this.f157117q;
        if (view2 == null) {
            Intrinsics.throwNpe();
        }
        ViewParent parent = view2.getParent();
        ViewGroup viewGroup = this.f157107g;
        if (viewGroup == null) {
            Intrinsics.throwNpe();
        }
        if (!Intrinsics.areEqual(parent, (FrameLayout) viewGroup.findViewById(R.id.container_surface))) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            ViewGroup viewGroup2 = this.f157107g;
            if (viewGroup2 == null) {
                Intrinsics.throwNpe();
            }
            ((FrameLayout) viewGroup2.findViewById(R.id.container_surface)).removeAllViews();
            ViewGroup viewGroup3 = this.f157107g;
            if (viewGroup3 == null) {
                Intrinsics.throwNpe();
            }
            ((FrameLayout) viewGroup3.findViewById(R.id.container_surface)).addView(this.f157117q, 0, layoutParams);
            mo215909a(getClipRadius());
        }
    }

    /* renamed from: B */
    private final boolean m244114B() {
        UDShadowLayout uDShadowLayout;
        boolean z = false;
        if (!mo215958w() || this.f157107g == null) {
            C60700b.m235861e(getTAG(), "[refreshCallingStatus]", "Illegal grid.");
            return false;
        }
        C62526c x = mo215959x();
        if (x != null) {
            z = x.mo216205j();
        }
        if (z) {
            ViewGroup viewGroup = this.f157107g;
            if (viewGroup == null) {
                Intrinsics.throwNpe();
            }
            if (((LottieAnimationView) viewGroup.findViewById(R.id.lottie)) != null) {
                ViewGroup viewGroup2 = this.f157107g;
                if (viewGroup2 == null) {
                    Intrinsics.throwNpe();
                }
                LottieAnimationView lottieAnimationView = (LottieAnimationView) viewGroup2.findViewById(R.id.lottie);
                Intrinsics.checkExpressionValueIsNotNull(lottieAnimationView, "mRootView!!.lottie");
                if (lottieAnimationView.isAnimating()) {
                    C60700b.m235851b(getTAG(), "[refreshOnTheCallStatus2]", "cancelAnimation");
                    ViewGroup viewGroup3 = this.f157107g;
                    if (viewGroup3 == null) {
                        Intrinsics.throwNpe();
                    }
                    ((LottieAnimationView) viewGroup3.findViewById(R.id.lottie)).cancelAnimation();
                }
            }
            View view = this.f157108h;
            if (view != null) {
                C60752f.m236083c(view);
            }
            View view2 = this.f157111k;
            if (view2 != null) {
                C60752f.m236083c(view2);
            }
            View view3 = this.f157110j;
            if (view3 != null) {
                C60752f.m236083c(view3);
            }
        } else {
            ViewGroup viewGroup4 = this.f157107g;
            if (viewGroup4 == null) {
                Intrinsics.throwNpe();
            }
            C60740ad.m236052b((ViewStub) viewGroup4.findViewById(R.id.view_stub_lottie));
            ViewGroup viewGroup5 = this.f157107g;
            if (viewGroup5 == null) {
                Intrinsics.throwNpe();
            }
            this.f157108h = (LottieAnimationView) viewGroup5.findViewById(R.id.lottie);
            ViewGroup viewGroup6 = this.f157107g;
            if (viewGroup6 == null) {
                Intrinsics.throwNpe();
            }
            if (((LottieAnimationView) viewGroup6.findViewById(R.id.lottie)) != null) {
                ViewGroup viewGroup7 = this.f157107g;
                if (viewGroup7 == null) {
                    Intrinsics.throwNpe();
                }
                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) viewGroup7.findViewById(R.id.lottie);
                Intrinsics.checkExpressionValueIsNotNull(lottieAnimationView2, "mRootView!!.lottie");
                if (!lottieAnimationView2.isAnimating()) {
                    C60700b.m235851b(getTAG(), "[refreshOnTheCallStatus3]", "playAnimation");
                    ViewGroup viewGroup8 = this.f157107g;
                    if (viewGroup8 == null) {
                        Intrinsics.throwNpe();
                    }
                    ((LottieAnimationView) viewGroup8.findViewById(R.id.lottie)).playAnimation();
                }
            }
            View view4 = this.f157108h;
            if (view4 != null) {
                C60752f.m236079a(view4);
            }
            if (mo214314j()) {
                ViewGroup viewGroup9 = this.f157107g;
                if (viewGroup9 == null) {
                    Intrinsics.throwNpe();
                }
                C60740ad.m236052b((ViewStub) viewGroup9.findViewById(R.id.view_stub_cancel_call));
                ViewGroup viewGroup10 = this.f157107g;
                if (viewGroup10 == null) {
                    Intrinsics.throwNpe();
                }
                this.f157110j = (TextView) viewGroup10.findViewById(R.id.btn_calling_cancel);
                ViewGroup viewGroup11 = this.f157107g;
                if (viewGroup11 != null) {
                    uDShadowLayout = (UDShadowLayout) viewGroup11.findViewById(R.id.btn_shadow_layout);
                } else {
                    uDShadowLayout = null;
                }
                UDShadowLayout uDShadowLayout2 = uDShadowLayout;
                this.f157111k = uDShadowLayout2;
                if (uDShadowLayout2 != null) {
                    C60752f.m236079a((View) uDShadowLayout2);
                }
                View view5 = this.f157110j;
                if (view5 != null) {
                    C60752f.m236079a(view5);
                }
                View view6 = this.f157110j;
                if (view6 != null) {
                    view6.setOnClickListener(new View$OnClickListenerC62466g(this));
                }
            } else {
                View view7 = this.f157111k;
                if (view7 != null) {
                    C60752f.m236083c(view7);
                }
                View view8 = this.f157110j;
                if (view8 != null) {
                    C60752f.m236083c(view8);
                }
            }
        }
        return !z;
    }

    /* renamed from: C */
    private final void m244115C() {
        boolean z;
        String str;
        if (!mo215958w() || this.f157107g == null) {
            C60700b.m235851b(getTAG(), "[refreshVideoState]", "Illegal grid.");
            return;
        }
        C62526c x = mo215959x();
        if (x != null) {
            boolean o = mo214318o();
            if (!o) {
                if (!x.mo216207l()) {
                    C61303k kVar = this.f157104d;
                    if (kVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mMeeting");
                    }
                    StreamManagerGlobal T = kVar.mo212102T();
                    Participant m = x.mo216208m();
                    if (m != null) {
                        str = m.getRtcJoinId();
                    } else {
                        str = null;
                    }
                    if (!T.mo212221b(str)) {
                        z = true;
                        if (!o || z) {
                            o = true;
                        } else {
                            o = false;
                        }
                    }
                }
                z = false;
                if (!o) {
                }
                o = true;
            }
            if (o) {
                String tag = getTAG();
                C60700b.m235843a(tag, "[refreshVideoState2]", "[Mute]camera mute is " + mo215957v() + ", page show is " + mo214308f());
                if (mo215936q()) {
                    ViewGroup viewGroup = this.f157107g;
                    if (viewGroup == null) {
                        Intrinsics.throwNpe();
                    }
                    ConstraintLayout constraintLayout = (ConstraintLayout) viewGroup.findViewById(R.id.container_avatar);
                    Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "mRootView!!.container_avatar");
                    C60752f.m236083c(constraintLayout);
                    ViewGroup viewGroup2 = this.f157107g;
                    if (viewGroup2 == null) {
                        Intrinsics.throwNpe();
                    }
                    FrameLayout frameLayout = (FrameLayout) viewGroup2.findViewById(R.id.container_surface);
                    Intrinsics.checkExpressionValueIsNotNull(frameLayout, "mRootView!!.container_surface");
                    C60752f.m236083c(frameLayout);
                    ViewGroup viewGroup3 = this.f157107g;
                    if (viewGroup3 == null) {
                        Intrinsics.throwNpe();
                    }
                    AppCompatImageView appCompatImageView = (AppCompatImageView) viewGroup3.findViewById(R.id.camera_unavailable);
                    Intrinsics.checkExpressionValueIsNotNull(appCompatImageView, "mRootView!!.camera_unavailable");
                    C60752f.m236079a((View) appCompatImageView);
                    mo214316m();
                } else {
                    ViewGroup viewGroup4 = this.f157107g;
                    if (viewGroup4 == null) {
                        Intrinsics.throwNpe();
                    }
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) viewGroup4.findViewById(R.id.container_avatar);
                    Intrinsics.checkExpressionValueIsNotNull(constraintLayout2, "mRootView!!.container_avatar");
                    C60752f.m236079a((View) constraintLayout2);
                    ViewGroup viewGroup5 = this.f157107g;
                    if (viewGroup5 == null) {
                        Intrinsics.throwNpe();
                    }
                    FrameLayout frameLayout2 = (FrameLayout) viewGroup5.findViewById(R.id.container_surface);
                    Intrinsics.checkExpressionValueIsNotNull(frameLayout2, "mRootView!!.container_surface");
                    C60752f.m236083c(frameLayout2);
                    ViewGroup viewGroup6 = this.f157107g;
                    if (viewGroup6 == null) {
                        Intrinsics.throwNpe();
                    }
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) viewGroup6.findViewById(R.id.camera_unavailable);
                    Intrinsics.checkExpressionValueIsNotNull(appCompatImageView2, "mRootView!!.camera_unavailable");
                    C60752f.m236083c(appCompatImageView2);
                }
                mo215955t();
                View view = this.f157117q;
                if (view != null && view.getParent() != null) {
                    this.f157105e = true;
                    this.f157121u.removeCallbacks(this.f157122v);
                    this.f157121u.post(this.f157122v);
                    return;
                }
                return;
            }
            mo215938s();
            ViewGroup viewGroup7 = this.f157107g;
            if (viewGroup7 == null) {
                Intrinsics.throwNpe();
            }
            AppCompatImageView appCompatImageView3 = (AppCompatImageView) viewGroup7.findViewById(R.id.camera_unavailable);
            Intrinsics.checkExpressionValueIsNotNull(appCompatImageView3, "mRootView!!.camera_unavailable");
            C60752f.m236083c(appCompatImageView3);
            if (!this.f157118r || !this.f157119s) {
                this.f157118r = true;
                ViewGroup viewGroup8 = this.f157107g;
                if (viewGroup8 == null) {
                    Intrinsics.throwNpe();
                }
                ConstraintLayout constraintLayout3 = (ConstraintLayout) viewGroup8.findViewById(R.id.container_avatar);
                Intrinsics.checkExpressionValueIsNotNull(constraintLayout3, "mRootView!!.container_avatar");
                C60752f.m236079a((View) constraintLayout3);
                C61303k kVar2 = this.f157104d;
                if (kVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mMeeting");
                }
                kVar2.mo212165y().mo211993a(this.f157117q, new WeakRtcEglRenderListener(this));
                mo215911a(x);
                ViewGroup viewGroup9 = this.f157107g;
                if (viewGroup9 == null) {
                    Intrinsics.throwNpe();
                }
                FrameLayout frameLayout3 = (FrameLayout) viewGroup9.findViewById(R.id.container_surface);
                Intrinsics.checkExpressionValueIsNotNull(frameLayout3, "mRootView!!.container_surface");
                C60752f.m236079a((View) frameLayout3);
            }
        }
    }

    /* renamed from: G */
    private final void m244119G() {
        Participant participant;
        String str;
        if (this.f157101a != null && mo215959x() != null && this.f157107g != null) {
            C62526c x = mo215959x();
            Boolean bool = null;
            if (x != null) {
                participant = x.mo216208m();
            } else {
                participant = null;
            }
            C61303k kVar = this.f157104d;
            if (kVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMeeting");
            }
            if (MeetingUtil.m238366a(kVar, participant)) {
                str = getResources().getString(R.string.View_M_Interviewer);
                Intrinsics.checkExpressionValueIsNotNull(str, "resources.getString(R.string.View_M_Interviewer)");
            } else {
                VideoChatUser videoChatUser = this.f157101a;
                if (videoChatUser == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mUser");
                }
                if (videoChatUser.isRoom()) {
                    VideoChatUser videoChatUser2 = this.f157101a;
                    if (videoChatUser2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mUser");
                    }
                    str = videoChatUser2.getRoom().fullNameParticipant;
                    Intrinsics.checkExpressionValueIsNotNull(str, "room.fullNameParticipant");
                } else {
                    VideoChatUser videoChatUser3 = this.f157101a;
                    if (videoChatUser3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mUser");
                    }
                    if (videoChatUser3.getType() == ParticipantType.LARK_USER) {
                        VideoChatUser videoChatUser4 = this.f157101a;
                        if (videoChatUser4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mUser");
                        }
                        str = videoChatUser4.getName();
                        Intrinsics.checkExpressionValueIsNotNull(str, "mUser.name");
                    } else {
                        VideoChatUser videoChatUser5 = this.f157101a;
                        if (videoChatUser5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mUser");
                        }
                        ParticipantType type = videoChatUser5.getType();
                        Intrinsics.checkExpressionValueIsNotNull(type, "mUser.type");
                        if (!type.isNewType()) {
                            VideoChatUser videoChatUser6 = this.f157101a;
                            if (videoChatUser6 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mUser");
                            }
                            ParticipantType type2 = videoChatUser6.getType();
                            Intrinsics.checkExpressionValueIsNotNull(type2, "mUser.type");
                            if (!type2.isUnknownType()) {
                                VideoChatUser videoChatUser7 = this.f157101a;
                                if (videoChatUser7 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("mUser");
                                }
                                if (videoChatUser7.getType() != ParticipantType.NEO_USER) {
                                    str = "";
                                }
                            }
                        }
                        VideoChatUser videoChatUser8 = this.f157101a;
                        if (videoChatUser8 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mUser");
                        }
                        if (!TextUtils.isEmpty(videoChatUser8.getNickname())) {
                            VideoChatUser videoChatUser9 = this.f157101a;
                            if (videoChatUser9 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mUser");
                            }
                            str = videoChatUser9.getNickname();
                            Intrinsics.checkExpressionValueIsNotNull(str, "mUser.nickname");
                        } else {
                            VideoChatUser videoChatUser10 = this.f157101a;
                            if (videoChatUser10 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mUser");
                            }
                            str = videoChatUser10.getName();
                            Intrinsics.checkExpressionValueIsNotNull(str, "mUser.name");
                        }
                    }
                }
            }
            C62526c x2 = mo215959x();
            if (x2 == null || x2.mo216205j()) {
                ViewGroup viewGroup = this.f157107g;
                if (viewGroup == null) {
                    Intrinsics.throwNpe();
                }
                TruncatTextView truncatTextView = (TruncatTextView) viewGroup.findViewById(R.id.tv_user_info_status_calling);
                Intrinsics.checkExpressionValueIsNotNull(truncatTextView, "mRootView!!.tv_user_info_status_calling");
                C60752f.m236083c(truncatTextView);
                ViewGroup viewGroup2 = this.f157107g;
                if (viewGroup2 == null) {
                    Intrinsics.throwNpe();
                }
                UserInfoStatusLayout userInfoStatusLayout = (UserInfoStatusLayout) viewGroup2.findViewById(R.id.tv_user_info_status_onthecall);
                Intrinsics.checkExpressionValueIsNotNull(userInfoStatusLayout, "mRootView!!.tv_user_info_status_onthecall");
                C60752f.m236079a((View) userInfoStatusLayout);
                ViewGroup viewGroup3 = this.f157107g;
                if (viewGroup3 == null) {
                    Intrinsics.throwNpe();
                }
                ((UserInfoStatusLayout) viewGroup3.findViewById(R.id.tv_user_info_status_onthecall)).setOnLayoutChangeObserver(new C62468i(this));
                if (ParticipantUtil.m248732c(participant)) {
                    str = str + getResources().getString(R.string.View_M_MeParentheses);
                } else if (participant != null && participant.isGuest()) {
                    str = str + getResources().getString(R.string.View_M_GuestParentheses);
                }
                C62526c x3 = mo215959x();
                if (x3 != null) {
                    bool = Boolean.valueOf(x3.mo216204i());
                }
                boolean K = m244123K();
                ViewGroup viewGroup4 = this.f157107g;
                if (viewGroup4 == null) {
                    Intrinsics.throwNpe();
                }
                UserInfoStatusLayout.m244197a((UserInfoStatusLayout) viewGroup4.findViewById(R.id.tv_user_info_status_onthecall), Boolean.valueOf(m244120H()), bool, Boolean.valueOf(K), null, str, Boolean.valueOf(m244121I()), Boolean.valueOf(m244113A()), 8, null);
            } else {
                ViewGroup viewGroup5 = this.f157107g;
                if (viewGroup5 == null) {
                    Intrinsics.throwNpe();
                }
                TruncatTextView truncatTextView2 = (TruncatTextView) viewGroup5.findViewById(R.id.tv_user_info_status_calling);
                Intrinsics.checkExpressionValueIsNotNull(truncatTextView2, "mRootView!!.tv_user_info_status_calling");
                C60752f.m236079a((View) truncatTextView2);
                ViewGroup viewGroup6 = this.f157107g;
                if (viewGroup6 == null) {
                    Intrinsics.throwNpe();
                }
                UserInfoStatusLayout userInfoStatusLayout2 = (UserInfoStatusLayout) viewGroup6.findViewById(R.id.tv_user_info_status_onthecall);
                Intrinsics.checkExpressionValueIsNotNull(userInfoStatusLayout2, "mRootView!!.tv_user_info_status_onthecall");
                C60752f.m236083c(userInfoStatusLayout2);
                ViewGroup viewGroup7 = this.f157107g;
                if (viewGroup7 == null) {
                    Intrinsics.throwNpe();
                }
                ((TruncatTextView) viewGroup7.findViewById(R.id.tv_user_info_status_calling)).setOnLayoutChangeObserver(new C62467h(this));
                ViewGroup viewGroup8 = this.f157107g;
                if (viewGroup8 == null) {
                    Intrinsics.throwNpe();
                }
                ((TruncatTextView) viewGroup8.findViewById(R.id.tv_user_info_status_calling)).mo208517a(str + getContext().getString(R.string.View_M_CallingParentheses), str);
            }
            ViewGroup viewGroup9 = this.f157107g;
            if (viewGroup9 == null) {
                Intrinsics.throwNpe();
            }
            ((TruncatTextView) viewGroup9.findViewById(R.id.tv_user_info_status_calling)).setOnClickListener(new View$OnClickListenerC62469j(this, participant));
            ViewGroup viewGroup10 = this.f157107g;
            if (viewGroup10 == null) {
                Intrinsics.throwNpe();
            }
            ((UserInfoStatusLayout) viewGroup10.findViewById(R.id.tv_user_info_status_onthecall)).setOnClickListener(new View$OnClickListenerC62470k(this, participant));
        }
    }

    public final void setLastAsSpeakTime(long j) {
        this.f157113m = j;
    }

    public final void setMAsHintView(View view) {
        this.f157109i = view;
    }

    public final void setMBtnCancel(View view) {
        this.f157110j = view;
    }

    public final void setMBtnShadowLayoutView(View view) {
        this.f157111k = view;
    }

    public final void setMIsBind(boolean z) {
        this.f157119s = z;
    }

    public final void setMIsSame(boolean z) {
        this.f157118r = z;
    }

    public final void setMLottieView(View view) {
        this.f157108h = view;
    }

    public final void setMRootView(ViewGroup viewGroup) {
        this.f157107g = viewGroup;
    }

    public final void setMSurface(View view) {
        this.f157117q = view;
    }

    public final void setNetQualityListenerRef(WeakReference<AbstractC61994a.AbstractC61995a> weakReference) {
        this.f157112l = weakReference;
    }

    public final void setPopWindow(InMeetingParticipantControlPopWindow inMeetingParticipantControlPopWindow) {
        this.f157116p = inMeetingParticipantControlPopWindow;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/vc/meeting/module/multi/InMeetingGridView$asSpeakerListener$1", "Lcom/ss/android/vc/meeting/utils/ActiveSpeakerCalculator$ActiveSpeakerSpeakListener;", "onAsSpeakChanged", "", "asRtcJoinId", "", "isSpeaking", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.InMeetingGridView$b */
    public static final class C62461b implements ActiveSpeakerCalculator.ActiveSpeakerSpeakListener {

        /* renamed from: a */
        final /* synthetic */ InMeetingGridView f157128a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C62461b(InMeetingGridView inMeetingGridView) {
            this.f157128a = inMeetingGridView;
        }

        @Override // com.ss.android.vc.meeting.utils.ActiveSpeakerCalculator.ActiveSpeakerSpeakListener
        /* renamed from: a */
        public void mo215966a(String str, boolean z) {
            Boolean bool;
            C62526c x;
            Intrinsics.checkParameterIsNotNull(str, "asRtcJoinId");
            try {
                if (System.currentTimeMillis() - this.f157128a.getLastAsSpeakTime() >= ((long) LocationRequest.PRIORITY_INDOOR)) {
                    this.f157128a.setLastAsSpeakTime(System.currentTimeMillis());
                    this.f157128a.getMMeeting().ax().mo214326a(str, z);
                    if (this.f157128a.mo215935p() && this.f157128a.mo215958w()) {
                        C62526c x2 = this.f157128a.mo215959x();
                        if (x2 == null || !x2.mo216206k() || (x = this.f157128a.mo215959x()) == null || x.mo216204i() || !z) {
                            String tag = this.f157128a.getTAG();
                            StringBuilder sb = new StringBuilder();
                            sb.append("updateAsHintVisibility false. asRtcJoinId = ");
                            sb.append(str);
                            sb.append(". isActiveSpeaker = ");
                            C62526c x3 = this.f157128a.mo215959x();
                            Boolean bool2 = null;
                            if (x3 != null) {
                                bool = Boolean.valueOf(x3.mo216206k());
                            } else {
                                bool = null;
                            }
                            sb.append(bool);
                            sb.append(", isMicrophoneMuted = ");
                            C62526c x4 = this.f157128a.mo215959x();
                            if (x4 != null) {
                                bool2 = Boolean.valueOf(x4.mo216204i());
                            }
                            sb.append(bool2);
                            sb.append(", isSpeaking = ");
                            sb.append(z);
                            C60700b.m235844a(tag, "[onAsSpeakChanged2]", sb.toString(), 10000);
                            this.f157128a.mo214303a(false);
                            return;
                        }
                        C60700b.m235851b(this.f157128a.getTAG(), "[onAsSpeakChanged]", "updateAsHintVisibility true. + asRtcJoinId = " + str + '.');
                        this.f157128a.mo214303a(true);
                    }
                }
            } catch (Exception e) {
                C60700b.m235864f(this.f157128a.getTAG(), "[onAsSpeakChanged3]", "[Error]Display user info： " + e.getMessage());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007¨\u0006\u0011"}, d2 = {"com/ss/android/vc/meeting/module/multi/InMeetingGridView$bindData$3", "Landroid/view/View$OnTouchListener;", "sx", "", "getSx", "()F", "setSx", "(F)V", "sy", "getSy", "setSy", "onTouch", "", "v", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.InMeetingGridView$d */
    public static final class View$OnTouchListenerC62463d implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ InMeetingGridView f157130a;

        /* renamed from: b */
        private float f157131b;

        /* renamed from: c */
        private float f157132c;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        View$OnTouchListenerC62463d(InMeetingGridView inMeetingGridView) {
            this.f157130a = inMeetingGridView;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            Integer num;
            if (motionEvent != null) {
                num = Integer.valueOf(motionEvent.getActionMasked());
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 0) {
                this.f157131b = motionEvent.getX();
                this.f157132c = motionEvent.getY();
                return false;
            } else if (num != null && num.intValue() == 2) {
                return false;
            } else {
                if ((num == null || num.intValue() != 1) && (num == null || num.intValue() != 3)) {
                    return false;
                }
                float f = (float) 10;
                if (Math.abs(this.f157131b - motionEvent.getX()) < f && Math.abs(this.f157132c - motionEvent.getY()) < f) {
                    return false;
                }
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                Intrinsics.checkExpressionValueIsNotNull(obtain, "cancel");
                obtain.setAction(3);
                this.f157130a.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/vc/meeting/module/multi/InMeetingGridView$clipSurfaceCorner$1", "Landroid/view/ViewOutlineProvider;", "getOutline", "", "view", "Landroid/view/View;", "outline", "Landroid/graphics/Outline;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.InMeetingGridView$f */
    public static final class C62465f extends ViewOutlineProvider {

        /* renamed from: a */
        final /* synthetic */ double f157135a;

        C62465f(double d) {
            this.f157135a = d;
        }

        public void getOutline(View view, Outline outline) {
            Rect rect = new Rect();
            if (view != null) {
                view.getGlobalVisibleRect(rect);
                Rect rect2 = new Rect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                if (outline != null) {
                    outline.setRoundRect(rect2, (float) C60773o.m236115a(this.f157135a));
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/vc/meeting/module/multi/InMeetingGridView$refreshUserName$3", "Lcom/ss/android/vc/meeting/module/multi/UserInfoStatusLayout$OnLayoutChangeObserver;", "onLayoutChange", "", "self", "Landroid/view/View;", "fillParent", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.InMeetingGridView$i */
    public static final class C62468i implements UserInfoStatusLayout.OnLayoutChangeObserver {

        /* renamed from: a */
        final /* synthetic */ InMeetingGridView f157138a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C62468i(InMeetingGridView inMeetingGridView) {
            this.f157138a = inMeetingGridView;
        }

        @Override // com.ss.android.vc.meeting.module.multi.UserInfoStatusLayout.OnLayoutChangeObserver
        public void onLayoutChange(View view, boolean z) {
            this.f157138a.mo214300a(view, z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/multi/InMeetingGridView$updateActionMore$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.InMeetingGridView$o */
    public static final class C62474o extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ InMeetingGridView f157146a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C62474o(InMeetingGridView inMeetingGridView) {
            this.f157146a = inMeetingGridView;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            Participant participant;
            C62526c x = this.f157146a.mo215959x();
            if (x != null) {
                participant = x.mo216208m();
            } else {
                participant = null;
            }
            Activity b = C60773o.m236124b(this.f157146a.getContext());
            if (b == null) {
                C60700b.m235851b(this.f157146a.getTAG(), "[updateActionMore]", "mActivity is null");
            } else if (participant == null) {
                C60700b.m235851b(this.f157146a.getTAG(), "[updateActionMore2]", "participant is null");
            } else {
                this.f157146a.setPopWindow(new InMeetingParticipantControlPopWindow(b, this.f157146a.getMMeeting(), InMeetingParticipantControlPopWindow.GridType.GRID_VIEW, participant));
                InMeetingParticipantControlPopWindow popWindow = this.f157146a.getPopWindow();
                if (popWindow != null) {
                    popWindow.mo100027a((View) ((AppCompatImageView) this.f157146a.mo214298a(R.id.action_more)));
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/multi/InMeetingGridView$updateSwitchCamera$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.InMeetingGridView$r */
    public static final class C62477r extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ InMeetingGridView f157149a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C62477r(InMeetingGridView inMeetingGridView) {
            this.f157149a = inMeetingGridView;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            VideoChat videoChat;
            DataAdapterUtil.f154006a.mo212860f(this.f157149a.getMMeeting());
            C61303k mMeeting = this.f157149a.getMMeeting();
            if (mMeeting != null) {
                videoChat = mMeeting.mo212056e();
            } else {
                videoChat = null;
            }
            C63742at.m250116w(videoChat);
        }
    }

    public final void setAsSpeakerListener(ActiveSpeakerCalculator.ActiveSpeakerSpeakListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "<set-?>");
        this.f157120t = bVar;
    }

    public final void setMGridId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f157102b = str;
    }

    public final void setMMeeting(C61303k kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "<set-?>");
        this.f157104d = kVar;
    }

    public final void setMPresenter(InMeetingPresenter bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "<set-?>");
        this.f157103c = bVar;
    }

    public final void setMUser(VideoChatUser videoChatUser) {
        Intrinsics.checkParameterIsNotNull(videoChatUser, "<set-?>");
        this.f157101a = videoChatUser;
    }

    public void setTAG(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f157106f = str;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/vc/common/widget/TruncatTextView;", "kotlin.jvm.PlatformType", "onLayoutChange"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.InMeetingGridView$h */
    public static final class C62467h implements TruncatTextView.AbstractC60818a {

        /* renamed from: a */
        final /* synthetic */ InMeetingGridView f157137a;

        C62467h(InMeetingGridView inMeetingGridView) {
            this.f157137a = inMeetingGridView;
        }

        @Override // com.ss.android.vc.common.widget.TruncatTextView.AbstractC60818a
        /* renamed from: a */
        public final void mo208521a(TruncatTextView truncatTextView) {
            InMeetingGridView inMeetingGridView = this.f157137a;
            Intrinsics.checkExpressionValueIsNotNull(truncatTextView, "it");
            inMeetingGridView.mo214301a(truncatTextView);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "show", "", "onFullScreenShowChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.InMeetingGridView$n */
    public static final class C62473n implements AbstractC62492f {

        /* renamed from: a */
        final /* synthetic */ InMeetingGridView f157145a;

        C62473n(InMeetingGridView inMeetingGridView) {
            this.f157145a = inMeetingGridView;
        }

        @Override // com.ss.android.vc.meeting.module.multi.p3140a.AbstractC62492f
        public final void onFullScreenShowChanged(boolean z) {
            if (!z) {
                this.f157145a.getMMeeting().aw().mo216153h();
            }
        }
    }

    /* renamed from: a */
    public C62526c mo214299a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "gridId");
        C61303k kVar = this.f157104d;
        if (kVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMeeting");
        }
        return kVar.aw().mo216146c(str);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.InMeetingGridView$g */
    public static final class View$OnClickListenerC62466g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InMeetingGridView f157136a;

        View$OnClickListenerC62466g(InMeetingGridView inMeetingGridView) {
            this.f157136a = inMeetingGridView;
        }

        public final void onClick(View view) {
            Participant participant;
            UDShadowLayout uDShadowLayout;
            if (this.f157136a.mo215958w()) {
                ViewGroup mRootView = this.f157136a.getMRootView();
                if (!(mRootView == null || (uDShadowLayout = (UDShadowLayout) mRootView.findViewById(R.id.btn_shadow_layout)) == null)) {
                    C60752f.m236083c(uDShadowLayout);
                }
                AbsGridContentControl aw = this.f157136a.getMMeeting().aw();
                C62526c x = this.f157136a.mo215959x();
                if (x != null) {
                    participant = x.mo216208m();
                } else {
                    participant = null;
                }
                aw.mo216138a(participant);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.InMeetingGridView$j */
    public static final class View$OnClickListenerC62469j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InMeetingGridView f157139a;

        /* renamed from: b */
        final /* synthetic */ Participant f157140b;

        View$OnClickListenerC62469j(InMeetingGridView inMeetingGridView, Participant participant) {
            this.f157139a = inMeetingGridView;
            this.f157140b = participant;
        }

        public final void onClick(View view) {
            if (C63497j.m248860d(this.f157139a.getMMeeting(), new ByteviewUser(this.f157140b))) {
                ax.m250127a(this.f157139a.getMMeeting().mo212056e());
                C63497j.m248853a(C60773o.m236124b(this.f157139a.getContext()), this.f157139a.getMMeeting(), new ByteviewUser(this.f157140b));
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.InMeetingGridView$k */
    public static final class View$OnClickListenerC62470k implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InMeetingGridView f157141a;

        /* renamed from: b */
        final /* synthetic */ Participant f157142b;

        View$OnClickListenerC62470k(InMeetingGridView inMeetingGridView, Participant participant) {
            this.f157141a = inMeetingGridView;
            this.f157142b = participant;
        }

        public final void onClick(View view) {
            if (C63497j.m248860d(this.f157141a.getMMeeting(), new ByteviewUser(this.f157142b))) {
                ax.m250127a(this.f157141a.getMMeeting().mo212056e());
                C63497j.m248853a(C60773o.m236124b(this.f157141a.getContext()), this.f157141a.getMMeeting(), new ByteviewUser(this.f157142b));
            }
        }
    }

    /* renamed from: d */
    private final void m244126d(boolean z) {
        UserInfoStatusLayout userInfoStatusLayout;
        ViewGroup viewGroup = this.f157107g;
        if (viewGroup != null && (userInfoStatusLayout = (UserInfoStatusLayout) viewGroup.findViewById(R.id.tv_user_info_status_onthecall)) != null) {
            UserInfoStatusLayout.m244196a(userInfoStatusLayout, null, null, null, Boolean.valueOf(z), null, null, 55, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.InMeetingGridView$m */
    public static final class C62472m<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ InMeetingGridView f157144a;

        C62472m(InMeetingGridView inMeetingGridView) {
            this.f157144a = inMeetingGridView;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            TextView textView;
            String tag = this.f157144a.getTAG();
            C60700b.m235851b(tag, "[show1v1Connecting2]", "connected=" + bool);
            Intrinsics.checkExpressionValueIsNotNull(bool, "it");
            if (bool.booleanValue()) {
                ViewGroup mRootView = this.f157144a.getMRootView();
                if (!(mRootView == null || (textView = (TextView) mRootView.findViewById(R.id.connecting_text)) == null)) {
                    textView.setVisibility(8);
                }
                C60700b.m235851b(this.f157144a.getTAG(), "[show1v1Connecting3]", "connecting_text set gone");
            }
        }
    }

    /* renamed from: a */
    public void mo215909a(double d) {
        View view = this.f157117q;
        if (view != null) {
            view.setOutlineProvider(new C62465f(d));
        }
        View view2 = this.f157117q;
        if (view2 != null) {
            view2.setClipToOutline(true);
        }
    }

    /* renamed from: b */
    public final void mo215913b(boolean z) {
        FrameLayout frameLayout;
        ConstraintLayout constraintLayout;
        FrameLayout frameLayout2;
        ConstraintLayout constraintLayout2;
        if (z) {
            ViewGroup viewGroup = this.f157107g;
            if (!(viewGroup == null || (constraintLayout2 = (ConstraintLayout) viewGroup.findViewById(R.id.container_avatar)) == null)) {
                C60752f.m236079a((View) constraintLayout2);
            }
            ViewGroup viewGroup2 = this.f157107g;
            if (viewGroup2 != null && (frameLayout2 = (FrameLayout) viewGroup2.findViewById(R.id.container_surface)) != null) {
                C60752f.m236083c(frameLayout2);
                return;
            }
            return;
        }
        ViewGroup viewGroup3 = this.f157107g;
        if (!(viewGroup3 == null || (constraintLayout = (ConstraintLayout) viewGroup3.findViewById(R.id.container_avatar)) == null)) {
            C60752f.m236083c(constraintLayout);
        }
        ViewGroup viewGroup4 = this.f157107g;
        if (viewGroup4 != null && (frameLayout = (FrameLayout) viewGroup4.findViewById(R.id.container_surface)) != null) {
            C60752f.m236079a((View) frameLayout);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "user", "Lcom/ss/android/vc/net/service/VideoChatUser;", "kotlin.jvm.PlatformType", "onGetUserInfo"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.InMeetingGridView$c */
    public static final class C62462c implements GetUserInfoListener {

        /* renamed from: a */
        final /* synthetic */ InMeetingGridView f157129a;

        C62462c(InMeetingGridView inMeetingGridView) {
            this.f157129a = inMeetingGridView;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x005c, code lost:
            if (r2.isUnknownType() != false) goto L_0x005e;
         */
        @Override // com.ss.android.vc.net.service.GetUserInfoListener
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onGetUserInfo(com.ss.android.vc.net.service.VideoChatUser r5) {
            /*
            // Method dump skipped, instructions count: 130
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.multi.InMeetingGridView.C62462c.onGetUserInfo(com.ss.android.vc.net.service.VideoChatUser):void");
        }
    }

    /* renamed from: a */
    public void mo214301a(TextView textView) {
        int i;
        Intrinsics.checkParameterIsNotNull(textView, "textView");
        if (((float) ((textView.getMeasuredWidth() - textView.getCompoundPaddingLeft()) - textView.getCompoundPaddingRight())) < Layout.getDesiredWidth(textView.getText(), textView.getPaint())) {
            i = R.drawable.bg_user_info_status_1;
        } else {
            i = R.drawable.bg_user_info_status_2;
        }
        textView.setBackground(C60773o.m236128f(i));
    }

    /* renamed from: c */
    public final void mo215914c(boolean z) {
        boolean z2;
        String str;
        Boolean bool;
        Integer num;
        ActiveSpeakerCalculator.ActiveSpeakerSpeakListener bVar;
        UDShadowLayout uDShadowLayout;
        View view;
        FrameLayout frameLayout;
        ConstraintLayout constraintLayout;
        Participant m;
        if (this.f157102b != null) {
            String str2 = this.f157102b;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mGridId");
            }
            if (str2.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                C62526c x = mo215959x();
                String tag = getTAG();
                StringBuilder sb = new StringBuilder();
                if (x == null || (m = x.mo216208m()) == null) {
                    str = null;
                } else {
                    str = m.getRtcJoinId();
                }
                sb.append(str);
                sb.append(", isSelf: ");
                if (x != null) {
                    bool = Boolean.valueOf(x.mo216207l());
                } else {
                    bool = null;
                }
                sb.append(bool);
                sb.append(", ");
                View view2 = this.f157117q;
                if (view2 != null) {
                    num = Integer.valueOf(view2.hashCode());
                } else {
                    num = null;
                }
                sb.append(num);
                C60700b.m235851b(tag, "[destroy]", sb.toString());
                ViewGroup viewGroup = this.f157107g;
                if (!(viewGroup == null || (constraintLayout = (ConstraintLayout) viewGroup.findViewById(R.id.container_avatar)) == null)) {
                    C60752f.m236079a((View) constraintLayout);
                }
                ViewGroup viewGroup2 = this.f157107g;
                if (!(viewGroup2 == null || (frameLayout = (FrameLayout) viewGroup2.findViewById(R.id.container_surface)) == null)) {
                    C60752f.m236083c(frameLayout);
                }
                if (!(!z || (view = this.f157117q) == null || view.getParent() == null)) {
                    this.f157105e = true;
                    this.f157121u.removeCallbacks(this.f157122v);
                    this.f157121u.postDelayed(this.f157122v, 0);
                }
                mo215955t();
                this.f157102b = "";
                C61303k kVar = this.f157104d;
                if (kVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mMeeting");
                }
                AbstractC61994a an = kVar.an();
                if (an != null) {
                    an.mo214604a(false);
                }
                C61303k kVar2 = this.f157104d;
                if (kVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mMeeting");
                }
                AbstractC61994a an2 = kVar2.an();
                if (an2 != null) {
                    an2.mo214606b(this.f157112l);
                }
                C60738ac.m236034b(this);
                m244125M();
                C61303k kVar3 = this.f157104d;
                if (kVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mMeeting");
                }
                ActiveSpeakerCalculator w = kVar3.mo212163w();
                if (w != null) {
                    bVar = w.mo219610d();
                } else {
                    bVar = null;
                }
                if (Intrinsics.areEqual(bVar, this.f157120t)) {
                    C61303k kVar4 = this.f157104d;
                    if (kVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mMeeting");
                    }
                    ActiveSpeakerCalculator w2 = kVar4.mo212163w();
                    if (w2 != null) {
                        w2.mo219602a((ActiveSpeakerCalculator.ActiveSpeakerSpeakListener) null);
                    }
                }
                InMeetingParticipantControlPopWindow inMeetingParticipantControlPopWindow = this.f157116p;
                if (inMeetingParticipantControlPopWindow != null) {
                    inMeetingParticipantControlPopWindow.dismiss();
                }
                ViewGroup viewGroup3 = this.f157107g;
                if (viewGroup3 != null && (uDShadowLayout = (UDShadowLayout) viewGroup3.findViewById(R.id.btn_shadow_layout)) != null) {
                    C60752f.m236083c(uDShadowLayout);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo214302a(Participant participant) {
        C61303k kVar = this.f157104d;
        if (kVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMeeting");
        }
        if (kVar.aw().mo216149e() > 2) {
            C61303k kVar2 = this.f157104d;
            if (kVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMeeting");
            }
            kVar2.az().mo216031a(participant, new C62473n(this));
            C61303k kVar3 = this.f157104d;
            if (kVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMeeting");
            }
            bj.m250181a(true, kVar3.mo212056e());
        }
    }

    /* renamed from: a */
    public final void mo215911a(C62526c cVar) {
        String str;
        Integer num;
        if (this.f157117q != null && cVar != null) {
            C61303k kVar = this.f157104d;
            if (kVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMeeting");
            }
            if (kVar.mo212067p() == DisplayMode.ACTIVITY) {
                String tag = getTAG();
                StringBuilder sb = new StringBuilder();
                Participant m = cVar.mo216208m();
                String str2 = null;
                if (m != null) {
                    str = m.getRtcJoinId();
                } else {
                    str = null;
                }
                sb.append(str);
                sb.append(", isSelf: ");
                sb.append(cVar.mo216207l());
                sb.append(", ");
                View view = this.f157117q;
                if (view != null) {
                    num = Integer.valueOf(view.hashCode());
                } else {
                    num = null;
                }
                sb.append(num);
                C60700b.m235851b(tag, "[bindSurface]", sb.toString());
                if (cVar.mo216207l()) {
                    C61303k kVar2 = this.f157104d;
                    if (kVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mMeeting");
                    }
                    StreamManagerGlobal T = kVar2.mo212102T();
                    View view2 = this.f157117q;
                    Participant m2 = cVar.mo216208m();
                    if (m2 != null) {
                        str2 = m2.getRtcJoinId();
                    }
                    T.mo212208a(view2, str2);
                } else {
                    C61303k kVar3 = this.f157104d;
                    if (kVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mMeeting");
                    }
                    StreamManagerGlobal T2 = kVar3.mo212102T();
                    View view3 = this.f157117q;
                    Participant m3 = cVar.mo216208m();
                    if (m3 != null) {
                        str2 = m3.getRtcJoinId();
                    }
                    T2.mo212218b(view3, str2);
                }
                this.f157119s = true;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    /* renamed from: a */
    public void mo214300a(View view, boolean z) {
        int i;
        if (z) {
            i = R.drawable.bg_user_info_status_1;
        } else {
            i = R.drawable.bg_user_info_status_2;
        }
        if (view != null) {
            view.setBackground(C60773o.m236128f(i));
        }
    }

    /* renamed from: a */
    public void mo215910a(InMeetingPresenter bVar, C62526c cVar) {
        LKUIRoundedImageView lKUIRoundedImageView;
        String str;
        Intrinsics.checkParameterIsNotNull(bVar, "presenter");
        Intrinsics.checkParameterIsNotNull(cVar, "meetingGridModel");
        if (this.f157107g == null) {
            long currentTimeMillis = System.currentTimeMillis();
            mo214315l();
            mo214305c();
            String tag = getTAG();
            C60700b.m235843a(tag, "[bindData]", "[APM][bindData-inflate]duration: " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
        }
        InMeetingGridView inMeetingGridView = this;
        if (inMeetingGridView.f157102b != null) {
            String str2 = this.f157102b;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mGridId");
            }
            if (TextUtils.equals(str2, cVar.mo216201f())) {
                if (inMeetingGridView.f157101a != null) {
                    VideoChatUser videoChatUser = this.f157101a;
                    if (videoChatUser == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mUser");
                    }
                    str = videoChatUser.getId();
                } else {
                    str = "unknown";
                }
                String tag2 = getTAG();
                C60700b.m235843a(tag2, "[bindData2]", "refresh repeat. userId is: " + str);
                this.f157118r = true;
                mo214309g();
                m244118F();
                mo215937r();
                return;
            }
        }
        InMeetingParticipantControlPopWindow inMeetingParticipantControlPopWindow = this.f157116p;
        if (inMeetingParticipantControlPopWindow != null) {
            inMeetingParticipantControlPopWindow.dismiss();
        }
        this.f157118r = false;
        this.f157119s = false;
        this.f157103c = bVar;
        String f = cVar.mo216201f();
        Intrinsics.checkExpressionValueIsNotNull(f, "meetingGridModel.gridId");
        this.f157102b = f;
        C61303k meeting = bVar.getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "presenter.meeting");
        this.f157104d = meeting;
        if (this.f157112l == null) {
            this.f157112l = new WeakReference<>(this);
        }
        C61303k kVar = this.f157104d;
        if (kVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMeeting");
        }
        kVar.an().mo214603a(this.f157112l);
        ViewGroup viewGroup = this.f157107g;
        if (!(viewGroup == null || (lKUIRoundedImageView = (LKUIRoundedImageView) viewGroup.findViewById(R.id.img_avatar)) == null)) {
            lKUIRoundedImageView.setImageDrawable(null);
        }
        mo215937r();
        InMeetingPresenter bVar2 = this.f157103c;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
        }
        C61303k meeting2 = bVar2.getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting2, "mPresenter.meeting");
        String d = meeting2.mo212055d();
        Participant m = cVar.mo216208m();
        Intrinsics.checkExpressionValueIsNotNull(m, "meetingGridModel.participant");
        String id = m.getId();
        Participant m2 = cVar.mo216208m();
        Intrinsics.checkExpressionValueIsNotNull(m2, "meetingGridModel.participant");
        UserInfoService.getUserInfoById(d, id, m2.getParticipantType(), new C62462c(this));
        if (cVar.mo216205j()) {
            setOnTouchListener(new View$OnTouchListenerC62463d(this));
            setOnClickListener(new C62464e(this, cVar));
        } else {
            setOnClickListener(null);
        }
        m244124L();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InMeetingGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f157106f = "InMeetingGridView";
        this.f157115o = UIHelper.dp2px(3.0f) * 2;
        setClipChildren(true);
        this.f157120t = new C62461b(this);
        this.f157121u = new Handler(Looper.getMainLooper());
        this.f157122v = new RunnableC62471l(this);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InMeetingGridView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
