package com.lark.falcon.engine.bridge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaOnlyArray extends ArrayList<Object> implements ReadableArray, WritableArray {
    public JavaOnlyArray() {
    }

    public void clear() {
        super.clear();
    }

    private static JavaOnlyArray create() {
        return new JavaOnlyArray();
    }

    @Override // com.lark.falcon.engine.bridge.WritableArray
    public void pushNull() {
        add(null);
    }

    @Override // com.lark.falcon.engine.bridge.ReadableArray
    public int size() {
        return super.size();
    }

    @Override // com.lark.falcon.engine.bridge.ReadableArray
    public ArrayList<Object> toArrayList() {
        return new ArrayList<>(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lark.falcon.engine.bridge.JavaOnlyArray$1 */
    public static /* synthetic */ class C239621 {

        /* renamed from: a */
        static final /* synthetic */ int[] f59280a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
            // Method dump skipped, instructions count: 109
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lark.falcon.engine.bridge.JavaOnlyArray.C239621.<clinit>():void");
        }
    }

    @Override // com.lark.falcon.engine.bridge.WritableArray
    public void pushArray(WritableArray writableArray) {
        add(writableArray);
    }

    @Override // com.lark.falcon.engine.bridge.WritableArray
    public void pushByteArray(byte[] bArr) {
        add(bArr);
    }

    @Override // com.lark.falcon.engine.bridge.WritableArray
    public void pushMap(WritableMap writableMap) {
        add(writableMap);
    }

    @Override // com.lark.falcon.engine.bridge.WritableArray
    public void pushString(String str) {
        add(str);
    }

    @Override // com.lark.falcon.engine.bridge.WritableArray
    public void putNativeHostObject(NativeHostObject nativeHostObject) {
        add(nativeHostObject);
    }

    protected JavaOnlyArray(List list) {
        super(list);
    }

    public static JavaOnlyArray from(List list) {
        return new JavaOnlyArray(list);
    }

    @Override // com.lark.falcon.engine.bridge.ReadableArray
    public JavaOnlyArray getArray(int i) {
        return (JavaOnlyArray) get(i);
    }

    public Object getAt(int i) {
        return get(i);
    }

    @Override // com.lark.falcon.engine.bridge.ReadableArray
    public AbstractC23967a getDynamic(int i) {
        return C23968b.m87614a(this, i);
    }

    @Override // com.lark.falcon.engine.bridge.ReadableArray
    public JavaOnlyMap getMap(int i) {
        return (JavaOnlyMap) get(i);
    }

    @Override // com.lark.falcon.engine.bridge.ReadableArray
    public NativeHostObject getNativeHostObject(int i) {
        return (NativeHostObject) get(i);
    }

    @Override // com.lark.falcon.engine.bridge.ReadableArray
    public String getString(int i) {
        return (String) get(i);
    }

    @Override // com.lark.falcon.engine.bridge.WritableArray
    public void pushBoolean(boolean z) {
        add(Boolean.valueOf(z));
    }

    @Override // com.lark.falcon.engine.bridge.WritableArray
    public void pushDouble(double d) {
        add(Double.valueOf(d));
    }

    @Override // com.lark.falcon.engine.bridge.WritableArray
    public void pushInt(int i) {
        add(Integer.valueOf(i));
    }

    @Override // com.lark.falcon.engine.bridge.WritableArray
    public void pushLong(long j) {
        add(Long.valueOf(j));
    }

    @Override // com.lark.falcon.engine.bridge.ReadableArray
    public boolean getBoolean(int i) {
        return ((Boolean) get(i)).booleanValue();
    }

    @Override // com.lark.falcon.engine.bridge.ReadableArray
    public byte getByte(int i) {
        return ((Number) get(i)).byteValue();
    }

    @Override // com.lark.falcon.engine.bridge.ReadableArray
    public byte[] getByteArray(int i) {
        return (byte[]) get(i);
    }

    @Override // com.lark.falcon.engine.bridge.ReadableArray
    public char getChar(int i) {
        return (char) ((Number) get(i)).shortValue();
    }

    @Override // com.lark.falcon.engine.bridge.ReadableArray
    public double getDouble(int i) {
        return ((Number) get(i)).doubleValue();
    }

    @Override // com.lark.falcon.engine.bridge.ReadableArray
    public int getInt(int i) {
        return ((Number) get(i)).intValue();
    }

    @Override // com.lark.falcon.engine.bridge.ReadableArray
    public long getLong(int i) {
        return ((Number) get(i)).longValue();
    }

    @Override // com.lark.falcon.engine.bridge.ReadableArray
    public short getShort(int i) {
        return ((Number) get(i)).shortValue();
    }

    public int getTypeIndex(int i) {
        return getType(i).ordinal();
    }

    @Override // com.lark.falcon.engine.bridge.ReadableArray
    public boolean isNull(int i) {
        if (get(i) == null) {
            return true;
        }
        return false;
    }

    public static JavaOnlyArray of(Object... objArr) {
        if (objArr == null) {
            return new JavaOnlyArray();
        }
        return new JavaOnlyArray(Arrays.asList(objArr));
    }

    @Override // com.lark.falcon.engine.bridge.ReadableArray
    public ReadableType getType(int i) {
        Object obj = get(i);
        if (obj == null) {
            return ReadableType.Null;
        }
        if (obj instanceof Boolean) {
            return ReadableType.Boolean;
        }
        if (obj instanceof Integer) {
            return ReadableType.Int;
        }
        if (obj instanceof Long) {
            return ReadableType.Long;
        }
        if ((obj instanceof Number) || (obj instanceof Character)) {
            return ReadableType.Number;
        }
        if (obj instanceof String) {
            return ReadableType.String;
        }
        if (obj instanceof ReadableArray) {
            return ReadableType.Array;
        }
        if (obj instanceof ReadableMap) {
            return ReadableType.Map;
        }
        if (obj instanceof byte[]) {
            return ReadableType.ByteArray;
        }
        if (obj instanceof NativeHostObject) {
            return ReadableType.NativeHostObject;
        }
        return null;
    }

    public static JavaOnlyArray deepClone(ReadableArray readableArray) {
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        int size = readableArray.size();
        for (int i = 0; i < size; i++) {
            switch (C239621.f59280a[readableArray.getType(i).ordinal()]) {
                case 1:
                    javaOnlyArray.pushNull();
                    break;
                case 2:
                    javaOnlyArray.pushBoolean(readableArray.getBoolean(i));
                    break;
                case 3:
                    javaOnlyArray.pushInt(readableArray.getInt(i));
                    break;
                case 4:
                    javaOnlyArray.pushLong(readableArray.getLong(i));
                    break;
                case 5:
                    javaOnlyArray.pushDouble(readableArray.getDouble(i));
                    break;
                case 6:
                    javaOnlyArray.pushString(readableArray.getString(i));
                    break;
                case 7:
                    javaOnlyArray.pushMap(JavaOnlyMap.deepClone(readableArray.getMap(i)));
                    break;
                case 8:
                    javaOnlyArray.pushArray(deepClone(readableArray.getArray(i)));
                    break;
                case 9:
                    javaOnlyArray.pushByteArray((byte[]) readableArray.getByteArray(i).clone());
                    break;
            }
        }
        return javaOnlyArray;
    }
}
