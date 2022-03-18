package com.bytedance.lark.lynxlib.widget.udtabs.childitem;

import com.lynx.tasm.behavior.C26697s;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter;

public class LynxViewpagerItem$$PropsSetter extends UIGroup$$PropsSetter {
    @Override // com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter
    /* renamed from: a */
    public void mo53254a(LynxBaseUI lynxBaseUI, String str, C26697s sVar) {
        LynxViewpagerItem lynxViewpagerItem = (LynxViewpagerItem) lynxBaseUI;
        char c = 65535;
        try {
            if (str.hashCode() == 114586) {
                if (str.equals("tag")) {
                    c = 0;
                }
            }
            if (c != 0) {
                super.mo53254a(lynxBaseUI, str, sVar);
            } else {
                lynxViewpagerItem.setTag(sVar.mo94778c(str));
            }
        } catch (Exception e) {
            throw new RuntimeException("setProperty error: " + str + "\n" + e.toString());
        }
    }
}
