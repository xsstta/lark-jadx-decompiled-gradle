package com.ss.android.lark.setting.dto;

import com.ss.android.lark.biz.core.api.BadgeStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/setting/dto/BadgeSetting;", "", "badgeStyle", "Lcom/ss/android/lark/biz/core/api/BadgeStyle;", "navShowMuteBadge", "", "(Lcom/ss/android/lark/biz/core/api/BadgeStyle;Z)V", "getBadgeStyle", "()Lcom/ss/android/lark/biz/core/api/BadgeStyle;", "getNavShowMuteBadge", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.setting.dto.a */
public final class BadgeSetting {

    /* renamed from: a */
    private final BadgeStyle f133996a;

    /* renamed from: b */
    private final boolean f133997b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BadgeSetting)) {
            return false;
        }
        BadgeSetting aVar = (BadgeSetting) obj;
        return Intrinsics.areEqual(this.f133996a, aVar.f133996a) && this.f133997b == aVar.f133997b;
    }

    public int hashCode() {
        BadgeStyle badgeStyle = this.f133996a;
        int hashCode = (badgeStyle != null ? badgeStyle.hashCode() : 0) * 31;
        boolean z = this.f133997b;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return hashCode + i;
    }

    public String toString() {
        return "BadgeSetting(badgeStyle=" + this.f133996a + ", navShowMuteBadge=" + this.f133997b + ")";
    }

    /* renamed from: a */
    public final BadgeStyle mo185280a() {
        return this.f133996a;
    }

    /* renamed from: b */
    public final boolean mo185281b() {
        return this.f133997b;
    }

    public BadgeSetting(BadgeStyle badgeStyle, boolean z) {
        Intrinsics.checkParameterIsNotNull(badgeStyle, "badgeStyle");
        this.f133996a = badgeStyle;
        this.f133997b = z;
    }
}
