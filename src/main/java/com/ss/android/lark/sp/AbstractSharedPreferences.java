package com.ss.android.lark.sp;

import java.util.List;
import java.util.Map;

public abstract class AbstractSharedPreferences implements AbstractC54924a {
    private AbstractC54924a mBaseSp;

    public abstract String getSpName();

    @Override // com.ss.android.lark.sp.AbstractC54924a
    public void cleanSharedPreference() {
        this.mBaseSp.cleanSharedPreference();
    }

    @Override // com.ss.android.lark.sp.AbstractC54924a
    public Map<String, ?> getAll() {
        return this.mBaseSp.getAll();
    }

    public void setBaseSharedPreferences(AbstractC54924a aVar) {
        this.mBaseSp = aVar;
    }

    @Override // com.ss.android.lark.sp.AbstractC54924a
    public void commit(boolean z) {
        this.mBaseSp.commit(z);
    }

    @Override // com.ss.android.lark.sp.AbstractC54924a
    public boolean contains(String str) {
        return this.mBaseSp.contains(str);
    }

    @Override // com.ss.android.lark.sp.AbstractC54924a
    public boolean getBoolean(String str) {
        return this.mBaseSp.getBoolean(str);
    }

    @Override // com.ss.android.lark.sp.AbstractC54924a
    public int getInt(String str) {
        return this.mBaseSp.getInt(str);
    }

    @Override // com.ss.android.lark.sp.AbstractC54924a
    public long getLong(String str) {
        return this.mBaseSp.getLong(str);
    }

    @Override // com.ss.android.lark.sp.AbstractC54924a
    public String getString(String str) {
        return this.mBaseSp.getString(str);
    }

    @Override // com.ss.android.lark.sp.AbstractC54924a
    public boolean remove(String str) {
        return this.mBaseSp.remove(str);
    }

    @Override // com.ss.android.lark.sp.AbstractC54924a
    public float getFloat(String str, float f) {
        return this.mBaseSp.getFloat(str, f);
    }

    @Override // com.ss.android.lark.sp.AbstractC54924a
    public <T> List<T> getJSONArray(String str, Class<T> cls) {
        return this.mBaseSp.getJSONArray(str, cls);
    }

    @Override // com.ss.android.lark.sp.AbstractC54924a
    public <T> T getJSONObject(String str, Class<T> cls) {
        return (T) this.mBaseSp.getJSONObject(str, cls);
    }

    @Override // com.ss.android.lark.sp.AbstractC54924a
    public void putBoolean(String str, boolean z) {
        this.mBaseSp.putBoolean(str, z);
    }

    @Override // com.ss.android.lark.sp.AbstractC54924a
    public void putFloat(String str, float f) {
        this.mBaseSp.putFloat(str, f);
    }

    @Override // com.ss.android.lark.sp.AbstractC54924a
    public void putInt(String str, int i) {
        this.mBaseSp.putInt(str, i);
    }

    @Override // com.ss.android.lark.sp.AbstractC54924a
    public void putJSONArray(String str, List list) {
        this.mBaseSp.putJSONArray(str, list);
    }

    @Override // com.ss.android.lark.sp.AbstractC54924a
    public void putJSONObject(String str, Object obj) {
        this.mBaseSp.putJSONObject(str, obj);
    }

    @Override // com.ss.android.lark.sp.AbstractC54924a
    public boolean putLong(String str, long j) {
        return this.mBaseSp.putLong(str, j);
    }

    @Override // com.ss.android.lark.sp.AbstractC54924a
    public void putString(String str, String str2) {
        this.mBaseSp.putString(str, str2);
    }

    @Override // com.ss.android.lark.sp.AbstractC54924a
    public boolean getBoolean(String str, boolean z) {
        return this.mBaseSp.getBoolean(str, z);
    }

    @Override // com.ss.android.lark.sp.AbstractC54924a
    public int getInt(String str, int i) {
        return this.mBaseSp.getInt(str, i);
    }

    @Override // com.ss.android.lark.sp.AbstractC54924a
    public long getLong(String str, long j) {
        return this.mBaseSp.getLong(str, j);
    }

    @Override // com.ss.android.lark.sp.AbstractC54924a
    public String getString(String str, String str2) {
        return this.mBaseSp.getString(str, str2);
    }
}
