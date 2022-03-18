package org.koin.core.instance;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.koin.core.Koin;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.error.InstanceCreationException;
import org.koin.core.logger.Level;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b&\u0018\u0000 \u0013*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0013B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\u0015\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\fH\u0016¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH&J\u0015\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\fH&¢\u0006\u0002\u0010\rJ\b\u0010\u0011\u001a\u00020\u0012H&R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lorg/koin/core/instance/InstanceFactory;", "T", "", "_koin", "Lorg/koin/core/Koin;", "beanDefinition", "Lorg/koin/core/definition/BeanDefinition;", "(Lorg/koin/core/Koin;Lorg/koin/core/definition/BeanDefinition;)V", "getBeanDefinition", "()Lorg/koin/core/definition/BeanDefinition;", "create", "context", "Lorg/koin/core/instance/InstanceContext;", "(Lorg/koin/core/instance/InstanceContext;)Ljava/lang/Object;", "drop", "", "get", "isCreated", "", "Companion", "koin-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: org.koin.core.b.c */
public abstract class InstanceFactory<T> {

    /* renamed from: a */
    public static final Companion f175019a = new Companion(null);

    /* renamed from: b */
    private final Koin f175020b;

    /* renamed from: c */
    private final BeanDefinition<T> f175021c;

    /* renamed from: a */
    public abstract T mo246629a(InstanceContext bVar);

    /* renamed from: a */
    public abstract void mo246630a();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lorg/koin/core/instance/InstanceFactory$Companion;", "", "()V", "ERROR_SEPARATOR", "", "koin-core"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: org.koin.core.b.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    public final BeanDefinition<T> mo246634b() {
        return this.f175021c;
    }

    /* renamed from: b */
    public T mo246633b(InstanceContext bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "context");
        if (this.f175020b.mo246617b().mo246690a(Level.DEBUG)) {
            this.f175020b.mo246617b().mo246689a("| create instance for " + this.f175021c);
        }
        try {
            return this.f175021c.mo246648d().invoke(bVar.mo246632b(), bVar.mo246631a());
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append(e.toString());
            sb.append("\n\t");
            StackTraceElement[] stackTrace = e.getStackTrace();
            Intrinsics.checkExpressionValueIsNotNull(stackTrace, "e.stackTrace");
            ArrayList arrayList = new ArrayList();
            for (StackTraceElement stackTraceElement : stackTrace) {
                Intrinsics.checkExpressionValueIsNotNull(stackTraceElement, "it");
                String className = stackTraceElement.getClassName();
                Intrinsics.checkExpressionValueIsNotNull(className, "it.className");
                if (!(!StringsKt.contains$default((CharSequence) className, (CharSequence) "sun.reflect", false, 2, (Object) null))) {
                    break;
                }
                arrayList.add(stackTraceElement);
            }
            sb.append(CollectionsKt.joinToString$default(arrayList, "\n\t", null, null, 0, null, null, 62, null));
            String sb2 = sb.toString();
            this.f175020b.mo246617b().mo246692c("Instance creation error : could not create instance for " + this.f175021c + ": " + sb2);
            throw new InstanceCreationException("Could not create instance for " + this.f175021c, e);
        }
    }

    public InstanceFactory(Koin aVar, BeanDefinition<T> aVar2) {
        Intrinsics.checkParameterIsNotNull(aVar, "_koin");
        Intrinsics.checkParameterIsNotNull(aVar2, "beanDefinition");
        this.f175020b = aVar;
        this.f175021c = aVar2;
    }
}
