package com.ss.ttm.player;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.google.firebase.messaging.Constants;
import com.ss.ttm.utils.Util;

public final class VsyncTimeHelper {
    private final DefaultDisplayListener displayListener;
    private long vsyncDurationNs;
    private final UIVSyncSampler vsyncSampler;
    private final WindowManager windowManager;

    /* access modifiers changed from: private */
    public static final class UIVSyncSampler implements Handler.Callback, Choreographer.FrameCallback {
        public static final UIVSyncSampler INSTANCE = new UIVSyncSampler();
        private Bundle bundle;
        public Choreographer choreographer;
        private final HandlerThread choreographerOwnerThread;
        public int currentUIFps;
        private final Handler handler;
        public volatile long lastSampledVsyncTimeNs = -9223372036854775807L;
        public int lowestUIFps;
        private final Handler mainHandler;
        public int observerCount;
        public volatile long sampledVsyncTimeNs = -9223372036854775807L;
        public volatile int skipedFrameCount;
        private long uiVsyncDurationNs;
        private long vsyncSampleCount;

        public static HandlerThread new_android_os_HandlerThread_by_knot(String str) {
            return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
        }

        public static UIVSyncSampler getInstance() {
            return INSTANCE;
        }

        public void addObserver() {
            this.handler.sendEmptyMessage(0);
        }

        public void removeObserver() {
            this.handler.sendEmptyMessage(1);
        }

        private void addObserverInternal() {
            Choreographer choreographer2;
            int i = this.observerCount + 1;
            this.observerCount = i;
            if (i == 1 && (choreographer2 = this.choreographer) != null) {
                choreographer2.postFrameCallback(this);
            }
        }

        private UIVSyncSampler() {
            HandlerThread new_android_os_HandlerThread_by_knot = new_android_os_HandlerThread_by_knot("Vsync:Handler");
            this.choreographerOwnerThread = new_android_os_HandlerThread_by_knot;
            new_android_os_HandlerThread_by_knot.start();
            this.handler = new Handler(new_android_os_HandlerThread_by_knot.getLooper(), this);
            this.bundle = new Bundle();
            Handler handler2 = new Handler(Looper.getMainLooper());
            this.mainHandler = handler2;
            handler2.post(new Runnable() {
                /* class com.ss.ttm.player.VsyncTimeHelper.UIVSyncSampler.RunnableC654201 */

                public void run() {
                    UIVSyncSampler.this.choreographer = Choreographer.getInstance();
                    if (UIVSyncSampler.this.observerCount > 0) {
                        UIVSyncSampler.this.choreographer.postFrameCallback(UIVSyncSampler.INSTANCE);
                    }
                }
            });
        }

        private void removeObserverInternal() {
            Choreographer choreographer2;
            int i = this.observerCount - 1;
            this.observerCount = i;
            if (i == 0 && (choreographer2 = this.choreographer) != null) {
                choreographer2.removeFrameCallback(this);
                this.sampledVsyncTimeNs = -9223372036854775807L;
                this.lastSampledVsyncTimeNs = -9223372036854775807L;
                this.skipedFrameCount = 0;
                this.currentUIFps = 0;
                this.lowestUIFps = 0;
                this.vsyncSampleCount = 0;
            }
        }

        private void updateUIVsyncDurationNs(long j) {
            this.uiVsyncDurationNs = j;
        }

        public void doFrame(long j) {
            Message obtainMessage = this.handler.obtainMessage(2);
            this.bundle.putLong("time", j);
            obtainMessage.setData(this.bundle);
            obtainMessage.sendToTarget();
            this.choreographer.postFrameCallback(this);
        }

        public void updateVsyncDuration(long j) {
            this.bundle.putLong("vsync", j);
            Message obtainMessage = this.handler.obtainMessage(4);
            obtainMessage.setData(this.bundle);
            obtainMessage.sendToTarget();
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                addObserverInternal();
                return true;
            } else if (i == 1) {
                removeObserverInternal();
                return true;
            } else if (i == 2) {
                recordUIFps(message.getData().getLong("time"));
                return true;
            } else if (i != 4) {
                return false;
            } else {
                updateUIVsyncDurationNs(message.getData().getLong("vsync"));
                return true;
            }
        }

        private void recordUIFps(long j) {
            int i;
            if (this.uiVsyncDurationNs != 0) {
                this.vsyncSampleCount++;
                this.sampledVsyncTimeNs = j;
                if (this.lastSampledVsyncTimeNs == -9223372036854775807L) {
                    this.lastSampledVsyncTimeNs = this.sampledVsyncTimeNs;
                    return;
                }
                long j2 = this.sampledVsyncTimeNs - this.lastSampledVsyncTimeNs;
                if (j2 <= 0) {
                    this.lastSampledVsyncTimeNs = -9223372036854775807L;
                    return;
                }
                long j3 = this.uiVsyncDurationNs;
                if (j2 - j3 > 0) {
                    i = Math.round(((float) (j2 - j3)) / ((float) j3));
                } else {
                    i = 0;
                }
                this.skipedFrameCount += i;
                int i2 = (int) (1000000000 / j2);
                this.currentUIFps = i2;
                int i3 = this.lowestUIFps;
                if (i3 != 0) {
                    i2 = Math.min(i3, i2);
                }
                this.lowestUIFps = i2;
                this.lastSampledVsyncTimeNs = this.sampledVsyncTimeNs;
            }
        }
    }

    public long getVsyncDurationNs() {
        return this.vsyncDurationNs;
    }

    /* access modifiers changed from: private */
    public final class DefaultDisplayListener implements DisplayManager.DisplayListener {
        private final DisplayManager displayManager;

        public void onDisplayAdded(int i) {
        }

        public void onDisplayRemoved(int i) {
        }

        public void register() {
            this.displayManager.registerDisplayListener(this, null);
        }

        public void unregister() {
            this.displayManager.unregisterDisplayListener(this);
        }

        public void onDisplayChanged(int i) {
            if (i == 0) {
                VsyncTimeHelper.this.updateDefaultDisplayRefreshRateParams();
            }
        }

        public DefaultDisplayListener(DisplayManager displayManager2) {
            this.displayManager = displayManager2;
        }
    }

    public int getLowestUIFps() {
        return this.vsyncSampler.lowestUIFps;
    }

    public int getUIFps() {
        return this.vsyncSampler.currentUIFps;
    }

    public void disable() {
        if (this.windowManager != null) {
            DefaultDisplayListener defaultDisplayListener = this.displayListener;
            if (defaultDisplayListener != null) {
                defaultDisplayListener.unregister();
            }
            this.vsyncSampler.removeObserver();
        }
    }

    public void enable() {
        if (this.windowManager != null) {
            this.vsyncSampler.addObserver();
            DefaultDisplayListener defaultDisplayListener = this.displayListener;
            if (defaultDisplayListener != null) {
                defaultDisplayListener.register();
            }
            updateDefaultDisplayRefreshRateParams();
        }
    }

    public void updateDefaultDisplayRefreshRateParams() {
        Display defaultDisplay = this.windowManager.getDefaultDisplay();
        if (defaultDisplay != null) {
            this.vsyncDurationNs = (long) (1.0E9d / ((double) defaultDisplay.getRefreshRate()));
        } else {
            this.vsyncDurationNs = 62500000;
        }
        this.vsyncSampler.updateVsyncDuration(this.vsyncDurationNs);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public VsyncTimeHelper(com.ss.ttm.player.TTPlayer r1) {
        /*
            r0 = this;
            if (r1 == 0) goto L_0x0007
            android.content.Context r1 = r1.getContext()
            goto L_0x0008
        L_0x0007:
            r1 = 0
        L_0x0008:
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.VsyncTimeHelper.<init>(com.ss.ttm.player.TTPlayer):void");
    }

    private DefaultDisplayListener maybeBuildDefaultDisplayListenerV17(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
        if (displayManager == null) {
            return null;
        }
        return new DefaultDisplayListener(displayManager);
    }

    public VsyncTimeHelper(Context context) {
        DefaultDisplayListener defaultDisplayListener = null;
        if (context != null) {
            context = context.getApplicationContext();
            this.windowManager = (WindowManager) context.getSystemService("window");
        } else {
            this.windowManager = null;
        }
        if (this.windowManager != null) {
            this.displayListener = Util.SDK_INT >= 17 ? maybeBuildDefaultDisplayListenerV17(context) : defaultDisplayListener;
            this.vsyncSampler = UIVSyncSampler.getInstance();
        } else {
            this.displayListener = null;
            this.vsyncSampler = null;
        }
        this.vsyncDurationNs = -9223372036854775807L;
    }
}
