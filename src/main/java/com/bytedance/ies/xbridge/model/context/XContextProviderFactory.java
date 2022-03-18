package com.bytedance.ies.xbridge.model.context;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\u0000J\"\u0010\b\u001a\n\u0012\u0004\u0012\u0002H\t\u0018\u00010\u0006\"\u0004\b\u0000\u0010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\u0005J\u001a\u0010\u000b\u001a\u00020\f\"\u0004\b\u0000\u0010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\u0005J\u0010\u0010\r\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u000eJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0000J!\u0010\u0012\u001a\u0004\u0018\u0001H\t\"\u0004\b\u0000\u0010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\u0005¢\u0006\u0002\u0010\u0013J)\u0010\u0014\u001a\u00020\u0010\"\u0004\b\u0000\u0010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\u00052\b\u0010\u0015\u001a\u0004\u0018\u0001H\t¢\u0006\u0002\u0010\u0016J*\u0010\u0017\u001a\u00020\u0010\"\u0004\b\u0000\u0010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\u00052\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\t0\u0019J(\u0010\u0017\u001a\u00020\u0010\"\u0004\b\u0000\u0010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\u00052\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\t0\u0006J)\u0010\u001a\u001a\u00020\u0010\"\u0004\b\u0000\u0010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\u00052\b\u0010\u0015\u001a\u0004\u0018\u0001H\t¢\u0006\u0002\u0010\u0016J\u0006\u0010\u001b\u001a\u00020\u0010J\u001a\u0010\u001c\u001a\u00020\u0010\"\u0004\b\u0000\u0010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\u0005R\"\u0010\u0003\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/bytedance/ies/xbridge/model/context/XContextProviderFactory;", "", "()V", "providers", "", "Ljava/lang/Class;", "Lcom/bytedance/ies/xbridge/model/context/IXContextProvider;", "copy", "getProvider", "T", "clazz", "has", "", "keys", "", "merge", "", "other", "provideInstance", "(Ljava/lang/Class;)Ljava/lang/Object;", "registerHolder", "item", "(Ljava/lang/Class;Ljava/lang/Object;)V", "registerProvider", "provider", "Lkotlin/Function0;", "registerWeakHolder", "removeAll", "removeProvider", "x-bridge-core-api_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.xbridge.d.b.c */
public final class XContextProviderFactory {

    /* renamed from: a */
    private final Map<Class<?>, IXContextProvider<?>> f38028a = new LinkedHashMap();

    /* renamed from: a */
    public final <T> T mo53115a(Class<T> cls) {
        T t;
        Intrinsics.checkParameterIsNotNull(cls, "clazz");
        IXContextProvider<?> aVar = this.f38028a.get(cls);
        if (aVar == null || (t = (T) aVar.mo53114b()) == null) {
            return null;
        }
        if (!cls.isAssignableFrom(t.getClass())) {
            t = null;
        }
        if (t != null) {
            return t;
        }
        return null;
    }

    /* renamed from: a */
    public final <T> void mo53117a(Class<T> cls, T t) {
        Intrinsics.checkParameterIsNotNull(cls, "clazz");
        mo53116a((Class) cls, (IXContextProvider) new XWeakContextHolder(t));
    }

    /* renamed from: b */
    public final <T> void mo53118b(Class<T> cls, T t) {
        Intrinsics.checkParameterIsNotNull(cls, "clazz");
        mo53116a((Class) cls, (IXContextProvider) new XContextHolder(t));
    }

    /* renamed from: a */
    public final <T> void mo53116a(Class<T> cls, IXContextProvider<? extends T> aVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(cls, "clazz");
        Intrinsics.checkParameterIsNotNull(aVar, "provider");
        IXContextProvider<?> aVar2 = this.f38028a.get(cls);
        if (aVar2 != null) {
            if (aVar2 == aVar) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                aVar2 = null;
            }
            if (aVar2 != null) {
                aVar2.mo52927a();
            }
        }
        this.f38028a.put(cls, aVar);
    }
}
