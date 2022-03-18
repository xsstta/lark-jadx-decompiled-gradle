package com.ss.lark.android.passport.biz.feature.constants;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001f\b\u0001\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001#B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"¨\u0006$"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/constants/LogoutReason;", "", "value", "", "desc", "", "(Ljava/lang/String;IILjava/lang/String;)V", "getDesc", "()Ljava/lang/String;", "getValue", "()I", GrsBaseInfo.CountryCodeSource.UNKNOWN, "INACTIVE", "RESET_PWD", "SAME_DEVICE_KICK_OFF", "REMOTE_LOGOUT", "CROSS_BOUNDARY_LOGOUT", "BLOCKED", "MIGRATE_KICK_OFF", "LEAN_MODE", "FREEZE", "RESIGN", "TENANT_DELETE", "PROACTIVE", "QM_MIGRATE_KICK_OFF", "GUEST_WITHOUT_PERMISSION", "SESSION_NOT_FOUND", "RESET_CP", "QUIT_TEAM", "UNREGISTER", "EXCEED_MAX_ALIVE_CNT", "BLOCK_BY_IDENTITY", "BLOCK_BY_TENANT", "BLOCK_BY_CREDENTIAL", "ANONYMOUS_TO_NORMAL", "Companion", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
public enum LogoutReason {
    UNKNOWN(0, "unknown"),
    INACTIVE(1, "inactive"),
    RESET_PWD(2, "reset_pwd"),
    SAME_DEVICE_KICK_OFF(3, "same_device_kick_off"),
    REMOTE_LOGOUT(4, "remote_logout"),
    CROSS_BOUNDARY_LOGOUT(5, "cross_boundary_logout"),
    BLOCKED(6, "blocked"),
    MIGRATE_KICK_OFF(7, "migrate_kick_off"),
    LEAN_MODE(8, "lean_mode"),
    FREEZE(9, "freeze"),
    RESIGN(10, "resign"),
    TENANT_DELETE(11, "tenant_delete"),
    PROACTIVE(12, "proactive"),
    QM_MIGRATE_KICK_OFF(13, "qm_migrate_kick_off"),
    GUEST_WITHOUT_PERMISSION(14, "guest_without_permission"),
    SESSION_NOT_FOUND(15, "session_not_found"),
    RESET_CP(16, "reset_cp"),
    QUIT_TEAM(17, "quit_team"),
    UNREGISTER(18, "unregister"),
    EXCEED_MAX_ALIVE_CNT(19, "exceed_max_alive_count"),
    BLOCK_BY_IDENTITY(20, "block_by_identity"),
    BLOCK_BY_TENANT(21, "block_by_tenant"),
    BLOCK_BY_CREDENTIAL(22, "block_by_credential"),
    ANONYMOUS_TO_NORMAL(23, "anonymous_to_normal");
    
    public static final Companion Companion = new Companion(null);
    public static final Lazy silenceProcessReasons$delegate = LazyKt.lazy(C64702b.INSTANCE);
    public static final Lazy values$delegate = LazyKt.lazy(C64703c.INSTANCE);
    private final String desc;
    private final int value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0010\u001a\u00020\u0011R!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048FX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/constants/LogoutReason$Companion;", "", "()V", "silenceProcessReasons", "", "Lcom/ss/lark/android/passport/biz/feature/constants/LogoutReason;", "getSilenceProcessReasons", "()Ljava/util/List;", "silenceProcessReasons$delegate", "Lkotlin/Lazy;", "values", "", "getValues", "()[Lcom/ss/lark/android/passport/biz/feature/constants/LogoutReason;", "values$delegate", "fromValue", "value", "", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.constants.LogoutReason$a */
    public static final class Companion {
        /* renamed from: b */
        private final LogoutReason[] m254173b() {
            Lazy lazy = LogoutReason.values$delegate;
            Companion aVar = LogoutReason.Companion;
            return (LogoutReason[]) lazy.getValue();
        }

        /* renamed from: a */
        public final List<LogoutReason> mo223521a() {
            Lazy lazy = LogoutReason.silenceProcessReasons$delegate;
            Companion aVar = LogoutReason.Companion;
            return (List) lazy.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final LogoutReason mo223520a(int i) {
            boolean z;
            LogoutReason[] b = m254173b();
            for (LogoutReason logoutReason : b) {
                if (logoutReason.getValue() == i) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return logoutReason;
                }
            }
            return null;
        }
    }

    public final String getDesc() {
        return this.desc;
    }

    public final int getValue() {
        return this.value;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lcom/ss/lark/android/passport/biz/feature/constants/LogoutReason;", "invoke", "()[Lcom/ss/lark/android/passport/biz/feature/constants/LogoutReason;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.constants.LogoutReason$c */
    static final class C64703c extends Lambda implements Function0<LogoutReason[]> {
        public static final C64703c INSTANCE = new C64703c();

        C64703c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final LogoutReason[] invoke() {
            return LogoutReason.values();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/lark/android/passport/biz/feature/constants/LogoutReason;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.constants.LogoutReason$b */
    static final class C64702b extends Lambda implements Function0<List<? extends LogoutReason>> {
        public static final C64702b INSTANCE = new C64702b();

        C64702b() {
            super(0);
        }

        /* Return type fixed from 'java.util.List<com.ss.lark.android.passport.biz.feature.constants.LogoutReason>' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final List<? extends LogoutReason> invoke() {
            return CollectionsKt.listOf((Object[]) new LogoutReason[]{LogoutReason.RESIGN, LogoutReason.TENANT_DELETE, LogoutReason.QUIT_TEAM, LogoutReason.UNREGISTER});
        }
    }

    private LogoutReason(int i, String str) {
        this.value = i;
        this.desc = str;
    }
}
