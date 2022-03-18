package com.tt.miniapphost.util;

import android.os.SystemClock;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import java.util.concurrent.atomic.AtomicLong;

public class TimeMeter {
    private AtomicLong mLeftPoint;
    private AtomicLong mLength = new AtomicLong(0);
    private volatile long mStartPoint;

    public static long currentMillis() {
        return SystemClock.uptimeMillis();
    }

    public static TimeMeter newAndStart() {
        return newAndStart(currentMillis());
    }

    public long start() {
        return start(currentMillis());
    }

    public TimeMeter() {
        AtomicLong atomicLong = new AtomicLong(-1);
        this.mLeftPoint = atomicLong;
        this.mStartPoint = atomicLong.get();
    }

    public long getMillisAfterStart() {
        if (this.mStartPoint == -1) {
            return (long) 0;
        }
        return currentMillis() - this.mStartPoint;
    }

    public boolean isRunning() {
        if (-1 == this.mLeftPoint.addAndGet(0) || 0 != this.mLength.addAndGet(0)) {
            return false;
        }
        return true;
    }

    public long stop() {
        long j;
        long j2 = this.mLeftPoint.get();
        if (-1 != j2) {
            j = currentMillis() - j2;
        } else {
            j = 0;
        }
        if (this.mLength.compareAndSet(0, j)) {
            this.mLeftPoint.set(-1);
            AppBrandLogger.m52828d("TimeMeter", "stop: success " + this.mLength);
        } else {
            AppBrandLogger.m52828d("TimeMeter", "stop: fail " + this.mLength);
        }
        return this.mLength.get();
    }

    public static long nowDiff(long j) {
        return currentMillis() - j;
    }

    public static long nowAfterStart(TimeMeter timeMeter) {
        if (timeMeter == null) {
            return 0;
        }
        return timeMeter.getMillisAfterStart();
    }

    public static long stop(TimeMeter timeMeter) {
        if (timeMeter == null) {
            return 0;
        }
        return timeMeter.stop();
    }

    public static TimeMeter newAndStart(long j) {
        TimeMeter timeMeter = new TimeMeter();
        timeMeter.start(j);
        return timeMeter;
    }

    private long start(long j) {
        if (this.mLeftPoint.compareAndSet(-1, j)) {
            this.mLength.set(0);
            this.mStartPoint = this.mLeftPoint.get();
            AppBrandLogger.m52828d("TimeMeter", "start: success " + this.mLeftPoint);
        } else {
            AppBrandLogger.m52828d("TimeMeter", "start: fail " + this.mLeftPoint);
        }
        return this.mLeftPoint.get();
    }
}
