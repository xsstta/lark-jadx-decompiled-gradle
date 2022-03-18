package com.ss.android.lark.mm.module.detail.search.model;

import com.google.gson.annotations.SerializedName;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0016J>\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\bHÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006&"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/search/model/FindTimeline;", "Ljava/io/Serializable;", "pid", "", "sid", "startTime", "", ShareHitPoint.f121869d, "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;)V", "getPid", "()Ljava/lang/String;", "setPid", "(Ljava/lang/String;)V", "getSid", "setSid", "getStartTime", "()Ljava/lang/Long;", "setStartTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getType", "()Ljava/lang/Integer;", "setType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;)Lcom/ss/android/lark/mm/module/detail/search/model/FindTimeline;", "equals", "", "other", "", "hashCode", "toString", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class FindTimeline implements Serializable {
    private String pid;
    private String sid;
    @SerializedName("start_time")
    private Long startTime;
    private Integer type;

    public FindTimeline() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ FindTimeline copy$default(FindTimeline findTimeline, String str, String str2, Long l, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = findTimeline.pid;
        }
        if ((i & 2) != 0) {
            str2 = findTimeline.sid;
        }
        if ((i & 4) != 0) {
            l = findTimeline.startTime;
        }
        if ((i & 8) != 0) {
            num = findTimeline.type;
        }
        return findTimeline.copy(str, str2, l, num);
    }

    public final String component1() {
        return this.pid;
    }

    public final String component2() {
        return this.sid;
    }

    public final Long component3() {
        return this.startTime;
    }

    public final Integer component4() {
        return this.type;
    }

    public final FindTimeline copy(String str, String str2, Long l, Integer num) {
        return new FindTimeline(str, str2, l, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FindTimeline)) {
            return false;
        }
        FindTimeline findTimeline = (FindTimeline) obj;
        return Intrinsics.areEqual(this.pid, findTimeline.pid) && Intrinsics.areEqual(this.sid, findTimeline.sid) && Intrinsics.areEqual(this.startTime, findTimeline.startTime) && Intrinsics.areEqual(this.type, findTimeline.type);
    }

    public int hashCode() {
        String str = this.pid;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.sid;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Long l = this.startTime;
        int hashCode3 = (hashCode2 + (l != null ? l.hashCode() : 0)) * 31;
        Integer num = this.type;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "FindTimeline(pid=" + this.pid + ", sid=" + this.sid + ", startTime=" + this.startTime + ", type=" + this.type + ")";
    }

    public final String getPid() {
        return this.pid;
    }

    public final String getSid() {
        return this.sid;
    }

    public final Long getStartTime() {
        return this.startTime;
    }

    public final Integer getType() {
        return this.type;
    }

    public final void setPid(String str) {
        this.pid = str;
    }

    public final void setSid(String str) {
        this.sid = str;
    }

    public final void setStartTime(Long l) {
        this.startTime = l;
    }

    public final void setType(Integer num) {
        this.type = num;
    }

    public FindTimeline(String str, String str2, Long l, Integer num) {
        this.pid = str;
        this.sid = str2;
        this.startTime = l;
        this.type = num;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FindTimeline(String str, String str2, Long l, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : num);
    }
}
