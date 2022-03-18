package com.ss.android.lark.mine.dto;

import com.bytedance.lark.pb.passport.v1.GetUserSidebarResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\b\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J5\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/mine/dto/SidebarInfo;", "", "sidebarType", "", "sidebarIconKey", "", "sidebarLink", "sidebarShow", "", "(ILjava/lang/String;Ljava/lang/String;Z)V", "getSidebarIconKey", "()Ljava/lang/String;", "getSidebarLink", "getSidebarShow", "()Z", "getSidebarType", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "Companion", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mine.dto.f */
public final class SidebarInfo {

    /* renamed from: a */
    public static final int f115018a = GetUserSidebarResponse.SidebarType.ADMIN.getValue();

    /* renamed from: b */
    public static final int f115019b = GetUserSidebarResponse.SidebarType.UNKNOWN_SIDEBAR_TYPE.getValue();

    /* renamed from: c */
    public static final Companion f115020c = new Companion(null);

    /* renamed from: d */
    private final int f115021d;

    /* renamed from: e */
    private final String f115022e;

    /* renamed from: f */
    private final String f115023f;

    /* renamed from: g */
    private final boolean f115024g;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SidebarInfo)) {
            return false;
        }
        SidebarInfo fVar = (SidebarInfo) obj;
        return this.f115021d == fVar.f115021d && Intrinsics.areEqual(this.f115022e, fVar.f115022e) && Intrinsics.areEqual(this.f115023f, fVar.f115023f) && this.f115024g == fVar.f115024g;
    }

    public int hashCode() {
        int i = this.f115021d * 31;
        String str = this.f115022e;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f115023f;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        int i3 = (hashCode + i2) * 31;
        boolean z = this.f115024g;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        return i3 + i4;
    }

    public String toString() {
        return "SidebarInfo(sidebarType=" + this.f115021d + ", sidebarIconKey=" + this.f115022e + ", sidebarLink=" + this.f115023f + ", sidebarShow=" + this.f115024g + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u00020\u00048\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/mine/dto/SidebarInfo$Companion;", "", "()V", "TYPE_ADMIN", "", "TYPE_ADMIN$annotations", "getTYPE_ADMIN", "()I", "TYPE_UNKNOWN", "TYPE_UNKNOWN$annotations", "getTYPE_UNKNOWN", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.dto.f$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final int mo160311a() {
            return SidebarInfo.f115018a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final String mo160306a() {
        return this.f115023f;
    }

    /* renamed from: b */
    public final boolean mo160307b() {
        return this.f115024g;
    }

    public SidebarInfo(int i, String str, String str2, boolean z) {
        this.f115021d = i;
        this.f115022e = str;
        this.f115023f = str2;
        this.f115024g = z;
    }
}
