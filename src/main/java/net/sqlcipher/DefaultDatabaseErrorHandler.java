package net.sqlcipher;

import android.util.Log;
import java.io.File;
import net.sqlcipher.database.SQLiteDatabase;

public final class DefaultDatabaseErrorHandler implements DatabaseErrorHandler {
    private final String TAG = getClass().getSimpleName();

    @Override // net.sqlcipher.DatabaseErrorHandler
    public void onCorruption(SQLiteDatabase sQLiteDatabase) {
        String str = this.TAG;
        Log.e(str, "Corruption reported by sqlite on database, deleting: " + sQLiteDatabase.getPath());
        if (sQLiteDatabase.isOpen()) {
            Log.e(this.TAG, "Database object for corrupted database is already open, closing");
            try {
                sQLiteDatabase.close();
            } catch (Exception e) {
                Log.e(this.TAG, "Exception closing Database object for corrupted database, ignored", e);
            }
        }
        deleteDatabaseFile(sQLiteDatabase.getPath());
    }

    private void deleteDatabaseFile(String str) {
        if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
            String str2 = this.TAG;
            Log.e(str2, "deleting the database file: " + str);
            try {
                new File(str).delete();
            } catch (Exception e) {
                String str3 = this.TAG;
                Log.w(str3, "delete failed: " + e.getMessage());
            }
        }
    }
}
