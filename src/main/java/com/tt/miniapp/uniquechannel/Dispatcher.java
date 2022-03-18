package com.tt.miniapp.uniquechannel;

import android.os.IBinder;
import android.os.RemoteException;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapp.uniquechannel.IDispatcher;
import com.tt.miniapp.uniquechannel.IProxy;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Dispatcher extends IDispatcher.Stub {
    private final List<IProxy> mProxyList;

    /* renamed from: com.tt.miniapp.uniquechannel.Dispatcher$a */
    private static final class C67006a {

        /* renamed from: a */
        public static final Dispatcher f168959a = new Dispatcher();
    }

    public static Dispatcher getInstance() {
        return C67006a.f168959a;
    }

    private Dispatcher() {
        this.mProxyList = new CopyOnWriteArrayList();
    }

    public /* synthetic */ void lambda$registerListener$0$Dispatcher(IBinder iBinder) {
        this.mProxyList.remove(IProxy.Stub.asInterface(iBinder));
        AppBrandLogger.m52829e("Dispatcher", "registerListener linkToDeath");
    }

    @Override // com.tt.miniapp.uniquechannel.IDispatcher
    public void publish(Message message) throws RemoteException {
        for (IProxy iProxy : this.mProxyList) {
            iProxy.dispatch(message);
        }
    }

    @Override // com.tt.miniapp.uniquechannel.IDispatcher
    public void registerListener(IBinder iBinder) throws RemoteException {
        iBinder.linkToDeath(new IBinder.DeathRecipient(iBinder) {
            /* class com.tt.miniapp.uniquechannel.$$Lambda$Dispatcher$vUGwaUyBF7x0bwMOJQ6p3Lo9a4 */
            public final /* synthetic */ IBinder f$1;

            {
                this.f$1 = r2;
            }

            public final void binderDied() {
                Dispatcher.this.lambda$registerListener$0$Dispatcher(this.f$1);
            }
        }, 0);
        this.mProxyList.add(IProxy.Stub.asInterface(iBinder));
    }
}
