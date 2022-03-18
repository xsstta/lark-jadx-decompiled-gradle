package com.bytedance.apm.battery.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.apm.C2785b;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.bytedance.apm.battery.dao.a */
public abstract class AbstractC2827a<T> {

    /* renamed from: a */
    private final Context f9038a;

    /* renamed from: b */
    private final String f9039b;

    /* renamed from: c */
    private Uri f9040c;

    /* renamed from: d */
    private final HashMap<String, Integer> f9041d = new HashMap<>();

    /* renamed from: com.bytedance.apm.battery.dao.a$a */
    public interface AbstractC2829a<T> {
        /* renamed from: a */
        T mo12203a(C2830b bVar);
    }

    /* renamed from: a */
    public String mo12198a() {
        return "apm_monitor_t1.db";
    }

    /* renamed from: b */
    public abstract String mo12200b();

    /* renamed from: c */
    public abstract String[] mo12201c();

    protected AbstractC2827a() {
        Context a = C2785b.m11735a();
        this.f9038a = a;
        this.f9039b = a.getPackageName() + ".apm";
    }

    /* renamed from: d */
    public Uri mo12202d() {
        if (this.f9040c == null) {
            this.f9040c = Uri.parse("content://" + this.f9039b + "/" + mo12198a() + "/" + mo12200b());
        }
        return this.f9040c;
    }

    /* renamed from: com.bytedance.apm.battery.dao.a$b */
    public static class C2830b {

        /* renamed from: a */
        Cursor f9042a;

        /* renamed from: b */
        private final HashMap<String, Integer> f9043b;

        /* renamed from: a */
        public long mo12204a(String str) {
            try {
                return this.f9042a.getLong(m11973d(str));
            } catch (Throwable unused) {
                return -1;
            }
        }

        /* renamed from: b */
        public int mo12205b(String str) {
            try {
                return this.f9042a.getInt(m11973d(str));
            } catch (Throwable unused) {
                return -1;
            }
        }

        /* renamed from: c */
        public String mo12206c(String str) {
            try {
                return this.f9042a.getString(m11973d(str));
            } catch (Throwable unused) {
                return "";
            }
        }

        /* renamed from: d */
        private int m11973d(String str) {
            Integer num = this.f9043b.get(str);
            if (num == null) {
                try {
                    num = Integer.valueOf(this.f9042a.getColumnIndex(str));
                } catch (Throwable unused) {
                    num = -1;
                }
                this.f9043b.put(str, num);
            }
            return num.intValue();
        }

        private C2830b(Cursor cursor, HashMap<String, Integer> hashMap) {
            this.f9042a = cursor;
            this.f9043b = hashMap;
        }
    }

    /* renamed from: a */
    private static void m11964a(Cursor cursor) {
        if (cursor != null) {
            try {
                if (!cursor.isClosed()) {
                    cursor.close();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x002d, code lost:
        return -1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized <I extends T> long mo12197a(android.content.ContentValues r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = -1
            if (r5 != 0) goto L_0x0007
            monitor-exit(r4)
            return r0
        L_0x0007:
            android.content.Context r2 = com.bytedance.apm.C2785b.m11735a()     // Catch:{ Exception -> 0x002c, all -> 0x0029 }
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ Exception -> 0x002c, all -> 0x0029 }
            android.net.Uri r3 = r4.mo12202d()     // Catch:{ Exception -> 0x002c, all -> 0x0029 }
            android.net.Uri r5 = r2.insert(r3, r5)     // Catch:{ Exception -> 0x002c, all -> 0x0029 }
            if (r5 != 0) goto L_0x001b
            monitor-exit(r4)
            return r0
        L_0x001b:
            java.lang.String r5 = r5.getLastPathSegment()     // Catch:{ Exception -> 0x0025, all -> 0x0029 }
            long r0 = java.lang.Long.parseLong(r5)     // Catch:{ Exception -> 0x0025, all -> 0x0029 }
            monitor-exit(r4)
            return r0
        L_0x0025:
            r0 = 1
            monitor-exit(r4)
            return r0
        L_0x0029:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        L_0x002c:
            monitor-exit(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.battery.dao.AbstractC2827a.mo12197a(android.content.ContentValues):long");
    }

    /* renamed from: a */
    public int mo12196a(ContentValues contentValues, String str, String[] strArr) {
        if (contentValues == null) {
            return -1;
        }
        try {
            return C2785b.m11735a().getContentResolver().update(mo12202d(), contentValues, str, strArr);
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public List<T> mo12199a(String str, String[] strArr, String str2, AbstractC2829a<T> aVar) {
        int indexOf;
        Cursor cursor = null;
        try {
            Cursor query = this.f9038a.getContentResolver().query(mo12202d(), mo12201c(), str, strArr, str2);
            if (query != null) {
                try {
                    if (query.getCount() > 0) {
                        int i = Integer.MAX_VALUE;
                        if (!TextUtils.isEmpty(str2) && (indexOf = str2.indexOf("LIMIT")) > 0) {
                            int indexOf2 = str2.indexOf("OFF");
                            i = indexOf2 > 0 ? Integer.valueOf(str2.substring(indexOf + 5, indexOf2).trim()).intValue() : Integer.valueOf(str2.substring(indexOf + 5).trim()).intValue();
                        }
                        LinkedList linkedList = new LinkedList();
                        int i2 = 0;
                        while (query.moveToNext() && i2 < i) {
                            linkedList.add(aVar.mo12203a(new C2830b(query, this.f9041d)));
                            i2++;
                        }
                        m11964a(query);
                        return linkedList;
                    }
                } catch (Throwable unused) {
                    cursor = query;
                    m11964a(cursor);
                    return Collections.emptyList();
                }
            }
            List<T> emptyList = Collections.emptyList();
            m11964a(query);
            return emptyList;
        } catch (Throwable unused2) {
            m11964a(cursor);
            return Collections.emptyList();
        }
    }
}
