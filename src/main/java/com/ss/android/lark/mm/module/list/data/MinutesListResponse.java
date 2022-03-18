package com.ss.android.lark.mm.module.list.data;

import com.google.gson.annotations.SerializedName;
import com.ss.android.lark.mm.base.IMmSerializable;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t¢\u0006\u0002\u0010\u000fJ\u0010\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010!J\u0010\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010!J\u000b\u0010/\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010!J\u0010\u00101\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0011J\u0011\u00102\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\tHÆ\u0003Jp\u00105\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u00106J\u0013\u00107\u001a\u00020\t2\b\u00108\u001a\u0004\u0018\u000109HÖ\u0003J\t\u0010:\u001a\u00020\u0003HÖ\u0001J\t\u0010;\u001a\u00020\u0006HÖ\u0001R\"\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u000e\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0015\"\u0004\b\u0016\u0010\u0017R&\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\r\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b+\u0010!\"\u0004\b,\u0010#¨\u0006<"}, d2 = {"Lcom/ss/android/lark/mm/module/list/data/MinutesListResponse;", "Lcom/ss/android/lark/mm/base/IMmSerializable;", "total", "", "offset", "timestamp", "", "size", "hasMore", "", "list", "", "Lcom/ss/android/lark/mm/module/list/data/MinutesSummaryData;", "nextOffset", "isFromNetwork", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/List;IZ)V", "getHasMore", "()Ljava/lang/Boolean;", "setHasMore", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "()Z", "setFromNetwork", "(Z)V", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "getNextOffset", "()I", "setNextOffset", "(I)V", "getOffset", "()Ljava/lang/Integer;", "setOffset", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getSize", "setSize", "getTimestamp", "()Ljava/lang/String;", "setTimestamp", "(Ljava/lang/String;)V", "getTotal", "setTotal", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/List;IZ)Lcom/ss/android/lark/mm/module/list/data/MinutesListResponse;", "equals", "other", "", "hashCode", "toString", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MinutesListResponse implements IMmSerializable {
    @SerializedName("has_more")
    private Boolean hasMore;
    private boolean isFromNetwork;
    @SerializedName("list")
    private List<MinutesSummaryData> list;
    private int nextOffset;
    @SerializedName("offset")
    private Integer offset;
    @SerializedName("size")
    private Integer size;
    @SerializedName("timestamp")
    private String timestamp;
    @SerializedName("total")
    private Integer total;

    public MinutesListResponse() {
        this(null, null, null, null, null, null, 0, false, 255, null);
    }

    public static /* synthetic */ MinutesListResponse copy$default(MinutesListResponse minutesListResponse, Integer num, Integer num2, String str, Integer num3, Boolean bool, List list2, int i, boolean z, int i2, Object obj) {
        return minutesListResponse.copy((i2 & 1) != 0 ? minutesListResponse.total : num, (i2 & 2) != 0 ? minutesListResponse.offset : num2, (i2 & 4) != 0 ? minutesListResponse.timestamp : str, (i2 & 8) != 0 ? minutesListResponse.size : num3, (i2 & 16) != 0 ? minutesListResponse.hasMore : bool, (i2 & 32) != 0 ? minutesListResponse.list : list2, (i2 & 64) != 0 ? minutesListResponse.nextOffset : i, (i2 & SmActions.ACTION_ONTHECALL_EXIT) != 0 ? minutesListResponse.isFromNetwork : z);
    }

    public final Integer component1() {
        return this.total;
    }

    public final Integer component2() {
        return this.offset;
    }

    public final String component3() {
        return this.timestamp;
    }

    public final Integer component4() {
        return this.size;
    }

    public final Boolean component5() {
        return this.hasMore;
    }

    public final List<MinutesSummaryData> component6() {
        return this.list;
    }

    public final int component7() {
        return this.nextOffset;
    }

    public final boolean component8() {
        return this.isFromNetwork;
    }

    public final MinutesListResponse copy(Integer num, Integer num2, String str, Integer num3, Boolean bool, List<MinutesSummaryData> list2, int i, boolean z) {
        return new MinutesListResponse(num, num2, str, num3, bool, list2, i, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MinutesListResponse)) {
            return false;
        }
        MinutesListResponse minutesListResponse = (MinutesListResponse) obj;
        return Intrinsics.areEqual(this.total, minutesListResponse.total) && Intrinsics.areEqual(this.offset, minutesListResponse.offset) && Intrinsics.areEqual(this.timestamp, minutesListResponse.timestamp) && Intrinsics.areEqual(this.size, minutesListResponse.size) && Intrinsics.areEqual(this.hasMore, minutesListResponse.hasMore) && Intrinsics.areEqual(this.list, minutesListResponse.list) && this.nextOffset == minutesListResponse.nextOffset && this.isFromNetwork == minutesListResponse.isFromNetwork;
    }

    public int hashCode() {
        Integer num = this.total;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.offset;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str = this.timestamp;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        Integer num3 = this.size;
        int hashCode4 = (hashCode3 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Boolean bool = this.hasMore;
        int hashCode5 = (hashCode4 + (bool != null ? bool.hashCode() : 0)) * 31;
        List<MinutesSummaryData> list2 = this.list;
        if (list2 != null) {
            i = list2.hashCode();
        }
        int i2 = (((hashCode5 + i) * 31) + this.nextOffset) * 31;
        boolean z = this.isFromNetwork;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public String toString() {
        return "MinutesListResponse(total=" + this.total + ", offset=" + this.offset + ", timestamp=" + this.timestamp + ", size=" + this.size + ", hasMore=" + this.hasMore + ", list=" + this.list + ", nextOffset=" + this.nextOffset + ", isFromNetwork=" + this.isFromNetwork + ")";
    }

    public final Boolean getHasMore() {
        return this.hasMore;
    }

    public final List<MinutesSummaryData> getList() {
        return this.list;
    }

    public final int getNextOffset() {
        return this.nextOffset;
    }

    public final Integer getOffset() {
        return this.offset;
    }

    public final Integer getSize() {
        return this.size;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }

    public final Integer getTotal() {
        return this.total;
    }

    public final boolean isFromNetwork() {
        return this.isFromNetwork;
    }

    public final void setFromNetwork(boolean z) {
        this.isFromNetwork = z;
    }

    public final void setHasMore(Boolean bool) {
        this.hasMore = bool;
    }

    public final void setList(List<MinutesSummaryData> list2) {
        this.list = list2;
    }

    public final void setNextOffset(int i) {
        this.nextOffset = i;
    }

    public final void setOffset(Integer num) {
        this.offset = num;
    }

    public final void setSize(Integer num) {
        this.size = num;
    }

    public final void setTimestamp(String str) {
        this.timestamp = str;
    }

    public final void setTotal(Integer num) {
        this.total = num;
    }

    public MinutesListResponse(Integer num, Integer num2, String str, Integer num3, Boolean bool, List<MinutesSummaryData> list2, int i, boolean z) {
        this.total = num;
        this.offset = num2;
        this.timestamp = str;
        this.size = num3;
        this.hasMore = bool;
        this.list = list2;
        this.nextOffset = i;
        this.isFromNetwork = z;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ MinutesListResponse(java.lang.Integer r10, java.lang.Integer r11, java.lang.String r12, java.lang.Integer r13, java.lang.Boolean r14, java.util.List r15, int r16, boolean r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r9 = this;
            r0 = r18
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x000b
            r1 = r2
            java.lang.Integer r1 = (java.lang.Integer) r1
            goto L_0x000c
        L_0x000b:
            r1 = r10
        L_0x000c:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0014
            r3 = r2
            java.lang.Integer r3 = (java.lang.Integer) r3
            goto L_0x0015
        L_0x0014:
            r3 = r11
        L_0x0015:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x001d
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x001e
        L_0x001d:
            r4 = r12
        L_0x001e:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0026
            r5 = r2
            java.lang.Integer r5 = (java.lang.Integer) r5
            goto L_0x0027
        L_0x0026:
            r5 = r13
        L_0x0027:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x002f
            r6 = r2
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            goto L_0x0030
        L_0x002f:
            r6 = r14
        L_0x0030:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0037
            java.util.List r2 = (java.util.List) r2
            goto L_0x0038
        L_0x0037:
            r2 = r15
        L_0x0038:
            r7 = r0 & 64
            r8 = 0
            if (r7 == 0) goto L_0x003f
            r7 = 0
            goto L_0x0041
        L_0x003f:
            r7 = r16
        L_0x0041:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0046
            goto L_0x0048
        L_0x0046:
            r8 = r17
        L_0x0048:
            r10 = r9
            r11 = r1
            r12 = r3
            r13 = r4
            r14 = r5
            r15 = r6
            r16 = r2
            r17 = r7
            r18 = r8
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mm.module.list.data.MinutesListResponse.<init>(java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Boolean, java.util.List, int, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
