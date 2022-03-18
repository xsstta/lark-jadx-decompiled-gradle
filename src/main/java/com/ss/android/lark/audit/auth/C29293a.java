package com.ss.android.lark.audit.auth;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.larksuite.framework.thread.ThreadFactoryC26153m;
import com.larksuite.framework.utils.C26252ad;
import com.ss.android.lark.audit.AbstractC29324f;
import com.ss.android.lark.audit.p1377a.C29284b;
import com.ss.android.lark.audit.p1377a.C29285c;
import com.ss.android.lark.audit.p1377a.C29287d;
import com.ss.android.lark.audit.p1377a.C29288e;
import com.ss.android.lark.audit.p1377a.C29291f;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pb.authorization.AllPermissionData;
import com.ss.android.lark.pb.authorization.PullPermissionResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import me.ele.lancet.base.annotations.Skip;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.audit.auth.a */
public class C29293a implements AbstractC29324f.AbstractC29327c, AbstractC29324f.AbstractC29328d, AbstractC29324f.AbstractC29329e {

    /* renamed from: a */
    public final Context f73322a;

    /* renamed from: b */
    public final Map<String, Boolean> f73323b = new ConcurrentHashMap();

    /* renamed from: c */
    private final AbstractC29324f f73324c;

    /* renamed from: d */
    private final AbstractC29324f.AbstractC29326b f73325d;

    /* renamed from: e */
    private final AtomicReference<String> f73326e = new AtomicReference<>();

    /* renamed from: f */
    private final Map<String, C29303e> f73327f = new ConcurrentHashMap();

    /* renamed from: g */
    private final Map<String, List<AbstractC29297a>> f73328g = new ConcurrentHashMap();

    /* renamed from: h */
    private final HandlerThread f73329h;

    /* renamed from: i */
    private final Handler f73330i;

    /* renamed from: j */
    private final ExecutorService f73331j;

    /* renamed from: k */
    private long f73332k = 0;

    /* renamed from: l */
    private C29285c f73333l;

    /* renamed from: com.ss.android.lark.audit.auth.a$a */
    public interface AbstractC29297a {
        /* renamed from: a */
        void mo103843a(AllPermissionData allPermissionData);

        /* renamed from: a */
        void mo103844a(String str);
    }

    /* renamed from: c */
    public static HandlerThread m107677c(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    /* renamed from: a */
    public synchronized void mo103830a(String str, C29303e eVar, String str2) {
        List<AbstractC29297a> list = this.f73328g.get(str);
        if (list == null) {
            Log.m165389i("AuditPerm_DataService", "callbackOnDataAvailable but onDataAvailableCallbackList is empty!");
            return;
        }
        if (TextUtils.equals(this.f73326e.get(), str)) {
            for (AbstractC29297a aVar : list) {
                if (C29303e.m107711a(eVar)) {
                    aVar.mo103843a(eVar.f73344c);
                } else {
                    aVar.mo103844a(str2);
                }
            }
        } else {
            Log.m165389i("AuditPerm_DataService", "callbackOnDataAvailable need not invoked because user changed!");
        }
        this.f73328g.remove(str);
    }

    /* renamed from: a */
    public void mo103831a(String str, AllPermissionData allPermissionData, String str2, boolean z, boolean z2) {
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = new C29303e(str, str2, allPermissionData);
        Bundle bundle = new Bundle();
        bundle.putBoolean("fromNetwork", z);
        bundle.putBoolean("clearOld", z2);
        obtain.setData(bundle);
        this.f73330i.sendMessage(obtain);
    }

    /* renamed from: a */
    public void mo103833a(boolean z) {
        if (z) {
            long currentTimeMillis = System.currentTimeMillis() - this.f73332k;
            if (currentTimeMillis < 300000) {
                Log.m165389i("AuditPerm_DataService", "onAppStateChanged drop request, duration: " + currentTimeMillis);
                return;
            }
            mo103835b();
            return;
        }
        mo103837c();
    }

    /* renamed from: b */
    public void mo103835b() {
        mo103827a(0L, false);
    }

    /* renamed from: c */
    public void mo103837c() {
        this.f73330i.removeMessages(0);
    }

    /* renamed from: d */
    private boolean m107680d() {
        return this.f73324c.mo103867a("lark.security.audit.enable_process_data_sync", false);
    }

    /* renamed from: e */
    private boolean m107682e() {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f73322a.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return true;
        }
    }

    /* renamed from: f */
    private synchronized C29285c m107683f() {
        if (this.f73333l == null) {
            this.f73333l = C29285c.m107645a(this.f73322a);
        }
        return this.f73333l;
    }

    /* renamed from: g */
    private boolean m107685g() {
        Log.m165389i("AuditPerm_DataService", "request refresh data at time: " + System.currentTimeMillis());
        String str = this.f73326e.get();
        if (TextUtils.isEmpty(str)) {
            Log.m165389i("AuditPerm_DataService", "doRequestData but empty userId");
            return false;
        }
        this.f73331j.execute(new Runnable(str) {
            /* class com.ss.android.lark.audit.auth.$$Lambda$a$APZnHoa8_8OyyfTEflI7QJvOEKw */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C29293a.this.m107684f(this.f$1);
            }
        });
        return true;
    }

    /* renamed from: a */
    public AllPermissionData mo103826a() {
        String str = this.f73326e.get();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C29303e b = mo103834b(str);
        if (!C29303e.m107711a(b)) {
            return null;
        }
        return b.f73344c;
    }

    @Override // com.ss.android.lark.audit.AbstractC29324f.AbstractC29327c
    /* renamed from: a */
    public void mo103832a(JSONObject jSONObject) {
        m107679d(jSONObject);
    }

    @Override // com.ss.android.lark.audit.AbstractC29324f.AbstractC29328d
    /* renamed from: b */
    public void mo103836b(JSONObject jSONObject) {
        m107679d(jSONObject);
    }

    /* renamed from: d */
    private void m107679d(JSONObject jSONObject) {
        if (jSONObject != null) {
            mo103829a(jSONObject.optString("userId"));
        }
    }

    @Override // com.ss.android.lark.audit.AbstractC29324f.AbstractC29329e
    /* renamed from: c */
    public void mo103838c(JSONObject jSONObject) {
        Log.m165389i("AuditPerm_DataService", "received push event");
        mo103835b();
    }

    /* renamed from: e */
    private void m107681e(String str) {
        Log.m165389i("AuditPerm_DataService", "sendDeleteMsg for " + str);
        Message obtain = Message.obtain();
        obtain.what = 2;
        Bundle bundle = new Bundle();
        bundle.putString("userId", str);
        obtain.setData(bundle);
        this.f73330i.sendMessage(obtain);
    }

    /* renamed from: b */
    public C29303e mo103834b(String str) {
        if (TextUtils.isEmpty(str)) {
            C29288e.m107657a().mo103813a("from_memory", false);
            return null;
        }
        C29303e eVar = this.f73327f.get(str);
        C29288e.m107657a().mo103813a("from_memory", C29303e.m107711a(eVar));
        return eVar;
    }

    /* renamed from: d */
    private C29303e m107678d(String str) {
        AbstractC29324f.AbstractC29326b bVar;
        C29303e eVar = null;
        if (TextUtils.isEmpty(str) || (bVar = this.f73325d) == null) {
            C29288e.m107657a().mo103813a("from_db", false);
            return null;
        }
        TransactionalPermData queryPermissionData = bVar.queryPermissionData(str);
        if (!TransactionalPermData.m107668a(queryPermissionData)) {
            C29288e.m107657a().mo103813a("from_db", false);
            Log.m165383e("AuditPerm_DataService", "getFromDB: TransactionalPermData invalid!");
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        C29285c f = m107683f();
        if (f == null) {
            Log.m165383e("AuditPerm_DataService", "getFromDB: cryptographer is null!");
            return null;
        }
        byte[] a = f.mo103806a(new C29285c.C29286a(queryPermissionData.f73321d, queryPermissionData.f73320c));
        if (a == null) {
            Log.m165383e("AuditPerm_DataService", "getFromDB: decrypt failed!");
            return null;
        }
        Log.m165389i("AuditPerm_DataService", "getFromDB: decrypt cost : " + (System.currentTimeMillis() - currentTimeMillis) + "ms, data length : " + a.length);
        try {
            eVar = new C29303e(queryPermissionData.f73318a, queryPermissionData.f73319b, AllPermissionData.ADAPTER.decode(a));
        } catch (IOException e) {
            C29287d.m107656a("AuditPerm_DataService", e);
            Log.m165383e("AuditPerm_DataService", "[From DB]: decode data failed: " + e.getMessage());
        }
        C29288e.m107657a().mo103813a("from_db", C29303e.m107711a(eVar));
        return eVar;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: f */
    private /* synthetic */ void m107684f(String str) {
        C29303e b = mo103834b(str);
        if (!C29303e.m107711a(b)) {
            C29303e d = m107678d(str);
            if (C29303e.m107711a(d)) {
                Log.m165389i("AuditPerm_DataService", "pull permission from DB successfully");
                mo103831a(d.f73342a, d.f73344c, d.f73343b, false, false);
                b = d;
            } else {
                Log.m165383e("AuditPerm_DataService", "[From DB]: pull permission failed!");
            }
        }
        String str2 = null;
        if (C29303e.m107711a(b) && C29291f.m107667a(b.f73344c)) {
            m107681e(str);
            b = null;
        }
        if (b != null) {
            str2 = b.f73343b;
        }
        m107674a(str, str2);
        this.f73323b.put(str, true);
        if (m107680d() && C26252ad.m94993b(this.f73322a)) {
            Intent intent = new Intent("com.ss.android.lark.audit.auth.action.data_sync");
            intent.setPackage(this.f73322a.getPackageName());
            this.f73322a.sendBroadcast(intent);
            Log.m165389i("AuditPerm_DataService", "send process data sync broadcast at " + C26252ad.m94992a(this.f73322a));
        }
    }

    /* renamed from: a */
    public void mo103828a(Message message) {
        int i = message.what;
        if (i != 0) {
            if (i == 1) {
                m107672a((C29303e) message.obj, message.getData());
            } else if (i == 2) {
                if (this.f73325d == null) {
                    Log.m165383e("AuditPerm_DataService", "doHandleMessage_MSG_DELETE_DATA: mDataHandler is null");
                    return;
                }
                Log.m165389i("AuditPerm_DataService", "DB data expired, and clean data from DB!");
                String string = message.getData().getString("userId");
                this.f73327f.remove(string);
                this.f73325d.deletePermissionData(string);
            }
        } else if (message.getData().getBoolean("forceUpdate")) {
            Log.m165389i("AuditPerm_DataService", "receive force update msg");
            m107685g();
        } else {
            long b = C29284b.m107644b(this.f73324c, 1000);
            if (System.currentTimeMillis() - this.f73332k < b) {
                Log.m165389i("AuditPerm_DataService", "Drop request between threshold: " + b);
                return;
            }
            mo103837c();
            if (m107685g()) {
                this.f73332k = System.currentTimeMillis();
            }
            if (!message.getData().getBoolean("skipPeriodTask")) {
                mo103827a(C29284b.m107642a(this.f73324c, 900000), false);
            }
        }
    }

    /* renamed from: a */
    public void mo103829a(String str) {
        boolean z = !TextUtils.equals(str, this.f73326e.get());
        this.f73326e.set(str);
        if (z) {
            mo103835b();
        }
    }

    /* renamed from: a */
    private void m107673a(C29303e eVar, boolean z) {
        this.f73327f.put(eVar.f73342a, eVar);
        m107676b(eVar, z);
    }

    /* renamed from: b */
    private void m107676b(C29303e eVar, boolean z) {
        this.f73331j.execute(new Runnable(z, eVar) {
            /* class com.ss.android.lark.audit.auth.$$Lambda$a$bKuFS1XNy4ToK0nuhqCyQvQAAuI */
            public final /* synthetic */ boolean f$1;
            public final /* synthetic */ C29303e f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C29293a.this.m107675a((C29293a) this.f$1, (boolean) this.f$2);
            }
        });
    }

    /* renamed from: a */
    private void m107674a(final String str, String str2) {
        if (!this.f73324c.mo103870c()) {
            Log.m165383e("AuditPerm_DataService", "[From Network]: pull permission error: fail before login");
            this.f73323b.clear();
            return;
        }
        this.f73324c.mo103865a(str2, "1-0", new AbstractC29324f.AbstractC29330f() {
            /* class com.ss.android.lark.audit.auth.C29293a.C292963 */

            @Override // com.ss.android.lark.audit.AbstractC29324f.AbstractC29330f
            /* renamed from: a */
            public void mo103841a(PullPermissionResponse pullPermissionResponse) {
                if (pullPermissionResponse != null) {
                    Log.m165389i("AuditPerm_DataService", "pull permission from network successfully");
                    C29293a.this.mo103831a(str, pullPermissionResponse.mpermission_data, pullPermissionResponse.mperm_version, true, pullPermissionResponse.mclear_old.booleanValue());
                    C29288e.m107657a().mo103817c();
                } else {
                    Log.m165383e("AuditPerm_DataService", "pull permission from network successfully but null!");
                    C29293a aVar = C29293a.this;
                    String str = str;
                    aVar.mo103830a(str, aVar.mo103834b(str), "PullPermissionResponse is null");
                    C29288e.m107657a().mo103816b("inner_network_error", null);
                }
                C29293a.this.f73323b.put(str, false);
            }

            @Override // com.ss.android.lark.audit.AbstractC29324f.AbstractC29330f
            /* renamed from: a */
            public void mo103842a(String str, String str2) {
                Log.m165383e("AuditPerm_DataService", "[From Network]: pull permission error: " + str + ":" + str2);
                C29293a.this.f73323b.put(str, false);
                C29293a aVar = C29293a.this;
                String str3 = str;
                aVar.mo103830a(str3, aVar.mo103834b(str3), str2);
                C29288e.m107657a().mo103816b(str, str2);
            }
        });
    }

    /* renamed from: a */
    private void m107672a(C29303e eVar, Bundle bundle) {
        if (!C29303e.m107711a(eVar)) {
            Log.m165383e("AuditPerm_DataService", "do refresh data failed for null/invalid PermissionDataWrapper");
            return;
        }
        Log.m165389i("AuditPerm_DataService", "do refresh data " + bundle.toString());
        String str = eVar.f73342a;
        boolean z = bundle.getBoolean("fromNetwork");
        boolean z2 = bundle.getBoolean("clearOld");
        if (z) {
            if (z2) {
                m107673a(eVar, true);
            } else {
                eVar = C29298b.m107704a(str, mo103834b(str), eVar);
                m107673a(eVar, !eVar.mo103851a());
            }
            mo103830a(str, eVar, (String) null);
            return;
        }
        this.f73327f.put(str, eVar);
    }

    public C29293a(Context context, AbstractC29324f fVar) {
        AbstractC29324f.AbstractC29326b bVar;
        this.f73322a = context;
        this.f73324c = fVar;
        if (C26252ad.m94993b(context)) {
            bVar = C29299c.m107708a();
        } else {
            bVar = fVar.mo103859a(context);
        }
        this.f73325d = bVar;
        this.f73331j = Executors.newSingleThreadExecutor(new ThreadFactoryC26153m("AuditPerm_DataService_Task_Executor"));
        HandlerThread c = m107677c("AuditPerm_DataService_Message_Dispatcher");
        this.f73329h = c;
        c.start();
        this.f73330i = new Handler(c.getLooper()) {
            /* class com.ss.android.lark.audit.auth.C29293a.HandlerC292941 */

            public void handleMessage(Message message) {
                super.handleMessage(message);
                C29293a.this.mo103828a(message);
            }
        };
        mo103829a(fVar.mo103871d());
        fVar.mo103862a((AbstractC29324f.AbstractC29327c) this);
        fVar.mo103863a((AbstractC29324f.AbstractC29328d) this);
        fVar.mo103864a((AbstractC29324f.AbstractC29329e) this);
        if (m107680d() && !C26252ad.m94993b(context)) {
            m107671a(context, new BroadcastReceiver() {
                /* class com.ss.android.lark.audit.auth.C29293a.C292952 */

                public void onReceive(Context context, Intent intent) {
                    if (intent != null && TextUtils.equals(intent.getPackage(), C29293a.this.f73322a.getPackageName()) && "com.ss.android.lark.audit.auth.action.data_sync".equals(intent.getAction())) {
                        Log.m165389i("AuditPerm_DataService", "receive process data sync broadcast at " + C26252ad.m94992a(C29293a.this.f73322a));
                        C29293a.this.mo103827a(0L, true);
                    }
                }
            }, new IntentFilter("com.ss.android.lark.audit.auth.action.data_sync"));
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m107675a(boolean z, C29303e eVar) {
        AbstractC29324f.AbstractC29326b bVar = this.f73325d;
        if (bVar == null) {
            Log.m165383e("AuditPerm_DataService", "doUpdateDB: mDataHandler is null");
            return;
        }
        if (z) {
            bVar.deletePermissionData(eVar.f73342a);
        }
        AllPermissionData allPermissionData = eVar.f73344c;
        if (allPermissionData == null) {
            Log.m165383e("AuditPerm_DataService", "[To DB]: save permission data failed for empty data!");
            return;
        }
        byte[] encode = allPermissionData.encode();
        long currentTimeMillis = System.currentTimeMillis();
        C29285c f = m107683f();
        if (f == null) {
            Log.m165383e("AuditPerm_DataService", "[To DB]: cryptographer is null!");
            return;
        }
        C29285c.C29286a a = f.mo103805a(encode);
        if (a == null) {
            Log.m165383e("AuditPerm_DataService", "[To DB]: save permission data failed for Encrypt Error!");
            return;
        }
        Log.m165389i("AuditPerm_DataService", "encrypt cost : " + (System.currentTimeMillis() - currentTimeMillis) + "ms, data length : " + encode.length);
        this.f73325d.savePermissionData(eVar.f73342a, eVar.f73343b, a.mo103808b(), a.mo103807a());
    }

    /* renamed from: a */
    public void mo103827a(long j, boolean z) {
        if (!m107682e()) {
            String str = this.f73326e.get();
            if (!TextUtils.isEmpty(str)) {
                mo103830a(str, (C29303e) null, "network offline");
                return;
            }
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 0;
        obtain.getData().putBoolean("forceUpdate", z);
        if (j > 0) {
            this.f73330i.sendMessageDelayed(obtain, j);
        } else {
            this.f73330i.sendMessage(obtain);
        }
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m107671a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }
}
