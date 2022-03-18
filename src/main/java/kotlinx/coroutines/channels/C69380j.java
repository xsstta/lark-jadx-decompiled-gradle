package kotlinx.coroutines.channels;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata(bv = {1, 0, 3}, d1 = {"kotlinx/coroutines/channels/ChannelsKt__ChannelsKt", "kotlinx/coroutines/channels/ChannelsKt__Channels_commonKt"}, mo238835k = 4, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.channels.j */
public final class C69380j {
    /* renamed from: a */
    public static final <E> Object m266615a(BroadcastChannel<E> eVar, Function1<? super E, Unit> function1, Continuation<? super Unit> cVar) {
        return C69381k.m266667a(eVar, function1, cVar);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Channel operators are deprecated in favour of Flow and will be removed in 1.4")
    /* renamed from: a */
    public static final <E> Object m266616a(ReceiveChannel<? extends E> sVar, int i, Function1<? super Integer, ? extends E> function1, Continuation<? super E> cVar) {
        return C69381k.m266668a(sVar, i, function1, cVar);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Channel operators are deprecated in favour of Flow and will be removed in 1.4")
    /* renamed from: a */
    public static final <E, R> Object m266617a(ReceiveChannel<? extends E> sVar, R r, Function2<? super R, ? super E, ? extends R> kVar, Continuation<? super R> cVar) {
        return C69381k.m266669a((ReceiveChannel) sVar, (Object) r, (Function2) kVar, (Continuation) cVar);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Channel operators are deprecated in favour of Flow and will be removed in 1.4")
    /* renamed from: a */
    public static final <E, R> Object m266618a(ReceiveChannel<? extends E> sVar, R r, Function3<? super Integer, ? super R, ? super E, ? extends R> oVar, Continuation<? super R> cVar) {
        return C69381k.m266670a(sVar, r, oVar, cVar);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Channel operators are deprecated in favour of Flow and will be removed in 1.4")
    /* renamed from: a */
    public static final <E, C extends Collection<? super E>> Object m266619a(ReceiveChannel<? extends E> sVar, C c, Function1<? super E, Boolean> function1, Continuation<? super C> cVar) {
        return C69381k.m266671a(sVar, c, function1, cVar);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Channel operators are deprecated in favour of Flow and will be removed in 1.4")
    /* renamed from: a */
    public static final <E, C extends Collection<? super E>> Object m266620a(ReceiveChannel<? extends E> sVar, C c, Function2<? super Integer, ? super E, Boolean> kVar, Continuation<? super C> cVar) {
        return C69381k.m266672a((ReceiveChannel) sVar, (Collection) c, (Function2) kVar, (Continuation) cVar);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Channel operators are deprecated in favour of Flow and will be removed in 1.4")
    /* renamed from: a */
    public static final <E, K, M extends Map<? super K, ? super E>> Object m266621a(ReceiveChannel<? extends E> sVar, M m, Function1<? super E, ? extends K> function1, Continuation<? super M> cVar) {
        return C69381k.m266673a(sVar, m, function1, cVar);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Channel operators are deprecated in favour of Flow and will be removed in 1.4")
    /* renamed from: a */
    public static final <E, K, V, M extends Map<? super K, ? super V>> Object m266622a(ReceiveChannel<? extends E> sVar, M m, Function1<? super E, ? extends K> function1, Function1<? super E, ? extends V> function12, Continuation<? super M> cVar) {
        return C69381k.m266674a(sVar, m, function1, function12, cVar);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Channel operators are deprecated in favour of Flow and will be removed in 1.4")
    /* renamed from: a */
    public static final <E> Object m266623a(ReceiveChannel<? extends E> sVar, Function1<? super E, Boolean> function1, Continuation<? super Boolean> cVar) {
        return C69381k.m266710p(sVar, function1, cVar);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Channel operators are deprecated in favour of Flow and will be removed in 1.4")
    /* renamed from: a */
    public static final <E, K, V> Object m266624a(ReceiveChannel<? extends E> sVar, Function1<? super E, ? extends K> function1, Function1<? super E, ? extends V> function12, Continuation<? super Map<K, ? extends V>> cVar) {
        return C69381k.m266676a(sVar, function1, function12, cVar);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Channel operators are deprecated in favour of Flow and will be removed in 1.4")
    /* renamed from: a */
    public static final <S, E extends S> Object m266625a(ReceiveChannel<? extends E> sVar, Function2<? super S, ? super E, ? extends S> kVar, Continuation<? super S> cVar) {
        return C69381k.m266677a(sVar, kVar, cVar);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Channel operators are deprecated in favour of Flow and will be removed in 1.4")
    /* renamed from: a */
    public static final <S, E extends S> Object m266626a(ReceiveChannel<? extends E> sVar, Function3<? super Integer, ? super S, ? super E, ? extends S> oVar, Continuation<? super S> cVar) {
        return C69381k.m266678a(sVar, oVar, cVar);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Channel operators are deprecated in favour of Flow and will be removed in 1.4")
    /* renamed from: a */
    public static final <E, C extends SendChannel<? super E>> Object m266627a(ReceiveChannel<? extends E> sVar, C c, Function1<? super E, Boolean> function1, Continuation<? super C> cVar) {
        return C69381k.m266679a(sVar, c, function1, cVar);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Channel operators are deprecated in favour of Flow and will be removed in 1.4")
    /* renamed from: a */
    public static final <E, C extends SendChannel<? super E>> Object m266628a(ReceiveChannel<? extends E> sVar, C c, Function2<? super Integer, ? super E, Boolean> kVar, Continuation<? super C> cVar) {
        return C69381k.m266680a((ReceiveChannel) sVar, (SendChannel) c, (Function2) kVar, (Continuation) cVar);
    }

    /* renamed from: a */
    public static final void m266629a(ReceiveChannel<?> sVar, Throwable th) {
        C69381k.m266681a(sVar, th);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Channel operators are deprecated in favour of Flow and will be removed in 1.4")
    /* renamed from: b */
    public static final <E, C extends Collection<? super E>> Object m266630b(ReceiveChannel<? extends E> sVar, C c, Function1<? super E, Boolean> function1, Continuation<? super C> cVar) {
        return C69381k.m266682b(sVar, c, function1, cVar);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Channel operators are deprecated in favour of Flow and will be removed in 1.4")
    /* renamed from: b */
    public static final <E, R, C extends Collection<? super R>> Object m266631b(ReceiveChannel<? extends E> sVar, C c, Function2<? super Integer, ? super E, ? extends R> kVar, Continuation<? super C> cVar) {
        return C69381k.m266683b(sVar, c, kVar, cVar);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Channel operators are deprecated in favour of Flow and will be removed in 1.4")
    /* renamed from: b */
    public static final <E, K, V, M extends Map<? super K, ? super V>> Object m266632b(ReceiveChannel<? extends E> sVar, M m, Function1<? super E, ? extends Pair<? extends K, ? extends V>> function1, Continuation<? super M> cVar) {
        return C69381k.m266684b(sVar, m, function1, cVar);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Channel operators are deprecated in favour of Flow and will be removed in 1.4")
    /* renamed from: b */
    public static final <E, K, V, M extends Map<? super K, List<V>>> Object m266633b(ReceiveChannel<? extends E> sVar, M m, Function1<? super E, ? extends K> function1, Function1<? super E, ? extends V> function12, Continuation<? super M> cVar) {
        return C69381k.m266685b(sVar, m, function1, function12, cVar);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Channel operators are deprecated in favour of Flow and will be removed in 1.4")
    /* renamed from: b */
    public static final <E> Object m266634b(ReceiveChannel<? extends E> sVar, Function1<? super E, Boolean> function1, Continuation<? super Boolean> cVar) {
        return C69381k.m266711q(sVar, function1, cVar);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Channel operators are deprecated in favour of Flow and will be removed in 1.4")
    /* renamed from: b */
    public static final <E, K, V> Object m266635b(ReceiveChannel<? extends E> sVar, Function1<? super E, ? extends K> function1, Function1<? super E, ? extends V> function12, Continuation<? super Map<K, ? extends List<? extends V>>> cVar) {
        return C69381k.m266687b(sVar, function1, function12, cVar);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Channel operators are deprecated in favour of Flow and will be removed in 1.4")
    /* renamed from: b */
    public static final <E, C extends SendChannel<? super E>> Object m266636b(ReceiveChannel<? extends E> sVar, C c, Function1<? super E, Boolean> function1, Continuation<? super C> cVar) {
        return C69381k.m266688b(sVar, c, function1, cVar);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Channel operators are deprecated in favour of Flow and will be removed in 1.4")
    /* renamed from: b */
    public static final <E, R, C extends SendChannel<? super R>> Object m266637b(ReceiveChannel<? extends E> sVar, C c, Function2<? super Integer, ? super E, ? extends R> kVar, Continuation<? super C> cVar) {
        return C69381k.m266689b(sVar, c, kVar, cVar);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Channel operators are deprecated in favour of Flow and will be removed in 1.4")
    /* renamed from: c */
    public static final <E, R, C extends Collection<? super R>> Object m266638c(ReceiveChannel<? extends E> sVar, C c, Function1<? super E, ? extends R> function1, Continuation<? super C> cVar) {
        return C69381k.m266690c(sVar, c, function1, cVar);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Channel operators are deprecated in favour of Flow and will be removed in 1.4")
    /* renamed from: c */
    public static final <E, R, C extends Collection<? super R>> Object m266639c(ReceiveChannel<? extends E> sVar, C c, Function2<? super Integer, ? super E, ? extends R> kVar, Continuation<? super C> cVar) {
        return C69381k.m266691c(sVar, c, kVar, cVar);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Channel operators are deprecated in favour of Flow and will be removed in 1.4")
    /* renamed from: c */
    public static final <E, K, M extends Map<? super K, List<E>>> Object m266640c(ReceiveChannel<? extends E> sVar, M m, Function1<? super E, ? extends K> function1, Continuation<? super M> cVar) {
        return C69381k.m266692c(sVar, m, function1, cVar);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Channel operators are deprecated in favour of Flow and will be removed in 1.4")
    /* renamed from: c */
    public static final <E, K, V> Object m266641c(ReceiveChannel<? extends E> sVar, Function1<? super E, ? extends Pair<? extends K, ? extends V>> function1, Continuation<? super Map<K, ? extends V>> cVar) {
        return C69381k.m266707m(sVar, function1, cVar);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Channel operators are deprecated in favour of Flow and will be removed in 1.4")
    /* renamed from: c */
    public static final <E, R, C extends SendChannel<? super R>> Object m266642c(ReceiveChannel<? extends E> sVar, C c, Function1<? super E, ? extends R> function1, Continuation<? super C> cVar) {
        return C69381k.m266694c(sVar, c, function1, cVar);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Channel operators are deprecated in favour of Flow and will be removed in 1.4")
    /* renamed from: c */
    public static final <E, R, C extends SendChannel<? super R>> Object m266643c(ReceiveChannel<? extends E> sVar, C c, Function2<? super Integer, ? super E, ? extends R> kVar, Continuation<? super C> cVar) {
        return C69381k.m266695c(sVar, c, kVar, cVar);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Channel operators are deprecated in favour of Flow and will be removed in 1.4")
    /* renamed from: d */
    public static final <E, R, C extends Collection<? super R>> Object m266644d(ReceiveChannel<? extends E> sVar, C c, Function1<? super E, ? extends R> function1, Continuation<? super C> cVar) {
        return C69381k.m266696d(sVar, c, function1, cVar);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Channel operators are deprecated in favour of Flow and will be removed in 1.4")
    /* renamed from: d */
    public static final <E, K> Object m266645d(ReceiveChannel<? extends E> sVar, Function1<? super E, ? extends K> function1, Continuation<? super Map<K, ? extends E>> cVar) {
        return C69381k.m266708n(sVar, function1, cVar);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Channel operators are deprecated in favour of Flow and will be removed in 1.4")
    /* renamed from: d */
    public static final <E, R, C extends SendChannel<? super R>> Object m266646d(ReceiveChannel<? extends E> sVar, C c, Function1<? super E, ? extends R> function1, Continuation<? super C> cVar) {
        return C69381k.m266698d(sVar, c, function1, cVar);
    }

    /* renamed from: e */
    public static final <E> Object m266647e(ReceiveChannel<? extends E> sVar, Function1<? super E, Unit> function1, Continuation<? super Unit> cVar) {
        return C69381k.m266675a(sVar, function1, cVar);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Channel operators are deprecated in favour of Flow and will be removed in 1.4")
    /* renamed from: f */
    public static final <E> Object m266648f(ReceiveChannel<? extends E> sVar, Function1<? super IndexedValue<? extends E>, Unit> function1, Continuation<? super Unit> cVar) {
        return C69381k.m266686b(sVar, function1, cVar);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Channel operators are deprecated in favour of Flow and will be removed in 1.4")
    /* renamed from: g */
    public static final <E> Object m266649g(ReceiveChannel<? extends E> sVar, Function1<? super E, Boolean> function1, Continuation<? super Integer> cVar) {
        return C69381k.m266712r(sVar, function1, cVar);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Channel operators are deprecated in favour of Flow and will be removed in 1.4")
    /* renamed from: h */
    public static final <E> Object m266650h(ReceiveChannel<? extends E> sVar, Function1<? super E, Boolean> function1, Continuation<? super E> cVar) {
        return C69381k.m266693c(sVar, function1, cVar);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Channel operators are deprecated in favour of Flow and will be removed in 1.4")
    /* renamed from: i */
    public static final <E> Object m266651i(ReceiveChannel<? extends E> sVar, Function1<? super E, Boolean> function1, Continuation<? super E> cVar) {
        return C69381k.m266697d(sVar, function1, cVar);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Channel operators are deprecated in favour of Flow and will be removed in 1.4")
    /* renamed from: j */
    public static final <E> Object m266652j(ReceiveChannel<? extends E> sVar, Function1<? super E, Boolean> function1, Continuation<? super E> cVar) {
        return C69381k.m266699e(sVar, function1, cVar);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Channel operators are deprecated in favour of Flow and will be removed in 1.4")
    /* renamed from: k */
    public static final <E> Object m266653k(ReceiveChannel<? extends E> sVar, Function1<? super E, Boolean> function1, Continuation<? super E> cVar) {
        return C69381k.m266700f(sVar, function1, cVar);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Channel operators are deprecated in favour of Flow and will be removed in 1.4")
    /* renamed from: l */
    public static final <E, K> Object m266654l(ReceiveChannel<? extends E> sVar, Function1<? super E, ? extends K> function1, Continuation<? super Map<K, ? extends List<? extends E>>> cVar) {
        return C69381k.m266709o(sVar, function1, cVar);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Channel operators are deprecated in favour of Flow and will be removed in 1.4")
    /* renamed from: m */
    public static final <E> Object m266655m(ReceiveChannel<? extends E> sVar, Function1<? super E, Boolean> function1, Continuation<? super Integer> cVar) {
        return C69381k.m266701g(sVar, function1, cVar);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Channel operators are deprecated in favour of Flow and will be removed in 1.4")
    /* renamed from: n */
    public static final <E> Object m266656n(ReceiveChannel<? extends E> sVar, Function1<? super E, Boolean> function1, Continuation<? super Integer> cVar) {
        return C69381k.m266702h(sVar, function1, cVar);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Channel operators are deprecated in favour of Flow and will be removed in 1.4")
    /* renamed from: o */
    public static final <E> Object m266657o(ReceiveChannel<? extends E> sVar, Function1<? super E, Boolean> function1, Continuation<? super E> cVar) {
        return C69381k.m266703i(sVar, function1, cVar);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Channel operators are deprecated in favour of Flow and will be removed in 1.4")
    /* renamed from: p */
    public static final <E> Object m266658p(ReceiveChannel<? extends E> sVar, Function1<? super E, Boolean> function1, Continuation<? super E> cVar) {
        return C69381k.m266704j(sVar, function1, cVar);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Channel operators are deprecated in favour of Flow and will be removed in 1.4")
    /* renamed from: q */
    public static final <E, R extends Comparable<? super R>> Object m266659q(ReceiveChannel<? extends E> sVar, Function1<? super E, ? extends R> function1, Continuation<? super E> cVar) {
        return C69381k.m266713s(sVar, function1, cVar);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Channel operators are deprecated in favour of Flow and will be removed in 1.4")
    /* renamed from: r */
    public static final <E, R extends Comparable<? super R>> Object m266660r(ReceiveChannel<? extends E> sVar, Function1<? super E, ? extends R> function1, Continuation<? super E> cVar) {
        return C69381k.m266714t(sVar, function1, cVar);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Channel operators are deprecated in favour of Flow and will be removed in 1.4")
    /* renamed from: s */
    public static final <E> Object m266661s(ReceiveChannel<? extends E> sVar, Function1<? super E, Boolean> function1, Continuation<? super Boolean> cVar) {
        return C69381k.m266715u(sVar, function1, cVar);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Channel operators are deprecated in favour of Flow and will be removed in 1.4")
    /* renamed from: t */
    public static final <E> Object m266662t(ReceiveChannel<? extends E> sVar, Function1<? super E, Boolean> function1, Continuation<? super Pair<? extends List<? extends E>, ? extends List<? extends E>>> cVar) {
        return C69381k.m266718x(sVar, function1, cVar);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Channel operators are deprecated in favour of Flow and will be removed in 1.4")
    /* renamed from: u */
    public static final <E> Object m266663u(ReceiveChannel<? extends E> sVar, Function1<? super E, Boolean> function1, Continuation<? super E> cVar) {
        return C69381k.m266705k(sVar, function1, cVar);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Channel operators are deprecated in favour of Flow and will be removed in 1.4")
    /* renamed from: v */
    public static final <E> Object m266664v(ReceiveChannel<? extends E> sVar, Function1<? super E, Boolean> function1, Continuation<? super E> cVar) {
        return C69381k.m266706l(sVar, function1, cVar);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Channel operators are deprecated in favour of Flow and will be removed in 1.4")
    /* renamed from: w */
    public static final <E> Object m266665w(ReceiveChannel<? extends E> sVar, Function1<? super E, Integer> function1, Continuation<? super Integer> cVar) {
        return C69381k.m266716v(sVar, function1, cVar);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Channel operators are deprecated in favour of Flow and will be removed in 1.4")
    /* renamed from: x */
    public static final <E> Object m266666x(ReceiveChannel<? extends E> sVar, Function1<? super E, Double> function1, Continuation<? super Double> cVar) {
        return C69381k.m266717w(sVar, function1, cVar);
    }
}
