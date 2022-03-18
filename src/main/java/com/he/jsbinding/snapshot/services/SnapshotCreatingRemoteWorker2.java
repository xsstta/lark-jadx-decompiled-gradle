package com.he.jsbinding.snapshot.services;

import android.content.Context;
import com.ss.android.lark.manis.annotation.RemoteServiceImpl;

@RemoteServiceImpl(service = ISnapshotCreatingRemoteWorker2.class)
public class SnapshotCreatingRemoteWorker2 extends BaseSnapshotCreatingRemoteWorker implements ISnapshotCreatingRemoteWorker2 {
    public SnapshotCreatingRemoteWorker2(Context context) {
        super(context);
    }
}
