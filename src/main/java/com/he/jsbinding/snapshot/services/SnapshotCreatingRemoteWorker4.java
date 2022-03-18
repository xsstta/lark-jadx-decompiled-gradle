package com.he.jsbinding.snapshot.services;

import android.content.Context;
import com.ss.android.lark.manis.annotation.RemoteServiceImpl;

@RemoteServiceImpl(service = ISnapshotCreatingRemoteWorker4.class)
public class SnapshotCreatingRemoteWorker4 extends BaseSnapshotCreatingRemoteWorker implements ISnapshotCreatingRemoteWorker4 {
    public SnapshotCreatingRemoteWorker4(Context context) {
        super(context);
    }
}
