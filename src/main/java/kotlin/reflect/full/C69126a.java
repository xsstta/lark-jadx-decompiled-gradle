package kotlin.reflect.full;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.KClassifierImpl;
import kotlin.reflect.jvm.internal.KTypeImpl;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionBase;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001b\n\u0000\u001a.\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002\u001a6\u0010\u0012\u001a\u00020\u0001*\u00020\u00022\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000eH\u0007\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0015"}, d2 = {"starProjectedType", "Lkotlin/reflect/KType;", "Lkotlin/reflect/KClassifier;", "starProjectedType$annotations", "(Lkotlin/reflect/KClassifier;)V", "getStarProjectedType", "(Lkotlin/reflect/KClassifier;)Lkotlin/reflect/KType;", "createKotlinType", "Lkotlin/reflect/jvm/internal/impl/types/SimpleType;", "typeAnnotations", "Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/Annotations;", "typeConstructor", "Lkotlin/reflect/jvm/internal/impl/types/TypeConstructor;", "arguments", "", "Lkotlin/reflect/KTypeProjection;", "nullable", "", "createType", "annotations", "", "kotlin-reflection"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: kotlin.reflect.full.a */
public final class C69126a {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0001\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: kotlin.reflect.full.a$a */
    static final class C69127a extends Lambda implements Function0 {
        final /* synthetic */ KClassifier $this_createType;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69127a(KClassifier aVar) {
            super(0);
            this.$this_createType = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Void invoke() {
            throw new NotImplementedError("An operation is not implemented: " + ("Java type is not yet supported for types created with createType (classifier = " + this.$this_createType + ')'));
        }
    }

    /* renamed from: a */
    public static final KType m266076a(KClassifier aVar, List<KTypeProjection> list, boolean z, List<? extends Annotation> list2) {
        KClassifier aVar2;
        ClassifierDescriptor descriptor;
        Annotations annotations;
        Intrinsics.checkParameterIsNotNull(aVar, "$this$createType");
        Intrinsics.checkParameterIsNotNull(list, "arguments");
        Intrinsics.checkParameterIsNotNull(list2, "annotations");
        if (!(aVar instanceof KClassifierImpl)) {
            aVar2 = null;
        } else {
            aVar2 = aVar;
        }
        KClassifierImpl kClassifierImpl = (KClassifierImpl) aVar2;
        if (kClassifierImpl == null || (descriptor = kClassifierImpl.getDescriptor()) == null) {
            throw new KotlinReflectionInternalError("Cannot create type for an unsupported classifier: " + aVar + " (" + aVar.getClass() + ')');
        }
        TypeConstructor typeConstructor = descriptor.getTypeConstructor();
        Intrinsics.checkExpressionValueIsNotNull(typeConstructor, "descriptor.typeConstructor");
        List<TypeParameterDescriptor> parameters = typeConstructor.getParameters();
        Intrinsics.checkExpressionValueIsNotNull(parameters, "typeConstructor.parameters");
        if (parameters.size() == list.size()) {
            if (list2.isEmpty()) {
                annotations = Annotations.Companion.getEMPTY();
            } else {
                annotations = Annotations.Companion.getEMPTY();
            }
            return new KTypeImpl(m266077a(annotations, typeConstructor, list, z), new C69127a(aVar));
        }
        throw new IllegalArgumentException("Class declares " + parameters.size() + " type parameters, but " + list.size() + " were provided.");
    }

    /* renamed from: a */
    private static final SimpleType m266077a(Annotations annotations, TypeConstructor typeConstructor, List<KTypeProjection> list, boolean z) {
        KotlinType kotlinType;
        TypeProjectionBase typeProjectionBase;
        List<TypeParameterDescriptor> parameters = typeConstructor.getParameters();
        Intrinsics.checkExpressionValueIsNotNull(parameters, "typeConstructor.parameters");
        List<KTypeProjection> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        int i = 0;
        for (T t : list2) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            T t2 = t;
            KTypeImpl kTypeImpl = (KTypeImpl) t2.mo239435b();
            if (kTypeImpl != null) {
                kotlinType = kTypeImpl.getType();
            } else {
                kotlinType = null;
            }
            KVariance a = t2.mo239434a();
            if (a == null) {
                TypeParameterDescriptor typeParameterDescriptor = parameters.get(i);
                Intrinsics.checkExpressionValueIsNotNull(typeParameterDescriptor, "parameters[index]");
                typeProjectionBase = new StarProjectionImpl(typeParameterDescriptor);
            } else {
                int i3 = C69128b.f173259a[a.ordinal()];
                if (i3 == 1) {
                    Variance variance = Variance.INVARIANT;
                    if (kotlinType == null) {
                        Intrinsics.throwNpe();
                    }
                    typeProjectionBase = new TypeProjectionImpl(variance, kotlinType);
                } else if (i3 == 2) {
                    Variance variance2 = Variance.IN_VARIANCE;
                    if (kotlinType == null) {
                        Intrinsics.throwNpe();
                    }
                    typeProjectionBase = new TypeProjectionImpl(variance2, kotlinType);
                } else if (i3 == 3) {
                    Variance variance3 = Variance.OUT_VARIANCE;
                    if (kotlinType == null) {
                        Intrinsics.throwNpe();
                    }
                    typeProjectionBase = new TypeProjectionImpl(variance3, kotlinType);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            arrayList.add(typeProjectionBase);
            i = i2;
        }
        return KotlinTypeFactory.simpleType$default(annotations, typeConstructor, arrayList, z, null, 16, null);
    }
}
