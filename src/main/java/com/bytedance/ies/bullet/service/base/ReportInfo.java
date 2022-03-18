package com.bytedance.ies.bullet.service.base;

import com.bytedance.ies.bullet.service.base.utils.Identifier;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 12\u00020\u0001:\u00011Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0014\"\u0004\b#\u0010\u0016R\u001c\u0010$\u001a\u0004\u0018\u00010%X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0010\"\u0004\b+\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0010\"\u0004\b-\u0010\u0012R\u001c\u0010.\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0010\"\u0004\b0\u0010\u0012¨\u00062"}, d2 = {"Lcom/bytedance/ies/bullet/service/base/ReportInfo;", "", "eventName", "", "url", "platform", "category", "Lorg/json/JSONObject;", "metrics", "highFrequency", "", "common", "extra", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/Boolean;Lorg/json/JSONObject;Lorg/json/JSONObject;)V", "bizTag", "getBizTag", "()Ljava/lang/String;", "setBizTag", "(Ljava/lang/String;)V", "getCategory", "()Lorg/json/JSONObject;", "setCategory", "(Lorg/json/JSONObject;)V", "getCommon", "setCommon", "getEventName", "setEventName", "getExtra", "setExtra", "getHighFrequency", "()Ljava/lang/Boolean;", "setHighFrequency", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getMetrics", "setMetrics", "pageIdentifier", "Lcom/bytedance/ies/bullet/service/base/utils/Identifier;", "getPageIdentifier", "()Lcom/bytedance/ies/bullet/service/base/utils/Identifier;", "setPageIdentifier", "(Lcom/bytedance/ies/bullet/service/base/utils/Identifier;)V", "getPlatform", "setPlatform", "getUrl", "setUrl", "virtualAID", "getVirtualAID", "setVirtualAID", "Companion", "x-servicecenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.bullet.service.base.l */
public final class ReportInfo {

    /* renamed from: a */
    public static final Companion f37887a = new Companion(null);

    /* renamed from: b */
    private String f37888b;

    /* renamed from: c */
    private String f37889c;

    /* renamed from: d */
    private Identifier f37890d;

    /* renamed from: e */
    private String f37891e;

    /* renamed from: f */
    private String f37892f;

    /* renamed from: g */
    private String f37893g;

    /* renamed from: h */
    private JSONObject f37894h;

    /* renamed from: i */
    private JSONObject f37895i;

    /* renamed from: j */
    private Boolean f37896j;

    /* renamed from: k */
    private JSONObject f37897k;

    /* renamed from: l */
    private JSONObject f37898l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/bytedance/ies/bullet/service/base/ReportInfo$Companion;", "", "()V", "PLATFORM_LYNX", "", "PLATFORM_RN", "PLATFORM_UNKNOWN", "PLATFORM_WEB", "x-servicecenter_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.bullet.service.base.l$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final String mo52678a() {
        return this.f37888b;
    }

    /* renamed from: b */
    public final String mo52682b() {
        return this.f37889c;
    }

    /* renamed from: c */
    public final Identifier mo52684c() {
        return this.f37890d;
    }

    /* renamed from: d */
    public final String mo52685d() {
        return this.f37891e;
    }

    /* renamed from: e */
    public final String mo52686e() {
        return this.f37892f;
    }

    /* renamed from: f */
    public final String mo52687f() {
        return this.f37893g;
    }

    /* renamed from: g */
    public final JSONObject mo52688g() {
        return this.f37894h;
    }

    /* renamed from: h */
    public final JSONObject mo52689h() {
        return this.f37895i;
    }

    /* renamed from: i */
    public final Boolean mo52690i() {
        return this.f37896j;
    }

    /* renamed from: j */
    public final JSONObject mo52691j() {
        return this.f37897k;
    }

    /* renamed from: k */
    public final JSONObject mo52692k() {
        return this.f37898l;
    }

    /* renamed from: a */
    public final void mo52679a(Boolean bool) {
        this.f37896j = bool;
    }

    /* renamed from: b */
    public final void mo52683b(JSONObject jSONObject) {
        this.f37895i = jSONObject;
    }

    /* renamed from: a */
    public final void mo52680a(String str) {
        this.f37892f = str;
    }

    /* renamed from: a */
    public final void mo52681a(JSONObject jSONObject) {
        this.f37894h = jSONObject;
    }

    public ReportInfo(String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, Boolean bool, JSONObject jSONObject3, JSONObject jSONObject4) {
        Intrinsics.checkParameterIsNotNull(str, "eventName");
        this.f37891e = str;
        this.f37892f = str2;
        this.f37893g = str3;
        this.f37894h = jSONObject;
        this.f37895i = jSONObject2;
        this.f37896j = bool;
        this.f37897k = jSONObject3;
        this.f37898l = jSONObject4;
        this.f37889c = "";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ReportInfo(java.lang.String r9, java.lang.String r10, java.lang.String r11, org.json.JSONObject r12, org.json.JSONObject r13, java.lang.Boolean r14, org.json.JSONObject r15, org.json.JSONObject r16, int r17, kotlin.jvm.internal.DefaultConstructorMarker r18) {
        /*
            r8 = this;
            r0 = r17
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L_0x000b
            r1 = r2
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x000c
        L_0x000b:
            r1 = r10
        L_0x000c:
            r3 = r0 & 4
            if (r3 == 0) goto L_0x0014
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x0015
        L_0x0014:
            r3 = r11
        L_0x0015:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x001d
            r4 = r2
            org.json.JSONObject r4 = (org.json.JSONObject) r4
            goto L_0x001e
        L_0x001d:
            r4 = r12
        L_0x001e:
            r5 = r0 & 16
            if (r5 == 0) goto L_0x0026
            r5 = r2
            org.json.JSONObject r5 = (org.json.JSONObject) r5
            goto L_0x0027
        L_0x0026:
            r5 = r13
        L_0x0027:
            r6 = r0 & 32
            if (r6 == 0) goto L_0x0031
            r6 = 0
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            goto L_0x0032
        L_0x0031:
            r6 = r14
        L_0x0032:
            r7 = r0 & 64
            if (r7 == 0) goto L_0x003a
            r7 = r2
            org.json.JSONObject r7 = (org.json.JSONObject) r7
            goto L_0x003b
        L_0x003a:
            r7 = r15
        L_0x003b:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0043
            r0 = r2
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            goto L_0x0045
        L_0x0043:
            r0 = r16
        L_0x0045:
            r10 = r8
            r11 = r9
            r12 = r1
            r13 = r3
            r14 = r4
            r15 = r5
            r16 = r6
            r17 = r7
            r18 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.service.base.ReportInfo.<init>(java.lang.String, java.lang.String, java.lang.String, org.json.JSONObject, org.json.JSONObject, java.lang.Boolean, org.json.JSONObject, org.json.JSONObject, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
