package com.ss.android.lark.mm.module.list.repo;

import com.ss.android.lark.mm.module.list.data.MinutesListResponse;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB!\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/mm/module/list/repo/MmListCacheData;", "Ljava/io/Serializable;", "listData", "Lcom/ss/android/lark/mm/module/list/data/MinutesListResponse;", "appVersionName", "", "cacheTime", "", "(Lcom/ss/android/lark/mm/module/list/data/MinutesListResponse;Ljava/lang/String;J)V", "getAppVersionName", "()Ljava/lang/String;", "getCacheTime", "()J", "getListData", "()Lcom/ss/android/lark/mm/module/list/data/MinutesListResponse;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MmListCacheData implements Serializable {
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = -1;
    private final String appVersionName;
    private final long cacheTime;
    private final MinutesListResponse listData;

    public static /* synthetic */ MmListCacheData copy$default(MmListCacheData mmListCacheData, MinutesListResponse minutesListResponse, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            minutesListResponse = mmListCacheData.listData;
        }
        if ((i & 2) != 0) {
            str = mmListCacheData.appVersionName;
        }
        if ((i & 4) != 0) {
            j = mmListCacheData.cacheTime;
        }
        return mmListCacheData.copy(minutesListResponse, str, j);
    }

    public final MinutesListResponse component1() {
        return this.listData;
    }

    public final String component2() {
        return this.appVersionName;
    }

    public final long component3() {
        return this.cacheTime;
    }

    public final MmListCacheData copy(MinutesListResponse minutesListResponse, String str, long j) {
        Intrinsics.checkParameterIsNotNull(str, "appVersionName");
        return new MmListCacheData(minutesListResponse, str, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MmListCacheData)) {
            return false;
        }
        MmListCacheData mmListCacheData = (MmListCacheData) obj;
        return Intrinsics.areEqual(this.listData, mmListCacheData.listData) && Intrinsics.areEqual(this.appVersionName, mmListCacheData.appVersionName) && this.cacheTime == mmListCacheData.cacheTime;
    }

    public int hashCode() {
        MinutesListResponse minutesListResponse = this.listData;
        int i = 0;
        int hashCode = (minutesListResponse != null ? minutesListResponse.hashCode() : 0) * 31;
        String str = this.appVersionName;
        if (str != null) {
            i = str.hashCode();
        }
        long j = this.cacheTime;
        return ((hashCode + i) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "MmListCacheData(listData=" + this.listData + ", appVersionName=" + this.appVersionName + ", cacheTime=" + this.cacheTime + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/mm/module/list/repo/MmListCacheData$Companion;", "", "()V", "serialVersionUID", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.repo.MmListCacheData$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final String getAppVersionName() {
        return this.appVersionName;
    }

    public final long getCacheTime() {
        return this.cacheTime;
    }

    public final MinutesListResponse getListData() {
        return this.listData;
    }

    public MmListCacheData(MinutesListResponse minutesListResponse, String str, long j) {
        Intrinsics.checkParameterIsNotNull(str, "appVersionName");
        this.listData = minutesListResponse;
        this.appVersionName = str;
        this.cacheTime = j;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MmListCacheData(MinutesListResponse minutesListResponse, String str, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : minutesListResponse, str, j);
    }
}
