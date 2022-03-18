package com.bytedance.apm.util;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Pair;
import com.bytedance.apm6.util.C3356f;
import com.bytedance.apm6.util.p195b.C3350b;
import com.huawei.hms.actions.SearchIntents;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MultiProcessSharedPreferences extends ContentProvider implements SharedPreferences {

    /* renamed from: a */
    public static String f10001a = ".apm6";

    /* renamed from: e */
    private static String f10002e = "apm_config";

    /* renamed from: b */
    public Application f10003b;

    /* renamed from: c */
    public String f10004c;

    /* renamed from: d */
    public Uri f10005d;

    /* renamed from: f */
    private ContentResolver f10006f;

    public int delete(Uri uri, String str, String[] strArr) {
        return -1;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }

    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return -1;
    }

    /* renamed from: com.bytedance.apm.util.MultiProcessSharedPreferences$a */
    private class SharedPreferences$EditorC3109a implements SharedPreferences.Editor {

        /* renamed from: b */
        private boolean f10008b;

        /* renamed from: c */
        private HashMap<String, Object> f10009c;

        public boolean commit() {
            apply();
            return true;
        }

        public SharedPreferences.Editor clear() {
            this.f10009c.clear();
            this.f10008b = true;
            return this;
        }

        public void apply() {
            if (this.f10008b || !this.f10009c.isEmpty()) {
                Bundle bundle = new Bundle();
                if (this.f10008b) {
                    bundle.putBoolean("clear", true);
                }
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.f10009c.size());
                for (Map.Entry<String, Object> entry : this.f10009c.entrySet()) {
                    arrayList.add(new SpPair(entry.getKey(), entry.getValue()));
                }
                bundle.putParcelableArrayList("edit", arrayList);
                try {
                    MultiProcessSharedPreferences.this.f10003b.getContentResolver().call(MultiProcessSharedPreferences.this.f10005d, MultiProcessSharedPreferences.this.f10004c, "edit", bundle);
                } catch (Exception e) {
                    C3350b.m13935b("MultiProcessSharedPref", "apply exception: ", e);
                }
            }
        }

        public SharedPreferences.Editor remove(String str) {
            this.f10009c.put(str, null);
            return this;
        }

        private SharedPreferences$EditorC3109a() {
            this.f10009c = new HashMap<>();
        }

        public SharedPreferences.Editor putString(String str, String str2) {
            this.f10009c.put(str, str2);
            return this;
        }

        public SharedPreferences.Editor putBoolean(String str, boolean z) {
            this.f10009c.put(str, Boolean.valueOf(z));
            return this;
        }

        public SharedPreferences.Editor putFloat(String str, float f) {
            this.f10009c.put(str, Float.valueOf(f));
            return this;
        }

        public SharedPreferences.Editor putInt(String str, int i) {
            this.f10009c.put(str, Integer.valueOf(i));
            return this;
        }

        public SharedPreferences.Editor putLong(String str, long j) {
            this.f10009c.put(str, Long.valueOf(j));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            this.f10009c.put(str, C3356f.m13965a(set));
            return this;
        }
    }

    public SharedPreferences.Editor edit() {
        return new SharedPreferences$EditorC3109a();
    }

    public boolean onCreate() {
        this.f10006f = getContext().getContentResolver();
        return false;
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        ArrayList<SpPair> a = m12929a((String) null, (Object) null);
        if (a == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator<SpPair> it = a.iterator();
        while (it.hasNext()) {
            SpPair next = it.next();
            hashMap.put(next.f10010a, next.f10011b);
        }
        return hashMap;
    }

    public boolean contains(String str) {
        String str2;
        if (this.f10005d == null) {
            return false;
        }
        Bundle bundle = null;
        try {
            ContentResolver contentResolver = this.f10003b.getContentResolver();
            Uri uri = this.f10005d;
            if (str != null) {
                str2 = this.f10004c + "/" + str;
            } else {
                str2 = this.f10004c;
            }
            bundle = contentResolver.call(uri, str2, "contains", (Bundle) null);
        } catch (Throwable th) {
            C3350b.m13935b("APM-AsyncTask", "contains", th);
        }
        if (bundle == null || !bundle.getBoolean("contains")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private synchronized Pair<SharedPreferences, String> m12928a(Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String str = null;
        if (pathSegments == null || pathSegments.size() < 2 || !"sp".equals(pathSegments.get(0))) {
            return null;
        }
        SharedPreferences sharedPreferences = getContext().getSharedPreferences(pathSegments.get(1), 0);
        if (pathSegments.size() > 2) {
            str = pathSegments.get(2);
        }
        return new Pair<>(sharedPreferences, str);
    }

    /* renamed from: a */
    private Bundle m12926a(SharedPreferences sharedPreferences, String str) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("contains", sharedPreferences.contains(str));
        return bundle;
    }

    public String getString(String str, String str2) {
        ArrayList<SpPair> a = m12929a(str, str2);
        if (a == null) {
            return null;
        }
        return (String) a.get(0).f10011b;
    }

    /* renamed from: a */
    private void m12931a(SharedPreferences sharedPreferences, Bundle bundle) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (bundle.getBoolean("clear")) {
            edit.clear();
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("edit");
        if (parcelableArrayList != null) {
            Iterator it = parcelableArrayList.iterator();
            while (it.hasNext()) {
                SpPair spPair = (SpPair) it.next();
                if (spPair.f10011b == null) {
                    edit.remove(spPair.f10010a);
                } else {
                    m12930a(edit, spPair.f10010a, spPair.f10011b);
                }
            }
            edit.commit();
        }
    }

    public boolean getBoolean(String str, boolean z) {
        ArrayList<SpPair> a = m12929a(str, String.valueOf(z));
        if (a == null) {
            return z;
        }
        Object obj = a.get(0).f10011b;
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof String) {
            return Boolean.valueOf((String) obj).booleanValue();
        }
        return z;
    }

    public float getFloat(String str, float f) {
        ArrayList<SpPair> a = m12929a(str, String.valueOf(f));
        if (a == null) {
            return f;
        }
        Object obj = a.get(0).f10011b;
        if (obj instanceof Float) {
            return ((Float) obj).floatValue();
        }
        if (obj instanceof String) {
            return Float.valueOf((String) obj).floatValue();
        }
        return f;
    }

    public int getInt(String str, int i) {
        ArrayList<SpPair> a = m12929a(str, String.valueOf(i));
        if (a == null) {
            return i;
        }
        Object obj = a.get(0).f10011b;
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof String) {
            return Integer.decode((String) obj).intValue();
        }
        return i;
    }

    public long getLong(String str, long j) {
        ArrayList<SpPair> a = m12929a(str, String.valueOf(j));
        if (a == null) {
            return j;
        }
        Object obj = a.get(0).f10011b;
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
        ArrayList<SpPair> a = m12929a(str, set);
        if (a == null || a.get(0).f10011b == null) {
            return null;
        }
        String[] strArr = (String[]) a.get(0).f10011b;
        HashSet hashSet = new HashSet(strArr.length);
        hashSet.addAll(Arrays.asList(strArr));
        return hashSet;
    }

    /* renamed from: a */
    private ArrayList<SpPair> m12929a(String str, Object obj) {
        Bundle bundle;
        String str2;
        Bundle bundle2 = new Bundle();
        if (obj != null) {
            bundle2.putParcelable("sp", new SpPair(str, obj));
        }
        try {
            ContentResolver contentResolver = this.f10003b.getContentResolver();
            Uri uri = this.f10005d;
            if (str != null) {
                str2 = this.f10004c + "/" + str;
            } else {
                str2 = this.f10004c;
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

    /* renamed from: a */
    private Bundle m12927a(SharedPreferences sharedPreferences, String str, Object obj) {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        if (str == null) {
            for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                arrayList.add(new SpPair(entry.getKey(), entry.getValue()));
            }
            bundle.putParcelableArrayList("sp", arrayList);
        } else {
            Object obj2 = sharedPreferences.getAll().get(str);
            if (obj2 != null) {
                obj = obj2;
            }
            if (obj instanceof Set) {
                obj = C3356f.m13965a((Set) obj);
            }
            arrayList.add(new SpPair(str, obj));
            bundle.putParcelableArrayList("sp", arrayList);
        }
        return bundle;
    }

    public Bundle call(String str, String str2, Bundle bundle) {
        SpPair spPair;
        if (bundle != null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        Pair<SharedPreferences, String> a = m12928a(Uri.parse(str));
        Object obj = null;
        if (a == null) {
            return null;
        }
        if (SearchIntents.EXTRA_QUERY.equals(str2)) {
            if (!(bundle == null || (spPair = (SpPair) bundle.getParcelable("sp")) == null)) {
                obj = spPair.f10011b;
            }
            return m12927a((SharedPreferences) a.first, (String) a.second, obj);
        } else if ("contains".equals(str2)) {
            return m12926a((SharedPreferences) a.first, (String) a.second);
        } else {
            if ("edit".equals(str2) && bundle != null) {
                try {
                    m12931a((SharedPreferences) a.first, bundle);
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    this.f10006f.notifyChange(Uri.parse(str), null);
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                } catch (Throwable th) {
                    C3350b.m13935b("MultiProcessSharedPref", "edit", th);
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    private static void m12930a(SharedPreferences.Editor editor, String str, Object obj) {
        if (obj instanceof String) {
            editor.putString(str, (String) obj);
        } else if (obj instanceof Integer) {
            editor.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Long) {
            editor.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof Float) {
            editor.putFloat(str, ((Float) obj).floatValue());
        } else if (obj instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof String[]) {
            editor.putStringSet(str, new HashSet(Arrays.asList((String[]) obj)));
        }
    }
}
