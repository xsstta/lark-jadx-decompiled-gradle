package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.name.FqName;

public enum JvmPrimitiveType {
    BOOLEAN(PrimitiveType.BOOLEAN, "boolean", "Z", "java.lang.Boolean"),
    CHAR(PrimitiveType.CHAR, "char", "C", "java.lang.Character"),
    BYTE(PrimitiveType.BYTE, "byte", "B", "java.lang.Byte"),
    SHORT(PrimitiveType.SHORT, "short", "S", "java.lang.Short"),
    INT(PrimitiveType.INT, "int", "I", "java.lang.Integer"),
    FLOAT(PrimitiveType.FLOAT, "float", "F", "java.lang.Float"),
    LONG(PrimitiveType.LONG, "long", "J", "java.lang.Long"),
    DOUBLE(PrimitiveType.DOUBLE, "double", "D", "java.lang.Double");
    
    private static final Map<String, JvmPrimitiveType> TYPE_BY_DESC = new HashMap();
    private static final Map<String, JvmPrimitiveType> TYPE_BY_NAME = new HashMap();
    private static final Map<PrimitiveType, JvmPrimitiveType> TYPE_BY_PRIMITIVE_TYPE = new EnumMap(PrimitiveType.class);
    private static final Set<FqName> WRAPPERS_CLASS_NAMES = new HashSet();
    private final String desc;
    private final String name;
    private final PrimitiveType primitiveType;
    private final FqName wrapperFqName;

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0045 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0015  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ void $$$reportNull$$$0(int r7) {
        /*
        // Method dump skipped, instructions count: 250
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.$$$reportNull$$$0(int):void");
    }

    public String getDesc() {
        String str = this.desc;
        if (str == null) {
            $$$reportNull$$$0(12);
        }
        return str;
    }

    public String getJavaKeywordName() {
        String str = this.name;
        if (str == null) {
            $$$reportNull$$$0(11);
        }
        return str;
    }

    public PrimitiveType getPrimitiveType() {
        PrimitiveType primitiveType2 = this.primitiveType;
        if (primitiveType2 == null) {
            $$$reportNull$$$0(10);
        }
        return primitiveType2;
    }

    public FqName getWrapperFqName() {
        FqName fqName = this.wrapperFqName;
        if (fqName == null) {
            $$$reportNull$$$0(13);
        }
        return fqName;
    }

    static {
        JvmPrimitiveType[] values = values();
        for (JvmPrimitiveType jvmPrimitiveType : values) {
            WRAPPERS_CLASS_NAMES.add(jvmPrimitiveType.getWrapperFqName());
            TYPE_BY_NAME.put(jvmPrimitiveType.getJavaKeywordName(), jvmPrimitiveType);
            TYPE_BY_PRIMITIVE_TYPE.put(jvmPrimitiveType.getPrimitiveType(), jvmPrimitiveType);
            TYPE_BY_DESC.put(jvmPrimitiveType.getDesc(), jvmPrimitiveType);
        }
    }

    public static JvmPrimitiveType get(PrimitiveType primitiveType2) {
        if (primitiveType2 == null) {
            $$$reportNull$$$0(3);
        }
        JvmPrimitiveType jvmPrimitiveType = TYPE_BY_PRIMITIVE_TYPE.get(primitiveType2);
        if (jvmPrimitiveType == null) {
            $$$reportNull$$$0(4);
        }
        return jvmPrimitiveType;
    }

    public static JvmPrimitiveType get(String str) {
        if (str == null) {
            $$$reportNull$$$0(1);
        }
        JvmPrimitiveType jvmPrimitiveType = TYPE_BY_NAME.get(str);
        if (jvmPrimitiveType != null) {
            if (jvmPrimitiveType == null) {
                $$$reportNull$$$0(2);
            }
            return jvmPrimitiveType;
        }
        throw new AssertionError("Non-primitive type name passed: " + str);
    }

    private JvmPrimitiveType(PrimitiveType primitiveType2, String str, String str2, String str3) {
        if (primitiveType2 == null) {
            $$$reportNull$$$0(6);
        }
        if (str == null) {
            $$$reportNull$$$0(7);
        }
        if (str2 == null) {
            $$$reportNull$$$0(8);
        }
        if (str3 == null) {
            $$$reportNull$$$0(9);
        }
        this.primitiveType = primitiveType2;
        this.name = str;
        this.desc = str2;
        this.wrapperFqName = new FqName(str3);
    }
}
