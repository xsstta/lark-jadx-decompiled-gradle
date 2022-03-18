package com.bytedance.ies.xelement.input;

import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.utils.AbstractC26843a;

public class LynxTextAreaView$$MethodInvoker implements AbstractC26843a<LynxTextAreaView> {
    public void invoke(LynxTextAreaView lynxTextAreaView, String str, ReadableMap readableMap, Callback callback) {
        char c = 65535;
        try {
            switch (str.hashCode()) {
                case -1148585618:
                    if (str.equals("addText")) {
                        c = 2;
                        break;
                    }
                    break;
                case -366821380:
                    if (str.equals("resetSelectionMenu")) {
                        c = 1;
                        break;
                    }
                    break;
                case -357431021:
                    if (str.equals("boundingClientRect")) {
                        c = 5;
                        break;
                    }
                    break;
                case 1194478112:
                    if (str.equals("setInputFilter")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1212545271:
                    if (str.equals("sendDelEvent")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1406685743:
                    if (str.equals("setValue")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1908871954:
                    if (str.equals("scrollIntoView")) {
                        c = 6;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    lynxTextAreaView.setValue(readableMap);
                    return;
                case 1:
                    lynxTextAreaView.resetSelectionMenu();
                    return;
                case 2:
                    lynxTextAreaView.addText(readableMap, callback);
                    return;
                case 3:
                    lynxTextAreaView.sendDelEvent(readableMap, callback);
                    return;
                case 4:
                    lynxTextAreaView.setInputFilter(readableMap);
                    return;
                case 5:
                    lynxTextAreaView.boundingClientRect(readableMap, callback);
                    return;
                case 6:
                    lynxTextAreaView.scrollIntoView(readableMap);
                    return;
                default:
                    Object[] objArr = new Object[1];
                    objArr[0] = 3;
                    callback.invoke(objArr);
                    return;
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("invokeMethod error: " + str + "\n" + e.toString());
        }
    }
}
