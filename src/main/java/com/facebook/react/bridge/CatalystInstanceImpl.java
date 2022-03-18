package com.facebook.react.bridge;

import android.content.res.AssetManager;
import android.os.AsyncTask;
import android.util.Log;
import com.facebook.common.logging.FLog;
import com.facebook.infer.annotation.C21045a;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.bridge.queue.QueueThreadExceptionHandler;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.bridge.queue.ReactQueueConfigurationImpl;
import com.facebook.react.bridge.queue.ReactQueueConfigurationSpec;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.p956a.C21054a;
import com.facebook.react.turbomodule.core.JSCallInvokerHolderImpl;
import com.facebook.react.turbomodule.core.interfaces.AbstractC21268a;
import com.facebook.react.turbomodule.core.interfaces.TurboModuleRegistry;
import com.facebook.systrace.Systrace;
import com.facebook.systrace.TraceListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class CatalystInstanceImpl implements CatalystInstance {
    private static final AtomicInteger sNextInstanceIdForTrace = new AtomicInteger(1);
    private volatile boolean mAcceptCalls;
    public final CopyOnWriteArrayList<NotThreadSafeBridgeIdleDebugListener> mBridgeIdleListeners;
    private volatile boolean mDestroyed;
    public final HybridData mHybridData;
    private boolean mInitialized;
    private boolean mJSBundleHasLoaded;
    private final JSBundleLoader mJSBundleLoader;
    private final ArrayList<PendingJSCall> mJSCallsPendingInit;
    private final Object mJSCallsPendingInitLock;
    public final JSIModuleRegistry mJSIModuleRegistry;
    private final JavaScriptModuleRegistry mJSModuleRegistry;
    public JavaScriptContextHolder mJavaScriptContextHolder;
    private final String mJsPendingCallsTitleForTrace;
    private final NativeModuleCallExceptionHandler mNativeModuleCallExceptionHandler;
    public final NativeModuleRegistry mNativeModuleRegistry;
    private final MessageQueueThread mNativeModulesQueueThread;
    public final AtomicInteger mPendingJSCalls;
    private final ReactQueueConfigurationImpl mReactQueueConfiguration;
    private String mSourceURL;
    private final TraceListener mTraceListener;
    private TurboModuleRegistry mTurboModuleRegistry;

    private native long getJavaScriptContext();

    private static native HybridData initHybrid();

    private native void initializeBridge(ReactCallback reactCallback, JavaScriptExecutor javaScriptExecutor, MessageQueueThread messageQueueThread, MessageQueueThread messageQueueThread2, Collection<JavaModuleWrapper> collection, Collection<ModuleHolder> collection2);

    private native void jniCallJSCallback(int i, NativeArray nativeArray);

    private native void jniExtendNativeModules(Collection<JavaModuleWrapper> collection, Collection<ModuleHolder> collection2);

    private native void jniHandleMemoryPressure(int i);

    private native void jniLoadScriptFromAssets(AssetManager assetManager, String str, boolean z);

    private native void jniLoadScriptFromDeltaBundle(String str, NativeDeltaClient nativeDeltaClient, boolean z);

    private native void jniLoadScriptFromFile(String str, String str2, boolean z);

    private native void jniRegisterSegment(int i, String str);

    private native void jniSetSourceURL(String str);

    @Override // com.facebook.react.bridge.CatalystInstance
    public native JSCallInvokerHolderImpl getJSCallInvokerHolder();

    public native void jniCallJSFunction(String str, String str2, NativeArray nativeArray);

    @Override // com.facebook.react.bridge.CatalystInstance
    public native void setGlobalVariable(String str, String str2);

    @Override // com.facebook.react.bridge.CatalystInstance
    public JavaScriptContextHolder getJavaScriptContextHolder() {
        return this.mJavaScriptContextHolder;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public ReactQueueConfiguration getReactQueueConfiguration() {
        return this.mReactQueueConfiguration;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public String getSourceURL() {
        return this.mSourceURL;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public boolean isDestroyed() {
        return this.mDestroyed;
    }

    private static class BridgeCallback implements ReactCallback {
        private final WeakReference<CatalystInstanceImpl> mOuter;

        @Override // com.facebook.react.bridge.ReactCallback
        public void decrementPendingJSCalls() {
            CatalystInstanceImpl catalystInstanceImpl = this.mOuter.get();
            if (catalystInstanceImpl != null) {
                catalystInstanceImpl.decrementPendingJSCalls();
            }
        }

        @Override // com.facebook.react.bridge.ReactCallback
        public void incrementPendingJSCalls() {
            CatalystInstanceImpl catalystInstanceImpl = this.mOuter.get();
            if (catalystInstanceImpl != null) {
                catalystInstanceImpl.incrementPendingJSCalls();
            }
        }

        @Override // com.facebook.react.bridge.ReactCallback
        public void onBatchComplete() {
            CatalystInstanceImpl catalystInstanceImpl = this.mOuter.get();
            if (catalystInstanceImpl != null) {
                catalystInstanceImpl.mNativeModuleRegistry.onBatchComplete();
            }
        }

        BridgeCallback(CatalystInstanceImpl catalystInstanceImpl) {
            this.mOuter = new WeakReference<>(catalystInstanceImpl);
        }
    }

    static {
        ReactBridge.staticInit();
    }

    private static class JSProfilerTraceListener implements TraceListener {
        private final WeakReference<CatalystInstanceImpl> mOuter;

        public void onTraceStarted() {
            CatalystInstanceImpl catalystInstanceImpl = this.mOuter.get();
            if (catalystInstanceImpl != null) {
                ((Systrace) catalystInstanceImpl.getJSModule(Systrace.class)).setEnabled(true);
            }
        }

        public void onTraceStopped() {
            CatalystInstanceImpl catalystInstanceImpl = this.mOuter.get();
            if (catalystInstanceImpl != null) {
                ((Systrace) catalystInstanceImpl.getJSModule(Systrace.class)).setEnabled(false);
            }
        }

        public JSProfilerTraceListener(CatalystInstanceImpl catalystInstanceImpl) {
            this.mOuter = new WeakReference<>(catalystInstanceImpl);
        }
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public boolean hasRunJSBundle() {
        boolean z;
        synchronized (this.mJSCallsPendingInitLock) {
            if (!this.mJSBundleHasLoaded || !this.mAcceptCalls) {
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }

    public static class Builder {
        private JSBundleLoader mJSBundleLoader;
        private JavaScriptExecutor mJSExecutor;
        private NativeModuleCallExceptionHandler mNativeModuleCallExceptionHandler;
        private ReactQueueConfigurationSpec mReactQueueConfigurationSpec;
        private NativeModuleRegistry mRegistry;

        public CatalystInstanceImpl build() {
            return new CatalystInstanceImpl((ReactQueueConfigurationSpec) C21045a.m76676a(this.mReactQueueConfigurationSpec), (JavaScriptExecutor) C21045a.m76676a(this.mJSExecutor), (NativeModuleRegistry) C21045a.m76676a(this.mRegistry), (JSBundleLoader) C21045a.m76676a(this.mJSBundleLoader), (NativeModuleCallExceptionHandler) C21045a.m76676a(this.mNativeModuleCallExceptionHandler));
        }

        public Builder setJSBundleLoader(JSBundleLoader jSBundleLoader) {
            this.mJSBundleLoader = jSBundleLoader;
            return this;
        }

        public Builder setJSExecutor(JavaScriptExecutor javaScriptExecutor) {
            this.mJSExecutor = javaScriptExecutor;
            return this;
        }

        public Builder setNativeModuleCallExceptionHandler(NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler) {
            this.mNativeModuleCallExceptionHandler = nativeModuleCallExceptionHandler;
            return this;
        }

        public Builder setReactQueueConfigurationSpec(ReactQueueConfigurationSpec reactQueueConfigurationSpec) {
            this.mReactQueueConfigurationSpec = reactQueueConfigurationSpec;
            return this;
        }

        public Builder setRegistry(NativeModuleRegistry nativeModuleRegistry) {
            this.mRegistry = nativeModuleRegistry;
            return this;
        }
    }

    public static class PendingJSCall {
        public NativeArray mArguments;
        public String mMethod;
        public String mModule;

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append(this.mModule);
            sb.append(".");
            sb.append(this.mMethod);
            sb.append("(");
            NativeArray nativeArray = this.mArguments;
            if (nativeArray == null) {
                str = "";
            } else {
                str = nativeArray.toString();
            }
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        /* access modifiers changed from: package-private */
        public void call(CatalystInstanceImpl catalystInstanceImpl) {
            NativeArray nativeArray = this.mArguments;
            if (nativeArray == null) {
                nativeArray = new WritableNativeArray();
            }
            catalystInstanceImpl.jniCallJSFunction(this.mModule, this.mMethod, nativeArray);
        }

        public PendingJSCall(String str, String str2, NativeArray nativeArray) {
            this.mModule = str;
            this.mMethod = str2;
            this.mArguments = nativeArray;
        }
    }

    public void decrementPendingJSCalls() {
        boolean z;
        int decrementAndGet = this.mPendingJSCalls.decrementAndGet();
        if (decrementAndGet == 0) {
            z = true;
        } else {
            z = false;
        }
        Systrace.m77080a(0, this.mJsPendingCallsTitleForTrace, decrementAndGet);
        if (z && !this.mBridgeIdleListeners.isEmpty()) {
            this.mNativeModulesQueueThread.runOnQueue(new Runnable() {
                /* class com.facebook.react.bridge.CatalystInstanceImpl.RunnableC210724 */

                public void run() {
                    Iterator<NotThreadSafeBridgeIdleDebugListener> it = CatalystInstanceImpl.this.mBridgeIdleListeners.iterator();
                    while (it.hasNext()) {
                        it.next().onTransitionToBridgeIdle();
                    }
                }
            });
        }
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void destroy() {
        Log.d("ReactNative", "CatalystInstanceImpl.destroy() start");
        UiThreadUtil.assertOnUiThread();
        if (!this.mDestroyed) {
            ReactMarker.logMarker(ReactMarkerConstants.DESTROY_CATALYST_INSTANCE_START);
            this.mDestroyed = true;
            this.mNativeModulesQueueThread.runOnQueue(new Runnable() {
                /* class com.facebook.react.bridge.CatalystInstanceImpl.RunnableC210661 */

                public void run() {
                    final JSIModule jSIModule;
                    CatalystInstanceImpl.this.mNativeModuleRegistry.notifyJSInstanceDestroy();
                    CatalystInstanceImpl.this.mJSIModuleRegistry.notifyJSInstanceDestroy();
                    boolean z = false;
                    if (CatalystInstanceImpl.this.mPendingJSCalls.getAndSet(0) == 0) {
                        z = true;
                    }
                    if (!CatalystInstanceImpl.this.mBridgeIdleListeners.isEmpty()) {
                        Iterator<NotThreadSafeBridgeIdleDebugListener> it = CatalystInstanceImpl.this.mBridgeIdleListeners.iterator();
                        while (it.hasNext()) {
                            NotThreadSafeBridgeIdleDebugListener next = it.next();
                            if (!z) {
                                next.onTransitionToBridgeIdle();
                            }
                            next.onBridgeDestroyed();
                        }
                    }
                    if (C21054a.f51464a) {
                        jSIModule = CatalystInstanceImpl.this.mJSIModuleRegistry.getModule(JSIModuleType.TurboModuleManager);
                    } else {
                        jSIModule = null;
                    }
                    CatalystInstanceImpl.this.getReactQueueConfiguration().getJSQueueThread().runOnQueue(new Runnable() {
                        /* class com.facebook.react.bridge.CatalystInstanceImpl.RunnableC210661.RunnableC210671 */

                        public void run() {
                            JSIModule jSIModule = jSIModule;
                            if (jSIModule != null) {
                                jSIModule.onCatalystInstanceDestroy();
                            }
                            CatalystInstanceImpl.this.getReactQueueConfiguration().getUIQueueThread().runOnQueue(new Runnable() {
                                /* class com.facebook.react.bridge.CatalystInstanceImpl.RunnableC210661.RunnableC210671.RunnableC210681 */

                                public void run() {
                                    AsyncTask.execute(new Runnable() {
                                        /* class com.facebook.react.bridge.CatalystInstanceImpl.RunnableC210661.RunnableC210671.RunnableC210681.RunnableC210691 */

                                        public void run() {
                                            CatalystInstanceImpl.this.mJavaScriptContextHolder.clear();
                                            CatalystInstanceImpl.this.mHybridData.mo71397a();
                                            CatalystInstanceImpl.this.getReactQueueConfiguration().destroy();
                                            Log.d("ReactNative", "CatalystInstanceImpl.destroy() end");
                                            ReactMarker.logMarker(ReactMarkerConstants.DESTROY_CATALYST_INSTANCE_END);
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });
            Systrace.m77084b(this.mTraceListener);
        }
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public Collection<NativeModule> getNativeModules() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.mNativeModuleRegistry.getAllModules());
        TurboModuleRegistry turboModuleRegistry = this.mTurboModuleRegistry;
        if (turboModuleRegistry != null) {
            Iterator<AbstractC21268a> it = turboModuleRegistry.mo72143a().iterator();
            while (it.hasNext()) {
                arrayList.add((NativeModule) it.next());
            }
        }
        return arrayList;
    }

    public void incrementPendingJSCalls() {
        boolean z;
        int andIncrement = this.mPendingJSCalls.getAndIncrement();
        if (andIncrement == 0) {
            z = true;
        } else {
            z = false;
        }
        Systrace.m77080a(0, this.mJsPendingCallsTitleForTrace, andIncrement + 1);
        if (z && !this.mBridgeIdleListeners.isEmpty()) {
            this.mNativeModulesQueueThread.runOnQueue(new Runnable() {
                /* class com.facebook.react.bridge.CatalystInstanceImpl.RunnableC210713 */

                public void run() {
                    Iterator<NotThreadSafeBridgeIdleDebugListener> it = CatalystInstanceImpl.this.mBridgeIdleListeners.iterator();
                    while (it.hasNext()) {
                        it.next().onTransitionToBridgeBusy();
                    }
                }
            });
        }
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void initialize() {
        Log.d("ReactNative", "CatalystInstanceImpl.initialize()");
        C21045a.m76679a(!this.mInitialized, "This catalyst instance has already been initialized");
        C21045a.m76679a(this.mAcceptCalls, "RunJSBundle hasn't completed.");
        this.mInitialized = true;
        this.mNativeModulesQueueThread.runOnQueue(new Runnable() {
            /* class com.facebook.react.bridge.CatalystInstanceImpl.RunnableC210702 */

            public void run() {
                CatalystInstanceImpl.this.mNativeModuleRegistry.notifyJSInstanceInitialized();
            }
        });
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void runJSBundle() {
        Log.d("ReactNative", "CatalystInstanceImpl.runJSBundle()");
        C21045a.m76679a(!this.mJSBundleHasLoaded, "JS bundle was already loaded!");
        this.mJSBundleLoader.loadScript(this);
        synchronized (this.mJSCallsPendingInitLock) {
            this.mAcceptCalls = true;
            Iterator<PendingJSCall> it = this.mJSCallsPendingInit.iterator();
            while (it.hasNext()) {
                it.next().call(this);
            }
            this.mJSCallsPendingInit.clear();
            this.mJSBundleHasLoaded = true;
        }
        Systrace.m77081a(this.mTraceListener);
    }

    private class NativeExceptionHandler implements QueueThreadExceptionHandler {
        private NativeExceptionHandler() {
        }

        @Override // com.facebook.react.bridge.queue.QueueThreadExceptionHandler
        public void handleException(Exception exc) {
            CatalystInstanceImpl.this.onNativeException(exc);
        }
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void addBridgeIdleDebugListener(NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener) {
        this.mBridgeIdleListeners.add(notThreadSafeBridgeIdleDebugListener);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void addJSIModules(List<JSIModuleSpec> list) {
        this.mJSIModuleRegistry.registerModules(list);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public JSIModule getJSIModule(JSIModuleType jSIModuleType) {
        return this.mJSIModuleRegistry.getModule(jSIModuleType);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public <T extends JavaScriptModule> T getJSModule(Class<T> cls) {
        return (T) this.mJSModuleRegistry.getJavaScriptModule(this, cls);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void removeBridgeIdleDebugListener(NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener) {
        this.mBridgeIdleListeners.remove(notThreadSafeBridgeIdleDebugListener);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void setTurboModuleManager(JSIModule jSIModule) {
        this.mTurboModuleRegistry = (TurboModuleRegistry) jSIModule;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public <T extends NativeModule> T getNativeModule(Class<T> cls) {
        return (T) getNativeModule(getNameFromAnnotation(cls));
    }

    @Override // com.facebook.react.bridge.MemoryPressureListener
    public void handleMemoryPressure(int i) {
        if (!this.mDestroyed) {
            jniHandleMemoryPressure(i);
        }
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void extendNativeModules(NativeModuleRegistry nativeModuleRegistry) {
        this.mNativeModuleRegistry.registerModules(nativeModuleRegistry);
        jniExtendNativeModules(nativeModuleRegistry.getJavaModules(this), nativeModuleRegistry.getCxxModules());
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public NativeModule getNativeModule(String str) {
        AbstractC21268a a;
        TurboModuleRegistry turboModuleRegistry = this.mTurboModuleRegistry;
        if (turboModuleRegistry == null || (a = turboModuleRegistry.mo72142a(str)) == null) {
            return this.mNativeModuleRegistry.getModule(str);
        }
        return (NativeModule) a;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public <T extends NativeModule> boolean hasNativeModule(Class<T> cls) {
        String nameFromAnnotation = getNameFromAnnotation(cls);
        TurboModuleRegistry turboModuleRegistry = this.mTurboModuleRegistry;
        if (turboModuleRegistry == null || !turboModuleRegistry.mo72144b(nameFromAnnotation)) {
            return this.mNativeModuleRegistry.hasModule(nameFromAnnotation);
        }
        return true;
    }

    public void onNativeException(Exception exc) {
        this.mNativeModuleCallExceptionHandler.handleException(exc);
        this.mReactQueueConfiguration.getUIQueueThread().runOnQueue(new Runnable() {
            /* class com.facebook.react.bridge.CatalystInstanceImpl.RunnableC210735 */

            public void run() {
                CatalystInstanceImpl.this.destroy();
            }
        });
    }

    private <T extends NativeModule> String getNameFromAnnotation(Class<T> cls) {
        ReactModule reactModule = (ReactModule) cls.getAnnotation(ReactModule.class);
        if (reactModule != null) {
            return reactModule.name();
        }
        throw new IllegalArgumentException("Could not find @ReactModule annotation in " + cls.getCanonicalName());
    }

    public void callFunction(PendingJSCall pendingJSCall) {
        if (this.mDestroyed) {
            String pendingJSCall2 = pendingJSCall.toString();
            FLog.m76614w("ReactNative", "Calling JS function after bridge has been destroyed: " + pendingJSCall2);
            return;
        }
        if (!this.mAcceptCalls) {
            synchronized (this.mJSCallsPendingInitLock) {
                if (!this.mAcceptCalls) {
                    this.mJSCallsPendingInit.add(pendingJSCall);
                    return;
                }
            }
        }
        pendingJSCall.call(this);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void registerSegment(int i, String str) {
        jniRegisterSegment(i, str);
    }

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public void setSourceURLs(String str, String str2) {
        this.mSourceURL = str;
        jniSetSourceURL(str2);
    }

    @Override // com.facebook.react.bridge.JSInstance, com.facebook.react.bridge.CatalystInstance
    public void invokeCallback(int i, NativeArrayInterface nativeArrayInterface) {
        if (this.mDestroyed) {
            FLog.m76614w("ReactNative", "Invoking JS callback after bridge has been destroyed.");
        } else {
            jniCallJSCallback(i, (NativeArray) nativeArrayInterface);
        }
    }

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public void loadScriptFromAssets(AssetManager assetManager, String str, boolean z) {
        this.mSourceURL = str;
        jniLoadScriptFromAssets(assetManager, str, z);
    }

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public void loadScriptFromDeltaBundle(String str, NativeDeltaClient nativeDeltaClient, boolean z) {
        this.mSourceURL = str;
        jniLoadScriptFromDeltaBundle(str, nativeDeltaClient, z);
    }

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public void loadScriptFromFile(String str, String str2, boolean z) {
        this.mSourceURL = str2;
        jniLoadScriptFromFile(str, str2, z);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void callFunction(String str, String str2, NativeArray nativeArray) {
        callFunction(new PendingJSCall(str, str2, nativeArray));
    }

    private CatalystInstanceImpl(ReactQueueConfigurationSpec reactQueueConfigurationSpec, JavaScriptExecutor javaScriptExecutor, NativeModuleRegistry nativeModuleRegistry, JSBundleLoader jSBundleLoader, NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler) {
        this.mPendingJSCalls = new AtomicInteger(0);
        this.mJsPendingCallsTitleForTrace = "pending_js_calls_instance" + sNextInstanceIdForTrace.getAndIncrement();
        this.mDestroyed = false;
        this.mJSCallsPendingInit = new ArrayList<>();
        this.mJSCallsPendingInitLock = new Object();
        this.mJSIModuleRegistry = new JSIModuleRegistry();
        this.mInitialized = false;
        this.mAcceptCalls = false;
        this.mTurboModuleRegistry = null;
        Log.d("ReactNative", "Initializing React Xplat Bridge.");
        Systrace.m77079a(0, "createCatalystInstanceImpl");
        this.mHybridData = initHybrid();
        ReactQueueConfigurationImpl create = ReactQueueConfigurationImpl.create(reactQueueConfigurationSpec, new NativeExceptionHandler());
        this.mReactQueueConfiguration = create;
        this.mBridgeIdleListeners = new CopyOnWriteArrayList<>();
        this.mNativeModuleRegistry = nativeModuleRegistry;
        this.mJSModuleRegistry = new JavaScriptModuleRegistry();
        this.mJSBundleLoader = jSBundleLoader;
        this.mNativeModuleCallExceptionHandler = nativeModuleCallExceptionHandler;
        MessageQueueThread nativeModulesQueueThread = create.getNativeModulesQueueThread();
        this.mNativeModulesQueueThread = nativeModulesQueueThread;
        this.mTraceListener = new JSProfilerTraceListener(this);
        Systrace.m77083b(0);
        Log.d("ReactNative", "Initializing React Xplat Bridge before initializeBridge");
        Systrace.m77079a(0, "initializeCxxBridge");
        initializeBridge(new BridgeCallback(this), javaScriptExecutor, create.getJSQueueThread(), nativeModulesQueueThread, nativeModuleRegistry.getJavaModules(this), nativeModuleRegistry.getCxxModules());
        Log.d("ReactNative", "Initializing React Xplat Bridge after initializeBridge");
        Systrace.m77083b(0);
        this.mJavaScriptContextHolder = new JavaScriptContextHolder(getJavaScriptContext());
    }
}
