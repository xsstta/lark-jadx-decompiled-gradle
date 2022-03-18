package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

public abstract class JvmType {

    public static final class Array extends JvmType {
        private final JvmType elementType;

        public final JvmType getElementType() {
            return this.elementType;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Array(JvmType jvmType) {
            super(null);
            Intrinsics.checkParameterIsNotNull(jvmType, "elementType");
            this.elementType = jvmType;
        }
    }

    public static final class Object extends JvmType {
        private final String internalName;

        public final String getInternalName() {
            return this.internalName;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Object(String str) {
            super(null);
            Intrinsics.checkParameterIsNotNull(str, "internalName");
            this.internalName = str;
        }
    }

    public static final class Primitive extends JvmType {
        private final JvmPrimitiveType jvmPrimitiveType;

        public final JvmPrimitiveType getJvmPrimitiveType() {
            return this.jvmPrimitiveType;
        }

        public Primitive(JvmPrimitiveType jvmPrimitiveType2) {
            super(null);
            this.jvmPrimitiveType = jvmPrimitiveType2;
        }
    }

    private JvmType() {
    }

    public String toString() {
        return JvmTypeFactoryImpl.INSTANCE.toString(this);
    }

    public /* synthetic */ JvmType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
