package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.Set;
import kotlin.collections.am;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

public final class ClassDeserializer {
    public static final Set<ClassId> BLACK_LIST = am.m265686a(ClassId.topLevel(KotlinBuiltIns.FQ_NAMES.cloneable.toSafe()));
    public static final Companion Companion = new Companion(null);
    private final Function1<ClassKey, ClassDescriptor> classes;
    private final DeserializationComponents components;

    public static final class ClassKey {
        private final ClassData classData;
        private final ClassId classId;

        public final ClassData getClassData() {
            return this.classData;
        }

        public final ClassId getClassId() {
            return this.classId;
        }

        public int hashCode() {
            return this.classId.hashCode();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ClassKey) || !Intrinsics.areEqual(this.classId, ((ClassKey) obj).classId)) {
                return false;
            }
            return true;
        }

        public ClassKey(ClassId classId2, ClassData classData2) {
            Intrinsics.checkParameterIsNotNull(classId2, "classId");
            this.classId = classId2;
            this.classData = classData2;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public final Set<ClassId> getBLACK_LIST() {
            return ClassDeserializer.BLACK_LIST;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ClassDeserializer(DeserializationComponents deserializationComponents) {
        Intrinsics.checkParameterIsNotNull(deserializationComponents, "components");
        this.components = deserializationComponents;
        this.classes = deserializationComponents.getStorageManager().createMemoizedFunctionWithNullableValues(new ClassDeserializer$classes$1(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00bb A[EDGE_INSN: B:45:0x00bb->B:37:0x00bb ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor createClass(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer.ClassKey r13) {
        /*
        // Method dump skipped, instructions count: 245
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer.createClass(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer$ClassKey):kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor");
    }

    public final ClassDescriptor deserializeClass(ClassId classId, ClassData classData) {
        Intrinsics.checkParameterIsNotNull(classId, "classId");
        return this.classes.invoke(new ClassKey(classId, classData));
    }

    public static /* synthetic */ ClassDescriptor deserializeClass$default(ClassDeserializer classDeserializer, ClassId classId, ClassData classData, int i, Object obj) {
        if ((i & 2) != 0) {
            classData = null;
        }
        return classDeserializer.deserializeClass(classId, classData);
    }
}
