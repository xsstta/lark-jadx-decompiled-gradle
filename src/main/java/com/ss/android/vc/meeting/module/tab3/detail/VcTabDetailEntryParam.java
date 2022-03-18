package com.ss.android.vc.meeting.module.tab3.detail;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.tab.VCTabListItem;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\b\u0018\u0000 )2\u00020\u0001:\u0002()Ba\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jn\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020\u00062\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\b\u0010'\u001a\u00020\u0003H\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0007\u0010\u0011R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0005\u0010\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006*"}, d2 = {"Lcom/ss/android/vc/meeting/module/tab3/detail/VcTabDetailEntryParam;", "Ljava/io/Serializable;", "meetingId", "", "historyId", "isTryLocal", "", "is1v1", "userId", "tenantId", HiAnalyticsConstant.HaKey.BI_KEY_PHONETYPE, "Lcom/ss/android/vc/entity/tab/VCTabListItem$PhoneType;", "enterprisePhoneNumber", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/vc/entity/tab/VCTabListItem$PhoneType;Ljava/lang/String;)V", "getEnterprisePhoneNumber", "()Ljava/lang/String;", "getHistoryId", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMeetingId", "getPhoneType", "()Lcom/ss/android/vc/entity/tab/VCTabListItem$PhoneType;", "getTenantId", "getUserId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/vc/entity/tab/VCTabListItem$PhoneType;Ljava/lang/String;)Lcom/ss/android/vc/meeting/module/tab3/detail/VcTabDetailEntryParam;", "equals", "other", "", "hashCode", "", "toString", "Builder", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class VcTabDetailEntryParam implements Serializable {
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 1;
    private final String enterprisePhoneNumber;
    private final String historyId;
    private final Boolean is1v1;
    private final Boolean isTryLocal;
    private final String meetingId;
    private final VCTabListItem.PhoneType phoneType;
    private final String tenantId;
    private final String userId;

    public static /* synthetic */ VcTabDetailEntryParam copy$default(VcTabDetailEntryParam vcTabDetailEntryParam, String str, String str2, Boolean bool, Boolean bool2, String str3, String str4, VCTabListItem.PhoneType phoneType2, String str5, int i, Object obj) {
        return vcTabDetailEntryParam.copy((i & 1) != 0 ? vcTabDetailEntryParam.meetingId : str, (i & 2) != 0 ? vcTabDetailEntryParam.historyId : str2, (i & 4) != 0 ? vcTabDetailEntryParam.isTryLocal : bool, (i & 8) != 0 ? vcTabDetailEntryParam.is1v1 : bool2, (i & 16) != 0 ? vcTabDetailEntryParam.userId : str3, (i & 32) != 0 ? vcTabDetailEntryParam.tenantId : str4, (i & 64) != 0 ? vcTabDetailEntryParam.phoneType : phoneType2, (i & SmActions.ACTION_ONTHECALL_EXIT) != 0 ? vcTabDetailEntryParam.enterprisePhoneNumber : str5);
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

    public final String component6() {
        return this.tenantId;
    }

    public final VCTabListItem.PhoneType component7() {
        return this.phoneType;
    }

    public final String component8() {
        return this.enterprisePhoneNumber;
    }

    public final VcTabDetailEntryParam copy(String str, String str2, Boolean bool, Boolean bool2, String str3, String str4, VCTabListItem.PhoneType phoneType2, String str5) {
        return new VcTabDetailEntryParam(str, str2, bool, bool2, str3, str4, phoneType2, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VcTabDetailEntryParam)) {
            return false;
        }
        VcTabDetailEntryParam vcTabDetailEntryParam = (VcTabDetailEntryParam) obj;
        return Intrinsics.areEqual(this.meetingId, vcTabDetailEntryParam.meetingId) && Intrinsics.areEqual(this.historyId, vcTabDetailEntryParam.historyId) && Intrinsics.areEqual(this.isTryLocal, vcTabDetailEntryParam.isTryLocal) && Intrinsics.areEqual(this.is1v1, vcTabDetailEntryParam.is1v1) && Intrinsics.areEqual(this.userId, vcTabDetailEntryParam.userId) && Intrinsics.areEqual(this.tenantId, vcTabDetailEntryParam.tenantId) && Intrinsics.areEqual(this.phoneType, vcTabDetailEntryParam.phoneType) && Intrinsics.areEqual(this.enterprisePhoneNumber, vcTabDetailEntryParam.enterprisePhoneNumber);
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
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.tenantId;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        VCTabListItem.PhoneType phoneType2 = this.phoneType;
        int hashCode7 = (hashCode6 + (phoneType2 != null ? phoneType2.hashCode() : 0)) * 31;
        String str5 = this.enterprisePhoneNumber;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode7 + i;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/vc/meeting/module/tab3/detail/VcTabDetailEntryParam$Companion;", "", "()V", "PARAMETER_ENTRY_DATA", "", "serialVersionUID", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.tab3.detail.VcTabDetailEntryParam$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final String getEnterprisePhoneNumber() {
        return this.enterprisePhoneNumber;
    }

    public final String getHistoryId() {
        return this.historyId;
    }

    public final String getMeetingId() {
        return this.meetingId;
    }

    public final VCTabListItem.PhoneType getPhoneType() {
        return this.phoneType;
    }

    public final String getTenantId() {
        return this.tenantId;
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0004J\u0015\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u0015J\u0015\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u0015J\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\f\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\r\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/vc/meeting/module/tab3/detail/VcTabDetailEntryParam$Builder;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "enterprisePhoneNumber", "historyId", "is1v1", "", "Ljava/lang/Boolean;", "isTryLocal", "meetingId", HiAnalyticsConstant.HaKey.BI_KEY_PHONETYPE, "Lcom/ss/android/vc/entity/tab/VCTabListItem$PhoneType;", "tenantId", "userId", "build", "Lcom/ss/android/vc/meeting/module/tab3/detail/VcTabDetailEntryParam;", "enterpriseNumber", "(Ljava/lang/Boolean;)Lcom/ss/android/vc/meeting/module/tab3/detail/VcTabDetailEntryParam$Builder;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.tab3.detail.VcTabDetailEntryParam$a */
    public static final class Builder {

        /* renamed from: a */
        private final String f159781a = "VcTabDetailEntryParam";

        /* renamed from: b */
        private String f159782b;

        /* renamed from: c */
        private String f159783c;

        /* renamed from: d */
        private Boolean f159784d = false;

        /* renamed from: e */
        private VCTabListItem.PhoneType f159785e = VCTabListItem.PhoneType.VC;

        /* renamed from: f */
        private String f159786f = "";

        /* renamed from: g */
        private Boolean f159787g = false;

        /* renamed from: h */
        private String f159788h;

        /* renamed from: i */
        private String f159789i;

        /* renamed from: a */
        public final VcTabDetailEntryParam mo219151a() {
            VcTabDetailEntryParam vcTabDetailEntryParam = new VcTabDetailEntryParam(this.f159782b, this.f159783c, this.f159784d, this.f159787g, this.f159788h, this.f159789i, this.f159785e, this.f159786f);
            String str = this.f159781a;
            C60700b.m235851b(str, "[build]", "param = " + vcTabDetailEntryParam);
            return vcTabDetailEntryParam;
        }

        /* renamed from: a */
        public final Builder mo219148a(VCTabListItem.PhoneType phoneType) {
            this.f159785e = phoneType;
            return this;
        }

        /* renamed from: b */
        public final Builder mo219152b(Boolean bool) {
            this.f159787g = bool;
            return this;
        }

        /* renamed from: c */
        public final Builder mo219154c(String str) {
            this.f159786f = str;
            return this;
        }

        /* renamed from: d */
        public final Builder mo219155d(String str) {
            this.f159788h = str;
            return this;
        }

        /* renamed from: e */
        public final Builder mo219156e(String str) {
            this.f159789i = str;
            return this;
        }

        /* renamed from: a */
        public final Builder mo219149a(Boolean bool) {
            this.f159784d = bool;
            return this;
        }

        /* renamed from: b */
        public final Builder mo219153b(String str) {
            this.f159783c = str;
            return this;
        }

        /* renamed from: a */
        public final Builder mo219150a(String str) {
            this.f159782b = str;
            return this;
        }
    }

    public String toString() {
        return "VcTabDetailEntryParam(meetingId=" + this.meetingId + ", " + "historyId=" + this.historyId + ", " + "isTryLocal=" + this.isTryLocal + ", " + "is1v1=" + this.is1v1 + ", " + "userId=" + this.userId + ", " + "tenantId=" + this.tenantId + ", " + "phoneType=" + this.phoneType + ", " + ")";
    }

    public VcTabDetailEntryParam(String str, String str2, Boolean bool, Boolean bool2, String str3, String str4, VCTabListItem.PhoneType phoneType2, String str5) {
        this.meetingId = str;
        this.historyId = str2;
        this.isTryLocal = bool;
        this.is1v1 = bool2;
        this.userId = str3;
        this.tenantId = str4;
        this.phoneType = phoneType2;
        this.enterprisePhoneNumber = str5;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ VcTabDetailEntryParam(java.lang.String r12, java.lang.String r13, java.lang.Boolean r14, java.lang.Boolean r15, java.lang.String r16, java.lang.String r17, com.ss.android.vc.entity.tab.VCTabListItem.PhoneType r18, java.lang.String r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
        /*
            r11 = this;
            r0 = r20 & 1
            r1 = 0
            if (r0 == 0) goto L_0x000a
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            r3 = r0
            goto L_0x000b
        L_0x000a:
            r3 = r12
        L_0x000b:
            r0 = r20 & 2
            if (r0 == 0) goto L_0x0014
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            r4 = r0
            goto L_0x0015
        L_0x0014:
            r4 = r13
        L_0x0015:
            r0 = r20 & 4
            r2 = 0
            if (r0 == 0) goto L_0x0020
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r5 = r0
            goto L_0x0021
        L_0x0020:
            r5 = r14
        L_0x0021:
            r0 = r20 & 8
            if (r0 == 0) goto L_0x002b
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r6 = r0
            goto L_0x002c
        L_0x002b:
            r6 = r15
        L_0x002c:
            r0 = r20 & 16
            if (r0 == 0) goto L_0x0035
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            r7 = r0
            goto L_0x0037
        L_0x0035:
            r7 = r16
        L_0x0037:
            r0 = r20 & 32
            if (r0 == 0) goto L_0x0040
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            r8 = r0
            goto L_0x0042
        L_0x0040:
            r8 = r17
        L_0x0042:
            r2 = r11
            r9 = r18
            r10 = r19
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.tab3.detail.VcTabDetailEntryParam.<init>(java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, com.ss.android.vc.entity.tab.VCTabListItem$PhoneType, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
