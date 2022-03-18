package com.lynx.tasm.behavior.ui.text;

import com.lynx.tasm.behavior.C26697s;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxFlattenUI$$PropsSetter;

public class FlattenUIText$$PropsSetter extends LynxFlattenUI$$PropsSetter {
    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxFlattenUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    /* renamed from: a */
    public void mo53254a(LynxBaseUI lynxBaseUI, String str, C26697s sVar) {
        FlattenUIText flattenUIText = (FlattenUIText) lynxBaseUI;
        char c = 65535;
        try {
            if (str.hashCode() == -1370507312) {
                if (str.equals("text-gradient")) {
                    c = 0;
                }
            }
            if (c != 0) {
                super.mo53254a(lynxBaseUI, str, sVar);
            } else {
                flattenUIText.setTextGradient(sVar.mo94778c(str));
            }
        } catch (Exception e) {
            throw new RuntimeException("setProperty error: " + str + "\n" + e.toString());
        }
    }
}
