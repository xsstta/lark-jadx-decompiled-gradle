package com.bytedance.ee.bear.account;

import android.database.Cursor;
import com.bytedance.ee.log.C13479a;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.bear.account.h */
public class C4194h {
    /* renamed from: a */
    static void m17396a(Cursor cursor) {
        if (cursor != null) {
            try {
                cursor.close();
            } catch (Exception e) {
                C13479a.m54761a("CursorCloser", e);
            }
        }
    }
}
