package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.NoWhenBranchMatchedException;
import kotlin._Assertions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.text.StringsKt;

/* access modifiers changed from: package-private */
public final class JvmTypeFactoryImpl implements JvmTypeFactory<JvmType> {
    public static final JvmTypeFactoryImpl INSTANCE = new JvmTypeFactoryImpl();

    private JvmTypeFactoryImpl() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory
    public JvmType getJavaLangClassType() {
        return createObjectType("java/lang/Class");
    }

    /* Return type fixed from 'kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType$Object' to match base method */
    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory
    public JvmType createObjectType(String str) {
        Intrinsics.checkParameterIsNotNull(str, "internalName");
        return new JvmType.Object(str);
    }

    public JvmType boxType(JvmType jvmType) {
        Intrinsics.checkParameterIsNotNull(jvmType, "possiblyPrimitiveType");
        if (!(jvmType instanceof JvmType.Primitive)) {
            return jvmType;
        }
        JvmType.Primitive primitive = (JvmType.Primitive) jvmType;
        if (primitive.getJvmPrimitiveType() == null) {
            return jvmType;
        }
        JvmClassName byFqNameWithoutInnerClasses = JvmClassName.byFqNameWithoutInnerClasses(primitive.getJvmPrimitiveType().getWrapperFqName());
        Intrinsics.checkExpressionValueIsNotNull(byFqNameWithoutInnerClasses, "JvmClassName.byFqNameWit…mitiveType.wrapperFqName)");
        String internalName = byFqNameWithoutInnerClasses.getInternalName();
        Intrinsics.checkExpressionValueIsNotNull(internalName, "JvmClassName.byFqNameWit…apperFqName).internalName");
        return createObjectType(internalName);
    }

    public String toString(JvmType jvmType) {
        String desc;
        Intrinsics.checkParameterIsNotNull(jvmType, ShareHitPoint.f121869d);
        if (jvmType instanceof JvmType.Array) {
            return "[" + toString(((JvmType.Array) jvmType).getElementType());
        } else if (jvmType instanceof JvmType.Primitive) {
            JvmPrimitiveType jvmPrimitiveType = ((JvmType.Primitive) jvmType).getJvmPrimitiveType();
            if (jvmPrimitiveType == null || (desc = jvmPrimitiveType.getDesc()) == null) {
                return "V";
            }
            return desc;
        } else if (jvmType instanceof JvmType.Object) {
            return "L" + ((JvmType.Object) jvmType).getInternalName() + ";";
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory
    public JvmType createFromString(String str) {
        boolean z;
        JvmPrimitiveType jvmPrimitiveType;
        boolean z2;
        Intrinsics.checkParameterIsNotNull(str, "representation");
        String str2 = str;
        boolean z3 = false;
        if (str2.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!_Assertions.f173221a || z) {
            char charAt = str.charAt(0);
            JvmPrimitiveType[] values = JvmPrimitiveType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    jvmPrimitiveType = null;
                    break;
                }
                jvmPrimitiveType = values[i];
                if (jvmPrimitiveType.getDesc().charAt(0) == charAt) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    break;
                }
                i++;
            }
            if (jvmPrimitiveType != null) {
                return new JvmType.Primitive(jvmPrimitiveType);
            }
            if (charAt == 'V') {
                return new JvmType.Primitive(null);
            }
            if (charAt != '[') {
                if (charAt == 'L' && StringsKt.endsWith$default((CharSequence) str2, ';', false, 2, (Object) null)) {
                    z3 = true;
                }
                if (!_Assertions.f173221a || z3) {
                    String substring = str.substring(1, str.length() - 1);
                    Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    return new JvmType.Object(substring);
                }
                throw new AssertionError("Type that is not primitive nor array should be Object, but '" + str + "' was found");
            }
            String substring2 = str.substring(1);
            Intrinsics.checkExpressionValueIsNotNull(substring2, "(this as java.lang.String).substring(startIndex)");
            return new JvmType.Array(createFromString(substring2));
        }
        throw new AssertionError("empty string as JvmType");
    }
}
