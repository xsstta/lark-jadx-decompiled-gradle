package kotlin.reflect.jvm;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001c\u0010\u0000\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u00028@X\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\"\u0010\u0000\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u00058FX\u0004¢\u0006\f\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0003\u0010\b¨\u0006\t"}, d2 = {"jvmErasure", "Lkotlin/reflect/KClass;", "Lkotlin/reflect/KClassifier;", "getJvmErasure", "(Lkotlin/reflect/KClassifier;)Lkotlin/reflect/KClass;", "Lkotlin/reflect/KType;", "jvmErasure$annotations", "(Lkotlin/reflect/KType;)V", "(Lkotlin/reflect/KType;)Lkotlin/reflect/KClass;", "kotlin-reflection"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: kotlin.reflect.jvm.a */
public final class C69129a {
    /* renamed from: a */
    public static final KClass<?> m266085a(KType gVar) {
        KClass<?> a;
        Intrinsics.checkParameterIsNotNull(gVar, "$this$jvmErasure");
        KClassifier classifier = gVar.getClassifier();
        if (classifier != null && (a = m266084a(classifier)) != null) {
            return a;
        }
        throw new KotlinReflectionInternalError("Cannot calculate JVM erasure for type: " + gVar);
    }

    /* renamed from: a */
    public static final KClass<?> m266084a(KClassifier aVar) {
        T t;
        KClass<?> a;
        boolean z;
        Intrinsics.checkParameterIsNotNull(aVar, "$this$jvmErasure");
        if (aVar instanceof KClass) {
            return (KClass) aVar;
        }
        if (aVar instanceof KTypeParameter) {
            List<KType> upperBounds = ((KTypeParameter) aVar).getUpperBounds();
            Iterator<T> it = upperBounds.iterator();
            while (true) {
                t = null;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                T t2 = next;
                if (t2 != null) {
                    ClassifierDescriptor declarationDescriptor = t2.getType().getConstructor().getDeclarationDescriptor();
                    if (declarationDescriptor instanceof ClassDescriptor) {
                        t = declarationDescriptor;
                    }
                    T t3 = t;
                    if (t3 == null || t3.getKind() == ClassKind.INTERFACE || t3.getKind() == ClassKind.ANNOTATION_CLASS) {
                        z = false;
                        continue;
                    } else {
                        z = true;
                        continue;
                    }
                    if (z) {
                        t = next;
                        break;
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
                }
            }
            T t4 = t;
            if (t4 == null) {
                t4 = (KType) CollectionsKt.firstOrNull((List) upperBounds);
            }
            if (t4 == null || (a = m266085a(t4)) == null) {
                return Reflection.getOrCreateKotlinClass(Object.class);
            }
            return a;
        }
        throw new KotlinReflectionInternalError("Cannot calculate JVM erasure for type: " + aVar);
    }
}
