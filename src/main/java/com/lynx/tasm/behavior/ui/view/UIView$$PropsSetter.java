package com.lynx.tasm.behavior.ui.view;

import com.lynx.tasm.behavior.C26697s;
import com.lynx.tasm.behavior.ui.LynxBaseUI;

public class UIView$$PropsSetter extends UISimpleView$$PropsSetter {
    @Override // com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter
    /* renamed from: a */
    public void mo53254a(LynxBaseUI lynxBaseUI, String str, C26697s sVar) {
        UIView uIView = (UIView) lynxBaseUI;
        char c = 65535;
        try {
            if (str.hashCode() == -1389119727) {
                if (str.equals("impression_id")) {
                    c = 0;
                }
            }
            if (c != 0) {
                super.mo53254a(lynxBaseUI, str, sVar);
            } else {
                uIView.setImpressionId(sVar.mo94778c(str));
            }
        } catch (Exception e) {
            throw new RuntimeException("setProperty error: " + str + "\n" + e.toString());
        }
    }
}
