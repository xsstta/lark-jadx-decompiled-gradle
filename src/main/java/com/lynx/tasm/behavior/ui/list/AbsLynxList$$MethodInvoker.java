package com.lynx.tasm.behavior.ui.list;

import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.utils.AbstractC26843a;

public class AbsLynxList$$MethodInvoker implements AbstractC26843a<AbsLynxList> {
    public void invoke(AbsLynxList absLynxList, String str, ReadableMap readableMap, Callback callback) {
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
                absLynxList.boundingClientRect(readableMap, callback);
            } else if (c != 1) {
                callback.invoke(3);
            } else {
                absLynxList.scrollIntoView(readableMap);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("invokeMethod error: " + str + "\n" + e.toString());
        }
    }
}
