package com.ss.android.lark.sp;

import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.sp.a */
public interface AbstractC54924a {
    void cleanSharedPreference();

    void commit(boolean z);

    boolean contains(String str);

    Map<String, ?> getAll();

    boolean getBoolean(String str);

    boolean getBoolean(String str, boolean z);

    float getFloat(String str, float f);

    int getInt(String str);

    int getInt(String str, int i);

    <T> List<T> getJSONArray(String str, Class<T> cls);

    <T> T getJSONObject(String str, Class<T> cls);

    long getLong(String str);

    long getLong(String str, long j);

    String getString(String str);

    String getString(String str, String str2);

    void putBoolean(String str, boolean z);

    void putFloat(String str, float f);

    void putInt(String str, int i);

    void putJSONArray(String str, List list);

    void putJSONObject(String str, Object obj);

    boolean putLong(String str, long j);

    void putString(String str, String str2);

    boolean remove(String str);
}
