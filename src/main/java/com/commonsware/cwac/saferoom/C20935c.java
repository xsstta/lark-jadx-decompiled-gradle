package com.commonsware.cwac.saferoom;

import android.content.Context;
import androidx.p038g.p039a.AbstractC1082b;
import androidx.p038g.p039a.AbstractC1083c;
import com.commonsware.cwac.saferoom.C20940e;
import net.sqlcipher.DatabaseErrorHandler;
import net.sqlcipher.database.SQLiteDatabase;
import net.sqlcipher.database.SQLiteDatabaseHook;
import net.sqlcipher.database.SQLiteException;
import net.sqlcipher.database.SQLiteOpenHelper;

/* access modifiers changed from: package-private */
/* renamed from: com.commonsware.cwac.saferoom.c */
public class C20935c implements AbstractC1083c {

    /* renamed from: a */
    private final C20936a f51263a;

    /* renamed from: b */
    private final byte[] f51264b;

    /* renamed from: c */
    private final boolean f51265c;

    /* access modifiers changed from: package-private */
    /* renamed from: com.commonsware.cwac.saferoom.c$a */
    public static class C20936a extends SQLiteOpenHelper {

        /* renamed from: a */
        private final C20933b[] f51266a;

        /* renamed from: b */
        private volatile AbstractC1083c.AbstractC1084a f51267b;

        /* renamed from: c */
        private volatile boolean f51268c;

        @Override // net.sqlcipher.database.SQLiteOpenHelper
        public synchronized void close() {
            super.close();
            this.f51266a[0] = null;
        }

        @Override // net.sqlcipher.database.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f51267b.mo5735a(mo70780a(sQLiteDatabase));
        }

        @Override // net.sqlcipher.database.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.f51267b.mo5737b(mo70780a(sQLiteDatabase));
        }

        @Override // net.sqlcipher.database.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (!this.f51268c) {
                this.f51267b.mo5739c(mo70780a(sQLiteDatabase));
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public synchronized AbstractC1082b mo70779a(byte[] bArr) {
            this.f51268c = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase(bArr);
            if (this.f51268c) {
                close();
                return mo70779a(bArr);
            }
            return mo70780a(writableDatabase);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public synchronized C20933b mo70780a(SQLiteDatabase sQLiteDatabase) {
            if (this.f51266a[0] == null) {
                this.f51266a[0] = new C20933b(sQLiteDatabase);
            }
            return this.f51266a[0];
        }

        @Override // net.sqlcipher.database.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.f51268c = true;
            this.f51267b.mo5738b(mo70780a(sQLiteDatabase), i, i2);
        }

        @Override // net.sqlcipher.database.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.f51268c = true;
            this.f51267b.mo5736a(mo70780a(sQLiteDatabase), i, i2);
        }

        C20936a(Context context, String str, final C20933b[] bVarArr, final AbstractC1083c.AbstractC1084a aVar, final C20940e.C20942a aVar2) {
            super(context, str, null, aVar.f4069a, new SQLiteDatabaseHook() {
                /* class com.commonsware.cwac.saferoom.C20935c.C20936a.C209371 */

                @Override // net.sqlcipher.database.SQLiteDatabaseHook
                public void postKey(SQLiteDatabase sQLiteDatabase) {
                    C20940e.C20942a aVar = C20940e.C20942a.this;
                    if (aVar != null && aVar.f51276b != null) {
                        sQLiteDatabase.rawExecSQL(C20940e.C20942a.this.f51276b);
                    }
                }

                @Override // net.sqlcipher.database.SQLiteDatabaseHook
                public void preKey(SQLiteDatabase sQLiteDatabase) {
                    C20940e.C20942a aVar = C20940e.C20942a.this;
                    if (aVar != null && aVar.f51275a != null) {
                        sQLiteDatabase.rawExecSQL(C20940e.C20942a.this.f51275a);
                    }
                }
            }, new DatabaseErrorHandler() {
                /* class com.commonsware.cwac.saferoom.C20935c.C20936a.C209382 */

                @Override // net.sqlcipher.DatabaseErrorHandler
                public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    C20933b bVar = bVarArr[0];
                    if (bVar != null) {
                        aVar.mo5740d(bVar);
                    }
                }
            });
            this.f51266a = bVarArr;
            this.f51267b = aVar;
        }
    }

    @Override // androidx.p038g.p039a.AbstractC1083c
    public synchronized AbstractC1082b getWritableDatabase() {
        AbstractC1082b a;
        try {
            a = this.f51263a.mo70779a(this.f51264b);
            if (this.f51265c && this.f51264b != null) {
                int i = 0;
                while (true) {
                    byte[] bArr = this.f51264b;
                    if (i >= bArr.length) {
                        break;
                    }
                    bArr[i] = 0;
                    i++;
                }
            }
        } catch (SQLiteException e) {
            byte[] bArr2 = this.f51264b;
            if (bArr2 != null) {
                boolean z = true;
                for (byte b : bArr2) {
                    if (!z || b != 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
                if (z) {
                    throw new IllegalStateException("The passphrase appears to be cleared. This happens bydefault the first time you use the factory to open a database, so we can remove thecleartext passphrase from memory. If you close the database yourself, please use afresh SafeHelperFactory to reopen it. If something else (e.g., Room) closed thedatabase, and you cannot control that, use SafeHelperFactory.Options to opt out ofthe automatic password clearing step. See the project README for more information.");
                }
            }
            throw e;
        }
        return a;
    }

    @Override // androidx.p038g.p039a.AbstractC1083c
    public synchronized void setWriteAheadLoggingEnabled(boolean z) {
        this.f51263a.setWriteAheadLoggingEnabled(z);
    }

    /* renamed from: a */
    private C20936a m76293a(Context context, String str, AbstractC1083c.AbstractC1084a aVar, C20940e.C20942a aVar2) {
        return new C20936a(context, str, new C20933b[1], aVar, aVar2);
    }

    C20935c(Context context, String str, AbstractC1083c.AbstractC1084a aVar, byte[] bArr, C20940e.C20942a aVar2) {
        SQLiteDatabase.loadLibs(context);
        this.f51265c = aVar2.f51277c;
        this.f51263a = m76293a(context, str, aVar, aVar2);
        this.f51264b = bArr;
    }
}
