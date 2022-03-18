package com.huawei.updatesdk.p1029a.p1030a.p1035c.p1037i;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.huawei.updatesdk.p1029a.p1030a.p1032b.p1033a.p1034a.C23834a;
import com.huawei.updatesdk.p1029a.p1030a.p1035c.p1037i.p1038c.C23851b;

/* renamed from: com.huawei.updatesdk.a.a.c.i.a */
public class C23846a {

    /* renamed from: a */
    private static final Uri f59056a = Uri.parse("content://telephony/carriers/preferapn");

    /* renamed from: b */
    private static final Uri f59057b = Uri.parse("content://telephony/carriers/preferapn/0");

    /* renamed from: c */
    private static final Uri f59058c = Uri.parse("content://telephony/carriers/preferapn/1");

    /* renamed from: com.huawei.updatesdk.a.a.c.i.a$a */
    public static class C23847a {

        /* renamed from: a */
        private String f59059a;

        /* renamed from: b */
        private String f59060b;

        /* renamed from: a */
        public String mo85576a() {
            return this.f59060b;
        }

        /* renamed from: a */
        public void mo85577a(String str) {
            this.f59060b = str;
        }

        /* renamed from: b */
        public String mo85578b() {
            return this.f59059a;
        }

        /* renamed from: b */
        public void mo85579b(String str) {
            this.f59059a = str;
        }

        /* renamed from: c */
        public void mo85580c(String str) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0055, code lost:
        if (r5 != null) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0069, code lost:
        if (r5 != null) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006b, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0072, code lost:
        if (r1.mo85578b() != null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        return r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0086  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.huawei.updatesdk.p1029a.p1030a.p1035c.p1037i.C23846a.C23847a m87176a(android.content.Context r5) throws java.lang.SecurityException {
        /*
        // Method dump skipped, instructions count: 138
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.updatesdk.p1029a.p1030a.p1035c.p1037i.C23846a.m87176a(android.content.Context):com.huawei.updatesdk.a.a.c.i.a$a");
    }

    /* renamed from: b */
    private static Cursor m87177b(Context context) {
        return context.getContentResolver().query(f59057b, null, null, null, null);
    }

    /* renamed from: c */
    private static Cursor m87178c(Context context) {
        Cursor cursor;
        if (C23851b.m87199a().mo85581a() == 0) {
            cursor = m87177b(context);
            if (cursor == null) {
                cursor = m87179d(context);
            }
        } else {
            cursor = m87179d(context);
            if (cursor == null) {
                cursor = m87177b(context);
            }
        }
        return cursor == null ? m87180e(context) : cursor;
    }

    /* renamed from: d */
    private static Cursor m87179d(Context context) {
        return context.getContentResolver().query(f59058c, null, null, null, null);
    }

    /* renamed from: e */
    private static Cursor m87180e(Context context) {
        return context.getContentResolver().query(f59056a, null, null, null, null);
    }

    /* renamed from: f */
    public static boolean m87181f(Context context) {
        try {
            C23847a a = m87176a(context);
            if (a != null) {
                return a.mo85576a() != null && a.mo85576a().contains("wap");
            }
            return true;
        } catch (SecurityException e) {
            C23834a.m87117a("ApnUtil", "isWap(), SecurityException: ", e);
            return false;
        }
    }
}
