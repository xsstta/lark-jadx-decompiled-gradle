package com.ss.android.lark.mm.module.detail.menu;

import com.ss.android.lark.mm.widget.MmMenuView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u00128\u0010\f\u001a4\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\r¢\u0006\u0002\u0010\u0014J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J;\u0010%\u001a4\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\rHÆ\u0003J\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00072:\b\u0002\u0010\f\u001a4\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\rHÆ\u0001J\u0013\u0010'\u001a\u00020\u00072\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0018RC\u0010\f\u001a4\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016¨\u0006,"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/menu/MmMenu;", "", "titleRes", "", "icon", "iconToken", "isSwitchEnabled", "", "isSwitchOnOff", "onInitListener", "Lcom/ss/android/lark/mm/module/detail/menu/OnInitMenuListener;", "isDisable", "onClickMenuListener", "Lkotlin/Function2;", "Lcom/ss/android/lark/mm/widget/MmMenuView;", "Lkotlin/ParameterName;", "name", "menuView", "isSwitchOn", "", "(IIIZZLcom/ss/android/lark/mm/module/detail/menu/OnInitMenuListener;ZLkotlin/jvm/functions/Function2;)V", "getIcon", "()I", "getIconToken", "()Z", "getOnClickMenuListener", "()Lkotlin/jvm/functions/Function2;", "getOnInitListener", "()Lcom/ss/android/lark/mm/module/detail/menu/OnInitMenuListener;", "getTitleRes", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.menu.c */
public final class MmMenu {

    /* renamed from: a */
    private final int f116206a;

    /* renamed from: b */
    private final int f116207b;

    /* renamed from: c */
    private final int f116208c;

    /* renamed from: d */
    private final boolean f116209d;

    /* renamed from: e */
    private final boolean f116210e;

    /* renamed from: f */
    private final OnInitMenuListener f116211f;

    /* renamed from: g */
    private final boolean f116212g;

    /* renamed from: h */
    private final Function2<MmMenuView, Boolean, Unit> f116213h;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MmMenu)) {
            return false;
        }
        MmMenu cVar = (MmMenu) obj;
        return this.f116206a == cVar.f116206a && this.f116207b == cVar.f116207b && this.f116208c == cVar.f116208c && this.f116209d == cVar.f116209d && this.f116210e == cVar.f116210e && Intrinsics.areEqual(this.f116211f, cVar.f116211f) && this.f116212g == cVar.f116212g && Intrinsics.areEqual(this.f116213h, cVar.f116213h);
    }

    public int hashCode() {
        int i = ((((this.f116206a * 31) + this.f116207b) * 31) + this.f116208c) * 31;
        boolean z = this.f116209d;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (i + i3) * 31;
        boolean z2 = this.f116210e;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        OnInitMenuListener dVar = this.f116211f;
        int i11 = 0;
        int hashCode = (i10 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        boolean z3 = this.f116212g;
        if (!z3) {
            i2 = z3 ? 1 : 0;
        }
        int i12 = (hashCode + i2) * 31;
        Function2<MmMenuView, Boolean, Unit> kVar = this.f116213h;
        if (kVar != null) {
            i11 = kVar.hashCode();
        }
        return i12 + i11;
    }

    public String toString() {
        return "MmMenu(titleRes=" + this.f116206a + ", icon=" + this.f116207b + ", iconToken=" + this.f116208c + ", isSwitchEnabled=" + this.f116209d + ", isSwitchOnOff=" + this.f116210e + ", onInitListener=" + this.f116211f + ", isDisable=" + this.f116212g + ", onClickMenuListener=" + this.f116213h + ")";
    }

    /* renamed from: a */
    public final int mo161993a() {
        return this.f116206a;
    }

    /* renamed from: b */
    public final int mo161994b() {
        return this.f116207b;
    }

    /* renamed from: c */
    public final int mo161995c() {
        return this.f116208c;
    }

    /* renamed from: d */
    public final boolean mo161996d() {
        return this.f116209d;
    }

    /* renamed from: e */
    public final boolean mo161997e() {
        return this.f116210e;
    }

    /* renamed from: f */
    public final OnInitMenuListener mo161999f() {
        return this.f116211f;
    }

    /* renamed from: g */
    public final boolean mo162000g() {
        return this.f116212g;
    }

    /* renamed from: h */
    public final Function2<MmMenuView, Boolean, Unit> mo162001h() {
        return this.f116213h;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: kotlin.jvm.functions.k<? super com.ss.android.lark.mm.widget.MmMenuView, ? super java.lang.Boolean, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public MmMenu(int i, int i2, int i3, boolean z, boolean z2, OnInitMenuListener dVar, boolean z3, Function2<? super MmMenuView, ? super Boolean, Unit> kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "onClickMenuListener");
        this.f116206a = i;
        this.f116207b = i2;
        this.f116208c = i3;
        this.f116209d = z;
        this.f116210e = z2;
        this.f116211f = dVar;
        this.f116212g = z3;
        this.f116213h = kVar;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ MmMenu(int r12, int r13, int r14, boolean r15, boolean r16, com.ss.android.lark.mm.module.detail.menu.OnInitMenuListener r17, boolean r18, kotlin.jvm.functions.Function2 r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
        /*
            r11 = this;
            r0 = r20 & 8
            r1 = 0
            if (r0 == 0) goto L_0x0007
            r6 = 0
            goto L_0x0008
        L_0x0007:
            r6 = r15
        L_0x0008:
            r0 = r20 & 16
            if (r0 == 0) goto L_0x000e
            r7 = 0
            goto L_0x0010
        L_0x000e:
            r7 = r16
        L_0x0010:
            r0 = r20 & 32
            if (r0 == 0) goto L_0x0019
            r0 = 0
            com.ss.android.lark.mm.module.detail.menu.d r0 = (com.ss.android.lark.mm.module.detail.menu.OnInitMenuListener) r0
            r8 = r0
            goto L_0x001b
        L_0x0019:
            r8 = r17
        L_0x001b:
            r0 = r20 & 64
            if (r0 == 0) goto L_0x0021
            r9 = 0
            goto L_0x0023
        L_0x0021:
            r9 = r18
        L_0x0023:
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r10 = r19
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mm.module.detail.menu.MmMenu.<init>(int, int, int, boolean, boolean, com.ss.android.lark.mm.module.detail.menu.d, boolean, kotlin.jvm.functions.k, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
