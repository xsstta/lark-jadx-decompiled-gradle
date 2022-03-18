package android.support.v4.media.session;

import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompatApi23;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;

/* access modifiers changed from: package-private */
public class MediaSessionCompatApi24 {

    public interface Callback extends MediaSessionCompatApi23.Callback {
        /* renamed from: b */
        void mo467b(Uri uri, Bundle bundle);

        /* renamed from: d */
        void mo468d(String str, Bundle bundle);

        /* renamed from: e */
        void mo469e(String str, Bundle bundle);

        /* renamed from: h */
        void mo470h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v4.media.session.MediaSessionCompatApi24$a */
    public static class C0160a<T extends Callback> extends MediaSessionCompatApi23.C0159a<T> {
        public void onPrepare() {
            ((Callback) this.f394a).mo470h();
        }

        public C0160a(T t) {
            super(t);
        }

        public void onPrepareFromMediaId(String str, Bundle bundle) {
            MediaSessionCompat.m360a(bundle);
            ((Callback) this.f394a).mo468d(str, bundle);
        }

        public void onPrepareFromSearch(String str, Bundle bundle) {
            MediaSessionCompat.m360a(bundle);
            ((Callback) this.f394a).mo469e(str, bundle);
        }

        public void onPrepareFromUri(Uri uri, Bundle bundle) {
            MediaSessionCompat.m360a(bundle);
            ((Callback) this.f394a).mo467b(uri, bundle);
        }
    }

    /* renamed from: a */
    public static Object m490a(Callback callback) {
        return new C0160a(callback);
    }

    /* renamed from: a */
    public static String m491a(Object obj) {
        MediaSession mediaSession = (MediaSession) obj;
        try {
            return (String) mediaSession.getClass().getMethod("getCallingPackage", new Class[0]).invoke(mediaSession, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            Log.e("MediaSessionCompatApi24", "Cannot execute MediaSession.getCallingPackage()", e);
            return null;
        }
    }
}
