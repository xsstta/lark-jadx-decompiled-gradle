package com.he.jsbinding.snapshot;

import com.ss.android.lark.manis.annotation.RemoteService;
import ee.android.framework.manis.interfaces.IHookInterface;

@RemoteService
public interface ISnapshotCreatorHostService extends IHookInterface {
    void startCreatingSnapshot(SnapshotCreatorData snapshotCreatorData);
}
