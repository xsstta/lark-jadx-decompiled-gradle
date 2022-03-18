package com.ss.android.vc.meeting.utils;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60788y;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.framework.meeting.ByteRtc;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.VCBreakoutRoomInfo;
import com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl;
import com.ss.android.vc.net.service.VcBizService;
import com.ss.android.vc.service.C63634c;
import com.ss.android.vc.statistics.p3182c.C63726b;
import java.util.concurrent.ScheduledFuture;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001dB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J.\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/vc/meeting/utils/CheckMuteStateConflictUtil;", "", "()V", "DELAY_TIME_MS", "", "TAG", "", "mCheckAudioCausedByRtc", "Ljava/util/concurrent/ScheduledFuture;", "mCheckAudioCausedByUI", "mCheckVideoCausedByRtc", "mCheckVideoCausedByUI", "checkAudioConflictCausedByRtc", "", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "checkAudioConflictCausedByUI", "checkVideoConflictCausedByRtc", "checkVideoConflictCausedByUI", "mute", "audioOrVideo", "", "sendConflictEvent", "videoChat", "Lcom/ss/android/vc/entity/VideoChat;", "fromRtcOrUI", "isUiMute", "isRtcMute", "deviceId", "CheckRunnable", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.utils.b */
public final class CheckMuteStateConflictUtil {

    /* renamed from: a */
    public static final CheckMuteStateConflictUtil f160383a = new CheckMuteStateConflictUtil();

    /* renamed from: b */
    private static ScheduledFuture<?> f160384b;

    /* renamed from: c */
    private static ScheduledFuture<?> f160385c;

    /* renamed from: d */
    private static ScheduledFuture<?> f160386d;

    /* renamed from: e */
    private static ScheduledFuture<?> f160387e;

    private CheckMuteStateConflictUtil() {
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ss/android/vc/meeting/utils/CheckMuteStateConflictUtil$CheckRunnable;", "Ljava/lang/Runnable;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "audioOrVideo", "", "fromRtcOrUI", "(Lcom/ss/android/vc/meeting/framework/meeting/Meeting;ZZ)V", "getAudioOrVideo", "()Z", "getFromRtcOrUI", "getMeeting", "()Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "run", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.utils.b$a */
    public static final class CheckRunnable implements Runnable {

        /* renamed from: a */
        private final C61303k f160388a;

        /* renamed from: b */
        private final boolean f160389b;

        /* renamed from: c */
        private final boolean f160390c;

        public void run() {
            boolean z;
            boolean z2;
            String str;
            String str2;
            if (this.f160389b) {
                z = this.f160388a.mo212092J().mo212505B();
            } else {
                z = this.f160388a.mo212092J().mo212504A();
            }
            if (this.f160389b) {
                ByteRtc y = this.f160388a.mo212165y();
                Intrinsics.checkExpressionValueIsNotNull(y, "meeting.byteRtc");
                z2 = y.mo212024g();
            } else {
                ByteRtc y2 = this.f160388a.mo212165y();
                Intrinsics.checkExpressionValueIsNotNull(y2, "meeting.byteRtc");
                z2 = y2.mo212025h();
            }
            if (z) {
                if (!z2) {
                    CheckMuteStateConflictUtil bVar = CheckMuteStateConflictUtil.f160383a;
                    VideoChat e = this.f160388a.mo212056e();
                    Intrinsics.checkExpressionValueIsNotNull(e, "meeting.videoChat");
                    bVar.mo219624a(e, this.f160390c, this.f160389b, z, z2);
                    CheckMuteStateConflictUtil.f160383a.mo219626a(this.f160388a, this.f160389b);
                }
            } else if (z2) {
                CheckMuteStateConflictUtil bVar2 = CheckMuteStateConflictUtil.f160383a;
                VideoChat e2 = this.f160388a.mo212056e();
                Intrinsics.checkExpressionValueIsNotNull(e2, "meeting.videoChat");
                bVar2.mo219624a(e2, this.f160390c, this.f160389b, z, z2);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("run. ");
            if (this.f160389b) {
                str = "audio";
            } else {
                str = "video";
            }
            sb.append(str);
            sb.append(", from ");
            if (this.f160390c) {
                str2 = "rtc";
            } else {
                str2 = "ui";
            }
            sb.append(str2);
            sb.append(", isUIMute:");
            sb.append(z);
            sb.append(", isRtcMute:");
            sb.append(z2);
            C60700b.m235843a("MuteStateConflictUtil", "checkRunnable", sb.toString());
        }

        public CheckRunnable(C61303k kVar, boolean z, boolean z2) {
            Intrinsics.checkParameterIsNotNull(kVar, "meeting");
            this.f160388a = kVar;
            this.f160389b = z;
            this.f160390c = z2;
        }
    }

    /* renamed from: a */
    public final void mo219625a(C61303k kVar) {
        ScheduledFuture<?> scheduledFuture;
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        ScheduledFuture<?> scheduledFuture2 = f160384b;
        if (!(scheduledFuture2 == null || scheduledFuture2 == null || scheduledFuture2.isDone() || (scheduledFuture = f160384b) == null)) {
            scheduledFuture.cancel(false);
        }
        f160384b = C60735ab.m236008b(new CheckRunnable(kVar, true, true), 1000);
    }

    /* renamed from: b */
    public final void mo219627b(C61303k kVar) {
        ScheduledFuture<?> scheduledFuture;
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        ScheduledFuture<?> scheduledFuture2 = f160385c;
        if (!(scheduledFuture2 == null || scheduledFuture2 == null || scheduledFuture2.isDone() || (scheduledFuture = f160385c) == null)) {
            scheduledFuture.cancel(false);
        }
        f160385c = C60735ab.m236008b(new CheckRunnable(kVar, false, true), 1000);
    }

    /* renamed from: c */
    public final void mo219628c(C61303k kVar) {
        ScheduledFuture<?> scheduledFuture;
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        ScheduledFuture<?> scheduledFuture2 = f160386d;
        if (!(scheduledFuture2 == null || scheduledFuture2 == null || scheduledFuture2.isDone() || (scheduledFuture = f160386d) == null)) {
            scheduledFuture.cancel(false);
        }
        f160386d = C60735ab.m236008b(new CheckRunnable(kVar, true, false), 1000);
    }

    /* renamed from: d */
    public final void mo219629d(C61303k kVar) {
        ScheduledFuture<?> scheduledFuture;
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        ScheduledFuture<?> scheduledFuture2 = f160387e;
        if (!(scheduledFuture2 == null || scheduledFuture2 == null || scheduledFuture2.isDone() || (scheduledFuture = f160387e) == null)) {
            scheduledFuture.cancel(false);
        }
        f160387e = C60735ab.m236008b(new CheckRunnable(kVar, false, false), 1000);
    }

    /* renamed from: a */
    public final void mo219623a(VideoChat videoChat, String str) {
        Intrinsics.checkParameterIsNotNull(videoChat, "videoChat");
        Intrinsics.checkParameterIsNotNull(str, "deviceId");
        C60700b.m235851b("MuteStateConflictUtil", "sendConflictEvent3", "conflict. deviceId:" + str);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("from_source", "active_speaker");
            jSONObject.put("target_device_id", str);
            C63726b.m249918b("vc_mute_status_conflict_dev", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("MuteStateConflictUtil", "sendConflictEvent4", e.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo219626a(C61303k kVar, boolean z) {
        String str;
        if (!C63634c.m249496b("byteview.meeting.android.mute_when_diff")) {
            C60700b.m235851b("MuteStateConflictUtil", "mute1", "don't have FG");
        } else if (z) {
            kVar.mo212165y().mo212016c(true);
            boolean b = C60788y.m236250b(ar.m236694a());
            AbsBreakoutRoomControl al = kVar.al();
            Intrinsics.checkExpressionValueIsNotNull(al, "meeting.breakoutRoomControl");
            if (al.mo213182i()) {
                AbsBreakoutRoomControl al2 = kVar.al();
                Intrinsics.checkExpressionValueIsNotNull(al2, "meeting.breakoutRoomControl");
                if (al2.mo213184k() != null) {
                    AbsBreakoutRoomControl al3 = kVar.al();
                    Intrinsics.checkExpressionValueIsNotNull(al3, "meeting.breakoutRoomControl");
                    VCBreakoutRoomInfo k = al3.mo213184k();
                    Intrinsics.checkExpressionValueIsNotNull(k, "meeting.breakoutRoomControl.breakoutRoomInfo");
                    str = k.getBreakoutRoomId();
                    Intrinsics.checkExpressionValueIsNotNull(str, "meeting.breakoutRoomCont…utRoomInfo.breakoutRoomId");
                    C60700b.m235851b("MuteStateConflictUtil", "mute2", "meetingId:" + kVar + ".meetingId, roomId:" + str);
                    VcBizService.muteAudio(kVar.mo212055d(), str, true, false, b);
                }
            }
            str = "";
            C60700b.m235851b("MuteStateConflictUtil", "mute2", "meetingId:" + kVar + ".meetingId, roomId:" + str);
            VcBizService.muteAudio(kVar.mo212055d(), str, true, false, b);
        } else {
            kVar.mo212165y().mo212018d(true);
            boolean a = C60788y.m236247a(ar.m236694a());
            C60700b.m235851b("MuteStateConflictUtil", "mute3", "meetingId:" + kVar + ".meetingId");
            VcBizService.muteCamera(kVar.mo212055d(), true, false, a);
        }
    }

    /* renamed from: a */
    public final void mo219624a(VideoChat videoChat, boolean z, boolean z2, boolean z3, boolean z4) {
        String str;
        String str2;
        String str3;
        int i;
        Intrinsics.checkParameterIsNotNull(videoChat, "videoChat");
        StringBuilder sb = new StringBuilder();
        sb.append("conflict. ");
        if (z2) {
            str = "audio";
        } else {
            str = "video";
        }
        sb.append(str);
        sb.append(", from ");
        if (z) {
            str2 = "rtc";
        } else {
            str2 = "ui";
        }
        sb.append(str2);
        sb.append(", isUiMute:");
        sb.append(z3);
        sb.append(", isRtcMute:");
        sb.append(z4);
        C60700b.m235851b("MuteStateConflictUtil", "[sendConflictEvent1]", sb.toString());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("from_source", "user_action");
            if (z2) {
                str3 = "mic";
            } else {
                str3 = "cam";
            }
            jSONObject.put("media_type", str3);
            int i2 = 1;
            if (z3) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("local_ui", i);
            if (!z4) {
                i2 = 0;
            }
            jSONObject.put("local_rtc", i2);
            C63726b.m249918b("vc_mute_status_conflict_dev", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("MuteStateConflictUtil", "[sendConflictEvent2]", e.getMessage());
        }
    }
}
