package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.internal.p976a.C21841a;
import com.google.android.gms.internal.p976a.C21846f;
import com.google.android.gms.internal.p976a.HandlerC21845e;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.Constants;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MessengerIpcClient {

    /* renamed from: c */
    private static MessengerIpcClient f56355c;

    /* renamed from: a */
    public final Context f56356a;

    /* renamed from: b */
    public final ScheduledExecutorService f56357b;

    /* renamed from: d */
    private ServiceConnectionC22800a f56358d = new ServiceConnectionC22800a();

    /* renamed from: e */
    private int f56359e = 1;

    @Retention(RetentionPolicy.SOURCE)
    public @interface What {
        public static final int FCM_ACK = 2;
        public static final int IID_TOKEN_REQUEST = 1;
        public static final int LEGACY_IID_TOKEN_REQUEST = 0;
    }

    public static class RequestFailedException extends Exception {
        private final int errorCode;

        @Retention(RetentionPolicy.SOURCE)
        public @interface ErrorCode {
            public static final int CONNECTION_TIMEOUT = 1;
            public static final int FAILED_TO_CONNECT = 0;
            public static final int REMOTE_ERROR = 2;
            public static final int REQUEST_TIMEOUT = 3;
            public static final int UNSUPPORTED = 4;
        }

        public int getErrorCode() {
            return this.errorCode;
        }

        public RequestFailedException(int i, String str) {
            super(str);
            this.errorCode = i;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.firebase.iid.MessengerIpcClient$a */
    public class ServiceConnectionC22800a implements ServiceConnection {

        /* renamed from: a */
        int f56360a;

        /* renamed from: b */
        final Messenger f56361b;

        /* renamed from: c */
        C22801b f56362c;

        /* renamed from: d */
        final Queue<AbstractC22803d<?>> f56363d;

        /* renamed from: e */
        final SparseArray<AbstractC22803d<?>> f56364e;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public synchronized boolean mo79286a(AbstractC22803d<?> dVar) {
            int i = this.f56360a;
            if (i == 0) {
                this.f56363d.add(dVar);
                mo79280a();
                return true;
            } else if (i == 1) {
                this.f56363d.add(dVar);
                return true;
            } else if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        int i2 = this.f56360a;
                        StringBuilder sb = new StringBuilder(26);
                        sb.append("Unknown state: ");
                        sb.append(i2);
                        throw new IllegalStateException(sb.toString());
                    }
                }
                return false;
            } else {
                this.f56363d.add(dVar);
                mo79287b();
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public final /* synthetic */ void mo79292e() {
            mo79282a(2, "Service disconnected");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo79287b() {
            MessengerIpcClient.this.f56357b.execute(new RunnableC22847y(this));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public synchronized void mo79291d() {
            if (this.f56360a == 1) {
                mo79282a(1, "Timed out while binding");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public synchronized void mo79289c() {
            if (this.f56360a == 2 && this.f56363d.isEmpty() && this.f56364e.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f56360a = 3;
                ConnectionTracker.getInstance().unbindService(MessengerIpcClient.this.f56356a, this);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public final /* synthetic */ void mo79293f() {
            AbstractC22803d<?> poll;
            while (true) {
                synchronized (this) {
                    if (this.f56360a == 2) {
                        if (this.f56363d.isEmpty()) {
                            mo79289c();
                            return;
                        }
                        poll = this.f56363d.poll();
                        this.f56364e.put(poll.f56368a, poll);
                        MessengerIpcClient.this.f56357b.schedule(new RunnableC22808aa(this, poll), 30, TimeUnit.SECONDS);
                    } else {
                        return;
                    }
                }
                mo79288b(poll);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo79280a() {
            boolean z;
            if (this.f56360a == 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z);
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Starting bind to GmsCore");
            }
            this.f56360a = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            if (!ConnectionTracker.getInstance().bindService(MessengerIpcClient.this.f56356a, intent, this, 1)) {
                mo79282a(0, "Unable to bind to service");
            } else {
                MessengerIpcClient.this.f56357b.schedule(new RunnableC22845w(this), 30, TimeUnit.SECONDS);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final /* synthetic */ void mo79290c(AbstractC22803d dVar) {
            mo79281a(dVar.f56368a);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Service disconnected");
            }
            MessengerIpcClient.this.f56357b.execute(new RunnableC22848z(this));
        }

        private ServiceConnectionC22800a() {
            this.f56361b = new Messenger(new HandlerC21845e(Looper.getMainLooper(), new C22844v(this)));
            this.f56363d = new ArrayDeque();
            this.f56364e = new SparseArray<>();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public synchronized void mo79281a(int i) {
            AbstractC22803d<?> dVar = this.f56364e.get(i);
            if (dVar != null) {
                StringBuilder sb = new StringBuilder(31);
                sb.append("Timing out request: ");
                sb.append(i);
                Log.w("MessengerIpcClient", sb.toString());
                this.f56364e.remove(i);
                dVar.mo79300a(new RequestFailedException(3, "Timed out waiting for response"));
                mo79289c();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo79288b(AbstractC22803d<?> dVar) {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String valueOf = String.valueOf(dVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
                sb.append("Sending ");
                sb.append(valueOf);
                Log.d("MessengerIpcClient", sb.toString());
            }
            try {
                this.f56362c.mo79296a(dVar.mo79299a(MessengerIpcClient.this.f56356a, this.f56361b));
            } catch (RemoteException e) {
                mo79282a(2, e.getMessage());
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final /* synthetic */ void mo79283a(IBinder iBinder) {
            synchronized (this) {
                if (iBinder == null) {
                    mo79282a(0, "Null service connection");
                    return;
                }
                try {
                    this.f56362c = new C22801b(iBinder);
                    this.f56360a = 2;
                    mo79287b();
                } catch (RemoteException e) {
                    mo79282a(0, e.getMessage());
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo79284a(RequestFailedException requestFailedException) {
            for (AbstractC22803d<?> dVar : this.f56363d) {
                dVar.mo79300a(requestFailedException);
            }
            this.f56363d.clear();
            for (int i = 0; i < this.f56364e.size(); i++) {
                this.f56364e.valueAt(i).mo79300a(requestFailedException);
            }
            this.f56364e.clear();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo79285a(Message message) {
            int i = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                StringBuilder sb = new StringBuilder(41);
                sb.append("Received response to request: ");
                sb.append(i);
                Log.d("MessengerIpcClient", sb.toString());
            }
            synchronized (this) {
                AbstractC22803d<?> dVar = this.f56364e.get(i);
                if (dVar == null) {
                    StringBuilder sb2 = new StringBuilder(50);
                    sb2.append("Received response for unknown request: ");
                    sb2.append(i);
                    Log.w("MessengerIpcClient", sb2.toString());
                    return true;
                }
                this.f56364e.remove(i);
                mo79289c();
                dVar.mo79303b(message.getData());
                return true;
            }
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Service connected");
            }
            MessengerIpcClient.this.f56357b.execute(new RunnableC22846x(this, iBinder));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public synchronized void mo79282a(int i, String str) {
            String str2;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    str2 = "Disconnected: ".concat(valueOf);
                } else {
                    str2 = new String("Disconnected: ");
                }
                Log.d("MessengerIpcClient", str2);
            }
            int i2 = this.f56360a;
            if (i2 == 0) {
                throw new IllegalStateException();
            } else if (i2 == 1 || i2 == 2) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Unbinding service");
                }
                this.f56360a = 4;
                ConnectionTracker.getInstance().unbindService(MessengerIpcClient.this.f56356a, this);
                mo79284a(new RequestFailedException(i, str));
            } else if (i2 == 3) {
                this.f56360a = 4;
            } else if (i2 != 4) {
                int i3 = this.f56360a;
                StringBuilder sb = new StringBuilder(26);
                sb.append("Unknown state: ");
                sb.append(i3);
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.firebase.iid.MessengerIpcClient$d */
    public static abstract class AbstractC22803d<T> {

        /* renamed from: a */
        final int f56368a;

        /* renamed from: b */
        final TaskCompletionSource<T> f56369b = new TaskCompletionSource<>();

        /* renamed from: c */
        final int f56370c;

        /* renamed from: d */
        final Bundle f56371d;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo79297a(Bundle bundle);

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract boolean mo79298a();

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public Task<T> mo79302b() {
            return this.f56369b.getTask();
        }

        public String toString() {
            int i = this.f56370c;
            int i2 = this.f56368a;
            boolean a = mo79298a();
            StringBuilder sb = new StringBuilder(55);
            sb.append("Request { what=");
            sb.append(i);
            sb.append(" id=");
            sb.append(i2);
            sb.append(" oneWay=");
            sb.append(a);
            sb.append("}");
            return sb.toString();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo79303b(Bundle bundle) {
            if (bundle.getBoolean("unsupported", false)) {
                mo79300a(new RequestFailedException(4, "Not supported by GmsCore"));
            } else {
                mo79297a(bundle);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo79300a(RequestFailedException requestFailedException) {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String valueOf = String.valueOf(this);
                String valueOf2 = String.valueOf(requestFailedException);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14 + String.valueOf(valueOf2).length());
                sb.append("Failing ");
                sb.append(valueOf);
                sb.append(" with ");
                sb.append(valueOf2);
                Log.d("MessengerIpcClient", sb.toString());
            }
            this.f56369b.setException(requestFailedException);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo79301a(T t) {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String valueOf = String.valueOf(this);
                String valueOf2 = String.valueOf(t);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16 + String.valueOf(valueOf2).length());
                sb.append("Finishing ");
                sb.append(valueOf);
                sb.append(" with ");
                sb.append(valueOf2);
                Log.d("MessengerIpcClient", sb.toString());
            }
            this.f56369b.setResult(t);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Message mo79299a(Context context, Messenger messenger) {
            Message obtain = Message.obtain();
            obtain.what = this.f56370c;
            obtain.arg1 = this.f56368a;
            obtain.replyTo = messenger;
            Bundle bundle = new Bundle();
            bundle.putBoolean("oneWay", mo79298a());
            bundle.putString("pkg", context.getPackageName());
            bundle.putBundle(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, this.f56371d);
            obtain.setData(bundle);
            return obtain;
        }

        AbstractC22803d(int i, int i2, Bundle bundle) {
            this.f56368a = i;
            this.f56370c = i2;
            this.f56371d = bundle;
        }
    }

    /* renamed from: a */
    private synchronized int m82828a() {
        int i;
        i = this.f56359e;
        this.f56359e = i + 1;
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.firebase.iid.MessengerIpcClient$e */
    public static class C22804e extends AbstractC22803d<Bundle> {
        /* access modifiers changed from: package-private */
        @Override // com.google.firebase.iid.MessengerIpcClient.AbstractC22803d
        /* renamed from: a */
        public boolean mo79298a() {
            return false;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.firebase.iid.MessengerIpcClient.AbstractC22803d
        /* renamed from: a */
        public void mo79297a(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (bundle2 == null) {
                bundle2 = Bundle.EMPTY;
            }
            mo79301a((Object) bundle2);
        }

        C22804e(int i, int i2, Bundle bundle) {
            super(i, i2, bundle);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.iid.MessengerIpcClient$b */
    public static class C22801b {

        /* renamed from: a */
        private final Messenger f56366a;

        /* renamed from: b */
        private final FirebaseIidMessengerCompat f56367b;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo79296a(Message message) throws RemoteException {
            Messenger messenger = this.f56366a;
            if (messenger != null) {
                messenger.send(message);
                return;
            }
            FirebaseIidMessengerCompat firebaseIidMessengerCompat = this.f56367b;
            if (firebaseIidMessengerCompat != null) {
                firebaseIidMessengerCompat.mo79228a(message);
                return;
            }
            throw new IllegalStateException("Both messengers are null");
        }

        C22801b(IBinder iBinder) throws RemoteException {
            String str;
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if ("android.os.IMessenger".equals(interfaceDescriptor)) {
                this.f56366a = new Messenger(iBinder);
                this.f56367b = null;
            } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
                this.f56367b = new FirebaseIidMessengerCompat(iBinder);
                this.f56366a = null;
            } else {
                String valueOf = String.valueOf(interfaceDescriptor);
                if (valueOf.length() != 0) {
                    str = "Invalid interface descriptor: ".concat(valueOf);
                } else {
                    str = new String("Invalid interface descriptor: ");
                }
                Log.w("MessengerIpcClient", str);
                throw new RemoteException();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.firebase.iid.MessengerIpcClient$c */
    public static class C22802c extends AbstractC22803d<Void> {
        /* access modifiers changed from: package-private */
        @Override // com.google.firebase.iid.MessengerIpcClient.AbstractC22803d
        /* renamed from: a */
        public boolean mo79298a() {
            return true;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.firebase.iid.MessengerIpcClient.AbstractC22803d
        /* renamed from: a */
        public void mo79297a(Bundle bundle) {
            if (bundle.getBoolean("ack", false)) {
                mo79301a((Object) null);
            } else {
                mo79300a(new RequestFailedException(4, "Invalid response to one way request"));
            }
        }

        C22802c(int i, int i2, Bundle bundle) {
            super(i, i2, bundle);
        }
    }

    /* renamed from: a */
    public static synchronized MessengerIpcClient m82830a(Context context) {
        MessengerIpcClient messengerIpcClient;
        synchronized (MessengerIpcClient.class) {
            if (f56355c == null) {
                f56355c = new MessengerIpcClient(context, C21841a.m79153a().mo73918a(1, new NamedThreadFactory("MessengerIpcClient"), C21846f.f53255a));
            }
            messengerIpcClient = f56355c;
        }
        return messengerIpcClient;
    }

    /* renamed from: a */
    private synchronized <T> Task<T> m82829a(AbstractC22803d<T> dVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(dVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 9);
            sb.append("Queueing ");
            sb.append(valueOf);
            Log.d("MessengerIpcClient", sb.toString());
        }
        if (!this.f56358d.mo79286a((AbstractC22803d<?>) dVar)) {
            ServiceConnectionC22800a aVar = new ServiceConnectionC22800a();
            this.f56358d = aVar;
            aVar.mo79286a((AbstractC22803d<?>) dVar);
        }
        return dVar.mo79302b();
    }

    /* renamed from: b */
    public Task<Bundle> mo79278b(int i, Bundle bundle) {
        return m82829a(new C22804e(m82828a(), i, bundle));
    }

    MessengerIpcClient(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f56357b = scheduledExecutorService;
        this.f56356a = context.getApplicationContext();
    }

    /* renamed from: a */
    public Task<Void> mo79277a(int i, Bundle bundle) {
        return m82829a(new C22802c(m82828a(), i, bundle));
    }
}
