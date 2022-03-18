package com.ss.android.lark.openplatform.openapp;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001B5\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0007HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J;\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u00100\u001a\u00020\u00072\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020$HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u000b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u001a\u0010#\u001a\u00020$X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\r¨\u00064"}, d2 = {"Lcom/ss/android/lark/openplatform/openapp/BotOpenData;", "", "id", "", "idType", "Lcom/ss/android/lark/openplatform/openapp/ID_TYPE;", "peekFeed", "", "fromTag", "sourceType", "(Ljava/lang/String;Lcom/ss/android/lark/openplatform/openapp/ID_TYPE;ZLjava/lang/String;Ljava/lang/String;)V", "appId", "getAppId", "()Ljava/lang/String;", "setAppId", "(Ljava/lang/String;)V", "chatId", "getChatId", "setChatId", "feedData", "Lcom/ss/android/lark/openplatform/openapp/FeedData;", "getFeedData", "()Lcom/ss/android/lark/openplatform/openapp/FeedData;", "setFeedData", "(Lcom/ss/android/lark/openplatform/openapp/FeedData;)V", "getFromTag", "getId", "getIdType", "()Lcom/ss/android/lark/openplatform/openapp/ID_TYPE;", "needResume", "getNeedResume", "()Z", "setNeedResume", "(Z)V", "getPeekFeed", "position", "", "getPosition", "()I", "setPosition", "(I)V", "getSourceType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "open-platform_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.openplatform.openapp.b */
public final class BotOpenData {

    /* renamed from: a */
    private int f122674a;

    /* renamed from: b */
    private boolean f122675b;

    /* renamed from: c */
    private String f122676c;

    /* renamed from: d */
    private final String f122677d;

    /* renamed from: e */
    private final ID_TYPE f122678e;

    /* renamed from: f */
    private final boolean f122679f;

    /* renamed from: g */
    private final String f122680g;

    /* renamed from: h */
    private final String f122681h;

    public BotOpenData(String str, ID_TYPE id_type) {
        this(str, id_type, false, null, null, 28, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BotOpenData)) {
            return false;
        }
        BotOpenData bVar = (BotOpenData) obj;
        return Intrinsics.areEqual(this.f122677d, bVar.f122677d) && Intrinsics.areEqual(this.f122678e, bVar.f122678e) && this.f122679f == bVar.f122679f && Intrinsics.areEqual(this.f122680g, bVar.f122680g) && Intrinsics.areEqual(this.f122681h, bVar.f122681h);
    }

    public int hashCode() {
        String str = this.f122677d;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        ID_TYPE id_type = this.f122678e;
        int hashCode2 = (hashCode + (id_type != null ? id_type.hashCode() : 0)) * 31;
        boolean z = this.f122679f;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode2 + i2) * 31;
        String str2 = this.f122680g;
        int hashCode3 = (i5 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f122681h;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "BotOpenData(id=" + this.f122677d + ", idType=" + this.f122678e + ", peekFeed=" + this.f122679f + ", fromTag=" + this.f122680g + ", sourceType=" + this.f122681h + ")";
    }

    /* renamed from: a */
    public final int mo170592a() {
        return this.f122674a;
    }

    /* renamed from: b */
    public final boolean mo170595b() {
        return this.f122675b;
    }

    /* renamed from: c */
    public final String mo170596c() {
        return this.f122676c;
    }

    /* renamed from: d */
    public final String mo170597d() {
        return this.f122677d;
    }

    /* renamed from: e */
    public final ID_TYPE mo170598e() {
        return this.f122678e;
    }

    /* renamed from: f */
    public final String mo170600f() {
        return this.f122680g;
    }

    /* renamed from: g */
    public final String mo170601g() {
        return this.f122681h;
    }

    /* renamed from: a */
    public final void mo170593a(int i) {
        this.f122674a = i;
    }

    /* renamed from: a */
    public final void mo170594a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f122676c = str;
    }

    public BotOpenData(String str, ID_TYPE id_type, boolean z, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(id_type, "idType");
        Intrinsics.checkParameterIsNotNull(str2, "fromTag");
        Intrinsics.checkParameterIsNotNull(str3, "sourceType");
        this.f122677d = str;
        this.f122678e = id_type;
        this.f122679f = z;
        this.f122680g = str2;
        this.f122681h = str3;
        this.f122674a = -1;
        this.f122676c = "";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BotOpenData(java.lang.String r7, com.ss.android.lark.openplatform.openapp.ID_TYPE r8, boolean r9, java.lang.String r10, java.lang.String r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r6 = this;
            r13 = r12 & 4
            if (r13 == 0) goto L_0x0007
            r9 = 0
            r3 = 0
            goto L_0x0008
        L_0x0007:
            r3 = r9
        L_0x0008:
            r9 = r12 & 8
            java.lang.String r13 = ""
            if (r9 == 0) goto L_0x0010
            r4 = r13
            goto L_0x0011
        L_0x0010:
            r4 = r10
        L_0x0011:
            r9 = r12 & 16
            if (r9 == 0) goto L_0x0017
            r5 = r13
            goto L_0x0018
        L_0x0017:
            r5 = r11
        L_0x0018:
            r0 = r6
            r1 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.openplatform.openapp.BotOpenData.<init>(java.lang.String, com.ss.android.lark.openplatform.openapp.ID_TYPE, boolean, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
