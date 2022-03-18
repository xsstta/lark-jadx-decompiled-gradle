package com.bytedance.push.interfaze;

public interface IMonitor {
    void init();

    void markOuterSwitchUploadFailed(int i, String str);

    void markOuterSwitchUploadSuccess();

    void markUpdateSenderFailed(int i, String str);

    void markUpdateSenderSuccess();

    void monitorRegisterSender(int i);

    void monitorRegisterSenderFailed(int i, int i2, String str, String str2);

    void monitorRegisterSenderSuccess(int i);

    void monitorSenderSupport(boolean z, String str);

    void monitorStart();
}
