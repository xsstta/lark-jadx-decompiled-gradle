package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/EventInviteOperator;", "Ljava/io/Serializable;", "userInviteOperatorId", "", "userInviteOperatorLocalizedName", "(Ljava/lang/String;Ljava/lang/String;)V", "getUserInviteOperatorId", "()Ljava/lang/String;", "getUserInviteOperatorLocalizedName", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class EventInviteOperator implements Serializable {
    private final String userInviteOperatorId;
    private final String userInviteOperatorLocalizedName;

    public static /* synthetic */ EventInviteOperator copy$default(EventInviteOperator eventInviteOperator, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eventInviteOperator.userInviteOperatorId;
        }
        if ((i & 2) != 0) {
            str2 = eventInviteOperator.userInviteOperatorLocalizedName;
        }
        return eventInviteOperator.copy(str, str2);
    }

    public final String component1() {
        return this.userInviteOperatorId;
    }

    public final String component2() {
        return this.userInviteOperatorLocalizedName;
    }

    public final EventInviteOperator copy(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "userInviteOperatorId");
        Intrinsics.checkParameterIsNotNull(str2, "userInviteOperatorLocalizedName");
        return new EventInviteOperator(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventInviteOperator)) {
            return false;
        }
        EventInviteOperator eventInviteOperator = (EventInviteOperator) obj;
        return Intrinsics.areEqual(this.userInviteOperatorId, eventInviteOperator.userInviteOperatorId) && Intrinsics.areEqual(this.userInviteOperatorLocalizedName, eventInviteOperator.userInviteOperatorLocalizedName);
    }

    public int hashCode() {
        String str = this.userInviteOperatorId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.userInviteOperatorLocalizedName;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "EventInviteOperator(userInviteOperatorId=" + this.userInviteOperatorId + ", userInviteOperatorLocalizedName=" + this.userInviteOperatorLocalizedName + ")";
    }

    public final String getUserInviteOperatorId() {
        return this.userInviteOperatorId;
    }

    public final String getUserInviteOperatorLocalizedName() {
        return this.userInviteOperatorLocalizedName;
    }

    public EventInviteOperator(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "userInviteOperatorId");
        Intrinsics.checkParameterIsNotNull(str2, "userInviteOperatorLocalizedName");
        this.userInviteOperatorId = str;
        this.userInviteOperatorLocalizedName = str2;
    }
}
