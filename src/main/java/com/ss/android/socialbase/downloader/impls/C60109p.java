package com.ss.android.socialbase.downloader.impls;

import android.text.TextUtils;
import com.ss.android.socialbase.downloader.downloader.AbstractC60067q;

/* renamed from: com.ss.android.socialbase.downloader.impls.p */
public class C60109p implements AbstractC60067q {

    /* renamed from: a */
    private final long[] f149937a;

    public C60109p(String str) {
        this.f149937a = m233529a(str);
    }

    /* renamed from: a */
    private long[] m233529a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            String[] split = str.split(",");
            if (split.length == 0) {
                return null;
            }
            long[] jArr = new long[split.length];
            for (int i = 0; i < split.length; i++) {
                jArr[i] = Long.parseLong(split[i]);
            }
            return jArr;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60067q
    /* renamed from: a */
    public long mo204838a(int i, int i2) {
        long[] jArr = this.f149937a;
        if (jArr == null || jArr.length <= 0) {
            return 0;
        }
        int i3 = i - 1;
        if (i3 < 0) {
            i3 = 0;
        }
        if (i3 > jArr.length - 1) {
            i3 = jArr.length - 1;
        }
        return jArr[i3];
    }
}
