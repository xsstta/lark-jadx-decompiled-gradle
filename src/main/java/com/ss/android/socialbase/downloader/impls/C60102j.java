package com.ss.android.socialbase.downloader.impls;

import com.ss.android.socialbase.downloader.downloader.AbstractC60067q;

/* renamed from: com.ss.android.socialbase.downloader.impls.j */
public class C60102j implements AbstractC60067q {
    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60067q
    /* renamed from: a */
    public long mo204838a(int i, int i2) {
        if (i == 1) {
            return 3000;
        }
        if (i == 2) {
            return 15000;
        }
        if (i == 3) {
            return 30000;
        }
        return i > 3 ? 300000 : 0;
    }
}
