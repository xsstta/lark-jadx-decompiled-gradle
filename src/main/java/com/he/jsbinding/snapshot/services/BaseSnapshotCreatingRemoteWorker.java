package com.he.jsbinding.snapshot.services;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.he.jsbinding.snapshot.SnapshotCreatingWorker;
import com.he.jsbinding.snapshot.SnapshotCreatorData;
import com.tt.miniapphost.util.ProcessUtil;
import java.util.Arrays;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public abstract class BaseSnapshotCreatingRemoteWorker implements ISnapshotCreatingRemoteWorker {
    private static final String TAG = "BaseSnapshotCreatingRemoteWorker";
    private final Context mContext;
    private final Queue<SnapshotCreatorData> mCreatorDataQueue = new ConcurrentLinkedDeque();
    private Handler mHandler;
    private final HandlerThread mHandlerThread;

    public static HandlerThread new_android_os_HandlerThread_by_knot(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    private void postCreatingSnapshot() {
        getHandler().post(new Runnable() {
            /* class com.he.jsbinding.snapshot.services.$$Lambda$BaseSnapshotCreatingRemoteWorker$Sod_n8jvzx3kNbj7ssVNjfgqzYk */

            public final void run() {
                BaseSnapshotCreatingRemoteWorker.this.lambda$postCreatingSnapshot$0$BaseSnapshotCreatingRemoteWorker();
            }
        });
    }

    private Handler getHandler() {
        if (this.mHandler == null) {
            this.mHandler = new Handler(this.mHandlerThread.getLooper());
        }
        return this.mHandler;
    }

    public /* synthetic */ void lambda$postCreatingSnapshot$0$BaseSnapshotCreatingRemoteWorker() {
        AppBrandLogger.m52828d(TAG, "postCreatingSnapshot: running");
        while (!this.mCreatorDataQueue.isEmpty()) {
            SnapshotCreatorData poll = this.mCreatorDataQueue.poll();
            String str = TAG;
            AppBrandLogger.m52828d(str, "CreatingSnapshot: data = " + poll);
            new SnapshotCreatingWorker(poll).startCreatingSnapshot();
            AppBrandLogger.m52828d(str, "CreatingSnapshot: end data = " + poll);
        }
    }

    public BaseSnapshotCreatingRemoteWorker(Context context) {
        this.mContext = context;
        HandlerThread new_android_os_HandlerThread_by_knot = new_android_os_HandlerThread_by_knot("snapshot_creating_worker");
        this.mHandlerThread = new_android_os_HandlerThread_by_knot;
        new_android_os_HandlerThread_by_knot.start();
    }

    @Override // com.he.jsbinding.snapshot.services.ISnapshotCreatingRemoteWorker
    public void startCreatingSnapshots(SnapshotCreatorData[] snapshotCreatorDataArr) {
        String str = TAG;
        AppBrandLogger.m52828d(str, "startCreatingSnapshots: in process " + ProcessUtil.getCurProcessName(this.mContext));
        if (snapshotCreatorDataArr == null || snapshotCreatorDataArr.length == 0) {
            AppBrandLogger.m52829e(str, "startCreatingSnapshot: creatorDatas is NULL");
            return;
        }
        boolean isEmpty = this.mCreatorDataQueue.isEmpty();
        AppBrandLogger.m52828d(str, "startCreatingSnapshots: isEmpty = " + isEmpty);
        this.mCreatorDataQueue.addAll(Arrays.asList(snapshotCreatorDataArr));
        if (isEmpty) {
            postCreatingSnapshot();
        }
    }
}
