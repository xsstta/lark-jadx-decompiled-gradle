package ee.android.framework.manis.p3450a;

import android.database.Cursor;

/* renamed from: ee.android.framework.manis.a.a */
public final class C68180a {
    /* renamed from: a */
    public static void m264830a(Cursor cursor) {
        if (cursor != null) {
            try {
                cursor.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
