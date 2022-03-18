package com.bytedance.ee.bear.service.remote;

import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.bytedance.ee.bear.service.IInitCallback;
import com.bytedance.ee.bear.service.IRegisterCallback;
import com.bytedance.ee.bear.service.ITokenCenter;
import com.bytedance.ee.bear.thread.C11674a;
import com.bytedance.ee.log.C13479a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

class TokenCenterBinder extends ITokenCenter.Stub {
    private final Map<IBinder, C10947a> mClsNameMap = new HashMap();
    private IInitCallback mIInitCallback;
    private boolean mIsRegisted = false;
    public final RemoteCallbackList<IRegisterCallback> mRegisterCallbacks = new RemoteCallbackList<>();
    private final Map<String, C10947a> mServiceTokens = new HashMap();
    private final Executor mSingleExecutor = new C11674a().mo44759c("TokenCenterBinder");

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.service.remote.TokenCenterBinder$a */
    public static class C10947a implements IBinder.DeathRecipient {

        /* renamed from: a */
        public final String f29436a;

        /* renamed from: b */
        public final IBinder f29437b;

        /* renamed from: c */
        private final TokenCenterBinder f29438c;

        public String toString() {
            return "class = " + this.f29436a + ", token = " + this.f29437b;
        }

        public void binderDied() {
            C13479a.m54764b("TokenCenterBinder", "binderDied: className = " + this.f29436a);
            try {
                this.f29438c.remove(this.f29436a);
            } catch (RemoteException e) {
                C13479a.m54773d("TokenCenterBinder", "binderDied: error", e);
            }
        }

        public C10947a(TokenCenterBinder tokenCenterBinder, String str, IBinder iBinder) throws RemoteException {
            this.f29438c = tokenCenterBinder;
            this.f29436a = str;
            this.f29437b = iBinder;
            iBinder.linkToDeath(this, 0);
        }
    }

    @Override // com.bytedance.ee.bear.service.ITokenCenter
    public boolean isRegisted() throws RemoteException {
        C13479a.m54772d("TokenCenterBinder", "isRegisted = " + this.mIsRegisted);
        return this.mIsRegisted;
    }

    @Override // com.bytedance.ee.bear.service.ITokenCenter
    public void notifyInitOver() throws RemoteException {
        C13479a.m54772d("TokenCenterBinder", "notifyInitOver: ");
        this.mIsRegisted = true;
        this.mSingleExecutor.execute(new Runnable() {
            /* class com.bytedance.ee.bear.service.remote.TokenCenterBinder.RunnableC109462 */

            public void run() {
                TokenCenterBinder tokenCenterBinder;
                try {
                    int beginBroadcast = TokenCenterBinder.this.mRegisterCallbacks.beginBroadcast();
                    for (int i = 0; i < beginBroadcast; i++) {
                        TokenCenterBinder.this.mRegisterCallbacks.getBroadcastItem(i).onRegistered();
                    }
                    try {
                        tokenCenterBinder = TokenCenterBinder.this;
                    } catch (Exception unused) {
                        return;
                    }
                } catch (Exception e) {
                    C13479a.m54759a("TokenCenterBinder", "register: failed broadcast over callback", e);
                    tokenCenterBinder = TokenCenterBinder.this;
                } catch (Throwable th) {
                    try {
                        TokenCenterBinder.this.mRegisterCallbacks.finishBroadcast();
                    } catch (Exception unused2) {
                    }
                    throw th;
                }
                tokenCenterBinder.mRegisterCallbacks.finishBroadcast();
            }
        });
    }

    TokenCenterBinder() {
    }

    @Override // com.bytedance.ee.bear.service.ITokenCenter
    public void registerInitCallback(IInitCallback iInitCallback) throws RemoteException {
        C13479a.m54772d("TokenCenterBinder", "registerInitCallback: ");
        this.mIInitCallback = iInitCallback;
    }

    @Override // com.bytedance.ee.bear.service.ITokenCenter
    public void addRegisterCallback(IRegisterCallback iRegisterCallback) throws RemoteException {
        C13479a.m54772d("TokenCenterBinder", "addRegisterCallback: callback = " + iRegisterCallback);
        this.mRegisterCallbacks.register(iRegisterCallback);
    }

    @Override // com.bytedance.ee.bear.service.ITokenCenter
    public void notifyInitOneService(final String str) throws RemoteException {
        C13479a.m54772d("TokenCenterBinder", "notifyInitOneService ");
        this.mSingleExecutor.execute(new Runnable() {
            /* class com.bytedance.ee.bear.service.remote.TokenCenterBinder.RunnableC109451 */

            public void run() {
                TokenCenterBinder tokenCenterBinder;
                try {
                    int beginBroadcast = TokenCenterBinder.this.mRegisterCallbacks.beginBroadcast();
                    for (int i = 0; i < beginBroadcast; i++) {
                        TokenCenterBinder.this.mRegisterCallbacks.getBroadcastItem(i).onRegisterOneBinder(str);
                    }
                    try {
                        tokenCenterBinder = TokenCenterBinder.this;
                    } catch (Exception unused) {
                        return;
                    }
                } catch (Exception e) {
                    C13479a.m54759a("TokenCenterBinder", "register: failed broadcast callback", e);
                    tokenCenterBinder = TokenCenterBinder.this;
                } catch (Throwable th) {
                    try {
                        TokenCenterBinder.this.mRegisterCallbacks.finishBroadcast();
                    } catch (Exception unused2) {
                    }
                    throw th;
                }
                tokenCenterBinder.mRegisterCallbacks.finishBroadcast();
            }
        });
    }

    @Override // com.bytedance.ee.bear.service.ITokenCenter
    public void removeRegisterCall(IRegisterCallback iRegisterCallback) {
        C13479a.m54772d("TokenCenterBinder", "removeRegisterCallback: callback = " + iRegisterCallback);
        this.mRegisterCallbacks.unregister(iRegisterCallback);
    }

    @Override // com.bytedance.ee.bear.service.ITokenCenter
    public String queryClassName(IBinder iBinder) throws RemoteException {
        C13479a.m54772d("TokenCenterBinder", "queryClassName: ");
        IInitCallback iInitCallback = this.mIInitCallback;
        if (iInitCallback != null && !iInitCallback.hasInit()) {
            this.mIInitCallback.onInit();
        }
        C10947a aVar = this.mClsNameMap.get(iBinder);
        if (aVar != null) {
            C13479a.m54772d("TokenCenterBinder", "queryClassName() returned: " + aVar);
            return aVar.f29436a;
        }
        C13479a.m54772d("TokenCenterBinder", "queryClassName() returned: null");
        return null;
    }

    @Override // com.bytedance.ee.bear.service.ITokenCenter
    public void remove(String str) throws RemoteException {
        C13479a.m54772d("TokenCenterBinder", "remove: class = " + str);
        IInitCallback iInitCallback = this.mIInitCallback;
        if (iInitCallback != null && !iInitCallback.hasInit()) {
            this.mIInitCallback.onInit();
        }
        C10947a aVar = this.mServiceTokens.get(str);
        if (aVar != null) {
            if (aVar.f29437b != null) {
                this.mClsNameMap.remove(aVar.f29437b);
            }
            this.mServiceTokens.remove(str);
        }
    }

    @Override // com.bytedance.ee.bear.service.ITokenCenter
    public void removeToken(IBinder iBinder) throws RemoteException {
        C13479a.m54772d("TokenCenterBinder", "removeToken: token = " + iBinder);
        C10947a aVar = this.mClsNameMap.get(iBinder);
        if (aVar != null) {
            if (aVar.f29436a != null) {
                this.mServiceTokens.remove(aVar.f29436a);
            }
            this.mClsNameMap.remove(iBinder);
        }
    }

    @Override // com.bytedance.ee.bear.service.ITokenCenter
    public IBinder getToken(String str) throws RemoteException {
        C13479a.m54772d("TokenCenterBinder", "getToken: " + str);
        IInitCallback iInitCallback = this.mIInitCallback;
        if (iInitCallback != null && !iInitCallback.hasInit()) {
            this.mIInitCallback.onInit();
        }
        C10947a aVar = this.mServiceTokens.get(str);
        if (aVar != null) {
            C13479a.m54772d("TokenCenterBinder", "getToken() returned: " + aVar.f29437b);
            return aVar.f29437b;
        }
        C13479a.m54772d("TokenCenterBinder", "getToken() returned: null");
        return null;
    }

    @Override // com.bytedance.ee.bear.service.ITokenCenter
    public void register(String str, IBinder iBinder) throws RemoteException {
        C13479a.m54772d("TokenCenterBinder", "register: className = " + str + "; token = " + iBinder);
        C10947a aVar = new C10947a(this, str, iBinder);
        this.mServiceTokens.put(str, aVar);
        this.mClsNameMap.put(iBinder, aVar);
    }
}
