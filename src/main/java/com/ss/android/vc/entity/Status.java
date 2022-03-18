package com.ss.android.vc.entity;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/ss/android/vc/entity/Status;", "", "(Ljava/lang/String;I)V", GrsBaseInfo.CountryCodeSource.UNKNOWN, "CALLING", "ON_THE_CALL", "RINGING", "IDLE", "Companion", "lib_vc_entity_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public enum Status {
    UNKNOWN,
    CALLING,
    ON_THE_CALL,
    RINGING,
    IDLE;
    
    public static final Companion Companion = new Companion(null);

    @JvmStatic
    public static final Status valueOf(int i) {
        return Companion.mo209309a(i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/android/vc/entity/Status$Companion;", "", "()V", "valueOf", "Lcom/ss/android/vc/entity/Status;", "value", "", "lib_vc_entity_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.entity.Status$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final Status mo209309a(int i) {
            if (i == 1) {
                return Status.CALLING;
            }
            if (i == 2) {
                return Status.ON_THE_CALL;
            }
            if (i == 3) {
                return Status.RINGING;
            }
            if (i != 4) {
                return Status.UNKNOWN;
            }
            return Status.IDLE;
        }
    }
}
