package com.bytedance.ee.lark.infra.storage.p640c;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.ee.lark.infra.storage.c.b */
public class SharedPreferencesC12900b implements SharedPreferences {
    public boolean contains(String str) {
        return false;
    }

    public boolean getBoolean(String str, boolean z) {
        return z;
    }

    public float getFloat(String str, float f) {
        return f;
    }

    public int getInt(String str, int i) {
        return i;
    }

    public long getLong(String str, long j) {
        return j;
    }

    public String getString(String str, String str2) {
        return str2;
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) {
        return set;
    }

    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }

    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }

    public SharedPreferences.Editor edit() {
        return new SharedPreferences$EditorC12901a();
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        return new HashMap();
    }

    /* renamed from: com.bytedance.ee.lark.infra.storage.c.b$a */
    class SharedPreferences$EditorC12901a implements SharedPreferences.Editor {
        public void apply() {
        }

        public SharedPreferences.Editor clear() {
            return this;
        }

        public boolean commit() {
            return false;
        }

        public SharedPreferences.Editor putBoolean(String str, boolean z) {
            return this;
        }

        public SharedPreferences.Editor putFloat(String str, float f) {
            return this;
        }

        public SharedPreferences.Editor putInt(String str, int i) {
            return this;
        }

        public SharedPreferences.Editor putLong(String str, long j) {
            return this;
        }

        public SharedPreferences.Editor putString(String str, String str2) {
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            return this;
        }

        public SharedPreferences.Editor remove(String str) {
            return this;
        }

        SharedPreferences$EditorC12901a() {
        }
    }
}
