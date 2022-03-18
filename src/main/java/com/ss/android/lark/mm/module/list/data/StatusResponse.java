package com.ss.android.lark.mm.module.list.data;

import com.google.gson.annotations.SerializedName;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.mm.base.IMmSerializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B#\u0012\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005¢\u0006\u0002\u0010\u0006J\u001d\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R2\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/mm/module/list/data/StatusResponse;", "Lcom/ss/android/lark/mm/base/IMmSerializable;", UpdateKey.STATUS, "Ljava/util/ArrayList;", "Lcom/ss/android/lark/mm/module/list/data/MinutesStatusData;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "getStatus", "()Ljava/util/ArrayList;", "setStatus", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class StatusResponse implements IMmSerializable {
    @SerializedName(UpdateKey.STATUS)
    private ArrayList<MinutesStatusData> status;

    public StatusResponse() {
        this(null, 1, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.mm.module.list.data.StatusResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StatusResponse copy$default(StatusResponse statusResponse, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = statusResponse.status;
        }
        return statusResponse.copy(arrayList);
    }

    public final ArrayList<MinutesStatusData> component1() {
        return this.status;
    }

    public final StatusResponse copy(ArrayList<MinutesStatusData> arrayList) {
        return new StatusResponse(arrayList);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof StatusResponse) && Intrinsics.areEqual(this.status, ((StatusResponse) obj).status);
        }
        return true;
    }

    public int hashCode() {
        ArrayList<MinutesStatusData> arrayList = this.status;
        if (arrayList != null) {
            return arrayList.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "StatusResponse(status=" + this.status + ")";
    }

    public final ArrayList<MinutesStatusData> getStatus() {
        return this.status;
    }

    public final void setStatus(ArrayList<MinutesStatusData> arrayList) {
        this.status = arrayList;
    }

    public StatusResponse(ArrayList<MinutesStatusData> arrayList) {
        this.status = arrayList;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StatusResponse(ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : arrayList);
    }
}
