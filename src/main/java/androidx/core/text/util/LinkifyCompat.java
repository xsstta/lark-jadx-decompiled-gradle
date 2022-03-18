package androidx.core.text.util;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Comparator;

public final class LinkifyCompat {

    /* renamed from: a */
    private static final String[] f3311a = new String[0];

    /* renamed from: b */
    private static final Comparator<C0837a> f3312b = new Comparator<C0837a>() {
        /* class androidx.core.text.util.LinkifyCompat.C08361 */

        /* renamed from: a */
        public int compare(C0837a aVar, C0837a aVar2) {
            if (aVar.f3313a < aVar2.f3313a) {
                return -1;
            }
            if (aVar.f3313a > aVar2.f3313a || aVar.f3314b < aVar2.f3314b) {
                return 1;
            }
            if (aVar.f3314b > aVar2.f3314b) {
                return -1;
            }
            return 0;
        }
    };

    @Retention(RetentionPolicy.SOURCE)
    public @interface LinkifyMask {
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.core.text.util.LinkifyCompat$a */
    public static class C0837a {

        /* renamed from: a */
        int f3313a;

        /* renamed from: b */
        int f3314b;

        C0837a() {
        }
    }
}
