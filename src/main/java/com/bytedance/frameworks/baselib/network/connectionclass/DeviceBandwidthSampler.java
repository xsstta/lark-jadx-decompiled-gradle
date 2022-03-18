package com.bytedance.frameworks.baselib.network.connectionclass;

import android.net.TrafficStats;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.common.utility.Logger;
import com.bytedance.platform.thread.PlatformHandlerThread;
import java.util.concurrent.atomic.AtomicInteger;

public class DeviceBandwidthSampler {
    private static long sPreviousBytes = -1;
    private final C13949b mConnectionClassManager;
    private HandlerC13945b mHandler;
    private boolean mInvalid;
    private long mLastTimeReading;
    private AtomicInteger mSamplingCounter;
    private HandlerThread mThread;

    /* renamed from: com.bytedance.frameworks.baselib.network.connectionclass.DeviceBandwidthSampler$a */
    private static class C13944a {

        /* renamed from: a */
        public static final DeviceBandwidthSampler f36457a = new DeviceBandwidthSampler(C13949b.m56438b());
    }

    public static DeviceBandwidthSampler getInstance() {
        return C13944a.f36457a;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.frameworks.baselib.network.connectionclass.DeviceBandwidthSampler$b */
    public class HandlerC13945b extends Handler {
        /* renamed from: a */
        public void mo51309a() {
            sendEmptyMessage(1);
        }

        /* renamed from: b */
        public void mo51310b() {
            removeMessages(1);
        }

        public void handleMessage(Message message) {
            try {
                if (message.what == 1) {
                    DeviceBandwidthSampler.this.addSample();
                    sendEmptyMessageDelayed(1, 1000);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        public HandlerC13945b(Looper looper) {
            super(looper);
        }
    }

    /* access modifiers changed from: protected */
    public void addFinalSample() {
        addSample();
        sPreviousBytes = -1;
    }

    public boolean isSampling() {
        if (this.mSamplingCounter.get() != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void addSample() {
        try {
            long totalRxBytes = TrafficStats.getTotalRxBytes();
            long j = sPreviousBytes;
            long j2 = totalRxBytes - j;
            if (j >= 0) {
                synchronized (this) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    this.mConnectionClassManager.mo51313a(j2, elapsedRealtime - this.mLastTimeReading);
                    this.mLastTimeReading = elapsedRealtime;
                }
            }
            sPreviousBytes = totalRxBytes;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void startSampling() {
        try {
            if (!this.mInvalid && this.mSamplingCounter.getAndIncrement() == 0) {
                if (Logger.debug()) {
                    Logger.m15167d("ConnectionClassManager", "startSampling");
                }
                this.mHandler.mo51309a();
                this.mLastTimeReading = SystemClock.elapsedRealtime();
            }
        } catch (Throwable unused) {
        }
    }

    public void stopSampling() {
        try {
            if (!this.mInvalid && this.mSamplingCounter.decrementAndGet() == 0) {
                if (Logger.debug()) {
                    Logger.m15167d("ConnectionClassManager", "stopSampling");
                }
                this.mHandler.mo51310b();
                addFinalSample();
            }
        } catch (Throwable unused) {
        }
    }

    protected DeviceBandwidthSampler(C13949b bVar) {
        this.mConnectionClassManager = bVar;
        try {
            this.mSamplingCounter = new AtomicInteger();
            HandlerThread newHandlerThread = PlatformHandlerThread.getNewHandlerThread("ParseThread");
            this.mThread = newHandlerThread;
            newHandlerThread.start();
            this.mHandler = new HandlerC13945b(this.mThread.getLooper());
        } catch (Throwable unused) {
            this.mInvalid = true;
        }
    }
}
