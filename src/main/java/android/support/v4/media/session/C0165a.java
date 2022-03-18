package android.support.v4.media.session;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.view.KeyEvent;
import java.util.List;

/* renamed from: android.support.v4.media.session.a */
class C0165a {

    /* renamed from: android.support.v4.media.session.a$a */
    public interface AbstractC0166a {
        /* renamed from: a */
        void mo347a();

        /* renamed from: a */
        void mo348a(int i, int i2, int i3, int i4, int i5);

        /* renamed from: a */
        void mo349a(Bundle bundle);

        /* renamed from: a */
        void mo350a(CharSequence charSequence);

        /* renamed from: a */
        void mo351a(Object obj);

        /* renamed from: a */
        void mo352a(String str, Bundle bundle);

        /* renamed from: a */
        void mo353a(List<?> list);

        /* renamed from: b */
        void mo354b(Object obj);
    }

    /* renamed from: android.support.v4.media.session.a$b */
    static class C0167b<T extends AbstractC0166a> extends MediaController.Callback {

        /* renamed from: a */
        protected final T f393a;

        public void onSessionDestroyed() {
            this.f393a.mo347a();
        }

        public C0167b(T t) {
            this.f393a = t;
        }

        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            this.f393a.mo354b(mediaMetadata);
        }

        public void onPlaybackStateChanged(PlaybackState playbackState) {
            this.f393a.mo351a(playbackState);
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueChanged(List<MediaSession.QueueItem> list) {
            this.f393a.mo353a(list);
        }

        public void onQueueTitleChanged(CharSequence charSequence) {
            this.f393a.mo350a(charSequence);
        }

        public void onExtrasChanged(Bundle bundle) {
            MediaSessionCompat.m360a(bundle);
            this.f393a.mo349a(bundle);
        }

        public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
            this.f393a.mo348a(playbackInfo.getPlaybackType(), C0168c.m530b(playbackInfo), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
        }

        public void onSessionEvent(String str, Bundle bundle) {
            MediaSessionCompat.m360a(bundle);
            this.f393a.mo352a(str, bundle);
        }
    }

    /* renamed from: android.support.v4.media.session.a$c */
    public static class C0168c {
        /* renamed from: a */
        public static AudioAttributes m529a(Object obj) {
            return ((MediaController.PlaybackInfo) obj).getAudioAttributes();
        }

        /* renamed from: b */
        public static int m530b(Object obj) {
            return m528a(m529a(obj));
        }

        /* renamed from: a */
        private static int m528a(AudioAttributes audioAttributes) {
            if ((audioAttributes.getFlags() & 1) == 1) {
                return 7;
            }
            if ((audioAttributes.getFlags() & 4) == 4) {
                return 6;
            }
            int usage = audioAttributes.getUsage();
            if (usage == 13) {
                return 1;
            }
            switch (usage) {
                case 2:
                    return 0;
                case 3:
                    return 8;
                case 4:
                    return 4;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    return 5;
                case 6:
                    return 2;
                default:
                    return 3;
            }
        }
    }

    /* renamed from: a */
    public static Object m516a(AbstractC0166a aVar) {
        return new C0167b(aVar);
    }

    /* renamed from: a */
    public static Object m517a(Object obj) {
        return ((MediaController) obj).getPlaybackState();
    }

    /* renamed from: a */
    public static Object m515a(Context context, Object obj) {
        return new MediaController(context, (MediaSession.Token) obj);
    }

    /* renamed from: a */
    public static boolean m519a(Object obj, KeyEvent keyEvent) {
        return ((MediaController) obj).dispatchMediaButtonEvent(keyEvent);
    }

    /* renamed from: a */
    public static void m518a(Object obj, String str, Bundle bundle, ResultReceiver resultReceiver) {
        ((MediaController) obj).sendCommand(str, bundle, resultReceiver);
    }
}
