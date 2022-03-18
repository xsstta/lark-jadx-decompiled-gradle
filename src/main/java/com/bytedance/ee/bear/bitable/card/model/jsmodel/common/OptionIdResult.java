package com.bytedance.ee.bear.bitable.card.model.jsmodel.common;

import com.bytedance.ee.util.io.NonProguard;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0011"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/common/OptionIdResult;", "Lcom/bytedance/ee/util/io/NonProguard;", "optionId", "", "(Ljava/lang/String;)V", "getOptionId", "()Ljava/lang/String;", "setOptionId", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class OptionIdResult implements NonProguard {
    private String optionId;

    public OptionIdResult() {
        this(null, 1, null);
    }

    public static /* synthetic */ OptionIdResult copy$default(OptionIdResult optionIdResult, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = optionIdResult.optionId;
        }
        return optionIdResult.copy(str);
    }

    public final String component1() {
        return this.optionId;
    }

    public final OptionIdResult copy(String str) {
        return new OptionIdResult(str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof OptionIdResult) && Intrinsics.areEqual(this.optionId, ((OptionIdResult) obj).optionId);
        }
        return true;
    }

    public int hashCode() {
        String str = this.optionId;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "OptionIdResult(optionId=" + this.optionId + ")";
    }

    public final String getOptionId() {
        return this.optionId;
    }

    public final void setOptionId(String str) {
        this.optionId = str;
    }

    public OptionIdResult(String str) {
        this.optionId = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OptionIdResult(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
