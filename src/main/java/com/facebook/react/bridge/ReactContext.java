package com.facebook.react.bridge;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.facebook.infer.annotation.C21045a;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.common.LifecycleState;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class ReactContext extends ContextWrapper {
    private final CopyOnWriteArraySet<ActivityEventListener> mActivityEventListeners = new CopyOnWriteArraySet<>();
    private CatalystInstance mCatalystInstance;
    private WeakReference<Activity> mCurrentActivity;
    private NativeModuleCallExceptionHandler mExceptionHandlerWrapper;
    private LayoutInflater mInflater;
    private MessageQueueThread mJSMessageQueueThread;
    public final CopyOnWriteArraySet<LifecycleEventListener> mLifecycleEventListeners = new CopyOnWriteArraySet<>();
    private LifecycleState mLifecycleState = LifecycleState.BEFORE_CREATE;
    private NativeModuleCallExceptionHandler mNativeModuleCallExceptionHandler;
    private MessageQueueThread mNativeModulesMessageQueueThread;
    private MessageQueueThread mUiMessageQueueThread;
    private final CopyOnWriteArraySet<WindowFocusChangeListener> mWindowFocusEventListeners = new CopyOnWriteArraySet<>();

    public LifecycleState getLifecycleState() {
        return this.mLifecycleState;
    }

    public JavaScriptContextHolder getJavaScriptContextHolder() {
        return this.mCatalystInstance.getJavaScriptContextHolder();
    }

    public boolean hasCatalystInstance() {
        if (this.mCatalystInstance != null) {
            return true;
        }
        return false;
    }

    public void assertOnJSQueueThread() {
        ((MessageQueueThread) C21045a.m76676a(this.mJSMessageQueueThread)).assertIsOnThread();
    }

    public void assertOnNativeModulesQueueThread() {
        ((MessageQueueThread) C21045a.m76676a(this.mNativeModulesMessageQueueThread)).assertIsOnThread();
    }

    public void assertOnUiQueueThread() {
        ((MessageQueueThread) C21045a.m76676a(this.mUiMessageQueueThread)).assertIsOnThread();
    }

    public void destroy() {
        UiThreadUtil.assertOnUiThread();
        CatalystInstance catalystInstance = this.mCatalystInstance;
        if (catalystInstance != null) {
            catalystInstance.destroy();
        }
    }

    public CatalystInstance getCatalystInstance() {
        return (CatalystInstance) C21045a.m76676a(this.mCatalystInstance);
    }

    public Activity getCurrentActivity() {
        WeakReference<Activity> weakReference = this.mCurrentActivity;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public NativeModuleCallExceptionHandler getExceptionHandler() {
        if (this.mExceptionHandlerWrapper == null) {
            this.mExceptionHandlerWrapper = new ExceptionHandlerWrapper();
        }
        return this.mExceptionHandlerWrapper;
    }

    public boolean hasActiveCatalystInstance() {
        CatalystInstance catalystInstance = this.mCatalystInstance;
        if (catalystInstance == null || catalystInstance.isDestroyed()) {
            return false;
        }
        return true;
    }

    public boolean hasCurrentActivity() {
        WeakReference<Activity> weakReference = this.mCurrentActivity;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        return true;
    }

    public boolean isOnJSQueueThread() {
        return ((MessageQueueThread) C21045a.m76676a(this.mJSMessageQueueThread)).isOnThread();
    }

    public boolean isOnNativeModulesQueueThread() {
        return ((MessageQueueThread) C21045a.m76676a(this.mNativeModulesMessageQueueThread)).isOnThread();
    }

    public boolean isOnUiQueueThread() {
        return ((MessageQueueThread) C21045a.m76676a(this.mUiMessageQueueThread)).isOnThread();
    }

    public void resetPerfStats() {
        MessageQueueThread messageQueueThread = this.mNativeModulesMessageQueueThread;
        if (messageQueueThread != null) {
            messageQueueThread.resetPerfStats();
        }
        MessageQueueThread messageQueueThread2 = this.mJSMessageQueueThread;
        if (messageQueueThread2 != null) {
            messageQueueThread2.resetPerfStats();
        }
    }

    /* renamed from: com.facebook.react.bridge.ReactContext$2 */
    static /* synthetic */ class C210942 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$common$LifecycleState;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.facebook.react.common.LifecycleState[] r0 = com.facebook.react.common.LifecycleState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.facebook.react.bridge.ReactContext.C210942.$SwitchMap$com$facebook$react$common$LifecycleState = r0
                com.facebook.react.common.LifecycleState r1 = com.facebook.react.common.LifecycleState.BEFORE_CREATE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.facebook.react.bridge.ReactContext.C210942.$SwitchMap$com$facebook$react$common$LifecycleState     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.react.common.LifecycleState r1 = com.facebook.react.common.LifecycleState.BEFORE_RESUME     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.facebook.react.bridge.ReactContext.C210942.$SwitchMap$com$facebook$react$common$LifecycleState     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.react.common.LifecycleState r1 = com.facebook.react.common.LifecycleState.RESUMED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.bridge.ReactContext.C210942.<clinit>():void");
        }
    }

    public void onHostDestroy() {
        UiThreadUtil.assertOnUiThread();
        this.mLifecycleState = LifecycleState.BEFORE_CREATE;
        Iterator<LifecycleEventListener> it = this.mLifecycleEventListeners.iterator();
        while (it.hasNext()) {
            try {
                it.next().onHostDestroy();
            } catch (RuntimeException e) {
                handleException(e);
            }
        }
        this.mCurrentActivity = null;
    }

    public void onHostPause() {
        this.mLifecycleState = LifecycleState.BEFORE_RESUME;
        ReactMarker.logMarker(ReactMarkerConstants.ON_HOST_PAUSE_START);
        Iterator<LifecycleEventListener> it = this.mLifecycleEventListeners.iterator();
        while (it.hasNext()) {
            try {
                it.next().onHostPause();
            } catch (RuntimeException e) {
                handleException(e);
            }
        }
        ReactMarker.logMarker(ReactMarkerConstants.ON_HOST_PAUSE_END);
    }

    public void setNativeModuleCallExceptionHandler(NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler) {
        this.mNativeModuleCallExceptionHandler = nativeModuleCallExceptionHandler;
    }

    public class ExceptionHandlerWrapper implements NativeModuleCallExceptionHandler {
        public ExceptionHandlerWrapper() {
        }

        @Override // com.facebook.react.bridge.NativeModuleCallExceptionHandler
        public void handleException(Exception exc) {
            ReactContext.this.handleException(exc);
        }
    }

    public void addActivityEventListener(ActivityEventListener activityEventListener) {
        this.mActivityEventListeners.add(activityEventListener);
    }

    public void addWindowFocusChangeListener(WindowFocusChangeListener windowFocusChangeListener) {
        this.mWindowFocusEventListeners.add(windowFocusChangeListener);
    }

    public void removeActivityEventListener(ActivityEventListener activityEventListener) {
        this.mActivityEventListeners.remove(activityEventListener);
    }

    public void removeLifecycleEventListener(LifecycleEventListener lifecycleEventListener) {
        this.mLifecycleEventListeners.remove(lifecycleEventListener);
    }

    public void removeWindowFocusChangeListener(WindowFocusChangeListener windowFocusChangeListener) {
        this.mWindowFocusEventListeners.remove(windowFocusChangeListener);
    }

    public void runOnJSQueueThread(Runnable runnable) {
        ((MessageQueueThread) C21045a.m76676a(this.mJSMessageQueueThread)).runOnQueue(runnable);
    }

    public void runOnNativeModulesQueueThread(Runnable runnable) {
        ((MessageQueueThread) C21045a.m76676a(this.mNativeModulesMessageQueueThread)).runOnQueue(runnable);
    }

    public void runOnUiQueueThread(Runnable runnable) {
        ((MessageQueueThread) C21045a.m76676a(this.mUiMessageQueueThread)).runOnQueue(runnable);
    }

    public ReactContext(Context context) {
        super(context);
    }

    public void assertOnNativeModulesQueueThread(String str) {
        ((MessageQueueThread) C21045a.m76676a(this.mNativeModulesMessageQueueThread)).assertIsOnThread(str);
    }

    public <T extends JavaScriptModule> T getJSModule(Class<T> cls) {
        CatalystInstance catalystInstance = this.mCatalystInstance;
        if (catalystInstance != null) {
            return (T) catalystInstance.getJSModule(cls);
        }
        throw new RuntimeException("Tried to access a JS module before the React instance was fully set up. Calls to ReactContext#getJSModule should only happen once initialize() has been called on your native module.");
    }

    public <T extends NativeModule> T getNativeModule(Class<T> cls) {
        CatalystInstance catalystInstance = this.mCatalystInstance;
        if (catalystInstance != null) {
            return (T) catalystInstance.getNativeModule(cls);
        }
        throw new RuntimeException("Trying to call native module before CatalystInstance has been set!");
    }

    public void handleException(Exception exc) {
        NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler;
        CatalystInstance catalystInstance = this.mCatalystInstance;
        if (catalystInstance == null || catalystInstance.isDestroyed() || (nativeModuleCallExceptionHandler = this.mNativeModuleCallExceptionHandler) == null) {
            throw new RuntimeException(exc);
        }
        nativeModuleCallExceptionHandler.handleException(exc);
    }

    public <T extends NativeModule> boolean hasNativeModule(Class<T> cls) {
        CatalystInstance catalystInstance = this.mCatalystInstance;
        if (catalystInstance != null) {
            return catalystInstance.hasNativeModule(cls);
        }
        throw new RuntimeException("Trying to call native module before CatalystInstance has been set!");
    }

    public void initializeWithInstance(CatalystInstance catalystInstance) {
        if (catalystInstance == null) {
            throw new IllegalArgumentException("CatalystInstance cannot be null.");
        } else if (this.mCatalystInstance == null) {
            this.mCatalystInstance = catalystInstance;
            initializeMessageQueueThreads(catalystInstance.getReactQueueConfiguration());
        } else {
            throw new IllegalStateException("ReactContext has been already initialized");
        }
    }

    public void onWindowFocusChange(boolean z) {
        UiThreadUtil.assertOnUiThread();
        Iterator<WindowFocusChangeListener> it = this.mWindowFocusEventListeners.iterator();
        while (it.hasNext()) {
            try {
                it.next().onWindowFocusChange(z);
            } catch (RuntimeException e) {
                handleException(e);
            }
        }
    }

    public void addLifecycleEventListener(final LifecycleEventListener lifecycleEventListener) {
        int i;
        this.mLifecycleEventListeners.add(lifecycleEventListener);
        if (hasActiveCatalystInstance() && (i = C210942.$SwitchMap$com$facebook$react$common$LifecycleState[this.mLifecycleState.ordinal()]) != 1 && i != 2) {
            if (i == 3) {
                runOnUiQueueThread(new Runnable() {
                    /* class com.facebook.react.bridge.ReactContext.RunnableC210931 */

                    public void run() {
                        if (ReactContext.this.mLifecycleEventListeners.contains(lifecycleEventListener)) {
                            try {
                                lifecycleEventListener.onHostResume();
                            } catch (RuntimeException e) {
                                ReactContext.this.handleException(e);
                            }
                        }
                    }
                });
                return;
            }
            throw new RuntimeException("Unhandled lifecycle state.");
        }
    }

    @Override // android.content.Context, android.content.ContextWrapper
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.mInflater == null) {
            this.mInflater = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.mInflater;
    }

    public void initializeMessageQueueThreads(ReactQueueConfiguration reactQueueConfiguration) {
        if (this.mUiMessageQueueThread == null && this.mNativeModulesMessageQueueThread == null && this.mJSMessageQueueThread == null) {
            this.mUiMessageQueueThread = reactQueueConfiguration.getUIQueueThread();
            this.mNativeModulesMessageQueueThread = reactQueueConfiguration.getNativeModulesQueueThread();
            this.mJSMessageQueueThread = reactQueueConfiguration.getJSQueueThread();
            return;
        }
        throw new IllegalStateException("Message queue threads already initialized");
    }

    public void onHostResume(Activity activity) {
        this.mLifecycleState = LifecycleState.RESUMED;
        this.mCurrentActivity = new WeakReference<>(activity);
        ReactMarker.logMarker(ReactMarkerConstants.ON_HOST_RESUME_START);
        Iterator<LifecycleEventListener> it = this.mLifecycleEventListeners.iterator();
        while (it.hasNext()) {
            try {
                it.next().onHostResume();
            } catch (RuntimeException e) {
                handleException(e);
            }
        }
        ReactMarker.logMarker(ReactMarkerConstants.ON_HOST_RESUME_END);
    }

    public void onNewIntent(Activity activity, Intent intent) {
        UiThreadUtil.assertOnUiThread();
        this.mCurrentActivity = new WeakReference<>(activity);
        Iterator<ActivityEventListener> it = this.mActivityEventListeners.iterator();
        while (it.hasNext()) {
            try {
                it.next().onNewIntent(intent);
            } catch (RuntimeException e) {
                handleException(e);
            }
        }
    }

    public boolean startActivityForResult(Intent intent, int i, Bundle bundle) {
        Activity currentActivity = getCurrentActivity();
        C21045a.m76676a(currentActivity);
        currentActivity.startActivityForResult(intent, i, bundle);
        return true;
    }

    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        Iterator<ActivityEventListener> it = this.mActivityEventListeners.iterator();
        while (it.hasNext()) {
            try {
                it.next().onActivityResult(activity, i, i2, intent);
            } catch (RuntimeException e) {
                handleException(e);
            }
        }
    }
}
