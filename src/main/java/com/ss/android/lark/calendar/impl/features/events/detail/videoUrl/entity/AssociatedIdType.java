package com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.entity;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/videoUrl/entity/AssociatedIdType;", "", "number", "", "(Ljava/lang/String;II)V", "getNumber", "()I", "UNKNOWN_ID_TYPE", "GROUP_ID", "MEETING_ID", "UNIQUE_ID", "INTERVIEW_UID", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public enum AssociatedIdType {
    UNKNOWN_ID_TYPE(0),
    GROUP_ID(1),
    MEETING_ID(2),
    UNIQUE_ID(3),
    INTERVIEW_UID(4);
    
    public static final Companion Companion = new Companion(null);
    private final int number;

    @JvmStatic
    public static final AssociatedIdType forNumber(int i) {
        return Companion.mo114020b(i);
    }

    @JvmStatic
    public static final AssociatedIdType valueOf(int i) {
        return Companion.mo114019a(i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/videoUrl/entity/AssociatedIdType$Companion;", "", "()V", "forNumber", "Lcom/ss/android/lark/calendar/impl/features/events/detail/videoUrl/entity/AssociatedIdType;", "value", "", "valueOf", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.entity.AssociatedIdType$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final AssociatedIdType mo114019a(int i) {
            return mo114020b(i);
        }

        @JvmStatic
        /* renamed from: b */
        public final AssociatedIdType mo114020b(int i) {
            if (i == 0) {
                return AssociatedIdType.UNKNOWN_ID_TYPE;
            }
            if (i == 1) {
                return AssociatedIdType.GROUP_ID;
            }
            if (i == 2) {
                return AssociatedIdType.MEETING_ID;
            }
            if (i == 3) {
                return AssociatedIdType.UNIQUE_ID;
            }
            if (i != 4) {
                return AssociatedIdType.UNKNOWN_ID_TYPE;
            }
            return AssociatedIdType.INTERVIEW_UID;
        }
    }

    public final int getNumber() {
        return this.number;
    }

    private AssociatedIdType(int i) {
        this.number = i;
    }
}
