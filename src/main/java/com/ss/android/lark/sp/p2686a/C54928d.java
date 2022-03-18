package com.ss.android.lark.sp.p2686a;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ss.android.lark.p2909v.AbstractC57895b;
import com.ss.android.lark.p2909v.C57898e;
import com.ss.android.lark.sp.AbstractC54924a;
import com.tencent.mmkv.MMKV;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.sp.a.d */
class C54928d implements AbstractC54924a {

    /* renamed from: a */
    private MMKV f135630a;

    /* renamed from: b */
    private AbstractC57895b f135631b;

    @Override // com.ss.android.lark.sp.AbstractC54924a
    public void cleanSharedPreference() {
        MMKV mmkv = this.f135630a;
        if (mmkv != null) {
            mmkv.clear();
        }
    }

    @Override // com.ss.android.lark.sp.AbstractC54924a
    public Map<String, ?> getAll() {
        MMKV mmkv = this.f135630a;
        if (mmkv == null) {
            return null;
        }
        return mmkv.getAll();
    }

    public C54928d(MMKV mmkv) {
        this.f135630a = mmkv;
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
    private String m212998a(String str) {
        if (this.f135631b == null) {
            return str;
        }
        return C57898e.m224704c(str);
    }

    /* renamed from: b */
    private String m212999b(String str) {
        AbstractC57895b bVar = this.f135631b;
        if (bVar == null) {
            return str;
        }
        return bVar.mo196232a(str);
    }

    /* renamed from: c */
    private String m213000c(String str) {
        AbstractC57895b bVar = this.f135631b;
        if (bVar == null) {
            return str;
        }
        return bVar.mo196233b(str);
    }

    @Override // com.ss.android.lark.sp.AbstractC54924a
    public void commit(boolean z) {
        MMKV mmkv = this.f135630a;
        if (mmkv == null) {
            return;
        }
        if (z) {
            mmkv.apply();
        } else {
            mmkv.commit();
        }
    }

    @Override // com.ss.android.lark.sp.AbstractC54924a
    public boolean contains(String str) {
        MMKV mmkv = this.f135630a;
        if (mmkv == null) {
            return false;
        }
        return mmkv.contains(m212998a(str));
    }

    @Override // com.ss.android.lark.sp.AbstractC54924a
    public boolean remove(String str) {
        MMKV mmkv = this.f135630a;
        if (mmkv == null) {
            return false;
        }
        mmkv.remove(m212998a(str));
        return true;
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

    public C54928d(MMKV mmkv, AbstractC57895b bVar) {
        this(mmkv);
        this.f135631b = bVar;
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
    public void putString(String str, String str2) {
        this.f135630a.putString(m212998a(str), m212999b(str2));
    }

    @Override // com.ss.android.lark.sp.AbstractC54924a
    public boolean getBoolean(String str, boolean z) {
        if (this.f135631b == null) {
            return this.f135630a.getBoolean(str, z);
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
        if (this.f135631b == null) {
            return this.f135630a.getFloat(str, f);
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
        if (this.f135631b == null) {
            return this.f135630a.getInt(str, i);
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
        if (this.f135631b == null) {
            return this.f135630a.getLong(str, j);
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
        String string = this.f135630a.getString(m212998a(str), "");
        if (TextUtils.isEmpty(string)) {
            return str2;
        }
        return m213000c(string);
    }

    @Override // com.ss.android.lark.sp.AbstractC54924a
    public void putBoolean(String str, boolean z) {
        if (this.f135631b == null) {
            this.f135630a.putBoolean(str, z);
        } else {
            putString(str, String.valueOf(z));
        }
    }

    @Override // com.ss.android.lark.sp.AbstractC54924a
    public void putFloat(String str, float f) {
        if (this.f135631b == null) {
            this.f135630a.putFloat(str, f);
        } else {
            putString(str, String.valueOf(f));
        }
    }

    @Override // com.ss.android.lark.sp.AbstractC54924a
    public void putInt(String str, int i) {
        if (this.f135631b == null) {
            this.f135630a.putInt(str, i);
        } else {
            putString(str, String.valueOf(i));
        }
    }

    @Override // com.ss.android.lark.sp.AbstractC54924a
    public boolean putLong(String str, long j) {
        if (this.f135631b == null) {
            this.f135630a.putLong(str, j);
            return true;
        }
        putString(str, String.valueOf(j));
        return true;
    }
}
