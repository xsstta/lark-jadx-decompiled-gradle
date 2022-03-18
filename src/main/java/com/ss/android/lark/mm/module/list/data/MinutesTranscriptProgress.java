package com.ss.android.lark.mm.module.list.data;

import com.google.gson.annotations.SerializedName;
import com.ss.android.lark.mm.base.IMmSerializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/mm/module/list/data/MinutesTranscriptProgress;", "Lcom/ss/android/lark/mm/base/IMmSerializable;", "current", "", "rate", "(Ljava/lang/String;Ljava/lang/String;)V", "getCurrent", "()Ljava/lang/String;", "getRate", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MinutesTranscriptProgress implements IMmSerializable {
    @SerializedName("current")
    private final String current;
    @SerializedName("rate")
    private final String rate;

    public MinutesTranscriptProgress() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ MinutesTranscriptProgress copy$default(MinutesTranscriptProgress minutesTranscriptProgress, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = minutesTranscriptProgress.current;
        }
        if ((i & 2) != 0) {
            str2 = minutesTranscriptProgress.rate;
        }
        return minutesTranscriptProgress.copy(str, str2);
    }

    public final String component1() {
        return this.current;
    }

    public final String component2() {
        return this.rate;
    }

    public final MinutesTranscriptProgress copy(String str, String str2) {
        return new MinutesTranscriptProgress(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MinutesTranscriptProgress)) {
            return false;
        }
        MinutesTranscriptProgress minutesTranscriptProgress = (MinutesTranscriptProgress) obj;
        return Intrinsics.areEqual(this.current, minutesTranscriptProgress.current) && Intrinsics.areEqual(this.rate, minutesTranscriptProgress.rate);
    }

    public int hashCode() {
        String str = this.current;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.rate;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "MinutesTranscriptProgress(current=" + this.current + ", rate=" + this.rate + ")";
    }

    public final String getCurrent() {
        return this.current;
    }

    public final String getRate() {
        return this.rate;
    }

    public MinutesTranscriptProgress(String str, String str2) {
        this.current = str;
        this.rate = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MinutesTranscriptProgress(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
