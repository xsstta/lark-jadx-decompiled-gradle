package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;

public final class ReflectJavaEnumValueAnnotationArgument extends ReflectJavaAnnotationArgument implements JavaEnumValueAnnotationArgument {
    private final Enum<?> value;

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument
    public Name getEntryName() {
        return Name.identifier(this.value.name());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument
    public ClassId getEnumClassId() {
        Class<?> cls = this.value.getClass();
        if (!cls.isEnum()) {
            cls = cls.getEnclosingClass();
        }
        Intrinsics.checkExpressionValueIsNotNull(cls, "enumClass");
        return ReflectClassUtilKt.getClassId(cls);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReflectJavaEnumValueAnnotationArgument(Name name, Enum<?> r3) {
        super(name);
        Intrinsics.checkParameterIsNotNull(r3, "value");
        this.value = r3;
    }
}
