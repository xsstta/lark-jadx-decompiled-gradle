package com.bytedance.ee.util.db;

import androidx.room.RoomDatabase;
import com.bytedance.ee.log.C13479a;
import com.commonsware.cwac.saferoom.C20940e;
import java.util.HashMap;
import net.sqlcipher.SQLException;

/* renamed from: com.bytedance.ee.util.db.a */
public class C13635a {

    /* renamed from: a */
    public static int f35811a = 0;

    /* renamed from: b */
    public static int f35812b = 1;

    /* renamed from: c */
    public static int f35813c = 2;

    /* renamed from: d */
    public static int f35814d = -1;

    /* renamed from: e */
    public static int f35815e = -2;

    /* renamed from: f */
    private static String f35816f = "PRAGMA cipher_compatibility = 3;";

    /* renamed from: g */
    private static String f35817g = "PRAGMA cipher_compatibility = 4;";

    /* renamed from: h */
    private static String f35818h = "PRAGMA cipher_compatibility = 3;PRAGMA cipher_use_hmac = OFF;PRAGMA kdf_iter = 4000;PRAGMA cipher_page_size = 1024;";

    /* renamed from: i */
    private static HashMap<Integer, String> f35819i;

    /* renamed from: a */
    public static int m55342a() {
        return f35811a;
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f35819i = hashMap;
        hashMap.put(Integer.valueOf(f35811a), f35816f);
        f35819i.put(Integer.valueOf(f35812b), f35817g);
        f35819i.put(Integer.valueOf(f35813c), f35818h);
    }

    /* renamed from: a */
    public static int m55343a(SQLException sQLException, int i) {
        if (sQLException == null) {
            return f35815e;
        }
        if (sQLException.getMessage() == null || !sQLException.getMessage().contains("file is not a database")) {
            return f35815e;
        }
        C13479a.m54764b("CipherDBUtils", "tryGetFallBackConfig... detect file is not db error, this is due to the wrong settings of cipher config, current config = " + i);
        int i2 = i + 1;
        if (!f35819i.containsKey(Integer.valueOf(i2))) {
            return f35814d;
        }
        C13479a.m54764b("CipherDBUtils", "tryGetFallBackConfig... ready to fallback with config" + i2);
        return i2;
    }

    /* renamed from: a */
    public static void m55344a(RoomDatabase.C1416a aVar, String str, int i) {
        C13479a.m54764b("CipherDBUtils", "insertAfterKeyingSql... cipherConfig = " + i);
        if (f35819i.containsKey(Integer.valueOf(i))) {
            aVar.mo7554a(new C20940e(str.toCharArray(), C20940e.C20942a.m76298a().mo70793a(false).mo70792a(f35819i.get(Integer.valueOf(i))).mo70794a()));
            return;
        }
        throw new RuntimeException("After keying cipher config is illegal : " + i);
    }
}
