package com.ss.android.vc.meeting.module.gallery;

import android.text.TextUtils;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.irtc.VcByteStream;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.meeting.rtcstream.StreamManagerGlobal;
import com.ss.android.vc.meeting.framework.meeting.rtcstream.StreamSpec;
import com.ss.android.vc.meeting.module.multi.presenter.C62526c;
import com.ss.android.vc.net.service.UserInfoService;
import com.ss.android.vc.net.service.VideoChatUser;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0017J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u000e\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0017R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/ss/android/vc/meeting/module/gallery/GalleryModel;", "Lcom/ss/android/vc/meeting/module/multi/presenter/MeetingGridModel;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "participant", "Lcom/ss/android/vc/entity/Participant;", "(Lcom/ss/android/vc/meeting/framework/meeting/Meeting;Lcom/ss/android/vc/entity/Participant;)V", "mIsShowing", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getMIsShowing", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "setMIsShowing", "(Ljava/util/concurrent/atomic/AtomicBoolean;)V", "position", "", "getPosition", "()Ljava/lang/Integer;", "setPosition", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getItemId", "", "isScreenSharePortraitMode", "", "isShowing", "refreshStreamSubscribe", "", "setShowing", "show", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.gallery.e */
public final class GalleryModel extends C62526c {

    /* renamed from: a */
    public static final Companion f155464a = new Companion(null);

    /* renamed from: e */
    private static final String f155465e = f155465e;

    /* renamed from: c */
    private Integer f155466c = -1;

    /* renamed from: d */
    private AtomicBoolean f155467d = new AtomicBoolean(false);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/vc/meeting/module/gallery/GalleryModel$Companion;", "", "()V", "TAG", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.gallery.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final Integer mo214362a() {
        return this.f155466c;
    }

    /* renamed from: d */
    public final boolean mo214367d() {
        return this.f155467d.get();
    }

    @Override // com.ss.android.vc.meeting.module.multi.presenter.C62526c
    /* renamed from: b */
    public void mo214365b() {
        String str;
        Participant m = mo216208m();
        ParticipantType participantType = null;
        if (m != null) {
            str = m.getId();
        } else {
            str = null;
        }
        Participant m2 = mo216208m();
        if (m2 != null) {
            participantType = m2.getParticipantType();
        }
        VideoChatUser userInfoInCache = UserInfoService.getUserInfoInCache(str, participantType);
        if (userInfoInCache != null) {
            userInfoInCache.getId();
        }
        C61303k kVar = this.f157347b;
        Intrinsics.checkExpressionValueIsNotNull(kVar, "mMeeting");
        StreamManagerGlobal T = kVar.mo212102T();
        Participant m3 = mo216208m();
        Intrinsics.checkExpressionValueIsNotNull(m3, "participant");
        String rtcJoinId = m3.getRtcJoinId();
        Intrinsics.checkExpressionValueIsNotNull(rtcJoinId, "participant.rtcJoinId");
        VcByteStream e = T.mo212228e(rtcJoinId);
        if (e == null) {
            return;
        }
        if (!mo214367d() || mo216203h() || mo214366c()) {
            C61303k kVar2 = this.f157347b;
            Intrinsics.checkExpressionValueIsNotNull(kVar2, "mMeeting");
            kVar2.mo212102T().mo212214a(e, StreamSpec.Scene.GALLERY_VIEW, StreamSpec.Resolution.UNKNOWN, true);
            return;
        }
        C61303k kVar3 = this.f157347b;
        Intrinsics.checkExpressionValueIsNotNull(kVar3, "mMeeting");
        kVar3.mo212102T().mo212214a(e, StreamSpec.Scene.GALLERY_VIEW, StreamSpec.Resolution.FLOAT_WINDOW, false);
    }

    /* renamed from: c */
    public final boolean mo214366c() {
        C61303k kVar = this.f157347b;
        Intrinsics.checkExpressionValueIsNotNull(kVar, "mMeeting");
        String m = kVar.mo212092J().mo212556m();
        C61303k kVar2 = this.f157347b;
        Intrinsics.checkExpressionValueIsNotNull(kVar2, "mMeeting");
        String n = kVar2.mo212092J().mo212558n();
        Participant m2 = mo216208m();
        Intrinsics.checkExpressionValueIsNotNull(m2, "participant");
        if (!TextUtils.equals(m, m2.getDeviceId())) {
            return false;
        }
        Participant m3 = mo216208m();
        Intrinsics.checkExpressionValueIsNotNull(m3, "participant");
        if (!TextUtils.equals(n, m3.getId())) {
            return false;
        }
        C61303k kVar3 = this.f157347b;
        Intrinsics.checkExpressionValueIsNotNull(kVar3, "mMeeting");
        if (kVar3.ax().mo214344i()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo214363a(Integer num) {
        this.f155466c = num;
    }

    /* renamed from: a */
    public final void mo214364a(boolean z) {
        this.f155467d.set(z);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GalleryModel(C61303k kVar, Participant participant) {
        super(kVar, null, -1, participant);
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        Intrinsics.checkParameterIsNotNull(participant, "participant");
    }
}
