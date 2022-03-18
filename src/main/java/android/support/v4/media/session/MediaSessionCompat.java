package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.media.Rating;
import android.media.RemoteControlClient;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.C0169b;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.MediaSessionCompatApi23;
import android.support.v4.media.session.MediaSessionCompatApi24;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.core.app.C0737e;
import androidx.media.C1230e;
import androidx.media.VolumeProviderCompat;
import androidx.media.session.MediaButtonReceiver;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.huawei.hms.maps.model.CameraPosition;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.ttm.player.MediaPlayer;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.log.IVideoEventLogger;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MediaSessionCompat {

    /* renamed from: a */
    static int f287a;

    /* renamed from: b */
    private final AbstractC0152b f288b;

    /* renamed from: c */
    private final MediaControllerCompat f289c;

    /* renamed from: d */
    private final ArrayList<AbstractC0158f> f290d;

    @Retention(RetentionPolicy.SOURCE)
    public @interface SessionFlags {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$b */
    public interface AbstractC0152b {
        /* renamed from: a */
        Token mo367a();

        /* renamed from: a */
        void mo368a(int i);

        /* renamed from: a */
        void mo369a(PendingIntent pendingIntent);

        /* renamed from: a */
        void mo370a(MediaMetadataCompat mediaMetadataCompat);

        /* renamed from: a */
        void mo371a(AbstractC0147a aVar, Handler handler);

        /* renamed from: a */
        void mo372a(PlaybackStateCompat playbackStateCompat);

        /* renamed from: a */
        void mo373a(C1230e.C1231a aVar);

        /* renamed from: a */
        void mo374a(boolean z);

        /* renamed from: b */
        PlaybackStateCompat mo375b();

        /* renamed from: c */
        C1230e.C1231a mo376c();
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$f */
    public interface AbstractC0158f {
        /* renamed from: a */
        void mo473a();
    }

    static class MediaSessionImplApi21 implements AbstractC0152b {

        /* renamed from: a */
        final Object f293a;

        /* renamed from: b */
        final Token f294b;

        /* renamed from: c */
        boolean f295c;

        /* renamed from: d */
        final RemoteCallbackList<IMediaControllerCallback> f296d = new RemoteCallbackList<>();

        /* renamed from: e */
        PlaybackStateCompat f297e;

        /* renamed from: f */
        List<QueueItem> f298f;

        /* renamed from: g */
        MediaMetadataCompat f299g;

        /* renamed from: h */
        int f300h;

        /* renamed from: i */
        boolean f301i;

        /* renamed from: j */
        int f302j;

        /* renamed from: k */
        int f303k;

        @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0152b
        /* renamed from: a */
        public void mo373a(C1230e.C1231a aVar) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0152b
        /* renamed from: c */
        public C1230e.C1231a mo376c() {
            return null;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0152b
        /* renamed from: a */
        public Token mo367a() {
            return this.f294b;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0152b
        /* renamed from: b */
        public PlaybackStateCompat mo375b() {
            return this.f297e;
        }

        class ExtraSession extends IMediaSession.Stub {
            @Override // android.support.v4.media.session.IMediaSession
            public List<QueueItem> getQueue() {
                return null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean isShuffleModeEnabledRemoved() {
                return false;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setShuffleModeEnabledRemoved(boolean z) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void fastForward() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public Bundle getExtras() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public long getFlags() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public PendingIntent getLaunchPendingIntent() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public MediaMetadataCompat getMetadata() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public String getPackageName() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public CharSequence getQueueTitle() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public int getRatingType() {
                return MediaSessionImplApi21.this.f300h;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public int getRepeatMode() {
                return MediaSessionImplApi21.this.f302j;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public int getShuffleMode() {
                return MediaSessionImplApi21.this.f303k;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public String getTag() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public ParcelableVolumeInfo getVolumeAttributes() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean isCaptioningEnabled() {
                return MediaSessionImplApi21.this.f301i;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean isTransportControlEnabled() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void next() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void pause() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void play() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepare() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void previous() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void rewind() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void stop() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public PlaybackStateCompat getPlaybackState() {
                return MediaSessionCompat.m359a(MediaSessionImplApi21.this.f297e, MediaSessionImplApi21.this.f299g);
            }

            ExtraSession() {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void rate(RatingCompat ratingCompat) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void removeQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void removeQueueItemAt(int i) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void seekTo(long j) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean sendMediaButton(KeyEvent keyEvent) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setCaptioningEnabled(boolean z) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setRepeatMode(int i) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setShuffleMode(int i) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void skipToQueueItem(long j) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void unregisterCallbackListener(IMediaControllerCallback iMediaControllerCallback) {
                MediaSessionImplApi21.this.f296d.unregister(iMediaControllerCallback);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void registerCallbackListener(IMediaControllerCallback iMediaControllerCallback) {
                if (!MediaSessionImplApi21.this.f295c) {
                    String d = MediaSessionImplApi21.this.mo377d();
                    if (d == null) {
                        d = "android.media.session.MediaController";
                    }
                    MediaSessionImplApi21.this.f296d.register(iMediaControllerCallback, new C1230e.C1231a(d, getCallingPid(), getCallingUid()));
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void addQueueItemAt(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void playFromMediaId(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void playFromSearch(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void playFromUri(Uri uri, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepareFromMediaId(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepareFromSearch(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepareFromUri(Uri uri, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void rateWithExtras(RatingCompat ratingCompat, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void sendCustomAction(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void adjustVolume(int i, int i2, String str) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void sendCommand(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setVolumeTo(int i, int i2, String str) {
                throw new AssertionError();
            }
        }

        /* renamed from: d */
        public String mo377d() {
            if (Build.VERSION.SDK_INT < 24) {
                return null;
            }
            return MediaSessionCompatApi24.m491a(this.f293a);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0152b
        /* renamed from: a */
        public void mo368a(int i) {
            C0169b.m534a(this.f293a, i);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0152b
        /* renamed from: a */
        public void mo369a(PendingIntent pendingIntent) {
            C0169b.m535a(this.f293a, pendingIntent);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0152b
        /* renamed from: a */
        public void mo370a(MediaMetadataCompat mediaMetadataCompat) {
            Object obj;
            this.f299g = mediaMetadataCompat;
            Object obj2 = this.f293a;
            if (mediaMetadataCompat == null) {
                obj = null;
            } else {
                obj = mediaMetadataCompat.mo237b();
            }
            C0169b.m540b(obj2, obj);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0152b
        /* renamed from: a */
        public void mo372a(PlaybackStateCompat playbackStateCompat) {
            Object obj;
            this.f297e = playbackStateCompat;
            for (int beginBroadcast = this.f296d.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f296d.getBroadcastItem(beginBroadcast).onPlaybackStateChanged(playbackStateCompat);
                } catch (RemoteException unused) {
                }
            }
            this.f296d.finishBroadcast();
            Object obj2 = this.f293a;
            if (playbackStateCompat == null) {
                obj = null;
            } else {
                obj = playbackStateCompat.mo491f();
            }
            C0169b.m536a(obj2, obj);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0152b
        /* renamed from: a */
        public void mo374a(boolean z) {
            C0169b.m538a(this.f293a, z);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0152b
        /* renamed from: a */
        public void mo371a(AbstractC0147a aVar, Handler handler) {
            Object obj;
            Object obj2 = this.f293a;
            if (aVar == null) {
                obj = null;
            } else {
                obj = aVar.f350b;
            }
            C0169b.m537a(obj2, obj, handler);
            if (aVar != null) {
                aVar.mo429a(this, handler);
            }
        }

        MediaSessionImplApi21(Context context, String str, Bundle bundle) {
            Object a = C0169b.m531a(context, str);
            this.f293a = a;
            this.f294b = new Token(C0169b.m539b(a), new ExtraSession(), bundle);
        }
    }

    /* access modifiers changed from: package-private */
    public static class MediaSessionImplBase implements AbstractC0152b {

        /* renamed from: A */
        private final MediaSessionStub f304A;

        /* renamed from: B */
        private final Token f305B;

        /* renamed from: C */
        private HandlerC0143b f306C;

        /* renamed from: D */
        private boolean f307D = false;

        /* renamed from: E */
        private boolean f308E = false;

        /* renamed from: F */
        private C1230e.C1231a f309F;

        /* renamed from: G */
        private VolumeProviderCompat.AbstractC1223a f310G = new VolumeProviderCompat.AbstractC1223a() {
            /* class android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase.C01411 */
        };

        /* renamed from: a */
        final String f311a;

        /* renamed from: b */
        final String f312b;

        /* renamed from: c */
        final AudioManager f313c;

        /* renamed from: d */
        final RemoteControlClient f314d;

        /* renamed from: e */
        final Object f315e = new Object();

        /* renamed from: f */
        final RemoteCallbackList<IMediaControllerCallback> f316f = new RemoteCallbackList<>();

        /* renamed from: g */
        boolean f317g = false;

        /* renamed from: h */
        boolean f318h = false;

        /* renamed from: i */
        volatile AbstractC0147a f319i;

        /* renamed from: j */
        int f320j;

        /* renamed from: k */
        MediaMetadataCompat f321k;

        /* renamed from: l */
        PlaybackStateCompat f322l;

        /* renamed from: m */
        PendingIntent f323m;

        /* renamed from: n */
        List<QueueItem> f324n;

        /* renamed from: o */
        CharSequence f325o;

        /* renamed from: p */
        int f326p;

        /* renamed from: q */
        boolean f327q;

        /* renamed from: r */
        int f328r;

        /* renamed from: s */
        int f329s;

        /* renamed from: t */
        Bundle f330t;

        /* renamed from: u */
        int f331u;

        /* renamed from: v */
        int f332v;

        /* renamed from: w */
        VolumeProviderCompat f333w;

        /* renamed from: x */
        private final Context f334x;

        /* renamed from: y */
        private final ComponentName f335y;

        /* renamed from: z */
        private final PendingIntent f336z;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo378a(long j) {
            int i = (1 & j) != 0 ? 32 : 0;
            if ((2 & j) != 0) {
                i |= 16;
            }
            if ((4 & j) != 0) {
                i |= 4;
            }
            if ((8 & j) != 0) {
                i |= 2;
            }
            if ((16 & j) != 0) {
                i |= 1;
            }
            if ((32 & j) != 0) {
                i |= SmActions.ACTION_ONTHECALL_EXIT;
            }
            if ((64 & j) != 0) {
                i |= 64;
            }
            return (j & 512) != 0 ? i | 8 : i;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0152b
        /* renamed from: a */
        public void mo369a(PendingIntent pendingIntent) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo383b(int i) {
            switch (i) {
                case 0:
                    return 0;
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 4;
                case 5:
                    return 5;
                case 6:
                case 8:
                    return 8;
                case 7:
                    return 9;
                case 9:
                    return 7;
                case 10:
                case 11:
                    return 6;
                default:
                    return -1;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0152b
        /* renamed from: a */
        public Token mo367a() {
            return this.f305B;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0152b
        /* renamed from: a */
        public void mo374a(boolean z) {
            if (z != this.f318h) {
                this.f318h = z;
                if (mo387d()) {
                    mo370a(this.f321k);
                    mo372a(this.f322l);
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0152b
        /* renamed from: a */
        public void mo372a(PlaybackStateCompat playbackStateCompat) {
            synchronized (this.f315e) {
                this.f322l = playbackStateCompat;
            }
            m380c(playbackStateCompat);
            if (this.f318h) {
                if (playbackStateCompat == null) {
                    this.f314d.setPlaybackState(0);
                    this.f314d.setTransportControlFlags(0);
                    return;
                }
                mo386b(playbackStateCompat);
                this.f314d.setTransportControlFlags(mo378a(playbackStateCompat.mo490e()));
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0152b
        /* renamed from: a */
        public void mo373a(C1230e.C1231a aVar) {
            synchronized (this.f315e) {
                this.f309F = aVar;
            }
        }

        class MediaSessionStub extends IMediaSession.Stub {
            @Override // android.support.v4.media.session.IMediaSession
            public boolean isShuffleModeEnabledRemoved() {
                return false;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setShuffleModeEnabledRemoved(boolean z) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void fastForward() throws RemoteException {
                postToHandler(16);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public MediaMetadataCompat getMetadata() {
                return MediaSessionImplBase.this.f321k;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public String getPackageName() {
                return MediaSessionImplBase.this.f311a;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public CharSequence getQueueTitle() {
                return MediaSessionImplBase.this.f325o;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public int getRatingType() {
                return MediaSessionImplBase.this.f326p;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public int getRepeatMode() {
                return MediaSessionImplBase.this.f328r;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public int getShuffleMode() {
                return MediaSessionImplBase.this.f329s;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public String getTag() {
                return MediaSessionImplBase.this.f312b;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean isCaptioningEnabled() {
                return MediaSessionImplBase.this.f327q;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void next() throws RemoteException {
                postToHandler(14);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void pause() throws RemoteException {
                postToHandler(12);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void play() throws RemoteException {
                postToHandler(7);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepare() throws RemoteException {
                postToHandler(3);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void previous() throws RemoteException {
                postToHandler(15);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void rewind() throws RemoteException {
                postToHandler(17);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void stop() throws RemoteException {
                postToHandler(13);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public Bundle getExtras() {
                Bundle bundle;
                synchronized (MediaSessionImplBase.this.f315e) {
                    bundle = MediaSessionImplBase.this.f330t;
                }
                return bundle;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public long getFlags() {
                long j;
                synchronized (MediaSessionImplBase.this.f315e) {
                    j = (long) MediaSessionImplBase.this.f320j;
                }
                return j;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public PendingIntent getLaunchPendingIntent() {
                PendingIntent pendingIntent;
                synchronized (MediaSessionImplBase.this.f315e) {
                    pendingIntent = MediaSessionImplBase.this.f323m;
                }
                return pendingIntent;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public List<QueueItem> getQueue() {
                List<QueueItem> list;
                synchronized (MediaSessionImplBase.this.f315e) {
                    list = MediaSessionImplBase.this.f324n;
                }
                return list;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean isTransportControlEnabled() {
                if ((MediaSessionImplBase.this.f320j & 2) != 0) {
                    return true;
                }
                return false;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public PlaybackStateCompat getPlaybackState() {
                PlaybackStateCompat playbackStateCompat;
                MediaMetadataCompat mediaMetadataCompat;
                synchronized (MediaSessionImplBase.this.f315e) {
                    playbackStateCompat = MediaSessionImplBase.this.f322l;
                    mediaMetadataCompat = MediaSessionImplBase.this.f321k;
                }
                return MediaSessionCompat.m359a(playbackStateCompat, mediaMetadataCompat);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public ParcelableVolumeInfo getVolumeAttributes() {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                synchronized (MediaSessionImplBase.this.f315e) {
                    i = MediaSessionImplBase.this.f331u;
                    i2 = MediaSessionImplBase.this.f332v;
                    VolumeProviderCompat volumeProviderCompat = MediaSessionImplBase.this.f333w;
                    if (i == 2) {
                        int b = volumeProviderCompat.mo6203b();
                        int c = volumeProviderCompat.mo6205c();
                        i3 = volumeProviderCompat.mo6201a();
                        i4 = c;
                        i5 = b;
                    } else {
                        i4 = MediaSessionImplBase.this.f313c.getStreamMaxVolume(i2);
                        i3 = MediaSessionImplBase.this.f313c.getStreamVolume(i2);
                        i5 = 2;
                    }
                }
                return new ParcelableVolumeInfo(i, i2, i5, i4, i3);
            }

            MediaSessionStub() {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
                postToHandler(25, mediaDescriptionCompat);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void rate(RatingCompat ratingCompat) throws RemoteException {
                postToHandler(19, ratingCompat);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void removeQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
                postToHandler(27, mediaDescriptionCompat);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void removeQueueItemAt(int i) {
                postToHandler(28, i);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setRepeatMode(int i) throws RemoteException {
                postToHandler(23, i);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setShuffleMode(int i) throws RemoteException {
                postToHandler(30, i);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void unregisterCallbackListener(IMediaControllerCallback iMediaControllerCallback) {
                MediaSessionImplBase.this.f316f.unregister(iMediaControllerCallback);
            }

            /* access modifiers changed from: package-private */
            public void postToHandler(int i) {
                MediaSessionImplBase.this.mo381a(i, 0, 0, null, null);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void seekTo(long j) throws RemoteException {
                postToHandler(18, Long.valueOf(j));
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setCaptioningEnabled(boolean z) throws RemoteException {
                postToHandler(29, Boolean.valueOf(z));
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void skipToQueueItem(long j) {
                postToHandler(11, Long.valueOf(j));
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean sendMediaButton(KeyEvent keyEvent) {
                boolean z = true;
                if ((MediaSessionImplBase.this.f320j & 1) == 0) {
                    z = false;
                }
                if (z) {
                    postToHandler(21, keyEvent);
                }
                return z;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void registerCallbackListener(IMediaControllerCallback iMediaControllerCallback) {
                if (MediaSessionImplBase.this.f317g) {
                    try {
                        iMediaControllerCallback.onSessionDestroyed();
                    } catch (Exception unused) {
                    }
                } else {
                    MediaSessionImplBase.this.f316f.register(iMediaControllerCallback, new C1230e.C1231a("android.media.session.MediaController", getCallingPid(), getCallingUid()));
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void addQueueItemAt(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                postToHandler(26, mediaDescriptionCompat, i);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void playFromMediaId(String str, Bundle bundle) throws RemoteException {
                postToHandler(8, str, bundle);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void playFromSearch(String str, Bundle bundle) throws RemoteException {
                postToHandler(9, str, bundle);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void playFromUri(Uri uri, Bundle bundle) throws RemoteException {
                postToHandler(10, uri, bundle);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepareFromMediaId(String str, Bundle bundle) throws RemoteException {
                postToHandler(4, str, bundle);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepareFromSearch(String str, Bundle bundle) throws RemoteException {
                postToHandler(5, str, bundle);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepareFromUri(Uri uri, Bundle bundle) throws RemoteException {
                postToHandler(6, uri, bundle);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void rateWithExtras(RatingCompat ratingCompat, Bundle bundle) throws RemoteException {
                postToHandler(31, ratingCompat, bundle);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void sendCustomAction(String str, Bundle bundle) throws RemoteException {
                postToHandler(20, str, bundle);
            }

            /* access modifiers changed from: package-private */
            public void postToHandler(int i, int i2) {
                MediaSessionImplBase.this.mo381a(i, i2, 0, null, null);
            }

            /* access modifiers changed from: package-private */
            public void postToHandler(int i, Object obj) {
                MediaSessionImplBase.this.mo381a(i, 0, 0, obj, null);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void adjustVolume(int i, int i2, String str) {
                MediaSessionImplBase.this.mo380a(i, i2);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setVolumeTo(int i, int i2, String str) {
                MediaSessionImplBase.this.mo384b(i, i2);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void sendCommand(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                postToHandler(1, new C0142a(str, bundle, resultReceiverWrapper.f345a));
            }

            /* access modifiers changed from: package-private */
            public void postToHandler(int i, Object obj, int i2) {
                MediaSessionImplBase.this.mo381a(i, i2, 0, obj, null);
            }

            /* access modifiers changed from: package-private */
            public void postToHandler(int i, Object obj, Bundle bundle) {
                MediaSessionImplBase.this.mo381a(i, 0, 0, obj, bundle);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0152b
        /* renamed from: b */
        public PlaybackStateCompat mo375b() {
            PlaybackStateCompat playbackStateCompat;
            synchronized (this.f315e) {
                playbackStateCompat = this.f322l;
            }
            return playbackStateCompat;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0152b
        /* renamed from: c */
        public C1230e.C1231a mo376c() {
            C1230e.C1231a aVar;
            synchronized (this.f315e) {
                aVar = this.f309F;
            }
            return aVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo387d() {
            if (this.f318h) {
                boolean z = this.f307D;
                if (!z && (this.f320j & 1) != 0) {
                    mo382a(this.f336z, this.f335y);
                    this.f307D = true;
                } else if (z && (this.f320j & 1) == 0) {
                    mo385b(this.f336z, this.f335y);
                    this.f307D = false;
                }
                boolean z2 = this.f308E;
                if (!z2 && (this.f320j & 2) != 0) {
                    this.f313c.registerRemoteControlClient(this.f314d);
                    this.f308E = true;
                    return true;
                } else if (z2 && (this.f320j & 2) == 0) {
                    this.f314d.setPlaybackState(0);
                    this.f313c.unregisterRemoteControlClient(this.f314d);
                    this.f308E = false;
                }
            } else {
                if (this.f307D) {
                    mo385b(this.f336z, this.f335y);
                    this.f307D = false;
                }
                if (this.f308E) {
                    this.f314d.setPlaybackState(0);
                    this.f313c.unregisterRemoteControlClient(this.f314d);
                    this.f308E = false;
                }
            }
            return false;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0152b
        /* renamed from: a */
        public void mo368a(int i) {
            synchronized (this.f315e) {
                this.f320j = i;
            }
            mo387d();
        }

        /* renamed from: b */
        private void m379b(MediaMetadataCompat mediaMetadataCompat) {
            for (int beginBroadcast = this.f316f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f316f.getBroadcastItem(beginBroadcast).onMetadataChanged(mediaMetadataCompat);
                } catch (RemoteException unused) {
                }
            }
            this.f316f.finishBroadcast();
        }

        /* renamed from: c */
        private void m380c(PlaybackStateCompat playbackStateCompat) {
            for (int beginBroadcast = this.f316f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f316f.getBroadcastItem(beginBroadcast).onPlaybackStateChanged(playbackStateCompat);
                } catch (RemoteException unused) {
                }
            }
            this.f316f.finishBroadcast();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo386b(PlaybackStateCompat playbackStateCompat) {
            this.f314d.setPlaybackState(mo383b(playbackStateCompat.mo485a()));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase$b */
        public class HandlerC0143b extends Handler {
            public void handleMessage(Message message) {
                QueueItem queueItem;
                AbstractC0147a aVar = MediaSessionImplBase.this.f319i;
                if (aVar != null) {
                    Bundle data = message.getData();
                    MediaSessionCompat.m360a(data);
                    MediaSessionImplBase.this.mo373a(new C1230e.C1231a(data.getString("data_calling_pkg"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid")));
                    Bundle bundle = data.getBundle("data_extras");
                    MediaSessionCompat.m360a(bundle);
                    try {
                        switch (message.what) {
                            case 1:
                                C0142a aVar2 = (C0142a) message.obj;
                                aVar.mo432a(aVar2.f338a, aVar2.f339b, aVar2.f340c);
                                break;
                            case 2:
                                MediaSessionImplBase.this.mo380a(message.arg1, 0);
                                break;
                            case 3:
                                aVar.mo421a();
                                break;
                            case 4:
                                aVar.mo431a((String) message.obj, bundle);
                                break;
                            case 5:
                                aVar.mo440b((String) message.obj, bundle);
                                break;
                            case 6:
                                aVar.mo424a((Uri) message.obj, bundle);
                                break;
                            case 7:
                                aVar.mo435b();
                                break;
                            case 8:
                                aVar.mo442c((String) message.obj, bundle);
                                break;
                            case 9:
                                aVar.mo444d((String) message.obj, bundle);
                                break;
                            case 10:
                                aVar.mo438b((Uri) message.obj, bundle);
                                break;
                            case 11:
                                aVar.mo423a(((Long) message.obj).longValue());
                                break;
                            case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                                aVar.mo441c();
                                break;
                            case 13:
                                aVar.mo449h();
                                break;
                            case 14:
                                aVar.mo443d();
                                break;
                            case 15:
                                aVar.mo445e();
                                break;
                            case 16:
                                aVar.mo447f();
                                break;
                            case 17:
                                aVar.mo448g();
                                break;
                            case 18:
                                aVar.mo437b(((Long) message.obj).longValue());
                                break;
                            case 19:
                                aVar.mo427a((RatingCompat) message.obj);
                                break;
                            case 20:
                                aVar.mo446e((String) message.obj, bundle);
                                break;
                            case 21:
                                KeyEvent keyEvent = (KeyEvent) message.obj;
                                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                                intent.putExtra("android.intent.extra.KEY_EVENT", keyEvent);
                                if (!aVar.mo434a(intent)) {
                                    m401a(keyEvent, aVar);
                                    break;
                                }
                                break;
                            case 22:
                                MediaSessionImplBase.this.mo384b(message.arg1, 0);
                                break;
                            case 23:
                                aVar.mo422a(message.arg1);
                                break;
                            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /*{ENCODED_INT: 25}*/:
                                aVar.mo425a((MediaDescriptionCompat) message.obj);
                                break;
                            case 26:
                                aVar.mo426a((MediaDescriptionCompat) message.obj, message.arg1);
                                break;
                            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /*{ENCODED_INT: 27}*/:
                                aVar.mo439b((MediaDescriptionCompat) message.obj);
                                break;
                            case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                                if (MediaSessionImplBase.this.f324n != null) {
                                    if (message.arg1 < 0 || message.arg1 >= MediaSessionImplBase.this.f324n.size()) {
                                        queueItem = null;
                                    } else {
                                        queueItem = MediaSessionImplBase.this.f324n.get(message.arg1);
                                    }
                                    if (queueItem != null) {
                                        aVar.mo439b(queueItem.mo394a());
                                        break;
                                    }
                                }
                                break;
                            case 29:
                                aVar.mo433a(((Boolean) message.obj).booleanValue());
                                break;
                            case 30:
                                aVar.mo436b(message.arg1);
                                break;
                            case TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE /*{ENCODED_INT: 31}*/:
                                aVar.mo428a((RatingCompat) message.obj, bundle);
                                break;
                        }
                    } finally {
                        MediaSessionImplBase.this.mo373a((C1230e.C1231a) null);
                    }
                }
            }

            public HandlerC0143b(Looper looper) {
                super(looper);
            }

            /* renamed from: a */
            private void m401a(KeyEvent keyEvent, AbstractC0147a aVar) {
                long j;
                if (keyEvent != null && keyEvent.getAction() == 0) {
                    if (MediaSessionImplBase.this.f322l == null) {
                        j = 0;
                    } else {
                        j = MediaSessionImplBase.this.f322l.mo490e();
                    }
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode != 79) {
                        if (keyCode != 126) {
                            if (keyCode != 127) {
                                switch (keyCode) {
                                    case 85:
                                        break;
                                    case 86:
                                        if ((j & 1) != 0) {
                                            aVar.mo449h();
                                            return;
                                        }
                                        return;
                                    case 87:
                                        if ((j & 32) != 0) {
                                            aVar.mo443d();
                                            return;
                                        }
                                        return;
                                    case 88:
                                        if ((j & 16) != 0) {
                                            aVar.mo445e();
                                            return;
                                        }
                                        return;
                                    case 89:
                                        if ((j & 8) != 0) {
                                            aVar.mo448g();
                                            return;
                                        }
                                        return;
                                    case CameraPosition.TILT_90 /*{ENCODED_INT: 90}*/:
                                        if ((j & 64) != 0) {
                                            aVar.mo447f();
                                            return;
                                        }
                                        return;
                                    default:
                                        return;
                                }
                            } else if ((j & 2) != 0) {
                                aVar.mo441c();
                                return;
                            } else {
                                return;
                            }
                        } else if ((j & 4) != 0) {
                            aVar.mo435b();
                            return;
                        } else {
                            return;
                        }
                    }
                    Log.w("MediaSessionCompat", "KEYCODE_MEDIA_PLAY_PAUSE and KEYCODE_HEADSETHOOK are handled already");
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public RemoteControlClient.MetadataEditor mo379a(Bundle bundle) {
            RemoteControlClient.MetadataEditor editMetadata = this.f314d.editMetadata(true);
            if (bundle == null) {
                return editMetadata;
            }
            if (bundle.containsKey("android.media.metadata.ART")) {
                Bitmap bitmap = (Bitmap) bundle.getParcelable("android.media.metadata.ART");
                if (bitmap != null) {
                    bitmap = bitmap.copy(bitmap.getConfig(), false);
                }
                editMetadata.putBitmap(100, bitmap);
            } else if (bundle.containsKey("android.media.metadata.ALBUM_ART")) {
                Bitmap bitmap2 = (Bitmap) bundle.getParcelable("android.media.metadata.ALBUM_ART");
                if (bitmap2 != null) {
                    bitmap2 = bitmap2.copy(bitmap2.getConfig(), false);
                }
                editMetadata.putBitmap(100, bitmap2);
            }
            if (bundle.containsKey("android.media.metadata.ALBUM")) {
                editMetadata.putString(1, bundle.getString("android.media.metadata.ALBUM"));
            }
            if (bundle.containsKey("android.media.metadata.ALBUM_ARTIST")) {
                editMetadata.putString(13, bundle.getString("android.media.metadata.ALBUM_ARTIST"));
            }
            if (bundle.containsKey("android.media.metadata.ARTIST")) {
                editMetadata.putString(2, bundle.getString("android.media.metadata.ARTIST"));
            }
            if (bundle.containsKey("android.media.metadata.AUTHOR")) {
                editMetadata.putString(3, bundle.getString("android.media.metadata.AUTHOR"));
            }
            if (bundle.containsKey("android.media.metadata.COMPILATION")) {
                editMetadata.putString(15, bundle.getString("android.media.metadata.COMPILATION"));
            }
            if (bundle.containsKey("android.media.metadata.COMPOSER")) {
                editMetadata.putString(4, bundle.getString("android.media.metadata.COMPOSER"));
            }
            if (bundle.containsKey("android.media.metadata.DATE")) {
                editMetadata.putString(5, bundle.getString("android.media.metadata.DATE"));
            }
            if (bundle.containsKey("android.media.metadata.DISC_NUMBER")) {
                editMetadata.putLong(14, bundle.getLong("android.media.metadata.DISC_NUMBER"));
            }
            if (bundle.containsKey("android.media.metadata.DURATION")) {
                editMetadata.putLong(9, bundle.getLong("android.media.metadata.DURATION"));
            }
            if (bundle.containsKey("android.media.metadata.GENRE")) {
                editMetadata.putString(6, bundle.getString("android.media.metadata.GENRE"));
            }
            if (bundle.containsKey("android.media.metadata.TITLE")) {
                editMetadata.putString(7, bundle.getString("android.media.metadata.TITLE"));
            }
            if (bundle.containsKey("android.media.metadata.TRACK_NUMBER")) {
                editMetadata.putLong(0, bundle.getLong("android.media.metadata.TRACK_NUMBER"));
            }
            if (bundle.containsKey("android.media.metadata.WRITER")) {
                editMetadata.putString(11, bundle.getString("android.media.metadata.WRITER"));
            }
            return editMetadata;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0152b
        /* renamed from: a */
        public void mo370a(MediaMetadataCompat mediaMetadataCompat) {
            Bundle bundle;
            if (mediaMetadataCompat != null) {
                mediaMetadataCompat = new MediaMetadataCompat.C0116a(mediaMetadataCompat, MediaSessionCompat.f287a).mo246a();
            }
            synchronized (this.f315e) {
                this.f321k = mediaMetadataCompat;
            }
            m379b(mediaMetadataCompat);
            if (this.f318h) {
                if (mediaMetadataCompat == null) {
                    bundle = null;
                } else {
                    bundle = mediaMetadataCompat.mo234a();
                }
                mo379a(bundle).apply();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo385b(PendingIntent pendingIntent, ComponentName componentName) {
            this.f313c.unregisterMediaButtonEventReceiver(componentName);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo380a(int i, int i2) {
            if (this.f331u == 2) {
                VolumeProviderCompat volumeProviderCompat = this.f333w;
                if (volumeProviderCompat != null) {
                    volumeProviderCompat.mo6204b(i);
                    return;
                }
                return;
            }
            this.f313c.adjustStreamVolume(this.f332v, i, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo384b(int i, int i2) {
            if (this.f331u == 2) {
                VolumeProviderCompat volumeProviderCompat = this.f333w;
                if (volumeProviderCompat != null) {
                    volumeProviderCompat.mo6202a(i);
                    return;
                }
                return;
            }
            this.f313c.setStreamVolume(this.f332v, i, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo382a(PendingIntent pendingIntent, ComponentName componentName) {
            this.f313c.registerMediaButtonEventReceiver(componentName);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0152b
        /* renamed from: a */
        public void mo371a(AbstractC0147a aVar, Handler handler) {
            this.f319i = aVar;
            if (aVar != null) {
                if (handler == null) {
                    handler = new Handler();
                }
                synchronized (this.f315e) {
                    HandlerC0143b bVar = this.f306C;
                    if (bVar != null) {
                        bVar.removeCallbacksAndMessages(null);
                    }
                    this.f306C = new HandlerC0143b(handler.getLooper());
                    this.f319i.mo429a(this, handler);
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase$a */
        private static final class C0142a {

            /* renamed from: a */
            public final String f338a;

            /* renamed from: b */
            public final Bundle f339b;

            /* renamed from: c */
            public final ResultReceiver f340c;

            public C0142a(String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f338a = str;
                this.f339b = bundle;
                this.f340c = resultReceiver;
            }
        }

        public MediaSessionImplBase(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
            if (componentName != null) {
                this.f334x = context;
                this.f311a = context.getPackageName();
                this.f313c = (AudioManager) context.getSystemService("audio");
                this.f312b = str;
                this.f335y = componentName;
                this.f336z = pendingIntent;
                MediaSessionStub mediaSessionStub = new MediaSessionStub();
                this.f304A = mediaSessionStub;
                this.f305B = new Token(mediaSessionStub);
                this.f326p = 0;
                this.f331u = 1;
                this.f332v = 3;
                this.f314d = new RemoteControlClient(pendingIntent);
                return;
            }
            throw new IllegalArgumentException("MediaButtonReceiver component may not be null.");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo381a(int i, int i2, int i3, Object obj, Bundle bundle) {
            synchronized (this.f315e) {
                HandlerC0143b bVar = this.f306C;
                if (bVar != null) {
                    Message obtainMessage = bVar.obtainMessage(i, i2, i3, obj);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("data_calling_pkg", "android.media.session.MediaController");
                    bundle2.putInt("data_calling_pid", Binder.getCallingPid());
                    bundle2.putInt("data_calling_uid", Binder.getCallingUid());
                    if (bundle != null) {
                        bundle2.putBundle("data_extras", bundle);
                    }
                    obtainMessage.setData(bundle2);
                    obtainMessage.sendToTarget();
                }
            }
        }
    }

    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new Parcelable.Creator<QueueItem>() {
            /* class android.support.v4.media.session.MediaSessionCompat.QueueItem.C01441 */

            /* renamed from: a */
            public QueueItem[] newArray(int i) {
                return new QueueItem[i];
            }

            /* renamed from: a */
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }
        };

        /* renamed from: a */
        private final MediaDescriptionCompat f342a;

        /* renamed from: b */
        private final long f343b;

        /* renamed from: c */
        private Object f344c;

        public int describeContents() {
            return 0;
        }

        /* renamed from: a */
        public MediaDescriptionCompat mo394a() {
            return this.f342a;
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.f342a + ", Id=" + this.f343b + " }";
        }

        QueueItem(Parcel parcel) {
            this.f342a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f343b = parcel.readLong();
        }

        /* renamed from: a */
        public static QueueItem m402a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            return new QueueItem(obj, MediaDescriptionCompat.m255a(C0169b.C0172c.m556a(obj)), C0169b.C0172c.m557b(obj));
        }

        /* renamed from: a */
        public static List<QueueItem> m403a(List<?> list) {
            if (list == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(m402a(it.next()));
            }
            return arrayList;
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f342a.writeToParcel(parcel, i);
            parcel.writeLong(this.f343b);
        }

        private QueueItem(Object obj, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null.");
            } else if (j != -1) {
                this.f342a = mediaDescriptionCompat;
                this.f343b = j;
                this.f344c = obj;
            } else {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
        }
    }

    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new Parcelable.Creator<Token>() {
            /* class android.support.v4.media.session.MediaSessionCompat.Token.C01461 */

            /* renamed from: a */
            public Token[] newArray(int i) {
                return new Token[i];
            }

            /* renamed from: a */
            public Token createFromParcel(Parcel parcel) {
                Object obj;
                if (Build.VERSION.SDK_INT >= 21) {
                    obj = parcel.readParcelable(null);
                } else {
                    obj = parcel.readStrongBinder();
                }
                return new Token(obj);
            }
        };

        /* renamed from: a */
        private final Object f346a;

        /* renamed from: b */
        private IMediaSession f347b;

        /* renamed from: c */
        private Bundle f348c;

        public int describeContents() {
            return 0;
        }

        /* renamed from: a */
        public Object mo408a() {
            return this.f346a;
        }

        /* renamed from: b */
        public IMediaSession mo411b() {
            return this.f347b;
        }

        /* renamed from: c */
        public Bundle mo412c() {
            return this.f348c;
        }

        public int hashCode() {
            Object obj = this.f346a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        Token(Object obj) {
            this(obj, null, null);
        }

        /* renamed from: a */
        public static Token m409a(Object obj) {
            return m410a(obj, null);
        }

        /* renamed from: a */
        public void mo409a(Bundle bundle) {
            this.f348c = bundle;
        }

        /* renamed from: a */
        public void mo410a(IMediaSession iMediaSession) {
            this.f347b = iMediaSession;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.f346a;
            if (obj2 != null) {
                Object obj3 = token.f346a;
                if (obj3 == null) {
                    return false;
                }
                return obj2.equals(obj3);
            } else if (token.f346a == null) {
                return true;
            } else {
                return false;
            }
        }

        Token(Object obj, IMediaSession iMediaSession) {
            this(obj, iMediaSession, null);
        }

        /* renamed from: a */
        public static Token m410a(Object obj, IMediaSession iMediaSession) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            return new Token(C0169b.m533a(obj), iMediaSession);
        }

        public void writeToParcel(Parcel parcel, int i) {
            if (Build.VERSION.SDK_INT >= 21) {
                parcel.writeParcelable((Parcelable) this.f346a, i);
            } else {
                parcel.writeStrongBinder((IBinder) this.f346a);
            }
        }

        Token(Object obj, IMediaSession iMediaSession, Bundle bundle) {
            this.f346a = obj;
            this.f347b = iMediaSession;
            this.f348c = bundle;
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$a */
    public static abstract class AbstractC0147a {

        /* renamed from: a */
        private HandlerC0148a f349a;

        /* renamed from: b */
        final Object f350b;

        /* renamed from: c */
        WeakReference<AbstractC0152b> f351c;

        /* renamed from: d */
        private boolean f352d;

        /* renamed from: a */
        public void mo421a() {
        }

        /* renamed from: a */
        public void mo422a(int i) {
        }

        /* renamed from: a */
        public void mo423a(long j) {
        }

        /* renamed from: a */
        public void mo424a(Uri uri, Bundle bundle) {
        }

        /* renamed from: a */
        public void mo425a(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        /* renamed from: a */
        public void mo426a(MediaDescriptionCompat mediaDescriptionCompat, int i) {
        }

        /* renamed from: a */
        public void mo427a(RatingCompat ratingCompat) {
        }

        /* renamed from: a */
        public void mo428a(RatingCompat ratingCompat, Bundle bundle) {
        }

        /* renamed from: a */
        public void mo431a(String str, Bundle bundle) {
        }

        /* renamed from: a */
        public void mo432a(String str, Bundle bundle, ResultReceiver resultReceiver) {
        }

        /* renamed from: a */
        public void mo433a(boolean z) {
        }

        /* renamed from: b */
        public void mo435b() {
        }

        /* renamed from: b */
        public void mo436b(int i) {
        }

        /* renamed from: b */
        public void mo437b(long j) {
        }

        /* renamed from: b */
        public void mo438b(Uri uri, Bundle bundle) {
        }

        /* renamed from: b */
        public void mo439b(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        /* renamed from: b */
        public void mo440b(String str, Bundle bundle) {
        }

        /* renamed from: c */
        public void mo441c() {
        }

        /* renamed from: c */
        public void mo442c(String str, Bundle bundle) {
        }

        /* renamed from: d */
        public void mo443d() {
        }

        /* renamed from: d */
        public void mo444d(String str, Bundle bundle) {
        }

        /* renamed from: e */
        public void mo445e() {
        }

        /* renamed from: e */
        public void mo446e(String str, Bundle bundle) {
        }

        /* renamed from: f */
        public void mo447f() {
        }

        /* renamed from: g */
        public void mo448g() {
        }

        /* renamed from: h */
        public void mo449h() {
        }

        /* renamed from: a */
        public boolean mo434a(Intent intent) {
            AbstractC0152b bVar;
            KeyEvent keyEvent;
            long j;
            if (Build.VERSION.SDK_INT >= 27 || (bVar = this.f351c.get()) == null || this.f349a == null || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
                return false;
            }
            C1230e.C1231a c = bVar.mo376c();
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 79 || keyCode == 85) {
                if (keyEvent.getRepeatCount() > 0) {
                    mo430a(c);
                } else if (this.f352d) {
                    this.f349a.removeMessages(1);
                    this.f352d = false;
                    PlaybackStateCompat b = bVar.mo375b();
                    if (b == null) {
                        j = 0;
                    } else {
                        j = b.mo490e();
                    }
                    if ((j & 32) != 0) {
                        mo443d();
                    }
                } else {
                    this.f352d = true;
                    HandlerC0148a aVar = this.f349a;
                    aVar.sendMessageDelayed(aVar.obtainMessage(1, c), (long) ViewConfiguration.getDoubleTapTimeout());
                }
                return true;
            }
            mo430a(c);
            return false;
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$a$b */
        private class C0149b implements C0169b.AbstractC0170a {
            @Override // android.support.v4.media.session.C0169b.AbstractC0170a
            /* renamed from: a */
            public void mo451a() {
                AbstractC0147a.this.mo435b();
            }

            @Override // android.support.v4.media.session.C0169b.AbstractC0170a
            /* renamed from: b */
            public void mo457b() {
                AbstractC0147a.this.mo441c();
            }

            @Override // android.support.v4.media.session.C0169b.AbstractC0170a
            /* renamed from: c */
            public void mo460c() {
                AbstractC0147a.this.mo443d();
            }

            @Override // android.support.v4.media.session.C0169b.AbstractC0170a
            /* renamed from: d */
            public void mo462d() {
                AbstractC0147a.this.mo445e();
            }

            @Override // android.support.v4.media.session.C0169b.AbstractC0170a
            /* renamed from: e */
            public void mo463e() {
                AbstractC0147a.this.mo447f();
            }

            @Override // android.support.v4.media.session.C0169b.AbstractC0170a
            /* renamed from: f */
            public void mo464f() {
                AbstractC0147a.this.mo448g();
            }

            @Override // android.support.v4.media.session.C0169b.AbstractC0170a
            /* renamed from: g */
            public void mo465g() {
                AbstractC0147a.this.mo449h();
            }

            C0149b() {
            }

            @Override // android.support.v4.media.session.C0169b.AbstractC0170a
            /* renamed from: a */
            public void mo452a(long j) {
                AbstractC0147a.this.mo423a(j);
            }

            @Override // android.support.v4.media.session.C0169b.AbstractC0170a
            /* renamed from: b */
            public void mo458b(long j) {
                AbstractC0147a.this.mo437b(j);
            }

            @Override // android.support.v4.media.session.C0169b.AbstractC0170a
            /* renamed from: a */
            public void mo453a(Object obj) {
                AbstractC0147a.this.mo427a(RatingCompat.m283a(obj));
            }

            @Override // android.support.v4.media.session.C0169b.AbstractC0170a
            /* renamed from: a */
            public boolean mo456a(Intent intent) {
                return AbstractC0147a.this.mo434a(intent);
            }

            @Override // android.support.v4.media.session.C0169b.AbstractC0170a
            /* renamed from: b */
            public void mo459b(String str, Bundle bundle) {
                AbstractC0147a.this.mo444d(str, bundle);
            }

            @Override // android.support.v4.media.session.C0169b.AbstractC0170a
            /* renamed from: a */
            public void mo454a(String str, Bundle bundle) {
                AbstractC0147a.this.mo442c(str, bundle);
            }

            @Override // android.support.v4.media.session.C0169b.AbstractC0170a
            /* renamed from: c */
            public void mo461c(String str, Bundle bundle) {
                Bundle bundle2 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                MediaSessionCompat.m360a(bundle2);
                if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                    AbstractC0147a.this.mo438b((Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), bundle2);
                } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                    AbstractC0147a.this.mo421a();
                } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                    AbstractC0147a.this.mo431a(bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID"), bundle2);
                } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                    AbstractC0147a.this.mo440b(bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY"), bundle2);
                } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                    AbstractC0147a.this.mo424a((Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), bundle2);
                } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                    AbstractC0147a.this.mo433a(bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED"));
                } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                    AbstractC0147a.this.mo422a(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                    AbstractC0147a.this.mo436b(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                    AbstractC0147a.this.mo428a((RatingCompat) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING"), bundle2);
                } else {
                    AbstractC0147a.this.mo446e(str, bundle);
                }
            }

            @Override // android.support.v4.media.session.C0169b.AbstractC0170a
            /* renamed from: a */
            public void mo455a(String str, Bundle bundle, ResultReceiver resultReceiver) {
                try {
                    QueueItem queueItem = null;
                    IBinder iBinder = null;
                    queueItem = null;
                    if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                        MediaSessionImplApi21 mediaSessionImplApi21 = (MediaSessionImplApi21) AbstractC0147a.this.f351c.get();
                        if (mediaSessionImplApi21 != null) {
                            Bundle bundle2 = new Bundle();
                            Token a = mediaSessionImplApi21.mo367a();
                            IMediaSession b = a.mo411b();
                            if (b != null) {
                                iBinder = b.asBinder();
                            }
                            C0737e.m3595a(bundle2, "android.support.v4.media.session.EXTRA_BINDER", iBinder);
                            bundle2.putBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE", a.mo412c());
                            resultReceiver.send(0, bundle2);
                        }
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                        AbstractC0147a.this.mo425a((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                        AbstractC0147a.this.mo426a((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
                    } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                        AbstractC0147a.this.mo439b((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
                    } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                        MediaSessionImplApi21 mediaSessionImplApi212 = (MediaSessionImplApi21) AbstractC0147a.this.f351c.get();
                        if (mediaSessionImplApi212 != null && mediaSessionImplApi212.f298f != null) {
                            int i = bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
                            if (i >= 0 && i < mediaSessionImplApi212.f298f.size()) {
                                queueItem = mediaSessionImplApi212.f298f.get(i);
                            }
                            if (queueItem != null) {
                                AbstractC0147a.this.mo439b(queueItem.mo394a());
                            }
                        }
                    } else {
                        AbstractC0147a.this.mo432a(str, bundle, resultReceiver);
                    }
                } catch (BadParcelableException unused) {
                    Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$a$d */
        private class C0151d extends C0150c implements MediaSessionCompatApi24.Callback {
            @Override // android.support.v4.media.session.MediaSessionCompatApi24.Callback
            /* renamed from: h */
            public void mo470h() {
                AbstractC0147a.this.mo421a();
            }

            C0151d() {
                super();
            }

            @Override // android.support.v4.media.session.MediaSessionCompatApi24.Callback
            /* renamed from: b */
            public void mo467b(Uri uri, Bundle bundle) {
                AbstractC0147a.this.mo424a(uri, bundle);
            }

            @Override // android.support.v4.media.session.MediaSessionCompatApi24.Callback
            /* renamed from: d */
            public void mo468d(String str, Bundle bundle) {
                AbstractC0147a.this.mo431a(str, bundle);
            }

            @Override // android.support.v4.media.session.MediaSessionCompatApi24.Callback
            /* renamed from: e */
            public void mo469e(String str, Bundle bundle) {
                AbstractC0147a.this.mo440b(str, bundle);
            }
        }

        public AbstractC0147a() {
            if (Build.VERSION.SDK_INT >= 24) {
                this.f350b = MediaSessionCompatApi24.m490a((MediaSessionCompatApi24.Callback) new C0151d());
            } else if (Build.VERSION.SDK_INT >= 23) {
                this.f350b = MediaSessionCompatApi23.m488a(new C0150c());
            } else if (Build.VERSION.SDK_INT >= 21) {
                this.f350b = C0169b.m532a((C0169b.AbstractC0170a) new C0149b());
            } else {
                this.f350b = null;
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$a$c */
        private class C0150c extends C0149b implements MediaSessionCompatApi23.Callback {
            C0150c() {
                super();
            }

            @Override // android.support.v4.media.session.MediaSessionCompatApi23.Callback
            /* renamed from: a */
            public void mo466a(Uri uri, Bundle bundle) {
                AbstractC0147a.this.mo438b(uri, bundle);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: android.support.v4.media.session.MediaSessionCompat$a$a */
        public class HandlerC0148a extends Handler {
            public void handleMessage(Message message) {
                if (message.what == 1) {
                    AbstractC0147a.this.mo430a((C1230e.C1231a) message.obj);
                }
            }

            HandlerC0148a(Looper looper) {
                super(looper);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo430a(C1230e.C1231a aVar) {
            long j;
            boolean z;
            boolean z2;
            if (this.f352d) {
                boolean z3 = false;
                this.f352d = false;
                this.f349a.removeMessages(1);
                AbstractC0152b bVar = this.f351c.get();
                if (bVar != null) {
                    PlaybackStateCompat b = bVar.mo375b();
                    if (b == null) {
                        j = 0;
                    } else {
                        j = b.mo490e();
                    }
                    if (b == null || b.mo485a() != 3) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if ((516 & j) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if ((j & 514) != 0) {
                        z3 = true;
                    }
                    bVar.mo373a(aVar);
                    if (z && z3) {
                        mo441c();
                    } else if (!z && z2) {
                        mo435b();
                    }
                    bVar.mo373a((C1230e.C1231a) null);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo429a(AbstractC0152b bVar, Handler handler) {
            this.f351c = new WeakReference<>(bVar);
            HandlerC0148a aVar = this.f349a;
            if (aVar != null) {
                aVar.removeCallbacksAndMessages(null);
            }
            this.f349a = new HandlerC0148a(handler.getLooper());
        }
    }

    /* renamed from: a */
    public Token mo360a() {
        return this.f288b.mo367a();
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$e */
    static class C0157e extends MediaSessionImplApi21 {
        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21, android.support.v4.media.session.MediaSessionCompat.AbstractC0152b
        /* renamed from: a */
        public void mo373a(C1230e.C1231a aVar) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21, android.support.v4.media.session.MediaSessionCompat.AbstractC0152b
        /* renamed from: c */
        public final C1230e.C1231a mo376c() {
            return new C1230e.C1231a(((MediaSession) this.f293a).getCurrentControllerInfo());
        }

        C0157e(Context context, String str, Bundle bundle) {
            super(context, str, bundle);
        }
    }

    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new Parcelable.Creator<ResultReceiverWrapper>() {
            /* class android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper.C01451 */

            /* renamed from: a */
            public ResultReceiverWrapper[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }

            /* renamed from: a */
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }
        };

        /* renamed from: a */
        ResultReceiver f345a;

        public int describeContents() {
            return 0;
        }

        ResultReceiverWrapper(Parcel parcel) {
            this.f345a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f345a.writeToParcel(parcel, i);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$c */
    static class C0153c extends MediaSessionImplBase {

        /* renamed from: x */
        private static boolean f357x = true;

        /* access modifiers changed from: package-private */
        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase
        /* renamed from: a */
        public int mo378a(long j) {
            int a = super.mo378a(j);
            if ((j & 256) != 0) {
                return a | DynamicModule.f58006b;
            }
            return a;
        }

        /* access modifiers changed from: package-private */
        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase
        /* renamed from: b */
        public void mo386b(PlaybackStateCompat playbackStateCompat) {
            long b = playbackStateCompat.mo486b();
            float d = playbackStateCompat.mo488d();
            long c = playbackStateCompat.mo487c();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (playbackStateCompat.mo485a() == 3) {
                long j = 0;
                if (b > 0) {
                    if (c > 0) {
                        j = elapsedRealtime - c;
                        if (d > BitmapDescriptorFactory.HUE_RED && d != 1.0f) {
                            j = (long) (((float) j) * d);
                        }
                    }
                    b += j;
                }
            }
            this.f314d.setPlaybackState(mo383b(playbackStateCompat.mo485a()), b, d);
        }

        /* access modifiers changed from: package-private */
        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase
        /* renamed from: b */
        public void mo385b(PendingIntent pendingIntent, ComponentName componentName) {
            if (f357x) {
                this.f313c.unregisterMediaButtonEventReceiver(pendingIntent);
            } else {
                super.mo385b(pendingIntent, componentName);
            }
        }

        /* access modifiers changed from: package-private */
        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase
        /* renamed from: a */
        public void mo382a(PendingIntent pendingIntent, ComponentName componentName) {
            if (f357x) {
                try {
                    this.f313c.registerMediaButtonEventReceiver(pendingIntent);
                } catch (NullPointerException unused) {
                    Log.w("MediaSessionCompat", "Unable to register media button event receiver with PendingIntent, falling back to ComponentName.");
                    f357x = false;
                }
            }
            if (!f357x) {
                super.mo382a(pendingIntent, componentName);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0152b, android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase
        /* renamed from: a */
        public void mo371a(AbstractC0147a aVar, Handler handler) {
            super.mo371a(aVar, handler);
            if (aVar == null) {
                this.f314d.setPlaybackPositionUpdateListener(null);
                return;
            }
            this.f314d.setPlaybackPositionUpdateListener(new RemoteControlClient.OnPlaybackPositionUpdateListener() {
                /* class android.support.v4.media.session.MediaSessionCompat.C0153c.C01541 */

                public void onPlaybackPositionUpdate(long j) {
                    C0153c.this.mo381a(18, -1, -1, Long.valueOf(j), null);
                }
            });
        }

        C0153c(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
            super(context, str, componentName, pendingIntent);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$d */
    static class C0155d extends C0153c {
        /* access modifiers changed from: package-private */
        @Override // android.support.v4.media.session.MediaSessionCompat.C0153c, android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase
        /* renamed from: a */
        public int mo378a(long j) {
            int a = super.mo378a(j);
            if ((j & 128) != 0) {
                return a | MediaPlayer.MEDIA_PLAYER_OPTION_APPID;
            }
            return a;
        }

        /* access modifiers changed from: package-private */
        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase
        /* renamed from: a */
        public RemoteControlClient.MetadataEditor mo379a(Bundle bundle) {
            long j;
            RemoteControlClient.MetadataEditor a = super.mo379a(bundle);
            if (this.f322l == null) {
                j = 0;
            } else {
                j = this.f322l.mo490e();
            }
            if ((j & 128) != 0) {
                a.addEditableKey(268435457);
            }
            if (bundle == null) {
                return a;
            }
            if (bundle.containsKey("android.media.metadata.YEAR")) {
                a.putLong(8, bundle.getLong("android.media.metadata.YEAR"));
            }
            if (bundle.containsKey("android.media.metadata.RATING")) {
                a.putObject(101, (Object) bundle.getParcelable("android.media.metadata.RATING"));
            }
            if (bundle.containsKey("android.media.metadata.USER_RATING")) {
                a.putObject(268435457, (Object) bundle.getParcelable("android.media.metadata.USER_RATING"));
            }
            return a;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0152b, android.support.v4.media.session.MediaSessionCompat.C0153c, android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase
        /* renamed from: a */
        public void mo371a(AbstractC0147a aVar, Handler handler) {
            super.mo371a(aVar, handler);
            if (aVar == null) {
                this.f314d.setMetadataUpdateListener(null);
                return;
            }
            this.f314d.setMetadataUpdateListener(new RemoteControlClient.OnMetadataUpdateListener() {
                /* class android.support.v4.media.session.MediaSessionCompat.C0155d.C01561 */

                public void onMetadataUpdate(int i, Object obj) {
                    if (i == 268435457 && (obj instanceof Rating)) {
                        C0155d.this.mo381a(19, -1, -1, RatingCompat.m283a(obj), null);
                    }
                }
            });
        }

        C0155d(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
            super(context, str, componentName, pendingIntent);
        }
    }

    /* renamed from: a */
    public static void m360a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    /* renamed from: a */
    public void mo361a(int i) {
        this.f288b.mo368a(i);
    }

    /* renamed from: a */
    public void mo362a(MediaMetadataCompat mediaMetadataCompat) {
        this.f288b.mo370a(mediaMetadataCompat);
    }

    /* renamed from: a */
    public void mo363a(AbstractC0147a aVar) {
        mo364a(aVar, (Handler) null);
    }

    /* renamed from: a */
    public void mo365a(PlaybackStateCompat playbackStateCompat) {
        this.f288b.mo372a(playbackStateCompat);
    }

    /* renamed from: a */
    public void mo366a(boolean z) {
        this.f288b.mo374a(z);
        Iterator<AbstractC0158f> it = this.f290d.iterator();
        while (it.hasNext()) {
            it.next().mo473a();
        }
    }

    public MediaSessionCompat(Context context, String str) {
        this(context, str, null, null);
    }

    /* renamed from: a */
    static PlaybackStateCompat m359a(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat) {
        long j;
        if (playbackStateCompat == null) {
            return playbackStateCompat;
        }
        long j2 = -1;
        if (playbackStateCompat.mo486b() == -1) {
            return playbackStateCompat;
        }
        if (playbackStateCompat.mo485a() != 3 && playbackStateCompat.mo485a() != 4 && playbackStateCompat.mo485a() != 5) {
            return playbackStateCompat;
        }
        long c = playbackStateCompat.mo487c();
        if (c <= 0) {
            return playbackStateCompat;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long d = ((long) (playbackStateCompat.mo488d() * ((float) (elapsedRealtime - c)))) + playbackStateCompat.mo486b();
        if (mediaMetadataCompat != null && mediaMetadataCompat.mo235a("android.media.metadata.DURATION")) {
            j2 = mediaMetadataCompat.mo236b("android.media.metadata.DURATION");
        }
        if (j2 >= 0 && d > j2) {
            j = j2;
        } else if (d < 0) {
            j = 0;
        } else {
            j = d;
        }
        return new PlaybackStateCompat.C0164a(playbackStateCompat).mo507a(playbackStateCompat.mo485a(), j, playbackStateCompat.mo488d(), elapsedRealtime).mo509a();
    }

    /* renamed from: a */
    public void mo364a(AbstractC0147a aVar, Handler handler) {
        if (aVar == null) {
            this.f288b.mo371a(null, null);
            return;
        }
        AbstractC0152b bVar = this.f288b;
        if (handler == null) {
            handler = new Handler();
        }
        bVar.mo371a(aVar, handler);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        this(context, str, componentName, pendingIntent, null);
    }

    private MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this.f290d = new ArrayList<>();
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        } else if (!TextUtils.isEmpty(str)) {
            if (componentName == null && (componentName = MediaButtonReceiver.m5601a(context)) == null) {
                Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
            }
            if (componentName != null && pendingIntent == null) {
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                intent.setComponent(componentName);
                pendingIntent = PendingIntent.getBroadcast(context, 0, intent, 0);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                C0157e eVar = new C0157e(context, str, bundle);
                this.f288b = eVar;
                mo363a(new AbstractC0147a() {
                    /* class android.support.v4.media.session.MediaSessionCompat.C01391 */
                });
                eVar.mo369a(pendingIntent);
            } else if (Build.VERSION.SDK_INT >= 21) {
                MediaSessionImplApi21 mediaSessionImplApi21 = new MediaSessionImplApi21(context, str, bundle);
                this.f288b = mediaSessionImplApi21;
                mo363a(new AbstractC0147a() {
                    /* class android.support.v4.media.session.MediaSessionCompat.C01402 */
                });
                mediaSessionImplApi21.mo369a(pendingIntent);
            } else if (Build.VERSION.SDK_INT >= 19) {
                this.f288b = new C0155d(context, str, componentName, pendingIntent);
            } else if (Build.VERSION.SDK_INT >= 18) {
                this.f288b = new C0153c(context, str, componentName, pendingIntent);
            } else {
                this.f288b = new MediaSessionImplBase(context, str, componentName, pendingIntent);
            }
            this.f289c = new MediaControllerCompat(context, this);
            if (f287a == 0) {
                f287a = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
            }
        } else {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
    }
}
