package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\bR\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lkotlin/coroutines/jvm/internal/ModuleNameRetriever;", "", "()V", "cache", "Lkotlin/coroutines/jvm/internal/ModuleNameRetriever$Cache;", "notOnJava9", "buildCache", "continuation", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "getModuleName", "", "Cache", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlin.coroutines.jvm.internal.f */
public final class ModuleNameRetriever {

    /* renamed from: a */
    public static Cache f173133a;

    /* renamed from: b */
    public static final ModuleNameRetriever f173134b = new ModuleNameRetriever();

    /* renamed from: c */
    private static final Cache f173135c = new Cache(null, null, null);

    private ModuleNameRetriever() {
    }

    /* renamed from: b */
    private final Cache m265848b(BaseContinuationImpl baseContinuationImpl) {
        try {
            Cache aVar = new Cache(Class.class.getDeclaredMethod("getModule", new Class[0]), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            f173133a = aVar;
            return aVar;
        } catch (Exception unused) {
            Cache aVar2 = f173135c;
            f173133a = aVar2;
            return aVar2;
        }
    }

    /* renamed from: a */
    public final String mo239182a(BaseContinuationImpl baseContinuationImpl) {
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        Object obj;
        Intrinsics.checkParameterIsNotNull(baseContinuationImpl, "continuation");
        Cache aVar = f173133a;
        if (aVar == null) {
            aVar = m265848b(baseContinuationImpl);
        }
        String str = null;
        if (aVar == f173135c || (method = aVar.f173136a) == null || (invoke = method.invoke(baseContinuationImpl.getClass(), new Object[0])) == null || (method2 = aVar.f173137b) == null || (invoke2 = method2.invoke(invoke, new Object[0])) == null) {
            return null;
        }
        Method method3 = aVar.f173138c;
        if (method3 != null) {
            obj = method3.invoke(invoke2, new Object[0]);
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            str = obj;
        }
        return str;
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lkotlin/coroutines/jvm/internal/ModuleNameRetriever$Cache;", "", "getModuleMethod", "Ljava/lang/reflect/Method;", "getDescriptorMethod", "nameMethod", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlin.coroutines.jvm.internal.f$a */
    public static final class Cache {

        /* renamed from: a */
        public final Method f173136a;

        /* renamed from: b */
        public final Method f173137b;

        /* renamed from: c */
        public final Method f173138c;

        public Cache(Method method, Method method2, Method method3) {
            this.f173136a = method;
            this.f173137b = method2;
            this.f173138c = method3;
        }
    }
}
