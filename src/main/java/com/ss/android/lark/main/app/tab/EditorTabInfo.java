package com.ss.android.lark.main.app.tab;

import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001BZ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\r\u0012\b\b\u0004\u0012\u0004\b\b(\u0002\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0002\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R,\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\r\u0012\b\b\u0004\u0012\u0004\b\b(\u0002\u0012\u0004\u0012\u00020\u00060\f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/main/app/tab/EditorTabInfo;", "", "key", "", "name", "icon", "Landroid/graphics/drawable/Drawable;", "unmovable", "", "primaryOnly", "needTint", "mainTabIconFactory", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Drawable;ZZZLkotlin/jvm/functions/Function1;)V", "getIcon", "()Landroid/graphics/drawable/Drawable;", "getKey", "()Ljava/lang/String;", "getMainTabIconFactory", "()Lkotlin/jvm/functions/Function1;", "getName", "getNeedTint", "()Z", "getPrimaryOnly", "getUnmovable", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.main.app.tab.b */
public final class EditorTabInfo {

    /* renamed from: a */
    private final String f112508a;

    /* renamed from: b */
    private final String f112509b;

    /* renamed from: c */
    private final Drawable f112510c;

    /* renamed from: d */
    private final boolean f112511d;

    /* renamed from: e */
    private final boolean f112512e;

    /* renamed from: f */
    private final boolean f112513f;

    /* renamed from: g */
    private final Function1<String, Drawable> f112514g;

    /* renamed from: a */
    public final String mo157553a() {
        return this.f112508a;
    }

    /* renamed from: b */
    public final String mo157554b() {
        return this.f112509b;
    }

    /* renamed from: c */
    public final Drawable mo157555c() {
        return this.f112510c;
    }

    /* renamed from: d */
    public final boolean mo157556d() {
        return this.f112511d;
    }

    /* renamed from: e */
    public final boolean mo157557e() {
        return this.f112512e;
    }

    /* renamed from: f */
    public final boolean mo157558f() {
        return this.f112513f;
    }

    /* renamed from: g */
    public final Function1<String, Drawable> mo157559g() {
        return this.f112514g;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, ? extends android.graphics.drawable.Drawable> */
    /* JADX WARN: Multi-variable type inference failed */
    public EditorTabInfo(String str, String str2, Drawable drawable, boolean z, boolean z2, boolean z3, Function1<? super String, ? extends Drawable> function1) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(str2, "name");
        Intrinsics.checkParameterIsNotNull(drawable, "icon");
        Intrinsics.checkParameterIsNotNull(function1, "mainTabIconFactory");
        this.f112508a = str;
        this.f112509b = str2;
        this.f112510c = drawable;
        this.f112511d = z;
        this.f112512e = z2;
        this.f112513f = z3;
        this.f112514g = function1;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ EditorTabInfo(java.lang.String r10, java.lang.String r11, android.graphics.drawable.Drawable r12, boolean r13, boolean r14, boolean r15, kotlin.jvm.functions.Function1 r16, int r17, kotlin.jvm.internal.DefaultConstructorMarker r18) {
        /*
            r9 = this;
            r0 = r17 & 32
            if (r0 == 0) goto L_0x0007
            r0 = 1
            r7 = 1
            goto L_0x0008
        L_0x0007:
            r7 = r15
        L_0x0008:
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r8 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.main.app.tab.EditorTabInfo.<init>(java.lang.String, java.lang.String, android.graphics.drawable.Drawable, boolean, boolean, boolean, kotlin.jvm.functions.Function1, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
