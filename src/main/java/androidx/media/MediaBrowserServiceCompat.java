package androidx.media;

import android.app.Service;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.ArrayMap;
import androidx.core.app.C0737e;
import androidx.core.util.C0844e;
import androidx.media.C1230e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public abstract class MediaBrowserServiceCompat extends Service {

    /* renamed from: a */
    static final boolean f4362a = Log.isLoggable("MBServiceCompat", 3);

    /* renamed from: b */
    final ArrayMap<IBinder, C1207b> f4363b = new ArrayMap<>();

    /* renamed from: c */
    C1207b f4364c;

    /* renamed from: d */
    final HandlerC1222g f4365d = new HandlerC1222g();

    /* renamed from: e */
    MediaSessionCompat.Token f4366e;

    /* access modifiers changed from: private */
    /* renamed from: androidx.media.MediaBrowserServiceCompat$e */
    public interface AbstractC1220e {
        /* renamed from: a */
        IBinder mo6194a();

        /* renamed from: a */
        void mo6195a(String str, MediaSessionCompat.Token token, Bundle bundle) throws RemoteException;

        /* renamed from: a */
        void mo6196a(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException;

        /* renamed from: b */
        void mo6197b() throws RemoteException;
    }

    /* renamed from: a */
    public abstract C1206a mo6145a(String str, int i, Bundle bundle);

    /* renamed from: a */
    public void mo6147a(String str) {
    }

    /* renamed from: a */
    public void mo6148a(String str, Bundle bundle) {
    }

    /* renamed from: a */
    public abstract void mo6154a(String str, C1209c<List<MediaBrowserCompat.MediaItem>> cVar);

    /* renamed from: androidx.media.MediaBrowserServiceCompat$a */
    public static final class C1206a {

        /* renamed from: a */
        private final String f4378a;

        /* renamed from: b */
        private final Bundle f4379b;

        /* renamed from: a */
        public String mo6167a() {
            return this.f4378a;
        }

        /* renamed from: b */
        public Bundle mo6168b() {
            return this.f4379b;
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$c */
    public static class C1209c<T> {

        /* renamed from: a */
        private final Object f4390a;

        /* renamed from: b */
        private boolean f4391b;

        /* renamed from: c */
        private boolean f4392c;

        /* renamed from: d */
        private boolean f4393d;

        /* renamed from: e */
        private int f4394e;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6161a(T t) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo6173b() {
            return this.f4394e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo6172a() {
            if (this.f4391b || this.f4392c || this.f4393d) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6171a(int i) {
            this.f4394e = i;
        }

        C1209c(Object obj) {
            this.f4390a = obj;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo6166b(Bundle bundle) {
            throw new UnsupportedOperationException("It is not supported to send an error for " + this.f4390a);
        }

        /* renamed from: b */
        public void mo6174b(T t) {
            if (this.f4392c || this.f4393d) {
                throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.f4390a);
            }
            this.f4392c = true;
            mo6161a(t);
        }

        /* renamed from: c */
        public void mo6175c(Bundle bundle) {
            if (this.f4392c || this.f4393d) {
                throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: " + this.f4390a);
            }
            this.f4393d = true;
            mo6166b(bundle);
        }
    }

    /* renamed from: a */
    public void mo6155a(String str, C1209c<List<MediaBrowserCompat.MediaItem>> cVar, Bundle bundle) {
        cVar.mo6171a(1);
        mo6154a(str, cVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo6156a(String str, int i) {
        if (str == null) {
            return false;
        }
        for (String str2 : getPackageManager().getPackagesForUid(i)) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo6157a(String str, C1207b bVar, IBinder iBinder) {
        boolean z = true;
        boolean z2 = false;
        if (iBinder == null) {
            try {
                if (bVar.f4386g.remove(str) == null) {
                    z = false;
                }
                return z;
            } finally {
                this.f4364c = bVar;
                mo6147a(str);
                this.f4364c = null;
            }
        } else {
            List<C0844e<IBinder, Bundle>> list = bVar.f4386g.get(str);
            if (list != null) {
                Iterator<C0844e<IBinder, Bundle>> it = list.iterator();
                while (it.hasNext()) {
                    if (iBinder == it.next().f3317a) {
                        it.remove();
                        z2 = true;
                    }
                }
                if (list.size() == 0) {
                    bVar.f4386g.remove(str);
                }
            }
            this.f4364c = bVar;
            mo6147a(str);
            this.f4364c = null;
            return z2;
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$f */
    private static class C1221f implements AbstractC1220e {

        /* renamed from: a */
        final Messenger f4435a;

        @Override // androidx.media.MediaBrowserServiceCompat.AbstractC1220e
        /* renamed from: a */
        public IBinder mo6194a() {
            return this.f4435a.getBinder();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.AbstractC1220e
        /* renamed from: b */
        public void mo6197b() throws RemoteException {
            m5576a(2, null);
        }

        C1221f(Messenger messenger) {
            this.f4435a = messenger;
        }

        /* renamed from: a */
        private void m5576a(int i, Bundle bundle) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 2;
            obtain.setData(bundle);
            this.f4435a.send(obtain);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.AbstractC1220e
        /* renamed from: a */
        public void mo6195a(String str, MediaSessionCompat.Token token, Bundle bundle) throws RemoteException {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putInt("extra_service_version", 2);
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            bundle2.putParcelable("data_media_session_token", token);
            bundle2.putBundle("data_root_hints", bundle);
            m5576a(1, bundle2);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.AbstractC1220e
        /* renamed from: a */
        public void mo6196a(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException {
            ArrayList<? extends Parcelable> arrayList;
            Bundle bundle3 = new Bundle();
            bundle3.putString("data_media_item_id", str);
            bundle3.putBundle("data_options", bundle);
            bundle3.putBundle("data_notify_children_changed_options", bundle2);
            if (list != null) {
                if (list instanceof ArrayList) {
                    arrayList = (ArrayList) list;
                } else {
                    arrayList = new ArrayList<>(list);
                }
                bundle3.putParcelableArrayList("data_media_item_list", arrayList);
            }
            m5576a(3, bundle3);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.media.MediaBrowserServiceCompat$b */
    public class C1207b implements IBinder.DeathRecipient {

        /* renamed from: a */
        public final String f4380a;

        /* renamed from: b */
        public final int f4381b;

        /* renamed from: c */
        public final int f4382c;

        /* renamed from: d */
        public final C1230e.C1231a f4383d;

        /* renamed from: e */
        public final Bundle f4384e;

        /* renamed from: f */
        public final AbstractC1220e f4385f;

        /* renamed from: g */
        public final HashMap<String, List<C0844e<IBinder, Bundle>>> f4386g = new HashMap<>();

        /* renamed from: h */
        public C1206a f4387h;

        public void binderDied() {
            MediaBrowserServiceCompat.this.f4365d.post(new Runnable() {
                /* class androidx.media.MediaBrowserServiceCompat.C1207b.RunnableC12081 */

                public void run() {
                    MediaBrowserServiceCompat.this.f4363b.remove(C1207b.this.f4385f.mo6194a());
                }
            });
        }

        C1207b(String str, int i, int i2, Bundle bundle, AbstractC1220e eVar) {
            this.f4380a = str;
            this.f4381b = i;
            this.f4382c = i2;
            this.f4383d = new C1230e.C1231a(str, i, i2);
            this.f4384e = bundle;
            this.f4385f = eVar;
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$d */
    private class C1210d {
        C1210d() {
        }

        /* renamed from: a */
        public void mo6176a(final AbstractC1220e eVar) {
            MediaBrowserServiceCompat.this.f4365d.mo6198a(new Runnable() {
                /* class androidx.media.MediaBrowserServiceCompat.C1210d.RunnableC12122 */

                public void run() {
                    C1207b remove = MediaBrowserServiceCompat.this.f4363b.remove(eVar.mo6194a());
                    if (remove != null) {
                        remove.f4385f.mo6194a().unlinkToDeath(remove, 0);
                    }
                }
            });
        }

        /* renamed from: b */
        public void mo6183b(final AbstractC1220e eVar) {
            MediaBrowserServiceCompat.this.f4365d.mo6198a(new Runnable() {
                /* class androidx.media.MediaBrowserServiceCompat.C1210d.RunnableC12177 */

                public void run() {
                    IBinder a = eVar.mo6194a();
                    C1207b remove = MediaBrowserServiceCompat.this.f4363b.remove(a);
                    if (remove != null) {
                        a.unlinkToDeath(remove, 0);
                    }
                }
            });
        }

        /* renamed from: a */
        public void mo6181a(final String str, final IBinder iBinder, final AbstractC1220e eVar) {
            MediaBrowserServiceCompat.this.f4365d.mo6198a(new Runnable() {
                /* class androidx.media.MediaBrowserServiceCompat.C1210d.RunnableC12144 */

                public void run() {
                    C1207b bVar = MediaBrowserServiceCompat.this.f4363b.get(eVar.mo6194a());
                    if (bVar == null) {
                        Log.w("MBServiceCompat", "removeSubscription for callback that isn't registered id=" + str);
                    } else if (!MediaBrowserServiceCompat.this.mo6157a(str, bVar, iBinder)) {
                        Log.w("MBServiceCompat", "removeSubscription called for " + str + " which is not subscribed");
                    }
                }
            });
        }

        /* renamed from: a */
        public void mo6182a(final String str, final ResultReceiver resultReceiver, final AbstractC1220e eVar) {
            if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                MediaBrowserServiceCompat.this.f4365d.mo6198a(new Runnable() {
                    /* class androidx.media.MediaBrowserServiceCompat.C1210d.RunnableC12155 */

                    public void run() {
                        C1207b bVar = MediaBrowserServiceCompat.this.f4363b.get(eVar.mo6194a());
                        if (bVar == null) {
                            Log.w("MBServiceCompat", "getMediaItem for callback that isn't registered id=" + str);
                            return;
                        }
                        MediaBrowserServiceCompat.this.mo6153a(str, bVar, resultReceiver);
                    }
                });
            }
        }

        /* renamed from: b */
        public void mo6184b(final String str, final Bundle bundle, final ResultReceiver resultReceiver, final AbstractC1220e eVar) {
            if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                MediaBrowserServiceCompat.this.f4365d.mo6198a(new Runnable() {
                    /* class androidx.media.MediaBrowserServiceCompat.C1210d.RunnableC12199 */

                    public void run() {
                        C1207b bVar = MediaBrowserServiceCompat.this.f4363b.get(eVar.mo6194a());
                        if (bVar == null) {
                            Log.w("MBServiceCompat", "sendCustomAction for callback that isn't registered action=" + str + ", extras=" + bundle);
                            return;
                        }
                        MediaBrowserServiceCompat.this.mo6158b(str, bundle, bVar, resultReceiver);
                    }
                });
            }
        }

        /* renamed from: a */
        public void mo6179a(final String str, final Bundle bundle, final ResultReceiver resultReceiver, final AbstractC1220e eVar) {
            if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                MediaBrowserServiceCompat.this.f4365d.mo6198a(new Runnable() {
                    /* class androidx.media.MediaBrowserServiceCompat.C1210d.RunnableC12188 */

                    public void run() {
                        C1207b bVar = MediaBrowserServiceCompat.this.f4363b.get(eVar.mo6194a());
                        if (bVar == null) {
                            Log.w("MBServiceCompat", "search for callback that isn't registered query=" + str);
                            return;
                        }
                        MediaBrowserServiceCompat.this.mo6149a(str, bundle, bVar, resultReceiver);
                    }
                });
            }
        }

        /* renamed from: a */
        public void mo6180a(final String str, final IBinder iBinder, final Bundle bundle, final AbstractC1220e eVar) {
            MediaBrowserServiceCompat.this.f4365d.mo6198a(new Runnable() {
                /* class androidx.media.MediaBrowserServiceCompat.C1210d.RunnableC12133 */

                public void run() {
                    C1207b bVar = MediaBrowserServiceCompat.this.f4363b.get(eVar.mo6194a());
                    if (bVar == null) {
                        Log.w("MBServiceCompat", "addSubscription for callback that isn't registered id=" + str);
                        return;
                    }
                    MediaBrowserServiceCompat.this.mo6152a(str, bVar, iBinder, bundle);
                }
            });
        }

        /* renamed from: a */
        public void mo6177a(final AbstractC1220e eVar, final String str, final int i, final int i2, final Bundle bundle) {
            MediaBrowserServiceCompat.this.f4365d.mo6198a(new Runnable() {
                /* class androidx.media.MediaBrowserServiceCompat.C1210d.RunnableC12166 */

                public void run() {
                    IBinder a = eVar.mo6194a();
                    MediaBrowserServiceCompat.this.f4363b.remove(a);
                    C1207b bVar = new C1207b(str, i, i2, bundle, eVar);
                    MediaBrowserServiceCompat.this.f4363b.put(a, bVar);
                    try {
                        a.linkToDeath(bVar, 0);
                    } catch (RemoteException unused) {
                        Log.w("MBServiceCompat", "IBinder is already dead.");
                    }
                }
            });
        }

        /* renamed from: a */
        public void mo6178a(final String str, final int i, final int i2, final Bundle bundle, final AbstractC1220e eVar) {
            if (MediaBrowserServiceCompat.this.mo6156a(str, i2)) {
                MediaBrowserServiceCompat.this.f4365d.mo6198a(new Runnable() {
                    /* class androidx.media.MediaBrowserServiceCompat.C1210d.RunnableC12111 */

                    public void run() {
                        IBinder a = eVar.mo6194a();
                        MediaBrowserServiceCompat.this.f4363b.remove(a);
                        C1207b bVar = new C1207b(str, i, i2, bundle, eVar);
                        MediaBrowserServiceCompat.this.f4364c = bVar;
                        bVar.f4387h = MediaBrowserServiceCompat.this.mo6145a(str, i2, bundle);
                        MediaBrowserServiceCompat.this.f4364c = null;
                        if (bVar.f4387h == null) {
                            Log.i("MBServiceCompat", "No root for client " + str + " from service " + getClass().getName());
                            try {
                                eVar.mo6197b();
                            } catch (RemoteException unused) {
                                Log.w("MBServiceCompat", "Calling onConnectFailed() failed. Ignoring. pkg=" + str);
                            }
                        } else {
                            try {
                                MediaBrowserServiceCompat.this.f4363b.put(a, bVar);
                                a.linkToDeath(bVar, 0);
                                if (MediaBrowserServiceCompat.this.f4366e != null) {
                                    eVar.mo6195a(bVar.f4387h.mo6167a(), MediaBrowserServiceCompat.this.f4366e, bVar.f4387h.mo6168b());
                                }
                            } catch (RemoteException unused2) {
                                Log.w("MBServiceCompat", "Calling onConnect() failed. Dropping client. pkg=" + str);
                                MediaBrowserServiceCompat.this.f4363b.remove(a);
                            }
                        }
                    }
                });
                return;
            }
            throw new IllegalArgumentException("Package/uid mismatch: uid=" + i2 + " package=" + str);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.media.MediaBrowserServiceCompat$g */
    public final class HandlerC1222g extends Handler {

        /* renamed from: b */
        private final C1210d f4437b;

        HandlerC1222g() {
            this.f4437b = new C1210d();
        }

        /* renamed from: a */
        public void mo6198a(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        public void handleMessage(Message message) {
            Bundle data = message.getData();
            switch (message.what) {
                case 1:
                    Bundle bundle = data.getBundle("data_root_hints");
                    MediaSessionCompat.m360a(bundle);
                    this.f4437b.mo6178a(data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle, new C1221f(message.replyTo));
                    return;
                case 2:
                    this.f4437b.mo6176a(new C1221f(message.replyTo));
                    return;
                case 3:
                    Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.m360a(bundle2);
                    this.f4437b.mo6180a(data.getString("data_media_item_id"), C0737e.m3594a(data, "data_callback_token"), bundle2, new C1221f(message.replyTo));
                    return;
                case 4:
                    this.f4437b.mo6181a(data.getString("data_media_item_id"), C0737e.m3594a(data, "data_callback_token"), new C1221f(message.replyTo));
                    return;
                case 5:
                    this.f4437b.mo6182a(data.getString("data_media_item_id"), (ResultReceiver) data.getParcelable("data_result_receiver"), new C1221f(message.replyTo));
                    return;
                case 6:
                    Bundle bundle3 = data.getBundle("data_root_hints");
                    MediaSessionCompat.m360a(bundle3);
                    this.f4437b.mo6177a(new C1221f(message.replyTo), data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle3);
                    return;
                case 7:
                    this.f4437b.mo6183b(new C1221f(message.replyTo));
                    return;
                case 8:
                    Bundle bundle4 = data.getBundle("data_search_extras");
                    MediaSessionCompat.m360a(bundle4);
                    this.f4437b.mo6179a(data.getString("data_search_query"), bundle4, (ResultReceiver) data.getParcelable("data_result_receiver"), new C1221f(message.replyTo));
                    return;
                case 9:
                    Bundle bundle5 = data.getBundle("data_custom_action_extras");
                    MediaSessionCompat.m360a(bundle5);
                    this.f4437b.mo6184b(data.getString("data_custom_action"), bundle5, (ResultReceiver) data.getParcelable("data_result_receiver"), new C1221f(message.replyTo));
                    return;
                default:
                    Log.w("MBServiceCompat", "Unhandled message: " + message + "\n  Service version: " + 2 + "\n  Client version: " + message.arg1);
                    return;
            }
        }

        public boolean sendMessageAtTime(Message message, long j) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            data.putInt("data_calling_pid", Binder.getCallingPid());
            return super.sendMessageAtTime(message, j);
        }
    }

    /* renamed from: b */
    public void mo6160b(String str, C1209c<MediaBrowserCompat.MediaItem> cVar) {
        cVar.mo6171a(2);
        cVar.mo6174b((MediaBrowserCompat.MediaItem) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<MediaBrowserCompat.MediaItem> mo6146a(List<MediaBrowserCompat.MediaItem> list, Bundle bundle) {
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

    /* renamed from: b */
    public void mo6159b(String str, Bundle bundle, C1209c<Bundle> cVar) {
        cVar.mo6175c(null);
    }

    /* renamed from: a */
    public void mo6150a(String str, Bundle bundle, C1209c<List<MediaBrowserCompat.MediaItem>> cVar) {
        cVar.mo6171a(4);
        cVar.mo6174b((List<MediaBrowserCompat.MediaItem>) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6153a(String str, C1207b bVar, final ResultReceiver resultReceiver) {
        C12032 r0 = new C1209c<MediaBrowserCompat.MediaItem>(str) {
            /* class androidx.media.MediaBrowserServiceCompat.C12032 */

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo6161a(MediaBrowserCompat.MediaItem mediaItem) {
                if ((mo6173b() & 2) != 0) {
                    resultReceiver.mo539b(-1, null);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putParcelable("media_item", mediaItem);
                resultReceiver.mo539b(0, bundle);
            }
        };
        this.f4364c = bVar;
        mo6160b(str, r0);
        this.f4364c = null;
        if (!r0.mo6172a()) {
            throw new IllegalStateException("onLoadItem must call detach() or sendResult() before returning for id=" + str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo6158b(String str, Bundle bundle, C1207b bVar, final ResultReceiver resultReceiver) {
        C12054 r0 = new C1209c<Bundle>(str) {
            /* class androidx.media.MediaBrowserServiceCompat.C12054 */

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo6161a(Bundle bundle) {
                resultReceiver.mo539b(0, bundle);
            }

            /* access modifiers changed from: package-private */
            @Override // androidx.media.MediaBrowserServiceCompat.C1209c
            /* renamed from: b */
            public void mo6166b(Bundle bundle) {
                resultReceiver.mo539b(-1, bundle);
            }
        };
        this.f4364c = bVar;
        mo6159b(str, bundle, r0);
        this.f4364c = null;
        if (!r0.mo6172a()) {
            throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + str + " extras=" + bundle);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6149a(String str, Bundle bundle, C1207b bVar, final ResultReceiver resultReceiver) {
        C12043 r0 = new C1209c<List<MediaBrowserCompat.MediaItem>>(str) {
            /* class androidx.media.MediaBrowserServiceCompat.C12043 */

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo6161a(List<MediaBrowserCompat.MediaItem> list) {
                if ((mo6173b() & 4) != 0 || list == null) {
                    resultReceiver.mo539b(-1, null);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putParcelableArray("search_results", (Parcelable[]) list.toArray(new MediaBrowserCompat.MediaItem[0]));
                resultReceiver.mo539b(0, bundle);
            }
        };
        this.f4364c = bVar;
        mo6150a(str, bundle, r0);
        this.f4364c = null;
        if (!r0.mo6172a()) {
            throw new IllegalStateException("onSearch must call detach() or sendResult() before returning for query=" + str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6151a(final String str, final C1207b bVar, final Bundle bundle, final Bundle bundle2) {
        C12021 r7 = new C1209c<List<MediaBrowserCompat.MediaItem>>(str) {
            /* class androidx.media.MediaBrowserServiceCompat.C12021 */

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo6161a(List<MediaBrowserCompat.MediaItem> list) {
                if (MediaBrowserServiceCompat.this.f4363b.get(bVar.f4385f.mo6194a()) == bVar) {
                    if ((mo6173b() & 1) != 0) {
                        list = MediaBrowserServiceCompat.this.mo6146a(list, bundle);
                    }
                    try {
                        bVar.f4385f.mo6196a(str, list, bundle, bundle2);
                    } catch (RemoteException unused) {
                        Log.w("MBServiceCompat", "Calling onLoadChildren() failed for id=" + str + " package=" + bVar.f4380a);
                    }
                } else if (MediaBrowserServiceCompat.f4362a) {
                    Log.d("MBServiceCompat", "Not sending onLoadChildren result for connection that has been disconnected. pkg=" + bVar.f4380a + " id=" + str);
                }
            }
        };
        this.f4364c = bVar;
        if (bundle == null) {
            mo6154a(str, r7);
        } else {
            mo6155a(str, r7, bundle);
        }
        this.f4364c = null;
        if (!r7.mo6172a()) {
            throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + bVar.f4380a + " id=" + str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6152a(String str, C1207b bVar, IBinder iBinder, Bundle bundle) {
        List<C0844e<IBinder, Bundle>> list = bVar.f4386g.get(str);
        if (list == null) {
            list = new ArrayList<>();
        }
        for (C0844e<IBinder, Bundle> eVar : list) {
            if (iBinder == eVar.f3317a && C1229d.m5600a(bundle, eVar.f3318b)) {
                return;
            }
        }
        list.add(new C0844e<>(iBinder, bundle));
        bVar.f4386g.put(str, list);
        mo6151a(str, bVar, bundle, (Bundle) null);
        this.f4364c = bVar;
        mo6148a(str, bundle);
        this.f4364c = null;
    }
}
