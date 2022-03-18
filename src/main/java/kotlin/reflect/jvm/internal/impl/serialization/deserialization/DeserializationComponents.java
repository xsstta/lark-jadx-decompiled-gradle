package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker;

public final class DeserializationComponents {
    private final AdditionalClassPartsProvider additionalClassPartsProvider;
    private final AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> annotationAndConstantLoader;
    private final ClassDataFinder classDataFinder;
    private final ClassDeserializer classDeserializer;
    private final DeserializationConfiguration configuration;
    private final ContractDeserializer contractDeserializer;
    private final ErrorReporter errorReporter;
    private final ExtensionRegistryLite extensionRegistryLite;
    private final Iterable<ClassDescriptorFactory> fictitiousClassDescriptorFactories;
    private final FlexibleTypeDeserializer flexibleTypeDeserializer;
    private final NewKotlinTypeChecker kotlinTypeChecker;
    private final LocalClassifierTypeSettings localClassifierTypeSettings;
    private final LookupTracker lookupTracker;
    private final ModuleDescriptor moduleDescriptor;
    private final NotFoundClasses notFoundClasses;
    private final PackageFragmentProvider packageFragmentProvider;
    private final PlatformDependentDeclarationFilter platformDependentDeclarationFilter;
    private final StorageManager storageManager;

    public final AdditionalClassPartsProvider getAdditionalClassPartsProvider() {
        return this.additionalClassPartsProvider;
    }

    public final AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> getAnnotationAndConstantLoader() {
        return this.annotationAndConstantLoader;
    }

    public final ClassDataFinder getClassDataFinder() {
        return this.classDataFinder;
    }

    public final ClassDeserializer getClassDeserializer() {
        return this.classDeserializer;
    }

    public final DeserializationConfiguration getConfiguration() {
        return this.configuration;
    }

    public final ContractDeserializer getContractDeserializer() {
        return this.contractDeserializer;
    }

    public final ErrorReporter getErrorReporter() {
        return this.errorReporter;
    }

    public final ExtensionRegistryLite getExtensionRegistryLite() {
        return this.extensionRegistryLite;
    }

    public final Iterable<ClassDescriptorFactory> getFictitiousClassDescriptorFactories() {
        return this.fictitiousClassDescriptorFactories;
    }

    public final FlexibleTypeDeserializer getFlexibleTypeDeserializer() {
        return this.flexibleTypeDeserializer;
    }

    public final NewKotlinTypeChecker getKotlinTypeChecker() {
        return this.kotlinTypeChecker;
    }

    public final LocalClassifierTypeSettings getLocalClassifierTypeSettings() {
        return this.localClassifierTypeSettings;
    }

    public final LookupTracker getLookupTracker() {
        return this.lookupTracker;
    }

    public final ModuleDescriptor getModuleDescriptor() {
        return this.moduleDescriptor;
    }

    public final NotFoundClasses getNotFoundClasses() {
        return this.notFoundClasses;
    }

    public final PackageFragmentProvider getPackageFragmentProvider() {
        return this.packageFragmentProvider;
    }

    public final PlatformDependentDeclarationFilter getPlatformDependentDeclarationFilter() {
        return this.platformDependentDeclarationFilter;
    }

    public final StorageManager getStorageManager() {
        return this.storageManager;
    }

    public final ClassDescriptor deserializeClass(ClassId classId) {
        Intrinsics.checkParameterIsNotNull(classId, "classId");
        return ClassDeserializer.deserializeClass$default(this.classDeserializer, classId, null, 2, null);
    }

    public final DeserializationContext createContext(PackageFragmentDescriptor packageFragmentDescriptor, NameResolver nameResolver, TypeTable typeTable, VersionRequirementTable versionRequirementTable, BinaryVersion binaryVersion, DeserializedContainerSource deserializedContainerSource) {
        Intrinsics.checkParameterIsNotNull(packageFragmentDescriptor, "descriptor");
        Intrinsics.checkParameterIsNotNull(nameResolver, "nameResolver");
        Intrinsics.checkParameterIsNotNull(typeTable, "typeTable");
        Intrinsics.checkParameterIsNotNull(versionRequirementTable, "versionRequirementTable");
        Intrinsics.checkParameterIsNotNull(binaryVersion, "metadataVersion");
        return new DeserializationContext(this, nameResolver, packageFragmentDescriptor, typeTable, versionRequirementTable, binaryVersion, deserializedContainerSource, null, CollectionsKt.emptyList());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r21v0, resolved type: kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor, ? extends kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>> */
    /* JADX DEBUG: Multi-variable search result rejected for r27v0, resolved type: java.lang.Iterable<? extends kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory> */
    /* JADX WARN: Multi-variable type inference failed */
    public DeserializationComponents(StorageManager storageManager2, ModuleDescriptor moduleDescriptor2, DeserializationConfiguration deserializationConfiguration, ClassDataFinder classDataFinder2, AnnotationAndConstantLoader<? extends AnnotationDescriptor, ? extends ConstantValue<?>> annotationAndConstantLoader2, PackageFragmentProvider packageFragmentProvider2, LocalClassifierTypeSettings localClassifierTypeSettings2, ErrorReporter errorReporter2, LookupTracker lookupTracker2, FlexibleTypeDeserializer flexibleTypeDeserializer2, Iterable<? extends ClassDescriptorFactory> iterable, NotFoundClasses notFoundClasses2, ContractDeserializer contractDeserializer2, AdditionalClassPartsProvider additionalClassPartsProvider2, PlatformDependentDeclarationFilter platformDependentDeclarationFilter2, ExtensionRegistryLite extensionRegistryLite2, NewKotlinTypeChecker newKotlinTypeChecker) {
        Intrinsics.checkParameterIsNotNull(storageManager2, "storageManager");
        Intrinsics.checkParameterIsNotNull(moduleDescriptor2, "moduleDescriptor");
        Intrinsics.checkParameterIsNotNull(deserializationConfiguration, "configuration");
        Intrinsics.checkParameterIsNotNull(classDataFinder2, "classDataFinder");
        Intrinsics.checkParameterIsNotNull(annotationAndConstantLoader2, "annotationAndConstantLoader");
        Intrinsics.checkParameterIsNotNull(packageFragmentProvider2, "packageFragmentProvider");
        Intrinsics.checkParameterIsNotNull(localClassifierTypeSettings2, "localClassifierTypeSettings");
        Intrinsics.checkParameterIsNotNull(errorReporter2, "errorReporter");
        Intrinsics.checkParameterIsNotNull(lookupTracker2, "lookupTracker");
        Intrinsics.checkParameterIsNotNull(flexibleTypeDeserializer2, "flexibleTypeDeserializer");
        Intrinsics.checkParameterIsNotNull(iterable, "fictitiousClassDescriptorFactories");
        Intrinsics.checkParameterIsNotNull(notFoundClasses2, "notFoundClasses");
        Intrinsics.checkParameterIsNotNull(contractDeserializer2, "contractDeserializer");
        Intrinsics.checkParameterIsNotNull(additionalClassPartsProvider2, "additionalClassPartsProvider");
        Intrinsics.checkParameterIsNotNull(platformDependentDeclarationFilter2, "platformDependentDeclarationFilter");
        Intrinsics.checkParameterIsNotNull(extensionRegistryLite2, "extensionRegistryLite");
        Intrinsics.checkParameterIsNotNull(newKotlinTypeChecker, "kotlinTypeChecker");
        this.storageManager = storageManager2;
        this.moduleDescriptor = moduleDescriptor2;
        this.configuration = deserializationConfiguration;
        this.classDataFinder = classDataFinder2;
        this.annotationAndConstantLoader = annotationAndConstantLoader2;
        this.packageFragmentProvider = packageFragmentProvider2;
        this.localClassifierTypeSettings = localClassifierTypeSettings2;
        this.errorReporter = errorReporter2;
        this.lookupTracker = lookupTracker2;
        this.flexibleTypeDeserializer = flexibleTypeDeserializer2;
        this.fictitiousClassDescriptorFactories = iterable;
        this.notFoundClasses = notFoundClasses2;
        this.contractDeserializer = contractDeserializer2;
        this.additionalClassPartsProvider = additionalClassPartsProvider2;
        this.platformDependentDeclarationFilter = platformDependentDeclarationFilter2;
        this.extensionRegistryLite = extensionRegistryLite2;
        this.kotlinTypeChecker = newKotlinTypeChecker;
        this.classDeserializer = new ClassDeserializer(this);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ DeserializationComponents(kotlin.reflect.jvm.internal.impl.storage.StorageManager r21, kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor r22, kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration r23, kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder r24, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader r25, kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider r26, kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings r27, kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter r28, kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker r29, kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer r30, java.lang.Iterable r31, kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses r32, kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer r33, kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider r34, kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter r35, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r36, kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker r37, int r38, kotlin.jvm.internal.DefaultConstructorMarker r39) {
        /*
            r20 = this;
            r0 = r38
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x000d
            kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider$None r1 = kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider.None.INSTANCE
            kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider r1 = (kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider) r1
            r16 = r1
            goto L_0x000f
        L_0x000d:
            r16 = r34
        L_0x000f:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x001a
            kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter$All r1 = kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter.All.INSTANCE
            kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter r1 = (kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter) r1
            r17 = r1
            goto L_0x001c
        L_0x001a:
            r17 = r35
        L_0x001c:
            r1 = 65536(0x10000, float:9.18355E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x002c
            kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker$Companion r0 = kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker.Companion
            kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeCheckerImpl r0 = r0.getDefault()
            kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker r0 = (kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker) r0
            r19 = r0
            goto L_0x002e
        L_0x002c:
            r19 = r37
        L_0x002e:
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            r7 = r25
            r8 = r26
            r9 = r27
            r10 = r28
            r11 = r29
            r12 = r30
            r13 = r31
            r14 = r32
            r15 = r33
            r18 = r36
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents.<init>(kotlin.reflect.jvm.internal.impl.storage.StorageManager, kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor, kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration, kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader, kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider, kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings, kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter, kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker, kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer, java.lang.Iterable, kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses, kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer, kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider, kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite, kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
