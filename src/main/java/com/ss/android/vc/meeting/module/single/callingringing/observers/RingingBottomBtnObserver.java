package com.ss.android.vc.meeting.module.single.callingringing.observers;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60752f;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60785x;
import com.ss.android.vc.common.widget.IconFontView;
import com.ss.android.vc.entity.ParticipantSettings;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.request.JoinMeetingPreCheckEntityRequest;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.android.vc.meeting.model.MeetingSpecificData;
import com.ss.android.vc.meeting.module.audio.MeetingAudioManager;
import com.ss.android.vc.meeting.module.multi.ByteRTCMeetingActivity;
import com.ss.android.vc.meeting.module.single.callingringing.observers.base.CallingRingingBaseObserver;
import com.ss.android.vc.meeting.module.single.callingringing.observers.livedata.CallingRingingLiveDatas;
import com.ss.android.vc.meeting.module.single.stubs.RingingBottomBtsStub;
import com.ss.android.vc.meeting.utils.meetingcheck.MeetingCheckData;
import com.ss.android.vc.meeting.utils.meetingcheck.MeetingCheckUtils;
import com.ss.android.vc.net.service.VcBizService;
import com.ss.android.vc.statistics.event.C63755e;
import com.ss.android.vc.statistics.event.bn;
import com.ss.android.vc.statistics.event2.MeetingCalleeEvent;
import com.ss.android.vc.statistics.p3180a.C63693e;
import com.ss.android.vc.trace.VCLauncherStatistics;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0012\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0010H\u0003J\b\u0010\u0014\u001a\u00020\u0010H\u0003J\b\u0010\u0015\u001a\u00020\u0010H\u0002R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/vc/meeting/module/single/callingringing/observers/RingingBottomBtnObserver;", "Lcom/ss/android/vc/meeting/module/single/callingringing/observers/base/CallingRingingBaseObserver;", "fragment", "Landroidx/fragment/app/Fragment;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "liveDatas", "Lcom/ss/android/vc/meeting/module/single/callingringing/observers/livedata/CallingRingingLiveDatas;", "(Landroidx/fragment/app/Fragment;Lcom/ss/android/vc/meeting/framework/meeting/Meeting;Lcom/ss/android/vc/meeting/module/single/callingringing/observers/livedata/CallingRingingLiveDatas;)V", "ringingBottomStub", "Lcom/ss/android/vc/meeting/module/single/stubs/RingingBottomBtsStub;", "videoChatType", "Lcom/ss/android/vc/entity/VideoChat$Type;", "getParticipantSettings", "Lcom/ss/android/vc/entity/ParticipantSettings;", "initClickEvent", "", "initViews", "onObserverCreated", "ringingAccept", "ringingAcceptOnlyVoice", "updateRingingViewAsConnecting", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class RingingBottomBtnObserver extends CallingRingingBaseObserver {

    /* renamed from: c */
    public RingingBottomBtsStub f158979c;

    /* renamed from: d */
    private VideoChat.Type f158980d;

    /* renamed from: d */
    public final ParticipantSettings mo217927d() {
        ParticipantSettings participantSettings = new ParticipantSettings();
        participantSettings.setMicrophoneMuted(false);
        participantSettings.setCameraMuted(true);
        return participantSettings;
    }

    /* renamed from: b */
    public final void mo217925b() {
        MeetingCheckUtils.m248881a(JoinMeetingPreCheckEntityRequest.JoinMeetingCheckIDType.CALL_TARGET_USER, 1).subscribe(new C63078e(this));
    }

    /* renamed from: c */
    public final void mo217926c() {
        MeetingCheckUtils.m248881a(JoinMeetingPreCheckEntityRequest.JoinMeetingCheckIDType.CALL_TARGET_USER, 1).subscribe(new C63079f(this));
    }

    /* renamed from: k */
    private final void m247048k() {
        View c;
        View c2;
        ImageView f;
        if (mo217939i()) {
            RingingBottomBtsStub bVar = this.f158979c;
            if (!(bVar == null || (f = bVar.mo217887f()) == null)) {
                f.setImageResource(R.drawable.ic_voicecall_audio_accept_selector);
            }
            RingingBottomBtsStub bVar2 = this.f158979c;
            if (bVar2 != null && (c2 = bVar2.mo217884c()) != null) {
                c2.setVisibility(8);
                return;
            }
            return;
        }
        RingingBottomBtsStub bVar3 = this.f158979c;
        if (bVar3 != null && (c = bVar3.mo217884c()) != null) {
            c.setOnTouchListener(new View$OnTouchListenerC63077d(this));
        }
    }

    /* renamed from: l */
    private final void m247049l() {
        View c;
        View a;
        View b;
        RingingBottomBtsStub bVar = this.f158979c;
        if (!(bVar == null || (b = bVar.mo217883b()) == null)) {
            b.setOnClickListener(new View$OnClickListenerC63074a(this));
        }
        RingingBottomBtsStub bVar2 = this.f158979c;
        if (!(bVar2 == null || (a = bVar2.mo217882a()) == null)) {
            a.setOnClickListener(new View$OnClickListenerC63075b(this));
        }
        RingingBottomBtsStub bVar3 = this.f158979c;
        if (bVar3 != null && (c = bVar3.mo217884c()) != null) {
            c.setOnClickListener(new View$OnClickListenerC63076c(this));
        }
    }

    @Override // com.ss.android.vc.meeting.module.single.callingringing.observers.base.CallingRingingBaseObserver
    public void ca_() {
        View view;
        if (mo217937g() == ByteRTCMeetingActivity.TYPE.CALL_RINGING.ordinal()) {
            C61303k kVar = this.f151993b;
            Intrinsics.checkExpressionValueIsNotNull(kVar, "meeting");
            this.f158980d = kVar.mo212057f();
            Fragment fragment = this.f151992a;
            if (fragment != null) {
                view = fragment.getView();
            } else {
                view = null;
            }
            this.f158979c = new RingingBottomBtsStub(view);
            m247048k();
            m247049l();
        }
    }

    /* renamed from: e */
    public final void mo217928e() {
        MeetingSpecificData J;
        if (!C60752f.m236080a(mo217938h())) {
            C61303k kVar = this.f151993b;
            Intrinsics.checkExpressionValueIsNotNull(kVar, "meeting");
            if (kVar.mo212104V() == 1) {
                C61303k kVar2 = this.f151993b;
                if (!(kVar2 == null || (J = kVar2.mo212092J()) == null)) {
                    J.mo212563p(true);
                }
                RingingBottomBtsStub bVar = this.f158979c;
                if (bVar != null) {
                    bVar.mo217888g();
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/single/callingringing/observers/RingingBottomBtnObserver$initClickEvent$1", "Landroid/view/View$OnClickListener;", "onClick", "", "v", "Landroid/view/View;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.single.callingringing.observers.RingingBottomBtnObserver$a */
    public static final class View$OnClickListenerC63074a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RingingBottomBtnObserver f158981a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        View$OnClickListenerC63074a(RingingBottomBtnObserver ringingBottomBtnObserver) {
            this.f158981a = ringingBottomBtnObserver;
        }

        public void onClick(View view) {
            C60700b.m235851b(this.f158981a.mo217936f(), "[onClick]", "click ringing accept button");
            if (this.f158981a.mo217939i()) {
                this.f158981a.mo217926c();
            } else {
                this.f158981a.mo217925b();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/single/callingringing/observers/RingingBottomBtnObserver$initClickEvent$2", "Landroid/view/View$OnClickListener;", "onClick", "", "v", "Landroid/view/View;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.single.callingringing.observers.RingingBottomBtnObserver$b */
    public static final class View$OnClickListenerC63075b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RingingBottomBtnObserver f158982a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        View$OnClickListenerC63075b(RingingBottomBtnObserver ringingBottomBtnObserver) {
            this.f158982a = ringingBottomBtnObserver;
        }

        public void onClick(View view) {
            this.f158982a.mo217928e();
            C60700b.m235841a(this.f158982a.f151993b.mo212056e(), "UI", "StateEngine", "clickRingingDecline", this.f158982a.mo217936f(), "[onClick] click ringing decline button");
            this.f158982a.mo217935a(101);
            C60738ac.m236025a((int) R.string.View_G_CallEnded, 1000);
            C61303k kVar = this.f158982a.f151993b;
            Intrinsics.checkExpressionValueIsNotNull(kVar, "meeting");
            VideoChat e = kVar.mo212056e();
            C61303k kVar2 = this.f158982a.f151993b;
            Intrinsics.checkExpressionValueIsNotNull(kVar2, "meeting");
            bn.m250197a(e, false, kVar2.mo212093K());
            MeetingCalleeEvent a = MeetingCalleeEvent.f160831b.mo220274a();
            C61303k kVar3 = this.f158982a.f151993b;
            Intrinsics.checkExpressionValueIsNotNull(kVar3, "meeting");
            VideoChat e2 = kVar3.mo212056e();
            C61303k kVar4 = this.f158982a.f151993b;
            Intrinsics.checkExpressionValueIsNotNull(kVar4, "meeting");
            a.mo220272a(e2, false, kVar4.mo212093K());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/single/callingringing/observers/RingingBottomBtnObserver$initClickEvent$3", "Landroid/view/View$OnClickListener;", "onClick", "", "v", "Landroid/view/View;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.single.callingringing.observers.RingingBottomBtnObserver$c */
    public static final class View$OnClickListenerC63076c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RingingBottomBtnObserver f158983a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        View$OnClickListenerC63076c(RingingBottomBtnObserver ringingBottomBtnObserver) {
            this.f158983a = ringingBottomBtnObserver;
        }

        public void onClick(View view) {
            C60700b.m235851b(this.f158983a.mo217936f(), "[onClick2]", "click ringing voice only button");
            this.f158983a.mo217926c();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/vc/meeting/utils/meetingcheck/MeetingCheckData;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.single.callingringing.observers.RingingBottomBtnObserver$e */
    public static final class C63078e<T> implements Consumer<MeetingCheckData> {

        /* renamed from: a */
        final /* synthetic */ RingingBottomBtnObserver f158985a;

        C63078e(RingingBottomBtnObserver ringingBottomBtnObserver) {
            this.f158985a = ringingBottomBtnObserver;
        }

        /* renamed from: a */
        public final void accept(MeetingCheckData bVar) {
            String str;
            MeetingAudioManager.m239471k().mo212694b(false);
            C61303k kVar = this.f158985a.f151993b;
            Intrinsics.checkExpressionValueIsNotNull(kVar, "meeting");
            kVar.mo212092J().mo212521a((Boolean) false);
            C60700b.m235841a(this.f158985a.f151993b.mo212056e(), "UI", "StateEngine", "clickRingingAccept", this.f158985a.mo217936f(), "clickRingingAcceptButton");
            if (C60785x.m236238b()) {
                VCLauncherStatistics.m250423a(VCLauncherStatistics.SCENE.ACCEPT);
                C63693e.m249680a();
                C61303k kVar2 = this.f158985a.f151993b;
                Intrinsics.checkExpressionValueIsNotNull(kVar2, "meeting");
                kVar2.mo212149b(1);
                VCLauncherStatistics.m250421a();
                C61303k kVar3 = this.f158985a.f151993b;
                C61303k kVar4 = this.f158985a.f151993b;
                if (kVar4 != null) {
                    str = kVar4.mo212055d();
                } else {
                    str = null;
                }
                String updateVideoChat = VcBizService.updateVideoChat(kVar3, str, VideoChat.UpdateVideoChatAction.ACCEPT.getNumber(), null, null);
                C61303k kVar5 = this.f158985a.f151993b;
                Intrinsics.checkExpressionValueIsNotNull(kVar5, "meeting");
                VideoChat e = kVar5.mo212056e();
                C61303k kVar6 = this.f158985a.f151993b;
                Intrinsics.checkExpressionValueIsNotNull(kVar6, "meeting");
                C63755e.m250282a(e, kVar6.mo212093K(), updateVideoChat);
                MeetingCalleeEvent a = MeetingCalleeEvent.f160831b.mo220274a();
                C61303k kVar7 = this.f158985a.f151993b;
                Intrinsics.checkExpressionValueIsNotNull(kVar7, "meeting");
                VideoChat e2 = kVar7.mo212056e();
                C61303k kVar8 = this.f158985a.f151993b;
                Intrinsics.checkExpressionValueIsNotNull(kVar8, "meeting");
                a.mo220273a("accept", e2, kVar8.mo212093K());
                this.f158985a.mo217928e();
                return;
            }
            this.f158985a.mo217935a(SmEvents.EVENT_NONET);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/vc/meeting/utils/meetingcheck/MeetingCheckData;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.single.callingringing.observers.RingingBottomBtnObserver$f */
    public static final class C63079f<T> implements Consumer<MeetingCheckData> {

        /* renamed from: a */
        final /* synthetic */ RingingBottomBtnObserver f158986a;

        C63079f(RingingBottomBtnObserver ringingBottomBtnObserver) {
            this.f158986a = ringingBottomBtnObserver;
        }

        /* renamed from: a */
        public final void accept(MeetingCheckData bVar) {
            String str;
            String str2;
            C61303k kVar = this.f158986a.f151993b;
            if (kVar != null) {
                str = kVar.mo212055d();
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                Fragment fragment = this.f158986a.f151992a;
                Intrinsics.checkExpressionValueIsNotNull(fragment, "fragment");
                if (!DesktopUtil.m144301a((Context) fragment.getActivity())) {
                    MeetingAudioManager.m239471k().mo212694b(true);
                } else {
                    MeetingAudioManager.m239471k().mo212694b(false);
                }
                C61303k kVar2 = this.f158986a.f151993b;
                Intrinsics.checkExpressionValueIsNotNull(kVar2, "meeting");
                kVar2.mo212092J().mo212521a((Boolean) true);
                C60700b.m235841a(this.f158986a.f151993b.mo212056e(), "UI", "StateEngine", "clickAcceptVoiceOnly", this.f158986a.mo217936f(), "clickAcceptVoiceOnlyButton");
                if (C60785x.m236238b()) {
                    VCLauncherStatistics.m250423a(VCLauncherStatistics.SCENE.ACCEPT);
                    C63693e.m249680a();
                    C61303k kVar3 = this.f158986a.f151993b;
                    Intrinsics.checkExpressionValueIsNotNull(kVar3, "meeting");
                    kVar3.mo212149b(1);
                    VCLauncherStatistics.m250421a();
                    C61303k kVar4 = this.f158986a.f151993b;
                    C61303k kVar5 = this.f158986a.f151993b;
                    if (kVar5 != null) {
                        str2 = kVar5.mo212055d();
                    } else {
                        str2 = null;
                    }
                    String updateVideoChat = VcBizService.updateVideoChat(kVar4, str2, VideoChat.UpdateVideoChatAction.ACCEPT.getNumber(), this.f158986a.mo217927d(), null);
                    C61303k kVar6 = this.f158986a.f151993b;
                    Intrinsics.checkExpressionValueIsNotNull(kVar6, "meeting");
                    VideoChat e = kVar6.mo212056e();
                    C61303k kVar7 = this.f158986a.f151993b;
                    Intrinsics.checkExpressionValueIsNotNull(kVar7, "meeting");
                    C63755e.m250284b(e, kVar7.mo212093K(), updateVideoChat);
                    MeetingCalleeEvent a = MeetingCalleeEvent.f160831b.mo220274a();
                    C61303k kVar8 = this.f158986a.f151993b;
                    Intrinsics.checkExpressionValueIsNotNull(kVar8, "meeting");
                    VideoChat e2 = kVar8.mo212056e();
                    C61303k kVar9 = this.f158986a.f151993b;
                    Intrinsics.checkExpressionValueIsNotNull(kVar9, "meeting");
                    a.mo220273a("audio_only", e2, kVar9.mo212093K());
                    C61303k kVar10 = this.f158986a.f151993b;
                    Intrinsics.checkExpressionValueIsNotNull(kVar10, "meeting");
                    kVar10.mo212092J().mo212539e(true);
                    this.f158986a.mo217928e();
                    return;
                }
                this.f158986a.mo217935a(SmEvents.EVENT_NONET);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/MotionEvent;", "onTouch"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.single.callingringing.observers.RingingBottomBtnObserver$d */
    public static final class View$OnTouchListenerC63077d implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ RingingBottomBtnObserver f158984a;

        View$OnTouchListenerC63077d(RingingBottomBtnObserver ringingBottomBtnObserver) {
            this.f158984a = ringingBottomBtnObserver;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            IconFontView e;
            TextView d;
            IconFontView e2;
            TextView d2;
            Intrinsics.checkExpressionValueIsNotNull(motionEvent, "event");
            int action = motionEvent.getAction();
            if (action == 0) {
                RingingBottomBtsStub bVar = this.f158984a.f158979c;
                if (!(bVar == null || (d = bVar.mo217885d()) == null)) {
                    d.setTextColor(C60773o.m236126d(R.color.ud_N500));
                }
                RingingBottomBtsStub bVar2 = this.f158984a.f158979c;
                if (bVar2 == null || (e = bVar2.mo217886e()) == null) {
                    return false;
                }
                e.setTextColor(C60773o.m236126d(R.color.ud_N500));
                return false;
            } else if (action != 1 && action != 4) {
                return false;
            } else {
                RingingBottomBtsStub bVar3 = this.f158984a.f158979c;
                if (!(bVar3 == null || (d2 = bVar3.mo217885d()) == null)) {
                    d2.setTextColor(C60773o.m236126d(R.color.iconfont_black_icon_selector));
                }
                RingingBottomBtsStub bVar4 = this.f158984a.f158979c;
                if (bVar4 == null || (e2 = bVar4.mo217886e()) == null) {
                    return false;
                }
                e2.setTextColor(C60773o.m236126d(R.color.vc_black_text_selector));
                return false;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RingingBottomBtnObserver(Fragment fragment, C61303k kVar, CallingRingingLiveDatas aVar) {
        super(fragment, kVar, aVar);
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        Intrinsics.checkParameterIsNotNull(aVar, "liveDatas");
    }
}
