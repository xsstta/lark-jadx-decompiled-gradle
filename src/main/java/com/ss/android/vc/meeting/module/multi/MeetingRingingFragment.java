package com.ss.android.vc.meeting.module.multi;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.suite.R;
import com.ss.android.floatbubble.C28460b;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.rxjava.LarkRxSchedulers;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.AbstractC60728a;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60749c;
import com.ss.android.vc.common.p3083e.C60752f;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.common.p3083e.C60783v;
import com.ss.android.vc.common.p3083e.C60785x;
import com.ss.android.vc.common.permission.C60795b;
import com.ss.android.vc.common.widget.IconFontView;
import com.ss.android.vc.common.widget.TruncatTextView;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.entity.ParticipantRole;
import com.ss.android.vc.entity.ParticipantSettings;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatSettings;
import com.ss.android.vc.entity.request.JoinMeetingPreCheckEntityRequest;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.statemachine.C61367r;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.android.vc.meeting.module.audio.MeetingAudioManager;
import com.ss.android.vc.meeting.module.base.C61434m;
import com.ss.android.vc.meeting.module.fastentry.AbstractC61661d;
import com.ss.android.vc.meeting.module.floatingwindow.FloatWindowLaunchType;
import com.ss.android.vc.meeting.module.livestream.C62063d;
import com.ss.android.vc.meeting.module.receiver.VcScreenMonitor;
import com.ss.android.vc.meeting.module.receiver.VideoChatScreenBroadcastReceiver;
import com.ss.android.vc.meeting.utils.C63492g;
import com.ss.android.vc.meeting.utils.meetingcheck.MeetingCheckData;
import com.ss.android.vc.meeting.utils.meetingcheck.MeetingCheckUtils;
import com.ss.android.vc.net.service.VcBizService;
import com.ss.android.vc.net.service.VideoChatUser;
import com.ss.android.vc.net.service.VideoChatUserService;
import com.ss.android.vc.statistics.event.C63736af;
import com.ss.android.vc.statistics.event.aj;
import com.ss.android.vc.statistics.event.bn;
import com.ss.android.vc.statistics.p3180a.C63693e;
import com.ss.android.vc.trace.VCLauncherStatistics;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 V2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001VB\u0005¢\u0006\u0002\u0010\u0006J\b\u00106\u001a\u000207H\u0002J\b\u00108\u001a\u000207H\u0002J\u0010\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u0017H\u0002J\u0012\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010?H\u0016J\u0012\u0010@\u001a\u00020=2\b\u0010A\u001a\u0004\u0018\u00010\bH\u0016J&\u0010B\u001a\u0004\u0018\u00010\b2\u0006\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010 2\b\u0010F\u001a\u0004\u0018\u00010GH\u0016J\u0012\u0010H\u001a\u00020=2\b\u0010F\u001a\u0004\u0018\u00010GH\u0016J\b\u0010I\u001a\u00020=H\u0016J\b\u0010J\u001a\u00020=H\u0016J\b\u0010K\u001a\u00020=H\u0016J\b\u0010L\u001a\u00020=H\u0016J\b\u0010M\u001a\u00020=H\u0016J\b\u0010N\u001a\u00020=H\u0016J\u001a\u0010O\u001a\u00020=2\u0006\u0010P\u001a\u00020\b2\b\u0010F\u001a\u0004\u0018\u00010GH\u0017J\b\u0010Q\u001a\u00020=H\u0002J\u0006\u0010R\u001a\u00020=J\b\u0010S\u001a\u00020\u0017H\u0016J\b\u0010T\u001a\u00020=H\u0004J\b\u0010U\u001a\u00020=H\u0002R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0004\n\u0002\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X.¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0013X.¢\u0006\u0002\n\u0000R\u001a\u0010%\u001a\u00020&X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u000e\u0010+\u001a\u00020&X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0013X.¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020&X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0013X.¢\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u000100X\u000e¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u000102X\u000e¢\u0006\u0002\n\u0000R\u0010\u00103\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u00104\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u00105\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000¨\u0006W"}, d2 = {"Lcom/ss/android/vc/meeting/module/multi/MeetingRingingFragment;", "Lcom/ss/android/vc/meeting/module/base/MeetingFragment;", "Landroid/view/View$OnClickListener;", "Lcom/ss/android/vc/meeting/module/receiver/VideoChatScreenBroadcastReceiver$ScreenStateListener;", "Lcom/ss/android/vc/meeting/module/fastentry/IVideoChatFastEntry;", "Lcom/ss/android/vc/meeting/module/receiver/VcScreenMonitor$IScreenMonitor;", "()V", "acceptContainer", "Landroid/view/View;", "acceptImageView", "Landroid/widget/ImageView;", "acceptVoiceIconFont", "Lcom/ss/android/vc/common/widget/IconFontView;", "avatarPhoto", "Lcom/larksuite/component/ui/imageview/LKUIRoundedImageView;", "blurImageView", "declineContainer", "declineImageView", "externalView", "Landroid/widget/TextView;", "hostUser", "Lcom/ss/android/vc/net/service/VideoChatUser;", "isFromFloat", "", "Ljava/lang/Boolean;", "legalPrivacyIntercept", "Lcom/ss/android/vc/meeting/module/livestream/LegalPrivacyIntercept;", "mActivity", "Landroid/app/Activity;", "mInviteMsgView", "Lcom/ss/android/vc/common/widget/TruncatTextView;", "mRootView", "Landroid/view/ViewGroup;", "minimizeView", "resumeTime", "", "ringingAcceptText", "ringingDeclineRunnable", "Ljava/lang/Runnable;", "getRingingDeclineRunnable", "()Ljava/lang/Runnable;", "setRingingDeclineRunnable", "(Ljava/lang/Runnable;)V", "ringingVideoRunnable", "ringingVoiceAcceptText", "ringingVoiceRunnable", "titleView", "tonePlayer", "Lcom/ss/android/vc/meeting/framework/statemachine/VideoChatTonePlayer;", "videochat", "Lcom/ss/android/vc/entity/VideoChat;", "voiceOnlyContainer", "voiceOnlyIcon", "voiceOnlyText", "getCameraStatus", "Lcom/ss/android/vc/entity/ParticipantSettings$EquipmentStatus;", "getMicrophoneStatus", "getParticipantSettings", "Lcom/ss/android/vc/entity/ParticipantSettings;", "cameraMuted", "onAttach_", "", "context", "Landroid/content/Context;", "onClick", "v", "onCreateView_", "inflater", "Landroid/view/LayoutInflater;", "container", "savedInstanceState", "Landroid/os/Bundle;", "onCreate_", "onDestroy_", "onResume_", "onScreenOff", "onScreenOn", "onStart_", "onUserPresent", "onViewCreated_", "view", "showAvatarBackground", "showFloatWindowForBack2App", "tryShowFloatWindow", "updateRingView", "updateViewsAsConnecting", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.multi.e */
public final class MeetingRingingFragment extends C61434m implements View.OnClickListener, AbstractC61661d, VcScreenMonitor.AbstractC62891b, VideoChatScreenBroadcastReceiver.ScreenStateListener {

    /* renamed from: j */
    public static final String f157274j = f157274j;

    /* renamed from: k */
    public static final Companion f157275k = new Companion(null);

    /* renamed from: A */
    private View f157276A;

    /* renamed from: B */
    private Runnable f157277B = new RunnableC62514g(this);

    /* renamed from: C */
    private Runnable f157278C = new RunnableC62512e(this);

    /* renamed from: D */
    private HashMap f157279D;

    /* renamed from: a */
    public ImageView f157280a;

    /* renamed from: b */
    public C61367r f157281b;

    /* renamed from: c */
    public VideoChatUser f157282c;

    /* renamed from: d */
    public VideoChat f157283d;

    /* renamed from: e */
    public Boolean f157284e = false;

    /* renamed from: f */
    public C62063d f157285f;

    /* renamed from: g */
    public TextView f157286g;

    /* renamed from: h */
    public IconFontView f157287h;

    /* renamed from: i */
    public Runnable f157288i = new RunnableC62513f(this);

    /* renamed from: l */
    private Activity f157289l;

    /* renamed from: m */
    private ViewGroup f157290m;

    /* renamed from: n */
    private LKUIRoundedImageView f157291n;

    /* renamed from: o */
    private ImageView f157292o;

    /* renamed from: p */
    private ImageView f157293p;

    /* renamed from: q */
    private IconFontView f157294q;

    /* renamed from: r */
    private TextView f157295r;

    /* renamed from: s */
    private View f157296s;

    /* renamed from: t */
    private TruncatTextView f157297t;

    /* renamed from: u */
    private TextView f157298u;

    /* renamed from: v */
    private TextView f157299v;

    /* renamed from: w */
    private TextView f157300w;

    /* renamed from: x */
    private int f157301x;

    /* renamed from: y */
    private View f157302y;

    /* renamed from: z */
    private View f157303z;

    @Override // com.ss.android.vc.meeting.module.receiver.VcScreenMonitor.AbstractC62891b
    /* renamed from: a */
    public void mo212174a() {
    }

    @Override // com.ss.android.vc.meeting.module.receiver.VcScreenMonitor.AbstractC62891b
    /* renamed from: c */
    public void mo212176c() {
    }

    /* renamed from: h */
    public void mo216124h() {
        HashMap hashMap = this.f157279D;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.vc.meeting.module.base.C61434m
    /* renamed from: l */
    public void mo212933l() {
    }

    @Override // com.ss.android.vc.meeting.module.base.C61434m, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo216124h();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J!\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/ss/android/vc/meeting/module/multi/MeetingRingingFragment$Companion;", "", "()V", "KEY_MEETING_IS_FROM_FLOAT", "", "KEY_MEETING_VIDEO_CHAT", "TAG", "getTAG", "()Ljava/lang/String;", "newInstance", "Lcom/ss/android/vc/meeting/module/multi/MeetingRingingFragment;", "videoChat", "Lcom/ss/android/vc/entity/VideoChat;", "isFromFloat", "", "(Lcom/ss/android/vc/entity/VideoChat;Ljava/lang/Boolean;)Lcom/ss/android/vc/meeting/module/multi/MeetingRingingFragment;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.e$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final String mo216127a() {
            return MeetingRingingFragment.f157274j;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final MeetingRingingFragment mo216126a(VideoChat videoChat, Boolean bool) {
            MeetingRingingFragment eVar = new MeetingRingingFragment();
            eVar.f157283d = videoChat;
            eVar.f157284e = bool;
            return eVar;
        }
    }

    /* renamed from: d */
    public final Runnable mo216120d() {
        return this.f157278C;
    }

    @Override // com.ss.android.vc.meeting.module.base.C61434m
    /* renamed from: q */
    public void mo212938q() {
        C60795b.m236298b();
        VcScreenMonitor.m246178a().mo217320b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0014¨\u0006\b"}, d2 = {"com/ss/android/vc/meeting/module/multi/MeetingRingingFragment$showFloatWindowForBack2App$1", "Lcom/ss/android/vc/common/utils/AbsAsyncVcTask;", "", "doInBackground", "()Ljava/lang/Boolean;", "onPostExecute", "", "result", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.e$j */
    public static final class C62517j extends AbstractC60728a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ MeetingRingingFragment f157312a;

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public Boolean mo208348a() {
            Context context;
            FragmentActivity activity = this.f157312a.getActivity();
            if (activity != null) {
                context = activity.getApplicationContext();
            } else {
                context = null;
            }
            return Boolean.valueOf(C28460b.m104296a(context));
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C62517j(MeetingRingingFragment eVar) {
            this.f157312a = eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.vc.common.p3083e.AbstractC60728a
        /* renamed from: b */
        public /* synthetic */ void mo208351b(Boolean bool) {
            mo216134a(bool.booleanValue());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo216134a(boolean z) {
            Context context;
            super.mo208351b(Boolean.valueOf(z));
            if (z) {
                C63693e.m249682a("multi_ringing");
                C61303k w = this.f157312a.mo212965w();
                Intrinsics.checkExpressionValueIsNotNull(w, "meeting");
                w.ae().mo213805a(0, FloatWindowLaunchType.BACK2FRONT);
                MeetingRingingFragment eVar = this.f157312a;
                FragmentActivity activity = eVar.getActivity();
                if (activity != null) {
                    context = activity.getApplicationContext();
                } else {
                    context = null;
                }
                eVar.f157281b = C61367r.m239117a(context);
                C61367r rVar = this.f157312a.f157281b;
                if (rVar != null) {
                    rVar.mo212396c();
                }
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.receiver.VideoChatScreenBroadcastReceiver.ScreenStateListener, com.ss.android.vc.meeting.module.receiver.VcScreenMonitor.AbstractC62891b
    /* renamed from: b */
    public void mo212175b() {
        Context context;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            context = activity.getApplicationContext();
        } else {
            context = null;
        }
        C61367r a = C61367r.m239117a(context);
        this.f157281b = a;
        if (a != null) {
            a.mo212396c();
        }
    }

    /* renamed from: f */
    public final void mo216122f() {
        C60700b.m235851b(f157274j, "[showFloatWindowForBack2App]", "showFloatWindowForBack2App");
        C60735ab.m235996a(new C62517j(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.e$e */
    static final class RunnableC62512e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MeetingRingingFragment f157307a;

        RunnableC62512e(MeetingRingingFragment eVar) {
            this.f157307a = eVar;
        }

        public final void run() {
            VideoChat videoChat;
            if (this.f157307a.mo212960A()) {
                this.f157307a.mo216123g();
                C61303k w = this.f157307a.mo212965w();
                Intrinsics.checkExpressionValueIsNotNull(w, "meeting");
                C60700b.m235841a(w.mo212056e(), "UI", "StateEngine", "clickRingingDecline", MeetingRingingFragment.f157275k.mo216127a(), "decline button clicked");
                this.f157307a.mo212963b(101);
                FragmentActivity activity = this.f157307a.getActivity();
                if (activity != null) {
                    activity.finish();
                }
                C60738ac.m236025a((int) R.string.View_AM_Declined, 1000);
                C61303k w2 = this.f157307a.mo212965w();
                String str = null;
                if (w2 != null) {
                    videoChat = w2.mo212056e();
                } else {
                    videoChat = null;
                }
                C61303k w3 = this.f157307a.mo212965w();
                if (w3 != null) {
                    str = w3.mo212093K();
                }
                bn.m250197a(videoChat, false, str);
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.fastentry.AbstractC61661d
    public boolean bx_() {
        Context context;
        if (!C28460b.m104296a(getActivity())) {
            return false;
        }
        C61303k w = mo212965w();
        Intrinsics.checkExpressionValueIsNotNull(w, "meeting");
        C60700b.m235841a(w.mo212056e(), "UI", "UI", "tryShowFloatWindow", f157274j, "tryShowFloatWindow");
        C63693e.m249682a("multi_ringing");
        C61303k w2 = mo212965w();
        Intrinsics.checkExpressionValueIsNotNull(w2, "meeting");
        w2.ae().mo213805a(0, FloatWindowLaunchType.NORMAL);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            context = activity.getApplicationContext();
        } else {
            context = null;
        }
        C61367r a = C61367r.m239117a(context);
        this.f157281b = a;
        if (a == null) {
            return true;
        }
        a.mo212396c();
        return true;
    }

    @Override // com.ss.android.vc.meeting.module.base.C61434m
    /* renamed from: m */
    public void mo212934m() {
        VideoChat videoChat;
        this.f157301x++;
        if (Intrinsics.areEqual((Object) this.f157284e, (Object) false) && this.f157301x == 1) {
            C61303k w = mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w, "meeting");
            C60700b.m235841a(w.mo212056e(), "UI", "UI", "onResumeRinging", f157274j, "onResumeRingingFragment");
            C61303k w2 = mo212965w();
            String str = null;
            if (w2 != null) {
                videoChat = w2.mo212056e();
            } else {
                videoChat = null;
            }
            C61303k w3 = mo212965w();
            if (w3 != null) {
                str = w3.mo212093K();
            }
            bn.m250196a(videoChat, str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.e$f */
    static final class RunnableC62513f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MeetingRingingFragment f157308a;

        RunnableC62513f(MeetingRingingFragment eVar) {
            this.f157308a = eVar;
        }

        public final void run() {
            VideoChat videoChat;
            String str;
            String str2;
            VideoChat videoChat2;
            if (this.f157308a.mo212960A()) {
                VCLauncherStatistics.m250423a(VCLauncherStatistics.SCENE.ACCEPT);
                MeetingAudioManager.m239471k().mo212694b(false);
                C61303k w = this.f157308a.mo212965w();
                String str3 = null;
                if (w != null) {
                    videoChat = w.mo212056e();
                } else {
                    videoChat = null;
                }
                C61303k w2 = this.f157308a.mo212965w();
                if (w2 != null) {
                    str = w2.mo212093K();
                } else {
                    str = null;
                }
                aj.m250013a("calling_page", videoChat, str);
                VCLauncherStatistics.m250421a();
                C61303k w3 = this.f157308a.mo212965w();
                C61303k w4 = this.f157308a.mo212965w();
                if (w4 != null) {
                    str2 = w4.mo212055d();
                } else {
                    str2 = null;
                }
                int number = VideoChat.UpdateVideoChatAction.ACCEPT.getNumber();
                ParticipantSettings a = this.f157308a.mo216119a(false);
                C61303k w5 = this.f157308a.mo212965w();
                Intrinsics.checkExpressionValueIsNotNull(w5, "meeting");
                w5.mo212092J().mo212539e(false);
                String updateVideoChat = VcBizService.updateVideoChat(w3, str2, number, a, null);
                C61303k w6 = this.f157308a.mo212965w();
                if (w6 != null) {
                    videoChat2 = w6.mo212056e();
                } else {
                    videoChat2 = null;
                }
                C61303k w7 = this.f157308a.mo212965w();
                if (w7 != null) {
                    str3 = w7.mo212093K();
                }
                C63736af.m249999a("all_close", videoChat2, str3, updateVideoChat);
                C61303k w8 = this.f157308a.mo212965w();
                Intrinsics.checkExpressionValueIsNotNull(w8, "meeting");
                w8.mo212149b(1);
                this.f157308a.mo216121e();
                C61303k w9 = this.f157308a.mo212965w();
                Intrinsics.checkExpressionValueIsNotNull(w9, "meeting");
                C63492g.m248821a(false, Boolean.valueOf(w9.mo212092J().mo212512I()));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.e$g */
    static final class RunnableC62514g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MeetingRingingFragment f157309a;

        RunnableC62514g(MeetingRingingFragment eVar) {
            this.f157309a = eVar;
        }

        public final void run() {
            VideoChat videoChat;
            String str;
            String str2;
            VideoChat videoChat2;
            if (this.f157309a.mo212960A()) {
                this.f157309a.mo216123g();
                VCLauncherStatistics.m250423a(VCLauncherStatistics.SCENE.ACCEPT);
                if (!DesktopUtil.m144301a((Context) this.f157309a.getActivity())) {
                    MeetingAudioManager.m239471k().mo212694b(true);
                } else {
                    MeetingAudioManager.m239471k().mo212694b(false);
                }
                C61303k w = this.f157309a.mo212965w();
                String str3 = null;
                if (w != null) {
                    videoChat = w.mo212056e();
                } else {
                    videoChat = null;
                }
                C61303k w2 = this.f157309a.mo212965w();
                if (w2 != null) {
                    str = w2.mo212093K();
                } else {
                    str = null;
                }
                aj.m250013a("calling_page", videoChat, str);
                VCLauncherStatistics.m250421a();
                C61303k w3 = this.f157309a.mo212965w();
                C61303k w4 = this.f157309a.mo212965w();
                if (w4 != null) {
                    str2 = w4.mo212055d();
                } else {
                    str2 = null;
                }
                int number = VideoChat.UpdateVideoChatAction.ACCEPT.getNumber();
                ParticipantSettings a = this.f157309a.mo216119a(true);
                C61303k w5 = this.f157309a.mo212965w();
                Intrinsics.checkExpressionValueIsNotNull(w5, "meeting");
                w5.mo212092J().mo212539e(true);
                String updateVideoChat = VcBizService.updateVideoChat(w3, str2, number, a, null);
                C61303k w6 = this.f157309a.mo212965w();
                if (w6 != null) {
                    videoChat2 = w6.mo212056e();
                } else {
                    videoChat2 = null;
                }
                C61303k w7 = this.f157309a.mo212965w();
                if (w7 != null) {
                    str3 = w7.mo212093K();
                }
                C63736af.m249999a("all_close", videoChat2, str3, updateVideoChat);
                C61303k w8 = this.f157309a.mo212965w();
                Intrinsics.checkExpressionValueIsNotNull(w8, "meeting");
                w8.mo212149b(1);
                this.f157309a.mo216121e();
                C61303k w9 = this.f157309a.mo212965w();
                Intrinsics.checkExpressionValueIsNotNull(w9, "meeting");
                C63492g.m248821a(false, Boolean.valueOf(w9.mo212092J().mo212512I()));
            }
        }
    }

    /* renamed from: i */
    private final void m244399i() {
        String str;
        String str2;
        VideoChat.MeetingSource meetingSource;
        String str3;
        String str4;
        ParticipantRole participantRole;
        String str5 = f157274j;
        VideoChatUser videoChatUser = this.f157282c;
        ParticipantType participantType = null;
        if (videoChatUser != null) {
            str = videoChatUser.getAvatarKey();
        } else {
            str = null;
        }
        C60700b.m235851b(str5, "[showAvatarBackground]", String.valueOf(str));
        VideoChatUser videoChatUser2 = this.f157282c;
        if (videoChatUser2 != null) {
            str2 = videoChatUser2.getAvatarKey();
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            LKUIRoundedImageView lKUIRoundedImageView = this.f157291n;
            if (lKUIRoundedImageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("avatarPhoto");
            }
            if (C60752f.m236082b((Object) lKUIRoundedImageView)) {
                ImageView imageView = this.f157280a;
                if (imageView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("blurImageView");
                }
                if (C60752f.m236082b((Object) imageView)) {
                    C61303k w = mo212965w();
                    if (w != null) {
                        meetingSource = w.mo212090H();
                    } else {
                        meetingSource = null;
                    }
                    if (meetingSource == VideoChat.MeetingSource.VC_FROM_INTERVIEW) {
                        C61303k w2 = mo212965w();
                        if (w2 != null) {
                            participantRole = w2.mo212089G();
                        } else {
                            participantRole = null;
                        }
                        if (participantRole == ParticipantRole.INTERVIEWEE) {
                            LKUIRoundedImageView lKUIRoundedImageView2 = this.f157291n;
                            if (lKUIRoundedImageView2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("avatarPhoto");
                            }
                            C60783v.m236226a((int) R.drawable.icon_interviewer_avatar, lKUIRoundedImageView2);
                            return;
                        }
                    }
                    VideoChatUser videoChatUser3 = this.f157282c;
                    if (videoChatUser3 != null) {
                        str3 = videoChatUser3.getAvatarKey();
                    } else {
                        str3 = null;
                    }
                    VideoChatUser videoChatUser4 = this.f157282c;
                    if (videoChatUser4 != null) {
                        str4 = videoChatUser4.getId();
                    } else {
                        str4 = null;
                    }
                    VideoChatUser videoChatUser5 = this.f157282c;
                    if (videoChatUser5 != null) {
                        participantType = videoChatUser5.getType();
                    }
                    LKUIRoundedImageView lKUIRoundedImageView3 = this.f157291n;
                    if (lKUIRoundedImageView3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("avatarPhoto");
                    }
                    C60783v.m236230a(str3, str4, participantType, lKUIRoundedImageView3, 40, 40);
                    Observable.create(new C62515h(this)).subscribeOn(LarkRxSchedulers.io()).observeOn(LarkRxSchedulers.mainThread()).subscribe(new C62516i(this));
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c3  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo216121e() {
        /*
        // Method dump skipped, instructions count: 202
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.multi.MeetingRingingFragment.mo216121e():void");
    }

    /* renamed from: g */
    public final void mo216123g() {
        ImageView imageView = this.f157292o;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("acceptImageView");
        }
        imageView.setClickable(false);
        ImageView imageView2 = this.f157292o;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("acceptImageView");
        }
        imageView2.setEnabled(false);
        TextView textView = this.f157298u;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ringingAcceptText");
        }
        textView.setClickable(false);
        TextView textView2 = this.f157298u;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ringingAcceptText");
        }
        textView2.setEnabled(false);
        IconFontView iconFontView = this.f157294q;
        if (iconFontView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("acceptVoiceIconFont");
        }
        iconFontView.setClickable(false);
        IconFontView iconFontView2 = this.f157294q;
        if (iconFontView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("acceptVoiceIconFont");
        }
        iconFontView2.setEnabled(false);
        TextView textView3 = this.f157299v;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ringingVoiceAcceptText");
        }
        textView3.setClickable(false);
        TextView textView4 = this.f157299v;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ringingVoiceAcceptText");
        }
        textView4.setEnabled(false);
        View view = this.f157302y;
        if (view != null) {
            view.setClickable(false);
        }
        View view2 = this.f157302y;
        if (view2 != null) {
            view2.setEnabled(false);
        }
        IconFontView iconFontView3 = this.f157287h;
        if (iconFontView3 != null) {
            iconFontView3.setEnabled(false);
        }
        TextView textView5 = this.f157286g;
        if (textView5 != null) {
            textView5.setEnabled(false);
        }
        View view3 = this.f157276A;
        if (view3 != null) {
            view3.setClickable(false);
        }
        View view4 = this.f157276A;
        if (view4 != null) {
            view4.setEnabled(false);
        }
        ImageView imageView3 = this.f157293p;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("declineImageView");
        }
        if (imageView3 != null) {
            imageView3.setEnabled(false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/multi/MeetingRingingFragment$onViewCreated_$clickListener$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.e$d */
    public static final class C62511d extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MeetingRingingFragment f157306a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C62511d(MeetingRingingFragment eVar) {
            this.f157306a = eVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            this.f157306a.onClick(view);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "bitmap", "Landroid/graphics/Bitmap;", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.e$i */
    public static final class C62516i<T> implements Consumer<Bitmap> {

        /* renamed from: a */
        final /* synthetic */ MeetingRingingFragment f157311a;

        C62516i(MeetingRingingFragment eVar) {
            this.f157311a = eVar;
        }

        /* renamed from: a */
        public final void accept(Bitmap bitmap) {
            MeetingRingingFragment.m244398b(this.f157311a).setImageBitmap(bitmap);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C62063d m244397a(MeetingRingingFragment eVar) {
        C62063d dVar = eVar.f157285f;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("legalPrivacyIntercept");
        }
        return dVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ ImageView m244398b(MeetingRingingFragment eVar) {
        ImageView imageView = eVar.f157280a;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("blurImageView");
        }
        return imageView;
    }

    @Override // com.ss.android.vc.meeting.module.base.C61434m
    /* renamed from: a */
    public void mo212880a(Context context) {
        super.mo212880a(context);
        if (context != null) {
            this.f157289l = (Activity) context;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/vc/meeting/utils/meetingcheck/MeetingCheckData;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.e$b */
    public static final class C62509b<T> implements Consumer<MeetingCheckData> {

        /* renamed from: a */
        final /* synthetic */ MeetingRingingFragment f157304a;

        C62509b(MeetingRingingFragment eVar) {
            this.f157304a = eVar;
        }

        /* renamed from: a */
        public final void accept(MeetingCheckData bVar) {
            C61303k w = this.f157304a.mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w, "meeting");
            C60700b.m235841a(w.mo212056e(), "UI", "StateEngine", "clickRingingAccept", MeetingRingingFragment.f157275k.mo216127a(), "clickRingingAcceptButton");
            C61303k w2 = this.f157304a.mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w2, "meeting");
            w2.mo212092J().mo212521a((Boolean) false);
            if (C60785x.m236238b()) {
                C63693e.m249680a();
                C62063d a = MeetingRingingFragment.m244397a(this.f157304a);
                Runnable runnable = this.f157304a.f157288i;
                Runnable d = this.f157304a.mo216120d();
                C61303k w3 = this.f157304a.mo212965w();
                Intrinsics.checkExpressionValueIsNotNull(w3, "meeting");
                a.mo214799a(runnable, d, w3.mo212093K());
                return;
            }
            this.f157304a.mo212963b(SmEvents.EVENT_NONET);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "emitter", "Lio/reactivex/ObservableEmitter;", "Landroid/graphics/Bitmap;", "subscribe"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.e$h */
    public static final class C62515h<T> implements ObservableOnSubscribe<Bitmap> {

        /* renamed from: a */
        final /* synthetic */ MeetingRingingFragment f157310a;

        C62515h(MeetingRingingFragment eVar) {
            this.f157310a = eVar;
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public final void subscribe(ObservableEmitter<Bitmap> observableEmitter) {
            String str;
            String str2;
            ParticipantType participantType;
            Intrinsics.checkParameterIsNotNull(observableEmitter, "emitter");
            VideoChatUser videoChatUser = this.f157310a.f157282c;
            if (videoChatUser != null) {
                str = videoChatUser.getAvatarKey();
            } else {
                str = null;
            }
            VideoChatUser videoChatUser2 = this.f157310a.f157282c;
            if (videoChatUser2 != null) {
                str2 = videoChatUser2.getId();
            } else {
                str2 = null;
            }
            VideoChatUser videoChatUser3 = this.f157310a.f157282c;
            if (videoChatUser3 != null) {
                participantType = videoChatUser3.getType();
            } else {
                participantType = null;
            }
            Bitmap a = C60783v.m236225a(str, str2, participantType, 45, 45);
            Bitmap bitmap = null;
            if (a != null) {
                bitmap = C60749c.m236070a(a, 5, 5);
            }
            if (bitmap != null) {
                observableEmitter.onNext(bitmap);
            }
            observableEmitter.onComplete();
        }
    }

    @Override // com.ss.android.vc.meeting.module.base.C61434m
    /* renamed from: a */
    public void mo212927a(Bundle bundle) {
        Context context;
        if (mo212965w() != null) {
            C61303k w = mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w, "meeting");
            VideoChatUserService F = w.mo212088F();
            Intrinsics.checkExpressionValueIsNotNull(F, "meeting.videoChatUserService");
            this.f157282c = F.getMultiCaller();
            C61303k w2 = mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w2, "meeting");
            if (w2.mo212104V() == 0) {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    context = activity.getApplicationContext();
                } else {
                    context = null;
                }
                this.f157281b = C61367r.m239117a(context);
            }
            VcScreenMonitor.m246178a().mo217319a(this);
            C61303k w3 = mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w3, "meeting");
            w3.mo212165y().mo211989a();
            C62063d a = new C62063d(getActivity()).mo214796a(mo212965w());
            Intrinsics.checkExpressionValueIsNotNull(a, "LegalPrivacyIntercept(ac…vity).setMeeting(meeting)");
            this.f157285f = a;
            return;
        }
        C60700b.m235851b(f157274j, "[onCreate_]", "myMeeting is null ");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        if (r5.booleanValue() != false) goto L_0x0046;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0064  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.vc.entity.ParticipantSettings mo216119a(boolean r5) {
        /*
        // Method dump skipped, instructions count: 232
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.multi.MeetingRingingFragment.mo216119a(boolean):com.ss.android.vc.entity.ParticipantSettings");
    }

    public void onClick(View view) {
        Integer num;
        Context context = null;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == R.id.ringing_accept_container) {
            C60700b.m235851b(f157274j, "[onClick]", "accept button clicked");
            MeetingCheckUtils.m248881a(JoinMeetingPreCheckEntityRequest.JoinMeetingCheckIDType.MEETINGID, 1).subscribe(new C62509b(this));
        } else if (num != null && num.intValue() == R.id.ringing_accept_voice_only_container) {
            C61303k w = mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w, "meeting");
            C60700b.m235841a(w.mo212056e(), "UI", "StateEngine", "clickRingingAccept", f157274j, "clickRingingVoiceAcceptButton");
            C61303k w2 = mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w2, "meeting");
            w2.mo212092J().mo212521a((Boolean) true);
            if (C60785x.m236238b()) {
                C63693e.m249680a();
                C62063d dVar = this.f157285f;
                if (dVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("legalPrivacyIntercept");
                }
                Runnable runnable = this.f157277B;
                Runnable runnable2 = this.f157278C;
                C61303k w3 = mo212965w();
                Intrinsics.checkExpressionValueIsNotNull(w3, "meeting");
                dVar.mo214799a(runnable, runnable2, w3.mo212093K());
                return;
            }
            mo212963b(SmEvents.EVENT_NONET);
        } else if (num != null && num.intValue() == R.id.ringing_decline_container) {
            this.f157278C.run();
        } else if (num != null && num.intValue() == R.id.meeting_ringing_minimize) {
            String str = f157274j;
            C60700b.m235851b(str, "[onClick2]", "minimize button clicked");
            C61303k w4 = mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w4, "meeting");
            if (w4.ae().mo213808a(getActivity(), 0)) {
                C63693e.m249682a("multi_ringing");
                C61303k w5 = mo212965w();
                Intrinsics.checkExpressionValueIsNotNull(w5, "meeting");
                C60700b.m235841a(w5.mo212056e(), "UI", "UI", "clickRingingMinimize", str, "clickRingingMinimizeButton");
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    context = activity.getApplicationContext();
                }
                C61367r a = C61367r.m239117a(context);
                this.f157281b = a;
                if (a != null) {
                    a.mo212396c();
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/MotionEvent;", "onTouch"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.e$c */
    static final class View$OnTouchListenerC62510c implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ MeetingRingingFragment f157305a;

        View$OnTouchListenerC62510c(MeetingRingingFragment eVar) {
            this.f157305a = eVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            Intrinsics.checkExpressionValueIsNotNull(motionEvent, "event");
            int action = motionEvent.getAction();
            if (action == 0) {
                TextView textView = this.f157305a.f157286g;
                if (textView != null) {
                    textView.setTextColor(C60773o.m236126d(R.color.ud_N500));
                }
                IconFontView iconFontView = this.f157305a.f157287h;
                if (iconFontView == null) {
                    return false;
                }
                iconFontView.setTextColor(C60773o.m236126d(R.color.ud_N500));
                return false;
            } else if (action != 1 && action != 4) {
                return false;
            } else {
                TextView textView2 = this.f157305a.f157286g;
                if (textView2 != null) {
                    textView2.setTextColor(C60773o.m236126d(R.color.iconfont_black_icon_selector));
                }
                IconFontView iconFontView2 = this.f157305a.f157287h;
                if (iconFontView2 == null) {
                    return false;
                }
                iconFontView2.setTextColor(C60773o.m236126d(R.color.vc_black_text_selector));
                return false;
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.base.C61434m
    public void a_(View view, Bundle bundle) {
        int i;
        String str;
        VideoChatSettings videoChatSettings;
        VideoChatSettings videoChatSettings2;
        Intrinsics.checkParameterIsNotNull(view, "view");
        ViewGroup viewGroup = this.f157290m;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        View findViewById = viewGroup.findViewById(R.id.meeting_ringing_circle_photo);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "mRootView.findViewById(R…ing_ringing_circle_photo)");
        this.f157291n = (LKUIRoundedImageView) findViewById;
        ViewGroup viewGroup2 = this.f157290m;
        if (viewGroup2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        View findViewById2 = viewGroup2.findViewById(R.id.ringing_accept);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "mRootView.findViewById(R.id.ringing_accept)");
        this.f157292o = (ImageView) findViewById2;
        ViewGroup viewGroup3 = this.f157290m;
        if (viewGroup3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        this.f157303z = viewGroup3.findViewById(R.id.ringing_accept_container);
        ViewGroup viewGroup4 = this.f157290m;
        if (viewGroup4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        View findViewById3 = viewGroup4.findViewById(R.id.ringing_decline);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "mRootView.findViewById(R.id.ringing_decline)");
        this.f157293p = (ImageView) findViewById3;
        ViewGroup viewGroup5 = this.f157290m;
        if (viewGroup5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        this.f157276A = viewGroup5.findViewById(R.id.ringing_decline_container);
        ViewGroup viewGroup6 = this.f157290m;
        if (viewGroup6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        View findViewById4 = viewGroup6.findViewById(R.id.ringing_accept_voice_only_icon);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "mRootView.findViewById(R…g_accept_voice_only_icon)");
        this.f157294q = (IconFontView) findViewById4;
        ViewGroup viewGroup7 = this.f157290m;
        if (viewGroup7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        View findViewById5 = viewGroup7.findViewById(R.id.meeting_ringing_meeting_title);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "mRootView.findViewById(R…ng_ringing_meeting_title)");
        this.f157295r = (TextView) findViewById5;
        ViewGroup viewGroup8 = this.f157290m;
        if (viewGroup8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        View findViewById6 = viewGroup8.findViewById(R.id.meeting_ringing_minimize);
        Intrinsics.checkExpressionValueIsNotNull(findViewById6, "mRootView.findViewById(R…meeting_ringing_minimize)");
        this.f157296s = findViewById6;
        ViewGroup viewGroup9 = this.f157290m;
        if (viewGroup9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        View findViewById7 = viewGroup9.findViewById(R.id.meeting_ringing_invite_msg);
        Intrinsics.checkExpressionValueIsNotNull(findViewById7, "mRootView.findViewById(R…eting_ringing_invite_msg)");
        this.f157297t = (TruncatTextView) findViewById7;
        ViewGroup viewGroup10 = this.f157290m;
        if (viewGroup10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        View findViewById8 = viewGroup10.findViewById(R.id.meeting_ringing_blurImage);
        Intrinsics.checkExpressionValueIsNotNull(findViewById8, "mRootView.findViewById(R…eeting_ringing_blurImage)");
        this.f157280a = (ImageView) findViewById8;
        ViewGroup viewGroup11 = this.f157290m;
        if (viewGroup11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        View findViewById9 = viewGroup11.findViewById(R.id.ringing_accept_text);
        Intrinsics.checkExpressionValueIsNotNull(findViewById9, "mRootView.findViewById(R.id.ringing_accept_text)");
        this.f157298u = (TextView) findViewById9;
        ViewGroup viewGroup12 = this.f157290m;
        if (viewGroup12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        View findViewById10 = viewGroup12.findViewById(R.id.ringing_accept_voice_only_text);
        Intrinsics.checkExpressionValueIsNotNull(findViewById10, "mRootView.findViewById(R…g_accept_voice_only_text)");
        this.f157299v = (TextView) findViewById10;
        ViewGroup viewGroup13 = this.f157290m;
        if (viewGroup13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        this.f157302y = viewGroup13.findViewById(R.id.ringing_accept_voice_only_container);
        ViewGroup viewGroup14 = this.f157290m;
        if (viewGroup14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        this.f157286g = (TextView) viewGroup14.findViewById(R.id.ringing_accept_voice_only_text);
        ViewGroup viewGroup15 = this.f157290m;
        if (viewGroup15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        this.f157287h = (IconFontView) viewGroup15.findViewById(R.id.ringing_accept_voice_only_icon);
        ViewGroup viewGroup16 = this.f157290m;
        if (viewGroup16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        View findViewById11 = viewGroup16.findViewById(R.id.externalTag);
        Intrinsics.checkExpressionValueIsNotNull(findViewById11, "mRootView.findViewById(R.id.externalTag)");
        this.f157300w = (TextView) findViewById11;
        boolean e = VideoChatModuleDependency.m236632e();
        TextView textView = this.f157300w;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("externalView");
        }
        C61303k w = mo212965w();
        Intrinsics.checkExpressionValueIsNotNull(w, "meeting");
        VideoChat e2 = w.mo212056e();
        Intrinsics.checkExpressionValueIsNotNull(e2, "meeting.videoChat");
        if (!e2.isExternalForRing() || !e) {
            i = 8;
        } else {
            i = 0;
        }
        textView.setVisibility(i);
        View view2 = this.f157302y;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        View view3 = this.f157296s;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("minimizeView");
        }
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams != null) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin += C60776r.m236148f();
            View view4 = this.f157296s;
            if (view4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("minimizeView");
            }
            view4.setLayoutParams(layoutParams2);
            VideoChat videoChat = this.f157283d;
            String str2 = null;
            if (videoChat == null || (videoChatSettings2 = videoChat.getVideoChatSettings()) == null) {
                str = null;
            } else {
                str = videoChatSettings2.getTopic();
            }
            if (!TextUtils.isEmpty(str)) {
                C61303k w2 = mo212965w();
                Intrinsics.checkExpressionValueIsNotNull(w2, "meeting");
                if (w2.mo212090H() == VideoChat.MeetingSource.VC_FROM_INTERVIEW) {
                    HashMap hashMap = new HashMap();
                    VideoChat videoChat2 = this.f157283d;
                    if (videoChat2 == null) {
                        Intrinsics.throwNpe();
                    }
                    VideoChatSettings videoChatSettings3 = videoChat2.getVideoChatSettings();
                    Intrinsics.checkExpressionValueIsNotNull(videoChatSettings3, "videochat!!.videoChatSettings");
                    String topic = videoChatSettings3.getTopic();
                    Intrinsics.checkExpressionValueIsNotNull(topic, "videochat!!.videoChatSettings.topic");
                    hashMap.put("name", topic);
                    TextView textView2 = this.f157295r;
                    if (textView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("titleView");
                    }
                    textView2.setText(UIHelper.mustacheFormat((int) R.string.View_M_VideoInterviewNameBraces, hashMap));
                } else {
                    VideoChat videoChat3 = this.f157283d;
                    if (!(videoChat3 == null || (videoChatSettings = videoChat3.getVideoChatSettings()) == null)) {
                        str2 = videoChatSettings.getTopic();
                    }
                    int a = C60776r.m236139a() - UIHelper.dp2px(40.0f);
                    TextView textView3 = this.f157300w;
                    if (textView3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("externalView");
                    }
                    int width = a - textView3.getWidth();
                    TextView textView4 = this.f157295r;
                    if (textView4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("titleView");
                    }
                    if (textView4.getPaint().measureText(str2) > ((float) width)) {
                        TextView textView5 = this.f157300w;
                        if (textView5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("externalView");
                        }
                        ViewGroup.LayoutParams layoutParams3 = textView5.getLayoutParams();
                        if (layoutParams3 != null) {
                            ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
                            layoutParams4.f2819k = -1;
                            layoutParams4.f2816h = -1;
                            layoutParams4.f2824p = -1;
                            layoutParams4.f2817i = R.id.meeting_ringing_meeting_title;
                            layoutParams4.f2825q = -1;
                            layoutParams4.setMargins(0, UIHelper.dp2px(8.0f), 0, 0);
                            TextView textView6 = this.f157300w;
                            if (textView6 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("externalView");
                            }
                            textView6.setLayoutParams(layoutParams4);
                            TextView textView7 = this.f157295r;
                            if (textView7 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("titleView");
                            }
                            ViewGroup.LayoutParams layoutParams5 = textView7.getLayoutParams();
                            if (layoutParams5 != null) {
                                ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams5;
                                layoutParams6.f2826r = -1;
                                TextView textView8 = this.f157295r;
                                if (textView8 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("titleView");
                                }
                                textView8.setLayoutParams(layoutParams6);
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                            }
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                        }
                    }
                    TextView textView9 = this.f157295r;
                    if (textView9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("titleView");
                    }
                    textView9.setText(str2);
                }
            } else {
                TextView textView10 = this.f157295r;
                if (textView10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("titleView");
                }
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    str2 = activity.getString(R.string.View_G_ServerNoTitle);
                }
                textView10.setText(str2);
            }
            mo216121e();
            m244399i();
            C62511d dVar = new C62511d(this);
            View view5 = this.f157303z;
            if (view5 != null) {
                view5.setOnClickListener(dVar);
            }
            View view6 = this.f157276A;
            if (view6 != null) {
                view6.setOnClickListener(dVar);
            }
            View view7 = this.f157302y;
            if (view7 != null) {
                view7.setOnClickListener(dVar);
            }
            View view8 = this.f157302y;
            if (view8 != null) {
                view8.setOnTouchListener(new View$OnTouchListenerC62510c(this));
            }
            View view9 = this.f157296s;
            if (view9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("minimizeView");
            }
            view9.setOnClickListener(dVar);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
    }

    @Override // com.ss.android.vc.meeting.module.base.C61434m
    /* renamed from: a */
    public View mo212879a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_meeting_ringing_2, viewGroup, false);
        if (inflate != null) {
            ViewGroup viewGroup2 = (ViewGroup) inflate;
            this.f157290m = viewGroup2;
            if (viewGroup2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRootView");
            }
            return viewGroup2;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }
}
