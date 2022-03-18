package com.larksuite.arch.jack;

import androidx.lifecycle.LifecycleOwner;
import com.larksuite.arch.jack.ISubscriber;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty1;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003R\u0014\u0010\u0004\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/larksuite/arch/jack/IdentitySubscriber;", "Lcom/larksuite/arch/jack/ISubscriber;", "Lcom/larksuite/arch/jack/LifecycleOwnerHolder;", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwnerHolder", "getLifecycleOwnerHolder", "()Lcom/larksuite/arch/jack/LifecycleOwnerHolder;", "jack_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.arch.jack.i */
public interface IdentitySubscriber extends LifecycleOwner, ISubscriber, LifecycleOwnerHolder {

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.arch.jack.i$a */
    public static final class C24025a {
        /* renamed from: a */
        public static <S extends State> Disposable m87819a(IdentitySubscriber iVar, JackViewModel<S> lVar, SubscriptionConfig<S> vVar, Function1<? super S, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(lVar, "$this$subscribe");
            Intrinsics.checkParameterIsNotNull(vVar, "config");
            Intrinsics.checkParameterIsNotNull(function1, "subscriber");
            return ISubscriber.C24024a.m87807a(iVar, lVar, vVar, function1);
        }

        /* renamed from: a */
        public static <S extends State, A> Disposable m87820a(IdentitySubscriber iVar, JackViewModel<S> lVar, KProperty1<S, ? extends A> eVar, SubscriptionConfig<Tuple1<A>> vVar, Function1<? super S, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(lVar, "$this$selectSubscribe");
            Intrinsics.checkParameterIsNotNull(eVar, "prop1");
            Intrinsics.checkParameterIsNotNull(vVar, "config");
            Intrinsics.checkParameterIsNotNull(function1, "subscriber");
            return ISubscriber.C24024a.m87809a(iVar, lVar, eVar, vVar, function1);
        }

        /* renamed from: a */
        public static <S extends State, T> Disposable m87821a(IdentitySubscriber iVar, JackViewModel<S> lVar, KProperty1<S, ? extends Async<? extends T>> eVar, SubscriptionConfig<Tuple1<Async<T>>> vVar, Function1<? super Throwable, Unit> function1, Function0<Unit> function0, Function1<? super T, Unit> function12) {
            Intrinsics.checkParameterIsNotNull(lVar, "$this$asyncSubscribe");
            Intrinsics.checkParameterIsNotNull(eVar, "prop");
            Intrinsics.checkParameterIsNotNull(vVar, "config");
            return ISubscriber.C24024a.m87811a(iVar, lVar, eVar, vVar, function1, function0, function12);
        }

        /* renamed from: a */
        public static <S extends State, A, B> Disposable m87822a(IdentitySubscriber iVar, JackViewModel<S> lVar, KProperty1<S, ? extends A> eVar, KProperty1<S, ? extends B> eVar2, SubscriptionConfig<Tuple2<A, B>> vVar, Function1<? super S, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(lVar, "$this$selectSubscribe");
            Intrinsics.checkParameterIsNotNull(eVar, "prop1");
            Intrinsics.checkParameterIsNotNull(eVar2, "prop2");
            Intrinsics.checkParameterIsNotNull(vVar, "config");
            Intrinsics.checkParameterIsNotNull(function1, "subscriber");
            return ISubscriber.C24024a.m87813a(iVar, lVar, eVar, eVar2, vVar, function1);
        }

        /* renamed from: a */
        public static <S extends State, A, B, C> Disposable m87823a(IdentitySubscriber iVar, JackViewModel<S> lVar, KProperty1<S, ? extends A> eVar, KProperty1<S, ? extends B> eVar2, KProperty1<S, ? extends C> eVar3, SubscriptionConfig<Tuple3<A, B, C>> vVar, Function1<? super S, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(lVar, "$this$selectSubscribe");
            Intrinsics.checkParameterIsNotNull(eVar, "prop1");
            Intrinsics.checkParameterIsNotNull(eVar2, "prop2");
            Intrinsics.checkParameterIsNotNull(eVar3, "prop3");
            Intrinsics.checkParameterIsNotNull(vVar, "config");
            Intrinsics.checkParameterIsNotNull(function1, "subscriber");
            return ISubscriber.C24024a.m87815a(iVar, lVar, eVar, eVar2, eVar3, vVar, function1);
        }

        /* renamed from: a */
        public static <S extends State, A, B, C, D> Disposable m87824a(IdentitySubscriber iVar, JackViewModel<S> lVar, KProperty1<S, ? extends A> eVar, KProperty1<S, ? extends B> eVar2, KProperty1<S, ? extends C> eVar3, KProperty1<S, ? extends D> eVar4, SubscriptionConfig<Tuple4<A, B, C, D>> vVar, Function1<? super S, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(lVar, "$this$selectSubscribe");
            Intrinsics.checkParameterIsNotNull(eVar, "prop1");
            Intrinsics.checkParameterIsNotNull(eVar2, "prop2");
            Intrinsics.checkParameterIsNotNull(eVar3, "prop3");
            Intrinsics.checkParameterIsNotNull(eVar4, "prop4");
            Intrinsics.checkParameterIsNotNull(vVar, "config");
            Intrinsics.checkParameterIsNotNull(function1, "subscriber");
            return ISubscriber.C24024a.m87817a(iVar, lVar, eVar, eVar2, eVar3, eVar4, vVar, function1);
        }

        /* renamed from: a */
        public static LifecycleOwnerHolder m87825a(IdentitySubscriber iVar) {
            return iVar;
        }

        /* renamed from: b */
        public static LifecycleOwner m87826b(IdentitySubscriber iVar) {
            return iVar;
        }
    }
}
