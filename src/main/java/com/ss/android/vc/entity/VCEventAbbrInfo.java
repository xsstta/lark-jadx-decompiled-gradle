package com.ss.android.vc.entity;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.statistics.chat.ChatTypeStateKeeper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u00102\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u00107\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u00108\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u0010<J\u0013\u0010=\u001a\u00020\r2\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010?\u001a\u00020@HÖ\u0001J\t\u0010A\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\n\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0013\"\u0004\b\u001c\u0010\u0015R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u000e\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\f\u0010\u001d\"\u0004\b!\u0010\u001fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0013\"\u0004\b#\u0010\u0015R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b$\u0010\u0017\"\u0004\b%\u0010\u0019R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001e\u0010\t\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b*\u0010\u0017\"\u0004\b+\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0013\"\u0004\b-\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0013\"\u0004\b/\u0010\u0015¨\u0006B"}, d2 = {"Lcom/ss/android/vc/entity/VCEventAbbrInfo;", "", "eventId", "", "uniqueId", "calendarId", "key", "originalTime", "", "startTime", "endTime", ChatTypeStateKeeper.f135670e, "isCrossTenant", "", "isAllDay", ShareHitPoint.f121868c, "Lcom/ss/android/vc/entity/Source;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/ss/android/vc/entity/Source;)V", "getCalendarId", "()Ljava/lang/String;", "setCalendarId", "(Ljava/lang/String;)V", "getEndTime", "()Ljava/lang/Long;", "setEndTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getEventId", "setEventId", "()Ljava/lang/Boolean;", "setAllDay", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "setCrossTenant", "getKey", "setKey", "getOriginalTime", "setOriginalTime", "getSource", "()Lcom/ss/android/vc/entity/Source;", "setSource", "(Lcom/ss/android/vc/entity/Source;)V", "getStartTime", "setStartTime", "getTopic", "setTopic", "getUniqueId", "setUniqueId", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/ss/android/vc/entity/Source;)Lcom/ss/android/vc/entity/VCEventAbbrInfo;", "equals", "other", "hashCode", "", "toString", "lib_vc_entity_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.entity.r */
public final class VCEventAbbrInfo {

    /* renamed from: a */
    private String f152554a;

    /* renamed from: b */
    private String f152555b;

    /* renamed from: c */
    private String f152556c;

    /* renamed from: d */
    private String f152557d;

    /* renamed from: e */
    private Long f152558e;

    /* renamed from: f */
    private Long f152559f;

    /* renamed from: g */
    private Long f152560g;

    /* renamed from: h */
    private String f152561h;

    /* renamed from: i */
    private Boolean f152562i;

    /* renamed from: j */
    private Boolean f152563j;

    /* renamed from: k */
    private Source f152564k;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VCEventAbbrInfo)) {
            return false;
        }
        VCEventAbbrInfo rVar = (VCEventAbbrInfo) obj;
        return Intrinsics.areEqual(this.f152554a, rVar.f152554a) && Intrinsics.areEqual(this.f152555b, rVar.f152555b) && Intrinsics.areEqual(this.f152556c, rVar.f152556c) && Intrinsics.areEqual(this.f152557d, rVar.f152557d) && Intrinsics.areEqual(this.f152558e, rVar.f152558e) && Intrinsics.areEqual(this.f152559f, rVar.f152559f) && Intrinsics.areEqual(this.f152560g, rVar.f152560g) && Intrinsics.areEqual(this.f152561h, rVar.f152561h) && Intrinsics.areEqual(this.f152562i, rVar.f152562i) && Intrinsics.areEqual(this.f152563j, rVar.f152563j) && Intrinsics.areEqual(this.f152564k, rVar.f152564k);
    }

    public int hashCode() {
        String str = this.f152554a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f152555b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f152556c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f152557d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Long l = this.f152558e;
        int hashCode5 = (hashCode4 + (l != null ? l.hashCode() : 0)) * 31;
        Long l2 = this.f152559f;
        int hashCode6 = (hashCode5 + (l2 != null ? l2.hashCode() : 0)) * 31;
        Long l3 = this.f152560g;
        int hashCode7 = (hashCode6 + (l3 != null ? l3.hashCode() : 0)) * 31;
        String str5 = this.f152561h;
        int hashCode8 = (hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Boolean bool = this.f152562i;
        int hashCode9 = (hashCode8 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f152563j;
        int hashCode10 = (hashCode9 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Source source = this.f152564k;
        if (source != null) {
            i = source.hashCode();
        }
        return hashCode10 + i;
    }

    public String toString() {
        return "VCEventAbbrInfo(eventId=" + this.f152554a + ", uniqueId=" + this.f152555b + ", calendarId=" + this.f152556c + ", key=" + this.f152557d + ", originalTime=" + this.f152558e + ", startTime=" + this.f152559f + ", endTime=" + this.f152560g + ", topic=" + this.f152561h + ", isCrossTenant=" + this.f152562i + ", isAllDay=" + this.f152563j + ", source=" + this.f152564k + ")";
    }

    public VCEventAbbrInfo(String str, String str2, String str3, String str4, Long l, Long l2, Long l3, String str5, Boolean bool, Boolean bool2, Source source) {
        Intrinsics.checkParameterIsNotNull(str, "eventId");
        this.f152554a = str;
        this.f152555b = str2;
        this.f152556c = str3;
        this.f152557d = str4;
        this.f152558e = l;
        this.f152559f = l2;
        this.f152560g = l3;
        this.f152561h = str5;
        this.f152562i = bool;
        this.f152563j = bool2;
        this.f152564k = source;
    }
}
