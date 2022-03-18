package com.he.jsbinding.snapshot;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.he.jsbinding.snapshot.SnapshotCreatorHostServiceImpl;
import com.he.jsbinding.snapshot.services.ISnapshotCreatingRemoteWorker;
import com.he.jsbinding.snapshot.services.ISnapshotCreatingRemoteWorker0;
import com.he.jsbinding.snapshot.services.ISnapshotCreatingRemoteWorker1;
import com.he.jsbinding.snapshot.services.ISnapshotCreatingRemoteWorker2;
import com.he.jsbinding.snapshot.services.ISnapshotCreatingRemoteWorker3;
import com.he.jsbinding.snapshot.services.ISnapshotCreatingRemoteWorker4;
import com.ss.android.lark.manis.annotation.RemoteServiceImpl;
import com.tt.miniapp.process.SandboxMonitor;
import com.tt.miniapp.process.info.api.ISandboxEnvInfo;
import com.tt.miniapp.process.manager.C66645a;
import com.tt.miniapp.process.manager.IAppSandboxEnvProcessor;
import com.tt.miniapp.process.manager.api.IAppSandboxEnvManagerService;
import com.tt.miniapphost.p3362a.p3365c.C67448a;
import com.tt.miniapphost.util.AppbrandUtil;
import com.tt.refer.common.util.C67866g;
import ee.android.framework.manis.C68183b;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@RemoteServiceImpl(service = ISnapshotCreatorHostService.class)
public class SnapshotCreatorHostServiceImpl implements ISnapshotCreatorHostService {
    private static final Set<SnapshotCreatorData> CREATED_DATA = new HashSet();
    private static final Class<? extends ISnapshotCreatingRemoteWorker>[] SNAPSHOT_CREATING_REMOTE_WORKERS = {ISnapshotCreatingRemoteWorker0.class, ISnapshotCreatingRemoteWorker1.class, ISnapshotCreatingRemoteWorker2.class, ISnapshotCreatingRemoteWorker3.class, ISnapshotCreatingRemoteWorker4.class};
    public static final String TAG = "SnapshotCreatorHostServiceImpl";
    public static final Map<String, SnapshotCreatorData> WILL_CREATE_DATA = new HashMap();
    public final Context mContext;
    private final Handler mHandler;
    public volatile boolean mIsLaunchedSnapshotSandboxEnv;
    public volatile boolean mKillingSnapshotCreatingFaker;
    public final IAppSandboxEnvProcessor mMiniProcessor;
    public int mSnapshotCreatingFakerIndex = -1;

    private void registerSandboxLifeListener() {
        this.mMiniProcessor.registerSandboxLifeListener(new SandboxMonitor.AbstractC66610a() {
            /* class com.he.jsbinding.snapshot.SnapshotCreatorHostServiceImpl.C233741 */

            @Override // com.tt.miniapp.process.SandboxMonitor.AbstractC66610a
            public void onAlive(ISandboxEnvInfo iSandboxEnvInfo) {
                if (iSandboxEnvInfo.isSnapshotCreatingFaker()) {
                    String str = SnapshotCreatorHostServiceImpl.TAG;
                    AppBrandLogger.m52828d(str, "SnapshotCreatingFaker onAlive: Index = " + iSandboxEnvInfo.getIndex());
                    SnapshotCreatorHostServiceImpl.this.mSnapshotCreatingFakerIndex = iSandboxEnvInfo.getIndex();
                    SnapshotCreatorHostServiceImpl.this.pushAllCachedSnapshotCreatorData(iSandboxEnvInfo);
                }
            }

            @Override // com.tt.miniapp.process.SandboxMonitor.AbstractC66610a
            public void onDied(ISandboxEnvInfo iSandboxEnvInfo) {
                if (iSandboxEnvInfo.getIndex() == SnapshotCreatorHostServiceImpl.this.mSnapshotCreatingFakerIndex) {
                    String str = SnapshotCreatorHostServiceImpl.TAG;
                    AppBrandLogger.m52829e(str, "SnapshotCreatingFaker onDied: Index = " + iSandboxEnvInfo.getIndex());
                    SnapshotCreatorHostServiceImpl.this.mSnapshotCreatingFakerIndex = -1;
                    SnapshotCreatorHostServiceImpl.this.mIsLaunchedSnapshotSandboxEnv = false;
                    SnapshotCreatorHostServiceImpl.this.mKillingSnapshotCreatingFaker = false;
                    if (!SnapshotCreatorHostServiceImpl.WILL_CREATE_DATA.isEmpty()) {
                        SnapshotCreatorHostServiceImpl.this.launchSnapshotCreatingSandboxEnv();
                    }
                }
            }
        });
    }

    private void delayKillSnapshotCreatingFaker() {
        AppBrandLogger.m52828d(TAG, "delay kill SnapshotCreatingFaker");
        this.mHandler.removeMessages(1);
        this.mHandler.sendEmptyMessageDelayed(1, 300000);
    }

    public ISandboxEnvInfo getSnapshotCreatingFaker() {
        ISandboxEnvInfo[] allSandboxEnvs = C66645a.m260337a().mo232355a(IAppSandboxEnvManagerService.SandBoxEnvType.MINI_PROCESS).getAllSandboxEnvs();
        for (ISandboxEnvInfo iSandboxEnvInfo : allSandboxEnvs) {
            if (iSandboxEnvInfo.isSnapshotCreatingFaker() && iSandboxEnvInfo.isUsing()) {
                return iSandboxEnvInfo;
            }
        }
        return null;
    }

    public void launchSnapshotCreatingSandboxEnv() {
        if (!this.mIsLaunchedSnapshotSandboxEnv) {
            this.mIsLaunchedSnapshotSandboxEnv = true;
            AppBrandLogger.m52828d(TAG, "launchSnapshotCreatingSandboxEnv: ");
            this.mMiniProcessor.launchSnapshotCreatingSandboxEnv(1000, "launchSnapshotCreatingSandboxEnv", C67448a.m262353a().mo234190i());
        }
    }

    /* access modifiers changed from: private */
    public final class DelayHandler extends Handler {
        public /* synthetic */ void lambda$handleMessage$0$SnapshotCreatorHostServiceImpl$DelayHandler(ISandboxEnvInfo iSandboxEnvInfo) {
            SnapshotCreatorHostServiceImpl.this.mMiniProcessor.killSandbox(SnapshotCreatorHostServiceImpl.this.mContext, iSandboxEnvInfo);
        }

        public void handleMessage(Message message) {
            ISandboxEnvInfo snapshotCreatingFaker;
            if (message.what == 1) {
                removeMessages(1);
                if (SnapshotCreatorHostServiceImpl.this.mSnapshotCreatingFakerIndex > 0 && (snapshotCreatingFaker = SnapshotCreatorHostServiceImpl.this.getSnapshotCreatingFaker()) != null) {
                    AppBrandLogger.m52828d(SnapshotCreatorHostServiceImpl.TAG, "kill SnapshotCreatingFaker");
                    SnapshotCreatorHostServiceImpl.this.mKillingSnapshotCreatingFaker = true;
                    C67866g.m264032c(new Runnable(snapshotCreatingFaker) {
                        /* class com.he.jsbinding.snapshot.$$Lambda$SnapshotCreatorHostServiceImpl$DelayHandler$AWFiPJHzdE_TsGE3Nrunikx8rNQ */
                        public final /* synthetic */ ISandboxEnvInfo f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void run() {
                            SnapshotCreatorHostServiceImpl.DelayHandler.this.lambda$handleMessage$0$SnapshotCreatorHostServiceImpl$DelayHandler(this.f$1);
                        }
                    });
                }
            }
        }

        public DelayHandler(Looper looper) {
            super(looper);
        }
    }

    public SnapshotCreatorHostServiceImpl(Context context) {
        this.mContext = context;
        this.mMiniProcessor = C66645a.m260337a().mo232355a(IAppSandboxEnvManagerService.SandBoxEnvType.MINI_PROCESS);
        registerSandboxLifeListener();
        this.mHandler = new DelayHandler(Looper.getMainLooper());
    }

    public void pushAllCachedSnapshotCreatorData(ISandboxEnvInfo iSandboxEnvInfo) {
        Map<String, SnapshotCreatorData> map = WILL_CREATE_DATA;
        synchronized (map) {
            if (map.isEmpty()) {
                AppBrandLogger.m52829e(TAG, "pushAllCachedSnapshotCreatorData: WILL_CREATE_DATA is EMPTY");
                return;
            }
            map.clear();
            pushSnapshotCreatorDataList(iSandboxEnvInfo, (SnapshotCreatorData[]) map.values().toArray(new SnapshotCreatorData[0]));
        }
    }

    @Override // com.he.jsbinding.snapshot.ISnapshotCreatorHostService
    public void startCreatingSnapshot(SnapshotCreatorData snapshotCreatorData) {
        String str = TAG;
        AppBrandLogger.m52828d(str, "startCreatingSnapshot: creatorData = " + snapshotCreatorData);
        Map<String, SnapshotCreatorData> map = WILL_CREATE_DATA;
        synchronized (map) {
            if (CREATED_DATA.contains(snapshotCreatorData)) {
                AppBrandLogger.m52829e(str, "startCreatingSnapshot: data created! creatorData = " + snapshotCreatorData.toString());
                return;
            }
            ISandboxEnvInfo snapshotCreatingFaker = getSnapshotCreatingFaker();
            if (snapshotCreatingFaker != null && !this.mKillingSnapshotCreatingFaker) {
                if (TextUtils.isEmpty(snapshotCreatingFaker.getKillingAppId())) {
                    pushSnapshotCreatorData(snapshotCreatingFaker, snapshotCreatorData);
                }
            }
            if (map.containsKey(snapshotCreatorData.getAppId())) {
                SnapshotCreatorData snapshotCreatorData2 = map.get(snapshotCreatorData.getAppId());
                if (snapshotCreatorData2.equals(snapshotCreatorData)) {
                    AppBrandLogger.m52829e(str, "startCreatingSnapshot: contains creatorData = " + snapshotCreatorData.toString());
                    return;
                }
                if (AppbrandUtil.convertVersionStrToCode(snapshotCreatorData2.getAppVersion()) < AppbrandUtil.convertVersionStrToCode(snapshotCreatorData.getAppVersion())) {
                    AppBrandLogger.m52829e(str, "The latest version is available，old version is " + snapshotCreatorData2.getAppVersion() + ", new version is " + snapshotCreatorData.getAppVersion());
                    map.put(snapshotCreatorData.getAppId(), snapshotCreatorData);
                } else {
                    AppBrandLogger.m52829e(str, "There has new version is " + snapshotCreatorData2.getAppVersion());
                }
                return;
            }
            map.put(snapshotCreatorData.getAppId(), snapshotCreatorData);
            launchSnapshotCreatingSandboxEnv();
        }
    }

    private void pushSnapshotCreatorData(ISandboxEnvInfo iSandboxEnvInfo, SnapshotCreatorData snapshotCreatorData) {
        pushSnapshotCreatorDataList(iSandboxEnvInfo, new SnapshotCreatorData[]{snapshotCreatorData});
    }

    private void pushSnapshotCreatorDataList(ISandboxEnvInfo iSandboxEnvInfo, SnapshotCreatorData[] snapshotCreatorDataArr) {
        CREATED_DATA.addAll(Arrays.asList(snapshotCreatorDataArr));
        int index = iSandboxEnvInfo.getIndex();
        if (index >= 0) {
            Class<? extends ISnapshotCreatingRemoteWorker>[] clsArr = SNAPSHOT_CREATING_REMOTE_WORKERS;
            if (index < clsArr.length) {
                ISnapshotCreatingRemoteWorker iSnapshotCreatingRemoteWorker = (ISnapshotCreatingRemoteWorker) C68183b.m264839a().mo237086a(this.mContext, clsArr[index]);
                if (iSnapshotCreatingRemoteWorker != null) {
                    iSnapshotCreatingRemoteWorker.startCreatingSnapshots(snapshotCreatorDataArr);
                    delayKillSnapshotCreatingFaker();
                    return;
                }
                AppBrandLogger.m52829e(TAG, "pushSnapshotCreatorDataList: service is NULL");
                return;
            }
        }
        String str = TAG;
        AppBrandLogger.m52829e(str, "pushSnapshotCreatorDataList: index ERROR! index = " + index);
    }
}
