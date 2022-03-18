package com.google.protobuf;

import com.huawei.hms.maps.model.BitmapDescriptorFactory;

public final class WireFormat {

    /* renamed from: a */
    static final int f57029a = m83736a(1, 3);

    /* renamed from: b */
    static final int f57030b = m83736a(1, 4);

    /* renamed from: c */
    static final int f57031c = m83736a(2, 0);

    /* renamed from: d */
    static final int f57032d = m83736a(3, 2);

    /* renamed from: a */
    public static int m83735a(int i) {
        return i & 7;
    }

    /* renamed from: a */
    static int m83736a(int i, int i2) {
        return (i << 3) | i2;
    }

    /* renamed from: b */
    public static int m83737b(int i) {
        return i >>> 3;
    }

    public enum FieldType {
        DOUBLE(JavaType.DOUBLE, 1),
        FLOAT(JavaType.FLOAT, 5),
        INT64(JavaType.LONG, 0),
        UINT64(JavaType.LONG, 0),
        INT32(JavaType.INT, 0),
        FIXED64(JavaType.LONG, 1),
        FIXED32(JavaType.INT, 5),
        BOOL(JavaType.BOOLEAN, 0),
        STRING(JavaType.STRING, 2) {
            @Override // com.google.protobuf.WireFormat.FieldType
            public boolean isPackable() {
                return false;
            }
        },
        GROUP(JavaType.MESSAGE, 3) {
            @Override // com.google.protobuf.WireFormat.FieldType
            public boolean isPackable() {
                return false;
            }
        },
        MESSAGE(JavaType.MESSAGE, 2) {
            @Override // com.google.protobuf.WireFormat.FieldType
            public boolean isPackable() {
                return false;
            }
        },
        BYTES(JavaType.BYTE_STRING, 2) {
            @Override // com.google.protobuf.WireFormat.FieldType
            public boolean isPackable() {
                return false;
            }
        },
        UINT32(JavaType.INT, 0),
        ENUM(JavaType.ENUM, 0),
        SFIXED32(JavaType.INT, 5),
        SFIXED64(JavaType.LONG, 1),
        SINT32(JavaType.INT, 0),
        SINT64(JavaType.LONG, 0);
        
        private final JavaType javaType;
        private final int wireType;

        public boolean isPackable() {
            return true;
        }

        public JavaType getJavaType() {
            return this.javaType;
        }

        public int getWireType() {
            return this.wireType;
        }

        private FieldType(JavaType javaType2, int i) {
            this.javaType = javaType2;
            this.wireType = i;
        }

        /* synthetic */ FieldType(JavaType javaType2, int i, C230981 r5) {
            this(javaType2, i);
        }
    }

    public enum JavaType {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf((float) BitmapDescriptorFactory.HUE_RED)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(false),
        STRING(""),
        BYTE_STRING(ByteString.EMPTY),
        ENUM(null),
        MESSAGE(null);
        
        private final Object defaultDefault;

        /* access modifiers changed from: package-private */
        public Object getDefaultDefault() {
            return this.defaultDefault;
        }

        private JavaType(Object obj) {
            this.defaultDefault = obj;
        }
    }

    /* renamed from: com.google.protobuf.WireFormat$1 */
    static /* synthetic */ class C230981 {

        /* renamed from: a */
        static final /* synthetic */ int[] f57033a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|(3:35|36|38)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(38:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|38) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
            // Method dump skipped, instructions count: 217
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.WireFormat.C230981.<clinit>():void");
        }
    }
}
