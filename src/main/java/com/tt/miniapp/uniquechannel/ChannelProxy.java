package com.tt.miniapp.uniquechannel;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.RemoteException;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.framework.utils.C26252ad;
import com.larksuite.framework.utils.C26266d;
import com.tt.miniapp.uniquechannel.IDispatcher;
import com.tt.miniapp.uniquechannel.IProxy;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ChannelProxy extends IProxy.Stub {
    private Context mAppContext;
    private IDispatcher mDispatcher;
    private boolean mIsMainProcess;
    private final HashMap<String, List<C67004b>> mObserverMap;

    /* renamed from: com.tt.miniapp.uniquechannel.ChannelProxy$a */
    private static final class C67003a {

        /* renamed from: a */
        public static final ChannelProxy f168956a = new ChannelProxy();
    }

    private boolean checkPermission(C67004b bVar, Message message) {
        return true;
    }

    static ChannelProxy getInstance() {
        return C67003a.f168956a;
    }

    private ChannelProxy() {
        this.mObserverMap = new HashMap<>();
    }

    private boolean isProxyValid() {
        IDispatcher iDispatcher = this.mDispatcher;
        if (iDispatcher == null || (iDispatcher instanceof IDispatcher.Default)) {
            return false;
        }
        return true;
    }

    public /* synthetic */ void lambda$initProxy$0$ChannelProxy() {
        AppBrandLogger.m52830i("DispatcherProxy", "main process die");
        this.mDispatcher = null;
    }

    private Uri getProviderUri() {
        return Uri.parse("content://" + this.mAppContext.getPackageName() + "." + "uchannel.dispatcherprovider");
    }

    private IDispatcher getProxy() {
        if (isProxyValid()) {
            return this.mDispatcher;
        }
        initProxy();
        if (this.mDispatcher instanceof IDispatcher.Default) {
            AppBrandLogger.m52829e("DispatcherProxy", "getProxy fail!");
        }
        return this.mDispatcher;
    }

    private IBinder getProxyBinder() {
        Cursor cursor;
        Throwable th;
        try {
            cursor = this.mAppContext.getContentResolver().query(getProviderUri(), null, null, null, null);
            if (cursor == null) {
                C26266d.m95081a(cursor);
                return null;
            }
            try {
                IBinder a = C67009b.m261148a(cursor);
                C26266d.m95081a(cursor);
                return a;
            } catch (Throwable th2) {
                th = th2;
                C26266d.m95081a(cursor);
                throw th;
            }
        } catch (Throwable th3) {
            cursor = null;
            th = th3;
            C26266d.m95081a(cursor);
            throw th;
        }
    }

    private void initProxy() {
        if (!isProxyValid()) {
            if (this.mIsMainProcess) {
                this.mDispatcher = Dispatcher.getInstance();
            } else {
                synchronized (ChannelProxy.class) {
                    if (!isProxyValid()) {
                        IBinder proxyBinder = getProxyBinder();
                        if (proxyBinder != null) {
                            try {
                                proxyBinder.linkToDeath(new IBinder.DeathRecipient() {
                                    /* class com.tt.miniapp.uniquechannel.$$Lambda$ChannelProxy$LCubyIoplvhaCXx2yI3X7fc5QjY */

                                    public final void binderDied() {
                                        ChannelProxy.this.lambda$initProxy$0$ChannelProxy();
                                    }
                                }, 0);
                            } catch (RemoteException unused) {
                                AppBrandLogger.m52830i("DispatcherProxy", "linkToDeath ");
                            }
                            this.mDispatcher = IDispatcher.Stub.asInterface(proxyBinder);
                            AppBrandLogger.m52830i("DispatcherProxy", "init proxy done");
                        }
                        if (this.mDispatcher == null) {
                            this.mDispatcher = new IDispatcher.Default();
                        }
                    }
                }
            }
            try {
                this.mDispatcher.registerListener(asBinder());
            } catch (RemoteException unused2) {
                AppBrandLogger.m52830i("DispatcherProxy", "registerListener fail");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void init(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.mAppContext = applicationContext;
        this.mIsMainProcess = C26252ad.m94993b(applicationContext);
        initProxy();
    }

    /* access modifiers changed from: package-private */
    public void publish(Message message) {
        try {
            getProxy().publish(message);
        } catch (RemoteException e) {
            AppBrandLogger.m52830i("DispatcherProxy", "publish fail", e.getMessage());
        }
    }

    @Override // com.tt.miniapp.uniquechannel.IProxy
    public void dispatch(Message message) {
        List<C67004b> list = this.mObserverMap.get(message.mo233083a());
        if (list != null) {
            for (C67004b bVar : list) {
                if (targetMatch(message.mo233084b(), bVar.f168957a) && checkPermission(bVar, message)) {
                    bVar.f168958b.mo233091a(message);
                }
            }
        }
    }

    /* renamed from: com.tt.miniapp.uniquechannel.ChannelProxy$b */
    static class C67004b {

        /* renamed from: a */
        public final String f168957a;

        /* renamed from: b */
        public final AbstractC67008a f168958b;

        C67004b(String str, AbstractC67008a aVar) {
            this.f168957a = str;
            this.f168958b = aVar;
        }
    }

    private boolean targetMatch(List<String> list, String str) {
        if (list == null || list.size() == 0) {
            return true;
        }
        for (String str2 : list) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void register(String str, List<String> list, AbstractC67008a aVar) {
        for (String str2 : list) {
            List<C67004b> list2 = this.mObserverMap.get(str2);
            if (list2 == null) {
                list2 = new CopyOnWriteArrayList<>();
                this.mObserverMap.put(str2, list2);
            }
            list2.add(new C67004b(str, aVar));
        }
    }

    /* access modifiers changed from: package-private */
    public void unRegister(String str, List<String> list, AbstractC67008a aVar) {
        for (String str2 : list) {
            List<C67004b> list2 = this.mObserverMap.get(str2);
            if (list2 != null) {
                Iterator<C67004b> it = list2.iterator();
                while (it.hasNext()) {
                    C67004b next = it.next();
                    if (aVar.equals(next.f168958b) && str.equals(next.f168957a)) {
                        it.remove();
                    }
                }
            }
        }
    }
}
