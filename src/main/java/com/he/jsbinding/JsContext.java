package com.he.jsbinding;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Objects;

public class JsContext {
    public int id;
    protected final boolean scoped;
    public long vm;

    public interface ScopeCallback {
        void run(JsScopedContext jsScopedContext);
    }

    public final JsEngine getEngine() {
        return new JsEngine(this.vm);
    }

    public void release() {
        JsEngine.releaseContext(this.vm, this.id);
    }

    public JsObject createObject() {
        long j = this.vm;
        int i = this.id;
        return new JsObject(j, i, JsEngine.createObject(j, i));
    }

    public final JsObject global() {
        long j = this.vm;
        int i = this.id;
        return new JsObject(j, i, JsEngine.getGlobal(j, i));
    }

    public void bindVM(JsEngine jsEngine) {
        this.vm = jsEngine.vm;
    }

    public void releaseCompiledScript(int i) {
        JsEngine.releaseScript(this.vm, this.id, i);
    }

    public void run(ScopeCallback scopeCallback) {
        JsEngine.run(this.vm, this.id, scopeCallback);
    }

    public void snapShotRun(ScopeCallback scopeCallback) {
        JsEngine.snapshotRun(this.vm, this.id, scopeCallback);
    }

    public JsObject createArray(int i) {
        long j = this.vm;
        int i2 = this.id;
        return new JsObject(j, i2, JsEngine.createArray(j, i2, i));
    }

    public JsObject createFunction(JsFunctionCallback jsFunctionCallback) {
        long j = this.vm;
        int i = this.id;
        return new JsObject(j, i, JsEngine.createFunction(j, i, jsFunctionCallback));
    }

    public JsObject deserialize(ByteBuffer byteBuffer) {
        int deserialize = JsEngine.deserialize(this.vm, this.id, byteBuffer);
        if (deserialize != -1) {
            return new JsObject(this.vm, this.id, deserialize);
        }
        throw new RuntimeException("wrong buffer format");
    }

    public JsObject retain(JsObject jsObject) {
        long j = this.vm;
        int i = this.id;
        return new JsObject(j, i, JsEngine.retain(j, i, jsObject.ctx_id, jsObject.id));
    }

    public JsContext(JsEngine jsEngine) {
        boolean z;
        if (getClass() == JsScopedContext.class) {
            z = true;
        } else {
            z = false;
        }
        this.scoped = z;
        AppBrandLogger.m52828d("falcon", "JsContext createContext start");
        this.vm = jsEngine.vm;
        AppBrandLogger.m52828d("falcon", "JsContext retryContext start vm:" + this.vm);
        AppBrandLogger.m52828d("falcon", "JsContext retryContext ed");
        this.id = JsEngine.createContext(this.vm);
        AppBrandLogger.m52828d("falcon", "JsContext createContext id:" + this.id);
    }

    private static byte getTypeCode(Class<?> cls) {
        if (cls == Void.TYPE) {
            return 118;
        }
        if (cls == Boolean.TYPE) {
            return 122;
        }
        if (cls == Byte.TYPE) {
            return 98;
        }
        if (cls == Character.TYPE) {
            return 99;
        }
        if (cls == Short.TYPE) {
            return 115;
        }
        if (cls == Integer.TYPE) {
            return 105;
        }
        if (cls == Float.TYPE) {
            return 102;
        }
        if (cls == Double.TYPE) {
            return 100;
        }
        if (cls == Long.TYPE) {
            return 106;
        }
        if (cls == String.class) {
            return 36;
        }
        if (cls == ByteBuffer.class) {
            return 66;
        }
        if (cls == JsObject.class) {
            return 79;
        }
        if (cls == JsScopedContext.class) {
            return 64;
        }
        throw new RuntimeException("unsupported type " + cls.getCanonicalName());
    }

    public void execute(int i, boolean z) {
        JsEngine.executeScript(this.vm, this.id, i, this.scoped, z);
    }

    JsContext(long j, int i) {
        boolean z;
        if (getClass() == JsScopedContext.class) {
            z = true;
        } else {
            z = false;
        }
        this.scoped = z;
        this.vm = j;
        this.id = i;
    }

    public void eval(String str, String str2) {
        Objects.requireNonNull(str, "code is null");
        AppBrandLogger.m52828d("falcon-eval path:" + str2, new Object[0]);
        JsEngine.eval(this.vm, this.id, str, str2, this.scoped);
    }

    public void eval(ByteBuffer byteBuffer, String str) {
        Objects.requireNonNull(byteBuffer, "code is null");
        AppBrandLogger.m52828d("falcon-eval path:" + str, new Object[0]);
        JsEngine.evalByteBuffer(this.vm, this.id, byteBuffer, str, this.scoped);
    }

    public JsContext(JsEngine jsEngine, boolean z) {
        boolean z2;
        if (getClass() == JsScopedContext.class) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.scoped = z2;
        AppBrandLogger.m52828d("falcon", "JsContext createContext start");
        this.vm = jsEngine.vm;
        AppBrandLogger.m52828d("falcon", "JsContext retryContext start");
        AppBrandLogger.m52828d("falcon", "JsContext retryContext ed");
        this.id = JsEngine.createContextWithLoadScriptFunction(this.vm);
        AppBrandLogger.m52828d("falcon", "JsContext createContext");
    }

    public JsObject createFunction(Object obj, Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        AppBrandLogger.m52828d("falcon ", "createFunction");
        if (parameterTypes.length <= 8) {
            long j = 0;
            for (int i = 0; i < parameterTypes.length; i++) {
                j |= ((long) getTypeCode(parameterTypes[i])) << (i << 3);
            }
            long j2 = this.vm;
            int i2 = this.id;
            return new JsObject(j2, i2, JsEngine.newMethodWrap(j2, i2, obj, method, j, getTypeCode(method.getReturnType())));
        }
        throw new RuntimeException("falcon we only support methods with no more than 8 arguments");
    }

    public void eval(byte[] bArr, String str) {
        Objects.requireNonNull(bArr, "code is null");
        AppBrandLogger.m52828d("falcon-eval path:" + str, new Object[0]);
        JsEngine.evalBytes(this.vm, this.id, bArr, str, this.scoped);
    }

    public int compile(byte[] bArr, String str, boolean z) {
        return JsEngine.compileBytes(this.vm, this.id, bArr, str, z);
    }

    public JsObject createFunction(Object obj, String str, Class<?>... clsArr) throws NoSuchMethodException {
        if (clsArr.length <= 8) {
            Method method = obj.getClass().getMethod(str, clsArr);
            long j = 0;
            for (int i = 0; i < clsArr.length; i++) {
                j |= ((long) getTypeCode(clsArr[i])) << (i << 3);
            }
            long j2 = this.vm;
            int i2 = this.id;
            return new JsObject(j2, i2, JsEngine.newMethodWrap(j2, i2, obj, method, j, getTypeCode(method.getReturnType())));
        }
        throw new RuntimeException("we only support methods with no more than 8 arguments");
    }
}
