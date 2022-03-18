package com.tencent.mmkv;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.util.Log;
import com.C1711a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MMKV implements SharedPreferences, SharedPreferences.Editor {
    private static MMKVHandler gCallbackHandler;
    private static AbstractC65662a gContentChangeNotify;
    private static boolean gWantLogReDirecting = false;
    private static MMKVLogLevel[] index2LogLevel = {MMKVLogLevel.LevelDebug, MMKVLogLevel.LevelInfo, MMKVLogLevel.LevelWarning, MMKVLogLevel.LevelError, MMKVLogLevel.LevelNone};
    private static EnumMap<MMKVLogLevel, Integer> logLevel2Index;
    private static final HashMap<String, Parcelable.Creator<?>> mCreators = new HashMap<>();
    private static EnumMap<MMKVRecoverStrategic, Integer> recoverIndex;
    private static String rootDir = null;
    private long nativeHandle;

    /* renamed from: com.tencent.mmkv.MMKV$a */
    public interface AbstractC65660a {
        /* renamed from: a */
        void mo229846a(String str);
    }

    private native boolean containsKey(long j, String str);

    private native long count(long j);

    private static native long createNB(int i);

    private native boolean decodeBool(long j, String str, boolean z);

    private native byte[] decodeBytes(long j, String str);

    private native double decodeDouble(long j, String str, double d);

    private native float decodeFloat(long j, String str, float f);

    private native int decodeInt(long j, String str, int i);

    private native long decodeLong(long j, String str, long j2);

    private native String decodeString(long j, String str, String str2);

    private native String[] decodeStringSet(long j, String str);

    private static native void destroyNB(long j, int i);

    private native boolean encodeBool(long j, String str, boolean z);

    private native boolean encodeBytes(long j, String str, byte[] bArr);

    private native boolean encodeDouble(long j, String str, double d);

    private native boolean encodeFloat(long j, String str, float f);

    private native boolean encodeInt(long j, String str, int i);

    private native boolean encodeLong(long j, String str, long j2);

    private native boolean encodeSet(long j, String str, String[] strArr);

    private native boolean encodeString(long j, String str, String str2);

    private static native long getDefaultMMKV(int i, String str);

    private static native long getMMKVWithAshmemFD(String str, int i, int i2, String str2);

    private static native long getMMKVWithID(String str, int i, String str2, String str3);

    private static native long getMMKVWithIDAndSize(String str, int i, int i2, String str2);

    public static native boolean isFileValid(String str);

    private static native void jniInitialize(String str, int i);

    public static native void onExit();

    public static native int pageSize();

    private native void removeValueForKey(long j, String str);

    private static native void setCallbackHandler(boolean z, boolean z2);

    private static native void setLogLevel(int i);

    private static native void setWantsContentChangeNotify(boolean z);

    private native void sync(boolean z);

    private native long totalSize(long j);

    private native int valueSize(long j, String str, boolean z);

    private native int writeValueToNB(long j, String str, long j2, int i);

    public native String[] allKeys();

    public native int ashmemFD();

    public native int ashmemMetaFD();

    public native void checkContentChangedByOuterProcess();

    public native void checkReSetCryptKey(String str);

    public native void clearAll();

    public native void clearMemoryCache();

    public native void close();

    public native String cryptKey();

    public SharedPreferences.Editor edit() {
        return this;
    }

    public native void lock();

    public native String mmapID();

    public native boolean reKey(String str);

    public native void removeValuesForKeys(String[] strArr);

    public native void trim();

    public native boolean tryLock();

    public native void unlock();

    public static String getRootDir() {
        return rootDir;
    }

    public SharedPreferences.Editor clear() {
        clearAll();
        return this;
    }

    public static void unregisterContentChangeNotify() {
        gContentChangeNotify = null;
        setWantsContentChangeNotify(false);
    }

    public void apply() {
        sync(false);
    }

    public void async() {
        sync(false);
    }

    public boolean commit() {
        sync(true);
        return true;
    }

    public long count() {
        return count(this.nativeHandle);
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        throw new UnsupportedOperationException("use allKeys() instead, getAll() not implement because type-erasure inside mmkv");
    }

    public void sync() {
        sync(true);
    }

    public long totalSize() {
        return totalSize(this.nativeHandle);
    }

    public static void unregisterHandler() {
        gCallbackHandler = null;
        setCallbackHandler(false, false);
        gWantLogReDirecting = false;
    }

    public static MMKV defaultMMKV() {
        if (rootDir != null) {
            return new MMKV(getDefaultMMKV(1, null));
        }
        throw new IllegalStateException("You should Call MMKV.initialize() first.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.tencent.mmkv.MMKV$1 */
    public static /* synthetic */ class C656591 {

        /* renamed from: a */
        static final /* synthetic */ int[] f165415a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.tencent.mmkv.MMKVLogLevel[] r0 = com.tencent.mmkv.MMKVLogLevel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.tencent.mmkv.MMKV.C656591.f165415a = r0
                com.tencent.mmkv.MMKVLogLevel r1 = com.tencent.mmkv.MMKVLogLevel.LevelDebug     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.tencent.mmkv.MMKV.C656591.f165415a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tencent.mmkv.MMKVLogLevel r1 = com.tencent.mmkv.MMKVLogLevel.LevelInfo     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.tencent.mmkv.MMKV.C656591.f165415a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tencent.mmkv.MMKVLogLevel r1 = com.tencent.mmkv.MMKVLogLevel.LevelWarning     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.tencent.mmkv.MMKV.C656591.f165415a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tencent.mmkv.MMKVLogLevel r1 = com.tencent.mmkv.MMKVLogLevel.LevelError     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.tencent.mmkv.MMKV.C656591.f165415a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.tencent.mmkv.MMKVLogLevel r1 = com.tencent.mmkv.MMKVLogLevel.LevelNone     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mmkv.MMKV.C656591.<clinit>():void");
        }
    }

    static {
        EnumMap<MMKVRecoverStrategic, Integer> enumMap = new EnumMap<>(MMKVRecoverStrategic.class);
        recoverIndex = enumMap;
        enumMap.put(MMKVRecoverStrategic.OnErrorDiscard, (Integer) 0);
        recoverIndex.put(MMKVRecoverStrategic.OnErrorRecover, (Integer) 1);
        EnumMap<MMKVLogLevel, Integer> enumMap2 = new EnumMap<>(MMKVLogLevel.class);
        logLevel2Index = enumMap2;
        enumMap2.put(MMKVLogLevel.LevelDebug, (Integer) 0);
        logLevel2Index.put(MMKVLogLevel.LevelInfo, (Integer) 1);
        logLevel2Index.put(MMKVLogLevel.LevelWarning, (Integer) 2);
        logLevel2Index.put(MMKVLogLevel.LevelError, (Integer) 3);
        logLevel2Index.put(MMKVLogLevel.LevelNone, (Integer) 4);
    }

    public SharedPreferences.Editor remove(String str) {
        removeValueForKey(str);
        return this;
    }

    private MMKV(long j) {
        this.nativeHandle = j;
    }

    public static void destroyNativeBuffer(C65663b bVar) {
        destroyNB(bVar.f165421a, bVar.f165422b);
    }

    public static String initialize(String str) {
        return initialize(str, null, MMKVLogLevel.LevelInfo);
    }

    private static void onContentChangedByOuterProcess(String str) {
        AbstractC65662a aVar = gContentChangeNotify;
        if (aVar != null) {
            aVar.mo229861a(str);
        }
    }

    public static void setLogLevel(MMKVLogLevel mMKVLogLevel) {
        setLogLevel(logLevel2Int(mMKVLogLevel));
    }

    public boolean contains(String str) {
        return containsKey(str);
    }

    public boolean containsKey(String str) {
        return containsKey(this.nativeHandle, str);
    }

    public boolean decodeBool(String str) {
        return decodeBool(this.nativeHandle, str, false);
    }

    public byte[] decodeBytes(String str) {
        return decodeBytes(str, (byte[]) null);
    }

    public float decodeFloat(String str) {
        return decodeFloat(this.nativeHandle, str, BitmapDescriptorFactory.HUE_RED);
    }

    public int decodeInt(String str) {
        return decodeInt(this.nativeHandle, str, 0);
    }

    public String decodeString(String str) {
        return decodeString(this.nativeHandle, str, null);
    }

    public Set<String> decodeStringSet(String str) {
        return decodeStringSet(str, (Set<String>) null);
    }

    public int getValueActualSize(String str) {
        return valueSize(this.nativeHandle, str, true);
    }

    public int getValueSize(String str) {
        return valueSize(this.nativeHandle, str, false);
    }

    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        throw new UnsupportedOperationException("Not implement in MMKV");
    }

    public void removeValueForKey(String str) {
        removeValueForKey(this.nativeHandle, str);
    }

    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        throw new UnsupportedOperationException("Not implement in MMKV");
    }

    public static void registerContentChangeNotify(AbstractC65662a aVar) {
        boolean z;
        gContentChangeNotify = aVar;
        if (aVar != null) {
            z = true;
        } else {
            z = false;
        }
        setWantsContentChangeNotify(z);
    }

    public double decodeDouble(String str) {
        return decodeDouble(this.nativeHandle, str, 0.0d);
    }

    public long decodeLong(String str) {
        return decodeLong(this.nativeHandle, str, 0);
    }

    public static C65663b createNativeBuffer(int i) {
        long createNB = createNB(i);
        if (createNB <= 0) {
            return null;
        }
        return new C65663b(createNB, i);
    }

    private static int logLevel2Int(MMKVLogLevel mMKVLogLevel) {
        int i = C656591.f165415a[mMKVLogLevel.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            if (i == 3) {
                return 2;
            }
            if (i == 4) {
                return 3;
            }
            if (i != 5) {
                return 1;
            }
            return 4;
        }
        return 1;
    }

    public static MMKV mmkvWithID(String str) {
        if (rootDir != null) {
            return new MMKV(getMMKVWithID(str, 1, null, null));
        }
        throw new IllegalStateException("You should Call MMKV.initialize() first.");
    }

    public static void registerHandler(MMKVHandler mMKVHandler) {
        gCallbackHandler = mMKVHandler;
        if (mMKVHandler.wantLogRedirecting()) {
            setCallbackHandler(true, true);
            gWantLogReDirecting = true;
            return;
        }
        setCallbackHandler(false, true);
        gWantLogReDirecting = false;
    }

    public static String initialize(Context context) {
        return initialize(context.getFilesDir().getAbsolutePath() + "/mmkv", null, MMKVLogLevel.LevelInfo);
    }

    private static int onMMKVCRCCheckFail(String str) {
        MMKVRecoverStrategic mMKVRecoverStrategic = MMKVRecoverStrategic.OnErrorDiscard;
        MMKVHandler mMKVHandler = gCallbackHandler;
        if (mMKVHandler != null) {
            mMKVRecoverStrategic = mMKVHandler.onMMKVCRCCheckFail(str);
        }
        MMKVLogLevel mMKVLogLevel = MMKVLogLevel.LevelInfo;
        simpleLog(mMKVLogLevel, "Recover strategic for " + str + " is " + mMKVRecoverStrategic);
        Integer num = recoverIndex.get(mMKVRecoverStrategic);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    private static int onMMKVFileLengthError(String str) {
        MMKVRecoverStrategic mMKVRecoverStrategic = MMKVRecoverStrategic.OnErrorDiscard;
        MMKVHandler mMKVHandler = gCallbackHandler;
        if (mMKVHandler != null) {
            mMKVRecoverStrategic = mMKVHandler.onMMKVFileLengthError(str);
        }
        MMKVLogLevel mMKVLogLevel = MMKVLogLevel.LevelInfo;
        simpleLog(mMKVLogLevel, "Recover strategic for " + str + " is " + mMKVRecoverStrategic);
        Integer num = recoverIndex.get(mMKVRecoverStrategic);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public int importFromSharedPreferences(SharedPreferences sharedPreferences) {
        Map<String, ?> all = sharedPreferences.getAll();
        if (all == null || all.size() <= 0) {
            return 0;
        }
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (!(key == null || value == null)) {
                if (value instanceof Boolean) {
                    encodeBool(this.nativeHandle, key, ((Boolean) value).booleanValue());
                } else if (value instanceof Integer) {
                    encodeInt(this.nativeHandle, key, ((Integer) value).intValue());
                } else if (value instanceof Long) {
                    encodeLong(this.nativeHandle, key, ((Long) value).longValue());
                } else if (value instanceof Float) {
                    encodeFloat(this.nativeHandle, key, ((Float) value).floatValue());
                } else if (value instanceof Double) {
                    encodeDouble(this.nativeHandle, key, ((Double) value).doubleValue());
                } else if (value instanceof String) {
                    encodeString(this.nativeHandle, key, (String) value);
                } else if (value instanceof Set) {
                    encode(key, (Set) value);
                } else {
                    MMKVLogLevel mMKVLogLevel = MMKVLogLevel.LevelError;
                    simpleLog(mMKVLogLevel, "unknown type: " + value.getClass());
                }
            }
        }
        return all.size();
    }

    public SharedPreferences.Editor putBytes(String str, byte[] bArr) {
        encode(str, bArr);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
        encode(str, set);
        return this;
    }

    public <T extends Parcelable> T decodeParcelable(String str, Class<T> cls) {
        return (T) decodeParcelable(str, cls, null);
    }

    public boolean encode(String str, float f) {
        return encodeFloat(this.nativeHandle, str, f);
    }

    public boolean getBoolean(String str, boolean z) {
        return decodeBool(this.nativeHandle, str, z);
    }

    public byte[] getBytes(String str, byte[] bArr) {
        return decodeBytes(str, bArr);
    }

    public float getFloat(String str, float f) {
        return decodeFloat(this.nativeHandle, str, f);
    }

    public int getInt(String str, int i) {
        return decodeInt(this.nativeHandle, str, i);
    }

    public String getString(String str, String str2) {
        return decodeString(this.nativeHandle, str, str2);
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) {
        return decodeStringSet(str, set);
    }

    public SharedPreferences.Editor putBoolean(String str, boolean z) {
        encodeBool(this.nativeHandle, str, z);
        return this;
    }

    public SharedPreferences.Editor putFloat(String str, float f) {
        encodeFloat(this.nativeHandle, str, f);
        return this;
    }

    public SharedPreferences.Editor putInt(String str, int i) {
        encodeInt(this.nativeHandle, str, i);
        return this;
    }

    public SharedPreferences.Editor putString(String str, String str2) {
        encodeString(this.nativeHandle, str, str2);
        return this;
    }

    public static String initialize(String str, AbstractC65660a aVar) {
        return initialize(str, aVar, MMKVLogLevel.LevelInfo);
    }

    public boolean decodeBool(String str, boolean z) {
        return decodeBool(this.nativeHandle, str, z);
    }

    public byte[] decodeBytes(String str, byte[] bArr) {
        byte[] decodeBytes = decodeBytes(this.nativeHandle, str);
        return decodeBytes != null ? decodeBytes : bArr;
    }

    public float decodeFloat(String str, float f) {
        return decodeFloat(this.nativeHandle, str, f);
    }

    public int decodeInt(String str, int i) {
        return decodeInt(this.nativeHandle, str, i);
    }

    public String decodeString(String str, String str2) {
        return decodeString(this.nativeHandle, str, str2);
    }

    public Set<String> decodeStringSet(String str, Set<String> set) {
        return decodeStringSet(str, set, HashSet.class);
    }

    public boolean encode(String str, double d) {
        return encodeDouble(this.nativeHandle, str, d);
    }

    public long getLong(String str, long j) {
        return decodeLong(this.nativeHandle, str, j);
    }

    public SharedPreferences.Editor putLong(String str, long j) {
        encodeLong(this.nativeHandle, str, j);
        return this;
    }

    public int writeValueToNativeBuffer(String str, C65663b bVar) {
        return writeValueToNB(this.nativeHandle, str, bVar.f165421a, bVar.f165422b);
    }

    public static String initialize(Context context, MMKVLogLevel mMKVLogLevel) {
        return initialize(context.getFilesDir().getAbsolutePath() + "/mmkv", null, mMKVLogLevel);
    }

    public double decodeDouble(String str, double d) {
        return decodeDouble(this.nativeHandle, str, d);
    }

    public long decodeLong(String str, long j) {
        return decodeLong(this.nativeHandle, str, j);
    }

    public boolean encode(String str, int i) {
        return encodeInt(this.nativeHandle, str, i);
    }

    public static MMKV defaultMMKV(int i, String str) {
        if (rootDir != null) {
            return new MMKV(getDefaultMMKV(i, str));
        }
        throw new IllegalStateException("You should Call MMKV.initialize() first.");
    }

    public static MMKV mmkvWithID(String str, int i) {
        if (rootDir != null) {
            return new MMKV(getMMKVWithID(str, i, null, null));
        }
        throw new IllegalStateException("You should Call MMKV.initialize() first.");
    }

    private static void simpleLog(MMKVLogLevel mMKVLogLevel, String str) {
        int i;
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StackTraceElement stackTraceElement = stackTrace[stackTrace.length - 1];
        Integer num = logLevel2Index.get(mMKVLogLevel);
        if (num == null) {
            i = 0;
        } else {
            i = num.intValue();
        }
        mmkvLogImp(i, stackTraceElement.getFileName(), stackTraceElement.getLineNumber(), stackTraceElement.getMethodName(), str);
    }

    public boolean encode(String str, long j) {
        return encodeLong(this.nativeHandle, str, j);
    }

    public boolean encode(String str, Parcelable parcelable) {
        Parcel obtain = Parcel.obtain();
        parcelable.writeToParcel(obtain, parcelable.describeContents());
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return encodeBytes(this.nativeHandle, str, marshall);
    }

    public static String initialize(String str, MMKVLogLevel mMKVLogLevel) {
        return initialize(str, null, mMKVLogLevel);
    }

    public boolean encode(String str, String str2) {
        return encodeString(this.nativeHandle, str, str2);
    }

    public static MMKV mmkvWithID(String str, String str2) {
        if (rootDir != null) {
            long mMKVWithID = getMMKVWithID(str, 1, null, str2);
            if (mMKVWithID == 0) {
                return null;
            }
            return new MMKV(mMKVWithID);
        }
        throw new IllegalStateException("You should Call MMKV.initialize() first.");
    }

    public boolean encode(String str, Set<String> set) {
        return encodeSet(this.nativeHandle, str, (String[]) set.toArray(new String[0]));
    }

    public boolean encode(String str, boolean z) {
        return encodeBool(this.nativeHandle, str, z);
    }

    public boolean encode(String str, byte[] bArr) {
        return encodeBytes(this.nativeHandle, str, bArr);
    }

    public Set<String> decodeStringSet(String str, Set<String> set, Class<? extends Set> cls) {
        String[] decodeStringSet = decodeStringSet(this.nativeHandle, str);
        if (decodeStringSet == null) {
            return set;
        }
        try {
            Set<String> set2 = (Set) cls.newInstance();
            set2.addAll(Arrays.asList(decodeStringSet));
            return set2;
        } catch (IllegalAccessException | InstantiationException unused) {
            return set;
        }
    }

    public static String initialize(String str, AbstractC65660a aVar, MMKVLogLevel mMKVLogLevel) {
        if (aVar != null) {
            aVar.mo229846a("mmkv");
        } else {
            C1711a.m7628a("mmkv");
        }
        rootDir = str;
        jniInitialize(str, logLevel2Int(mMKVLogLevel));
        return str;
    }

    public static MMKV mmkvWithID(String str, int i, String str2) {
        if (rootDir != null) {
            return new MMKV(getMMKVWithID(str, i, str2, null));
        }
        throw new IllegalStateException("You should Call MMKV.initialize() first.");
    }

    public <T extends Parcelable> T decodeParcelable(String str, Class<T> cls, T t) {
        byte[] decodeBytes;
        Parcelable.Creator<?> creator;
        if (cls == null || (decodeBytes = decodeBytes(this.nativeHandle, str)) == null) {
            return t;
        }
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(decodeBytes, 0, decodeBytes.length);
        obtain.setDataPosition(0);
        try {
            String cls2 = cls.toString();
            HashMap<String, Parcelable.Creator<?>> hashMap = mCreators;
            synchronized (hashMap) {
                creator = hashMap.get(cls2);
                if (creator == null && (creator = (Parcelable.Creator) cls.getField("CREATOR").get(null)) != null) {
                    hashMap.put(cls2, creator);
                }
            }
            if (creator != null) {
                return (T) ((Parcelable) creator.createFromParcel(obtain));
            }
            throw new Exception("Parcelable protocol requires a non-null static Parcelable.Creator object called CREATOR on class " + cls2);
        } catch (Exception e) {
            simpleLog(MMKVLogLevel.LevelError, e.toString());
            return t;
        } finally {
            obtain.recycle();
        }
    }

    public static MMKV mmkvWithAshmemFD(String str, int i, int i2, String str2) {
        return new MMKV(getMMKVWithAshmemFD(str, i, i2, str2));
    }

    public static MMKV mmkvWithID(String str, int i, String str2, String str3) {
        if (rootDir != null) {
            long mMKVWithID = getMMKVWithID(str, i, str2, str3);
            if (mMKVWithID == 0) {
                return null;
            }
            return new MMKV(mMKVWithID);
        }
        throw new IllegalStateException("You should Call MMKV.initialize() first.");
    }

    private static void mmkvLogImp(int i, String str, int i2, String str2, String str3) {
        MMKVHandler mMKVHandler = gCallbackHandler;
        if (mMKVHandler == null || !gWantLogReDirecting) {
            int i3 = C656591.f165415a[index2LogLevel[i].ordinal()];
            if (i3 == 1) {
                Log.d("MMKV", str3);
            } else if (i3 == 2) {
                Log.i("MMKV", str3);
            } else if (i3 == 3) {
                Log.w("MMKV", str3);
            } else if (i3 == 4) {
                Log.e("MMKV", str3);
            }
        } else {
            mMKVHandler.mmkvLog(index2LogLevel[i], str, i2, str2, str3);
        }
    }

    public static MMKV mmkvWithAshmemID(Context context, String str, int i, int i2, String str2) {
        if (rootDir != null) {
            String a = MMKVContentProvider.m257431a(context, Process.myPid());
            if (a == null || a.length() == 0) {
                simpleLog(MMKVLogLevel.LevelError, "process name detect fail, try again later");
                return null;
            } else if (a.contains(":")) {
                Uri a2 = MMKVContentProvider.m257429a(context);
                if (a2 == null) {
                    simpleLog(MMKVLogLevel.LevelError, "MMKVContentProvider has invalid authority");
                    return null;
                }
                MMKVLogLevel mMKVLogLevel = MMKVLogLevel.LevelInfo;
                simpleLog(mMKVLogLevel, "getting parcelable mmkv in process, Uri = " + a2);
                Bundle bundle = new Bundle();
                bundle.putInt("KEY_SIZE", i);
                bundle.putInt("KEY_MODE", i2);
                if (str2 != null) {
                    bundle.putString("KEY_CRYPT", str2);
                }
                Bundle call = context.getContentResolver().call(a2, "mmkvFromAshmemID", str, bundle);
                if (call != null) {
                    call.setClassLoader(ParcelableMMKV.class.getClassLoader());
                    ParcelableMMKV parcelableMMKV = (ParcelableMMKV) call.getParcelable("KEY");
                    if (parcelableMMKV != null) {
                        MMKV a3 = parcelableMMKV.mo229854a();
                        if (a3 != null) {
                            MMKVLogLevel mMKVLogLevel2 = MMKVLogLevel.LevelInfo;
                            simpleLog(mMKVLogLevel2, a3.mmapID() + " fd = " + a3.ashmemFD() + ", meta fd = " + a3.ashmemMetaFD());
                        }
                        return a3;
                    }
                }
                return null;
            } else {
                simpleLog(MMKVLogLevel.LevelInfo, "getting mmkv in main process");
                return new MMKV(getMMKVWithIDAndSize(str, i, i2 | 8, str2));
            }
        } else {
            throw new IllegalStateException("You should Call MMKV.initialize() first.");
        }
    }
}
