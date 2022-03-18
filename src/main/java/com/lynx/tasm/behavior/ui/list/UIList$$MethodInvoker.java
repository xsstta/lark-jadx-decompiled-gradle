package com.lynx.tasm.behavior.ui.list;

import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.utils.AbstractC26843a;

public class UIList$$MethodInvoker implements AbstractC26843a<UIList> {
    public void invoke(UIList uIList, String str, ReadableMap readableMap, Callback callback) {
        char c = 65535;
        try {
            switch (str.hashCode()) {
                case -980170895:
                    if (str.equals("scrollToPosition")) {
                        c = 0;
                        break;
                    }
                    break;
                case -357431021:
                    if (str.equals("boundingClientRect")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1363070069:
                    if (str.equals("getVisibleCells")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1908871954:
                    if (str.equals("scrollIntoView")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                uIList.scrollToPosition(readableMap);
            } else if (c == 1) {
                uIList.getVisibleCells(callback);
            } else if (c == 2) {
                uIList.boundingClientRect(readableMap, callback);
            } else if (c != 3) {
                callback.invoke(3);
            } else {
                uIList.scrollIntoView(readableMap);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("invokeMethod error: " + str + "\n" + e.toString());
        }
    }
}
