package androidx.media;

import android.media.session.MediaSessionManager;
import androidx.core.util.C0843d;
import androidx.media.C1230e;

/* renamed from: androidx.media.g */
class C1234g extends C1233f {

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.media.g$a */
    public static final class C1235a implements C1230e.AbstractC1232b {

        /* renamed from: a */
        final MediaSessionManager.RemoteUserInfo f4454a;

        public int hashCode() {
            return C0843d.m3986a(this.f4454a);
        }

        C1235a(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            this.f4454a = remoteUserInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1235a)) {
                return false;
            }
            return this.f4454a.equals(((C1235a) obj).f4454a);
        }

        C1235a(String str, int i, int i2) {
            this.f4454a = new MediaSessionManager.RemoteUserInfo(str, i, i2);
        }
    }
}
