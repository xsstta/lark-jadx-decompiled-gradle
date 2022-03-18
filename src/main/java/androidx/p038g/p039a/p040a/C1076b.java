package androidx.p038g.p039a.p040a;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.p038g.p039a.AbstractC1082b;
import androidx.p038g.p039a.AbstractC1083c;

/* renamed from: androidx.g.a.a.b */
class C1076b implements AbstractC1083c {

    /* renamed from: a */
    private final C1077a f4061a;

    @Override // androidx.p038g.p039a.AbstractC1083c
    public AbstractC1082b getWritableDatabase() {
        return this.f4061a.mo5718a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.g.a.a.b$a */
    public static class C1077a extends SQLiteOpenHelper {

        /* renamed from: a */
        final C1074a[] f4062a;

        /* renamed from: b */
        final AbstractC1083c.AbstractC1084a f4063b;

        /* renamed from: c */
        private boolean f4064c;

        @Override // java.lang.AutoCloseable
        public synchronized void close() {
            super.close();
            this.f4062a[0] = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public synchronized AbstractC1082b mo5718a() {
            this.f4064c = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (this.f4064c) {
                close();
                return mo5718a();
            }
            return mo5717a(writableDatabase);
        }

        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f4063b.mo5735a(mo5717a(sQLiteDatabase));
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.f4063b.mo5737b(mo5717a(sQLiteDatabase));
        }

        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (!this.f4064c) {
                this.f4063b.mo5739c(mo5717a(sQLiteDatabase));
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C1074a mo5717a(SQLiteDatabase sQLiteDatabase) {
            if (this.f4062a[0] == null) {
                this.f4062a[0] = new C1074a(sQLiteDatabase);
            }
            return this.f4062a[0];
        }

        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.f4064c = true;
            this.f4063b.mo5738b(mo5717a(sQLiteDatabase), i, i2);
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.f4064c = true;
            this.f4063b.mo5736a(mo5717a(sQLiteDatabase), i, i2);
        }

        C1077a(Context context, String str, final C1074a[] aVarArr, final AbstractC1083c.AbstractC1084a aVar) {
            super(context, str, null, aVar.f4069a, new DatabaseErrorHandler() {
                /* class androidx.p038g.p039a.p040a.C1076b.C1077a.C10781 */

                public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    C1074a aVar = aVarArr[0];
                    if (aVar != null) {
                        aVar.mo5740d(aVar);
                    }
                }
            });
            this.f4063b = aVar;
            this.f4062a = aVarArr;
        }
    }

    @Override // androidx.p038g.p039a.AbstractC1083c
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.f4061a.setWriteAheadLoggingEnabled(z);
    }

    C1076b(Context context, String str, AbstractC1083c.AbstractC1084a aVar) {
        this.f4061a = m5181a(context, str, aVar);
    }

    /* renamed from: a */
    private C1077a m5181a(Context context, String str, AbstractC1083c.AbstractC1084a aVar) {
        return new C1077a(context, str, new C1074a[1], aVar);
    }
}
