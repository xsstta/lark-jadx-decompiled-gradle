package com.ss.android.vc.meeting.module.tab.detail;

import com.ss.android.vc.common.p3077b.C60700b;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eBA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JJ\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0007\u0010\fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0005\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001f"}, d2 = {"Lcom/ss/android/vc/meeting/module/tab/detail/VcTabDetailEntryParam;", "Ljava/io/Serializable;", "meetingId", "", "historyId", "isTryLocal", "", "is1v1", "userId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "getHistoryId", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMeetingId", "getUserId", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/ss/android/vc/meeting/module/tab/detail/VcTabDetailEntryParam;", "equals", "other", "", "hashCode", "", "toString", "Builder", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class VcTabDetailEntryParam implements Serializable {
    public static final Companion Companion = new Companion(null);
    private final String historyId;
    private final Boolean is1v1;
    private final Boolean isTryLocal;
    private final String meetingId;
    private final String userId;

    public VcTabDetailEntryParam() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ VcTabDetailEntryParam copy$default(VcTabDetailEntryParam vcTabDetailEntryParam, String str, String str2, Boolean bool, Boolean bool2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vcTabDetailEntryParam.meetingId;
        }
        if ((i & 2) != 0) {
            str2 = vcTabDetailEntryParam.historyId;
        }
        if ((i & 4) != 0) {
            bool = vcTabDetailEntryParam.isTryLocal;
        }
        if ((i & 8) != 0) {
            bool2 = vcTabDetailEntryParam.is1v1;
        }
        if ((i & 16) != 0) {
            str3 = vcTabDetailEntryParam.userId;
        }
        return vcTabDetailEntryParam.copy(str, str2, bool, bool2, str3);
    }

    public final String component1() {
        return this.meetingId;
    }

    public final String component2() {
        return this.historyId;
    }

    public final Boolean component3() {
        return this.isTryLocal;
    }

    public final Boolean component4() {
        return this.is1v1;
    }

    public final String component5() {
        return this.userId;
    }

    public final VcTabDetailEntryParam copy(String str, String str2, Boolean bool, Boolean bool2, String str3) {
        return new VcTabDetailEntryParam(str, str2, bool, bool2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VcTabDetailEntryParam)) {
            return false;
        }
        VcTabDetailEntryParam vcTabDetailEntryParam = (VcTabDetailEntryParam) obj;
        return Intrinsics.areEqual(this.meetingId, vcTabDetailEntryParam.meetingId) && Intrinsics.areEqual(this.historyId, vcTabDetailEntryParam.historyId) && Intrinsics.areEqual(this.isTryLocal, vcTabDetailEntryParam.isTryLocal) && Intrinsics.areEqual(this.is1v1, vcTabDetailEntryParam.is1v1) && Intrinsics.areEqual(this.userId, vcTabDetailEntryParam.userId);
    }

    public int hashCode() {
        String str = this.meetingId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.historyId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool = this.isTryLocal;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.is1v1;
        int hashCode4 = (hashCode3 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        String str3 = this.userId;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        return "VcTabDetailEntryParam(meetingId=" + this.meetingId + ", historyId=" + this.historyId + ", isTryLocal=" + this.isTryLocal + ", is1v1=" + this.is1v1 + ", userId=" + this.userId + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/vc/meeting/module/tab/detail/VcTabDetailEntryParam$Companion;", "", "()V", "PARAMETER_ENTRY_DATA", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.tab.detail.VcTabDetailEntryParam$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final String getHistoryId() {
        return this.historyId;
    }

    public final String getMeetingId() {
        return this.meetingId;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final Boolean is1v1() {
        return this.is1v1;
    }

    public final Boolean isTryLocal() {
        return this.isTryLocal;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004J\u0015\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u0010J\u0015\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u0010J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0004R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0012\u0010\u000b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0010\u0010\f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/vc/meeting/module/tab/detail/VcTabDetailEntryParam$Builder;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "historyId", "is1v1", "", "Ljava/lang/Boolean;", "isTryLocal", "meetingId", "userId", "build", "Lcom/ss/android/vc/meeting/module/tab/detail/VcTabDetailEntryParam;", "(Ljava/lang/Boolean;)Lcom/ss/android/vc/meeting/module/tab/detail/VcTabDetailEntryParam$Builder;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.tab.detail.VcTabDetailEntryParam$a */
    public static final class Builder {

        /* renamed from: a */
        private final String f159424a = "VcTabDetailEntryParam";

        /* renamed from: b */
        private String f159425b;

        /* renamed from: c */
        private String f159426c;

        /* renamed from: d */
        private Boolean f159427d = false;

        /* renamed from: e */
        private Boolean f159428e = false;

        /* renamed from: f */
        private String f159429f;

        /* renamed from: a */
        public final VcTabDetailEntryParam mo218846a() {
            VcTabDetailEntryParam vcTabDetailEntryParam = new VcTabDetailEntryParam(this.f159425b, this.f159426c, this.f159427d, this.f159428e, this.f159429f);
            C60700b.m235851b(this.f159424a, "[build]", String.valueOf(vcTabDetailEntryParam));
            return vcTabDetailEntryParam;
        }

        /* renamed from: a */
        public final Builder mo218844a(Boolean bool) {
            this.f159427d = bool;
            return this;
        }

        /* renamed from: b */
        public final Builder mo218847b(Boolean bool) {
            this.f159428e = bool;
            return this;
        }

        /* renamed from: c */
        public final Builder mo218849c(String str) {
            this.f159429f = str;
            return this;
        }

        /* renamed from: a */
        public final Builder mo218845a(String str) {
            this.f159425b = str;
            return this;
        }

        /* renamed from: b */
        public final Builder mo218848b(String str) {
            this.f159426c = str;
            return this;
        }
    }

    public VcTabDetailEntryParam(String str, String str2, Boolean bool, Boolean bool2, String str3) {
        this.meetingId = str;
        this.historyId = str2;
        this.isTryLocal = bool;
        this.is1v1 = bool2;
        this.userId = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VcTabDetailEntryParam(String str, String str2, Boolean bool, Boolean bool2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : bool, (i & 8) != 0 ? false : bool2, (i & 16) != 0 ? null : str3);
    }
}
