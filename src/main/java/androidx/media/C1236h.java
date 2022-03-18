package androidx.media;

import android.text.TextUtils;
import androidx.core.util.C0843d;
import androidx.media.C1230e;

/* renamed from: androidx.media.h */
class C1236h {

    /* renamed from: a */
    private static final boolean f4455a = C1230e.f4451a;

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.media.h$a */
    public static class C1237a implements C1230e.AbstractC1232b {

        /* renamed from: a */
        private String f4456a;

        /* renamed from: b */
        private int f4457b;

        /* renamed from: c */
        private int f4458c;

        public int hashCode() {
            return C0843d.m3986a(this.f4456a, Integer.valueOf(this.f4457b), Integer.valueOf(this.f4458c));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1237a)) {
                return false;
            }
            C1237a aVar = (C1237a) obj;
            if (TextUtils.equals(this.f4456a, aVar.f4456a) && this.f4457b == aVar.f4457b && this.f4458c == aVar.f4458c) {
                return true;
            }
            return false;
        }

        C1237a(String str, int i, int i2) {
            this.f4456a = str;
            this.f4457b = i;
            this.f4458c = i2;
        }
    }
}
