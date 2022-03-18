package com.ss.android.lark.calendar.impl.features.common.widget.chatterpicker;

import com.bytedance.ee.bear.document.tips.BottomDialog;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/widget/chatterpicker/CalContact;", "Ljava/io/Serializable;", BottomDialog.f17198f, "", "avatarKey", "displayName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAvatarKey", "()Ljava/lang/String;", "setAvatarKey", "(Ljava/lang/String;)V", "getChatterId", "setChatterId", "getDisplayName", "setDisplayName", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CalContact implements Serializable {
    private String avatarKey;
    private String chatterId;
    private String displayName;

    public CalContact() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ CalContact copy$default(CalContact calContact, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = calContact.chatterId;
        }
        if ((i & 2) != 0) {
            str2 = calContact.avatarKey;
        }
        if ((i & 4) != 0) {
            str3 = calContact.displayName;
        }
        return calContact.copy(str, str2, str3);
    }

    public final String component1() {
        return this.chatterId;
    }

    public final String component2() {
        return this.avatarKey;
    }

    public final String component3() {
        return this.displayName;
    }

    public final CalContact copy(String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, BottomDialog.f17198f);
        Intrinsics.checkParameterIsNotNull(str2, "avatarKey");
        Intrinsics.checkParameterIsNotNull(str3, "displayName");
        return new CalContact(str, str2, str3);
    }

    public String toString() {
        return "CalContact(chatterId=" + this.chatterId + ", avatarKey=" + this.avatarKey + ", displayName=" + this.displayName + ")";
    }

    public final String getAvatarKey() {
        return this.avatarKey;
    }

    public final String getChatterId() {
        return this.chatterId;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public int hashCode() {
        return this.chatterId.hashCode();
    }

    public final void setAvatarKey(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.avatarKey = str;
    }

    public final void setChatterId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.chatterId = str;
    }

    public final void setDisplayName(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.displayName = str;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CalContact)) {
            return false;
        }
        return Intrinsics.areEqual(this.chatterId, ((CalContact) obj).chatterId);
    }

    public CalContact(String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, BottomDialog.f17198f);
        Intrinsics.checkParameterIsNotNull(str2, "avatarKey");
        Intrinsics.checkParameterIsNotNull(str3, "displayName");
        this.chatterId = str;
        this.avatarKey = str2;
        this.displayName = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CalContact(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
