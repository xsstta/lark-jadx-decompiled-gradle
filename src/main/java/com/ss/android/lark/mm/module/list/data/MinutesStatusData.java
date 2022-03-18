package com.ss.android.lark.mm.module.list.data;

import com.google.gson.annotations.SerializedName;
import com.ss.android.lark.mm.base.IMmSerializable;
import com.ss.android.lark.statistics.chat.ChatTypeStateKeeper;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001BU\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\b¢\u0006\u0002\u0010\u000eJ\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0010J\t\u0010(\u001a\u00020\nHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010*\u001a\u00020\bHÆ\u0003J^\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\bHÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020\n2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020\u0005HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\"\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0016\u0010\r\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001e\"\u0004\b \u0010!R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00062"}, d2 = {"Lcom/ss/android/lark/mm/module/list/data/MinutesStatusData;", "Lcom/ss/android/lark/mm/base/IMmSerializable;", "objectToken", "", "objectStatus", "", ChatTypeStateKeeper.f135670e, "duration", "", "inTrash", "", "transcriptProgress", "Lcom/ss/android/lark/mm/module/list/data/MinutesTranscriptProgress;", "expireTime", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;ZLcom/ss/android/lark/mm/module/list/data/MinutesTranscriptProgress;J)V", "getDuration", "()Ljava/lang/Long;", "setDuration", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getExpireTime", "()J", "getInTrash", "()Z", "setInTrash", "(Z)V", "getObjectStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getObjectToken", "()Ljava/lang/String;", "getTopic", "setTopic", "(Ljava/lang/String;)V", "getTranscriptProgress", "()Lcom/ss/android/lark/mm/module/list/data/MinutesTranscriptProgress;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;ZLcom/ss/android/lark/mm/module/list/data/MinutesTranscriptProgress;J)Lcom/ss/android/lark/mm/module/list/data/MinutesStatusData;", "equals", "other", "", "hashCode", "toString", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MinutesStatusData implements IMmSerializable {
    @SerializedName("duration")
    private Long duration;
    @SerializedName("expire_time")
    private final long expireTime;
    @SerializedName("in_trash")
    private boolean inTrash;
    @SerializedName("object_status")
    private final Integer objectStatus;
    @SerializedName("object_token")
    private final String objectToken;
    @SerializedName(ChatTypeStateKeeper.f135670e)
    private String topic;
    @SerializedName("transcript_progress")
    private final MinutesTranscriptProgress transcriptProgress;

    public MinutesStatusData() {
        this(null, null, null, null, false, null, 0, SmActions.ACTION_ONTHECALL_ENTRY, null);
    }

    public static /* synthetic */ MinutesStatusData copy$default(MinutesStatusData minutesStatusData, String str, Integer num, String str2, Long l, boolean z, MinutesTranscriptProgress minutesTranscriptProgress, long j, int i, Object obj) {
        return minutesStatusData.copy((i & 1) != 0 ? minutesStatusData.objectToken : str, (i & 2) != 0 ? minutesStatusData.objectStatus : num, (i & 4) != 0 ? minutesStatusData.topic : str2, (i & 8) != 0 ? minutesStatusData.duration : l, (i & 16) != 0 ? minutesStatusData.inTrash : z, (i & 32) != 0 ? minutesStatusData.transcriptProgress : minutesTranscriptProgress, (i & 64) != 0 ? minutesStatusData.expireTime : j);
    }

    public final String component1() {
        return this.objectToken;
    }

    public final Integer component2() {
        return this.objectStatus;
    }

    public final String component3() {
        return this.topic;
    }

    public final Long component4() {
        return this.duration;
    }

    public final boolean component5() {
        return this.inTrash;
    }

    public final MinutesTranscriptProgress component6() {
        return this.transcriptProgress;
    }

    public final long component7() {
        return this.expireTime;
    }

    public final MinutesStatusData copy(String str, Integer num, String str2, Long l, boolean z, MinutesTranscriptProgress minutesTranscriptProgress, long j) {
        return new MinutesStatusData(str, num, str2, l, z, minutesTranscriptProgress, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MinutesStatusData)) {
            return false;
        }
        MinutesStatusData minutesStatusData = (MinutesStatusData) obj;
        return Intrinsics.areEqual(this.objectToken, minutesStatusData.objectToken) && Intrinsics.areEqual(this.objectStatus, minutesStatusData.objectStatus) && Intrinsics.areEqual(this.topic, minutesStatusData.topic) && Intrinsics.areEqual(this.duration, minutesStatusData.duration) && this.inTrash == minutesStatusData.inTrash && Intrinsics.areEqual(this.transcriptProgress, minutesStatusData.transcriptProgress) && this.expireTime == minutesStatusData.expireTime;
    }

    public int hashCode() {
        String str = this.objectToken;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Integer num = this.objectStatus;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.topic;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Long l = this.duration;
        int hashCode4 = (hashCode3 + (l != null ? l.hashCode() : 0)) * 31;
        boolean z = this.inTrash;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode4 + i2) * 31;
        MinutesTranscriptProgress minutesTranscriptProgress = this.transcriptProgress;
        if (minutesTranscriptProgress != null) {
            i = minutesTranscriptProgress.hashCode();
        }
        long j = this.expireTime;
        return ((i5 + i) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "MinutesStatusData(objectToken=" + this.objectToken + ", objectStatus=" + this.objectStatus + ", topic=" + this.topic + ", duration=" + this.duration + ", inTrash=" + this.inTrash + ", transcriptProgress=" + this.transcriptProgress + ", expireTime=" + this.expireTime + ")";
    }

    public final Long getDuration() {
        return this.duration;
    }

    public final long getExpireTime() {
        return this.expireTime;
    }

    public final boolean getInTrash() {
        return this.inTrash;
    }

    public final Integer getObjectStatus() {
        return this.objectStatus;
    }

    public final String getObjectToken() {
        return this.objectToken;
    }

    public final String getTopic() {
        return this.topic;
    }

    public final MinutesTranscriptProgress getTranscriptProgress() {
        return this.transcriptProgress;
    }

    public final void setDuration(Long l) {
        this.duration = l;
    }

    public final void setInTrash(boolean z) {
        this.inTrash = z;
    }

    public final void setTopic(String str) {
        this.topic = str;
    }

    public MinutesStatusData(String str, Integer num, String str2, Long l, boolean z, MinutesTranscriptProgress minutesTranscriptProgress, long j) {
        this.objectToken = str;
        this.objectStatus = num;
        this.topic = str2;
        this.duration = l;
        this.inTrash = z;
        this.transcriptProgress = minutesTranscriptProgress;
        this.expireTime = j;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ MinutesStatusData(java.lang.String r9, java.lang.Integer r10, java.lang.String r11, java.lang.Long r12, boolean r13, com.ss.android.lark.mm.module.list.data.MinutesTranscriptProgress r14, long r15, int r17, kotlin.jvm.internal.DefaultConstructorMarker r18) {
        /*
            r8 = this;
            r0 = r17 & 1
            r1 = 0
            if (r0 == 0) goto L_0x0009
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x000a
        L_0x0009:
            r0 = r9
        L_0x000a:
            r2 = r17 & 2
            if (r2 == 0) goto L_0x0012
            r2 = r1
            java.lang.Integer r2 = (java.lang.Integer) r2
            goto L_0x0013
        L_0x0012:
            r2 = r10
        L_0x0013:
            r3 = r17 & 4
            if (r3 == 0) goto L_0x001b
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x001c
        L_0x001b:
            r3 = r11
        L_0x001c:
            r4 = r17 & 8
            if (r4 == 0) goto L_0x0024
            r4 = r1
            java.lang.Long r4 = (java.lang.Long) r4
            goto L_0x0025
        L_0x0024:
            r4 = r12
        L_0x0025:
            r5 = r17 & 16
            if (r5 == 0) goto L_0x002b
            r5 = 0
            goto L_0x002c
        L_0x002b:
            r5 = r13
        L_0x002c:
            r6 = r17 & 32
            if (r6 == 0) goto L_0x0033
            com.ss.android.lark.mm.module.list.data.MinutesTranscriptProgress r1 = (com.ss.android.lark.mm.module.list.data.MinutesTranscriptProgress) r1
            goto L_0x0034
        L_0x0033:
            r1 = r14
        L_0x0034:
            r6 = r17 & 64
            if (r6 == 0) goto L_0x003b
            r6 = 0
            goto L_0x003c
        L_0x003b:
            r6 = r15
        L_0x003c:
            r9 = r8
            r10 = r0
            r11 = r2
            r12 = r3
            r13 = r4
            r14 = r5
            r15 = r1
            r16 = r6
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mm.module.list.data.MinutesStatusData.<init>(java.lang.String, java.lang.Integer, java.lang.String, java.lang.Long, boolean, com.ss.android.lark.mm.module.list.data.MinutesTranscriptProgress, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
