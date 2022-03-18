package com.he.jsbinding.snapshot.services;

import com.he.jsbinding.snapshot.SnapshotCreatorData;
import ee.android.framework.manis.interfaces.IHookInterface;

public interface ISnapshotCreatingRemoteWorker extends IHookInterface {
    void startCreatingSnapshots(SnapshotCreatorData[] snapshotCreatorDataArr);
}
