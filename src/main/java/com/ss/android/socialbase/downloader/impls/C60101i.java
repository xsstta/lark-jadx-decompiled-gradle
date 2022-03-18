package com.ss.android.socialbase.downloader.impls;

import android.text.TextUtils;
import com.ss.android.socialbase.downloader.downloader.AbstractC60060j;
import com.ss.android.socialbase.downloader.utils.C60161d;

/* renamed from: com.ss.android.socialbase.downloader.impls.i */
public class C60101i implements AbstractC60060j {
    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60060j
    /* renamed from: a */
    public int mo204771a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return 0;
        }
        String d = C60161d.m233809d(String.format("%s_%s", str, str2));
        if (TextUtils.isEmpty(d)) {
            return 0;
        }
        return d.hashCode();
    }
}
