package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.ttvecamera.p3038g.C60375c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNamesKt;
import kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.AnnotationDefaultValue;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.NullDefaultValue;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.StringDefaultValue;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.UtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaTypeQualifiersByElementType;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.Jsr305State;
import kotlin.reflect.jvm.internal.impl.utils.ReportLevel;

public final class SignatureEnhancement {
    private final AnnotationTypeQualifierResolver annotationTypeQualifierResolver;
    private final Jsr305State jsr305State;

    /* access modifiers changed from: private */
    public static class PartEnhancementResult {
        private final boolean containsFunctionN;
        private final KotlinType type;
        private final boolean wereChanges;

        public final boolean getContainsFunctionN() {
            return this.containsFunctionN;
        }

        public final KotlinType getType() {
            return this.type;
        }

        public final boolean getWereChanges() {
            return this.wereChanges;
        }

        public PartEnhancementResult(KotlinType kotlinType, boolean z, boolean z2) {
            Intrinsics.checkParameterIsNotNull(kotlinType, ShareHitPoint.f121869d);
            this.type = kotlinType;
            this.wereChanges = z;
            this.containsFunctionN = z2;
        }
    }

    /* access modifiers changed from: private */
    public static final class ValueParameterEnhancementResult extends PartEnhancementResult {
        private final boolean hasDefaultValue;

        public final boolean getHasDefaultValue() {
            return this.hasDefaultValue;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ValueParameterEnhancementResult(KotlinType kotlinType, boolean z, boolean z2, boolean z3) {
            super(kotlinType, z2, z3);
            Intrinsics.checkParameterIsNotNull(kotlinType, ShareHitPoint.f121869d);
            this.hasDefaultValue = z;
        }
    }

    /* access modifiers changed from: private */
    public final class SignatureParts {
        private final AnnotationTypeQualifierResolver.QualifierApplicabilityType containerApplicabilityType;
        private final LazyJavaResolverContext containerContext;
        private final Collection<KotlinType> fromOverridden;
        private final KotlinType fromOverride;
        private final boolean isCovariant;
        final /* synthetic */ SignatureEnhancement this$0;
        private final Annotated typeContainer;

        private final boolean isForVarargParameter() {
            Annotated annotated = this.typeContainer;
            KotlinType kotlinType = null;
            if (!(annotated instanceof ValueParameterDescriptor)) {
                annotated = null;
            }
            ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) annotated;
            if (valueParameterDescriptor != null) {
                kotlinType = valueParameterDescriptor.getVarargElementType();
            }
            if (kotlinType != null) {
                return true;
            }
            return false;
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0068  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x006d  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x006f  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0078  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers> computeIndexedQualifiersForOverride() {
            /*
            // Method dump skipped, instructions count: 231
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeIndexedQualifiersForOverride():kotlin.jvm.functions.Function1");
        }

        private final NullabilityQualifierWithMigrationStatus extractNullability(Annotations annotations) {
            SignatureEnhancement signatureEnhancement = this.this$0;
            Iterator it = annotations.iterator();
            while (it.hasNext()) {
                NullabilityQualifierWithMigrationStatus extractNullability = signatureEnhancement.extractNullability((AnnotationDescriptor) it.next());
                if (extractNullability != null) {
                    return extractNullability;
                }
            }
            return null;
        }

        private final List<TypeAndDefaultQualifiers> toIndexed(KotlinType kotlinType) {
            ArrayList arrayList = new ArrayList(1);
            new SignatureEnhancement$SignatureParts$toIndexed$1(arrayList).invoke(kotlinType, this.containerContext);
            return arrayList;
        }

        public final PartEnhancementResult enhance(TypeEnhancementInfo typeEnhancementInfo) {
            SignatureEnhancement$SignatureParts$enhance$$inlined$let$lambda$1 signatureEnhancement$SignatureParts$enhance$$inlined$let$lambda$1;
            Function1<Integer, JavaTypeQualifiers> computeIndexedQualifiersForOverride = computeIndexedQualifiersForOverride();
            if (typeEnhancementInfo != null) {
                signatureEnhancement$SignatureParts$enhance$$inlined$let$lambda$1 = new SignatureEnhancement$SignatureParts$enhance$$inlined$let$lambda$1(typeEnhancementInfo, computeIndexedQualifiersForOverride);
            } else {
                signatureEnhancement$SignatureParts$enhance$$inlined$let$lambda$1 = null;
            }
            boolean contains = TypeUtils.contains(this.fromOverride, SignatureEnhancement$SignatureParts$enhance$containsFunctionN$1.INSTANCE);
            KotlinType kotlinType = this.fromOverride;
            if (signatureEnhancement$SignatureParts$enhance$$inlined$let$lambda$1 != null) {
                computeIndexedQualifiersForOverride = signatureEnhancement$SignatureParts$enhance$$inlined$let$lambda$1;
            }
            KotlinType enhance = TypeEnhancementKt.enhance(kotlinType, computeIndexedQualifiersForOverride);
            if (enhance != null) {
                return new PartEnhancementResult(enhance, true, contains);
            }
            return new PartEnhancementResult(this.fromOverride, false, contains);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x004b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers extractQualifiers(kotlin.reflect.jvm.internal.impl.types.KotlinType r12) {
            /*
            // Method dump skipped, instructions count: 102
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.extractQualifiers(kotlin.reflect.jvm.internal.impl.types.KotlinType):kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers");
        }

        private final JavaTypeQualifiers extractQualifiersFromAnnotations(KotlinType kotlinType, boolean z, JavaTypeQualifiers javaTypeQualifiers) {
            Annotations annotations;
            NullabilityQualifier nullabilityQualifier;
            boolean z2;
            Annotated annotated;
            if (!z || (annotated = this.typeContainer) == null) {
                annotations = kotlinType.getAnnotations();
            } else {
                annotations = AnnotationsKt.composeAnnotations(annotated.getAnnotations(), kotlinType.getAnnotations());
            }
            SignatureEnhancement$SignatureParts$extractQualifiersFromAnnotations$1 signatureEnhancement$SignatureParts$extractQualifiersFromAnnotations$1 = new SignatureEnhancement$SignatureParts$extractQualifiersFromAnnotations$1(annotations);
            SignatureEnhancement$SignatureParts$extractQualifiersFromAnnotations$2 signatureEnhancement$SignatureParts$extractQualifiersFromAnnotations$2 = SignatureEnhancement$SignatureParts$extractQualifiersFromAnnotations$2.INSTANCE;
            NullabilityQualifier nullabilityQualifier2 = null;
            if (z) {
                JavaTypeQualifiersByElementType defaultTypeQualifiers = this.containerContext.getDefaultTypeQualifiers();
                if (defaultTypeQualifiers != null) {
                    javaTypeQualifiers = defaultTypeQualifiers.get(this.containerApplicabilityType);
                } else {
                    javaTypeQualifiers = null;
                }
            }
            NullabilityQualifierWithMigrationStatus extractNullability = extractNullability(annotations);
            if (extractNullability == null) {
                if (javaTypeQualifiers == null || javaTypeQualifiers.getNullability() == null) {
                    extractNullability = null;
                } else {
                    extractNullability = new NullabilityQualifierWithMigrationStatus(javaTypeQualifiers.getNullability(), javaTypeQualifiers.isNullabilityQualifierForWarning());
                }
            }
            if (extractNullability != null) {
                nullabilityQualifier = extractNullability.getQualifier();
            } else {
                nullabilityQualifier = null;
            }
            MutabilityQualifier mutabilityQualifier = (MutabilityQualifier) signatureEnhancement$SignatureParts$extractQualifiersFromAnnotations$2.invoke(signatureEnhancement$SignatureParts$extractQualifiersFromAnnotations$1.invoke(JvmAnnotationNamesKt.getREAD_ONLY_ANNOTATIONS(), (Object) MutabilityQualifier.READ_ONLY), signatureEnhancement$SignatureParts$extractQualifiersFromAnnotations$1.invoke(JvmAnnotationNamesKt.getMUTABLE_ANNOTATIONS(), (Object) MutabilityQualifier.MUTABLE));
            if (extractNullability != null) {
                nullabilityQualifier2 = extractNullability.getQualifier();
            }
            boolean z3 = false;
            if (nullabilityQualifier2 != NullabilityQualifier.NOT_NULL || !TypeUtilsKt.isTypeParameter(kotlinType)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (extractNullability != null && extractNullability.isForWarningOnly()) {
                z3 = true;
            }
            return new JavaTypeQualifiers(nullabilityQualifier, mutabilityQualifier, z2, z3);
        }

        public static /* synthetic */ PartEnhancementResult enhance$default(SignatureParts signatureParts, TypeEnhancementInfo typeEnhancementInfo, int i, Object obj) {
            if ((i & 1) != 0) {
                typeEnhancementInfo = null;
            }
            return signatureParts.enhance(typeEnhancementInfo);
        }

        /* JADX WARNING: Removed duplicated region for block: B:72:0x0149  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers computeQualifiersForOverride(kotlin.reflect.jvm.internal.impl.types.KotlinType r11, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> r12, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers r13, boolean r14) {
            /*
            // Method dump skipped, instructions count: 335
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride(kotlin.reflect.jvm.internal.impl.types.KotlinType, java.util.Collection, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers, boolean):kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers");
        }

        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> */
        /* JADX WARN: Multi-variable type inference failed */
        public SignatureParts(SignatureEnhancement signatureEnhancement, Annotated annotated, KotlinType kotlinType, Collection<? extends KotlinType> collection, boolean z, LazyJavaResolverContext lazyJavaResolverContext, AnnotationTypeQualifierResolver.QualifierApplicabilityType qualifierApplicabilityType) {
            Intrinsics.checkParameterIsNotNull(kotlinType, "fromOverride");
            Intrinsics.checkParameterIsNotNull(collection, "fromOverridden");
            Intrinsics.checkParameterIsNotNull(lazyJavaResolverContext, "containerContext");
            Intrinsics.checkParameterIsNotNull(qualifierApplicabilityType, "containerApplicabilityType");
            this.this$0 = signatureEnhancement;
            this.typeContainer = annotated;
            this.fromOverride = kotlinType;
            this.fromOverridden = collection;
            this.isCovariant = z;
            this.containerContext = lazyJavaResolverContext;
            this.containerApplicabilityType = qualifierApplicabilityType;
        }
    }

    public final NullabilityQualifierWithMigrationStatus extractNullability(AnnotationDescriptor annotationDescriptor) {
        NullabilityQualifierWithMigrationStatus extractNullabilityFromKnownAnnotations;
        Intrinsics.checkParameterIsNotNull(annotationDescriptor, "annotationDescriptor");
        NullabilityQualifierWithMigrationStatus extractNullabilityFromKnownAnnotations2 = extractNullabilityFromKnownAnnotations(annotationDescriptor);
        if (extractNullabilityFromKnownAnnotations2 != null) {
            return extractNullabilityFromKnownAnnotations2;
        }
        AnnotationDescriptor resolveTypeQualifierAnnotation = this.annotationTypeQualifierResolver.resolveTypeQualifierAnnotation(annotationDescriptor);
        if (resolveTypeQualifierAnnotation == null) {
            return null;
        }
        ReportLevel resolveJsr305AnnotationState = this.annotationTypeQualifierResolver.resolveJsr305AnnotationState(annotationDescriptor);
        if (!resolveJsr305AnnotationState.isIgnore() && (extractNullabilityFromKnownAnnotations = extractNullabilityFromKnownAnnotations(resolveTypeQualifierAnnotation)) != null) {
            return NullabilityQualifierWithMigrationStatus.copy$default(extractNullabilityFromKnownAnnotations, null, resolveJsr305AnnotationState.isWarning(), 1, null);
        }
        return null;
    }

    private final NullabilityQualifierWithMigrationStatus extractNullabilityTypeFromArgument(AnnotationDescriptor annotationDescriptor) {
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus;
        ConstantValue<?> firstArgument = DescriptorUtilsKt.firstArgument(annotationDescriptor);
        if (!(firstArgument instanceof EnumValue)) {
            firstArgument = null;
        }
        EnumValue enumValue = (EnumValue) firstArgument;
        if (enumValue == null) {
            return new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NOT_NULL, false, 2, null);
        }
        String asString = enumValue.getEnumEntryName().asString();
        switch (asString.hashCode()) {
            case 73135176:
                if (!asString.equals("MAYBE")) {
                    return null;
                }
                nullabilityQualifierWithMigrationStatus = new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NULLABLE, false, 2, null);
                break;
            case 74175084:
                if (!asString.equals("NEVER")) {
                    return null;
                }
                nullabilityQualifierWithMigrationStatus = new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NULLABLE, false, 2, null);
                break;
            case 433141802:
                if (asString.equals(GrsBaseInfo.CountryCodeSource.UNKNOWN)) {
                    nullabilityQualifierWithMigrationStatus = new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.FORCE_FLEXIBILITY, false, 2, null);
                    break;
                } else {
                    return null;
                }
            case 1933739535:
                if (asString.equals("ALWAYS")) {
                    nullabilityQualifierWithMigrationStatus = new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NOT_NULL, false, 2, null);
                    break;
                } else {
                    return null;
                }
            default:
                return null;
        }
        return nullabilityQualifierWithMigrationStatus;
    }

    private final NullabilityQualifierWithMigrationStatus extractNullabilityFromKnownAnnotations(AnnotationDescriptor annotationDescriptor) {
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus;
        FqName fqName = annotationDescriptor.getFqName();
        if (fqName == null) {
            return null;
        }
        if (JvmAnnotationNamesKt.getNULLABLE_ANNOTATIONS().contains(fqName)) {
            nullabilityQualifierWithMigrationStatus = new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NULLABLE, false, 2, null);
        } else if (JvmAnnotationNamesKt.getNOT_NULL_ANNOTATIONS().contains(fqName)) {
            nullabilityQualifierWithMigrationStatus = new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NOT_NULL, false, 2, null);
        } else if (Intrinsics.areEqual(fqName, JvmAnnotationNamesKt.getJAVAX_NONNULL_ANNOTATION())) {
            nullabilityQualifierWithMigrationStatus = extractNullabilityTypeFromArgument(annotationDescriptor);
        } else if (Intrinsics.areEqual(fqName, JvmAnnotationNamesKt.getCOMPATQUAL_NULLABLE_ANNOTATION()) && this.jsr305State.getEnableCompatqualCheckerFrameworkAnnotations()) {
            nullabilityQualifierWithMigrationStatus = new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NULLABLE, false, 2, null);
        } else if (Intrinsics.areEqual(fqName, JvmAnnotationNamesKt.getCOMPATQUAL_NONNULL_ANNOTATION()) && this.jsr305State.getEnableCompatqualCheckerFrameworkAnnotations()) {
            nullabilityQualifierWithMigrationStatus = new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NOT_NULL, false, 2, null);
        } else if (Intrinsics.areEqual(fqName, JvmAnnotationNamesKt.getANDROIDX_RECENTLY_NON_NULL_ANNOTATION())) {
            nullabilityQualifierWithMigrationStatus = new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NOT_NULL, true);
        } else if (Intrinsics.areEqual(fqName, JvmAnnotationNamesKt.getANDROIDX_RECENTLY_NULLABLE_ANNOTATION())) {
            nullabilityQualifierWithMigrationStatus = new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NULLABLE, true);
        } else {
            nullabilityQualifierWithMigrationStatus = null;
        }
        if (nullabilityQualifierWithMigrationStatus == null) {
            return null;
        }
        if (nullabilityQualifierWithMigrationStatus.isForWarningOnly() || !(annotationDescriptor instanceof PossiblyExternalAnnotationDescriptor) || !((PossiblyExternalAnnotationDescriptor) annotationDescriptor).isIdeExternalAnnotation()) {
            return nullabilityQualifierWithMigrationStatus;
        }
        return NullabilityQualifierWithMigrationStatus.copy$default(nullabilityQualifierWithMigrationStatus, null, true, 1, null);
    }

    public SignatureEnhancement(AnnotationTypeQualifierResolver annotationTypeQualifierResolver2, Jsr305State jsr305State2) {
        Intrinsics.checkParameterIsNotNull(annotationTypeQualifierResolver2, "annotationTypeQualifierResolver");
        Intrinsics.checkParameterIsNotNull(jsr305State2, "jsr305State");
        this.annotationTypeQualifierResolver = annotationTypeQualifierResolver2;
        this.jsr305State = jsr305State2;
    }

    public final <D extends CallableMemberDescriptor> Collection<D> enhanceSignatures(LazyJavaResolverContext lazyJavaResolverContext, Collection<? extends D> collection) {
        Intrinsics.checkParameterIsNotNull(lazyJavaResolverContext, C60375c.f150914a);
        Intrinsics.checkParameterIsNotNull(collection, "platformSignatures");
        Collection<? extends D> collection2 = collection;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(enhanceSignature(it.next(), lazyJavaResolverContext));
        }
        return arrayList;
    }

    private final boolean hasDefaultValueInAnnotation(ValueParameterDescriptor valueParameterDescriptor, KotlinType kotlinType) {
        boolean z;
        AnnotationDefaultValue defaultValueFromAnnotation = UtilKt.getDefaultValueFromAnnotation(valueParameterDescriptor);
        if (defaultValueFromAnnotation instanceof StringDefaultValue) {
            if (UtilsKt.lexicalCastFrom(kotlinType, ((StringDefaultValue) defaultValueFromAnnotation).getValue()) != null) {
                z = true;
            } else {
                z = false;
            }
        } else if (Intrinsics.areEqual(defaultValueFromAnnotation, NullDefaultValue.INSTANCE)) {
            z = TypeUtils.acceptsNullable(kotlinType);
        } else if (defaultValueFromAnnotation == null) {
            z = valueParameterDescriptor.declaresDefaultValue();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (!z || !valueParameterDescriptor.getOverriddenDescriptors().isEmpty()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0216  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01fa A[EDGE_INSN: B:147:0x01fa->B:99:0x01fa ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0237 A[EDGE_INSN: B:148:0x0237->B:118:0x0237 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <D extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> D enhanceSignature(D r17, kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext r18) {
        /*
        // Method dump skipped, instructions count: 694
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext):kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor");
    }

    private final SignatureParts partsForValueParameter(CallableMemberDescriptor callableMemberDescriptor, ValueParameterDescriptor valueParameterDescriptor, LazyJavaResolverContext lazyJavaResolverContext, Function1<? super CallableMemberDescriptor, ? extends KotlinType> function1) {
        LazyJavaResolverContext lazyJavaResolverContext2;
        LazyJavaResolverContext copyWithNewDefaultTypeQualifiers;
        ValueParameterDescriptor valueParameterDescriptor2 = valueParameterDescriptor;
        if (valueParameterDescriptor == null || (copyWithNewDefaultTypeQualifiers = ContextKt.copyWithNewDefaultTypeQualifiers(lazyJavaResolverContext, valueParameterDescriptor.getAnnotations())) == null) {
            lazyJavaResolverContext2 = lazyJavaResolverContext;
        } else {
            lazyJavaResolverContext2 = copyWithNewDefaultTypeQualifiers;
        }
        return parts(callableMemberDescriptor, valueParameterDescriptor2, false, lazyJavaResolverContext2, AnnotationTypeQualifierResolver.QualifierApplicabilityType.VALUE_PARAMETER, function1);
    }

    private final SignatureParts parts(CallableMemberDescriptor callableMemberDescriptor, Annotated annotated, boolean z, LazyJavaResolverContext lazyJavaResolverContext, AnnotationTypeQualifierResolver.QualifierApplicabilityType qualifierApplicabilityType, Function1<? super CallableMemberDescriptor, ? extends KotlinType> function1) {
        KotlinType kotlinType = (KotlinType) function1.invoke(callableMemberDescriptor);
        Collection<? extends CallableMemberDescriptor> overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors();
        Intrinsics.checkExpressionValueIsNotNull(overriddenDescriptors, "this.overriddenDescriptors");
        Collection<? extends CallableMemberDescriptor> collection = overriddenDescriptors;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection, 10));
        for (T t : collection) {
            Intrinsics.checkExpressionValueIsNotNull(t, "it");
            arrayList.add((KotlinType) function1.invoke(t));
        }
        return new SignatureParts(this, annotated, kotlinType, arrayList, z, ContextKt.copyWithNewDefaultTypeQualifiers(lazyJavaResolverContext, ((KotlinType) function1.invoke(callableMemberDescriptor)).getAnnotations()), qualifierApplicabilityType);
    }
}
