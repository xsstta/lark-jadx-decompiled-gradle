package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;

public abstract class ReflectJavaType implements JavaType {
    public static final Factory Factory = new Factory(null);

    /* access modifiers changed from: protected */
    public abstract Type getReflectType();

    public static final class Factory {
        private Factory() {
        }

        public /* synthetic */ Factory(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ReflectJavaType create(Type type) {
            Intrinsics.checkParameterIsNotNull(type, ShareHitPoint.f121869d);
            boolean z = type instanceof Class;
            if (z) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new ReflectJavaPrimitiveType(cls);
                }
            }
            if ((type instanceof GenericArrayType) || (z && ((Class) type).isArray())) {
                return new ReflectJavaArrayType(type);
            }
            if (type instanceof WildcardType) {
                return new ReflectJavaWildcardType((WildcardType) type);
            }
            return new ReflectJavaClassifierType(type);
        }
    }

    public int hashCode() {
        return getReflectType().hashCode();
    }

    public String toString() {
        return getClass().getName() + ": " + getReflectType();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ReflectJavaType) || !Intrinsics.areEqual(getReflectType(), ((ReflectJavaType) obj).getReflectType())) {
            return false;
        }
        return true;
    }
}
