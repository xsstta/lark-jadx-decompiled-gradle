package com.ss.android.socialbase.downloader.impls;

import com.ss.android.socialbase.downloader.downloader.AbstractC60057g;
import com.ss.android.socialbase.downloader.network.NetworkQuality;

/* renamed from: com.ss.android.socialbase.downloader.impls.b */
public class C60088b implements AbstractC60057g {
    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60057g
    /* renamed from: a */
    public int mo204769a(int i, NetworkQuality networkQuality) {
        if (networkQuality.ordinal() <= NetworkQuality.MODERATE.ordinal()) {
            return 1;
        }
        if (networkQuality == NetworkQuality.GOOD) {
            return i - 1;
        }
        return i;
    }
}
