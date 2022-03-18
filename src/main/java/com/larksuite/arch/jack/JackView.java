package com.larksuite.arch.jack;

import androidx.lifecycle.LifecycleOwner;
import com.larksuite.arch.jack.IdentitySubscriber;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty1;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/larksuite/arch/jack/JackView;", "Lcom/larksuite/arch/jack/IdentitySubscriber;", "jack_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.arch.jack.k */
public interface JackView extends IdentitySubscriber {

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.arch.jack.k$a */
    public static final class C24027a {
        /* renamed from: a */
        public static <S extends State> Disposable m87829a(JackView kVar, JackViewModel<S> lVar, SubscriptionConfig<S> vVar, Function1<? super S, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(lVar, "$this$subscribe");
            Intrinsics.checkParameterIsNotNull(vVar, "config");
            Intrinsics.checkParameterIsNotNull(function1, "subscriber");
            return IdentitySubscriber.C24025a.m87819a(kVar, lVar, vVar, function1);
        }

        /* renamed from: a */
        public static <S extends State, A> Disposable m87830a(JackView kVar, JackViewModel<S> lVar, KProperty1<S, ? extends A> eVar, SubscriptionConfig<Tuple1<A>> vVar, Function1<? super S, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(lVar, "$this$selectSubscribe");
            Intrinsics.checkParameterIsNotNull(eVar, "prop1");
            Intrinsics.checkParameterIsNotNull(vVar, "config");
            Intrinsics.checkParameterIsNotNull(function1, "subscriber");
            return IdentitySubscriber.C24025a.m87820a(kVar, lVar, eVar, vVar, function1);
        }

        /* renamed from: a */
        public static <S extends State, T> Disposable m87831a(JackView kVar, JackViewModel<S> lVar, KProperty1<S, ? extends Async<? extends T>> eVar, SubscriptionConfig<Tuple1<Async<T>>> vVar, Function1<? super Throwable, Unit> function1, Function0<Unit> function0, Function1<? super T, Unit> function12) {
            Intrinsics.checkParameterIsNotNull(lVar, "$this$asyncSubscribe");
            Intrinsics.checkParameterIsNotNull(eVar, "prop");
            Intrinsics.checkParameterIsNotNull(vVar, "config");
            return IdentitySubscriber.C24025a.m87821a(kVar, lVar, eVar, vVar, function1, function0, function12);
        }

        /* renamed from: a */
        public static <S extends State, A, B> Disposable m87832a(JackView kVar, JackViewModel<S> lVar, KProperty1<S, ? extends A> eVar, KProperty1<S, ? extends B> eVar2, SubscriptionConfig<Tuple2<A, B>> vVar, Function1<? super S, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(lVar, "$this$selectSubscribe");
            Intrinsics.checkParameterIsNotNull(eVar, "prop1");
            Intrinsics.checkParameterIsNotNull(eVar2, "prop2");
            Intrinsics.checkParameterIsNotNull(vVar, "config");
            Intrinsics.checkParameterIsNotNull(function1, "subscriber");
            return IdentitySubscriber.C24025a.m87822a(kVar, lVar, eVar, eVar2, vVar, function1);
        }

        /* renamed from: a */
        public static <S extends State, A, B, C> Disposable m87833a(JackView kVar, JackViewModel<S> lVar, KProperty1<S, ? extends A> eVar, KProperty1<S, ? extends B> eVar2, KProperty1<S, ? extends C> eVar3, SubscriptionConfig<Tuple3<A, B, C>> vVar, Function1<? super S, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(lVar, "$this$selectSubscribe");
            Intrinsics.checkParameterIsNotNull(eVar, "prop1");
            Intrinsics.checkParameterIsNotNull(eVar2, "prop2");
            Intrinsics.checkParameterIsNotNull(eVar3, "prop3");
            Intrinsics.checkParameterIsNotNull(vVar, "config");
            Intrinsics.checkParameterIsNotNull(function1, "subscriber");
            return IdentitySubscriber.C24025a.m87823a(kVar, lVar, eVar, eVar2, eVar3, vVar, function1);
        }

        /* renamed from: a */
        public static <S extends State, A, B, C, D> Disposable m87834a(JackView kVar, JackViewModel<S> lVar, KProperty1<S, ? extends A> eVar, KProperty1<S, ? extends B> eVar2, KProperty1<S, ? extends C> eVar3, KProperty1<S, ? extends D> eVar4, SubscriptionConfig<Tuple4<A, B, C, D>> vVar, Function1<? super S, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(lVar, "$this$selectSubscribe");
            Intrinsics.checkParameterIsNotNull(eVar, "prop1");
            Intrinsics.checkParameterIsNotNull(eVar2, "prop2");
            Intrinsics.checkParameterIsNotNull(eVar3, "prop3");
            Intrinsics.checkParameterIsNotNull(eVar4, "prop4");
            Intrinsics.checkParameterIsNotNull(vVar, "config");
            Intrinsics.checkParameterIsNotNull(function1, "subscriber");
            return IdentitySubscriber.C24025a.m87824a(kVar, lVar, eVar, eVar2, eVar3, eVar4, vVar, function1);
        }

        /* renamed from: a */
        public static LifecycleOwnerHolder m87835a(JackView kVar) {
            return IdentitySubscriber.C24025a.m87825a(kVar);
        }

        /* renamed from: b */
        public static LifecycleOwner m87836b(JackView kVar) {
            return IdentitySubscriber.C24025a.m87826b(kVar);
        }
    }
}
