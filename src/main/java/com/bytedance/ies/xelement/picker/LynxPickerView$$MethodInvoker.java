package com.bytedance.ies.xelement.picker;

import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.utils.AbstractC26843a;

public class LynxPickerView$$MethodInvoker implements AbstractC26843a<LynxPickerView> {
    public void invoke(LynxPickerView lynxPickerView, String str, ReadableMap readableMap, Callback callback) {
        char c = 65535;
        try {
            int hashCode = str.hashCode();
            if (hashCode != -357431021) {
                if (hashCode == 1908871954) {
                    if (str.equals("scrollIntoView")) {
                        c = 1;
                    }
                }
            } else if (str.equals("boundingClientRect")) {
                c = 0;
            }
            if (c == 0) {
                lynxPickerView.boundingClientRect(readableMap, callback);
            } else if (c != 1) {
                callback.invoke(3);
            } else {
                lynxPickerView.scrollIntoView(readableMap);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("invokeMethod error: " + str + "\n" + e.toString());
        }
    }
}
