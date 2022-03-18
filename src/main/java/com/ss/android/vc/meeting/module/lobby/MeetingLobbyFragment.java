package com.ss.android.vc.meeting.module.lobby;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.aj;
import com.larksuite.component.ignition.widget.squircle.SquircleImageView;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.component.universe_design.util.UDUiModeUtils;
import com.larksuite.framework.thread.C26171w;
import com.larksuite.suite.R;
import com.ss.android.floatbubble.C28460b;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.AbstractC60728a;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.common.p3083e.C60788y;
import com.ss.android.vc.common.permission.AbstractC60798c;
import com.ss.android.vc.common.singleinstance.AbsSingleInstanceControl;
import com.ss.android.vc.common.utils.VCDialogUtils;
import com.ss.android.vc.common.widget.IconFontView;
import com.ss.android.vc.common.widget.PreWaitingLoadingView;
import com.ss.android.vc.common.widget.PreviewVideoView;
import com.ss.android.vc.dependency.AbstractC60892h;
import com.ss.android.vc.dependency.AbstractC60907u;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.statemachine.C61344j;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.android.vc.meeting.module.audio.AudioRouteHelper;
import com.ss.android.vc.meeting.module.base.AbstractC61417a;
import com.ss.android.vc.meeting.module.base.AbstractC61428h;
import com.ss.android.vc.meeting.module.base.C61434m;
import com.ss.android.vc.meeting.module.base.MeetingShadowActivity;
import com.ss.android.vc.meeting.module.busyring.C61544d;
import com.ss.android.vc.meeting.module.fastentry.AbstractC61661d;
import com.ss.android.vc.meeting.module.floatingwindow.FloatWindowLaunchType;
import com.ss.android.vc.meeting.module.lobby.MeetingLobbyViewModel;
import com.ss.android.vc.meeting.module.lobby.pb.VCLobbyParticipant;
import com.ss.android.vc.meeting.module.lobby.pb.VCManageResult;
import com.ss.android.vc.meeting.module.meetingdialog.labs.C62264m;
import com.ss.android.vc.meeting.module.meetingdialog.labs.LabsScene;
import com.ss.android.vc.meeting.module.meetingdialog.labs.LabsUtils;
import com.ss.android.vc.meeting.module.multi.ByteRTCMeetingActivity;
import com.ss.android.vc.meeting.module.p3130k.C61999a;
import com.ss.android.vc.meeting.utils.C63529q;
import com.ss.android.vc.statistics.event.C63732ac;
import com.ss.android.vc.statistics.event.MeetingLobbyEvent;
import com.ss.android.vc.statistics.event2.MeetingPreEvent;
import com.ss.android.vc.statistics.event2.MeetingWaitingEvent;
import com.ss.android.vc.statistics.event2.SpeakerOptionEvent;
import com.ss.android.vc.statistics.p3180a.C63693e;
import com.ss.android.vc.trace.VCLauncherStatistics;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0005\b\u0016\u0018\u0000 g2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001gB\u0005¢\u0006\u0002\u0010\u0006J\b\u0010-\u001a\u00020.H\u0002J\b\u0010/\u001a\u00020.H\u0002J\b\u00100\u001a\u0004\u0018\u00010\u001cJ\b\u00101\u001a\u00020.H\u0002J\b\u00102\u001a\u00020.H\u0002J\b\u00103\u001a\u00020.H\u0002J\b\u00104\u001a\u00020.H\u0002J\b\u00105\u001a\u00020.H\u0002J\b\u00106\u001a\u00020.H\u0016J\b\u00107\u001a\u00020\u0015H\u0016J$\u00108\u001a\u00020\b2\u0006\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<2\b\u0010=\u001a\u0004\u0018\u00010>H\u0016J\u0012\u0010?\u001a\u00020.2\b\u0010=\u001a\u0004\u0018\u00010>H\u0016J\b\u0010@\u001a\u00020.H\u0016J\b\u0010A\u001a\u00020.H\u0016J\b\u0010B\u001a\u00020.H\u0016J\u000e\u0010C\u001a\u00020.2\u0006\u0010D\u001a\u00020\u0015J\b\u0010E\u001a\u00020.H\u0016J\u0016\u0010F\u001a\u00020.2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020I0HH\u0016J\u0012\u0010J\u001a\u00020.2\b\u0010K\u001a\u0004\u0018\u00010LH\u0016J\b\u0010M\u001a\u00020.H\u0016J\b\u0010N\u001a\u00020.H\u0016J\u001a\u0010O\u001a\u00020.2\u0006\u0010P\u001a\u00020\b2\b\u0010=\u001a\u0004\u0018\u00010>H\u0016J\b\u0010Q\u001a\u00020.H\u0002J\b\u0010R\u001a\u00020.H\u0002J\b\u0010S\u001a\u00020.H\u0002J\b\u0010T\u001a\u00020.H\u0002J\b\u0010U\u001a\u00020.H\u0002J\b\u0010V\u001a\u00020.H\u0002J\b\u0010W\u001a\u00020.H\u0002J\u0006\u0010X\u001a\u00020.J\u0010\u0010Y\u001a\u00020.2\u0006\u0010Z\u001a\u00020\u0015H\u0002J\b\u0010[\u001a\u00020\u0015H\u0016J\u001a\u0010\\\u001a\u00020.2\u0006\u0010]\u001a\u00020\u00152\b\b\u0002\u0010^\u001a\u00020\u0015H\u0002J\u001a\u0010_\u001a\u00020.2\u0006\u0010`\u001a\u00020\u00152\b\b\u0002\u0010^\u001a\u00020\u0015H\u0002J0\u0010a\u001a\u00020.2\u0006\u0010P\u001a\u00020\b2\u0006\u0010b\u001a\u00020c2\u0006\u0010d\u001a\u00020c2\u0006\u0010e\u001a\u00020c2\u0006\u0010f\u001a\u00020cH\u0002R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X.¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X.¢\u0006\u0002\n\u0000¨\u0006h"}, d2 = {"Lcom/ss/android/vc/meeting/module/lobby/MeetingLobbyFragment;", "Lcom/ss/android/vc/meeting/module/base/MeetingFragment;", "Lcom/ss/android/vc/meeting/module/lobby/ILobbyListener;", "Lcom/ss/android/vc/meeting/module/fastentry/IVideoChatFastEntry;", "Lcom/ss/android/vc/meeting/module/audio/AudioRouteHelper$IRouteAction;", "Lcom/ss/android/vc/meeting/module/base/IFragmentBackHandler;", "()V", "audioContainer", "Landroid/view/View;", "audioRouteHelper", "Lcom/ss/android/vc/meeting/module/audio/AudioRouteHelper;", "audioText", "Landroid/widget/TextView;", "audioView", "Landroid/widget/ImageView;", "audioWarning", "cameraContainer", "cameraText", "cameraView", "cameraWarning", "goingToFloatWindow", "", "isAudioOn", "isCameraOn", "isInLobby", "labsDialog", "Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface;", "mBusyRingViewControl", "Lcom/ss/android/vc/meeting/module/busyring/BusyRingViewControl;", "mChatterService", "Lcom/ss/android/vc/dependency/IChatDependency;", "getMChatterService", "()Lcom/ss/android/vc/dependency/IChatDependency;", "mChatterService$delegate", "Lkotlin/Lazy;", "mOrientationListener", "Lcom/ss/android/vc/meeting/module/orientation/ScreenOrientationHelper$OnChangeListener;", "mScreenOrientationHelper", "Lcom/ss/android/vc/meeting/module/orientation/ScreenOrientationHelper;", "speakerContainer", "speakerText", "speakerView", "vLeavePreWaiting", "viewModel", "Lcom/ss/android/vc/meeting/module/lobby/MeetingLobbyViewModel;", "destroyViewControl", "", "diffUIByLobbyState", "getBusyRingViewControl", "hideAvatarView", "initBottomBar", "initScreenRotation", "initViews", "observerState", "onAudioRouteSwitch", "onBackPressed", "onCreateView_", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onCreate_", "onDestroyView_", "onDestroy_", "onLobbyStateChange", "onOrientationChange", "isLandscape", "onPlaybackDigitalMute", "onPushLobbyNotify", "lobbyParticipants", "", "Lcom/ss/android/vc/meeting/module/lobby/pb/VCLobbyParticipant;", "onPushLobbyResult", "result", "Lcom/ss/android/vc/meeting/module/lobby/pb/VCManageResult;", "onStart_", "onStop_", "onViewCreated_", "view", "presetBtnStates", "rotateBottomMenuView", "rotateIcon", "rotateTitle", "sendEndToStateMachine", "setSpeakerMute", "showAvatarView", "showFloatWindowForBack2App", "startCameraPreview", "isTriggerByClick", "tryShowFloatWindow", "updateAudioState", "isAudioOpen", "isNeedShowToast", "updateCameraState", "isCameraOpen", "updateMargins", "leftMarginInDp", "", "topMarginInDp", "rightMarginInDp", "bottomMarginInDp", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.lobby.f */
public class MeetingLobbyFragment extends C61434m implements AudioRouteHelper.IRouteAction, AbstractC61428h, AbstractC61661d, AbstractC62119b {

    /* renamed from: q */
    public static final Companion f156062q = new Companion(null);

    /* renamed from: a */
    public MeetingLobbyViewModel f156063a;

    /* renamed from: b */
    public C61544d f156064b;

    /* renamed from: c */
    public ImageView f156065c;

    /* renamed from: d */
    public ImageView f156066d;

    /* renamed from: e */
    public TextView f156067e;

    /* renamed from: f */
    public ImageView f156068f;

    /* renamed from: g */
    public ImageView f156069g;

    /* renamed from: h */
    public TextView f156070h;

    /* renamed from: i */
    public ImageView f156071i;

    /* renamed from: j */
    public TextView f156072j;

    /* renamed from: k */
    public boolean f156073k;

    /* renamed from: l */
    public boolean f156074l = true;

    /* renamed from: m */
    public AbstractC61222a f156075m;

    /* renamed from: n */
    public AudioRouteHelper f156076n;

    /* renamed from: o */
    public boolean f156077o = true;

    /* renamed from: p */
    public boolean f156078p = true;

    /* renamed from: r */
    private final Lazy f156079r = LazyKt.lazy(C62138i.INSTANCE);

    /* renamed from: s */
    private C61999a.AbstractC62001a f156080s;

    /* renamed from: t */
    private C61999a f156081t;

    /* renamed from: u */
    private View f156082u;

    /* renamed from: v */
    private View f156083v;

    /* renamed from: w */
    private View f156084w;

    /* renamed from: x */
    private View f156085x;

    /* renamed from: y */
    private HashMap f156086y;

    /* renamed from: k */
    private final AbstractC60892h m242683k() {
        return (AbstractC60892h) this.f156079r.getValue();
    }

    /* renamed from: a */
    public View mo214952a(int i) {
        if (this.f156086y == null) {
            this.f156086y = new HashMap();
        }
        View view = (View) this.f156086y.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f156086y.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.vc.meeting.module.lobby.AbstractC62119b
    /* renamed from: a */
    public void mo214943a(VCManageResult vCManageResult) {
    }

    @Override // com.ss.android.vc.meeting.module.lobby.AbstractC62119b
    /* renamed from: a */
    public void mo214944a(List<VCLobbyParticipant> list) {
        Intrinsics.checkParameterIsNotNull(list, "lobbyParticipants");
    }

    /* renamed from: j */
    public void mo214961j() {
        HashMap hashMap = this.f156086y;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.vc.meeting.module.base.C61434m, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo214961j();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/vc/meeting/module/lobby/MeetingLobbyFragment$Companion;", "", "()V", "INTERVAL_2_FRAMES", "", "KEY_IS_FROM_FLOAT", "", "TAG", "newInstance", "Lcom/ss/android/vc/meeting/module/lobby/MeetingLobbyFragment;", "isFromFloat", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.lobby.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final MeetingLobbyFragment mo214962a(boolean z) {
            MeetingLobbyFragment fVar = new MeetingLobbyFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean("key_is_from_float", z);
            fVar.setArguments(bundle);
            return fVar;
        }
    }

    /* renamed from: i */
    public final C61544d mo214960i() {
        return this.f156064b;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/vc/dependency/IChatDependency;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.lobby.f$i */
    static final class C62138i extends Lambda implements Function0<AbstractC60892h> {
        public static final C62138i INSTANCE = new C62138i();

        C62138i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC60892h invoke() {
            return VideoChatModuleDependency.getChatDependency();
        }
    }

    /* renamed from: E */
    private final void m242672E() {
        C61544d dVar = this.f156064b;
        if (dVar != null) {
            dVar.destroy();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.lobby.f$f */
    public static final class C62133f extends Lambda implements Function0<Unit> {
        final /* synthetic */ MeetingLobbyFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62133f(MeetingLobbyFragment fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "onDismiss", "com/ss/android/vc/meeting/module/lobby/MeetingLobbyFragment$initViews$1$1$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.lobby.f$f$a */
        public static final class C62134a implements AbstractC61222a.AbstractC61223a {

            /* renamed from: a */
            final /* synthetic */ C62133f f156089a;

            C62134a(C62133f fVar) {
                this.f156089a = fVar;
            }

            @Override // com.ss.android.vc.meeting.basedialog.AbstractC61222a.AbstractC61223a
            public final void bY_() {
                this.f156089a.this$0.f156075m = null;
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            LabsScene labsScene;
            if (this.this$0.f156074l) {
                labsScene = LabsScene.PAGE_WAITING_ROOMS;
            } else {
                labsScene = LabsScene.PRE_WAITING_ROOM;
            }
            MeetingLobbyFragment fVar = this.this$0;
            C61303k w = this.this$0.mo212965w();
            C61303k w2 = this.this$0.mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w2, "meeting");
            AbstractC61222a a = C62264m.m243165a(fVar.getActivity(), w, labsScene, w2.mo212093K());
            a.mo211606a();
            a.mo211609a(new C62134a(this));
            fVar.f156075m = a;
            C63732ac.m249986f(labsScene, this.this$0.mo212965w());
            if (!this.this$0.f156074l) {
                MeetingPreEvent a2 = MeetingPreEvent.f160856b.mo220344a();
                C61303k w3 = this.this$0.mo212965w();
                Intrinsics.checkExpressionValueIsNotNull(w3, "meeting");
                a2.mo220328a(w3.mo212093K(), true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "pair", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.lobby.f$k */
    public static final class C62140k<T> implements AbstractC1178x<Pair<? extends Boolean, ? extends Boolean>> {

        /* renamed from: a */
        final /* synthetic */ MeetingLobbyFragment f156092a;

        C62140k(MeetingLobbyFragment fVar) {
            this.f156092a = fVar;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"com/ss/android/vc/meeting/module/lobby/MeetingLobbyFragment$observerState$2$1$1", "Ljava/lang/Runnable;", "run", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.lobby.f$k$a */
        public static final class RunnableC62141a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ boolean f156093a;

            /* renamed from: b */
            final /* synthetic */ C62140k f156094b;

            public void run() {
                this.f156094b.f156092a.mo214953a(this.f156093a);
            }

            RunnableC62141a(boolean z, C62140k kVar) {
                this.f156093a = z;
                this.f156094b = kVar;
            }
        }

        /* renamed from: a */
        public final void onChanged(Pair<Boolean, Boolean> pair) {
            if (pair != null) {
                boolean booleanValue = pair.getFirst().booleanValue();
                boolean booleanValue2 = pair.getSecond().booleanValue();
                C60700b.m235851b("MeetingLobbyFragment", "[observeCameraState]", "isCameraOpen: " + booleanValue);
                C61303k w = this.f156092a.mo212965w();
                Intrinsics.checkExpressionValueIsNotNull(w, "meeting");
                w.mo212092J().mo212539e(booleanValue ^ true);
                if (!booleanValue) {
                    if (C60788y.m236247a(this.f156092a.getActivity())) {
                        AppCompatImageView appCompatImageView = (AppCompatImageView) this.f156092a.mo214952a(R.id.camera_permission_denied);
                        Intrinsics.checkExpressionValueIsNotNull(appCompatImageView, "camera_permission_denied");
                        appCompatImageView.setVisibility(8);
                        this.f156092a.mo214958g();
                    } else {
                        LKUIRoundedImageView lKUIRoundedImageView = (LKUIRoundedImageView) this.f156092a.mo214952a(R.id.avatarView);
                        Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView, "avatarView");
                        lKUIRoundedImageView.setVisibility(8);
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) this.f156092a.mo214952a(R.id.camera_permission_denied);
                        Intrinsics.checkExpressionValueIsNotNull(appCompatImageView2, "camera_permission_denied");
                        appCompatImageView2.setVisibility(0);
                    }
                    this.f156092a.mo214955b(false, booleanValue2);
                } else if (C60788y.m236247a(this.f156092a.getActivity())) {
                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) this.f156092a.mo214952a(R.id.camera_permission_denied);
                    Intrinsics.checkExpressionValueIsNotNull(appCompatImageView3, "camera_permission_denied");
                    appCompatImageView3.setVisibility(8);
                    C26171w.m94676a(new RunnableC62141a(booleanValue2, this), 32);
                } else {
                    AppCompatImageView appCompatImageView4 = (AppCompatImageView) this.f156092a.mo214952a(R.id.camera_permission_denied);
                    Intrinsics.checkExpressionValueIsNotNull(appCompatImageView4, "camera_permission_denied");
                    appCompatImageView4.setVisibility(0);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/vc/meeting/module/lobby/MeetingLobbyFragment$startCameraPreview$1", "Lcom/ss/android/vc/common/widget/PreviewVideoView$IStartPreviewListener;", "onStartPreviewFail", "", "onStartPreviewSuccess", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.lobby.f$o */
    public static final class C62145o implements PreviewVideoView.AbstractC60811a {

        /* renamed from: a */
        final /* synthetic */ MeetingLobbyFragment f156098a;

        /* renamed from: b */
        final /* synthetic */ boolean f156099b;

        @Override // com.ss.android.vc.common.widget.PreviewVideoView.AbstractC60811a
        /* renamed from: a */
        public void mo208482a() {
            this.f156098a.mo214957f();
            this.f156098a.mo214955b(true, this.f156099b);
        }

        @Override // com.ss.android.vc.common.widget.PreviewVideoView.AbstractC60811a
        /* renamed from: b */
        public void mo208483b() {
            this.f156098a.mo214958g();
            this.f156098a.mo214955b(false, this.f156099b);
        }

        C62145o(MeetingLobbyFragment fVar, boolean z) {
            this.f156098a = fVar;
            this.f156099b = z;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.lobby.f$c */
    public static final class C62128c extends Lambda implements Function0<Unit> {
        final /* synthetic */ MeetingLobbyFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62128c(MeetingLobbyFragment fVar) {
            super(0);
            this.this$0 = fVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            C60788y.m236245a(C60773o.m236124b(this.this$0.getContext()), (AbstractC60798c) new AbstractC60798c(this) {
                /* class com.ss.android.vc.meeting.module.lobby.MeetingLobbyFragment.C62128c.C621291 */

                /* renamed from: a */
                final /* synthetic */ C62128c f156087a;

                {
                    this.f156087a = r1;
                }

                @Override // com.ss.android.vc.common.permission.AbstractC60798c
                public final void permissionGranted(boolean z) {
                    String str;
                    C60700b.m235851b("MeetingLobbyFragment", "[onClick]", "startCameraPreview: granted = " + z);
                    if (z) {
                        MeetingLobbyFragment.m242676c(this.f156087a.this$0).setEnabled(true);
                        MeetingLobbyFragment.m242677d(this.f156087a.this$0).setVisibility(4);
                        AppCompatImageView appCompatImageView = (AppCompatImageView) this.f156087a.this$0.mo214952a(R.id.camera_permission_denied);
                        Intrinsics.checkExpressionValueIsNotNull(appCompatImageView, "camera_permission_denied");
                        appCompatImageView.setVisibility(8);
                        MeetingLobbyFragment.m242678e(this.f156087a.this$0).setTextColor(C60773o.m236126d(R.color.preview_text_n600));
                        if (this.f156087a.this$0.f156074l) {
                            MeetingLobbyEvent meetingLobbyEvent = MeetingLobbyEvent.f160867a;
                            MeetingLobbyEvent.LobbyAction lobbyAction = MeetingLobbyEvent.LobbyAction.CAMERA;
                            C61303k w = this.f156087a.this$0.mo212965w();
                            Intrinsics.checkExpressionValueIsNotNull(w, "meeting");
                            String K = w.mo212093K();
                            Intrinsics.checkExpressionValueIsNotNull(K, "meeting.statisticsId");
                            Integer valueOf = Integer.valueOf(!this.f156087a.this$0.f156078p ? 1 : 0);
                            C61303k w2 = this.f156087a.this$0.mo212965w();
                            Intrinsics.checkExpressionValueIsNotNull(w2, "meeting");
                            meetingLobbyEvent.mo220382a(lobbyAction, K, valueOf, w2.mo212056e());
                            MeetingWaitingEvent a = MeetingWaitingEvent.f160808b.mo220235a();
                            if (this.f156087a.this$0.f156078p) {
                                str = "close";
                            } else {
                                str = "open";
                            }
                            C61303k w3 = this.f156087a.this$0.mo212965w();
                            Intrinsics.checkExpressionValueIsNotNull(w3, "meeting");
                            VideoChat e = w3.mo212056e();
                            C61303k w4 = this.f156087a.this$0.mo212965w();
                            Intrinsics.checkExpressionValueIsNotNull(w4, "meeting");
                            a.mo220231a(str, e, w4.mo212093K());
                        } else {
                            MeetingPreEvent a2 = MeetingPreEvent.f160856b.mo220344a();
                            C61303k w5 = this.f156087a.this$0.mo212965w();
                            Intrinsics.checkExpressionValueIsNotNull(w5, "meeting");
                            a2.mo220332a(w5.mo212093K(), true, !this.f156087a.this$0.f156078p);
                        }
                        C61303k w6 = this.f156087a.this$0.mo212965w();
                        Intrinsics.checkExpressionValueIsNotNull(w6, "meeting");
                        String d = w6.mo212055d();
                        Intrinsics.checkExpressionValueIsNotNull(d, "meeting.meetingId");
                        MeetingLobbyFragment.m242679f(this.f156087a.this$0).setCameraSwitchState(!this.f156087a.this$0.f156078p, true, d);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.lobby.f$d */
    public static final class C62130d extends Lambda implements Function0<Unit> {
        final /* synthetic */ MeetingLobbyFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62130d(MeetingLobbyFragment fVar) {
            super(0);
            this.this$0 = fVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            C60788y.m236249b((Context) C60773o.m236124b(this.this$0.getContext()), (AbstractC60798c) new AbstractC60798c(this) {
                /* class com.ss.android.vc.meeting.module.lobby.MeetingLobbyFragment.C62130d.C621311 */

                /* renamed from: a */
                final /* synthetic */ C62130d f156088a;

                {
                    this.f156088a = r1;
                }

                @Override // com.ss.android.vc.common.permission.AbstractC60798c
                public final void permissionGranted(boolean z) {
                    String str;
                    C60700b.m235851b("MeetingLobbyFragment", "[onClick]", "audioContainer: granted = " + z);
                    if (z) {
                        MeetingLobbyFragment.m242680g(this.f156088a.this$0).setEnabled(true);
                        MeetingLobbyFragment.m242681h(this.f156088a.this$0).setVisibility(4);
                        MeetingLobbyFragment.m242682i(this.f156088a.this$0).setTextColor(C60773o.m236126d(R.color.preview_text_n600));
                        if (this.f156088a.this$0.f156074l) {
                            MeetingLobbyEvent meetingLobbyEvent = MeetingLobbyEvent.f160867a;
                            MeetingLobbyEvent.LobbyAction lobbyAction = MeetingLobbyEvent.LobbyAction.MIC;
                            C61303k w = this.f156088a.this$0.mo212965w();
                            Intrinsics.checkExpressionValueIsNotNull(w, "meeting");
                            String K = w.mo212093K();
                            Intrinsics.checkExpressionValueIsNotNull(K, "meeting.statisticsId");
                            Integer valueOf = Integer.valueOf(!this.f156088a.this$0.f156077o ? 1 : 0);
                            C61303k w2 = this.f156088a.this$0.mo212965w();
                            Intrinsics.checkExpressionValueIsNotNull(w2, "meeting");
                            meetingLobbyEvent.mo220382a(lobbyAction, K, valueOf, w2.mo212056e());
                            MeetingWaitingEvent a = MeetingWaitingEvent.f160808b.mo220235a();
                            if (this.f156088a.this$0.f156077o) {
                                str = "close";
                            } else {
                                str = "open";
                            }
                            C61303k w3 = this.f156088a.this$0.mo212965w();
                            Intrinsics.checkExpressionValueIsNotNull(w3, "meeting");
                            VideoChat e = w3.mo212056e();
                            C61303k w4 = this.f156088a.this$0.mo212965w();
                            Intrinsics.checkExpressionValueIsNotNull(w4, "meeting");
                            a.mo220234b(str, e, w4.mo212093K());
                        } else {
                            MeetingPreEvent a2 = MeetingPreEvent.f160856b.mo220344a();
                            C61303k w5 = this.f156088a.this$0.mo212965w();
                            Intrinsics.checkExpressionValueIsNotNull(w5, "meeting");
                            a2.mo220339b(w5.mo212093K(), true, !this.f156088a.this$0.f156077o);
                        }
                        C61303k w6 = this.f156088a.this$0.mo212965w();
                        Intrinsics.checkExpressionValueIsNotNull(w6, "meeting");
                        String d = w6.mo212055d();
                        Intrinsics.checkExpressionValueIsNotNull(d, "meeting.meetingId");
                        MeetingLobbyFragment.m242679f(this.f156088a.this$0).setAudioSwitchState(!this.f156088a.this$0.f156077o, true, d);
                    }
                    AudioRouteHelper bVar = this.f156088a.this$0.f156076n;
                    if (bVar != null) {
                        bVar.mo212740b(z);
                    }
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0014¨\u0006\b"}, d2 = {"com/ss/android/vc/meeting/module/lobby/MeetingLobbyFragment$showFloatWindowForBack2App$1", "Lcom/ss/android/vc/common/utils/AbsAsyncVcTask;", "", "doInBackground", "()Ljava/lang/Boolean;", "onPostExecute", "", "result", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.lobby.f$n */
    public static final class C62144n extends AbstractC60728a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ MeetingLobbyFragment f156097a;

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public Boolean mo208348a() {
            Context context;
            FragmentActivity activity = this.f156097a.getActivity();
            if (activity != null) {
                context = activity.getApplicationContext();
            } else {
                context = null;
            }
            return Boolean.valueOf(C28460b.m104296a(context));
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C62144n(MeetingLobbyFragment fVar) {
            this.f156097a = fVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.vc.common.p3083e.AbstractC60728a
        /* renamed from: b */
        public /* synthetic */ void mo208351b(Boolean bool) {
            mo214969a(bool.booleanValue());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo214969a(boolean z) {
            super.mo208351b(Boolean.valueOf(z));
            if (z) {
                C63693e.m249682a("lobby");
                C61303k w = this.f156097a.mo212965w();
                Intrinsics.checkExpressionValueIsNotNull(w, "meeting");
                w.ae().mo213805a(0, FloatWindowLaunchType.BACK2FRONT);
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61428h
    /* renamed from: c */
    public boolean mo212915c() {
        IconFontView iconFontView = (IconFontView) mo214952a(R.id.lobby_back);
        if (iconFontView == null) {
            return true;
        }
        iconFontView.performClick();
        return true;
    }

    @Override // com.ss.android.vc.meeting.module.lobby.AbstractC62119b
    /* renamed from: d */
    public void mo214945d() {
        C60700b.m235851b("MeetingLobbyFragment", "[onLobbyStateChange]", "pre waiting to in waiting");
        this.f156074l = true;
        m242671D();
    }

    /* renamed from: e */
    public final void mo214956e() {
        C60700b.m235851b("MeetingLobbyFragment", "[showFloatWindowForBack2App]", "showFloatWindowForBack2App");
        C60735ab.m235996a(new C62144n(this));
    }

    /* renamed from: f */
    public final void mo214957f() {
        ConstraintLayout constraintLayout = (ConstraintLayout) mo214952a(R.id.avatarLayout);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "avatarLayout");
        constraintLayout.setVisibility(8);
    }

    /* renamed from: g */
    public final void mo214958g() {
        m242683k().getLoginChatter(new MeetingLobbyFragment$showAvatarView$1(this));
    }

    /* renamed from: h */
    public final void mo214959h() {
        mo212965w().mo212051a(C61344j.m239002a().mo212329a(SmEvents.EVENT_NT));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.lobby.f$g */
    public static final class C62135g extends Lambda implements Function0<Unit> {
        final /* synthetic */ MeetingLobbyFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62135g(MeetingLobbyFragment fVar) {
            super(0);
            this.this$0 = fVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            C60735ab.m235996a(new AbstractC60728a<Boolean>(this) {
                /* class com.ss.android.vc.meeting.module.lobby.MeetingLobbyFragment.C62135g.C621361 */

                /* renamed from: a */
                final /* synthetic */ C62135g f156090a;

                /* access modifiers changed from: protected */
                /* renamed from: c */
                public Boolean mo208348a() {
                    Context context;
                    FragmentActivity activity = this.f156090a.this$0.getActivity();
                    if (activity != null) {
                        context = activity.getApplicationContext();
                    } else {
                        context = null;
                    }
                    return Boolean.valueOf(C28460b.m104296a(context));
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f156090a = r1;
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.ss.android.vc.common.p3083e.AbstractC60728a
                /* renamed from: b */
                public /* synthetic */ void mo208351b(Boolean bool) {
                    mo214963a(bool.booleanValue());
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public void mo214963a(boolean z) {
                    FragmentActivity activity;
                    AbsSingleInstanceControl aE;
                    super.mo208351b(Boolean.valueOf(z));
                    if (z) {
                        C63693e.m249682a("lobby");
                        C61303k w = this.f156090a.this$0.mo212965w();
                        if (w == null || (aE = w.aE()) == null || !aE.mo208293c()) {
                            C61303k w2 = this.f156090a.this$0.mo212965w();
                            Intrinsics.checkExpressionValueIsNotNull(w2, "meeting");
                            AbstractC61417a W = w2.mo212105W();
                            Intrinsics.checkExpressionValueIsNotNull(W, "meeting.meetingControl");
                            W.mo212829h().mo213805a(0, FloatWindowLaunchType.NORMAL);
                            this.f156090a.this$0.f156073k = true;
                            this.f156090a.this$0.requireActivity().finish();
                            return;
                        }
                        MeetingShadowActivity.Companion aVar = MeetingShadowActivity.f154002c;
                        Context a = ar.m236694a();
                        Intrinsics.checkExpressionValueIsNotNull(a, "VcContextDeps.getAppContext()");
                        FragmentActivity activity2 = this.f156090a.this$0.getActivity();
                        if (!(activity2 instanceof ByteRTCMeetingActivity)) {
                            activity2 = null;
                        }
                        aVar.mo212808a(a, false, (ByteRTCMeetingActivity) activity2);
                        this.f156090a.this$0.f156073k = true;
                    } else if (C60773o.m236120a((Activity) this.f156090a.this$0.getActivity()) && (activity = this.f156090a.this$0.getActivity()) != null) {
                        Context requireContext = this.f156090a.this$0.requireContext();
                        Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
                        AbstractC60907u larkAppDependency = VideoChatModuleDependency.getLarkAppDependency();
                        Intrinsics.checkExpressionValueIsNotNull(larkAppDependency, "VideoChatModuleDependency.getLarkAppDependency()");
                        String mustacheFormat = UIHelper.mustacheFormat((int) R.string.View_G_PopupPermission, "appName", larkAppDependency.mo196409b());
                        Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "UIHelper.mustacheFormat(…Dependency().larkAppName)");
                        Intrinsics.checkExpressionValueIsNotNull(activity, "it");
                        Resources resources = activity.getResources();
                        Intrinsics.checkExpressionValueIsNotNull(resources, "it.resources");
                        Configuration configuration = resources.getConfiguration();
                        Intrinsics.checkExpressionValueIsNotNull(configuration, "it.resources.configuration");
                        VCDialogUtils.m236160a(requireContext, (int) R.string.View_N_FloatingWindowPermission, 1, mustacheFormat, (int) R.string.View_G_CancelButton, (int) R.string.View_G_ConfirmButton, false, UDUiModeUtils.m93320a(configuration));
                    }
                }
            });
            if (!this.this$0.f156074l) {
                MeetingLobbyEvent meetingLobbyEvent = MeetingLobbyEvent.f160867a;
                C61303k w = this.this$0.mo212965w();
                Intrinsics.checkExpressionValueIsNotNull(w, "meeting");
                meetingLobbyEvent.mo220383a("click_back", w.mo212056e());
                MeetingPreEvent a = MeetingPreEvent.f160856b.mo220344a();
                C61303k w2 = this.this$0.mo212965w();
                Intrinsics.checkExpressionValueIsNotNull(w2, "meeting");
                a.mo220335b(w2.mo212093K(), true);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/vc/meeting/module/lobby/MeetingLobbyFragment$onViewCreated_$1", "Lcom/ss/android/vc/meeting/module/audio/AudioRouteHelper$IStatisAction;", "onSpeakerClick", "", "action", "", "onSpeakerView", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.lobby.f$m */
    public static final class C62143m implements AudioRouteHelper.IStatisAction {

        /* renamed from: a */
        final /* synthetic */ MeetingLobbyFragment f156096a;

        @Override // com.ss.android.vc.meeting.module.audio.AudioRouteHelper.IStatisAction
        /* renamed from: a */
        public void mo212748a() {
            String str;
            String str2;
            SpeakerOptionEvent a = SpeakerOptionEvent.f160813b.mo220241a();
            C61303k w = this.f156096a.mo212965w();
            VideoChat videoChat = null;
            if (w != null) {
                str = w.mo212093K();
            } else {
                str = null;
            }
            if (this.f156096a.f156074l) {
                str2 = "waiting_room";
            } else {
                str2 = "pre_waiting_room";
            }
            C61303k w2 = this.f156096a.mo212965w();
            if (w2 != null) {
                videoChat = w2.mo212056e();
            }
            a.mo220239a(str, str2, videoChat);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C62143m(MeetingLobbyFragment fVar) {
            this.f156096a = fVar;
        }

        @Override // com.ss.android.vc.meeting.module.audio.AudioRouteHelper.IStatisAction
        /* renamed from: a */
        public void mo212749a(String str) {
            String str2;
            VideoChat videoChat;
            Intrinsics.checkParameterIsNotNull(str, "action");
            SpeakerOptionEvent a = SpeakerOptionEvent.f160813b.mo220241a();
            if (this.f156096a.f156074l) {
                str2 = "waiting_room";
            } else {
                str2 = "pre_waiting_room";
            }
            C61303k w = this.f156096a.mo212965w();
            String str3 = null;
            if (w != null) {
                videoChat = w.mo212056e();
            } else {
                videoChat = null;
            }
            C61303k w2 = this.f156096a.mo212965w();
            if (w2 != null) {
                str3 = w2.mo212093K();
            }
            a.mo220240a(str2, str, videoChat, str3);
        }
    }

    /* renamed from: u */
    private final void m242687u() {
        ImageView imageView = this.f156071i;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("speakerView");
        }
        imageView.setImageDrawable(C60773o.m236128f(R.drawable.ud_icon_speaker_mute_filled));
        ImageView imageView2 = this.f156071i;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("speakerView");
        }
        imageView2.getDrawable().setTint(C60773o.m236126d(R.color.ud_N700));
        TextView textView = this.f156072j;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("speakerText");
        }
        textView.setText(R.string.View_MV_AlreadyMutedButton);
    }

    @Override // com.ss.android.vc.meeting.module.audio.AudioRouteHelper.IRouteAction
    public void bV_() {
        C60700b.m235851b("MeetingLobbyFragment", "[onAudioRouteSwitch]", "isInLobby: " + this.f156074l);
        MeetingLobbyViewModel hVar = this.f156063a;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        hVar.switchSpeaker();
    }

    @Override // com.ss.android.vc.meeting.module.audio.AudioRouteHelper.IRouteAction
    public void bW_() {
        C60700b.m235851b("MeetingLobbyFragment", "[onPlaybackDigitalMute]", String.valueOf(this.f156077o));
        m242687u();
        if (this.f156077o) {
            MeetingLobbyViewModel hVar = this.f156063a;
            if (hVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            }
            C61303k w = mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w, "meeting");
            String d = w.mo212055d();
            Intrinsics.checkExpressionValueIsNotNull(d, "meeting.meetingId");
            hVar.setAudioSwitchState(false, true, d);
        }
    }

    @Override // com.ss.android.vc.meeting.module.fastentry.AbstractC61661d
    public boolean bx_() {
        if (!C28460b.m104296a(getActivity())) {
            return false;
        }
        C63693e.m249682a("lobby");
        C61303k w = mo212965w();
        Intrinsics.checkExpressionValueIsNotNull(w, "meeting");
        w.ae().mo213805a(0, FloatWindowLaunchType.NORMAL);
        return true;
    }

    @Override // com.ss.android.vc.meeting.module.base.C61434m
    /* renamed from: o */
    public void mo212936o() {
        super.mo212936o();
        if (this.f156073k) {
            return;
        }
        if (MeetingManager.m238341a().mo211892a(true)) {
            ((PreviewVideoView) mo214952a(R.id.video_view)).mo208477c();
        } else {
            ((PreviewVideoView) mo214952a(R.id.video_view)).mo208476b();
        }
    }

    @Override // com.ss.android.vc.meeting.module.base.C61434m
    /* renamed from: p */
    public void mo212937p() {
        super.mo212937p();
        C61999a aVar = this.f156081t;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mScreenOrientationHelper");
        }
        aVar.mo214618b(this.f156080s);
        PreWaitingLoadingView preWaitingLoadingView = (PreWaitingLoadingView) mo214952a(R.id.pre_waiting_loading);
        if (preWaitingLoadingView != null) {
            preWaitingLoadingView.cancelAnimation();
        }
        AbstractC61222a aVar2 = this.f156075m;
        if (aVar2 != null) {
            aVar2.dismiss();
        }
    }

    @Override // com.ss.android.vc.meeting.module.base.C61434m
    /* renamed from: q */
    public void mo212938q() {
        m242672E();
        AbstractC61417a x = mo212966x();
        Intrinsics.checkExpressionValueIsNotNull(x, "meetingControl");
        x.mo212842u().mo214939b(this);
        PreviewVideoView previewVideoView = (PreviewVideoView) mo214952a(R.id.video_view);
        if (previewVideoView != null) {
            previewVideoView.mo208477c();
        }
        AudioRouteHelper bVar = this.f156076n;
        if (bVar != null) {
            bVar.mo212739b();
        }
        super.mo212938q();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.lobby.f$b */
    public static final class C62127b extends Lambda implements Function0<Unit> {
        final /* synthetic */ MeetingLobbyFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62127b(MeetingLobbyFragment fVar) {
            super(0);
            this.this$0 = fVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            MeetingPreEvent a = MeetingPreEvent.f160856b.mo220344a();
            C61303k w = this.this$0.mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w, "meeting");
            a.mo220334b(w.mo212093K());
            MeetingLobbyEvent meetingLobbyEvent = MeetingLobbyEvent.f160867a;
            C61303k w2 = this.this$0.mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w2, "meeting");
            meetingLobbyEvent.mo220383a("click_leave", w2.mo212056e());
            this.this$0.mo214959h();
            FragmentActivity requireActivity = this.this$0.requireActivity();
            if (!(requireActivity instanceof ByteRTCMeetingActivity)) {
                requireActivity = null;
            }
            ByteRTCMeetingActivity byteRTCMeetingActivity = (ByteRTCMeetingActivity) requireActivity;
            if (byteRTCMeetingActivity != null) {
                byteRTCMeetingActivity.mo215864y();
            }
            ((PreviewVideoView) this.this$0.mo214952a(R.id.video_view)).mo208476b();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.lobby.f$h */
    public static final class C62137h extends Lambda implements Function0<Unit> {
        final /* synthetic */ MeetingLobbyFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62137h(MeetingLobbyFragment fVar) {
            super(0);
            this.this$0 = fVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            ByteRTCMeetingActivity byteRTCMeetingActivity = null;
            if (this.this$0.f156074l) {
                MeetingLobbyEvent meetingLobbyEvent = MeetingLobbyEvent.f160867a;
                MeetingLobbyEvent.LobbyAction lobbyAction = MeetingLobbyEvent.LobbyAction.HANGUP;
                C61303k w = this.this$0.mo212965w();
                Intrinsics.checkExpressionValueIsNotNull(w, "meeting");
                String K = w.mo212093K();
                Intrinsics.checkExpressionValueIsNotNull(K, "meeting.statisticsId");
                C61303k w2 = this.this$0.mo212965w();
                Intrinsics.checkExpressionValueIsNotNull(w2, "meeting");
                meetingLobbyEvent.mo220382a(lobbyAction, K, null, w2.mo212056e());
            }
            this.this$0.mo214959h();
            FragmentActivity requireActivity = this.this$0.requireActivity();
            if (requireActivity instanceof ByteRTCMeetingActivity) {
                byteRTCMeetingActivity = requireActivity;
            }
            ByteRTCMeetingActivity byteRTCMeetingActivity2 = byteRTCMeetingActivity;
            if (byteRTCMeetingActivity2 != null) {
                byteRTCMeetingActivity2.mo215864y();
            }
            ((PreviewVideoView) this.this$0.mo214952a(R.id.video_view)).mo208476b();
            MeetingWaitingEvent a = MeetingWaitingEvent.f160808b.mo220235a();
            C61303k w3 = this.this$0.mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w3, "meeting");
            VideoChat e = w3.mo212056e();
            C61303k w4 = this.this$0.mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w4, "meeting");
            a.mo220233a("leave", "none", null, e, w4.mo212093K());
        }
    }

    /* renamed from: t */
    private final void m242686t() {
        MeetingLobbyViewModel hVar = this.f156063a;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        MeetingLobbyFragment fVar = this;
        hVar.getAudioSwitchState().mo5923a(fVar, new C62139j(this));
        MeetingLobbyViewModel hVar2 = this.f156063a;
        if (hVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        hVar2.getCameraSwitchState().mo5923a(fVar, new C62140k(this));
        MeetingLobbyViewModel hVar3 = this.f156063a;
        if (hVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        hVar3.getSpeakerState().mo5923a(fVar, new C62142l(this));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.lobby.f$e */
    public static final class C62132e extends Lambda implements Function0<Unit> {
        final /* synthetic */ MeetingLobbyFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62132e(MeetingLobbyFragment fVar) {
            super(0);
            this.this$0 = fVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            int i;
            String str;
            String str2;
            MeetingLobbyViewModel.SpeakerState b = MeetingLobbyFragment.m242679f(this.this$0).getSpeakerState().mo5927b();
            boolean z = false;
            if (b == null || !b.mo214982b()) {
                i = 0;
            } else {
                i = 1;
            }
            AudioRouteHelper bVar = this.this$0.f156076n;
            if (bVar != null) {
                z = bVar.mo212738a(this.this$0.getActivity());
            }
            if (z) {
                str = "vc_meeting_loudspeaker_view";
            } else {
                str = "none";
            }
            if (this.this$0.f156074l) {
                MeetingLobbyEvent meetingLobbyEvent = MeetingLobbyEvent.f160867a;
                MeetingLobbyEvent.LobbyAction lobbyAction = MeetingLobbyEvent.LobbyAction.SPEAKER;
                C61303k w = this.this$0.mo212965w();
                Intrinsics.checkExpressionValueIsNotNull(w, "meeting");
                String K = w.mo212093K();
                Intrinsics.checkExpressionValueIsNotNull(K, "meeting.statisticsId");
                Integer valueOf = Integer.valueOf(i ^ 1);
                C61303k w2 = this.this$0.mo212965w();
                Intrinsics.checkExpressionValueIsNotNull(w2, "meeting");
                meetingLobbyEvent.mo220382a(lobbyAction, K, valueOf, w2.mo212056e());
                MeetingWaitingEvent a = MeetingWaitingEvent.f160808b.mo220235a();
                if (i != 0) {
                    str2 = "false";
                } else {
                    str2 = "true";
                }
                C61303k w3 = this.this$0.mo212965w();
                Intrinsics.checkExpressionValueIsNotNull(w3, "meeting");
                VideoChat e = w3.mo212056e();
                C61303k w4 = this.this$0.mo212965w();
                Intrinsics.checkExpressionValueIsNotNull(w4, "meeting");
                a.mo220232a(str2, e, w4.mo212093K(), str);
                return;
            }
            MeetingPreEvent a2 = MeetingPreEvent.f160856b.mo220344a();
            C61303k w5 = this.this$0.mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w5, "meeting");
            a2.mo220331a(w5.mo212093K(), true, MeetingLobbyFragment.m242679f(this.this$0).getAudioTypeName(), str);
        }
    }

    /* renamed from: r */
    private final void m242684r() {
        if (LabsUtils.m242914f()) {
            IconFontView iconFontView = (IconFontView) mo214952a(R.id.icon_labs_entry);
            Intrinsics.checkExpressionValueIsNotNull(iconFontView, "icon_labs_entry");
            iconFontView.setVisibility(0);
            IconFontView iconFontView2 = (IconFontView) mo214952a(R.id.icon_labs_entry);
            Intrinsics.checkExpressionValueIsNotNull(iconFontView2, "icon_labs_entry");
            C63529q.m248970a(iconFontView2, new C62133f(this));
        } else {
            IconFontView iconFontView3 = (IconFontView) mo214952a(R.id.icon_labs_entry);
            Intrinsics.checkExpressionValueIsNotNull(iconFontView3, "icon_labs_entry");
            iconFontView3.setVisibility(8);
        }
        IconFontView iconFontView4 = (IconFontView) mo214952a(R.id.lobby_back);
        Intrinsics.checkExpressionValueIsNotNull(iconFontView4, "lobby_back");
        C63529q.m248970a(iconFontView4, new C62135g(this));
        m242671D();
        SquircleImageView squircleImageView = (SquircleImageView) mo214952a(R.id.lobby_hangup);
        Intrinsics.checkExpressionValueIsNotNull(squircleImageView, "lobby_hangup");
        C63529q.m248970a(squircleImageView, new C62137h(this));
        this.f156064b = new C61544d(mo212965w(), (FrameLayout) mo214952a(R.id.busy_ringing_layout));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0077, code lost:
        if (r1.mo212092J().mo212504A() == false) goto L_0x007b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0068  */
    @Override // com.ss.android.vc.meeting.module.base.C61434m
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo212933l() {
        /*
        // Method dump skipped, instructions count: 151
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.lobby.MeetingLobbyFragment.mo212933l():void");
    }

    /* renamed from: D */
    private final void m242671D() {
        ViewGroup.LayoutParams layoutParams;
        View view;
        C60700b.m235851b("MeetingLobbyFragment", "[diffUIByLobbyState]", "isInLobby=" + this.f156074l);
        View a = mo214952a(R.id.lobby_statusbar_bg);
        if (a != null) {
            layoutParams = a.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            layoutParams.height = C60776r.m236148f();
        }
        View a2 = mo214952a(R.id.lobby_statusbar_bg);
        if (a2 != null) {
            a2.setLayoutParams(layoutParams);
        }
        ((FrameLayout) mo214952a(R.id.bottomContainer)).removeAllViews();
        if (this.f156074l) {
            View a3 = mo214952a(R.id.lobby_statusbar_bg);
            if (a3 != null) {
                a3.setBackground(C60773o.m236128f(R.color.vc_bg_body));
            }
            ((RelativeLayout) mo214952a(R.id.root_view)).setBackgroundColor(C60773o.m236126d(R.color.vc_bg_body));
            mo214952a(R.id.avatar_bg).setBackgroundResource(R.drawable.bg_lobby_avator_container);
            view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_meeting_in_lobby_bottom, (ViewGroup) null);
            Intrinsics.checkExpressionValueIsNotNull(view, "LayoutInflater.from(cont…ng_in_lobby_bottom, null)");
            TextView textView = (TextView) mo214952a(R.id.waitingTips);
            Intrinsics.checkExpressionValueIsNotNull(textView, "waitingTips");
            textView.setVisibility(0);
            SquircleImageView squircleImageView = (SquircleImageView) mo214952a(R.id.lobby_hangup);
            Intrinsics.checkExpressionValueIsNotNull(squircleImageView, "lobby_hangup");
            squircleImageView.setVisibility(0);
            LinearLayout linearLayout = (LinearLayout) mo214952a(R.id.pre_lobby_title);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "pre_lobby_title");
            linearLayout.setVisibility(8);
        } else {
            View a4 = mo214952a(R.id.lobby_statusbar_bg);
            if (a4 != null) {
                a4.setBackground(C60773o.m236128f(R.color.ud_N00));
            }
            ((RelativeLayout) mo214952a(R.id.root_view)).setBackgroundColor(C60773o.m236126d(R.color.ud_N00));
            mo214952a(R.id.avatar_bg).setBackgroundResource(R.drawable.bg_preview_avatar);
            view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_meeting_pre_lobby_bottom, (ViewGroup) null);
            Intrinsics.checkExpressionValueIsNotNull(view, "LayoutInflater.from(cont…g_pre_lobby_bottom, null)");
            TextView textView2 = (TextView) mo214952a(R.id.waitingTips);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "waitingTips");
            textView2.setVisibility(8);
            SquircleImageView squircleImageView2 = (SquircleImageView) mo214952a(R.id.lobby_hangup);
            Intrinsics.checkExpressionValueIsNotNull(squircleImageView2, "lobby_hangup");
            squircleImageView2.setVisibility(8);
            LinearLayout linearLayout2 = (LinearLayout) mo214952a(R.id.pre_lobby_title);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "pre_lobby_title");
            linearLayout2.setVisibility(0);
        }
        ((FrameLayout) mo214952a(R.id.bottomContainer)).addView(view);
        if (!this.f156074l) {
            View findViewById = ((FrameLayout) mo214952a(R.id.bottomContainer)).findViewById(R.id.leave_pre_waiting);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "bottomContainer.findView…>(R.id.leave_pre_waiting)");
            this.f156085x = findViewById;
            if (findViewById == null) {
                Intrinsics.throwUninitializedPropertyAccessException("vLeavePreWaiting");
            }
            C63529q.m248970a(findViewById, new C62127b(this));
        }
        if (this.f156074l) {
            PreviewVideoView previewVideoView = (PreviewVideoView) mo214952a(R.id.video_view);
            Intrinsics.checkExpressionValueIsNotNull(previewVideoView, "video_view");
            m242674a(previewVideoView, 7, 4, 7, 7);
            ConstraintLayout constraintLayout = (ConstraintLayout) mo214952a(R.id.avatarLayout);
            Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "avatarLayout");
            m242674a(constraintLayout, 7, 4, 7, 7);
        } else {
            PreviewVideoView previewVideoView2 = (PreviewVideoView) mo214952a(R.id.video_view);
            Intrinsics.checkExpressionValueIsNotNull(previewVideoView2, "video_view");
            m242674a(previewVideoView2, 16, 0, 16, 0);
            ConstraintLayout constraintLayout2 = (ConstraintLayout) mo214952a(R.id.avatarLayout);
            Intrinsics.checkExpressionValueIsNotNull(constraintLayout2, "avatarLayout");
            m242674a(constraintLayout2, 16, 0, 16, 0);
        }
        m242688v();
    }

    /* renamed from: s */
    private final void m242685s() {
        int i;
        int i2;
        C61303k w = mo212965w();
        Intrinsics.checkExpressionValueIsNotNull(w, "meeting");
        boolean z = true;
        boolean z2 = !w.mo212092J().mo212505B();
        C61303k w2 = mo212965w();
        Intrinsics.checkExpressionValueIsNotNull(w2, "meeting");
        boolean z3 = !w2.mo212092J().mo212504A();
        this.f156077o = z2;
        this.f156078p = z3;
        MeetingLobbyViewModel hVar = this.f156063a;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        C61303k w3 = mo212965w();
        Intrinsics.checkExpressionValueIsNotNull(w3, "meeting");
        String d = w3.mo212055d();
        Intrinsics.checkExpressionValueIsNotNull(d, "meeting.meetingId");
        int i3 = 0;
        hVar.setAudioSwitchState(z2, false, d);
        MeetingLobbyViewModel hVar2 = this.f156063a;
        if (hVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        C61303k w4 = mo212965w();
        Intrinsics.checkExpressionValueIsNotNull(w4, "meeting");
        String d2 = w4.mo212055d();
        Intrinsics.checkExpressionValueIsNotNull(d2, "meeting.meetingId");
        hVar2.setCameraSwitchState(z3, false, d2);
        C61303k w5 = mo212965w();
        Intrinsics.checkExpressionValueIsNotNull(w5, "meeting");
        if (w5.mo212092J().mo212510G()) {
            m242687u();
        } else {
            MeetingLobbyViewModel hVar3 = this.f156063a;
            if (hVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            }
            C61303k w6 = mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w6, "meeting");
            if (w6.mo212092J().mo212508E() != null) {
                C61303k w7 = mo212965w();
                Intrinsics.checkExpressionValueIsNotNull(w7, "meeting");
                if (!Intrinsics.areEqual((Object) w7.mo212092J().mo212508E(), (Object) false)) {
                    z = false;
                }
            }
            hVar3.presetSpeakerState(z);
        }
        boolean b = C60788y.m236250b(getActivity());
        ImageView imageView = this.f156066d;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audioView");
        }
        imageView.setEnabled(b);
        ImageView imageView2 = this.f156065c;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audioWarning");
        }
        if (b) {
            i = 4;
        } else {
            i = 0;
        }
        imageView2.setVisibility(i);
        TextView textView = this.f156067e;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audioText");
        }
        int i4 = R.color.preview_text_n600;
        if (b) {
            i2 = R.color.preview_text_n600;
        } else {
            i2 = R.color.ud_N400;
        }
        textView.setTextColor(C60773o.m236126d(i2));
        boolean a = C60788y.m236247a(getActivity());
        ImageView imageView3 = this.f156068f;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cameraView");
        }
        imageView3.setEnabled(a);
        ImageView imageView4 = this.f156069g;
        if (imageView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cameraWarning");
        }
        if (a) {
            i3 = 4;
        }
        imageView4.setVisibility(i3);
        TextView textView2 = this.f156070h;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cameraText");
        }
        if (!a) {
            i4 = R.color.ud_N400;
        }
        textView2.setTextColor(C60773o.m236126d(i4));
    }

    /* renamed from: v */
    private final void m242688v() {
        View findViewById = ((FrameLayout) mo214952a(R.id.bottomContainer)).findViewById(R.id.audioContainer);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "bottomContainer.findView…iew>(R.id.audioContainer)");
        this.f156082u = findViewById;
        View findViewById2 = ((FrameLayout) mo214952a(R.id.bottomContainer)).findViewById(R.id.audioView);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "bottomContainer.findView…mageView>(R.id.audioView)");
        this.f156066d = (ImageView) findViewById2;
        View findViewById3 = ((FrameLayout) mo214952a(R.id.bottomContainer)).findViewById(R.id.audio_warning);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "bottomContainer.findView…View>(R.id.audio_warning)");
        this.f156065c = (ImageView) findViewById3;
        View findViewById4 = ((FrameLayout) mo214952a(R.id.bottomContainer)).findViewById(R.id.txt_audio);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "bottomContainer.findView…TextView>(R.id.txt_audio)");
        this.f156067e = (TextView) findViewById4;
        View findViewById5 = ((FrameLayout) mo214952a(R.id.bottomContainer)).findViewById(R.id.cameraContainer);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "bottomContainer.findView…ew>(R.id.cameraContainer)");
        this.f156083v = findViewById5;
        View findViewById6 = ((FrameLayout) mo214952a(R.id.bottomContainer)).findViewById(R.id.cameraView);
        Intrinsics.checkExpressionValueIsNotNull(findViewById6, "bottomContainer.findView…ageView>(R.id.cameraView)");
        this.f156068f = (ImageView) findViewById6;
        View findViewById7 = ((FrameLayout) mo214952a(R.id.bottomContainer)).findViewById(R.id.camera_warning);
        Intrinsics.checkExpressionValueIsNotNull(findViewById7, "bottomContainer.findView…iew>(R.id.camera_warning)");
        this.f156069g = (ImageView) findViewById7;
        View findViewById8 = ((FrameLayout) mo214952a(R.id.bottomContainer)).findViewById(R.id.camera_txt);
        Intrinsics.checkExpressionValueIsNotNull(findViewById8, "bottomContainer.findView…extView>(R.id.camera_txt)");
        this.f156070h = (TextView) findViewById8;
        View findViewById9 = ((FrameLayout) mo214952a(R.id.bottomContainer)).findViewById(R.id.speakerContainer);
        Intrinsics.checkExpressionValueIsNotNull(findViewById9, "bottomContainer.findView…w>(R.id.speakerContainer)");
        this.f156084w = findViewById9;
        View findViewById10 = ((FrameLayout) mo214952a(R.id.bottomContainer)).findViewById(R.id.speakerView);
        Intrinsics.checkExpressionValueIsNotNull(findViewById10, "bottomContainer.findView…geView>(R.id.speakerView)");
        this.f156071i = (ImageView) findViewById10;
        View findViewById11 = ((FrameLayout) mo214952a(R.id.bottomContainer)).findViewById(R.id.speaker_text);
        Intrinsics.checkExpressionValueIsNotNull(findViewById11, "bottomContainer.findView…tView>(R.id.speaker_text)");
        this.f156072j = (TextView) findViewById11;
        m242685s();
        View view = this.f156083v;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cameraContainer");
        }
        C63529q.m248970a(view, new C62128c(this));
        View view2 = this.f156082u;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audioContainer");
        }
        C63529q.m248970a(view2, new C62130d(this));
        View view3 = this.f156084w;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("speakerContainer");
        }
        C63529q.m248970a(view3, new C62132e(this));
    }

    /* renamed from: a */
    public static final /* synthetic */ ImageView m242673a(MeetingLobbyFragment fVar) {
        ImageView imageView = fVar.f156071i;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("speakerView");
        }
        return imageView;
    }

    /* renamed from: b */
    public static final /* synthetic */ TextView m242675b(MeetingLobbyFragment fVar) {
        TextView textView = fVar.f156072j;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("speakerText");
        }
        return textView;
    }

    /* renamed from: c */
    public static final /* synthetic */ ImageView m242676c(MeetingLobbyFragment fVar) {
        ImageView imageView = fVar.f156068f;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cameraView");
        }
        return imageView;
    }

    /* renamed from: d */
    public static final /* synthetic */ ImageView m242677d(MeetingLobbyFragment fVar) {
        ImageView imageView = fVar.f156069g;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cameraWarning");
        }
        return imageView;
    }

    /* renamed from: e */
    public static final /* synthetic */ TextView m242678e(MeetingLobbyFragment fVar) {
        TextView textView = fVar.f156070h;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cameraText");
        }
        return textView;
    }

    /* renamed from: f */
    public static final /* synthetic */ MeetingLobbyViewModel m242679f(MeetingLobbyFragment fVar) {
        MeetingLobbyViewModel hVar = fVar.f156063a;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        return hVar;
    }

    /* renamed from: g */
    public static final /* synthetic */ ImageView m242680g(MeetingLobbyFragment fVar) {
        ImageView imageView = fVar.f156066d;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audioView");
        }
        return imageView;
    }

    /* renamed from: h */
    public static final /* synthetic */ ImageView m242681h(MeetingLobbyFragment fVar) {
        ImageView imageView = fVar.f156065c;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audioWarning");
        }
        return imageView;
    }

    /* renamed from: i */
    public static final /* synthetic */ TextView m242682i(MeetingLobbyFragment fVar) {
        TextView textView = fVar.f156067e;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audioText");
        }
        return textView;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "pair", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.lobby.f$j */
    public static final class C62139j<T> implements AbstractC1178x<Pair<? extends Boolean, ? extends Boolean>> {

        /* renamed from: a */
        final /* synthetic */ MeetingLobbyFragment f156091a;

        C62139j(MeetingLobbyFragment fVar) {
            this.f156091a = fVar;
        }

        /* renamed from: a */
        public final void onChanged(Pair<Boolean, Boolean> pair) {
            if (pair != null) {
                C60700b.m235851b("MeetingLobbyFragment", "[observeAudioState]", "isAudioOpen: " + pair.getFirst().booleanValue());
                C61303k w = this.f156091a.mo212965w();
                Intrinsics.checkExpressionValueIsNotNull(w, "meeting");
                w.mo212092J().mo212542f(pair.getFirst().booleanValue() ^ true);
                this.f156091a.mo214954a(pair.getFirst().booleanValue(), pair.getSecond().booleanValue());
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "speakerState", "Lcom/ss/android/vc/meeting/module/lobby/MeetingLobbyViewModel$SpeakerState;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.lobby.f$l */
    public static final class C62142l<T> implements AbstractC1178x<MeetingLobbyViewModel.SpeakerState> {

        /* renamed from: a */
        final /* synthetic */ MeetingLobbyFragment f156095a;

        C62142l(MeetingLobbyFragment fVar) {
            this.f156095a = fVar;
        }

        /* renamed from: a */
        public final void onChanged(MeetingLobbyViewModel.SpeakerState aVar) {
            if (aVar != null) {
                C61303k w = this.f156095a.mo212965w();
                Intrinsics.checkExpressionValueIsNotNull(w, "meeting");
                w.mo212092J().mo212549i(!aVar.mo214982b());
                if (aVar.mo214982b()) {
                    MeetingLobbyFragment.m242673a(this.f156095a).setImageDrawable(C60773o.m236128f(R.drawable.ud_icon_speaker_filled));
                    MeetingLobbyFragment.m242673a(this.f156095a).getDrawable().setTint(C60773o.m236126d(R.color.ud_N700));
                    MeetingLobbyFragment.m242675b(this.f156095a).setText(R.string.View_A_Speaker);
                    return;
                }
                int i = C62146g.f156100a[aVar.mo214981a().ordinal()];
                if (i == 1) {
                    MeetingLobbyFragment.m242673a(this.f156095a).setImageDrawable(C60773o.m236128f(R.drawable.ud_icon_ear_outlined));
                    MeetingLobbyFragment.m242673a(this.f156095a).getDrawable().setTint(C60773o.m236126d(R.color.ud_N700));
                    MeetingLobbyFragment.m242675b(this.f156095a).setText(R.string.View_G_Receiver);
                } else if (i == 2) {
                    MeetingLobbyFragment.m242673a(this.f156095a).setImageDrawable(C60773o.m236128f(R.drawable.ud_icon_bluetooth_filled));
                    MeetingLobbyFragment.m242673a(this.f156095a).getDrawable().setTint(C60773o.m236126d(R.color.ud_N700));
                    MeetingLobbyFragment.m242675b(this.f156095a).setText(R.string.View_G_Bluetooth);
                } else if (i == 3) {
                    MeetingLobbyFragment.m242673a(this.f156095a).setImageDrawable(C60773o.m236128f(R.drawable.ud_icon_headphone_filled));
                    MeetingLobbyFragment.m242673a(this.f156095a).getDrawable().setTint(C60773o.m236126d(R.color.ud_N700));
                    MeetingLobbyFragment.m242675b(this.f156095a).setText(R.string.View_G_Headphones);
                }
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.base.C61434m
    /* renamed from: a */
    public void mo212927a(Bundle bundle) {
        super.mo212927a(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C61999a h = ((ByteRTCMeetingActivity) activity).mo212781h();
            Intrinsics.checkExpressionValueIsNotNull(h, "(activity as ByteRTCMeet…tivity).orientationHelper");
            this.f156081t = h;
            if (h == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mScreenOrientationHelper");
            }
            h.mo214617b();
            AbstractC61417a x = mo212966x();
            Intrinsics.checkExpressionValueIsNotNull(x, "meetingControl");
            this.f156074l = x.mo212842u().mo214942d();
            AbstractC61417a x2 = mo212966x();
            Intrinsics.checkExpressionValueIsNotNull(x2, "meetingControl");
            x2.mo212842u().mo214934a(this);
            C61303k w = mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w, "meeting");
            w.mo212165y().mo211989a();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.vc.meeting.module.multi.ByteRTCMeetingActivity");
    }

    /* renamed from: a */
    public final void mo214953a(boolean z) {
        C60700b.m235851b("MeetingLobbyFragment", "[startCameraPreview]", "startCameraPreview");
        if (getActivity() != null) {
            ((PreviewVideoView) mo214952a(R.id.video_view)).mo208475a(new C62145o(this, z));
        }
    }

    @Override // com.ss.android.vc.meeting.module.base.C61434m
    public void a_(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.a_(view, bundle);
        AbstractC1142af a = aj.m5364a(this).mo6005a(MeetingLobbyViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(a, "ViewModelProviders.of(th…bbyViewModel::class.java)");
        MeetingLobbyViewModel hVar = (MeetingLobbyViewModel) a;
        this.f156063a = hVar;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        hVar.onCreate();
        m242684r();
        m242686t();
        VCLauncherStatistics.m250426d();
        if (this.f156074l) {
            MeetingLobbyEvent meetingLobbyEvent = MeetingLobbyEvent.f160867a;
            C61303k w = mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w, "meeting");
            String K = w.mo212093K();
            Intrinsics.checkExpressionValueIsNotNull(K, "meeting.statisticsId");
            C61303k w2 = mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w2, "meeting");
            String c = w2.aq().mo214941c();
            if (c == null) {
                c = "";
            }
            C61303k w3 = mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w3, "meeting");
            meetingLobbyEvent.mo220384a(K, c, w3.mo212056e());
            MeetingWaitingEvent a2 = MeetingWaitingEvent.f160808b.mo220235a();
            C61303k w4 = mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w4, "meeting");
            String K2 = w4.mo212093K();
            C61303k w5 = mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w5, "meeting");
            a2.mo220230a(K2, w5.mo212056e());
        } else {
            MeetingPreEvent a3 = MeetingPreEvent.f160856b.mo220344a();
            C61303k w6 = mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w6, "meeting");
            String K3 = w6.mo212093K();
            C61303k w7 = mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w7, "meeting");
            boolean z = !w7.mo212092J().mo212505B();
            C61303k w8 = mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w8, "meeting");
            a3.mo220333a(K3, z, !w8.mo212092J().mo212504A(), true, false);
        }
        C61303k w9 = mo212965w();
        MeetingLobbyViewModel hVar2 = this.f156063a;
        if (hVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        AudioRouteHelper bVar = new AudioRouteHelper(w9, hVar2.getMeetingAudioManager(), this);
        this.f156076n = bVar;
        if (bVar == null) {
            Intrinsics.throwNpe();
        }
        bVar.mo212735a(new C62143m(this));
    }

    /* renamed from: b */
    public final void mo214955b(boolean z, boolean z2) {
        int i;
        int i2;
        C60700b.m235851b("MeetingLobbyFragment", "[updateCameraState]", "isCameraOpen: " + z + ", isNeedShowToast: " + z2);
        boolean a = C60788y.m236247a(getActivity());
        ImageView imageView = this.f156068f;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cameraView");
        }
        imageView.setEnabled(a);
        ImageView imageView2 = this.f156069g;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cameraWarning");
        }
        int i3 = 0;
        if (a) {
            i = 4;
        } else {
            i = 0;
        }
        imageView2.setVisibility(i);
        TextView textView = this.f156070h;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cameraText");
        }
        if (a) {
            i2 = R.color.preview_text_n600;
        } else {
            i2 = R.color.ud_N400;
        }
        textView.setTextColor(C60773o.m236126d(i2));
        AppCompatImageView appCompatImageView = (AppCompatImageView) mo214952a(R.id.camera_permission_denied);
        Intrinsics.checkExpressionValueIsNotNull(appCompatImageView, "camera_permission_denied");
        if (a) {
            i3 = 8;
        }
        appCompatImageView.setVisibility(i3);
        this.f156078p = z;
        int i4 = R.color.icon_disable;
        if (z) {
            ImageView imageView3 = this.f156068f;
            if (imageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cameraView");
            }
            imageView3.setImageDrawable(C60773o.m236128f(R.drawable.ud_icon_video_filled));
            ImageView imageView4 = this.f156068f;
            if (imageView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cameraView");
            }
            Drawable drawable = imageView4.getDrawable();
            if (a) {
                i4 = R.color.ud_N700;
            }
            drawable.setTint(C60773o.m236126d(i4));
            ((TextView) mo214952a(R.id.waitingTips)).setTextColor(C60773o.m236126d(R.color.static_white));
            if (z2) {
                C60738ac.m236040d((int) R.string.View_VM_CameraOn);
                return;
            }
            return;
        }
        ImageView imageView5 = this.f156068f;
        if (imageView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cameraView");
        }
        imageView5.setImageDrawable(C60773o.m236128f(R.drawable.ud_icon_video_off_filled));
        ImageView imageView6 = this.f156068f;
        if (imageView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cameraView");
        }
        Drawable drawable2 = imageView6.getDrawable();
        if (a) {
            i4 = R.color.function_danger_500;
        }
        drawable2.setTintList(C60773o.m236127e(i4));
        ((TextView) mo214952a(R.id.waitingTips)).setTextColor(C60773o.m236126d(R.color.ud_N650));
        if (z2) {
            C60738ac.m236040d((int) R.string.View_VM_CameraOff);
        }
        ((PreviewVideoView) mo214952a(R.id.video_view)).mo208476b();
    }

    /* renamed from: a */
    public final void mo214954a(boolean z, boolean z2) {
        int i;
        int i2;
        C60700b.m235851b("MeetingLobbyFragment", "[updateAudioState]", "isAudioOpen: " + z + ", isNeedShowToast: " + z2);
        boolean b = C60788y.m236250b(getActivity());
        ImageView imageView = this.f156066d;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audioView");
        }
        imageView.setEnabled(b);
        ImageView imageView2 = this.f156065c;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audioWarning");
        }
        if (b) {
            i = 8;
        } else {
            i = 0;
        }
        imageView2.setVisibility(i);
        TextView textView = this.f156067e;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audioText");
        }
        if (b) {
            i2 = R.color.preview_text_n600;
        } else {
            i2 = R.color.ud_N400;
        }
        textView.setTextColor(C60773o.m236126d(i2));
        this.f156077o = z;
        int i3 = R.color.icon_disable;
        if (z) {
            ImageView imageView3 = this.f156066d;
            if (imageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("audioView");
            }
            imageView3.setImageDrawable(C60773o.m236128f(R.drawable.ud_icon_mic_filled));
            ImageView imageView4 = this.f156066d;
            if (imageView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("audioView");
            }
            Drawable drawable = imageView4.getDrawable();
            if (b) {
                i3 = R.color.ud_N700;
            }
            drawable.setTint(C60773o.m236126d(i3));
            if (z2) {
                C60738ac.m236040d((int) R.string.View_VM_MicOn);
                return;
            }
            return;
        }
        ImageView imageView5 = this.f156066d;
        if (imageView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audioView");
        }
        imageView5.setImageDrawable(C60773o.m236128f(R.drawable.ud_icon_mic_off_filled));
        ImageView imageView6 = this.f156066d;
        if (imageView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audioView");
        }
        Drawable drawable2 = imageView6.getDrawable();
        if (b) {
            i3 = R.color.function_danger_500;
        }
        drawable2.setTint(C60773o.m236126d(i3));
        if (z2) {
            C60738ac.m236040d((int) R.string.View_VM_MicOff);
        }
    }

    @Override // com.ss.android.vc.meeting.module.base.C61434m
    /* renamed from: a */
    public View mo212879a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_meeting_lobby, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "inflater.inflate(R.layou…_lobby, container, false)");
        return inflate;
    }

    /* renamed from: a */
    private final void m242674a(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        } else {
            marginLayoutParams = new ViewGroup.MarginLayoutParams(view.getLayoutParams());
        }
        marginLayoutParams.leftMargin = C60773o.m236115a((double) i);
        marginLayoutParams.topMargin = C60773o.m236115a((double) i2);
        marginLayoutParams.rightMargin = C60773o.m236115a((double) i3);
        marginLayoutParams.bottomMargin = C60773o.m236115a((double) i4);
    }
}
