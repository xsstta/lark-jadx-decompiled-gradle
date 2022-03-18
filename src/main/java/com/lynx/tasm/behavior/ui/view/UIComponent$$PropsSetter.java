package com.lynx.tasm.behavior.ui.view;

import com.lynx.tasm.behavior.C26697s;
import com.lynx.tasm.behavior.ui.LynxBaseUI;

public class UIComponent$$PropsSetter extends UIView$$PropsSetter {
    @Override // com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter, com.lynx.tasm.behavior.ui.view.UIView$$PropsSetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter
    /* renamed from: a */
    public void mo53254a(LynxBaseUI lynxBaseUI, String str, C26697s sVar) {
        UIComponent uIComponent = (UIComponent) lynxBaseUI;
        char c = 65535;
        try {
            if (str.hashCode() == 1176358053) {
                if (str.equals("item-key")) {
                    c = 0;
                }
            }
            if (c != 0) {
                super.mo53254a(lynxBaseUI, str, sVar);
            } else {
                uIComponent.setItemKey(sVar.mo94778c(str));
            }
        } catch (Exception e) {
            throw new RuntimeException("setProperty error: " + str + "\n" + e.toString());
        }
    }
}
