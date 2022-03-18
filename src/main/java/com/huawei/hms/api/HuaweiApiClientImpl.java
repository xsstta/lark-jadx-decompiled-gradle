package com.huawei.hms.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiClient;
import com.huawei.hms.common.api.ConnectionPostProcessor;
import com.huawei.hms.common.internal.AutoLifecycleFragment;
import com.huawei.hms.core.aidl.AbstractC23525c;
import com.huawei.hms.core.aidl.AbstractC23528d;
import com.huawei.hms.core.aidl.C23522a;
import com.huawei.hms.core.aidl.C23523b;
import com.huawei.hms.core.aidl.C23531e;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.RequestHeader;
import com.huawei.hms.core.aidl.ResponseHeader;
import com.huawei.hms.support.api.PendingResultImpl;
import com.huawei.hms.support.api.ResolveResult;
import com.huawei.hms.support.api.client.ApiClient;
import com.huawei.hms.support.api.client.BundleResult;
import com.huawei.hms.support.api.client.InnerApiClient;
import com.huawei.hms.support.api.client.PendingResult;
import com.huawei.hms.support.api.client.ResultCallback;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.client.SubAppInfo;
import com.huawei.hms.support.api.core.ConnectService;
import com.huawei.hms.support.api.entity.auth.PermissionInfo;
import com.huawei.hms.support.api.entity.auth.Scope;
import com.huawei.hms.support.api.entity.core.CheckConnectInfo;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.hms.support.api.entity.core.ConnectInfo;
import com.huawei.hms.support.api.entity.core.ConnectResp;
import com.huawei.hms.support.api.entity.core.DisconnectInfo;
import com.huawei.hms.support.api.entity.core.DisconnectResp;
import com.huawei.hms.support.api.entity.core.JosGetNoticeResp;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.manager.HMSPublishStateHolder;
import com.huawei.hms.update.manager.PackageNameManager;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hms.utils.UIUtil;
import com.huawei.hms.utils.Util;
import com.huawei.updatesdk.UpdateSdkAPI;
import com.huawei.updatesdk.service.appmgr.bean.ApkUpgradeInfo;
import com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class HuaweiApiClientImpl extends HuaweiApiClient implements ServiceConnection, InnerApiClient {

    /* renamed from: B */
    private static final Object f57809B = new Object();

    /* renamed from: C */
    private static final Object f57810C = new Object();
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final int SIGN_IN_MODE_OPTIONAL = 2;
    public static final int SIGN_IN_MODE_REQUIRED = 1;

    /* renamed from: A */
    private CheckUpdateCallBack f57811A;

    /* renamed from: a */
    private int f57812a = -1;

    /* renamed from: b */
    private final Context f57813b;

    /* renamed from: c */
    private final String f57814c;

    /* renamed from: d */
    private String f57815d;

    /* renamed from: e */
    private String f57816e;

    /* renamed from: f */
    private volatile AbstractC23528d f57817f;

    /* renamed from: g */
    private String f57818g;

    /* renamed from: h */
    private WeakReference<Activity> f57819h;

    /* renamed from: i */
    private WeakReference<Activity> f57820i;

    /* renamed from: j */
    private boolean f57821j = false;

    /* renamed from: k */
    private AtomicInteger f57822k = new AtomicInteger(1);

    /* renamed from: l */
    private List<Scope> f57823l;

    /* renamed from: m */
    private List<PermissionInfo> f57824m;

    /* renamed from: n */
    private Map<Api<?>, Api.ApiOptions> f57825n;

    /* renamed from: o */
    private SubAppInfo f57826o;

    /* renamed from: p */
    private long f57827p = 0;

    /* renamed from: q */
    private int f57828q = 0;

    /* renamed from: r */
    private final Object f57829r = new Object();

    /* renamed from: s */
    private final ReentrantLock f57830s;

    /* renamed from: t */
    private final Condition f57831t;

    /* renamed from: u */
    private ConnectionResult f57832u;

    /* renamed from: v */
    private HuaweiApiClient.ConnectionCallbacks f57833v;

    /* renamed from: w */
    private HuaweiApiClient.OnConnectionFailedListener f57834w;

    /* renamed from: x */
    private Handler f57835x;

    /* renamed from: y */
    private Handler f57836y;

    /* renamed from: z */
    private CheckUpdatelistener f57837z;

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void print(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public Map<Api<?>, Api.ApiOptions> getApiMap() {
        return this.f57825n;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getAppID() {
        return this.f57815d;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public Context getContext() {
        return this.f57813b;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getCpID() {
        return this.f57816e;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public List<PermissionInfo> getPermissionInfos() {
        return this.f57824m;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public List<Scope> getScopes() {
        return this.f57823l;
    }

    @Override // com.huawei.hms.support.api.client.AidlApiClient
    public AbstractC23528d getService() {
        return this.f57817f;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getSessionId() {
        return this.f57818g;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public final SubAppInfo getSubAppInfo() {
        return this.f57826o;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.huawei.hms.api.HuaweiApiClientImpl$i */
    public class C23457i implements PackageNameManager.QueryPublishCallback {

        /* renamed from: a */
        private int f57849a;

        @Override // com.huawei.hms.update.manager.PackageNameManager.QueryPublishCallback
        public void onQueryResult() {
            HuaweiApiClientImpl.this.m85056b((HuaweiApiClientImpl) this.f57849a);
        }

        public C23457i(int i) {
            this.f57849a = i;
        }
    }

    /* renamed from: g */
    private void m85068g() {
        this.f57811A = new C23447a();
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public PendingResult<Status> discardAndReconnect() {
        return new C23451e(this, null, null);
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getPackageName() {
        return this.f57813b.getPackageName();
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getTransportName() {
        return IPCTransport.class.getName();
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void reconnect() {
        disconnect();
        connect((Activity) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.huawei.hms.api.HuaweiApiClientImpl$f */
    public class C23452f implements ResultCallback<ResolveResult<ConnectResp>> {

        /* access modifiers changed from: package-private */
        /* renamed from: com.huawei.hms.api.HuaweiApiClientImpl$f$a */
        public class RunnableC23453a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ ResolveResult f57843a;

            public void run() {
                HuaweiApiClientImpl.this.m85052a((HuaweiApiClientImpl) this.f57843a);
            }

            RunnableC23453a(ResolveResult resolveResult) {
                this.f57843a = resolveResult;
            }
        }

        private C23452f() {
        }

        /* renamed from: a */
        public void onResult(ResolveResult<ConnectResp> resolveResult) {
            new Handler(Looper.getMainLooper()).post(new RunnableC23453a(resolveResult));
        }

        /* synthetic */ C23452f(HuaweiApiClientImpl huaweiApiClientImpl, C23447a aVar) {
            this();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.huawei.hms.api.HuaweiApiClientImpl$g */
    public class C23454g implements ResultCallback<ResolveResult<DisconnectResp>> {

        /* access modifiers changed from: package-private */
        /* renamed from: com.huawei.hms.api.HuaweiApiClientImpl$g$a */
        public class RunnableC23455a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ ResolveResult f57846a;

            public void run() {
                HuaweiApiClientImpl.this.m85059b((HuaweiApiClientImpl) this.f57846a);
            }

            RunnableC23455a(ResolveResult resolveResult) {
                this.f57846a = resolveResult;
            }
        }

        private C23454g() {
        }

        /* renamed from: a */
        public void onResult(ResolveResult<DisconnectResp> resolveResult) {
            new Handler(Looper.getMainLooper()).post(new RunnableC23455a(resolveResult));
        }

        /* synthetic */ C23454g(HuaweiApiClientImpl huaweiApiClientImpl, C23447a aVar) {
            this();
        }
    }

    /* renamed from: o */
    private void m85076o() {
        Util.unBindServiceCatchException(this.f57813b, this);
        this.f57817f = null;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public Activity getTopActivity() {
        WeakReference<Activity> weakReference = this.f57820i;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* renamed from: k */
    private void m85072k() {
        HMSLog.m86966i("HuaweiApiClientImpl", "Enter sendConnectApiServceRequest.");
        ConnectService.connect(this, m85060c()).setResultCallback(new C23452f(this, null));
    }

    /* renamed from: l */
    private void m85073l() {
        ConnectService.disconnect(this, m85063d()).setResultCallback(new C23454g(this, null));
    }

    /* renamed from: m */
    private void m85074m() {
        HMSLog.m86966i("HuaweiApiClientImpl", "Enter sendForceConnectApiServceRequest.");
        ConnectService.forceConnect(this, m85060c()).setResultCallback(new C23452f(this, null));
    }

    @Override // com.huawei.hms.support.api.client.InnerApiClient
    public boolean innerIsConnected() {
        if (this.f57822k.get() == 3 || this.f57822k.get() == 4) {
            return true;
        }
        return false;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public boolean isConnecting() {
        int i = this.f57822k.get();
        if (i == 2 || i == 5) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m85048a() {
        Intent intent = new Intent("com.huawei.hms.core.aidlservice");
        HMSPackageManager.getInstance(this.f57813b).refresh();
        intent.setPackage(HMSPackageManager.getInstance(this.f57813b).getHMSPackageName());
        synchronized (f57809B) {
            if (this.f57813b.bindService(intent, this, 1)) {
                m85070i();
                return;
            }
            m85065d(1);
            HMSLog.m86964e("HuaweiApiClientImpl", "In connect, bind core service fail");
            m85055b();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private void m85055b() {
        int i;
        m85076o();
        if (this.f57834w != null) {
            if (UIUtil.isBackground(this.f57813b)) {
                i = 7;
            } else {
                i = 6;
            }
            PendingIntent pendingIntent = null;
            WeakReference<Activity> weakReference = this.f57819h;
            if (!(weakReference == null || weakReference.get() == null)) {
                pendingIntent = HuaweiApiAvailability.getInstance().getResolveErrorPendingIntent(this.f57819h.get(), i);
            }
            ConnectionResult connectionResult = new ConnectionResult(i, pendingIntent);
            this.f57834w.onConnectionFailed(connectionResult);
            this.f57832u = connectionResult;
        }
    }

    /* renamed from: c */
    private ConnectInfo m85060c() {
        String str;
        String packageSignature = new PackageManagerHelper(this.f57813b).getPackageSignature(this.f57813b.getPackageName());
        if (packageSignature == null) {
            packageSignature = "";
        }
        SubAppInfo subAppInfo = this.f57826o;
        if (subAppInfo == null) {
            str = null;
        } else {
            str = subAppInfo.getSubAppID();
        }
        return new ConnectInfo(getApiNameList(), this.f57823l, packageSignature, str);
    }

    /* renamed from: d */
    private DisconnectInfo m85063d() {
        ArrayList arrayList = new ArrayList();
        Map<Api<?>, Api.ApiOptions> map = this.f57825n;
        if (map != null) {
            for (Api<?> api : map.keySet()) {
                arrayList.add(api.getApiName());
            }
        }
        return new DisconnectInfo(this.f57823l, arrayList);
    }

    /* renamed from: e */
    private int m85066e() {
        int hmsVersion = Util.getHmsVersion(this.f57813b);
        if (hmsVersion != 0 && hmsVersion >= 20503000) {
            return hmsVersion;
        }
        int f = m85067f();
        if (m85069h()) {
            if (f < 20503000) {
                return 20503000;
            }
            return f;
        } else if (f < 20600000) {
            return 20600000;
        } else {
            return f;
        }
    }

    /* renamed from: f */
    private int m85067f() {
        Integer num;
        int intValue;
        Map<Api<?>, Api.ApiOptions> apiMap = getApiMap();
        int i = 0;
        if (apiMap == null) {
            return 0;
        }
        for (Api<?> api : apiMap.keySet()) {
            String apiName = api.getApiName();
            if (!TextUtils.isEmpty(apiName) && (num = HuaweiApiAvailability.getApiMap().get(apiName)) != null && (intValue = num.intValue()) > i) {
                i = intValue;
            }
        }
        return i;
    }

    /* renamed from: h */
    private boolean m85069h() {
        Map<Api<?>, Api.ApiOptions> map = this.f57825n;
        if (map == null) {
            return false;
        }
        for (Api<?> api : map.keySet()) {
            if (HuaweiApiAvailability.HMS_API_NAME_GAME.equals(api.getApiName())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    private void m85070i() {
        Handler handler = this.f57835x;
        if (handler != null) {
            handler.removeMessages(2);
        } else {
            this.f57835x = new Handler(Looper.getMainLooper(), new C23448b());
        }
        this.f57835x.sendEmptyMessageDelayed(2, 5000);
    }

    /* renamed from: j */
    private void m85071j() {
        synchronized (f57810C) {
            Handler handler = this.f57836y;
            if (handler != null) {
                handler.removeMessages(3);
            } else {
                this.f57836y = new Handler(Looper.getMainLooper(), new C23449c());
            }
            boolean sendEmptyMessageDelayed = this.f57836y.sendEmptyMessageDelayed(3, 3000);
            HMSLog.m86961d("HuaweiApiClientImpl", "sendEmptyMessageDelayed for onConnectionResult 3 seconds. the result is : " + sendEmptyMessageDelayed);
        }
    }

    /* renamed from: n */
    private void m85075n() {
        if (this.f57821j) {
            HMSLog.m86966i("HuaweiApiClientImpl", "Connect notice has been shown.");
        } else if (HuaweiApiAvailability.getInstance().isHuaweiMobileNoticeAvailable(this.f57813b) == 0) {
            ConnectService.getNotice(this, 0, "5.0.5.300").setResultCallback(new C23456h(this, null));
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void disconnect() {
        int i = this.f57822k.get();
        HMSLog.m86966i("HuaweiApiClientImpl", "Enter disconnect, Connection Status: " + i);
        if (i == 2) {
            m85065d(4);
        } else if (i == 3) {
            m85065d(4);
            m85073l();
        } else if (i == 5) {
            m85049a(2);
            m85065d(4);
        }
    }

    @Override // com.huawei.hms.support.api.client.AidlApiClient
    public List<String> getApiNameList() {
        ArrayList arrayList = new ArrayList();
        Map<Api<?>, Api.ApiOptions> map = this.f57825n;
        if (map != null) {
            for (Api<?> api : map.keySet()) {
                arrayList.add(api.getApiName());
            }
        }
        return arrayList;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void connectForeground() {
        String str;
        HMSLog.m86966i("HuaweiApiClientImpl", "====== HMSSDK version: 50005300 ======");
        int i = this.f57822k.get();
        HMSLog.m86966i("HuaweiApiClientImpl", "Enter forceConnect, Connection Status: " + i);
        if (i != 3 && i != 5 && i != 2 && i != 4) {
            if (TextUtils.isEmpty(this.f57814c)) {
                str = Util.getAppId(this.f57813b);
            } else {
                str = this.f57814c;
            }
            this.f57815d = str;
            m85074m();
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public ConnectionResult holdUpConnect() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.f57830s.lock();
            try {
                connect((Activity) null);
                while (isConnecting()) {
                    try {
                        this.f57831t.await();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return new ConnectionResult(15, (PendingIntent) null);
                    }
                }
                if (isConnected()) {
                    this.f57832u = null;
                    ConnectionResult connectionResult = new ConnectionResult(0, (PendingIntent) null);
                    this.f57830s.unlock();
                    return connectionResult;
                }
                ConnectionResult connectionResult2 = this.f57832u;
                if (connectionResult2 != null) {
                    this.f57830s.unlock();
                    return connectionResult2;
                }
                ConnectionResult connectionResult3 = new ConnectionResult(13, (PendingIntent) null);
                this.f57830s.unlock();
                return connectionResult3;
            } finally {
                this.f57830s.unlock();
            }
        } else {
            throw new IllegalStateException("blockingConnect must not be called on the UI thread");
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient, com.huawei.hms.support.api.client.ApiClient
    public boolean isConnected() {
        if (this.f57828q == 0) {
            this.f57828q = HMSPackageManager.getInstance(this.f57813b).getHmsVersionCode();
        }
        if (this.f57828q >= 20504000) {
            return innerIsConnected();
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f57827p;
        if (currentTimeMillis > 0 && currentTimeMillis < 300000) {
            return innerIsConnected();
        }
        if (!innerIsConnected()) {
            return false;
        }
        Status status = ConnectService.checkconnect(this, new CheckConnectInfo()).awaitOnAnyThread(2000, TimeUnit.MILLISECONDS).getStatus();
        if (status.isSuccess()) {
            this.f57827p = System.currentTimeMillis();
            return true;
        }
        int statusCode = status.getStatusCode();
        HMSLog.m86966i("HuaweiApiClientImpl", "isConnected is false, statuscode:" + statusCode);
        if (statusCode == 907135004) {
            return false;
        }
        m85076o();
        m85065d(1);
        this.f57827p = System.currentTimeMillis();
        return false;
    }

    public void setApiMap(Map<Api<?>, Api.ApiOptions> map) {
        this.f57825n = map;
    }

    /* access modifiers changed from: protected */
    public void setAutoLifecycleClientId(int i) {
        this.f57812a = i;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void setConnectionCallbacks(HuaweiApiClient.ConnectionCallbacks connectionCallbacks) {
        this.f57833v = connectionCallbacks;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void setConnectionFailedListener(HuaweiApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.f57834w = onConnectionFailedListener;
    }

    public void setHasShowNotice(boolean z) {
        this.f57821j = z;
    }

    public void setPermissionInfos(List<PermissionInfo> list) {
        this.f57824m = list;
    }

    public void setScopes(List<Scope> list) {
        this.f57823l = list;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.huawei.hms.api.HuaweiApiClientImpl$a */
    public class C23447a implements CheckUpdateCallBack {
        C23447a() {
        }

        @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
        public void onMarketStoreError(int i) {
            HMSLog.m86964e("HuaweiApiClientImpl", "onMarketStoreError responseCode: " + i);
        }

        @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
        public void onUpdateStoreError(int i) {
            HMSLog.m86964e("HuaweiApiClientImpl", "onUpdateStoreError responseCode: " + i);
        }

        @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
        public void onMarketInstallInfo(Intent intent) {
            if (intent != null) {
                int intExtra = intent.getIntExtra(UpdateKey.MARKET_DLD_STATUS, -99);
                int intExtra2 = intent.getIntExtra(UpdateKey.MARKET_INSTALL_STATE, -99);
                int intExtra3 = intent.getIntExtra(UpdateKey.MARKET_INSTALL_TYPE, -99);
                HMSLog.m86966i("HuaweiApiClientImpl", "onMarketInstallInfo installState: " + intExtra2 + ",installType: " + intExtra3 + ",downloadCode: " + intExtra);
            }
        }

        @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
        public void onUpdateInfo(Intent intent) {
            if (intent != null && HuaweiApiClientImpl.this.f57837z != null) {
                try {
                    int intExtra = intent.getIntExtra(UpdateKey.STATUS, -99);
                    int intExtra2 = intent.getIntExtra(UpdateKey.FAIL_CODE, -99);
                    boolean booleanExtra = intent.getBooleanExtra(UpdateKey.MUST_UPDATE, false);
                    HMSLog.m86966i("HuaweiApiClientImpl", "onUpdateInfo status: " + intExtra + ",failcause: " + intExtra2 + ",isExit: " + booleanExtra);
                    if (intExtra == 7) {
                        ApkUpgradeInfo apkUpgradeInfo = (ApkUpgradeInfo) intent.getSerializableExtra(UpdateKey.INFO);
                        if (apkUpgradeInfo != null) {
                            HMSLog.m86966i("HuaweiApiClientImpl", "onUpdateInfo: " + apkUpgradeInfo.toString());
                        }
                        HuaweiApiClientImpl.this.f57837z.onResult(1);
                    } else if (intExtra == 3) {
                        HuaweiApiClientImpl.this.f57837z.onResult(0);
                    } else {
                        HuaweiApiClientImpl.this.f57837z.onResult(-1);
                    }
                    HuaweiApiClientImpl.this.f57837z = null;
                } catch (Exception e) {
                    HMSLog.m86964e("HuaweiApiClientImpl", "intent has some error" + e.getMessage());
                    HuaweiApiClientImpl.this.f57837z.onResult(-1);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.huawei.hms.api.HuaweiApiClientImpl$b */
    public class C23448b implements Handler.Callback {
        C23448b() {
        }

        public boolean handleMessage(Message message) {
            if (message == null || message.what != 2) {
                return false;
            }
            HMSLog.m86964e("HuaweiApiClientImpl", "In connect, bind core service time out");
            if (HuaweiApiClientImpl.this.f57822k.get() == 5) {
                HuaweiApiClientImpl.this.m85065d((HuaweiApiClientImpl) 1);
                HuaweiApiClientImpl.this.m85055b();
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.huawei.hms.api.HuaweiApiClientImpl$c */
    public class C23449c implements Handler.Callback {
        C23449c() {
        }

        public boolean handleMessage(Message message) {
            if (message == null || message.what != 3) {
                return false;
            }
            HMSLog.m86964e("HuaweiApiClientImpl", "In connect, process time out");
            if (HuaweiApiClientImpl.this.f57822k.get() == 2) {
                HuaweiApiClientImpl.this.m85065d((HuaweiApiClientImpl) 1);
                HuaweiApiClientImpl.this.m85055b();
            }
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.huawei.hms.api.HuaweiApiClientImpl$h */
    public class C23456h implements ResultCallback<ResolveResult<JosGetNoticeResp>> {
        private C23456h() {
        }

        /* renamed from: a */
        public void onResult(ResolveResult<JosGetNoticeResp> resolveResult) {
            JosGetNoticeResp value;
            Intent noticeIntent;
            if (resolveResult != null && resolveResult.getStatus().isSuccess() && (noticeIntent = (value = resolveResult.getValue()).getNoticeIntent()) != null && value.getStatusCode() == 0) {
                HMSLog.m86966i("HuaweiApiClientImpl", "get notice has intent.");
                Activity validActivity = Util.getValidActivity((Activity) HuaweiApiClientImpl.this.f57819h.get(), HuaweiApiClientImpl.this.getTopActivity());
                if (validActivity == null) {
                    HMSLog.m86964e("HuaweiApiClientImpl", "showNotice no valid activity!");
                    return;
                }
                HuaweiApiClientImpl.this.f57821j = true;
                validActivity.startActivity(noticeIntent);
            }
        }

        /* synthetic */ C23456h(HuaweiApiClientImpl huaweiApiClientImpl, C23447a aVar) {
            this();
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void connect(int i) {
        connect((Activity) null);
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public boolean hasConnectedApi(Api<?> api) {
        return isConnected();
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void onPause(Activity activity) {
        HMSLog.m86966i("HuaweiApiClientImpl", "onPause");
    }

    /* renamed from: com.huawei.hms.api.HuaweiApiClientImpl$e */
    static class C23451e extends PendingResultImpl<Status, IMessageEntity> {
        @Override // com.huawei.hms.support.api.PendingResultImpl
        public Status onComplete(IMessageEntity iMessageEntity) {
            return new Status(0);
        }

        public C23451e(ApiClient apiClient, String str, IMessageEntity iMessageEntity) {
            super(apiClient, str, iMessageEntity);
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void disableLifeCycleManagement(Activity activity) {
        if (this.f57812a >= 0) {
            AutoLifecycleFragment instance = AutoLifecycleFragment.getInstance(activity);
            if (instance != null) {
                instance.stopAutoManage(this.f57812a);
                return;
            }
            return;
        }
        throw new IllegalStateException("disableLifeCycleManagement failed");
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public ConnectionResult getConnectionResult(Api<?> api) {
        if (isConnected()) {
            this.f57832u = null;
            return new ConnectionResult(0, (PendingIntent) null);
        }
        ConnectionResult connectionResult = this.f57832u;
        if (connectionResult != null) {
            return connectionResult;
        }
        return new ConnectionResult(13, (PendingIntent) null);
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public boolean hasConnectionFailureListener(HuaweiApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Checker.checkNonNull(onConnectionFailedListener, "onConnectionFailedListener should not be null");
        synchronized (this.f57829r) {
            if (this.f57834w == onConnectionFailedListener) {
                return true;
            }
            return false;
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public boolean hasConnectionSuccessListener(HuaweiApiClient.ConnectionCallbacks connectionCallbacks) {
        Checker.checkNonNull(connectionCallbacks, "connectionCallbacksListener should not be null");
        synchronized (this.f57829r) {
            if (this.f57833v == connectionCallbacks) {
                return true;
            }
            return false;
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void onResume(Activity activity) {
        if (activity != null) {
            HMSLog.m86966i("HuaweiApiClientImpl", "onResume");
            this.f57820i = new WeakReference<>(activity);
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        HMSLog.m86966i("HuaweiApiClientImpl", "Enter onServiceDisconnected.");
        this.f57817f = null;
        m85065d(1);
        HuaweiApiClient.ConnectionCallbacks connectionCallbacks = this.f57833v;
        if (connectionCallbacks != null) {
            connectionCallbacks.onConnectionSuspended(1);
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void removeConnectionFailureListener(HuaweiApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Checker.checkNonNull(onConnectionFailedListener, "onConnectionFailedListener should not be null");
        synchronized (this.f57829r) {
            if (this.f57834w != onConnectionFailedListener) {
                HMSLog.m86967w("HuaweiApiClientImpl", "unregisterConnectionFailedListener: this onConnectionFailedListener has not been registered");
            } else {
                this.f57834w = null;
            }
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void removeConnectionSuccessListener(HuaweiApiClient.ConnectionCallbacks connectionCallbacks) {
        Checker.checkNonNull(connectionCallbacks, "connectionCallbacksListener should not be null");
        synchronized (this.f57829r) {
            if (this.f57833v != connectionCallbacks) {
                HMSLog.m86967w("HuaweiApiClientImpl", "unregisterConnectionCallback: this connectionCallbacksListener has not been registered");
            } else {
                this.f57833v = null;
            }
        }
    }

    /* renamed from: com.huawei.hms.api.HuaweiApiClientImpl$d */
    class BinderC23450d extends AbstractC23525c.AbstractBinderC23526a {

        /* renamed from: a */
        final /* synthetic */ ResultCallback f57841a;

        @Override // com.huawei.hms.core.aidl.AbstractC23525c
        public void call(C23523b bVar) {
            if (bVar != null) {
                C23531e a = C23522a.m85287a(bVar.mo82630c());
                ResponseHeader responseHeader = new ResponseHeader();
                a.mo82641a(bVar.f57979b, responseHeader);
                BundleResult bundleResult = new BundleResult(responseHeader.getStatusCode(), bVar.mo82627a());
                HMSLog.m86966i("HuaweiApiClientImpl", "Exit asyncRequest onResult");
                this.f57841a.onResult(bundleResult);
                return;
            }
            HMSLog.m86966i("HuaweiApiClientImpl", "Exit asyncRequest onResult -1");
            this.f57841a.onResult(new BundleResult(-1, null));
        }

        BinderC23450d(HuaweiApiClientImpl huaweiApiClientImpl, ResultCallback resultCallback) {
            this.f57841a = resultCallback;
        }
    }

    public HuaweiApiClientImpl(Context context) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f57830s = reentrantLock;
        this.f57831t = reentrantLock.newCondition();
        this.f57835x = null;
        this.f57836y = null;
        this.f57837z = null;
        this.f57813b = context;
        String appId = Util.getAppId(context);
        this.f57814c = appId;
        this.f57815d = appId;
        this.f57816e = Util.getCpId(context);
    }

    /* renamed from: a */
    private void m85049a(int i) {
        if (i == 2) {
            synchronized (f57809B) {
                Handler handler = this.f57835x;
                if (handler != null) {
                    handler.removeMessages(i);
                    this.f57835x = null;
                }
            }
        }
        if (i == 3) {
            synchronized (f57810C) {
                Handler handler2 = this.f57836y;
                if (handler2 != null) {
                    handler2.removeMessages(i);
                    this.f57836y = null;
                }
            }
        }
        synchronized (f57809B) {
            Handler handler3 = this.f57835x;
            if (handler3 != null) {
                handler3.removeMessages(2);
                this.f57835x = null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private void m85056b(int i) {
        PendingIntent pendingIntent;
        WeakReference<Activity> weakReference = this.f57819h;
        if (weakReference == null || weakReference.get() == null) {
            pendingIntent = null;
        } else {
            pendingIntent = HuaweiApiAvailability.getInstance().getResolveErrorPendingIntent(this.f57819h.get(), i);
            HMSLog.m86966i("HuaweiApiClientImpl", "connect 2.0 fail: " + i);
        }
        ConnectionResult connectionResult = new ConnectionResult(i, pendingIntent);
        this.f57834w.onConnectionFailed(connectionResult);
        this.f57832u = connectionResult;
    }

    /* renamed from: c */
    private void m85061c(int i) {
        if (!Util.isAvailableLibExist(this.f57813b)) {
            m85056b(i);
        } else if (i == 1 && HMSPublishStateHolder.getPublishState() == 0) {
            WeakReference weakReference = new WeakReference(this.f57813b);
            PackageNameManager.getInstance((Context) weakReference.get()).queryPackageName(new C23457i(i));
        } else {
            m85056b(i);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: d */
    private void m85065d(int i) {
        this.f57822k.set(i);
        if (i == 1 || i == 3 || i == 2) {
            this.f57830s.lock();
            try {
                this.f57831t.signalAll();
            } finally {
                this.f57830s.unlock();
            }
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public boolean setSubAppInfo(SubAppInfo subAppInfo) {
        String str;
        HMSLog.m86966i("HuaweiApiClientImpl", "Enter setSubAppInfo");
        if (subAppInfo == null) {
            HMSLog.m86964e("HuaweiApiClientImpl", "subAppInfo is null");
            return false;
        }
        String subAppID = subAppInfo.getSubAppID();
        if (TextUtils.isEmpty(subAppID)) {
            HMSLog.m86964e("HuaweiApiClientImpl", "subAppId is empty");
            return false;
        }
        if (TextUtils.isEmpty(this.f57814c)) {
            str = Util.getAppId(this.f57813b);
        } else {
            str = this.f57814c;
        }
        if (subAppID.equals(str)) {
            HMSLog.m86964e("HuaweiApiClientImpl", "subAppId is host appid");
            return false;
        }
        this.f57826o = new SubAppInfo(subAppInfo);
        return true;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private void m85059b(ResolveResult<DisconnectResp> resolveResult) {
        HMSLog.m86966i("HuaweiApiClientImpl", "Enter onDisconnectionResult, disconnect from server result: " + resolveResult.getStatus().getStatusCode());
        m85076o();
        m85065d(1);
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void connect(Activity activity) {
        String str;
        HMSLog.m86966i("HuaweiApiClientImpl", "====== HMSSDK version: 50005300 ======");
        int i = this.f57822k.get();
        HMSLog.m86966i("HuaweiApiClientImpl", "Enter connect, Connection Status: " + i);
        if (i != 3 && i != 5 && i != 2 && i != 4) {
            if (activity != null) {
                this.f57819h = new WeakReference<>(activity);
                this.f57820i = new WeakReference<>(activity);
            }
            if (TextUtils.isEmpty(this.f57814c)) {
                str = Util.getAppId(this.f57813b);
            } else {
                str = this.f57814c;
            }
            this.f57815d = str;
            int e = m85066e();
            HMSLog.m86966i("HuaweiApiClientImpl", "connect minVersion:" + e);
            HuaweiApiAvailability.setServicesVersionCode(e);
            int isHuaweiMobileServicesAvailable = HuaweiMobileServicesUtil.isHuaweiMobileServicesAvailable(this.f57813b, e);
            HMSLog.m86966i("HuaweiApiClientImpl", "In connect, isHuaweiMobileServicesAvailable result: " + isHuaweiMobileServicesAvailable);
            this.f57828q = HMSPackageManager.getInstance(this.f57813b).getHmsVersionCode();
            if (isHuaweiMobileServicesAvailable == 0) {
                m85065d(5);
                if (this.f57817f == null) {
                    m85048a();
                    return;
                }
                m85065d(2);
                m85072k();
                m85071j();
            } else if (this.f57834w != null) {
                m85061c(isHuaweiMobileServicesAvailable);
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m85052a(ResolveResult<ConnectResp> resolveResult) {
        HMSLog.m86966i("HuaweiApiClientImpl", "Enter onConnectionResult");
        if (this.f57817f == null || this.f57822k.get() != 2) {
            HMSLog.m86964e("HuaweiApiClientImpl", "Invalid onConnectionResult");
            return;
        }
        m85049a(3);
        ConnectResp value = resolveResult.getValue();
        if (value != null) {
            this.f57818g = value.sessionId;
        }
        SubAppInfo subAppInfo = this.f57826o;
        PendingIntent pendingIntent = null;
        String subAppID = subAppInfo == null ? null : subAppInfo.getSubAppID();
        if (!TextUtils.isEmpty(subAppID)) {
            this.f57815d = subAppID;
        }
        int statusCode = resolveResult.getStatus().getStatusCode();
        HMSLog.m86966i("HuaweiApiClientImpl", "Enter onConnectionResult, connect to server result: " + statusCode);
        if (Status.SUCCESS.equals(resolveResult.getStatus())) {
            if (resolveResult.getValue() != null) {
                ProtocolNegotiate.getInstance().negotiate(resolveResult.getValue().protocolVersion);
            }
            m85065d(3);
            this.f57832u = null;
            HuaweiApiClient.ConnectionCallbacks connectionCallbacks = this.f57833v;
            if (connectionCallbacks != null) {
                connectionCallbacks.onConnected();
            }
            if (this.f57819h != null) {
                m85075n();
            }
            for (Map.Entry<Api<?>, Api.ApiOptions> entry : getApiMap().entrySet()) {
                if (entry.getKey().getmConnetctPostList() != null && !entry.getKey().getmConnetctPostList().isEmpty()) {
                    HMSLog.m86966i("HuaweiApiClientImpl", "Enter onConnectionResult, get the ConnetctPostList ");
                    for (ConnectionPostProcessor connectionPostProcessor : entry.getKey().getmConnetctPostList()) {
                        HMSLog.m86966i("HuaweiApiClientImpl", "Enter onConnectionResult, processor.run");
                        connectionPostProcessor.run(this, this.f57819h);
                    }
                }
            }
        } else if (resolveResult.getStatus() == null || resolveResult.getStatus().getStatusCode() != 1001) {
            m85076o();
            m85065d(1);
            if (this.f57834w != null) {
                WeakReference<Activity> weakReference = this.f57819h;
                if (!(weakReference == null || weakReference.get() == null)) {
                    pendingIntent = HuaweiApiAvailability.getInstance().getResolveErrorPendingIntent(this.f57819h.get(), statusCode);
                }
                ConnectionResult connectionResult = new ConnectionResult(statusCode, pendingIntent);
                this.f57834w.onConnectionFailed(connectionResult);
                this.f57832u = connectionResult;
            }
        } else {
            m85076o();
            m85065d(1);
            HuaweiApiClient.ConnectionCallbacks connectionCallbacks2 = this.f57833v;
            if (connectionCallbacks2 != null) {
                connectionCallbacks2.onConnectionSuspended(3);
            }
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void checkUpdate(Activity activity, CheckUpdatelistener checkUpdatelistener) {
        if (Util.isAvailableLibExist(this.f57813b)) {
            HMSLog.m86966i("HuaweiApiClientImpl", "Enter checkUpdate");
            if (checkUpdatelistener == null) {
                HMSLog.m86964e("HuaweiApiClientImpl", "listener is null!");
            } else if (activity == null || activity.isFinishing()) {
                HMSLog.m86964e("HuaweiApiClientImpl", "checkUpdate, activity is illegal: " + activity);
                checkUpdatelistener.onResult(-1);
            } else {
                this.f57837z = checkUpdatelistener;
                if (this.f57811A == null) {
                    m85068g();
                }
                UpdateSdkAPI.checkClientOTAUpdate(activity, this.f57811A, true, 0, true);
            }
        } else {
            HMSLog.m86966i("HuaweiApiClientImpl", "available lib does not exist.");
        }
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HMSLog.m86966i("HuaweiApiClientImpl", "Enter onServiceConnected.");
        m85049a(2);
        this.f57817f = AbstractC23528d.AbstractBinderC23529a.m85296a(iBinder);
        if (this.f57817f == null) {
            HMSLog.m86964e("HuaweiApiClientImpl", "In onServiceConnected, mCoreService must not be null.");
            m85076o();
            m85065d(1);
            if (this.f57834w != null) {
                PendingIntent pendingIntent = null;
                WeakReference<Activity> weakReference = this.f57819h;
                if (!(weakReference == null || weakReference.get() == null)) {
                    pendingIntent = HuaweiApiAvailability.getInstance().getResolveErrorPendingIntent(this.f57819h.get(), 10);
                }
                ConnectionResult connectionResult = new ConnectionResult(10, pendingIntent);
                this.f57834w.onConnectionFailed(connectionResult);
                this.f57832u = connectionResult;
            }
        } else if (this.f57822k.get() == 5) {
            m85065d(2);
            m85072k();
            m85071j();
        } else if (this.f57822k.get() != 3) {
            m85076o();
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public ConnectionResult holdUpConnect(long j, TimeUnit timeUnit) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.f57830s.lock();
            try {
                connect((Activity) null);
                long nanos = timeUnit.toNanos(j);
                while (isConnecting()) {
                    if (nanos <= 0) {
                        disconnect();
                        ConnectionResult connectionResult = new ConnectionResult(14, (PendingIntent) null);
                        this.f57830s.unlock();
                        return connectionResult;
                    }
                    try {
                        nanos = this.f57831t.awaitNanos(nanos);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return new ConnectionResult(15, (PendingIntent) null);
                    }
                }
                if (isConnected()) {
                    this.f57832u = null;
                    ConnectionResult connectionResult2 = new ConnectionResult(0, (PendingIntent) null);
                    this.f57830s.unlock();
                    return connectionResult2;
                }
                ConnectionResult connectionResult3 = this.f57832u;
                if (connectionResult3 != null) {
                    this.f57830s.unlock();
                    return connectionResult3;
                }
                ConnectionResult connectionResult4 = new ConnectionResult(13, (PendingIntent) null);
                this.f57830s.unlock();
                return connectionResult4;
            } finally {
                this.f57830s.unlock();
            }
        } else {
            throw new IllegalStateException("blockingConnect must not be called on the UI thread");
        }
    }

    public int asyncRequest(Bundle bundle, String str, int i, ResultCallback<BundleResult> resultCallback) {
        HMSLog.m86966i("HuaweiApiClientImpl", "Enter asyncRequest.");
        if (resultCallback == null || str == null || bundle == null) {
            HMSLog.m86964e("HuaweiApiClientImpl", "arguments is invalid.");
            return CommonCode.ErrorCode.ARGUMENTS_INVALID;
        } else if (!innerIsConnected()) {
            HMSLog.m86964e("HuaweiApiClientImpl", "client is unConnect.");
            return CommonCode.ErrorCode.CLIENT_API_INVALID;
        } else {
            C23523b bVar = new C23523b(str, i);
            C23531e a = C23522a.m85287a(bVar.mo82630c());
            bVar.mo82628a(bundle);
            RequestHeader requestHeader = new RequestHeader(getAppID(), getPackageName(), 50005300, getSessionId());
            requestHeader.setApiNameList(getApiNameList());
            bVar.f57979b = a.mo82640a(requestHeader, new Bundle());
            try {
                getService().mo82638a(bVar, new BinderC23450d(this, resultCallback));
                return 0;
            } catch (RemoteException e) {
                HMSLog.m86964e("HuaweiApiClientImpl", "remote exception:" + e.getMessage());
                return CommonCode.ErrorCode.INTERNAL_ERROR;
            }
        }
    }
}
