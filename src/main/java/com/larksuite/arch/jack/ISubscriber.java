package com.larksuite.arch.jack;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty1;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0001\u0010\u0006\u001a\u00020\u0007\"\b\b\u0000\u0010\b*\u00020\t\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u0002H\b0\u000b2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u0002H\b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\u000e0\r2\u001a\b\u0002\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\u000e0\u00110\u00102\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00132\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00172\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013H\u0016Je\u0010\u0019\u001a\u00020\u0007\"\b\b\u0000\u0010\b*\u00020\t\"\u0004\b\u0001\u0010\u001a*\b\u0012\u0004\u0012\u0002H\b0\u000b2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\u001a0\r2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001a0\u00110\u00102\u0017\u0010\u001c\u001a\u0013\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0002\b\u001dH\u0016J\u0001\u0010\u0019\u001a\u00020\u0007\"\b\b\u0000\u0010\b*\u00020\t\"\u0004\b\u0001\u0010\u001a\"\u0004\b\u0002\u0010\u001e*\b\u0012\u0004\u0012\u0002H\b0\u000b2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\u001a0\r2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\u001e0\r2\u001a\b\u0002\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u001a\u0012\u0004\u0012\u0002H\u001e0 0\u00102\u0017\u0010\u001c\u001a\u0013\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0002\b\u001dH\u0016J¥\u0001\u0010\u0019\u001a\u00020\u0007\"\b\b\u0000\u0010\b*\u00020\t\"\u0004\b\u0001\u0010\u001a\"\u0004\b\u0002\u0010\u001e\"\u0004\b\u0003\u0010!*\b\u0012\u0004\u0012\u0002H\b0\u000b2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\u001a0\r2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\u001e0\r2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H!0\r2 \b\u0002\u0010\u000f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u0002H\u001a\u0012\u0004\u0012\u0002H\u001e\u0012\u0004\u0012\u0002H!0#0\u00102\u0017\u0010\u001c\u001a\u0013\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0002\b\u001dH\u0016JÅ\u0001\u0010\u0019\u001a\u00020\u0007\"\b\b\u0000\u0010\b*\u00020\t\"\u0004\b\u0001\u0010\u001a\"\u0004\b\u0002\u0010\u001e\"\u0004\b\u0003\u0010!\"\u0004\b\u0004\u0010$*\b\u0012\u0004\u0012\u0002H\b0\u000b2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\u001a0\r2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\u001e0\r2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H!0\r2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H$0\r2&\b\u0002\u0010\u000f\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u0002H\u001a\u0012\u0004\u0012\u0002H\u001e\u0012\u0004\u0012\u0002H!\u0012\u0004\u0012\u0002H$0&0\u00102\u0017\u0010\u001c\u001a\u0013\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0002\b\u001dH\u0016Jå\u0001\u0010\u0019\u001a\u00020\u0007\"\b\b\u0000\u0010\b*\u00020\t\"\u0004\b\u0001\u0010\u001a\"\u0004\b\u0002\u0010\u001e\"\u0004\b\u0003\u0010!\"\u0004\b\u0004\u0010$\"\u0004\b\u0005\u0010'*\b\u0012\u0004\u0012\u0002H\b0\u000b2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\u001a0\r2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\u001e0\r2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H!0\r2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H$0\r2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H'0\r2,\b\u0002\u0010\u000f\u001a&\u0012\"\u0012 \u0012\u0004\u0012\u0002H\u001a\u0012\u0004\u0012\u0002H\u001e\u0012\u0004\u0012\u0002H!\u0012\u0004\u0012\u0002H$\u0012\u0004\u0012\u0002H'0)0\u00102\u0017\u0010\u001c\u001a\u0013\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0002\b\u001dH\u0016JE\u0010*\u001a\u00020\u0007\"\b\b\u0000\u0010\b*\u00020\t*\b\u0012\u0004\u0012\u0002H\b0\u000b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\b0\u00102\u0017\u0010\u001c\u001a\u0013\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0002\b\u001dH\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006+"}, d2 = {"Lcom/larksuite/arch/jack/ISubscriber;", "", "lifecycleOwnerHolder", "Lcom/larksuite/arch/jack/LifecycleOwnerHolder;", "getLifecycleOwnerHolder", "()Lcom/larksuite/arch/jack/LifecycleOwnerHolder;", "asyncSubscribe", "Lcom/larksuite/arch/jack/Disposable;", "S", "Lcom/larksuite/arch/jack/State;", "T", "Lcom/larksuite/arch/jack/JackViewModel;", "prop", "Lkotlin/reflect/KProperty1;", "Lcom/larksuite/arch/jack/Async;", "config", "Lcom/larksuite/arch/jack/SubscriptionConfig;", "Lcom/larksuite/arch/jack/Tuple1;", "onError", "Lkotlin/Function1;", "", "", "onLoading", "Lkotlin/Function0;", "onSuccess", "selectSubscribe", "A", "prop1", "subscriber", "Lkotlin/ExtensionFunctionType;", "B", "prop2", "Lcom/larksuite/arch/jack/Tuple2;", "C", "prop3", "Lcom/larksuite/arch/jack/Tuple3;", "D", "prop4", "Lcom/larksuite/arch/jack/Tuple4;", "E", "prop5", "Lcom/larksuite/arch/jack/Tuple5;", "subscribe", "jack_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.arch.jack.h */
public interface ISubscriber {
    /* renamed from: a */
    <S extends State> Disposable mo86220a(JackViewModel<S> lVar, SubscriptionConfig<S> vVar, Function1<? super S, Unit> function1);

    /* renamed from: a */
    <S extends State, A> Disposable mo86221a(JackViewModel<S> lVar, KProperty1<S, ? extends A> eVar, SubscriptionConfig<Tuple1<A>> vVar, Function1<? super S, Unit> function1);

    /* renamed from: a */
    <S extends State, T> Disposable mo86222a(JackViewModel<S> lVar, KProperty1<S, ? extends Async<? extends T>> eVar, SubscriptionConfig<Tuple1<Async<T>>> vVar, Function1<? super Throwable, Unit> function1, Function0<Unit> function0, Function1<? super T, Unit> function12);

    /* renamed from: a */
    <S extends State, A, B> Disposable mo86223a(JackViewModel<S> lVar, KProperty1<S, ? extends A> eVar, KProperty1<S, ? extends B> eVar2, SubscriptionConfig<Tuple2<A, B>> vVar, Function1<? super S, Unit> function1);

    /* renamed from: a */
    <S extends State, A, B, C> Disposable mo86224a(JackViewModel<S> lVar, KProperty1<S, ? extends A> eVar, KProperty1<S, ? extends B> eVar2, KProperty1<S, ? extends C> eVar3, SubscriptionConfig<Tuple3<A, B, C>> vVar, Function1<? super S, Unit> function1);

    /* renamed from: a */
    <S extends State, A, B, C, D> Disposable mo86225a(JackViewModel<S> lVar, KProperty1<S, ? extends A> eVar, KProperty1<S, ? extends B> eVar2, KProperty1<S, ? extends C> eVar3, KProperty1<S, ? extends D> eVar4, SubscriptionConfig<Tuple4<A, B, C, D>> vVar, Function1<? super S, Unit> function1);

    /* renamed from: a */
    LifecycleOwnerHolder mo86226a();

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.arch.jack.h$a */
    public static final class C24024a {
        /* renamed from: a */
        public static /* synthetic */ Disposable m87814a(ISubscriber hVar, JackViewModel lVar, KProperty1 eVar, KProperty1 eVar2, SubscriptionConfig vVar, Function1 function1, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    vVar = C24040n.m87838a();
                }
                return hVar.mo86223a(lVar, eVar, eVar2, vVar, function1);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: selectSubscribe");
        }

        /* renamed from: a */
        public static /* synthetic */ Disposable m87816a(ISubscriber hVar, JackViewModel lVar, KProperty1 eVar, KProperty1 eVar2, KProperty1 eVar3, SubscriptionConfig vVar, Function1 function1, int i, Object obj) {
            if (obj == null) {
                if ((i & 8) != 0) {
                    vVar = C24040n.m87838a();
                }
                return hVar.mo86224a(lVar, eVar, eVar2, eVar3, vVar, function1);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: selectSubscribe");
        }

        /* renamed from: a */
        public static <S extends State, A, B, C> Disposable m87815a(ISubscriber hVar, JackViewModel<S> lVar, KProperty1<S, ? extends A> eVar, KProperty1<S, ? extends B> eVar2, KProperty1<S, ? extends C> eVar3, SubscriptionConfig<Tuple3<A, B, C>> vVar, Function1<? super S, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(lVar, "$this$selectSubscribe");
            Intrinsics.checkParameterIsNotNull(eVar, "prop1");
            Intrinsics.checkParameterIsNotNull(eVar2, "prop2");
            Intrinsics.checkParameterIsNotNull(eVar3, "prop3");
            Intrinsics.checkParameterIsNotNull(vVar, "config");
            Intrinsics.checkParameterIsNotNull(function1, "subscriber");
            return lVar.selectSubscribeInternal$jack_release(hVar.mo86226a().aZ_(), eVar, eVar2, eVar3, vVar, function1);
        }

        /* renamed from: a */
        public static /* synthetic */ Disposable m87818a(ISubscriber hVar, JackViewModel lVar, KProperty1 eVar, KProperty1 eVar2, KProperty1 eVar3, KProperty1 eVar4, SubscriptionConfig vVar, Function1 function1, int i, Object obj) {
            if (obj == null) {
                return hVar.mo86225a(lVar, eVar, eVar2, eVar3, eVar4, (i & 16) != 0 ? C24040n.m87838a() : vVar, function1);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: selectSubscribe");
        }

        /* renamed from: a */
        public static <S extends State, A, B, C, D> Disposable m87817a(ISubscriber hVar, JackViewModel<S> lVar, KProperty1<S, ? extends A> eVar, KProperty1<S, ? extends B> eVar2, KProperty1<S, ? extends C> eVar3, KProperty1<S, ? extends D> eVar4, SubscriptionConfig<Tuple4<A, B, C, D>> vVar, Function1<? super S, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(lVar, "$this$selectSubscribe");
            Intrinsics.checkParameterIsNotNull(eVar, "prop1");
            Intrinsics.checkParameterIsNotNull(eVar2, "prop2");
            Intrinsics.checkParameterIsNotNull(eVar3, "prop3");
            Intrinsics.checkParameterIsNotNull(eVar4, "prop4");
            Intrinsics.checkParameterIsNotNull(vVar, "config");
            Intrinsics.checkParameterIsNotNull(function1, "subscriber");
            return lVar.selectSubscribeInternal$jack_release(hVar.mo86226a().aZ_(), eVar, eVar2, eVar3, eVar4, vVar, function1);
        }

        /* renamed from: a */
        public static <S extends State> Disposable m87807a(ISubscriber hVar, JackViewModel<S> lVar, SubscriptionConfig<S> vVar, Function1<? super S, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(lVar, "$this$subscribe");
            Intrinsics.checkParameterIsNotNull(vVar, "config");
            Intrinsics.checkParameterIsNotNull(function1, "subscriber");
            return lVar.subscribeInternal$jack_release(hVar.mo86226a().aZ_(), vVar, function1);
        }

        /* renamed from: a */
        public static <S extends State, A> Disposable m87809a(ISubscriber hVar, JackViewModel<S> lVar, KProperty1<S, ? extends A> eVar, SubscriptionConfig<Tuple1<A>> vVar, Function1<? super S, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(lVar, "$this$selectSubscribe");
            Intrinsics.checkParameterIsNotNull(eVar, "prop1");
            Intrinsics.checkParameterIsNotNull(vVar, "config");
            Intrinsics.checkParameterIsNotNull(function1, "subscriber");
            return lVar.selectSubscribeInternal$jack_release(hVar.mo86226a().aZ_(), eVar, vVar, function1);
        }

        /* renamed from: a */
        public static /* synthetic */ Disposable m87808a(ISubscriber hVar, JackViewModel lVar, SubscriptionConfig vVar, Function1 function1, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    vVar = C24040n.m87838a();
                }
                return hVar.mo86220a(lVar, vVar, function1);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: subscribe");
        }

        /* renamed from: a */
        public static <S extends State, A, B> Disposable m87813a(ISubscriber hVar, JackViewModel<S> lVar, KProperty1<S, ? extends A> eVar, KProperty1<S, ? extends B> eVar2, SubscriptionConfig<Tuple2<A, B>> vVar, Function1<? super S, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(lVar, "$this$selectSubscribe");
            Intrinsics.checkParameterIsNotNull(eVar, "prop1");
            Intrinsics.checkParameterIsNotNull(eVar2, "prop2");
            Intrinsics.checkParameterIsNotNull(vVar, "config");
            Intrinsics.checkParameterIsNotNull(function1, "subscriber");
            return lVar.selectSubscribeInternal$jack_release(hVar.mo86226a().aZ_(), eVar, eVar2, vVar, function1);
        }

        /* renamed from: a */
        public static /* synthetic */ Disposable m87810a(ISubscriber hVar, JackViewModel lVar, KProperty1 eVar, SubscriptionConfig vVar, Function1 function1, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    vVar = C24040n.m87838a();
                }
                return hVar.mo86221a(lVar, eVar, vVar, function1);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: selectSubscribe");
        }

        /* renamed from: a */
        public static <S extends State, T> Disposable m87811a(ISubscriber hVar, JackViewModel<S> lVar, KProperty1<S, ? extends Async<? extends T>> eVar, SubscriptionConfig<Tuple1<Async<T>>> vVar, Function1<? super Throwable, Unit> function1, Function0<Unit> function0, Function1<? super T, Unit> function12) {
            Intrinsics.checkParameterIsNotNull(lVar, "$this$asyncSubscribe");
            Intrinsics.checkParameterIsNotNull(eVar, "prop");
            Intrinsics.checkParameterIsNotNull(vVar, "config");
            return lVar.asyncSubscribeInternal$jack_release(hVar.mo86226a().aZ_(), eVar, vVar, function1, function0, function12);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.larksuite.arch.jack.h */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public static /* synthetic */ Disposable m87812a(ISubscriber hVar, JackViewModel lVar, KProperty1 eVar, SubscriptionConfig vVar, Function1 function1, Function0 function0, Function1 function12, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    vVar = C24040n.m87838a();
                }
                if ((i & 4) != 0) {
                    function1 = null;
                }
                if ((i & 8) != 0) {
                    function0 = null;
                }
                if ((i & 16) != 0) {
                    function12 = null;
                }
                return hVar.mo86222a(lVar, eVar, vVar, function1, function0, function12);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: asyncSubscribe");
        }
    }
}
