package com.bytedance.memory.shrink;

import java.util.HashMap;
import java.util.Map;

public enum BaseType {
    OBJECT(2, 0),
    BOOLEAN(4, 1),
    CHAR(5, 2),
    FLOAT(6, 4),
    DOUBLE(7, 8),
    BYTE(8, 1),
    SHORT(9, 2),
    INT(10, 4),
    LONG(11, 8);
    
    private static Map<Integer, BaseType> sTypeMap = new HashMap();
    private int mId;
    private int mSize;

    public int getTypeId() {
        return this.mId;
    }

    /* renamed from: com.bytedance.memory.shrink.BaseType$1 */
    static /* synthetic */ class C200971 {

        /* renamed from: a */
        static final /* synthetic */ int[] f49071a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.bytedance.memory.shrink.BaseType[] r0 = com.bytedance.memory.shrink.BaseType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.memory.shrink.BaseType.C200971.f49071a = r0
                com.bytedance.memory.shrink.BaseType r1 = com.bytedance.memory.shrink.BaseType.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bytedance.memory.shrink.BaseType.C200971.f49071a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.memory.shrink.BaseType r1 = com.bytedance.memory.shrink.BaseType.CHAR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.bytedance.memory.shrink.BaseType.C200971.f49071a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.memory.shrink.BaseType r1 = com.bytedance.memory.shrink.BaseType.FLOAT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.bytedance.memory.shrink.BaseType.C200971.f49071a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.bytedance.memory.shrink.BaseType r1 = com.bytedance.memory.shrink.BaseType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.bytedance.memory.shrink.BaseType.C200971.f49071a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.bytedance.memory.shrink.BaseType r1 = com.bytedance.memory.shrink.BaseType.BYTE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.bytedance.memory.shrink.BaseType.C200971.f49071a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.bytedance.memory.shrink.BaseType r1 = com.bytedance.memory.shrink.BaseType.SHORT     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = com.bytedance.memory.shrink.BaseType.C200971.f49071a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.bytedance.memory.shrink.BaseType r1 = com.bytedance.memory.shrink.BaseType.INT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = com.bytedance.memory.shrink.BaseType.C200971.f49071a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.bytedance.memory.shrink.BaseType r1 = com.bytedance.memory.shrink.BaseType.LONG     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.memory.shrink.BaseType.C200971.<clinit>():void");
        }
    }

    static {
        BaseType[] values = values();
        for (BaseType baseType : values) {
            sTypeMap.put(Integer.valueOf(baseType.mId), baseType);
        }
    }

    public int getSize(int i) {
        int i2 = this.mSize;
        return i2 != 0 ? i2 : i;
    }

    public static BaseType getType(int i) {
        return sTypeMap.get(Integer.valueOf(i));
    }

    public static String getClassNameOfPrimitiveArray(BaseType baseType) {
        switch (C200971.f49071a[baseType.ordinal()]) {
            case 1:
                return "boolean[]";
            case 2:
                return "char[]";
            case 3:
                return "float[]";
            case 4:
                return "double[]";
            case 5:
                return "byte[]";
            case 6:
                return "short[]";
            case 7:
                return "int[]";
            case 8:
                return "long[]";
            default:
                throw new IllegalArgumentException("OBJECT type is not a primitive type");
        }
    }

    private BaseType(int i, int i2) {
        this.mId = i;
        this.mSize = i2;
    }
}
