package com.ss.android.lark.wschannelprocess.wschannelipc;

import android.content.Context;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.manis.annotation.RemoteServiceImpl;
import com.ss.android.lark.wschannelprocess.C59304c;
import com.ss.android.lark.wschannelprocess.C59307d;
import com.ss.android.lark.wschannelprocess.IWschannelProcIPCServer;

@RemoteServiceImpl(service = IWschannelProcIPCServer.class)
public class WschannelProcIPCServer implements IWschannelProcIPCServer {
    public static boolean asureDependencyValid() {
        if (C59307d.m230286b() == null) {
            try {
                Thread.sleep(3000);
            } catch (Throwable unused) {
            }
        }
        if (C59307d.m230286b() == null) {
            return false;
        }
        return true;
    }

    public WschannelProcIPCServer(Context context) {
    }

    @Override // com.ss.android.lark.wschannelprocess.IWschannelProcIPCServer
    public void dealMainProcDozeStateChange(final boolean z) {
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.wschannelprocess.wschannelipc.WschannelProcIPCServer.RunnableC593291 */

            public void run() {
                if (!WschannelProcIPCServer.asureDependencyValid()) {
                    Log.m165397w("WschannelProcIPCServer", "asureDependencyValid return false ");
                    return;
                }
                Log.m165389i("WschannelProcIPCServer", "threadpool begin dealMainProcDozeStateChange bDoze is " + z);
                C59304c.m230268a().mo201575b(z);
            }
        });
    }
}
