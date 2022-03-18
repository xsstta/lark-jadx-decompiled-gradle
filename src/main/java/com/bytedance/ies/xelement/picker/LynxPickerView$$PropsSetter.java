package com.bytedance.ies.xelement.picker;

import com.lynx.tasm.behavior.C26697s;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter;

public class LynxPickerView$$PropsSetter extends UISimpleView$$PropsSetter {
    @Override // com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter
    /* renamed from: a */
    public void mo53254a(LynxBaseUI lynxBaseUI, String str, C26697s sVar) {
        LynxPickerView lynxPickerView = (LynxPickerView) lynxBaseUI;
        char c = 65535;
        try {
            switch (str.hashCode()) {
                case -1274708295:
                    if (str.equals("fields")) {
                        c = 1;
                        break;
                    }
                    break;
                case -752785969:
                    if (str.equals("range-key")) {
                        c = 4;
                        break;
                    }
                    break;
                case 100571:
                    if (str.equals("end")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3357091:
                    if (str.equals("mode")) {
                        c = 2;
                        break;
                    }
                    break;
                case 108280125:
                    if (str.equals("range")) {
                        c = 3;
                        break;
                    }
                    break;
                case 109757538:
                    if (str.equals("start")) {
                        c = 6;
                        break;
                    }
                    break;
                case 111972721:
                    if (str.equals("value")) {
                        c = 7;
                        break;
                    }
                    break;
                case 1732829925:
                    if (str.equals("separator")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    lynxPickerView.setEnd(sVar.mo94778c(str));
                    return;
                case 1:
                    lynxPickerView.setFields(sVar.mo94778c(str));
                    return;
                case 2:
                    lynxPickerView.setMode(sVar.mo94778c(str));
                    return;
                case 3:
                    lynxPickerView.setRange(sVar.mo94781f(str));
                    return;
                case 4:
                    lynxPickerView.setRangeKey(sVar.mo94781f(str));
                    return;
                case 5:
                    lynxPickerView.setSeparator(sVar.mo94778c(str));
                    return;
                case 6:
                    lynxPickerView.setStart(sVar.mo94778c(str));
                    return;
                case 7:
                    lynxPickerView.setValue(sVar.mo94781f(str));
                    return;
                default:
                    super.mo53254a(lynxBaseUI, str, sVar);
                    return;
            }
        } catch (Exception e) {
            throw new RuntimeException("setProperty error: " + str + "\n" + e.toString());
        }
    }
}
