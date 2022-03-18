package androidx.media;

import android.media.session.MediaSessionManager;
import android.os.Build;
import android.util.Log;
import androidx.media.C1234g;
import androidx.media.C1236h;

/* renamed from: androidx.media.e */
public final class C1230e {

    /* renamed from: a */
    static final boolean f4451a = Log.isLoggable("MediaSessionManager", 3);

    /* renamed from: b */
    private static final Object f4452b = new Object();

    /* renamed from: androidx.media.e$b */
    interface AbstractC1232b {
    }

    /* renamed from: androidx.media.e$a */
    public static final class C1231a {

        /* renamed from: a */
        AbstractC1232b f4453a;

        public int hashCode() {
            return this.f4453a.hashCode();
        }

        public C1231a(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            this.f4453a = new C1234g.C1235a(remoteUserInfo);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1231a)) {
                return false;
            }
            return this.f4453a.equals(((C1231a) obj).f4453a);
        }

        public C1231a(String str, int i, int i2) {
            if (Build.VERSION.SDK_INT >= 28) {
                this.f4453a = new C1234g.C1235a(str, i, i2);
            } else {
                this.f4453a = new C1236h.C1237a(str, i, i2);
            }
        }
    }
}
