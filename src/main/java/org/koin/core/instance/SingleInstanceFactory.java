package org.koin.core.instance;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.Koin;
import org.koin.core.definition.BeanDefinition;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\u0015\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\fH\u0016¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0015\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\fH\u0016¢\u0006\u0002\u0010\rJ\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0012\u0010\b\u001a\u0004\u0018\u00018\u0000X\u000e¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u0013"}, d2 = {"Lorg/koin/core/instance/SingleInstanceFactory;", "T", "Lorg/koin/core/instance/InstanceFactory;", "koin", "Lorg/koin/core/Koin;", "beanDefinition", "Lorg/koin/core/definition/BeanDefinition;", "(Lorg/koin/core/Koin;Lorg/koin/core/definition/BeanDefinition;)V", "value", "Ljava/lang/Object;", "create", "context", "Lorg/koin/core/instance/InstanceContext;", "(Lorg/koin/core/instance/InstanceContext;)Ljava/lang/Object;", "drop", "", "get", "isCreated", "", "koin-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: org.koin.core.b.d */
public final class SingleInstanceFactory<T> extends InstanceFactory<T> {

    /* renamed from: b */
    private T f175022b;

    /* renamed from: c */
    public boolean mo246635c() {
        if (this.f175022b != null) {
            return true;
        }
        return false;
    }

    @Override // org.koin.core.instance.InstanceFactory
    /* renamed from: a */
    public void mo246630a() {
        Function1<T, Unit> a = mo246634b().mo246653h().mo246657a();
        if (a != null) {
            a.invoke(this.f175022b);
        }
        this.f175022b = null;
    }

    @Override // org.koin.core.instance.InstanceFactory
    /* renamed from: a */
    public T mo246629a(InstanceContext bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "context");
        if (!mo246635c()) {
            this.f175022b = mo246633b(bVar);
        }
        T t = this.f175022b;
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Single instance created couldn't return value".toString());
    }

    @Override // org.koin.core.instance.InstanceFactory
    /* renamed from: b */
    public T mo246633b(InstanceContext bVar) {
        T t;
        Intrinsics.checkParameterIsNotNull(bVar, "context");
        synchronized (this) {
            t = this.f175022b;
            if (t == null) {
                t = (T) super.mo246633b(bVar);
            } else if (t == null) {
                throw new IllegalStateException("Single instance created couldn't return value".toString());
            }
        }
        return t;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SingleInstanceFactory(Koin aVar, BeanDefinition<T> aVar2) {
        super(aVar, aVar2);
        Intrinsics.checkParameterIsNotNull(aVar, "koin");
        Intrinsics.checkParameterIsNotNull(aVar2, "beanDefinition");
    }
}
