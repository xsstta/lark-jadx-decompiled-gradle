package com.bytedance.ee.bear.middleground.feed.data;

import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13604b;
import com.bytedance.ee.util.p700c.C13598b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\"\b\b\u0018\u0000 12\u00020\u0001:\u00011Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0002\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0010HÆ\u0003J\t\u0010#\u001a\u00020\u0010HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\nHÆ\u0003J\t\u0010*\u001a\u00020\fHÆ\u0003J\u0015\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000eHÆ\u0003J\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0010HÆ\u0001J\u0013\u0010-\u001a\u00020\u00102\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\nHÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\u0011\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00062"}, d2 = {"Lcom/bytedance/ee/bear/middleground/feed/data/FeedInfo;", "", "objToken", "", "fileType", "fileId", "feedId", "feedType", "feedOpenFrom", "unreadBadgeCount", "", "bearUrl", "Lcom/bytedance/ee/bear/domain/BearUrl;", "extra", "", "isLarkFeed", "", "isFeedAutoShow", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/bytedance/ee/bear/domain/BearUrl;Ljava/util/Map;ZZ)V", "getBearUrl", "()Lcom/bytedance/ee/bear/domain/BearUrl;", "getExtra", "()Ljava/util/Map;", "getFeedId", "()Ljava/lang/String;", "getFeedOpenFrom", "getFeedType", "getFileId", "getFileType", "()Z", "getObjToken", "getUnreadBadgeCount", "()I", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "Companion", "middleground-feed_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.feed.a.d */
public final class FeedInfo {

    /* renamed from: a */
    public static final Companion f25325a = new Companion(null);

    /* renamed from: b */
    private final String f25326b;

    /* renamed from: c */
    private final String f25327c;

    /* renamed from: d */
    private final String f25328d;

    /* renamed from: e */
    private final String f25329e;

    /* renamed from: f */
    private final String f25330f;

    /* renamed from: g */
    private final String f25331g;

    /* renamed from: h */
    private final int f25332h;

    /* renamed from: i */
    private final BearUrl f25333i;

    /* renamed from: j */
    private final Map<String, String> f25334j;

    /* renamed from: k */
    private final boolean f25335k;

    /* renamed from: l */
    private final boolean f25336l;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FeedInfo) {
                FeedInfo dVar = (FeedInfo) obj;
                if (Intrinsics.areEqual(this.f25326b, dVar.f25326b) && Intrinsics.areEqual(this.f25327c, dVar.f25327c) && Intrinsics.areEqual(this.f25328d, dVar.f25328d) && Intrinsics.areEqual(this.f25329e, dVar.f25329e) && Intrinsics.areEqual(this.f25330f, dVar.f25330f) && Intrinsics.areEqual(this.f25331g, dVar.f25331g)) {
                    if ((this.f25332h == dVar.f25332h) && Intrinsics.areEqual(this.f25333i, dVar.f25333i) && Intrinsics.areEqual(this.f25334j, dVar.f25334j)) {
                        if (this.f25335k == dVar.f25335k) {
                            if (this.f25336l == dVar.f25336l) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f25326b;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f25327c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f25328d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f25329e;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f25330f;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f25331g;
        int hashCode6 = (((hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f25332h) * 31;
        BearUrl bearUrl = this.f25333i;
        int hashCode7 = (hashCode6 + (bearUrl != null ? bearUrl.hashCode() : 0)) * 31;
        Map<String, String> map = this.f25334j;
        if (map != null) {
            i = map.hashCode();
        }
        int i2 = (hashCode7 + i) * 31;
        boolean z = this.f25335k;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (i2 + i4) * 31;
        boolean z2 = this.f25336l;
        if (!z2) {
            i3 = z2 ? 1 : 0;
        }
        return i7 + i3;
    }

    public String toString() {
        return "FeedInfo(objToken=" + this.f25326b + ", fileType=" + this.f25327c + ", fileId=" + this.f25328d + ", feedId=" + this.f25329e + ", feedType=" + this.f25330f + ", feedOpenFrom=" + this.f25331g + ", unreadBadgeCount=" + this.f25332h + ", bearUrl=" + this.f25333i + ", extra=" + this.f25334j + ", isLarkFeed=" + this.f25335k + ", isFeedAutoShow=" + this.f25336l + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/middleground/feed/data/FeedInfo$Companion;", "", "()V", "TAG", "", "parseFrom", "Lcom/bytedance/ee/bear/middleground/feed/data/FeedInfo;", "bearUrl", "Lcom/bytedance/ee/bear/domain/BearUrl;", "extra", "", "middleground-feed_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.feed.a.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final FeedInfo mo35915a(BearUrl bearUrl, Map<String, String> map) {
            boolean z;
            if (bearUrl == null) {
                return null;
            }
            if (map == null || map.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return null;
            }
            try {
                String str = bearUrl.f17447b;
                Intrinsics.checkExpressionValueIsNotNull(str, "bearUrl.token");
                String str2 = bearUrl.f17446a;
                Intrinsics.checkExpressionValueIsNotNull(str2, "bearUrl.type");
                String d = C13598b.m55197d(str);
                Intrinsics.checkExpressionValueIsNotNull(d, "EncriptUtils.handleEncription(objToken)");
                String c = C13604b.m55241c(bearUrl.f17450e);
                Intrinsics.checkExpressionValueIsNotNull(c, "FeedUtils.getFeedId(bearUrl.url)");
                String c2 = C13604b.m55242c(map);
                Intrinsics.checkExpressionValueIsNotNull(c2, "FeedUtils.getFeedDocMessageType(extra)");
                String b = C13604b.m55239b(bearUrl.f17450e);
                Intrinsics.checkExpressionValueIsNotNull(b, "FeedUtils.getFeedFrom(bearUrl.url)");
                return new FeedInfo(str, str2, d, c, c2, b, C13604b.m55233a(map), bearUrl, map, C13604b.m55237a(bearUrl.f17450e), C13604b.m55240b(map));
            } catch (Throwable th) {
                C13479a.m54761a("FeedInfo", th);
                return null;
            }
        }
    }

    /* renamed from: a */
    public final String mo35904a() {
        return this.f25327c;
    }

    /* renamed from: b */
    public final String mo35905b() {
        return this.f25328d;
    }

    /* renamed from: c */
    public final String mo35906c() {
        return this.f25329e;
    }

    /* renamed from: d */
    public final String mo35907d() {
        return this.f25330f;
    }

    /* renamed from: e */
    public final String mo35908e() {
        return this.f25331g;
    }

    /* renamed from: f */
    public final int mo35910f() {
        return this.f25332h;
    }

    /* renamed from: g */
    public final boolean mo35911g() {
        return this.f25335k;
    }

    /* renamed from: h */
    public final boolean mo35912h() {
        return this.f25336l;
    }

    public FeedInfo(String str, String str2, String str3, String str4, String str5, String str6, int i, BearUrl bearUrl, Map<String, String> map, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(str, "objToken");
        Intrinsics.checkParameterIsNotNull(str2, "fileType");
        Intrinsics.checkParameterIsNotNull(str3, "fileId");
        Intrinsics.checkParameterIsNotNull(str4, "feedId");
        Intrinsics.checkParameterIsNotNull(str5, "feedType");
        Intrinsics.checkParameterIsNotNull(str6, "feedOpenFrom");
        Intrinsics.checkParameterIsNotNull(bearUrl, "bearUrl");
        Intrinsics.checkParameterIsNotNull(map, "extra");
        this.f25326b = str;
        this.f25327c = str2;
        this.f25328d = str3;
        this.f25329e = str4;
        this.f25330f = str5;
        this.f25331g = str6;
        this.f25332h = i;
        this.f25333i = bearUrl;
        this.f25334j = map;
        this.f25335k = z;
        this.f25336l = z2;
    }
}
