package com.facebook.react.bridge;

import com.facebook.common.logging.FLog;

public class DynamicFromObject implements Dynamic {
    private Object mObject;

    @Override // com.facebook.react.bridge.Dynamic
    public void recycle() {
    }

    @Override // com.facebook.react.bridge.Dynamic
    public ReadableArray asArray() {
        return (ReadableArray) this.mObject;
    }

    @Override // com.facebook.react.bridge.Dynamic
    public ReadableMap asMap() {
        return (ReadableMap) this.mObject;
    }

    @Override // com.facebook.react.bridge.Dynamic
    public String asString() {
        return (String) this.mObject;
    }

    @Override // com.facebook.react.bridge.Dynamic
    public boolean isNull() {
        if (this.mObject == null) {
            return true;
        }
        return false;
    }

    @Override // com.facebook.react.bridge.Dynamic
    public boolean asBoolean() {
        return ((Boolean) this.mObject).booleanValue();
    }

    @Override // com.facebook.react.bridge.Dynamic
    public double asDouble() {
        return ((Double) this.mObject).doubleValue();
    }

    @Override // com.facebook.react.bridge.Dynamic
    public int asInt() {
        return ((Double) this.mObject).intValue();
    }

    @Override // com.facebook.react.bridge.Dynamic
    public ReadableType getType() {
        if (isNull()) {
            return ReadableType.Null;
        }
        Object obj = this.mObject;
        if (obj instanceof Boolean) {
            return ReadableType.Boolean;
        }
        if (obj instanceof Number) {
            return ReadableType.Number;
        }
        if (obj instanceof String) {
            return ReadableType.String;
        }
        if (obj instanceof ReadableMap) {
            return ReadableType.Map;
        }
        if (obj instanceof ReadableArray) {
            return ReadableType.Array;
        }
        FLog.m76574e("ReactNative", "Unmapped object type " + this.mObject.getClass().getName());
        return ReadableType.Null;
    }

    public DynamicFromObject(Object obj) {
        this.mObject = obj;
    }
}
