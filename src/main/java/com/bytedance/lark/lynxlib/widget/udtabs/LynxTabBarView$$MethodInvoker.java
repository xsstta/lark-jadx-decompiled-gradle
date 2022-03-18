package com.bytedance.lark.lynxlib.widget.udtabs;

import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.utils.AbstractC26843a;

public class LynxTabBarView$$MethodInvoker implements AbstractC26843a<LynxTabBarView> {
    public void invoke(LynxTabBarView lynxTabBarView, String str, ReadableMap readableMap, Callback callback) {
        char c = 65535;
        try {
            int hashCode = str.hashCode();
            if (hashCode != -1715986183) {
                if (hashCode != -357431021) {
                    if (hashCode == 1908871954) {
                        if (str.equals("scrollIntoView")) {
                            c = 2;
                        }
                    }
                } else if (str.equals("boundingClientRect")) {
                    c = 1;
                }
            } else if (str.equals("selectTab")) {
                c = 0;
            }
            if (c == 0) {
                lynxTabBarView.selectTab(readableMap, callback);
            } else if (c == 1) {
                lynxTabBarView.boundingClientRect(readableMap, callback);
            } else if (c != 2) {
                callback.invoke(3);
            } else {
                lynxTabBarView.scrollIntoView(readableMap);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("invokeMethod error: " + str + "\n" + e.toString());
        }
    }
}
