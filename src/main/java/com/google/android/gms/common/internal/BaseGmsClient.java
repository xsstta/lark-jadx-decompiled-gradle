package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.C21627b;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AbstractC21748h;
import com.google.android.gms.common.internal.IGmsCallbacks;
import com.google.android.gms.common.internal.IGmsServiceBroker;
import com.google.android.gms.internal.common.HandlerC21912c;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class BaseGmsClient<T extends IInterface> {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};
    public static final String KEY_PENDING_INTENT = "pendingIntent";
    private static final Feature[] zzbt = new Feature[0];
    private final Context mContext;
    final Handler mHandler;
    private final Object mLock;
    private int zzbu;
    private long zzbv;
    private long zzbw;
    private int zzbx;
    private long zzby;
    private C21736ag zzbz;
    private final Looper zzca;
    private final AbstractC21748h zzcb;
    private final GoogleApiAvailabilityLight zzcc;
    private final Object zzcd;
    private IGmsServiceBroker zzce;
    protected AbstractC21720a zzcf;
    private T zzcg;
    private final ArrayList<AbstractC21725f<?>> zzch;
    private ServiceConnectionC21726g zzci;
    private int zzcj;
    private final BaseConnectionCallbacks zzck;
    private final BaseOnConnectionFailedListener zzcl;
    private final int zzcm;
    private final String zzcn;
    private ConnectionResult zzco;
    private boolean zzcp;
    private volatile zzb zzcq;
    protected AtomicInteger zzcr;

    public interface BaseConnectionCallbacks {
        void onConnected(Bundle bundle);

        void onConnectionSuspended(int i);
    }

    public interface BaseOnConnectionFailedListener {
        void onConnectionFailed(ConnectionResult connectionResult);
    }

    /* renamed from: com.google.android.gms.common.internal.BaseGmsClient$a */
    public interface AbstractC21720a {
        /* renamed from: a */
        void mo73335a(ConnectionResult connectionResult);
    }

    /* renamed from: com.google.android.gms.common.internal.BaseGmsClient$b */
    protected class C21721b implements AbstractC21720a {
        public C21721b() {
        }

        @Override // com.google.android.gms.common.internal.BaseGmsClient.AbstractC21720a
        /* renamed from: a */
        public void mo73335a(ConnectionResult connectionResult) {
            if (connectionResult.isSuccess()) {
                BaseGmsClient baseGmsClient = BaseGmsClient.this;
                baseGmsClient.getRemoteService(null, baseGmsClient.getScopes());
            } else if (BaseGmsClient.this.zzcl != null) {
                BaseGmsClient.this.zzcl.onConnectionFailed(connectionResult);
            }
        }
    }

    /* renamed from: com.google.android.gms.common.internal.BaseGmsClient$c */
    public interface AbstractC21722c {
        /* renamed from: a */
        void mo73390a();
    }

    /* access modifiers changed from: protected */
    public abstract T createServiceInterface(IBinder iBinder);

    /* access modifiers changed from: protected */
    public boolean enableLocalFallback() {
        return false;
    }

    public Account getAccount() {
        return null;
    }

    public Bundle getConnectionHint() {
        return null;
    }

    /* access modifiers changed from: protected */
    public String getLocalStartServiceAction() {
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract String getServiceDescriptor();

    /* access modifiers changed from: protected */
    public abstract String getStartServiceAction();

    /* access modifiers changed from: protected */
    public String getStartServicePackage() {
        return "com.google.android.gms";
    }

    /* access modifiers changed from: package-private */
    public void onSetConnectState(int i, T t) {
    }

    public boolean providesSignIn() {
        return false;
    }

    public boolean requiresAccount() {
        return false;
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean requiresSignIn() {
        return false;
    }

    protected BaseGmsClient(Context context, Looper looper, int i, BaseConnectionCallbacks baseConnectionCallbacks, BaseOnConnectionFailedListener baseOnConnectionFailedListener, String str) {
        this(context, looper, AbstractC21748h.m78990a(context), GoogleApiAvailabilityLight.getInstance(), i, (BaseConnectionCallbacks) Preconditions.checkNotNull(baseConnectionCallbacks), (BaseOnConnectionFailedListener) Preconditions.checkNotNull(baseOnConnectionFailedListener), str);
    }

    /* renamed from: com.google.android.gms.common.internal.BaseGmsClient$e */
    final class HandlerC21724e extends HandlerC21912c {
        public HandlerC21724e(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            ConnectionResult connectionResult;
            ConnectionResult connectionResult2;
            if (BaseGmsClient.this.zzcr.get() != message.arg1) {
                if (m78895b(message)) {
                    m78894a(message);
                }
            } else if ((message.what == 1 || message.what == 7 || ((message.what == 4 && !BaseGmsClient.this.enableLocalFallback()) || message.what == 5)) && !BaseGmsClient.this.isConnecting()) {
                m78894a(message);
            } else {
                PendingIntent pendingIntent = null;
                if (message.what == 4) {
                    BaseGmsClient.this.zzco = new ConnectionResult(message.arg2);
                    if (!BaseGmsClient.this.zzl() || BaseGmsClient.this.zzcp) {
                        if (BaseGmsClient.this.zzco != null) {
                            connectionResult2 = BaseGmsClient.this.zzco;
                        } else {
                            connectionResult2 = new ConnectionResult(8);
                        }
                        BaseGmsClient.this.zzcf.mo73335a(connectionResult2);
                        BaseGmsClient.this.onConnectionFailed(connectionResult2);
                        return;
                    }
                    BaseGmsClient.this.zza((BaseGmsClient) 3, (int) null);
                } else if (message.what == 5) {
                    if (BaseGmsClient.this.zzco != null) {
                        connectionResult = BaseGmsClient.this.zzco;
                    } else {
                        connectionResult = new ConnectionResult(8);
                    }
                    BaseGmsClient.this.zzcf.mo73335a(connectionResult);
                    BaseGmsClient.this.onConnectionFailed(connectionResult);
                } else if (message.what == 3) {
                    if (message.obj instanceof PendingIntent) {
                        pendingIntent = (PendingIntent) message.obj;
                    }
                    ConnectionResult connectionResult3 = new ConnectionResult(message.arg2, pendingIntent);
                    BaseGmsClient.this.zzcf.mo73335a(connectionResult3);
                    BaseGmsClient.this.onConnectionFailed(connectionResult3);
                } else if (message.what == 6) {
                    BaseGmsClient.this.zza((BaseGmsClient) 5, (int) null);
                    if (BaseGmsClient.this.zzck != null) {
                        BaseGmsClient.this.zzck.onConnectionSuspended(message.arg2);
                    }
                    BaseGmsClient.this.onConnectionSuspended(message.arg2);
                    BaseGmsClient.this.zza((BaseGmsClient) 5, 1, (int) null);
                } else if (message.what == 2 && !BaseGmsClient.this.isConnected()) {
                    m78894a(message);
                } else if (m78895b(message)) {
                    ((AbstractC21725f) message.obj).mo73617c();
                } else {
                    int i = message.what;
                    StringBuilder sb = new StringBuilder(45);
                    sb.append("Don't know how to handle message: ");
                    sb.append(i);
                    Log.wtf("GmsClient", sb.toString(), new Exception());
                }
            }
        }

        /* renamed from: a */
        private static void m78894a(Message message) {
            AbstractC21725f fVar = (AbstractC21725f) message.obj;
            fVar.mo73615b();
            fVar.mo73618d();
        }

        /* renamed from: b */
        private static boolean m78895b(Message message) {
            return message.what == 2 || message.what == 1 || message.what == 7;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.google.android.gms.common.internal.BaseGmsClient$i */
    public final class C21728i extends AbstractC21723d {
        public C21728i(int i, Bundle bundle) {
            super(i, null);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.common.internal.BaseGmsClient.AbstractC21723d
        /* renamed from: a */
        public final void mo73612a(ConnectionResult connectionResult) {
            if (!BaseGmsClient.this.enableLocalFallback() || !BaseGmsClient.this.zzl()) {
                BaseGmsClient.this.zzcf.mo73335a(connectionResult);
                BaseGmsClient.this.onConnectionFailed(connectionResult);
                return;
            }
            BaseGmsClient.this.zzb((BaseGmsClient) 16);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.common.internal.BaseGmsClient.AbstractC21723d
        /* renamed from: a */
        public final boolean mo73614a() {
            BaseGmsClient.this.zzcf.mo73335a(ConnectionResult.RESULT_SUCCESS);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.google.android.gms.common.internal.BaseGmsClient$f */
    public abstract class AbstractC21725f<TListener> {

        /* renamed from: a */
        private TListener f52989a;

        /* renamed from: b */
        private boolean f52990b;

        public AbstractC21725f(TListener tlistener) {
            this.f52989a = tlistener;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo73613a(TListener tlistener);

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract void mo73615b();

        /* renamed from: c */
        public final void mo73617c() {
            TListener tlistener;
            synchronized (this) {
                tlistener = this.f52989a;
                if (this.f52990b) {
                    String valueOf = String.valueOf(this);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("Callback proxy ");
                    sb.append(valueOf);
                    sb.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb.toString());
                }
            }
            if (tlistener != null) {
                try {
                    mo73613a(tlistener);
                } catch (RuntimeException e) {
                    mo73615b();
                    throw e;
                }
            } else {
                mo73615b();
            }
            synchronized (this) {
                this.f52990b = true;
            }
            mo73618d();
        }

        /* renamed from: d */
        public final void mo73618d() {
            mo73619e();
            synchronized (BaseGmsClient.this.zzch) {
                BaseGmsClient.this.zzch.remove(this);
            }
        }

        /* renamed from: e */
        public final void mo73619e() {
            synchronized (this) {
                this.f52989a = null;
            }
        }
    }

    /* renamed from: com.google.android.gms.common.internal.BaseGmsClient$g */
    public final class ServiceConnectionC21726g implements ServiceConnection {

        /* renamed from: a */
        private final int f52992a;

        public ServiceConnectionC21726g(int i) {
            this.f52992a = i;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IGmsServiceBroker iGmsServiceBroker;
            if (iBinder == null) {
                BaseGmsClient.this.zzb((BaseGmsClient) 16);
                return;
            }
            synchronized (BaseGmsClient.this.zzcd) {
                BaseGmsClient baseGmsClient = BaseGmsClient.this;
                if (iBinder == null) {
                    iGmsServiceBroker = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof IGmsServiceBroker)) {
                        iGmsServiceBroker = new IGmsServiceBroker.Stub.zza(iBinder);
                    } else {
                        iGmsServiceBroker = (IGmsServiceBroker) queryLocalInterface;
                    }
                }
                baseGmsClient.zzce = iGmsServiceBroker;
            }
            BaseGmsClient.this.zza(0, (Bundle) null, this.f52992a);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            synchronized (BaseGmsClient.this.zzcd) {
                BaseGmsClient.this.zzce = null;
            }
            BaseGmsClient.this.mHandler.sendMessage(BaseGmsClient.this.mHandler.obtainMessage(6, this.f52992a, 1));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.google.android.gms.common.internal.BaseGmsClient$h */
    public final class C21727h extends AbstractC21723d {

        /* renamed from: a */
        private final IBinder f52994a;

        public C21727h(int i, IBinder iBinder, Bundle bundle) {
            super(i, bundle);
            this.f52994a = iBinder;
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.common.internal.BaseGmsClient.AbstractC21723d
        /* renamed from: a */
        public final void mo73612a(ConnectionResult connectionResult) {
            if (BaseGmsClient.this.zzcl != null) {
                BaseGmsClient.this.zzcl.onConnectionFailed(connectionResult);
            }
            BaseGmsClient.this.onConnectionFailed(connectionResult);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.common.internal.BaseGmsClient.AbstractC21723d
        /* renamed from: a */
        public final boolean mo73614a() {
            try {
                String interfaceDescriptor = this.f52994a.getInterfaceDescriptor();
                if (!BaseGmsClient.this.getServiceDescriptor().equals(interfaceDescriptor)) {
                    String serviceDescriptor = BaseGmsClient.this.getServiceDescriptor();
                    StringBuilder sb = new StringBuilder(String.valueOf(serviceDescriptor).length() + 34 + String.valueOf(interfaceDescriptor).length());
                    sb.append("service descriptor mismatch: ");
                    sb.append(serviceDescriptor);
                    sb.append(" vs. ");
                    sb.append(interfaceDescriptor);
                    Log.e("GmsClient", sb.toString());
                    return false;
                }
                IInterface createServiceInterface = BaseGmsClient.this.createServiceInterface(this.f52994a);
                if (createServiceInterface == null || (!BaseGmsClient.this.zza((BaseGmsClient) 2, 4, (int) createServiceInterface) && !BaseGmsClient.this.zza((BaseGmsClient) 3, 4, (int) createServiceInterface))) {
                    return false;
                }
                BaseGmsClient.this.zzco = null;
                Bundle connectionHint = BaseGmsClient.this.getConnectionHint();
                if (BaseGmsClient.this.zzck == null) {
                    return true;
                }
                BaseGmsClient.this.zzck.onConnected(connectionHint);
                return true;
            } catch (RemoteException unused) {
                Log.w("GmsClient", "service probably died");
                return false;
            }
        }
    }

    public static final class zzd extends IGmsCallbacks.zza {
        private BaseGmsClient zzcw;
        private final int zzcx;

        public zzd(BaseGmsClient baseGmsClient, int i) {
            this.zzcw = baseGmsClient;
            this.zzcx = i;
        }

        @Override // com.google.android.gms.common.internal.IGmsCallbacks
        public final void zza(int i, Bundle bundle) {
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        }

        @Override // com.google.android.gms.common.internal.IGmsCallbacks
        public final void onPostInitComplete(int i, IBinder iBinder, Bundle bundle) {
            Preconditions.checkNotNull(this.zzcw, "onPostInitComplete can be called only once per call to getRemoteService");
            this.zzcw.onPostInitHandler(i, iBinder, bundle, this.zzcx);
            this.zzcw = null;
        }

        @Override // com.google.android.gms.common.internal.IGmsCallbacks
        public final void zza(int i, IBinder iBinder, zzb zzb) {
            Preconditions.checkNotNull(this.zzcw, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            Preconditions.checkNotNull(zzb);
            this.zzcw.zza((BaseGmsClient) zzb);
            onPostInitComplete(i, iBinder, zzb.f53115a);
        }
    }

    /* renamed from: com.google.android.gms.common.internal.BaseGmsClient$d */
    private abstract class AbstractC21723d extends AbstractC21725f<Boolean> {

        /* renamed from: a */
        private final int f52985a;

        /* renamed from: b */
        private final Bundle f52986b;

        protected AbstractC21723d(int i, Bundle bundle) {
            super(true);
            this.f52985a = i;
            this.f52986b = bundle;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo73612a(ConnectionResult connectionResult);

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract boolean mo73614a();

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.common.internal.BaseGmsClient.AbstractC21725f
        /* renamed from: b */
        public final void mo73615b() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.common.internal.BaseGmsClient.AbstractC21725f
        /* renamed from: a */
        public final /* synthetic */ void mo73613a(Boolean bool) {
            PendingIntent pendingIntent = null;
            if (bool == null) {
                BaseGmsClient.this.zza((BaseGmsClient) 1, (int) null);
                return;
            }
            int i = this.f52985a;
            if (i != 0) {
                if (i != 10) {
                    BaseGmsClient.this.zza((BaseGmsClient) 1, (int) null);
                    Bundle bundle = this.f52986b;
                    if (bundle != null) {
                        pendingIntent = (PendingIntent) bundle.getParcelable(BaseGmsClient.KEY_PENDING_INTENT);
                    }
                    mo73612a(new ConnectionResult(this.f52985a, pendingIntent));
                    return;
                }
                BaseGmsClient.this.zza((BaseGmsClient) 1, (int) null);
                throw new IllegalStateException(String.format("A fatal developer error has occurred. Class name: %s. Start service action: %s. Service Descriptor: %s. ", getClass().getSimpleName(), BaseGmsClient.this.getStartServiceAction(), BaseGmsClient.this.getServiceDescriptor()));
            } else if (!mo73614a()) {
                BaseGmsClient.this.zza((BaseGmsClient) 1, (int) null);
                mo73612a(new ConnectionResult(8, null));
            }
        }
    }

    protected BaseGmsClient(Context context, Looper looper, AbstractC21748h hVar, GoogleApiAvailabilityLight googleApiAvailabilityLight, int i, BaseConnectionCallbacks baseConnectionCallbacks, BaseOnConnectionFailedListener baseOnConnectionFailedListener, String str) {
        this.mLock = new Object();
        this.zzcd = new Object();
        this.zzch = new ArrayList<>();
        this.zzcj = 1;
        this.zzco = null;
        this.zzcp = false;
        this.zzcq = null;
        this.zzcr = new AtomicInteger(0);
        this.mContext = (Context) Preconditions.checkNotNull(context, "Context must not be null");
        this.zzca = (Looper) Preconditions.checkNotNull(looper, "Looper must not be null");
        this.zzcb = (AbstractC21748h) Preconditions.checkNotNull(hVar, "Supervisor must not be null");
        this.zzcc = (GoogleApiAvailabilityLight) Preconditions.checkNotNull(googleApiAvailabilityLight, "API availability must not be null");
        this.mHandler = new HandlerC21724e(looper);
        this.zzcm = i;
        this.zzck = baseConnectionCallbacks;
        this.zzcl = baseOnConnectionFailedListener;
        this.zzcn = str;
    }

    protected BaseGmsClient(Context context, Handler handler, AbstractC21748h hVar, GoogleApiAvailabilityLight googleApiAvailabilityLight, int i, BaseConnectionCallbacks baseConnectionCallbacks, BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        this.mLock = new Object();
        this.zzcd = new Object();
        this.zzch = new ArrayList<>();
        this.zzcj = 1;
        this.zzco = null;
        this.zzcp = false;
        this.zzcq = null;
        this.zzcr = new AtomicInteger(0);
        this.mContext = (Context) Preconditions.checkNotNull(context, "Context must not be null");
        this.mHandler = (Handler) Preconditions.checkNotNull(handler, "Handler must not be null");
        this.zzca = handler.getLooper();
        this.zzcb = (AbstractC21748h) Preconditions.checkNotNull(hVar, "Supervisor must not be null");
        this.zzcc = (GoogleApiAvailabilityLight) Preconditions.checkNotNull(googleApiAvailabilityLight, "API availability must not be null");
        this.zzcm = i;
        this.zzck = baseConnectionCallbacks;
        this.zzcl = baseOnConnectionFailedListener;
        this.zzcn = null;
    }

    private final String zzj() {
        String str = this.zzcn;
        return str == null ? this.mContext.getClass().getName() : str;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void zza(zzb zzb) {
        this.zzcq = zzb;
    }

    public final Feature[] getAvailableFeatures() {
        zzb zzb = this.zzcq;
        if (zzb == null) {
            return null;
        }
        return zzb.f53116b;
    }

    /* access modifiers changed from: protected */
    public void onConnectedLocked(T t) {
        this.zzbw = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    public void onConnectionSuspended(int i) {
        this.zzbu = i;
        this.zzbv = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    public void onConnectionFailed(ConnectionResult connectionResult) {
        this.zzbx = connectionResult.getErrorCode();
        this.zzby = System.currentTimeMillis();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void zza(int i, T t) {
        C21736ag agVar;
        C21736ag agVar2;
        Preconditions.checkArgument((i == 4) == (t != null));
        synchronized (this.mLock) {
            this.zzcj = i;
            this.zzcg = t;
            onSetConnectState(i, t);
            if (i != 1) {
                if (i == 2 || i == 3) {
                    if (!(this.zzci == null || (agVar2 = this.zzbz) == null)) {
                        String a = agVar2.mo73680a();
                        String b = this.zzbz.mo73681b();
                        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 70 + String.valueOf(b).length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(a);
                        sb.append(" on ");
                        sb.append(b);
                        Log.e("GmsClient", sb.toString());
                        this.zzcb.mo73716a(this.zzbz.mo73680a(), this.zzbz.mo73681b(), this.zzbz.mo73682c(), this.zzci, zzj());
                        this.zzcr.incrementAndGet();
                    }
                    this.zzci = new ServiceConnectionC21726g(this.zzcr.get());
                    if (this.zzcj != 3 || getLocalStartServiceAction() == null) {
                        agVar = new C21736ag(getStartServicePackage(), getStartServiceAction(), false, 129);
                    } else {
                        agVar = new C21736ag(getContext().getPackageName(), getLocalStartServiceAction(), true, 129);
                    }
                    this.zzbz = agVar;
                    if (!this.zzcb.mo73665a(new AbstractC21748h.C21749a(agVar.mo73680a(), this.zzbz.mo73681b(), this.zzbz.mo73682c()), this.zzci, zzj())) {
                        String a2 = this.zzbz.mo73680a();
                        String b2 = this.zzbz.mo73681b();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(a2).length() + 34 + String.valueOf(b2).length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(a2);
                        sb2.append(" on ");
                        sb2.append(b2);
                        Log.e("GmsClient", sb2.toString());
                        zza(16, (Bundle) null, this.zzcr.get());
                    }
                } else if (i == 4) {
                    onConnectedLocked(t);
                }
            } else if (this.zzci != null) {
                this.zzcb.mo73716a(this.zzbz.mo73680a(), this.zzbz.mo73681b(), this.zzbz.mo73682c(), this.zzci, zzj());
                this.zzci = null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final boolean zza(int i, int i2, T t) {
        synchronized (this.mLock) {
            if (this.zzcj != i) {
                return false;
            }
            zza(i2, t);
            return true;
        }
    }

    public void checkAvailabilityAndConnect() {
        int isGooglePlayServicesAvailable = this.zzcc.isGooglePlayServicesAvailable(this.mContext, getMinApkVersion());
        if (isGooglePlayServicesAvailable != 0) {
            zza(1, (IInterface) null);
            triggerNotAvailable(new C21721b(), isGooglePlayServicesAvailable, null);
            return;
        }
        connect(new C21721b());
    }

    public void connect(AbstractC21720a aVar) {
        this.zzcf = (AbstractC21720a) Preconditions.checkNotNull(aVar, "Connection progress callbacks cannot be null.");
        zza(2, (IInterface) null);
    }

    public boolean isConnected() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzcj == 4;
        }
        return z;
    }

    public boolean isConnecting() {
        boolean z;
        synchronized (this.mLock) {
            int i = this.zzcj;
            if (i != 2) {
                if (i != 3) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    private final boolean zzk() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzcj == 3;
        }
        return z;
    }

    public void disconnect() {
        this.zzcr.incrementAndGet();
        synchronized (this.zzch) {
            int size = this.zzch.size();
            for (int i = 0; i < size; i++) {
                this.zzch.get(i).mo73619e();
            }
            this.zzch.clear();
        }
        synchronized (this.zzcd) {
            this.zzce = null;
        }
        zza(1, (IInterface) null);
    }

    public void triggerConnectionSuspended(int i) {
        Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(6, this.zzcr.get(), i));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void zzb(int i) {
        int i2;
        if (zzk()) {
            i2 = 5;
            this.zzcp = true;
        } else {
            i2 = 4;
        }
        Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(i2, this.zzcr.get(), 16));
    }

    /* access modifiers changed from: protected */
    public void triggerNotAvailable(AbstractC21720a aVar, int i, PendingIntent pendingIntent) {
        this.zzcf = (AbstractC21720a) Preconditions.checkNotNull(aVar, "Connection progress callbacks cannot be null.");
        Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(3, this.zzcr.get(), i, pendingIntent));
    }

    public final Context getContext() {
        return this.mContext;
    }

    public final Looper getLooper() {
        return this.zzca;
    }

    public Feature[] getApiFeatures() {
        return zzbt;
    }

    /* access modifiers changed from: protected */
    public Bundle getGetServiceRequestExtraArgs() {
        return new Bundle();
    }

    /* access modifiers changed from: protected */
    public void onPostInitHandler(int i, IBinder iBinder, Bundle bundle, int i2) {
        Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, new C21727h(i, iBinder, bundle)));
    }

    /* access modifiers changed from: protected */
    public final void zza(int i, Bundle bundle, int i2) {
        Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, new C21728i(i, null)));
    }

    /* access modifiers changed from: protected */
    public final void checkConnected() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public final T getService() throws DeadObjectException {
        T t;
        synchronized (this.mLock) {
            if (this.zzcj != 5) {
                checkConnected();
                Preconditions.checkState(this.zzcg != null, "Client is connected but service is null");
                t = this.zzcg;
            } else {
                throw new DeadObjectException();
            }
        }
        return t;
    }

    public void getRemoteService(IAccountAccessor iAccountAccessor, Set<Scope> set) {
        Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        GetServiceRequest getServiceRequest = new GetServiceRequest(this.zzcm);
        getServiceRequest.f53003a = this.mContext.getPackageName();
        getServiceRequest.f53006d = getServiceRequestExtraArgs;
        if (set != null) {
            getServiceRequest.f53005c = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (requiresSignIn()) {
            getServiceRequest.f53007e = getAccount() != null ? getAccount() : new Account("<<default account>>", "com.google");
            if (iAccountAccessor != null) {
                getServiceRequest.f53004b = iAccountAccessor.asBinder();
            }
        } else if (requiresAccount()) {
            getServiceRequest.f53007e = getAccount();
        }
        getServiceRequest.f53008f = zzbt;
        getServiceRequest.f53009g = getApiFeatures();
        try {
            synchronized (this.zzcd) {
                IGmsServiceBroker iGmsServiceBroker = this.zzce;
                if (iGmsServiceBroker != null) {
                    iGmsServiceBroker.getService(new zzd(this, this.zzcr.get()), getServiceRequest);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            triggerConnectionSuspended(1);
        } catch (SecurityException e2) {
            throw e2;
        } catch (RemoteException | RuntimeException e3) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e3);
            onPostInitHandler(8, null, null, this.zzcr.get());
        }
    }

    public void onUserSignOut(AbstractC21722c cVar) {
        cVar.mo73390a();
    }

    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    /* access modifiers changed from: protected */
    public Set<Scope> getScopes() {
        return Collections.EMPTY_SET;
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i;
        T t;
        IGmsServiceBroker iGmsServiceBroker;
        synchronized (this.mLock) {
            i = this.zzcj;
            t = this.zzcg;
        }
        synchronized (this.zzcd) {
            iGmsServiceBroker = this.zzce;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i == 4) {
            printWriter.print("CONNECTED");
        } else if (i != 5) {
            printWriter.print(GrsBaseInfo.CountryCodeSource.UNKNOWN);
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (t == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) getServiceDescriptor()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(t.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (iGmsServiceBroker == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(iGmsServiceBroker.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.zzbw > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j = this.zzbw;
            String format = simpleDateFormat.format(new Date(this.zzbw));
            StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 21);
            sb.append(j);
            sb.append(" ");
            sb.append(format);
            append.println(sb.toString());
        }
        if (this.zzbv > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i2 = this.zzbu;
            if (i2 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i2 != 2) {
                printWriter.append((CharSequence) String.valueOf(i2));
            } else {
                printWriter.append("CAUSE_NETWORK_LOST");
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j2 = this.zzbv;
            String format2 = simpleDateFormat.format(new Date(this.zzbv));
            StringBuilder sb2 = new StringBuilder(String.valueOf(format2).length() + 21);
            sb2.append(j2);
            sb2.append(" ");
            sb2.append(format2);
            append2.println(sb2.toString());
        }
        if (this.zzby > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) C21627b.getStatusCodeString(this.zzbx));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j3 = this.zzby;
            String format3 = simpleDateFormat.format(new Date(this.zzby));
            StringBuilder sb3 = new StringBuilder(String.valueOf(format3).length() + 21);
            sb3.append(j3);
            sb3.append(" ");
            sb3.append(format3);
            append3.println(sb3.toString());
        }
    }

    public IBinder getServiceBrokerBinder() {
        synchronized (this.zzcd) {
            IGmsServiceBroker iGmsServiceBroker = this.zzce;
            if (iGmsServiceBroker == null) {
                return null;
            }
            return iGmsServiceBroker.asBinder();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final boolean zzl() {
        if (this.zzcp || TextUtils.isEmpty(getServiceDescriptor()) || TextUtils.isEmpty(getLocalStartServiceAction())) {
            return false;
        }
        try {
            Class.forName(getServiceDescriptor());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public String getEndpointPackageName() {
        C21736ag agVar;
        if (isConnected() && (agVar = this.zzbz) != null) {
            return agVar.mo73681b();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    public int getMinApkVersion() {
        return GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }
}
