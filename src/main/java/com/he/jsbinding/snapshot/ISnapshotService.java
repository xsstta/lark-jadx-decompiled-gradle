package com.he.jsbinding.snapshot;

import android.content.Intent;

public interface ISnapshotService {
    boolean checkSnapshotExist(String str);

    void cleanAllSnapshot();

    void discardSnapshot(String str);

    boolean enableSnapshot(String str, boolean z);

    void generateSnapshot(String str);

    String getCurrentAppSnapShotDir();

    String getLaunchModelReason();

    String getSnapshotFilePath(String str);

    void initEngine(String str);

    boolean isEnableStandardSnapshot();

    boolean isRunningInSeparateProcess();

    boolean needCreateSnapshot(String str, boolean z);

    boolean needCreateStandardSnapshot(String str, boolean z);

    void setIsRunningInSeparateProcess(boolean z);

    void startCreatingNewVersionAppSnapshot(String str);

    void startCreatingSnapshot();

    void updateSnapshotABIntent(Intent intent);
}
