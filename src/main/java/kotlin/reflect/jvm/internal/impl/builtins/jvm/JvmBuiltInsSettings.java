package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.am;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilterKt;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.CacheWithNotNullValues;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.LazyWrappedType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

public class JvmBuiltInsSettings implements AdditionalClassPartsProvider, PlatformDependentDeclarationFilter {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(JvmBuiltInsSettings.class), "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(JvmBuiltInsSettings.class), "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;"))};
    private static final Set<String> BLACK_LIST_CONSTRUCTOR_SIGNATURES;
    public static final Set<String> BLACK_LIST_METHOD_SIGNATURES;
    public static final Companion Companion;
    public static final Set<String> DROP_LIST_METHOD_SIGNATURES = am.m265693a(SignatureBuildingComponents.INSTANCE.inJavaUtil("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");
    private static final Set<String> MUTABLE_METHOD_SIGNATURES;
    private static final Set<String> WHITE_LIST_CONSTRUCTOR_SIGNATURES;
    public static final Set<String> WHITE_LIST_METHOD_SIGNATURES;
    private final NotNullLazyValue cloneableType$delegate;
    private final Lazy isAdditionalBuiltInsFeatureSupported$delegate;
    public final JavaToKotlinClassMap j2kClassMap = JavaToKotlinClassMap.INSTANCE;
    private final CacheWithNotNullValues<FqName, ClassDescriptor> javaAnalogueClassesWithCustomSupertypeCache;
    private final KotlinType mockSerializableType;
    public final ModuleDescriptor moduleDescriptor;
    private final NotNullLazyValue notConsideredDeprecation$delegate;
    private final Lazy ownerModuleDescriptor$delegate;

    /* access modifiers changed from: private */
    public enum JDKMemberStatus {
        BLACK_LIST,
        WHITE_LIST,
        NOT_CONSIDERED,
        DROP
    }

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[JDKMemberStatus.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[JDKMemberStatus.BLACK_LIST.ordinal()] = 1;
            iArr[JDKMemberStatus.NOT_CONSIDERED.ordinal()] = 2;
            iArr[JDKMemberStatus.DROP.ordinal()] = 3;
            iArr[JDKMemberStatus.WHITE_LIST.ordinal()] = 4;
        }
    }

    private final SimpleType getCloneableType() {
        return (SimpleType) StorageKt.getValue(this.cloneableType$delegate, this, $$delegatedProperties[0]);
    }

    private final Annotations getNotConsideredDeprecation() {
        return (Annotations) StorageKt.getValue(this.notConsideredDeprecation$delegate, this, $$delegatedProperties[1]);
    }

    private final boolean isAdditionalBuiltInsFeatureSupported() {
        return ((Boolean) this.isAdditionalBuiltInsFeatureSupported$delegate.getValue()).booleanValue();
    }

    public final ModuleDescriptor getOwnerModuleDescriptor() {
        return (ModuleDescriptor) this.ownerModuleDescriptor$delegate.getValue();
    }

    public static final class Companion {
        private Companion() {
        }

        public final Set<String> getBLACK_LIST_METHOD_SIGNATURES() {
            return JvmBuiltInsSettings.BLACK_LIST_METHOD_SIGNATURES;
        }

        public final Set<String> getDROP_LIST_METHOD_SIGNATURES() {
            return JvmBuiltInsSettings.DROP_LIST_METHOD_SIGNATURES;
        }

        public final Set<String> getWHITE_LIST_METHOD_SIGNATURES() {
            return JvmBuiltInsSettings.WHITE_LIST_METHOD_SIGNATURES;
        }

        public final Set<String> buildPrimitiveStringConstructorsSet() {
            SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
            JvmPrimitiveType[] jvmPrimitiveTypeArr = {JvmPrimitiveType.BOOLEAN, JvmPrimitiveType.BYTE, JvmPrimitiveType.DOUBLE, JvmPrimitiveType.FLOAT, JvmPrimitiveType.BYTE, JvmPrimitiveType.INT, JvmPrimitiveType.LONG, JvmPrimitiveType.SHORT};
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (JvmPrimitiveType jvmPrimitiveType : CollectionsKt.listOf((Object[]) jvmPrimitiveTypeArr)) {
                String asString = jvmPrimitiveType.getWrapperFqName().shortName().asString();
                Intrinsics.checkExpressionValueIsNotNull(asString, "it.wrapperFqName.shortName().asString()");
                String[] constructors = signatureBuildingComponents.constructors("Ljava/lang/String;");
                CollectionsKt.addAll(linkedHashSet, signatureBuildingComponents.inJavaLang(asString, (String[]) Arrays.copyOf(constructors, constructors.length)));
            }
            return linkedHashSet;
        }

        public final Set<String> buildPrimitiveValueMethodsSet() {
            SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
            JvmPrimitiveType[] jvmPrimitiveTypeArr = {JvmPrimitiveType.BOOLEAN, JvmPrimitiveType.CHAR};
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (JvmPrimitiveType jvmPrimitiveType : CollectionsKt.listOf((Object[]) jvmPrimitiveTypeArr)) {
                String asString = jvmPrimitiveType.getWrapperFqName().shortName().asString();
                Intrinsics.checkExpressionValueIsNotNull(asString, "it.wrapperFqName.shortName().asString()");
                CollectionsKt.addAll(linkedHashSet, signatureBuildingComponents.inJavaLang(asString, jvmPrimitiveType.getJavaKeywordName() + "Value()" + jvmPrimitiveType.getDesc()));
            }
            return linkedHashSet;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isArrayOrPrimitiveArray(FqNameUnsafe fqNameUnsafe) {
            if (Intrinsics.areEqual(fqNameUnsafe, KotlinBuiltIns.FQ_NAMES.array) || KotlinBuiltIns.isPrimitiveArray(fqNameUnsafe)) {
                return true;
            }
            return false;
        }

        public final boolean isSerializableInJava(FqNameUnsafe fqNameUnsafe) {
            Intrinsics.checkParameterIsNotNull(fqNameUnsafe, "fqName");
            if (isArrayOrPrimitiveArray(fqNameUnsafe)) {
                return true;
            }
            ClassId mapKotlinToJava = JavaToKotlinClassMap.INSTANCE.mapKotlinToJava(fqNameUnsafe);
            if (mapKotlinToJava != null) {
                try {
                    return Serializable.class.isAssignableFrom(Class.forName(mapKotlinToJava.asSingleFqName().asString()));
                } catch (ClassNotFoundException unused) {
                }
            }
            return false;
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
        BLACK_LIST_METHOD_SIGNATURES = am.m265692a(am.m265692a(am.m265692a(am.m265692a(am.m265692a((Set) companion.buildPrimitiveValueMethodsSet(), (Iterable) signatureBuildingComponents.inJavaUtil("List", "sort(Ljava/util/Comparator;)V")), (Iterable) signatureBuildingComponents.inJavaLang("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), (Iterable) signatureBuildingComponents.inJavaLang("Double", "isInfinite()Z", "isNaN()Z")), (Iterable) signatureBuildingComponents.inJavaLang("Float", "isInfinite()Z", "isNaN()Z")), (Iterable) signatureBuildingComponents.inJavaLang("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V"));
        SignatureBuildingComponents signatureBuildingComponents2 = SignatureBuildingComponents.INSTANCE;
        WHITE_LIST_METHOD_SIGNATURES = am.m265692a(am.m265692a(am.m265692a(am.m265692a(am.m265692a(am.m265692a((Set) signatureBuildingComponents2.inJavaLang("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), (Iterable) signatureBuildingComponents2.inJavaUtil("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), (Iterable) signatureBuildingComponents2.inJavaLang("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), (Iterable) signatureBuildingComponents2.inJavaLang("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), (Iterable) signatureBuildingComponents2.inJavaUtil("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), (Iterable) signatureBuildingComponents2.inJavaUtil("List", "replaceAll(Ljava/util/function/UnaryOperator;)V")), (Iterable) signatureBuildingComponents2.inJavaUtil("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        SignatureBuildingComponents signatureBuildingComponents3 = SignatureBuildingComponents.INSTANCE;
        MUTABLE_METHOD_SIGNATURES = am.m265692a(am.m265692a((Set) signatureBuildingComponents3.inJavaUtil("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), (Iterable) signatureBuildingComponents3.inJavaUtil("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V")), (Iterable) signatureBuildingComponents3.inJavaUtil("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        SignatureBuildingComponents signatureBuildingComponents4 = SignatureBuildingComponents.INSTANCE;
        Set<String> buildPrimitiveStringConstructorsSet = companion.buildPrimitiveStringConstructorsSet();
        String[] constructors = signatureBuildingComponents4.constructors("D");
        Set a = am.m265692a((Set) buildPrimitiveStringConstructorsSet, (Iterable) signatureBuildingComponents4.inJavaLang("Float", (String[]) Arrays.copyOf(constructors, constructors.length)));
        String[] constructors2 = signatureBuildingComponents4.constructors("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        BLACK_LIST_CONSTRUCTOR_SIGNATURES = am.m265692a(a, (Iterable) signatureBuildingComponents4.inJavaLang("String", (String[]) Arrays.copyOf(constructors2, constructors2.length)));
        SignatureBuildingComponents signatureBuildingComponents5 = SignatureBuildingComponents.INSTANCE;
        String[] constructors3 = signatureBuildingComponents5.constructors("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        WHITE_LIST_CONSTRUCTOR_SIGNATURES = signatureBuildingComponents5.inJavaLang("Throwable", (String[]) Arrays.copyOf(constructors3, constructors3.length));
    }

    private final JDKMemberStatus getJdkMethodStatus(FunctionDescriptor functionDescriptor) {
        DeclarationDescriptor containingDeclaration = functionDescriptor.getContainingDeclaration();
        if (containingDeclaration != null) {
            String computeJvmDescriptor$default = MethodSignatureMappingKt.computeJvmDescriptor$default(functionDescriptor, false, false, 3, null);
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = (T) null;
            Object dfs = DFS.dfs(CollectionsKt.listOf((ClassDescriptor) containingDeclaration), new JvmBuiltInsSettings$getJdkMethodStatus$1(this), new JvmBuiltInsSettings$getJdkMethodStatus$2(computeJvmDescriptor$default, objectRef));
            Intrinsics.checkExpressionValueIsNotNull(dfs, "DFS.dfs<ClassDescriptor,…CONSIDERED\n            })");
            return (JDKMemberStatus) dfs;
        }
        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    public Set<Name> getFunctionsNames(ClassDescriptor classDescriptor) {
        LazyJavaClassMemberScope unsubstitutedMemberScope;
        Set<Name> functionNames;
        Intrinsics.checkParameterIsNotNull(classDescriptor, "classDescriptor");
        if (!isAdditionalBuiltInsFeatureSupported()) {
            return am.m265687a();
        }
        LazyJavaClassDescriptor javaAnalogue = getJavaAnalogue(classDescriptor);
        if (javaAnalogue == null || (unsubstitutedMemberScope = javaAnalogue.getUnsubstitutedMemberScope()) == null || (functionNames = unsubstitutedMemberScope.getFunctionNames()) == null) {
            return am.m265687a();
        }
        return functionNames;
    }

    private final KotlinType createMockJavaIoSerializableType(StorageManager storageManager) {
        ClassDescriptorImpl classDescriptorImpl = new ClassDescriptorImpl(new JvmBuiltInsSettings$createMockJavaIoSerializableType$mockJavaIoPackageFragment$1(this, this.moduleDescriptor, new FqName("java.io")), Name.identifier("Serializable"), Modality.ABSTRACT, ClassKind.INTERFACE, CollectionsKt.listOf(new LazyWrappedType(storageManager, new JvmBuiltInsSettings$createMockJavaIoSerializableType$superTypes$1(this))), SourceElement.NO_SOURCE, false, storageManager);
        classDescriptorImpl.initialize(MemberScope.Empty.INSTANCE, am.m265687a(), null);
        SimpleType defaultType = classDescriptorImpl.getDefaultType();
        Intrinsics.checkExpressionValueIsNotNull(defaultType, "mockSerializableClass.defaultType");
        return defaultType;
    }

    public final LazyJavaClassDescriptor getJavaAnalogue(ClassDescriptor classDescriptor) {
        ClassId mapKotlinToJava;
        FqName asSingleFqName;
        LazyJavaClassDescriptor lazyJavaClassDescriptor = null;
        if (KotlinBuiltIns.isAny(classDescriptor)) {
            return null;
        }
        ClassDescriptor classDescriptor2 = classDescriptor;
        if (!KotlinBuiltIns.isUnderKotlinPackage(classDescriptor2)) {
            return null;
        }
        FqNameUnsafe fqNameUnsafe = DescriptorUtilsKt.getFqNameUnsafe(classDescriptor2);
        if (!fqNameUnsafe.isSafe() || (mapKotlinToJava = this.j2kClassMap.mapKotlinToJava(fqNameUnsafe)) == null || (asSingleFqName = mapKotlinToJava.asSingleFqName()) == null) {
            return null;
        }
        Intrinsics.checkExpressionValueIsNotNull(asSingleFqName, "j2kClassMap.mapKotlinToJ…leFqName() ?: return null");
        ClassDescriptor resolveClassByFqName = DescriptorUtilKt.resolveClassByFqName(getOwnerModuleDescriptor(), asSingleFqName, NoLookupLocation.FROM_BUILTINS);
        if (resolveClassByFqName instanceof LazyJavaClassDescriptor) {
            lazyJavaClassDescriptor = resolveClassByFqName;
        }
        return lazyJavaClassDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    public Collection<KotlinType> getSupertypes(ClassDescriptor classDescriptor) {
        Intrinsics.checkParameterIsNotNull(classDescriptor, "classDescriptor");
        FqNameUnsafe fqNameUnsafe = DescriptorUtilsKt.getFqNameUnsafe(classDescriptor);
        Companion companion = Companion;
        if (companion.isArrayOrPrimitiveArray(fqNameUnsafe)) {
            SimpleType cloneableType = getCloneableType();
            Intrinsics.checkExpressionValueIsNotNull(cloneableType, "cloneableType");
            return CollectionsKt.listOf((Object[]) new KotlinType[]{cloneableType, this.mockSerializableType});
        } else if (companion.isSerializableInJava(fqNameUnsafe)) {
            return CollectionsKt.listOf(this.mockSerializableType);
        } else {
            return CollectionsKt.emptyList();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    public Collection<ClassConstructorDescriptor> getConstructors(ClassDescriptor classDescriptor) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(classDescriptor, "classDescriptor");
        if (classDescriptor.getKind() != ClassKind.CLASS || !isAdditionalBuiltInsFeatureSupported()) {
            return CollectionsKt.emptyList();
        }
        LazyJavaClassDescriptor javaAnalogue = getJavaAnalogue(classDescriptor);
        if (javaAnalogue == null) {
            return CollectionsKt.emptyList();
        }
        ClassDescriptor mapJavaToKotlin$default = JavaToKotlinClassMap.mapJavaToKotlin$default(this.j2kClassMap, DescriptorUtilsKt.getFqNameSafe(javaAnalogue), FallbackBuiltIns.Companion.getInstance(), null, 4, null);
        if (mapJavaToKotlin$default == null) {
            return CollectionsKt.emptyList();
        }
        LazyJavaClassDescriptor lazyJavaClassDescriptor = javaAnalogue;
        TypeSubstitutor buildSubstitutor = MappingUtilKt.createMappedTypeParametersSubstitution(mapJavaToKotlin$default, lazyJavaClassDescriptor).buildSubstitutor();
        JvmBuiltInsSettings$getConstructors$1 jvmBuiltInsSettings$getConstructors$1 = new JvmBuiltInsSettings$getConstructors$1(buildSubstitutor);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = javaAnalogue.getConstructors().iterator();
        while (true) {
            boolean z2 = false;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            T t = next;
            Intrinsics.checkExpressionValueIsNotNull(t, "javaConstructor");
            if (t.getVisibility().isPublicAPI()) {
                Collection<ClassConstructorDescriptor> constructors = mapJavaToKotlin$default.getConstructors();
                Intrinsics.checkExpressionValueIsNotNull(constructors, "defaultKotlinVersion.constructors");
                Collection<ClassConstructorDescriptor> collection = constructors;
                if (!(collection instanceof Collection) || !collection.isEmpty()) {
                    Iterator<T> it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        T next2 = it2.next();
                        Intrinsics.checkExpressionValueIsNotNull(next2, "it");
                        if (jvmBuiltInsSettings$getConstructors$1.invoke((ConstructorDescriptor) next2, (ConstructorDescriptor) t)) {
                            z = false;
                            break;
                        }
                    }
                    if (z && !isTrivialCopyConstructorFor(t, classDescriptor) && !KotlinBuiltIns.isDeprecated(t) && !BLACK_LIST_CONSTRUCTOR_SIGNATURES.contains(SignatureBuildingComponents.INSTANCE.signature(lazyJavaClassDescriptor, MethodSignatureMappingKt.computeJvmDescriptor$default(t, false, false, 3, null)))) {
                        z2 = true;
                    }
                }
                z = true;
                z2 = true;
            }
            if (z2) {
                arrayList.add(next);
            }
        }
        ArrayList<ClassConstructorDescriptor> arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (ClassConstructorDescriptor classConstructorDescriptor : arrayList2) {
            FunctionDescriptor.CopyBuilder<? extends FunctionDescriptor> newCopyBuilder = classConstructorDescriptor.newCopyBuilder();
            newCopyBuilder.setOwner(classDescriptor);
            newCopyBuilder.setReturnType(classDescriptor.getDefaultType());
            newCopyBuilder.setPreserveSourceElement();
            newCopyBuilder.setSubstitution(buildSubstitutor.getSubstitution());
            Set<String> set = WHITE_LIST_CONSTRUCTOR_SIGNATURES;
            SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
            Intrinsics.checkExpressionValueIsNotNull(classConstructorDescriptor, "javaConstructor");
            if (!set.contains(signatureBuildingComponents.signature(lazyJavaClassDescriptor, MethodSignatureMappingKt.computeJvmDescriptor$default(classConstructorDescriptor, false, false, 3, null)))) {
                newCopyBuilder.setAdditionalAnnotations(getNotConsideredDeprecation());
            }
            FunctionDescriptor build = newCopyBuilder.build();
            if (build != null) {
                arrayList3.add((ClassConstructorDescriptor) build);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor");
            }
        }
        return arrayList3;
    }

    private final SimpleFunctionDescriptor createCloneForArray(DeserializedClassDescriptor deserializedClassDescriptor, SimpleFunctionDescriptor simpleFunctionDescriptor) {
        FunctionDescriptor.CopyBuilder<? extends SimpleFunctionDescriptor> newCopyBuilder = simpleFunctionDescriptor.newCopyBuilder();
        newCopyBuilder.setOwner(deserializedClassDescriptor);
        newCopyBuilder.setVisibility(Visibilities.PUBLIC);
        newCopyBuilder.setReturnType(deserializedClassDescriptor.getDefaultType());
        newCopyBuilder.setDispatchReceiverParameter(deserializedClassDescriptor.getThisAsReceiverParameter());
        FunctionDescriptor build = newCopyBuilder.build();
        if (build == null) {
            Intrinsics.throwNpe();
        }
        return (SimpleFunctionDescriptor) build;
    }

    private final boolean isMutabilityViolation(SimpleFunctionDescriptor simpleFunctionDescriptor, boolean z) {
        DeclarationDescriptor containingDeclaration = simpleFunctionDescriptor.getContainingDeclaration();
        if (containingDeclaration != null) {
            String computeJvmDescriptor$default = MethodSignatureMappingKt.computeJvmDescriptor$default(simpleFunctionDescriptor, false, false, 3, null);
            if (z ^ MUTABLE_METHOD_SIGNATURES.contains(SignatureBuildingComponents.INSTANCE.signature((ClassDescriptor) containingDeclaration, computeJvmDescriptor$default))) {
                return true;
            }
            Boolean ifAny = DFS.ifAny(CollectionsKt.listOf(simpleFunctionDescriptor), JvmBuiltInsSettings$isMutabilityViolation$1.INSTANCE, new JvmBuiltInsSettings$isMutabilityViolation$2(this));
            Intrinsics.checkExpressionValueIsNotNull(ifAny, "DFS.ifAny<CallableMember…lassDescriptor)\n        }");
            return ifAny.booleanValue();
        }
        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
    }

    private final boolean isTrivialCopyConstructorFor(ConstructorDescriptor constructorDescriptor, ClassDescriptor classDescriptor) {
        FqNameUnsafe fqNameUnsafe;
        if (constructorDescriptor.getValueParameters().size() == 1) {
            List<ValueParameterDescriptor> valueParameters = constructorDescriptor.getValueParameters();
            Intrinsics.checkExpressionValueIsNotNull(valueParameters, "valueParameters");
            Object single = CollectionsKt.single((List) valueParameters);
            Intrinsics.checkExpressionValueIsNotNull(single, "valueParameters.single()");
            ClassifierDescriptor declarationDescriptor = ((ValueParameterDescriptor) single).getType().getConstructor().getDeclarationDescriptor();
            if (declarationDescriptor != null) {
                fqNameUnsafe = DescriptorUtilsKt.getFqNameUnsafe(declarationDescriptor);
            } else {
                fqNameUnsafe = null;
            }
            if (Intrinsics.areEqual(fqNameUnsafe, DescriptorUtilsKt.getFqNameUnsafe(classDescriptor))) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter
    public boolean isFunctionAvailable(ClassDescriptor classDescriptor, SimpleFunctionDescriptor simpleFunctionDescriptor) {
        Intrinsics.checkParameterIsNotNull(classDescriptor, "classDescriptor");
        Intrinsics.checkParameterIsNotNull(simpleFunctionDescriptor, "functionDescriptor");
        LazyJavaClassDescriptor javaAnalogue = getJavaAnalogue(classDescriptor);
        if (javaAnalogue == null || !simpleFunctionDescriptor.getAnnotations().hasAnnotation(PlatformDependentDeclarationFilterKt.getPLATFORM_DEPENDENT_ANNOTATION_FQ_NAME())) {
            return true;
        }
        if (!isAdditionalBuiltInsFeatureSupported()) {
            return false;
        }
        String computeJvmDescriptor$default = MethodSignatureMappingKt.computeJvmDescriptor$default(simpleFunctionDescriptor, false, false, 3, null);
        LazyJavaClassMemberScope unsubstitutedMemberScope = javaAnalogue.getUnsubstitutedMemberScope();
        Name name = simpleFunctionDescriptor.getName();
        Intrinsics.checkExpressionValueIsNotNull(name, "functionDescriptor.name");
        Collection<SimpleFunctionDescriptor> contributedFunctions = unsubstitutedMemberScope.getContributedFunctions(name, NoLookupLocation.FROM_BUILTINS);
        if (!(contributedFunctions instanceof Collection) || !contributedFunctions.isEmpty()) {
            Iterator<T> it = contributedFunctions.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(MethodSignatureMappingKt.computeJvmDescriptor$default(it.next(), false, false, 3, null), computeJvmDescriptor$default)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ff, code lost:
        if (isMutabilityViolation(r3, r10) != false) goto L_0x009e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> getAdditionalFunctions(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r10, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, ? extends java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor>> r11) {
        /*
        // Method dump skipped, instructions count: 282
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings.getAdditionalFunctions(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.jvm.functions.Function1):java.util.Collection");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0111, code lost:
        if (r2 != 3) goto L_0x0132;
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00c4 A[SYNTHETIC] */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> getFunctions(kotlin.reflect.jvm.internal.impl.name.Name r7, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r8) {
        /*
        // Method dump skipped, instructions count: 345
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings.getFunctions(kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor):java.util.Collection");
    }

    public JvmBuiltInsSettings(ModuleDescriptor moduleDescriptor2, StorageManager storageManager, Function0<? extends ModuleDescriptor> function0, Function0<Boolean> function02) {
        Intrinsics.checkParameterIsNotNull(moduleDescriptor2, "moduleDescriptor");
        Intrinsics.checkParameterIsNotNull(storageManager, "storageManager");
        Intrinsics.checkParameterIsNotNull(function0, "deferredOwnerModuleDescriptor");
        Intrinsics.checkParameterIsNotNull(function02, "isAdditionalBuiltInsFeatureSupported");
        this.moduleDescriptor = moduleDescriptor2;
        this.ownerModuleDescriptor$delegate = LazyKt.lazy(function0);
        this.isAdditionalBuiltInsFeatureSupported$delegate = LazyKt.lazy(function02);
        this.mockSerializableType = createMockJavaIoSerializableType(storageManager);
        this.cloneableType$delegate = storageManager.createLazyValue(new JvmBuiltInsSettings$cloneableType$2(this, storageManager));
        this.javaAnalogueClassesWithCustomSupertypeCache = storageManager.createCacheWithNotNullValues();
        this.notConsideredDeprecation$delegate = storageManager.createLazyValue(new JvmBuiltInsSettings$notConsideredDeprecation$2(this));
    }
}
