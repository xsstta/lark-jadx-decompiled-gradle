package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Set;
import kotlin.Pair;
import kotlin.collections.am;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.IncompatibleVersionErrorData;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPackageMemberScope;

public final class DeserializedDescriptorResolver {
    public static final Companion Companion = new Companion(null);
    private static final JvmMetadataVersion KOTLIN_1_1_EAP_METADATA_VERSION = new JvmMetadataVersion(1, 1, 2);
    private static final JvmMetadataVersion KOTLIN_1_3_M1_METADATA_VERSION = new JvmMetadataVersion(1, 1, 11);
    public static final JvmMetadataVersion KOTLIN_1_3_RC_METADATA_VERSION = new JvmMetadataVersion(1, 1, 13);
    private static final Set<KotlinClassHeader.Kind> KOTLIN_CLASS = am.m265686a(KotlinClassHeader.Kind.CLASS);
    private static final Set<KotlinClassHeader.Kind> KOTLIN_FILE_FACADE_OR_MULTIFILE_CLASS_PART = am.m265689a((Object[]) new KotlinClassHeader.Kind[]{KotlinClassHeader.Kind.FILE_FACADE, KotlinClassHeader.Kind.MULTIFILE_CLASS_PART});
    public DeserializationComponents components;

    public static final class Companion {
        private Companion() {
        }

        public final JvmMetadataVersion getKOTLIN_1_3_RC_METADATA_VERSION$descriptors_jvm() {
            return DeserializedDescriptorResolver.KOTLIN_1_3_RC_METADATA_VERSION;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final DeserializationComponents getComponents() {
        DeserializationComponents deserializationComponents = this.components;
        if (deserializationComponents == null) {
            Intrinsics.throwUninitializedPropertyAccessException("components");
        }
        return deserializationComponents;
    }

    public final boolean getSkipMetadataVersionCheck() {
        DeserializationComponents deserializationComponents = this.components;
        if (deserializationComponents == null) {
            Intrinsics.throwUninitializedPropertyAccessException("components");
        }
        return deserializationComponents.getConfiguration().getSkipMetadataVersionCheck();
    }

    public final void setComponents(DeserializationComponentsForJava deserializationComponentsForJava) {
        Intrinsics.checkParameterIsNotNull(deserializationComponentsForJava, "components");
        this.components = deserializationComponentsForJava.getComponents();
    }

    private final IncompatibleVersionErrorData<JvmMetadataVersion> getIncompatibility(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        if (getSkipMetadataVersionCheck() || kotlinJvmBinaryClass.getClassHeader().getMetadataVersion().isCompatible()) {
            return null;
        }
        return new IncompatibleVersionErrorData<>(kotlinJvmBinaryClass.getClassHeader().getMetadataVersion(), JvmMetadataVersion.INSTANCE, kotlinJvmBinaryClass.getLocation(), kotlinJvmBinaryClass.getClassId());
    }

    private final boolean isCompiledWith13M1(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        DeserializationComponents deserializationComponents = this.components;
        if (deserializationComponents == null) {
            Intrinsics.throwUninitializedPropertyAccessException("components");
        }
        if (deserializationComponents.getConfiguration().getSkipMetadataVersionCheck() || !kotlinJvmBinaryClass.getClassHeader().isPreRelease() || !Intrinsics.areEqual(kotlinJvmBinaryClass.getClassHeader().getMetadataVersion(), KOTLIN_1_3_M1_METADATA_VERSION)) {
            return false;
        }
        return true;
    }

    private final boolean isPreReleaseInvisible(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        DeserializationComponents deserializationComponents = this.components;
        if (deserializationComponents == null) {
            Intrinsics.throwUninitializedPropertyAccessException("components");
        }
        if ((!deserializationComponents.getConfiguration().getReportErrorsOnPreReleaseDependencies() || (!kotlinJvmBinaryClass.getClassHeader().isPreRelease() && !Intrinsics.areEqual(kotlinJvmBinaryClass.getClassHeader().getMetadataVersion(), KOTLIN_1_1_EAP_METADATA_VERSION))) && !isCompiledWith13M1(kotlinJvmBinaryClass)) {
            return false;
        }
        return true;
    }

    public final ClassDescriptor resolveClass(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        Intrinsics.checkParameterIsNotNull(kotlinJvmBinaryClass, "kotlinClass");
        ClassData readClassData$descriptors_jvm = readClassData$descriptors_jvm(kotlinJvmBinaryClass);
        if (readClassData$descriptors_jvm == null) {
            return null;
        }
        DeserializationComponents deserializationComponents = this.components;
        if (deserializationComponents == null) {
            Intrinsics.throwUninitializedPropertyAccessException("components");
        }
        return deserializationComponents.getClassDeserializer().deserializeClass(kotlinJvmBinaryClass.getClassId(), readClassData$descriptors_jvm);
    }

    public final ClassData readClassData$descriptors_jvm(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        String[] strings;
        Pair<JvmNameResolver, ProtoBuf.Class> pair;
        Intrinsics.checkParameterIsNotNull(kotlinJvmBinaryClass, "kotlinClass");
        String[] readData = readData(kotlinJvmBinaryClass, KOTLIN_CLASS);
        if (readData == null || (strings = kotlinJvmBinaryClass.getClassHeader().getStrings()) == null) {
            return null;
        }
        try {
            pair = JvmProtoBufUtil.readClassDataFrom(readData, strings);
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalStateException("Could not read data from " + kotlinJvmBinaryClass.getLocation(), e);
        } catch (Throwable th) {
            if (getSkipMetadataVersionCheck() || kotlinJvmBinaryClass.getClassHeader().getMetadataVersion().isCompatible()) {
                throw th;
            }
            pair = null;
        }
        if (pair == null) {
            return null;
        }
        return new ClassData(pair.component1(), pair.component2(), kotlinJvmBinaryClass.getClassHeader().getMetadataVersion(), new KotlinJvmBinarySourceElement(kotlinJvmBinaryClass, getIncompatibility(kotlinJvmBinaryClass), isPreReleaseInvisible(kotlinJvmBinaryClass)));
    }

    private final String[] readData(KotlinJvmBinaryClass kotlinJvmBinaryClass, Set<? extends KotlinClassHeader.Kind> set) {
        KotlinClassHeader classHeader = kotlinJvmBinaryClass.getClassHeader();
        String[] data = classHeader.getData();
        if (data == null) {
            data = classHeader.getIncompatibleData();
        }
        if (data == null || !set.contains(classHeader.getKind())) {
            return null;
        }
        return data;
    }

    public final MemberScope createKotlinPackagePartScope(PackageFragmentDescriptor packageFragmentDescriptor, KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        String[] strings;
        Pair<JvmNameResolver, ProtoBuf.Package> pair;
        Intrinsics.checkParameterIsNotNull(packageFragmentDescriptor, "descriptor");
        Intrinsics.checkParameterIsNotNull(kotlinJvmBinaryClass, "kotlinClass");
        String[] readData = readData(kotlinJvmBinaryClass, KOTLIN_FILE_FACADE_OR_MULTIFILE_CLASS_PART);
        if (readData == null || (strings = kotlinJvmBinaryClass.getClassHeader().getStrings()) == null) {
            return null;
        }
        try {
            pair = JvmProtoBufUtil.readPackageDataFrom(readData, strings);
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalStateException("Could not read data from " + kotlinJvmBinaryClass.getLocation(), e);
        } catch (Throwable th) {
            if (getSkipMetadataVersionCheck() || kotlinJvmBinaryClass.getClassHeader().getMetadataVersion().isCompatible()) {
                throw th;
            }
            pair = null;
        }
        if (pair == null) {
            return null;
        }
        ProtoBuf.Package component2 = pair.component2();
        JvmNameResolver component1 = pair.component1();
        JvmPackagePartSource jvmPackagePartSource = new JvmPackagePartSource(kotlinJvmBinaryClass, component2, component1, getIncompatibility(kotlinJvmBinaryClass), isPreReleaseInvisible(kotlinJvmBinaryClass));
        JvmMetadataVersion metadataVersion = kotlinJvmBinaryClass.getClassHeader().getMetadataVersion();
        JvmPackagePartSource jvmPackagePartSource2 = jvmPackagePartSource;
        DeserializationComponents deserializationComponents = this.components;
        if (deserializationComponents == null) {
            Intrinsics.throwUninitializedPropertyAccessException("components");
        }
        return new DeserializedPackageMemberScope(packageFragmentDescriptor, component2, component1, metadataVersion, jvmPackagePartSource2, deserializationComponents, DeserializedDescriptorResolver$createKotlinPackagePartScope$2.INSTANCE);
    }
}
