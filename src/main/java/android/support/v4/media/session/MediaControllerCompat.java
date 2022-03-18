package android.support.v4.media.session;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.C0165a;
import android.support.v4.media.session.IMediaControllerCallback;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import android.view.KeyEvent;
import androidx.core.app.C0737e;
import com.huawei.hms.android.HwBuildEx;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public final class MediaControllerCompat {

    /* renamed from: a */
    private final AbstractC0134a f266a;

    /* renamed from: b */
    private final MediaSessionCompat.Token f267b;

    /* renamed from: c */
    private final HashSet<Callback> f268c = new HashSet<>();

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$a */
    interface AbstractC0134a {
        /* renamed from: a */
        PlaybackStateCompat mo355a();

        /* renamed from: a */
        boolean mo357a(KeyEvent keyEvent);
    }

    static class MediaControllerImplApi21 implements AbstractC0134a {

        /* renamed from: a */
        protected final Object f275a;

        /* renamed from: b */
        final Object f276b = new Object();

        /* renamed from: c */
        final MediaSessionCompat.Token f277c;

        /* renamed from: d */
        private final List<Callback> f278d = new ArrayList();

        /* renamed from: e */
        private HashMap<Callback, ExtraCallback> f279e = new HashMap<>();

        /* access modifiers changed from: private */
        public static class ExtraCallback extends Callback.StubCompat {
            @Override // android.support.v4.media.session.MediaControllerCompat.Callback.StubCompat, android.support.v4.media.session.IMediaControllerCallback
            public void onSessionDestroyed() throws RemoteException {
                throw new AssertionError();
            }

            ExtraCallback(Callback callback) {
                super(callback);
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.Callback.StubCompat, android.support.v4.media.session.IMediaControllerCallback
            public void onExtrasChanged(Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.Callback.StubCompat, android.support.v4.media.session.IMediaControllerCallback
            public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.Callback.StubCompat, android.support.v4.media.session.IMediaControllerCallback
            public void onQueueChanged(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.Callback.StubCompat, android.support.v4.media.session.IMediaControllerCallback
            public void onQueueTitleChanged(CharSequence charSequence) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.Callback.StubCompat, android.support.v4.media.session.IMediaControllerCallback
            public void onVolumeInfoChanged(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                throw new AssertionError();
            }
        }

        /* renamed from: c */
        private void m350c() {
            mo356a("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this));
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.AbstractC0134a
        /* renamed from: a */
        public PlaybackStateCompat mo355a() {
            if (this.f277c.mo411b() != null) {
                try {
                    return this.f277c.mo411b().getPlaybackState();
                } catch (RemoteException e) {
                    Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", e);
                }
            }
            Object a = C0165a.m517a(this.f275a);
            if (a != null) {
                return PlaybackStateCompat.m498a(a);
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo358b() {
            if (this.f277c.mo411b() != null) {
                for (Callback callback : this.f278d) {
                    ExtraCallback extraCallback = new ExtraCallback(callback);
                    this.f279e.put(callback, extraCallback);
                    callback.f271c = extraCallback;
                    try {
                        this.f277c.mo411b().registerCallbackListener(extraCallback);
                        callback.mo335a(13, null, null);
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                    }
                }
                this.f278d.clear();
            }
        }

        /* access modifiers changed from: private */
        public static class ExtraBinderRequestResultReceiver extends ResultReceiver {

            /* renamed from: a */
            private WeakReference<MediaControllerImplApi21> f280a;

            ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super(null);
                this.f280a = new WeakReference<>(mediaControllerImplApi21);
            }

            /* access modifiers changed from: protected */
            public void onReceiveResult(int i, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = this.f280a.get();
                if (mediaControllerImplApi21 != null && bundle != null) {
                    synchronized (mediaControllerImplApi21.f276b) {
                        mediaControllerImplApi21.f277c.mo410a(IMediaSession.Stub.asInterface(C0737e.m3594a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                        mediaControllerImplApi21.f277c.mo409a(bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE"));
                        mediaControllerImplApi21.mo358b();
                    }
                }
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.AbstractC0134a
        /* renamed from: a */
        public boolean mo357a(KeyEvent keyEvent) {
            return C0165a.m519a(this.f275a, keyEvent);
        }

        public MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) throws RemoteException {
            this.f277c = token;
            Object a = C0165a.m515a(context, token.mo408a());
            this.f275a = a;
            if (a == null) {
                throw new RemoteException();
            } else if (token.mo411b() == null) {
                m350c();
            }
        }

        /* renamed from: a */
        public void mo356a(String str, Bundle bundle, ResultReceiver resultReceiver) {
            C0165a.m518a(this.f275a, str, bundle, resultReceiver);
        }
    }

    /* renamed from: a */
    public PlaybackStateCompat mo331a() {
        return this.f266a.mo355a();
    }

    public static abstract class Callback implements IBinder.DeathRecipient {

        /* renamed from: a */
        final Object f269a;

        /* renamed from: b */
        HandlerC0132a f270b;

        /* renamed from: c */
        IMediaControllerCallback f271c;

        /* renamed from: a */
        public void mo333a() {
        }

        /* renamed from: a */
        public void mo334a(int i) {
        }

        /* renamed from: a */
        public void mo336a(Bundle bundle) {
        }

        /* renamed from: a */
        public void mo337a(MediaMetadataCompat mediaMetadataCompat) {
        }

        /* renamed from: a */
        public void mo338a(C0138e eVar) {
        }

        /* renamed from: a */
        public void mo339a(PlaybackStateCompat playbackStateCompat) {
        }

        /* renamed from: a */
        public void mo340a(CharSequence charSequence) {
        }

        /* renamed from: a */
        public void mo341a(String str, Bundle bundle) {
        }

        /* renamed from: a */
        public void mo342a(List<MediaSessionCompat.QueueItem> list) {
        }

        /* renamed from: a */
        public void mo343a(boolean z) {
        }

        /* renamed from: b */
        public void mo344b() {
        }

        /* renamed from: b */
        public void mo345b(int i) {
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$Callback$b */
        private static class C0133b implements C0165a.AbstractC0166a {

            /* renamed from: a */
            private final WeakReference<Callback> f274a;

            @Override // android.support.v4.media.session.C0165a.AbstractC0166a
            /* renamed from: a */
            public void mo347a() {
                Callback callback = this.f274a.get();
                if (callback != null) {
                    callback.mo344b();
                }
            }

            C0133b(Callback callback) {
                this.f274a = new WeakReference<>(callback);
            }

            @Override // android.support.v4.media.session.C0165a.AbstractC0166a
            /* renamed from: b */
            public void mo354b(Object obj) {
                Callback callback = this.f274a.get();
                if (callback != null) {
                    callback.mo337a(MediaMetadataCompat.m269a(obj));
                }
            }

            @Override // android.support.v4.media.session.C0165a.AbstractC0166a
            /* renamed from: a */
            public void mo349a(Bundle bundle) {
                Callback callback = this.f274a.get();
                if (callback != null) {
                    callback.mo336a(bundle);
                }
            }

            @Override // android.support.v4.media.session.C0165a.AbstractC0166a
            /* renamed from: a */
            public void mo350a(CharSequence charSequence) {
                Callback callback = this.f274a.get();
                if (callback != null) {
                    callback.mo340a(charSequence);
                }
            }

            @Override // android.support.v4.media.session.C0165a.AbstractC0166a
            /* renamed from: a */
            public void mo351a(Object obj) {
                Callback callback = this.f274a.get();
                if (callback != null && callback.f271c == null) {
                    callback.mo339a(PlaybackStateCompat.m498a(obj));
                }
            }

            @Override // android.support.v4.media.session.C0165a.AbstractC0166a
            /* renamed from: a */
            public void mo353a(List<?> list) {
                Callback callback = this.f274a.get();
                if (callback != null) {
                    callback.mo342a(MediaSessionCompat.QueueItem.m403a(list));
                }
            }

            @Override // android.support.v4.media.session.C0165a.AbstractC0166a
            /* renamed from: a */
            public void mo352a(String str, Bundle bundle) {
                Callback callback = this.f274a.get();
                if (callback == null) {
                    return;
                }
                if (callback.f271c == null || Build.VERSION.SDK_INT >= 23) {
                    callback.mo341a(str, bundle);
                }
            }

            @Override // android.support.v4.media.session.C0165a.AbstractC0166a
            /* renamed from: a */
            public void mo348a(int i, int i2, int i3, int i4, int i5) {
                Callback callback = this.f274a.get();
                if (callback != null) {
                    callback.mo338a(new C0138e(i, i2, i3, i4, i5));
                }
            }
        }

        private static class StubCompat extends IMediaControllerCallback.Stub {
            private final WeakReference<Callback> mCallback;

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onShuffleModeChangedRemoved(boolean z) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onSessionDestroyed() throws RemoteException {
                Callback callback = this.mCallback.get();
                if (callback != null) {
                    callback.mo335a(8, null, null);
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onSessionReady() throws RemoteException {
                Callback callback = this.mCallback.get();
                if (callback != null) {
                    callback.mo335a(13, null, null);
                }
            }

            StubCompat(Callback callback) {
                this.mCallback = new WeakReference<>(callback);
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onExtrasChanged(Bundle bundle) throws RemoteException {
                Callback callback = this.mCallback.get();
                if (callback != null) {
                    callback.mo335a(7, bundle, null);
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                Callback callback = this.mCallback.get();
                if (callback != null) {
                    callback.mo335a(3, mediaMetadataCompat, null);
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) throws RemoteException {
                Callback callback = this.mCallback.get();
                if (callback != null) {
                    callback.mo335a(2, playbackStateCompat, null);
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onQueueChanged(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                Callback callback = this.mCallback.get();
                if (callback != null) {
                    callback.mo335a(5, list, null);
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onQueueTitleChanged(CharSequence charSequence) throws RemoteException {
                Callback callback = this.mCallback.get();
                if (callback != null) {
                    callback.mo335a(6, charSequence, null);
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onCaptioningEnabledChanged(boolean z) throws RemoteException {
                Callback callback = this.mCallback.get();
                if (callback != null) {
                    callback.mo335a(11, Boolean.valueOf(z), null);
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onRepeatModeChanged(int i) throws RemoteException {
                Callback callback = this.mCallback.get();
                if (callback != null) {
                    callback.mo335a(9, Integer.valueOf(i), null);
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onShuffleModeChanged(int i) throws RemoteException {
                Callback callback = this.mCallback.get();
                if (callback != null) {
                    callback.mo335a(12, Integer.valueOf(i), null);
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onVolumeInfoChanged(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                C0138e eVar;
                Callback callback = this.mCallback.get();
                if (callback != null) {
                    if (parcelableVolumeInfo != null) {
                        eVar = new C0138e(parcelableVolumeInfo.f360a, parcelableVolumeInfo.f361b, parcelableVolumeInfo.f362c, parcelableVolumeInfo.f363d, parcelableVolumeInfo.f364e);
                    } else {
                        eVar = null;
                    }
                    callback.mo335a(4, eVar, null);
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onEvent(String str, Bundle bundle) throws RemoteException {
                Callback callback = this.mCallback.get();
                if (callback != null) {
                    callback.mo335a(1, str, bundle);
                }
            }
        }

        public Callback() {
            if (Build.VERSION.SDK_INT >= 21) {
                this.f269a = C0165a.m516a((C0165a.AbstractC0166a) new C0133b(this));
                return;
            }
            StubCompat stubCompat = new StubCompat(this);
            this.f271c = stubCompat;
            this.f269a = stubCompat;
        }

        /* access modifiers changed from: private */
        /* renamed from: android.support.v4.media.session.MediaControllerCompat$Callback$a */
        public class HandlerC0132a extends Handler {

            /* renamed from: a */
            boolean f272a;

            /* renamed from: b */
            final /* synthetic */ Callback f273b;

            public void handleMessage(Message message) {
                if (this.f272a) {
                    switch (message.what) {
                        case 1:
                            Bundle data = message.getData();
                            MediaSessionCompat.m360a(data);
                            this.f273b.mo341a((String) message.obj, data);
                            return;
                        case 2:
                            this.f273b.mo339a((PlaybackStateCompat) message.obj);
                            return;
                        case 3:
                            this.f273b.mo337a((MediaMetadataCompat) message.obj);
                            return;
                        case 4:
                            this.f273b.mo338a((C0138e) message.obj);
                            return;
                        case 5:
                            this.f273b.mo342a((List) message.obj);
                            return;
                        case 6:
                            this.f273b.mo340a((CharSequence) message.obj);
                            return;
                        case 7:
                            Bundle bundle = (Bundle) message.obj;
                            MediaSessionCompat.m360a(bundle);
                            this.f273b.mo336a(bundle);
                            return;
                        case 8:
                            this.f273b.mo344b();
                            return;
                        case 9:
                            this.f273b.mo334a(((Integer) message.obj).intValue());
                            return;
                        case 10:
                        default:
                            return;
                        case 11:
                            this.f273b.mo343a(((Boolean) message.obj).booleanValue());
                            return;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            this.f273b.mo345b(((Integer) message.obj).intValue());
                            return;
                        case 13:
                            this.f273b.mo333a();
                            return;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo335a(int i, Object obj, Bundle bundle) {
            HandlerC0132a aVar = this.f270b;
            if (aVar != null) {
                Message obtainMessage = aVar.obtainMessage(i, obj);
                obtainMessage.setData(bundle);
                obtainMessage.sendToTarget();
            }
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$d */
    static class C0137d implements AbstractC0134a {

        /* renamed from: a */
        private IMediaSession f281a;

        @Override // android.support.v4.media.session.MediaControllerCompat.AbstractC0134a
        /* renamed from: a */
        public PlaybackStateCompat mo355a() {
            try {
                return this.f281a.getPlaybackState();
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", e);
                return null;
            }
        }

        public C0137d(MediaSessionCompat.Token token) {
            this.f281a = IMediaSession.Stub.asInterface((IBinder) token.mo408a());
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.AbstractC0134a
        /* renamed from: a */
        public boolean mo357a(KeyEvent keyEvent) {
            if (keyEvent != null) {
                try {
                    this.f281a.sendMediaButton(keyEvent);
                    return false;
                } catch (RemoteException e) {
                    Log.e("MediaControllerCompat", "Dead object in dispatchMediaButtonEvent.", e);
                    return false;
                }
            } else {
                throw new IllegalArgumentException("event may not be null.");
            }
        }
    }

    /* renamed from: a */
    public boolean mo332a(KeyEvent keyEvent) {
        if (keyEvent != null) {
            return this.f266a.mo357a(keyEvent);
        }
        throw new IllegalArgumentException("KeyEvent may not be null");
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$b */
    static class C0135b extends MediaControllerImplApi21 {
        public C0135b(Context context, MediaSessionCompat.Token token) throws RemoteException {
            super(context, token);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$c */
    static class C0136c extends C0135b {
        public C0136c(Context context, MediaSessionCompat.Token token) throws RemoteException {
            super(context, token);
        }
    }

    public MediaControllerCompat(Context context, MediaSessionCompat.Token token) throws RemoteException {
        if (token != null) {
            this.f267b = token;
            if (Build.VERSION.SDK_INT >= 24) {
                this.f266a = new C0136c(context, token);
            } else if (Build.VERSION.SDK_INT >= 23) {
                this.f266a = new C0135b(context, token);
            } else if (Build.VERSION.SDK_INT >= 21) {
                this.f266a = new MediaControllerImplApi21(context, token);
            } else {
                this.f266a = new C0137d(token);
            }
        } else {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
    }

    public MediaControllerCompat(Context context, MediaSessionCompat mediaSessionCompat) {
        AbstractC0134a mediaControllerImplApi21;
        if (mediaSessionCompat != null) {
            MediaSessionCompat.Token a = mediaSessionCompat.mo360a();
            this.f267b = a;
            C0137d dVar = null;
            try {
                if (Build.VERSION.SDK_INT >= 24) {
                    mediaControllerImplApi21 = new C0136c(context, a);
                } else if (Build.VERSION.SDK_INT >= 23) {
                    mediaControllerImplApi21 = new C0135b(context, a);
                } else if (Build.VERSION.SDK_INT >= 21) {
                    mediaControllerImplApi21 = new MediaControllerImplApi21(context, a);
                } else {
                    dVar = new C0137d(a);
                    this.f266a = dVar;
                    return;
                }
                dVar = mediaControllerImplApi21;
            } catch (RemoteException e) {
                Log.w("MediaControllerCompat", "Failed to create MediaControllerImpl.", e);
            }
            this.f266a = dVar;
            return;
        }
        throw new IllegalArgumentException("session must not be null");
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$e */
    public static final class C0138e {

        /* renamed from: a */
        private final int f282a;

        /* renamed from: b */
        private final int f283b;

        /* renamed from: c */
        private final int f284c;

        /* renamed from: d */
        private final int f285d;

        /* renamed from: e */
        private final int f286e;

        C0138e(int i, int i2, int i3, int i4, int i5) {
            this.f282a = i;
            this.f283b = i2;
            this.f284c = i3;
            this.f285d = i4;
            this.f286e = i5;
        }
    }
}
