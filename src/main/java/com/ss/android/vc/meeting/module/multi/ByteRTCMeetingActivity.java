package com.ss.android.vc.meeting.module.multi;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1178x;
import androidx.p034e.p035a.C0978a;
import com.bytedance.ee.util.p718t.C13748k;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.util.UDUiModeUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.watermark.IWatermarkable;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60750d;
import com.ss.android.vc.common.p3083e.C60752f;
import com.ss.android.vc.common.p3083e.C60775q;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.common.p3083e.C60784w;
import com.ss.android.vc.common.p3083e.C60785x;
import com.ss.android.vc.common.permission.C60795b;
import com.ss.android.vc.common.singleinstance.AbsSingleInstanceControl;
import com.ss.android.vc.common.utils.VCDialogUtils;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.VcMsgInfo;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.framework.meeting.AbstractC61294b;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.meeting.C61329v;
import com.ss.android.vc.meeting.framework.meeting.DisplayMode;
import com.ss.android.vc.meeting.framework.statemachine.SyncQueuePolicy;
import com.ss.android.vc.meeting.model.data.SmStateTransformData;
import com.ss.android.vc.meeting.module.base.AbstractC61431k;
import com.ss.android.vc.meeting.module.base.MeetingActivity;
import com.ss.android.vc.meeting.module.base.MeetingShadowActivity;
import com.ss.android.vc.meeting.module.busyring.C61543c;
import com.ss.android.vc.meeting.module.busyring.C61544d;
import com.ss.android.vc.meeting.module.fastentry.AbstractC61658a;
import com.ss.android.vc.meeting.module.feedback.C61676d;
import com.ss.android.vc.meeting.module.floatingwindow.FloatWindowLaunchType;
import com.ss.android.vc.meeting.module.guides.NewGuideDelegate;
import com.ss.android.vc.meeting.module.lobby.MeetingLobbyFragment;
import com.ss.android.vc.meeting.module.multi.presenter.InMeetingPresenter;
import com.ss.android.vc.meeting.module.p3148o.AbstractC62555a;
import com.ss.android.vc.meeting.module.sharebox.AbstractC63022a;
import com.ss.android.vc.meeting.module.sharebox.MeetingShareFragment;
import com.ss.android.vc.meeting.module.single.C63055a;
import com.ss.android.vc.meeting.module.single.C63082f;
import com.ss.android.vc.meeting.utils.C63532r;
import com.ss.android.vc.meeting.utils.TimeConsumeUtils;
import com.ss.android.vc.net.service.VideoChatUser;
import com.ss.android.vc.net.service.VideoChatUserService;
import com.ss.android.vc.statistics.event.LocalShareEvent;
import com.ss.android.vc.statistics.event.bu;
import com.ss.android.vc.statistics.p3180a.C63690d;
import com.ss.android.vc.statistics.p3180a.C63693e;
import com.ss.android.vc.trace.C63784a;
import com.ss.android.vcxp.annotation.XClass;
import com.ss.android.vcxp.annotation.XMethod;
import com.ss.android.vcxp.annotation.XProcess;
import io.reactivex.p3457e.C68296b;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import me.ele.lancet.base.annotations.Skip;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0002\t\f\b\u0017\u0018\u0000 B2\u00020\u00012\u00020\u0002:\u0002BCB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u0016\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007J\u001e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0007J\b\u0010\u001d\u001a\u00020\u0007H\u0016J\b\u0010\u001e\u001a\u00020\u0018H\u0016J\u0006\u0010\u001f\u001a\u00020\u0018J\b\u0010 \u001a\u00020\u0018H\u0016J\b\u0010!\u001a\u0004\u0018\u00010\"J\b\u0010#\u001a\u00020\u0005H\u0016J\b\u0010$\u001a\u00020\u0018H\u0002J\"\u0010%\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u00052\b\u0010(\u001a\u0004\u0018\u00010)H\u0014J\u0010\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020,H\u0016J\u0012\u0010-\u001a\u00020\u00182\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\b\u00100\u001a\u00020\u0018H\u0016J\u0010\u00101\u001a\u00020\u00182\u0006\u00102\u001a\u00020)H\u0016J\b\u00103\u001a\u00020\u0018H\u0016J\b\u00104\u001a\u00020\u0018H\u0016J\b\u00105\u001a\u00020\u0018H\u0016J\u0010\u00106\u001a\u00020\u00182\u0006\u00107\u001a\u00020\u0007H\u0016J\b\u00108\u001a\u000209H\u0016J\b\u0010:\u001a\u00020\u0018H\u0002J\u0010\u0010;\u001a\u00020\u00182\u0006\u00102\u001a\u00020)H\u0002J\b\u0010<\u001a\u00020\u0018H\u0002J\u001a\u0010=\u001a\u00020\u00182\b\u0010>\u001a\u0004\u0018\u00010?2\u0006\u0010\u001a\u001a\u00020\u0007H\u0002J\u0010\u0010@\u001a\u00020\u00182\u0006\u00102\u001a\u00020)H\u0002J\b\u0010A\u001a\u00020\u0007H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0004\n\u0002\u0010\nR\u0010\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0004\n\u0002\u0010\rR\u001a\u0010\u000e\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000¨\u0006D"}, d2 = {"Lcom/ss/android/vc/meeting/module/multi/ByteRTCMeetingActivity;", "Lcom/ss/android/vc/meeting/module/base/MeetingActivity;", "Lcom/ss/android/lark/base/watermark/IWatermarkable;", "()V", "currentFragmentType", "", "isFinishActivity", "", "mCheckNetworkStatusTask", "com/ss/android/vc/meeting/module/multi/ByteRTCMeetingActivity$mCheckNetworkStatusTask$1", "Lcom/ss/android/vc/meeting/module/multi/ByteRTCMeetingActivity$mCheckNetworkStatusTask$1;", "mListenNetworkChangedTask", "com/ss/android/vc/meeting/module/multi/ByteRTCMeetingActivity$mListenNetworkChangedTask$1", "Lcom/ss/android/vc/meeting/module/multi/ByteRTCMeetingActivity$mListenNetworkChangedTask$1;", "meetingPageActive", "getMeetingPageActive", "()Z", "setMeetingPageActive", "(Z)V", "networkChangedReceiver", "Landroid/content/BroadcastReceiver;", "pageStartTime", "", "disableCallingFragmentMinimizeButton", "", "dismiss", "isOnTheCall", "sync", "endBySelfClick", "enableGlobalWatermark", "finish", "finishAndGotoMainTask", "finishAndRemoveTask", "getOnTheCallFragment", "Lcom/ss/android/vc/meeting/module/multi/InMeetingFragment;", "getWatermarkMode", "initDataObservers", "onActivityResult", "requestCode", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreate_", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy_", "onNewIntent_", "intent", "onPause_", "onResume_", "onStop_", "onWindowFocusChanged", "hasFocus", "provideViewModel", "Lcom/ss/android/vc/meeting/module/multi/presenter/InMeetingPresenter;", "registerNetworkChangedReceiver", "setWindowFlag", "showAdminDialog", "showExitToast", "videoChat", "Lcom/ss/android/vc/entity/VideoChat;", "showFragment", "turnToFloatingWindowMode", "Companion", "TYPE", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
@XClass(isStatic = true, runOnProcess = XProcess.VC)
public class ByteRTCMeetingActivity extends MeetingActivity implements IWatermarkable {

    /* renamed from: f */
    public static final String f157052f = ByteRTCMeetingActivity.class.getSimpleName();

    /* renamed from: g */
    public static boolean f157053g;

    /* renamed from: h */
    public static final Companion f157054h = new Companion(null);

    /* renamed from: d */
    public BroadcastReceiver f157055d;

    /* renamed from: e */
    public final RunnableC62446c f157056e = new RunnableC62446c(this);

    /* renamed from: i */
    private int f157057i = -1;

    /* renamed from: j */
    private boolean f157058j;

    /* renamed from: k */
    private long f157059k;

    /* renamed from: l */
    private boolean f157060l;

    /* renamed from: m */
    private final RunnableC62447d f157061m = new RunnableC62447d(this);

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.ByteRTCMeetingActivity$g */
    public static final class DialogInterface$OnClickListenerC62451g implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC62451g f157068a = new DialogInterface$OnClickListenerC62451g();

        DialogInterface$OnClickListenerC62451g() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: A */
    public static final boolean m244029A() {
        return f157053g;
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m244032a(C61303k kVar) {
        f157054h.mo215867a(kVar);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m244033a(C61303k kVar, boolean z) {
        f157054h.mo215871b(kVar, z);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m244034a(C61303k kVar, boolean z, boolean z2) {
        f157054h.mo215869a(kVar, z, z2);
    }

    /* renamed from: a */
    public static final void m244035a(boolean z) {
        f157053g = z;
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m244038b(C61303k kVar) {
        f157054h.mo215870b(kVar);
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m244039b(C61303k kVar, boolean z) {
        f157054h.mo215873c(kVar, z);
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m244042c(C61303k kVar) {
        f157054h.mo215872c(kVar);
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m244043c(C61303k kVar, boolean z) {
        f157054h.mo215874d(kVar, z);
    }

    @JvmStatic
    @XMethod(methodId = "1")
    public static final void showExistOnTheCallView(String str) {
        f157054h.showExistOnTheCallView(str);
    }

    @JvmStatic
    @XMethod(methodId = "2")
    public static final void showExistWaitingView(String str) {
        f157054h.showExistWaitingView(str);
    }

    @Override // com.ss.android.lark.base.watermark.IWatermarkable
    public boolean enableGlobalWatermark() {
        return true;
    }

    @Override // com.ss.android.lark.base.watermark.IWatermarkable
    public int getWatermarkMode() {
        return 1;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000bH\u0007J\u0018\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000bH\u0007J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0004H\u0007J\u0010\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0010\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0004H\u0007J\u0010\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0018\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000bH\u0007J\u0018\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000bH\u0007J \u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000bH\u0007J\u0018\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0019\u0010\u0006\u001a\n \u0007*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR$\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006 "}, d2 = {"Lcom/ss/android/vc/meeting/module/multi/ByteRTCMeetingActivity$Companion;", "", "()V", "KEY_FRAGMENT_TYPE", "", "SP_KEY_MOBILE_DATA_TIPS", "TAG", "kotlin.jvm.PlatformType", "getTAG", "()Ljava/lang/String;", "finishOnColorModeChange", "", "finishOnColorModeChange$annotations", "getFinishOnColorModeChange", "()Z", "setFinishOnColorModeChange", "(Z)V", "showCallRingingFragment", "", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "isFromFloat", "showCallingFragment", "showExistOnTheCallView", "meetingId", "showExistWaitingView", "showFragmentFromFloat", "showLobbyFragment", "showMeetRingingFragment", "showOnTheCallFragment", "isFirstOpen", "showShareBoxFragment", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.ByteRTCMeetingActivity$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final String mo215866a() {
            return ByteRTCMeetingActivity.f157052f;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo215867a(C61303k kVar) {
            Intrinsics.checkParameterIsNotNull(kVar, "meeting");
            Companion aVar = this;
            C60700b.m235851b(aVar.mo215866a(), "showExistOnTheCallView", "exist onthecall");
            aVar.mo215869a(kVar, true, false);
            kVar.ae().mo213804a();
            kVar.at().mo213574b();
        }

        @JvmStatic
        /* renamed from: b */
        public final void mo215870b(C61303k kVar) {
            Intrinsics.checkParameterIsNotNull(kVar, "meeting");
            Companion aVar = this;
            C60700b.m235851b(aVar.mo215866a(), "showExistWaitingView", "exist waiting");
            aVar.mo215874d(kVar, true);
            kVar.ae().mo213804a();
            kVar.at().mo213574b();
        }

        @JvmStatic
        @XMethod(methodId = "1")
        public final void showExistOnTheCallView(String str) {
            Intrinsics.checkParameterIsNotNull(str, "meetingId");
            if (MeetingManager.m238341a().getMeeting(str) != null) {
                Companion aVar = this;
                AbstractC61294b meeting = MeetingManager.m238341a().getMeeting(str);
                if (meeting != null) {
                    aVar.mo215867a((C61303k) meeting);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.vc.meeting.framework.meeting.Meeting");
            }
        }

        @JvmStatic
        @XMethod(methodId = "2")
        public final void showExistWaitingView(String str) {
            Intrinsics.checkParameterIsNotNull(str, "meetingId");
            if (MeetingManager.m238341a().getMeeting(str) != null) {
                Companion aVar = this;
                AbstractC61294b meeting = MeetingManager.m238341a().getMeeting(str);
                if (meeting != null) {
                    aVar.mo215870b((C61303k) meeting);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.vc.meeting.framework.meeting.Meeting");
            }
        }

        @JvmStatic
        /* renamed from: c */
        public final void mo215872c(C61303k kVar) {
            Intrinsics.checkParameterIsNotNull(kVar, "meeting");
            Companion aVar = this;
            C60700b.m235851b(aVar.mo215866a(), "showFragmentFromFloat", "from float");
            if (kVar.mo212064m()) {
                aVar.mo215868a(kVar, true);
            } else if (kVar.mo212066o()) {
                aVar.mo215874d(kVar, true);
            } else if (kVar.mo212065n()) {
                aVar.mo215867a(kVar);
            } else if (!kVar.mo212063l()) {
            } else {
                if (kVar.mo212057f() == VideoChat.Type.CALL) {
                    aVar.mo215871b(kVar, true);
                } else {
                    aVar.mo215873c(kVar, true);
                }
            }
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo215868a(C61303k kVar, boolean z) {
            Intrinsics.checkParameterIsNotNull(kVar, "meeting");
            String a = mo215866a();
            C60700b.m235851b(a, "[showCallingFragment]", "isFromFloat = " + z);
            C63690d.m249677a();
            HashMap hashMap = new HashMap();
            hashMap.put("key_fragment_type", Integer.valueOf(TYPE.CALLING.ordinal()));
            hashMap.put("key_is_from_float", Boolean.valueOf(z));
            hashMap.put("key_meeing_id", kVar.mo212054c());
            if (z) {
                C63082f.m247067a(2, hashMap, kVar);
            } else {
                C63082f.m247067a(1, hashMap, kVar);
            }
        }

        @JvmStatic
        /* renamed from: b */
        public final void mo215871b(C61303k kVar, boolean z) {
            Intrinsics.checkParameterIsNotNull(kVar, "meeting");
            String a = mo215866a();
            C60700b.m235851b(a, "[showCallRingingFragment]", "isFromFloat = " + z);
            C63690d.m249677a();
            HashMap hashMap = new HashMap();
            hashMap.put("key_fragment_type", Integer.valueOf(TYPE.CALL_RINGING.ordinal()));
            hashMap.put("key_is_from_float", Boolean.valueOf(z));
            hashMap.put("key_meeing_id", kVar.mo212054c());
            if (z) {
                C63082f.m247067a(2, hashMap, kVar);
            } else if (!C63532r.m248975b(ar.m236694a())) {
                C63082f.m247067a(3, hashMap, kVar);
            } else {
                C63082f.m247067a(1, hashMap, kVar);
            }
        }

        @JvmStatic
        /* renamed from: d */
        public final void mo215874d(C61303k kVar, boolean z) {
            Intrinsics.checkParameterIsNotNull(kVar, "meeting");
            C60700b.m235851b(mo215866a(), "showLobbyFragment", "lobby");
            HashMap hashMap = new HashMap();
            hashMap.put("key_fragment_type", Integer.valueOf(TYPE.LOBBY.ordinal()));
            hashMap.put("key_is_from_float", Boolean.valueOf(z));
            hashMap.put("key_meeing_id", kVar.mo212054c());
            if (z) {
                C63082f.m247067a(2, hashMap, kVar);
            } else {
                C63082f.m247067a(1, hashMap, kVar);
            }
        }

        @JvmStatic
        /* renamed from: c */
        public final void mo215873c(C61303k kVar, boolean z) {
            String str;
            Intrinsics.checkParameterIsNotNull(kVar, "meeting");
            String a = mo215866a();
            VideoChat e = kVar.mo212056e();
            if (e != null) {
                str = e.toString();
            } else {
                str = null;
            }
            C60700b.m235851b(a, "[showMeetRingingFragment]", String.valueOf(str));
            C63690d.m249677a();
            HashMap hashMap = new HashMap();
            hashMap.put("key_fragment_type", Integer.valueOf(TYPE.MEET_RINGING.ordinal()));
            hashMap.put("key_meeting_video_chat", kVar.mo212056e());
            hashMap.put("key_meeting_is_from_float", Boolean.valueOf(z));
            hashMap.put("key_meeing_id", kVar.mo212054c());
            if (z) {
                C63082f.m247067a(2, hashMap, kVar);
            } else if (!C63532r.m248975b(ar.m236694a())) {
                C63082f.m247067a(3, hashMap, kVar);
            } else {
                C63082f.m247067a(1, hashMap, kVar);
            }
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo215869a(C61303k kVar, boolean z, boolean z2) {
            Intrinsics.checkParameterIsNotNull(kVar, "meeting");
            C63784a.m250428a("[VideoChat_ByteRtcMeetingActivity_showOnTheCallFragment]");
            C60700b.m235851b(mo215866a(), "showOnTheCallFragment", "onthecall");
            HashMap hashMap = new HashMap();
            AbstractC63022a ak = kVar.ak();
            Intrinsics.checkExpressionValueIsNotNull(ak, "meeting.shareBoxControl");
            if (ak.mo217756b()) {
                hashMap.put("key_fragment_type", Integer.valueOf(TYPE.SHARE_BOX.ordinal()));
                hashMap.put("key_is_from_float", Boolean.valueOf(z));
                hashMap.put("key_meeing_id", kVar.mo212054c());
            } else {
                hashMap.put("key_fragment_type", Integer.valueOf(TYPE.ON_THE_CALL.ordinal()));
                hashMap.put("is_from_float", Boolean.valueOf(z));
                hashMap.put("is_first_open", Boolean.valueOf(z2));
                hashMap.put("key_meeing_id", kVar.mo212054c());
            }
            if (z) {
                C63082f.m247067a(2, hashMap, kVar);
            } else {
                C63082f.m247067a(1, hashMap, kVar);
            }
            C63784a.m250429b("[VideoChat_ByteRtcMeetingActivity_showOnTheCallFragment]");
        }
    }

    /* renamed from: x */
    public final boolean mo215863x() {
        return this.f157060l;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.ByteRTCMeetingActivity$e */
    static final class RunnableC62449e implements Runnable {

        /* renamed from: a */
        public static final RunnableC62449e f157066a = new RunnableC62449e();

        RunnableC62449e() {
        }

        public final void run() {
            C60738ac.m236029a("Single Instance mode");
        }
    }

    /* renamed from: d */
    private final void mo208259d() {
        C60735ab.m236015d().post(this.f157061m);
    }

    @Override // com.ss.android.vc.meeting.module.base.MeetingActivity, com.ss.android.vc.meeting.module.base.AbstractC61430j
    public InMeetingPresenter bw_() {
        InMeetingPresenter bw_ = super.bw_();
        bw_.setDisplayMode(DisplayMode.ACTIVITY);
        Intrinsics.checkExpressionValueIsNotNull(bw_, "super.provideViewModel()…yMode(ACTIVITY)\n        }");
        return bw_;
    }

    @Override // com.ss.android.vc.meeting.module.base.MeetingActivity
    /* renamed from: p */
    public void mo212789p() {
        C60700b.m235851b(f157052f, "[onPause_]", "onPause");
        this.f157060l = false;
    }

    @Override // com.ss.android.vc.meeting.module.base.MeetingActivity
    /* renamed from: q */
    public void mo212790q() {
        C60700b.m235851b(f157052f, "[onStop_]", "onStop");
        this.f157060l = false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.ByteRTCMeetingActivity$f */
    static final class RunnableC62450f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ByteRTCMeetingActivity f157067a;

        RunnableC62450f(ByteRTCMeetingActivity byteRTCMeetingActivity) {
            this.f157067a = byteRTCMeetingActivity;
        }

        public final void run() {
            C61303k m = this.f157067a.mo212786m();
            Intrinsics.checkExpressionValueIsNotNull(m, "meeting");
            m.ae().mo213806a(this.f157067a);
        }
    }

    /* renamed from: b */
    private final void mo208256b() {
        mo212786m().f153583k.mo5923a(this, new C62445b(this));
    }

    @Override // com.ss.android.vc.meeting.module.base.MeetingActivity, com.ss.android.vc.meeting.framework.meeting.LifecycleActivity
    public void finish() {
        C60700b.m235851b(f157052f, "[finish]", "");
        this.f157058j = true;
        super.finish();
        mo208257c();
    }

    public void finishAndRemoveTask() {
        C60700b.m235851b(f157052f, "[finishAndRemoveTask]", "");
        this.f157058j = true;
        super.finishAndRemoveTask();
        mo208257c();
    }

    /* renamed from: z */
    public final InMeetingFragment mo215865z() {
        Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag("InMeetingFragment");
        if (findFragmentByTag == null) {
            return null;
        }
        if (findFragmentByTag != null) {
            return (InMeetingFragment) findFragmentByTag;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.vc.meeting.module.multi.InMeetingFragment");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/vc/meeting/module/multi/ByteRTCMeetingActivity$mListenNetworkChangedTask$1", "Ljava/lang/Runnable;", "run", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.ByteRTCMeetingActivity$d */
    public static final class RunnableC62447d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ByteRTCMeetingActivity f157064a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.multi.ByteRTCMeetingActivity$d$a */
        static final class RunnableC62448a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ RunnableC62447d f157065a;

            RunnableC62448a(RunnableC62447d dVar) {
                this.f157065a = dVar;
            }

            public final void run() {
                if (!this.f157065a.f157064a.isDestroyed()) {
                    this.f157065a.f157064a.f157055d = new ByteRTCMeetingActivity$mListenNetworkChangedTask$1$run$1$1(this);
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    m244067a(this.f157065a.f157064a, this.f157065a.f157064a.f157055d, intentFilter);
                }
            }

            @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
            /* renamed from: a */
            public static Intent m244067a(ByteRTCMeetingActivity byteRTCMeetingActivity, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
                try {
                    return byteRTCMeetingActivity.registerReceiver(broadcastReceiver, intentFilter);
                } catch (Exception e) {
                    if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                        return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
                    }
                    throw e;
                }
            }
        }

        public void run() {
            if (!this.f157064a.isDestroyed()) {
                if (C60785x.m236237a()) {
                    C57744a.m224104a().putBoolean("KEY_MOBILE_DATA_TIPS", true);
                    C60738ac.m236023a((int) R.string.View_G_UsingCellularData);
                    return;
                }
                C57744a.m224104a().putBoolean("KEY_MOBILE_DATA_TIPS", false);
                C60735ab.m236001a(new RunnableC62448a(this));
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        RunnableC62447d(ByteRTCMeetingActivity byteRTCMeetingActivity) {
            this.f157064a = byteRTCMeetingActivity;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/vc/meeting/module/multi/ByteRTCMeetingActivity$mCheckNetworkStatusTask$1", "Ljava/lang/Runnable;", "run", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.ByteRTCMeetingActivity$c */
    public static final class RunnableC62446c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ByteRTCMeetingActivity f157063a;

        public void run() {
            if (!this.f157063a.isDestroyed()) {
                if (!C60785x.m236238b()) {
                    C60738ac.m236023a((int) R.string.View_G_NoConnection);
                } else if (!C57744a.m224104a().getBoolean("KEY_MOBILE_DATA_TIPS") && C60785x.m236237a()) {
                    C57744a.m224104a().putBoolean("KEY_MOBILE_DATA_TIPS", true);
                    C60738ac.m236023a((int) R.string.View_G_UsingCellularData);
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        RunnableC62446c(ByteRTCMeetingActivity byteRTCMeetingActivity) {
            this.f157063a = byteRTCMeetingActivity;
        }
    }

    /* renamed from: B */
    private final void m244030B() {
        if (C60752f.m236082b(mo212783j()) && (mo212783j() instanceof C63055a)) {
            Fragment j = mo212783j();
            if (j != null) {
                ((C63055a) j).mo217877c(false);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.vc.meeting.module.single.CallingRingingFragment");
        }
    }

    /* renamed from: c */
    private final void mo208257c() {
        VideoChat.Type type;
        C61303k m = mo212786m();
        VcMsgInfo.Type type2 = null;
        if (m != null) {
            type = m.mo212057f();
        } else {
            type = null;
        }
        if (type == VideoChat.Type.CALL) {
            C61303k m2 = mo212786m();
            Intrinsics.checkExpressionValueIsNotNull(m2, "meeting");
            VcMsgInfo L = m2.mo212094L();
            if (L != null) {
                type2 = L.type;
            }
            if (type2 == VcMsgInfo.Type.POPUP) {
                VCDialogUtils.m236176a(L.message, R.string.Lark_Legacy_ApplicationPhoneCallTimeButtonKnow, DialogInterface$OnClickListenerC62451g.f157068a, false);
            }
        }
    }

    /* renamed from: y */
    public final void mo215864y() {
        AbsSingleInstanceControl aE;
        C61303k m = mo212786m();
        if (m == null || (aE = m.aE()) == null || !aE.mo208293c()) {
            finish();
            return;
        }
        MeetingShadowActivity.Companion aVar = MeetingShadowActivity.f154002c;
        Context a = ar.m236694a();
        Intrinsics.checkExpressionValueIsNotNull(a, "VcContextDeps.getAppContext()");
        aVar.mo212808a(a, true, this);
    }

    @Override // com.ss.android.vc.meeting.module.base.MeetingActivity
    /* renamed from: l */
    public boolean mo212785l() {
        C60700b.m235851b(f157052f, "[turnToFloatingWindowMode]", String.valueOf(mo212783j()));
        Fragment j = mo212783j();
        if (j == null) {
            return false;
        }
        if (j instanceof InMeetingFragment) {
            ((InMeetingFragment) j).mo216101a(0, FloatWindowLaunchType.BACK2FRONT);
            return true;
        } else if (j instanceof C63055a) {
            ((C63055a) j).mo217876b();
            return true;
        } else if (j instanceof MeetingRingingFragment) {
            ((MeetingRingingFragment) j).mo216122f();
            return true;
        } else if (j instanceof MeetingLobbyFragment) {
            ((MeetingLobbyFragment) j).mo214956e();
            return true;
        } else if (!(j instanceof MeetingShareFragment)) {
            return false;
        } else {
            ((MeetingShareFragment) j).mo217867v();
            return true;
        }
    }

    @Override // com.ss.android.vc.meeting.module.base.MeetingActivity
    /* renamed from: n */
    public void mo212787n() {
        AbsSingleInstanceControl aE;
        StringBuilder sb = new StringBuilder();
        String str = f157052f;
        sb.append(str);
        sb.append(" :onResume_");
        C68296b<Boolean> a = TimeConsumeUtils.m248927a(sb.toString());
        C60700b.m235851b(str, "[onResume_]", "onResume");
        this.f157060l = true;
        C61303k m = mo212786m();
        if (!(m == null || (aE = m.aE()) == null || !aE.mo208293c())) {
            mo212786m().mo212047a(DisplayMode.ACTIVITY, hashCode());
        }
        if (getIntent().getBooleanExtra("EXTRA_FROM_RINGING_PUSH", false)) {
            getIntent().removeExtra("EXTRA_FROM_RINGING_PUSH");
            C61303k m2 = mo212786m();
            Intrinsics.checkExpressionValueIsNotNull(m2, "meeting");
            bu.m250218b(m2.mo212056e());
        }
        C63532r.m248971a();
        C13748k.m55734b(new RunnableC62450f(this));
        TimeConsumeUtils.m248928a(a);
    }

    @Override // com.ss.android.vc.meeting.module.base.MeetingActivity
    /* renamed from: r */
    public void mo212791r() {
        AbstractC62555a aa;
        C61329v b;
        C61303k m;
        AbstractC61658a at;
        C61303k m2;
        AbstractC61658a at2;
        C60700b.m235851b(f157052f, "[onDestroy]", "onDestroy ");
        if (this.f157057i == TYPE.ON_THE_CALL.ordinal()) {
            C61676d.m240733a(mo212786m());
        }
        if (!(this.f157058j || (m = mo212786m()) == null || (at = m.at()) == null || at.mo213573a(mo212784k()) || (m2 = mo212786m()) == null || (at2 = m2.at()) == null)) {
            at2.mo213572a();
        }
        C61303k m3 = mo212786m();
        if (!(m3 == null || (b = m3.mo212052b()) == null)) {
            b.mo212265a(SyncQueuePolicy.SyncAction.UiDestroy);
        }
        C60735ab.m236015d().removeCallbacks(this.f157061m);
        C60735ab.m236015d().removeCallbacks(this.f157056e);
        BroadcastReceiver broadcastReceiver = this.f157055d;
        if (broadcastReceiver != null) {
            unregisterReceiver(broadcastReceiver);
        }
        C61303k m4 = mo212786m();
        if (!(m4 == null || (aa = m4.aa()) == null)) {
            aa.mo216271a(true);
        }
        C60784w.m236233a(this, "Meeting-Activity");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/multi/ByteRTCMeetingActivity$initDataObservers$1", "Landroidx/lifecycle/Observer;", "Lcom/ss/android/vc/meeting/model/data/SmStateTransformData;", "onChanged", "", "transformData", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.ByteRTCMeetingActivity$b */
    public static final class C62445b implements AbstractC1178x<SmStateTransformData> {

        /* renamed from: a */
        final /* synthetic */ ByteRTCMeetingActivity f157062a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C62445b(ByteRTCMeetingActivity byteRTCMeetingActivity) {
            this.f157062a = byteRTCMeetingActivity;
        }

        /* renamed from: a */
        public void onChanged(SmStateTransformData bVar) {
            if (bVar != null && bVar.mo212436b() == 5) {
                if (bVar.mo212435a() == 4) {
                    this.f157062a.mo215859a(true, !C61543c.m240213a(this.f157062a.mo212786m()));
                    return;
                }
                this.f157062a.mo215859a(false, false);
            }
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            C63693e.m249693i();
        }
    }

    /* renamed from: b */
    private final void m244037b(Intent intent) {
        int intExtra = intent.getIntExtra("key_fragment_type", -1);
        getWindow().addFlags(6291584);
        if (intExtra == TYPE.CALL_RINGING.ordinal() || intExtra == TYPE.MEET_RINGING.ordinal()) {
            getWindow().addFlags(524288);
            return;
        }
        getWindow().clearFlags(524288);
        Object systemService = getSystemService("keyguard");
        if (!(systemService instanceof KeyguardManager)) {
            systemService = null;
        }
        KeyguardManager keyguardManager = (KeyguardManager) systemService;
        if (keyguardManager != null && keyguardManager.inKeyguardRestrictedInputMode()) {
            C60700b.m235851b(f157052f, "setWindowFlag", "sendBroadcast ENTER_MEETING_WHEN_SCREEN_LOCK");
            C0978a.m4782a(ar.m236694a()).mo4992a(new Intent("vc_enter_meeting_when_screen_lock"));
        }
    }

    @Override // com.ss.android.vc.meeting.module.base.MeetingActivity
    /* renamed from: a */
    public void mo212769a(Intent intent) {
        AbsSingleInstanceControl aE;
        String str;
        AbsSingleInstanceControl aE2;
        Intrinsics.checkParameterIsNotNull(intent, "intent");
        String str2 = f157052f;
        C60700b.m235851b(str2, "[onNewIntent_]", "onNewIntent ");
        super.mo212769a(intent);
        C61303k m = mo212786m();
        if (!(m == null || (aE2 = m.aE()) == null)) {
            aE2.mo208291a(this);
        }
        this.f157060l = true;
        C68296b<Boolean> a = TimeConsumeUtils.m248927a(str2 + " :onNewIntent_");
        C61303k m2 = mo212786m();
        if (m2 != null && m2.mo212087E()) {
            StringBuilder sb = new StringBuilder();
            sb.append("multimeeting is refused! meetingid = ");
            C61303k m3 = mo212786m();
            if (m3 != null) {
                str = m3.mo212055d();
            } else {
                str = null;
            }
            sb.append(str);
            C60700b.m235851b(str2, "[onNewIntent_2]", sb.toString());
            mo215864y();
        } else if (!intent.getBooleanExtra("open_and_do_nothing", false)) {
            m244037b(intent);
            m244041c(intent);
            C61303k m4 = mo212786m();
            if (m4 != null && (aE = m4.aE()) != null && aE.mo208293c() && intent.getBooleanExtra("is_from_float", false)) {
                mo212786m().mo212047a(DisplayMode.ACTIVITY, hashCode());
            }
            TimeConsumeUtils.m248928a(a);
        }
    }

    /* renamed from: c */
    private final void m244041c(Intent intent) {
        if (!C60752f.m236080a(mo212786m())) {
            C61303k m = mo212786m();
            if (m == null) {
                Intrinsics.throwNpe();
            }
            if (!m.mo212062k()) {
                int intExtra = intent.getIntExtra("key_fragment_type", -1);
                String str = f157052f;
                C60700b.m235851b(str, "[showFragment2]", "type = " + intExtra);
                if (intExtra == this.f157057i) {
                    C60700b.m235851b(str, "[showFragment3]", "currentFragmentType is already exist: " + this.f157057i);
                    Fragment j = mo212783j();
                    if (!C60752f.m236082b(j)) {
                        return;
                    }
                    if (j instanceof AbstractC61431k) {
                        C61303k m2 = mo212786m();
                        Intrinsics.checkExpressionValueIsNotNull(m2, "meeting");
                        m2.mo212108Z().mo213262a();
                        return;
                    } else if (j instanceof MeetingLobbyFragment) {
                        C61544d i = ((MeetingLobbyFragment) j).mo214960i();
                        if (i != null) {
                            i.mo213265a();
                            return;
                        }
                        return;
                    } else if (j instanceof MeetingShareFragment) {
                        C61303k m3 = mo212786m();
                        Intrinsics.checkExpressionValueIsNotNull(m3, "meeting");
                        m3.mo212108Z().mo213262a();
                        return;
                    } else {
                        return;
                    }
                } else if (intExtra == TYPE.CALLING.ordinal()) {
                    this.f157057i = TYPE.CALLING.ordinal();
                    C63055a a = C63055a.m246974a(intent.getBooleanExtra("key_is_from_float", false));
                    Intrinsics.checkExpressionValueIsNotNull(a, "CallingRingingFragment.n…lingInstance(isFromFloat)");
                    C60752f.m236077a(this, R.id.container_bytertc, a, "CallingRingingFragment@");
                    return;
                } else if (intExtra == TYPE.CALL_RINGING.ordinal()) {
                    this.f157057i = TYPE.CALL_RINGING.ordinal();
                    C63055a b = C63055a.m246976b(intent.getBooleanExtra("key_is_from_float", false));
                    Intrinsics.checkExpressionValueIsNotNull(b, "CallingRingingFragment.n…gingInstance(isFromFloat)");
                    C60752f.m236077a(this, R.id.container_bytertc, b, "CallingRingingFragment@");
                    return;
                } else if (intExtra == TYPE.MEET_RINGING.ordinal()) {
                    this.f157057i = TYPE.MEET_RINGING.ordinal();
                    boolean booleanExtra = intent.getBooleanExtra("key_meeting_is_from_float", false);
                    C60752f.m236077a(this, R.id.container_bytertc, MeetingRingingFragment.f157275k.mo216126a((VideoChat) intent.getSerializableExtra("key_meeting_video_chat"), Boolean.valueOf(booleanExtra)), MeetingRingingFragment.f157275k.mo216127a());
                    return;
                } else if (intExtra == TYPE.ON_THE_CALL.ordinal()) {
                    C63784a.m250428a("[VideoChat_ByteRtcMeetingActivity_showFragment]");
                    C61303k m4 = mo212786m();
                    Intrinsics.checkExpressionValueIsNotNull(m4, "meeting");
                    if (TextUtils.isEmpty(m4.mo212092J().mo212537e())) {
                        C60700b.m235864f(str, "[showFragment4]", "channel name is null, dismiss");
                        mo215864y();
                        return;
                    }
                    this.f157057i = TYPE.ON_THE_CALL.ordinal();
                    boolean booleanExtra2 = intent.getBooleanExtra("is_from_float", false);
                    boolean booleanExtra3 = intent.getBooleanExtra("is_first_open", false);
                    if (booleanExtra2) {
                        overridePendingTransition(R.anim.activity_right_in, R.anim.vc_activity_stay);
                    }
                    C60752f.m236077a(this, R.id.container_bytertc, InMeetingFragment.f157237m.mo216105a(booleanExtra2, booleanExtra3), "InMeetingFragment");
                    C63784a.m250429b("[VideoChat_ByteRtcMeetingActivity_showFragment]");
                    return;
                } else if (intExtra == TYPE.LOBBY.ordinal()) {
                    this.f157057i = TYPE.LOBBY.ordinal();
                    C60752f.m236077a(this, R.id.container_bytertc, MeetingLobbyFragment.f156062q.mo214962a(intent.getBooleanExtra("key_is_from_float", false)), "MeetingLobbyFragment");
                    return;
                } else if (intExtra == TYPE.SHARE_BOX.ordinal()) {
                    this.f157057i = TYPE.SHARE_BOX.ordinal();
                    boolean booleanExtra4 = intent.getBooleanExtra("key_is_from_float", false);
                    C61303k m5 = mo212786m();
                    Intrinsics.checkExpressionValueIsNotNull(m5, "meeting");
                    VideoChat e = m5.mo212056e();
                    C61303k m6 = mo212786m();
                    Intrinsics.checkExpressionValueIsNotNull(m6, "meeting");
                    LocalShareEvent.m249992a(e, m6.mo212093K());
                    C60752f.m236077a(this, R.id.container_bytertc, MeetingShareFragment.f158891a.mo217868a(booleanExtra4), "MeetingShareFragment");
                    return;
                } else {
                    return;
                }
            }
        }
        C60700b.m235851b(f157052f, "[showFragment]", "some exception then finish");
        mo215864y();
    }

    @Override // com.ss.android.vc.meeting.module.base.MeetingActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onConfigurationChanged(Configuration configuration) {
        Intrinsics.checkParameterIsNotNull(configuration, "newConfig");
        C63784a.m250428a("[VideoChat_ByteRtcMeetingActivity_onConfigurationChanged]");
        String str = f157052f;
        StringCompanionObject mVar = StringCompanionObject.f173215a;
        Resources resources = getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "resources");
        Context applicationContext = getApplicationContext();
        Intrinsics.checkExpressionValueIsNotNull(applicationContext, "applicationContext");
        Resources resources2 = applicationContext.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources2, "applicationContext.resources");
        String format = String.format("param_uiMode = %s, activity_uiMode = %s, app_uiMode = %s", Arrays.copyOf(new Object[]{Integer.valueOf(configuration.uiMode), Integer.valueOf(resources.getConfiguration().uiMode), Integer.valueOf(resources2.getConfiguration().uiMode)}, 3));
        Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
        C60700b.m235851b(str, "onConfigurationChanged", format);
        C60776r.m236145c();
        if (C60776r.m236157o() && configuration.orientation == 2) {
            if (getRequestedOrientation() == 0 || getRequestedOrientation() == 6 || getRequestedOrientation() == 8) {
                configuration.orientation = 2;
            } else {
                configuration.orientation = 1;
            }
            C60700b.m235851b(str, "[onConfigurationChanged]", "newConfig.orientation = " + configuration.orientation);
        }
        if (configuration.orientation == 2) {
            getWindow().addFlags(1024);
        } else if (configuration.orientation == 1) {
            getWindow().clearFlags(1024);
            C60750d.m236072a(this);
        }
        if (mo212786m() != null) {
            C61303k m = mo212786m();
            Intrinsics.checkExpressionValueIsNotNull(m, "meeting");
            m.ai().mo213045p();
        }
        Resources resources3 = getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources3, "resources");
        resources3.getConfiguration().orientation = configuration.orientation;
        WindowManager windowManager = getWindowManager();
        Intrinsics.checkExpressionValueIsNotNull(windowManager, "windowManager");
        Display defaultDisplay = windowManager.getDefaultDisplay();
        Intrinsics.checkExpressionValueIsNotNull(defaultDisplay, "windowManager.defaultDisplay");
        int rotation = defaultDisplay.getRotation();
        if (rotation == 0) {
            C60700b.m235851b(str, "[onConfigurationChanged]", "ROTATION_0");
        } else if (rotation == 1) {
            C60700b.m235851b(str, "[onConfigurationChanged]", "ROTATION_90");
        } else if (rotation == 2) {
            C60700b.m235851b(str, "[onConfigurationChanged]", "ROTATION_180");
        } else if (rotation == 3) {
            C60700b.m235851b(str, "[onConfigurationChanged]", "ROTATION_270");
        }
        super.onConfigurationChanged(configuration);
        C63784a.m250429b("[VideoChat_ByteRtcMeetingActivity_onConfigurationChanged]");
    }

    @Override // com.ss.android.vc.meeting.module.base.MeetingActivity
    /* renamed from: a */
    public void mo212770a(Bundle bundle) {
        AbsSingleInstanceControl aE;
        StringBuilder sb = new StringBuilder();
        String str = f157052f;
        sb.append(str);
        sb.append(" :onCreate_");
        C68296b<Boolean> a = TimeConsumeUtils.m248927a(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("singleInstance mode = ");
        boolean z = this instanceof ByteRTCMeetingActivityInstance;
        sb2.append(z);
        C60700b.m235851b(str, "[onCreate_]", sb2.toString());
        C63784a.m250428a("[VideoChat_ByteRtcMeetingActivity_onCreate_]");
        C61303k m = mo212786m();
        Intrinsics.checkExpressionValueIsNotNull(m, "meeting");
        m.aE().mo208291a(this);
        this.f157060l = true;
        this.f157059k = System.currentTimeMillis();
        mo208259d();
        C61303k m2 = mo212786m();
        if (!(m2 == null || (aE = m2.aE()) == null || !aE.mo208293c())) {
            overridePendingTransition(R.anim.vc_activity_bottom_in, R.anim.fix_black_screen_anim);
        }
        setContentView(R.layout.activity_meeting_bytertc);
        getWindow().setFormat(-3);
        Window window = getWindow();
        Intrinsics.checkExpressionValueIsNotNull(window, "window");
        window.setStatusBarColor(0);
        this.f157057i = -1;
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        m244037b(intent);
        Intent intent2 = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent2, "intent");
        m244041c(intent2);
        mo208256b();
        C63784a.m250429b("[VideoChat_ByteRtcMeetingActivity_onCreate_]");
        NewGuideDelegate.m240525a();
        C61303k m3 = mo212786m();
        if (m3 != null) {
            getLifecycle().addObserver(m3.mo212102T());
        }
        C60776r.m236142a(UDUiModeUtils.m93319a(this));
        TimeConsumeUtils.m248928a(a);
        if (C60775q.m236138a() && z) {
            C60735ab.m236002a(RunnableC62449e.f157066a, 3000);
        }
    }

    /* renamed from: a */
    public final void mo215859a(boolean z, boolean z2) {
        mo215860a(z, z2, false);
    }

    /* renamed from: a */
    private final void m244031a(VideoChat videoChat, boolean z) {
        String str;
        VideoChat.Type type;
        if (!C60752f.m236080a(videoChat) && !C60752f.m236080a(videoChat.getParticipants()) && !C60752f.m236080a(VideoChatUserService.getCurrentUser())) {
            C60700b.m235851b(f157052f, "[showExitToast]", "videoChat = " + videoChat);
            VideoChat.Type type2 = null;
            Participant participant = null;
            Iterator<Participant> it = videoChat.getParticipants().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Participant next = it.next();
                Intrinsics.checkExpressionValueIsNotNull(next, "participant");
                String id = next.getId();
                VideoChatUser currentUser = VideoChatUserService.getCurrentUser();
                Intrinsics.checkExpressionValueIsNotNull(currentUser, "VideoChatUserService.getCurrentUser()");
                if (Intrinsics.areEqual(id, currentUser.getId())) {
                    participant = next;
                    break;
                }
            }
            if (C60752f.m236082b(participant) && participant.getStatus() == Participant.Status.IDLE) {
                VideoChat.EndReason endReason = videoChat.getEndReason();
                if (endReason != null) {
                    switch (C62484a.f157193a[endReason.ordinal()]) {
                        case 1:
                            str = ar.m236694a().getString(R.string.View_G_CallDeclined);
                            Intrinsics.checkExpressionValueIsNotNull(str, "VcContextDeps.getAppCont…ring.View_G_CallDeclined)");
                            break;
                        case 2:
                            str = ar.m236694a().getString(R.string.View_G_CallCanceled);
                            Intrinsics.checkExpressionValueIsNotNull(str, "VcContextDeps.getAppCont…ring.View_G_CallCanceled)");
                            break;
                        case 3:
                        case 4:
                            C60738ac.m236025a((int) R.string.View_G_Disconnected, 3000);
                            return;
                        case 5:
                            str = ar.m236694a().getString(R.string.View_G_CallEnded);
                            Intrinsics.checkExpressionValueIsNotNull(str, "VcContextDeps.getAppCont….string.View_G_CallEnded)");
                            break;
                        case 6:
                            str = "";
                            break;
                        default:
                            if (participant.getOfflineReason() != Participant.OfflineReason.END || endReason == VideoChat.EndReason.UNKNOWN_END_REASON) {
                                str = ar.m236694a().getString(R.string.View_G_CallEnded);
                                Intrinsics.checkExpressionValueIsNotNull(str, "if (me.offlineReason == …                        }");
                                break;
                            } else {
                                C61303k m = mo212786m();
                                Intrinsics.checkExpressionValueIsNotNull(m, "meeting");
                                VideoChatUserService F = m.mo212088F();
                                Intrinsics.checkExpressionValueIsNotNull(F, "meeting.videoChatUserService");
                                VideoChatUser singleRemoteUser = F.getSingleRemoteUser();
                                Intrinsics.checkExpressionValueIsNotNull(singleRemoteUser, "meeting.videoChatUserService.singleRemoteUser");
                                String name = singleRemoteUser.getName();
                                Intrinsics.checkExpressionValueIsNotNull(name, "meeting.videoChatUserService.singleRemoteUser.name");
                                C60738ac.m236031a(UIHelper.mustacheFormat((int) R.string.View_G_CallEndedNameBraces, "name", name), 1000L);
                                return;
                            }
                    }
                    C61303k m2 = mo212786m();
                    if (m2 != null) {
                        type = m2.mo212057f();
                    } else {
                        type = null;
                    }
                    if (type == VideoChat.Type.CALL) {
                        C60738ac.m236031a(str, 1000L);
                    }
                }
                if (endReason == null) {
                    C61303k m3 = mo212786m();
                    if (m3 != null) {
                        type2 = m3.mo212057f();
                    }
                    if (type2 == VideoChat.Type.CALL) {
                        C60738ac.m236025a((int) R.string.View_G_CallEnded, 1000);
                    }
                    Unit unit = Unit.INSTANCE;
                }
            } else if (z) {
                VideoChat.EndReason endReason2 = videoChat.getEndReason();
                if (endReason2 != null) {
                    int i = C62484a.f157194b[endReason2.ordinal()];
                    if (i == 1 || i == 2) {
                        C60738ac.m236025a((int) R.string.View_G_Disconnected, 3000);
                        return;
                    }
                    String string = ar.m236694a().getString(R.string.View_G_CallEnded);
                    Intrinsics.checkExpressionValueIsNotNull(string, "VcContextDeps.getAppCont….string.View_G_CallEnded)");
                    C61303k m4 = mo212786m();
                    if (m4 != null) {
                        type2 = m4.mo212057f();
                    }
                    if (type2 == VideoChat.Type.CALL) {
                        C60738ac.m236031a(string, 1000L);
                        return;
                    }
                    return;
                }
                C61303k m5 = mo212786m();
                if (m5 != null) {
                    type2 = m5.mo212057f();
                }
                if (type2 == VideoChat.Type.CALL) {
                    C60738ac.m236025a((int) R.string.View_G_CallEnded, 1000);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/vc/meeting/module/multi/ByteRTCMeetingActivity$TYPE;", "", "value", "", "(Ljava/lang/String;II)V", "CALLING", "CALL_RINGING", "MEET_RINGING", "ON_THE_CALL", "LOBBY", "SHARE_BOX", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public enum TYPE {
        CALLING(0),
        CALL_RINGING(1),
        MEET_RINGING(2),
        ON_THE_CALL(3),
        LOBBY(4),
        SHARE_BOX(5);

        private TYPE(int i) {
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, com.ss.android.vc.meeting.module.base.MeetingActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        int i3;
        super.onActivityResult(i, i2, intent);
        if (i == 19991) {
            String a = C60795b.m236288a();
            if (!TextUtils.isEmpty(a)) {
                if (C60795b.m236296a(this, a)) {
                    i3 = 0;
                } else {
                    i3 = -1;
                }
                C60795b.m236289a(i, new String[]{a}, new int[]{i3}, this);
            }
        }
    }

    /* renamed from: a */
    public final void mo215860a(boolean z, boolean z2, boolean z3) {
        VideoChat videoChat;
        VideoChat.Type type;
        String str = f157052f;
        C60700b.m235851b(str, "[dismiss]", "isOnTheCall = " + z + ", sync = " + z2);
        if (z2) {
            C60700b.m235851b(str, "[dismiss2]", "wait for ui destroy");
            C61303k m = mo212786m();
            Intrinsics.checkExpressionValueIsNotNull(m, "meeting");
            C61329v b = m.mo212052b();
            if (b != null) {
                b.mo212268b(SyncQueuePolicy.SyncAction.UiDestroy);
            }
        }
        C61303k m2 = mo212786m();
        VideoChat.Type type2 = null;
        if (m2 != null) {
            videoChat = m2.mo212056e();
        } else {
            videoChat = null;
        }
        C61303k m3 = mo212786m();
        if (m3 != null) {
            type = m3.mo212057f();
        } else {
            type = null;
        }
        if (type == VideoChat.Type.CALL) {
            if (z3) {
                C60738ac.m236025a((int) R.string.View_V_CallHasEnded, 1000);
            } else {
                m244031a(videoChat, z);
            }
        }
        if (z) {
            mo215864y();
            return;
        }
        C61303k m4 = mo212786m();
        if (m4 != null) {
            type2 = m4.mo212057f();
        }
        if (type2 != VideoChat.Type.CALL) {
            mo215864y();
        } else if (C60752f.m236080a(videoChat) || TextUtils.isEmpty(videoChat.getId())) {
            m244030B();
            mo215864y();
        } else {
            mo215864y();
        }
    }
}
