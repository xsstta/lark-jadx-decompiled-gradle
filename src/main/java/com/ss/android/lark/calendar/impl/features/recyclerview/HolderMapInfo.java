package com.ss.android.lark.calendar.impl.features.recyclerview;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003BS\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0016\u0010\b\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0000\u0012\u00028\u00000\t0\u0005\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007¢\u0006\u0002\u0010\u000eR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R$\u0010\b\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0000\u0012\u00028\u00000\t0\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\r\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/recyclerview/HolderMapInfo;", "T", "", "Lcom/ss/android/lark/calendar/impl/features/recyclerview/HolderMapper;", "dataClass", "Ljava/lang/Class;", "layoutRes", "", "holderClass", "Lcom/ss/android/lark/calendar/impl/features/recyclerview/SimpleHolder;", "isSupport", "Lkotlin/Function1;", "", "viewType", "(Ljava/lang/Class;ILjava/lang/Class;Lkotlin/jvm/functions/Function1;I)V", "getDataClass", "()Ljava/lang/Class;", "getHolderClass", "()Lkotlin/jvm/functions/Function1;", "getLayoutRes", "()I", "getViewType", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.b.c */
public class HolderMapInfo<T> implements HolderMapper<T> {

    /* renamed from: a */
    private final Class<T> f75578a;

    /* renamed from: b */
    private final int f75579b;

    /* renamed from: c */
    private final Class<? extends SimpleHolder<? super T>> f75580c;

    /* renamed from: d */
    private final Function1<T, Boolean> f75581d;

    /* renamed from: e */
    private final int f75582e;

    @Override // com.ss.android.lark.calendar.impl.features.recyclerview.HolderMapper
    /* renamed from: b */
    public Class<T> mo109144b() {
        return this.f75578a;
    }

    @Override // com.ss.android.lark.calendar.impl.features.recyclerview.HolderMapper
    /* renamed from: c */
    public int mo109145c() {
        return this.f75579b;
    }

    @Override // com.ss.android.lark.calendar.impl.features.recyclerview.HolderMapper
    /* renamed from: d */
    public Class<? extends SimpleHolder<? super T>> mo109146d() {
        return this.f75580c;
    }

    @Override // com.ss.android.lark.calendar.impl.features.recyclerview.HolderMapper
    /* renamed from: e */
    public Function1<T, Boolean> mo109147e() {
        return this.f75581d;
    }

    @Override // com.ss.android.lark.calendar.impl.features.recyclerview.HolderMapper
    /* renamed from: f */
    public int mo109148f() {
        return this.f75582e;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> */
    /* JADX WARN: Multi-variable type inference failed */
    public HolderMapInfo(Class<T> cls, int i, Class<? extends SimpleHolder<? super T>> cls2, Function1<? super T, Boolean> function1, int i2) {
        Intrinsics.checkParameterIsNotNull(cls, "dataClass");
        Intrinsics.checkParameterIsNotNull(cls2, "holderClass");
        Intrinsics.checkParameterIsNotNull(function1, "isSupport");
        this.f75578a = cls;
        this.f75579b = i;
        this.f75580c = cls2;
        this.f75581d = function1;
        this.f75582e = i2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ HolderMapInfo(java.lang.Class r7, int r8, java.lang.Class r9, kotlin.jvm.functions.Function1 r10, int r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r6 = this;
            r13 = r12 & 8
            if (r13 == 0) goto L_0x0008
            com.ss.android.lark.calendar.impl.features.b.c$1 r10 = com.ss.android.lark.calendar.impl.features.recyclerview.HolderMapInfo.C302361.INSTANCE
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
        L_0x0008:
            r4 = r10
            r10 = r12 & 16
            if (r10 == 0) goto L_0x000f
            r5 = r8
            goto L_0x0010
        L_0x000f:
            r5 = r11
        L_0x0010:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.recyclerview.HolderMapInfo.<init>(java.lang.Class, int, java.lang.Class, kotlin.jvm.functions.Function1, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
