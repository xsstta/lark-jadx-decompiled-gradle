package com.he.jsbinding.snapshot.services;

import android.content.Context;
import com.ss.android.lark.manis.annotation.RemoteServiceImpl;

@RemoteServiceImpl(service = ISnapshotCreatingRemoteWorker3.class)
public class SnapshotCreatingRemoteWorker3 extends BaseSnapshotCreatingRemoteWorker implements ISnapshotCreatingRemoteWorker3 {
    public SnapshotCreatingRemoteWorker3(Context context) {
        super(context);
    }
}
