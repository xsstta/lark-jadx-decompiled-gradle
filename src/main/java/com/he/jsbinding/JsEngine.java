package com.he.jsbinding;

import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.utils.C13336c;
import com.bytedance.ee.ref.impl.host.HostExtensionManager;
import com.he.jsbinding.JsContext;
import com.he.loader.Library;
import com.tt.miniapp.jsbridge.C66240d;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

public class JsEngine {
    private static String sJsEngineType;
    private static String sV8Version;
    public static volatile Type type = Type.Unknown;
    private String snapshotPath;
    public final long vm;

    public enum Type {
        Unknown,
        JSC,
        V8,
        QuickJS
    }

    public static native void callNativeTask(long j, long j2);

    static native void callObject(int i, int i2, int i3);

    static native void callObjectMethod(int i, int i2, String str, int i3);

    static native int compileBytes(long j, int i, byte[] bArr, String str, boolean z);

    static native int createArray(long j, int i, int i2);

    static native int createArrayBuffer(long j, int i, int i2);

    static native int createContext(long j);

    static native int createContextWithLoadScriptFunction(long j);

    static native int createFunction(long j, int i, JsFunctionCallback jsFunctionCallback);

    public static native void createLoadedScriptsCache(long j);

    static native int createObject(long j, int i);

    private static native long createSnapShotVM(String str);

    public static native boolean createStandardSnapshot(long j, String str, String[] strArr);

    private static native long createVM(Handler handler);

    private static native long createVMWithSnapShot(String str);

    public static native int createWorker(long j, int i);

    static native int deserialize(long j, int i, ByteBuffer byteBuffer);

    static native void disposeVM(long j);

    static native void eval(long j, int i, String str, String str2, boolean z);

    static native void evalByteBuffer(long j, int i, ByteBuffer byteBuffer, String str, boolean z);

    static native void evalBytes(long j, int i, byte[] bArr, String str, boolean z);

    public static native String evaluateStringScript(long j, String str);

    static native void executeScript(long j, int i, int i2, boolean z, boolean z2);

    public static native boolean generateSnapshot(long j, String str, String str2);

    static native void getArrayField(int i, int i2, int i3);

    static native int getArrayLength(long j, int i, int i2);

    static native boolean getBooleanParam(long j, int i);

    static native boolean getBooleanResult();

    static native byte[] getBufferBytes(long j, int i, int i2);

    static native int getGlobal(long j, int i);

    static native int getIntParam(long j, int i);

    static native int getIntResult(int i);

    public static native String[] getLoadedScriptsAndClear(long j);

    static native double getNumberParam(long j, int i);

    static native double getNumberResult(int i);

    static native int getObjectParam(long j, int i, int i2);

    static native void getObjectProp(int i, int i2, String str);

    static native int getObjectResult(int i);

    static native String getStringParam(long j, int i);

    static native String getStringResult(int i);

    private static native String getV8Version();

    static native int makeArray(int i, int i2);

    static native ByteBuffer makeDirectBuffer(long j, int i, int i2);

    static native int newMethodWrap(long j, int i, Object obj, Method method, long j2, byte b);

    static native void objectToString(int i, int i2);

    static native void parseJSON(String str);

    public static native void popResult();

    static native void pushBoolean(boolean z);

    static native void pushBytes(byte[] bArr);

    static native void pushDouble(double d);

    static native void pushInt(int i);

    static native void pushNull();

    static native void pushObject(int i, int i2);

    static native void pushString(String str);

    static native void pushUndefined();

    static native void releaseContext(long j, int i);

    public static native void releaseDeserializable(ByteBuffer byteBuffer);

    static native void releaseObject(long j, int i, int i2);

    static native void releaseScript(long j, int i, int i2);

    static native int retain(long j, int i, int i2, int i3);

    static native void returns(long j);

    static native void run(long j, int i, JsContext.ScopeCallback scopeCallback);

    public static native void runInCurrentContext(JsContext.ScopeCallback scopeCallback);

    static native ByteBuffer serialize(long j, int i, int i2);

    static native void setObjectProp(int i, int i2, String str);

    static native void snapshotRun(long j, int i, JsContext.ScopeCallback scopeCallback);

    public static native void startExecuteInThread(long j, long j2, String str) throws Exception;

    static native String toJSON(long j, int i, int i2);

    public static native void v8pipeInit(long j, long j2, long j3);

    public void dispose() {
        disposeVM(this.vm);
    }

    public static String getEngineType() {
        if (TextUtils.isEmpty(sJsEngineType)) {
            if (C66240d.m259242a()) {
                sJsEngineType = "falcon_engine";
            } else {
                sJsEngineType = "jsbinding";
            }
        }
        return sJsEngineType;
    }

    public static String getVersion() {
        if (TextUtils.isEmpty(sV8Version)) {
            try {
                loadLibs();
                sV8Version = getV8Version();
            } catch (Throwable th) {
                AppBrandLogger.m52829e("jsbinding", th);
                sV8Version = "v8_error_version";
            }
        }
        return sV8Version;
    }

    public static synchronized void loadLibs() {
        synchronized (JsEngine.class) {
            if (type == Type.Unknown) {
                try {
                    Library.load("c++_shared");
                } catch (Throwable th) {
                    AppBrandLogger.m52829e("jsbinding", "library for c++_shared not loaded", th);
                }
                try {
                    if (isV8PluginEnable("gadget.v8_backup_plugin.enable")) {
                        Library.load("v8_libbase.cr");
                        Library.load("v8.cr");
                        Library.load("v8_libplatform.cr");
                        Library.load("jsbindingv2-plugin");
                        AppBrandLogger.m52830i("jsbinding", "v4.7+ load v8 from plugin");
                    } else {
                        Library.load("v8_libfull.cr");
                        Library.load("jsbindingv2");
                        AppBrandLogger.m52830i("jsbinding", "v4.7+ load v8 from host");
                    }
                    AppBrandLogger.m52830i("jsbinding", "jsbinding v2 loaded");
                    type = Type.V8;
                    AppBrandLogger.m52828d("jsbinding", "using V8");
                } catch (Throwable th2) {
                    AppBrandLogger.m52829e("jsbinding", th2);
                }
            }
        }
    }

    JsEngine(long j) {
        this.vm = j;
    }

    public JsEngine(Handler handler) {
        AppBrandLogger.m52828d("falcon", "JsEngine start");
        loadLibs();
        long createVM = createVM(handler);
        this.vm = createVM;
        AppBrandLogger.m52828d("falcon", "JsEngine ed vm:" + createVM);
    }

    public JsEngine(String str) {
        loadLibs();
        long createVMWithSnapShot = createVMWithSnapShot(str);
        this.vm = createVMWithSnapShot;
        AppBrandLogger.m52828d("falcon", "JsEngine startup createVMWithSnapShot end vm:" + createVMWithSnapShot);
    }

    public static boolean isV8PluginEnable(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                AppBrandLogger.m52830i("jsbinding", "v8 plugin enable: empty fgkey");
                return false;
            }
            if (LarkExtensionManager.getInstance().getExtension().getFeatureGating(str, false)) {
                AppBrandLogger.m52830i("jsbinding", str + " v8PluginEnable");
                if (HostExtensionManager.getInstance().getHostInterface().isMiraPluginInstalled("com.ss.android.lark.brand.v8plugin")) {
                    return C13336c.m54306a(JsEngine.class.getClassLoader(), "com.ss.android.lark.brand.v8plugin").f35242a;
                }
                AppBrandLogger.m52829e("jsbinding", "v8PluginEnable: v8Plugin not installed");
            }
            AppBrandLogger.m52830i("jsbinding", str + " v8PluginEnable: return false");
            return false;
        } catch (Exception e) {
            AppBrandLogger.m52829e("jsbinding", e);
        }
    }

    public JsEngine(boolean z, String str) {
        this.snapshotPath = str;
        loadLibs();
        this.vm = createSnapShotVM(str);
    }

    private static void nativeOnRun(JsContext.ScopeCallback scopeCallback, long j, int i) {
        scopeCallback.run(new JsScopedContext(j, i));
    }

    private static void nativeOnTask(Handler handler, final long j, final long j2, long j3) {
        handler.postDelayed(new Runnable() {
            /* class com.he.jsbinding.JsEngine.RunnableC233691 */

            public void run() {
                JsEngine.callNativeTask(j, j2);
            }
        }, j3);
    }

    private static void nativeOnInvoke(JsFunctionCallback jsFunctionCallback, long j, int i, long j2, int i2) {
        jsFunctionCallback.onCall(new JsFunctionContext(j, i, j2, i2));
    }
}
