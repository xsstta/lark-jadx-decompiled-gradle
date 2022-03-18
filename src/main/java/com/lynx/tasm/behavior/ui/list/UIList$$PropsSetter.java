package com.lynx.tasm.behavior.ui.list;

import com.lynx.tasm.behavior.C26697s;
import com.lynx.tasm.behavior.ui.LynxBaseUI;

public class UIList$$PropsSetter extends AbsLynxList$$PropsSetter {
    @Override // com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter, com.lynx.tasm.behavior.ui.list.AbsLynxList$$PropsSetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter
    /* renamed from: a */
    public void mo53254a(LynxBaseUI lynxBaseUI, String str, C26697s sVar) {
        UIList uIList = (UIList) lynxBaseUI;
        char c = 65535;
        try {
            int hashCode = str.hashCode();
            if (hashCode != 1683042429) {
                if (hashCode == 1816872768) {
                    if (str.equals("auto-measure")) {
                        c = 1;
                    }
                }
            } else if (str.equals("android-diffable")) {
                c = 0;
            }
            if (c == 0) {
                uIList.setDiffable(sVar.mo94781f(str));
            } else if (c != 1) {
                super.mo53254a(lynxBaseUI, str, sVar);
            } else {
                uIList.setAutoMeasure(sVar.mo94781f(str));
            }
        } catch (Exception e) {
            throw new RuntimeException("setProperty error: " + str + "\n" + e.toString());
        }
    }
}
