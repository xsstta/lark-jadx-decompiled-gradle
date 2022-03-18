package android.support.v4.media.session;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.session.C0169b;

/* access modifiers changed from: package-private */
public class MediaSessionCompatApi23 {

    public interface Callback extends C0169b.AbstractC0170a {
        /* renamed from: a */
        void mo466a(Uri uri, Bundle bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v4.media.session.MediaSessionCompatApi23$a */
    public static class C0159a<T extends Callback> extends C0169b.C0171b<T> {
        public C0159a(T t) {
            super(t);
        }

        public void onPlayFromUri(Uri uri, Bundle bundle) {
            MediaSessionCompat.m360a(bundle);
            ((Callback) this.f394a).mo466a(uri, bundle);
        }
    }

    /* renamed from: a */
    public static Object m488a(Callback callback) {
        return new C0159a(callback);
    }
}
