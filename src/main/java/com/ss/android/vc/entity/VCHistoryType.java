package com.ss.android.vc.entity;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/ss/android/vc/entity/VCHistoryType;", "", "(Ljava/lang/String;I)V", "ALL", "CALL", "MEETING", "EVENT", "Companion", "lib_vc_entity_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public enum VCHistoryType {
    ALL,
    CALL,
    MEETING,
    EVENT;
    
    public static final Companion Companion = new Companion(null);

    @JvmStatic
    public static final VCHistoryType valueOf(int i) {
        return Companion.mo209362a(i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/android/vc/entity/VCHistoryType$Companion;", "", "()V", "valueOf", "Lcom/ss/android/vc/entity/VCHistoryType;", "value", "", "lib_vc_entity_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.entity.VCHistoryType$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final VCHistoryType mo209362a(int i) {
            if (i == 1) {
                return VCHistoryType.CALL;
            }
            if (i == 2) {
                return VCHistoryType.MEETING;
            }
            if (i != 3) {
                return VCHistoryType.ALL;
            }
            return VCHistoryType.EVENT;
        }
    }
}
