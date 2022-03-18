package com.ss.android.vc.meeting.module.multi;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.larksuite.framework.http.p1186a.AbstractC25988d;
import com.larksuite.framework.http.p1187b.AbstractC25990b;
import com.larksuite.framework.http.request.AbstractC26011b;
import com.larksuite.framework.http.request.C26010a;
import com.larksuite.framework.http.request.HttpMethod;
import com.larksuite.framework.http.request.RequestBody;
import com.larksuite.framework.http.response.BaseResponse;
import com.larksuite.framework.http.response.ErrorResult;
import com.larksuite.suite.R;
import com.ss.android.floatbubble.C28460b;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60752f;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60775q;
import com.ss.android.vc.common.p3083e.C60788y;
import com.ss.android.vc.common.permission.AbstractC60798c;
import com.ss.android.vc.common.permission.C60795b;
import com.ss.android.vc.common.singleinstance.AbsSingleInstanceControl;
import com.ss.android.vc.dependency.IVideoChatDependency;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantSettings;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatSettings;
import com.ss.android.vc.entity.follow.FollowInfo;
import com.ss.android.vc.meeting.basedialog.C61227f;
import com.ss.android.vc.meeting.framework.meeting.AbstractC61293a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.model.C61381c;
import com.ss.android.vc.meeting.model.C61383d;
import com.ss.android.vc.meeting.model.C61388g;
import com.ss.android.vc.meeting.model.MeetingSpecificData;
import com.ss.android.vc.meeting.module.audio.MeetingAudioManager;
import com.ss.android.vc.meeting.module.base.AbstractC61424d;
import com.ss.android.vc.meeting.module.base.AbstractC61431k;
import com.ss.android.vc.meeting.module.base.content.AbstractC61422a;
import com.ss.android.vc.meeting.module.base.content.ContentViewType;
import com.ss.android.vc.meeting.module.base.util.DataAdapterUtil;
import com.ss.android.vc.meeting.module.floatingwindow.AbstractC61728a;
import com.ss.android.vc.meeting.module.floatingwindow.FloatWindowLaunchType;
import com.ss.android.vc.meeting.module.follow.AbstractC61751a;
import com.ss.android.vc.meeting.module.follow.C61771b;
import com.ss.android.vc.meeting.module.follow.common.C61806b;
import com.ss.android.vc.meeting.module.follow.common.FollowConfig;
import com.ss.android.vc.meeting.module.gallery.GalleryViewControl;
import com.ss.android.vc.meeting.module.multi.gridcontent.AbsGridContentControl;
import com.ss.android.vc.meeting.module.multi.gridcontent.GridContentViewControl;
import com.ss.android.vc.meeting.module.multi.presenter.InMeetingPresenter;
import com.ss.android.vc.meeting.module.multi.sharecontent.ShareContentViewControl;
import com.ss.android.vc.meeting.module.p3130k.C61999a;
import com.ss.android.vc.meeting.module.p3151p.AbstractC62612a;
import com.ss.android.vc.meeting.module.p3151p.C62622e;
import com.ss.android.vc.meeting.module.p3155q.AbstractC62782a;
import com.ss.android.vc.meeting.module.sharebox.AbstractC63022a;
import com.ss.android.vc.meeting.utils.ActiveSpeakerCalculator;
import com.ss.android.vc.meeting.utils.TimeConsumeUtils;
import com.ss.android.vc.meeting.utils.UserCallStatusMonitor;
import com.ss.android.vc.net.service.VcBizService;
import com.ss.android.vc.p3069b.C60685h;
import com.ss.android.vc.p3069b.C60686i;
import com.ss.android.vc.statistics.event.C63742at;
import com.ss.android.vc.statistics.event.cc;
import com.ss.android.vc.statistics.p3180a.C63693e;
import com.ss.android.vc.trace.C63784a;
import io.reactivex.p3457e.C68296b;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0017\u0018\u0000 W2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001WB\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u0011H\u0002J\u0018\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u0011H\u0002J\u0012\u0010!\u001a\u00020\u001c2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0014J\b\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020%H\u0002J\n\u0010'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010)\u001a\u00020\u001cH\u0002J\b\u0010*\u001a\u00020\u0011H\u0016J\u0006\u0010+\u001a\u00020\u001cJ\u0010\u0010,\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020\u0011H\u0002J\u0012\u0010.\u001a\u00020\u001c2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\b\u00101\u001a\u00020\u001cH\u0016J\"\u00102\u001a\u00020\u001c2\b\u00103\u001a\u0004\u0018\u0001042\u0006\u00105\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u0011H\u0016J\"\u00107\u001a\u00020\u001c2\b\u00103\u001a\u0004\u0018\u0001042\u0006\u00105\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u0011H\u0016J\b\u00108\u001a\u00020\u0011H\u0016J\u0010\u00109\u001a\u00020\u001c2\u0006\u0010:\u001a\u00020;H\u0016J\u0010\u0010<\u001a\u00020\u001c2\u0006\u0010=\u001a\u00020>H\u0014J\u0010\u0010?\u001a\u00020\u001c2\u0006\u0010=\u001a\u00020>H\u0014J\u0012\u0010@\u001a\u00020\u001c2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010A\u001a\u00020\u001cH\u0016J\b\u0010B\u001a\u00020\u001cH\u0016J\u0018\u0010C\u001a\u00020\u001c2\u0006\u0010D\u001a\u00020\u00112\u0006\u0010E\u001a\u00020\u0011H\u0016J\b\u0010F\u001a\u00020\u001cH\u0014J\b\u0010G\u001a\u00020\u001cH\u0016J\b\u0010H\u001a\u00020\u001cH\u0016J\b\u0010I\u001a\u00020\u001cH\u0016J\u001a\u0010J\u001a\u00020\u001c2\u0006\u0010K\u001a\u00020(2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0006\u0010L\u001a\u00020\u001cJ\b\u0010M\u001a\u00020\u001cH\u0002J\b\u0010N\u001a\u00020\u001cH\u0002J\u0006\u0010O\u001a\u00020\u001cJ\u0016\u0010P\u001a\u00020\u001c2\u0006\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020TJ\b\u0010U\u001a\u00020\u0011H\u0016J\b\u0010V\u001a\u00020\u001cH\u0002R\u0010\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0004\n\u0002\b\u0007R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0004\n\u0002\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX.¢\u0006\u0002\n\u0000¨\u0006X"}, d2 = {"Lcom/ss/android/vc/meeting/module/multi/InMeetingFragment;", "Lcom/ss/android/vc/meeting/module/base/MeetingCallFragment;", "Lcom/ss/android/vc/meeting/module/multi/IInMeetingView;", "Lcom/ss/android/vc/meeting/module/audio/MeetingAudioManager$AudioStateChangedListener;", "()V", "TAG", "", "TAG$1", "mActivity", "Landroid/app/Activity;", "mFollowContentViewControl", "Lcom/ss/android/vc/meeting/module/follow/FollowContentViewControl;", "mGridContentViewControl", "Lcom/ss/android/vc/meeting/module/multi/gridcontent/GridContentViewControl;", "mHostShareContentViewControl", "Lcom/ss/android/vc/meeting/module/sharescreen/ShareScreenViewControl;", "mIsFirstOpen", "", "mRootView", "Landroid/view/ViewGroup;", "mScreenOrientationHelper", "Lcom/ss/android/vc/meeting/module/orientation/ScreenOrientationHelper;", "mSdkListener", "com/ss/android/vc/meeting/module/multi/InMeetingFragment$mSdkListener$1", "Lcom/ss/android/vc/meeting/module/multi/InMeetingFragment$mSdkListener$1;", "mShareContentViewControl", "Lcom/ss/android/vc/meeting/module/multi/sharecontent/ShareContentViewControl;", "changeAudioOnPermissionGranted", "", "granted", "isAudioDenied", "changeCameraOnPermissionGranted", "isCameraDenied", "createContentViewControl", "savedInstanceState", "Landroid/os/Bundle;", "getCameraStatus", "Lcom/ss/android/vc/entity/ParticipantSettings$EquipmentStatus;", "getMicrophoneStatus", "getView", "Landroid/view/View;", "inviteMockPeople", "isFinishing", "lockPortraitInFollow", "muteVideoUI", "mute", "onAttach_", "context", "Landroid/content/Context;", "onAudioMuted", "onAudioStateChanged", "lastType", "Lcom/ss/android/vc/meeting/module/audio/MeetingAudioManager$AudioType;", "lastOutSpeaker", "needTrack", "onAudioStateUnchanged", "onBackPressed", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onContentViewCreated", "contentViewControl", "Lcom/ss/android/vc/meeting/module/base/content/BaseContentViewControl;", "onContentViewDestroyed", "onCreate_", "onDestroyView_", "onDestroy_", "onOrientation", "isLandscape", "isRotate", "onPreDraw_", "onResume_", "onStart_", "onStop_", "onViewCreated_", "view", "recoveryLandscapeInFollow", "registerListeners", "setLocalViewRenderMode", "showContentViewControl", "showFloatWindow", "delayTime", "", "launchType", "Lcom/ss/android/vc/meeting/module/floatingwindow/FloatWindowLaunchType;", "tryShowFloatWindow", "unregisterListeners", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.multi.c */
public final class InMeetingFragment extends AbstractC61431k implements MeetingAudioManager.AbstractC61403a, AbstractC62493b {

    /* renamed from: m */
    public static final Companion f157237m = new Companion(null);

    /* renamed from: k */
    public final String f157238k = "InMeetingFragment";

    /* renamed from: l */
    public ViewGroup f157239l;

    /* renamed from: n */
    private GridContentViewControl f157240n;

    /* renamed from: o */
    private C61771b f157241o;

    /* renamed from: p */
    private ShareContentViewControl f157242p;

    /* renamed from: q */
    private C62622e f157243q;

    /* renamed from: r */
    private Activity f157244r;

    /* renamed from: s */
    private boolean f157245s;

    /* renamed from: t */
    private C61999a f157246t;

    /* renamed from: u */
    private final C62503c f157247u = new C62503c(this);

    /* renamed from: v */
    private HashMap f157248v;

    /* renamed from: L */
    private final void m244351L() {
    }

    /* renamed from: G */
    public void mo216100G() {
        HashMap hashMap = this.f157248v;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.vc.meeting.module.audio.MeetingAudioManager.AbstractC61403a
    public void onAudioMuted() {
    }

    @Override // com.ss.android.vc.meeting.module.audio.MeetingAudioManager.AbstractC61403a
    public void onAudioStateUnchanged(MeetingAudioManager.AudioType audioType, boolean z, boolean z2) {
    }

    @Override // com.ss.android.vc.meeting.module.base.C61434m, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo216100G();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0007J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/vc/meeting/module/multi/InMeetingFragment$Companion;", "", "()V", "KEY_IS_FIRST_OPEN", "", "KEY_IS_FROM_FLOAT", "KEY_IS_UPGRADE", "TAG", "getInstance", "Lcom/ss/android/vc/meeting/module/multi/InMeetingFragment;", "isFromFloat", "", "isFirstOpen", "isUpgrade", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final InMeetingFragment mo216105a(boolean z, boolean z2) {
            InMeetingFragment cVar = new InMeetingFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean("is_from_float", z);
            bundle.putBoolean("is_first_open", z2);
            cVar.setArguments(bundle);
            return cVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.c$d */
    static final class RunnableC62504d implements Runnable {

        /* renamed from: a */
        public static final RunnableC62504d f157251a = new RunnableC62504d();

        RunnableC62504d() {
        }

        public final void run() {
            MeetingAudioManager.m239471k().mo212707l();
        }
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61431k, com.ss.android.vc.meeting.module.base.C61434m
    /* renamed from: o */
    public void mo212936o() {
        super.mo212936o();
        C60700b.m235851b(this.f157238k, "[onStop_]", "onStop_");
        C63693e.m249689e();
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61431k, com.ss.android.vc.meeting.module.base.C61434m
    /* renamed from: q */
    public void mo212938q() {
        C60700b.m235851b(this.f157238k, "[onDestroy_]", "onDestroy_");
        super.mo212938q();
    }

    /* renamed from: H */
    private final void m244347H() {
        InMeetingPresenter y = mo212967y();
        if (y != null) {
            y.registerListeners();
        }
        C61303k w = mo212965w();
        Intrinsics.checkExpressionValueIsNotNull(w, "meeting");
        w.mo212164x().mo211751a(this.f157247u);
    }

    /* renamed from: J */
    private final ParticipantSettings.EquipmentStatus m244349J() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            Intrinsics.throwNpe();
        }
        if (!C60788y.m236247a(activity)) {
            return ParticipantSettings.EquipmentStatus.NO_PERMISSION;
        }
        return ParticipantSettings.EquipmentStatus.NORMAL;
    }

    /* renamed from: K */
    private final ParticipantSettings.EquipmentStatus m244350K() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            Intrinsics.throwNpe();
        }
        if (!C60788y.m236250b(activity)) {
            return ParticipantSettings.EquipmentStatus.NO_PERMISSION;
        }
        return ParticipantSettings.EquipmentStatus.NORMAL;
    }

    /* renamed from: E */
    public final void mo216098E() {
        C60700b.m235851b(this.f157238k, "[lockPortraitInFollow]", "lockPortraitInFollow");
        C61999a aVar = this.f157246t;
        if (aVar != null) {
            aVar.mo214622d();
        }
    }

    /* renamed from: F */
    public final void mo216099F() {
        C60700b.m235851b(this.f157238k, "[recoveryLandscapeInFollow]", "recoveryLandscapeInFollow");
        C61999a aVar = this.f157246t;
        if (aVar != null) {
            aVar.mo214625e();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View getView() {
        if (super.getView() != null) {
            return super.getView();
        }
        if (this.f157239l == null) {
            return null;
        }
        ViewGroup viewGroup = this.f157239l;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        return viewGroup;
    }

    /* renamed from: I */
    private final void m244348I() {
        InMeetingPresenter y = mo212967y();
        if (y != null) {
            y.unregisterListeners();
        }
        C61303k w = mo212965w();
        Intrinsics.checkExpressionValueIsNotNull(w, "meeting");
        w.mo212164x().mo211761b(this.f157247u);
        MeetingAudioManager.m239471k().mo212693b(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.base.C61434m
    /* renamed from: C */
    public void mo212962C() {
        C68296b<Boolean> a = TimeConsumeUtils.m248927a(this.f157238k + ":onPreDraw_");
        super.mo212962C();
        C63693e.m249683b();
        TimeConsumeUtils.m248928a(a);
    }

    @Override // com.ss.android.vc.meeting.module.multi.AbstractC62493b
    public boolean bQ_() {
        if (C60752f.m236080a(getActivity())) {
            return true;
        }
        FragmentActivity activity = getActivity();
        if (activity == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(activity, "activity!!");
        if (activity.isFinishing()) {
            return true;
        }
        return false;
    }

    /* renamed from: M */
    private final void m244352M() {
        if (C60685h.f151809a) {
            C61303k w = mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w, "meeting");
            String d = w.mo212055d();
            int i = C57744a.m224104a().getInt("sp_key_monitor_part_number");
            IVideoChatDependency dependency = VideoChatModuleDependency.getDependency();
            Intrinsics.checkExpressionValueIsNotNull(dependency, "VideoChatModuleDependency.getDependency()");
            AbstractC25990b httpClient = dependency.getHttpClient();
            Intrinsics.checkExpressionValueIsNotNull(httpClient, "VideoChatModuleDependenc…etDependency().httpClient");
            C26010a aVar = new C26010a(HttpMethod.POST, "http://10.227.9.155:5000/");
            aVar.mo92476b(new RequestBody("application/x-www-form-urlencoded", "testEnv=pre&roomname=" + d + "&pubnumber=" + i + "&audioPubnum="));
            AbstractC25988d a = httpClient.mo92412a(aVar);
            Intrinsics.checkExpressionValueIsNotNull(a, "client.newCall(req)");
            a.mo92408a(new C62502b(this));
        }
    }

    @Override // com.ss.android.vc.meeting.module.fastentry.AbstractC61661d
    public boolean bx_() {
        C61303k w = mo212965w();
        Intrinsics.checkExpressionValueIsNotNull(w, "meeting");
        if (!w.mo212092J().mo212504A()) {
            C61303k w2 = mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w2, "meeting");
            w2.mo212165y().mo212014c();
        }
        if (!C28460b.m104296a(getActivity())) {
            return false;
        }
        C61303k w3 = mo212965w();
        Intrinsics.checkExpressionValueIsNotNull(w3, "meeting");
        C60700b.m235841a(w3.mo212056e(), "UI", "UI", "showFloatWindowFastEntry", this.f157238k, "showFloatWindowFastEntry");
        mo216101a(0, FloatWindowLaunchType.NORMAL);
        return true;
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61431k, com.ss.android.vc.meeting.module.base.AbstractC61428h
    /* renamed from: c */
    public boolean mo212915c() {
        C60700b.m235851b(this.f157238k, "[onBackPressed]", "on back pressed");
        if (super.mo212915c()) {
            return false;
        }
        C61303k w = mo212965w();
        Intrinsics.checkExpressionValueIsNotNull(w, "meeting");
        w.ah().mo219483b(getActivity());
        return true;
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61431k, com.ss.android.vc.meeting.module.base.C61434m
    /* renamed from: p */
    public void mo212937p() {
        ActiveSpeakerCalculator w;
        C60700b.m235851b(this.f157238k, "[onDestroyView_]", "onDestroyView_");
        super.mo212937p();
        m244348I();
        C61303k w2 = mo212965w();
        if (!(w2 == null || (w = w2.mo212163w()) == null)) {
            w.mo219602a((ActiveSpeakerCalculator.ActiveSpeakerSpeakListener) null);
        }
        C61999a aVar = this.f157246t;
        if (aVar != null) {
            aVar.mo214618b(this.f154017c);
        }
        GridContentViewControl dVar = this.f157240n;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGridContentViewControl");
        }
        dVar.destroy();
        C61771b bVar = this.f157241o;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFollowContentViewControl");
        }
        bVar.destroy();
        ShareContentViewControl fVar = this.f157242p;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mShareContentViewControl");
        }
        fVar.destroy();
        C62622e eVar = this.f157243q;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHostShareContentViewControl");
        }
        eVar.destroy();
        C61227f.m238148c().mo211723b();
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61431k, com.ss.android.vc.meeting.module.base.C61434m
    /* renamed from: l */
    public void mo212933l() {
        super.mo212933l();
        C68296b<Boolean> a = TimeConsumeUtils.m248927a(this.f157238k + " :onStart_");
        C63784a.m250428a("[VideoChat_InMeetingFragment_onStart_]");
        C60700b.m235851b(this.f157238k, "[onStart_]", "onStart_");
        C61303k w = mo212965w();
        Intrinsics.checkExpressionValueIsNotNull(w, "meeting");
        MeetingSpecificData J = w.mo212092J();
        if (J != null && !J.mo212516M()) {
            C61303k w2 = mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w2, "meeting");
            if (!w2.mo212092J().mo212555l()) {
                boolean a2 = C60795b.m236297a((Object) getActivity(), "android.permission.RECORD_AUDIO");
                boolean a3 = C60795b.m236297a((Object) getActivity(), "android.permission.CAMERA");
                boolean b = C60788y.m236250b(getActivity());
                boolean a4 = C60788y.m236247a(getActivity());
                C61303k w3 = mo212965w();
                Intrinsics.checkExpressionValueIsNotNull(w3, "meeting");
                if (!w3.mo212071t()) {
                    C61303k w4 = mo212965w();
                    Intrinsics.checkExpressionValueIsNotNull(w4, "meeting");
                    if (!Intrinsics.areEqual((Object) w4.mo212092J().mo212550j(), (Object) true)) {
                        C60788y.m236248b((Activity) getActivity(), (AbstractC60798c) new C62507g(this, b, a2, a4, a3));
                        J.mo212569s(true);
                    }
                }
                C60788y.m236248b((Activity) getActivity(), (AbstractC60798c) new C62506f(this, b, a2));
                J.mo212569s(true);
            }
        }
        C61303k w5 = mo212965w();
        Intrinsics.checkExpressionValueIsNotNull(w5, "meeting");
        if (!w5.mo212092J().mo212504A()) {
            C61303k w6 = mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w6, "meeting");
            w6.mo212165y().mo212014c();
        }
        C63784a.m250429b("[VideoChat_InMeetingFragment_onStart_]");
        TimeConsumeUtils.m248928a(a);
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61431k, com.ss.android.vc.meeting.module.base.C61434m
    /* renamed from: m */
    public void mo212934m() {
        AbsSingleInstanceControl aE;
        AbsSingleInstanceControl aE2;
        super.mo212934m();
        C68296b<Boolean> a = TimeConsumeUtils.m248927a(this.f157238k + " :onResume_");
        C63784a.m250428a("[VideoChat_InMeetingFragment_onResume_]");
        C61303k w = mo212965w();
        Intrinsics.checkExpressionValueIsNotNull(w, "meeting");
        AbstractC62782a af = w.af();
        Intrinsics.checkExpressionValueIsNotNull(af, "meeting.telephoneControl");
        if (af.mo216825c()) {
            C61303k w2 = mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w2, "meeting");
            w2.af().mo216820a();
            C61303k w3 = mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w3, "meeting");
            w3.af().mo216823b();
        }
        C61303k w4 = mo212965w();
        Intrinsics.checkExpressionValueIsNotNull(w4, "meeting");
        w4.au().mo213267a();
        C61303k w5 = mo212965w();
        if (!(w5 == null || (aE2 = w5.aE()) == null || !aE2.mo208293c())) {
            if (this.f154023i) {
                mo216097D();
            } else {
                C61303k w6 = mo212965w();
                Intrinsics.checkExpressionValueIsNotNull(w6, "meeting");
                C61383d I = w6.mo212091I();
                Intrinsics.checkExpressionValueIsNotNull(I, "meeting.meetingData");
                C61381c a2 = I.mo212490a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "meeting.meetingData.inMeetingInfoData");
                if (C61806b.m241475b(a2.mo212480l())) {
                    C61303k w7 = mo212965w();
                    Intrinsics.checkExpressionValueIsNotNull(w7, "meeting");
                    AbstractC61751a ab = w7.ab();
                    C61303k w8 = mo212965w();
                    Intrinsics.checkExpressionValueIsNotNull(w8, "meeting");
                    C61383d I2 = w8.mo212091I();
                    Intrinsics.checkExpressionValueIsNotNull(I2, "meeting.meetingData");
                    C61381c a3 = I2.mo212490a();
                    Intrinsics.checkExpressionValueIsNotNull(a3, "meeting.meetingData.inMeetingInfoData");
                    ab.mo213874c(a3.mo212480l());
                }
            }
        }
        C61303k w9 = mo212965w();
        if (!(w9 == null || (aE = w9.aE()) == null || !aE.mo208293c())) {
            C61303k w10 = mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w10, "meeting");
            w10.aj().mo216423m();
        }
        C63784a.m250429b("[VideoChat_InMeetingFragment_onResume_]");
        TimeConsumeUtils.m248928a(a);
    }

    /* renamed from: D */
    public final void mo216097D() {
        VideoChatSettings videoChatSettings;
        C61303k w = mo212965w();
        Intrinsics.checkExpressionValueIsNotNull(w, "meeting");
        String m = w.mo212092J().mo212556m();
        C61303k w2 = mo212965w();
        Intrinsics.checkExpressionValueIsNotNull(w2, "meeting");
        String n = w2.mo212092J().mo212558n();
        C61303k w3 = mo212965w();
        Intrinsics.checkExpressionValueIsNotNull(w3, "meeting");
        C61383d I = w3.mo212091I();
        Intrinsics.checkExpressionValueIsNotNull(I, "meeting.meetingData");
        C61381c a = I.mo212490a();
        Intrinsics.checkExpressionValueIsNotNull(a, "meeting.meetingData.inMeetingInfoData");
        FollowInfo l = a.mo212480l();
        String str = this.f157238k;
        C60700b.m235851b(str, "[createContentViewControl]", "shareInfo: " + n + ' ' + m + ", followInfo: " + l);
        VideoChatSettings.SubType subType = null;
        if (!TextUtils.isEmpty(m) && !TextUtils.isEmpty(n)) {
            C61303k w4 = mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w4, "meeting");
            AbstractC63022a ak = w4.ak();
            Intrinsics.checkExpressionValueIsNotNull(ak, "meeting.shareBoxControl");
            if (ak.mo217756b()) {
                mo212888c(null);
                C61303k w5 = mo212965w();
                Intrinsics.checkExpressionValueIsNotNull(w5, "meeting");
                w5.ak().mo217760f();
            } else {
                C61303k w6 = mo212965w();
                Intrinsics.checkExpressionValueIsNotNull(w6, "meeting");
                w6.ay().mo216067a(C61806b.m241475b(l));
            }
        } else if (l == null || TextUtils.isEmpty(l.getDeviceId())) {
            C61303k w7 = mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w7, "meeting");
            VideoChat e = w7.mo212056e();
            if (!(e == null || (videoChatSettings = e.getVideoChatSettings()) == null)) {
                subType = videoChatSettings.getSubType();
            }
            if (subType != VideoChatSettings.SubType.SCREEN_SHARE) {
                C61303k w8 = mo212965w();
                Intrinsics.checkExpressionValueIsNotNull(w8, "meeting");
                AbstractC62612a aj = w8.aj();
                Intrinsics.checkExpressionValueIsNotNull(aj, "meeting.shareScreenControl");
                if (!aj.mo216408a()) {
                    GridContentViewControl dVar = this.f157240n;
                    if (dVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mGridContentViewControl");
                    }
                    mo212888c(dVar);
                }
            }
            C62622e eVar = this.f157243q;
            if (eVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mHostShareContentViewControl");
            }
            mo212888c(eVar);
        } else if (!FollowConfig.m241446b() || !isAdded()) {
            C61303k w9 = mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w9, "meeting");
            w9.ab().mo213867b(l);
            GridContentViewControl dVar2 = this.f157240n;
            if (dVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mGridContentViewControl");
            }
            mo212888c(dVar2);
        } else {
            C61303k w10 = mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w10, "meeting");
            w10.ab().mo213854a(l);
        }
        this.f154023i = false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/vc/meeting/module/multi/InMeetingFragment$inviteMockPeople$1", "Lcom/larksuite/framework/http/request/BaseRequestCallback;", "Lcom/larksuite/framework/http/response/BaseResponse;", "onError", "", "error", "Lcom/larksuite/framework/http/response/ErrorResult;", "onSuccess", "response", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.c$b */
    public static final class C62502b extends AbstractC26011b<BaseResponse> {

        /* renamed from: a */
        final /* synthetic */ InMeetingFragment f157249a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C62502b(InMeetingFragment cVar) {
            this.f157249a = cVar;
        }

        /* renamed from: a */
        public void mo86434a(BaseResponse baseResponse) {
            C60686i.m235797a(this.f157249a.f157238k, "[inviteMockPeople] success");
        }

        @Override // com.larksuite.framework.http.request.AbstractC26011b
        /* renamed from: a */
        public void mo86433a(ErrorResult errorResult) {
            C60686i.m235797a(this.f157249a.f157238k, "[inviteMockPeople] error");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\"\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u0005H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/vc/meeting/module/multi/InMeetingFragment$mSdkListener$1", "Lcom/ss/android/vc/meeting/framework/meeting/AbsByteRtcListener;", "onError", "", "err", "", "onMediaDeviceError", "deviceType", "deviceId", "", "code", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.c$c */
    public static final class C62503c extends AbstractC61293a {

        /* renamed from: a */
        final /* synthetic */ InMeetingFragment f157250a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C62503c(InMeetingFragment cVar) {
            this.f157250a = cVar;
        }

        @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d, com.ss.android.vc.meeting.framework.meeting.AbstractC61293a
        /* renamed from: a */
        public void mo211745a(int i) {
            C60700b.m235864f(this.f157250a.f157238k, "[onError]", String.valueOf(i));
            if (i == -1003) {
                C61303k w = this.f157250a.mo212965w();
                Intrinsics.checkExpressionValueIsNotNull(w, "meeting");
                w.mo212165y().mo212017d();
                DataAdapterUtil aVar = DataAdapterUtil.f154006a;
                C61303k w2 = this.f157250a.mo212965w();
                Intrinsics.checkExpressionValueIsNotNull(w2, "meeting");
                aVar.mo212861g(w2);
                this.f157250a.mo216102a(true);
                InMeetingFragment cVar = this.f157250a;
                C61303k w3 = cVar.mo212965w();
                Intrinsics.checkExpressionValueIsNotNull(w3, "meeting");
                cVar.mo216102a(w3.mo212092J().mo212504A());
            }
        }

        @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d, com.ss.android.vc.meeting.framework.meeting.AbstractC61293a
        /* renamed from: b */
        public void mo211760b(int i, String str, int i2) {
            super.mo211760b(i, str, i2);
            C60700b.m235864f(this.f157250a.f157238k, "[onMediaDeviceError]", String.valueOf(i2));
            if (i2 == -3001 && DesktopUtil.m144307b()) {
                C61303k w = this.f157250a.mo212965w();
                Intrinsics.checkExpressionValueIsNotNull(w, "meeting");
                w.ai().mo213011a(true, false);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/vc/meeting/module/multi/InMeetingFragment$onCreate_$1", "Lcom/ss/android/vc/meeting/module/orientation/ScreenOrientationHelper$OnChangeListener;", "onOrientation", "", "config", "", "onRotationChange", "rotation", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.c$e */
    public static final class C62505e implements C61999a.AbstractC62001a {

        /* renamed from: a */
        final /* synthetic */ InMeetingFragment f157252a;

        @Override // com.ss.android.vc.meeting.module.p3130k.C61999a.AbstractC62001a
        /* renamed from: b */
        public void mo214631b(int i) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C62505e(InMeetingFragment cVar) {
            this.f157252a = cVar;
        }

        @Override // com.ss.android.vc.meeting.module.p3130k.C61999a.AbstractC62001a
        /* renamed from: a */
        public void mo214630a(int i) {
            boolean z = true;
            if (!(i == 1 || i == 3)) {
                z = false;
            }
            InMeetingPresenter y = this.f157252a.mo212967y();
            if (y != null) {
                y.setMIsLandscape(z);
            }
            InMeetingPresenter y2 = this.f157252a.mo212967y();
            if (y2 != null) {
                y2.updateVcRtcServiceRotation(i);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "permissionGranted"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.c$f */
    static final class C62506f implements AbstractC60798c {

        /* renamed from: a */
        final /* synthetic */ InMeetingFragment f157253a;

        /* renamed from: b */
        final /* synthetic */ boolean f157254b;

        /* renamed from: c */
        final /* synthetic */ boolean f157255c;

        C62506f(InMeetingFragment cVar, boolean z, boolean z2) {
            this.f157253a = cVar;
            this.f157254b = z;
            this.f157255c = z2;
        }

        @Override // com.ss.android.vc.common.permission.AbstractC60798c
        public final void permissionGranted(boolean z) {
            if (!this.f157254b) {
                this.f157253a.mo216103b(z, this.f157255c);
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61431k, androidx.fragment.app.Fragment
    public void onConfigurationChanged(Configuration configuration) {
        Intrinsics.checkParameterIsNotNull(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        m244351L();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "permissionGranted"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.c$g */
    static final class C62507g implements AbstractC60798c {

        /* renamed from: a */
        final /* synthetic */ InMeetingFragment f157256a;

        /* renamed from: b */
        final /* synthetic */ boolean f157257b;

        /* renamed from: c */
        final /* synthetic */ boolean f157258c;

        /* renamed from: d */
        final /* synthetic */ boolean f157259d;

        /* renamed from: e */
        final /* synthetic */ boolean f157260e;

        C62507g(InMeetingFragment cVar, boolean z, boolean z2, boolean z3, boolean z4) {
            this.f157256a = cVar;
            this.f157257b = z;
            this.f157258c = z2;
            this.f157259d = z3;
            this.f157260e = z4;
        }

        @Override // com.ss.android.vc.common.permission.AbstractC60798c
        public final void permissionGranted(boolean z) {
            if (!this.f157257b) {
                this.f157256a.mo216103b(z, this.f157258c);
            }
            C60788y.m236245a((Activity) this.f157256a.getActivity(), (AbstractC60798c) new AbstractC60798c(this) {
                /* class com.ss.android.vc.meeting.module.multi.InMeetingFragment.C62507g.C625081 */

                /* renamed from: a */
                final /* synthetic */ C62507g f157261a;

                {
                    this.f157261a = r1;
                }

                @Override // com.ss.android.vc.common.permission.AbstractC60798c
                public final void permissionGranted(boolean z) {
                    if (!this.f157261a.f157259d) {
                        this.f157261a.f157256a.mo216104c(z, this.f157261a.f157260e);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.base.AbstractC61431k
    /* renamed from: b */
    public void mo212932b(AbstractC61422a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "contentViewControl");
        String str = this.f157238k;
        C60700b.m235851b(str, "[onContentViewDestroyed]", "current contentType: " + aVar.mo212886g());
    }

    /* renamed from: a */
    public final void mo216102a(boolean z) {
        Participant participant;
        AbsGridContentControl aw;
        C61383d I;
        C61388g b;
        C61303k w = mo212965w();
        if (w == null || (I = w.mo212091I()) == null || (b = I.mo212494b()) == null) {
            participant = null;
        } else {
            participant = b.mo212605j();
        }
        if (participant != null) {
            ParticipantSettings participantSettings = participant.getParticipantSettings();
            if (participantSettings != null) {
                participantSettings.setCameraMuted(z);
            }
            C61303k w2 = mo212965w();
            if (w2 != null && (aw = w2.aw()) != null) {
                String rtcJoinId = participant.getRtcJoinId();
                Intrinsics.checkExpressionValueIsNotNull(rtcJoinId, "it.rtcJoinId");
                aw.mo216143b(rtcJoinId);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.base.AbstractC61431k
    /* renamed from: b */
    public void mo212931b(Bundle bundle) {
        C68296b<Boolean> a = TimeConsumeUtils.m248927a(this.f157238k + ":createContentViewControl");
        C60700b.m235851b(this.f157238k, "[createContentViewControl]", String.valueOf(isAdded()));
        InMeetingFragment cVar = this;
        this.f157240n = new GridContentViewControl(cVar);
        this.f157241o = new C61771b(cVar);
        this.f157242p = new ShareContentViewControl(cVar);
        this.f157243q = new C62622e(cVar);
        mo216097D();
        TimeConsumeUtils.m248928a(a);
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61431k, com.ss.android.vc.meeting.module.base.C61434m
    /* renamed from: a */
    public void mo212927a(Bundle bundle) {
        int i;
        Window window;
        C60700b.m235851b(this.f157238k, "[onCreate_]", "onCreate_");
        super.mo212927a(bundle);
        C68296b<Boolean> a = TimeConsumeUtils.m248927a(this.f157238k + " :onCreate_");
        C63784a.m250428a("[VideoChat_InMeetingFragment_onCreate]");
        FragmentActivity activity = getActivity();
        if (!(activity == null || (window = activity.getWindow()) == null)) {
            window.setBackgroundDrawable(null);
        }
        C61303k w = mo212965w();
        Intrinsics.checkExpressionValueIsNotNull(w, "meeting");
        if (w.mo212057f() == VideoChat.Type.MEET) {
            i = 2;
        } else {
            i = 1;
        }
        UserCallStatusMonitor.m248761a(i);
        C61303k w2 = mo212965w();
        Intrinsics.checkExpressionValueIsNotNull(w2, "meeting");
        w2.mo212165y().mo211989a();
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            this.f157246t = ((ByteRTCMeetingActivity) activity2).mo212781h();
            this.f154017c = new C62505e(this);
            C61999a aVar = this.f157246t;
            if (aVar != null) {
                aVar.mo214613a(this.f154017c);
            }
            C63784a.m250429b("[VideoChat_InMeetingFragment_onCreate]");
            TimeConsumeUtils.m248928a(a);
            MeetingAudioManager.m239471k().mo212685a(this);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.vc.meeting.module.multi.ByteRTCMeetingActivity");
    }

    @Override // com.ss.android.vc.meeting.module.base.C61434m
    /* renamed from: a */
    public void mo212880a(Context context) {
        boolean z;
        ParticipantSettings participantSettings;
        C61383d I;
        C61388g b;
        Participant j;
        C68296b<Boolean> a = TimeConsumeUtils.m248927a(this.f157238k + " :onAttach_");
        super.mo212880a(context);
        C63784a.m250428a("[VideoChat_InMeetingFragment_onAttach]");
        if (context != null) {
            this.f157244r = (Activity) context;
            Bundle arguments = getArguments();
            boolean z2 = false;
            if (arguments != null) {
                z = arguments.getBoolean("is_from_float");
            } else {
                z = false;
            }
            this.f154015a = z;
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                z2 = arguments2.getBoolean("is_first_open");
            }
            this.f157245s = z2;
            C61303k w = mo212965w();
            if (w == null || (I = w.mo212091I()) == null || (b = I.mo212494b()) == null || (j = b.mo212605j()) == null) {
                participantSettings = null;
            } else {
                participantSettings = j.getParticipantSettings();
            }
            if (participantSettings == null) {
                C60775q.m236136a("Cannot get self settings when in meeting page, deviceId:" + VideoChatModuleDependency.m236629b());
                participantSettings = new ParticipantSettings();
            }
            FragmentActivity activity = getActivity();
            if (activity == null) {
                Intrinsics.throwNpe();
            }
            boolean a2 = C60788y.m236247a(activity);
            FragmentActivity activity2 = getActivity();
            if (activity2 == null) {
                Intrinsics.throwNpe();
            }
            boolean b2 = C60788y.m236250b(activity2);
            if (!a2) {
                C61303k w2 = mo212965w();
                Intrinsics.checkExpressionValueIsNotNull(w2, "meeting");
                if (!w2.mo212092J().mo212504A()) {
                    C60700b.m235851b(this.f157238k, "[onAttach_]", "has no camera permission, set camera muted true");
                    C61303k w3 = mo212965w();
                    Intrinsics.checkExpressionValueIsNotNull(w3, "meeting");
                    w3.mo212092J().mo212539e(true);
                    participantSettings.setCameraMuted(true);
                    C61303k w4 = mo212965w();
                    Intrinsics.checkExpressionValueIsNotNull(w4, "meeting");
                    participantSettings.setMicrophoneMuted(w4.mo212092J().mo212505B());
                }
            }
            if (!b2) {
                C61303k w5 = mo212965w();
                Intrinsics.checkExpressionValueIsNotNull(w5, "meeting");
                if (!w5.mo212092J().mo212505B()) {
                    C60700b.m235851b(this.f157238k, "[onAttach_2]", "has no audio permission, set audio muted true");
                    C61303k w6 = mo212965w();
                    Intrinsics.checkExpressionValueIsNotNull(w6, "meeting");
                    w6.mo212092J().mo212542f(true);
                    C61303k w7 = mo212965w();
                    Intrinsics.checkExpressionValueIsNotNull(w7, "meeting");
                    w7.mo212165y().mo212016c(true);
                    C61303k w8 = mo212965w();
                    Intrinsics.checkExpressionValueIsNotNull(w8, "meeting");
                    participantSettings.setCameraMuted(w8.mo212092J().mo212504A());
                    participantSettings.setMicrophoneMuted(true);
                }
            }
            C61303k w9 = mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w9, "meeting");
            VcBizService.changeOwnSetting(w9.mo212055d(), participantSettings, m244349J(), m244350K(), a2, b2);
            String str = this.f157238k;
            C60700b.m235851b(str, "[onAttach3]", "isFromFloat = " + this.f154015a);
            C63784a.m250429b("[VideoChat_InMeetingFragment_onAttach]");
            TimeConsumeUtils.m248928a(a);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.base.AbstractC61431k
    /* renamed from: a */
    public void mo212928a(AbstractC61422a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "contentViewControl");
        C68296b<Boolean> a = TimeConsumeUtils.m248927a(this.f157238k + ":onContentViewCreated");
        String str = this.f157238k;
        C60700b.m235851b(str, "[onContentViewCreated]", "current contentType: " + aVar.mo212886g());
        if (aVar.mo212887h()) {
            C61999a aVar2 = this.f157246t;
            if (aVar2 != null) {
                aVar2.mo214621c();
            }
        } else {
            C61999a aVar3 = this.f157246t;
            if (aVar3 != null) {
                aVar3.mo214617b();
            }
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.setRequestedOrientation(1);
            }
        }
        if (aVar.mo212886g() == ContentViewType.MAGIC_SHARE || aVar.mo212886g() == ContentViewType.SHARE_SCREEN || aVar.mo212886g() == ContentViewType.HOST_SHARE_SCREEN_AUDIO) {
            for (AbstractC61424d dVar : this.f154021g) {
                if (dVar instanceof GalleryViewControl) {
                    ((GalleryViewControl) dVar).mo214370b();
                }
            }
            C61303k w = mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w, "meeting");
            w.ar().mo216843a();
        } else {
            for (AbstractC61424d dVar2 : this.f154021g) {
                if (dVar2 instanceof GalleryViewControl) {
                    ((GalleryViewControl) dVar2).mo214374f();
                }
            }
        }
        TimeConsumeUtils.m248928a(a);
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61431k
    /* renamed from: a */
    public void mo212929a(boolean z, boolean z2) {
        super.mo212929a(z, z2);
        if (z) {
            C61227f.m238148c().mo211721a();
        }
    }

    /* renamed from: a */
    public final void mo216101a(long j, FloatWindowLaunchType floatWindowLaunchType) {
        AbstractC61728a ae;
        Intrinsics.checkParameterIsNotNull(floatWindowLaunchType, "launchType");
        C60700b.m235851b(this.f157238k, "[showFloatWindow]", "showFloatWindow");
        C63693e.m249682a("onthecall");
        C61303k w = mo212965w();
        if (w != null && (ae = w.ae()) != null) {
            ae.mo213805a(j, floatWindowLaunchType);
        }
    }

    /* renamed from: c */
    public final void mo216104c(boolean z, boolean z2) {
        boolean z3;
        if (!z || !z2) {
            z3 = false;
        } else {
            z3 = true;
        }
        DataAdapterUtil aVar = DataAdapterUtil.f154006a;
        C61303k w = mo212965w();
        Intrinsics.checkExpressionValueIsNotNull(w, "meeting");
        aVar.mo212849a(w, z3, true, false);
        C61303k w2 = mo212965w();
        Intrinsics.checkExpressionValueIsNotNull(w2, "meeting");
        w2.ai().mo213031f(z3);
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61431k, com.ss.android.vc.meeting.module.base.C61434m
    public void a_(View view, Bundle bundle) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.a_(view, bundle);
        C68296b<Boolean> a = TimeConsumeUtils.m248927a(this.f157238k + " :onViewCreated_");
        C63784a.m250428a("[VideoChat_InMeetingFragment_onViewCreated_]");
        if (bundle != null) {
            C60700b.m235851b(this.f157238k, "[onViewCreated_]", "savedInstanceState");
        }
        if (!this.f154015a) {
            C61303k w = mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w, "meeting");
            Boolean E = w.mo212092J().mo212508E();
            MeetingAudioManager k = MeetingAudioManager.m239471k();
            if (E == null) {
                MeetingAudioManager k2 = MeetingAudioManager.m239471k();
                Intrinsics.checkExpressionValueIsNotNull(k2, "MeetingAudioManager.getInstance()");
                z = k2.mo212721z();
            } else if (!E.booleanValue()) {
                z = true;
            } else {
                z = false;
            }
            k.mo212702f(z);
        }
        m244347H();
        InMeetingPresenter y = mo212967y();
        if (y != null) {
            y.bindView(this);
        }
        InMeetingPresenter y2 = mo212967y();
        if (y2 != null) {
            y2.updateVcRtcServiceRotation(C61999a.m242221g());
        }
        m244351L();
        C61303k w2 = mo212965w();
        Intrinsics.checkExpressionValueIsNotNull(w2, "meeting");
        if (w2.mo212057f() == VideoChat.Type.MEET) {
            C61303k w3 = mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w3, "meeting");
            C61303k w4 = mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w4, "meeting");
            boolean A = true ^ w4.mo212092J().mo212504A();
            C61303k w5 = mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w5, "meeting");
            C63742at.m250074a(!w3.mo212092J().mo212505B(), A, w5.mo212056e());
        } else {
            C61303k w6 = mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w6, "meeting");
            C61303k w7 = mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w7, "meeting");
            boolean A2 = true ^ w7.mo212092J().mo212504A();
            C61303k w8 = mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w8, "meeting");
            cc.m250258a(!w6.mo212092J().mo212505B(), A2, w8.mo212056e());
        }
        C63784a.m250429b("[VideoChat_InMeetingFragment_onViewCreated_]");
        m244352M();
        TimeConsumeUtils.m248928a(a);
    }

    /* renamed from: b */
    public final void mo216103b(boolean z, boolean z2) {
        boolean z3;
        if (!z || !z2) {
            z3 = false;
        } else {
            z3 = true;
        }
        DataAdapterUtil aVar = DataAdapterUtil.f154006a;
        C61303k w = mo212965w();
        Intrinsics.checkExpressionValueIsNotNull(w, "meeting");
        aVar.mo212852b(w, z3, true, false);
        C61303k w2 = mo212965w();
        Intrinsics.checkExpressionValueIsNotNull(w2, "meeting");
        w2.ai().mo213035g(z3);
        mo212965w().aF();
    }

    @Override // com.ss.android.vc.meeting.module.audio.MeetingAudioManager.AbstractC61403a
    public void onAudioStateChanged(MeetingAudioManager.AudioType audioType, boolean z, boolean z2) {
        if (!mo212922g()) {
            C61303k w = mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w, "meeting");
            if (!w.mo212092J().mo212510G()) {
                C60735ab.m236002a(RunnableC62504d.f157251a, 200);
            } else {
                C60738ac.m236039c(C60773o.m236119a((int) R.string.View_MV_MutedNoTalk_Toast));
            }
        }
        MeetingAudioManager.m239471k().mo212693b(this);
    }
}
