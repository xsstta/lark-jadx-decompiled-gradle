package com.ss.android.vc.entity.tab;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/ss/android/vc/entity/tab/VCTabUserChangeType;", "", "Lcom/ss/android/vc/entity/EnumInterface;", "value", "", "(Ljava/lang/String;II)V", "getNumber", "MISSED_CALL", "DETAIL_PAGE", "STATISTICS", "Companion", "lib_vc_entity_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public enum VCTabUserChangeType {
    MISSED_CALL(0),
    DETAIL_PAGE(1),
    STATISTICS(2);
    
    public static final Companion Companion = new Companion(null);
    private final int value;

    @JvmStatic
    public static final VCTabUserChangeType valueOf(int i) {
        return Companion.mo210385a(i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\b"}, d2 = {"Lcom/ss/android/vc/entity/tab/VCTabUserChangeType$Companion;", "", "()V", "forNumber", "Lcom/ss/android/vc/entity/tab/VCTabUserChangeType;", "value", "", "valueOf", "lib_vc_entity_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.entity.tab.VCTabUserChangeType$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final VCTabUserChangeType mo210385a(int i) {
            return mo210386b(i);
        }

        /* renamed from: b */
        public final VCTabUserChangeType mo210386b(int i) {
            if (i == 0) {
                return VCTabUserChangeType.MISSED_CALL;
            }
            if (i == 1) {
                return VCTabUserChangeType.DETAIL_PAGE;
            }
            if (i != 2) {
                return null;
            }
            return VCTabUserChangeType.STATISTICS;
        }
    }

    public int getNumber() {
        return this.value;
    }

    private VCTabUserChangeType(int i) {
        this.value = i;
    }
}
