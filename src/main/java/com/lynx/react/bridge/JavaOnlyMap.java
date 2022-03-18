package com.lynx.react.bridge;

import androidx.collection.ArrayMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class JavaOnlyMap extends HashMap<String, Object> implements ReadableMap, WritableMap {
    public JavaOnlyMap() {
    }

    private static JavaOnlyMap create() {
        return new JavaOnlyMap();
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public ReadableMapKeySetIterator keySetIterator() {
        return new ReadableMapKeySetIterator() {
            /* class com.lynx.react.bridge.JavaOnlyMap.C265151 */

            /* renamed from: a */
            Iterator<String> f65561a;

            @Override // com.lynx.react.bridge.ReadableMapKeySetIterator
            public boolean hasNextKey() {
                return this.f65561a.hasNext();
            }

            @Override // com.lynx.react.bridge.ReadableMapKeySetIterator
            public String nextKey() {
                return this.f65561a.next();
            }

            {
                this.f65561a = JavaOnlyMap.this.keySet().iterator();
            }
        };
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public int size() {
        return super.size();
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public HashMap<String, Object> toHashMap() {
        return new HashMap<>(this);
    }

    /* access modifiers changed from: package-private */
    public ArrayList<String> getKeys() {
        return new ArrayList<>(keySet());
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public ArrayMap<String, Object> toArrayMap() {
        ArrayMap<String, Object> arrayMap = new ArrayMap<>();
        arrayMap.putAll(this);
        return arrayMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.react.bridge.JavaOnlyMap$2 */
    public static /* synthetic */ class C265162 {

        /* renamed from: a */
        static final /* synthetic */ int[] f65563a;

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
            throw new UnsupportedOperationException("Method not decompiled: com.lynx.react.bridge.JavaOnlyMap.C265162.<clinit>():void");
        }
    }

    private JavaOnlyMap(Map map) {
        super(map);
    }

    public static JavaOnlyMap from(Map map) {
        return new JavaOnlyMap(map);
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public AbstractC26517a getDynamic(String str) {
        return C26519c.m96104a(this, str);
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public boolean hasKey(String str) {
        return containsKey(str);
    }

    @Override // com.lynx.react.bridge.WritableMap
    public void merge(ReadableMap readableMap) {
        putAll((JavaOnlyMap) readableMap);
    }

    @Override // com.lynx.react.bridge.WritableMap
    public void putNull(String str) {
        put(str, null);
    }

    public int getTypeIndex(String str) {
        return getType(str).ordinal();
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public boolean isNull(String str) {
        if (get(str) == null) {
            return true;
        }
        return false;
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public JavaOnlyArray getArray(String str) {
        Object obj = get(str);
        if (obj instanceof JavaOnlyArray) {
            return (JavaOnlyArray) obj;
        }
        if (obj == null) {
            return null;
        }
        throw new ClassCastException(obj.getClass().getName() + " cannot be cast to " + JavaOnlyArray.class.getName() + ", key: " + str);
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public ReadableMap getMap(String str) {
        Object obj = get(str);
        if (obj instanceof ReadableMap) {
            return (ReadableMap) obj;
        }
        if (obj == null) {
            return null;
        }
        throw new ClassCastException(obj.getClass().getName() + " cannot be cast to " + ReadableMap.class.getName() + ", key: " + str);
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public String getString(String str) {
        Object obj = get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj == null) {
            return null;
        }
        throw new ClassCastException(obj.getClass().getName() + " cannot be cast to java.lang.String, key: " + str);
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public boolean getBoolean(String str) {
        Object obj = get(str);
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj == null) {
            throw new NullPointerException("key: " + str);
        }
        throw new ClassCastException(obj.getClass().getName() + " cannot be cast to java.lang.Boolean, key: " + str);
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public byte[] getByteArray(String str) {
        Object obj = get(str);
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        if (obj == null) {
            return null;
        }
        throw new ClassCastException(obj.getClass().getName() + " cannot be cast to " + byte[].class.getName() + ", key: " + str);
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public double getDouble(String str) {
        Object obj = get(str);
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        if (obj == null) {
            throw new NullPointerException("key: " + str);
        }
        throw new ClassCastException(obj.getClass().getName() + " cannot be cast to java.lang.Number, key: " + str);
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public int getInt(String str) {
        Object obj = get(str);
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        if (obj == null) {
            throw new NullPointerException("key: " + str);
        }
        throw new ClassCastException(obj.getClass().getName() + " cannot be cast to java.lang.Number, key: " + str);
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public long getLong(String str) {
        Object obj = get(str);
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        if (obj == null) {
            throw new NullPointerException("key: " + str);
        }
        throw new ClassCastException(obj.getClass().getName() + " cannot be cast to java.lang.Long, key: " + str);
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public ReadableType getType(String str) {
        Object obj = get(str);
        if (obj == null) {
            return ReadableType.Null;
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
        if (obj instanceof Boolean) {
            return ReadableType.Boolean;
        }
        if (obj instanceof ReadableMap) {
            return ReadableType.Map;
        }
        if (obj instanceof ReadableArray) {
            return ReadableType.Array;
        }
        if (obj instanceof byte[]) {
            return ReadableType.ByteArray;
        }
        if (obj instanceof AbstractC26517a) {
            return ((AbstractC26517a) obj).mo94071g();
        }
        throw new IllegalArgumentException("Invalid value " + obj.toString() + " for key " + str + "contained in JavaOnlyMap");
    }

    public static JavaOnlyMap deepClone(ReadableMap readableMap) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            switch (C265162.f65563a[readableMap.getType(nextKey).ordinal()]) {
                case 1:
                    javaOnlyMap.putNull(nextKey);
                    break;
                case 2:
                    javaOnlyMap.putBoolean(nextKey, readableMap.getBoolean(nextKey));
                    break;
                case 3:
                    javaOnlyMap.putInt(nextKey, readableMap.getInt(nextKey));
                    break;
                case 4:
                    javaOnlyMap.putLong(nextKey, readableMap.getLong(nextKey));
                    break;
                case 5:
                    javaOnlyMap.putDouble(nextKey, readableMap.getDouble(nextKey));
                    break;
                case 6:
                    javaOnlyMap.putString(nextKey, readableMap.getString(nextKey));
                    break;
                case 7:
                    javaOnlyMap.putMap(nextKey, deepClone(readableMap.getMap(nextKey)));
                    break;
                case 8:
                    javaOnlyMap.putArray(nextKey, JavaOnlyArray.deepClone(readableMap.getArray(nextKey)));
                    break;
                case 9:
                    javaOnlyMap.putByteArray(nextKey, (byte[]) readableMap.getByteArray(nextKey).clone());
                    break;
            }
        }
        return javaOnlyMap;
    }

    @Override // com.lynx.react.bridge.WritableMap
    public void putArray(String str, WritableArray writableArray) {
        put(str, writableArray);
    }

    @Override // com.lynx.react.bridge.WritableMap
    public void putByteArray(String str, byte[] bArr) {
        put(str, bArr);
    }

    @Override // com.lynx.react.bridge.WritableMap
    public void putMap(String str, WritableMap writableMap) {
        put(str, writableMap);
    }

    @Override // com.lynx.react.bridge.WritableMap
    public void putString(String str, String str2) {
        put(str, str2);
    }

    @Override // com.lynx.react.bridge.WritableMap
    public void putBoolean(String str, boolean z) {
        put(str, Boolean.valueOf(z));
    }

    @Override // com.lynx.react.bridge.WritableMap
    public void putDouble(String str, double d) {
        put(str, Double.valueOf(d));
    }

    @Override // com.lynx.react.bridge.WritableMap
    public void putInt(String str, int i) {
        put(str, Integer.valueOf(i));
    }

    @Override // com.lynx.react.bridge.WritableMap
    public void putLong(String str, long j) {
        put(str, Long.valueOf(j));
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public ReadableArray getArray(String str, ReadableArray readableArray) {
        Object obj = get(str);
        if (obj instanceof ReadableArray) {
            return (ReadableArray) obj;
        }
        return readableArray;
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public boolean getBoolean(String str, boolean z) {
        Object obj = get(str);
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return z;
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public byte[] getByteArray(String str, byte[] bArr) {
        Object obj = get(str);
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        return bArr;
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public double getDouble(String str, double d) {
        Object obj = get(str);
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        return d;
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public int getInt(String str, int i) {
        Object obj = get(str);
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        return i;
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public long getLong(String str, long j) {
        Object obj = get(str);
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        return j;
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public ReadableMap getMap(String str, ReadableMap readableMap) {
        Object obj = get(str);
        if (obj instanceof ReadableMap) {
            return (ReadableMap) obj;
        }
        return readableMap;
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public String getString(String str, String str2) {
        Object obj = get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return str2;
    }

    @Override // com.lynx.react.bridge.WritableMap
    public void putByteArrayAsString(byte[] bArr, byte[] bArr2) {
        put(new String(bArr), new String(bArr2));
    }
}
