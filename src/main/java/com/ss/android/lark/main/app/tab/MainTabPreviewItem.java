package com.ss.android.lark.main.app.tab;

import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/main/app/tab/MainTabPreviewItem;", "", "key", "", "name", "icon", "Landroid/graphics/drawable/Drawable;", "needTintIcon", "", "(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Z)V", "getIcon", "()Landroid/graphics/drawable/Drawable;", "getKey", "()Ljava/lang/String;", "getName", "getNeedTintIcon", "()Z", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.main.app.tab.g */
public final class MainTabPreviewItem {

    /* renamed from: a */
    private final String f112542a;

    /* renamed from: b */
    private final String f112543b;

    /* renamed from: c */
    private final Drawable f112544c;

    /* renamed from: d */
    private final boolean f112545d;

    /* renamed from: a */
    public final String mo157602a() {
        return this.f112542a;
    }

    /* renamed from: b */
    public final String mo157603b() {
        return this.f112543b;
    }

    /* renamed from: c */
    public final Drawable mo157604c() {
        return this.f112544c;
    }

    /* renamed from: d */
    public final boolean mo157605d() {
        return this.f112545d;
    }

    public MainTabPreviewItem(String str, String str2, Drawable drawable, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(str2, "name");
        Intrinsics.checkParameterIsNotNull(drawable, "icon");
        this.f112542a = str;
        this.f112543b = str2;
        this.f112544c = drawable;
        this.f112545d = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MainTabPreviewItem(String str, String str2, Drawable drawable, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, drawable, (i & 8) != 0 ? true : z);
    }
}
