package com.he.jsbinding;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.lark.falcon.engine.bridge.NativeHostObject;
import com.tt.miniapp.falcon.p3285a.AbstractC66046a;
import com.tt.miniapp.falcon.p3285a.AbstractC66047b;
import java.nio.ByteBuffer;

public class JsObject implements AbstractC66046a, AbstractC66047b {
    public final int ctx_id;
    public final int id;
    public final long vm;

    @Override // com.tt.miniapp.falcon.p3285a.AbstractC66046a
    /* renamed from: a */
    public /* synthetic */ AbstractC66046a mo81263a(int i) {
        return AbstractC66046a.CC.$default$a(this, i);
    }

    @Override // com.tt.miniapp.falcon.p3285a.AbstractC66047b
    /* renamed from: a */
    public /* synthetic */ void mo81264a(String str, NativeHostObject nativeHostObject) {
        AbstractC66047b.CC.$default$a(this, str, nativeHostObject);
    }

    public final JsEngine getEngine() {
        return new JsEngine(this.vm);
    }

    @Override // com.tt.miniapp.falcon.p3285a.AbstractC66046a
    public int arrayGetLength() {
        return JsEngine.getArrayLength(this.vm, this.ctx_id, this.id);
    }

    public final ByteBuffer asArrayBuffer() {
        return JsEngine.makeDirectBuffer(this.vm, this.ctx_id, this.id);
    }

    public final byte[] asBytes() {
        return JsEngine.getBufferBytes(this.vm, this.ctx_id, this.id);
    }

    public JsScopedContext getScopedContext() {
        return new JsScopedContext(this.vm, this.ctx_id);
    }

    public final void release() {
        JsEngine.releaseObject(this.vm, this.ctx_id, this.id);
    }

    public final String toJSON() {
        return JsEngine.toJSON(this.vm, this.ctx_id, this.id);
    }

    public String toString() {
        JsEngine.objectToString(this.ctx_id, this.id);
        return JsEngine.getStringResult(this.ctx_id);
    }

    public final void call(int i) {
        JsEngine.callObject(this.ctx_id, this.id, i);
    }

    public final void set(String str) {
        JsEngine.setObjectProp(this.ctx_id, this.id, str);
    }

    @Override // com.tt.miniapp.falcon.p3285a.AbstractC66046a
    public final boolean getBoolean(int i) {
        JsEngine.getArrayField(this.ctx_id, this.id, i);
        return JsEngine.getBooleanResult();
    }

    @Override // com.tt.miniapp.falcon.p3285a.AbstractC66046a
    public final int getInt(int i) {
        JsEngine.getArrayField(this.ctx_id, this.id, i);
        return JsEngine.getIntResult(this.ctx_id);
    }

    public final double getNumber(int i) {
        JsEngine.getArrayField(this.ctx_id, this.id, i);
        return JsEngine.getNumberResult(this.ctx_id);
    }

    @Override // com.tt.miniapp.falcon.p3285a.AbstractC66046a
    public final String getString(int i) {
        JsEngine.getArrayField(this.ctx_id, this.id, i);
        return JsEngine.getStringResult(this.ctx_id);
    }

    public final void setNull(String str) {
        JsEngine.pushNull();
        JsEngine.setObjectProp(this.ctx_id, this.id, str);
    }

    public final void setUndefined(String str) {
        JsEngine.pushUndefined();
        JsEngine.setObjectProp(this.ctx_id, this.id, str);
    }

    @Override // com.tt.miniapp.falcon.p3285a.AbstractC66047b
    public final boolean getBoolean(String str) {
        JsEngine.getObjectProp(this.ctx_id, this.id, str);
        return JsEngine.getBooleanResult();
    }

    @Override // com.tt.miniapp.falcon.p3285a.AbstractC66047b
    public final int getInt(String str) {
        JsEngine.getObjectProp(this.ctx_id, this.id, str);
        return JsEngine.getIntResult(this.ctx_id);
    }

    public final double getNumber(String str) {
        JsEngine.getObjectProp(this.ctx_id, this.id, str);
        return JsEngine.getNumberResult(this.ctx_id);
    }

    @Override // com.tt.miniapp.falcon.p3285a.AbstractC66046a
    public final JsObject getObject(int i) {
        JsEngine.getArrayField(this.ctx_id, this.id, i);
        return new JsScopedContext(this.vm, this.ctx_id).popObject();
    }

    @Override // com.tt.miniapp.falcon.p3285a.AbstractC66047b
    public final String getString(String str) {
        JsEngine.getObjectProp(this.ctx_id, this.id, str);
        return JsEngine.getStringResult(this.ctx_id);
    }

    @Override // com.tt.miniapp.falcon.p3285a.AbstractC66047b
    public final JsObject getObject(String str) {
        JsEngine.getObjectProp(this.ctx_id, this.id, str);
        return new JsScopedContext(this.vm, this.ctx_id).popObject();
    }

    public final void callMethod(String str, int i) {
        JsEngine.callObjectMethod(this.ctx_id, this.id, str, i);
    }

    private void putValue(String str, JsObject jsObject) {
        JsEngine.pushObject(jsObject.ctx_id, jsObject.id);
        JsEngine.setObjectProp(this.ctx_id, this.id, str);
    }

    @Override // com.tt.miniapp.falcon.p3285a.AbstractC66047b
    public final void set(String str, double d) {
        JsEngine.pushDouble(d);
        JsEngine.setObjectProp(this.ctx_id, this.id, str);
    }

    @Override // com.tt.miniapp.falcon.p3285a.AbstractC66046a
    public final void set(int i, AbstractC66047b bVar) {
        set("" + i, bVar);
    }

    public final void set2(String str, JsObject jsObject) {
        AppBrandLogger.m52828d("falcon ", "pushObject start");
        AppBrandLogger.m52828d("falcon ", "pushObject end");
        AppBrandLogger.m52828d("falcon ", "setObjectProp end");
    }

    @Override // com.tt.miniapp.falcon.p3285a.AbstractC66047b
    public final void set(String str, int i) {
        JsEngine.pushInt(i);
        JsEngine.setObjectProp(this.ctx_id, this.id, str);
    }

    @Override // com.tt.miniapp.falcon.p3285a.AbstractC66047b
    public final void set(String str, AbstractC66046a aVar) {
        if (aVar instanceof JsObject) {
            putValue(str, (JsObject) aVar);
        }
    }

    @Override // com.tt.miniapp.falcon.p3285a.AbstractC66047b
    public final void set(String str, AbstractC66047b bVar) {
        if (bVar instanceof JsObject) {
            putValue(str, (JsObject) bVar);
        }
    }

    @Override // com.tt.miniapp.falcon.p3285a.AbstractC66047b
    public final void set(String str, String str2) {
        JsEngine.pushString(str2);
        JsEngine.setObjectProp(this.ctx_id, this.id, str);
    }

    @Override // com.tt.miniapp.falcon.p3285a.AbstractC66047b
    public final void set(String str, ByteBuffer byteBuffer) {
        if (byteBuffer == null || !byteBuffer.hasArray()) {
            JsEngine.pushBytes(null);
        } else {
            JsEngine.pushBytes(byteBuffer.array());
        }
        JsEngine.setObjectProp(this.ctx_id, this.id, str);
    }

    @Override // com.tt.miniapp.falcon.p3285a.AbstractC66047b
    public final void set(String str, boolean z) {
        JsEngine.pushBoolean(z);
        JsEngine.setObjectProp(this.ctx_id, this.id, str);
    }

    public JsObject(long j, int i, int i2) {
        this.vm = j;
        this.ctx_id = i;
        this.id = i2;
    }
}
