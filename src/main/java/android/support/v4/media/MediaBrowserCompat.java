package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.media.C0118a;
import android.support.v4.media.C0124b;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.ArrayMap;
import androidx.core.app.C0737e;
import androidx.media.C1229d;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class MediaBrowserCompat {

    /* renamed from: a */
    static final boolean f179a = Log.isLoggable("MediaBrowserCompat", 3);

    /* renamed from: b */
    private final AbstractC0096e f180b;

    /* renamed from: android.support.v4.media.MediaBrowserCompat$c */
    public static abstract class AbstractC0094c {
        /* renamed from: a */
        public void mo176a(String str, Bundle bundle, Bundle bundle2) {
        }

        /* renamed from: b */
        public void mo177b(String str, Bundle bundle, Bundle bundle2) {
        }

        /* renamed from: c */
        public void mo178c(String str, Bundle bundle, Bundle bundle2) {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$d */
    public static abstract class AbstractC0095d {
        /* renamed from: a */
        public void mo179a(MediaItem mediaItem) {
        }

        /* renamed from: a */
        public void mo180a(String str) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v4.media.MediaBrowserCompat$e */
    public interface AbstractC0096e {
        /* renamed from: d */
        void mo181d();

        /* renamed from: e */
        void mo182e();

        /* renamed from: f */
        MediaSessionCompat.Token mo183f();
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$j */
    interface AbstractC0106j {
        /* renamed from: a */
        void mo184a(Messenger messenger);

        /* renamed from: a */
        void mo185a(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle);

        /* renamed from: a */
        void mo186a(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2);
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$k */
    public static abstract class AbstractC0107k {
        /* renamed from: a */
        public void mo197a(String str, Bundle bundle) {
        }

        /* renamed from: a */
        public void mo198a(String str, Bundle bundle, List<MediaItem> list) {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$m */
    private static class C0109m {

        /* renamed from: a */
        private final List<AbstractC0110n> f230a = new ArrayList();

        /* renamed from: b */
        private final List<Bundle> f231b = new ArrayList();

        /* renamed from: a */
        public List<Bundle> mo205a() {
            return this.f231b;
        }

        /* renamed from: b */
        public List<AbstractC0110n> mo206b() {
            return this.f230a;
        }

        /* renamed from: a */
        public AbstractC0110n mo204a(Bundle bundle) {
            for (int i = 0; i < this.f231b.size(); i++) {
                if (C1229d.m5600a(this.f231b.get(i), bundle)) {
                    return this.f230a.get(i);
                }
            }
            return null;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$f */
    static class C0097f implements C0091b.AbstractC0092a, AbstractC0096e, AbstractC0106j {

        /* renamed from: a */
        final Context f196a;

        /* renamed from: b */
        protected final Object f197b;

        /* renamed from: c */
        protected final Bundle f198c;

        /* renamed from: d */
        protected final HandlerC0090a f199d = new HandlerC0090a(this);

        /* renamed from: e */
        protected int f200e;

        /* renamed from: f */
        protected C0108l f201f;

        /* renamed from: g */
        protected Messenger f202g;

        /* renamed from: h */
        private final ArrayMap<String, C0109m> f203h = new ArrayMap<>();

        /* renamed from: i */
        private MediaSessionCompat.Token f204i;

        /* renamed from: j */
        private Bundle f205j;

        @Override // android.support.v4.media.MediaBrowserCompat.AbstractC0106j
        /* renamed from: a */
        public void mo184a(Messenger messenger) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.AbstractC0106j
        /* renamed from: a */
        public void mo185a(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.C0091b.AbstractC0092a
        /* renamed from: c */
        public void mo172c() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.AbstractC0096e
        /* renamed from: d */
        public void mo181d() {
            C0118a.m291a(this.f197b);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.C0091b.AbstractC0092a
        /* renamed from: b */
        public void mo171b() {
            this.f201f = null;
            this.f202g = null;
            this.f204i = null;
            this.f199d.mo164a(null);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.AbstractC0096e
        /* renamed from: e */
        public void mo182e() {
            Messenger messenger;
            C0108l lVar = this.f201f;
            if (!(lVar == null || (messenger = this.f202g) == null)) {
                try {
                    lVar.mo203b(messenger);
                } catch (RemoteException unused) {
                    Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
                }
            }
            C0118a.m292b(this.f197b);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.AbstractC0096e
        /* renamed from: f */
        public MediaSessionCompat.Token mo183f() {
            if (this.f204i == null) {
                this.f204i = MediaSessionCompat.Token.m409a(C0118a.m294d(this.f197b));
            }
            return this.f204i;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.C0091b.AbstractC0092a
        /* renamed from: a */
        public void mo170a() {
            Bundle c = C0118a.m293c(this.f197b);
            if (c != null) {
                this.f200e = c.getInt("extra_service_version", 0);
                IBinder a = C0737e.m3594a(c, "extra_messenger");
                if (a != null) {
                    this.f201f = new C0108l(a, this.f198c);
                    Messenger messenger = new Messenger(this.f199d);
                    this.f202g = messenger;
                    this.f199d.mo164a(messenger);
                    try {
                        this.f201f.mo202b(this.f196a, this.f202g);
                    } catch (RemoteException unused) {
                        Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                    }
                }
                IMediaSession asInterface = IMediaSession.Stub.asInterface(C0737e.m3594a(c, "extra_session_binder"));
                if (asInterface != null) {
                    this.f204i = MediaSessionCompat.Token.m410a(C0118a.m294d(this.f197b), asInterface);
                }
            }
        }

        C0097f(Context context, ComponentName componentName, C0091b bVar, Bundle bundle) {
            Bundle bundle2;
            this.f196a = context;
            if (bundle == null) {
                bundle2 = new Bundle();
            }
            this.f198c = bundle2;
            bundle2.putInt("extra_client_version", 1);
            bVar.mo167a(this);
            this.f197b = C0118a.m288a(context, componentName, bVar.f193a, bundle2);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.AbstractC0106j
        /* renamed from: a */
        public void mo186a(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
            if (this.f202g == messenger) {
                C0109m mVar = this.f203h.get(str);
                if (mVar != null) {
                    AbstractC0110n a = mVar.mo204a(bundle);
                    if (a == null) {
                        return;
                    }
                    if (bundle == null) {
                        if (list == null) {
                            a.mo207a(str);
                            return;
                        }
                        this.f205j = bundle2;
                        a.mo209a(str, list);
                        this.f205j = null;
                    } else if (list == null) {
                        a.mo208a(str, bundle);
                    } else {
                        this.f205j = bundle2;
                        a.mo210a(str, list, bundle);
                        this.f205j = null;
                    }
                } else if (MediaBrowserCompat.f179a) {
                    Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + str);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo153a() {
        this.f180b.mo181d();
    }

    /* renamed from: b */
    public void mo154b() {
        this.f180b.mo182e();
    }

    /* renamed from: c */
    public MediaSessionCompat.Token mo155c() {
        return this.f180b.mo183f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v4.media.MediaBrowserCompat$i */
    public static class C0100i implements AbstractC0096e, AbstractC0106j {

        /* renamed from: a */
        final Context f206a;

        /* renamed from: b */
        final ComponentName f207b;

        /* renamed from: c */
        final C0091b f208c;

        /* renamed from: d */
        final Bundle f209d;

        /* renamed from: e */
        final HandlerC0090a f210e = new HandlerC0090a(this);

        /* renamed from: f */
        int f211f = 1;

        /* renamed from: g */
        ServiceConnectionC0103a f212g;

        /* renamed from: h */
        C0108l f213h;

        /* renamed from: i */
        Messenger f214i;

        /* renamed from: j */
        private final ArrayMap<String, C0109m> f215j = new ArrayMap<>();

        /* renamed from: k */
        private String f216k;

        /* renamed from: l */
        private MediaSessionCompat.Token f217l;

        /* renamed from: m */
        private Bundle f218m;

        /* renamed from: n */
        private Bundle f219n;

        /* renamed from: b */
        public boolean mo188b() {
            if (this.f211f == 3) {
                return true;
            }
            return false;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.AbstractC0096e
        /* renamed from: e */
        public void mo182e() {
            this.f211f = 0;
            this.f210e.post(new Runnable() {
                /* class android.support.v4.media.MediaBrowserCompat.C0100i.RunnableC01022 */

                public void run() {
                    if (C0100i.this.f214i != null) {
                        try {
                            C0100i.this.f213h.mo200a(C0100i.this.f214i);
                        } catch (RemoteException unused) {
                            Log.w("MediaBrowserCompat", "RemoteException during connect for " + C0100i.this.f207b);
                        }
                    }
                    int i = C0100i.this.f211f;
                    C0100i.this.mo187a();
                    if (i != 0) {
                        C0100i.this.f211f = i;
                    }
                    if (MediaBrowserCompat.f179a) {
                        Log.d("MediaBrowserCompat", "disconnect...");
                        C0100i.this.mo189c();
                    }
                }
            });
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo187a() {
            ServiceConnectionC0103a aVar = this.f212g;
            if (aVar != null) {
                this.f206a.unbindService(aVar);
            }
            this.f211f = 1;
            this.f212g = null;
            this.f213h = null;
            this.f214i = null;
            this.f210e.mo164a(null);
            this.f216k = null;
            this.f217l = null;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.AbstractC0096e
        /* renamed from: d */
        public void mo181d() {
            int i = this.f211f;
            if (i == 0 || i == 1) {
                this.f211f = 2;
                this.f210e.post(new Runnable() {
                    /* class android.support.v4.media.MediaBrowserCompat.C0100i.RunnableC01011 */

                    public void run() {
                        if (C0100i.this.f211f != 0) {
                            C0100i.this.f211f = 2;
                            if (MediaBrowserCompat.f179a && C0100i.this.f212g != null) {
                                throw new RuntimeException("mServiceConnection should be null. Instead it is " + C0100i.this.f212g);
                            } else if (C0100i.this.f213h != null) {
                                throw new RuntimeException("mServiceBinderWrapper should be null. Instead it is " + C0100i.this.f213h);
                            } else if (C0100i.this.f214i == null) {
                                Intent intent = new Intent("android.media.browse.MediaBrowserService");
                                intent.setComponent(C0100i.this.f207b);
                                C0100i iVar = C0100i.this;
                                iVar.f212g = new ServiceConnectionC0103a();
                                boolean z = false;
                                try {
                                    z = C0100i.this.f206a.bindService(intent, C0100i.this.f212g, 1);
                                } catch (Exception unused) {
                                    Log.e("MediaBrowserCompat", "Failed binding to service " + C0100i.this.f207b);
                                }
                                if (!z) {
                                    C0100i.this.mo187a();
                                    C0100i.this.f208c.mo169c();
                                }
                                if (MediaBrowserCompat.f179a) {
                                    Log.d("MediaBrowserCompat", "connect...");
                                    C0100i.this.mo189c();
                                }
                            } else {
                                throw new RuntimeException("mCallbacksMessenger should be null. Instead it is " + C0100i.this.f214i);
                            }
                        }
                    }
                });
                return;
            }
            throw new IllegalStateException("connect() called while neigther disconnecting nor disconnected (state=" + m219a(this.f211f) + ")");
        }

        @Override // android.support.v4.media.MediaBrowserCompat.AbstractC0096e
        /* renamed from: f */
        public MediaSessionCompat.Token mo183f() {
            if (mo188b()) {
                return this.f217l;
            }
            throw new IllegalStateException("getSessionToken() called while not connected(state=" + this.f211f + ")");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo189c() {
            Log.d("MediaBrowserCompat", "MediaBrowserCompat...");
            Log.d("MediaBrowserCompat", "  mServiceComponent=" + this.f207b);
            Log.d("MediaBrowserCompat", "  mCallback=" + this.f208c);
            Log.d("MediaBrowserCompat", "  mRootHints=" + this.f209d);
            Log.d("MediaBrowserCompat", "  mState=" + m219a(this.f211f));
            Log.d("MediaBrowserCompat", "  mServiceConnection=" + this.f212g);
            Log.d("MediaBrowserCompat", "  mServiceBinderWrapper=" + this.f213h);
            Log.d("MediaBrowserCompat", "  mCallbacksMessenger=" + this.f214i);
            Log.d("MediaBrowserCompat", "  mRootId=" + this.f216k);
            Log.d("MediaBrowserCompat", "  mMediaSessionToken=" + this.f217l);
        }

        /* access modifiers changed from: private */
        /* renamed from: android.support.v4.media.MediaBrowserCompat$i$a */
        public class ServiceConnectionC0103a implements ServiceConnection {
            ServiceConnectionC0103a() {
            }

            public void onServiceDisconnected(final ComponentName componentName) {
                m230a(new Runnable() {
                    /* class android.support.v4.media.MediaBrowserCompat.C0100i.ServiceConnectionC0103a.RunnableC01052 */

                    public void run() {
                        if (MediaBrowserCompat.f179a) {
                            Log.d("MediaBrowserCompat", "MediaServiceConnection.onServiceDisconnected name=" + componentName + " this=" + this + " mServiceConnection=" + C0100i.this.f212g);
                            C0100i.this.mo189c();
                        }
                        if (ServiceConnectionC0103a.this.mo192a("onServiceDisconnected")) {
                            C0100i.this.f213h = null;
                            C0100i.this.f214i = null;
                            C0100i.this.f210e.mo164a(null);
                            C0100i.this.f211f = 4;
                            C0100i.this.f208c.mo168b();
                        }
                    }
                });
            }

            /* renamed from: a */
            private void m230a(Runnable runnable) {
                if (Thread.currentThread() == C0100i.this.f210e.getLooper().getThread()) {
                    runnable.run();
                } else {
                    C0100i.this.f210e.post(runnable);
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public boolean mo192a(String str) {
                if (C0100i.this.f212g == this && C0100i.this.f211f != 0 && C0100i.this.f211f != 1) {
                    return true;
                }
                if (C0100i.this.f211f == 0 || C0100i.this.f211f == 1) {
                    return false;
                }
                Log.i("MediaBrowserCompat", str + " for " + C0100i.this.f207b + " with mServiceConnection=" + C0100i.this.f212g + " this=" + this);
                return false;
            }

            public void onServiceConnected(final ComponentName componentName, final IBinder iBinder) {
                m230a(new Runnable() {
                    /* class android.support.v4.media.MediaBrowserCompat.C0100i.ServiceConnectionC0103a.RunnableC01041 */

                    public void run() {
                        if (MediaBrowserCompat.f179a) {
                            Log.d("MediaBrowserCompat", "MediaServiceConnection.onServiceConnected name=" + componentName + " binder=" + iBinder);
                            C0100i.this.mo189c();
                        }
                        if (ServiceConnectionC0103a.this.mo192a("onServiceConnected")) {
                            C0100i.this.f213h = new C0108l(iBinder, C0100i.this.f209d);
                            C0100i.this.f214i = new Messenger(C0100i.this.f210e);
                            C0100i.this.f210e.mo164a(C0100i.this.f214i);
                            C0100i.this.f211f = 2;
                            try {
                                if (MediaBrowserCompat.f179a) {
                                    Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
                                    C0100i.this.mo189c();
                                }
                                C0100i.this.f213h.mo199a(C0100i.this.f206a, C0100i.this.f214i);
                            } catch (RemoteException unused) {
                                Log.w("MediaBrowserCompat", "RemoteException during connect for " + C0100i.this.f207b);
                                if (MediaBrowserCompat.f179a) {
                                    Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
                                    C0100i.this.mo189c();
                                }
                            }
                        }
                    }
                });
            }
        }

        /* renamed from: a */
        private static String m219a(int i) {
            if (i == 0) {
                return "CONNECT_STATE_DISCONNECTING";
            }
            if (i == 1) {
                return "CONNECT_STATE_DISCONNECTED";
            }
            if (i == 2) {
                return "CONNECT_STATE_CONNECTING";
            }
            if (i == 3) {
                return "CONNECT_STATE_CONNECTED";
            }
            if (i == 4) {
                return "CONNECT_STATE_SUSPENDED";
            }
            return "UNKNOWN/" + i;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.AbstractC0106j
        /* renamed from: a */
        public void mo184a(Messenger messenger) {
            Log.e("MediaBrowserCompat", "onConnectFailed for " + this.f207b);
            if (m220a(messenger, "onConnectFailed")) {
                if (this.f211f != 2) {
                    Log.w("MediaBrowserCompat", "onConnect from service while mState=" + m219a(this.f211f) + "... ignoring");
                    return;
                }
                mo187a();
                this.f208c.mo169c();
            }
        }

        /* renamed from: a */
        private boolean m220a(Messenger messenger, String str) {
            int i;
            if (this.f214i == messenger && (i = this.f211f) != 0 && i != 1) {
                return true;
            }
            int i2 = this.f211f;
            if (i2 == 0 || i2 == 1) {
                return false;
            }
            Log.i("MediaBrowserCompat", str + " for " + this.f207b + " with mCallbacksMessenger=" + this.f214i + " this=" + this);
            return false;
        }

        public C0100i(Context context, ComponentName componentName, C0091b bVar, Bundle bundle) {
            Bundle bundle2;
            if (context == null) {
                throw new IllegalArgumentException("context must not be null");
            } else if (componentName == null) {
                throw new IllegalArgumentException("service component must not be null");
            } else if (bVar != null) {
                this.f206a = context;
                this.f207b = componentName;
                this.f208c = bVar;
                if (bundle == null) {
                    bundle2 = null;
                } else {
                    bundle2 = new Bundle(bundle);
                }
                this.f209d = bundle2;
            } else {
                throw new IllegalArgumentException("connection callback must not be null");
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.AbstractC0106j
        /* renamed from: a */
        public void mo185a(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
            if (m220a(messenger, "onConnect")) {
                if (this.f211f != 2) {
                    Log.w("MediaBrowserCompat", "onConnect from service while mState=" + m219a(this.f211f) + "... ignoring");
                    return;
                }
                this.f216k = str;
                this.f217l = token;
                this.f218m = bundle;
                this.f211f = 3;
                if (MediaBrowserCompat.f179a) {
                    Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
                    mo189c();
                }
                this.f208c.mo166a();
                try {
                    for (Map.Entry<String, C0109m> entry : this.f215j.entrySet()) {
                        String key = entry.getKey();
                        C0109m value = entry.getValue();
                        List<AbstractC0110n> b = value.mo206b();
                        List<Bundle> a = value.mo205a();
                        for (int i = 0; i < b.size(); i++) {
                            this.f213h.mo201a(key, b.get(i).f233b, a.get(i), this.f214i);
                        }
                    }
                } catch (RemoteException unused) {
                    Log.d("MediaBrowserCompat", "addSubscription failed with RemoteException.");
                }
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.AbstractC0106j
        /* renamed from: a */
        public void mo186a(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
            if (m220a(messenger, "onLoadChildren")) {
                if (MediaBrowserCompat.f179a) {
                    Log.d("MediaBrowserCompat", "onLoadChildren for " + this.f207b + " id=" + str);
                }
                C0109m mVar = this.f215j.get(str);
                if (mVar != null) {
                    AbstractC0110n a = mVar.mo204a(bundle);
                    if (a == null) {
                        return;
                    }
                    if (bundle == null) {
                        if (list == null) {
                            a.mo207a(str);
                            return;
                        }
                        this.f219n = bundle2;
                        a.mo209a(str, list);
                        this.f219n = null;
                    } else if (list == null) {
                        a.mo208a(str, bundle);
                    } else {
                        this.f219n = bundle2;
                        a.mo210a(str, list, bundle);
                        this.f219n = null;
                    }
                } else if (MediaBrowserCompat.f179a) {
                    Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + str);
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$b */
    public static class C0091b {

        /* renamed from: a */
        final Object f193a;

        /* renamed from: b */
        AbstractC0092a f194b;

        /* access modifiers changed from: package-private */
        /* renamed from: android.support.v4.media.MediaBrowserCompat$b$a */
        public interface AbstractC0092a {
            /* renamed from: a */
            void mo170a();

            /* renamed from: b */
            void mo171b();

            /* renamed from: c */
            void mo172c();
        }

        /* renamed from: a */
        public void mo166a() {
        }

        /* renamed from: b */
        public void mo168b() {
        }

        /* renamed from: c */
        public void mo169c() {
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$b$b */
        private class C0093b implements C0118a.AbstractC0119a {
            @Override // android.support.v4.media.C0118a.AbstractC0119a
            /* renamed from: a */
            public void mo173a() {
                if (C0091b.this.f194b != null) {
                    C0091b.this.f194b.mo170a();
                }
                C0091b.this.mo166a();
            }

            @Override // android.support.v4.media.C0118a.AbstractC0119a
            /* renamed from: b */
            public void mo174b() {
                if (C0091b.this.f194b != null) {
                    C0091b.this.f194b.mo171b();
                }
                C0091b.this.mo168b();
            }

            @Override // android.support.v4.media.C0118a.AbstractC0119a
            /* renamed from: c */
            public void mo175c() {
                if (C0091b.this.f194b != null) {
                    C0091b.this.f194b.mo172c();
                }
                C0091b.this.mo169c();
            }

            C0093b() {
            }
        }

        public C0091b() {
            if (Build.VERSION.SDK_INT >= 21) {
                this.f193a = C0118a.m289a((C0118a.AbstractC0119a) new C0093b());
            } else {
                this.f193a = null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo167a(AbstractC0092a aVar) {
            this.f194b = aVar;
        }
    }

    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new Parcelable.Creator<MediaItem>() {
            /* class android.support.v4.media.MediaBrowserCompat.MediaItem.C00891 */

            /* renamed from: a */
            public MediaItem[] newArray(int i) {
                return new MediaItem[i];
            }

            /* renamed from: a */
            public MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }
        };

        /* renamed from: a */
        private final int f186a;

        /* renamed from: b */
        private final MediaDescriptionCompat f187b;

        @Retention(RetentionPolicy.SOURCE)
        public @interface Flags {
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaItem{" + "mFlags=" + this.f186a + ", mDescription=" + this.f187b + '}';
        }

        MediaItem(Parcel parcel) {
            this.f186a = parcel.readInt();
            this.f187b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }

        /* renamed from: a */
        public static MediaItem m186a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            return new MediaItem(MediaDescriptionCompat.m255a(C0118a.C0121c.m299b(obj)), C0118a.C0121c.m298a(obj));
        }

        /* renamed from: a */
        public static List<MediaItem> m187a(List<?> list) {
            if (list == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(m186a(it.next()));
            }
            return arrayList;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f186a);
            this.f187b.writeToParcel(parcel, i);
        }

        public MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("description cannot be null");
            } else if (!TextUtils.isEmpty(mediaDescriptionCompat.mo216a())) {
                this.f186a = i;
                this.f187b = mediaDescriptionCompat;
            } else {
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$n */
    public static abstract class AbstractC0110n {

        /* renamed from: a */
        final Object f232a;

        /* renamed from: b */
        final IBinder f233b = new Binder();

        /* renamed from: c */
        WeakReference<C0109m> f234c;

        /* renamed from: a */
        public void mo207a(String str) {
        }

        /* renamed from: a */
        public void mo208a(String str, Bundle bundle) {
        }

        /* renamed from: a */
        public void mo209a(String str, List<MediaItem> list) {
        }

        /* renamed from: a */
        public void mo210a(String str, List<MediaItem> list, Bundle bundle) {
        }

        public AbstractC0110n() {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f232a = C0124b.m302a(new C0112b());
            } else if (Build.VERSION.SDK_INT >= 21) {
                this.f232a = C0118a.m290a((C0118a.AbstractC0122d) new C0111a());
            } else {
                this.f232a = null;
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$n$a */
        private class C0111a implements C0118a.AbstractC0122d {
            C0111a() {
            }

            @Override // android.support.v4.media.C0118a.AbstractC0122d
            /* renamed from: a */
            public void mo212a(String str) {
                AbstractC0110n.this.mo207a(str);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public List<MediaItem> mo211a(List<MediaItem> list, Bundle bundle) {
                if (list == null) {
                    return null;
                }
                int i = bundle.getInt("android.media.browse.extra.PAGE", -1);
                int i2 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                if (i == -1 && i2 == -1) {
                    return list;
                }
                int i3 = i2 * i;
                int i4 = i3 + i2;
                if (i < 0 || i2 < 1 || i3 >= list.size()) {
                    return Collections.emptyList();
                }
                if (i4 > list.size()) {
                    i4 = list.size();
                }
                return list.subList(i3, i4);
            }

            @Override // android.support.v4.media.C0118a.AbstractC0122d
            /* renamed from: a */
            public void mo213a(String str, List<?> list) {
                C0109m mVar;
                if (AbstractC0110n.this.f234c == null) {
                    mVar = null;
                } else {
                    mVar = AbstractC0110n.this.f234c.get();
                }
                if (mVar == null) {
                    AbstractC0110n.this.mo209a(str, MediaItem.m187a(list));
                    return;
                }
                List<MediaItem> a = MediaItem.m187a(list);
                List<AbstractC0110n> b = mVar.mo206b();
                List<Bundle> a2 = mVar.mo205a();
                for (int i = 0; i < b.size(); i++) {
                    Bundle bundle = a2.get(i);
                    if (bundle == null) {
                        AbstractC0110n.this.mo209a(str, a);
                    } else {
                        AbstractC0110n.this.mo210a(str, mo211a(a, bundle), bundle);
                    }
                }
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$n$b */
        private class C0112b extends C0111a implements C0124b.AbstractC0125a {
            C0112b() {
                super();
            }

            @Override // android.support.v4.media.C0124b.AbstractC0125a
            /* renamed from: a */
            public void mo214a(String str, Bundle bundle) {
                AbstractC0110n.this.mo208a(str, bundle);
            }

            @Override // android.support.v4.media.C0124b.AbstractC0125a
            /* renamed from: a */
            public void mo215a(String str, List<?> list, Bundle bundle) {
                AbstractC0110n.this.mo210a(str, MediaItem.m187a(list), bundle);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.v4.media.MediaBrowserCompat$a */
    public static class HandlerC0090a extends Handler {

        /* renamed from: a */
        private final WeakReference<AbstractC0106j> f191a;

        /* renamed from: b */
        private WeakReference<Messenger> f192b;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo164a(Messenger messenger) {
            this.f192b = new WeakReference<>(messenger);
        }

        HandlerC0090a(AbstractC0106j jVar) {
            this.f191a = new WeakReference<>(jVar);
        }

        public void handleMessage(Message message) {
            WeakReference<Messenger> weakReference = this.f192b;
            if (weakReference != null && weakReference.get() != null && this.f191a.get() != null) {
                Bundle data = message.getData();
                MediaSessionCompat.m360a(data);
                AbstractC0106j jVar = this.f191a.get();
                Messenger messenger = this.f192b.get();
                try {
                    int i = message.what;
                    if (i == 1) {
                        Bundle bundle = data.getBundle("data_root_hints");
                        MediaSessionCompat.m360a(bundle);
                        jVar.mo185a(messenger, data.getString("data_media_item_id"), (MediaSessionCompat.Token) data.getParcelable("data_media_session_token"), bundle);
                    } else if (i == 2) {
                        jVar.mo184a(messenger);
                    } else if (i != 3) {
                        Log.w("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: " + 1 + "\n  Service version: " + message.arg1);
                    } else {
                        Bundle bundle2 = data.getBundle("data_options");
                        MediaSessionCompat.m360a(bundle2);
                        Bundle bundle3 = data.getBundle("data_notify_children_changed_options");
                        MediaSessionCompat.m360a(bundle3);
                        jVar.mo186a(messenger, data.getString("data_media_item_id"), data.getParcelableArrayList("data_media_item_list"), bundle2, bundle3);
                    }
                } catch (BadParcelableException unused) {
                    Log.e("MediaBrowserCompat", "Could not unparcel the data.");
                    if (message.what == 1) {
                        jVar.mo184a(messenger);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.v4.media.MediaBrowserCompat$l */
    public static class C0108l {

        /* renamed from: a */
        private Messenger f228a;

        /* renamed from: b */
        private Bundle f229b;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo200a(Messenger messenger) throws RemoteException {
            m237a(2, null, messenger);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo203b(Messenger messenger) throws RemoteException {
            m237a(7, null, messenger);
        }

        public C0108l(IBinder iBinder, Bundle bundle) {
            this.f228a = new Messenger(iBinder);
            this.f229b = bundle;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo202b(Context context, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString("data_package_name", context.getPackageName());
            bundle.putBundle("data_root_hints", this.f229b);
            m237a(6, bundle, messenger);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo199a(Context context, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString("data_package_name", context.getPackageName());
            bundle.putBundle("data_root_hints", this.f229b);
            m237a(1, bundle, messenger);
        }

        /* renamed from: a */
        private void m237a(int i, Bundle bundle, Messenger messenger) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            obtain.replyTo = messenger;
            this.f228a.send(obtain);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo201a(String str, IBinder iBinder, Bundle bundle, Messenger messenger) throws RemoteException {
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            C0737e.m3595a(bundle2, "data_callback_token", iBinder);
            bundle2.putBundle("data_options", bundle);
            m237a(3, bundle2, messenger);
        }
    }

    private static class ItemReceiver extends ResultReceiver {

        /* renamed from: d */
        private final String f184d;

        /* renamed from: e */
        private final AbstractC0095d f185e;

        /* access modifiers changed from: protected */
        @Override // android.support.v4.os.ResultReceiver
        /* renamed from: a */
        public void mo156a(int i, Bundle bundle) {
            MediaSessionCompat.m360a(bundle);
            if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
                this.f185e.mo180a(this.f184d);
                return;
            }
            Parcelable parcelable = bundle.getParcelable("media_item");
            if (parcelable == null || (parcelable instanceof MediaItem)) {
                this.f185e.mo179a((MediaItem) parcelable);
            } else {
                this.f185e.mo180a(this.f184d);
            }
        }
    }

    private static class SearchResultReceiver extends ResultReceiver {

        /* renamed from: d */
        private final String f188d;

        /* renamed from: e */
        private final Bundle f189e;

        /* renamed from: f */
        private final AbstractC0107k f190f;

        /* access modifiers changed from: protected */
        @Override // android.support.v4.os.ResultReceiver
        /* renamed from: a */
        public void mo156a(int i, Bundle bundle) {
            MediaSessionCompat.m360a(bundle);
            if (i != 0 || bundle == null || !bundle.containsKey("search_results")) {
                this.f190f.mo197a(this.f188d, this.f189e);
                return;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
            ArrayList arrayList = null;
            if (parcelableArray != null) {
                arrayList = new ArrayList();
                for (Parcelable parcelable : parcelableArray) {
                    arrayList.add((MediaItem) parcelable);
                }
            }
            this.f190f.mo198a(this.f188d, this.f189e, arrayList);
        }
    }

    private static class CustomActionResultReceiver extends ResultReceiver {

        /* renamed from: d */
        private final String f181d;

        /* renamed from: e */
        private final Bundle f182e;

        /* renamed from: f */
        private final AbstractC0094c f183f;

        /* access modifiers changed from: protected */
        @Override // android.support.v4.os.ResultReceiver
        /* renamed from: a */
        public void mo156a(int i, Bundle bundle) {
            if (this.f183f != null) {
                MediaSessionCompat.m360a(bundle);
                if (i == -1) {
                    this.f183f.mo178c(this.f181d, this.f182e, bundle);
                } else if (i == 0) {
                    this.f183f.mo177b(this.f181d, this.f182e, bundle);
                } else if (i != 1) {
                    Log.w("MediaBrowserCompat", "Unknown result code: " + i + " (extras=" + this.f182e + ", resultData=" + bundle + ")");
                } else {
                    this.f183f.mo176a(this.f181d, this.f182e, bundle);
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$g */
    static class C0098g extends C0097f {
        C0098g(Context context, ComponentName componentName, C0091b bVar, Bundle bundle) {
            super(context, componentName, bVar, bundle);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$h */
    static class C0099h extends C0098g {
        C0099h(Context context, ComponentName componentName, C0091b bVar, Bundle bundle) {
            super(context, componentName, bVar, bundle);
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, C0091b bVar, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f180b = new C0099h(context, componentName, bVar, bundle);
        } else if (Build.VERSION.SDK_INT >= 23) {
            this.f180b = new C0098g(context, componentName, bVar, bundle);
        } else if (Build.VERSION.SDK_INT >= 21) {
            this.f180b = new C0097f(context, componentName, bVar, bundle);
        } else {
            this.f180b = new C0100i(context, componentName, bVar, bundle);
        }
    }
}
