package com.ss.android.lark.calendar.impl.features.calendarview.diskcache;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/diskcache/DiskDataInfo;", "Ljava/io/Serializable;", "tenantId", "", "userId", "timeZone", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTenantId", "()Ljava/lang/String;", "getTimeZone", "getUserId", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class DiskDataInfo implements Serializable {
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 1;
    private final String tenantId;
    private final String timeZone;
    private final String userId;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/diskcache/DiskDataInfo$Companion;", "", "()V", "serialVersionUID", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.diskcache.DiskDataInfo$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final String getTenantId() {
        return this.tenantId;
    }

    public final String getTimeZone() {
        return this.timeZone;
    }

    public final String getUserId() {
        return this.userId;
    }

    public DiskDataInfo(String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "tenantId");
        Intrinsics.checkParameterIsNotNull(str2, "userId");
        Intrinsics.checkParameterIsNotNull(str3, "timeZone");
        this.tenantId = str;
        this.userId = str2;
        this.timeZone = str3;
    }
}
