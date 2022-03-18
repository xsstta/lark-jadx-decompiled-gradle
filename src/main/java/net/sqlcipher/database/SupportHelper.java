package net.sqlcipher.database;

import androidx.p038g.p039a.AbstractC1082b;
import androidx.p038g.p039a.AbstractC1083c;

public class SupportHelper implements AbstractC1083c {
    private final boolean clearPassphrase;
    private byte[] passphrase;
    private SQLiteOpenHelper standardHelper;

    public void close() {
        this.standardHelper.close();
    }

    public String getDatabaseName() {
        return this.standardHelper.getDatabaseName();
    }

    public AbstractC1082b getReadableDatabase() {
        return getWritableDatabase();
    }

    @Override // androidx.p038g.p039a.AbstractC1083c
    public AbstractC1082b getWritableDatabase() {
        try {
            SQLiteDatabase writableDatabase = this.standardHelper.getWritableDatabase(this.passphrase);
            if (this.clearPassphrase && this.passphrase != null) {
                int i = 0;
                while (true) {
                    byte[] bArr = this.passphrase;
                    if (i >= bArr.length) {
                        break;
                    }
                    bArr[i] = 0;
                    i++;
                }
            }
            return writableDatabase;
        } catch (SQLiteException e) {
            byte[] bArr2 = this.passphrase;
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
                    throw new IllegalStateException("The passphrase appears to be cleared. This happens bydefault the first time you use the factory to open a database, so we can remove thecleartext passphrase from memory. If you close the database yourself, please use afresh SupportFactory to reopen it. If something else (e.g., Room) closed thedatabase, and you cannot control that, use SupportFactory boolean constructor option to opt out of the automatic password clearing step. See the project README for more information.", e);
                }
            }
            throw e;
        }
    }

    @Override // androidx.p038g.p039a.AbstractC1083c
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.standardHelper.setWriteAheadLoggingEnabled(z);
    }

    SupportHelper(final AbstractC1083c.C1085b bVar, byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z) {
        SQLiteDatabase.loadLibs(bVar.f4070a);
        this.passphrase = bArr;
        this.clearPassphrase = z;
        this.standardHelper = new SQLiteOpenHelper(bVar.f4070a, bVar.f4071b, null, bVar.f4072c.f4069a, sQLiteDatabaseHook) {
            /* class net.sqlcipher.database.SupportHelper.C696421 */

            @Override // net.sqlcipher.database.SQLiteOpenHelper
            public void onConfigure(SQLiteDatabase sQLiteDatabase) {
                bVar.f4072c.mo5735a(sQLiteDatabase);
            }

            @Override // net.sqlcipher.database.SQLiteOpenHelper
            public void onCreate(SQLiteDatabase sQLiteDatabase) {
                bVar.f4072c.mo5737b(sQLiteDatabase);
            }

            @Override // net.sqlcipher.database.SQLiteOpenHelper
            public void onOpen(SQLiteDatabase sQLiteDatabase) {
                bVar.f4072c.mo5739c(sQLiteDatabase);
            }

            @Override // net.sqlcipher.database.SQLiteOpenHelper
            public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
                bVar.f4072c.mo5738b(sQLiteDatabase, i, i2);
            }

            @Override // net.sqlcipher.database.SQLiteOpenHelper
            public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
                bVar.f4072c.mo5736a(sQLiteDatabase, i, i2);
            }
        };
    }
}
