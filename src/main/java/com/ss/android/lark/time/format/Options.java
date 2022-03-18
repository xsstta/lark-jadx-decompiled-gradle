package com.ss.android.lark.time.format;

import com.ss.android.lark.time.format.common.LocaleUtil;
import com.ss.android.lark.time.format.entity.DatePreciseness;
import com.ss.android.lark.time.format.entity.DisplayPattern;
import com.ss.android.lark.time.format.entity.LengthType;
import com.ss.android.lark.time.format.entity.TimePreciseness;
import com.ss.ttm.player.MediaPlayer;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Bm\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013B_\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r¢\u0006\u0002\u0010\u0014J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\t\u00106\u001a\u00020\u0007HÆ\u0003J\t\u00107\u001a\u00020\tHÆ\u0003J\t\u00108\u001a\u00020\u000bHÆ\u0003J\t\u00109\u001a\u00020\rHÆ\u0003J\t\u0010:\u001a\u00020\rHÆ\u0003J\t\u0010;\u001a\u00020\rHÆ\u0003J\t\u0010<\u001a\u00020\rHÆ\u0003Jc\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\rHÆ\u0001J\u0013\u0010>\u001a\u00020\r2\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010@\u001a\u00020AHÖ\u0001J\t\u0010B\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0010\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u001d\"\u0004\b \u0010\u001fR\u001a\u0010\u000f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u001d\"\u0004\b!\u0010\u001fR\u001a\u0010\u000e\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u001d\"\u0004\b\"\u0010\u001fR\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R(\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010'\u001a\u0004\u0018\u00010\u0012@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u0006C"}, d2 = {"Lcom/ss/android/lark/time/format/Options;", "", "timezone", "", "displayPattern", "Lcom/ss/android/lark/time/format/entity/DisplayPattern;", "lengthType", "Lcom/ss/android/lark/time/format/entity/LengthType;", "datePreciseness", "Lcom/ss/android/lark/time/format/entity/DatePreciseness;", "timePreciseness", "Lcom/ss/android/lark/time/format/entity/TimePreciseness;", "isShowTimezone", "", "isTwelveHour", "isTruncatingZeroTail", "isTimeOptimize", "locale", "Ljava/util/Locale;", "(Ljava/lang/String;Lcom/ss/android/lark/time/format/entity/DisplayPattern;Lcom/ss/android/lark/time/format/entity/LengthType;Lcom/ss/android/lark/time/format/entity/DatePreciseness;Lcom/ss/android/lark/time/format/entity/TimePreciseness;ZZZZLjava/util/Locale;)V", "(Ljava/lang/String;Lcom/ss/android/lark/time/format/entity/DisplayPattern;Lcom/ss/android/lark/time/format/entity/LengthType;Lcom/ss/android/lark/time/format/entity/DatePreciseness;Lcom/ss/android/lark/time/format/entity/TimePreciseness;ZZZZ)V", "getDatePreciseness", "()Lcom/ss/android/lark/time/format/entity/DatePreciseness;", "setDatePreciseness", "(Lcom/ss/android/lark/time/format/entity/DatePreciseness;)V", "getDisplayPattern", "()Lcom/ss/android/lark/time/format/entity/DisplayPattern;", "setDisplayPattern", "(Lcom/ss/android/lark/time/format/entity/DisplayPattern;)V", "()Z", "setShowTimezone", "(Z)V", "setTimeOptimize", "setTruncatingZeroTail", "setTwelveHour", "getLengthType", "()Lcom/ss/android/lark/time/format/entity/LengthType;", "setLengthType", "(Lcom/ss/android/lark/time/format/entity/LengthType;)V", "value", "getLocale", "()Ljava/util/Locale;", "setLocale", "(Ljava/util/Locale;)V", "getTimePreciseness", "()Lcom/ss/android/lark/time/format/entity/TimePreciseness;", "setTimePreciseness", "(Lcom/ss/android/lark/time/format/entity/TimePreciseness;)V", "getTimezone", "()Ljava/lang/String;", "setTimezone", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "time-format_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.time.format.a */
public final class Options {

    /* renamed from: a */
    private Locale f139136a;

    /* renamed from: b */
    private String f139137b;

    /* renamed from: c */
    private DisplayPattern f139138c;

    /* renamed from: d */
    private LengthType f139139d;

    /* renamed from: e */
    private DatePreciseness f139140e;

    /* renamed from: f */
    private TimePreciseness f139141f;

    /* renamed from: g */
    private boolean f139142g;

    /* renamed from: h */
    private boolean f139143h;

    /* renamed from: i */
    private boolean f139144i;

    /* renamed from: j */
    private boolean f139145j;

    public Options() {
        this(null, null, null, null, null, false, false, false, false, MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_FILENAME, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Options)) {
            return false;
        }
        Options aVar = (Options) obj;
        return Intrinsics.areEqual(this.f139137b, aVar.f139137b) && Intrinsics.areEqual(this.f139138c, aVar.f139138c) && Intrinsics.areEqual(this.f139139d, aVar.f139139d) && Intrinsics.areEqual(this.f139140e, aVar.f139140e) && Intrinsics.areEqual(this.f139141f, aVar.f139141f) && this.f139142g == aVar.f139142g && this.f139143h == aVar.f139143h && this.f139144i == aVar.f139144i && this.f139145j == aVar.f139145j;
    }

    public int hashCode() {
        String str = this.f139137b;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        DisplayPattern displayPattern = this.f139138c;
        int hashCode2 = (hashCode + (displayPattern != null ? displayPattern.hashCode() : 0)) * 31;
        LengthType lengthType = this.f139139d;
        int hashCode3 = (hashCode2 + (lengthType != null ? lengthType.hashCode() : 0)) * 31;
        DatePreciseness datePreciseness = this.f139140e;
        int hashCode4 = (hashCode3 + (datePreciseness != null ? datePreciseness.hashCode() : 0)) * 31;
        TimePreciseness timePreciseness = this.f139141f;
        if (timePreciseness != null) {
            i = timePreciseness.hashCode();
        }
        int i2 = (hashCode4 + i) * 31;
        boolean z = this.f139142g;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (i2 + i4) * 31;
        boolean z2 = this.f139143h;
        if (z2) {
            z2 = true;
        }
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int i11 = (i7 + i8) * 31;
        boolean z3 = this.f139144i;
        if (z3) {
            z3 = true;
        }
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = z3 ? 1 : 0;
        int i15 = (i11 + i12) * 31;
        boolean z4 = this.f139145j;
        if (!z4) {
            i3 = z4 ? 1 : 0;
        }
        return i15 + i3;
    }

    public String toString() {
        return "Options(timezone=" + this.f139137b + ", displayPattern=" + this.f139138c + ", lengthType=" + this.f139139d + ", datePreciseness=" + this.f139140e + ", timePreciseness=" + this.f139141f + ", isShowTimezone=" + this.f139142g + ", isTwelveHour=" + this.f139143h + ", isTruncatingZeroTail=" + this.f139144i + ", isTimeOptimize=" + this.f139145j + ")";
    }

    /* renamed from: a */
    public final Locale mo191590a() {
        return this.f139136a;
    }

    /* renamed from: b */
    public final String mo191598b() {
        return this.f139137b;
    }

    /* renamed from: c */
    public final DisplayPattern mo191600c() {
        return this.f139138c;
    }

    /* renamed from: d */
    public final LengthType mo191602d() {
        return this.f139139d;
    }

    /* renamed from: e */
    public final DatePreciseness mo191604e() {
        return this.f139140e;
    }

    /* renamed from: f */
    public final TimePreciseness mo191606f() {
        return this.f139141f;
    }

    /* renamed from: g */
    public final boolean mo191607g() {
        return this.f139142g;
    }

    /* renamed from: h */
    public final boolean mo191608h() {
        return this.f139143h;
    }

    /* renamed from: i */
    public final boolean mo191610i() {
        return this.f139144i;
    }

    /* renamed from: j */
    public final boolean mo191611j() {
        return this.f139145j;
    }

    /* renamed from: a */
    public final void mo191591a(DatePreciseness datePreciseness) {
        Intrinsics.checkParameterIsNotNull(datePreciseness, "<set-?>");
        this.f139140e = datePreciseness;
    }

    /* renamed from: b */
    public final void mo191599b(boolean z) {
        this.f139143h = z;
    }

    /* renamed from: c */
    public final void mo191601c(boolean z) {
        this.f139144i = z;
    }

    /* renamed from: d */
    public final void mo191603d(boolean z) {
        this.f139145j = z;
    }

    /* renamed from: a */
    public final void mo191592a(DisplayPattern displayPattern) {
        Intrinsics.checkParameterIsNotNull(displayPattern, "<set-?>");
        this.f139138c = displayPattern;
    }

    /* renamed from: a */
    public final void mo191593a(LengthType lengthType) {
        Intrinsics.checkParameterIsNotNull(lengthType, "<set-?>");
        this.f139139d = lengthType;
    }

    /* renamed from: a */
    public final void mo191594a(TimePreciseness timePreciseness) {
        Intrinsics.checkParameterIsNotNull(timePreciseness, "<set-?>");
        this.f139141f = timePreciseness;
    }

    /* renamed from: a */
    public final void mo191595a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f139137b = str;
    }

    /* renamed from: a */
    public final void mo191596a(Locale locale) {
        this.f139136a = LocaleUtil.f139148a.mo191617a(locale);
    }

    /* renamed from: a */
    public final void mo191597a(boolean z) {
        this.f139142g = z;
    }

    public Options(String str, DisplayPattern displayPattern, LengthType lengthType, DatePreciseness datePreciseness, TimePreciseness timePreciseness, boolean z, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkParameterIsNotNull(str, "timezone");
        Intrinsics.checkParameterIsNotNull(displayPattern, "displayPattern");
        Intrinsics.checkParameterIsNotNull(lengthType, "lengthType");
        Intrinsics.checkParameterIsNotNull(datePreciseness, "datePreciseness");
        Intrinsics.checkParameterIsNotNull(timePreciseness, "timePreciseness");
        this.f139137b = str;
        this.f139138c = displayPattern;
        this.f139139d = lengthType;
        this.f139140e = datePreciseness;
        this.f139141f = timePreciseness;
        this.f139142g = z;
        this.f139143h = z2;
        this.f139144i = z3;
        this.f139145j = z4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Options(String str, DisplayPattern displayPattern, LengthType lengthType, DatePreciseness datePreciseness, TimePreciseness timePreciseness, boolean z, boolean z2, boolean z3, boolean z4, Locale locale) {
        this(str, displayPattern, lengthType, datePreciseness, timePreciseness, z, z2, z3, z4);
        Intrinsics.checkParameterIsNotNull(str, "timezone");
        Intrinsics.checkParameterIsNotNull(displayPattern, "displayPattern");
        Intrinsics.checkParameterIsNotNull(lengthType, "lengthType");
        Intrinsics.checkParameterIsNotNull(datePreciseness, "datePreciseness");
        Intrinsics.checkParameterIsNotNull(timePreciseness, "timePreciseness");
        mo191596a(locale);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Options(java.lang.String r11, com.ss.android.lark.time.format.entity.DisplayPattern r12, com.ss.android.lark.time.format.entity.LengthType r13, com.ss.android.lark.time.format.entity.DatePreciseness r14, com.ss.android.lark.time.format.entity.TimePreciseness r15, boolean r16, boolean r17, boolean r18, boolean r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
        /*
            r10 = this;
            r0 = r20
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0009
            java.lang.String r1 = ""
            goto L_0x000a
        L_0x0009:
            r1 = r11
        L_0x000a:
            r2 = r0 & 2
            if (r2 == 0) goto L_0x0011
            com.ss.android.lark.time.format.entity.DisplayPattern r2 = com.ss.android.lark.time.format.entity.DisplayPattern.ABSOLUTE
            goto L_0x0012
        L_0x0011:
            r2 = r12
        L_0x0012:
            r3 = r0 & 4
            if (r3 == 0) goto L_0x0019
            com.ss.android.lark.time.format.entity.LengthType r3 = com.ss.android.lark.time.format.entity.LengthType.LONG
            goto L_0x001a
        L_0x0019:
            r3 = r13
        L_0x001a:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x0021
            com.ss.android.lark.time.format.entity.DatePreciseness r4 = com.ss.android.lark.time.format.entity.DatePreciseness.DAY
            goto L_0x0022
        L_0x0021:
            r4 = r14
        L_0x0022:
            r5 = r0 & 16
            if (r5 == 0) goto L_0x0029
            com.ss.android.lark.time.format.entity.TimePreciseness r5 = com.ss.android.lark.time.format.entity.TimePreciseness.MINUTE
            goto L_0x002a
        L_0x0029:
            r5 = r15
        L_0x002a:
            r6 = r0 & 32
            r7 = 0
            if (r6 == 0) goto L_0x0031
            r6 = 0
            goto L_0x0033
        L_0x0031:
            r6 = r16
        L_0x0033:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0039
            r8 = 0
            goto L_0x003b
        L_0x0039:
            r8 = r17
        L_0x003b:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0041
            r9 = 0
            goto L_0x0043
        L_0x0041:
            r9 = r18
        L_0x0043:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0048
            goto L_0x004a
        L_0x0048:
            r7 = r19
        L_0x004a:
            r11 = r10
            r12 = r1
            r13 = r2
            r14 = r3
            r15 = r4
            r16 = r5
            r17 = r6
            r18 = r8
            r19 = r9
            r20 = r7
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.time.format.Options.<init>(java.lang.String, com.ss.android.lark.time.format.entity.DisplayPattern, com.ss.android.lark.time.format.entity.LengthType, com.ss.android.lark.time.format.entity.DatePreciseness, com.ss.android.lark.time.format.entity.TimePreciseness, boolean, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Options(java.lang.String r12, com.ss.android.lark.time.format.entity.DisplayPattern r13, com.ss.android.lark.time.format.entity.LengthType r14, com.ss.android.lark.time.format.entity.DatePreciseness r15, com.ss.android.lark.time.format.entity.TimePreciseness r16, boolean r17, boolean r18, boolean r19, boolean r20, java.util.Locale r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
        // Method dump skipped, instructions count: 107
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.time.format.Options.<init>(java.lang.String, com.ss.android.lark.time.format.entity.DisplayPattern, com.ss.android.lark.time.format.entity.LengthType, com.ss.android.lark.time.format.entity.DatePreciseness, com.ss.android.lark.time.format.entity.TimePreciseness, boolean, boolean, boolean, boolean, java.util.Locale, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
