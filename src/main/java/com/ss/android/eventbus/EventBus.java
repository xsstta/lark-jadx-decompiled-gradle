package com.ss.android.eventbus;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.ss.android.eventbus.collector.CollectorProvider;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class EventBus {
    private static ExecutorService DEFAULT_EXECUTOR_SERVICE;
    private final int CPU_NUM;
    private final int MIN_BACKGROUD_THREAD_NUM;
    private ExecutorService mExecutorService;
    private final Handler mMainHandler;
    private final Map<Object, Map<Class<? extends BaseEvent>, ListenerWithType>> mReceiver2ListenerMap;

    public static class SingleInstanceHolder {
        public static final EventBus sInstance = new EventBus();
    }

    /* access modifiers changed from: private */
    public static class ListenerWithType {
        BaseEventListener mBaseEventListener;
        Class<? extends BaseEvent> mClass;

        public BaseEventListener getBaseEventListener() {
            return this.mBaseEventListener;
        }

        public Class<? extends BaseEvent> getTypeClass() {
            return this.mClass;
        }

        public ListenerWithType(Class<? extends BaseEvent> cls, BaseEventListener baseEventListener) {
            this.mClass = cls;
            this.mBaseEventListener = baseEventListener;
        }
    }

    public static EventBus getDefault() {
        return SingleInstanceHolder.sInstance;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.eventbus.EventBus$3 */
    public static /* synthetic */ class C284513 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$android$eventbus$ThreadMode;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.ss.android.eventbus.ThreadMode[] r0 = com.ss.android.eventbus.ThreadMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.eventbus.EventBus.C284513.$SwitchMap$com$ss$android$eventbus$ThreadMode = r0
                com.ss.android.eventbus.ThreadMode r1 = com.ss.android.eventbus.ThreadMode.POSTING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.eventbus.EventBus.C284513.$SwitchMap$com$ss$android$eventbus$ThreadMode     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.eventbus.ThreadMode r1 = com.ss.android.eventbus.ThreadMode.MAIN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.eventbus.EventBus.C284513.$SwitchMap$com$ss$android$eventbus$ThreadMode     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.eventbus.ThreadMode r1 = com.ss.android.eventbus.ThreadMode.BACKGROUDN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.eventbus.EventBus.C284513.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public static class WeakRunnable implements Runnable {
        private BaseEvent mBaseEvent;
        private IEventListener mEventListener;
        private Handler mMainHandler;
        private WeakReference<Object> mReceiverWeakReference;

        public void run() {
            try {
                if (this.mReceiverWeakReference.get() != null) {
                    this.mEventListener.onEvent(this.mBaseEvent);
                }
            } catch (Throwable th) {
                Message message = new Message();
                message.obj = th;
                message.what = 1;
                this.mMainHandler.sendMessage(message);
            }
        }

        public WeakRunnable(Object obj, IEventListener iEventListener, BaseEvent baseEvent, Handler handler) {
            this.mReceiverWeakReference = new WeakReference<>(obj);
            this.mEventListener = iEventListener;
            this.mBaseEvent = baseEvent;
            this.mMainHandler = handler;
        }
    }

    private EventBus() {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        this.CPU_NUM = availableProcessors;
        this.MIN_BACKGROUD_THREAD_NUM = 3;
        this.mReceiver2ListenerMap = new ConcurrentHashMap();
        this.mMainHandler = new ExceptionHandler(Looper.getMainLooper());
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(Math.max(3, availableProcessors + 1), new ThreadFactory() {
            /* class com.ss.android.eventbus.EventBus.ThreadFactoryC284491 */
            AtomicInteger mThreadNumber = new AtomicInteger();

            public static Thread new_insert_after_java_lang_Thread_by_knot(Thread thread) {
                return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
            }

            public Thread newThread(Runnable runnable) {
                return new_insert_after_java_lang_Thread_by_knot(new Thread(runnable, "eventbus-" + this.mThreadNumber.incrementAndGet()));
            }
        });
        DEFAULT_EXECUTOR_SERVICE = newFixedThreadPool;
        this.mExecutorService = newFixedThreadPool;
    }

    private static class ExceptionHandler extends Handler {
        public ExceptionHandler(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1 && (message.obj instanceof Throwable)) {
                RuntimeException runtimeException = new RuntimeException();
                runtimeException.initCause((Throwable) message.obj);
                throw runtimeException;
            }
        }
    }

    public <T extends BaseEvent> void trigger(T t) {
        EventBusInternal.getDefault().trigger(t);
    }

    public void register(Object obj) {
        if (obj != null) {
            CollectorProvider.getDefaultCollector().register(obj);
        }
    }

    public void setExecutorService(ExecutorService executorService) {
        if (executorService != null) {
            ExecutorService executorService2 = this.mExecutorService;
            ExecutorService executorService3 = DEFAULT_EXECUTOR_SERVICE;
            if (executorService2 == executorService3) {
                executorService3.shutdown();
                DEFAULT_EXECUTOR_SERVICE = null;
            }
            this.mExecutorService = executorService;
        }
    }

    public void unregister(Object obj) {
        Map<Class<? extends BaseEvent>, ListenerWithType> map = this.mReceiver2ListenerMap.get(obj);
        if (map != null) {
            for (ListenerWithType listenerWithType : map.values()) {
                if (!(listenerWithType == null || listenerWithType.getTypeClass() == null || listenerWithType.getBaseEventListener() == null)) {
                    EventBusInternal.getDefault().unregister(listenerWithType.getTypeClass(), listenerWithType.getBaseEventListener());
                }
            }
        }
        this.mReceiver2ListenerMap.remove(obj);
    }

    private Runnable getMethodCallRunnable(Object obj, IEventListener iEventListener, BaseEvent baseEvent, Handler handler) {
        return new WeakRunnable(obj, iEventListener, baseEvent, handler);
    }

    public void invokeEventHandler(Object obj, IEventListener iEventListener, BaseEvent baseEvent, ThreadMode threadMode) {
        Runnable methodCallRunnable = getMethodCallRunnable(obj, iEventListener, baseEvent, this.mMainHandler);
        int i = C284513.$SwitchMap$com$ss$android$eventbus$ThreadMode[threadMode.ordinal()];
        if (i == 1) {
            methodCallRunnable.run();
        } else if (i == 2) {
            this.mMainHandler.post(methodCallRunnable);
        } else if (i == 3) {
            this.mExecutorService.execute(methodCallRunnable);
        }
    }

    public void register(final Object obj, Class<? extends BaseEvent> cls, final BaseEventListener baseEventListener, final ThreadMode threadMode) {
        if (cls != null) {
            Map<Class<? extends BaseEvent>, ListenerWithType> map = this.mReceiver2ListenerMap.get(obj);
            if (map == null) {
                map = new ConcurrentHashMap<>();
            }
            C284502 r1 = new BaseEventListener() {
                /* class com.ss.android.eventbus.EventBus.C284502 */

                @Override // com.ss.android.eventbus.IEventListener, com.ss.android.eventbus.BaseEventListener
                public void onEvent(BaseEvent baseEvent) {
                    EventBus.this.invokeEventHandler(obj, baseEventListener, baseEvent, threadMode);
                }
            };
            if (!map.containsKey(cls)) {
                EventBusInternal.getDefault().register(cls, r1);
                map.put(cls, new ListenerWithType(cls, r1));
                this.mReceiver2ListenerMap.put(obj, map);
                return;
            }
            throw new RuntimeException("同一个类里面，同种事件类型只能注册一个, 不要重复添加，类:" + obj.getClass() + "，事件: " + cls);
        }
    }
}
