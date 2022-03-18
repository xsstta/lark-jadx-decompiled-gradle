package com.ss.android.lark.feed.dto;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J;\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/feed/dto/StrongGuideInfo;", "", "isShowStrongGuide", "", "isSmallB", "isAccessExperiment", "invitationMethod", "", "versionId", "(ZZZII)V", "getInvitationMethod", "()I", "()Z", "getVersionId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.feed.dto.d */
public final class StrongGuideInfo {

    /* renamed from: a */
    private final boolean f97724a;

    /* renamed from: b */
    private final boolean f97725b;

    /* renamed from: c */
    private final boolean f97726c;

    /* renamed from: d */
    private final int f97727d;

    /* renamed from: e */
    private final int f97728e;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StrongGuideInfo)) {
            return false;
        }
        StrongGuideInfo dVar = (StrongGuideInfo) obj;
        return this.f97724a == dVar.f97724a && this.f97725b == dVar.f97725b && this.f97726c == dVar.f97726c && this.f97727d == dVar.f97727d && this.f97728e == dVar.f97728e;
    }

    public int hashCode() {
        boolean z = this.f97724a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        boolean z2 = this.f97725b;
        if (z2) {
            z2 = true;
        }
        int i6 = z2 ? 1 : 0;
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = (i5 + i6) * 31;
        boolean z3 = this.f97726c;
        if (!z3) {
            i = z3 ? 1 : 0;
        }
        return ((((i9 + i) * 31) + this.f97727d) * 31) + this.f97728e;
    }

    public String toString() {
        return "StrongGuideInfo(isShowStrongGuide=" + this.f97724a + ", isSmallB=" + this.f97725b + ", isAccessExperiment=" + this.f97726c + ", invitationMethod=" + this.f97727d + ", versionId=" + this.f97728e + ")";
    }

    /* renamed from: a */
    public final boolean mo139397a() {
        return this.f97724a;
    }

    /* renamed from: b */
    public final boolean mo139398b() {
        return this.f97725b;
    }

    /* renamed from: c */
    public final boolean mo139399c() {
        return this.f97726c;
    }

    /* renamed from: d */
    public final int mo139400d() {
        return this.f97727d;
    }

    /* renamed from: e */
    public final int mo139401e() {
        return this.f97728e;
    }

    public StrongGuideInfo(boolean z, boolean z2, boolean z3, int i, int i2) {
        this.f97724a = z;
        this.f97725b = z2;
        this.f97726c = z3;
        this.f97727d = i;
        this.f97728e = i2;
    }
}
