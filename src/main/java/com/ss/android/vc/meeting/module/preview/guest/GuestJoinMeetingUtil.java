package com.ss.android.vc.meeting.module.preview.guest;

import android.content.Intent;
import androidx.p034e.p035a.C0978a;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60788y;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.MeetingConfig;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.response.C60971e;
import com.ss.android.vc.entity.response.JoinMeetingEntity;
import com.ss.android.vc.meeting.framework.manager.p3106a.C61273c;
import com.ss.android.vc.meeting.module.guest.MiddlePageActivity;
import com.ss.android.vc.meeting.module.lobby.AbsJoinLobbyIntercept;
import com.ss.android.vc.meeting.module.lobby.pb.C62149b;
import com.ss.android.vc.meeting.module.preview.guest.MeetingPreviewGuestModel;
import com.ss.android.vc.meeting.utils.C63492g;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import com.ss.android.vc.meeting.utils.TimeConsumeUtils;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.C63603f;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.net.request.VcBizTask;
import com.ss.android.vc.service.VideoChatManager;
import com.ss.android.vc.statistics.event.C63736af;
import com.ss.android.vc.statistics.event.C63737ag;
import com.ss.android.vc.statistics.event.C63739ai;
import com.ss.android.vc.statistics.event.al;
import com.ss.android.vc.statistics.p3180a.C63693e;
import com.ss.android.vc.trace.VCLauncherStatistics;
import com.ss.android.vcxp.annotation.XClass;
import com.ss.android.vcxp.annotation.XMethod;
import com.ss.android.vcxp.annotation.XProcess;
import io.reactivex.p3457e.C68296b;

@XClass(isStatic = true, runOnProcess = XProcess.VC)
public class GuestJoinMeetingUtil {

    /* renamed from: a */
    public static int f157863a = 0;

    /* renamed from: b */
    public static boolean f157864b = true;

    /* renamed from: c */
    public static boolean f157865c = true;

    /* renamed from: d */
    public static boolean f157866d = true;

    /* renamed from: e */
    public static boolean f157867e = true;

    /* renamed from: f */
    public static String f157868f = null;

    /* renamed from: g */
    public static String f157869g = null;

    /* renamed from: h */
    public static String f157870h = "";

    public @interface GuestType {
    }

    public @interface LoginType {
    }

    /* renamed from: c */
    public static void m245481c() {
        f157863a = 0;
    }

    /* renamed from: b */
    public static boolean m245480b() {
        if (f157863a == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m245479a() {
        return VideoChatModuleDependency.getAppEnvDependency().mo196333c();
    }

    /* renamed from: d */
    public static boolean m245482d() {
        if (f157863a == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static void m245483e() {
        m245486h();
        if (m245480b()) {
            MiddlePageActivity.m241882b();
        }
        m245485g();
    }

    /* renamed from: f */
    public static Chatter m245484f() {
        String b = VideoChatModuleDependency.getLoginDependency().mo196420b();
        Chatter chatter = new Chatter();
        chatter.setId(b);
        chatter.setName(f157870h);
        chatter.setAvatarKey("");
        return chatter;
    }

    /* renamed from: g */
    private static void m245485g() {
        C0978a.m4782a(ar.m236694a()).mo4992a(new Intent("action.broadcast.dismiss.guest.preview"));
    }

    /* renamed from: h */
    private static void m245486h() {
        C0978a.m4782a(ar.m236694a()).mo4992a(new Intent("action.broadcast.guest.end.loading"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.meeting.module.preview.guest.GuestJoinMeetingUtil$4 */
    public static /* synthetic */ class C627324 {

        /* renamed from: a */
        static final /* synthetic */ int[] f157873a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.ss.android.vc.entity.response.JoinMeetingEntity$Type[] r0 = com.ss.android.vc.entity.response.JoinMeetingEntity.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.vc.meeting.module.preview.guest.GuestJoinMeetingUtil.C627324.f157873a = r0
                com.ss.android.vc.entity.response.JoinMeetingEntity$Type r1 = com.ss.android.vc.entity.response.JoinMeetingEntity.Type.TENANT_IN_BLACKLIST     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.vc.meeting.module.preview.guest.GuestJoinMeetingUtil.C627324.f157873a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.vc.entity.response.JoinMeetingEntity$Type r1 = com.ss.android.vc.entity.response.JoinMeetingEntity.Type.PARTICIPANT_LIMIT_EXCEED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.vc.meeting.module.preview.guest.GuestJoinMeetingUtil.C627324.f157873a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.vc.entity.response.JoinMeetingEntity$Type r1 = com.ss.android.vc.entity.response.JoinMeetingEntity.Type.MEETING_NUMBER_INVALID     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.vc.meeting.module.preview.guest.GuestJoinMeetingUtil.C627324.f157873a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.vc.entity.response.JoinMeetingEntity$Type r1 = com.ss.android.vc.entity.response.JoinMeetingEntity.Type.MEETING_LOCKED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.vc.meeting.module.preview.guest.GuestJoinMeetingUtil.C627324.f157873a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.android.vc.entity.response.JoinMeetingEntity$Type r1 = com.ss.android.vc.entity.response.JoinMeetingEntity.Type.SUCCESS     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.preview.guest.GuestJoinMeetingUtil.C627324.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static void m245476a(String str) {
        VCLauncherStatistics.m250426d();
        m245486h();
        C63737ag.m250008c("unknown", str, f157868f);
        if (m245480b()) {
            VideoChatModuleDependency.getLoginDependency().logoutWithoutLogin(ar.m236694a(), false, "join meeting fail", new MeetingPreviewGuestModel.ILogoutCallback() {
                /* class com.ss.android.vc.meeting.module.preview.guest.GuestJoinMeetingUtil.C627302 */

                @Override // com.ss.android.vc.meeting.module.preview.guest.MeetingPreviewGuestModel.ILogoutCallback
                @XMethod
                public void onResult(boolean z) {
                    C60700b.m235851b("GuestJoinMeetingUtil", "[logoutWithoutLogin]", "onResult: success = " + z);
                }
            });
        }
    }

    /* renamed from: a */
    public static void m245473a(VideoChat videoChat) {
        Participant c;
        C68296b<Boolean> a = TimeConsumeUtils.m248927a("GuestJoinMeetingUtil:goIntoMeetingByVideoChat");
        if (videoChat == null || (c = ParticipantUtil.m248731c(videoChat.getParticipants())) == null || c.getParticipantSettings() == null) {
            C63492g.m248822a(false, (Boolean) true, 1000L);
        } else {
            C63492g.m248822a(false, Boolean.valueOf(c.getParticipantSettings().isPlayMeetingTone()), 1000L);
        }
        MeetingConfig meetingConfig = new MeetingConfig();
        meetingConfig.isAudioOn = f157864b;
        meetingConfig.isCameraOn = f157865c;
        meetingConfig.isSpeakerOn = f157866d;
        meetingConfig.isFrontCamera = f157867e;
        videoChat.setMeetingConfig(meetingConfig);
        VideoChatManager.m249444a().mo220115a(!meetingConfig.isCameraOn);
        VideoChatManager.m249444a().mo220118b(!meetingConfig.isAudioOn);
        VideoChatManager.m249444a().mo220113a(Boolean.valueOf(!meetingConfig.isSpeakerOn));
        VideoChatManager.m249444a().mo220117b(Boolean.valueOf(meetingConfig.isFrontCamera));
        VideoChatManager.m249444a().mo220121c(meetingConfig.isPlaybackDigitalMute);
        VideoChatManager.m249444a().mo220126e((Boolean) true);
        VideoChatManager.m249444a().mo220105a(videoChat);
        C63739ai.m250012a(videoChat, f157868f);
        TimeConsumeUtils.m248928a(a);
    }

    /* renamed from: a */
    public static void m245477a(String str, AbstractC63598b<C60971e> bVar) {
        VcBizSender.m249260d(str).mo219889a(bVar);
    }

    /* renamed from: a */
    public static void m245474a(VideoChat videoChat, C62149b bVar) {
        VideoChatManager.m249444a().mo220115a(!f157865c);
        VideoChatManager.m249444a().mo220118b(!f157864b);
        VideoChatManager.m249444a().mo220113a(Boolean.valueOf(!f157866d));
        VideoChatManager.m249444a().mo220117b(Boolean.valueOf(f157867e));
        VideoChatManager.m249444a().mo220121c(false);
        VideoChatManager.m249444a().mo220126e((Boolean) true);
        C61273c.m238400a(videoChat, bVar);
    }

    /* renamed from: a */
    public static void m245475a(JoinMeetingEntity joinMeetingEntity, String str) {
        ar.m236694a();
        int i = C627324.f157873a[joinMeetingEntity.f152600a.ordinal()];
        if (i == 1) {
            C60738ac.m236023a((int) R.string.View_G_BlacklistCallsMeetingsUnavailable);
            al.m250020a("join_room", str, "black_list");
        } else if (i == 2) {
            C60738ac.m236023a((int) R.string.View_M_CapacityReachedAndroid);
            al.m250020a("join_room", str, "meeting_user_full");
        } else if (i == 3) {
            C60738ac.m236023a((int) R.string.View_M_InvalidMeetingId);
            al.m250020a("join_room", str, "meeting_id_overdue");
        } else if (i == 4) {
            C60738ac.m236023a((int) R.string.View_M_MeetingLocked);
            al.m250020a("join_room", str, "meeting_locked");
        } else if (i != 5) {
            C60738ac.m236023a((int) R.string.View_M_FailedToJoinMeeting);
        }
    }

    @XMethod
    public static void joinMeetingByNumber(boolean z, String str, final String str2) {
        VCLauncherStatistics.m250423a(VCLauncherStatistics.SCENE.NUMBER_JOIN);
        C63693e.m249686c();
        m245478a(z, str, str2, !f157864b, !f157865c, f157869g, f157868f, new AbsJoinLobbyIntercept<JoinMeetingEntity>() {
            /* class com.ss.android.vc.meeting.module.preview.guest.GuestJoinMeetingUtil.C627291 */

            /* renamed from: a */
            public void onLobbySuccess(JoinMeetingEntity joinMeetingEntity) {
                C60700b.m235851b("GuestJoinMeetingUtil", "[guestJoinMeetingById]", "onLobbySuccess: ");
                GuestJoinMeetingUtil.m245483e();
                GuestJoinMeetingUtil.m245474a(joinMeetingEntity.f152601b, joinMeetingEntity.f152603d);
                C63693e.m249689e();
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235851b("GuestJoinMeetingUtil", "[guestJoinMeetingById4]", "onError: ,error = " + eVar);
                GuestJoinMeetingUtil.m245476a(str2);
                C62743d.m245535b(eVar);
                C63693e.m249689e();
            }

            /* renamed from: b */
            public void onNoLobbySuccess(JoinMeetingEntity joinMeetingEntity) {
                if (joinMeetingEntity.f152600a == JoinMeetingEntity.Type.SUCCESS) {
                    C60700b.m235851b("GuestJoinMeetingUtil", "[guestJoinMeetingById2]", "onNoLobbySuccess: ,type = success");
                    if (joinMeetingEntity.f152601b != null) {
                        GuestJoinMeetingUtil.m245483e();
                        C63693e.m249688d();
                        VCLauncherStatistics.m250424b();
                        VideoChat videoChat = joinMeetingEntity.f152601b;
                        C63603f.m249427a(joinMeetingEntity);
                        C60700b.m235841a(videoChat, "Entry", "StateEngine", "joinGuest", "GuestJoinMeetingUtil", "sendJoinMeetingRequest sendVideoChatToStateMachine");
                        GuestJoinMeetingUtil.m245473a(videoChat);
                        return;
                    }
                    GuestJoinMeetingUtil.m245476a(str2);
                    C60738ac.m236023a((int) R.string.View_M_FailedToJoinMeeting);
                    C63693e.m249689e();
                    return;
                }
                C60700b.m235851b("GuestJoinMeetingUtil", " [guestJoinMeetingById3]", "onNoLobbySuccess but fail: ,type = " + joinMeetingEntity.f152600a);
                GuestJoinMeetingUtil.m245476a(str2);
                GuestJoinMeetingUtil.m245475a(joinMeetingEntity, GuestJoinMeetingUtil.f157868f);
                C63693e.m249689e();
            }
        });
    }

    /* renamed from: a */
    private static void m245478a(boolean z, String str, String str2, boolean z2, boolean z3, String str3, String str4, final AbstractC63598b<JoinMeetingEntity> bVar) {
        VcBizTask<JoinMeetingEntity> a = VcBizSender.m249206a(z, str, str2, z2, z3, C60788y.m236247a(ar.m236694a()), C60788y.m236250b(ar.m236694a()));
        a.mo219889a(new AbstractC63598b<JoinMeetingEntity>() {
            /* class com.ss.android.vc.meeting.module.preview.guest.GuestJoinMeetingUtil.C627313 */

            /* renamed from: a */
            public void onSuccess(JoinMeetingEntity joinMeetingEntity) {
                bVar.onSuccess(joinMeetingEntity);
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                bVar.onError(eVar);
            }
        });
        C63736af.m250004d(str3, str2, str4, a.mo219895c());
    }
}
