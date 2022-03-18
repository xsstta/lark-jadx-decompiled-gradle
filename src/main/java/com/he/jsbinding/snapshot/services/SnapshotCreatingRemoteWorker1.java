package com.he.jsbinding.snapshot.services;

import android.content.Context;
import com.ss.android.lark.manis.annotation.RemoteServiceImpl;

@RemoteServiceImpl(service = ISnapshotCreatingRemoteWorker1.class)
public class SnapshotCreatingRemoteWorker1 extends BaseSnapshotCreatingRemoteWorker implements ISnapshotCreatingRemoteWorker1 {
    public SnapshotCreatingRemoteWorker1(Context context) {
        super(context);
    }
}
