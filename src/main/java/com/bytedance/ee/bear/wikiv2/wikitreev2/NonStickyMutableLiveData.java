package com.bytedance.ee.bear.wikiv2.wikitreev2;

import androidx.lifecycle.AbstractC1178x;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0014\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006J\u0014\u0010\u000e\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006J\u0013\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00028\u0000¢\u0006\u0002\u0010\u0011R'\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u00058BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/wikitreev2/NonStickyMutableLiveData;", "T", "", "()V", "observers", "", "Landroidx/lifecycle/Observer;", "getObservers", "()Ljava/util/List;", "observers$delegate", "Lkotlin/Lazy;", "observe", "", "observer", "removeObserver", "setValue", "value", "(Ljava/lang/Object;)V", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.d */
public final class NonStickyMutableLiveData<T> {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f33303a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(NonStickyMutableLiveData.class), "observers", "getObservers()Ljava/util/List;"))};

    /* renamed from: b */
    private final Lazy f33304b = LazyKt.lazy(C12412a.INSTANCE);

    /* renamed from: a */
    private final List<AbstractC1178x<T>> m51615a() {
        Lazy lazy = this.f33304b;
        KProperty kProperty = f33303a[0];
        return (List) lazy.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\u0004\b\u0000\u0010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/Observer;", "T", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.d$a */
    static final class C12412a extends Lambda implements Function0<List<AbstractC1178x<T>>> {
        public static final C12412a INSTANCE = new C12412a();

        C12412a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<AbstractC1178x<T>> invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: b */
    public final void mo47279b(AbstractC1178x<T> xVar) {
        Intrinsics.checkParameterIsNotNull(xVar, "observer");
        m51615a().remove(xVar);
    }

    /* renamed from: a */
    public final void mo47277a(AbstractC1178x<T> xVar) {
        Intrinsics.checkParameterIsNotNull(xVar, "observer");
        m51615a().add(xVar);
    }

    /* renamed from: a */
    public final void mo47278a(T t) {
        for (AbstractC1178x<T> xVar : m51615a()) {
            xVar.onChanged(t);
        }
    }
}
