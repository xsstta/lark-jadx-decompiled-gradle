package com.larksuite.rucket.core;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.rucket.core.base.AbstractStrategy;
import com.larksuite.rucket.core.proxymethod.AbstractProxyMethod;
import com.larksuite.rucket.core.proxymethod.EmptyProxyMethod;
import com.larksuite.rucket.impl.SdkCallStrategy;
import com.larksuite.rucket.impl.SdkPushStrategy;
import com.larksuite.rucket.impl.ServerCallStrategy;
import com.larksuite.rucket.impl.ServerPushStrategy;
import com.larksuite.rucket.job.compat.RucketLauncher;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.C69091e;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.C69113a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;
import kotlinx.coroutines.C69364ai;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0011\u001a\u0002H\u0012\"\n\b\u0000\u0010\u0012\u0018\u0001*\u00020\u0001H\b¢\u0006\u0002\u0010\u0013J#\u0010\u0011\u001a\u0002H\u0012\"\b\b\u0000\u0010\u0012*\u00020\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00120\u000b¢\u0006\u0002\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\bH@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r2\u0006\u0010\u0017\u001a\u00020\bH\u0002J\u0015\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0000¢\u0006\u0002\b\u001eJ\u0010\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u0004\u0012\u00020\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R2\u0010\f\u001a&\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u000fj\u0002`\u00100\u0007X\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Lcom/larksuite/rucket/core/RucketImpl;", "", "()V", "TAG", "", "TO_STRING", "methodCache", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/lang/reflect/Method;", "Lcom/larksuite/rucket/core/proxymethod/AbstractProxyMethod;", "serviceCache", "Ljava/lang/Class;", "strategies", "Lkotlin/reflect/KClass;", "", "Lkotlin/Function1;", "Lcom/larksuite/rucket/core/StrategyAction;", "create", "T", "()Ljava/lang/Object;", "clazz", "(Ljava/lang/Class;)Ljava/lang/Object;", "getProxyMethod", "method", "(Ljava/lang/reflect/Method;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "parseServiceAnnotations", "registerStrategy", "", "strategy", "Lcom/larksuite/rucket/core/base/AbstractStrategy;", "registerStrategy$rucket_release", "tryCreateProxyMethod", "origin", "rucket_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.rucket.core.a */
public final class RucketImpl {

    /* renamed from: a */
    public static final RucketImpl f64972a;

    /* renamed from: b */
    private static final ConcurrentHashMap<KClass<? extends Annotation>, Function1<Method, AbstractProxyMethod>> f64973b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private static final ConcurrentHashMap<Method, AbstractProxyMethod> f64974c = new ConcurrentHashMap<>(2048);

    /* renamed from: d */
    private static final ConcurrentHashMap<Class<?>, Object> f64975d = new ConcurrentHashMap<>((int) SmActions.ACTION_ONTHECALL_EXIT);

    private RucketImpl() {
    }

    static {
        RucketImpl aVar = new RucketImpl();
        f64972a = aVar;
        aVar.mo93450a(new SdkCallStrategy());
        aVar.mo93450a(new SdkPushStrategy());
        aVar.mo93450a(new ServerCallStrategy());
        aVar.mo93450a(new ServerPushStrategy());
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lcom/larksuite/rucket/core/proxymethod/AbstractProxyMethod;", "p1", "Ljava/lang/reflect/Method;", "Lkotlin/ParameterName;", "name", "origin", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.rucket.core.a$c */
    public static final /* synthetic */ class C26332c extends FunctionReference implements Function1<Method, AbstractProxyMethod> {
        C26332c(AbstractStrategy aVar) {
            super(1, aVar);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "proxyMethod";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(AbstractStrategy.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "proxyMethod(Ljava/lang/reflect/Method;)Lcom/larksuite/rucket/core/proxymethod/AbstractProxyMethod;";
        }

        public final AbstractProxyMethod invoke(Method method) {
            Intrinsics.checkParameterIsNotNull(method, "p1");
            return ((AbstractStrategy) this.receiver).mo93454a(method);
        }
    }

    /* renamed from: a */
    public final void mo93450a(AbstractStrategy aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "strategy");
        f64973b.put(aVar.mo93455a(), new C26332c(aVar));
    }

    /* renamed from: a */
    public final AbstractProxyMethod mo93447a(Method method) {
        AbstractProxyMethod invoke;
        Function1<Method, AbstractProxyMethod> function1 = f64973b.get(m95348b(method));
        if (function1 == null || (invoke = function1.invoke(method)) == null) {
            return new EmptyProxyMethod();
        }
        return invoke;
    }

    /* renamed from: b */
    private final KClass<?> m95348b(Method method) {
        Annotation[] annotations = method.getAnnotations();
        Intrinsics.checkExpressionValueIsNotNull(annotations, "method.annotations");
        ArrayList arrayList = new ArrayList(annotations.length);
        for (Annotation annotation : annotations) {
            arrayList.add(C69113a.m265956a(annotation));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (f64973b.keySet().contains((KClass) obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = arrayList2;
        if (arrayList3.isEmpty()) {
            return null;
        }
        return (KClass) arrayList3.get(0);
    }

    /* renamed from: a */
    public final <T> T mo93448a(Class<T> cls) {
        Intrinsics.checkParameterIsNotNull(cls, "clazz");
        ConcurrentHashMap<Class<?>, Object> concurrentHashMap = f64975d;
        T t = (T) concurrentHashMap.get(cls);
        if (t == null) {
            t = (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, C26328a.f64976a);
            Object putIfAbsent = concurrentHashMap.putIfAbsent(cls, t);
            if (putIfAbsent != null) {
                t = (T) putIfAbsent;
            }
        }
        if (t != null) {
            return t;
        }
        throw new TypeCastException("null cannot be cast to non-null type T");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "com/larksuite/rucket/core/RucketImpl$getProxyMethod$2$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.rucket.core.a$b */
    public static final class C26331b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CancellableContinuation $cont;
        final /* synthetic */ Method $method$inlined;
        final /* synthetic */ Ref.ObjectRef $result;
        int label;
        private CoroutineScope p$;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26331b(Ref.ObjectRef objectRef, CancellableContinuation kVar, Continuation cVar, Method method) {
            super(2, cVar);
            this.$result = objectRef;
            this.$cont = kVar;
            this.$method$inlined = method;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C26331b bVar = new C26331b(this.$result, this.$cont, cVar, this.$method$inlined);
            bVar.p$ = (CoroutineScope) obj;
            return bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C26331b) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C69086a.m265828a();
            if (this.label == 0) {
                C69097g.m265891a(obj);
                long currentTimeMillis = System.currentTimeMillis();
                this.$result.element = (T) RucketImpl.f64972a.mo93447a(this.$method$inlined);
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                C53241h.m205899c("Rucket", "getProxyMethod: create new proxy method " + this.$method$inlined.getName() + ", thread " + Thread.currentThread() + ", cost " + currentTimeMillis2 + " milliSeconds");
                RucketImpl aVar = RucketImpl.f64972a;
                RucketImpl.f64974c.put(this.$method$inlined, this.$result.element);
                CancellableContinuation kVar = this.$cont;
                T t = this.$result.element;
                if (t == null) {
                    Intrinsics.throwNpe();
                }
                Result.Companion aVar2 = Result.Companion;
                kVar.resumeWith(Result.m271569constructorimpl(t));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Object mo93449a(Method method, Continuation<? super AbstractProxyMethod> cVar) {
        CancellableContinuationImpl lVar = new CancellableContinuationImpl(C69086a.m265825a(cVar), 1);
        lVar.mo243071d();
        CancellableContinuationImpl lVar2 = lVar;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        RucketImpl aVar = f64972a;
        objectRef.element = (T) ((AbstractProxyMethod) f64974c.get(method));
        if (objectRef.element != null) {
            C53241h.m205899c("Rucket", "getProxyMethod: get proxy method " + method.getName() + " from cache, current thread is " + Thread.currentThread());
            Result.Companion aVar2 = Result.Companion;
            lVar2.resumeWith(Result.m271569constructorimpl(objectRef.element));
        } else {
            Job unused = C69553g.m266944a(C69364ai.m266265a(lVar2.getContext().plus(Dispatchers.m266323a())), null, null, new C26331b(objectRef, lVar2, null, method), 3, null);
        }
        Object g = lVar.mo243073g();
        if (g == C69086a.m265828a()) {
            C69091e.m265847c(cVar);
        }
        return g;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0003*\u00020\u00012\u000e\u0010\u0004\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00060\u00062,\u0010\u0007\u001a(\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0014\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\b0\bH\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "T", "obj", "method", "Ljava/lang/reflect/Method;", "args", "", "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.rucket.core.a$a */
    static final class C26328a implements InvocationHandler {

        /* renamed from: a */
        public static final C26328a f64976a = new C26328a();

        C26328a() {
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, final Method method, final Object[] objArr) {
            Intrinsics.checkExpressionValueIsNotNull(method, "method");
            if (Intrinsics.areEqual(method.getName(), "toString")) {
                return obj.getClass().getName();
            }
            if (objArr == null) {
                objArr = new Object[0];
            }
            if (Intrinsics.areEqual(method.getDeclaringClass(), Object.class)) {
                return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
            }
            return RucketLauncher.m95449a(new Function1<IGetDataCallback<Object>, Unit>() {
                /* class com.larksuite.rucket.core.RucketImpl.C26328a.C263291 */

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(IGetDataCallback<Object> iGetDataCallback) {
                    invoke(iGetDataCallback);
                    return Unit.INSTANCE;
                }

                public final void invoke(final IGetDataCallback<Object> iGetDataCallback) {
                    Intrinsics.checkParameterIsNotNull(iGetDataCallback, "it");
                    Job unused = C69553g.m266944a(C69364ai.m266265a(Dispatchers.m266325c()), null, null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this, null) {
                        /* class com.larksuite.rucket.core.RucketImpl.C26328a.C263291.C263301 */
                        Object L$0;
                        int label;
                        private CoroutineScope p$;
                        final /* synthetic */ C263291 this$0;

                        {
                            this.this$0 = r1;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                            Intrinsics.checkParameterIsNotNull(cVar, "completion");
                            C263301 r0 = 
                        }
