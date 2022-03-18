package android.support.v4.media;

import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.support.v4.media.C0118a;
import android.support.v4.media.session.MediaSessionCompat;
import java.util.List;

/* renamed from: android.support.v4.media.b */
class C0124b {

    /* renamed from: android.support.v4.media.b$a */
    interface AbstractC0125a extends C0118a.AbstractC0122d {
        /* renamed from: a */
        void mo214a(String str, Bundle bundle);

        /* renamed from: a */
        void mo215a(String str, List<?> list, Bundle bundle);
    }

    /* renamed from: android.support.v4.media.b$b */
    static class C0126b<T extends AbstractC0125a> extends C0118a.C0123e<T> {
        C0126b(T t) {
            super(t);
        }

        public void onError(String str, Bundle bundle) {
            MediaSessionCompat.m360a(bundle);
            ((AbstractC0125a) this.f265a).mo214a(str, bundle);
        }

        @Override // android.media.browse.MediaBrowser.SubscriptionCallback
        public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list, Bundle bundle) {
            MediaSessionCompat.m360a(bundle);
            ((AbstractC0125a) this.f265a).mo215a(str, list, bundle);
        }
    }

    /* renamed from: a */
    static Object m302a(AbstractC0125a aVar) {
        return new C0126b(aVar);
    }
}
