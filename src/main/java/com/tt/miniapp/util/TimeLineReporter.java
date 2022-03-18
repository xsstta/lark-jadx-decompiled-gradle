package com.tt.miniapp.util;

import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.AppbrandServiceManager;
import com.tt.miniapp.event.C66020b;
import com.tt.miniapp.streamloader.StreamLoader;
import java.util.concurrent.atomic.AtomicBoolean;

public class TimeLineReporter extends AppbrandServiceManager.ServiceBase {
    private long appLaunchStartTime;
    private AtomicBoolean appStartTimeRecorded = new AtomicBoolean(false);
    private AtomicBoolean appStopTimeRecorded = new AtomicBoolean(false);

    public void recordLaunchStartTime() {
        if (!this.appStartTimeRecorded.getAndSet(true)) {
            this.appLaunchStartTime = System.currentTimeMillis();
        }
    }

    private int isLocalPkg() {
        if (StreamLoader.getLoadTask(this.mApp.getiAppContext()) == null || !StreamLoader.getLoadTask(this.mApp.getiAppContext()).isUseLocalPkg()) {
            return 0;
        }
        return 1;
    }

    public void recordLaunchStopTime() {
        if (this.appStartTimeRecorded.get() && StreamLoader.getLoadTask(this.mApp.getiAppContext()) != null && StreamLoader.getLoadTask(this.mApp.getiAppContext()).getTTApkgVersion() == 2 && !this.appStopTimeRecorded.getAndSet(true)) {
            C66020b.m258530a("mp_load_time_ttpkg2", this.mApp.getiAppContext()).mo231090a("load_flag", 1).mo231090a("duration", Long.valueOf(System.currentTimeMillis() - this.appLaunchStartTime)).mo231090a("local_pkg", Integer.valueOf(isLocalPkg())).mo231092a();
        }
    }

    private TimeLineReporter(AppbrandApplicationImpl appbrandApplicationImpl) {
        super(appbrandApplicationImpl);
    }
}
