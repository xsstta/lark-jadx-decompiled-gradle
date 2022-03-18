package com.lynx.tasm.behavior.ui;

import com.lynx.tasm.behavior.C26697s;

public class LynxFlattenUI$$PropsSetter extends LynxBaseUI$$PropsSetter {
    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    /* renamed from: a */
    public void mo53254a(LynxBaseUI lynxBaseUI, String str, C26697s sVar) {
        LynxFlattenUI lynxFlattenUI = (LynxFlattenUI) lynxBaseUI;
        char c = 65535;
        try {
            int hashCode = str.hashCode();
            if (hashCode != -1267206133) {
                if (hashCode == 1052666732) {
                    if (str.equals("transform")) {
                        c = 1;
                    }
                }
            } else if (str.equals("opacity")) {
                c = 0;
            }
            if (c == 0) {
                lynxFlattenUI.setAlpha(sVar.mo94773a(str, 1.0f));
            } else if (c != 1) {
                super.mo53254a(lynxBaseUI, str, sVar);
            } else {
                lynxFlattenUI.setTransform(sVar.mo94779d(str));
            }
        } catch (Exception e) {
            throw new RuntimeException("setProperty error: " + str + "\n" + e.toString());
        }
    }
}
