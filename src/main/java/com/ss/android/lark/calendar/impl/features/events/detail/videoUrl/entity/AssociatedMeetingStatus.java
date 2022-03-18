package com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.entity;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/videoUrl/entity/AssociatedMeetingStatus;", "", "number", "", "(Ljava/lang/String;II)V", "getNumber", "()I", "MEETING_UNKNOWN", "MEETING_CALLING", "MEETING_ON_THE_CALL", "MEETING_END", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public enum AssociatedMeetingStatus {
    MEETING_UNKNOWN(0),
    MEETING_CALLING(1),
    MEETING_ON_THE_CALL(2),
    MEETING_END(3);
    
    public static final Companion Companion = new Companion(null);
    private final int number;

    @JvmStatic
    public static final AssociatedMeetingStatus forNumber(int i) {
        return Companion.mo114035b(i);
    }

    @JvmStatic
    public static final AssociatedMeetingStatus valueOf(int i) {
        return Companion.mo114034a(i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/videoUrl/entity/AssociatedMeetingStatus$Companion;", "", "()V", "forNumber", "Lcom/ss/android/lark/calendar/impl/features/events/detail/videoUrl/entity/AssociatedMeetingStatus;", "value", "", "valueOf", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.entity.AssociatedMeetingStatus$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final AssociatedMeetingStatus mo114034a(int i) {
            return mo114035b(i);
        }

        @JvmStatic
        /* renamed from: b */
        public final AssociatedMeetingStatus mo114035b(int i) {
            if (i == 0) {
                return AssociatedMeetingStatus.MEETING_UNKNOWN;
            }
            if (i == 1) {
                return AssociatedMeetingStatus.MEETING_CALLING;
            }
            if (i == 2) {
                return AssociatedMeetingStatus.MEETING_ON_THE_CALL;
            }
            if (i != 3) {
                return AssociatedMeetingStatus.MEETING_UNKNOWN;
            }
            return AssociatedMeetingStatus.MEETING_END;
        }
    }

    public final int getNumber() {
        return this.number;
    }

    private AssociatedMeetingStatus(int i) {
        this.number = i;
    }
}
