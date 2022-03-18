package com.lynx.tasm.behavior.ui.text;

import com.lynx.tasm.behavior.C26697s;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter;

public class FiberRawText$$PropsSetter extends LynxBaseUI$$PropsSetter {
    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    /* renamed from: a */
    public void mo53254a(LynxBaseUI lynxBaseUI, String str, C26697s sVar) {
        FiberRawText fiberRawText = (FiberRawText) lynxBaseUI;
        char c = 65535;
        try {
            int hashCode = str.hashCode();
            if (hashCode != -979172930) {
                if (hashCode == 3556653) {
                    if (str.equals("text")) {
                        c = 1;
                    }
                }
            } else if (str.equals("pseudo")) {
                c = 0;
            }
            if (c == 0) {
                fiberRawText.setPsuedo(sVar.mo94776a(str, false));
            } else if (c != 1) {
                super.mo53254a(lynxBaseUI, str, sVar);
            } else {
                fiberRawText.setText(sVar.mo94778c(str));
            }
        } catch (Exception e) {
            throw new RuntimeException("setProperty error: " + str + "\n" + e.toString());
        }
    }
}
