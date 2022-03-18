package com.ss.android.lark.setting.page.content.general.feedfilter.dto;

import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012¨\u0006!"}, d2 = {"Lcom/ss/android/lark/setting/page/content/general/feedfilter/dto/FeedTabInfo;", "", "key", "", "name", "icon", "Landroid/graphics/drawable/Drawable;", "unmovable", "", "notRemove", "primaryOnly", "(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Drawable;ZZZ)V", "getIcon", "()Landroid/graphics/drawable/Drawable;", "getKey", "()Ljava/lang/String;", "getName", "getNotRemove", "()Z", "getPrimaryOnly", "getUnmovable", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.dto.c */
public final class FeedTabInfo {

    /* renamed from: a */
    private final String f134784a;

    /* renamed from: b */
    private final String f134785b;

    /* renamed from: c */
    private final Drawable f134786c;

    /* renamed from: d */
    private final boolean f134787d;

    /* renamed from: e */
    private final boolean f134788e;

    /* renamed from: f */
    private final boolean f134789f;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedTabInfo)) {
            return false;
        }
        FeedTabInfo cVar = (FeedTabInfo) obj;
        return Intrinsics.areEqual(this.f134784a, cVar.f134784a) && Intrinsics.areEqual(this.f134785b, cVar.f134785b) && Intrinsics.areEqual(this.f134786c, cVar.f134786c) && this.f134787d == cVar.f134787d && this.f134788e == cVar.f134788e && this.f134789f == cVar.f134789f;
    }

    public int hashCode() {
        String str = this.f134784a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f134785b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Drawable drawable = this.f134786c;
        if (drawable != null) {
            i = drawable.hashCode();
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z = this.f134787d;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (i2 + i4) * 31;
        boolean z2 = this.f134788e;
        if (z2) {
            z2 = true;
        }
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int i11 = (i7 + i8) * 31;
        boolean z3 = this.f134789f;
        if (!z3) {
            i3 = z3 ? 1 : 0;
        }
        return i11 + i3;
    }

    public String toString() {
        return "FeedTabInfo(key=" + this.f134784a + ", name=" + this.f134785b + ", icon=" + this.f134786c + ", unmovable=" + this.f134787d + ", notRemove=" + this.f134788e + ", primaryOnly=" + this.f134789f + ")";
    }

    /* renamed from: a */
    public final String mo186317a() {
        return this.f134784a;
    }

    /* renamed from: b */
    public final String mo186318b() {
        return this.f134785b;
    }

    /* renamed from: c */
    public final Drawable mo186319c() {
        return this.f134786c;
    }

    /* renamed from: d */
    public final boolean mo186320d() {
        return this.f134787d;
    }

    /* renamed from: e */
    public final boolean mo186321e() {
        return this.f134788e;
    }

    /* renamed from: f */
    public final boolean mo186323f() {
        return this.f134789f;
    }

    public FeedTabInfo(String str, String str2, Drawable drawable, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(str2, "name");
        Intrinsics.checkParameterIsNotNull(drawable, "icon");
        this.f134784a = str;
        this.f134785b = str2;
        this.f134786c = drawable;
        this.f134787d = z;
        this.f134788e = z2;
        this.f134789f = z3;
    }
}
