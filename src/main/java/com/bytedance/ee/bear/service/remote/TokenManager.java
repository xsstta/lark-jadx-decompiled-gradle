package com.bytedance.ee.bear.service.remote;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.ee.bear.service.C10906a;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.service.IInitCallback;
import com.bytedance.ee.bear.service.IRegisterCallback;
import com.bytedance.ee.bear.service.ITokenCenter;
import com.bytedance.ee.bear.service.base.AbstractC10914b;
import com.bytedance.ee.bear.service.base.C10916c;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import java.util.HashMap;
import java.util.Map;

public class TokenManager {

    /* renamed from: a */
    public Map<String, IBinder> f29440a = new HashMap();

    /* renamed from: b */
    public Map<String, ITokenCenter> f29441b = new HashMap();

    /* renamed from: c */
    public final Object f29442c = new Object();

    /* renamed from: d */
    private final Map<String, String> f29443d = new HashMap();

    /* renamed from: e */
    private Context f29444e;

    /* renamed from: a */
    public void mo41582a(String str, final AbstractC10914b.AbstractC10915a aVar) throws NoTokenCenterException {
        m45468a(this.f29444e, str);
        try {
            ITokenCenter iTokenCenter = this.f29441b.get(str);
            if (iTokenCenter == null) {
                C13479a.m54775e("TokenManager", "registerInitCallback: token center is null");
            } else {
                iTokenCenter.registerInitCallback(new IInitCallback.Stub() {
                    /* class com.bytedance.ee.bear.service.remote.TokenManager.BinderC109481 */

                    @Override // com.bytedance.ee.bear.service.IInitCallback
                    public boolean hasInit() throws RemoteException {
                        return aVar.mo41504b();
                    }

                    @Override // com.bytedance.ee.bear.service.IInitCallback
                    public void onInit() throws RemoteException {
                        aVar.mo41503a();
                    }
                });
            }
        } catch (RemoteException e) {
            C13479a.m54759a("TokenManager", "registerInitCallback: ", e);
        }
    }

    public static class NoTokenCenterException extends Exception {
        public NoTokenCenterException(String str) {
            super(str);
        }
    }

    TokenManager(Context context) {
        this.f29444e = context;
    }

    /* renamed from: b */
    public <T> AbstractC68307f<IBinder> mo41584b(Class<T> cls) {
        C13479a.m54764b("TokenManager", "obtainToken: class = " + cls);
        try {
            m45469a(this.f29444e, this.f29443d.get(cls.getName()), cls.getName(), true);
            ITokenCenter iTokenCenter = this.f29441b.get(this.f29443d.get(cls.getName()));
            if (iTokenCenter == null) {
                return AbstractC68307f.m265084a(new Throwable("obtainToken: token center is null "));
            }
            return AbstractC68307f.m265083a(iTokenCenter.getToken(cls.getName()));
        } catch (Exception e) {
            C13479a.m54759a("TokenManager", "obtainToken", e);
            return AbstractC68307f.m265084a(new Throwable("NoTokenCenterException: token center is null "));
        }
    }

    /* renamed from: a */
    public <T> IBinder mo41579a(Class<T> cls) throws RemoteException {
        C13479a.m54764b("TokenManager", "obtainToken: class = " + cls);
        boolean z = false;
        try {
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                z = true;
            }
            m45469a(this.f29444e, this.f29443d.get(cls.getName()), cls.getName(), z);
            ITokenCenter iTokenCenter = this.f29441b.get(this.f29443d.get(cls.getName()));
            if (iTokenCenter != null) {
                return iTokenCenter.getToken(cls.getName());
            }
            C13479a.m54775e("TokenManager", "obtainToken: token center is null");
            return null;
        } catch (NoTokenCenterException e) {
            C13479a.m54759a("TokenManager", "obtainToken", e);
            return null;
        }
    }

    /* renamed from: a */
    public void mo41581a(String str) throws RemoteException {
        C13479a.m54764b("TokenManager", "notifyInitOver " + str);
        try {
            m45468a(this.f29444e, str);
            ITokenCenter iTokenCenter = this.f29441b.get(str);
            if (iTokenCenter == null) {
                C13479a.m54775e("TokenManager", "notifyInitOver: token center is null");
            } else {
                iTokenCenter.notifyInitOver();
            }
        } catch (NoTokenCenterException e) {
            C13479a.m54759a("TokenManager", "notifyInitOver", e);
        }
    }

    /* renamed from: a */
    public void mo41583a(String str, String str2) {
        this.f29443d.put(str, str2);
    }

    /* renamed from: a */
    private void m45468a(Context context, String str) throws NoTokenCenterException {
        IBinder iBinder = this.f29440a.get(str);
        if (!m45470a(str, iBinder)) {
            if (iBinder == null || !iBinder.isBinderAlive() || !iBinder.pingBinder()) {
                m45472b(context, str);
            }
        }
    }

    /* renamed from: b */
    public void mo41585b(String str, String str2) throws RemoteException {
        C13479a.m54764b("TokenManager", "notifyInitOneService " + str + " " + str2);
        try {
            m45468a(this.f29444e, str);
            ITokenCenter iTokenCenter = this.f29441b.get(str);
            if (iTokenCenter == null) {
                C13479a.m54775e("TokenManager", "notifyInitOneService: token center is null");
            } else {
                iTokenCenter.notifyInitOneService(str2);
            }
        } catch (NoTokenCenterException e) {
            C13479a.m54759a("TokenManager", "notifyInitOneService", e);
        }
    }

    /* renamed from: a */
    private boolean m45470a(String str, IBinder iBinder) {
        if ("main".equals(C10916c.m45409b(null)) || !"main".equals(str) || iBinder != null || !C10929e.m45432a().mo17009u()) {
            return false;
        }
        C13479a.m54758a("TokenManager", "kill process");
        try {
            Thread.sleep(3000);
            Process.killProcess(Process.myPid());
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    /* renamed from: b */
    private C10951a m45472b(Context context, final String str) throws NoTokenCenterException {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C13479a.m54764b("TokenManager", "checkServiceCenterRegisted: begin check content provider");
        IBinder iBinder = null;
        try {
            Uri a = TokenContentProvider.m45467a(this.f29444e, str);
            C13479a.m54764b("TokenManager", "content provider url = " + a);
            Cursor query = context.getContentResolver().query(a, BinderCursor.DEFAULT_COLUMNS, null, null, null);
            if (query != null) {
                iBinder = BinderCursor.getBinder(query);
                iBinder.linkToDeath(new IBinder.DeathRecipient() {
                    /* class com.bytedance.ee.bear.service.remote.TokenManager.C109503 */

                    public void binderDied() {
                        TokenManager.this.f29440a.remove(str);
                        TokenManager.this.f29441b.remove(str);
                    }
                }, 0);
                query.close();
            } else {
                C13479a.m54758a("TokenManager", "cursor is null for " + a + ", please register this content provider yourself.");
            }
        } catch (Throwable th) {
            C13479a.m54759a("TokenManager", "checkServiceCenterRegisted: error", th);
        }
        if (iBinder != null) {
            ITokenCenter asInterface = ITokenCenter.Stub.asInterface(iBinder);
            this.f29440a.put(str, iBinder);
            this.f29441b.put(str, asInterface);
            C13479a.m54764b("TokenManager", "checkServiceCenterRegisted: result -> binder = " + iBinder);
            C13479a.m54764b("TokenManager", "checkServiceCenterRegisted: end check content provider, duration = " + (SystemClock.elapsedRealtime() - elapsedRealtime));
            C10906a.m45376a(C10929e.m45432a(), "3", "", SystemClock.elapsedRealtime() - elapsedRealtime, "");
            return new C10951a(iBinder, asInterface);
        }
        throw new NoTokenCenterException("can't obtain service center for " + str);
    }

    /* renamed from: a */
    public <T extends IInterface> void mo41580a(Class<T> cls, IBinder iBinder) throws RemoteException {
        C13479a.m54764b("TokenManager", "registerFlow: class = " + cls + "; bind = " + iBinder);
        try {
            m45468a(this.f29444e, this.f29443d.get(cls.getName()));
            ITokenCenter iTokenCenter = this.f29441b.get(this.f29443d.get(cls.getName()));
            if (iTokenCenter == null) {
                C13479a.m54775e("TokenManager", "register: token center is null");
            } else {
                iTokenCenter.register(cls.getName(), iBinder);
            }
        } catch (NoTokenCenterException e) {
            C13479a.m54759a("TokenManager", "register", e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.service.remote.TokenManager$a */
    public class C10951a {

        /* renamed from: a */
        final IBinder f29447a;

        /* renamed from: b */
        final ITokenCenter f29448b;

        C10951a(IBinder iBinder, ITokenCenter iTokenCenter) {
            this.f29447a = iBinder;
            this.f29448b = iTokenCenter;
        }
    }

    /* renamed from: a */
    private boolean m45471a(String str, IBinder iBinder, ITokenCenter iTokenCenter, int i) throws RemoteException {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (iBinder == null) {
            z = true;
        } else {
            z = false;
        }
        if (iBinder != null) {
            z2 = !iBinder.isBinderAlive();
        } else {
            z2 = false;
        }
        if (iBinder != null) {
            z3 = !iBinder.pingBinder();
        } else {
            z3 = false;
        }
        if (iTokenCenter == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (iTokenCenter == null || i >= 5 || iTokenCenter.getToken(str) != null) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (z || z2 || z3 || z4 || z5) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m45469a(Context context, String str, final String str2, boolean z) throws RemoteException, NoTokenCenterException {
        Boolean bool;
        Boolean bool2;
        if (TextUtils.equals(C10916c.m45409b(context), str)) {
            m45468a(context, str);
            return;
        }
        IBinder iBinder = this.f29440a.get(str);
        ITokenCenter iTokenCenter = this.f29441b.get(str);
        if (!m45470a(str, iBinder)) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i = 0;
            while (m45471a(str2, iBinder, iTokenCenter, i)) {
                C10951a b = m45472b(context, str);
                IBinder iBinder2 = b.f29447a;
                ITokenCenter iTokenCenter2 = b.f29448b;
                if (iTokenCenter2 != null && iTokenCenter2.getToken(str2) == null) {
                    BinderC109492 r8 = new IRegisterCallback.Stub() {
                        /* class com.bytedance.ee.bear.service.remote.TokenManager.BinderC109492 */

                        @Override // com.bytedance.ee.bear.service.IRegisterCallback
                        public void onRegistered() throws RemoteException {
                            C13479a.m54772d("TokenManager", "onRegistered: called");
                        }

                        @Override // com.bytedance.ee.bear.service.IRegisterCallback
                        public void onRegisterOneBinder(String str) throws RemoteException {
                            synchronized (TokenManager.this.f29442c) {
                                C13479a.m54772d("TokenManager", "onRegisterOnBinder for " + str + " : called");
                                if (TextUtils.equals(str, str2)) {
                                    TokenManager.this.f29442c.notifyAll();
                                }
                            }
                        }
                    };
                    iTokenCenter2.addRegisterCallback(r8);
                    synchronized (this.f29442c) {
                        C13479a.m54772d("TokenManager", "checkServiceCenterRegisted: wait start... thread id:" + Thread.currentThread().getId() + " name: " + Thread.currentThread().getName());
                        try {
                            if (iTokenCenter2.getToken(str2) == null) {
                                this.f29442c.wait(500);
                            }
                            C13479a.m54772d("TokenManager", "checkServiceCenterRegisted: wait over.");
                        } catch (InterruptedException unused) {
                            C13479a.m54772d("TokenManager", "checkServiceCenterRegisted: interrupted");
                        }
                    }
                    iTokenCenter2.removeRegisterCall(r8);
                    C13479a.m54772d("TokenManager", "checkServiceCenterRegisted remove call back");
                }
                if (!z) {
                    i++;
                }
                C13479a.m54764b("TokenManager", "checkServiceCenterRegisted: result -> binder = " + iBinder2 + ", check num = " + i);
                if (i > 1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("is alive = ");
                    Boolean bool3 = null;
                    if (iBinder2 != null) {
                        bool = Boolean.valueOf(iBinder2.isBinderAlive());
                    } else {
                        bool = null;
                    }
                    sb.append(bool);
                    sb.append(", ping binder = ");
                    if (iBinder2 != null) {
                        bool2 = Boolean.valueOf(iBinder2.pingBinder());
                    } else {
                        bool2 = null;
                    }
                    sb.append(bool2);
                    sb.append(", is registered = ");
                    if (iTokenCenter2 != null) {
                        bool3 = Boolean.valueOf(iTokenCenter2.isRegisted());
                    }
                    sb.append(bool3);
                    C13479a.m54767c(sb.toString());
                }
                iTokenCenter = iTokenCenter2;
                iBinder = iBinder2;
            }
            if (i > 0) {
                C10906a.m45376a(C10929e.m45432a(), "5", "", SystemClock.elapsedRealtime() - elapsedRealtime, "");
            }
        }
    }
}
