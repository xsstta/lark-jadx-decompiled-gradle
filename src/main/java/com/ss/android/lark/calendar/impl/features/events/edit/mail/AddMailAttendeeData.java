package com.ss.android.lark.calendar.impl.features.events.edit.mail;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeData;", "Ljava/io/Serializable;", "accountName", "", "isDeletable", "", "(Ljava/lang/String;Z)V", "getAccountName", "()Ljava/lang/String;", "setAccountName", "(Ljava/lang/String;)V", "()Z", "setDeletable", "(Z)V", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class AddMailAttendeeData implements Serializable {
    private String accountName;
    private boolean isDeletable;

    public static /* synthetic */ AddMailAttendeeData copy$default(AddMailAttendeeData addMailAttendeeData, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addMailAttendeeData.accountName;
        }
        if ((i & 2) != 0) {
            z = addMailAttendeeData.isDeletable;
        }
        return addMailAttendeeData.copy(str, z);
    }

    public final String component1() {
        return this.accountName;
    }

    public final boolean component2() {
        return this.isDeletable;
    }

    public final AddMailAttendeeData copy(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "accountName");
        return new AddMailAttendeeData(str, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddMailAttendeeData)) {
            return false;
        }
        AddMailAttendeeData addMailAttendeeData = (AddMailAttendeeData) obj;
        return Intrinsics.areEqual(this.accountName, addMailAttendeeData.accountName) && this.isDeletable == addMailAttendeeData.isDeletable;
    }

    public int hashCode() {
        String str = this.accountName;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.isDeletable;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return hashCode + i;
    }

    public String toString() {
        return "AddMailAttendeeData(accountName=" + this.accountName + ", isDeletable=" + this.isDeletable + ")";
    }

    public final String getAccountName() {
        return this.accountName;
    }

    public final boolean isDeletable() {
        return this.isDeletable;
    }

    public final void setDeletable(boolean z) {
        this.isDeletable = z;
    }

    public final void setAccountName(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.accountName = str;
    }

    public AddMailAttendeeData(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "accountName");
        this.accountName = str;
        this.isDeletable = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AddMailAttendeeData(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? true : z);
    }
}
