package com.bytedance.p234e;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.e.h */
class C4036h {

    /* renamed from: a */
    public JSONObject f12239a = null;

    /* renamed from: b */
    private final ReentrantReadWriteLock f12240b = new ReentrantReadWriteLock();

    /* renamed from: c */
    private int f12241c = 0;

    /* renamed from: d */
    private final int f12242d;

    /* renamed from: e */
    private SharedPreferences f12243e = null;

    /* renamed from: f */
    private final String f12244f;

    /* renamed from: g */
    private Context f12245g = null;

    /* renamed from: a */
    public synchronized boolean mo15798a(Context context) {
        if (this.f12241c == 2) {
            return true;
        }
        this.f12245g = context;
        if (context == null) {
            C4027d.m16728b("Storage", "try to load local. Context is null");
            return false;
        }
        this.f12241c = 1;
        C4027d.m16726a("Storage", "loading local settings, name = " + this.f12244f);
        if ((this.f12242d & 2) > 0) {
            Context context2 = this.f12245g;
            SharedPreferences sharedPreferences = context2.getSharedPreferences("com.bd.vod.ST.settings." + this.f12244f, 0);
            this.f12243e = sharedPreferences;
            if ((this.f12242d & 1) <= 0 || sharedPreferences == null) {
                this.f12240b.writeLock().lock();
                if (this.f12239a == null) {
                    this.f12239a = new JSONObject();
                }
                this.f12240b.writeLock().unlock();
            } else {
                String string = sharedPreferences.getString(m16752c(), "");
                if (!TextUtils.isEmpty(string)) {
                    this.f12240b.writeLock().lock();
                    try {
                        this.f12239a = new JSONObject(string);
                    } catch (JSONException e) {
                        C4027d.m16728b("Storage", e.toString());
                        this.f12241c = 0;
                        return false;
                    } finally {
                        this.f12240b.writeLock().unlock();
                    }
                }
            }
        } else {
            this.f12240b.writeLock().lock();
            if (this.f12239a == null) {
                this.f12239a = new JSONObject();
            }
            this.f12240b.writeLock().unlock();
        }
        this.f12241c = 2;
        C4027d.m16726a("Storage", "load local settings, name = " + this.f12244f);
        return true;
    }

    /* renamed from: c */
    private String m16752c() {
        return this.f12244f + "_whole";
    }

    /* renamed from: a */
    public void mo15794a() {
        SharedPreferences sharedPreferences;
        this.f12240b.writeLock().lock();
        if (this.f12239a != null) {
            this.f12239a = new JSONObject();
        }
        if ((this.f12242d & 2) > 0 && (sharedPreferences = this.f12243e) != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.clear();
            edit.apply();
        }
        this.f12240b.writeLock().unlock();
    }

    /* renamed from: b */
    public JSONObject mo15801b() {
        mo15798a(this.f12245g);
        this.f12240b.readLock().lock();
        JSONObject jSONObject = null;
        try {
            if (this.f12239a != null) {
                jSONObject = new JSONObject(this.f12239a.toString());
            }
        } catch (JSONException e) {
            C4027d.m16728b("Storage", e.toString());
        } catch (Throwable th) {
            this.f12240b.readLock().unlock();
            throw th;
        }
        this.f12240b.readLock().unlock();
        return jSONObject;
    }

    /* renamed from: a */
    public JSONArray mo15793a(String str) {
        JSONArray jSONArray;
        SharedPreferences sharedPreferences;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        mo15798a(this.f12245g);
        if ((this.f12242d & 1) > 0) {
            this.f12240b.readLock().lock();
            JSONObject jSONObject = this.f12239a;
            if (jSONObject == null || jSONObject.isNull(str)) {
                jSONArray = null;
            } else {
                jSONArray = this.f12239a.optJSONArray(str);
            }
            this.f12240b.readLock().unlock();
        } else {
            jSONArray = null;
        }
        if (jSONArray == null && (this.f12242d & 2) > 0 && (sharedPreferences = this.f12243e) != null) {
            String string = sharedPreferences.getString(str, "");
            if (!TextUtils.isEmpty(string)) {
                try {
                    jSONArray = new JSONArray(string);
                    C4027d.m16726a("Storage", "get JSONArray from SP, key= " + str + ", retValue = " + jSONArray);
                } catch (JSONException e) {
                    C4027d.m16728b("Storage", e.toString());
                    return null;
                }
            }
        }
        return jSONArray;
    }

    /* renamed from: b */
    public JSONObject mo15802b(String str) {
        JSONObject jSONObject;
        SharedPreferences sharedPreferences;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        mo15798a(this.f12245g);
        if ((this.f12242d & 1) > 0) {
            this.f12240b.readLock().lock();
            JSONObject jSONObject2 = this.f12239a;
            if (jSONObject2 != null) {
                jSONObject = jSONObject2.optJSONObject(str);
            } else {
                jSONObject = null;
            }
            this.f12240b.readLock().unlock();
        } else {
            jSONObject = null;
        }
        if (jSONObject == null) {
            try {
                if ((this.f12242d & 2) > 0 && (sharedPreferences = this.f12243e) != null) {
                    String string = sharedPreferences.getString(str, "");
                    if (!TextUtils.isEmpty(string)) {
                        jSONObject = new JSONObject(string);
                        C4027d.m16726a("Storage", "get jsonObject from SP, key = " + str + ", retValue = " + jSONObject);
                    }
                }
            } catch (JSONException e) {
                C4027d.m16728b("Storage", e.toString());
                return null;
            }
        }
        return jSONObject;
    }

    public C4036h(String str, int i) {
        this.f12244f = str;
        this.f12242d = i;
    }

    /* renamed from: a */
    public String mo15792a(String str, String str2) {
        SharedPreferences sharedPreferences;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        String str3 = null;
        int i = 0;
        mo15798a(this.f12245g);
        if ((this.f12242d & 1) > 0) {
            this.f12240b.readLock().lock();
            JSONObject jSONObject = this.f12239a;
            if (jSONObject != null && !jSONObject.isNull(str)) {
                str3 = this.f12239a.optString(str);
                i = this.f12239a.length();
            }
            this.f12240b.readLock().unlock();
        }
        if (i != 0 || str3 != null || (this.f12242d & 2) <= 0 || (sharedPreferences = this.f12243e) == null) {
            return str3;
        }
        String string = sharedPreferences.getString(str, str2);
        C4027d.m16726a("Storage", "get string from SP, key = " + str + ", retValue = " + string);
        return string;
    }

    /* renamed from: b */
    public int mo15799b(String str, int i) {
        int i2;
        SharedPreferences sharedPreferences;
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        int i3 = 0;
        mo15798a(this.f12245g);
        if ((this.f12242d & 1) > 0) {
            this.f12240b.readLock().lock();
            JSONObject jSONObject = this.f12239a;
            if (jSONObject == null || jSONObject.isNull(str)) {
                i2 = i;
            } else {
                i2 = this.f12239a.optInt(str);
                i3 = this.f12239a.length();
            }
            this.f12240b.readLock().unlock();
        } else {
            i2 = i;
        }
        if (i3 != 0 || (this.f12242d & 2) <= 0 || i2 != i || (sharedPreferences = this.f12243e) == null) {
            return i2;
        }
        int i4 = sharedPreferences.getInt(str, i);
        C4027d.m16726a("Storage", "get int from SP, key = " + str + ", retValue = " + i4);
        return i4;
    }

    /* renamed from: b */
    public long mo15800b(String str, long j) {
        long j2;
        SharedPreferences sharedPreferences;
        int i;
        long j3;
        if (TextUtils.isEmpty(str)) {
            return j;
        }
        int i2 = 0;
        mo15798a(this.f12245g);
        if ((this.f12242d & 1) > 0) {
            this.f12240b.readLock().lock();
            JSONObject jSONObject = this.f12239a;
            if (jSONObject == null || jSONObject.isNull(str)) {
                j3 = j;
                i = 0;
            } else {
                j3 = this.f12239a.optLong(str);
                i = this.f12239a.length();
            }
            this.f12240b.readLock().unlock();
            i2 = i;
            j2 = j3;
        } else {
            j2 = j;
        }
        if (i2 != 0 || j2 != j || (this.f12242d & 2) <= 0 || (sharedPreferences = this.f12243e) == null) {
            return j2;
        }
        long j4 = sharedPreferences.getLong(str, j);
        C4027d.m16726a("Storage", "get long from SP, key = " + str + ", retValue = " + j4);
        return j4;
    }

    /* renamed from: a */
    public void mo15795a(String str, int i) {
        SharedPreferences sharedPreferences;
        if (!TextUtils.isEmpty(str)) {
            mo15798a(this.f12245g);
            if ((this.f12242d & 1) > 0) {
                this.f12240b.writeLock().lock();
                try {
                    JSONObject jSONObject = this.f12239a;
                    if (jSONObject != null) {
                        jSONObject.put(str, i);
                    }
                } catch (JSONException e) {
                    C4027d.m16728b("Storage", e.toString());
                } catch (Throwable th) {
                    this.f12240b.writeLock().unlock();
                    throw th;
                }
                this.f12240b.writeLock().unlock();
            }
            if ((this.f12242d & 2) > 0 && (sharedPreferences = this.f12243e) != null) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putInt(str, i);
                edit.apply();
            }
        }
    }

    /* renamed from: a */
    public void mo15796a(String str, long j) {
        SharedPreferences sharedPreferences;
        if (!TextUtils.isEmpty(str)) {
            mo15798a(this.f12245g);
            if ((this.f12242d & 1) > 0) {
                this.f12240b.writeLock().lock();
                try {
                    JSONObject jSONObject = this.f12239a;
                    if (jSONObject != null) {
                        jSONObject.put(str, j);
                    }
                } catch (JSONException e) {
                    C4027d.m16728b("Storage", e.toString());
                } catch (Throwable th) {
                    this.f12240b.writeLock().unlock();
                    throw th;
                }
                this.f12240b.writeLock().unlock();
            }
            if ((this.f12242d & 2) > 0 && (sharedPreferences = this.f12243e) != null) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putLong(str, j);
                edit.apply();
            }
        }
    }

    /* renamed from: a */
    public void mo15797a(JSONObject jSONObject, boolean z) {
        SharedPreferences sharedPreferences;
        if (jSONObject != null) {
            mo15798a(this.f12245g);
            this.f12240b.writeLock().lock();
            try {
                if (this.f12239a != null) {
                    if (z) {
                        Iterator<String> keys = jSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            this.f12239a.putOpt(next, jSONObject.opt(next));
                            C4027d.m16726a("Storage", "update json, key = " + next + ", value = " + jSONObject.opt(next));
                        }
                        if ((this.f12242d & 2) > 0 && (sharedPreferences = this.f12243e) != null) {
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            edit.putString(m16752c(), this.f12239a.toString());
                            edit.apply();
                        }
                        this.f12240b.writeLock().unlock();
                    }
                }
                this.f12239a = jSONObject;
                SharedPreferences.Editor edit2 = sharedPreferences.edit();
                edit2.putString(m16752c(), this.f12239a.toString());
                edit2.apply();
            } catch (JSONException e) {
                e.printStackTrace();
                C4027d.m16728b("Storage", e.toString());
            } catch (Throwable th) {
                this.f12240b.writeLock().unlock();
                throw th;
            }
            this.f12240b.writeLock().unlock();
        }
    }
}
