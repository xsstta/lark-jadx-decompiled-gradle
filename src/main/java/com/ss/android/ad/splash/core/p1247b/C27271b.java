package com.ss.android.ad.splash.core.p1247b;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.ad.splash.core.p1252g.C27316h;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ad.splash.core.b.b */
public class C27271b {

    /* renamed from: b */
    public static final Object f67949b = new Object();

    /* renamed from: a */
    public Context f67950a;

    /* renamed from: c */
    private C27274c f67951c;

    /* renamed from: a */
    public C27274c mo97256a() {
        return this.f67951c;
    }

    /* renamed from: com.ss.android.ad.splash.core.b.b$c */
    public class C27274c {

        /* renamed from: b */
        private volatile SQLiteDatabase f67956b;

        /* renamed from: a */
        private void m99135a() {
            try {
                synchronized (C27271b.f67949b) {
                    if (this.f67956b == null || !this.f67956b.isOpen()) {
                        C27271b bVar = C27271b.this;
                        this.f67956b = new C27272a(bVar.f67950a).getWritableDatabase();
                        this.f67956b.setLockingEnabled(false);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        public C27274c() {
        }

        /* renamed from: a */
        public int mo97269a(String str, String str2, String[] strArr) {
            try {
                m99135a();
                return this.f67956b.delete(str, str2, strArr);
            } catch (Exception e) {
                e.printStackTrace();
                return 0;
            }
        }

        /* renamed from: a */
        public long mo97270a(String str, String str2, ContentValues contentValues) {
            try {
                m99135a();
                return this.f67956b.insert(str, str2, contentValues);
            } catch (Exception e) {
                e.printStackTrace();
                return -1;
            }
        }

        /* renamed from: a */
        public int mo97268a(String str, ContentValues contentValues, String str2, String[] strArr) {
            try {
                m99135a();
                return this.f67956b.update(str, contentValues, str2, strArr);
            } catch (Exception e) {
                e.printStackTrace();
                return 0;
            }
        }

        /* renamed from: a */
        public Cursor mo97271a(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
            try {
                m99135a();
                return this.f67956b.query(str, strArr, str2, strArr2, str3, str4, str5);
            } catch (Throwable th) {
                th.printStackTrace();
                return new C27273b();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.ss.android.ad.splash.core.b.b$a */
    public class C27272a extends SQLiteOpenHelper {

        /* renamed from: a */
        Context f67952a;

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            m99134a(sQLiteDatabase, this.f67952a);
        }

        /* renamed from: a */
        private void m99134a(SQLiteDatabase sQLiteDatabase, Context context) {
            sQLiteDatabase.execSQL(C27316h.m99361b());
        }

        public C27272a(Context context) {
            super(context, "splashsdk.db", (SQLiteDatabase.CursorFactory) null, 1);
            this.f67952a = context;
        }
    }

    /* renamed from: com.ss.android.ad.splash.core.b.b$b */
    public class C27273b extends AbstractCursor {
        public String[] getColumnNames() {
            return new String[0];
        }

        public int getCount() {
            return 0;
        }

        public double getDouble(int i) {
            return 0.0d;
        }

        public float getFloat(int i) {
            return BitmapDescriptorFactory.HUE_RED;
        }

        public int getInt(int i) {
            return 0;
        }

        public long getLong(int i) {
            return 0;
        }

        public short getShort(int i) {
            return 0;
        }

        public String getString(int i) {
            return null;
        }

        public boolean isNull(int i) {
            return true;
        }

        public C27273b() {
        }
    }

    C27271b(Context context) {
        this.f67950a = context.getApplicationContext();
        if (this.f67951c == null) {
            this.f67951c = new C27274c();
        }
    }
}
