package com.lynx.tasm.behavior.ui.text;

import com.lynx.tasm.behavior.C26697s;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter;

public class FiberAbsInlineImageUI$$PropsSetter extends LynxBaseUI$$PropsSetter {
    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    /* renamed from: a */
    public void mo53254a(LynxBaseUI lynxBaseUI, String str, C26697s sVar) {
        FiberAbsInlineImageUI fiberAbsInlineImageUI = (FiberAbsInlineImageUI) lynxBaseUI;
        char c = 65535;
        try {
            int hashCode = str.hashCode();
            if (hashCode != 114148) {
                if (hashCode == 3357091) {
                    if (str.equals("mode")) {
                        c = 0;
                    }
                }
            } else if (str.equals("src")) {
                c = 1;
            }
            if (c == 0) {
                fiberAbsInlineImageUI.setMode(sVar.mo94778c(str));
            } else if (c != 1) {
                super.mo53254a(lynxBaseUI, str, sVar);
            } else {
                fiberAbsInlineImageUI.setSource(sVar.mo94778c(str));
            }
        } catch (Exception e) {
            throw new RuntimeException("setProperty error: " + str + "\n" + e.toString());
        }
    }
}
