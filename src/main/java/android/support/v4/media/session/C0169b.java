package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.os.ResultReceiver;

/* access modifiers changed from: package-private */
/* renamed from: android.support.v4.media.session.b */
public class C0169b {

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v4.media.session.b$a */
    public interface AbstractC0170a {
        /* renamed from: a */
        void mo451a();

        /* renamed from: a */
        void mo452a(long j);

        /* renamed from: a */
        void mo453a(Object obj);

        /* renamed from: a */
        void mo454a(String str, Bundle bundle);

        /* renamed from: a */
        void mo455a(String str, Bundle bundle, ResultReceiver resultReceiver);

        /* renamed from: a */
        boolean mo456a(Intent intent);

        /* renamed from: b */
        void mo457b();

        /* renamed from: b */
        void mo458b(long j);

        /* renamed from: b */
        void mo459b(String str, Bundle bundle);

        /* renamed from: c */
        void mo460c();

        /* renamed from: c */
        void mo461c(String str, Bundle bundle);

        /* renamed from: d */
        void mo462d();

        /* renamed from: e */
        void mo463e();

        /* renamed from: f */
        void mo464f();

        /* renamed from: g */
        void mo465g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v4.media.session.b$b */
    public static class C0171b<T extends AbstractC0170a> extends MediaSession.Callback {

        /* renamed from: a */
        protected final T f394a;

        public void onFastForward() {
            this.f394a.mo463e();
        }

        public void onPause() {
            this.f394a.mo457b();
        }

        public void onPlay() {
            this.f394a.mo451a();
        }

        public void onRewind() {
            this.f394a.mo464f();
        }

        public void onSkipToNext() {
            this.f394a.mo460c();
        }

        public void onSkipToPrevious() {
            this.f394a.mo462d();
        }

        public void onStop() {
            this.f394a.mo465g();
        }

        public C0171b(T t) {
            this.f394a = t;
        }

        public void onSeekTo(long j) {
            this.f394a.mo458b(j);
        }

        public void onSetRating(Rating rating) {
            this.f394a.mo453a(rating);
        }

        public void onSkipToQueueItem(long j) {
            this.f394a.mo452a(j);
        }

        public boolean onMediaButtonEvent(Intent intent) {
            if (this.f394a.mo456a(intent) || super.onMediaButtonEvent(intent)) {
                return true;
            }
            return false;
        }

        public void onCustomAction(String str, Bundle bundle) {
            MediaSessionCompat.m360a(bundle);
            this.f394a.mo461c(str, bundle);
        }

        public void onPlayFromMediaId(String str, Bundle bundle) {
            MediaSessionCompat.m360a(bundle);
            this.f394a.mo454a(str, bundle);
        }

        public void onPlayFromSearch(String str, Bundle bundle) {
            MediaSessionCompat.m360a(bundle);
            this.f394a.mo459b(str, bundle);
        }

        public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
            MediaSessionCompat.m360a(bundle);
            this.f394a.mo455a(str, bundle, resultReceiver);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v4.media.session.b$c */
    public static class C0172c {
        /* renamed from: a */
        public static Object m556a(Object obj) {
            return ((MediaSession.QueueItem) obj).getDescription();
        }

        /* renamed from: b */
        public static long m557b(Object obj) {
            return ((MediaSession.QueueItem) obj).getQueueId();
        }
    }

    /* renamed from: b */
    public static Parcelable m539b(Object obj) {
        return ((MediaSession) obj).getSessionToken();
    }

    /* renamed from: a */
    public static Object m532a(AbstractC0170a aVar) {
        return new C0171b(aVar);
    }

    /* renamed from: a */
    public static Object m533a(Object obj) {
        if (obj instanceof MediaSession.Token) {
            return obj;
        }
        throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
    }

    /* renamed from: a */
    public static Object m531a(Context context, String str) {
        return new MediaSession(context, str);
    }

    /* renamed from: b */
    public static void m540b(Object obj, Object obj2) {
        ((MediaSession) obj).setMetadata((MediaMetadata) obj2);
    }

    /* renamed from: a */
    public static void m534a(Object obj, int i) {
        ((MediaSession) obj).setFlags(i);
    }

    /* renamed from: a */
    public static void m535a(Object obj, PendingIntent pendingIntent) {
        ((MediaSession) obj).setMediaButtonReceiver(pendingIntent);
    }

    /* renamed from: a */
    public static void m536a(Object obj, Object obj2) {
        ((MediaSession) obj).setPlaybackState((PlaybackState) obj2);
    }

    /* renamed from: a */
    public static void m538a(Object obj, boolean z) {
        ((MediaSession) obj).setActive(z);
    }

    /* renamed from: a */
    public static void m537a(Object obj, Object obj2, Handler handler) {
        ((MediaSession) obj).setCallback((MediaSession.Callback) obj2, handler);
    }
}
