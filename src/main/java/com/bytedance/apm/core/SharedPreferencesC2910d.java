package com.bytedance.apm.core;

import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import com.bytedance.apm.util.C3122i;
import com.huawei.hms.actions.SearchIntents;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.apm.core.d */
public class SharedPreferencesC2910d implements SharedPreferences {

    /* renamed from: d */
    private static int f9403d = -1;

    /* renamed from: a */
    public Application f9404a;

    /* renamed from: b */
    public String f9405b;

    /* renamed from: c */
    public Uri f9406c;

    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }

    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }

    /* renamed from: com.bytedance.apm.core.d$a */
    private class SharedPreferences$EditorC2912a implements SharedPreferences.Editor {

        /* renamed from: b */
        private boolean f9408b;

        /* renamed from: c */
        private HashMap<String, Object> f9409c;

        public boolean commit() {
            apply();
            return true;
        }

        public SharedPreferences.Editor clear() {
            this.f9409c.clear();
            this.f9408b = true;
            return this;
        }

        public void apply() {
            if (this.f9408b || !this.f9409c.isEmpty()) {
                Bundle bundle = new Bundle();
                if (this.f9408b) {
                    bundle.putBoolean("clear", true);
                }
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.f9409c.size());
                for (Map.Entry<String, Object> entry : this.f9409c.entrySet()) {
                    arrayList.add(new SpPair(entry.getKey(), entry.getValue()));
                }
                bundle.putParcelableArrayList("edit", arrayList);
                try {
                    SharedPreferencesC2910d.this.f9404a.getContentResolver().call(SharedPreferencesC2910d.this.f9406c, SharedPreferencesC2910d.this.f9405b, "edit", bundle);
                } catch (Exception unused) {
                }
            }
        }

        public SharedPreferences.Editor remove(String str) {
            this.f9409c.put(str, null);
            return this;
        }

        private SharedPreferences$EditorC2912a() {
            this.f9409c = new HashMap<>();
        }

        public SharedPreferences.Editor putString(String str, String str2) {
            this.f9409c.put(str, str2);
            return this;
        }

        public SharedPreferences.Editor putBoolean(String str, boolean z) {
            this.f9409c.put(str, Boolean.valueOf(z));
            return this;
        }

        public SharedPreferences.Editor putFloat(String str, float f) {
            this.f9409c.put(str, Float.valueOf(f));
            return this;
        }

        public SharedPreferences.Editor putInt(String str, int i) {
            this.f9409c.put(str, Integer.valueOf(i));
            return this;
        }

        public SharedPreferences.Editor putLong(String str, long j) {
            this.f9409c.put(str, Long.valueOf(j));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            this.f9409c.put(str, C3122i.m13010a(set));
            return this;
        }
    }

    public SharedPreferences.Editor edit() {
        return new SharedPreferences$EditorC2912a();
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        ArrayList<SpPair> a = m12320a((String) null, (Object) null);
        if (a == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator<SpPair> it = a.iterator();
        while (it.hasNext()) {
            SpPair next = it.next();
            hashMap.put(next.f9401a, next.f9402b);
        }
        return hashMap;
    }

    /* renamed from: a */
    public static boolean m12321a(Context context) {
        if (f9403d == -1) {
            f9403d = m12322b(context);
        }
        if (f9403d == Process.myPid()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static int m12322b(Context context) {
        try {
            ContentResolver contentResolver = context.getContentResolver();
            Bundle call = contentResolver.call(Uri.parse("content://" + context.getPackageName() + ".apm"), "getPid", (String) null, (Bundle) null);
            if (call != null) {
                return call.getInt("Pid", -1);
            }
        } catch (Exception unused) {
        }
        return -1;
    }

    public boolean contains(String str) {
        String str2;
        Bundle bundle = null;
        try {
            ContentResolver contentResolver = this.f9404a.getContentResolver();
            Uri uri = this.f9406c;
            if (str != null) {
                str2 = this.f9405b + "/" + str;
            } else {
                str2 = this.f9405b;
            }
            bundle = contentResolver.call(uri, str2, "contains", (Bundle) null);
        } catch (Exception unused) {
        }
        if (bundle == null || !bundle.getBoolean("contains")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static SharedPreferences m12319a(Context context, String str) {
        if (m12321a(context)) {
            return context.getSharedPreferences(str, 0);
        }
        return m12323b(context, str);
    }

    /* renamed from: b */
    static SharedPreferences m12323b(Context context, String str) {
        Application application;
        if (context instanceof Application) {
            application = (Application) context;
        } else {
            application = (Application) context.getApplicationContext();
        }
        return new SharedPreferencesC2910d(application, str);
    }

    public String getString(String str, String str2) {
        ArrayList<SpPair> a = m12320a(str, str2);
        if (a == null) {
            return null;
        }
        return (String) a.get(0).f9402b;
    }

    private SharedPreferencesC2910d(Application application, String str) {
        this.f9404a = application;
        String str2 = "content://" + application.getPackageName() + ".apm" + "/sp/" + str;
        this.f9405b = str2;
        this.f9406c = Uri.parse(str2);
    }

    public boolean getBoolean(String str, boolean z) {
        ArrayList<SpPair> a = m12320a(str, String.valueOf(z));
        if (a == null) {
            return z;
        }
        Object obj = a.get(0).f9402b;
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof String) {
            return Boolean.valueOf((String) obj).booleanValue();
        }
        return z;
    }

    public float getFloat(String str, float f) {
        ArrayList<SpPair> a = m12320a(str, String.valueOf(f));
        if (a == null) {
            return f;
        }
        Object obj = a.get(0).f9402b;
        if (obj instanceof Float) {
            return ((Float) obj).floatValue();
        }
        if (obj instanceof String) {
            return Float.valueOf((String) obj).floatValue();
        }
        return f;
    }

    public int getInt(String str, int i) {
        ArrayList<SpPair> a = m12320a(str, String.valueOf(i));
        if (a == null) {
            return i;
        }
        Object obj = a.get(0).f9402b;
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof String) {
            return Integer.decode((String) obj).intValue();
        }
        return i;
    }

    public long getLong(String str, long j) {
        ArrayList<SpPair> a = m12320a(str, String.valueOf(j));
        if (a == null) {
            return j;
        }
        Object obj = a.get(0).f9402b;
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (obj instanceof String) {
            return Long.decode((String) obj).longValue();
        }
        return j;
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) {
        ArrayList<SpPair> a = m12320a(str, set);
        if (a == null || a.get(0).f9402b == null) {
            return null;
        }
        String[] strArr = (String[]) a.get(0).f9402b;
        HashSet hashSet = new HashSet(strArr.length);
        hashSet.addAll(Arrays.asList(strArr));
        return hashSet;
    }

    /* renamed from: a */
    private ArrayList<SpPair> m12320a(String str, Object obj) {
        Bundle bundle;
        String str2;
        Bundle bundle2 = new Bundle();
        if (obj != null) {
            bundle2.putParcelable("sp", new SpPair(str, obj));
        }
        try {
            ContentResolver contentResolver = this.f9404a.getContentResolver();
            Uri uri = this.f9406c;
            if (str != null) {
                str2 = this.f9405b + "/" + str;
            } else {
                str2 = this.f9405b;
            }
            if (obj == null) {
                bundle2 = null;
            }
            bundle = contentResolver.call(uri, str2, SearchIntents.EXTRA_QUERY, bundle2);
        } catch (Exception unused) {
            bundle = null;
        }
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(getClass().getClassLoader());
        return bundle.getParcelableArrayList("sp");
    }
}
