package com.bytedance.ee.bear.drive.biz.importfile;

import android.text.TextUtils;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.drive.biz.importfile.b */
public class C6475b {
    /* renamed from: a */
    public static boolean m26017a(int i) {
        return i == 101 || i == 102 || i == 103;
    }

    /* renamed from: b */
    public static int m26018b(int i) {
        switch (i) {
            case 101:
                return C8275a.f22371d.mo32555b();
            case 102:
                return C8275a.f22372e.mo32555b();
            case 103:
                return C8275a.f22374g.mo32555b();
            default:
                return C8275a.f22369b.mo32555b();
        }
    }

    /* renamed from: a */
    public static int m26016a(String str) {
        C13479a.m54764b("DriveImportTypeUtil", "canImport starting...");
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        if (str.endsWith(".doc") || str.endsWith(".docx")) {
            return 101;
        }
        if (str.endsWith(".xls") || str.endsWith(".xlsx") || str.endsWith(".csv")) {
            return 102;
        }
        if (str.endsWith(".xmind") || str.endsWith(".opml") || str.endsWith(".mm")) {
            return 103;
        }
        return 0;
    }
}
