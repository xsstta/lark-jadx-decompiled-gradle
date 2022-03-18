package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import java.util.List;

/* renamed from: android.support.v4.media.a */
class C0118a {

    /* renamed from: android.support.v4.media.a$a */
    interface AbstractC0119a {
        /* renamed from: a */
        void mo173a();

        /* renamed from: b */
        void mo174b();

        /* renamed from: c */
        void mo175c();
    }

    /* renamed from: android.support.v4.media.a$d */
    interface AbstractC0122d {
        /* renamed from: a */
        void mo212a(String str);

        /* renamed from: a */
        void mo213a(String str, List<?> list);
    }

    /* renamed from: android.support.v4.media.a$b */
    static class C0120b<T extends AbstractC0119a> extends MediaBrowser.ConnectionCallback {

        /* renamed from: a */
        protected final T f264a;

        public void onConnected() {
            this.f264a.mo173a();
        }

        public void onConnectionFailed() {
            this.f264a.mo175c();
        }

        public void onConnectionSuspended() {
            this.f264a.mo174b();
        }

        public C0120b(T t) {
            this.f264a = t;
        }
    }

    /* renamed from: android.support.v4.media.a$c */
    static class C0121c {
        /* renamed from: a */
        public static int m298a(Object obj) {
            return ((MediaBrowser.MediaItem) obj).getFlags();
        }

        /* renamed from: b */
        public static Object m299b(Object obj) {
            return ((MediaBrowser.MediaItem) obj).getDescription();
        }
    }

    /* renamed from: android.support.v4.media.a$e */
    static class C0123e<T extends AbstractC0122d> extends MediaBrowser.SubscriptionCallback {

        /* renamed from: a */
        protected final T f265a;

        public C0123e(T t) {
            this.f265a = t;
        }

        public void onError(String str) {
            this.f265a.mo212a(str);
        }

        @Override // android.media.browse.MediaBrowser.SubscriptionCallback
        public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list) {
            this.f265a.mo213a(str, list);
        }
    }

    /* renamed from: b */
    public static void m292b(Object obj) {
        ((MediaBrowser) obj).disconnect();
    }

    /* renamed from: c */
    public static Bundle m293c(Object obj) {
        return ((MediaBrowser) obj).getExtras();
    }

    /* renamed from: d */
    public static Object m294d(Object obj) {
        return ((MediaBrowser) obj).getSessionToken();
    }

    /* renamed from: a */
    public static Object m289a(AbstractC0119a aVar) {
        return new C0120b(aVar);
    }

    /* renamed from: a */
    public static Object m290a(AbstractC0122d dVar) {
        return new C0123e(dVar);
    }

    /* renamed from: a */
    public static void m291a(Object obj) {
        ((MediaBrowser) obj).connect();
    }

    /* renamed from: a */
    public static Object m288a(Context context, ComponentName componentName, Object obj, Bundle bundle) {
        return new MediaBrowser(context, componentName, (MediaBrowser.ConnectionCallback) obj, bundle);
    }
}
