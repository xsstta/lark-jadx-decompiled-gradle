package com.ss.android.lark.sp.p2686a;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ss.android.lark.p2909v.AbstractC57895b;
import com.ss.android.lark.p2909v.C57898e;
import com.ss.android.lark.sp.AbstractC54924a;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.sp.a.a */
public class C54925a implements AbstractC54924a {

    /* renamed from: a */
    private SharedPreferences f135628a;

    /* renamed from: b */
    private AbstractC57895b f135629b;

    @Override // com.ss.android.lark.sp.AbstractC54924a
    public void cleanSharedPreference() {
        SharedPreferences sharedPreferences = this.f135628a;
        if (sharedPreferences != null) {
            sharedPreferences.edit().clear().apply();
        }
    }

    @Override // com.ss.android.lark.sp.AbstractC54924a
    public Map<String, ?> getAll() {
        SharedPreferences sharedPreferences = this.f135628a;
        if (sharedPreferences == null) {
            return null;
        }
        return sharedPreferences.getAll();
    }

    public C54925a(SharedPreferences sharedPreferences) {
        this.f135628a = sharedPreferences;
    }

    @Override // com.ss.android.lark.sp.AbstractC54924a
    public boolean getBoolean(String str) {
        return getBoolean(str, false);
    }

    @Override // com.ss.android.lark.sp.AbstractC54924a
    public int getInt(String str) {
        return getInt(str, 0);
    }

    @Override // com.ss.android.lark.sp.AbstractC54924a
    public long getLong(String str) {
        return getLong(str, 0);
    }

    @Override // com.ss.android.lark.sp.AbstractC54924a
    public String getString(String str) {
        return getString(str, "");
    }

    /* renamed from: a */
    private String m212992a(String str) {
        if (this.f135629b == null) {
            return str;
        }
        return C57898e.m224704c(str);
    }

    /* renamed from: b */
    private String m212993b(String str) {
        AbstractC57895b bVar = this.f135629b;
        if (bVar == null) {
            return str;
        }
        return bVar.mo196232a(str);
    }

    /* renamed from: c */
    private String m212994c(String str) {
        AbstractC57895b bVar = this.f135629b;
        if (bVar == null) {
            return str;
        }
        return bVar.mo196233b(str);
    }

    @Override // com.ss.android.lark.sp.AbstractC54924a
    public boolean contains(String str) {
        SharedPreferences sharedPreferences = this.f135628a;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains(m212992a(str));
    }

    @Override // com.ss.android.lark.sp.AbstractC54924a
    public void commit(boolean z) {
        SharedPreferences sharedPreferences = this.f135628a;
        if (sharedPreferences == null) {
            return;
        }
        if (z) {
            sharedPreferences.edit().apply();
        } else {
            sharedPreferences.edit().commit();
        }
    }

    @Override // com.ss.android.lark.sp.AbstractC54924a
    public boolean remove(String str) {
        SharedPreferences sharedPreferences = this.f135628a;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.edit().remove(m212992a(str)).commit();
    }

    @Override // com.ss.android.lark.sp.AbstractC54924a
    public void putJSONArray(String str, List list) {
        try {
            putString(str, JSONArray.toJSONString(list));
        } catch (Exception unused) {
        }
    }

    @Override // com.ss.android.lark.sp.AbstractC54924a
    public void putJSONObject(String str, Object obj) {
        try {
            putString(str, JSONObject.toJSONString(obj));
        } catch (Exception unused) {
        }
    }

    public C54925a(SharedPreferences sharedPreferences, AbstractC57895b bVar) {
        this(sharedPreferences);
        this.f135629b = bVar;
    }

    @Override // com.ss.android.lark.sp.AbstractC54924a
    public <T> List<T> getJSONArray(String str, Class<T> cls) {
        try {
            return JSONArray.parseArray(getString(str), cls);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.ss.android.lark.sp.AbstractC54924a
    public <T> T getJSONObject(String str, Class<T> cls) {
        try {
            return (T) JSONObject.parseObject(getString(str), cls);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.ss.android.lark.sp.AbstractC54924a
    public boolean getBoolean(String str, boolean z) {
        if (this.f135629b == null) {
            return this.f135628a.getBoolean(str, z);
        }
        String string = getString(str);
        if (TextUtils.isEmpty(string)) {
            return z;
        }
        try {
            return Boolean.parseBoolean(string);
        } catch (Exception unused) {
            return z;
        }
    }

    @Override // com.ss.android.lark.sp.AbstractC54924a
    public float getFloat(String str, float f) {
        if (this.f135629b == null) {
            return this.f135628a.getFloat(str, f);
        }
        String string = getString(str);
        if (TextUtils.isEmpty(string)) {
            return f;
        }
        try {
            return Float.parseFloat(string);
        } catch (Exception unused) {
            return f;
        }
    }

    @Override // com.ss.android.lark.sp.AbstractC54924a
    public int getInt(String str, int i) {
        if (this.f135629b == null) {
            return this.f135628a.getInt(str, i);
        }
        String string = getString(str);
        if (TextUtils.isEmpty(string)) {
            return i;
        }
        try {
            return Integer.parseInt(string);
        } catch (Exception unused) {
            return i;
        }
    }

    @Override // com.ss.android.lark.sp.AbstractC54924a
    public long getLong(String str, long j) {
        if (this.f135629b == null) {
            return this.f135628a.getLong(str, j);
        }
        String string = getString(str);
        if (TextUtils.isEmpty(string)) {
            return j;
        }
        try {
            return Long.parseLong(string);
        } catch (Exception unused) {
            return j;
        }
    }

    @Override // com.ss.android.lark.sp.AbstractC54924a
    public String getString(String str, String str2) {
        String string = this.f135628a.getString(m212992a(str), "");
        if (TextUtils.isEmpty(string)) {
            return str2;
        }
        return m212994c(string);
    }

    @Override // com.ss.android.lark.sp.AbstractC54924a
    public void putBoolean(String str, boolean z) {
        if (this.f135629b == null) {
            this.f135628a.edit().putBoolean(str, z).apply();
        } else {
            putString(str, String.valueOf(z));
        }
    }

    @Override // com.ss.android.lark.sp.AbstractC54924a
    public void putFloat(String str, float f) {
        if (this.f135629b == null) {
            this.f135628a.edit().putFloat(str, f).apply();
        } else {
            putString(str, String.valueOf(f));
        }
    }

    @Override // com.ss.android.lark.sp.AbstractC54924a
    public void putInt(String str, int i) {
        if (this.f135629b == null) {
            this.f135628a.edit().putInt(str, i).apply();
        } else {
            putString(str, String.valueOf(i));
        }
    }

    @Override // com.ss.android.lark.sp.AbstractC54924a
    public boolean putLong(String str, long j) {
        if (this.f135629b == null) {
            this.f135628a.edit().putLong(str, j).apply();
            return true;
        }
        putString(str, String.valueOf(j));
        return true;
    }

    @Override // com.ss.android.lark.sp.AbstractC54924a
    public void putString(String str, String str2) {
        this.f135628a.edit().putString(m212992a(str), m212993b(str2)).apply();
    }
}
