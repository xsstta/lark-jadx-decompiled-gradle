package com.bytedance.ee.bear.document.offline.p315b;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.document.offline.b.a */
public class C5892a {

    /* renamed from: a */
    public static int f16489a = -2;

    /* renamed from: b */
    private final int f16490b = ((Integer) C4211a.m17514a().mo16533a("drive_rust_cover_size", (Object) 1280)).intValue();

    /* renamed from: a */
    public boolean mo23805a(String str, int i, int i2) {
        C13479a.m54772d("DriveCompressChecker", "checkShouldCompress, driveUrl = " + str);
        Uri parse = Uri.parse(str);
        String queryParameter = parse.getQueryParameter("contentType");
        if (TextUtils.equals(queryParameter, "gif")) {
            C13479a.m54764b("DriveCompressChecker", "shouldn't compress, contentType is " + queryParameter);
            return false;
        }
        String queryParameter2 = parse.getQueryParameter("width");
        String queryParameter3 = parse.getQueryParameter("height");
        if (!TextUtils.isEmpty(queryParameter2) && !TextUtils.isEmpty(queryParameter3)) {
            try {
                return mo23804a(Integer.parseInt(queryParameter2), Integer.parseInt(queryParameter3), i, i2);
            } catch (NumberFormatException e) {
                C13479a.m54759a("DriveCompressChecker", "checkShouldCompress, parse fail", e);
            }
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo23804a(int i, int i2, int i3, int i4) {
        int max = Math.max(i, i2);
        int i5 = this.f16490b;
        if (max <= i5) {
            C13479a.m54764b("DriveCompressChecker", "shouldn't compress, longEdge is " + max);
            return false;
        }
        float f = (((float) i5) * 1.0f) / ((float) max);
        int i6 = (int) (((float) i) * f);
        int i7 = (int) (((float) i2) * f);
        C13479a.m54772d("DriveCompressChecker", "checkShouldCompress, compressWidth = " + i6 + ", compressHeight = " + i7 + ", ratio = " + f);
        if (i6 >= i3 / 2 && i7 >= i4 / 2) {
            return true;
        }
        C13479a.m54764b("DriveCompressChecker", "shouldn't compress, compressWidth = " + i6 + ", compressHeight = " + i7 + ", targetWidth = " + i3 + ", targetHeight = " + i4);
        return false;
    }
}
