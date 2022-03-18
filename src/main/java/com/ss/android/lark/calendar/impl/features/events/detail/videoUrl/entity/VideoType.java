package com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/videoUrl/entity/VideoType;", "", "number", "", "(Ljava/lang/String;II)V", "getNumber", "()I", "UNKNOWN_VIDEO_MEETING_TYPE", "VCHAT", "OTHER", "LARK_LIVE_HOST", "NO_VIDEO_MEETING", "GOOGLE_VIDEO_CONFERENCE", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public enum VideoType {
    UNKNOWN_VIDEO_MEETING_TYPE(0),
    VCHAT(1),
    OTHER(2),
    LARK_LIVE_HOST(3),
    NO_VIDEO_MEETING(4),
    GOOGLE_VIDEO_CONFERENCE(5);
    
    public static final Companion Companion = new Companion(null);
    private final int number;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/videoUrl/entity/VideoType$Companion;", "", "()V", "forNumber", "Lcom/ss/android/lark/calendar/impl/features/events/detail/videoUrl/entity/VideoType;", "value", "", "valueOf", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.entity.VideoType$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final VideoType mo114049a(int i) {
            if (i == 0) {
                return VideoType.UNKNOWN_VIDEO_MEETING_TYPE;
            }
            if (i == 1) {
                return VideoType.VCHAT;
            }
            if (i == 2) {
                return VideoType.OTHER;
            }
            if (i == 3) {
                return VideoType.LARK_LIVE_HOST;
            }
            if (i == 4) {
                return VideoType.NO_VIDEO_MEETING;
            }
            if (i != 5) {
                return VideoType.UNKNOWN_VIDEO_MEETING_TYPE;
            }
            return VideoType.GOOGLE_VIDEO_CONFERENCE;
        }
    }

    public final int getNumber() {
        return this.number;
    }

    private VideoType(int i) {
        this.number = i;
    }
}
