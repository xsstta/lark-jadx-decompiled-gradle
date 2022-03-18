package com.ss.android.vc.lark.rvc;

import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/ss/android/vc/lark/rvc/ShareMeetingJSModel;", "Lcom/ss/android/lark/openapi/jsapi/entity/BaseJSModel;", "meetingId", "", "from", "(Ljava/lang/String;Ljava/lang/String;)V", "getFrom", "()Ljava/lang/String;", "getMeetingId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class ShareMeetingJSModel implements BaseJSModel {
    private final String from;
    private final String meetingId;

    public static /* synthetic */ ShareMeetingJSModel copy$default(ShareMeetingJSModel shareMeetingJSModel, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shareMeetingJSModel.meetingId;
        }
        if ((i & 2) != 0) {
            str2 = shareMeetingJSModel.from;
        }
        return shareMeetingJSModel.copy(str, str2);
    }

    public final String component1() {
        return this.meetingId;
    }

    public final String component2() {
        return this.from;
    }

    public final ShareMeetingJSModel copy(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "meetingId");
        Intrinsics.checkParameterIsNotNull(str2, "from");
        return new ShareMeetingJSModel(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareMeetingJSModel)) {
            return false;
        }
        ShareMeetingJSModel shareMeetingJSModel = (ShareMeetingJSModel) obj;
        return Intrinsics.areEqual(this.meetingId, shareMeetingJSModel.meetingId) && Intrinsics.areEqual(this.from, shareMeetingJSModel.from);
    }

    public int hashCode() {
        String str = this.meetingId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.from;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "ShareMeetingJSModel(meetingId=" + this.meetingId + ", from=" + this.from + ")";
    }

    public final String getFrom() {
        return this.from;
    }

    public final String getMeetingId() {
        return this.meetingId;
    }

    public ShareMeetingJSModel(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "meetingId");
        Intrinsics.checkParameterIsNotNull(str2, "from");
        this.meetingId = str;
        this.from = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ShareMeetingJSModel(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "RVC" : str2);
    }
}
