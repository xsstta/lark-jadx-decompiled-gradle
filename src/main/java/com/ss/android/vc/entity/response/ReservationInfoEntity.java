package com.ss.android.vc.entity.response;

import com.ss.android.lark.statistics.chat.ChatTypeStateKeeper;
import com.ss.android.vc.entity.ParticipantType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0003\u001d\u001e\u001fB\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0006\"\u0004\b\n\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\u0004¨\u0006 "}, d2 = {"Lcom/ss/android/vc/entity/response/ReservationInfoEntity;", "", "id", "", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "setId", "meetingNo", "getMeetingNo", "setMeetingNo", "meetingPreConfig", "Lcom/ss/android/vc/entity/response/ReservationInfoEntity$MeetingPreConfig;", "getMeetingPreConfig", "()Lcom/ss/android/vc/entity/response/ReservationInfoEntity$MeetingPreConfig;", "setMeetingPreConfig", "(Lcom/ss/android/vc/entity/response/ReservationInfoEntity$MeetingPreConfig;)V", "reserver", "getReserver", "setReserver", "reserverType", "Lcom/ss/android/vc/entity/response/ReservationInfoEntity$ReserverType;", "getReserverType", "()Lcom/ss/android/vc/entity/response/ReservationInfoEntity$ReserverType;", "setReserverType", "(Lcom/ss/android/vc/entity/response/ReservationInfoEntity$ReserverType;)V", "url", "getUrl", "setUrl", "MeetingPreConfig", "ReserverType", "User", "lib_vc_entity_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class ReservationInfoEntity {

    /* renamed from: a */
    private String f152614a;

    /* renamed from: b */
    private ReserverType f152615b;

    /* renamed from: c */
    private String f152616c;

    /* renamed from: d */
    private String f152617d;

    /* renamed from: e */
    private MeetingPreConfig f152618e;

    /* renamed from: f */
    private String f152619f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/ss/android/vc/entity/response/ReservationInfoEntity$ReserverType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "RESERVER_TYPE_UNKNOWN", "RESERVER_TYPE_LARK_USER", "RESERVER_TYPE_APP", "Companion", "lib_vc_entity_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public enum ReserverType {
        RESERVER_TYPE_UNKNOWN(0),
        RESERVER_TYPE_LARK_USER(1),
        RESERVER_TYPE_APP(2);
        
        public static final Companion Companion = new Companion(null);
        private final int value;

        @JvmStatic
        public static final ReserverType valueOf(int i) {
            return Companion.mo210089a(i);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\b"}, d2 = {"Lcom/ss/android/vc/entity/response/ReservationInfoEntity$ReserverType$Companion;", "", "()V", "forNumber", "Lcom/ss/android/vc/entity/response/ReservationInfoEntity$ReserverType;", "value", "", "valueOf", "lib_vc_entity_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.entity.response.ReservationInfoEntity$ReserverType$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            /* renamed from: a */
            public final ReserverType mo210089a(int i) {
                return mo210090b(i);
            }

            /* renamed from: b */
            public final ReserverType mo210090b(int i) {
                if (i == 0) {
                    return ReserverType.RESERVER_TYPE_UNKNOWN;
                }
                if (i == 1) {
                    return ReserverType.RESERVER_TYPE_LARK_USER;
                }
                if (i != 2) {
                    return ReserverType.RESERVER_TYPE_UNKNOWN;
                }
                return ReserverType.RESERVER_TYPE_APP;
            }
        }

        public final int getValue() {
            return this.value;
        }

        private ReserverType(int i) {
            this.value = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0015\u0016B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/ss/android/vc/entity/response/ReservationInfoEntity$User;", "", "()V", "pstnSipUserInfo", "Lcom/ss/android/vc/entity/response/ReservationInfoEntity$User$PstnSipUserInfo;", "getPstnSipUserInfo", "()Lcom/ss/android/vc/entity/response/ReservationInfoEntity$User$PstnSipUserInfo;", "setPstnSipUserInfo", "(Lcom/ss/android/vc/entity/response/ReservationInfoEntity$User$PstnSipUserInfo;)V", "userId", "", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "userType", "Lcom/ss/android/vc/entity/ParticipantType;", "getUserType", "()Lcom/ss/android/vc/entity/ParticipantType;", "setUserType", "(Lcom/ss/android/vc/entity/ParticipantType;)V", "Avater", "PstnSipUserInfo", "lib_vc_entity_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.entity.response.ReservationInfoEntity$b */
    public static final class User {

        /* renamed from: a */
        private ParticipantType f152622a;

        /* renamed from: b */
        private String f152623b;

        /* renamed from: c */
        private PstnSipUserInfo f152624c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/ss/android/vc/entity/response/ReservationInfoEntity$User$Avater;", "", "()V", "fsUnit", "", "getFsUnit", "()Ljava/lang/String;", "setFsUnit", "(Ljava/lang/String;)V", "key", "getKey", "setKey", "lib_vc_entity_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.entity.response.ReservationInfoEntity$b$a */
        public static final class Avater {

            /* renamed from: a */
            private String f152625a;

            /* renamed from: b */
            private String f152626b;

            /* renamed from: a */
            public final String mo210100a() {
                return this.f152625a;
            }

            /* renamed from: b */
            public final void mo210102b(String str) {
                this.f152626b = str;
            }

            /* renamed from: a */
            public final void mo210101a(String str) {
                this.f152625a = str;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/ss/android/vc/entity/response/ReservationInfoEntity$User$PstnSipUserInfo;", "", "()V", "avater", "Lcom/ss/android/vc/entity/response/ReservationInfoEntity$User$Avater;", "getAvater", "()Lcom/ss/android/vc/entity/response/ReservationInfoEntity$User$Avater;", "setAvater", "(Lcom/ss/android/vc/entity/response/ReservationInfoEntity$User$Avater;)V", "mianAddress", "", "getMianAddress", "()Ljava/lang/String;", "setMianAddress", "(Ljava/lang/String;)V", "nickName", "getNickName", "setNickName", "subAddress", "getSubAddress", "setSubAddress", "lib_vc_entity_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.entity.response.ReservationInfoEntity$b$b */
        public static final class PstnSipUserInfo {

            /* renamed from: a */
            private String f152627a;

            /* renamed from: b */
            private String f152628b;

            /* renamed from: c */
            private String f152629c;

            /* renamed from: d */
            private Avater f152630d;

            /* renamed from: a */
            public final String mo210103a() {
                return this.f152627a;
            }

            /* renamed from: b */
            public final Avater mo210106b() {
                return this.f152630d;
            }

            /* renamed from: c */
            public final void mo210108c(String str) {
                this.f152629c = str;
            }

            /* renamed from: a */
            public final void mo210104a(Avater aVar) {
                this.f152630d = aVar;
            }

            /* renamed from: b */
            public final void mo210107b(String str) {
                this.f152628b = str;
            }

            /* renamed from: a */
            public final void mo210105a(String str) {
                this.f152627a = str;
            }
        }

        /* renamed from: a */
        public final ParticipantType mo210094a() {
            return this.f152622a;
        }

        /* renamed from: b */
        public final String mo210098b() {
            return this.f152623b;
        }

        /* renamed from: c */
        public final PstnSipUserInfo mo210099c() {
            return this.f152624c;
        }

        /* renamed from: a */
        public final void mo210095a(ParticipantType participantType) {
            this.f152622a = participantType;
        }

        /* renamed from: a */
        public final void mo210096a(PstnSipUserInfo bVar) {
            this.f152624c = bVar;
        }

        /* renamed from: a */
        public final void mo210097a(String str) {
            this.f152623b = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ss/android/vc/entity/response/ReservationInfoEntity$MeetingPreConfig;", "", "()V", "autoInvitedUsers", "", "Lcom/ss/android/vc/entity/response/ReservationInfoEntity$User;", "getAutoInvitedUsers", "()Ljava/util/List;", "setAutoInvitedUsers", "(Ljava/util/List;)V", ChatTypeStateKeeper.f135670e, "", "getTopic", "()Ljava/lang/String;", "setTopic", "(Ljava/lang/String;)V", "lib_vc_entity_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.entity.response.ReservationInfoEntity$a */
    public static final class MeetingPreConfig {

        /* renamed from: a */
        private String f152620a;

        /* renamed from: b */
        private List<User> f152621b;

        /* renamed from: a */
        public final List<User> mo210091a() {
            return this.f152621b;
        }

        /* renamed from: a */
        public final void mo210092a(String str) {
            this.f152620a = str;
        }

        /* renamed from: a */
        public final void mo210093a(List<User> list) {
            this.f152621b = list;
        }
    }

    /* renamed from: a */
    public final MeetingPreConfig mo210081a() {
        return this.f152618e;
    }

    /* renamed from: b */
    public final String mo210085b() {
        return this.f152619f;
    }

    /* renamed from: c */
    public final void mo210087c(String str) {
        this.f152617d = str;
    }

    public ReservationInfoEntity(String str) {
        this.f152619f = str;
    }

    /* renamed from: a */
    public final void mo210082a(ReserverType reserverType) {
        this.f152615b = reserverType;
    }

    /* renamed from: b */
    public final void mo210086b(String str) {
        this.f152616c = str;
    }

    /* renamed from: a */
    public final void mo210083a(MeetingPreConfig aVar) {
        this.f152618e = aVar;
    }

    /* renamed from: a */
    public final void mo210084a(String str) {
        this.f152614a = str;
    }
}
