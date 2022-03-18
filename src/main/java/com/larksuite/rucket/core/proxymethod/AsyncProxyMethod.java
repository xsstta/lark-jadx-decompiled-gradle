package com.larksuite.rucket.core.proxymethod;

import com.larksuite.framework.callback.IGetDataCallback;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C69043h;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u00020\u00032\u0016\u0010\u0004\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\u0005\"\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0002\u0010\u0007J1\u0010\b\u001a\u00020\u00032\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\n2\u0016\u0010\u0004\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\u0005\"\u0004\u0018\u00010\u0006H&¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/larksuite/rucket/core/proxymethod/AsyncProxyMethod;", "Lcom/larksuite/rucket/core/proxymethod/AbstractProxyMethod;", "invoke", "", "args", "", "", "([Ljava/lang/Object;)V", "invokeWithCallback", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "(Lcom/larksuite/framework/callback/IGetDataCallback;[Ljava/lang/Object;)V", "rucket_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.rucket.core.proxymethod.b */
public interface AsyncProxyMethod extends AbstractProxyMethod {
    /* renamed from: a */
    void mo93463a(IGetDataCallback<?> iGetDataCallback, Object... objArr);

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.rucket.core.proxymethod.b$a */
    public static final class C26335a {
        /* renamed from: a */
        public static void m95366a(AsyncProxyMethod bVar, Object... objArr) {
            Intrinsics.checkParameterIsNotNull(objArr, "args");
            int length = objArr.length;
            if (length >= 1 && (objArr[0] instanceof IGetDataCallback)) {
                Object[] array = C69043h.m265763b(objArr, length - 1).toArray(new Object[0]);
                if (array != null) {
                    Object obj = objArr[0];
                    if (obj != null) {
                        bVar.mo93463a((IGetDataCallback) obj, Arrays.copyOf(array, array.length));
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type com.larksuite.framework.callback.IGetDataCallback<*>");
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        }
    }
}
