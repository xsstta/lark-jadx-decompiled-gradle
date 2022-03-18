package com.ss.android.socialbase.downloader.impls;

import com.ss.android.socialbase.downloader.downloader.AbstractC60062l;

/* renamed from: com.ss.android.socialbase.downloader.impls.l */
public class C60104l {

    /* renamed from: a */
    private static volatile AbstractC60062l f149922a;

    /* renamed from: b */
    private static volatile AbstractC60062l f149923b;

    /* renamed from: a */
    public static AbstractC60062l m233401a(boolean z) {
        if (z) {
            if (f149923b == null) {
                synchronized (C60104l.class) {
                    if (f149923b == null) {
                        f149923b = new C60106n();
                    }
                }
            }
            return f149923b;
        }
        if (f149922a == null) {
            synchronized (C60104l.class) {
                if (f149922a == null) {
                    f149922a = new C60108o();
                }
            }
        }
        return f149922a;
    }
}
