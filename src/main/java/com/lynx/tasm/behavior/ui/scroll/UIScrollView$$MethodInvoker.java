package com.lynx.tasm.behavior.ui.scroll;

import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.utils.AbstractC26843a;

public class UIScrollView$$MethodInvoker implements AbstractC26843a<UIScrollView> {
    public void invoke(UIScrollView uIScrollView, String str, ReadableMap readableMap, Callback callback) {
        char c = 65535;
        try {
            int hashCode = str.hashCode();
            if (hashCode != -402165208) {
                if (hashCode != -357431021) {
                    if (hashCode == 1908871954) {
                        if (str.equals("scrollIntoView")) {
                            c = 2;
                        }
                    }
                } else if (str.equals("boundingClientRect")) {
                    c = 1;
                }
            } else if (str.equals("scrollTo")) {
                c = 0;
            }
            if (c == 0) {
                uIScrollView.scrollTo(readableMap);
            } else if (c == 1) {
                uIScrollView.boundingClientRect(readableMap, callback);
            } else if (c != 2) {
                callback.invoke(3);
            } else {
                uIScrollView.scrollIntoView(readableMap);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("invokeMethod error: " + str + "\n" + e.toString());
        }
    }
}
