package com.bytedance.push.settings.storage;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.push.settings.AbstractC20511a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.push.settings.storage.d */
final class C20528d implements AbstractC20537i {

    /* renamed from: a */
    private final Context f50085a;

    /* renamed from: b */
    private final String f50086b;

    /* renamed from: c */
    private Map<AbstractC20511a, ContentObserver> f50087c = new ConcurrentHashMap();

    @Override // com.bytedance.push.settings.storage.AbstractC20537i
    /* renamed from: a */
    public String mo69123a(String str) {
        return mo69124a(str, (String) null);
    }

    @Override // com.bytedance.push.settings.storage.AbstractC20537i
    /* renamed from: a */
    public String mo69124a(String str, String str2) {
        try {
            return m74750a(this.f50085a.getContentResolver().query(m74749a(this.f50085a, this.f50086b, str, str2, "string"), null, null, null, null), str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    @Override // com.bytedance.push.settings.storage.AbstractC20537i
    /* renamed from: a */
    public long mo69122a(String str, long j) {
        try {
            return m74747a(this.f50085a.getContentResolver().query(m74749a(this.f50085a, this.f50086b, str, String.valueOf(j), "long"), null, null, null, null), j);
        } catch (Throwable unused) {
            return j;
        }
    }

    @Override // com.bytedance.push.settings.storage.AbstractC20537i
    /* renamed from: a */
    public boolean mo69127a(String str, boolean z) {
        try {
            return m74752a(this.f50085a.getContentResolver().query(m74749a(this.f50085a, this.f50086b, str, String.valueOf(z), "boolean"), null, null, null, null), z);
        } catch (Throwable unused) {
            return z;
        }
    }

    @Override // com.bytedance.push.settings.storage.AbstractC20537i
    /* renamed from: a */
    public void mo69125a(Context context, String str, String str2, final AbstractC20511a aVar) {
        Uri b;
        if (aVar != null && (b = PushProvider.m74734b(context, this.f50086b, str, str2)) != null) {
            C205302 r5 = new ContentObserver(new Handler(Looper.getMainLooper())) {
                /* class com.bytedance.push.settings.storage.C20528d.C205302 */

                public void onChange(boolean z, Uri uri) {
                    super.onChange(z, uri);
                    aVar.mo68839a();
                }
            };
            context.getContentResolver().registerContentObserver(b, true, r5);
            this.f50087c.put(aVar, r5);
        }
    }

    @Override // com.bytedance.push.settings.storage.AbstractC20537i
    /* renamed from: a */
    public void mo69126a(AbstractC20511a aVar) {
        ContentObserver remove;
        if (aVar != null && (remove = this.f50087c.remove(aVar)) != null) {
            this.f50085a.getContentResolver().unregisterContentObserver(remove);
        }
    }

    /* renamed from: com.bytedance.push.settings.storage.d$a */
    private static final class SharedPreferences$EditorC20531a implements SharedPreferences.Editor {

        /* renamed from: a */
        private final AbstractC20538j f50091a;

        /* renamed from: b */
        private final String f50092b;

        /* renamed from: c */
        private Context f50093c;

        /* renamed from: d */
        private ContentValues f50094d = new ContentValues();

        public boolean commit() {
            return false;
        }

        /* renamed from: a */
        public SharedPreferences$EditorC20531a clear() {
            throw new UnsupportedOperationException("不支持clear");
        }

        public synchronized void apply() {
            try {
                this.f50093c.getContentResolver().insert(this.f50091a.mo69133a(this.f50093c, new C20525b(this.f50092b, "key", "val", ShareHitPoint.f121869d)), this.f50094d);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            return;
        }

        /* renamed from: a */
        public SharedPreferences$EditorC20531a remove(String str) {
            this.f50094d.putNull(str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            throw new UnsupportedOperationException("不支持putStringSet");
        }

        /* renamed from: a */
        public SharedPreferences$EditorC20531a putFloat(String str, float f) {
            this.f50094d.put(str, Float.valueOf(f));
            return this;
        }

        /* renamed from: a */
        public SharedPreferences$EditorC20531a putInt(String str, int i) {
            this.f50094d.put(str, Integer.valueOf(i));
            return this;
        }

        /* renamed from: a */
        public SharedPreferences$EditorC20531a putLong(String str, long j) {
            this.f50094d.put(str, Long.valueOf(j));
            return this;
        }

        /* renamed from: a */
        public SharedPreferences$EditorC20531a putString(String str, String str2) {
            this.f50094d.put(str, str2);
            return this;
        }

        /* renamed from: a */
        public SharedPreferences$EditorC20531a putBoolean(String str, boolean z) {
            this.f50094d.put(str, Boolean.valueOf(z));
            return this;
        }

        SharedPreferences$EditorC20531a(Context context, String str, AbstractC20538j jVar) {
            this.f50093c = context.getApplicationContext();
            this.f50091a = jVar;
            this.f50092b = str;
        }
    }

    @Override // com.bytedance.push.settings.storage.AbstractC20537i
    /* renamed from: b */
    public SharedPreferences.Editor mo69109b() {
        return new SharedPreferences$EditorC20531a(this.f50085a, this.f50086b, new AbstractC20538j() {
            /* class com.bytedance.push.settings.storage.C20528d.C205291 */

            @Override // com.bytedance.push.settings.storage.AbstractC20538j
            /* renamed from: a */
            public Uri mo69133a(Context context, C20525b bVar) {
                return C20528d.m74748a(context, bVar);
            }
        });
    }

    /* renamed from: a */
    private static void m74751a(Cursor cursor) {
        if (cursor != null) {
            try {
                cursor.close();
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.push.settings.storage.AbstractC20537i
    /* renamed from: b */
    public int mo69128b(String str) {
        return mo69121a(str, 0);
    }

    @Override // com.bytedance.push.settings.storage.AbstractC20537i
    /* renamed from: c */
    public long mo69129c(String str) {
        return mo69122a(str, 0L);
    }

    @Override // com.bytedance.push.settings.storage.AbstractC20537i
    /* renamed from: d */
    public float mo69130d(String str) {
        return mo69120a(str, BitmapDescriptorFactory.HUE_RED);
    }

    @Override // com.bytedance.push.settings.storage.AbstractC20537i
    /* renamed from: e */
    public boolean mo69131e(String str) {
        return mo69127a(str, false);
    }

    @Override // com.bytedance.push.settings.storage.AbstractC20537i
    /* renamed from: f */
    public boolean mo69132f(String str) {
        try {
            return C20524a.m74737a(this.f50085a.getContentResolver().call(m74748a(this.f50085a, (C20525b) null), "_contains", (String) null, C20524a.m74736a(this.f50086b, str)));
        } catch (Throwable unused) {
            return false;
        }
    }

    C20528d(Context context, String str) {
        this.f50085a = context;
        this.f50086b = str;
    }

    /* renamed from: a */
    public static synchronized Uri m74748a(Context context, C20525b bVar) {
        Uri a;
        synchronized (C20528d.class) {
            a = PushProvider.m74729a(context, bVar);
        }
        return a;
    }

    /* renamed from: a */
    private static float m74745a(Cursor cursor, float f) {
        if (cursor == null) {
            return f;
        }
        try {
            if (cursor.moveToFirst()) {
                f = cursor.getFloat(0);
            }
        } catch (Throwable unused) {
        }
        m74751a(cursor);
        return f;
    }

    /* renamed from: a */
    private static int m74746a(Cursor cursor, int i) {
        if (cursor == null) {
            return i;
        }
        try {
            if (cursor.moveToFirst()) {
                i = cursor.getInt(0);
            }
        } catch (Throwable unused) {
        }
        m74751a(cursor);
        return i;
    }

    /* renamed from: a */
    private static long m74747a(Cursor cursor, long j) {
        if (cursor == null) {
            return j;
        }
        try {
            if (cursor.moveToFirst()) {
                j = cursor.getLong(0);
            }
        } catch (Throwable unused) {
        }
        m74751a(cursor);
        return j;
    }

    /* renamed from: a */
    private static String m74750a(Cursor cursor, String str) {
        if (cursor == null) {
            return str;
        }
        try {
            if (cursor.moveToFirst()) {
                str = cursor.getString(0);
            }
        } catch (Throwable unused) {
        }
        m74751a(cursor);
        return str;
    }

    /* renamed from: a */
    private static boolean m74752a(Cursor cursor, boolean z) {
        if (cursor == null) {
            return z;
        }
        try {
            if (cursor.moveToFirst()) {
                boolean z2 = false;
                if (cursor.getInt(0) > 0) {
                    z2 = true;
                }
                z = z2;
            }
        } catch (Throwable th) {
            m74751a(cursor);
            throw th;
        }
        m74751a(cursor);
        return z;
    }

    @Override // com.bytedance.push.settings.storage.AbstractC20537i
    /* renamed from: a */
    public float mo69120a(String str, float f) {
        try {
            return m74745a(this.f50085a.getContentResolver().query(m74749a(this.f50085a, this.f50086b, str, String.valueOf(f), "float"), null, null, null, null), f);
        } catch (Throwable unused) {
            return f;
        }
    }

    @Override // com.bytedance.push.settings.storage.AbstractC20537i
    /* renamed from: a */
    public int mo69121a(String str, int i) {
        try {
            return m74746a(this.f50085a.getContentResolver().query(m74749a(this.f50085a, this.f50086b, str, String.valueOf(i), "integer"), null, null, null, null), i);
        } catch (Throwable unused) {
            return i;
        }
    }

    /* renamed from: a */
    private Uri m74749a(Context context, String str, String str2, String str3, String str4) {
        return m74748a(context, new C20525b(str, str2, str3, str4));
    }
}
