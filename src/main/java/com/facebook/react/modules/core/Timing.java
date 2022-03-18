package com.facebook.react.modules.core;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.common.C21111c;
import com.facebook.react.devsupport.p961a.AbstractC21121b;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.C21178a;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.p957b.AbstractC21062c;
import com.facebook.react.p957b.C21058b;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicBoolean;

@ReactModule(name = "Timing")
public final class Timing extends ReactContextBaseJavaModule implements AbstractC21062c, LifecycleEventListener {
    public final AtomicBoolean isPaused = new AtomicBoolean(true);
    public final AtomicBoolean isRunningTasks = new AtomicBoolean(false);
    public RunnableC21173a mCurrentIdleCallbackRunnable;
    private final AbstractC21121b mDevSupportManager;
    private boolean mFrameCallbackPosted = false;
    private boolean mFrameIdleCallbackPosted = false;
    public final Object mIdleCallbackGuard = new Object();
    private final C21174b mIdleFrameCallback = new C21174b();
    public final ReactChoreographer mReactChoreographer;
    public boolean mSendIdleEvents = false;
    private final C21176d mTimerFrameCallback = new C21176d();
    public final Object mTimerGuard = new Object();
    private HandlerC21177e mTimerHandler = new HandlerC21177e(Looper.getMainLooper());
    public final SparseArray<C21175c> mTimerIdsToTimers;
    public final PriorityQueue<C21175c> mTimers;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "Timing";
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.isPaused.set(true);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.isPaused.set(false);
    }

    private void maybeSetChoreographerIdleCallback() {
        synchronized (this.mIdleCallbackGuard) {
            if (this.mSendIdleEvents) {
                setChoreographerIdleCallback();
            }
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        C21058b.m76703a(getReactApplicationContext()).mo71422b(this);
    }

    private void clearChoreographerIdleCallback() {
        if (this.mFrameIdleCallbackPosted) {
            this.mReactChoreographer.mo71958b(ReactChoreographer.CallbackType.IDLE_EVENT, this.mIdleFrameCallback);
            this.mFrameIdleCallbackPosted = false;
        }
    }

    private void maybeIdleCallback() {
        if (this.isPaused.get() && !this.isRunningTasks.get()) {
            clearFrameCallback();
        }
    }

    private void setChoreographerCallback() {
        if (!this.mFrameCallbackPosted) {
            this.mReactChoreographer.mo71956a(ReactChoreographer.CallbackType.TIMERS_EVENTS, this.mTimerFrameCallback);
            this.mFrameCallbackPosted = true;
        }
    }

    private void setChoreographerIdleCallback() {
        if (!this.mFrameIdleCallbackPosted) {
            this.mReactChoreographer.mo71956a(ReactChoreographer.CallbackType.IDLE_EVENT, this.mIdleFrameCallback);
            this.mFrameIdleCallbackPosted = true;
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        getReactApplicationContext().addLifecycleEventListener(this);
        C21058b.m76703a(getReactApplicationContext()).mo71418a(this);
    }

    private void clearFrameCallback() {
        C21058b a = C21058b.m76703a(getReactApplicationContext());
        if (this.mFrameCallbackPosted && this.isPaused.get() && !a.mo71419a()) {
            this.mReactChoreographer.mo71958b(ReactChoreographer.CallbackType.TIMERS_EVENTS, this.mTimerFrameCallback);
            this.mFrameCallbackPosted = false;
        }
    }

    /* renamed from: com.facebook.react.modules.core.Timing$a */
    private class RunnableC21173a implements Runnable {

        /* renamed from: b */
        private volatile boolean f51637b;

        /* renamed from: c */
        private final long f51638c;

        /* renamed from: a */
        public void mo71970a() {
            this.f51637b = true;
        }

        public void run() {
            boolean z;
            if (!this.f51637b) {
                long c = C21111c.m76735c() - (this.f51638c / 1000000);
                long a = C21111c.m76733a() - c;
                if (16.666666f - ((float) c) >= 1.0f) {
                    synchronized (Timing.this.mIdleCallbackGuard) {
                        z = Timing.this.mSendIdleEvents;
                    }
                    if (z) {
                        ((JSTimers) Timing.this.getReactApplicationContext().getJSModule(JSTimers.class)).callIdleCallbacks((double) a);
                    }
                    Timing.this.mCurrentIdleCallbackRunnable = null;
                }
            }
        }

        public RunnableC21173a(long j) {
            this.f51638c = j;
        }
    }

    /* renamed from: com.facebook.react.modules.core.Timing$e */
    public class HandlerC21177e extends Handler {
        /* renamed from: b */
        public void mo71973b(C21175c cVar) {
            removeCallbacksAndMessages(cVar);
        }

        /* renamed from: a */
        public void mo71972a(C21175c cVar) {
            Message obtainMessage = obtainMessage();
            obtainMessage.obj = cVar;
            if (cVar.f51641b) {
                obtainMessage.what = 3;
            } else {
                obtainMessage.what = 2;
            }
            sendMessageAtTime(obtainMessage, cVar.f51643d);
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            C21175c cVar = (C21175c) message.obj;
            WritableArray createArray = Arguments.createArray();
            createArray.pushInt(cVar.f51640a);
            ((JSTimers) Timing.this.getReactApplicationContext().getJSModule(JSTimers.class)).callTimers(createArray);
            if (message.what == 3) {
                sendMessageDelayed(Message.obtain(message), (long) cVar.f51642c);
            }
        }

        public HandlerC21177e(Looper looper) {
            super(looper);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.facebook.react.modules.core.Timing$b */
    public class C21174b extends C21178a.AbstractC21179a {
        private C21174b() {
        }

        @Override // com.facebook.react.modules.core.C21178a.AbstractC21179a
        /* renamed from: a */
        public void mo71964a(long j) {
            if (!Timing.this.isPaused.get() || Timing.this.isRunningTasks.get()) {
                if (Timing.this.mCurrentIdleCallbackRunnable != null) {
                    Timing.this.mCurrentIdleCallbackRunnable.mo71970a();
                }
                Timing timing = Timing.this;
                timing.mCurrentIdleCallbackRunnable = new RunnableC21173a(j);
                Timing.this.getReactApplicationContext().runOnJSQueueThread(Timing.this.mCurrentIdleCallbackRunnable);
                Timing.this.mReactChoreographer.mo71956a(ReactChoreographer.CallbackType.IDLE_EVENT, this);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.facebook.react.modules.core.Timing$d */
    public class C21176d extends C21178a.AbstractC21179a {

        /* renamed from: b */
        private WritableArray f51645b;

        private C21176d() {
        }

        @Override // com.facebook.react.modules.core.C21178a.AbstractC21179a
        /* renamed from: a */
        public void mo71964a(long j) {
            if (!Timing.this.isPaused.get() || Timing.this.isRunningTasks.get()) {
                long j2 = j / 1000000;
                synchronized (Timing.this.mTimerGuard) {
                    while (!Timing.this.mTimers.isEmpty() && Timing.this.mTimers.peek().f51643d < j2) {
                        C21175c poll = Timing.this.mTimers.poll();
                        if (this.f51645b == null) {
                            this.f51645b = Arguments.createArray();
                        }
                        this.f51645b.pushInt(poll.f51640a);
                        if (poll.f51641b) {
                            poll.f51643d = ((long) poll.f51642c) + j2;
                            Timing.this.mTimers.add(poll);
                        } else {
                            Timing.this.mTimerIdsToTimers.remove(poll.f51640a);
                        }
                    }
                }
                if (this.f51645b != null) {
                    ((JSTimers) Timing.this.getReactApplicationContext().getJSModule(JSTimers.class)).callTimers(this.f51645b);
                    this.f51645b = null;
                }
                Timing.this.mReactChoreographer.mo71956a(ReactChoreographer.CallbackType.TIMERS_EVENTS, this);
            }
        }
    }

    @Override // com.facebook.react.p957b.AbstractC21062c
    public void onHeadlessJsTaskStart(int i) {
        this.isRunningTasks.getAndSet(true);
    }

    @Override // com.facebook.react.p957b.AbstractC21062c
    public void onHeadlessJsTaskFinish(int i) {
        if (!C21058b.m76703a(getReactApplicationContext()).mo71419a()) {
            this.isRunningTasks.set(false);
        }
    }

    @ReactMethod
    public void setSendIdleEvents(boolean z) {
        Log.e("zxz", "unsupport idle handler, setSendIdleEvents = " + z);
    }

    @ReactMethod
    public void deleteTimer(int i) {
        synchronized (this.mTimerGuard) {
            C21175c cVar = this.mTimerIdsToTimers.get(i);
            if (cVar != null) {
                this.mTimerIdsToTimers.remove(i);
                this.mTimers.remove(cVar);
                this.mTimerHandler.mo71973b(cVar);
            }
        }
    }

    public Timing(ReactApplicationContext reactApplicationContext, AbstractC21121b bVar) {
        super(reactApplicationContext);
        this.mDevSupportManager = bVar;
        this.mTimers = new PriorityQueue<>(11, new Comparator<C21175c>() {
            /* class com.facebook.react.modules.core.Timing.C211721 */

            /* renamed from: a */
            public int compare(C21175c cVar, C21175c cVar2) {
                int i = ((cVar.f51643d - cVar2.f51643d) > 0 ? 1 : ((cVar.f51643d - cVar2.f51643d) == 0 ? 0 : -1));
                if (i == 0) {
                    return 0;
                }
                if (i < 0) {
                    return -1;
                }
                return 1;
            }
        });
        this.mTimerIdsToTimers = new SparseArray<>();
        this.mReactChoreographer = ReactChoreographer.m76893b();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.facebook.react.modules.core.Timing$c */
    public static class C21175c {

        /* renamed from: a */
        public final int f51640a;

        /* renamed from: b */
        public final boolean f51641b;

        /* renamed from: c */
        public final int f51642c;

        /* renamed from: d */
        public long f51643d;

        private C21175c(int i, long j, int i2, boolean z) {
            this.f51640a = i;
            this.f51643d = j;
            this.f51642c = i2;
            this.f51641b = z;
        }
    }

    @ReactMethod
    public void createTimer(int i, int i2, double d, boolean z) {
        long a = C21111c.m76733a();
        long j = (long) d;
        if (this.mDevSupportManager.mo71811f() && Math.abs(j - a) > 60000) {
            ((JSTimers) getReactApplicationContext().getJSModule(JSTimers.class)).emitTimeDriftWarning("Debugger and device times have drifted by more than 60s. Please correct this by running adb shell \"date `date +%m%d%H%M%Y.%S`\" on your debugger machine.");
        }
        long max = Math.max(0L, (j - a) + ((long) i2));
        if (i2 != 0 || z) {
            C21175c cVar = new C21175c(i, (C21111c.m76734b() / 1000000) + max, i2, z);
            synchronized (this.mTimerGuard) {
                this.mTimers.add(cVar);
                this.mTimerIdsToTimers.put(i, cVar);
            }
            this.mTimerHandler.mo71972a(cVar);
            return;
        }
        WritableArray createArray = Arguments.createArray();
        createArray.pushInt(i);
        ((JSTimers) getReactApplicationContext().getJSModule(JSTimers.class)).callTimers(createArray);
    }
}
