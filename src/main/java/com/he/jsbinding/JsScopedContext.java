package com.he.jsbinding;

public class JsScopedContext extends JsContext {
    public final void pop() {
        JsEngine.popResult();
    }

    public final void pushNull() {
        JsEngine.pushNull();
    }

    public final void pushUndefined() {
        JsEngine.pushUndefined();
    }

    public final boolean popBoolean() {
        return JsEngine.getBooleanResult();
    }

    public final int popInt() {
        return JsEngine.getIntResult(this.id);
    }

    public final double popNumber() {
        return JsEngine.getNumberResult(this.id);
    }

    public final String popString() {
        return JsEngine.getStringResult(this.id);
    }

    @Override // com.he.jsbinding.JsContext
    public void release() {
        throw new RuntimeException("JsScopedContext should not be disposed");
    }

    public final JsObject popObject() {
        int objectResult = JsEngine.getObjectResult(this.id);
        if (objectResult >= 0) {
            return new JsObject(this.vm, this.id, objectResult);
        }
        throw new RuntimeException("not an object");
    }

    public final void push(double d) {
        JsEngine.pushDouble(d);
    }

    public final void pushJSON(String str) {
        JsEngine.parseJSON(str);
    }

    public final void push(int i) {
        JsEngine.pushInt(i);
    }

    public JsObject makeArray(int i) {
        return new JsObject(this.vm, this.id, JsEngine.makeArray(this.id, i));
    }

    public final void push(JsObject jsObject) {
        JsEngine.pushObject(jsObject.ctx_id, jsObject.id);
    }

    public final void push(String str) {
        JsEngine.pushString(str);
    }

    public final void push(boolean z) {
        JsEngine.pushBoolean(z);
    }

    JsScopedContext(long j, int i) {
        super(j, i);
    }
}
