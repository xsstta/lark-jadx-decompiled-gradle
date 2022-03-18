package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin._Assertions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder;

public final class JavaClassDataFinder implements ClassDataFinder {
    private final DeserializedDescriptorResolver deserializedDescriptorResolver;
    private final KotlinClassFinder kotlinClassFinder;

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder
    public ClassData findClassData(ClassId classId) {
        Intrinsics.checkParameterIsNotNull(classId, "classId");
        KotlinJvmBinaryClass findKotlinClass = KotlinClassFinderKt.findKotlinClass(this.kotlinClassFinder, classId);
        if (findKotlinClass == null) {
            return null;
        }
        boolean areEqual = Intrinsics.areEqual(findKotlinClass.getClassId(), classId);
        if (!_Assertions.f173221a || areEqual) {
            return this.deserializedDescriptorResolver.readClassData$descriptors_jvm(findKotlinClass);
        }
        throw new AssertionError("Class with incorrect id found: expected " + classId + ", actual " + findKotlinClass.getClassId());
    }

    public JavaClassDataFinder(KotlinClassFinder kotlinClassFinder2, DeserializedDescriptorResolver deserializedDescriptorResolver2) {
        Intrinsics.checkParameterIsNotNull(kotlinClassFinder2, "kotlinClassFinder");
        Intrinsics.checkParameterIsNotNull(deserializedDescriptorResolver2, "deserializedDescriptorResolver");
        this.kotlinClassFinder = kotlinClassFinder2;
        this.deserializedDescriptorResolver = deserializedDescriptorResolver2;
    }
}
