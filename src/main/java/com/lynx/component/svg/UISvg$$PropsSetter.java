package com.lynx.component.svg;

import com.lynx.tasm.behavior.C26697s;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter;

public class UISvg$$PropsSetter extends LynxUI$$PropsSetter {
    @Override // com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    /* renamed from: a */
    public void mo53254a(LynxBaseUI lynxBaseUI, String str, C26697s sVar) {
        UISvg uISvg = (UISvg) lynxBaseUI;
        char c = 65535;
        try {
            int hashCode = str.hashCode();
            if (hashCode != 114148) {
                if (hashCode == 951530617) {
                    if (str.equals("content")) {
                        c = 0;
                    }
                }
            } else if (str.equals("src")) {
                c = 1;
            }
            if (c == 0) {
                uISvg.setContent(sVar.mo94778c(str));
            } else if (c != 1) {
                super.mo53254a(lynxBaseUI, str, sVar);
            } else {
                uISvg.setSource(sVar.mo94778c(str));
            }
        } catch (Exception e) {
            throw new RuntimeException("setProperty error: " + str + "\n" + e.toString());
        }
    }
}
