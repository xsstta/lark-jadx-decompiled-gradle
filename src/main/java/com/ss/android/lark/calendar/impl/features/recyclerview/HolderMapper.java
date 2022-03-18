package com.ss.android.lark.calendar.impl.features.recyclerview;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\"\u0010\u0007\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0000\u0012\u00028\u00000\b0\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0006R\u001e\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/recyclerview/HolderMapper;", "T", "", "dataClass", "Ljava/lang/Class;", "getDataClass", "()Ljava/lang/Class;", "holderClass", "Lcom/ss/android/lark/calendar/impl/features/recyclerview/SimpleHolder;", "getHolderClass", "isSupport", "Lkotlin/Function1;", "", "()Lkotlin/jvm/functions/Function1;", "layoutRes", "", "getLayoutRes", "()I", "viewType", "getViewType", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.b.d */
public interface HolderMapper<T> {
    /* renamed from: b */
    Class<T> mo109144b();

    /* renamed from: c */
    int mo109145c();

    /* renamed from: d */
    Class<? extends SimpleHolder<? super T>> mo109146d();

    /* renamed from: e */
    Function1<T, Boolean> mo109147e();

    /* renamed from: f */
    int mo109148f();
}
