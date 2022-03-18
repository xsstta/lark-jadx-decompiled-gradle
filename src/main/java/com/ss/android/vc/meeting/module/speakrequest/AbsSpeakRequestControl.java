package com.ss.android.vc.meeting.module.speakrequest;

import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantSettings;
import com.ss.android.vc.entity.VideoChatSettings;
import com.ss.android.vc.meeting.framework.meeting.AbstractC61298f;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.base.AbstractC61420b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\r\b&\u0018\u00002\u00020\u00012\u00020\u0002:\u0002*+B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&J\u0012\u0010\n\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u000bH&J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u0007H&J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&J\u0010\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013H&J\u0018\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0014H&J\b\u0010\u0019\u001a\u00020\u0017H&J\b\u0010\u001a\u001a\u00020\u0017H&J\u0010\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0017H&J\u0018\u0010\u001d\u001a\u00020\u00072\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u001fH&J\u0012\u0010 \u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&J\u0012\u0010!\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u000bH&J\u0012\u0010\"\u001a\u00020\u00072\b\u0010#\u001a\u0004\u0018\u00010\u0011H&J\u0012\u0010$\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010\u0011H&J\u0010\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u0017H&J\u0010\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0017H&¨\u0006,"}, d2 = {"Lcom/ss/android/vc/meeting/module/speakrequest/AbsSpeakRequestControl;", "Lcom/ss/android/vc/meeting/module/base/BaseControl;", "Lcom/ss/android/vc/meeting/framework/meeting/IMeetingInfoUpdate;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "(Lcom/ss/android/vc/meeting/framework/meeting/Meeting;)V", "addSpeakRequestControlListener", "", "listener", "Lcom/ss/android/vc/meeting/module/speakrequest/AbsSpeakRequestControl$ISpeakRequestControlListener;", "addSpeakRequestTipViewListener", "Lcom/ss/android/vc/meeting/module/speakrequest/AbsSpeakRequestControl$ISpeakRequestViewControlListener;", "dealAllowPritiUnMute", "settings", "Lcom/ss/android/vc/entity/VideoChatSettings;", "dismissSpeakRequestDialog", "getSelfHandStatus", "Lcom/ss/android/vc/entity/ParticipantSettings$HandsStatus;", "getSpeakRequestParticipants", "", "Lcom/ss/android/vc/entity/Participant;", "hostManageApprovalRequest", "pass", "", "participant", "isForceMuteFg", "isTipShowing", "onDealAllowPartiUnMute", "allowPartiUnMute", "onPushSpeakRequestNotify", "participants", "", "removeSpeakRequestControlListener", "removeSpeakRequestTipViewListener", "sendSpeakRequest", "handsStatus", "setSelfHandStatus", "handStatus", "setTipShowing", "show", "showSpeakRequestDialog", "should_hands_up", "ISpeakRequestControlListener", "ISpeakRequestViewControlListener", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.speakrequest.a */
public abstract class AbsSpeakRequestControl extends AbstractC61420b implements AbstractC61298f {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/vc/meeting/module/speakrequest/AbsSpeakRequestControl$ISpeakRequestControlListener;", "", "onDealAllowPartiUnMute", "", "allowPartiUnMute", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.speakrequest.a$a */
    public interface ISpeakRequestControlListener {
        /* renamed from: a */
        void mo214289a(boolean z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0018\u0010\u0007\u001a\u00020\u00032\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH&¨\u0006\u000b"}, d2 = {"Lcom/ss/android/vc/meeting/module/speakrequest/AbsSpeakRequestControl$ISpeakRequestViewControlListener;", "", "onDismissSpeakRequestDialog", "", "onShowSpeakRequstDialog", "should_hands_up", "", "onSpeakRequstTipsViewNotifyChange", "participants", "", "Lcom/ss/android/vc/entity/Participant;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.speakrequest.a$b */
    public interface ISpeakRequestViewControlListener {
        /* renamed from: a */
        void mo218470a();

        /* renamed from: a */
        void mo218471a(List<Participant> list);

        /* renamed from: a */
        void mo218472a(boolean z);
    }

    /* renamed from: a */
    public abstract ParticipantSettings.HandsStatus mo218455a();

    /* renamed from: a */
    public abstract void mo218456a(ParticipantSettings.HandsStatus handsStatus);

    /* renamed from: a */
    public abstract void mo218457a(VideoChatSettings videoChatSettings);

    /* renamed from: a */
    public abstract void mo218458a(ISpeakRequestControlListener aVar);

    /* renamed from: a */
    public abstract void mo218459a(ISpeakRequestViewControlListener bVar);

    /* renamed from: a */
    public abstract void mo218460a(List<Participant> list);

    /* renamed from: a */
    public abstract void mo218461a(boolean z);

    /* renamed from: a */
    public abstract void mo218462a(boolean z, Participant participant);

    /* renamed from: b */
    public abstract void mo218463b();

    /* renamed from: b */
    public abstract void mo218464b(ISpeakRequestControlListener aVar);

    /* renamed from: b */
    public abstract void mo218465b(ISpeakRequestViewControlListener bVar);

    /* renamed from: b */
    public abstract void mo218466b(boolean z);

    /* renamed from: c */
    public abstract boolean mo218467c();

    /* renamed from: d */
    public abstract boolean mo218468d();

    /* renamed from: e */
    public abstract List<Participant> mo218469e();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbsSpeakRequestControl(C61303k kVar) {
        super(kVar);
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
    }
}
