package com.he.jsbinding;

public class JsFunctionContext extends JsScopedContext {
    final long info;
    public final int length;

    public final boolean getBoolean(int i) {
        return JsEngine.getBooleanParam(this.info, i);
    }

    public final int getInt(int i) {
        return JsEngine.getIntParam(this.info, i);
    }

    public final double getNumber(int i) {
        return JsEngine.getNumberParam(this.info, i);
    }

    public final String getString(int i) {
        return JsEngine.getStringParam(this.info, i);
    }

    public final void returns(double d) {
        JsEngine.pushDouble(d);
        JsEngine.returns(this.info);
    }

    public final JsObject getObject(int i) {
        int objectParam = JsEngine.getObjectParam(this.info, this.id, i);
        if (objectParam == -1) {
            return null;
        }
        return new JsObject(this.vm, this.id, objectParam);
    }

    public final void returns(int i) {
        JsEngine.pushInt(i);
        JsEngine.returns(this.info);
    }

    public final void returns(JsObject jsObject) {
        if (jsObject == null) {
            JsEngine.pushNull();
        } else {
            JsEngine.pushObject(jsObject.ctx_id, jsObject.id);
        }
        JsEngine.returns(this.info);
    }

    public final void returns(String str) {
        if (str == null) {
            JsEngine.pushNull();
        } else {
            JsEngine.pushString(str);
        }
        JsEngine.returns(this.info);
    }

    public final void returns(boolean z) {
        JsEngine.pushBoolean(z);
        JsEngine.returns(this.info);
    }

    JsFunctionContext(long j, int i, long j2, int i2) {
        super(j, i);
        this.info = j2;
        this.length = i2;
    }
}
