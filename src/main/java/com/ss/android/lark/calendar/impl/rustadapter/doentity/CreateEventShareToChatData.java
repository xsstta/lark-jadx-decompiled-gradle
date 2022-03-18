package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003JG\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020\t2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0016\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\r\"\u0004\b\u001c\u0010\u000f¨\u0006)"}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CreateEventShareToChatData;", "", "calendarId", "", "key", "originalTime", "", "shareToChatId", "isSuccess", "", "failedChatName", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ZLjava/lang/String;)V", "getCalendarId", "()Ljava/lang/String;", "setCalendarId", "(Ljava/lang/String;)V", "getFailedChatName", "setFailedChatName", "()Z", "setSuccess", "(Z)V", "getKey", "setKey", "getOriginalTime", "()J", "setOriginalTime", "(J)V", "getShareToChatId", "setShareToChatId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.rustadapter.doentity.e */
public final class CreateEventShareToChatData {

    /* renamed from: a */
    private String f83597a;

    /* renamed from: b */
    private String f83598b;

    /* renamed from: c */
    private long f83599c;

    /* renamed from: d */
    private String f83600d;

    /* renamed from: e */
    private boolean f83601e;

    /* renamed from: f */
    private String f83602f;

    /* renamed from: a */
    public final String mo120078a() {
        return this.f83597a;
    }

    /* renamed from: b */
    public final String mo120079b() {
        return this.f83598b;
    }

    /* renamed from: c */
    public final long mo120080c() {
        return this.f83599c;
    }

    /* renamed from: d */
    public final boolean mo120081d() {
        return this.f83601e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateEventShareToChatData)) {
            return false;
        }
        CreateEventShareToChatData eVar = (CreateEventShareToChatData) obj;
        return Intrinsics.areEqual(this.f83597a, eVar.f83597a) && Intrinsics.areEqual(this.f83598b, eVar.f83598b) && this.f83599c == eVar.f83599c && Intrinsics.areEqual(this.f83600d, eVar.f83600d) && this.f83601e == eVar.f83601e && Intrinsics.areEqual(this.f83602f, eVar.f83602f);
    }

    public int hashCode() {
        String str = this.f83597a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f83598b;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        long j = this.f83599c;
        int i2 = (((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        String str3 = this.f83600d;
        int hashCode3 = (i2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z = this.f83601e;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode3 + i3) * 31;
        String str4 = this.f83602f;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i6 + i;
    }

    public String toString() {
        return "CreateEventShareToChatData(calendarId=" + this.f83597a + ", key=" + this.f83598b + ", originalTime=" + this.f83599c + ", shareToChatId=" + this.f83600d + ", isSuccess=" + this.f83601e + ", failedChatName=" + this.f83602f + ")";
    }

    public CreateEventShareToChatData(String str, String str2, long j, String str3, boolean z, String str4) {
        Intrinsics.checkParameterIsNotNull(str, "calendarId");
        Intrinsics.checkParameterIsNotNull(str2, "key");
        Intrinsics.checkParameterIsNotNull(str3, "shareToChatId");
        this.f83597a = str;
        this.f83598b = str2;
        this.f83599c = j;
        this.f83600d = str3;
        this.f83601e = z;
        this.f83602f = str4;
    }
}
