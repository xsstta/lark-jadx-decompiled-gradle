package com.larksuite.rucket.core.proxymethod;

import com.larksuite.rucket.core.proxymethod.AsyncProxyMethod;
import com.ss.android.lark.sdk.C53241h;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.C69043h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0001\u001bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH&J\r\u0010\u0014\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\tJ\f\u0010\u0015\u001a\u00060\u0016j\u0002`\u0017H\u0002J\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00190\u000f\"\u0004\b\u0001\u0010\u0019H\u0004J\f\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u000fH\u0002R\u001b\u0010\u0007\u001a\u00028\u00008DX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001f\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/larksuite/rucket/core/proxymethod/BaseProxyMethod;", "T", "", "Lcom/larksuite/rucket/core/proxymethod/AsyncProxyMethod;", "origin", "Ljava/lang/reflect/Method;", "(Ljava/lang/reflect/Method;)V", "annotationInfo", "getAnnotationInfo", "()Ljava/lang/annotation/Annotation;", "annotationInfo$delegate", "Lkotlin/Lazy;", "getOrigin", "()Ljava/lang/reflect/Method;", "responseClass", "Ljava/lang/Class;", "getResponseClass", "()Ljava/lang/Class;", "responseClass$delegate", "getAnnotationClass", "getAnnotationFromOrigin", "getInvalidMethodError", "Ljava/lang/Error;", "Lkotlin/Error;", "getResponseClazz", "U", "parseResponseClass", "GenerateProxyMethodError", "rucket_release"}, mo238835k = 1, mv = {1, 1, 16})
public abstract class BaseProxyMethod<T extends Annotation> implements AsyncProxyMethod {

    /* renamed from: a */
    private final Lazy f64977a = LazyKt.lazy(new C26333a(this));

    /* renamed from: b */
    private final Lazy f64978b = LazyKt.lazy(new C26334b(this));

    /* renamed from: c */
    private final Method f64979c;

    /* renamed from: f */
    private final Class<?> mo93475f() {
        return (Class) this.f64978b.getValue();
    }

    /* renamed from: a */
    public abstract Class<T> mo93456a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final T mo93458b() {
        return (T) ((Annotation) this.f64977a.getValue());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001b\n\u0000\u0010\u0000\u001a\u0006\u0012\u0002\b\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Ljava/lang/Class;", "T", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.rucket.core.proxymethod.BaseProxyMethod$b */
    static final class C26334b extends Lambda implements Function0<Class<?>> {
        final /* synthetic */ BaseProxyMethod this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26334b(BaseProxyMethod baseProxyMethod) {
            super(0);
            this.this$0 = baseProxyMethod;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Class<?> invoke() {
            return this.this$0.mo93461d();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "T", "", "invoke", "()Ljava/lang/annotation/Annotation;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.rucket.core.proxymethod.BaseProxyMethod$a */
    static final class C26333a extends Lambda implements Function0<T> {
        final /* synthetic */ BaseProxyMethod this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26333a(BaseProxyMethod baseProxyMethod) {
            super(0);
            this.this$0 = baseProxyMethod;
        }

        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            return (T) this.this$0.mo93462e();
        }
    }

    /* renamed from: c */
    public final <U> Class<U> mo93460c() {
        Class<U> cls = (Class<U>) mo93475f();
        if (cls != null) {
            return cls;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<U>");
    }

    /* renamed from: g */
    private final Error m95356g() {
        return new GenerateProxyMethodError("\nGenerating Proxy Method Failed: \nPlease recheck the origin method: \"" + this.f64979c.getName() + "()\"\n\n");
    }

    /* renamed from: d */
    public final Class<?> mo93461d() {
        try {
            Type genericReturnType = this.f64979c.getGenericReturnType();
            Intrinsics.checkExpressionValueIsNotNull(genericReturnType, "origin.genericReturnType");
            if (genericReturnType instanceof ParameterizedType) {
                Type type = ((ParameterizedType) genericReturnType).getActualTypeArguments()[0];
                if (type != null) {
                    return (Class) type;
                }
                throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<*>");
            }
            throw m95356g();
        } catch (Exception e) {
            C53241h.m205894a("BaseCallProxyMethod", e.toString());
            throw m95356g();
        }
    }

    /* renamed from: e */
    public final T mo93462e() {
        Annotation[] annotations = this.f64979c.getAnnotations();
        Intrinsics.checkExpressionValueIsNotNull(annotations, "origin.annotations");
        Class<T> a = mo93456a();
        if (a.isAnnotation()) {
            List a2 = C69043h.m265717a((Object[]) annotations, (Class) a);
            if (a2.size() == 1) {
                return (T) ((Annotation) a2.get(0));
            }
            throw new GenerateProxyMethodError("Parse Annotation Error!");
        }
        throw new GenerateProxyMethodError("Invalid Annotation Class Type!");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/larksuite/rucket/core/proxymethod/BaseProxyMethod$GenerateProxyMethodError;", "Ljava/lang/Error;", "Lkotlin/Error;", "message", "", "(Ljava/lang/String;)V", "rucket_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class GenerateProxyMethodError extends Error {
        public GenerateProxyMethodError(String str) {
            super(str);
        }
    }

    @Override // com.larksuite.rucket.core.proxymethod.AbstractProxyMethod
    /* renamed from: a */
    public /* synthetic */ Object mo93457a(Object[] objArr) {
        mo93459b(objArr);
        return Unit.INSTANCE;
    }

    /* renamed from: b */
    public void mo93459b(Object... objArr) {
        Intrinsics.checkParameterIsNotNull(objArr, "args");
        AsyncProxyMethod.C26335a.m95366a(this, objArr);
    }

    public BaseProxyMethod(Method method) {
        Intrinsics.checkParameterIsNotNull(method, "origin");
        this.f64979c = method;
    }
}
