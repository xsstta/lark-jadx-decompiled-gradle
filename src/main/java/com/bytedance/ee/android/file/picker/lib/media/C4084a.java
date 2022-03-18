package com.bytedance.ee.android.file.picker.lib.media;

import android.content.Context;
import com.bytedance.ee.android.file.picker.lib.dependency.C4048c;
import com.bytedance.ee.android.file.picker.lib.utils.FileUtils;
import com.p938d.p939a.C20945a;
import java.io.File;
import java.io.IOException;

/* renamed from: com.bytedance.ee.android.file.picker.lib.media.a */
public class C4084a {

    /* renamed from: a */
    private static volatile C4084a f12395a;

    /* renamed from: b */
    private C20945a f12396b;

    private C4084a(Context context) {
        m17035b(context);
    }

    /* renamed from: a */
    public static C4084a m17034a(Context context) {
        if (f12395a == null) {
            synchronized (C4085b.class) {
                if (f12395a == null) {
                    f12395a = new C4084a(context);
                }
            }
        }
        return f12395a;
    }

    /* renamed from: b */
    private void m17035b(Context context) {
        try {
            this.f12396b = C20945a.m76302a(new File(FileUtils.f12473a.mo16109c(context)), 1, 1, 10485760);
        } catch (IOException e) {
            this.f12396b = null;
            e.printStackTrace();
            C4048c.m16854a("Init disk cache failed");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0097 A[SYNTHETIC, Splitter:B:29:0x0097] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bd A[SYNTHETIC, Splitter:B:38:0x00bd] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ca A[SYNTHETIC, Splitter:B:46:0x00ca] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.bytedance.ee.android.file.picker.lib.media.BaseFileEntry> mo16025a(java.lang.String r6) {
        /*
        // Method dump skipped, instructions count: 212
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.android.file.picker.lib.media.C4084a.mo16025a(java.lang.String):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0094 A[SYNTHETIC, Splitter:B:33:0x0094] */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo16026a(java.lang.String r5, java.util.List<com.bytedance.ee.android.file.picker.lib.media.BaseFileEntry> r6) {
        /*
        // Method dump skipped, instructions count: 158
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.android.file.picker.lib.media.C4084a.mo16026a(java.lang.String, java.util.List):void");
    }
}
