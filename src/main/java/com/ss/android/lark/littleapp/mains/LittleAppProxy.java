package com.ss.android.lark.littleapp.mains;

import android.os.Bundle;
import com.ss.android.lark.manis.annotation.RemoteCallback;
import com.ss.android.lark.manis.annotation.RemoteService;
import com.tt.miniapp.launchaction.bean.MessageTriggerInfo;
import com.tt.miniapphost.process.data.CrossProcessCallEntity;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.refer.impl.business.api.diagnose.entity.DumpConfig;
import ee.android.framework.manis.interfaces.IHookInterface;

@RemoteService
public interface LittleAppProxy extends IHookInterface {

    @RemoteCallback
    /* renamed from: com.ss.android.lark.littleapp.mains.LittleAppProxy$a */
    public interface AbstractC41394a {
        void onIpcCallback(CrossProcessDataEntity crossProcessDataEntity);
    }

    @RemoteCallback
    /* renamed from: com.ss.android.lark.littleapp.mains.LittleAppProxy$b */
    public interface AbstractC41395b {
        void onResult(int i, String str);
    }

    Bundle applyDumpInfo(String str, DumpConfig dumpConfig);

    boolean brandApplicationCanDebug(String str);

    boolean canOpen(String str);

    boolean canOpenCloudFile(String str);

    String getDeviceId();

    int getEnvType();

    MessageTriggerInfo getMessagesByCode(String str, String str2);

    String getMinaBaseUrlForGadget();

    String getMinaBaseUrlForWebApp();

    long getServerTime();

    String getSession();

    void handleProcessAsyncCall(CrossProcessCallEntity crossProcessCallEntity, AbstractC41394a aVar);

    CrossProcessDataEntity handleProcessSyncCall(CrossProcessCallEntity crossProcessCallEntity);

    boolean inspectModeIsOpen();

    boolean isLoginLarkEnv();

    void startChatWindowActivityByChatterId(String str, String str2, boolean z);
}
