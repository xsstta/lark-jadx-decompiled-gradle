package com.ss.android.lark.readstate.impl.detail.vo;

import com.ss.android.lark.readstate.impl.detail.C53123f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b \b\b\u0018\u00002\u00020\u0001B]\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0011J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\t\u0010%\u001a\u00020\u000bHÆ\u0003J\t\u0010&\u001a\u00020\u000bHÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000fHÆ\u0003Js\u0010*\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010+\u001a\u00020\u000b2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\bHÖ\u0001J\t\u0010.\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0013\"\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001a¨\u0006/"}, d2 = {"Lcom/ss/android/lark/readstate/impl/detail/vo/ShowReadStateResult;", "", "readList", "", "Lcom/ss/android/lark/readstate/impl/detail/ReadStateEntity;", "unreadList", "", "readCount", "", "unReadCount", "showSearchBox", "", "showLimit", "columnCount", "readCursor", "", "unReadCursor", "(Ljava/util/List;Ljava/util/List;IIZZILjava/lang/String;Ljava/lang/String;)V", "getColumnCount", "()I", "getReadCount", "setReadCount", "(I)V", "getReadCursor", "()Ljava/lang/String;", "getReadList", "()Ljava/util/List;", "getShowLimit", "()Z", "getShowSearchBox", "getUnReadCount", "getUnReadCursor", "getUnreadList", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "im_readstate_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.readstate.impl.detail.a.b */
public final class ShowReadStateResult {

    /* renamed from: a */
    private final List<C53123f> f131349a;

    /* renamed from: b */
    private final List<C53123f> f131350b;

    /* renamed from: c */
    private int f131351c;

    /* renamed from: d */
    private final int f131352d;

    /* renamed from: e */
    private final boolean f131353e;

    /* renamed from: f */
    private final boolean f131354f;

    /* renamed from: g */
    private final int f131355g;

    /* renamed from: h */
    private final String f131356h;

    /* renamed from: i */
    private final String f131357i;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShowReadStateResult) {
                ShowReadStateResult bVar = (ShowReadStateResult) obj;
                if (Intrinsics.areEqual(this.f131349a, bVar.f131349a) && Intrinsics.areEqual(this.f131350b, bVar.f131350b)) {
                    if (this.f131351c == bVar.f131351c) {
                        if (this.f131352d == bVar.f131352d) {
                            if (this.f131353e == bVar.f131353e) {
                                if (this.f131354f == bVar.f131354f) {
                                    if (!(this.f131355g == bVar.f131355g) || !Intrinsics.areEqual(this.f131356h, bVar.f131356h) || !Intrinsics.areEqual(this.f131357i, bVar.f131357i)) {
                                        return false;
                                    }
                                }
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
        List<C53123f> list = this.f131349a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<C53123f> list2 = this.f131350b;
        int hashCode2 = (((((hashCode + (list2 != null ? list2.hashCode() : 0)) * 31) + this.f131351c) * 31) + this.f131352d) * 31;
        boolean z = this.f131353e;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode2 + i3) * 31;
        boolean z2 = this.f131354f;
        if (!z2) {
            i2 = z2 ? 1 : 0;
        }
        int i7 = (((i6 + i2) * 31) + this.f131355g) * 31;
        String str = this.f131356h;
        int hashCode3 = (i7 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f131357i;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "ShowReadStateResult(readList=" + this.f131349a + ", unreadList=" + this.f131350b + ", readCount=" + this.f131351c + ", unReadCount=" + this.f131352d + ", showSearchBox=" + this.f131353e + ", showLimit=" + this.f131354f + ", columnCount=" + this.f131355g + ", readCursor=" + this.f131356h + ", unReadCursor=" + this.f131357i + ")";
    }

    /* renamed from: a */
    public final List<C53123f> mo181424a() {
        return this.f131349a;
    }

    /* renamed from: b */
    public final List<C53123f> mo181425b() {
        return this.f131350b;
    }

    /* renamed from: c */
    public final int mo181426c() {
        return this.f131351c;
    }

    /* renamed from: d */
    public final int mo181427d() {
        return this.f131352d;
    }

    /* renamed from: e */
    public final boolean mo181428e() {
        return this.f131353e;
    }

    /* renamed from: f */
    public final int mo181430f() {
        return this.f131355g;
    }

    /* renamed from: g */
    public final String mo181431g() {
        return this.f131356h;
    }

    /* renamed from: h */
    public final String mo181432h() {
        return this.f131357i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.ss.android.lark.readstate.impl.detail.f> */
    /* JADX WARN: Multi-variable type inference failed */
    public ShowReadStateResult(List<C53123f> list, List<? extends C53123f> list2, int i, int i2, boolean z, boolean z2, int i3, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(list, "readList");
        Intrinsics.checkParameterIsNotNull(list2, "unreadList");
        this.f131349a = list;
        this.f131350b = list2;
        this.f131351c = i;
        this.f131352d = i2;
        this.f131353e = z;
        this.f131354f = z2;
        this.f131355g = i3;
        this.f131356h = str;
        this.f131357i = str2;
    }
}
