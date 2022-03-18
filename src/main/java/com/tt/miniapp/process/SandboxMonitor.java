package com.tt.miniapp.process;

import android.app.Application;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapp.process.info.api.ISandboxEnvInfo;
import com.tt.miniapp.process.manager.C66645a;
import com.tt.miniapp.process.manager.api.IAppSandboxEnvManagerService;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.process.base.Host2MiniAppBinderStub;
import com.tt.miniapphost.process.base.IHost2MiniAppBinderInterface;
import com.tt.miniapphost.process.data.CrossProcessCallEntity;
import com.tt.miniapphost.process.p3376b.AbstractC67565b;
import com.tt.miniapphost.util.DebugUtil;
import com.tt.miniapphost.util.ProcessUtil;
import java.util.LinkedList;

public class SandboxMonitor {
    private boolean mBoundService;
    public IBinder.DeathRecipient mDeathRecipient;
    public final Object mLock = new Object();
    private LinkedList<Pair<CrossProcessCallEntity, AbstractC67565b>> mPendingCallList = new LinkedList<>();
    private final ISandboxEnvInfo mProcessInfo;
    public volatile IHost2MiniAppBinderInterface mRealMonitor;
    private final AbstractC66610a mSandboxLifeListener;
    private ServiceConnection mServiceConnection;

    /* renamed from: com.tt.miniapp.process.SandboxMonitor$a */
    public interface AbstractC66610a {
        void onAlive(ISandboxEnvInfo iSandboxEnvInfo);

        void onDied(ISandboxEnvInfo iSandboxEnvInfo);
    }

    public String getProcessName() {
        return this.mProcessInfo.getSandboxName();
    }

    public boolean isAlive() {
        if (this.mRealMonitor != null) {
            return true;
        }
        return false;
    }

    public void mainSandboxDie() {
        IBinder.DeathRecipient deathRecipient = this.mDeathRecipient;
        if (deathRecipient != null) {
            deathRecipient.binderDied();
        }
    }

    private boolean rebindIfCan() {
        if (!C66645a.m260337a().mo232355a(IAppSandboxEnvManagerService.SandBoxEnvType.MINI_PROCESS).isSandboxEnvExistByName(this.mProcessInfo.getSandboxName())) {
            return false;
        }
        startMonitorMiniAppProcess(this.mProcessInfo.getAppId());
        return true;
    }

    public void onProcessAlive() {
        LinkedList<Pair<CrossProcessCallEntity, AbstractC67565b>> linkedList;
        AppBrandLogger.m52828d("tma_MiniProcessMonitor", "onProcessAlive: " + this.mProcessInfo.getSandboxName());
        this.mSandboxLifeListener.onAlive(this.mProcessInfo);
        synchronized (this.mLock) {
            if (!this.mPendingCallList.isEmpty()) {
                linkedList = this.mPendingCallList;
                this.mPendingCallList = new LinkedList<>();
            } else {
                linkedList = null;
            }
        }
        if (linkedList != null) {
            while (!linkedList.isEmpty()) {
                Pair<CrossProcessCallEntity, AbstractC67565b> removeFirst = linkedList.removeFirst();
                asyncCallMiniAppProcess((CrossProcessCallEntity) removeFirst.first, (AbstractC67565b) removeFirst.second);
            }
        }
    }

    public void onProcessDied() {
        LinkedList<Pair<CrossProcessCallEntity, AbstractC67565b>> linkedList;
        AppBrandLogger.m52828d("tma_MiniProcessMonitor", "onProcessDied: " + this.mProcessInfo.getSandboxName());
        synchronized (this.mLock) {
            if (!this.mPendingCallList.isEmpty()) {
                linkedList = this.mPendingCallList;
                this.mPendingCallList = new LinkedList<>();
            } else {
                linkedList = null;
            }
        }
        if (linkedList != null) {
            while (!linkedList.isEmpty()) {
                Pair<CrossProcessCallEntity, AbstractC67565b> removeFirst = linkedList.removeFirst();
                if (removeFirst.second != null) {
                    ((AbstractC67565b) removeFirst.second).mo48979a();
                    ((AbstractC67565b) removeFirst.second).mo234711d();
                }
            }
        }
        stopMonitorMiniAppProcess();
        this.mSandboxLifeListener.onDied(this.mProcessInfo);
    }

    public void stopMonitorMiniAppProcess() {
        synchronized (this.mLock) {
            if (this.mBoundService) {
                AppBrandLogger.m52828d("tma_MiniProcessMonitor", "stopMonitorMiniAppProcess unbindService processName: " + this.mProcessInfo.getSandboxName());
                try {
                    Application applicationContext = AppbrandContext.getInst().getApplicationContext();
                    applicationContext.unbindService(this.mServiceConnection);
                    if (ProcessUtil.isMainProcess(applicationContext)) {
                        applicationContext.stopService(new Intent(applicationContext, this.mProcessInfo.getPreloadServiceClass()));
                    }
                } catch (Exception e) {
                    DebugUtil.outputError("tma_MiniProcessMonitor", "monitor stopMonitorMiniAppProcess error: " + e);
                }
                this.mBoundService = false;
            }
        }
    }

    public void startMonitorMiniAppProcess(String str) {
        synchronized (this.mLock) {
            if (this.mRealMonitor != null) {
                AppBrandLogger.m52828d("tma_MiniProcessMonitor", "mRealMonitor != null");
            } else if (this.mBoundService) {
                AppBrandLogger.m52828d("tma_MiniProcessMonitor", "mPendingBindMiniAppService");
            } else {
                AppBrandLogger.m52828d("tma_MiniProcessMonitor", "startMonitorMiniAppProcess bindService processName: " + this.mProcessInfo.getSandboxName());
                Application applicationContext = AppbrandContext.getInst().getApplicationContext();
                Intent intent = new Intent(applicationContext, this.mProcessInfo.getPreloadServiceClass());
                if (!TextUtils.isEmpty(str)) {
                    intent.putExtra("appId", str);
                }
                this.mBoundService = applicationContext.bindService(intent, this.mServiceConnection, 1);
            }
        }
    }

    public SandboxMonitor(ISandboxEnvInfo iSandboxEnvInfo, AbstractC66610a aVar) {
        this.mProcessInfo = iSandboxEnvInfo;
        this.mSandboxLifeListener = aVar;
        this.mServiceConnection = new ServiceConnection() {
            /* class com.tt.miniapp.process.SandboxMonitor.ServiceConnectionC666081 */

            public void onServiceDisconnected(ComponentName componentName) {
                AppBrandLogger.m52828d("tma_MiniProcessMonitor", "49411_onServiceDisconnected: " + Thread.currentThread().getName());
            }

            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                AppBrandLogger.m52828d("tma_MiniProcessMonitor", "49411_onServiceConnected: " + componentName + ", " + iBinder);
                synchronized (SandboxMonitor.this.mLock) {
                    SandboxMonitor.this.mRealMonitor = Host2MiniAppBinderStub.asInterface(iBinder);
                }
                if (SandboxMonitor.this.mRealMonitor == null) {
                    AppBrandLogger.m52828d("tma_MiniProcessMonitor", "onServiceConnected mRealMonitor == null. iBinder:" + iBinder);
                    SandboxMonitor.this.onProcessDied();
                    return;
                }
                try {
                    SandboxMonitor.this.mRealMonitor.asBinder().linkToDeath(SandboxMonitor.this.mDeathRecipient, 0);
                    SandboxMonitor.this.onProcessAlive();
                } catch (RemoteException e) {
                    synchronized (SandboxMonitor.this.mLock) {
                        SandboxMonitor.this.mRealMonitor = null;
                        SandboxMonitor.this.onProcessDied();
                        AppBrandLogger.eWithThrowable("tma_MiniProcessMonitor", "49411_link2death exp!", e);
                    }
                }
            }
        };
        this.mDeathRecipient = new IBinder.DeathRecipient() {
            /* class com.tt.miniapp.process.SandboxMonitor.C666092 */

            public void binderDied() {
                AppBrandLogger.m52828d("tma_MiniProcessMonitor", "49411_binderDied: " + Thread.currentThread().getName());
                synchronized (SandboxMonitor.this.mLock) {
                    if (SandboxMonitor.this.mRealMonitor != null) {
                        SandboxMonitor.this.mRealMonitor.asBinder().unlinkToDeath(SandboxMonitor.this.mDeathRecipient, 0);
                        SandboxMonitor.this.mRealMonitor = null;
                        SandboxMonitor.this.onProcessDied();
                    }
                }
            }
        };
    }

    public void asyncCallMiniAppProcess(CrossProcessCallEntity crossProcessCallEntity, AbstractC67565b bVar) {
        boolean z;
        int i;
        IHost2MiniAppBinderInterface iHost2MiniAppBinderInterface = this.mRealMonitor;
        if (iHost2MiniAppBinderInterface == null) {
            synchronized (this.mLock) {
                if (this.mRealMonitor != null) {
                    iHost2MiniAppBinderInterface = this.mRealMonitor;
                } else if (this.mBoundService) {
                    this.mPendingCallList.addLast(new Pair<>(crossProcessCallEntity, bVar));
                } else {
                    z = true;
                }
                z = false;
            }
        } else {
            z = false;
        }
        if (iHost2MiniAppBinderInterface != null) {
            if (bVar != null) {
                try {
                    i = bVar.mo234709b();
                } catch (RemoteException e) {
                    AppBrandLogger.m52829e("tma_MiniProcessMonitor", e);
                    return;
                }
            } else {
                i = 0;
            }
            iHost2MiniAppBinderInterface.asyncCallMiniProcess(crossProcessCallEntity, i);
        } else if (!z) {
        } else {
            if (rebindIfCan()) {
                asyncCallMiniAppProcess(crossProcessCallEntity, bVar);
            } else if (bVar != null) {
                bVar.mo234711d();
                bVar.mo48979a();
            }
        }
    }
}
