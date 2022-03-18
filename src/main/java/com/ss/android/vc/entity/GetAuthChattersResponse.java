package com.ss.android.vc.entity;

import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\tB\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/ss/android/vc/entity/GetAuthChattersResponse;", "Ljava/io/Serializable;", "deniedReason", "", "", "Lcom/ss/android/vc/entity/GetAuthChattersResponse$DeniedReason;", "(Ljava/util/Map;)V", "getDeniedReason", "()Ljava/util/Map;", "DeniedReason", "lib_vc_entity_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class GetAuthChattersResponse implements Serializable {
    private final Map<String, DeniedReason> deniedReason;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0001\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0012B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\u0004H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, d2 = {"Lcom/ss/android/vc/entity/GetAuthChattersResponse$DeniedReason;", "", "Lcom/ss/android/vc/entity/EnumInterface;", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "getNumber", "UNKNOWN_REASON", "BE_BLOCKED", "CROSS_TENANT_DENY", "SAME_TENANT_DENY", "CRYPTO_CHAT_DENY", "BLOCKED", "NO_FRIENDSHIP", "PRIVACY_SETTING", "TARGET_PRIVACY_SETTING", "Companion", "lib_vc_entity_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public enum DeniedReason {
        UNKNOWN_REASON(0),
        BE_BLOCKED(1),
        CROSS_TENANT_DENY(2),
        SAME_TENANT_DENY(3),
        CRYPTO_CHAT_DENY(4),
        BLOCKED(5),
        NO_FRIENDSHIP(6),
        PRIVACY_SETTING(7),
        TARGET_PRIVACY_SETTING(8);
        
        public static final Companion Companion = new Companion(null);
        private final int value;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/vc/entity/GetAuthChattersResponse$DeniedReason$Companion;", "", "()V", "fromValue", "Lcom/ss/android/vc/entity/GetAuthChattersResponse$DeniedReason;", "value", "", "lib_vc_entity_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.entity.GetAuthChattersResponse$DeniedReason$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final DeniedReason mo208967a(int i) {
                switch (i) {
                    case 0:
                        return DeniedReason.UNKNOWN_REASON;
                    case 1:
                        return DeniedReason.BE_BLOCKED;
                    case 2:
                        return DeniedReason.CROSS_TENANT_DENY;
                    case 3:
                        return DeniedReason.SAME_TENANT_DENY;
                    case 4:
                        return DeniedReason.CRYPTO_CHAT_DENY;
                    case 5:
                        return DeniedReason.BLOCKED;
                    case 6:
                        return DeniedReason.NO_FRIENDSHIP;
                    case 7:
                        return DeniedReason.PRIVACY_SETTING;
                    case 8:
                        return DeniedReason.TARGET_PRIVACY_SETTING;
                    default:
                        return DeniedReason.UNKNOWN_REASON;
                }
            }
        }

        public int getNumber() {
            return this.value;
        }

        public final int getValue() {
            return this.value;
        }

        private DeniedReason(int i) {
            this.value = i;
        }
    }

    public final Map<String, DeniedReason> getDeniedReason() {
        return this.deniedReason;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Map<java.lang.String, ? extends com.ss.android.vc.entity.GetAuthChattersResponse$DeniedReason> */
    /* JADX WARN: Multi-variable type inference failed */
    public GetAuthChattersResponse(Map<String, ? extends DeniedReason> map) {
        Intrinsics.checkParameterIsNotNull(map, "deniedReason");
        this.deniedReason = map;
    }
}
